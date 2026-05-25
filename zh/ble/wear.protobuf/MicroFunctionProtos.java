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
import com.zh.ble.wear.protobuf.DeviceProtos;
import com.zh.ble.wear.protobuf.SettingMenuProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MicroFunctionProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SEBasicData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEBasicData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEMicroFunction_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEMicroFunction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SESarCalibration_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESarCalibration_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SESleepStatus_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESleepStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWidget_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWidget_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWidget_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWidget_fieldAccessorTable;

    public enum SEApplicationTag implements ProtocolMessageEnum {
        APPLICATION_SPORT_WORKOUTS(0),
        APPLICATION_SPORT_RECORD(1),
        APPLICATION_ACTIVITY(2),
        APPLICATION_HEART_RATE(3),
        APPLICATION_SLEEP(4),
        APPLICATION_SPO2(5),
        APPLICATION_ALARM(6),
        APPLICATION_REMINDERS(7),
        APPLICATION_STOPWATCH(8),
        APPLICATION_TIMER(9),
        APPLICATION_MUSIC(10),
        APPLICATION_WEATHER(11),
        APPLICATION_BREATHE(12),
        APPLICATION_NOTIFICATION(13),
        APPLICATION_FIND_PHONE(14),
        APPLICATION_SETTINGS(15),
        APPLICATION_MENSTRUAL_CYCLE(16),
        APPLICATION_STRESS(17),
        APPLICATION_WORLD_CLOCK(18),
        APPLICATION_STOCKS(19),
        APPLICATION_AIR_PRESSURE(20),
        APPLICATION_COMPASS(21),
        APPLICATION_ECG(22),
        APPLICATION_TEMPERATURE(23),
        APPLICATION_PHONE(24),
        APPLICATION_CONTACTS(25),
        APPLICATION_FREQUENT_CONTACTS(26),
        APPLICATION_PHOTOGRAGH(27),
        APPLICATION_DIAIPAD(28),
        APPLICATION_CALL_RECORDS(29),
        APPLICATION_FLASHLIGHT(30);

        public static final int APPLICATION_ACTIVITY_VALUE = 2;
        public static final int APPLICATION_AIR_PRESSURE_VALUE = 20;
        public static final int APPLICATION_ALARM_VALUE = 6;
        public static final int APPLICATION_BREATHE_VALUE = 12;
        public static final int APPLICATION_CALL_RECORDS_VALUE = 29;
        public static final int APPLICATION_COMPASS_VALUE = 21;
        public static final int APPLICATION_CONTACTS_VALUE = 25;
        public static final int APPLICATION_DIAIPAD_VALUE = 28;
        public static final int APPLICATION_ECG_VALUE = 22;
        public static final int APPLICATION_FIND_PHONE_VALUE = 14;
        public static final int APPLICATION_FLASHLIGHT_VALUE = 30;
        public static final int APPLICATION_FREQUENT_CONTACTS_VALUE = 26;
        public static final int APPLICATION_HEART_RATE_VALUE = 3;
        public static final int APPLICATION_MENSTRUAL_CYCLE_VALUE = 16;
        public static final int APPLICATION_MUSIC_VALUE = 10;
        public static final int APPLICATION_NOTIFICATION_VALUE = 13;
        public static final int APPLICATION_PHONE_VALUE = 24;
        public static final int APPLICATION_PHOTOGRAGH_VALUE = 27;
        public static final int APPLICATION_REMINDERS_VALUE = 7;
        public static final int APPLICATION_SETTINGS_VALUE = 15;
        public static final int APPLICATION_SLEEP_VALUE = 4;
        public static final int APPLICATION_SPO2_VALUE = 5;
        public static final int APPLICATION_SPORT_RECORD_VALUE = 1;
        public static final int APPLICATION_SPORT_WORKOUTS_VALUE = 0;
        public static final int APPLICATION_STOCKS_VALUE = 19;
        public static final int APPLICATION_STOPWATCH_VALUE = 8;
        public static final int APPLICATION_STRESS_VALUE = 17;
        public static final int APPLICATION_TEMPERATURE_VALUE = 23;
        public static final int APPLICATION_TIMER_VALUE = 9;
        public static final int APPLICATION_WEATHER_VALUE = 11;
        public static final int APPLICATION_WORLD_CLOCK_VALUE = 18;
        private static final SEApplicationTag[] VALUES;
        private static final Internal.EnumLiteMap<SEApplicationTag> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEApplicationTag$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEApplicationTag> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEApplicationTag findValueByNumber(int i7) {
                return SEApplicationTag.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEApplicationTag");
            internalValueMap = new Internal.EnumLiteMap<SEApplicationTag>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEApplicationTag.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEApplicationTag findValueByNumber(int i7) {
                    return SEApplicationTag.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEApplicationTag(int i7) {
            this.value = i7;
        }

        public static SEApplicationTag forNumber(int i7) {
            switch (i7) {
                case 0:
                    return APPLICATION_SPORT_WORKOUTS;
                case 1:
                    return APPLICATION_SPORT_RECORD;
                case 2:
                    return APPLICATION_ACTIVITY;
                case 3:
                    return APPLICATION_HEART_RATE;
                case 4:
                    return APPLICATION_SLEEP;
                case 5:
                    return APPLICATION_SPO2;
                case 6:
                    return APPLICATION_ALARM;
                case 7:
                    return APPLICATION_REMINDERS;
                case 8:
                    return APPLICATION_STOPWATCH;
                case 9:
                    return APPLICATION_TIMER;
                case 10:
                    return APPLICATION_MUSIC;
                case 11:
                    return APPLICATION_WEATHER;
                case 12:
                    return APPLICATION_BREATHE;
                case 13:
                    return APPLICATION_NOTIFICATION;
                case 14:
                    return APPLICATION_FIND_PHONE;
                case 15:
                    return APPLICATION_SETTINGS;
                case 16:
                    return APPLICATION_MENSTRUAL_CYCLE;
                case 17:
                    return APPLICATION_STRESS;
                case 18:
                    return APPLICATION_WORLD_CLOCK;
                case 19:
                    return APPLICATION_STOCKS;
                case 20:
                    return APPLICATION_AIR_PRESSURE;
                case 21:
                    return APPLICATION_COMPASS;
                case 22:
                    return APPLICATION_ECG;
                case 23:
                    return APPLICATION_TEMPERATURE;
                case 24:
                    return APPLICATION_PHONE;
                case 25:
                    return APPLICATION_CONTACTS;
                case 26:
                    return APPLICATION_FREQUENT_CONTACTS;
                case 27:
                    return APPLICATION_PHOTOGRAGH;
                case 28:
                    return APPLICATION_DIAIPAD;
                case 29:
                    return APPLICATION_CALL_RECORDS;
                case 30:
                    return APPLICATION_FLASHLIGHT;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(4);
        }

        public static Internal.EnumLiteMap<SEApplicationTag> internalGetValueMap() {
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
        public static SEApplicationTag valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEApplicationTag valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEBasicData extends GeneratedMessage implements SEBasicDataOrBuilder {
        public static final int ACTIVITY_DURATION_FIELD_NUMBER = 12;
        public static final int BLOOD_OXYGEN_FIELD_NUMBER = 5;
        public static final int CALORIES_FIELD_NUMBER = 2;
        public static final int CALORIE_DATA_FIELD_NUMBER = 18;
        private static final SEBasicData DEFAULT_INSTANCE;
        public static final int DEVICE_BATTERY_STATUS_FIELD_NUMBER = 7;
        public static final int DEVICE_CHARGING_CASE_STATUS_FIELD_NUMBER = 21;
        public static final int DISTANCE_DATA_FIELD_NUMBER = 17;
        public static final int DISTANCE_FIELD_NUMBER = 3;
        public static final int EFFECTIVE_STANDING_FIELD_NUMBER = 6;
        public static final int EFFECTIVE_STANDING_HOUR_FIELD_NUMBER = 8;
        public static final int FULLY_CHARGED_NEED_TIME_FIELD_NUMBER = 24;
        public static final int HBA_DATA_FIELD_NUMBER = 11;
        public static final int HEART_RATE_FIELD_NUMBER = 4;
        public static final int NFC_SLEEP_ERR_FIELD_NUMBER = 23;
        private static final Parser<SEBasicData> PARSER;
        public static final int PHYSIOLOGICAL_CYCLE_FIELD_NUMBER = 10;
        public static final int PRESSURE_FIELD_NUMBER = 13;
        public static final int REMAINING_BATTERY_TIME_FIELD_NUMBER = 25;
        public static final int SAR_GDIFF_FIELD_NUMBER = 22;
        public static final int SLEEP_DURATION_FIELD_NUMBER = 9;
        public static final int STEPS_DATA_FIELD_NUMBER = 16;
        public static final int STEPS_FIELD_NUMBER = 1;
        public static final int TODAY_OURA_CALORIE_DATA_FIELD_NUMBER = 14;
        public static final int TODAY_OURA_CALORIE_HOURLY_DATA_FIELD_NUMBER = 19;
        public static final int TODAY_SPORT_CALORIE_DATA_FIELD_NUMBER = 15;
        public static final int TODAY_SPORT_CALORIE_HOURLY_DATA_FIELD_NUMBER = 20;
        private static final long serialVersionUID = 0;
        private int activityDuration_;
        private int bitField0_;
        private int bloodOxygen_;
        private ByteString calorieData_;
        private int calories_;
        private DeviceProtos.SEDeviceBatteryStatus deviceBatteryStatus_;
        private DeviceProtos.SEDeviceChargingCaseStatus deviceChargingCaseStatus_;
        private ByteString distanceData_;
        private int distance_;
        private int effectiveStandingHour_;
        private int effectiveStanding_;
        private int fullyChargedNeedTime_;
        private int hBAData_;
        private int heartRate_;
        private byte memoizedIsInitialized;
        private int nfcSleepErr_;
        private SettingMenuProtos.SEPhysiologicalCycle physiologicalCycle_;
        private int pressure_;
        private int remainingBatteryTime_;
        private ByteString sarGdiff_;
        private int sleepDuration_;
        private ByteString stepsData_;
        private int steps_;
        private int todayOuraCalorieData_;
        private ByteString todayOuraCalorieHourlyData_;
        private int todaySportCalorieData_;
        private ByteString todaySportCalorieHourlyData_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEBasicData$1 */
        public class AnonymousClass1 extends AbstractParser<SEBasicData> {
            @Override // com.google.protobuf.Parser
            public SEBasicData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEBasicData.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEBasicDataOrBuilder {
            private int activityDuration_;
            private int bitField0_;
            private int bloodOxygen_;
            private ByteString calorieData_;
            private int calories_;
            private SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> deviceBatteryStatusBuilder_;
            private DeviceProtos.SEDeviceBatteryStatus deviceBatteryStatus_;
            private SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> deviceChargingCaseStatusBuilder_;
            private DeviceProtos.SEDeviceChargingCaseStatus deviceChargingCaseStatus_;
            private ByteString distanceData_;
            private int distance_;
            private int effectiveStandingHour_;
            private int effectiveStanding_;
            private int fullyChargedNeedTime_;
            private int hBAData_;
            private int heartRate_;
            private int nfcSleepErr_;
            private SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> physiologicalCycleBuilder_;
            private SettingMenuProtos.SEPhysiologicalCycle physiologicalCycle_;
            private int pressure_;
            private int remainingBatteryTime_;
            private ByteString sarGdiff_;
            private int sleepDuration_;
            private ByteString stepsData_;
            private int steps_;
            private int todayOuraCalorieData_;
            private ByteString todayOuraCalorieHourlyData_;
            private int todaySportCalorieData_;
            private ByteString todaySportCalorieHourlyData_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, h hVar) {
                this(builderParent);
            }

            private void buildPartial0(SEBasicData sEBasicData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEBasicData.steps_ = this.steps_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEBasicData.calories_ = this.calories_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEBasicData.distance_ = this.distance_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEBasicData.heartRate_ = this.heartRate_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEBasicData.bloodOxygen_ = this.bloodOxygen_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEBasicData.effectiveStanding_ = this.effectiveStanding_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                    sEBasicData.deviceBatteryStatus_ = singleFieldBuilder == null ? this.deviceBatteryStatus_ : (DeviceProtos.SEDeviceBatteryStatus) singleFieldBuilder.build();
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sEBasicData.effectiveStandingHour_ = this.effectiveStandingHour_;
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    sEBasicData.sleepDuration_ = this.sleepDuration_;
                    i7 |= 256;
                }
                if ((i8 & 512) != 0) {
                    SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> singleFieldBuilder2 = this.physiologicalCycleBuilder_;
                    sEBasicData.physiologicalCycle_ = singleFieldBuilder2 == null ? this.physiologicalCycle_ : (SettingMenuProtos.SEPhysiologicalCycle) singleFieldBuilder2.build();
                    i7 |= 512;
                }
                if ((i8 & 1024) != 0) {
                    sEBasicData.hBAData_ = this.hBAData_;
                    i7 |= 1024;
                }
                if ((i8 & 2048) != 0) {
                    sEBasicData.activityDuration_ = this.activityDuration_;
                    i7 |= 2048;
                }
                if ((i8 & 4096) != 0) {
                    sEBasicData.pressure_ = this.pressure_;
                    i7 |= 4096;
                }
                if ((i8 & 8192) != 0) {
                    sEBasicData.todayOuraCalorieData_ = this.todayOuraCalorieData_;
                    i7 |= 8192;
                }
                if ((i8 & 16384) != 0) {
                    sEBasicData.todaySportCalorieData_ = this.todaySportCalorieData_;
                    i7 |= 16384;
                }
                if ((i8 & 32768) != 0) {
                    sEBasicData.stepsData_ = this.stepsData_;
                    i7 |= 32768;
                }
                if ((i8 & 65536) != 0) {
                    sEBasicData.distanceData_ = this.distanceData_;
                    i7 |= 65536;
                }
                if ((i8 & 131072) != 0) {
                    sEBasicData.calorieData_ = this.calorieData_;
                    i7 |= 131072;
                }
                if ((i8 & 262144) != 0) {
                    sEBasicData.todayOuraCalorieHourlyData_ = this.todayOuraCalorieHourlyData_;
                    i7 |= 262144;
                }
                if ((i8 & 524288) != 0) {
                    sEBasicData.todaySportCalorieHourlyData_ = this.todaySportCalorieHourlyData_;
                    i7 |= 524288;
                }
                if ((i8 & 1048576) != 0) {
                    SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder3 = this.deviceChargingCaseStatusBuilder_;
                    sEBasicData.deviceChargingCaseStatus_ = singleFieldBuilder3 == null ? this.deviceChargingCaseStatus_ : (DeviceProtos.SEDeviceChargingCaseStatus) singleFieldBuilder3.build();
                    i7 |= 1048576;
                }
                if ((i8 & 2097152) != 0) {
                    sEBasicData.sarGdiff_ = this.sarGdiff_;
                    i7 |= 2097152;
                }
                if ((4194304 & i8) != 0) {
                    sEBasicData.nfcSleepErr_ = this.nfcSleepErr_;
                    i7 |= 4194304;
                }
                if ((8388608 & i8) != 0) {
                    sEBasicData.fullyChargedNeedTime_ = this.fullyChargedNeedTime_;
                    i7 |= 8388608;
                }
                if ((i8 & 16777216) != 0) {
                    sEBasicData.remainingBatteryTime_ = this.remainingBatteryTime_;
                    i7 |= 16777216;
                }
                sEBasicData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MicroFunctionProtos.internal_static_SEBasicData_descriptor;
            }

            private SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> internalGetDeviceBatteryStatusFieldBuilder() {
                if (this.deviceBatteryStatusBuilder_ == null) {
                    this.deviceBatteryStatusBuilder_ = new SingleFieldBuilder<>(getDeviceBatteryStatus(), getParentForChildren(), isClean());
                    this.deviceBatteryStatus_ = null;
                }
                return this.deviceBatteryStatusBuilder_;
            }

            private SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> internalGetDeviceChargingCaseStatusFieldBuilder() {
                if (this.deviceChargingCaseStatusBuilder_ == null) {
                    this.deviceChargingCaseStatusBuilder_ = new SingleFieldBuilder<>(getDeviceChargingCaseStatus(), getParentForChildren(), isClean());
                    this.deviceChargingCaseStatus_ = null;
                }
                return this.deviceChargingCaseStatusBuilder_;
            }

            private SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> internalGetPhysiologicalCycleFieldBuilder() {
                if (this.physiologicalCycleBuilder_ == null) {
                    this.physiologicalCycleBuilder_ = new SingleFieldBuilder<>(getPhysiologicalCycle(), getParentForChildren(), isClean());
                    this.physiologicalCycle_ = null;
                }
                return this.physiologicalCycleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetDeviceBatteryStatusFieldBuilder();
                    internalGetPhysiologicalCycleFieldBuilder();
                    internalGetDeviceChargingCaseStatusFieldBuilder();
                }
            }

            public Builder clearActivityDuration() {
                this.bitField0_ &= -2049;
                this.activityDuration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBloodOxygen() {
                this.bitField0_ &= -17;
                this.bloodOxygen_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCalorieData() {
                this.bitField0_ &= -131073;
                this.calorieData_ = SEBasicData.getDefaultInstance().getCalorieData();
                onChanged();
                return this;
            }

            public Builder clearCalories() {
                this.bitField0_ &= -3;
                this.calories_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDeviceBatteryStatus() {
                this.bitField0_ &= -65;
                this.deviceBatteryStatus_ = null;
                SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.deviceBatteryStatusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeviceChargingCaseStatus() {
                this.bitField0_ &= -1048577;
                this.deviceChargingCaseStatus_ = null;
                SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.deviceChargingCaseStatusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDistance() {
                this.bitField0_ &= -5;
                this.distance_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDistanceData() {
                this.bitField0_ &= -65537;
                this.distanceData_ = SEBasicData.getDefaultInstance().getDistanceData();
                onChanged();
                return this;
            }

            public Builder clearEffectiveStanding() {
                this.bitField0_ &= -33;
                this.effectiveStanding_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEffectiveStandingHour() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.effectiveStandingHour_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFullyChargedNeedTime() {
                this.bitField0_ &= -8388609;
                this.fullyChargedNeedTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHBAData() {
                this.bitField0_ &= -1025;
                this.hBAData_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHeartRate() {
                this.bitField0_ &= -9;
                this.heartRate_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNfcSleepErr() {
                this.bitField0_ &= -4194305;
                this.nfcSleepErr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPhysiologicalCycle() {
                this.bitField0_ &= -513;
                this.physiologicalCycle_ = null;
                SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> singleFieldBuilder = this.physiologicalCycleBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.physiologicalCycleBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPressure() {
                this.bitField0_ &= -4097;
                this.pressure_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRemainingBatteryTime() {
                this.bitField0_ &= -16777217;
                this.remainingBatteryTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSarGdiff() {
                this.bitField0_ &= -2097153;
                this.sarGdiff_ = SEBasicData.getDefaultInstance().getSarGdiff();
                onChanged();
                return this;
            }

            public Builder clearSleepDuration() {
                this.bitField0_ &= -257;
                this.sleepDuration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSteps() {
                this.bitField0_ &= -2;
                this.steps_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStepsData() {
                this.bitField0_ &= -32769;
                this.stepsData_ = SEBasicData.getDefaultInstance().getStepsData();
                onChanged();
                return this;
            }

            public Builder clearTodayOuraCalorieData() {
                this.bitField0_ &= -8193;
                this.todayOuraCalorieData_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTodayOuraCalorieHourlyData() {
                this.bitField0_ &= -262145;
                this.todayOuraCalorieHourlyData_ = SEBasicData.getDefaultInstance().getTodayOuraCalorieHourlyData();
                onChanged();
                return this;
            }

            public Builder clearTodaySportCalorieData() {
                this.bitField0_ &= -16385;
                this.todaySportCalorieData_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTodaySportCalorieHourlyData() {
                this.bitField0_ &= -524289;
                this.todaySportCalorieHourlyData_ = SEBasicData.getDefaultInstance().getTodaySportCalorieHourlyData();
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getActivityDuration() {
                return this.activityDuration_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getBloodOxygen() {
                return this.bloodOxygen_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public ByteString getCalorieData() {
                return this.calorieData_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getCalories() {
                return this.calories_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MicroFunctionProtos.internal_static_SEBasicData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public DeviceProtos.SEDeviceBatteryStatus getDeviceBatteryStatus() {
                SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    return (DeviceProtos.SEDeviceBatteryStatus) singleFieldBuilder.getMessage();
                }
                DeviceProtos.SEDeviceBatteryStatus sEDeviceBatteryStatus = this.deviceBatteryStatus_;
                return sEDeviceBatteryStatus == null ? DeviceProtos.SEDeviceBatteryStatus.getDefaultInstance() : sEDeviceBatteryStatus;
            }

            public DeviceProtos.SEDeviceBatteryStatus.Builder getDeviceBatteryStatusBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (DeviceProtos.SEDeviceBatteryStatus.Builder) internalGetDeviceBatteryStatusFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public DeviceProtos.SEDeviceBatteryStatusOrBuilder getDeviceBatteryStatusOrBuilder() {
                SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    return (DeviceProtos.SEDeviceBatteryStatusOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                DeviceProtos.SEDeviceBatteryStatus sEDeviceBatteryStatus = this.deviceBatteryStatus_;
                return sEDeviceBatteryStatus == null ? DeviceProtos.SEDeviceBatteryStatus.getDefaultInstance() : sEDeviceBatteryStatus;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public DeviceProtos.SEDeviceChargingCaseStatus getDeviceChargingCaseStatus() {
                SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder != null) {
                    return (DeviceProtos.SEDeviceChargingCaseStatus) singleFieldBuilder.getMessage();
                }
                DeviceProtos.SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus = this.deviceChargingCaseStatus_;
                return sEDeviceChargingCaseStatus == null ? DeviceProtos.SEDeviceChargingCaseStatus.getDefaultInstance() : sEDeviceChargingCaseStatus;
            }

            public DeviceProtos.SEDeviceChargingCaseStatus.Builder getDeviceChargingCaseStatusBuilder() {
                this.bitField0_ |= 1048576;
                onChanged();
                return (DeviceProtos.SEDeviceChargingCaseStatus.Builder) internalGetDeviceChargingCaseStatusFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public DeviceProtos.SEDeviceChargingCaseStatusOrBuilder getDeviceChargingCaseStatusOrBuilder() {
                SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder != null) {
                    return (DeviceProtos.SEDeviceChargingCaseStatusOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                DeviceProtos.SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus = this.deviceChargingCaseStatus_;
                return sEDeviceChargingCaseStatus == null ? DeviceProtos.SEDeviceChargingCaseStatus.getDefaultInstance() : sEDeviceChargingCaseStatus;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getDistance() {
                return this.distance_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public ByteString getDistanceData() {
                return this.distanceData_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getEffectiveStanding() {
                return this.effectiveStanding_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getEffectiveStandingHour() {
                return this.effectiveStandingHour_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getFullyChargedNeedTime() {
                return this.fullyChargedNeedTime_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getHBAData() {
                return this.hBAData_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getHeartRate() {
                return this.heartRate_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getNfcSleepErr() {
                return this.nfcSleepErr_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public SettingMenuProtos.SEPhysiologicalCycle getPhysiologicalCycle() {
                SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> singleFieldBuilder = this.physiologicalCycleBuilder_;
                if (singleFieldBuilder != null) {
                    return (SettingMenuProtos.SEPhysiologicalCycle) singleFieldBuilder.getMessage();
                }
                SettingMenuProtos.SEPhysiologicalCycle sEPhysiologicalCycle = this.physiologicalCycle_;
                return sEPhysiologicalCycle == null ? SettingMenuProtos.SEPhysiologicalCycle.getDefaultInstance() : sEPhysiologicalCycle;
            }

            public SettingMenuProtos.SEPhysiologicalCycle.Builder getPhysiologicalCycleBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (SettingMenuProtos.SEPhysiologicalCycle.Builder) internalGetPhysiologicalCycleFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public SettingMenuProtos.SEPhysiologicalCycleOrBuilder getPhysiologicalCycleOrBuilder() {
                SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> singleFieldBuilder = this.physiologicalCycleBuilder_;
                if (singleFieldBuilder != null) {
                    return (SettingMenuProtos.SEPhysiologicalCycleOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SettingMenuProtos.SEPhysiologicalCycle sEPhysiologicalCycle = this.physiologicalCycle_;
                return sEPhysiologicalCycle == null ? SettingMenuProtos.SEPhysiologicalCycle.getDefaultInstance() : sEPhysiologicalCycle;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getPressure() {
                return this.pressure_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getRemainingBatteryTime() {
                return this.remainingBatteryTime_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public ByteString getSarGdiff() {
                return this.sarGdiff_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getSleepDuration() {
                return this.sleepDuration_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getSteps() {
                return this.steps_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public ByteString getStepsData() {
                return this.stepsData_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getTodayOuraCalorieData() {
                return this.todayOuraCalorieData_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public ByteString getTodayOuraCalorieHourlyData() {
                return this.todayOuraCalorieHourlyData_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public int getTodaySportCalorieData() {
                return this.todaySportCalorieData_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public ByteString getTodaySportCalorieHourlyData() {
                return this.todaySportCalorieHourlyData_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasActivityDuration() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasBloodOxygen() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasCalorieData() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasCalories() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasDeviceBatteryStatus() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasDeviceChargingCaseStatus() {
                return (this.bitField0_ & 1048576) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasDistance() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasDistanceData() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasEffectiveStanding() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasEffectiveStandingHour() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasFullyChargedNeedTime() {
                return (this.bitField0_ & 8388608) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasHBAData() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasHeartRate() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasNfcSleepErr() {
                return (this.bitField0_ & 4194304) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasPhysiologicalCycle() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasPressure() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasRemainingBatteryTime() {
                return (this.bitField0_ & 16777216) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasSarGdiff() {
                return (this.bitField0_ & 2097152) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasSleepDuration() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasSteps() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasStepsData() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasTodayOuraCalorieData() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasTodayOuraCalorieHourlyData() {
                return (this.bitField0_ & 262144) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasTodaySportCalorieData() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
            public boolean hasTodaySportCalorieHourlyData() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return MicroFunctionProtos.internal_static_SEBasicData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBasicData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasSteps() || !hasCalories()) {
                    return false;
                }
                if (hasDeviceBatteryStatus() && !getDeviceBatteryStatus().isInitialized()) {
                    return false;
                }
                if (!hasPhysiologicalCycle() || getPhysiologicalCycle().isInitialized()) {
                    return !hasDeviceChargingCaseStatus() || getDeviceChargingCaseStatus().isInitialized();
                }
                return false;
            }

            public Builder mergeDeviceBatteryStatus(DeviceProtos.SEDeviceBatteryStatus sEDeviceBatteryStatus) {
                DeviceProtos.SEDeviceBatteryStatus sEDeviceBatteryStatus2;
                SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEDeviceBatteryStatus);
                } else if ((this.bitField0_ & 64) == 0 || (sEDeviceBatteryStatus2 = this.deviceBatteryStatus_) == null || sEDeviceBatteryStatus2 == DeviceProtos.SEDeviceBatteryStatus.getDefaultInstance()) {
                    this.deviceBatteryStatus_ = sEDeviceBatteryStatus;
                } else {
                    getDeviceBatteryStatusBuilder().mergeFrom(sEDeviceBatteryStatus);
                }
                if (this.deviceBatteryStatus_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeviceChargingCaseStatus(DeviceProtos.SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus) {
                DeviceProtos.SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus2;
                SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEDeviceChargingCaseStatus);
                } else if ((this.bitField0_ & 1048576) == 0 || (sEDeviceChargingCaseStatus2 = this.deviceChargingCaseStatus_) == null || sEDeviceChargingCaseStatus2 == DeviceProtos.SEDeviceChargingCaseStatus.getDefaultInstance()) {
                    this.deviceChargingCaseStatus_ = sEDeviceChargingCaseStatus;
                } else {
                    getDeviceChargingCaseStatusBuilder().mergeFrom(sEDeviceChargingCaseStatus);
                }
                if (this.deviceChargingCaseStatus_ != null) {
                    this.bitField0_ |= 1048576;
                    onChanged();
                }
                return this;
            }

            public Builder mergePhysiologicalCycle(SettingMenuProtos.SEPhysiologicalCycle sEPhysiologicalCycle) {
                SettingMenuProtos.SEPhysiologicalCycle sEPhysiologicalCycle2;
                SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> singleFieldBuilder = this.physiologicalCycleBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEPhysiologicalCycle);
                } else if ((this.bitField0_ & 512) == 0 || (sEPhysiologicalCycle2 = this.physiologicalCycle_) == null || sEPhysiologicalCycle2 == SettingMenuProtos.SEPhysiologicalCycle.getDefaultInstance()) {
                    this.physiologicalCycle_ = sEPhysiologicalCycle;
                } else {
                    getPhysiologicalCycleBuilder().mergeFrom(sEPhysiologicalCycle);
                }
                if (this.physiologicalCycle_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder setActivityDuration(int i7) {
                this.activityDuration_ = i7;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setBloodOxygen(int i7) {
                this.bloodOxygen_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setCalorieData(ByteString byteString) {
                byteString.getClass();
                this.calorieData_ = byteString;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setCalories(int i7) {
                this.calories_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDeviceBatteryStatus(DeviceProtos.SEDeviceBatteryStatus sEDeviceBatteryStatus) {
                SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder == null) {
                    sEDeviceBatteryStatus.getClass();
                    this.deviceBatteryStatus_ = sEDeviceBatteryStatus;
                } else {
                    singleFieldBuilder.setMessage(sEDeviceBatteryStatus);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDeviceChargingCaseStatus(DeviceProtos.SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus) {
                SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder == null) {
                    sEDeviceChargingCaseStatus.getClass();
                    this.deviceChargingCaseStatus_ = sEDeviceChargingCaseStatus;
                } else {
                    singleFieldBuilder.setMessage(sEDeviceChargingCaseStatus);
                }
                this.bitField0_ |= 1048576;
                onChanged();
                return this;
            }

            public Builder setDistance(int i7) {
                this.distance_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDistanceData(ByteString byteString) {
                byteString.getClass();
                this.distanceData_ = byteString;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setEffectiveStanding(int i7) {
                this.effectiveStanding_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setEffectiveStandingHour(int i7) {
                this.effectiveStandingHour_ = i7;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setFullyChargedNeedTime(int i7) {
                this.fullyChargedNeedTime_ = i7;
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            public Builder setHBAData(int i7) {
                this.hBAData_ = i7;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setHeartRate(int i7) {
                this.heartRate_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNfcSleepErr(int i7) {
                this.nfcSleepErr_ = i7;
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setPhysiologicalCycle(SettingMenuProtos.SEPhysiologicalCycle sEPhysiologicalCycle) {
                SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> singleFieldBuilder = this.physiologicalCycleBuilder_;
                if (singleFieldBuilder == null) {
                    sEPhysiologicalCycle.getClass();
                    this.physiologicalCycle_ = sEPhysiologicalCycle;
                } else {
                    singleFieldBuilder.setMessage(sEPhysiologicalCycle);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPressure(int i7) {
                this.pressure_ = i7;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setRemainingBatteryTime(int i7) {
                this.remainingBatteryTime_ = i7;
                this.bitField0_ |= 16777216;
                onChanged();
                return this;
            }

            public Builder setSarGdiff(ByteString byteString) {
                byteString.getClass();
                this.sarGdiff_ = byteString;
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setSleepDuration(int i7) {
                this.sleepDuration_ = i7;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSteps(int i7) {
                this.steps_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStepsData(ByteString byteString) {
                byteString.getClass();
                this.stepsData_ = byteString;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setTodayOuraCalorieData(int i7) {
                this.todayOuraCalorieData_ = i7;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setTodayOuraCalorieHourlyData(ByteString byteString) {
                byteString.getClass();
                this.todayOuraCalorieHourlyData_ = byteString;
                this.bitField0_ |= 262144;
                onChanged();
                return this;
            }

            public Builder setTodaySportCalorieData(int i7) {
                this.todaySportCalorieData_ = i7;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setTodaySportCalorieHourlyData(ByteString byteString) {
                byteString.getClass();
                this.todaySportCalorieHourlyData_ = byteString;
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(h hVar) {
                this();
            }

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.stepsData_ = byteString;
                this.distanceData_ = byteString;
                this.calorieData_ = byteString;
                this.todayOuraCalorieHourlyData_ = byteString;
                this.todaySportCalorieHourlyData_ = byteString;
                this.sarGdiff_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBasicData build() {
                SEBasicData sEBasicDataBuildPartial = buildPartial();
                if (sEBasicDataBuildPartial.isInitialized()) {
                    return sEBasicDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEBasicDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBasicData buildPartial() {
                SEBasicData sEBasicData = new SEBasicData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEBasicData);
                }
                onBuilt();
                return sEBasicData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEBasicData getDefaultInstanceForType() {
                return SEBasicData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.steps_ = 0;
                this.calories_ = 0;
                this.distance_ = 0;
                this.heartRate_ = 0;
                this.bloodOxygen_ = 0;
                this.effectiveStanding_ = 0;
                this.deviceBatteryStatus_ = null;
                SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.deviceBatteryStatusBuilder_ = null;
                }
                this.effectiveStandingHour_ = 0;
                this.sleepDuration_ = 0;
                this.physiologicalCycle_ = null;
                SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> singleFieldBuilder2 = this.physiologicalCycleBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.physiologicalCycleBuilder_ = null;
                }
                this.hBAData_ = 0;
                this.activityDuration_ = 0;
                this.pressure_ = 0;
                this.todayOuraCalorieData_ = 0;
                this.todaySportCalorieData_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.stepsData_ = byteString;
                this.distanceData_ = byteString;
                this.calorieData_ = byteString;
                this.todayOuraCalorieHourlyData_ = byteString;
                this.todaySportCalorieHourlyData_ = byteString;
                this.deviceChargingCaseStatus_ = null;
                SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder3 = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.dispose();
                    this.deviceChargingCaseStatusBuilder_ = null;
                }
                this.sarGdiff_ = byteString;
                this.nfcSleepErr_ = 0;
                this.fullyChargedNeedTime_ = 0;
                this.remainingBatteryTime_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEBasicData) {
                    return mergeFrom((SEBasicData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDeviceBatteryStatus(DeviceProtos.SEDeviceBatteryStatus.Builder builder) {
                SingleFieldBuilder<DeviceProtos.SEDeviceBatteryStatus, DeviceProtos.SEDeviceBatteryStatus.Builder, DeviceProtos.SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder == null) {
                    this.deviceBatteryStatus_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDeviceChargingCaseStatus(DeviceProtos.SEDeviceChargingCaseStatus.Builder builder) {
                SingleFieldBuilder<DeviceProtos.SEDeviceChargingCaseStatus, DeviceProtos.SEDeviceChargingCaseStatus.Builder, DeviceProtos.SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder == null) {
                    this.deviceChargingCaseStatus_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1048576;
                onChanged();
                return this;
            }

            public Builder setPhysiologicalCycle(SettingMenuProtos.SEPhysiologicalCycle.Builder builder) {
                SingleFieldBuilder<SettingMenuProtos.SEPhysiologicalCycle, SettingMenuProtos.SEPhysiologicalCycle.Builder, SettingMenuProtos.SEPhysiologicalCycleOrBuilder> singleFieldBuilder = this.physiologicalCycleBuilder_;
                if (singleFieldBuilder == null) {
                    this.physiologicalCycle_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEBasicData sEBasicData) {
                if (sEBasicData == SEBasicData.getDefaultInstance()) {
                    return this;
                }
                if (sEBasicData.hasSteps()) {
                    setSteps(sEBasicData.getSteps());
                }
                if (sEBasicData.hasCalories()) {
                    setCalories(sEBasicData.getCalories());
                }
                if (sEBasicData.hasDistance()) {
                    setDistance(sEBasicData.getDistance());
                }
                if (sEBasicData.hasHeartRate()) {
                    setHeartRate(sEBasicData.getHeartRate());
                }
                if (sEBasicData.hasBloodOxygen()) {
                    setBloodOxygen(sEBasicData.getBloodOxygen());
                }
                if (sEBasicData.hasEffectiveStanding()) {
                    setEffectiveStanding(sEBasicData.getEffectiveStanding());
                }
                if (sEBasicData.hasDeviceBatteryStatus()) {
                    mergeDeviceBatteryStatus(sEBasicData.getDeviceBatteryStatus());
                }
                if (sEBasicData.hasEffectiveStandingHour()) {
                    setEffectiveStandingHour(sEBasicData.getEffectiveStandingHour());
                }
                if (sEBasicData.hasSleepDuration()) {
                    setSleepDuration(sEBasicData.getSleepDuration());
                }
                if (sEBasicData.hasPhysiologicalCycle()) {
                    mergePhysiologicalCycle(sEBasicData.getPhysiologicalCycle());
                }
                if (sEBasicData.hasHBAData()) {
                    setHBAData(sEBasicData.getHBAData());
                }
                if (sEBasicData.hasActivityDuration()) {
                    setActivityDuration(sEBasicData.getActivityDuration());
                }
                if (sEBasicData.hasPressure()) {
                    setPressure(sEBasicData.getPressure());
                }
                if (sEBasicData.hasTodayOuraCalorieData()) {
                    setTodayOuraCalorieData(sEBasicData.getTodayOuraCalorieData());
                }
                if (sEBasicData.hasTodaySportCalorieData()) {
                    setTodaySportCalorieData(sEBasicData.getTodaySportCalorieData());
                }
                if (sEBasicData.hasStepsData()) {
                    setStepsData(sEBasicData.getStepsData());
                }
                if (sEBasicData.hasDistanceData()) {
                    setDistanceData(sEBasicData.getDistanceData());
                }
                if (sEBasicData.hasCalorieData()) {
                    setCalorieData(sEBasicData.getCalorieData());
                }
                if (sEBasicData.hasTodayOuraCalorieHourlyData()) {
                    setTodayOuraCalorieHourlyData(sEBasicData.getTodayOuraCalorieHourlyData());
                }
                if (sEBasicData.hasTodaySportCalorieHourlyData()) {
                    setTodaySportCalorieHourlyData(sEBasicData.getTodaySportCalorieHourlyData());
                }
                if (sEBasicData.hasDeviceChargingCaseStatus()) {
                    mergeDeviceChargingCaseStatus(sEBasicData.getDeviceChargingCaseStatus());
                }
                if (sEBasicData.hasSarGdiff()) {
                    setSarGdiff(sEBasicData.getSarGdiff());
                }
                if (sEBasicData.hasNfcSleepErr()) {
                    setNfcSleepErr(sEBasicData.getNfcSleepErr());
                }
                if (sEBasicData.hasFullyChargedNeedTime()) {
                    setFullyChargedNeedTime(sEBasicData.getFullyChargedNeedTime());
                }
                if (sEBasicData.hasRemainingBatteryTime()) {
                    setRemainingBatteryTime(sEBasicData.getRemainingBatteryTime());
                }
                mergeUnknownFields(sEBasicData.getUnknownFields());
                onChanged();
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.stepsData_ = byteString;
                this.distanceData_ = byteString;
                this.calorieData_ = byteString;
                this.todayOuraCalorieHourlyData_ = byteString;
                this.todaySportCalorieHourlyData_ = byteString;
                this.sarGdiff_ = byteString;
                maybeForceBuilderInitialization();
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
                                    this.steps_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    break;
                                case 16:
                                    this.calories_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    break;
                                case 24:
                                    this.distance_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    break;
                                case 32:
                                    this.heartRate_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    break;
                                case 40:
                                    this.bloodOxygen_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                    break;
                                case 48:
                                    this.effectiveStanding_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    codedInputStream.readMessage(internalGetDeviceBatteryStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.effectiveStandingHour_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 72:
                                    this.sleepDuration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    break;
                                case 82:
                                    codedInputStream.readMessage(internalGetPhysiologicalCycleFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    break;
                                case 88:
                                    this.hBAData_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1024;
                                    break;
                                case 96:
                                    this.activityDuration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 104:
                                    this.pressure_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4096;
                                    break;
                                case 112:
                                    this.todayOuraCalorieData_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 120:
                                    this.todaySportCalorieData_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16384;
                                    break;
                                case 130:
                                    this.stepsData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32768;
                                    break;
                                case 138:
                                    this.distanceData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 65536;
                                    break;
                                case 146:
                                    this.calorieData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 131072;
                                    break;
                                case 154:
                                    this.todayOuraCalorieHourlyData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 262144;
                                    break;
                                case 162:
                                    this.todaySportCalorieHourlyData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 524288;
                                    break;
                                case 170:
                                    codedInputStream.readMessage(internalGetDeviceChargingCaseStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1048576;
                                    break;
                                case 178:
                                    this.sarGdiff_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2097152;
                                    break;
                                case 184:
                                    this.nfcSleepErr_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4194304;
                                    break;
                                case 192:
                                    this.fullyChargedNeedTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8388608;
                                    break;
                                case 200:
                                    this.remainingBatteryTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16777216;
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBasicData");
            DEFAULT_INSTANCE = new SEBasicData();
            PARSER = new AbstractParser<SEBasicData>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicData.1
                @Override // com.google.protobuf.Parser
                public SEBasicData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEBasicData.newBuilder();
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

        public /* synthetic */ SEBasicData(GeneratedMessage.Builder builder, h hVar) {
            this(builder);
        }

        public static SEBasicData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MicroFunctionProtos.internal_static_SEBasicData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEBasicData parseDelimitedFrom(InputStream inputStream) {
            return (SEBasicData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEBasicData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEBasicData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEBasicData)) {
                return super.equals(obj);
            }
            SEBasicData sEBasicData = (SEBasicData) obj;
            if (hasSteps() != sEBasicData.hasSteps()) {
                return false;
            }
            if ((hasSteps() && getSteps() != sEBasicData.getSteps()) || hasCalories() != sEBasicData.hasCalories()) {
                return false;
            }
            if ((hasCalories() && getCalories() != sEBasicData.getCalories()) || hasDistance() != sEBasicData.hasDistance()) {
                return false;
            }
            if ((hasDistance() && getDistance() != sEBasicData.getDistance()) || hasHeartRate() != sEBasicData.hasHeartRate()) {
                return false;
            }
            if ((hasHeartRate() && getHeartRate() != sEBasicData.getHeartRate()) || hasBloodOxygen() != sEBasicData.hasBloodOxygen()) {
                return false;
            }
            if ((hasBloodOxygen() && getBloodOxygen() != sEBasicData.getBloodOxygen()) || hasEffectiveStanding() != sEBasicData.hasEffectiveStanding()) {
                return false;
            }
            if ((hasEffectiveStanding() && getEffectiveStanding() != sEBasicData.getEffectiveStanding()) || hasDeviceBatteryStatus() != sEBasicData.hasDeviceBatteryStatus()) {
                return false;
            }
            if ((hasDeviceBatteryStatus() && !getDeviceBatteryStatus().equals(sEBasicData.getDeviceBatteryStatus())) || hasEffectiveStandingHour() != sEBasicData.hasEffectiveStandingHour()) {
                return false;
            }
            if ((hasEffectiveStandingHour() && getEffectiveStandingHour() != sEBasicData.getEffectiveStandingHour()) || hasSleepDuration() != sEBasicData.hasSleepDuration()) {
                return false;
            }
            if ((hasSleepDuration() && getSleepDuration() != sEBasicData.getSleepDuration()) || hasPhysiologicalCycle() != sEBasicData.hasPhysiologicalCycle()) {
                return false;
            }
            if ((hasPhysiologicalCycle() && !getPhysiologicalCycle().equals(sEBasicData.getPhysiologicalCycle())) || hasHBAData() != sEBasicData.hasHBAData()) {
                return false;
            }
            if ((hasHBAData() && getHBAData() != sEBasicData.getHBAData()) || hasActivityDuration() != sEBasicData.hasActivityDuration()) {
                return false;
            }
            if ((hasActivityDuration() && getActivityDuration() != sEBasicData.getActivityDuration()) || hasPressure() != sEBasicData.hasPressure()) {
                return false;
            }
            if ((hasPressure() && getPressure() != sEBasicData.getPressure()) || hasTodayOuraCalorieData() != sEBasicData.hasTodayOuraCalorieData()) {
                return false;
            }
            if ((hasTodayOuraCalorieData() && getTodayOuraCalorieData() != sEBasicData.getTodayOuraCalorieData()) || hasTodaySportCalorieData() != sEBasicData.hasTodaySportCalorieData()) {
                return false;
            }
            if ((hasTodaySportCalorieData() && getTodaySportCalorieData() != sEBasicData.getTodaySportCalorieData()) || hasStepsData() != sEBasicData.hasStepsData()) {
                return false;
            }
            if ((hasStepsData() && !getStepsData().equals(sEBasicData.getStepsData())) || hasDistanceData() != sEBasicData.hasDistanceData()) {
                return false;
            }
            if ((hasDistanceData() && !getDistanceData().equals(sEBasicData.getDistanceData())) || hasCalorieData() != sEBasicData.hasCalorieData()) {
                return false;
            }
            if ((hasCalorieData() && !getCalorieData().equals(sEBasicData.getCalorieData())) || hasTodayOuraCalorieHourlyData() != sEBasicData.hasTodayOuraCalorieHourlyData()) {
                return false;
            }
            if ((hasTodayOuraCalorieHourlyData() && !getTodayOuraCalorieHourlyData().equals(sEBasicData.getTodayOuraCalorieHourlyData())) || hasTodaySportCalorieHourlyData() != sEBasicData.hasTodaySportCalorieHourlyData()) {
                return false;
            }
            if ((hasTodaySportCalorieHourlyData() && !getTodaySportCalorieHourlyData().equals(sEBasicData.getTodaySportCalorieHourlyData())) || hasDeviceChargingCaseStatus() != sEBasicData.hasDeviceChargingCaseStatus()) {
                return false;
            }
            if ((hasDeviceChargingCaseStatus() && !getDeviceChargingCaseStatus().equals(sEBasicData.getDeviceChargingCaseStatus())) || hasSarGdiff() != sEBasicData.hasSarGdiff()) {
                return false;
            }
            if ((hasSarGdiff() && !getSarGdiff().equals(sEBasicData.getSarGdiff())) || hasNfcSleepErr() != sEBasicData.hasNfcSleepErr()) {
                return false;
            }
            if ((hasNfcSleepErr() && getNfcSleepErr() != sEBasicData.getNfcSleepErr()) || hasFullyChargedNeedTime() != sEBasicData.hasFullyChargedNeedTime()) {
                return false;
            }
            if ((!hasFullyChargedNeedTime() || getFullyChargedNeedTime() == sEBasicData.getFullyChargedNeedTime()) && hasRemainingBatteryTime() == sEBasicData.hasRemainingBatteryTime()) {
                return (!hasRemainingBatteryTime() || getRemainingBatteryTime() == sEBasicData.getRemainingBatteryTime()) && getUnknownFields().equals(sEBasicData.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getActivityDuration() {
            return this.activityDuration_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getBloodOxygen() {
            return this.bloodOxygen_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public ByteString getCalorieData() {
            return this.calorieData_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getCalories() {
            return this.calories_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return MicroFunctionProtos.internal_static_SEBasicData_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public DeviceProtos.SEDeviceBatteryStatus getDeviceBatteryStatus() {
            DeviceProtos.SEDeviceBatteryStatus sEDeviceBatteryStatus = this.deviceBatteryStatus_;
            return sEDeviceBatteryStatus == null ? DeviceProtos.SEDeviceBatteryStatus.getDefaultInstance() : sEDeviceBatteryStatus;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public DeviceProtos.SEDeviceBatteryStatusOrBuilder getDeviceBatteryStatusOrBuilder() {
            DeviceProtos.SEDeviceBatteryStatus sEDeviceBatteryStatus = this.deviceBatteryStatus_;
            return sEDeviceBatteryStatus == null ? DeviceProtos.SEDeviceBatteryStatus.getDefaultInstance() : sEDeviceBatteryStatus;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public DeviceProtos.SEDeviceChargingCaseStatus getDeviceChargingCaseStatus() {
            DeviceProtos.SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus = this.deviceChargingCaseStatus_;
            return sEDeviceChargingCaseStatus == null ? DeviceProtos.SEDeviceChargingCaseStatus.getDefaultInstance() : sEDeviceChargingCaseStatus;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public DeviceProtos.SEDeviceChargingCaseStatusOrBuilder getDeviceChargingCaseStatusOrBuilder() {
            DeviceProtos.SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus = this.deviceChargingCaseStatus_;
            return sEDeviceChargingCaseStatus == null ? DeviceProtos.SEDeviceChargingCaseStatus.getDefaultInstance() : sEDeviceChargingCaseStatus;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getDistance() {
            return this.distance_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public ByteString getDistanceData() {
            return this.distanceData_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getEffectiveStanding() {
            return this.effectiveStanding_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getEffectiveStandingHour() {
            return this.effectiveStandingHour_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getFullyChargedNeedTime() {
            return this.fullyChargedNeedTime_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getHBAData() {
            return this.hBAData_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getHeartRate() {
            return this.heartRate_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getNfcSleepErr() {
            return this.nfcSleepErr_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEBasicData> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public SettingMenuProtos.SEPhysiologicalCycle getPhysiologicalCycle() {
            SettingMenuProtos.SEPhysiologicalCycle sEPhysiologicalCycle = this.physiologicalCycle_;
            return sEPhysiologicalCycle == null ? SettingMenuProtos.SEPhysiologicalCycle.getDefaultInstance() : sEPhysiologicalCycle;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public SettingMenuProtos.SEPhysiologicalCycleOrBuilder getPhysiologicalCycleOrBuilder() {
            SettingMenuProtos.SEPhysiologicalCycle sEPhysiologicalCycle = this.physiologicalCycle_;
            return sEPhysiologicalCycle == null ? SettingMenuProtos.SEPhysiologicalCycle.getDefaultInstance() : sEPhysiologicalCycle;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getPressure() {
            return this.pressure_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getRemainingBatteryTime() {
            return this.remainingBatteryTime_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public ByteString getSarGdiff() {
            return this.sarGdiff_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.steps_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.calories_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.distance_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.heartRate_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.bloodOxygen_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.effectiveStanding_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(7, getDeviceBatteryStatus());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(8, this.effectiveStandingHour_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(9, this.sleepDuration_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(10, getPhysiologicalCycle());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(11, this.hBAData_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(12, this.activityDuration_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(13, this.pressure_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(14, this.todayOuraCalorieData_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(15, this.todaySportCalorieData_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(16, this.stepsData_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(17, this.distanceData_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(18, this.calorieData_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(19, this.todayOuraCalorieHourlyData_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(20, this.todaySportCalorieHourlyData_);
            }
            if ((this.bitField0_ & 1048576) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(21, getDeviceChargingCaseStatus());
            }
            if ((this.bitField0_ & 2097152) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(22, this.sarGdiff_);
            }
            if ((this.bitField0_ & 4194304) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(23, this.nfcSleepErr_);
            }
            if ((this.bitField0_ & 8388608) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(24, this.fullyChargedNeedTime_);
            }
            if ((this.bitField0_ & 16777216) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(25, this.remainingBatteryTime_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getSleepDuration() {
            return this.sleepDuration_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getSteps() {
            return this.steps_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public ByteString getStepsData() {
            return this.stepsData_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getTodayOuraCalorieData() {
            return this.todayOuraCalorieData_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public ByteString getTodayOuraCalorieHourlyData() {
            return this.todayOuraCalorieHourlyData_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public int getTodaySportCalorieData() {
            return this.todaySportCalorieData_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public ByteString getTodaySportCalorieHourlyData() {
            return this.todaySportCalorieHourlyData_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasActivityDuration() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasBloodOxygen() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasCalorieData() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasCalories() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasDeviceBatteryStatus() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasDeviceChargingCaseStatus() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasDistance() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasDistanceData() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasEffectiveStanding() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasEffectiveStandingHour() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasFullyChargedNeedTime() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasHBAData() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasHeartRate() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasNfcSleepErr() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasPhysiologicalCycle() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasPressure() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasRemainingBatteryTime() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasSarGdiff() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasSleepDuration() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasSteps() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasStepsData() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasTodayOuraCalorieData() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasTodayOuraCalorieHourlyData() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasTodaySportCalorieData() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataOrBuilder
        public boolean hasTodaySportCalorieHourlyData() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSteps()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getSteps();
            }
            if (hasCalories()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getCalories();
            }
            if (hasDistance()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDistance();
            }
            if (hasHeartRate()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getHeartRate();
            }
            if (hasBloodOxygen()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getBloodOxygen();
            }
            if (hasEffectiveStanding()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getEffectiveStanding();
            }
            if (hasDeviceBatteryStatus()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getDeviceBatteryStatus().hashCode();
            }
            if (hasEffectiveStandingHour()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getEffectiveStandingHour();
            }
            if (hasSleepDuration()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getSleepDuration();
            }
            if (hasPhysiologicalCycle()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getPhysiologicalCycle().hashCode();
            }
            if (hasHBAData()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getHBAData();
            }
            if (hasActivityDuration()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + getActivityDuration();
            }
            if (hasPressure()) {
                iHashCode = (((iHashCode * 37) + 13) * 53) + getPressure();
            }
            if (hasTodayOuraCalorieData()) {
                iHashCode = (((iHashCode * 37) + 14) * 53) + getTodayOuraCalorieData();
            }
            if (hasTodaySportCalorieData()) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + getTodaySportCalorieData();
            }
            if (hasStepsData()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + getStepsData().hashCode();
            }
            if (hasDistanceData()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + getDistanceData().hashCode();
            }
            if (hasCalorieData()) {
                iHashCode = (((iHashCode * 37) + 18) * 53) + getCalorieData().hashCode();
            }
            if (hasTodayOuraCalorieHourlyData()) {
                iHashCode = (((iHashCode * 37) + 19) * 53) + getTodayOuraCalorieHourlyData().hashCode();
            }
            if (hasTodaySportCalorieHourlyData()) {
                iHashCode = (((iHashCode * 37) + 20) * 53) + getTodaySportCalorieHourlyData().hashCode();
            }
            if (hasDeviceChargingCaseStatus()) {
                iHashCode = (((iHashCode * 37) + 21) * 53) + getDeviceChargingCaseStatus().hashCode();
            }
            if (hasSarGdiff()) {
                iHashCode = (((iHashCode * 37) + 22) * 53) + getSarGdiff().hashCode();
            }
            if (hasNfcSleepErr()) {
                iHashCode = (((iHashCode * 37) + 23) * 53) + getNfcSleepErr();
            }
            if (hasFullyChargedNeedTime()) {
                iHashCode = (((iHashCode * 37) + 24) * 53) + getFullyChargedNeedTime();
            }
            if (hasRemainingBatteryTime()) {
                iHashCode = (((iHashCode * 37) + 25) * 53) + getRemainingBatteryTime();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return MicroFunctionProtos.internal_static_SEBasicData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBasicData.class, Builder.class);
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
            if (!hasSteps()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCalories()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDeviceBatteryStatus() && !getDeviceBatteryStatus().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPhysiologicalCycle() && !getPhysiologicalCycle().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDeviceChargingCaseStatus() || getDeviceChargingCaseStatus().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.steps_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.calories_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.distance_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.heartRate_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.bloodOxygen_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.effectiveStanding_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getDeviceBatteryStatus());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.effectiveStandingHour_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.sleepDuration_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getPhysiologicalCycle());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeUInt32(11, this.hBAData_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(12, this.activityDuration_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeUInt32(13, this.pressure_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeUInt32(14, this.todayOuraCalorieData_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeUInt32(15, this.todaySportCalorieData_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeBytes(16, this.stepsData_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeBytes(17, this.distanceData_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeBytes(18, this.calorieData_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                codedOutputStream.writeBytes(19, this.todayOuraCalorieHourlyData_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeBytes(20, this.todaySportCalorieHourlyData_);
            }
            if ((this.bitField0_ & 1048576) != 0) {
                codedOutputStream.writeMessage(21, getDeviceChargingCaseStatus());
            }
            if ((this.bitField0_ & 2097152) != 0) {
                codedOutputStream.writeBytes(22, this.sarGdiff_);
            }
            if ((this.bitField0_ & 4194304) != 0) {
                codedOutputStream.writeUInt32(23, this.nfcSleepErr_);
            }
            if ((this.bitField0_ & 8388608) != 0) {
                codedOutputStream.writeUInt32(24, this.fullyChargedNeedTime_);
            }
            if ((this.bitField0_ & 16777216) != 0) {
                codedOutputStream.writeUInt32(25, this.remainingBatteryTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEBasicData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.steps_ = 0;
            this.calories_ = 0;
            this.distance_ = 0;
            this.heartRate_ = 0;
            this.bloodOxygen_ = 0;
            this.effectiveStanding_ = 0;
            this.effectiveStandingHour_ = 0;
            this.sleepDuration_ = 0;
            this.hBAData_ = 0;
            this.activityDuration_ = 0;
            this.pressure_ = 0;
            this.todayOuraCalorieData_ = 0;
            this.todaySportCalorieData_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.stepsData_ = byteString;
            this.distanceData_ = byteString;
            this.calorieData_ = byteString;
            this.todayOuraCalorieHourlyData_ = byteString;
            this.todaySportCalorieHourlyData_ = byteString;
            this.sarGdiff_ = byteString;
            this.nfcSleepErr_ = 0;
            this.fullyChargedNeedTime_ = 0;
            this.remainingBatteryTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEBasicData sEBasicData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEBasicData);
        }

        public static SEBasicData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEBasicData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBasicData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBasicData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEBasicData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEBasicData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEBasicData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEBasicData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEBasicData parseFrom(InputStream inputStream) {
            return (SEBasicData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEBasicData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBasicData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBasicData parseFrom(CodedInputStream codedInputStream) {
            return (SEBasicData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEBasicData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBasicData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SEBasicData() {
            this.steps_ = 0;
            this.calories_ = 0;
            this.distance_ = 0;
            this.heartRate_ = 0;
            this.bloodOxygen_ = 0;
            this.effectiveStanding_ = 0;
            this.effectiveStandingHour_ = 0;
            this.sleepDuration_ = 0;
            this.hBAData_ = 0;
            this.activityDuration_ = 0;
            this.pressure_ = 0;
            this.todayOuraCalorieData_ = 0;
            this.todaySportCalorieData_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.nfcSleepErr_ = 0;
            this.fullyChargedNeedTime_ = 0;
            this.remainingBatteryTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.stepsData_ = byteString;
            this.distanceData_ = byteString;
            this.calorieData_ = byteString;
            this.todayOuraCalorieHourlyData_ = byteString;
            this.todaySportCalorieHourlyData_ = byteString;
            this.sarGdiff_ = byteString;
        }
    }

    public enum SEBasicDataMode implements ProtocolMessageEnum {
        BASIC_DATA_START(0),
        BASIC_DATA_STOP(1);

        public static final int BASIC_DATA_START_VALUE = 0;
        public static final int BASIC_DATA_STOP_VALUE = 1;
        private static final SEBasicDataMode[] VALUES;
        private static final Internal.EnumLiteMap<SEBasicDataMode> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEBasicDataMode$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEBasicDataMode> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEBasicDataMode findValueByNumber(int i7) {
                return SEBasicDataMode.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBasicDataMode");
            internalValueMap = new Internal.EnumLiteMap<SEBasicDataMode>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEBasicDataMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEBasicDataMode findValueByNumber(int i7) {
                    return SEBasicDataMode.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEBasicDataMode(int i7) {
            this.value = i7;
        }

        public static SEBasicDataMode forNumber(int i7) {
            if (i7 == 0) {
                return BASIC_DATA_START;
            }
            if (i7 != 1) {
                return null;
            }
            return BASIC_DATA_STOP;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(2);
        }

        public static Internal.EnumLiteMap<SEBasicDataMode> internalGetValueMap() {
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
        public static SEBasicDataMode valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEBasicDataMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface SEBasicDataOrBuilder extends MessageOrBuilder {
        int getActivityDuration();

        int getBloodOxygen();

        ByteString getCalorieData();

        int getCalories();

        DeviceProtos.SEDeviceBatteryStatus getDeviceBatteryStatus();

        DeviceProtos.SEDeviceBatteryStatusOrBuilder getDeviceBatteryStatusOrBuilder();

        DeviceProtos.SEDeviceChargingCaseStatus getDeviceChargingCaseStatus();

        DeviceProtos.SEDeviceChargingCaseStatusOrBuilder getDeviceChargingCaseStatusOrBuilder();

        int getDistance();

        ByteString getDistanceData();

        int getEffectiveStanding();

        int getEffectiveStandingHour();

        int getFullyChargedNeedTime();

        int getHBAData();

        int getHeartRate();

        int getNfcSleepErr();

        SettingMenuProtos.SEPhysiologicalCycle getPhysiologicalCycle();

        SettingMenuProtos.SEPhysiologicalCycleOrBuilder getPhysiologicalCycleOrBuilder();

        int getPressure();

        int getRemainingBatteryTime();

        ByteString getSarGdiff();

        int getSleepDuration();

        int getSteps();

        ByteString getStepsData();

        int getTodayOuraCalorieData();

        ByteString getTodayOuraCalorieHourlyData();

        int getTodaySportCalorieData();

        ByteString getTodaySportCalorieHourlyData();

        boolean hasActivityDuration();

        boolean hasBloodOxygen();

        boolean hasCalorieData();

        boolean hasCalories();

        boolean hasDeviceBatteryStatus();

        boolean hasDeviceChargingCaseStatus();

        boolean hasDistance();

        boolean hasDistanceData();

        boolean hasEffectiveStanding();

        boolean hasEffectiveStandingHour();

        boolean hasFullyChargedNeedTime();

        boolean hasHBAData();

        boolean hasHeartRate();

        boolean hasNfcSleepErr();

        boolean hasPhysiologicalCycle();

        boolean hasPressure();

        boolean hasRemainingBatteryTime();

        boolean hasSarGdiff();

        boolean hasSleepDuration();

        boolean hasSteps();

        boolean hasStepsData();

        boolean hasTodayOuraCalorieData();

        boolean hasTodayOuraCalorieHourlyData();

        boolean hasTodaySportCalorieData();

        boolean hasTodaySportCalorieHourlyData();
    }

    public enum SEFindPhoneMode implements ProtocolMessageEnum {
        FIND_START(0),
        FIND_STOP(1);

        public static final int FIND_START_VALUE = 0;
        public static final int FIND_STOP_VALUE = 1;
        private static final SEFindPhoneMode[] VALUES;
        private static final Internal.EnumLiteMap<SEFindPhoneMode> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEFindPhoneMode$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEFindPhoneMode> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEFindPhoneMode findValueByNumber(int i7) {
                return SEFindPhoneMode.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEFindPhoneMode");
            internalValueMap = new Internal.EnumLiteMap<SEFindPhoneMode>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEFindPhoneMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEFindPhoneMode findValueByNumber(int i7) {
                    return SEFindPhoneMode.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEFindPhoneMode(int i7) {
            this.value = i7;
        }

        public static SEFindPhoneMode forNumber(int i7) {
            if (i7 == 0) {
                return FIND_START;
            }
            if (i7 != 1) {
                return null;
            }
            return FIND_STOP;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEFindPhoneMode> internalGetValueMap() {
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
        public static SEFindPhoneMode valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEFindPhoneMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEFunctionTag implements ProtocolMessageEnum {
        FUNCTION_SPORT_WORKOUTS(0),
        FUNCTION_SPORT_RECORD(1),
        FUNCTION_ACTIVITY(2),
        FUNCTION_HEART_RATE(3),
        FUNCTION_SLEEP(4),
        FUNCTION_SPO2(5),
        FUNCTION_ALARM(6),
        FUNCTION_REMINDERS(7),
        FUNCTION_STOPWATCH(8),
        FUNCTION_TIMER(9),
        FUNCTION_MUSIC(10),
        FUNCTION_WEATHER(11),
        FUNCTION_BREATHE(12),
        FUNCTION_NOTIFICATION(13),
        FUNCTION_FIND_PHONE(14),
        FUNCTION_SETTINGS(15),
        FUNCTION_MENSTRUAL_CYCLE(16),
        FUNCTION_STRESS(17),
        FUNCTION_WORLD_CLOCK(18),
        FUNCTION_STOCKS(19),
        FUNCTION_AIR_PRESSURE(20),
        FUNCTION_COMPASS(21),
        FUNCTION_ECG(22),
        FUNCTION_TEMPERATURE(23),
        FUNCTION_PHONE(24),
        FUNCTION_CONTACTS(25),
        FUNCTION_FREQUENT_CONTACTS(26),
        FUNCTION_PHOTOGRAGH(27),
        FUNCTION_ALIPAY(28),
        FUNCTION_QR_CODE_DOWNLOAD(29),
        FUNCTION_DIAIPAD(30),
        FUNCTION_CALL_RECORDS(31),
        FUNCTION_QUICK_CARD(32);

        public static final int FUNCTION_ACTIVITY_VALUE = 2;
        public static final int FUNCTION_AIR_PRESSURE_VALUE = 20;
        public static final int FUNCTION_ALARM_VALUE = 6;
        public static final int FUNCTION_ALIPAY_VALUE = 28;
        public static final int FUNCTION_BREATHE_VALUE = 12;
        public static final int FUNCTION_CALL_RECORDS_VALUE = 31;
        public static final int FUNCTION_COMPASS_VALUE = 21;
        public static final int FUNCTION_CONTACTS_VALUE = 25;
        public static final int FUNCTION_DIAIPAD_VALUE = 30;
        public static final int FUNCTION_ECG_VALUE = 22;
        public static final int FUNCTION_FIND_PHONE_VALUE = 14;
        public static final int FUNCTION_FREQUENT_CONTACTS_VALUE = 26;
        public static final int FUNCTION_HEART_RATE_VALUE = 3;
        public static final int FUNCTION_MENSTRUAL_CYCLE_VALUE = 16;
        public static final int FUNCTION_MUSIC_VALUE = 10;
        public static final int FUNCTION_NOTIFICATION_VALUE = 13;
        public static final int FUNCTION_PHONE_VALUE = 24;
        public static final int FUNCTION_PHOTOGRAGH_VALUE = 27;
        public static final int FUNCTION_QR_CODE_DOWNLOAD_VALUE = 29;
        public static final int FUNCTION_QUICK_CARD_VALUE = 32;
        public static final int FUNCTION_REMINDERS_VALUE = 7;
        public static final int FUNCTION_SETTINGS_VALUE = 15;
        public static final int FUNCTION_SLEEP_VALUE = 4;
        public static final int FUNCTION_SPO2_VALUE = 5;
        public static final int FUNCTION_SPORT_RECORD_VALUE = 1;
        public static final int FUNCTION_SPORT_WORKOUTS_VALUE = 0;
        public static final int FUNCTION_STOCKS_VALUE = 19;
        public static final int FUNCTION_STOPWATCH_VALUE = 8;
        public static final int FUNCTION_STRESS_VALUE = 17;
        public static final int FUNCTION_TEMPERATURE_VALUE = 23;
        public static final int FUNCTION_TIMER_VALUE = 9;
        public static final int FUNCTION_WEATHER_VALUE = 11;
        public static final int FUNCTION_WORLD_CLOCK_VALUE = 18;
        private static final SEFunctionTag[] VALUES;
        private static final Internal.EnumLiteMap<SEFunctionTag> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEFunctionTag$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEFunctionTag> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEFunctionTag findValueByNumber(int i7) {
                return SEFunctionTag.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEFunctionTag");
            internalValueMap = new Internal.EnumLiteMap<SEFunctionTag>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEFunctionTag.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEFunctionTag findValueByNumber(int i7) {
                    return SEFunctionTag.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEFunctionTag(int i7) {
            this.value = i7;
        }

        public static SEFunctionTag forNumber(int i7) {
            switch (i7) {
                case 0:
                    return FUNCTION_SPORT_WORKOUTS;
                case 1:
                    return FUNCTION_SPORT_RECORD;
                case 2:
                    return FUNCTION_ACTIVITY;
                case 3:
                    return FUNCTION_HEART_RATE;
                case 4:
                    return FUNCTION_SLEEP;
                case 5:
                    return FUNCTION_SPO2;
                case 6:
                    return FUNCTION_ALARM;
                case 7:
                    return FUNCTION_REMINDERS;
                case 8:
                    return FUNCTION_STOPWATCH;
                case 9:
                    return FUNCTION_TIMER;
                case 10:
                    return FUNCTION_MUSIC;
                case 11:
                    return FUNCTION_WEATHER;
                case 12:
                    return FUNCTION_BREATHE;
                case 13:
                    return FUNCTION_NOTIFICATION;
                case 14:
                    return FUNCTION_FIND_PHONE;
                case 15:
                    return FUNCTION_SETTINGS;
                case 16:
                    return FUNCTION_MENSTRUAL_CYCLE;
                case 17:
                    return FUNCTION_STRESS;
                case 18:
                    return FUNCTION_WORLD_CLOCK;
                case 19:
                    return FUNCTION_STOCKS;
                case 20:
                    return FUNCTION_AIR_PRESSURE;
                case 21:
                    return FUNCTION_COMPASS;
                case 22:
                    return FUNCTION_ECG;
                case 23:
                    return FUNCTION_TEMPERATURE;
                case 24:
                    return FUNCTION_PHONE;
                case 25:
                    return FUNCTION_CONTACTS;
                case 26:
                    return FUNCTION_FREQUENT_CONTACTS;
                case 27:
                    return FUNCTION_PHOTOGRAGH;
                case 28:
                    return FUNCTION_ALIPAY;
                case 29:
                    return FUNCTION_QR_CODE_DOWNLOAD;
                case 30:
                    return FUNCTION_DIAIPAD;
                case 31:
                    return FUNCTION_CALL_RECORDS;
                case 32:
                    return FUNCTION_QUICK_CARD;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(3);
        }

        public static Internal.EnumLiteMap<SEFunctionTag> internalGetValueMap() {
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
        public static SEFunctionTag valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEFunctionTag valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEIncalidSleepReason implements ProtocolMessageEnum {
        SEINCALIDSLEEPREASON_ELEVATE_HEART_RATE(1),
        SEINCALIDSLEEPREASON_ACTIVITY_AWAKE(2),
        SEINCALIDSLEEPREASON_ONE_AND_TWO(3),
        SEINCALIDSLEEPREASON_SLEEP_DURATION_SHORT(4),
        SEINCALIDSLEEPREASON_ONE_FOUR(5),
        SEINCALIDSLEEPREASON_TWO_FOUR(6),
        SEINCALIDSLEEPREASON_ONE_TWO_FOUR(7);

        public static final int SEINCALIDSLEEPREASON_ACTIVITY_AWAKE_VALUE = 2;
        public static final int SEINCALIDSLEEPREASON_ELEVATE_HEART_RATE_VALUE = 1;
        public static final int SEINCALIDSLEEPREASON_ONE_AND_TWO_VALUE = 3;
        public static final int SEINCALIDSLEEPREASON_ONE_FOUR_VALUE = 5;
        public static final int SEINCALIDSLEEPREASON_ONE_TWO_FOUR_VALUE = 7;
        public static final int SEINCALIDSLEEPREASON_SLEEP_DURATION_SHORT_VALUE = 4;
        public static final int SEINCALIDSLEEPREASON_TWO_FOUR_VALUE = 6;
        private static final SEIncalidSleepReason[] VALUES;
        private static final Internal.EnumLiteMap<SEIncalidSleepReason> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEIncalidSleepReason$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEIncalidSleepReason> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEIncalidSleepReason findValueByNumber(int i7) {
                return SEIncalidSleepReason.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEIncalidSleepReason");
            internalValueMap = new Internal.EnumLiteMap<SEIncalidSleepReason>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEIncalidSleepReason.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEIncalidSleepReason findValueByNumber(int i7) {
                    return SEIncalidSleepReason.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEIncalidSleepReason(int i7) {
            this.value = i7;
        }

        public static SEIncalidSleepReason forNumber(int i7) {
            switch (i7) {
                case 1:
                    return SEINCALIDSLEEPREASON_ELEVATE_HEART_RATE;
                case 2:
                    return SEINCALIDSLEEPREASON_ACTIVITY_AWAKE;
                case 3:
                    return SEINCALIDSLEEPREASON_ONE_AND_TWO;
                case 4:
                    return SEINCALIDSLEEPREASON_SLEEP_DURATION_SHORT;
                case 5:
                    return SEINCALIDSLEEPREASON_ONE_FOUR;
                case 6:
                    return SEINCALIDSLEEPREASON_TWO_FOUR;
                case 7:
                    return SEINCALIDSLEEPREASON_ONE_TWO_FOUR;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(10);
        }

        public static Internal.EnumLiteMap<SEIncalidSleepReason> internalGetValueMap() {
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
        public static SEIncalidSleepReason valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEIncalidSleepReason valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEMicroFunction extends GeneratedMessage implements SEMicroFunctionOrBuilder {
        public static final int APPLICATION_LIST_FIELD_NUMBER = 6;
        public static final int BASIC_DATA_FIELD_NUMBER = 4;
        public static final int BASIC_DATA_MODE_FIELD_NUMBER = 3;
        private static final SEMicroFunction DEFAULT_INSTANCE;
        public static final int FIND_PHONE_MODE_FIELD_NUMBER = 1;
        public static final int INQUIRY_WEARING_STATUS_FIELD_NUMBER = 12;
        public static final int NFC_SLEEP_ERR_FIELD_NUMBER = 11;
        private static final Parser<SEMicroFunction> PARSER;
        public static final int PHOTOGRAPH_MODE_FIELD_NUMBER = 2;
        public static final int QUICK_WIDGET_LIST_FIELD_NUMBER = 7;
        public static final int REQUEST_WEARING_RESULT_FIELD_NUMBER = 13;
        public static final int SAR_CALIBRATION_FIELD_NUMBER = 15;
        public static final int SLEEP_STATUS_FIELD_NUMBER = 14;
        public static final int SPORT_ICON_INFOWEAR_LIST_FIELD_NUMBER = 10;
        public static final int SPORT_ICON_LIST_FIELD_NUMBER = 8;
        public static final int SPORT_OTHER_LIST_FIELD_NUMBER = 9;
        public static final int WIDGET_LIST_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEMicroFunction$1 */
        public class AnonymousClass1 extends AbstractParser<SEMicroFunction> {
            @Override // com.google.protobuf.Parser
            public SEMicroFunction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEMicroFunction.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEMicroFunctionOrBuilder {
            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> applicationListBuilder_;
            private SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> basicDataBuilder_;
            private int bitField0_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> quickWidgetListBuilder_;
            private SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> sarCalibrationBuilder_;
            private SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> sleepStatusBuilder_;
            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> sportIconInfowearListBuilder_;
            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> sportIconListBuilder_;
            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> sportOtherListBuilder_;
            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> widgetListBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, h hVar) {
                this(builderParent);
            }

            private void buildPartial0(SEMicroFunction sEMicroFunction) {
            }

            private void buildPartialOneofs(SEMicroFunction sEMicroFunction) {
                SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder6;
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder7;
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder8;
                SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> singleFieldBuilder9;
                int i7 = this.payloadCase_;
                sEMicroFunction.payloadCase_ = i7;
                sEMicroFunction.payload_ = this.payload_;
                if (i7 == 4 && (singleFieldBuilder9 = this.basicDataBuilder_) != null) {
                    sEMicroFunction.payload_ = singleFieldBuilder9.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder8 = this.widgetListBuilder_) != null) {
                    sEMicroFunction.payload_ = singleFieldBuilder8.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder7 = this.applicationListBuilder_) != null) {
                    sEMicroFunction.payload_ = singleFieldBuilder7.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder6 = this.quickWidgetListBuilder_) != null) {
                    sEMicroFunction.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 8 && (singleFieldBuilder5 = this.sportIconListBuilder_) != null) {
                    sEMicroFunction.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 9 && (singleFieldBuilder4 = this.sportOtherListBuilder_) != null) {
                    sEMicroFunction.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 10 && (singleFieldBuilder3 = this.sportIconInfowearListBuilder_) != null) {
                    sEMicroFunction.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 14 && (singleFieldBuilder2 = this.sleepStatusBuilder_) != null) {
                    sEMicroFunction.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 15 || (singleFieldBuilder = this.sarCalibrationBuilder_) == null) {
                    return;
                }
                sEMicroFunction.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MicroFunctionProtos.internal_static_SEMicroFunction_descriptor;
            }

            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> internalGetApplicationListFieldBuilder() {
                if (this.applicationListBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SEWidget.SEList.getDefaultInstance();
                    }
                    this.applicationListBuilder_ = new SingleFieldBuilder<>((SEWidget.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.applicationListBuilder_;
            }

            private SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> internalGetBasicDataFieldBuilder() {
                if (this.basicDataBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = SEBasicData.getDefaultInstance();
                    }
                    this.basicDataBuilder_ = new SingleFieldBuilder<>((SEBasicData) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.basicDataBuilder_;
            }

            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> internalGetQuickWidgetListFieldBuilder() {
                if (this.quickWidgetListBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SEWidget.SEList.getDefaultInstance();
                    }
                    this.quickWidgetListBuilder_ = new SingleFieldBuilder<>((SEWidget.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.quickWidgetListBuilder_;
            }

            private SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> internalGetSarCalibrationFieldBuilder() {
                if (this.sarCalibrationBuilder_ == null) {
                    if (this.payloadCase_ != 15) {
                        this.payload_ = SESarCalibration.getDefaultInstance();
                    }
                    this.sarCalibrationBuilder_ = new SingleFieldBuilder<>((SESarCalibration) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 15;
                onChanged();
                return this.sarCalibrationBuilder_;
            }

            private SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> internalGetSleepStatusFieldBuilder() {
                if (this.sleepStatusBuilder_ == null) {
                    if (this.payloadCase_ != 14) {
                        this.payload_ = SESleepStatus.getDefaultInstance();
                    }
                    this.sleepStatusBuilder_ = new SingleFieldBuilder<>((SESleepStatus) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 14;
                onChanged();
                return this.sleepStatusBuilder_;
            }

            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> internalGetSportIconInfowearListFieldBuilder() {
                if (this.sportIconInfowearListBuilder_ == null) {
                    if (this.payloadCase_ != 10) {
                        this.payload_ = SEWidget.SEList.getDefaultInstance();
                    }
                    this.sportIconInfowearListBuilder_ = new SingleFieldBuilder<>((SEWidget.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 10;
                onChanged();
                return this.sportIconInfowearListBuilder_;
            }

            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> internalGetSportIconListFieldBuilder() {
                if (this.sportIconListBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SEWidget.SEList.getDefaultInstance();
                    }
                    this.sportIconListBuilder_ = new SingleFieldBuilder<>((SEWidget.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.sportIconListBuilder_;
            }

            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> internalGetSportOtherListFieldBuilder() {
                if (this.sportOtherListBuilder_ == null) {
                    if (this.payloadCase_ != 9) {
                        this.payload_ = SEWidget.SEList.getDefaultInstance();
                    }
                    this.sportOtherListBuilder_ = new SingleFieldBuilder<>((SEWidget.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 9;
                onChanged();
                return this.sportOtherListBuilder_;
            }

            private SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> internalGetWidgetListFieldBuilder() {
                if (this.widgetListBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SEWidget.SEList.getDefaultInstance();
                    }
                    this.widgetListBuilder_ = new SingleFieldBuilder<>((SEWidget.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.widgetListBuilder_;
            }

            public Builder clearApplicationList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.applicationListBuilder_;
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

            public Builder clearBasicData() {
                SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> singleFieldBuilder = this.basicDataBuilder_;
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

            public Builder clearBasicDataMode() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearFindPhoneMode() {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearInquiryWearingStatus() {
                if (this.payloadCase_ == 12) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearNfcSleepErr() {
                if (this.payloadCase_ == 11) {
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

            public Builder clearPhotographMode() {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearQuickWidgetList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.quickWidgetListBuilder_;
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

            public Builder clearRequestWearingResult() {
                if (this.payloadCase_ == 13) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearSarCalibration() {
                SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> singleFieldBuilder = this.sarCalibrationBuilder_;
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

            public Builder clearSleepStatus() {
                SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> singleFieldBuilder = this.sleepStatusBuilder_;
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

            public Builder clearSportIconInfowearList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconInfowearListBuilder_;
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

            public Builder clearSportIconList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconListBuilder_;
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

            public Builder clearSportOtherList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportOtherListBuilder_;
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

            public Builder clearWidgetList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.widgetListBuilder_;
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

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEList getApplicationList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.applicationListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : this.payloadCase_ == 6 ? (SEWidget.SEList) singleFieldBuilder.getMessage() : SEWidget.SEList.getDefaultInstance();
            }

            public SEWidget.SEList.Builder getApplicationListBuilder() {
                return (SEWidget.SEList.Builder) internalGetApplicationListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEListOrBuilder getApplicationListOrBuilder() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.applicationListBuilder_) == null) ? i7 == 6 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : (SEWidget.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEBasicData getBasicData() {
                SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> singleFieldBuilder = this.basicDataBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (SEBasicData) this.payload_ : SEBasicData.getDefaultInstance() : this.payloadCase_ == 4 ? (SEBasicData) singleFieldBuilder.getMessage() : SEBasicData.getDefaultInstance();
            }

            public SEBasicData.Builder getBasicDataBuilder() {
                return (SEBasicData.Builder) internalGetBasicDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEBasicDataMode getBasicDataMode() {
                SEBasicDataMode sEBasicDataModeForNumber;
                return (this.payloadCase_ != 3 || (sEBasicDataModeForNumber = SEBasicDataMode.forNumber(((Integer) this.payload_).intValue())) == null) ? SEBasicDataMode.BASIC_DATA_START : sEBasicDataModeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEBasicDataOrBuilder getBasicDataOrBuilder() {
                SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.basicDataBuilder_) == null) ? i7 == 4 ? (SEBasicData) this.payload_ : SEBasicData.getDefaultInstance() : (SEBasicDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MicroFunctionProtos.internal_static_SEMicroFunction_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEFindPhoneMode getFindPhoneMode() {
                SEFindPhoneMode sEFindPhoneModeForNumber;
                return (this.payloadCase_ != 1 || (sEFindPhoneModeForNumber = SEFindPhoneMode.forNumber(((Integer) this.payload_).intValue())) == null) ? SEFindPhoneMode.FIND_START : sEFindPhoneModeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public int getInquiryWearingStatus() {
                if (this.payloadCase_ == 12) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public int getNfcSleepErr() {
                if (this.payloadCase_ == 11) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEPhotographMode getPhotographMode() {
                SEPhotographMode sEPhotographModeForNumber;
                return (this.payloadCase_ != 2 || (sEPhotographModeForNumber = SEPhotographMode.forNumber(((Integer) this.payload_).intValue())) == null) ? SEPhotographMode.PHOTOGRAPH_START : sEPhotographModeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEList getQuickWidgetList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.quickWidgetListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : this.payloadCase_ == 7 ? (SEWidget.SEList) singleFieldBuilder.getMessage() : SEWidget.SEList.getDefaultInstance();
            }

            public SEWidget.SEList.Builder getQuickWidgetListBuilder() {
                return (SEWidget.SEList.Builder) internalGetQuickWidgetListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEListOrBuilder getQuickWidgetListOrBuilder() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.quickWidgetListBuilder_) == null) ? i7 == 7 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : (SEWidget.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public int getRequestWearingResult() {
                if (this.payloadCase_ == 13) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SESarCalibration getSarCalibration() {
                SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> singleFieldBuilder = this.sarCalibrationBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 15 ? (SESarCalibration) this.payload_ : SESarCalibration.getDefaultInstance() : this.payloadCase_ == 15 ? (SESarCalibration) singleFieldBuilder.getMessage() : SESarCalibration.getDefaultInstance();
            }

            public SESarCalibration.Builder getSarCalibrationBuilder() {
                return (SESarCalibration.Builder) internalGetSarCalibrationFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SESarCalibrationOrBuilder getSarCalibrationOrBuilder() {
                SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 15 || (singleFieldBuilder = this.sarCalibrationBuilder_) == null) ? i7 == 15 ? (SESarCalibration) this.payload_ : SESarCalibration.getDefaultInstance() : (SESarCalibrationOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SESleepStatus getSleepStatus() {
                SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> singleFieldBuilder = this.sleepStatusBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 14 ? (SESleepStatus) this.payload_ : SESleepStatus.getDefaultInstance() : this.payloadCase_ == 14 ? (SESleepStatus) singleFieldBuilder.getMessage() : SESleepStatus.getDefaultInstance();
            }

            public SESleepStatus.Builder getSleepStatusBuilder() {
                return (SESleepStatus.Builder) internalGetSleepStatusFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SESleepStatusOrBuilder getSleepStatusOrBuilder() {
                SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 14 || (singleFieldBuilder = this.sleepStatusBuilder_) == null) ? i7 == 14 ? (SESleepStatus) this.payload_ : SESleepStatus.getDefaultInstance() : (SESleepStatusOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEList getSportIconInfowearList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconInfowearListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 10 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : this.payloadCase_ == 10 ? (SEWidget.SEList) singleFieldBuilder.getMessage() : SEWidget.SEList.getDefaultInstance();
            }

            public SEWidget.SEList.Builder getSportIconInfowearListBuilder() {
                return (SEWidget.SEList.Builder) internalGetSportIconInfowearListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEListOrBuilder getSportIconInfowearListOrBuilder() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 10 || (singleFieldBuilder = this.sportIconInfowearListBuilder_) == null) ? i7 == 10 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : (SEWidget.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEList getSportIconList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : this.payloadCase_ == 8 ? (SEWidget.SEList) singleFieldBuilder.getMessage() : SEWidget.SEList.getDefaultInstance();
            }

            public SEWidget.SEList.Builder getSportIconListBuilder() {
                return (SEWidget.SEList.Builder) internalGetSportIconListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEListOrBuilder getSportIconListOrBuilder() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.sportIconListBuilder_) == null) ? i7 == 8 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : (SEWidget.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEList getSportOtherList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportOtherListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 9 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : this.payloadCase_ == 9 ? (SEWidget.SEList) singleFieldBuilder.getMessage() : SEWidget.SEList.getDefaultInstance();
            }

            public SEWidget.SEList.Builder getSportOtherListBuilder() {
                return (SEWidget.SEList.Builder) internalGetSportOtherListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEListOrBuilder getSportOtherListOrBuilder() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilder = this.sportOtherListBuilder_) == null) ? i7 == 9 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : (SEWidget.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEList getWidgetList() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.widgetListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : this.payloadCase_ == 5 ? (SEWidget.SEList) singleFieldBuilder.getMessage() : SEWidget.SEList.getDefaultInstance();
            }

            public SEWidget.SEList.Builder getWidgetListBuilder() {
                return (SEWidget.SEList.Builder) internalGetWidgetListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public SEWidget.SEListOrBuilder getWidgetListOrBuilder() {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.widgetListBuilder_) == null) ? i7 == 5 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance() : (SEWidget.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasApplicationList() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasBasicData() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasBasicDataMode() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasFindPhoneMode() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasInquiryWearingStatus() {
                return this.payloadCase_ == 12;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasNfcSleepErr() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasPhotographMode() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasQuickWidgetList() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasRequestWearingResult() {
                return this.payloadCase_ == 13;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasSarCalibration() {
                return this.payloadCase_ == 15;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasSleepStatus() {
                return this.payloadCase_ == 14;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasSportIconInfowearList() {
                return this.payloadCase_ == 10;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasSportIconList() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasSportOtherList() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
            public boolean hasWidgetList() {
                return this.payloadCase_ == 5;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return MicroFunctionProtos.internal_static_SEMicroFunction_fieldAccessorTable.ensureFieldAccessorsInitialized(SEMicroFunction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasBasicData() && !getBasicData().isInitialized()) {
                    return false;
                }
                if (hasWidgetList() && !getWidgetList().isInitialized()) {
                    return false;
                }
                if (hasApplicationList() && !getApplicationList().isInitialized()) {
                    return false;
                }
                if (hasQuickWidgetList() && !getQuickWidgetList().isInitialized()) {
                    return false;
                }
                if (hasSportIconList() && !getSportIconList().isInitialized()) {
                    return false;
                }
                if (hasSportOtherList() && !getSportOtherList().isInitialized()) {
                    return false;
                }
                if (hasSportIconInfowearList() && !getSportIconInfowearList().isInitialized()) {
                    return false;
                }
                if (!hasSleepStatus() || getSleepStatus().isInitialized()) {
                    return !hasSarCalibration() || getSarCalibration().isInitialized();
                }
                return false;
            }

            public Builder mergeApplicationList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.applicationListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SEWidget.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEWidget.SEList.newBuilder((SEWidget.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeBasicData(SEBasicData sEBasicData) {
                SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> singleFieldBuilder = this.basicDataBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == SEBasicData.getDefaultInstance()) {
                        this.payload_ = sEBasicData;
                    } else {
                        this.payload_ = SEBasicData.newBuilder((SEBasicData) this.payload_).mergeFrom(sEBasicData).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(sEBasicData);
                } else {
                    singleFieldBuilder.setMessage(sEBasicData);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeQuickWidgetList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.quickWidgetListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SEWidget.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEWidget.SEList.newBuilder((SEWidget.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeSarCalibration(SESarCalibration sESarCalibration) {
                SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> singleFieldBuilder = this.sarCalibrationBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 15 || this.payload_ == SESarCalibration.getDefaultInstance()) {
                        this.payload_ = sESarCalibration;
                    } else {
                        this.payload_ = SESarCalibration.newBuilder((SESarCalibration) this.payload_).mergeFrom(sESarCalibration).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 15) {
                    singleFieldBuilder.mergeFrom(sESarCalibration);
                } else {
                    singleFieldBuilder.setMessage(sESarCalibration);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder mergeSleepStatus(SESleepStatus sESleepStatus) {
                SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> singleFieldBuilder = this.sleepStatusBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 14 || this.payload_ == SESleepStatus.getDefaultInstance()) {
                        this.payload_ = sESleepStatus;
                    } else {
                        this.payload_ = SESleepStatus.newBuilder((SESleepStatus) this.payload_).mergeFrom(sESleepStatus).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 14) {
                    singleFieldBuilder.mergeFrom(sESleepStatus);
                } else {
                    singleFieldBuilder.setMessage(sESleepStatus);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder mergeSportIconInfowearList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconInfowearListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 10 || this.payload_ == SEWidget.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEWidget.SEList.newBuilder((SEWidget.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 10) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder mergeSportIconList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SEWidget.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEWidget.SEList.newBuilder((SEWidget.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeSportOtherList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportOtherListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 9 || this.payload_ == SEWidget.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEWidget.SEList.newBuilder((SEWidget.SEList) this.payload_).mergeFrom(sEList).buildPartial();
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

            public Builder mergeWidgetList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.widgetListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SEWidget.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEWidget.SEList.newBuilder((SEWidget.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setApplicationList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.applicationListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setBasicData(SEBasicData sEBasicData) {
                SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> singleFieldBuilder = this.basicDataBuilder_;
                if (singleFieldBuilder == null) {
                    sEBasicData.getClass();
                    this.payload_ = sEBasicData;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEBasicData);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setBasicDataMode(SEBasicDataMode sEBasicDataMode) {
                sEBasicDataMode.getClass();
                this.payloadCase_ = 3;
                this.payload_ = Integer.valueOf(sEBasicDataMode.getNumber());
                onChanged();
                return this;
            }

            public Builder setFindPhoneMode(SEFindPhoneMode sEFindPhoneMode) {
                sEFindPhoneMode.getClass();
                this.payloadCase_ = 1;
                this.payload_ = Integer.valueOf(sEFindPhoneMode.getNumber());
                onChanged();
                return this;
            }

            public Builder setInquiryWearingStatus(int i7) {
                this.payloadCase_ = 12;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
                return this;
            }

            public Builder setNfcSleepErr(int i7) {
                this.payloadCase_ = 11;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
                return this;
            }

            public Builder setPhotographMode(SEPhotographMode sEPhotographMode) {
                sEPhotographMode.getClass();
                this.payloadCase_ = 2;
                this.payload_ = Integer.valueOf(sEPhotographMode.getNumber());
                onChanged();
                return this;
            }

            public Builder setQuickWidgetList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.quickWidgetListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setRequestWearingResult(int i7) {
                this.payloadCase_ = 13;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
                return this;
            }

            public Builder setSarCalibration(SESarCalibration sESarCalibration) {
                SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> singleFieldBuilder = this.sarCalibrationBuilder_;
                if (singleFieldBuilder == null) {
                    sESarCalibration.getClass();
                    this.payload_ = sESarCalibration;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESarCalibration);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setSleepStatus(SESleepStatus sESleepStatus) {
                SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> singleFieldBuilder = this.sleepStatusBuilder_;
                if (singleFieldBuilder == null) {
                    sESleepStatus.getClass();
                    this.payload_ = sESleepStatus;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESleepStatus);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setSportIconInfowearList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconInfowearListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setSportIconList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setSportOtherList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportOtherListBuilder_;
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

            public Builder setWidgetList(SEWidget.SEList sEList) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.widgetListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public /* synthetic */ Builder(h hVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEMicroFunction build() {
                SEMicroFunction sEMicroFunctionBuildPartial = buildPartial();
                if (sEMicroFunctionBuildPartial.isInitialized()) {
                    return sEMicroFunctionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEMicroFunctionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEMicroFunction buildPartial() {
                SEMicroFunction sEMicroFunction = new SEMicroFunction(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEMicroFunction);
                }
                buildPartialOneofs(sEMicroFunction);
                onBuilt();
                return sEMicroFunction;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEMicroFunction getDefaultInstanceForType() {
                return SEMicroFunction.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> singleFieldBuilder = this.basicDataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder2 = this.widgetListBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder3 = this.applicationListBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder4 = this.quickWidgetListBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder5 = this.sportIconListBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder6 = this.sportOtherListBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder7 = this.sportIconInfowearListBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.clear();
                }
                SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> singleFieldBuilder8 = this.sleepStatusBuilder_;
                if (singleFieldBuilder8 != null) {
                    singleFieldBuilder8.clear();
                }
                SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> singleFieldBuilder9 = this.sarCalibrationBuilder_;
                if (singleFieldBuilder9 != null) {
                    singleFieldBuilder9.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEMicroFunction) {
                    return mergeFrom((SEMicroFunction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setApplicationList(SEWidget.SEList.Builder builder) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.applicationListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setBasicData(SEBasicData.Builder builder) {
                SingleFieldBuilder<SEBasicData, SEBasicData.Builder, SEBasicDataOrBuilder> singleFieldBuilder = this.basicDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setQuickWidgetList(SEWidget.SEList.Builder builder) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.quickWidgetListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setSarCalibration(SESarCalibration.Builder builder) {
                SingleFieldBuilder<SESarCalibration, SESarCalibration.Builder, SESarCalibrationOrBuilder> singleFieldBuilder = this.sarCalibrationBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setSleepStatus(SESleepStatus.Builder builder) {
                SingleFieldBuilder<SESleepStatus, SESleepStatus.Builder, SESleepStatusOrBuilder> singleFieldBuilder = this.sleepStatusBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setSportIconInfowearList(SEWidget.SEList.Builder builder) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconInfowearListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setSportIconList(SEWidget.SEList.Builder builder) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportIconListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setSportOtherList(SEWidget.SEList.Builder builder) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.sportOtherListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setWidgetList(SEWidget.SEList.Builder builder) {
                SingleFieldBuilder<SEWidget.SEList, SEWidget.SEList.Builder, SEWidget.SEListOrBuilder> singleFieldBuilder = this.widgetListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeFrom(SEMicroFunction sEMicroFunction) {
                if (sEMicroFunction == SEMicroFunction.getDefaultInstance()) {
                    return this;
                }
                switch (sEMicroFunction.getPayloadCase()) {
                    case FIND_PHONE_MODE:
                        setFindPhoneMode(sEMicroFunction.getFindPhoneMode());
                        break;
                    case PHOTOGRAPH_MODE:
                        setPhotographMode(sEMicroFunction.getPhotographMode());
                        break;
                    case BASIC_DATA_MODE:
                        setBasicDataMode(sEMicroFunction.getBasicDataMode());
                        break;
                    case BASIC_DATA:
                        mergeBasicData(sEMicroFunction.getBasicData());
                        break;
                    case WIDGET_LIST:
                        mergeWidgetList(sEMicroFunction.getWidgetList());
                        break;
                    case APPLICATION_LIST:
                        mergeApplicationList(sEMicroFunction.getApplicationList());
                        break;
                    case QUICK_WIDGET_LIST:
                        mergeQuickWidgetList(sEMicroFunction.getQuickWidgetList());
                        break;
                    case SPORT_ICON_LIST:
                        mergeSportIconList(sEMicroFunction.getSportIconList());
                        break;
                    case SPORT_OTHER_LIST:
                        mergeSportOtherList(sEMicroFunction.getSportOtherList());
                        break;
                    case SPORT_ICON_INFOWEAR_LIST:
                        mergeSportIconInfowearList(sEMicroFunction.getSportIconInfowearList());
                        break;
                    case NFC_SLEEP_ERR:
                        setNfcSleepErr(sEMicroFunction.getNfcSleepErr());
                        break;
                    case INQUIRY_WEARING_STATUS:
                        setInquiryWearingStatus(sEMicroFunction.getInquiryWearingStatus());
                        break;
                    case REQUEST_WEARING_RESULT:
                        setRequestWearingResult(sEMicroFunction.getRequestWearingResult());
                        break;
                    case SLEEP_STATUS:
                        mergeSleepStatus(sEMicroFunction.getSleepStatus());
                        break;
                    case SAR_CALIBRATION:
                        mergeSarCalibration(sEMicroFunction.getSarCalibration());
                        break;
                }
                mergeUnknownFields(sEMicroFunction.getUnknownFields());
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
                                    if (SEFindPhoneMode.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.payloadCase_ = 1;
                                        this.payload_ = Integer.valueOf(i7);
                                    }
                                    break;
                                case 16:
                                    int i8 = codedInputStream.readEnum();
                                    if (SEPhotographMode.forNumber(i8) == null) {
                                        mergeUnknownVarintField(2, i8);
                                    } else {
                                        this.payloadCase_ = 2;
                                        this.payload_ = Integer.valueOf(i8);
                                    }
                                    break;
                                case 24:
                                    int i9 = codedInputStream.readEnum();
                                    if (SEBasicDataMode.forNumber(i9) == null) {
                                        mergeUnknownVarintField(3, i9);
                                    } else {
                                        this.payloadCase_ = 3;
                                        this.payload_ = Integer.valueOf(i9);
                                    }
                                    break;
                                case 34:
                                    codedInputStream.readMessage(internalGetBasicDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                    break;
                                case 42:
                                    codedInputStream.readMessage(internalGetWidgetListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                    break;
                                case 50:
                                    codedInputStream.readMessage(internalGetApplicationListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                    break;
                                case 58:
                                    codedInputStream.readMessage(internalGetQuickWidgetListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                    break;
                                case 66:
                                    codedInputStream.readMessage(internalGetSportIconListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 8;
                                    break;
                                case 74:
                                    codedInputStream.readMessage(internalGetSportOtherListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 9;
                                    break;
                                case 82:
                                    codedInputStream.readMessage(internalGetSportIconInfowearListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 10;
                                    break;
                                case 88:
                                    this.payload_ = Integer.valueOf(codedInputStream.readUInt32());
                                    this.payloadCase_ = 11;
                                    break;
                                case 96:
                                    this.payload_ = Integer.valueOf(codedInputStream.readUInt32());
                                    this.payloadCase_ = 12;
                                    break;
                                case 104:
                                    this.payload_ = Integer.valueOf(codedInputStream.readUInt32());
                                    this.payloadCase_ = 13;
                                    break;
                                case 114:
                                    codedInputStream.readMessage(internalGetSleepStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 14;
                                    break;
                                case 122:
                                    codedInputStream.readMessage(internalGetSarCalibrationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 15;
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
            FIND_PHONE_MODE(1),
            PHOTOGRAPH_MODE(2),
            BASIC_DATA_MODE(3),
            BASIC_DATA(4),
            WIDGET_LIST(5),
            APPLICATION_LIST(6),
            QUICK_WIDGET_LIST(7),
            SPORT_ICON_LIST(8),
            SPORT_OTHER_LIST(9),
            SPORT_ICON_INFOWEAR_LIST(10),
            NFC_SLEEP_ERR(11),
            INQUIRY_WEARING_STATUS(12),
            REQUEST_WEARING_RESULT(13),
            SLEEP_STATUS(14),
            SAR_CALIBRATION(15),
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
                        return FIND_PHONE_MODE;
                    case 2:
                        return PHOTOGRAPH_MODE;
                    case 3:
                        return BASIC_DATA_MODE;
                    case 4:
                        return BASIC_DATA;
                    case 5:
                        return WIDGET_LIST;
                    case 6:
                        return APPLICATION_LIST;
                    case 7:
                        return QUICK_WIDGET_LIST;
                    case 8:
                        return SPORT_ICON_LIST;
                    case 9:
                        return SPORT_OTHER_LIST;
                    case 10:
                        return SPORT_ICON_INFOWEAR_LIST;
                    case 11:
                        return NFC_SLEEP_ERR;
                    case 12:
                        return INQUIRY_WEARING_STATUS;
                    case 13:
                        return REQUEST_WEARING_RESULT;
                    case 14:
                        return SLEEP_STATUS;
                    case 15:
                        return SAR_CALIBRATION;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEMicroFunction");
            DEFAULT_INSTANCE = new SEMicroFunction();
            PARSER = new AbstractParser<SEMicroFunction>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunction.1
                @Override // com.google.protobuf.Parser
                public SEMicroFunction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEMicroFunction.newBuilder();
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

        public /* synthetic */ SEMicroFunction(GeneratedMessage.Builder builder, h hVar) {
            this(builder);
        }

        public static SEMicroFunction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MicroFunctionProtos.internal_static_SEMicroFunction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEMicroFunction parseDelimitedFrom(InputStream inputStream) {
            return (SEMicroFunction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEMicroFunction parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEMicroFunction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEMicroFunction)) {
                return super.equals(obj);
            }
            SEMicroFunction sEMicroFunction = (SEMicroFunction) obj;
            if (!getPayloadCase().equals(sEMicroFunction.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getFindPhoneMode().equals(sEMicroFunction.getFindPhoneMode())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getPhotographMode().equals(sEMicroFunction.getPhotographMode())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getBasicDataMode().equals(sEMicroFunction.getBasicDataMode())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getBasicData().equals(sEMicroFunction.getBasicData())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getWidgetList().equals(sEMicroFunction.getWidgetList())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getApplicationList().equals(sEMicroFunction.getApplicationList())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getQuickWidgetList().equals(sEMicroFunction.getQuickWidgetList())) {
                        return false;
                    }
                    break;
                case 8:
                    if (!getSportIconList().equals(sEMicroFunction.getSportIconList())) {
                        return false;
                    }
                    break;
                case 9:
                    if (!getSportOtherList().equals(sEMicroFunction.getSportOtherList())) {
                        return false;
                    }
                    break;
                case 10:
                    if (!getSportIconInfowearList().equals(sEMicroFunction.getSportIconInfowearList())) {
                        return false;
                    }
                    break;
                case 11:
                    if (getNfcSleepErr() != sEMicroFunction.getNfcSleepErr()) {
                        return false;
                    }
                    break;
                case 12:
                    if (getInquiryWearingStatus() != sEMicroFunction.getInquiryWearingStatus()) {
                        return false;
                    }
                    break;
                case 13:
                    if (getRequestWearingResult() != sEMicroFunction.getRequestWearingResult()) {
                        return false;
                    }
                    break;
                case 14:
                    if (!getSleepStatus().equals(sEMicroFunction.getSleepStatus())) {
                        return false;
                    }
                    break;
                case 15:
                    if (!getSarCalibration().equals(sEMicroFunction.getSarCalibration())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sEMicroFunction.getUnknownFields());
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEList getApplicationList() {
            return this.payloadCase_ == 6 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEListOrBuilder getApplicationListOrBuilder() {
            return this.payloadCase_ == 6 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEBasicData getBasicData() {
            return this.payloadCase_ == 4 ? (SEBasicData) this.payload_ : SEBasicData.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEBasicDataMode getBasicDataMode() {
            SEBasicDataMode sEBasicDataModeForNumber;
            return (this.payloadCase_ != 3 || (sEBasicDataModeForNumber = SEBasicDataMode.forNumber(((Integer) this.payload_).intValue())) == null) ? SEBasicDataMode.BASIC_DATA_START : sEBasicDataModeForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEBasicDataOrBuilder getBasicDataOrBuilder() {
            return this.payloadCase_ == 4 ? (SEBasicData) this.payload_ : SEBasicData.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return MicroFunctionProtos.internal_static_SEMicroFunction_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEFindPhoneMode getFindPhoneMode() {
            SEFindPhoneMode sEFindPhoneModeForNumber;
            return (this.payloadCase_ != 1 || (sEFindPhoneModeForNumber = SEFindPhoneMode.forNumber(((Integer) this.payload_).intValue())) == null) ? SEFindPhoneMode.FIND_START : sEFindPhoneModeForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public int getInquiryWearingStatus() {
            if (this.payloadCase_ == 12) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public int getNfcSleepErr() {
            if (this.payloadCase_ == 11) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEMicroFunction> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEPhotographMode getPhotographMode() {
            SEPhotographMode sEPhotographModeForNumber;
            return (this.payloadCase_ != 2 || (sEPhotographModeForNumber = SEPhotographMode.forNumber(((Integer) this.payload_).intValue())) == null) ? SEPhotographMode.PHOTOGRAPH_START : sEPhotographModeForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEList getQuickWidgetList() {
            return this.payloadCase_ == 7 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEListOrBuilder getQuickWidgetListOrBuilder() {
            return this.payloadCase_ == 7 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public int getRequestWearingResult() {
            if (this.payloadCase_ == 13) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SESarCalibration getSarCalibration() {
            return this.payloadCase_ == 15 ? (SESarCalibration) this.payload_ : SESarCalibration.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SESarCalibrationOrBuilder getSarCalibrationOrBuilder() {
            return this.payloadCase_ == 15 ? (SESarCalibration) this.payload_ : SESarCalibration.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = this.payloadCase_ == 1 ? CodedOutputStream.computeEnumSize(1, ((Integer) this.payload_).intValue()) : 0;
            if (this.payloadCase_ == 2) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 3) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, (SEBasicData) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(6, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(7, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(8, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(9, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(10, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(11, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 12) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(12, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 13) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(13, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 14) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(14, (SESleepStatus) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(15, (SESarCalibration) this.payload_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SESleepStatus getSleepStatus() {
            return this.payloadCase_ == 14 ? (SESleepStatus) this.payload_ : SESleepStatus.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SESleepStatusOrBuilder getSleepStatusOrBuilder() {
            return this.payloadCase_ == 14 ? (SESleepStatus) this.payload_ : SESleepStatus.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEList getSportIconInfowearList() {
            return this.payloadCase_ == 10 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEListOrBuilder getSportIconInfowearListOrBuilder() {
            return this.payloadCase_ == 10 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEList getSportIconList() {
            return this.payloadCase_ == 8 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEListOrBuilder getSportIconListOrBuilder() {
            return this.payloadCase_ == 8 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEList getSportOtherList() {
            return this.payloadCase_ == 9 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEListOrBuilder getSportOtherListOrBuilder() {
            return this.payloadCase_ == 9 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEList getWidgetList() {
            return this.payloadCase_ == 5 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public SEWidget.SEListOrBuilder getWidgetListOrBuilder() {
            return this.payloadCase_ == 5 ? (SEWidget.SEList) this.payload_ : SEWidget.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasApplicationList() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasBasicData() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasBasicDataMode() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasFindPhoneMode() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasInquiryWearingStatus() {
            return this.payloadCase_ == 12;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasNfcSleepErr() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasPhotographMode() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasQuickWidgetList() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasRequestWearingResult() {
            return this.payloadCase_ == 13;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasSarCalibration() {
            return this.payloadCase_ == 15;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasSleepStatus() {
            return this.payloadCase_ == 14;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasSportIconInfowearList() {
            return this.payloadCase_ == 10;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasSportIconList() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasSportOtherList() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEMicroFunctionOrBuilder
        public boolean hasWidgetList() {
            return this.payloadCase_ == 5;
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
            switch (this.payloadCase_) {
                case 1:
                    i7 = ((iHashCode * 37) + 1) * 53;
                    number = getFindPhoneMode().getNumber();
                    break;
                case 2:
                    i7 = ((iHashCode * 37) + 2) * 53;
                    number = getPhotographMode().getNumber();
                    break;
                case 3:
                    i7 = ((iHashCode * 37) + 3) * 53;
                    number = getBasicDataMode().getNumber();
                    break;
                case 4:
                    i7 = ((iHashCode * 37) + 4) * 53;
                    number = getBasicData().hashCode();
                    break;
                case 5:
                    i7 = ((iHashCode * 37) + 5) * 53;
                    number = getWidgetList().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode * 37) + 6) * 53;
                    number = getApplicationList().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode * 37) + 7) * 53;
                    number = getQuickWidgetList().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode * 37) + 8) * 53;
                    number = getSportIconList().hashCode();
                    break;
                case 9:
                    i7 = ((iHashCode * 37) + 9) * 53;
                    number = getSportOtherList().hashCode();
                    break;
                case 10:
                    i7 = ((iHashCode * 37) + 10) * 53;
                    number = getSportIconInfowearList().hashCode();
                    break;
                case 11:
                    i7 = ((iHashCode * 37) + 11) * 53;
                    number = getNfcSleepErr();
                    break;
                case 12:
                    i7 = ((iHashCode * 37) + 12) * 53;
                    number = getInquiryWearingStatus();
                    break;
                case 13:
                    i7 = ((iHashCode * 37) + 13) * 53;
                    number = getRequestWearingResult();
                    break;
                case 14:
                    i7 = ((iHashCode * 37) + 14) * 53;
                    number = getSleepStatus().hashCode();
                    break;
                case 15:
                    i7 = ((iHashCode * 37) + 15) * 53;
                    number = getSarCalibration().hashCode();
                    break;
                default:
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
            }
            iHashCode = i7 + number;
            int iHashCode22 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode22;
            return iHashCode22;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return MicroFunctionProtos.internal_static_SEMicroFunction_fieldAccessorTable.ensureFieldAccessorsInitialized(SEMicroFunction.class, Builder.class);
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
            if (hasBasicData() && !getBasicData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasWidgetList() && !getWidgetList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasApplicationList() && !getApplicationList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasQuickWidgetList() && !getQuickWidgetList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSportIconList() && !getSportIconList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSportOtherList() && !getSportOtherList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSportIconInfowearList() && !getSportIconInfowearList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSleepStatus() && !getSleepStatus().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSarCalibration() || getSarCalibration().isInitialized()) {
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
                codedOutputStream.writeEnum(2, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeEnum(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (SEBasicData) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                codedOutputStream.writeMessage(10, (SEWidget.SEList) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeUInt32(11, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 12) {
                codedOutputStream.writeUInt32(12, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeUInt32(13, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 14) {
                codedOutputStream.writeMessage(14, (SESleepStatus) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                codedOutputStream.writeMessage(15, (SESarCalibration) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEMicroFunction(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEMicroFunction sEMicroFunction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEMicroFunction);
        }

        public static SEMicroFunction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEMicroFunction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMicroFunction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEMicroFunction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEMicroFunction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEMicroFunction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEMicroFunction() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEMicroFunction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEMicroFunction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEMicroFunction parseFrom(InputStream inputStream) {
            return (SEMicroFunction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEMicroFunction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMicroFunction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEMicroFunction parseFrom(CodedInputStream codedInputStream) {
            return (SEMicroFunction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEMicroFunction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMicroFunction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEMicroFunctionOrBuilder extends MessageOrBuilder {
        SEWidget.SEList getApplicationList();

        SEWidget.SEListOrBuilder getApplicationListOrBuilder();

        SEBasicData getBasicData();

        SEBasicDataMode getBasicDataMode();

        SEBasicDataOrBuilder getBasicDataOrBuilder();

        SEFindPhoneMode getFindPhoneMode();

        int getInquiryWearingStatus();

        int getNfcSleepErr();

        SEMicroFunction.PayloadCase getPayloadCase();

        SEPhotographMode getPhotographMode();

        SEWidget.SEList getQuickWidgetList();

        SEWidget.SEListOrBuilder getQuickWidgetListOrBuilder();

        int getRequestWearingResult();

        SESarCalibration getSarCalibration();

        SESarCalibrationOrBuilder getSarCalibrationOrBuilder();

        SESleepStatus getSleepStatus();

        SESleepStatusOrBuilder getSleepStatusOrBuilder();

        SEWidget.SEList getSportIconInfowearList();

        SEWidget.SEListOrBuilder getSportIconInfowearListOrBuilder();

        SEWidget.SEList getSportIconList();

        SEWidget.SEListOrBuilder getSportIconListOrBuilder();

        SEWidget.SEList getSportOtherList();

        SEWidget.SEListOrBuilder getSportOtherListOrBuilder();

        SEWidget.SEList getWidgetList();

        SEWidget.SEListOrBuilder getWidgetListOrBuilder();

        boolean hasApplicationList();

        boolean hasBasicData();

        boolean hasBasicDataMode();

        boolean hasFindPhoneMode();

        boolean hasInquiryWearingStatus();

        boolean hasNfcSleepErr();

        boolean hasPhotographMode();

        boolean hasQuickWidgetList();

        boolean hasRequestWearingResult();

        boolean hasSarCalibration();

        boolean hasSleepStatus();

        boolean hasSportIconInfowearList();

        boolean hasSportIconList();

        boolean hasSportOtherList();

        boolean hasWidgetList();
    }

    public enum SEOrder implements ProtocolMessageEnum {
        HEAD_RESIDENT(0),
        HIGHEST(10),
        LOWEST(241),
        RESIDENT(242);

        public static final int HEAD_RESIDENT_VALUE = 0;
        public static final int HIGHEST_VALUE = 10;
        public static final int LOWEST_VALUE = 241;
        public static final int RESIDENT_VALUE = 242;
        private static final SEOrder[] VALUES;
        private static final Internal.EnumLiteMap<SEOrder> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEOrder$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEOrder> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEOrder findValueByNumber(int i7) {
                return SEOrder.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEOrder");
            internalValueMap = new Internal.EnumLiteMap<SEOrder>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEOrder.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEOrder findValueByNumber(int i7) {
                    return SEOrder.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEOrder(int i7) {
            this.value = i7;
        }

        public static SEOrder forNumber(int i7) {
            if (i7 == 0) {
                return HEAD_RESIDENT;
            }
            if (i7 == 10) {
                return HIGHEST;
            }
            if (i7 == 241) {
                return LOWEST;
            }
            if (i7 != 242) {
                return null;
            }
            return RESIDENT;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(9);
        }

        public static Internal.EnumLiteMap<SEOrder> internalGetValueMap() {
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
        public static SEOrder valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEOrder valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEPhotographMode implements ProtocolMessageEnum {
        PHOTOGRAPH_START(0),
        PHOTOGRAPH_STOP(1),
        PHOTOGRAPHING(2);

        public static final int PHOTOGRAPHING_VALUE = 2;
        public static final int PHOTOGRAPH_START_VALUE = 0;
        public static final int PHOTOGRAPH_STOP_VALUE = 1;
        private static final SEPhotographMode[] VALUES;
        private static final Internal.EnumLiteMap<SEPhotographMode> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEPhotographMode$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEPhotographMode> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEPhotographMode findValueByNumber(int i7) {
                return SEPhotographMode.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPhotographMode");
            internalValueMap = new Internal.EnumLiteMap<SEPhotographMode>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEPhotographMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEPhotographMode findValueByNumber(int i7) {
                    return SEPhotographMode.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEPhotographMode(int i7) {
            this.value = i7;
        }

        public static SEPhotographMode forNumber(int i7) {
            if (i7 == 0) {
                return PHOTOGRAPH_START;
            }
            if (i7 == 1) {
                return PHOTOGRAPH_STOP;
            }
            if (i7 != 2) {
                return null;
            }
            return PHOTOGRAPHING;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(1);
        }

        public static Internal.EnumLiteMap<SEPhotographMode> internalGetValueMap() {
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
        public static SEPhotographMode valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEPhotographMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEQuickWidgetTag implements ProtocolMessageEnum {
        QUICKWIDGET_SPORT_WORKOUTS(0),
        QUICKWIDGET_SPORT_RECORD(1),
        QUICKWIDGET_ACTIVITY(2),
        QUICKWIDGET_HEART_RATE(3),
        QUICKWIDGET_SLEEP(4),
        QUICKWIDGET_SPO2(5),
        QUICKWIDGET_ALARM(6),
        QUICKWIDGET_REMINDERS(7),
        QUICKWIDGET_STOPWATCH(8),
        QUICKWIDGET_TIMER(9),
        QUICKWIDGET_MUSIC(10),
        QUICKWIDGET_WEATHER(11),
        QUICKWIDGET_BREATHE(12),
        QUICKWIDGET_NOTIFICATION(13),
        QUICKWIDGET_FIND_PHONE(14),
        QUICKWIDGET_SETTINGS(15),
        QUICKWIDGET_MENSTRUAL_CYCLE(16),
        QUICKWIDGET_STRESS(17),
        QUICKWIDGET_WORLD_CLOCK(18),
        QUICKWIDGET_STOCKS(19),
        QUICKWIDGET_AIR_PRESSURE(20),
        QUICKWIDGET_COMPASS(21),
        QUICKWIDGET_ECG(22),
        QUICKWIDGET_TEMPERATURE(23),
        QUICKWIDGET_PHONE(24),
        QUICKWIDGET_CONTACTS(25),
        QUICKWIDGET_FREQUENT_CONTACTS(26),
        QUICKWIDGET_PHOTOGRAGH(27),
        QUICKWIDGET_DIAIPAD(28),
        QUICKWIDGET_CALL_RECORDS(29),
        QUICKWIDGET_FLASHLIGHT(30);

        public static final int QUICKWIDGET_ACTIVITY_VALUE = 2;
        public static final int QUICKWIDGET_AIR_PRESSURE_VALUE = 20;
        public static final int QUICKWIDGET_ALARM_VALUE = 6;
        public static final int QUICKWIDGET_BREATHE_VALUE = 12;
        public static final int QUICKWIDGET_CALL_RECORDS_VALUE = 29;
        public static final int QUICKWIDGET_COMPASS_VALUE = 21;
        public static final int QUICKWIDGET_CONTACTS_VALUE = 25;
        public static final int QUICKWIDGET_DIAIPAD_VALUE = 28;
        public static final int QUICKWIDGET_ECG_VALUE = 22;
        public static final int QUICKWIDGET_FIND_PHONE_VALUE = 14;
        public static final int QUICKWIDGET_FLASHLIGHT_VALUE = 30;
        public static final int QUICKWIDGET_FREQUENT_CONTACTS_VALUE = 26;
        public static final int QUICKWIDGET_HEART_RATE_VALUE = 3;
        public static final int QUICKWIDGET_MENSTRUAL_CYCLE_VALUE = 16;
        public static final int QUICKWIDGET_MUSIC_VALUE = 10;
        public static final int QUICKWIDGET_NOTIFICATION_VALUE = 13;
        public static final int QUICKWIDGET_PHONE_VALUE = 24;
        public static final int QUICKWIDGET_PHOTOGRAGH_VALUE = 27;
        public static final int QUICKWIDGET_REMINDERS_VALUE = 7;
        public static final int QUICKWIDGET_SETTINGS_VALUE = 15;
        public static final int QUICKWIDGET_SLEEP_VALUE = 4;
        public static final int QUICKWIDGET_SPO2_VALUE = 5;
        public static final int QUICKWIDGET_SPORT_RECORD_VALUE = 1;
        public static final int QUICKWIDGET_SPORT_WORKOUTS_VALUE = 0;
        public static final int QUICKWIDGET_STOCKS_VALUE = 19;
        public static final int QUICKWIDGET_STOPWATCH_VALUE = 8;
        public static final int QUICKWIDGET_STRESS_VALUE = 17;
        public static final int QUICKWIDGET_TEMPERATURE_VALUE = 23;
        public static final int QUICKWIDGET_TIMER_VALUE = 9;
        public static final int QUICKWIDGET_WEATHER_VALUE = 11;
        public static final int QUICKWIDGET_WORLD_CLOCK_VALUE = 18;
        private static final SEQuickWidgetTag[] VALUES;
        private static final Internal.EnumLiteMap<SEQuickWidgetTag> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEQuickWidgetTag$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEQuickWidgetTag> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEQuickWidgetTag findValueByNumber(int i7) {
                return SEQuickWidgetTag.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEQuickWidgetTag");
            internalValueMap = new Internal.EnumLiteMap<SEQuickWidgetTag>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEQuickWidgetTag.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEQuickWidgetTag findValueByNumber(int i7) {
                    return SEQuickWidgetTag.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEQuickWidgetTag(int i7) {
            this.value = i7;
        }

        public static SEQuickWidgetTag forNumber(int i7) {
            switch (i7) {
                case 0:
                    return QUICKWIDGET_SPORT_WORKOUTS;
                case 1:
                    return QUICKWIDGET_SPORT_RECORD;
                case 2:
                    return QUICKWIDGET_ACTIVITY;
                case 3:
                    return QUICKWIDGET_HEART_RATE;
                case 4:
                    return QUICKWIDGET_SLEEP;
                case 5:
                    return QUICKWIDGET_SPO2;
                case 6:
                    return QUICKWIDGET_ALARM;
                case 7:
                    return QUICKWIDGET_REMINDERS;
                case 8:
                    return QUICKWIDGET_STOPWATCH;
                case 9:
                    return QUICKWIDGET_TIMER;
                case 10:
                    return QUICKWIDGET_MUSIC;
                case 11:
                    return QUICKWIDGET_WEATHER;
                case 12:
                    return QUICKWIDGET_BREATHE;
                case 13:
                    return QUICKWIDGET_NOTIFICATION;
                case 14:
                    return QUICKWIDGET_FIND_PHONE;
                case 15:
                    return QUICKWIDGET_SETTINGS;
                case 16:
                    return QUICKWIDGET_MENSTRUAL_CYCLE;
                case 17:
                    return QUICKWIDGET_STRESS;
                case 18:
                    return QUICKWIDGET_WORLD_CLOCK;
                case 19:
                    return QUICKWIDGET_STOCKS;
                case 20:
                    return QUICKWIDGET_AIR_PRESSURE;
                case 21:
                    return QUICKWIDGET_COMPASS;
                case 22:
                    return QUICKWIDGET_ECG;
                case 23:
                    return QUICKWIDGET_TEMPERATURE;
                case 24:
                    return QUICKWIDGET_PHONE;
                case 25:
                    return QUICKWIDGET_CONTACTS;
                case 26:
                    return QUICKWIDGET_FREQUENT_CONTACTS;
                case 27:
                    return QUICKWIDGET_PHOTOGRAGH;
                case 28:
                    return QUICKWIDGET_DIAIPAD;
                case 29:
                    return QUICKWIDGET_CALL_RECORDS;
                case 30:
                    return QUICKWIDGET_FLASHLIGHT;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(5);
        }

        public static Internal.EnumLiteMap<SEQuickWidgetTag> internalGetValueMap() {
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
        public static SEQuickWidgetTag valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEQuickWidgetTag valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SESarCalibration extends GeneratedMessage implements SESarCalibrationOrBuilder {
        private static final SESarCalibration DEFAULT_INSTANCE;
        private static final Parser<SESarCalibration> PARSER;
        public static final int SAR_BASEDATA_FIELD_NUMBER = 3;
        public static final int SAR_DAIFF_FIELD_NUMBER = 1;
        public static final int SAR_OFFSET_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int sarBasedata_;
        private int sarDaiff_;
        private int sarOffset_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SESarCalibration$1 */
        public class AnonymousClass1 extends AbstractParser<SESarCalibration> {
            @Override // com.google.protobuf.Parser
            public SESarCalibration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESarCalibration.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESarCalibrationOrBuilder {
            private int bitField0_;
            private int sarBasedata_;
            private int sarDaiff_;
            private int sarOffset_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, h hVar) {
                this(builderParent);
            }

            private void buildPartial0(SESarCalibration sESarCalibration) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESarCalibration.sarDaiff_ = this.sarDaiff_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sESarCalibration.sarOffset_ = this.sarOffset_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sESarCalibration.sarBasedata_ = this.sarBasedata_;
                    i7 |= 4;
                }
                sESarCalibration.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MicroFunctionProtos.internal_static_SESarCalibration_descriptor;
            }

            public Builder clearSarBasedata() {
                this.bitField0_ &= -5;
                this.sarBasedata_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSarDaiff() {
                this.bitField0_ &= -2;
                this.sarDaiff_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSarOffset() {
                this.bitField0_ &= -3;
                this.sarOffset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MicroFunctionProtos.internal_static_SESarCalibration_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
            public int getSarBasedata() {
                return this.sarBasedata_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
            public int getSarDaiff() {
                return this.sarDaiff_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
            public int getSarOffset() {
                return this.sarOffset_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
            public boolean hasSarBasedata() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
            public boolean hasSarDaiff() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
            public boolean hasSarOffset() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return MicroFunctionProtos.internal_static_SESarCalibration_fieldAccessorTable.ensureFieldAccessorsInitialized(SESarCalibration.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSarDaiff() && hasSarOffset() && hasSarBasedata();
            }

            public Builder setSarBasedata(int i7) {
                this.sarBasedata_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSarDaiff(int i7) {
                this.sarDaiff_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSarOffset(int i7) {
                this.sarOffset_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(h hVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESarCalibration build() {
                SESarCalibration sESarCalibrationBuildPartial = buildPartial();
                if (sESarCalibrationBuildPartial.isInitialized()) {
                    return sESarCalibrationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESarCalibrationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESarCalibration buildPartial() {
                SESarCalibration sESarCalibration = new SESarCalibration(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESarCalibration);
                }
                onBuilt();
                return sESarCalibration;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESarCalibration getDefaultInstanceForType() {
                return SESarCalibration.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sarDaiff_ = 0;
                this.sarOffset_ = 0;
                this.sarBasedata_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESarCalibration) {
                    return mergeFrom((SESarCalibration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SESarCalibration sESarCalibration) {
                if (sESarCalibration == SESarCalibration.getDefaultInstance()) {
                    return this;
                }
                if (sESarCalibration.hasSarDaiff()) {
                    setSarDaiff(sESarCalibration.getSarDaiff());
                }
                if (sESarCalibration.hasSarOffset()) {
                    setSarOffset(sESarCalibration.getSarOffset());
                }
                if (sESarCalibration.hasSarBasedata()) {
                    setSarBasedata(sESarCalibration.getSarBasedata());
                }
                mergeUnknownFields(sESarCalibration.getUnknownFields());
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
                                    this.sarDaiff_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.sarOffset_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.sarBasedata_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESarCalibration");
            DEFAULT_INSTANCE = new SESarCalibration();
            PARSER = new AbstractParser<SESarCalibration>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibration.1
                @Override // com.google.protobuf.Parser
                public SESarCalibration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESarCalibration.newBuilder();
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

        public /* synthetic */ SESarCalibration(GeneratedMessage.Builder builder, h hVar) {
            this(builder);
        }

        public static SESarCalibration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MicroFunctionProtos.internal_static_SESarCalibration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESarCalibration parseDelimitedFrom(InputStream inputStream) {
            return (SESarCalibration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESarCalibration parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESarCalibration> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESarCalibration)) {
                return super.equals(obj);
            }
            SESarCalibration sESarCalibration = (SESarCalibration) obj;
            if (hasSarDaiff() != sESarCalibration.hasSarDaiff()) {
                return false;
            }
            if ((hasSarDaiff() && getSarDaiff() != sESarCalibration.getSarDaiff()) || hasSarOffset() != sESarCalibration.hasSarOffset()) {
                return false;
            }
            if ((!hasSarOffset() || getSarOffset() == sESarCalibration.getSarOffset()) && hasSarBasedata() == sESarCalibration.hasSarBasedata()) {
                return (!hasSarBasedata() || getSarBasedata() == sESarCalibration.getSarBasedata()) && getUnknownFields().equals(sESarCalibration.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return MicroFunctionProtos.internal_static_SESarCalibration_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESarCalibration> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
        public int getSarBasedata() {
            return this.sarBasedata_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
        public int getSarDaiff() {
            return this.sarDaiff_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
        public int getSarOffset() {
            return this.sarOffset_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sarDaiff_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.sarOffset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.sarBasedata_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
        public boolean hasSarBasedata() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
        public boolean hasSarDaiff() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESarCalibrationOrBuilder
        public boolean hasSarOffset() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSarDaiff()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getSarDaiff();
            }
            if (hasSarOffset()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSarOffset();
            }
            if (hasSarBasedata()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getSarBasedata();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return MicroFunctionProtos.internal_static_SESarCalibration_fieldAccessorTable.ensureFieldAccessorsInitialized(SESarCalibration.class, Builder.class);
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
            if (!hasSarDaiff()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSarOffset()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSarBasedata()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sarDaiff_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.sarOffset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.sarBasedata_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESarCalibration(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.sarDaiff_ = 0;
            this.sarOffset_ = 0;
            this.sarBasedata_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESarCalibration sESarCalibration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESarCalibration);
        }

        public static SESarCalibration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESarCalibration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESarCalibration) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESarCalibration parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESarCalibration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESarCalibration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESarCalibration parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESarCalibration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SESarCalibration() {
            this.sarDaiff_ = 0;
            this.sarOffset_ = 0;
            this.sarBasedata_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SESarCalibration parseFrom(InputStream inputStream) {
            return (SESarCalibration) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESarCalibration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESarCalibration) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESarCalibration parseFrom(CodedInputStream codedInputStream) {
            return (SESarCalibration) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESarCalibration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESarCalibration) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESarCalibrationOrBuilder extends MessageOrBuilder {
        int getSarBasedata();

        int getSarDaiff();

        int getSarOffset();

        boolean hasSarBasedata();

        boolean hasSarDaiff();

        boolean hasSarOffset();
    }

    public static final class SESleepStatus extends GeneratedMessage implements SESleepStatusOrBuilder {
        private static final SESleepStatus DEFAULT_INSTANCE;
        public static final int INVALID_SLEEP_REASON_FIELD_NUMBER = 1;
        private static final Parser<SESleepStatus> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int invalidSleepReason_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SESleepStatus$1 */
        public class AnonymousClass1 extends AbstractParser<SESleepStatus> {
            @Override // com.google.protobuf.Parser
            public SESleepStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESleepStatus.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESleepStatusOrBuilder {
            private int bitField0_;
            private int invalidSleepReason_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, h hVar) {
                this(builderParent);
            }

            private void buildPartial0(SESleepStatus sESleepStatus) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sESleepStatus.invalidSleepReason_ = this.invalidSleepReason_;
                } else {
                    i7 = 0;
                }
                sESleepStatus.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MicroFunctionProtos.internal_static_SESleepStatus_descriptor;
            }

            public Builder clearInvalidSleepReason() {
                this.bitField0_ &= -2;
                this.invalidSleepReason_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MicroFunctionProtos.internal_static_SESleepStatus_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESleepStatusOrBuilder
            public int getInvalidSleepReason() {
                return this.invalidSleepReason_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESleepStatusOrBuilder
            public boolean hasInvalidSleepReason() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return MicroFunctionProtos.internal_static_SESleepStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SESleepStatus.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasInvalidSleepReason();
            }

            public Builder setInvalidSleepReason(int i7) {
                this.invalidSleepReason_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(h hVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESleepStatus build() {
                SESleepStatus sESleepStatusBuildPartial = buildPartial();
                if (sESleepStatusBuildPartial.isInitialized()) {
                    return sESleepStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESleepStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESleepStatus buildPartial() {
                SESleepStatus sESleepStatus = new SESleepStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESleepStatus);
                }
                onBuilt();
                return sESleepStatus;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESleepStatus getDefaultInstanceForType() {
                return SESleepStatus.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.invalidSleepReason_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESleepStatus) {
                    return mergeFrom((SESleepStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SESleepStatus sESleepStatus) {
                if (sESleepStatus == SESleepStatus.getDefaultInstance()) {
                    return this;
                }
                if (sESleepStatus.hasInvalidSleepReason()) {
                    setInvalidSleepReason(sESleepStatus.getInvalidSleepReason());
                }
                mergeUnknownFields(sESleepStatus.getUnknownFields());
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
                                    this.invalidSleepReason_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESleepStatus");
            DEFAULT_INSTANCE = new SESleepStatus();
            PARSER = new AbstractParser<SESleepStatus>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SESleepStatus.1
                @Override // com.google.protobuf.Parser
                public SESleepStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESleepStatus.newBuilder();
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

        public /* synthetic */ SESleepStatus(GeneratedMessage.Builder builder, h hVar) {
            this(builder);
        }

        public static SESleepStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MicroFunctionProtos.internal_static_SESleepStatus_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESleepStatus parseDelimitedFrom(InputStream inputStream) {
            return (SESleepStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESleepStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESleepStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESleepStatus)) {
                return super.equals(obj);
            }
            SESleepStatus sESleepStatus = (SESleepStatus) obj;
            if (hasInvalidSleepReason() != sESleepStatus.hasInvalidSleepReason()) {
                return false;
            }
            return (!hasInvalidSleepReason() || getInvalidSleepReason() == sESleepStatus.getInvalidSleepReason()) && getUnknownFields().equals(sESleepStatus.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return MicroFunctionProtos.internal_static_SESleepStatus_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESleepStatusOrBuilder
        public int getInvalidSleepReason() {
            return this.invalidSleepReason_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESleepStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.invalidSleepReason_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeUInt32Size;
            return iComputeUInt32Size;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SESleepStatusOrBuilder
        public boolean hasInvalidSleepReason() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasInvalidSleepReason()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getInvalidSleepReason();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return MicroFunctionProtos.internal_static_SESleepStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SESleepStatus.class, Builder.class);
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
            if (hasInvalidSleepReason()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.invalidSleepReason_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESleepStatus(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.invalidSleepReason_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESleepStatus sESleepStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESleepStatus);
        }

        public static SESleepStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESleepStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESleepStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESleepStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESleepStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESleepStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SESleepStatus() {
            this.invalidSleepReason_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SESleepStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESleepStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESleepStatus parseFrom(InputStream inputStream) {
            return (SESleepStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESleepStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESleepStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESleepStatus parseFrom(CodedInputStream codedInputStream) {
            return (SESleepStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESleepStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESleepStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESleepStatusOrBuilder extends MessageOrBuilder {
        int getInvalidSleepReason();

        boolean hasInvalidSleepReason();
    }

    public enum SESportsIconInfowearTag implements ProtocolMessageEnum {
        OUTDOOR_RUNNING_ICON(1),
        OUTDOOR_WALKING_ICON(2),
        INDOOR_RUNNING_ICON(3),
        TREKKING_ICON(4),
        TRAIL_RUN_ICON(5),
        OUTDOOR_CYCLING_ICON(6),
        INDOOR_CYCLING_ICON(7),
        FREESTYLE_ICON(8),
        BASKETBALL_ICON(9),
        FOOTBALL_ICON(10),
        PINGPONG_ICON(11),
        BADMINTON_ICON(12),
        OUTDOOR_HIKING_ICON(13),
        BMX_ICON(14),
        HUNTING_ICON(15),
        SAILING_ICON(16),
        SKATEBOARDING_ICON(17),
        ROLLER_SKATING_ICON(18),
        OUTDOORSKATING_ICON(19),
        EQUESTRIAN_ICON(20),
        POOL_SWIMMING_L_ICON(21),
        OPEN_WATER_L_ICON(22),
        CORE_TRAINING_ICON(23),
        MIXED_AEROBICS_ICON(24),
        STRENGTH_TRAINING_ICON(25),
        STRETCHING_ICON(26),
        CLIMBING_MACHINE_ICON(27),
        PILATES_ICON(28),
        FLEXIBILITY_TRAINING_ICON(29),
        INDOOR_FITNESS_ICON(30),
        STEPPER_ICON(31),
        STEP_TRAINING_ICON(32),
        GYMNASTICS_ICON(33),
        ELLIPTICAL_MACHINE_ICON(34),
        YOGA_ICON(35),
        FISHING_ICON(36),
        CURLING_ICON(37),
        INDOOR_SKATING_ICON(38),
        CRICKET_ICON(39),
        BASEBALL_ICON(40),
        BOWLING_ICON(41),
        SQUASH_ICON(42),
        SOFTBALL_ICON(43),
        CROQUET_ICON(44),
        VOLLEYBALL_ICON(45),
        HANDBALL_ICON(46),
        BALLET_ICON(47),
        BELLY_DANCE_ICON(48),
        SQUARE_DANCE_ICON(49),
        STREET_DANCE_ICON(50),
        BALLROOM_DANCING_ICON(51),
        DANCE_ICON(52),
        ZUMBA_ICON(53),
        KENDO_ICON(54),
        KARATE_ICON(55),
        BOXING_ICON(56),
        JUDO_ICON(57),
        WRESTLING_ICON(58),
        TAI_CHI_ICON(59),
        MUAY_THAI_ICON(60),
        TAEKWONDO_ICON(61),
        MARTIAL_ARTS_ICON(62),
        FREE_SPARRING_ICON(63),
        HIGH_INTENSITY_INTERVAL_TRAINING_ICON(64),
        ARCHERY_ICON(65),
        TREADMILL_ICON(66),
        PADDLE_BOARD_ICON(67),
        WATER_POLO_ICON(68),
        WATER_SPORTS_ICON(69),
        WATER_SKIING_ICON(70),
        KAYAKING_ICON(71),
        KAYAK_RAFTING_ICON(72),
        MOTORBOAT_ICON(73),
        FIN_SWIMMING_ICON(74),
        DIVING_ICON(75),
        SYNCHRONIZED_SWIMMING_ICON(76),
        SNORKELING_ICON(77),
        KITE_SURFING_ICON(78),
        ROCK_CLIMBING_ICON(79),
        PARKOUR_ICON(80),
        ATV_ICON(81),
        PARAGLIDER_ICON(82),
        CLIMB_THE_STAIRS_ICON(83),
        CROSSFIT_CROSS_TRAINING_CROSSFIT_ICON(84),
        AEROBICS_ICON(85),
        PHYSICAL_TRAINING_ICON(86),
        WALL_BALL_ICON(87),
        DUMBBELL_TRAINING_ICON(88),
        BARBELL_TRAINING_ICON(89),
        WEIGHTLIFTING_ICON(90),
        DEADLIFT_ICON(91),
        BOBBY_JUMP_ICON(92),
        SIT_UPS_ICON(93),
        FUNCTIONAL_TRAINING_ICON(94),
        UPPER_LIMB_TRAINING_ICON(95),
        LOWER_LIMB_TRAINING_ICON(96),
        WAIST_AND_ABDOMEN_TRAINING_ICON(97),
        BACK_TRAINING_ICON(98),
        NATIONAL_DANCE_ICON(99),
        JAZZ_ICON(100),
        LATIN_DANCE_ICON(101),
        FENCING_ICON(102),
        RUGBY_ICON(103),
        HOCKEY_ICON(104),
        TENNIS_ICON(105),
        BILLIARDS_ICON(106),
        SHUTTLECOCK_ICON(107),
        SEPAK_TAKRAW_ICON(108),
        SNOW_SPORTS_ICON(109),
        SNOWMOBILE_ICON(110),
        PUCK_ICON(111),
        SNOW_CAR_ICON(112),
        SLED_ICON(113),
        DARTS_ICON(114),
        TUG_OF_WAR_ICON(115),
        HULA_HOOP_ICON(116),
        FLY_A_KITE_ICON(117),
        FRISBEE_ICON(118),
        TRACK_AND_FIELD_ICON(119),
        RACING_CAR_ICON(120),
        ROWING_MACHINE_L_ICON(121),
        ROPE_SKIPPING_L_ICON(122),
        TRIATHLON_L_ICON(123),
        MOUNTAIN_CYCLING_ICON(124),
        KICKBOXING_ICON(125),
        SKIING_ICON(126),
        CROSS_COUNTRY_SKIING_ICON(127),
        SNOWBOARDING_ICON(128),
        ALPINE_SKIING_ICON(129),
        DOUBLE_BOARD_SKIING_ICON(130),
        FREE_EXERCISE_ICON(131),
        PADDLEBOARD_SURFING_ICON(132),
        KABADDI_ICON(133),
        GOLF_ICON(134),
        INDOOR_WALKING_ICON(135),
        TABLE_FOOTBALL(136),
        SEVEN_STONES(137),
        KHO_KHO(138),
        MARATHON(139),
        JUMPING_JACKS(140),
        PULL_UP_BAR(141),
        PARALLEL_BARS(142),
        HIGH_JUMP(143),
        LONG_JUMP(144),
        PULL_UP(145),
        PUSH_UP(146),
        PLANK(147),
        FOAM_ROLLING(148),
        FITNESS_GAMES(149),
        RELAXING_MEDITATION(150),
        TREADMILL(151),
        VO2_MAX(152),
        AUSTRALIAN_RULES_FOOTBALL(153),
        AMERICANVFOOTBALL(154),
        PICKLEBALL(155),
        SNOWBOARDING_156(156),
        GROUP_GYMNASTICS(157),
        COMBAT_AEROBICS(158),
        BUNGEE_JUMPING(159),
        KICK_SCOOTER(160),
        BALANCE_BIKE(161),
        LEISURE_SPORTS(162),
        SHOOTING(163),
        TRAMPOLINE(164),
        FIELD_HOCKEY(165),
        OUTDOOR_FOOTBALL(166),
        OPEN_WATER(199),
        POOL_SWIMMING_H_ICON(200),
        OPEN_WATER_H_ICON(201),
        ROWING_MACHINE_H_ICON(202),
        ROPE_SKIPPING_H_ICON(203),
        TRIATHLON_H_ICON(204),
        OUTDOOR_FOOTBALL_ICON(205);

        public static final int AEROBICS_ICON_VALUE = 85;
        public static final int ALPINE_SKIING_ICON_VALUE = 129;
        public static final int AMERICANVFOOTBALL_VALUE = 154;
        public static final int ARCHERY_ICON_VALUE = 65;
        public static final int ATV_ICON_VALUE = 81;
        public static final int AUSTRALIAN_RULES_FOOTBALL_VALUE = 153;
        public static final int BACK_TRAINING_ICON_VALUE = 98;
        public static final int BADMINTON_ICON_VALUE = 12;
        public static final int BALANCE_BIKE_VALUE = 161;
        public static final int BALLET_ICON_VALUE = 47;
        public static final int BALLROOM_DANCING_ICON_VALUE = 51;
        public static final int BARBELL_TRAINING_ICON_VALUE = 89;
        public static final int BASEBALL_ICON_VALUE = 40;
        public static final int BASKETBALL_ICON_VALUE = 9;
        public static final int BELLY_DANCE_ICON_VALUE = 48;
        public static final int BILLIARDS_ICON_VALUE = 106;
        public static final int BMX_ICON_VALUE = 14;
        public static final int BOBBY_JUMP_ICON_VALUE = 92;
        public static final int BOWLING_ICON_VALUE = 41;
        public static final int BOXING_ICON_VALUE = 56;
        public static final int BUNGEE_JUMPING_VALUE = 159;
        public static final int CLIMBING_MACHINE_ICON_VALUE = 27;
        public static final int CLIMB_THE_STAIRS_ICON_VALUE = 83;
        public static final int COMBAT_AEROBICS_VALUE = 158;
        public static final int CORE_TRAINING_ICON_VALUE = 23;
        public static final int CRICKET_ICON_VALUE = 39;
        public static final int CROQUET_ICON_VALUE = 44;
        public static final int CROSSFIT_CROSS_TRAINING_CROSSFIT_ICON_VALUE = 84;
        public static final int CROSS_COUNTRY_SKIING_ICON_VALUE = 127;
        public static final int CURLING_ICON_VALUE = 37;
        public static final int DANCE_ICON_VALUE = 52;
        public static final int DARTS_ICON_VALUE = 114;
        public static final int DEADLIFT_ICON_VALUE = 91;
        public static final int DIVING_ICON_VALUE = 75;
        public static final int DOUBLE_BOARD_SKIING_ICON_VALUE = 130;
        public static final int DUMBBELL_TRAINING_ICON_VALUE = 88;
        public static final int ELLIPTICAL_MACHINE_ICON_VALUE = 34;
        public static final int EQUESTRIAN_ICON_VALUE = 20;
        public static final int FENCING_ICON_VALUE = 102;
        public static final int FIELD_HOCKEY_VALUE = 165;
        public static final int FIN_SWIMMING_ICON_VALUE = 74;
        public static final int FISHING_ICON_VALUE = 36;
        public static final int FITNESS_GAMES_VALUE = 149;
        public static final int FLEXIBILITY_TRAINING_ICON_VALUE = 29;
        public static final int FLY_A_KITE_ICON_VALUE = 117;
        public static final int FOAM_ROLLING_VALUE = 148;
        public static final int FOOTBALL_ICON_VALUE = 10;
        public static final int FREESTYLE_ICON_VALUE = 8;
        public static final int FREE_EXERCISE_ICON_VALUE = 131;
        public static final int FREE_SPARRING_ICON_VALUE = 63;
        public static final int FRISBEE_ICON_VALUE = 118;
        public static final int FUNCTIONAL_TRAINING_ICON_VALUE = 94;
        public static final int GOLF_ICON_VALUE = 134;
        public static final int GROUP_GYMNASTICS_VALUE = 157;
        public static final int GYMNASTICS_ICON_VALUE = 33;
        public static final int HANDBALL_ICON_VALUE = 46;
        public static final int HIGH_INTENSITY_INTERVAL_TRAINING_ICON_VALUE = 64;
        public static final int HIGH_JUMP_VALUE = 143;
        public static final int HOCKEY_ICON_VALUE = 104;
        public static final int HULA_HOOP_ICON_VALUE = 116;
        public static final int HUNTING_ICON_VALUE = 15;
        public static final int INDOOR_CYCLING_ICON_VALUE = 7;
        public static final int INDOOR_FITNESS_ICON_VALUE = 30;
        public static final int INDOOR_RUNNING_ICON_VALUE = 3;
        public static final int INDOOR_SKATING_ICON_VALUE = 38;
        public static final int INDOOR_WALKING_ICON_VALUE = 135;
        public static final int JAZZ_ICON_VALUE = 100;
        public static final int JUDO_ICON_VALUE = 57;
        public static final int JUMPING_JACKS_VALUE = 140;
        public static final int KABADDI_ICON_VALUE = 133;
        public static final int KARATE_ICON_VALUE = 55;
        public static final int KAYAKING_ICON_VALUE = 71;
        public static final int KAYAK_RAFTING_ICON_VALUE = 72;
        public static final int KENDO_ICON_VALUE = 54;
        public static final int KHO_KHO_VALUE = 138;
        public static final int KICKBOXING_ICON_VALUE = 125;
        public static final int KICK_SCOOTER_VALUE = 160;
        public static final int KITE_SURFING_ICON_VALUE = 78;
        public static final int LATIN_DANCE_ICON_VALUE = 101;
        public static final int LEISURE_SPORTS_VALUE = 162;
        public static final int LONG_JUMP_VALUE = 144;
        public static final int LOWER_LIMB_TRAINING_ICON_VALUE = 96;
        public static final int MARATHON_VALUE = 139;
        public static final int MARTIAL_ARTS_ICON_VALUE = 62;
        public static final int MIXED_AEROBICS_ICON_VALUE = 24;
        public static final int MOTORBOAT_ICON_VALUE = 73;
        public static final int MOUNTAIN_CYCLING_ICON_VALUE = 124;
        public static final int MUAY_THAI_ICON_VALUE = 60;
        public static final int NATIONAL_DANCE_ICON_VALUE = 99;
        public static final int OPEN_WATER_H_ICON_VALUE = 201;
        public static final int OPEN_WATER_L_ICON_VALUE = 22;
        public static final int OPEN_WATER_VALUE = 199;
        public static final int OUTDOORSKATING_ICON_VALUE = 19;
        public static final int OUTDOOR_CYCLING_ICON_VALUE = 6;
        public static final int OUTDOOR_FOOTBALL_ICON_VALUE = 205;
        public static final int OUTDOOR_FOOTBALL_VALUE = 166;
        public static final int OUTDOOR_HIKING_ICON_VALUE = 13;
        public static final int OUTDOOR_RUNNING_ICON_VALUE = 1;
        public static final int OUTDOOR_WALKING_ICON_VALUE = 2;
        public static final int PADDLEBOARD_SURFING_ICON_VALUE = 132;
        public static final int PADDLE_BOARD_ICON_VALUE = 67;
        public static final int PARAGLIDER_ICON_VALUE = 82;
        public static final int PARALLEL_BARS_VALUE = 142;
        public static final int PARKOUR_ICON_VALUE = 80;
        public static final int PHYSICAL_TRAINING_ICON_VALUE = 86;
        public static final int PICKLEBALL_VALUE = 155;
        public static final int PILATES_ICON_VALUE = 28;
        public static final int PINGPONG_ICON_VALUE = 11;
        public static final int PLANK_VALUE = 147;
        public static final int POOL_SWIMMING_H_ICON_VALUE = 200;
        public static final int POOL_SWIMMING_L_ICON_VALUE = 21;
        public static final int PUCK_ICON_VALUE = 111;
        public static final int PULL_UP_BAR_VALUE = 141;
        public static final int PULL_UP_VALUE = 145;
        public static final int PUSH_UP_VALUE = 146;
        public static final int RACING_CAR_ICON_VALUE = 120;
        public static final int RELAXING_MEDITATION_VALUE = 150;
        public static final int ROCK_CLIMBING_ICON_VALUE = 79;
        public static final int ROLLER_SKATING_ICON_VALUE = 18;
        public static final int ROPE_SKIPPING_H_ICON_VALUE = 203;
        public static final int ROPE_SKIPPING_L_ICON_VALUE = 122;
        public static final int ROWING_MACHINE_H_ICON_VALUE = 202;
        public static final int ROWING_MACHINE_L_ICON_VALUE = 121;
        public static final int RUGBY_ICON_VALUE = 103;
        public static final int SAILING_ICON_VALUE = 16;
        public static final int SEPAK_TAKRAW_ICON_VALUE = 108;
        public static final int SEVEN_STONES_VALUE = 137;
        public static final int SHOOTING_VALUE = 163;
        public static final int SHUTTLECOCK_ICON_VALUE = 107;
        public static final int SIT_UPS_ICON_VALUE = 93;
        public static final int SKATEBOARDING_ICON_VALUE = 17;
        public static final int SKIING_ICON_VALUE = 126;
        public static final int SLED_ICON_VALUE = 113;
        public static final int SNORKELING_ICON_VALUE = 77;
        public static final int SNOWBOARDING_156_VALUE = 156;
        public static final int SNOWBOARDING_ICON_VALUE = 128;
        public static final int SNOWMOBILE_ICON_VALUE = 110;
        public static final int SNOW_CAR_ICON_VALUE = 112;
        public static final int SNOW_SPORTS_ICON_VALUE = 109;
        public static final int SOFTBALL_ICON_VALUE = 43;
        public static final int SQUARE_DANCE_ICON_VALUE = 49;
        public static final int SQUASH_ICON_VALUE = 42;
        public static final int STEPPER_ICON_VALUE = 31;
        public static final int STEP_TRAINING_ICON_VALUE = 32;
        public static final int STREET_DANCE_ICON_VALUE = 50;
        public static final int STRENGTH_TRAINING_ICON_VALUE = 25;
        public static final int STRETCHING_ICON_VALUE = 26;
        public static final int SYNCHRONIZED_SWIMMING_ICON_VALUE = 76;
        public static final int TABLE_FOOTBALL_VALUE = 136;
        public static final int TAEKWONDO_ICON_VALUE = 61;
        public static final int TAI_CHI_ICON_VALUE = 59;
        public static final int TENNIS_ICON_VALUE = 105;
        public static final int TRACK_AND_FIELD_ICON_VALUE = 119;
        public static final int TRAIL_RUN_ICON_VALUE = 5;
        public static final int TRAMPOLINE_VALUE = 164;
        public static final int TREADMILL_ICON_VALUE = 66;
        public static final int TREADMILL_VALUE = 151;
        public static final int TREKKING_ICON_VALUE = 4;
        public static final int TRIATHLON_H_ICON_VALUE = 204;
        public static final int TRIATHLON_L_ICON_VALUE = 123;
        public static final int TUG_OF_WAR_ICON_VALUE = 115;
        public static final int UPPER_LIMB_TRAINING_ICON_VALUE = 95;
        private static final SESportsIconInfowearTag[] VALUES;
        public static final int VO2_MAX_VALUE = 152;
        public static final int VOLLEYBALL_ICON_VALUE = 45;
        public static final int WAIST_AND_ABDOMEN_TRAINING_ICON_VALUE = 97;
        public static final int WALL_BALL_ICON_VALUE = 87;
        public static final int WATER_POLO_ICON_VALUE = 68;
        public static final int WATER_SKIING_ICON_VALUE = 70;
        public static final int WATER_SPORTS_ICON_VALUE = 69;
        public static final int WEIGHTLIFTING_ICON_VALUE = 90;
        public static final int WRESTLING_ICON_VALUE = 58;
        public static final int YOGA_ICON_VALUE = 35;
        public static final int ZUMBA_ICON_VALUE = 53;
        private static final Internal.EnumLiteMap<SESportsIconInfowearTag> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SESportsIconInfowearTag$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SESportsIconInfowearTag> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SESportsIconInfowearTag findValueByNumber(int i7) {
                return SESportsIconInfowearTag.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportsIconInfowearTag");
            internalValueMap = new Internal.EnumLiteMap<SESportsIconInfowearTag>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SESportsIconInfowearTag.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESportsIconInfowearTag findValueByNumber(int i7) {
                    return SESportsIconInfowearTag.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SESportsIconInfowearTag(int i7) {
            this.value = i7;
        }

        public static SESportsIconInfowearTag forNumber(int i7) {
            switch (i7) {
                case 1:
                    return OUTDOOR_RUNNING_ICON;
                case 2:
                    return OUTDOOR_WALKING_ICON;
                case 3:
                    return INDOOR_RUNNING_ICON;
                case 4:
                    return TREKKING_ICON;
                case 5:
                    return TRAIL_RUN_ICON;
                case 6:
                    return OUTDOOR_CYCLING_ICON;
                case 7:
                    return INDOOR_CYCLING_ICON;
                case 8:
                    return FREESTYLE_ICON;
                case 9:
                    return BASKETBALL_ICON;
                case 10:
                    return FOOTBALL_ICON;
                case 11:
                    return PINGPONG_ICON;
                case 12:
                    return BADMINTON_ICON;
                case 13:
                    return OUTDOOR_HIKING_ICON;
                case 14:
                    return BMX_ICON;
                case 15:
                    return HUNTING_ICON;
                case 16:
                    return SAILING_ICON;
                case 17:
                    return SKATEBOARDING_ICON;
                case 18:
                    return ROLLER_SKATING_ICON;
                case 19:
                    return OUTDOORSKATING_ICON;
                case 20:
                    return EQUESTRIAN_ICON;
                case 21:
                    return POOL_SWIMMING_L_ICON;
                case 22:
                    return OPEN_WATER_L_ICON;
                case 23:
                    return CORE_TRAINING_ICON;
                case 24:
                    return MIXED_AEROBICS_ICON;
                case 25:
                    return STRENGTH_TRAINING_ICON;
                case 26:
                    return STRETCHING_ICON;
                case 27:
                    return CLIMBING_MACHINE_ICON;
                case 28:
                    return PILATES_ICON;
                case 29:
                    return FLEXIBILITY_TRAINING_ICON;
                case 30:
                    return INDOOR_FITNESS_ICON;
                case 31:
                    return STEPPER_ICON;
                case 32:
                    return STEP_TRAINING_ICON;
                case 33:
                    return GYMNASTICS_ICON;
                case 34:
                    return ELLIPTICAL_MACHINE_ICON;
                case 35:
                    return YOGA_ICON;
                case 36:
                    return FISHING_ICON;
                case 37:
                    return CURLING_ICON;
                case 38:
                    return INDOOR_SKATING_ICON;
                case 39:
                    return CRICKET_ICON;
                case 40:
                    return BASEBALL_ICON;
                case 41:
                    return BOWLING_ICON;
                case 42:
                    return SQUASH_ICON;
                case 43:
                    return SOFTBALL_ICON;
                case 44:
                    return CROQUET_ICON;
                case 45:
                    return VOLLEYBALL_ICON;
                case 46:
                    return HANDBALL_ICON;
                case 47:
                    return BALLET_ICON;
                case 48:
                    return BELLY_DANCE_ICON;
                case 49:
                    return SQUARE_DANCE_ICON;
                case 50:
                    return STREET_DANCE_ICON;
                case 51:
                    return BALLROOM_DANCING_ICON;
                case 52:
                    return DANCE_ICON;
                case 53:
                    return ZUMBA_ICON;
                case 54:
                    return KENDO_ICON;
                case 55:
                    return KARATE_ICON;
                case 56:
                    return BOXING_ICON;
                case 57:
                    return JUDO_ICON;
                case 58:
                    return WRESTLING_ICON;
                case 59:
                    return TAI_CHI_ICON;
                case 60:
                    return MUAY_THAI_ICON;
                case 61:
                    return TAEKWONDO_ICON;
                case 62:
                    return MARTIAL_ARTS_ICON;
                case 63:
                    return FREE_SPARRING_ICON;
                case 64:
                    return HIGH_INTENSITY_INTERVAL_TRAINING_ICON;
                case 65:
                    return ARCHERY_ICON;
                case 66:
                    return TREADMILL_ICON;
                case 67:
                    return PADDLE_BOARD_ICON;
                case 68:
                    return WATER_POLO_ICON;
                case 69:
                    return WATER_SPORTS_ICON;
                case 70:
                    return WATER_SKIING_ICON;
                case 71:
                    return KAYAKING_ICON;
                case 72:
                    return KAYAK_RAFTING_ICON;
                case 73:
                    return MOTORBOAT_ICON;
                case 74:
                    return FIN_SWIMMING_ICON;
                case 75:
                    return DIVING_ICON;
                case 76:
                    return SYNCHRONIZED_SWIMMING_ICON;
                case 77:
                    return SNORKELING_ICON;
                case 78:
                    return KITE_SURFING_ICON;
                case 79:
                    return ROCK_CLIMBING_ICON;
                case 80:
                    return PARKOUR_ICON;
                case 81:
                    return ATV_ICON;
                case 82:
                    return PARAGLIDER_ICON;
                case 83:
                    return CLIMB_THE_STAIRS_ICON;
                case 84:
                    return CROSSFIT_CROSS_TRAINING_CROSSFIT_ICON;
                case 85:
                    return AEROBICS_ICON;
                case 86:
                    return PHYSICAL_TRAINING_ICON;
                case 87:
                    return WALL_BALL_ICON;
                case 88:
                    return DUMBBELL_TRAINING_ICON;
                case 89:
                    return BARBELL_TRAINING_ICON;
                case 90:
                    return WEIGHTLIFTING_ICON;
                case 91:
                    return DEADLIFT_ICON;
                case 92:
                    return BOBBY_JUMP_ICON;
                case 93:
                    return SIT_UPS_ICON;
                case 94:
                    return FUNCTIONAL_TRAINING_ICON;
                case 95:
                    return UPPER_LIMB_TRAINING_ICON;
                case 96:
                    return LOWER_LIMB_TRAINING_ICON;
                case 97:
                    return WAIST_AND_ABDOMEN_TRAINING_ICON;
                case 98:
                    return BACK_TRAINING_ICON;
                case 99:
                    return NATIONAL_DANCE_ICON;
                case 100:
                    return JAZZ_ICON;
                case 101:
                    return LATIN_DANCE_ICON;
                case 102:
                    return FENCING_ICON;
                case 103:
                    return RUGBY_ICON;
                case 104:
                    return HOCKEY_ICON;
                case 105:
                    return TENNIS_ICON;
                case 106:
                    return BILLIARDS_ICON;
                case 107:
                    return SHUTTLECOCK_ICON;
                case 108:
                    return SEPAK_TAKRAW_ICON;
                case 109:
                    return SNOW_SPORTS_ICON;
                case 110:
                    return SNOWMOBILE_ICON;
                case 111:
                    return PUCK_ICON;
                case 112:
                    return SNOW_CAR_ICON;
                case 113:
                    return SLED_ICON;
                case 114:
                    return DARTS_ICON;
                case 115:
                    return TUG_OF_WAR_ICON;
                case 116:
                    return HULA_HOOP_ICON;
                case 117:
                    return FLY_A_KITE_ICON;
                case 118:
                    return FRISBEE_ICON;
                case 119:
                    return TRACK_AND_FIELD_ICON;
                case 120:
                    return RACING_CAR_ICON;
                case 121:
                    return ROWING_MACHINE_L_ICON;
                case 122:
                    return ROPE_SKIPPING_L_ICON;
                case 123:
                    return TRIATHLON_L_ICON;
                case 124:
                    return MOUNTAIN_CYCLING_ICON;
                case 125:
                    return KICKBOXING_ICON;
                case 126:
                    return SKIING_ICON;
                case 127:
                    return CROSS_COUNTRY_SKIING_ICON;
                case 128:
                    return SNOWBOARDING_ICON;
                case 129:
                    return ALPINE_SKIING_ICON;
                case 130:
                    return DOUBLE_BOARD_SKIING_ICON;
                case 131:
                    return FREE_EXERCISE_ICON;
                case 132:
                    return PADDLEBOARD_SURFING_ICON;
                case 133:
                    return KABADDI_ICON;
                case 134:
                    return GOLF_ICON;
                case 135:
                    return INDOOR_WALKING_ICON;
                case 136:
                    return TABLE_FOOTBALL;
                case 137:
                    return SEVEN_STONES;
                case 138:
                    return KHO_KHO;
                case 139:
                    return MARATHON;
                case 140:
                    return JUMPING_JACKS;
                case 141:
                    return PULL_UP_BAR;
                case 142:
                    return PARALLEL_BARS;
                case 143:
                    return HIGH_JUMP;
                case 144:
                    return LONG_JUMP;
                case 145:
                    return PULL_UP;
                case 146:
                    return PUSH_UP;
                case 147:
                    return PLANK;
                case 148:
                    return FOAM_ROLLING;
                case 149:
                    return FITNESS_GAMES;
                case 150:
                    return RELAXING_MEDITATION;
                case 151:
                    return TREADMILL;
                case 152:
                    return VO2_MAX;
                case 153:
                    return AUSTRALIAN_RULES_FOOTBALL;
                case 154:
                    return AMERICANVFOOTBALL;
                case 155:
                    return PICKLEBALL;
                case 156:
                    return SNOWBOARDING_156;
                case 157:
                    return GROUP_GYMNASTICS;
                case 158:
                    return COMBAT_AEROBICS;
                case 159:
                    return BUNGEE_JUMPING;
                case 160:
                    return KICK_SCOOTER;
                case 161:
                    return BALANCE_BIKE;
                case 162:
                    return LEISURE_SPORTS;
                case 163:
                    return SHOOTING;
                case 164:
                    return TRAMPOLINE;
                case 165:
                    return FIELD_HOCKEY;
                case 166:
                    return OUTDOOR_FOOTBALL;
                default:
                    switch (i7) {
                        case 199:
                            return OPEN_WATER;
                        case 200:
                            return POOL_SWIMMING_H_ICON;
                        case 201:
                            return OPEN_WATER_H_ICON;
                        case 202:
                            return ROWING_MACHINE_H_ICON;
                        case 203:
                            return ROPE_SKIPPING_H_ICON;
                        case 204:
                            return TRIATHLON_H_ICON;
                        case 205:
                            return OUTDOOR_FOOTBALL_ICON;
                        default:
                            return null;
                    }
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(8);
        }

        public static Internal.EnumLiteMap<SESportsIconInfowearTag> internalGetValueMap() {
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
        public static SESportsIconInfowearTag valueOf(int i7) {
            return forNumber(i7);
        }

        public static SESportsIconInfowearTag valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SESportsIconTag implements ProtocolMessageEnum {
        SPORTSICON_RUN_OUTDOOR(0),
        SPORTSICON_WALK_OUTDOOR(1),
        SPORTSICON_RUN_INDOOR(2),
        SPORTSICON_CLIMBING(3),
        SPORTSICON_CROSS_COUNTRY(4),
        SPORTSICON_RIDE_OUTDOOR(5),
        SPORTSICON_RIDE_INDOOR(6),
        SPORTSICON_FREE_TRAINING(7);

        public static final int SPORTSICON_CLIMBING_VALUE = 3;
        public static final int SPORTSICON_CROSS_COUNTRY_VALUE = 4;
        public static final int SPORTSICON_FREE_TRAINING_VALUE = 7;
        public static final int SPORTSICON_RIDE_INDOOR_VALUE = 6;
        public static final int SPORTSICON_RIDE_OUTDOOR_VALUE = 5;
        public static final int SPORTSICON_RUN_INDOOR_VALUE = 2;
        public static final int SPORTSICON_RUN_OUTDOOR_VALUE = 0;
        public static final int SPORTSICON_WALK_OUTDOOR_VALUE = 1;
        private static final SESportsIconTag[] VALUES;
        private static final Internal.EnumLiteMap<SESportsIconTag> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SESportsIconTag$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SESportsIconTag> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SESportsIconTag findValueByNumber(int i7) {
                return SESportsIconTag.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportsIconTag");
            internalValueMap = new Internal.EnumLiteMap<SESportsIconTag>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SESportsIconTag.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESportsIconTag findValueByNumber(int i7) {
                    return SESportsIconTag.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SESportsIconTag(int i7) {
            this.value = i7;
        }

        public static SESportsIconTag forNumber(int i7) {
            switch (i7) {
                case 0:
                    return SPORTSICON_RUN_OUTDOOR;
                case 1:
                    return SPORTSICON_WALK_OUTDOOR;
                case 2:
                    return SPORTSICON_RUN_INDOOR;
                case 3:
                    return SPORTSICON_CLIMBING;
                case 4:
                    return SPORTSICON_CROSS_COUNTRY;
                case 5:
                    return SPORTSICON_RIDE_OUTDOOR;
                case 6:
                    return SPORTSICON_RIDE_INDOOR;
                case 7:
                    return SPORTSICON_FREE_TRAINING;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(6);
        }

        public static Internal.EnumLiteMap<SESportsIconTag> internalGetValueMap() {
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
        public static SESportsIconTag valueOf(int i7) {
            return forNumber(i7);
        }

        public static SESportsIconTag valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SESportsOtherTag implements ProtocolMessageEnum {
        SPORTSOTHER_BASKETBALL(0),
        SPORTSOTHER_FOOTBALL(1),
        SPORTSOTHER_PINGPONG(2),
        SPORTSOTHER_BADMINTON(3),
        SPORTSOTHER_OUTDOOR_HIKING(4),
        SPORTSOTHER_BMX(5),
        SPORTSOTHER_HUNTING(6),
        SPORTSOTHER_SAILING(7),
        SPORTSOTHER_SKATEBOARDING(8),
        SPORTSOTHER_ROLLER_SKATING(9),
        SPORTSOTHER_OUTDOORSKATING(10),
        SPORTSOTHER_EQUESTRIAN(11),
        SPORTSOTHER_CORE_TRAINING(12),
        SPORTSOTHER_MIXED_AEROBICS(13),
        SPORTSOTHER_STRENGTH_TRAINING(14),
        SPORTSOTHER_STRETCHING(15),
        SPORTSOTHER_CLIMBING_MACHINE(16),
        SPORTSOTHER_PILATES(17),
        SPORTSOTHER_FLEXIBILITY_TRAINING(18),
        SPORTSOTHER_INDOOR_FITNESS(19),
        SPORTSOTHER_STEPPER(20),
        SPORTSOTHER_STEP_TRAINING(21),
        SPORTSOTHER_GYMNASTICS(22),
        SPORTSOTHER_ELLIPTICAL_MACHINE(23),
        SPORTSOTHER_YOGA(24),
        SPORTSOTHER_FISHING(25),
        SPORTSOTHER_CURLING(26),
        SPORTSOTHER_INDOOR_SKATING(27),
        SPORTSOTHER_CRICKET(28),
        SPORTSOTHER_BASEBALL(29),
        SPORTSOTHER_BOWLING(30),
        SPORTSOTHER_SQUASH(31),
        SPORTSOTHER_SOFTBALL(32),
        SPORTSOTHER_CROQUET(33),
        SPORTSOTHER_VOLLEYBALL(34),
        SPORTSOTHER_HANDBALL(35),
        SPORTSOTHER_BALLET(36),
        SPORTSOTHER_BELLY_DANCE(37),
        SPORTSOTHER_SQUARE_DANCE(38),
        SPORTSOTHER_STREET_DANCE(39),
        SPORTSOTHER_BALLROOM_DANCING(40),
        SPORTSOTHER_DANCE(41),
        SPORTSOTHER_ZUMBA(42),
        SPORTSOTHER_KENDO(43),
        SPORTSOTHER_KARATE(44),
        SPORTSOTHER_BOXING(45),
        SPORTSOTHER_JUDO(46),
        SPORTSOTHER_WRESTLING(47),
        SPORTSOTHER_TAI_CHI(48),
        SPORTSOTHER_MUAY_THAI(49),
        SPORTSOTHER_TAEKWONDO(50),
        SPORTSOTHER_MARTIAL_ARTS(51),
        SPORTSOTHER_FREE_SPARRING(52),
        SPORTSOTHER_HIGH_INTENSITY_INTERVAL_TRAINING(53),
        SPORTSOTHER_ARCHERY(54),
        SPORTSOTHER_INDOOR_RUNNING(55),
        SPORTSOTHER_PADDLE_BOARD(56),
        SPORTSOTHER_WATER_POLO(57),
        SPORTSOTHER_WATER_SPORTS(58),
        SPORTSOTHER_WATER_SKIING(59),
        SPORTSOTHER_KAYAKING(60),
        SPORTSOTHER_KAYAK_RAFTING(61),
        SPORTSOTHER_MOTORBOAT(62),
        SPORTSOTHER_FIN_SWIMMING(63),
        SPORTSOTHER_DIVING(64),
        SPORTSOTHER_SYNCHRONIZED_SWIMMING(65),
        SPORTSOTHER_SNORKELING(66),
        SPORTSOTHER_KITE_SURFING(67),
        SPORTSOTHER_ROCK_CLIMBING(68),
        SPORTSOTHER_PARKOUR(69),
        SPORTSOTHER_ATV(70),
        SPORTSOTHER_PARAGLIDER(71),
        SPORTSOTHER_CLIMB_THE_STAIRS(72),
        SPORTSOTHER_CROSS_TRAINING_CROSSFIT(73),
        SPORTSOTHER_AEROBICS(74),
        SPORTSOTHER_PHYSICAL_TRAINING(75),
        SPORTSOTHER_WALL_BALL(76),
        SPORTSOTHER_DUMBBELL_TRAINING(77),
        SPORTSOTHER_BARBELL_TRAINING(78),
        SPORTSOTHER_WEIGHTLIFTING(79),
        SPORTSOTHER_DEADLIFT(80),
        SPORTSOTHER_BOBBY_JUMP(81),
        SPORTSOTHER_SIT_UPS(82),
        SPORTSOTHER_FUNCTIONAL_TRAINING(83),
        SPORTSOTHER_UPPER_LIMB_TRAINING(84),
        SPORTSOTHER_LOWER_LIMB_TRAINING(85),
        SPORTSOTHER_WAIST_AND_ABDOMEN_TRAINING(86),
        SPORTSOTHER_BACK_TRAINING(87),
        SPORTSOTHER_NATIONAL_DANCE(88),
        SPORTSOTHER_JAZZ(89),
        SPORTSOTHER_LATIN_DANCE(90),
        SPORTSOTHER_FENCING(91),
        SPORTSOTHER_RUGBY(92),
        SPORTSOTHER_HOCKEY(93),
        SPORTSOTHER_TENNIS(94),
        SPORTSOTHER_BILLIARDS(95),
        SPORTSOTHER_SHUTTLECOCK(96),
        SPORTSOTHER_SEPAK_TAKRAW(97),
        SPORTSOTHER_SNOW_SPORTS(98),
        SPORTSOTHER_SNOWMOBILE(99),
        SPORTSOTHER_PUCK(100),
        SPORTSOTHER_SNOW_CAR(101),
        SPORTSOTHER_SLED(102),
        SPORTSOTHER_DARTS(103),
        SPORTSOTHER_TUG_OF_WAR(104),
        SPORTSOTHER_HULA_HOOP(105),
        SPORTSOTHER_FLY_A_KITE(106),
        SPORTSOTHER_FRISBEE(107),
        SPORTSOTHER_TRACK_AND_FIELD(108),
        SPORTSOTHER_RACING_CAR(109),
        SPORTSOTHER_ROWING_MACHINE(110),
        SPORTSOTHER_ROPE_SKIPPING(111),
        SPORTSOTHER_TRIATHLON(112),
        SPORTSOTHER_MOUNTAIN_BIKE(113),
        SPORTSOTHER_KICK_BOXING(114),
        SPORTSOTHER_SKIING(115),
        SPORTSOTHER_CROSS_COUNTRY_SKIING(116),
        SPORTSOTHER_SKI(117),
        SPORTSOTHER_ALPINR_SKIING(118),
        SPORTSOTHER_SKI_DOUBLE_BOARD(119),
        SPORTSOTHER_FLOOR_EXERCISE(120),
        SPORTSOTHER_PADDLE_SURFING(121),
        SPORTSOTHER_KABADDI(122),
        SPORTSOTHER_POOL_SWIMMING(123),
        SPORTSOTHER_OPEN_WATER(124);

        public static final int SPORTSOTHER_AEROBICS_VALUE = 74;
        public static final int SPORTSOTHER_ALPINR_SKIING_VALUE = 118;
        public static final int SPORTSOTHER_ARCHERY_VALUE = 54;
        public static final int SPORTSOTHER_ATV_VALUE = 70;
        public static final int SPORTSOTHER_BACK_TRAINING_VALUE = 87;
        public static final int SPORTSOTHER_BADMINTON_VALUE = 3;
        public static final int SPORTSOTHER_BALLET_VALUE = 36;
        public static final int SPORTSOTHER_BALLROOM_DANCING_VALUE = 40;
        public static final int SPORTSOTHER_BARBELL_TRAINING_VALUE = 78;
        public static final int SPORTSOTHER_BASEBALL_VALUE = 29;
        public static final int SPORTSOTHER_BASKETBALL_VALUE = 0;
        public static final int SPORTSOTHER_BELLY_DANCE_VALUE = 37;
        public static final int SPORTSOTHER_BILLIARDS_VALUE = 95;
        public static final int SPORTSOTHER_BMX_VALUE = 5;
        public static final int SPORTSOTHER_BOBBY_JUMP_VALUE = 81;
        public static final int SPORTSOTHER_BOWLING_VALUE = 30;
        public static final int SPORTSOTHER_BOXING_VALUE = 45;
        public static final int SPORTSOTHER_CLIMBING_MACHINE_VALUE = 16;
        public static final int SPORTSOTHER_CLIMB_THE_STAIRS_VALUE = 72;
        public static final int SPORTSOTHER_CORE_TRAINING_VALUE = 12;
        public static final int SPORTSOTHER_CRICKET_VALUE = 28;
        public static final int SPORTSOTHER_CROQUET_VALUE = 33;
        public static final int SPORTSOTHER_CROSS_COUNTRY_SKIING_VALUE = 116;
        public static final int SPORTSOTHER_CROSS_TRAINING_CROSSFIT_VALUE = 73;
        public static final int SPORTSOTHER_CURLING_VALUE = 26;
        public static final int SPORTSOTHER_DANCE_VALUE = 41;
        public static final int SPORTSOTHER_DARTS_VALUE = 103;
        public static final int SPORTSOTHER_DEADLIFT_VALUE = 80;
        public static final int SPORTSOTHER_DIVING_VALUE = 64;
        public static final int SPORTSOTHER_DUMBBELL_TRAINING_VALUE = 77;
        public static final int SPORTSOTHER_ELLIPTICAL_MACHINE_VALUE = 23;
        public static final int SPORTSOTHER_EQUESTRIAN_VALUE = 11;
        public static final int SPORTSOTHER_FENCING_VALUE = 91;
        public static final int SPORTSOTHER_FIN_SWIMMING_VALUE = 63;
        public static final int SPORTSOTHER_FISHING_VALUE = 25;
        public static final int SPORTSOTHER_FLEXIBILITY_TRAINING_VALUE = 18;
        public static final int SPORTSOTHER_FLOOR_EXERCISE_VALUE = 120;
        public static final int SPORTSOTHER_FLY_A_KITE_VALUE = 106;
        public static final int SPORTSOTHER_FOOTBALL_VALUE = 1;
        public static final int SPORTSOTHER_FREE_SPARRING_VALUE = 52;
        public static final int SPORTSOTHER_FRISBEE_VALUE = 107;
        public static final int SPORTSOTHER_FUNCTIONAL_TRAINING_VALUE = 83;
        public static final int SPORTSOTHER_GYMNASTICS_VALUE = 22;
        public static final int SPORTSOTHER_HANDBALL_VALUE = 35;
        public static final int SPORTSOTHER_HIGH_INTENSITY_INTERVAL_TRAINING_VALUE = 53;
        public static final int SPORTSOTHER_HOCKEY_VALUE = 93;
        public static final int SPORTSOTHER_HULA_HOOP_VALUE = 105;
        public static final int SPORTSOTHER_HUNTING_VALUE = 6;
        public static final int SPORTSOTHER_INDOOR_FITNESS_VALUE = 19;
        public static final int SPORTSOTHER_INDOOR_RUNNING_VALUE = 55;
        public static final int SPORTSOTHER_INDOOR_SKATING_VALUE = 27;
        public static final int SPORTSOTHER_JAZZ_VALUE = 89;
        public static final int SPORTSOTHER_JUDO_VALUE = 46;
        public static final int SPORTSOTHER_KABADDI_VALUE = 122;
        public static final int SPORTSOTHER_KARATE_VALUE = 44;
        public static final int SPORTSOTHER_KAYAKING_VALUE = 60;
        public static final int SPORTSOTHER_KAYAK_RAFTING_VALUE = 61;
        public static final int SPORTSOTHER_KENDO_VALUE = 43;
        public static final int SPORTSOTHER_KICK_BOXING_VALUE = 114;
        public static final int SPORTSOTHER_KITE_SURFING_VALUE = 67;
        public static final int SPORTSOTHER_LATIN_DANCE_VALUE = 90;
        public static final int SPORTSOTHER_LOWER_LIMB_TRAINING_VALUE = 85;
        public static final int SPORTSOTHER_MARTIAL_ARTS_VALUE = 51;
        public static final int SPORTSOTHER_MIXED_AEROBICS_VALUE = 13;
        public static final int SPORTSOTHER_MOTORBOAT_VALUE = 62;
        public static final int SPORTSOTHER_MOUNTAIN_BIKE_VALUE = 113;
        public static final int SPORTSOTHER_MUAY_THAI_VALUE = 49;
        public static final int SPORTSOTHER_NATIONAL_DANCE_VALUE = 88;
        public static final int SPORTSOTHER_OPEN_WATER_VALUE = 124;
        public static final int SPORTSOTHER_OUTDOORSKATING_VALUE = 10;
        public static final int SPORTSOTHER_OUTDOOR_HIKING_VALUE = 4;
        public static final int SPORTSOTHER_PADDLE_BOARD_VALUE = 56;
        public static final int SPORTSOTHER_PADDLE_SURFING_VALUE = 121;
        public static final int SPORTSOTHER_PARAGLIDER_VALUE = 71;
        public static final int SPORTSOTHER_PARKOUR_VALUE = 69;
        public static final int SPORTSOTHER_PHYSICAL_TRAINING_VALUE = 75;
        public static final int SPORTSOTHER_PILATES_VALUE = 17;
        public static final int SPORTSOTHER_PINGPONG_VALUE = 2;
        public static final int SPORTSOTHER_POOL_SWIMMING_VALUE = 123;
        public static final int SPORTSOTHER_PUCK_VALUE = 100;
        public static final int SPORTSOTHER_RACING_CAR_VALUE = 109;
        public static final int SPORTSOTHER_ROCK_CLIMBING_VALUE = 68;
        public static final int SPORTSOTHER_ROLLER_SKATING_VALUE = 9;
        public static final int SPORTSOTHER_ROPE_SKIPPING_VALUE = 111;
        public static final int SPORTSOTHER_ROWING_MACHINE_VALUE = 110;
        public static final int SPORTSOTHER_RUGBY_VALUE = 92;
        public static final int SPORTSOTHER_SAILING_VALUE = 7;
        public static final int SPORTSOTHER_SEPAK_TAKRAW_VALUE = 97;
        public static final int SPORTSOTHER_SHUTTLECOCK_VALUE = 96;
        public static final int SPORTSOTHER_SIT_UPS_VALUE = 82;
        public static final int SPORTSOTHER_SKATEBOARDING_VALUE = 8;
        public static final int SPORTSOTHER_SKIING_VALUE = 115;
        public static final int SPORTSOTHER_SKI_DOUBLE_BOARD_VALUE = 119;
        public static final int SPORTSOTHER_SKI_VALUE = 117;
        public static final int SPORTSOTHER_SLED_VALUE = 102;
        public static final int SPORTSOTHER_SNORKELING_VALUE = 66;
        public static final int SPORTSOTHER_SNOWMOBILE_VALUE = 99;
        public static final int SPORTSOTHER_SNOW_CAR_VALUE = 101;
        public static final int SPORTSOTHER_SNOW_SPORTS_VALUE = 98;
        public static final int SPORTSOTHER_SOFTBALL_VALUE = 32;
        public static final int SPORTSOTHER_SQUARE_DANCE_VALUE = 38;
        public static final int SPORTSOTHER_SQUASH_VALUE = 31;
        public static final int SPORTSOTHER_STEPPER_VALUE = 20;
        public static final int SPORTSOTHER_STEP_TRAINING_VALUE = 21;
        public static final int SPORTSOTHER_STREET_DANCE_VALUE = 39;
        public static final int SPORTSOTHER_STRENGTH_TRAINING_VALUE = 14;
        public static final int SPORTSOTHER_STRETCHING_VALUE = 15;
        public static final int SPORTSOTHER_SYNCHRONIZED_SWIMMING_VALUE = 65;
        public static final int SPORTSOTHER_TAEKWONDO_VALUE = 50;
        public static final int SPORTSOTHER_TAI_CHI_VALUE = 48;
        public static final int SPORTSOTHER_TENNIS_VALUE = 94;
        public static final int SPORTSOTHER_TRACK_AND_FIELD_VALUE = 108;
        public static final int SPORTSOTHER_TRIATHLON_VALUE = 112;
        public static final int SPORTSOTHER_TUG_OF_WAR_VALUE = 104;
        public static final int SPORTSOTHER_UPPER_LIMB_TRAINING_VALUE = 84;
        public static final int SPORTSOTHER_VOLLEYBALL_VALUE = 34;
        public static final int SPORTSOTHER_WAIST_AND_ABDOMEN_TRAINING_VALUE = 86;
        public static final int SPORTSOTHER_WALL_BALL_VALUE = 76;
        public static final int SPORTSOTHER_WATER_POLO_VALUE = 57;
        public static final int SPORTSOTHER_WATER_SKIING_VALUE = 59;
        public static final int SPORTSOTHER_WATER_SPORTS_VALUE = 58;
        public static final int SPORTSOTHER_WEIGHTLIFTING_VALUE = 79;
        public static final int SPORTSOTHER_WRESTLING_VALUE = 47;
        public static final int SPORTSOTHER_YOGA_VALUE = 24;
        public static final int SPORTSOTHER_ZUMBA_VALUE = 42;
        private static final SESportsOtherTag[] VALUES;
        private static final Internal.EnumLiteMap<SESportsOtherTag> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SESportsOtherTag$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SESportsOtherTag> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SESportsOtherTag findValueByNumber(int i7) {
                return SESportsOtherTag.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportsOtherTag");
            internalValueMap = new Internal.EnumLiteMap<SESportsOtherTag>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SESportsOtherTag.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESportsOtherTag findValueByNumber(int i7) {
                    return SESportsOtherTag.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SESportsOtherTag(int i7) {
            this.value = i7;
        }

        public static SESportsOtherTag forNumber(int i7) {
            switch (i7) {
                case 0:
                    return SPORTSOTHER_BASKETBALL;
                case 1:
                    return SPORTSOTHER_FOOTBALL;
                case 2:
                    return SPORTSOTHER_PINGPONG;
                case 3:
                    return SPORTSOTHER_BADMINTON;
                case 4:
                    return SPORTSOTHER_OUTDOOR_HIKING;
                case 5:
                    return SPORTSOTHER_BMX;
                case 6:
                    return SPORTSOTHER_HUNTING;
                case 7:
                    return SPORTSOTHER_SAILING;
                case 8:
                    return SPORTSOTHER_SKATEBOARDING;
                case 9:
                    return SPORTSOTHER_ROLLER_SKATING;
                case 10:
                    return SPORTSOTHER_OUTDOORSKATING;
                case 11:
                    return SPORTSOTHER_EQUESTRIAN;
                case 12:
                    return SPORTSOTHER_CORE_TRAINING;
                case 13:
                    return SPORTSOTHER_MIXED_AEROBICS;
                case 14:
                    return SPORTSOTHER_STRENGTH_TRAINING;
                case 15:
                    return SPORTSOTHER_STRETCHING;
                case 16:
                    return SPORTSOTHER_CLIMBING_MACHINE;
                case 17:
                    return SPORTSOTHER_PILATES;
                case 18:
                    return SPORTSOTHER_FLEXIBILITY_TRAINING;
                case 19:
                    return SPORTSOTHER_INDOOR_FITNESS;
                case 20:
                    return SPORTSOTHER_STEPPER;
                case 21:
                    return SPORTSOTHER_STEP_TRAINING;
                case 22:
                    return SPORTSOTHER_GYMNASTICS;
                case 23:
                    return SPORTSOTHER_ELLIPTICAL_MACHINE;
                case 24:
                    return SPORTSOTHER_YOGA;
                case 25:
                    return SPORTSOTHER_FISHING;
                case 26:
                    return SPORTSOTHER_CURLING;
                case 27:
                    return SPORTSOTHER_INDOOR_SKATING;
                case 28:
                    return SPORTSOTHER_CRICKET;
                case 29:
                    return SPORTSOTHER_BASEBALL;
                case 30:
                    return SPORTSOTHER_BOWLING;
                case 31:
                    return SPORTSOTHER_SQUASH;
                case 32:
                    return SPORTSOTHER_SOFTBALL;
                case 33:
                    return SPORTSOTHER_CROQUET;
                case 34:
                    return SPORTSOTHER_VOLLEYBALL;
                case 35:
                    return SPORTSOTHER_HANDBALL;
                case 36:
                    return SPORTSOTHER_BALLET;
                case 37:
                    return SPORTSOTHER_BELLY_DANCE;
                case 38:
                    return SPORTSOTHER_SQUARE_DANCE;
                case 39:
                    return SPORTSOTHER_STREET_DANCE;
                case 40:
                    return SPORTSOTHER_BALLROOM_DANCING;
                case 41:
                    return SPORTSOTHER_DANCE;
                case 42:
                    return SPORTSOTHER_ZUMBA;
                case 43:
                    return SPORTSOTHER_KENDO;
                case 44:
                    return SPORTSOTHER_KARATE;
                case 45:
                    return SPORTSOTHER_BOXING;
                case 46:
                    return SPORTSOTHER_JUDO;
                case 47:
                    return SPORTSOTHER_WRESTLING;
                case 48:
                    return SPORTSOTHER_TAI_CHI;
                case 49:
                    return SPORTSOTHER_MUAY_THAI;
                case 50:
                    return SPORTSOTHER_TAEKWONDO;
                case 51:
                    return SPORTSOTHER_MARTIAL_ARTS;
                case 52:
                    return SPORTSOTHER_FREE_SPARRING;
                case 53:
                    return SPORTSOTHER_HIGH_INTENSITY_INTERVAL_TRAINING;
                case 54:
                    return SPORTSOTHER_ARCHERY;
                case 55:
                    return SPORTSOTHER_INDOOR_RUNNING;
                case 56:
                    return SPORTSOTHER_PADDLE_BOARD;
                case 57:
                    return SPORTSOTHER_WATER_POLO;
                case 58:
                    return SPORTSOTHER_WATER_SPORTS;
                case 59:
                    return SPORTSOTHER_WATER_SKIING;
                case 60:
                    return SPORTSOTHER_KAYAKING;
                case 61:
                    return SPORTSOTHER_KAYAK_RAFTING;
                case 62:
                    return SPORTSOTHER_MOTORBOAT;
                case 63:
                    return SPORTSOTHER_FIN_SWIMMING;
                case 64:
                    return SPORTSOTHER_DIVING;
                case 65:
                    return SPORTSOTHER_SYNCHRONIZED_SWIMMING;
                case 66:
                    return SPORTSOTHER_SNORKELING;
                case 67:
                    return SPORTSOTHER_KITE_SURFING;
                case 68:
                    return SPORTSOTHER_ROCK_CLIMBING;
                case 69:
                    return SPORTSOTHER_PARKOUR;
                case 70:
                    return SPORTSOTHER_ATV;
                case 71:
                    return SPORTSOTHER_PARAGLIDER;
                case 72:
                    return SPORTSOTHER_CLIMB_THE_STAIRS;
                case 73:
                    return SPORTSOTHER_CROSS_TRAINING_CROSSFIT;
                case 74:
                    return SPORTSOTHER_AEROBICS;
                case 75:
                    return SPORTSOTHER_PHYSICAL_TRAINING;
                case 76:
                    return SPORTSOTHER_WALL_BALL;
                case 77:
                    return SPORTSOTHER_DUMBBELL_TRAINING;
                case 78:
                    return SPORTSOTHER_BARBELL_TRAINING;
                case 79:
                    return SPORTSOTHER_WEIGHTLIFTING;
                case 80:
                    return SPORTSOTHER_DEADLIFT;
                case 81:
                    return SPORTSOTHER_BOBBY_JUMP;
                case 82:
                    return SPORTSOTHER_SIT_UPS;
                case 83:
                    return SPORTSOTHER_FUNCTIONAL_TRAINING;
                case 84:
                    return SPORTSOTHER_UPPER_LIMB_TRAINING;
                case 85:
                    return SPORTSOTHER_LOWER_LIMB_TRAINING;
                case 86:
                    return SPORTSOTHER_WAIST_AND_ABDOMEN_TRAINING;
                case 87:
                    return SPORTSOTHER_BACK_TRAINING;
                case 88:
                    return SPORTSOTHER_NATIONAL_DANCE;
                case 89:
                    return SPORTSOTHER_JAZZ;
                case 90:
                    return SPORTSOTHER_LATIN_DANCE;
                case 91:
                    return SPORTSOTHER_FENCING;
                case 92:
                    return SPORTSOTHER_RUGBY;
                case 93:
                    return SPORTSOTHER_HOCKEY;
                case 94:
                    return SPORTSOTHER_TENNIS;
                case 95:
                    return SPORTSOTHER_BILLIARDS;
                case 96:
                    return SPORTSOTHER_SHUTTLECOCK;
                case 97:
                    return SPORTSOTHER_SEPAK_TAKRAW;
                case 98:
                    return SPORTSOTHER_SNOW_SPORTS;
                case 99:
                    return SPORTSOTHER_SNOWMOBILE;
                case 100:
                    return SPORTSOTHER_PUCK;
                case 101:
                    return SPORTSOTHER_SNOW_CAR;
                case 102:
                    return SPORTSOTHER_SLED;
                case 103:
                    return SPORTSOTHER_DARTS;
                case 104:
                    return SPORTSOTHER_TUG_OF_WAR;
                case 105:
                    return SPORTSOTHER_HULA_HOOP;
                case 106:
                    return SPORTSOTHER_FLY_A_KITE;
                case 107:
                    return SPORTSOTHER_FRISBEE;
                case 108:
                    return SPORTSOTHER_TRACK_AND_FIELD;
                case 109:
                    return SPORTSOTHER_RACING_CAR;
                case 110:
                    return SPORTSOTHER_ROWING_MACHINE;
                case 111:
                    return SPORTSOTHER_ROPE_SKIPPING;
                case 112:
                    return SPORTSOTHER_TRIATHLON;
                case 113:
                    return SPORTSOTHER_MOUNTAIN_BIKE;
                case 114:
                    return SPORTSOTHER_KICK_BOXING;
                case 115:
                    return SPORTSOTHER_SKIING;
                case 116:
                    return SPORTSOTHER_CROSS_COUNTRY_SKIING;
                case 117:
                    return SPORTSOTHER_SKI;
                case 118:
                    return SPORTSOTHER_ALPINR_SKIING;
                case 119:
                    return SPORTSOTHER_SKI_DOUBLE_BOARD;
                case 120:
                    return SPORTSOTHER_FLOOR_EXERCISE;
                case 121:
                    return SPORTSOTHER_PADDLE_SURFING;
                case 122:
                    return SPORTSOTHER_KABADDI;
                case 123:
                    return SPORTSOTHER_POOL_SWIMMING;
                case 124:
                    return SPORTSOTHER_OPEN_WATER;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return MicroFunctionProtos.getDescriptor().getEnumType(7);
        }

        public static Internal.EnumLiteMap<SESportsOtherTag> internalGetValueMap() {
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
        public static SESportsOtherTag valueOf(int i7) {
            return forNumber(i7);
        }

        public static SESportsOtherTag valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEWidget extends GeneratedMessage implements SEWidgetOrBuilder {
        private static final SEWidget DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 2;
        public static final int FUNCTION_FIELD_NUMBER = 1;
        public static final int HAVE_HIDE_FIELD_NUMBER = 4;
        public static final int ORDER_FIELD_NUMBER = 3;
        private static final Parser<SEWidget> PARSER;
        public static final int SORTABLE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enable_;
        private int function_;
        private boolean haveHide_;
        private byte memoizedIsInitialized;
        private int order_;
        private boolean sortable_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEWidget$1 */
        public class AnonymousClass1 extends AbstractParser<SEWidget> {
            @Override // com.google.protobuf.Parser
            public SEWidget parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEWidget.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWidgetOrBuilder {
            private int bitField0_;
            private boolean enable_;
            private int function_;
            private boolean haveHide_;
            private int order_;
            private boolean sortable_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, h hVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWidget sEWidget) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWidget.function_ = this.function_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWidget.enable_ = this.enable_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEWidget.order_ = this.order_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEWidget.haveHide_ = this.haveHide_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEWidget.sortable_ = this.sortable_;
                    i7 |= 16;
                }
                sEWidget.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MicroFunctionProtos.internal_static_SEWidget_descriptor;
            }

            public Builder clearEnable() {
                this.bitField0_ &= -3;
                this.enable_ = false;
                onChanged();
                return this;
            }

            public Builder clearFunction() {
                this.bitField0_ &= -2;
                this.function_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHaveHide() {
                this.bitField0_ &= -9;
                this.haveHide_ = false;
                onChanged();
                return this;
            }

            public Builder clearOrder() {
                this.bitField0_ &= -5;
                this.order_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSortable() {
                this.bitField0_ &= -17;
                this.sortable_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MicroFunctionProtos.internal_static_SEWidget_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public boolean getEnable() {
                return this.enable_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public int getFunction() {
                return this.function_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public boolean getHaveHide() {
                return this.haveHide_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public int getOrder() {
                return this.order_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public boolean getSortable() {
                return this.sortable_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public boolean hasEnable() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public boolean hasFunction() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public boolean hasHaveHide() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public boolean hasOrder() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
            public boolean hasSortable() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return MicroFunctionProtos.internal_static_SEWidget_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWidget.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFunction() && hasEnable();
            }

            public Builder setEnable(boolean z6) {
                this.enable_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFunction(int i7) {
                this.function_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setHaveHide(boolean z6) {
                this.haveHide_ = z6;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setOrder(int i7) {
                this.order_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSortable(boolean z6) {
                this.sortable_ = z6;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(h hVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWidget build() {
                SEWidget sEWidgetBuildPartial = buildPartial();
                if (sEWidgetBuildPartial.isInitialized()) {
                    return sEWidgetBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWidgetBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWidget buildPartial() {
                SEWidget sEWidget = new SEWidget(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWidget);
                }
                onBuilt();
                return sEWidget;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWidget getDefaultInstanceForType() {
                return SEWidget.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.function_ = 0;
                this.enable_ = false;
                this.order_ = 0;
                this.haveHide_ = false;
                this.sortable_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWidget) {
                    return mergeFrom((SEWidget) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEWidget sEWidget) {
                if (sEWidget == SEWidget.getDefaultInstance()) {
                    return this;
                }
                if (sEWidget.hasFunction()) {
                    setFunction(sEWidget.getFunction());
                }
                if (sEWidget.hasEnable()) {
                    setEnable(sEWidget.getEnable());
                }
                if (sEWidget.hasOrder()) {
                    setOrder(sEWidget.getOrder());
                }
                if (sEWidget.hasHaveHide()) {
                    setHaveHide(sEWidget.getHaveHide());
                }
                if (sEWidget.hasSortable()) {
                    setSortable(sEWidget.getSortable());
                }
                mergeUnknownFields(sEWidget.getUnknownFields());
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
                                    this.function_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.enable_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.order_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.haveHide_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag != 40) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.sortable_ = codedInputStream.readBool();
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEWidget> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.MicroFunctionProtos$SEWidget$SEList$1 */
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
                private RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> listBuilder_;
                private List<SEWidget> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, h hVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return MicroFunctionProtos.internal_static_SEWidget_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEWidget> iterable) {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEWidget sEWidget) {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEWidget);
                        return this;
                    }
                    sEWidget.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEWidget);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEWidget.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return MicroFunctionProtos.internal_static_SEWidget_SEList_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
                public SEWidget getList(int i7) {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEWidget) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
                public List<SEWidget> getListList() {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
                public SEWidgetOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEWidgetOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
                public List<? extends SEWidgetOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return MicroFunctionProtos.internal_static_SEWidget_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEWidget sEWidget) {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEWidget);
                        return this;
                    }
                    sEWidget.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEWidget);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(h hVar) {
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEWidget.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEWidget sEWidget) {
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEWidget.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEWidget);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEWidget);
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
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEWidget sEWidget = (SEWidget) codedInputStream.readMessage(SEWidget.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEWidget, Builder, SEWidgetOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEWidget);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEWidget);
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
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, h hVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MicroFunctionProtos.internal_static_SEWidget_SEList_descriptor;
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
                return MicroFunctionProtos.internal_static_SEWidget_SEList_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
            public SEWidget getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
            public List<SEWidget> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
            public SEWidgetOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.SEListOrBuilder
            public List<? extends SEWidgetOrBuilder> getListOrBuilderList() {
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
                return MicroFunctionProtos.internal_static_SEWidget_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
            SEWidget getList(int i7);

            int getListCount();

            List<SEWidget> getListList();

            SEWidgetOrBuilder getListOrBuilder(int i7);

            List<? extends SEWidgetOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWidget");
            DEFAULT_INSTANCE = new SEWidget();
            PARSER = new AbstractParser<SEWidget>() { // from class: com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidget.1
                @Override // com.google.protobuf.Parser
                public SEWidget parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWidget.newBuilder();
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

        public /* synthetic */ SEWidget(GeneratedMessage.Builder builder, h hVar) {
            this(builder);
        }

        public static SEWidget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MicroFunctionProtos.internal_static_SEWidget_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWidget parseDelimitedFrom(InputStream inputStream) {
            return (SEWidget) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWidget parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWidget> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWidget)) {
                return super.equals(obj);
            }
            SEWidget sEWidget = (SEWidget) obj;
            if (hasFunction() != sEWidget.hasFunction()) {
                return false;
            }
            if ((hasFunction() && getFunction() != sEWidget.getFunction()) || hasEnable() != sEWidget.hasEnable()) {
                return false;
            }
            if ((hasEnable() && getEnable() != sEWidget.getEnable()) || hasOrder() != sEWidget.hasOrder()) {
                return false;
            }
            if ((hasOrder() && getOrder() != sEWidget.getOrder()) || hasHaveHide() != sEWidget.hasHaveHide()) {
                return false;
            }
            if ((!hasHaveHide() || getHaveHide() == sEWidget.getHaveHide()) && hasSortable() == sEWidget.hasSortable()) {
                return (!hasSortable() || getSortable() == sEWidget.getSortable()) && getUnknownFields().equals(sEWidget.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return MicroFunctionProtos.internal_static_SEWidget_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public boolean getEnable() {
            return this.enable_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public int getFunction() {
            return this.function_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public boolean getHaveHide() {
            return this.haveHide_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public int getOrder() {
            return this.order_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWidget> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.function_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.enable_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.order_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(4, this.haveHide_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(5, this.sortable_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public boolean getSortable() {
            return this.sortable_;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public boolean hasEnable() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public boolean hasFunction() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public boolean hasHaveHide() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public boolean hasOrder() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.MicroFunctionProtos.SEWidgetOrBuilder
        public boolean hasSortable() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasFunction()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFunction();
            }
            if (hasEnable()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getEnable());
            }
            if (hasOrder()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getOrder();
            }
            if (hasHaveHide()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashBoolean(getHaveHide());
            }
            if (hasSortable()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getSortable());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return MicroFunctionProtos.internal_static_SEWidget_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWidget.class, Builder.class);
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
            if (!hasFunction()) {
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.function_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.enable_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.order_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.haveHide_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.sortable_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWidget(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.function_ = 0;
            this.enable_ = false;
            this.order_ = 0;
            this.haveHide_ = false;
            this.sortable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWidget sEWidget) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWidget);
        }

        public static SEWidget parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWidget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWidget) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWidget parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWidget getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWidget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWidget parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWidget parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWidget parseFrom(InputStream inputStream) {
            return (SEWidget) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEWidget() {
            this.function_ = 0;
            this.enable_ = false;
            this.order_ = 0;
            this.haveHide_ = false;
            this.sortable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEWidget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWidget) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWidget parseFrom(CodedInputStream codedInputStream) {
            return (SEWidget) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWidget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWidget) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWidgetOrBuilder extends MessageOrBuilder {
        boolean getEnable();

        int getFunction();

        boolean getHaveHide();

        int getOrder();

        boolean getSortable();

        boolean hasEnable();

        boolean hasFunction();

        boolean hasHaveHide();

        boolean hasOrder();

        boolean hasSortable();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "MicroFunctionProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013MicroFunction.proto\u001a\fnanopb.proto\u001a\fCommon.proto\u001a\fDevice.proto\u001a\u0011SettingMenu.proto\"§\u0005\n\u000fSEMicroFunction\u0012+\n\u000ffind_phone_mode\u0018\u0001 \u0001(\u000e2\u0010.SEFindPhoneModeH\u0000\u0012,\n\u000fphotograph_mode\u0018\u0002 \u0001(\u000e2\u0011.SEPhotographModeH\u0000\u0012+\n\u000fbasic_data_mode\u0018\u0003 \u0001(\u000e2\u0010.SEBasicDataModeH\u0000\u0012\"\n\nbasic_data\u0018\u0004 \u0001(\u000b2\f.SEBasicDataH\u0000\u0012'\n\u000bwidget_list\u0018\u0005 \u0001(\u000b2\u0010.SEWidget.SEListH\u0000\u0012,\n\u0010application_list\u0018\u0006 \u0001(\u000b2\u0010.SEWidget.SEListH\u0000\u0012-\n\u0011quick_widget_list\u0018\u0007 \u0001(\u000b2\u0010.SEWidget.SEListH\u0000\u0012+\n\u000fsport_icon_list\u0018\b \u0001(\u000b2\u0010.SEWidget.SEListH\u0000\u0012,\n\u0010sport_other_list\u0018\t \u0001(\u000b2\u0010.SEWidget.SEListH\u0000\u00124\n\u0018sport_icon_infowear_list\u0018\n \u0001(\u000b2\u0010.SEWidget.SEListH\u0000\u0012\u001e\n\rnfc_sleep_err\u0018\u000b \u0001(\rB\u0005\u0092?\u00028\bH\u0000\u0012'\n\u0016inquiry_wearing_status\u0018\f \u0001(\rB\u0005\u0092?\u00028\bH\u0000\u0012'\n\u0016request_wearing_result\u0018\r \u0001(\rB\u0005\u0092?\u00028\bH\u0000\u0012&\n\fsleep_status\u0018\u000e \u0001(\u000b2\u000e.SESleepStatusH\u0000\u0012,\n\u000fsar_calibration\u0018\u000f \u0001(\u000b2\u0011.SESarCalibrationH\u0000B\t\n\u0007payload\"÷\u0006\n\u000bSEBasicData\u0012\r\n\u0005steps\u0018\u0001 \u0002(\r\u0012\u0017\n\bcalories\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0010\n\bdistance\u0018\u0003 \u0001(\r\u0012\u0019\n\nheart_rate\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001b\n\fblood_oxygen\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\u0012!\n\u0012effective_standing\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\b\u00125\n\u0015device_battery_status\u0018\u0007 \u0001(\u000b2\u0016.SEDeviceBatteryStatus\u0012&\n\u0017effective_standing_hour\u0018\b \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001d\n\u000esleep_duration\u0018\t \u0001(\rB\u0005\u0092?\u00028\u0010\u00122\n\u0013physiological_cycle\u0018\n \u0001(\u000b2\u0015.SEPhysiologicalCycle\u0012\u0017\n\bHBA_data\u0018\u000b \u0001(\rB\u0005\u0092?\u00028\u0010\u0012 \n\u0011activity_duration\u0018\f \u0001(\rB\u0005\u0092?\u00028 \u0012\u0017\n\bpressure\u0018\r \u0001(\rB\u0005\u0092?\u00028\b\u0012&\n\u0017today_oura_calorie_data\u0018\u000e \u0001(\rB\u0005\u0092?\u00028 \u0012'\n\u0018today_sport_calorie_data\u0018\u000f \u0001(\rB\u0005\u0092?\u00028 \u0012\u0019\n\nsteps_data\u0018\u0010 \u0001(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rdistance_data\u0018\u0011 \u0001(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u001b\n\fcalorie_data\u0018\u0012 \u0001(\fB\u0005\u0092?\u0002\u0018\u0004\u0012-\n\u001etoday_oura_calorie_hourly_data\u0018\u0013 \u0001(\fB\u0005\u0092?\u0002\u0018\u0004\u0012.\n\u001ftoday_sport_calorie_hourly_data\u0018\u0014 \u0001(\fB\u0005\u0092?\u0002\u0018\u0004\u0012@\n\u001bdevice_charging_case_status\u0018\u0015 \u0001(\u000b2\u001b.SEDeviceChargingCaseStatus\u0012\u0018\n\tsar_gdiff\u0018\u0016 \u0001(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rnfc_sleep_err\u0018\u0017 \u0001(\rB\u0005\u0092?\u00028\b\u0012&\n\u0017fully_charged_need_time\u0018\u0018 \u0001(\rB\u0005\u0092?\u00028 \u0012%\n\u0016remaining_battery_time\u0018\u0019 \u0001(\rB\u0005\u0092?\u00028 \"\u0098\u0001\n\bSEWidget\u0012\u0017\n\bfunction\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u000e\n\u0006enable\u0018\u0002 \u0002(\b\u0012\u0014\n\u0005order\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u0011\n\thave_hide\u0018\u0004 \u0001(\b\u0012\u0010\n\bsortable\u0018\u0005 \u0001(\b\u001a(\n\u0006SEList\u0012\u001e\n\u0004list\u0018\u0001 \u0003(\u000b2\t.SEWidgetB\u0005\u0092?\u0002\u0018\u0004\"4\n\rSESleepStatus\u0012#\n\u0014invalid_sleep_reason\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\"d\n\u0010SESarCalibration\u0012\u0018\n\tsar_daiff\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028 \u0012\u0019\n\nsar_offset\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028 \u0012\u001b\n\fsar_basedata\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028 *0\n\u000fSEFindPhoneMode\u0012\u000e\n\nFIND_START\u0010\u0000\u0012\r\n\tFIND_STOP\u0010\u0001*P\n\u0010SEPhotographMode\u0012\u0014\n\u0010PHOTOGRAPH_START\u0010\u0000\u0012\u0013\n\u000fPHOTOGRAPH_STOP\u0010\u0001\u0012\u0011\n\rPHOTOGRAPHING\u0010\u0002*<\n\u000fSEBasicDataMode\u0012\u0014\n\u0010BASIC_DATA_START\u0010\u0000\u0012\u0013\n\u000fBASIC_DATA_STOP\u0010\u0001*¢\u0006\n\rSEFunctionTag\u0012\u001b\n\u0017FUNCTION_SPORT_WORKOUTS\u0010\u0000\u0012\u0019\n\u0015FUNCTION_SPORT_RECORD\u0010\u0001\u0012\u0015\n\u0011FUNCTION_ACTIVITY\u0010\u0002\u0012\u0017\n\u0013FUNCTION_HEART_RATE\u0010\u0003\u0012\u0012\n\u000eFUNCTION_SLEEP\u0010\u0004\u0012\u0011\n\rFUNCTION_SPO2\u0010\u0005\u0012\u0012\n\u000eFUNCTION_ALARM\u0010\u0006\u0012\u0016\n\u0012FUNCTION_REMINDERS\u0010\u0007\u0012\u0016\n\u0012FUNCTION_STOPWATCH\u0010\b\u0012\u0012\n\u000eFUNCTION_TIMER\u0010\t\u0012\u0012\n\u000eFUNCTION_MUSIC\u0010\n\u0012\u0014\n\u0010FUNCTION_WEATHER\u0010\u000b\u0012\u0014\n\u0010FUNCTION_BREATHE\u0010\f\u0012\u0019\n\u0015FUNCTION_NOTIFICATION\u0010\r\u0012\u0017\n\u0013FUNCTION_FIND_PHONE\u0010\u000e\u0012\u0015\n\u0011FUNCTION_SETTINGS\u0010\u000f\u0012\u001c\n\u0018FUNCTION_MENSTRUAL_CYCLE\u0010\u0010\u0012\u0013\n\u000fFUNCTION_STRESS\u0010\u0011\u0012\u0018\n\u0014FUNCTION_WORLD_CLOCK\u0010\u0012\u0012\u0013\n\u000fFUNCTION_STOCKS\u0010\u0013\u0012\u0019\n\u0015FUNCTION_AIR_PRESSURE\u0010\u0014\u0012\u0014\n\u0010FUNCTION_COMPASS\u0010\u0015\u0012\u0010\n\fFUNCTION_ECG\u0010\u0016\u0012\u0018\n\u0014FUNCTION_TEMPERATURE\u0010\u0017\u0012\u0012\n\u000eFUNCTION_PHONE\u0010\u0018\u0012\u0015\n\u0011FUNCTION_CONTACTS\u0010\u0019\u0012\u001e\n\u001aFUNCTION_FREQUENT_CONTACTS\u0010\u001a\u0012\u0017\n\u0013FUNCTION_PHOTOGRAGH\u0010\u001b\u0012\u0013\n\u000fFUNCTION_ALIPAY\u0010\u001c\u0012\u001d\n\u0019FUNCTION_QR_CODE_DOWNLOAD\u0010\u001d\u0012\u0014\n\u0010FUNCTION_DIAIPAD\u0010\u001e\u0012\u0019\n\u0015FUNCTION_CALL_RECORDS\u0010\u001f\u0012\u0017\n\u0013FUNCTION_QUICK_CARD\u0010 *Î\u0006\n\u0010SEApplicationTag\u0012\u001e\n\u001aAPPLICATION_SPORT_WORKOUTS\u0010\u0000\u0012\u001c\n\u0018APPLICATION_SPORT_RECORD\u0010\u0001\u0012\u0018\n\u0014APPLICATION_ACTIVITY\u0010\u0002\u0012\u001a\n\u0016APPLICATION_HEART_RATE\u0010\u0003\u0012\u0015\n\u0011APPLICATION_SLEEP\u0010\u0004\u0012\u0014\n\u0010APPLICATION_SPO2\u0010\u0005\u0012\u0015\n\u0011APPLICATION_ALARM\u0010\u0006\u0012\u0019\n\u0015APPLICATION_REMINDERS\u0010\u0007\u0012\u0019\n\u0015APPLICATION_STOPWATCH\u0010\b\u0012\u0015\n\u0011APPLICATION_TIMER\u0010\t\u0012\u0015\n\u0011APPLICATION_MUSIC\u0010\n\u0012\u0017\n\u0013APPLICATION_WEATHER\u0010\u000b\u0012\u0017\n\u0013APPLICATION_BREATHE\u0010\f\u0012\u001c\n\u0018APPLICATION_NOTIFICATION\u0010\r\u0012\u001a\n\u0016APPLICATION_FIND_PHONE\u0010\u000e\u0012\u0018\n\u0014APPLICATION_SETTINGS\u0010\u000f\u0012\u001f\n\u001bAPPLICATION_MENSTRUAL_CYCLE\u0010\u0010\u0012\u0016\n\u0012APPLICATION_STRESS\u0010\u0011\u0012\u001b\n\u0017APPLICATION_WORLD_CLOCK\u0010\u0012\u0012\u0016\n\u0012APPLICATION_STOCKS\u0010\u0013\u0012\u001c\n\u0018APPLICATION_AIR_PRESSURE\u0010\u0014\u0012\u0017\n\u0013APPLICATION_COMPASS\u0010\u0015\u0012\u0013\n\u000fAPPLICATION_ECG\u0010\u0016\u0012\u001b\n\u0017APPLICATION_TEMPERATURE\u0010\u0017\u0012\u0015\n\u0011APPLICATION_PHONE\u0010\u0018\u0012\u0018\n\u0014APPLICATION_CONTACTS\u0010\u0019\u0012!\n\u001dAPPLICATION_FREQUENT_CONTACTS\u0010\u001a\u0012\u001a\n\u0016APPLICATION_PHOTOGRAGH\u0010\u001b\u0012\u0017\n\u0013APPLICATION_DIAIPAD\u0010\u001c\u0012\u001c\n\u0018APPLICATION_CALL_RECORDS\u0010\u001d\u0012\u001a\n\u0016APPLICATION_FLASHLIGHT\u0010\u001e*Î\u0006\n\u0010SEQuickWidgetTag\u0012\u001e\n\u001aQUICKWIDGET_SPORT_WORKOUTS\u0010\u0000\u0012\u001c\n\u0018QUICKWIDGET_SPORT_RECORD\u0010\u0001\u0012\u0018\n\u0014QUICKWIDGET_ACTIVITY\u0010\u0002\u0012\u001a\n\u0016QUICKWIDGET_HEART_RATE\u0010\u0003\u0012\u0015\n\u0011QUICKWIDGET_SLEEP\u0010\u0004\u0012\u0014\n\u0010QUICKWIDGET_SPO2\u0010\u0005\u0012\u0015\n\u0011QUICKWIDGET_ALARM\u0010\u0006\u0012\u0019\n\u0015QUICKWIDGET_REMINDERS\u0010\u0007\u0012\u0019\n\u0015QUICKWIDGET_STOPWATCH\u0010\b\u0012\u0015\n\u0011QUICKWIDGET_TIMER\u0010\t\u0012\u0015\n\u0011QUICKWIDGET_MUSIC\u0010\n\u0012\u0017\n\u0013QUICKWIDGET_WEATHER\u0010\u000b\u0012\u0017\n\u0013QUICKWIDGET_BREATHE\u0010\f\u0012\u001c\n\u0018QUICKWIDGET_NOTIFICATION\u0010\r\u0012\u001a\n\u0016QUICKWIDGET_FIND_PHONE\u0010\u000e\u0012\u0018\n\u0014QUICKWIDGET_SETTINGS\u0010\u000f\u0012\u001f\n\u001bQUICKWIDGET_MENSTRUAL_CYCLE\u0010\u0010\u0012\u0016\n\u0012QUICKWIDGET_STRESS\u0010\u0011\u0012\u001b\n\u0017QUICKWIDGET_WORLD_CLOCK\u0010\u0012\u0012\u0016\n\u0012QUICKWIDGET_STOCKS\u0010\u0013\u0012\u001c\n\u0018QUICKWIDGET_AIR_PRESSURE\u0010\u0014\u0012\u0017\n\u0013QUICKWIDGET_COMPASS\u0010\u0015\u0012\u0013\n\u000fQUICKWIDGET_ECG\u0010\u0016\u0012\u001b\n\u0017QUICKWIDGET_TEMPERATURE\u0010\u0017\u0012\u0015\n\u0011QUICKWIDGET_PHONE\u0010\u0018\u0012\u0018\n\u0014QUICKWIDGET_CONTACTS\u0010\u0019\u0012!\n\u001dQUICKWIDGET_FREQUENT_CONTACTS\u0010\u001a\u0012\u001a\n\u0016QUICKWIDGET_PHOTOGRAGH\u0010\u001b\u0012\u0017\n\u0013QUICKWIDGET_DIAIPAD\u0010\u001c\u0012\u001c\n\u0018QUICKWIDGET_CALL_RECORDS\u0010\u001d\u0012\u001a\n\u0016QUICKWIDGET_FLASHLIGHT\u0010\u001e*ó\u0001\n\u000fSESportsIconTag\u0012\u001a\n\u0016SPORTSICON_RUN_OUTDOOR\u0010\u0000\u0012\u001b\n\u0017SPORTSICON_WALK_OUTDOOR\u0010\u0001\u0012\u0019\n\u0015SPORTSICON_RUN_INDOOR\u0010\u0002\u0012\u0017\n\u0013SPORTSICON_CLIMBING\u0010\u0003\u0012\u001c\n\u0018SPORTSICON_CROSS_COUNTRY\u0010\u0004\u0012\u001b\n\u0017SPORTSICON_RIDE_OUTDOOR\u0010\u0005\u0012\u001a\n\u0016SPORTSICON_RIDE_INDOOR\u0010\u0006\u0012\u001c\n\u0018SPORTSICON_FREE_TRAINING\u0010\u0007*\u009b\u001c\n\u0010SESportsOtherTag\u0012\u001a\n\u0016SPORTSOTHER_BASKETBALL\u0010\u0000\u0012\u0018\n\u0014SPORTSOTHER_FOOTBALL\u0010\u0001\u0012\u0018\n\u0014SPORTSOTHER_PINGPONG\u0010\u0002\u0012\u0019\n\u0015SPORTSOTHER_BADMINTON\u0010\u0003\u0012\u001e\n\u001aSPORTSOTHER_OUTDOOR_HIKING\u0010\u0004\u0012\u0013\n\u000fSPORTSOTHER_BMX\u0010\u0005\u0012\u0017\n\u0013SPORTSOTHER_HUNTING\u0010\u0006\u0012\u0017\n\u0013SPORTSOTHER_SAILING\u0010\u0007\u0012\u001d\n\u0019SPORTSOTHER_SKATEBOARDING\u0010\b\u0012\u001e\n\u001aSPORTSOTHER_ROLLER_SKATING\u0010\t\u0012\u001e\n\u001aSPORTSOTHER_OUTDOORSKATING\u0010\n\u0012\u001a\n\u0016SPORTSOTHER_EQUESTRIAN\u0010\u000b\u0012\u001d\n\u0019SPORTSOTHER_CORE_TRAINING\u0010\f\u0012\u001e\n\u001aSPORTSOTHER_MIXED_AEROBICS\u0010\r\u0012!\n\u001dSPORTSOTHER_STRENGTH_TRAINING\u0010\u000e\u0012\u001a\n\u0016SPORTSOTHER_STRETCHING\u0010\u000f\u0012 \n\u001cSPORTSOTHER_CLIMBING_MACHINE\u0010\u0010\u0012\u0017\n\u0013SPORTSOTHER_PILATES\u0010\u0011\u0012$\n SPORTSOTHER_FLEXIBILITY_TRAINING\u0010\u0012\u0012\u001e\n\u001aSPORTSOTHER_INDOOR_FITNESS\u0010\u0013\u0012\u0017\n\u0013SPORTSOTHER_STEPPER\u0010\u0014\u0012\u001d\n\u0019SPORTSOTHER_STEP_TRAINING\u0010\u0015\u0012\u001a\n\u0016SPORTSOTHER_GYMNASTICS\u0010\u0016\u0012\"\n\u001eSPORTSOTHER_ELLIPTICAL_MACHINE\u0010\u0017\u0012\u0014\n\u0010SPORTSOTHER_YOGA\u0010\u0018\u0012\u0017\n\u0013SPORTSOTHER_FISHING\u0010\u0019\u0012\u0017\n\u0013SPORTSOTHER_CURLING\u0010\u001a\u0012\u001e\n\u001aSPORTSOTHER_INDOOR_SKATING\u0010\u001b\u0012\u0017\n\u0013SPORTSOTHER_CRICKET\u0010\u001c\u0012\u0018\n\u0014SPORTSOTHER_BASEBALL\u0010\u001d\u0012\u0017\n\u0013SPORTSOTHER_BOWLING\u0010\u001e\u0012\u0016\n\u0012SPORTSOTHER_SQUASH\u0010\u001f\u0012\u0018\n\u0014SPORTSOTHER_SOFTBALL\u0010 \u0012\u0017\n\u0013SPORTSOTHER_CROQUET\u0010!\u0012\u001a\n\u0016SPORTSOTHER_VOLLEYBALL\u0010\"\u0012\u0018\n\u0014SPORTSOTHER_HANDBALL\u0010#\u0012\u0016\n\u0012SPORTSOTHER_BALLET\u0010$\u0012\u001b\n\u0017SPORTSOTHER_BELLY_DANCE\u0010%\u0012\u001c\n\u0018SPORTSOTHER_SQUARE_DANCE\u0010&\u0012\u001c\n\u0018SPORTSOTHER_STREET_DANCE\u0010'\u0012 \n\u001cSPORTSOTHER_BALLROOM_DANCING\u0010(\u0012\u0015\n\u0011SPORTSOTHER_DANCE\u0010)\u0012\u0015\n\u0011SPORTSOTHER_ZUMBA\u0010*\u0012\u0015\n\u0011SPORTSOTHER_KENDO\u0010+\u0012\u0016\n\u0012SPORTSOTHER_KARATE\u0010,\u0012\u0016\n\u0012SPORTSOTHER_BOXING\u0010-\u0012\u0014\n\u0010SPORTSOTHER_JUDO\u0010.\u0012\u0019\n\u0015SPORTSOTHER_WRESTLING\u0010/\u0012\u0017\n\u0013SPORTSOTHER_TAI_CHI\u00100\u0012\u0019\n\u0015SPORTSOTHER_MUAY_THAI\u00101\u0012\u0019\n\u0015SPORTSOTHER_TAEKWONDO\u00102\u0012\u001c\n\u0018SPORTSOTHER_MARTIAL_ARTS\u00103\u0012\u001d\n\u0019SPORTSOTHER_FREE_SPARRING\u00104\u00120\n,SPORTSOTHER_HIGH_INTENSITY_INTERVAL_TRAINING\u00105\u0012\u0017\n\u0013SPORTSOTHER_ARCHERY\u00106\u0012\u001e\n\u001aSPORTSOTHER_INDOOR_RUNNING\u00107\u0012\u001c\n\u0018SPORTSOTHER_PADDLE_BOARD\u00108\u0012\u001a\n\u0016SPORTSOTHER_WATER_POLO\u00109\u0012\u001c\n\u0018SPORTSOTHER_WATER_SPORTS\u0010:\u0012\u001c\n\u0018SPORTSOTHER_WATER_SKIING\u0010;\u0012\u0018\n\u0014SPORTSOTHER_KAYAKING\u0010<\u0012\u001d\n\u0019SPORTSOTHER_KAYAK_RAFTING\u0010=\u0012\u0019\n\u0015SPORTSOTHER_MOTORBOAT\u0010>\u0012\u001c\n\u0018SPORTSOTHER_FIN_SWIMMING\u0010?\u0012\u0016\n\u0012SPORTSOTHER_DIVING\u0010@\u0012%\n!SPORTSOTHER_SYNCHRONIZED_SWIMMING\u0010A\u0012\u001a\n\u0016SPORTSOTHER_SNORKELING\u0010B\u0012\u001c\n\u0018SPORTSOTHER_KITE_SURFING\u0010C\u0012\u001d\n\u0019SPORTSOTHER_ROCK_CLIMBING\u0010D\u0012\u0017\n\u0013SPORTSOTHER_PARKOUR\u0010E\u0012\u0013\n\u000fSPORTSOTHER_ATV\u0010F\u0012\u001a\n\u0016SPORTSOTHER_PARAGLIDER\u0010G\u0012 \n\u001cSPORTSOTHER_CLIMB_THE_STAIRS\u0010H\u0012'\n#SPORTSOTHER_CROSS_TRAINING_CROSSFIT\u0010I\u0012\u0018\n\u0014SPORTSOTHER_AEROBICS\u0010J\u0012!\n\u001dSPORTSOTHER_PHYSICAL_TRAINING\u0010K\u0012\u0019\n\u0015SPORTSOTHER_WALL_BALL\u0010L\u0012!\n\u001dSPORTSOTHER_DUMBBELL_TRAINING\u0010M\u0012 \n\u001cSPORTSOTHER_BARBELL_TRAINING\u0010N\u0012\u001d\n\u0019SPORTSOTHER_WEIGHTLIFTING\u0010O\u0012\u0018\n\u0014SPORTSOTHER_DEADLIFT\u0010P\u0012\u001a\n\u0016SPORTSOTHER_BOBBY_JUMP\u0010Q\u0012\u0017\n\u0013SPORTSOTHER_SIT_UPS\u0010R\u0012#\n\u001fSPORTSOTHER_FUNCTIONAL_TRAINING\u0010S\u0012#\n\u001fSPORTSOTHER_UPPER_LIMB_TRAINING\u0010T\u0012#\n\u001fSPORTSOTHER_LOWER_LIMB_TRAINING\u0010U\u0012*\n&SPORTSOTHER_WAIST_AND_ABDOMEN_TRAINING\u0010V\u0012\u001d\n\u0019SPORTSOTHER_BACK_TRAINING\u0010W\u0012\u001e\n\u001aSPORTSOTHER_NATIONAL_DANCE\u0010X\u0012\u0014\n\u0010SPORTSOTHER_JAZZ\u0010Y\u0012\u001b\n\u0017SPORTSOTHER_LATIN_DANCE\u0010Z\u0012\u0017\n\u0013SPORTSOTHER_FENCING\u0010[\u0012\u0015\n\u0011SPORTSOTHER_RUGBY\u0010\\\u0012\u0016\n\u0012SPORTSOTHER_HOCKEY\u0010]\u0012\u0016\n\u0012SPORTSOTHER_TENNIS\u0010^\u0012\u0019\n\u0015SPORTSOTHER_BILLIARDS\u0010_\u0012\u001b\n\u0017SPORTSOTHER_SHUTTLECOCK\u0010`\u0012\u001c\n\u0018SPORTSOTHER_SEPAK_TAKRAW\u0010a\u0012\u001b\n\u0017SPORTSOTHER_SNOW_SPORTS\u0010b\u0012\u001a\n\u0016SPORTSOTHER_SNOWMOBILE\u0010c\u0012\u0014\n\u0010SPORTSOTHER_PUCK\u0010d\u0012\u0018\n\u0014SPORTSOTHER_SNOW_CAR\u0010e\u0012\u0014\n\u0010SPORTSOTHER_SLED\u0010f\u0012\u0015\n\u0011SPORTSOTHER_DARTS\u0010g\u0012\u001a\n\u0016SPORTSOTHER_TUG_OF_WAR\u0010h\u0012\u0019\n\u0015SPORTSOTHER_HULA_HOOP\u0010i\u0012\u001a\n\u0016SPORTSOTHER_FLY_A_KITE\u0010j\u0012\u0017\n\u0013SPORTSOTHER_FRISBEE\u0010k\u0012\u001f\n\u001bSPORTSOTHER_TRACK_AND_FIELD\u0010l\u0012\u001a\n\u0016SPORTSOTHER_RACING_CAR\u0010m\u0012\u001e\n\u001aSPORTSOTHER_ROWING_MACHINE\u0010n\u0012\u001d\n\u0019SPORTSOTHER_ROPE_SKIPPING\u0010o\u0012\u0019\n\u0015SPORTSOTHER_TRIATHLON\u0010p\u0012\u001d\n\u0019SPORTSOTHER_MOUNTAIN_BIKE\u0010q\u0012\u001b\n\u0017SPORTSOTHER_KICK_BOXING\u0010r\u0012\u0016\n\u0012SPORTSOTHER_SKIING\u0010s\u0012$\n SPORTSOTHER_CROSS_COUNTRY_SKIING\u0010t\u0012\u0013\n\u000fSPORTSOTHER_SKI\u0010u\u0012\u001d\n\u0019SPORTSOTHER_ALPINR_SKIING\u0010v\u0012 \n\u001cSPORTSOTHER_SKI_DOUBLE_BOARD\u0010w\u0012\u001e\n\u001aSPORTSOTHER_FLOOR_EXERCISE\u0010x\u0012\u001e\n\u001aSPORTSOTHER_PADDLE_SURFING\u0010y\u0012\u0017\n\u0013SPORTSOTHER_KABADDI\u0010z\u0012\u001d\n\u0019SPORTSOTHER_POOL_SWIMMING\u0010{\u0012\u001a\n\u0016SPORTSOTHER_OPEN_WATER\u0010|*½\u001d\n\u0017SESportsIconInfowearTag\u0012\u0018\n\u0014OUTDOOR_RUNNING_ICON\u0010\u0001\u0012\u0018\n\u0014OUTDOOR_WALKING_ICON\u0010\u0002\u0012\u0017\n\u0013INDOOR_RUNNING_ICON\u0010\u0003\u0012\u0011\n\rTREKKING_ICON\u0010\u0004\u0012\u0012\n\u000eTRAIL_RUN_ICON\u0010\u0005\u0012\u0018\n\u0014OUTDOOR_CYCLING_ICON\u0010\u0006\u0012\u0017\n\u0013INDOOR_CYCLING_ICON\u0010\u0007\u0012\u0012\n\u000eFREESTYLE_ICON\u0010\b\u0012\u0013\n\u000fBASKETBALL_ICON\u0010\t\u0012\u0011\n\rFOOTBALL_ICON\u0010\n\u0012\u0011\n\rPINGPONG_ICON\u0010\u000b\u0012\u0012\n\u000eBADMINTON_ICON\u0010\f\u0012\u0017\n\u0013OUTDOOR_HIKING_ICON\u0010\r\u0012\f\n\bBMX_ICON\u0010\u000e\u0012\u0010\n\fHUNTING_ICON\u0010\u000f\u0012\u0010\n\fSAILING_ICON\u0010\u0010\u0012\u0016\n\u0012SKATEBOARDING_ICON\u0010\u0011\u0012\u0017\n\u0013ROLLER_SKATING_ICON\u0010\u0012\u0012\u0017\n\u0013OUTDOORSKATING_ICON\u0010\u0013\u0012\u0013\n\u000fEQUESTRIAN_ICON\u0010\u0014\u0012\u0018\n\u0014POOL_SWIMMING_L_ICON\u0010\u0015\u0012\u0015\n\u0011OPEN_WATER_L_ICON\u0010\u0016\u0012\u0016\n\u0012CORE_TRAINING_ICON\u0010\u0017\u0012\u0017\n\u0013MIXED_AEROBICS_ICON\u0010\u0018\u0012\u001a\n\u0016STRENGTH_TRAINING_ICON\u0010\u0019\u0012\u0013\n\u000fSTRETCHING_ICON\u0010\u001a\u0012\u0019\n\u0015CLIMBING_MACHINE_ICON\u0010\u001b\u0012\u0010\n\fPILATES_ICON\u0010\u001c\u0012\u001d\n\u0019FLEXIBILITY_TRAINING_ICON\u0010\u001d\u0012\u0017\n\u0013INDOOR_FITNESS_ICON\u0010\u001e\u0012\u0010\n\fSTEPPER_ICON\u0010\u001f\u0012\u0016\n\u0012STEP_TRAINING_ICON\u0010 \u0012\u0013\n\u000fGYMNASTICS_ICON\u0010!\u0012\u001b\n\u0017ELLIPTICAL_MACHINE_ICON\u0010\"\u0012\r\n\tYOGA_ICON\u0010#\u0012\u0010\n\fFISHING_ICON\u0010$\u0012\u0010\n\fCURLING_ICON\u0010%\u0012\u0017\n\u0013INDOOR_SKATING_ICON\u0010&\u0012\u0010\n\fCRICKET_ICON\u0010'\u0012\u0011\n\rBASEBALL_ICON\u0010(\u0012\u0010\n\fBOWLING_ICON\u0010)\u0012\u000f\n\u000bSQUASH_ICON\u0010*\u0012\u0011\n\rSOFTBALL_ICON\u0010+\u0012\u0010\n\fCROQUET_ICON\u0010,\u0012\u0013\n\u000fVOLLEYBALL_ICON\u0010-\u0012\u0011\n\rHANDBALL_ICON\u0010.\u0012\u000f\n\u000bBALLET_ICON\u0010/\u0012\u0014\n\u0010BELLY_DANCE_ICON\u00100\u0012\u0015\n\u0011SQUARE_DANCE_ICON\u00101\u0012\u0015\n\u0011STREET_DANCE_ICON\u00102\u0012\u0019\n\u0015BALLROOM_DANCING_ICON\u00103\u0012\u000e\n\nDANCE_ICON\u00104\u0012\u000e\n\nZUMBA_ICON\u00105\u0012\u000e\n\nKENDO_ICON\u00106\u0012\u000f\n\u000bKARATE_ICON\u00107\u0012\u000f\n\u000bBOXING_ICON\u00108\u0012\r\n\tJUDO_ICON\u00109\u0012\u0012\n\u000eWRESTLING_ICON\u0010:\u0012\u0010\n\fTAI_CHI_ICON\u0010;\u0012\u0012\n\u000eMUAY_THAI_ICON\u0010<\u0012\u0012\n\u000eTAEKWONDO_ICON\u0010=\u0012\u0015\n\u0011MARTIAL_ARTS_ICON\u0010>\u0012\u0016\n\u0012FREE_SPARRING_ICON\u0010?\u0012)\n%HIGH_INTENSITY_INTERVAL_TRAINING_ICON\u0010@\u0012\u0010\n\fARCHERY_ICON\u0010A\u0012\u0012\n\u000eTREADMILL_ICON\u0010B\u0012\u0015\n\u0011PADDLE_BOARD_ICON\u0010C\u0012\u0013\n\u000fWATER_POLO_ICON\u0010D\u0012\u0015\n\u0011WATER_SPORTS_ICON\u0010E\u0012\u0015\n\u0011WATER_SKIING_ICON\u0010F\u0012\u0011\n\rKAYAKING_ICON\u0010G\u0012\u0016\n\u0012KAYAK_RAFTING_ICON\u0010H\u0012\u0012\n\u000eMOTORBOAT_ICON\u0010I\u0012\u0015\n\u0011FIN_SWIMMING_ICON\u0010J\u0012\u000f\n\u000bDIVING_ICON\u0010K\u0012\u001e\n\u001aSYNCHRONIZED_SWIMMING_ICON\u0010L\u0012\u0013\n\u000fSNORKELING_ICON\u0010M\u0012\u0015\n\u0011KITE_SURFING_ICON\u0010N\u0012\u0016\n\u0012ROCK_CLIMBING_ICON\u0010O\u0012\u0010\n\fPARKOUR_ICON\u0010P\u0012\f\n\bATV_ICON\u0010Q\u0012\u0013\n\u000fPARAGLIDER_ICON\u0010R\u0012\u0019\n\u0015CLIMB_THE_STAIRS_ICON\u0010S\u0012)\n%CROSSFIT_CROSS_TRAINING_CROSSFIT_ICON\u0010T\u0012\u0011\n\rAEROBICS_ICON\u0010U\u0012\u001a\n\u0016PHYSICAL_TRAINING_ICON\u0010V\u0012\u0012\n\u000eWALL_BALL_ICON\u0010W\u0012\u001a\n\u0016DUMBBELL_TRAINING_ICON\u0010X\u0012\u0019\n\u0015BARBELL_TRAINING_ICON\u0010Y\u0012\u0016\n\u0012WEIGHTLIFTING_ICON\u0010Z\u0012\u0011\n\rDEADLIFT_ICON\u0010[\u0012\u0013\n\u000fBOBBY_JUMP_ICON\u0010\\\u0012\u0010\n\fSIT_UPS_ICON\u0010]\u0012\u001c\n\u0018FUNCTIONAL_TRAINING_ICON\u0010^\u0012\u001c\n\u0018UPPER_LIMB_TRAINING_ICON\u0010_\u0012\u001c\n\u0018LOWER_LIMB_TRAINING_ICON\u0010`\u0012#\n\u001fWAIST_AND_ABDOMEN_TRAINING_ICON\u0010a\u0012\u0016\n\u0012BACK_TRAINING_ICON\u0010b\u0012\u0017\n\u0013NATIONAL_DANCE_ICON\u0010c\u0012\r\n\tJAZZ_ICON\u0010d\u0012\u0014\n\u0010LATIN_DANCE_ICON\u0010e\u0012\u0010\n\fFENCING_ICON\u0010f\u0012\u000e\n\nRUGBY_ICON\u0010g\u0012\u000f\n\u000bHOCKEY_ICON\u0010h\u0012\u000f\n\u000bTENNIS_ICON\u0010i\u0012\u0012\n\u000eBILLIARDS_ICON\u0010j\u0012\u0014\n\u0010SHUTTLECOCK_ICON\u0010k\u0012\u0015\n\u0011SEPAK_TAKRAW_ICON\u0010l\u0012\u0014\n\u0010SNOW_SPORTS_ICON\u0010m\u0012\u0013\n\u000fSNOWMOBILE_ICON\u0010n\u0012\r\n\tPUCK_ICON\u0010o\u0012\u0011\n\rSNOW_CAR_ICON\u0010p\u0012\r\n\tSLED_ICON\u0010q\u0012\u000e\n\nDARTS_ICON\u0010r\u0012\u0013\n\u000fTUG_OF_WAR_ICON\u0010s\u0012\u0012\n\u000eHULA_HOOP_ICON\u0010t\u0012\u0013\n\u000fFLY_A_KITE_ICON\u0010u\u0012\u0010\n\fFRISBEE_ICON\u0010v\u0012\u0018\n\u0014TRACK_AND_FIELD_ICON\u0010w\u0012\u0013\n\u000fRACING_CAR_ICON\u0010x\u0012\u0019\n\u0015ROWING_MACHINE_L_ICON\u0010y\u0012\u0018\n\u0014ROPE_SKIPPING_L_ICON\u0010z\u0012\u0014\n\u0010TRIATHLON_L_ICON\u0010{\u0012\u0019\n\u0015MOUNTAIN_CYCLING_ICON\u0010|\u0012\u0013\n\u000fKICKBOXING_ICON\u0010}\u0012\u000f\n\u000bSKIING_ICON\u0010~\u0012\u001d\n\u0019CROSS_COUNTRY_SKIING_ICON\u0010\u007f\u0012\u0016\n\u0011SNOWBOARDING_ICON\u0010\u0080\u0001\u0012\u0017\n\u0012ALPINE_SKIING_ICON\u0010\u0081\u0001\u0012\u001d\n\u0018DOUBLE_BOARD_SKIING_ICON\u0010\u0082\u0001\u0012\u0017\n\u0012FREE_EXERCISE_ICON\u0010\u0083\u0001\u0012\u001d\n\u0018PADDLEBOARD_SURFING_ICON\u0010\u0084\u0001\u0012\u0011\n\fKABADDI_ICON\u0010\u0085\u0001\u0012\u000e\n\tGOLF_ICON\u0010\u0086\u0001\u0012\u0018\n\u0013INDOOR_WALKING_ICON\u0010\u0087\u0001\u0012\u0013\n\u000eTABLE_FOOTBALL\u0010\u0088\u0001\u0012\u0011\n\fSEVEN_STONES\u0010\u0089\u0001\u0012\f\n\u0007KHO_KHO\u0010\u008a\u0001\u0012\r\n\bMARATHON\u0010\u008b\u0001\u0012\u0012\n\rJUMPING_JACKS\u0010\u008c\u0001\u0012\u0010\n\u000bPULL_UP_BAR\u0010\u008d\u0001\u0012\u0012\n\rPARALLEL_BARS\u0010\u008e\u0001\u0012\u000e\n\tHIGH_JUMP\u0010\u008f\u0001\u0012\u000e\n\tLONG_JUMP\u0010\u0090\u0001\u0012\f\n\u0007PULL_UP\u0010\u0091\u0001\u0012\f\n\u0007PUSH_UP\u0010\u0092\u0001\u0012\n\n\u0005PLANK\u0010\u0093\u0001\u0012\u0011\n\fFOAM_ROLLING\u0010\u0094\u0001\u0012\u0012\n\rFITNESS_GAMES\u0010\u0095\u0001\u0012\u0018\n\u0013RELAXING_MEDITATION\u0010\u0096\u0001\u0012\u000e\n\tTREADMILL\u0010\u0097\u0001\u0012\f\n\u0007VO2_MAX\u0010\u0098\u0001\u0012\u001e\n\u0019AUSTRALIAN_RULES_FOOTBALL\u0010\u0099\u0001\u0012\u0016\n\u0011AMERICANVFOOTBALL\u0010\u009a\u0001\u0012\u000f\n\nPICKLEBALL\u0010\u009b\u0001\u0012\u0015\n\u0010SNOWBOARDING_156\u0010\u009c\u0001\u0012\u0015\n\u0010GROUP_GYMNASTICS\u0010\u009d\u0001\u0012\u0014\n\u000fCOMBAT_AEROBICS\u0010\u009e\u0001\u0012\u0013\n\u000eBUNGEE_JUMPING\u0010\u009f\u0001\u0012\u0011\n\fKICK_SCOOTER\u0010 \u0001\u0012\u0011\n\fBALANCE_BIKE\u0010¡\u0001\u0012\u0013\n\u000eLEISURE_SPORTS\u0010¢\u0001\u0012\r\n\bSHOOTING\u0010£\u0001\u0012\u000f\n\nTRAMPOLINE\u0010¤\u0001\u0012\u0011\n\fFIELD_HOCKEY\u0010¥\u0001\u0012\u0015\n\u0010OUTDOOR_FOOTBALL\u0010¦\u0001\u0012\u000f\n\nOPEN_WATER\u0010Ç\u0001\u0012\u0019\n\u0014POOL_SWIMMING_H_ICON\u0010È\u0001\u0012\u0016\n\u0011OPEN_WATER_H_ICON\u0010É\u0001\u0012\u001a\n\u0015ROWING_MACHINE_H_ICON\u0010Ê\u0001\u0012\u0019\n\u0014ROPE_SKIPPING_H_ICON\u0010Ë\u0001\u0012\u0015\n\u0010TRIATHLON_H_ICON\u0010Ì\u0001\u0012\u001a\n\u0015OUTDOOR_FOOTBALL_ICON\u0010Í\u0001*E\n\u0007SEOrder\u0012\u0011\n\rHEAD_RESIDENT\u0010\u0000\u0012\u000b\n\u0007HIGHEST\u0010\n\u0012\u000b\n\u0006LOWEST\u0010ñ\u0001\u0012\r\n\bRESIDENT\u0010ò\u0001*®\u0002\n\u0014SEIncalidSleepReason\u0012+\n'SEINCALIDSLEEPREASON_ELEVATE_HEART_RATE\u0010\u0001\u0012'\n#SEINCALIDSLEEPREASON_ACTIVITY_AWAKE\u0010\u0002\u0012$\n SEINCALIDSLEEPREASON_ONE_AND_TWO\u0010\u0003\u0012-\n)SEINCALIDSLEEPREASON_SLEEP_DURATION_SHORT\u0010\u0004\u0012!\n\u001dSEINCALIDSLEEPREASON_ONE_FOUR\u0010\u0005\u0012!\n\u001dSEINCALIDSLEEPREASON_TWO_FOUR\u0010\u0006\u0012%\n!SEINCALIDSLEEPREASON_ONE_TWO_FOUR\u0010\u0007B/\n\u0018com.zh.ble.wear.protobufB\u0013MicroFunctionProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor(), DeviceProtos.getDescriptor(), SettingMenuProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SEMicroFunction_descriptor = messageType;
        internal_static_SEMicroFunction_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"FindPhoneMode", "PhotographMode", "BasicDataMode", "BasicData", "WidgetList", "ApplicationList", "QuickWidgetList", "SportIconList", "SportOtherList", "SportIconInfowearList", "NfcSleepErr", "InquiryWearingStatus", "RequestWearingResult", "SleepStatus", "SarCalibration", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SEBasicData_descriptor = messageType2;
        internal_static_SEBasicData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"Steps", "Calories", "Distance", "HeartRate", "BloodOxygen", "EffectiveStanding", "DeviceBatteryStatus", "EffectiveStandingHour", "SleepDuration", "PhysiologicalCycle", "HBAData", "ActivityDuration", "Pressure", "TodayOuraCalorieData", "TodaySportCalorieData", "StepsData", "DistanceData", "CalorieData", "TodayOuraCalorieHourlyData", "TodaySportCalorieHourlyData", "DeviceChargingCaseStatus", "SarGdiff", "NfcSleepErr", "FullyChargedNeedTime", "RemainingBatteryTime"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SEWidget_descriptor = messageType3;
        internal_static_SEWidget_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"Function", "Enable", "Order", "HaveHide", "Sortable"});
        Descriptors.Descriptor nestedType = messageType3.getNestedType(0);
        internal_static_SEWidget_SEList_descriptor = nestedType;
        internal_static_SEWidget_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SESleepStatus_descriptor = messageType4;
        internal_static_SESleepStatus_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"InvalidSleepReason"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SESarCalibration_descriptor = messageType5;
        internal_static_SESarCalibration_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"SarDaiff", "SarOffset", "SarBasedata"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
        DeviceProtos.getDescriptor();
        SettingMenuProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private MicroFunctionProtos() {
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