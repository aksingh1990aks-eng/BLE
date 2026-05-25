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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class DeviceProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SEDeviceBatteryStatus_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEDeviceBatteryStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEDeviceBatteryValue_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEDeviceBatteryValue_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEDeviceChargingCaseStatus_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEDeviceChargingCaseStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEDeviceInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEDeviceInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEDevice_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEDevice_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEMptPowerLog_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEMptPowerLog_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEMptPowerLog_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEMptPowerLog_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEPowerLog_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEPowerLog_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEPowerLog_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEPowerLog_fieldAccessorTable;

    public static final class SEDevice extends GeneratedMessage implements SEDeviceOrBuilder {
        private static final SEDevice DEFAULT_INSTANCE;
        public static final int DEVICE_BATTERY_STATUS_FIELD_NUMBER = 2;
        public static final int DEVICE_BATTERY_VALUE_REQUEST_FIELD_NUMBER = 5;
        public static final int DEVICE_CHARGING_CASE_STATUS_FIELD_NUMBER = 6;
        public static final int DEVICE_INFO_FIELD_NUMBER = 1;
        public static final int MPT_POWER_LOG_FIELD_NUMBER = 3;
        public static final int MPT_POWER_LOG_LIST_FIELD_NUMBER = 4;
        private static final Parser<SEDevice> PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEDevice$1 */
        public class AnonymousClass1 extends AbstractParser<SEDevice> {
            @Override // com.google.protobuf.Parser
            public SEDevice parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEDevice.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDeviceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> deviceBatteryStatusBuilder_;
            private SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> deviceBatteryValueRequestBuilder_;
            private SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> deviceChargingCaseStatusBuilder_;
            private SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> deviceInfoBuilder_;
            private SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> mptPowerLogBuilder_;
            private SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> mptPowerLogListBuilder_;
            private int payloadCase_;
            private Object payload_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEDevice sEDevice) {
            }

            private void buildPartialOneofs(SEDevice sEDevice) {
                SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> singleFieldBuilder6;
                int i7 = this.payloadCase_;
                sEDevice.payloadCase_ = i7;
                sEDevice.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder6 = this.deviceInfoBuilder_) != null) {
                    sEDevice.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 2 && (singleFieldBuilder5 = this.deviceBatteryStatusBuilder_) != null) {
                    sEDevice.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 3 && (singleFieldBuilder4 = this.mptPowerLogBuilder_) != null) {
                    sEDevice.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 4 && (singleFieldBuilder3 = this.mptPowerLogListBuilder_) != null) {
                    sEDevice.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder2 = this.deviceBatteryValueRequestBuilder_) != null) {
                    sEDevice.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 6 || (singleFieldBuilder = this.deviceChargingCaseStatusBuilder_) == null) {
                    return;
                }
                sEDevice.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceProtos.internal_static_SEDevice_descriptor;
            }

            private SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> internalGetDeviceBatteryStatusFieldBuilder() {
                if (this.deviceBatteryStatusBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SEDeviceBatteryStatus.getDefaultInstance();
                    }
                    this.deviceBatteryStatusBuilder_ = new SingleFieldBuilder<>((SEDeviceBatteryStatus) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.deviceBatteryStatusBuilder_;
            }

            private SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> internalGetDeviceBatteryValueRequestFieldBuilder() {
                if (this.deviceBatteryValueRequestBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SEDeviceBatteryValue.getDefaultInstance();
                    }
                    this.deviceBatteryValueRequestBuilder_ = new SingleFieldBuilder<>((SEDeviceBatteryValue) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.deviceBatteryValueRequestBuilder_;
            }

            private SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> internalGetDeviceChargingCaseStatusFieldBuilder() {
                if (this.deviceChargingCaseStatusBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SEDeviceChargingCaseStatus.getDefaultInstance();
                    }
                    this.deviceChargingCaseStatusBuilder_ = new SingleFieldBuilder<>((SEDeviceChargingCaseStatus) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.deviceChargingCaseStatusBuilder_;
            }

            private SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> internalGetDeviceInfoFieldBuilder() {
                if (this.deviceInfoBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SEDeviceInfo.getDefaultInstance();
                    }
                    this.deviceInfoBuilder_ = new SingleFieldBuilder<>((SEDeviceInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.deviceInfoBuilder_;
            }

            private SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> internalGetMptPowerLogFieldBuilder() {
                if (this.mptPowerLogBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = SEMptPowerLog.getDefaultInstance();
                    }
                    this.mptPowerLogBuilder_ = new SingleFieldBuilder<>((SEMptPowerLog) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.mptPowerLogBuilder_;
            }

            private SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> internalGetMptPowerLogListFieldBuilder() {
                if (this.mptPowerLogListBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = SEMptPowerLog.List.getDefaultInstance();
                    }
                    this.mptPowerLogListBuilder_ = new SingleFieldBuilder<>((SEMptPowerLog.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.mptPowerLogListBuilder_;
            }

            public Builder clearDeviceBatteryStatus() {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
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

            public Builder clearDeviceBatteryValueRequest() {
                SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> singleFieldBuilder = this.deviceBatteryValueRequestBuilder_;
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

            public Builder clearDeviceChargingCaseStatus() {
                SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
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

            public Builder clearDeviceInfo() {
                SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> singleFieldBuilder = this.deviceInfoBuilder_;
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

            public Builder clearMptPowerLog() {
                SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> singleFieldBuilder = this.mptPowerLogBuilder_;
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

            public Builder clearMptPowerLogList() {
                SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> singleFieldBuilder = this.mptPowerLogListBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceProtos.internal_static_SEDevice_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEDeviceBatteryStatus getDeviceBatteryStatus() {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SEDeviceBatteryStatus) this.payload_ : SEDeviceBatteryStatus.getDefaultInstance() : this.payloadCase_ == 2 ? (SEDeviceBatteryStatus) singleFieldBuilder.getMessage() : SEDeviceBatteryStatus.getDefaultInstance();
            }

            public SEDeviceBatteryStatus.Builder getDeviceBatteryStatusBuilder() {
                return (SEDeviceBatteryStatus.Builder) internalGetDeviceBatteryStatusFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEDeviceBatteryStatusOrBuilder getDeviceBatteryStatusOrBuilder() {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.deviceBatteryStatusBuilder_) == null) ? i7 == 2 ? (SEDeviceBatteryStatus) this.payload_ : SEDeviceBatteryStatus.getDefaultInstance() : (SEDeviceBatteryStatusOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEDeviceBatteryValue getDeviceBatteryValueRequest() {
                SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> singleFieldBuilder = this.deviceBatteryValueRequestBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SEDeviceBatteryValue) this.payload_ : SEDeviceBatteryValue.getDefaultInstance() : this.payloadCase_ == 5 ? (SEDeviceBatteryValue) singleFieldBuilder.getMessage() : SEDeviceBatteryValue.getDefaultInstance();
            }

            public SEDeviceBatteryValue.Builder getDeviceBatteryValueRequestBuilder() {
                return (SEDeviceBatteryValue.Builder) internalGetDeviceBatteryValueRequestFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEDeviceBatteryValueOrBuilder getDeviceBatteryValueRequestOrBuilder() {
                SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.deviceBatteryValueRequestBuilder_) == null) ? i7 == 5 ? (SEDeviceBatteryValue) this.payload_ : SEDeviceBatteryValue.getDefaultInstance() : (SEDeviceBatteryValueOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEDeviceChargingCaseStatus getDeviceChargingCaseStatus() {
                SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SEDeviceChargingCaseStatus) this.payload_ : SEDeviceChargingCaseStatus.getDefaultInstance() : this.payloadCase_ == 6 ? (SEDeviceChargingCaseStatus) singleFieldBuilder.getMessage() : SEDeviceChargingCaseStatus.getDefaultInstance();
            }

            public SEDeviceChargingCaseStatus.Builder getDeviceChargingCaseStatusBuilder() {
                return (SEDeviceChargingCaseStatus.Builder) internalGetDeviceChargingCaseStatusFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEDeviceChargingCaseStatusOrBuilder getDeviceChargingCaseStatusOrBuilder() {
                SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.deviceChargingCaseStatusBuilder_) == null) ? i7 == 6 ? (SEDeviceChargingCaseStatus) this.payload_ : SEDeviceChargingCaseStatus.getDefaultInstance() : (SEDeviceChargingCaseStatusOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEDeviceInfo getDeviceInfo() {
                SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> singleFieldBuilder = this.deviceInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SEDeviceInfo) this.payload_ : SEDeviceInfo.getDefaultInstance() : this.payloadCase_ == 1 ? (SEDeviceInfo) singleFieldBuilder.getMessage() : SEDeviceInfo.getDefaultInstance();
            }

            public SEDeviceInfo.Builder getDeviceInfoBuilder() {
                return (SEDeviceInfo.Builder) internalGetDeviceInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEDeviceInfoOrBuilder getDeviceInfoOrBuilder() {
                SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.deviceInfoBuilder_) == null) ? i7 == 1 ? (SEDeviceInfo) this.payload_ : SEDeviceInfo.getDefaultInstance() : (SEDeviceInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEMptPowerLog getMptPowerLog() {
                SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> singleFieldBuilder = this.mptPowerLogBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (SEMptPowerLog) this.payload_ : SEMptPowerLog.getDefaultInstance() : this.payloadCase_ == 3 ? (SEMptPowerLog) singleFieldBuilder.getMessage() : SEMptPowerLog.getDefaultInstance();
            }

            public SEMptPowerLog.Builder getMptPowerLogBuilder() {
                return (SEMptPowerLog.Builder) internalGetMptPowerLogFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEMptPowerLog.List getMptPowerLogList() {
                SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> singleFieldBuilder = this.mptPowerLogListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (SEMptPowerLog.List) this.payload_ : SEMptPowerLog.List.getDefaultInstance() : this.payloadCase_ == 4 ? (SEMptPowerLog.List) singleFieldBuilder.getMessage() : SEMptPowerLog.List.getDefaultInstance();
            }

            public SEMptPowerLog.List.Builder getMptPowerLogListBuilder() {
                return (SEMptPowerLog.List.Builder) internalGetMptPowerLogListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEMptPowerLog.ListOrBuilder getMptPowerLogListOrBuilder() {
                SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.mptPowerLogListBuilder_) == null) ? i7 == 4 ? (SEMptPowerLog.List) this.payload_ : SEMptPowerLog.List.getDefaultInstance() : (SEMptPowerLog.ListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public SEMptPowerLogOrBuilder getMptPowerLogOrBuilder() {
                SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.mptPowerLogBuilder_) == null) ? i7 == 3 ? (SEMptPowerLog) this.payload_ : SEMptPowerLog.getDefaultInstance() : (SEMptPowerLogOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public boolean hasDeviceBatteryStatus() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public boolean hasDeviceBatteryValueRequest() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public boolean hasDeviceChargingCaseStatus() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public boolean hasDeviceInfo() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public boolean hasMptPowerLog() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
            public boolean hasMptPowerLogList() {
                return this.payloadCase_ == 4;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceProtos.internal_static_SEDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDevice.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasDeviceInfo() && !getDeviceInfo().isInitialized()) {
                    return false;
                }
                if (hasDeviceBatteryStatus() && !getDeviceBatteryStatus().isInitialized()) {
                    return false;
                }
                if (hasMptPowerLog() && !getMptPowerLog().isInitialized()) {
                    return false;
                }
                if (hasMptPowerLogList() && !getMptPowerLogList().isInitialized()) {
                    return false;
                }
                if (!hasDeviceBatteryValueRequest() || getDeviceBatteryValueRequest().isInitialized()) {
                    return !hasDeviceChargingCaseStatus() || getDeviceChargingCaseStatus().isInitialized();
                }
                return false;
            }

            public Builder mergeDeviceBatteryStatus(SEDeviceBatteryStatus sEDeviceBatteryStatus) {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SEDeviceBatteryStatus.getDefaultInstance()) {
                        this.payload_ = sEDeviceBatteryStatus;
                    } else {
                        this.payload_ = SEDeviceBatteryStatus.newBuilder((SEDeviceBatteryStatus) this.payload_).mergeFrom(sEDeviceBatteryStatus).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(sEDeviceBatteryStatus);
                } else {
                    singleFieldBuilder.setMessage(sEDeviceBatteryStatus);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeDeviceBatteryValueRequest(SEDeviceBatteryValue sEDeviceBatteryValue) {
                SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> singleFieldBuilder = this.deviceBatteryValueRequestBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SEDeviceBatteryValue.getDefaultInstance()) {
                        this.payload_ = sEDeviceBatteryValue;
                    } else {
                        this.payload_ = SEDeviceBatteryValue.newBuilder((SEDeviceBatteryValue) this.payload_).mergeFrom(sEDeviceBatteryValue).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sEDeviceBatteryValue);
                } else {
                    singleFieldBuilder.setMessage(sEDeviceBatteryValue);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeDeviceChargingCaseStatus(SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus) {
                SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SEDeviceChargingCaseStatus.getDefaultInstance()) {
                        this.payload_ = sEDeviceChargingCaseStatus;
                    } else {
                        this.payload_ = SEDeviceChargingCaseStatus.newBuilder((SEDeviceChargingCaseStatus) this.payload_).mergeFrom(sEDeviceChargingCaseStatus).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEDeviceChargingCaseStatus);
                } else {
                    singleFieldBuilder.setMessage(sEDeviceChargingCaseStatus);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeDeviceInfo(SEDeviceInfo sEDeviceInfo) {
                SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> singleFieldBuilder = this.deviceInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SEDeviceInfo.getDefaultInstance()) {
                        this.payload_ = sEDeviceInfo;
                    } else {
                        this.payload_ = SEDeviceInfo.newBuilder((SEDeviceInfo) this.payload_).mergeFrom(sEDeviceInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sEDeviceInfo);
                } else {
                    singleFieldBuilder.setMessage(sEDeviceInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeMptPowerLog(SEMptPowerLog sEMptPowerLog) {
                SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> singleFieldBuilder = this.mptPowerLogBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == SEMptPowerLog.getDefaultInstance()) {
                        this.payload_ = sEMptPowerLog;
                    } else {
                        this.payload_ = SEMptPowerLog.newBuilder((SEMptPowerLog) this.payload_).mergeFrom(sEMptPowerLog).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(sEMptPowerLog);
                } else {
                    singleFieldBuilder.setMessage(sEMptPowerLog);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeMptPowerLogList(SEMptPowerLog.List list) {
                SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> singleFieldBuilder = this.mptPowerLogListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == SEMptPowerLog.List.getDefaultInstance()) {
                        this.payload_ = list;
                    } else {
                        this.payload_ = SEMptPowerLog.List.newBuilder((SEMptPowerLog.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(list);
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setDeviceBatteryStatus(SEDeviceBatteryStatus sEDeviceBatteryStatus) {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder == null) {
                    sEDeviceBatteryStatus.getClass();
                    this.payload_ = sEDeviceBatteryStatus;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEDeviceBatteryStatus);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setDeviceBatteryValueRequest(SEDeviceBatteryValue sEDeviceBatteryValue) {
                SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> singleFieldBuilder = this.deviceBatteryValueRequestBuilder_;
                if (singleFieldBuilder == null) {
                    sEDeviceBatteryValue.getClass();
                    this.payload_ = sEDeviceBatteryValue;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEDeviceBatteryValue);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setDeviceChargingCaseStatus(SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus) {
                SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder == null) {
                    sEDeviceChargingCaseStatus.getClass();
                    this.payload_ = sEDeviceChargingCaseStatus;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEDeviceChargingCaseStatus);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setDeviceInfo(SEDeviceInfo sEDeviceInfo) {
                SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> singleFieldBuilder = this.deviceInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEDeviceInfo.getClass();
                    this.payload_ = sEDeviceInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEDeviceInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setMptPowerLog(SEMptPowerLog sEMptPowerLog) {
                SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> singleFieldBuilder = this.mptPowerLogBuilder_;
                if (singleFieldBuilder == null) {
                    sEMptPowerLog.getClass();
                    this.payload_ = sEMptPowerLog;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEMptPowerLog);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setMptPowerLogList(SEMptPowerLog.List list) {
                SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> singleFieldBuilder = this.mptPowerLogListBuilder_;
                if (singleFieldBuilder == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDevice build() {
                SEDevice sEDeviceBuildPartial = buildPartial();
                if (sEDeviceBuildPartial.isInitialized()) {
                    return sEDeviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDeviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDevice buildPartial() {
                SEDevice sEDevice = new SEDevice(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEDevice);
                }
                buildPartialOneofs(sEDevice);
                onBuilt();
                return sEDevice;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEDevice getDefaultInstanceForType() {
                return SEDevice.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> singleFieldBuilder = this.deviceInfoBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder2 = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> singleFieldBuilder3 = this.mptPowerLogBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> singleFieldBuilder4 = this.mptPowerLogListBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> singleFieldBuilder5 = this.deviceBatteryValueRequestBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder6 = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEDevice) {
                    return mergeFrom((SEDevice) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDeviceBatteryStatus(SEDeviceBatteryStatus.Builder builder) {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setDeviceBatteryValueRequest(SEDeviceBatteryValue.Builder builder) {
                SingleFieldBuilder<SEDeviceBatteryValue, SEDeviceBatteryValue.Builder, SEDeviceBatteryValueOrBuilder> singleFieldBuilder = this.deviceBatteryValueRequestBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setDeviceChargingCaseStatus(SEDeviceChargingCaseStatus.Builder builder) {
                SingleFieldBuilder<SEDeviceChargingCaseStatus, SEDeviceChargingCaseStatus.Builder, SEDeviceChargingCaseStatusOrBuilder> singleFieldBuilder = this.deviceChargingCaseStatusBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setDeviceInfo(SEDeviceInfo.Builder builder) {
                SingleFieldBuilder<SEDeviceInfo, SEDeviceInfo.Builder, SEDeviceInfoOrBuilder> singleFieldBuilder = this.deviceInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setMptPowerLog(SEMptPowerLog.Builder builder) {
                SingleFieldBuilder<SEMptPowerLog, SEMptPowerLog.Builder, SEMptPowerLogOrBuilder> singleFieldBuilder = this.mptPowerLogBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setMptPowerLogList(SEMptPowerLog.List.Builder builder) {
                SingleFieldBuilder<SEMptPowerLog.List, SEMptPowerLog.List.Builder, SEMptPowerLog.ListOrBuilder> singleFieldBuilder = this.mptPowerLogListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeFrom(SEDevice sEDevice) {
                if (sEDevice == SEDevice.getDefaultInstance()) {
                    return this;
                }
                int iOrdinal = sEDevice.getPayloadCase().ordinal();
                if (iOrdinal == 0) {
                    mergeDeviceInfo(sEDevice.getDeviceInfo());
                } else if (iOrdinal == 1) {
                    mergeDeviceBatteryStatus(sEDevice.getDeviceBatteryStatus());
                } else if (iOrdinal == 2) {
                    mergeMptPowerLog(sEDevice.getMptPowerLog());
                } else if (iOrdinal == 3) {
                    mergeMptPowerLogList(sEDevice.getMptPowerLogList());
                } else if (iOrdinal == 4) {
                    mergeDeviceBatteryValueRequest(sEDevice.getDeviceBatteryValueRequest());
                } else if (iOrdinal == 5) {
                    mergeDeviceChargingCaseStatus(sEDevice.getDeviceChargingCaseStatus());
                }
                mergeUnknownFields(sEDevice.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetDeviceInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetDeviceBatteryStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(internalGetMptPowerLogFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetMptPowerLogListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetDeviceBatteryValueRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                } else if (tag != 50) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetDeviceChargingCaseStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
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
            DEVICE_INFO(1),
            DEVICE_BATTERY_STATUS(2),
            MPT_POWER_LOG(3),
            MPT_POWER_LOG_LIST(4),
            DEVICE_BATTERY_VALUE_REQUEST(5),
            DEVICE_CHARGING_CASE_STATUS(6),
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
                        return DEVICE_INFO;
                    case 2:
                        return DEVICE_BATTERY_STATUS;
                    case 3:
                        return MPT_POWER_LOG;
                    case 4:
                        return MPT_POWER_LOG_LIST;
                    case 5:
                        return DEVICE_BATTERY_VALUE_REQUEST;
                    case 6:
                        return DEVICE_CHARGING_CASE_STATUS;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEDevice");
            DEFAULT_INSTANCE = new SEDevice();
            PARSER = new AbstractParser<SEDevice>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEDevice.1
                @Override // com.google.protobuf.Parser
                public SEDevice parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEDevice.newBuilder();
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

        public /* synthetic */ SEDevice(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceProtos.internal_static_SEDevice_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEDevice parseDelimitedFrom(InputStream inputStream) {
            return (SEDevice) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEDevice parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEDevice> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEDevice)) {
                return super.equals(obj);
            }
            SEDevice sEDevice = (SEDevice) obj;
            if (!getPayloadCase().equals(sEDevice.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getDeviceInfo().equals(sEDevice.getDeviceInfo())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getDeviceBatteryStatus().equals(sEDevice.getDeviceBatteryStatus())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getMptPowerLog().equals(sEDevice.getMptPowerLog())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getMptPowerLogList().equals(sEDevice.getMptPowerLogList())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getDeviceBatteryValueRequest().equals(sEDevice.getDeviceBatteryValueRequest())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getDeviceChargingCaseStatus().equals(sEDevice.getDeviceChargingCaseStatus())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sEDevice.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return DeviceProtos.internal_static_SEDevice_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEDeviceBatteryStatus getDeviceBatteryStatus() {
            return this.payloadCase_ == 2 ? (SEDeviceBatteryStatus) this.payload_ : SEDeviceBatteryStatus.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEDeviceBatteryStatusOrBuilder getDeviceBatteryStatusOrBuilder() {
            return this.payloadCase_ == 2 ? (SEDeviceBatteryStatus) this.payload_ : SEDeviceBatteryStatus.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEDeviceBatteryValue getDeviceBatteryValueRequest() {
            return this.payloadCase_ == 5 ? (SEDeviceBatteryValue) this.payload_ : SEDeviceBatteryValue.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEDeviceBatteryValueOrBuilder getDeviceBatteryValueRequestOrBuilder() {
            return this.payloadCase_ == 5 ? (SEDeviceBatteryValue) this.payload_ : SEDeviceBatteryValue.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEDeviceChargingCaseStatus getDeviceChargingCaseStatus() {
            return this.payloadCase_ == 6 ? (SEDeviceChargingCaseStatus) this.payload_ : SEDeviceChargingCaseStatus.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEDeviceChargingCaseStatusOrBuilder getDeviceChargingCaseStatusOrBuilder() {
            return this.payloadCase_ == 6 ? (SEDeviceChargingCaseStatus) this.payload_ : SEDeviceChargingCaseStatus.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEDeviceInfo getDeviceInfo() {
            return this.payloadCase_ == 1 ? (SEDeviceInfo) this.payload_ : SEDeviceInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEDeviceInfoOrBuilder getDeviceInfoOrBuilder() {
            return this.payloadCase_ == 1 ? (SEDeviceInfo) this.payload_ : SEDeviceInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEMptPowerLog getMptPowerLog() {
            return this.payloadCase_ == 3 ? (SEMptPowerLog) this.payload_ : SEMptPowerLog.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEMptPowerLog.List getMptPowerLogList() {
            return this.payloadCase_ == 4 ? (SEMptPowerLog.List) this.payload_ : SEMptPowerLog.List.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEMptPowerLog.ListOrBuilder getMptPowerLogListOrBuilder() {
            return this.payloadCase_ == 4 ? (SEMptPowerLog.List) this.payload_ : SEMptPowerLog.List.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public SEMptPowerLogOrBuilder getMptPowerLogOrBuilder() {
            return this.payloadCase_ == 3 ? (SEMptPowerLog) this.payload_ : SEMptPowerLog.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEDevice> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SEDeviceInfo) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (SEDeviceBatteryStatus) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (SEMptPowerLog) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (SEMptPowerLog.List) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (SEDeviceBatteryValue) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SEDeviceChargingCaseStatus) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public boolean hasDeviceBatteryStatus() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public boolean hasDeviceBatteryValueRequest() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public boolean hasDeviceChargingCaseStatus() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public boolean hasDeviceInfo() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public boolean hasMptPowerLog() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceOrBuilder
        public boolean hasMptPowerLogList() {
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
                    iHashCode = getDeviceInfo().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getDeviceBatteryStatus().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getMptPowerLog().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getMptPowerLogList().hashCode();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getDeviceBatteryValueRequest().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getDeviceChargingCaseStatus().hashCode();
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
            return DeviceProtos.internal_static_SEDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDevice.class, Builder.class);
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
            if (hasDeviceInfo() && !getDeviceInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDeviceBatteryStatus() && !getDeviceBatteryStatus().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMptPowerLog() && !getMptPowerLog().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMptPowerLogList() && !getMptPowerLogList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDeviceBatteryValueRequest() && !getDeviceBatteryValueRequest().isInitialized()) {
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
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SEDeviceInfo) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (SEDeviceBatteryStatus) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (SEMptPowerLog) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (SEMptPowerLog.List) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SEDeviceBatteryValue) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SEDeviceChargingCaseStatus) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEDevice(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEDevice sEDevice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEDevice);
        }

        public static SEDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDevice) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDevice parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEDevice getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEDevice() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEDevice parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEDevice parseFrom(InputStream inputStream) {
            return (SEDevice) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDevice) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDevice parseFrom(CodedInputStream codedInputStream) {
            return (SEDevice) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDevice) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SEDeviceBatteryStatus extends GeneratedMessage implements SEDeviceBatteryStatusOrBuilder {
        public static final int CAPACITY_FIELD_NUMBER = 1;
        public static final int CHARGE_STATUS_FIELD_NUMBER = 2;
        private static final SEDeviceBatteryStatus DEFAULT_INSTANCE;
        private static final Parser<SEDeviceBatteryStatus> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int capacity_;
        private int chargeStatus_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEDeviceBatteryStatus$1 */
        public class AnonymousClass1 extends AbstractParser<SEDeviceBatteryStatus> {
            @Override // com.google.protobuf.Parser
            public SEDeviceBatteryStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEDeviceBatteryStatus.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDeviceBatteryStatusOrBuilder {
            private int bitField0_;
            private int capacity_;
            private int chargeStatus_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEDeviceBatteryStatus sEDeviceBatteryStatus) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEDeviceBatteryStatus.capacity_ = this.capacity_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEDeviceBatteryStatus.chargeStatus_ = this.chargeStatus_;
                    i7 |= 2;
                }
                sEDeviceBatteryStatus.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceProtos.internal_static_SEDeviceBatteryStatus_descriptor;
            }

            public Builder clearCapacity() {
                this.bitField0_ &= -2;
                this.capacity_ = 0;
                onChanged();
                return this;
            }

            public Builder clearChargeStatus() {
                this.bitField0_ &= -3;
                this.chargeStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatusOrBuilder
            public int getCapacity() {
                return this.capacity_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatusOrBuilder
            public SEChargeStatus getChargeStatus() {
                SEChargeStatus sEChargeStatusForNumber = SEChargeStatus.forNumber(this.chargeStatus_);
                return sEChargeStatusForNumber == null ? SEChargeStatus.UNKNOWN : sEChargeStatusForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceProtos.internal_static_SEDeviceBatteryStatus_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatusOrBuilder
            public boolean hasCapacity() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatusOrBuilder
            public boolean hasChargeStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceProtos.internal_static_SEDeviceBatteryStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDeviceBatteryStatus.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCapacity();
            }

            public Builder setCapacity(int i7) {
                this.capacity_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setChargeStatus(SEChargeStatus sEChargeStatus) {
                sEChargeStatus.getClass();
                this.bitField0_ |= 2;
                this.chargeStatus_ = sEChargeStatus.getNumber();
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                this.chargeStatus_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDeviceBatteryStatus build() {
                SEDeviceBatteryStatus sEDeviceBatteryStatusBuildPartial = buildPartial();
                if (sEDeviceBatteryStatusBuildPartial.isInitialized()) {
                    return sEDeviceBatteryStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDeviceBatteryStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDeviceBatteryStatus buildPartial() {
                SEDeviceBatteryStatus sEDeviceBatteryStatus = new SEDeviceBatteryStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEDeviceBatteryStatus);
                }
                onBuilt();
                return sEDeviceBatteryStatus;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEDeviceBatteryStatus getDefaultInstanceForType() {
                return SEDeviceBatteryStatus.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.chargeStatus_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.capacity_ = 0;
                this.chargeStatus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEDeviceBatteryStatus) {
                    return mergeFrom((SEDeviceBatteryStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEDeviceBatteryStatus sEDeviceBatteryStatus) {
                if (sEDeviceBatteryStatus == SEDeviceBatteryStatus.getDefaultInstance()) {
                    return this;
                }
                if (sEDeviceBatteryStatus.hasCapacity()) {
                    setCapacity(sEDeviceBatteryStatus.getCapacity());
                }
                if (sEDeviceBatteryStatus.hasChargeStatus()) {
                    setChargeStatus(sEDeviceBatteryStatus.getChargeStatus());
                }
                mergeUnknownFields(sEDeviceBatteryStatus.getUnknownFields());
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
                                    this.capacity_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i7 = codedInputStream.readEnum();
                                    if (SEChargeStatus.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.chargeStatus_ = i7;
                                        this.bitField0_ |= 2;
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

        public enum SEChargeStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            CHARGING(1),
            NOT_CHARGING(2),
            FULL(3);

            public static final int CHARGING_VALUE = 1;
            public static final int FULL_VALUE = 3;
            public static final int NOT_CHARGING_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private static final SEChargeStatus[] VALUES;
            private static final Internal.EnumLiteMap<SEChargeStatus> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEDeviceBatteryStatus$SEChargeStatus$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEChargeStatus> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEChargeStatus findValueByNumber(int i7) {
                    return SEChargeStatus.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEChargeStatus");
                internalValueMap = new Internal.EnumLiteMap<SEChargeStatus>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatus.SEChargeStatus.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEChargeStatus findValueByNumber(int i7) {
                        return SEChargeStatus.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEChargeStatus(int i7) {
                this.value = i7;
            }

            public static SEChargeStatus forNumber(int i7) {
                if (i7 == 0) {
                    return UNKNOWN;
                }
                if (i7 == 1) {
                    return CHARGING;
                }
                if (i7 == 2) {
                    return NOT_CHARGING;
                }
                if (i7 != 3) {
                    return null;
                }
                return FULL;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEDeviceBatteryStatus.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SEChargeStatus> internalGetValueMap() {
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
            public static SEChargeStatus valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEChargeStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEDeviceBatteryStatus");
            DEFAULT_INSTANCE = new SEDeviceBatteryStatus();
            PARSER = new AbstractParser<SEDeviceBatteryStatus>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatus.1
                @Override // com.google.protobuf.Parser
                public SEDeviceBatteryStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEDeviceBatteryStatus.newBuilder();
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

        public /* synthetic */ SEDeviceBatteryStatus(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEDeviceBatteryStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceProtos.internal_static_SEDeviceBatteryStatus_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEDeviceBatteryStatus parseDelimitedFrom(InputStream inputStream) {
            return (SEDeviceBatteryStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEDeviceBatteryStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEDeviceBatteryStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEDeviceBatteryStatus)) {
                return super.equals(obj);
            }
            SEDeviceBatteryStatus sEDeviceBatteryStatus = (SEDeviceBatteryStatus) obj;
            if (hasCapacity() != sEDeviceBatteryStatus.hasCapacity()) {
                return false;
            }
            if ((!hasCapacity() || getCapacity() == sEDeviceBatteryStatus.getCapacity()) && hasChargeStatus() == sEDeviceBatteryStatus.hasChargeStatus()) {
                return (!hasChargeStatus() || this.chargeStatus_ == sEDeviceBatteryStatus.chargeStatus_) && getUnknownFields().equals(sEDeviceBatteryStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatusOrBuilder
        public int getCapacity() {
            return this.capacity_;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatusOrBuilder
        public SEChargeStatus getChargeStatus() {
            SEChargeStatus sEChargeStatusForNumber = SEChargeStatus.forNumber(this.chargeStatus_);
            return sEChargeStatusForNumber == null ? SEChargeStatus.UNKNOWN : sEChargeStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return DeviceProtos.internal_static_SEDeviceBatteryStatus_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEDeviceBatteryStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.capacity_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.chargeStatus_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatusOrBuilder
        public boolean hasCapacity() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryStatusOrBuilder
        public boolean hasChargeStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasCapacity()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCapacity();
            }
            if (hasChargeStatus()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.chargeStatus_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceProtos.internal_static_SEDeviceBatteryStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDeviceBatteryStatus.class, Builder.class);
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
            if (hasCapacity()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.capacity_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.chargeStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEDeviceBatteryStatus(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.capacity_ = 0;
            this.chargeStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEDeviceBatteryStatus sEDeviceBatteryStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEDeviceBatteryStatus);
        }

        public static SEDeviceBatteryStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEDeviceBatteryStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceBatteryStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDeviceBatteryStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEDeviceBatteryStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEDeviceBatteryStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEDeviceBatteryStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEDeviceBatteryStatus() {
            this.capacity_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.chargeStatus_ = 0;
        }

        public static SEDeviceBatteryStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEDeviceBatteryStatus parseFrom(InputStream inputStream) {
            return (SEDeviceBatteryStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEDeviceBatteryStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceBatteryStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDeviceBatteryStatus parseFrom(CodedInputStream codedInputStream) {
            return (SEDeviceBatteryStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEDeviceBatteryStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceBatteryStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEDeviceBatteryStatusOrBuilder extends MessageOrBuilder {
        int getCapacity();

        SEDeviceBatteryStatus.SEChargeStatus getChargeStatus();

        boolean hasCapacity();

        boolean hasChargeStatus();
    }

    public static final class SEDeviceBatteryValue extends GeneratedMessage implements SEDeviceBatteryValueOrBuilder {
        private static final SEDeviceBatteryValue DEFAULT_INSTANCE;
        public static final int DEVICE_BATTERY_VALUE_FIELD_NUMBER = 1;
        private static final Parser<SEDeviceBatteryValue> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int deviceBatteryValue_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEDeviceBatteryValue$1 */
        public class AnonymousClass1 extends AbstractParser<SEDeviceBatteryValue> {
            @Override // com.google.protobuf.Parser
            public SEDeviceBatteryValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEDeviceBatteryValue.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDeviceBatteryValueOrBuilder {
            private int bitField0_;
            private int deviceBatteryValue_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEDeviceBatteryValue sEDeviceBatteryValue) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sEDeviceBatteryValue.deviceBatteryValue_ = this.deviceBatteryValue_;
                } else {
                    i7 = 0;
                }
                sEDeviceBatteryValue.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceProtos.internal_static_SEDeviceBatteryValue_descriptor;
            }

            public Builder clearDeviceBatteryValue() {
                this.bitField0_ &= -2;
                this.deviceBatteryValue_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceProtos.internal_static_SEDeviceBatteryValue_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryValueOrBuilder
            public int getDeviceBatteryValue() {
                return this.deviceBatteryValue_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryValueOrBuilder
            public boolean hasDeviceBatteryValue() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceProtos.internal_static_SEDeviceBatteryValue_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDeviceBatteryValue.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasDeviceBatteryValue();
            }

            public Builder setDeviceBatteryValue(int i7) {
                this.deviceBatteryValue_ = i7;
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
            public SEDeviceBatteryValue build() {
                SEDeviceBatteryValue sEDeviceBatteryValueBuildPartial = buildPartial();
                if (sEDeviceBatteryValueBuildPartial.isInitialized()) {
                    return sEDeviceBatteryValueBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDeviceBatteryValueBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDeviceBatteryValue buildPartial() {
                SEDeviceBatteryValue sEDeviceBatteryValue = new SEDeviceBatteryValue(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEDeviceBatteryValue);
                }
                onBuilt();
                return sEDeviceBatteryValue;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEDeviceBatteryValue getDefaultInstanceForType() {
                return SEDeviceBatteryValue.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.deviceBatteryValue_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEDeviceBatteryValue) {
                    return mergeFrom((SEDeviceBatteryValue) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEDeviceBatteryValue sEDeviceBatteryValue) {
                if (sEDeviceBatteryValue == SEDeviceBatteryValue.getDefaultInstance()) {
                    return this;
                }
                if (sEDeviceBatteryValue.hasDeviceBatteryValue()) {
                    setDeviceBatteryValue(sEDeviceBatteryValue.getDeviceBatteryValue());
                }
                mergeUnknownFields(sEDeviceBatteryValue.getUnknownFields());
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
                                    this.deviceBatteryValue_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEDeviceBatteryValue");
            DEFAULT_INSTANCE = new SEDeviceBatteryValue();
            PARSER = new AbstractParser<SEDeviceBatteryValue>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryValue.1
                @Override // com.google.protobuf.Parser
                public SEDeviceBatteryValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEDeviceBatteryValue.newBuilder();
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

        public /* synthetic */ SEDeviceBatteryValue(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEDeviceBatteryValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceProtos.internal_static_SEDeviceBatteryValue_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEDeviceBatteryValue parseDelimitedFrom(InputStream inputStream) {
            return (SEDeviceBatteryValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEDeviceBatteryValue parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEDeviceBatteryValue> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEDeviceBatteryValue)) {
                return super.equals(obj);
            }
            SEDeviceBatteryValue sEDeviceBatteryValue = (SEDeviceBatteryValue) obj;
            if (hasDeviceBatteryValue() != sEDeviceBatteryValue.hasDeviceBatteryValue()) {
                return false;
            }
            return (!hasDeviceBatteryValue() || getDeviceBatteryValue() == sEDeviceBatteryValue.getDeviceBatteryValue()) && getUnknownFields().equals(sEDeviceBatteryValue.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return DeviceProtos.internal_static_SEDeviceBatteryValue_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryValueOrBuilder
        public int getDeviceBatteryValue() {
            return this.deviceBatteryValue_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEDeviceBatteryValue> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.deviceBatteryValue_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeUInt32Size;
            return iComputeUInt32Size;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceBatteryValueOrBuilder
        public boolean hasDeviceBatteryValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasDeviceBatteryValue()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getDeviceBatteryValue();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceProtos.internal_static_SEDeviceBatteryValue_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDeviceBatteryValue.class, Builder.class);
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
            if (hasDeviceBatteryValue()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.deviceBatteryValue_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEDeviceBatteryValue(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.deviceBatteryValue_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEDeviceBatteryValue sEDeviceBatteryValue) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEDeviceBatteryValue);
        }

        public static SEDeviceBatteryValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEDeviceBatteryValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceBatteryValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDeviceBatteryValue parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEDeviceBatteryValue getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEDeviceBatteryValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEDeviceBatteryValue() {
            this.deviceBatteryValue_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEDeviceBatteryValue parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEDeviceBatteryValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEDeviceBatteryValue parseFrom(InputStream inputStream) {
            return (SEDeviceBatteryValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEDeviceBatteryValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceBatteryValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDeviceBatteryValue parseFrom(CodedInputStream codedInputStream) {
            return (SEDeviceBatteryValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEDeviceBatteryValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceBatteryValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEDeviceBatteryValueOrBuilder extends MessageOrBuilder {
        int getDeviceBatteryValue();

        boolean hasDeviceBatteryValue();
    }

    public static final class SEDeviceChargingCaseStatus extends GeneratedMessage implements SEDeviceChargingCaseStatusOrBuilder {
        public static final int BATT_LEVEL_FIELD_NUMBER = 1;
        public static final int CHARGE_STATUS_FIELD_NUMBER = 5;
        private static final SEDeviceChargingCaseStatus DEFAULT_INSTANCE;
        public static final int LID_STATUS_FIELD_NUMBER = 2;
        private static final Parser<SEDeviceChargingCaseStatus> PARSER;
        public static final int SERIAL_NUMS_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int battLevel_;
        private int bitField0_;
        private int chargeStatus_;
        private int lidStatus_;
        private byte memoizedIsInitialized;
        private volatile Object serialNums_;
        private volatile Object version_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEDeviceChargingCaseStatus$1 */
        public class AnonymousClass1 extends AbstractParser<SEDeviceChargingCaseStatus> {
            @Override // com.google.protobuf.Parser
            public SEDeviceChargingCaseStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEDeviceChargingCaseStatus.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDeviceChargingCaseStatusOrBuilder {
            private int battLevel_;
            private int bitField0_;
            private int chargeStatus_;
            private int lidStatus_;
            private Object serialNums_;
            private Object version_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEDeviceChargingCaseStatus.battLevel_ = this.battLevel_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEDeviceChargingCaseStatus.lidStatus_ = this.lidStatus_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEDeviceChargingCaseStatus.serialNums_ = this.serialNums_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEDeviceChargingCaseStatus.version_ = this.version_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEDeviceChargingCaseStatus.chargeStatus_ = this.chargeStatus_;
                    i7 |= 16;
                }
                sEDeviceChargingCaseStatus.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceProtos.internal_static_SEDeviceChargingCaseStatus_descriptor;
            }

            public Builder clearBattLevel() {
                this.bitField0_ &= -2;
                this.battLevel_ = 0;
                onChanged();
                return this;
            }

            public Builder clearChargeStatus() {
                this.bitField0_ &= -17;
                this.chargeStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLidStatus() {
                this.bitField0_ &= -3;
                this.lidStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSerialNums() {
                this.serialNums_ = SEDeviceChargingCaseStatus.getDefaultInstance().getSerialNums();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.version_ = SEDeviceChargingCaseStatus.getDefaultInstance().getVersion();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public int getBattLevel() {
                return this.battLevel_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public int getChargeStatus() {
                return this.chargeStatus_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceProtos.internal_static_SEDeviceChargingCaseStatus_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public int getLidStatus() {
                return this.lidStatus_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public String getSerialNums() {
                Object obj = this.serialNums_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.serialNums_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public ByteString getSerialNumsBytes() {
                Object obj = this.serialNums_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serialNums_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public String getVersion() {
                Object obj = this.version_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.version_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public ByteString getVersionBytes() {
                Object obj = this.version_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.version_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public boolean hasBattLevel() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public boolean hasChargeStatus() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public boolean hasLidStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public boolean hasSerialNums() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
            public boolean hasVersion() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceProtos.internal_static_SEDeviceChargingCaseStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDeviceChargingCaseStatus.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasBattLevel() && hasLidStatus() && hasSerialNums();
            }

            public Builder setBattLevel(int i7) {
                this.battLevel_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setChargeStatus(int i7) {
                this.chargeStatus_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLidStatus(int i7) {
                this.lidStatus_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSerialNums(String str) {
                str.getClass();
                this.serialNums_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSerialNumsBytes(ByteString byteString) {
                byteString.getClass();
                this.serialNums_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setVersion(String str) {
                str.getClass();
                this.version_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.version_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                this.serialNums_ = "";
                this.version_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDeviceChargingCaseStatus build() {
                SEDeviceChargingCaseStatus sEDeviceChargingCaseStatusBuildPartial = buildPartial();
                if (sEDeviceChargingCaseStatusBuildPartial.isInitialized()) {
                    return sEDeviceChargingCaseStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDeviceChargingCaseStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDeviceChargingCaseStatus buildPartial() {
                SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus = new SEDeviceChargingCaseStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEDeviceChargingCaseStatus);
                }
                onBuilt();
                return sEDeviceChargingCaseStatus;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEDeviceChargingCaseStatus getDefaultInstanceForType() {
                return SEDeviceChargingCaseStatus.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.battLevel_ = 0;
                this.lidStatus_ = 0;
                this.serialNums_ = "";
                this.version_ = "";
                this.chargeStatus_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.serialNums_ = "";
                this.version_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEDeviceChargingCaseStatus) {
                    return mergeFrom((SEDeviceChargingCaseStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus) {
                if (sEDeviceChargingCaseStatus == SEDeviceChargingCaseStatus.getDefaultInstance()) {
                    return this;
                }
                if (sEDeviceChargingCaseStatus.hasBattLevel()) {
                    setBattLevel(sEDeviceChargingCaseStatus.getBattLevel());
                }
                if (sEDeviceChargingCaseStatus.hasLidStatus()) {
                    setLidStatus(sEDeviceChargingCaseStatus.getLidStatus());
                }
                if (sEDeviceChargingCaseStatus.hasSerialNums()) {
                    this.serialNums_ = sEDeviceChargingCaseStatus.serialNums_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEDeviceChargingCaseStatus.hasVersion()) {
                    this.version_ = sEDeviceChargingCaseStatus.version_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEDeviceChargingCaseStatus.hasChargeStatus()) {
                    setChargeStatus(sEDeviceChargingCaseStatus.getChargeStatus());
                }
                mergeUnknownFields(sEDeviceChargingCaseStatus.getUnknownFields());
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
                                    this.battLevel_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.lidStatus_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.serialNums_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.version_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag != 40) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.chargeStatus_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEDeviceChargingCaseStatus");
            DEFAULT_INSTANCE = new SEDeviceChargingCaseStatus();
            PARSER = new AbstractParser<SEDeviceChargingCaseStatus>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatus.1
                @Override // com.google.protobuf.Parser
                public SEDeviceChargingCaseStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEDeviceChargingCaseStatus.newBuilder();
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

        public /* synthetic */ SEDeviceChargingCaseStatus(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEDeviceChargingCaseStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceProtos.internal_static_SEDeviceChargingCaseStatus_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEDeviceChargingCaseStatus parseDelimitedFrom(InputStream inputStream) {
            return (SEDeviceChargingCaseStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEDeviceChargingCaseStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEDeviceChargingCaseStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEDeviceChargingCaseStatus)) {
                return super.equals(obj);
            }
            SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus = (SEDeviceChargingCaseStatus) obj;
            if (hasBattLevel() != sEDeviceChargingCaseStatus.hasBattLevel()) {
                return false;
            }
            if ((hasBattLevel() && getBattLevel() != sEDeviceChargingCaseStatus.getBattLevel()) || hasLidStatus() != sEDeviceChargingCaseStatus.hasLidStatus()) {
                return false;
            }
            if ((hasLidStatus() && getLidStatus() != sEDeviceChargingCaseStatus.getLidStatus()) || hasSerialNums() != sEDeviceChargingCaseStatus.hasSerialNums()) {
                return false;
            }
            if ((hasSerialNums() && !getSerialNums().equals(sEDeviceChargingCaseStatus.getSerialNums())) || hasVersion() != sEDeviceChargingCaseStatus.hasVersion()) {
                return false;
            }
            if ((!hasVersion() || getVersion().equals(sEDeviceChargingCaseStatus.getVersion())) && hasChargeStatus() == sEDeviceChargingCaseStatus.hasChargeStatus()) {
                return (!hasChargeStatus() || getChargeStatus() == sEDeviceChargingCaseStatus.getChargeStatus()) && getUnknownFields().equals(sEDeviceChargingCaseStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public int getBattLevel() {
            return this.battLevel_;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public int getChargeStatus() {
            return this.chargeStatus_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return DeviceProtos.internal_static_SEDeviceChargingCaseStatus_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public int getLidStatus() {
            return this.lidStatus_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEDeviceChargingCaseStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public String getSerialNums() {
            Object obj = this.serialNums_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.serialNums_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public ByteString getSerialNumsBytes() {
            Object obj = this.serialNums_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.serialNums_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.battLevel_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.lidStatus_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(3, this.serialNums_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(4, this.version_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.chargeStatus_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.version_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public ByteString getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.version_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public boolean hasBattLevel() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public boolean hasChargeStatus() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public boolean hasLidStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public boolean hasSerialNums() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceChargingCaseStatusOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasBattLevel()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBattLevel();
            }
            if (hasLidStatus()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getLidStatus();
            }
            if (hasSerialNums()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getSerialNums().hashCode();
            }
            if (hasVersion()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getVersion().hashCode();
            }
            if (hasChargeStatus()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getChargeStatus();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceProtos.internal_static_SEDeviceChargingCaseStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDeviceChargingCaseStatus.class, Builder.class);
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
            if (!hasBattLevel()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLidStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSerialNums()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.battLevel_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.lidStatus_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.serialNums_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.version_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.chargeStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEDeviceChargingCaseStatus(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.battLevel_ = 0;
            this.lidStatus_ = 0;
            this.serialNums_ = "";
            this.version_ = "";
            this.chargeStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEDeviceChargingCaseStatus sEDeviceChargingCaseStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEDeviceChargingCaseStatus);
        }

        public static SEDeviceChargingCaseStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEDeviceChargingCaseStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceChargingCaseStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDeviceChargingCaseStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEDeviceChargingCaseStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEDeviceChargingCaseStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEDeviceChargingCaseStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEDeviceChargingCaseStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEDeviceChargingCaseStatus parseFrom(InputStream inputStream) {
            return (SEDeviceChargingCaseStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEDeviceChargingCaseStatus() {
            this.battLevel_ = 0;
            this.lidStatus_ = 0;
            this.serialNums_ = "";
            this.version_ = "";
            this.chargeStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.serialNums_ = "";
            this.version_ = "";
        }

        public static SEDeviceChargingCaseStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceChargingCaseStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDeviceChargingCaseStatus parseFrom(CodedInputStream codedInputStream) {
            return (SEDeviceChargingCaseStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEDeviceChargingCaseStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceChargingCaseStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEDeviceChargingCaseStatusOrBuilder extends MessageOrBuilder {
        int getBattLevel();

        int getChargeStatus();

        int getLidStatus();

        String getSerialNums();

        ByteString getSerialNumsBytes();

        String getVersion();

        ByteString getVersionBytes();

        boolean hasBattLevel();

        boolean hasChargeStatus();

        boolean hasLidStatus();

        boolean hasSerialNums();

        boolean hasVersion();
    }

    public static final class SEDeviceInfo extends GeneratedMessage implements SEDeviceInfoOrBuilder {
        private static final SEDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_BATTERY_STATUS_FIELD_NUMBER = 5;
        public static final int EQUIPMENT_NUMBER_FIELD_NUMBER = 2;
        public static final int FIRMWARE_VERSION_FIELD_NUMBER = 1;
        public static final int LAST_DISCONNECT_REASON_FIELD_NUMBER = 8;
        public static final int LAST_DISCONNECT_TIMESTAMP_FIELD_NUMBER = 9;
        public static final int MAC_FIELD_NUMBER = 3;
        private static final Parser<SEDeviceInfo> PARSER;
        public static final int REMOTE_DEVICE_REMOTE_CAMERA_SWITCH_FIELD_NUMBER = 6;
        public static final int SERIAL_NUMBER_FIELD_NUMBER = 4;
        public static final int SPORTS_ICON_FUNCTION_PROTOCOL_SWITCH_FIELD_NUMBER = 7;
        public static final int SPP_SUPPORT_FLAT_FIELD_NUMBER = 10;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SEDeviceBatteryStatus deviceBatteryStatus_;
        private volatile Object equipmentNumber_;
        private volatile Object firmwareVersion_;
        private int lastDisconnectReason_;
        private int lastDisconnectTimestamp_;
        private volatile Object mac_;
        private byte memoizedIsInitialized;
        private boolean remoteDeviceRemoteCameraSwitch_;
        private volatile Object serialNumber_;
        private boolean sportsIconFunctionProtocolSwitch_;
        private boolean sppSupportFlat_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEDeviceInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEDeviceInfo> {
            @Override // com.google.protobuf.Parser
            public SEDeviceInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEDeviceInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEDeviceInfoOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> deviceBatteryStatusBuilder_;
            private SEDeviceBatteryStatus deviceBatteryStatus_;
            private Object equipmentNumber_;
            private Object firmwareVersion_;
            private int lastDisconnectReason_;
            private int lastDisconnectTimestamp_;
            private Object mac_;
            private boolean remoteDeviceRemoteCameraSwitch_;
            private Object serialNumber_;
            private boolean sportsIconFunctionProtocolSwitch_;
            private boolean sppSupportFlat_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEDeviceInfo sEDeviceInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEDeviceInfo.firmwareVersion_ = this.firmwareVersion_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEDeviceInfo.equipmentNumber_ = this.equipmentNumber_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEDeviceInfo.mac_ = this.mac_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEDeviceInfo.serialNumber_ = this.serialNumber_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                    sEDeviceInfo.deviceBatteryStatus_ = singleFieldBuilder == null ? this.deviceBatteryStatus_ : (SEDeviceBatteryStatus) singleFieldBuilder.build();
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEDeviceInfo.remoteDeviceRemoteCameraSwitch_ = this.remoteDeviceRemoteCameraSwitch_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEDeviceInfo.sportsIconFunctionProtocolSwitch_ = this.sportsIconFunctionProtocolSwitch_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sEDeviceInfo.lastDisconnectReason_ = this.lastDisconnectReason_;
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    sEDeviceInfo.lastDisconnectTimestamp_ = this.lastDisconnectTimestamp_;
                    i7 |= 256;
                }
                if ((i8 & 512) != 0) {
                    sEDeviceInfo.sppSupportFlat_ = this.sppSupportFlat_;
                    i7 |= 512;
                }
                sEDeviceInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceProtos.internal_static_SEDeviceInfo_descriptor;
            }

            private SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> internalGetDeviceBatteryStatusFieldBuilder() {
                if (this.deviceBatteryStatusBuilder_ == null) {
                    this.deviceBatteryStatusBuilder_ = new SingleFieldBuilder<>(getDeviceBatteryStatus(), getParentForChildren(), isClean());
                    this.deviceBatteryStatus_ = null;
                }
                return this.deviceBatteryStatusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetDeviceBatteryStatusFieldBuilder();
                }
            }

            public Builder clearDeviceBatteryStatus() {
                this.bitField0_ &= -17;
                this.deviceBatteryStatus_ = null;
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.deviceBatteryStatusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEquipmentNumber() {
                this.equipmentNumber_ = SEDeviceInfo.getDefaultInstance().getEquipmentNumber();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearFirmwareVersion() {
                this.firmwareVersion_ = SEDeviceInfo.getDefaultInstance().getFirmwareVersion();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearLastDisconnectReason() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.lastDisconnectReason_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLastDisconnectTimestamp() {
                this.bitField0_ &= -257;
                this.lastDisconnectTimestamp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMac() {
                this.mac_ = SEDeviceInfo.getDefaultInstance().getMac();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearRemoteDeviceRemoteCameraSwitch() {
                this.bitField0_ &= -33;
                this.remoteDeviceRemoteCameraSwitch_ = false;
                onChanged();
                return this;
            }

            public Builder clearSerialNumber() {
                this.serialNumber_ = SEDeviceInfo.getDefaultInstance().getSerialNumber();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearSportsIconFunctionProtocolSwitch() {
                this.bitField0_ &= -65;
                this.sportsIconFunctionProtocolSwitch_ = false;
                onChanged();
                return this;
            }

            public Builder clearSppSupportFlat() {
                this.bitField0_ &= -513;
                this.sppSupportFlat_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceProtos.internal_static_SEDeviceInfo_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public SEDeviceBatteryStatus getDeviceBatteryStatus() {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEDeviceBatteryStatus) singleFieldBuilder.getMessage();
                }
                SEDeviceBatteryStatus sEDeviceBatteryStatus = this.deviceBatteryStatus_;
                return sEDeviceBatteryStatus == null ? SEDeviceBatteryStatus.getDefaultInstance() : sEDeviceBatteryStatus;
            }

            public SEDeviceBatteryStatus.Builder getDeviceBatteryStatusBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SEDeviceBatteryStatus.Builder) internalGetDeviceBatteryStatusFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public SEDeviceBatteryStatusOrBuilder getDeviceBatteryStatusOrBuilder() {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEDeviceBatteryStatusOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEDeviceBatteryStatus sEDeviceBatteryStatus = this.deviceBatteryStatus_;
                return sEDeviceBatteryStatus == null ? SEDeviceBatteryStatus.getDefaultInstance() : sEDeviceBatteryStatus;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public String getEquipmentNumber() {
                Object obj = this.equipmentNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.equipmentNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public ByteString getEquipmentNumberBytes() {
                Object obj = this.equipmentNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.equipmentNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public String getFirmwareVersion() {
                Object obj = this.firmwareVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.firmwareVersion_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public ByteString getFirmwareVersionBytes() {
                Object obj = this.firmwareVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.firmwareVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public int getLastDisconnectReason() {
                return this.lastDisconnectReason_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public int getLastDisconnectTimestamp() {
                return this.lastDisconnectTimestamp_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public String getMac() {
                Object obj = this.mac_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.mac_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public ByteString getMacBytes() {
                Object obj = this.mac_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mac_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean getRemoteDeviceRemoteCameraSwitch() {
                return this.remoteDeviceRemoteCameraSwitch_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public String getSerialNumber() {
                Object obj = this.serialNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.serialNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public ByteString getSerialNumberBytes() {
                Object obj = this.serialNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serialNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean getSportsIconFunctionProtocolSwitch() {
                return this.sportsIconFunctionProtocolSwitch_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean getSppSupportFlat() {
                return this.sppSupportFlat_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasDeviceBatteryStatus() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasEquipmentNumber() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasFirmwareVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasLastDisconnectReason() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasLastDisconnectTimestamp() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasMac() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasRemoteDeviceRemoteCameraSwitch() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasSerialNumber() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasSportsIconFunctionProtocolSwitch() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
            public boolean hasSppSupportFlat() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceProtos.internal_static_SEDeviceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDeviceInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFirmwareVersion() && hasEquipmentNumber() && hasMac() && hasSerialNumber() && hasDeviceBatteryStatus() && getDeviceBatteryStatus().isInitialized();
            }

            public Builder mergeDeviceBatteryStatus(SEDeviceBatteryStatus sEDeviceBatteryStatus) {
                SEDeviceBatteryStatus sEDeviceBatteryStatus2;
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEDeviceBatteryStatus);
                } else if ((this.bitField0_ & 16) == 0 || (sEDeviceBatteryStatus2 = this.deviceBatteryStatus_) == null || sEDeviceBatteryStatus2 == SEDeviceBatteryStatus.getDefaultInstance()) {
                    this.deviceBatteryStatus_ = sEDeviceBatteryStatus;
                } else {
                    getDeviceBatteryStatusBuilder().mergeFrom(sEDeviceBatteryStatus);
                }
                if (this.deviceBatteryStatus_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder setDeviceBatteryStatus(SEDeviceBatteryStatus sEDeviceBatteryStatus) {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder == null) {
                    sEDeviceBatteryStatus.getClass();
                    this.deviceBatteryStatus_ = sEDeviceBatteryStatus;
                } else {
                    singleFieldBuilder.setMessage(sEDeviceBatteryStatus);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEquipmentNumber(String str) {
                str.getClass();
                this.equipmentNumber_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEquipmentNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.equipmentNumber_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFirmwareVersion(String str) {
                str.getClass();
                this.firmwareVersion_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFirmwareVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.firmwareVersion_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLastDisconnectReason(int i7) {
                this.lastDisconnectReason_ = i7;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setLastDisconnectTimestamp(int i7) {
                this.lastDisconnectTimestamp_ = i7;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setMac(String str) {
                str.getClass();
                this.mac_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMacBytes(ByteString byteString) {
                byteString.getClass();
                this.mac_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRemoteDeviceRemoteCameraSwitch(boolean z6) {
                this.remoteDeviceRemoteCameraSwitch_ = z6;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSerialNumber(String str) {
                str.getClass();
                this.serialNumber_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSerialNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.serialNumber_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSportsIconFunctionProtocolSwitch(boolean z6) {
                this.sportsIconFunctionProtocolSwitch_ = z6;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSppSupportFlat(boolean z6) {
                this.sppSupportFlat_ = z6;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(d dVar) {
                this();
            }

            private Builder() {
                this.firmwareVersion_ = "";
                this.equipmentNumber_ = "";
                this.mac_ = "";
                this.serialNumber_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDeviceInfo build() {
                SEDeviceInfo sEDeviceInfoBuildPartial = buildPartial();
                if (sEDeviceInfoBuildPartial.isInitialized()) {
                    return sEDeviceInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEDeviceInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEDeviceInfo buildPartial() {
                SEDeviceInfo sEDeviceInfo = new SEDeviceInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEDeviceInfo);
                }
                onBuilt();
                return sEDeviceInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEDeviceInfo getDefaultInstanceForType() {
                return SEDeviceInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.firmwareVersion_ = "";
                this.equipmentNumber_ = "";
                this.mac_ = "";
                this.serialNumber_ = "";
                this.deviceBatteryStatus_ = null;
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.deviceBatteryStatusBuilder_ = null;
                }
                this.remoteDeviceRemoteCameraSwitch_ = false;
                this.sportsIconFunctionProtocolSwitch_ = false;
                this.lastDisconnectReason_ = 0;
                this.lastDisconnectTimestamp_ = 0;
                this.sppSupportFlat_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEDeviceInfo) {
                    return mergeFrom((SEDeviceInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDeviceBatteryStatus(SEDeviceBatteryStatus.Builder builder) {
                SingleFieldBuilder<SEDeviceBatteryStatus, SEDeviceBatteryStatus.Builder, SEDeviceBatteryStatusOrBuilder> singleFieldBuilder = this.deviceBatteryStatusBuilder_;
                if (singleFieldBuilder == null) {
                    this.deviceBatteryStatus_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.firmwareVersion_ = "";
                this.equipmentNumber_ = "";
                this.mac_ = "";
                this.serialNumber_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(SEDeviceInfo sEDeviceInfo) {
                if (sEDeviceInfo == SEDeviceInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEDeviceInfo.hasFirmwareVersion()) {
                    this.firmwareVersion_ = sEDeviceInfo.firmwareVersion_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEDeviceInfo.hasEquipmentNumber()) {
                    this.equipmentNumber_ = sEDeviceInfo.equipmentNumber_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEDeviceInfo.hasMac()) {
                    this.mac_ = sEDeviceInfo.mac_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEDeviceInfo.hasSerialNumber()) {
                    this.serialNumber_ = sEDeviceInfo.serialNumber_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEDeviceInfo.hasDeviceBatteryStatus()) {
                    mergeDeviceBatteryStatus(sEDeviceInfo.getDeviceBatteryStatus());
                }
                if (sEDeviceInfo.hasRemoteDeviceRemoteCameraSwitch()) {
                    setRemoteDeviceRemoteCameraSwitch(sEDeviceInfo.getRemoteDeviceRemoteCameraSwitch());
                }
                if (sEDeviceInfo.hasSportsIconFunctionProtocolSwitch()) {
                    setSportsIconFunctionProtocolSwitch(sEDeviceInfo.getSportsIconFunctionProtocolSwitch());
                }
                if (sEDeviceInfo.hasLastDisconnectReason()) {
                    setLastDisconnectReason(sEDeviceInfo.getLastDisconnectReason());
                }
                if (sEDeviceInfo.hasLastDisconnectTimestamp()) {
                    setLastDisconnectTimestamp(sEDeviceInfo.getLastDisconnectTimestamp());
                }
                if (sEDeviceInfo.hasSppSupportFlat()) {
                    setSppSupportFlat(sEDeviceInfo.getSppSupportFlat());
                }
                mergeUnknownFields(sEDeviceInfo.getUnknownFields());
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
                                    this.firmwareVersion_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    break;
                                case 18:
                                    this.equipmentNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    break;
                                case 26:
                                    this.mac_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    break;
                                case 34:
                                    this.serialNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    codedInputStream.readMessage(internalGetDeviceBatteryStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    break;
                                case 48:
                                    this.remoteDeviceRemoteCameraSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    break;
                                case 56:
                                    this.sportsIconFunctionProtocolSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.lastDisconnectReason_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 72:
                                    this.lastDisconnectTimestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    break;
                                case 80:
                                    this.sppSupportFlat_ = codedInputStream.readBool();
                                    this.bitField0_ |= 512;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEDeviceInfo");
            DEFAULT_INSTANCE = new SEDeviceInfo();
            PARSER = new AbstractParser<SEDeviceInfo>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfo.1
                @Override // com.google.protobuf.Parser
                public SEDeviceInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEDeviceInfo.newBuilder();
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

        public /* synthetic */ SEDeviceInfo(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceProtos.internal_static_SEDeviceInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEDeviceInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEDeviceInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEDeviceInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEDeviceInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEDeviceInfo)) {
                return super.equals(obj);
            }
            SEDeviceInfo sEDeviceInfo = (SEDeviceInfo) obj;
            if (hasFirmwareVersion() != sEDeviceInfo.hasFirmwareVersion()) {
                return false;
            }
            if ((hasFirmwareVersion() && !getFirmwareVersion().equals(sEDeviceInfo.getFirmwareVersion())) || hasEquipmentNumber() != sEDeviceInfo.hasEquipmentNumber()) {
                return false;
            }
            if ((hasEquipmentNumber() && !getEquipmentNumber().equals(sEDeviceInfo.getEquipmentNumber())) || hasMac() != sEDeviceInfo.hasMac()) {
                return false;
            }
            if ((hasMac() && !getMac().equals(sEDeviceInfo.getMac())) || hasSerialNumber() != sEDeviceInfo.hasSerialNumber()) {
                return false;
            }
            if ((hasSerialNumber() && !getSerialNumber().equals(sEDeviceInfo.getSerialNumber())) || hasDeviceBatteryStatus() != sEDeviceInfo.hasDeviceBatteryStatus()) {
                return false;
            }
            if ((hasDeviceBatteryStatus() && !getDeviceBatteryStatus().equals(sEDeviceInfo.getDeviceBatteryStatus())) || hasRemoteDeviceRemoteCameraSwitch() != sEDeviceInfo.hasRemoteDeviceRemoteCameraSwitch()) {
                return false;
            }
            if ((hasRemoteDeviceRemoteCameraSwitch() && getRemoteDeviceRemoteCameraSwitch() != sEDeviceInfo.getRemoteDeviceRemoteCameraSwitch()) || hasSportsIconFunctionProtocolSwitch() != sEDeviceInfo.hasSportsIconFunctionProtocolSwitch()) {
                return false;
            }
            if ((hasSportsIconFunctionProtocolSwitch() && getSportsIconFunctionProtocolSwitch() != sEDeviceInfo.getSportsIconFunctionProtocolSwitch()) || hasLastDisconnectReason() != sEDeviceInfo.hasLastDisconnectReason()) {
                return false;
            }
            if ((hasLastDisconnectReason() && getLastDisconnectReason() != sEDeviceInfo.getLastDisconnectReason()) || hasLastDisconnectTimestamp() != sEDeviceInfo.hasLastDisconnectTimestamp()) {
                return false;
            }
            if ((!hasLastDisconnectTimestamp() || getLastDisconnectTimestamp() == sEDeviceInfo.getLastDisconnectTimestamp()) && hasSppSupportFlat() == sEDeviceInfo.hasSppSupportFlat()) {
                return (!hasSppSupportFlat() || getSppSupportFlat() == sEDeviceInfo.getSppSupportFlat()) && getUnknownFields().equals(sEDeviceInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return DeviceProtos.internal_static_SEDeviceInfo_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public SEDeviceBatteryStatus getDeviceBatteryStatus() {
            SEDeviceBatteryStatus sEDeviceBatteryStatus = this.deviceBatteryStatus_;
            return sEDeviceBatteryStatus == null ? SEDeviceBatteryStatus.getDefaultInstance() : sEDeviceBatteryStatus;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public SEDeviceBatteryStatusOrBuilder getDeviceBatteryStatusOrBuilder() {
            SEDeviceBatteryStatus sEDeviceBatteryStatus = this.deviceBatteryStatus_;
            return sEDeviceBatteryStatus == null ? SEDeviceBatteryStatus.getDefaultInstance() : sEDeviceBatteryStatus;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public String getEquipmentNumber() {
            Object obj = this.equipmentNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.equipmentNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public ByteString getEquipmentNumberBytes() {
            Object obj = this.equipmentNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.equipmentNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public String getFirmwareVersion() {
            Object obj = this.firmwareVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.firmwareVersion_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public ByteString getFirmwareVersionBytes() {
            Object obj = this.firmwareVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.firmwareVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public int getLastDisconnectReason() {
            return this.lastDisconnectReason_;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public int getLastDisconnectTimestamp() {
            return this.lastDisconnectTimestamp_;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public String getMac() {
            Object obj = this.mac_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.mac_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public ByteString getMacBytes() {
            Object obj = this.mac_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mac_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEDeviceInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean getRemoteDeviceRemoteCameraSwitch() {
            return this.remoteDeviceRemoteCameraSwitch_;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public String getSerialNumber() {
            Object obj = this.serialNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.serialNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public ByteString getSerialNumberBytes() {
            Object obj = this.serialNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.serialNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.firmwareVersion_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.equipmentNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.mac_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.serialNumber_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(5, getDeviceBatteryStatus());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(6, this.remoteDeviceRemoteCameraSwitch_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(7, this.sportsIconFunctionProtocolSwitch_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(8, this.lastDisconnectReason_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(9, this.lastDisconnectTimestamp_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(10, this.sppSupportFlat_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean getSportsIconFunctionProtocolSwitch() {
            return this.sportsIconFunctionProtocolSwitch_;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean getSppSupportFlat() {
            return this.sppSupportFlat_;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasDeviceBatteryStatus() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasEquipmentNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasFirmwareVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasLastDisconnectReason() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasLastDisconnectTimestamp() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasMac() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasRemoteDeviceRemoteCameraSwitch() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasSerialNumber() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasSportsIconFunctionProtocolSwitch() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEDeviceInfoOrBuilder
        public boolean hasSppSupportFlat() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasFirmwareVersion()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFirmwareVersion().hashCode();
            }
            if (hasEquipmentNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEquipmentNumber().hashCode();
            }
            if (hasMac()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMac().hashCode();
            }
            if (hasSerialNumber()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getSerialNumber().hashCode();
            }
            if (hasDeviceBatteryStatus()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getDeviceBatteryStatus().hashCode();
            }
            if (hasRemoteDeviceRemoteCameraSwitch()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + Internal.hashBoolean(getRemoteDeviceRemoteCameraSwitch());
            }
            if (hasSportsIconFunctionProtocolSwitch()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + Internal.hashBoolean(getSportsIconFunctionProtocolSwitch());
            }
            if (hasLastDisconnectReason()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getLastDisconnectReason();
            }
            if (hasLastDisconnectTimestamp()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getLastDisconnectTimestamp();
            }
            if (hasSppSupportFlat()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + Internal.hashBoolean(getSppSupportFlat());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceProtos.internal_static_SEDeviceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEDeviceInfo.class, Builder.class);
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
            if (!hasFirmwareVersion()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasEquipmentNumber()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMac()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSerialNumber()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDeviceBatteryStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getDeviceBatteryStatus().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.firmwareVersion_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.equipmentNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.mac_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.serialNumber_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getDeviceBatteryStatus());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.remoteDeviceRemoteCameraSwitch_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.sportsIconFunctionProtocolSwitch_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.lastDisconnectReason_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.lastDisconnectTimestamp_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeBool(10, this.sppSupportFlat_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEDeviceInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.firmwareVersion_ = "";
            this.equipmentNumber_ = "";
            this.mac_ = "";
            this.serialNumber_ = "";
            this.remoteDeviceRemoteCameraSwitch_ = false;
            this.sportsIconFunctionProtocolSwitch_ = false;
            this.lastDisconnectReason_ = 0;
            this.lastDisconnectTimestamp_ = 0;
            this.sppSupportFlat_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEDeviceInfo sEDeviceInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEDeviceInfo);
        }

        public static SEDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDeviceInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEDeviceInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEDeviceInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEDeviceInfo parseFrom(InputStream inputStream) {
            return (SEDeviceInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEDeviceInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEDeviceInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private SEDeviceInfo() {
            this.firmwareVersion_ = "";
            this.equipmentNumber_ = "";
            this.mac_ = "";
            this.serialNumber_ = "";
            this.remoteDeviceRemoteCameraSwitch_ = false;
            this.sportsIconFunctionProtocolSwitch_ = false;
            this.lastDisconnectReason_ = 0;
            this.lastDisconnectTimestamp_ = 0;
            this.sppSupportFlat_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.firmwareVersion_ = "";
            this.equipmentNumber_ = "";
            this.mac_ = "";
            this.serialNumber_ = "";
        }

        public static SEDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEDeviceInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEDeviceInfoOrBuilder extends MessageOrBuilder {
        SEDeviceBatteryStatus getDeviceBatteryStatus();

        SEDeviceBatteryStatusOrBuilder getDeviceBatteryStatusOrBuilder();

        String getEquipmentNumber();

        ByteString getEquipmentNumberBytes();

        String getFirmwareVersion();

        ByteString getFirmwareVersionBytes();

        int getLastDisconnectReason();

        int getLastDisconnectTimestamp();

        String getMac();

        ByteString getMacBytes();

        boolean getRemoteDeviceRemoteCameraSwitch();

        String getSerialNumber();

        ByteString getSerialNumberBytes();

        boolean getSportsIconFunctionProtocolSwitch();

        boolean getSppSupportFlat();

        boolean hasDeviceBatteryStatus();

        boolean hasEquipmentNumber();

        boolean hasFirmwareVersion();

        boolean hasLastDisconnectReason();

        boolean hasLastDisconnectTimestamp();

        boolean hasMac();

        boolean hasRemoteDeviceRemoteCameraSwitch();

        boolean hasSerialNumber();

        boolean hasSportsIconFunctionProtocolSwitch();

        boolean hasSppSupportFlat();
    }

    public interface SEDeviceOrBuilder extends MessageOrBuilder {
        SEDeviceBatteryStatus getDeviceBatteryStatus();

        SEDeviceBatteryStatusOrBuilder getDeviceBatteryStatusOrBuilder();

        SEDeviceBatteryValue getDeviceBatteryValueRequest();

        SEDeviceBatteryValueOrBuilder getDeviceBatteryValueRequestOrBuilder();

        SEDeviceChargingCaseStatus getDeviceChargingCaseStatus();

        SEDeviceChargingCaseStatusOrBuilder getDeviceChargingCaseStatusOrBuilder();

        SEDeviceInfo getDeviceInfo();

        SEDeviceInfoOrBuilder getDeviceInfoOrBuilder();

        SEMptPowerLog getMptPowerLog();

        SEMptPowerLog.List getMptPowerLogList();

        SEMptPowerLog.ListOrBuilder getMptPowerLogListOrBuilder();

        SEMptPowerLogOrBuilder getMptPowerLogOrBuilder();

        SEDevice.PayloadCase getPayloadCase();

        boolean hasDeviceBatteryStatus();

        boolean hasDeviceBatteryValueRequest();

        boolean hasDeviceChargingCaseStatus();

        boolean hasDeviceInfo();

        boolean hasMptPowerLog();

        boolean hasMptPowerLogList();
    }

    public static final class SEMptPowerLog extends GeneratedMessage implements SEMptPowerLogOrBuilder {
        private static final SEMptPowerLog DEFAULT_INSTANCE;
        public static final int END_TIMESTAMP_FIELD_NUMBER = 4;
        private static final Parser<SEMptPowerLog> PARSER;
        public static final int POWER_LOG_LIST_FIELD_NUMBER = 3;
        public static final int POWER_PERCENT_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int endTimestamp_;
        private byte memoizedIsInitialized;
        private SEPowerLog.List powerLogList_;
        private int powerPercent_;
        private int timestamp_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEMptPowerLog$1 */
        public class AnonymousClass1 extends AbstractParser<SEMptPowerLog> {
            @Override // com.google.protobuf.Parser
            public SEMptPowerLog parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEMptPowerLog.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEMptPowerLogOrBuilder {
            private int bitField0_;
            private int endTimestamp_;
            private SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> powerLogListBuilder_;
            private SEPowerLog.List powerLogList_;
            private int powerPercent_;
            private int timestamp_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEMptPowerLog sEMptPowerLog) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEMptPowerLog.timestamp_ = this.timestamp_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEMptPowerLog.powerPercent_ = this.powerPercent_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> singleFieldBuilder = this.powerLogListBuilder_;
                    sEMptPowerLog.powerLogList_ = singleFieldBuilder == null ? this.powerLogList_ : (SEPowerLog.List) singleFieldBuilder.build();
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEMptPowerLog.endTimestamp_ = this.endTimestamp_;
                    i7 |= 8;
                }
                sEMptPowerLog.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceProtos.internal_static_SEMptPowerLog_descriptor;
            }

            private SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> internalGetPowerLogListFieldBuilder() {
                if (this.powerLogListBuilder_ == null) {
                    this.powerLogListBuilder_ = new SingleFieldBuilder<>(getPowerLogList(), getParentForChildren(), isClean());
                    this.powerLogList_ = null;
                }
                return this.powerLogListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetPowerLogListFieldBuilder();
                }
            }

            public Builder clearEndTimestamp() {
                this.bitField0_ &= -9;
                this.endTimestamp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPowerLogList() {
                this.bitField0_ &= -5;
                this.powerLogList_ = null;
                SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> singleFieldBuilder = this.powerLogListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.powerLogListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPowerPercent() {
                this.bitField0_ &= -3;
                this.powerPercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -2;
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceProtos.internal_static_SEMptPowerLog_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
            public int getEndTimestamp() {
                return this.endTimestamp_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
            public SEPowerLog.List getPowerLogList() {
                SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> singleFieldBuilder = this.powerLogListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEPowerLog.List) singleFieldBuilder.getMessage();
                }
                SEPowerLog.List list = this.powerLogList_;
                return list == null ? SEPowerLog.List.getDefaultInstance() : list;
            }

            public SEPowerLog.List.Builder getPowerLogListBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SEPowerLog.List.Builder) internalGetPowerLogListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
            public SEPowerLog.ListOrBuilder getPowerLogListOrBuilder() {
                SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> singleFieldBuilder = this.powerLogListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEPowerLog.ListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEPowerLog.List list = this.powerLogList_;
                return list == null ? SEPowerLog.List.getDefaultInstance() : list;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
            public int getPowerPercent() {
                return this.powerPercent_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
            public boolean hasEndTimestamp() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
            public boolean hasPowerLogList() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
            public boolean hasPowerPercent() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceProtos.internal_static_SEMptPowerLog_fieldAccessorTable.ensureFieldAccessorsInitialized(SEMptPowerLog.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTimestamp() && hasPowerPercent() && hasPowerLogList() && getPowerLogList().isInitialized();
            }

            public Builder mergePowerLogList(SEPowerLog.List list) {
                SEPowerLog.List list2;
                SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> singleFieldBuilder = this.powerLogListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(list);
                } else if ((this.bitField0_ & 4) == 0 || (list2 = this.powerLogList_) == null || list2 == SEPowerLog.List.getDefaultInstance()) {
                    this.powerLogList_ = list;
                } else {
                    getPowerLogListBuilder().mergeFrom(list);
                }
                if (this.powerLogList_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setEndTimestamp(int i7) {
                this.endTimestamp_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPowerLogList(SEPowerLog.List list) {
                SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> singleFieldBuilder = this.powerLogListBuilder_;
                if (singleFieldBuilder == null) {
                    list.getClass();
                    this.powerLogList_ = list;
                } else {
                    singleFieldBuilder.setMessage(list);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPowerPercent(int i7) {
                this.powerPercent_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTimestamp(int i7) {
                this.timestamp_ = i7;
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
            public SEMptPowerLog build() {
                SEMptPowerLog sEMptPowerLogBuildPartial = buildPartial();
                if (sEMptPowerLogBuildPartial.isInitialized()) {
                    return sEMptPowerLogBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEMptPowerLogBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEMptPowerLog buildPartial() {
                SEMptPowerLog sEMptPowerLog = new SEMptPowerLog(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEMptPowerLog);
                }
                onBuilt();
                return sEMptPowerLog;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEMptPowerLog getDefaultInstanceForType() {
                return SEMptPowerLog.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timestamp_ = 0;
                this.powerPercent_ = 0;
                this.powerLogList_ = null;
                SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> singleFieldBuilder = this.powerLogListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.powerLogListBuilder_ = null;
                }
                this.endTimestamp_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEMptPowerLog) {
                    return mergeFrom((SEMptPowerLog) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setPowerLogList(SEPowerLog.List.Builder builder) {
                SingleFieldBuilder<SEPowerLog.List, SEPowerLog.List.Builder, SEPowerLog.ListOrBuilder> singleFieldBuilder = this.powerLogListBuilder_;
                if (singleFieldBuilder == null) {
                    this.powerLogList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEMptPowerLog sEMptPowerLog) {
                if (sEMptPowerLog == SEMptPowerLog.getDefaultInstance()) {
                    return this;
                }
                if (sEMptPowerLog.hasTimestamp()) {
                    setTimestamp(sEMptPowerLog.getTimestamp());
                }
                if (sEMptPowerLog.hasPowerPercent()) {
                    setPowerPercent(sEMptPowerLog.getPowerPercent());
                }
                if (sEMptPowerLog.hasPowerLogList()) {
                    mergePowerLogList(sEMptPowerLog.getPowerLogList());
                }
                if (sEMptPowerLog.hasEndTimestamp()) {
                    setEndTimestamp(sEMptPowerLog.getEndTimestamp());
                }
                mergeUnknownFields(sEMptPowerLog.getUnknownFields());
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
                                    this.timestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.powerPercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(internalGetPowerLogListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.endTimestamp_ = codedInputStream.readUInt32();
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

        public static final class List extends GeneratedMessage implements ListOrBuilder {
            private static final List DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<List> PARSER;
            private static final long serialVersionUID = 0;
            private java.util.List<SEMptPowerLog> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEMptPowerLog$List$1 */
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
                private RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> listBuilder_;
                private java.util.List<SEMptPowerLog> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                    this(builderParent);
                }

                private void buildPartial0(List list) {
                }

                private void buildPartialRepeatedFields(List list) {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return DeviceProtos.internal_static_SEMptPowerLog_List_descriptor;
                }

                private RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEMptPowerLog> iterable) {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEMptPowerLog sEMptPowerLog) {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEMptPowerLog);
                        return this;
                    }
                    sEMptPowerLog.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEMptPowerLog);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEMptPowerLog.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return DeviceProtos.internal_static_SEMptPowerLog_List_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
                public SEMptPowerLog getList(int i7) {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEMptPowerLog) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
                public java.util.List<SEMptPowerLog> getListList() {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
                public SEMptPowerLogOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEMptPowerLogOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
                public java.util.List<? extends SEMptPowerLogOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DeviceProtos.internal_static_SEMptPowerLog_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEMptPowerLog sEMptPowerLog) {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEMptPowerLog);
                        return this;
                    }
                    sEMptPowerLog.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEMptPowerLog);
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEMptPowerLog.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEMptPowerLog sEMptPowerLog) {
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEMptPowerLog.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEMptPowerLog);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEMptPowerLog);
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
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEMptPowerLog sEMptPowerLog = (SEMptPowerLog) codedInputStream.readMessage(SEMptPowerLog.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEMptPowerLog, Builder, SEMptPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEMptPowerLog);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEMptPowerLog);
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
                PARSER = new AbstractParser<List>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.List.1
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
                return DeviceProtos.internal_static_SEMptPowerLog_List_descriptor;
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
                return DeviceProtos.internal_static_SEMptPowerLog_List_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
            public SEMptPowerLog getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
            public java.util.List<SEMptPowerLog> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
            public SEMptPowerLogOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.ListOrBuilder
            public java.util.List<? extends SEMptPowerLogOrBuilder> getListOrBuilderList() {
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
                return DeviceProtos.internal_static_SEMptPowerLog_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
            SEMptPowerLog getList(int i7);

            int getListCount();

            java.util.List<SEMptPowerLog> getListList();

            SEMptPowerLogOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends SEMptPowerLogOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEMptPowerLog");
            DEFAULT_INSTANCE = new SEMptPowerLog();
            PARSER = new AbstractParser<SEMptPowerLog>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLog.1
                @Override // com.google.protobuf.Parser
                public SEMptPowerLog parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEMptPowerLog.newBuilder();
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

        public /* synthetic */ SEMptPowerLog(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEMptPowerLog getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceProtos.internal_static_SEMptPowerLog_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEMptPowerLog parseDelimitedFrom(InputStream inputStream) {
            return (SEMptPowerLog) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEMptPowerLog parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEMptPowerLog> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEMptPowerLog)) {
                return super.equals(obj);
            }
            SEMptPowerLog sEMptPowerLog = (SEMptPowerLog) obj;
            if (hasTimestamp() != sEMptPowerLog.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != sEMptPowerLog.getTimestamp()) || hasPowerPercent() != sEMptPowerLog.hasPowerPercent()) {
                return false;
            }
            if ((hasPowerPercent() && getPowerPercent() != sEMptPowerLog.getPowerPercent()) || hasPowerLogList() != sEMptPowerLog.hasPowerLogList()) {
                return false;
            }
            if ((!hasPowerLogList() || getPowerLogList().equals(sEMptPowerLog.getPowerLogList())) && hasEndTimestamp() == sEMptPowerLog.hasEndTimestamp()) {
                return (!hasEndTimestamp() || getEndTimestamp() == sEMptPowerLog.getEndTimestamp()) && getUnknownFields().equals(sEMptPowerLog.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return DeviceProtos.internal_static_SEMptPowerLog_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
        public int getEndTimestamp() {
            return this.endTimestamp_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEMptPowerLog> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
        public SEPowerLog.List getPowerLogList() {
            SEPowerLog.List list = this.powerLogList_;
            return list == null ? SEPowerLog.List.getDefaultInstance() : list;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
        public SEPowerLog.ListOrBuilder getPowerLogListOrBuilder() {
            SEPowerLog.List list = this.powerLogList_;
            return list == null ? SEPowerLog.List.getDefaultInstance() : list;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
        public int getPowerPercent() {
            return this.powerPercent_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.timestamp_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.powerPercent_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getPowerLogList());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.endTimestamp_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
        public boolean hasEndTimestamp() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
        public boolean hasPowerLogList() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
        public boolean hasPowerPercent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEMptPowerLogOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTimestamp();
            }
            if (hasPowerPercent()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getPowerPercent();
            }
            if (hasPowerLogList()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getPowerLogList().hashCode();
            }
            if (hasEndTimestamp()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getEndTimestamp();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceProtos.internal_static_SEMptPowerLog_fieldAccessorTable.ensureFieldAccessorsInitialized(SEMptPowerLog.class, Builder.class);
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
            if (!hasTimestamp()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPowerPercent()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPowerLogList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getPowerLogList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.timestamp_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.powerPercent_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getPowerLogList());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.endTimestamp_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEMptPowerLog(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.timestamp_ = 0;
            this.powerPercent_ = 0;
            this.endTimestamp_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEMptPowerLog sEMptPowerLog) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEMptPowerLog);
        }

        public static SEMptPowerLog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEMptPowerLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMptPowerLog) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEMptPowerLog parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEMptPowerLog getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEMptPowerLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEMptPowerLog parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEMptPowerLog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEMptPowerLog() {
            this.timestamp_ = 0;
            this.powerPercent_ = 0;
            this.endTimestamp_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEMptPowerLog parseFrom(InputStream inputStream) {
            return (SEMptPowerLog) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEMptPowerLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMptPowerLog) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEMptPowerLog parseFrom(CodedInputStream codedInputStream) {
            return (SEMptPowerLog) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEMptPowerLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEMptPowerLog) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEMptPowerLogOrBuilder extends MessageOrBuilder {
        int getEndTimestamp();

        SEPowerLog.List getPowerLogList();

        SEPowerLog.ListOrBuilder getPowerLogListOrBuilder();

        int getPowerPercent();

        int getTimestamp();

        boolean hasEndTimestamp();

        boolean hasPowerLogList();

        boolean hasPowerPercent();

        boolean hasTimestamp();
    }

    public static final class SEPowerLog extends GeneratedMessage implements SEPowerLogOrBuilder {
        private static final SEPowerLog DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SEPowerLog> PARSER;
        public static final int PERCENT_FIELD_NUMBER = 3;
        public static final int QUANTITY_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int percent_;
        private int quantity_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEPowerLog$1 */
        public class AnonymousClass1 extends AbstractParser<SEPowerLog> {
            @Override // com.google.protobuf.Parser
            public SEPowerLog parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEPowerLog.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEPowerLogOrBuilder {
            private int bitField0_;
            private int id_;
            private int percent_;
            private int quantity_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                this(builderParent);
            }

            private void buildPartial0(SEPowerLog sEPowerLog) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEPowerLog.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEPowerLog.quantity_ = this.quantity_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEPowerLog.percent_ = this.percent_;
                    i7 |= 4;
                }
                sEPowerLog.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceProtos.internal_static_SEPowerLog_descriptor;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPercent() {
                this.bitField0_ &= -5;
                this.percent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearQuantity() {
                this.bitField0_ &= -3;
                this.quantity_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceProtos.internal_static_SEPowerLog_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
            public int getPercent() {
                return this.percent_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
            public int getQuantity() {
                return this.quantity_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
            public boolean hasPercent() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
            public boolean hasQuantity() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceProtos.internal_static_SEPowerLog_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPowerLog.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasQuantity() && hasPercent();
            }

            public Builder setId(int i7) {
                this.id_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPercent(int i7) {
                this.percent_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setQuantity(int i7) {
                this.quantity_ = i7;
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
            public SEPowerLog build() {
                SEPowerLog sEPowerLogBuildPartial = buildPartial();
                if (sEPowerLogBuildPartial.isInitialized()) {
                    return sEPowerLogBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEPowerLogBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEPowerLog buildPartial() {
                SEPowerLog sEPowerLog = new SEPowerLog(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEPowerLog);
                }
                onBuilt();
                return sEPowerLog;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEPowerLog getDefaultInstanceForType() {
                return SEPowerLog.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.quantity_ = 0;
                this.percent_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEPowerLog) {
                    return mergeFrom((SEPowerLog) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEPowerLog sEPowerLog) {
                if (sEPowerLog == SEPowerLog.getDefaultInstance()) {
                    return this;
                }
                if (sEPowerLog.hasId()) {
                    setId(sEPowerLog.getId());
                }
                if (sEPowerLog.hasQuantity()) {
                    setQuantity(sEPowerLog.getQuantity());
                }
                if (sEPowerLog.hasPercent()) {
                    setPercent(sEPowerLog.getPercent());
                }
                mergeUnknownFields(sEPowerLog.getUnknownFields());
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.quantity_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.percent_ = codedInputStream.readUInt32();
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

        public static final class List extends GeneratedMessage implements ListOrBuilder {
            private static final List DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<List> PARSER;
            private static final long serialVersionUID = 0;
            private java.util.List<SEPowerLog> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.DeviceProtos$SEPowerLog$List$1 */
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
                private RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> listBuilder_;
                private java.util.List<SEPowerLog> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, d dVar) {
                    this(builderParent);
                }

                private void buildPartial0(List list) {
                }

                private void buildPartialRepeatedFields(List list) {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return DeviceProtos.internal_static_SEPowerLog_List_descriptor;
                }

                private RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEPowerLog> iterable) {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEPowerLog sEPowerLog) {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEPowerLog);
                        return this;
                    }
                    sEPowerLog.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEPowerLog);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEPowerLog.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return DeviceProtos.internal_static_SEPowerLog_List_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
                public SEPowerLog getList(int i7) {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEPowerLog) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
                public java.util.List<SEPowerLog> getListList() {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
                public SEPowerLogOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEPowerLogOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
                public java.util.List<? extends SEPowerLogOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DeviceProtos.internal_static_SEPowerLog_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEPowerLog sEPowerLog) {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEPowerLog);
                        return this;
                    }
                    sEPowerLog.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEPowerLog);
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEPowerLog.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEPowerLog sEPowerLog) {
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEPowerLog.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEPowerLog);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEPowerLog);
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
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEPowerLog sEPowerLog = (SEPowerLog) codedInputStream.readMessage(SEPowerLog.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEPowerLog, Builder, SEPowerLogOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEPowerLog);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEPowerLog);
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
                PARSER = new AbstractParser<List>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.List.1
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
                return DeviceProtos.internal_static_SEPowerLog_List_descriptor;
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
                return DeviceProtos.internal_static_SEPowerLog_List_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
            public SEPowerLog getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
            public java.util.List<SEPowerLog> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
            public SEPowerLogOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.ListOrBuilder
            public java.util.List<? extends SEPowerLogOrBuilder> getListOrBuilderList() {
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
                return DeviceProtos.internal_static_SEPowerLog_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
            SEPowerLog getList(int i7);

            int getListCount();

            java.util.List<SEPowerLog> getListList();

            SEPowerLogOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends SEPowerLogOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPowerLog");
            DEFAULT_INSTANCE = new SEPowerLog();
            PARSER = new AbstractParser<SEPowerLog>() { // from class: com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLog.1
                @Override // com.google.protobuf.Parser
                public SEPowerLog parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEPowerLog.newBuilder();
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

        public /* synthetic */ SEPowerLog(GeneratedMessage.Builder builder, d dVar) {
            this(builder);
        }

        public static SEPowerLog getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceProtos.internal_static_SEPowerLog_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEPowerLog parseDelimitedFrom(InputStream inputStream) {
            return (SEPowerLog) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEPowerLog parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEPowerLog> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEPowerLog)) {
                return super.equals(obj);
            }
            SEPowerLog sEPowerLog = (SEPowerLog) obj;
            if (hasId() != sEPowerLog.hasId()) {
                return false;
            }
            if ((hasId() && getId() != sEPowerLog.getId()) || hasQuantity() != sEPowerLog.hasQuantity()) {
                return false;
            }
            if ((!hasQuantity() || getQuantity() == sEPowerLog.getQuantity()) && hasPercent() == sEPowerLog.hasPercent()) {
                return (!hasPercent() || getPercent() == sEPowerLog.getPercent()) && getUnknownFields().equals(sEPowerLog.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return DeviceProtos.internal_static_SEPowerLog_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEPowerLog> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
        public int getPercent() {
            return this.percent_;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
        public int getQuantity() {
            return this.quantity_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.quantity_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.percent_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
        public boolean hasPercent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.DeviceProtos.SEPowerLogOrBuilder
        public boolean hasQuantity() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getId();
            }
            if (hasQuantity()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getQuantity();
            }
            if (hasPercent()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getPercent();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceProtos.internal_static_SEPowerLog_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPowerLog.class, Builder.class);
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
            if (!hasQuantity()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPercent()) {
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.quantity_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.percent_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEPowerLog(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.quantity_ = 0;
            this.percent_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEPowerLog sEPowerLog) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEPowerLog);
        }

        public static SEPowerLog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEPowerLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPowerLog) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPowerLog parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEPowerLog getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEPowerLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEPowerLog parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEPowerLog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEPowerLog() {
            this.id_ = 0;
            this.quantity_ = 0;
            this.percent_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEPowerLog parseFrom(InputStream inputStream) {
            return (SEPowerLog) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEPowerLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPowerLog) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPowerLog parseFrom(CodedInputStream codedInputStream) {
            return (SEPowerLog) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEPowerLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPowerLog) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEPowerLogOrBuilder extends MessageOrBuilder {
        int getId();

        int getPercent();

        int getQuantity();

        boolean hasId();

        boolean hasPercent();

        boolean hasQuantity();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "DeviceProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fDevice.proto\u001a\fnanopb.proto\"Ó\u0002\n\bSEDevice\u0012$\n\u000bdevice_info\u0018\u0001 \u0001(\u000b2\r.SEDeviceInfoH\u0000\u00127\n\u0015device_battery_status\u0018\u0002 \u0001(\u000b2\u0016.SEDeviceBatteryStatusH\u0000\u0012'\n\rmpt_power_log\u0018\u0003 \u0001(\u000b2\u000e.SEMptPowerLogH\u0000\u00121\n\u0012mpt_power_log_list\u0018\u0004 \u0001(\u000b2\u0013.SEMptPowerLog.ListH\u0000\u0012=\n\u001cdevice_battery_value_request\u0018\u0005 \u0001(\u000b2\u0015.SEDeviceBatteryValueH\u0000\u0012B\n\u001bdevice_charging_case_status\u0018\u0006 \u0001(\u000b2\u001b.SEDeviceChargingCaseStatusH\u0000B\t\n\u0007payload\"þ\u0002\n\fSEDeviceInfo\u0012\u001f\n\u0010firmware_version\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010equipment_number\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003mac\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rserial_number\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u00125\n\u0015device_battery_status\u0018\u0005 \u0002(\u000b2\u0016.SEDeviceBatteryStatus\u0012*\n\"remote_device_remote_camera_switch\u0018\u0006 \u0001(\b\u0012,\n$sports_icon_function_protocol_switch\u0018\u0007 \u0001(\b\u0012%\n\u0016last_disconnect_reason\u0018\b \u0001(\rB\u0005\u0092?\u00028\u0010\u0012(\n\u0019last_disconnect_timestamp\u0018\t \u0001(\rB\u0005\u0092?\u00028 \u0012\u0018\n\u0010spp_support_flat\u0018\n \u0001(\b\";\n\u0014SEDeviceBatteryValue\u0012#\n\u0014device_battery_value\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\"¤\u0001\n\u001aSEDeviceChargingCaseStatus\u0012\u0019\n\nbatt_level\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0019\n\nlid_status\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u001a\n\u000bserial_nums\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0016\n\u0007version\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rcharge_status\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\"·\u0001\n\u0015SEDeviceBatteryStatus\u0012\u0017\n\bcapacity\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012<\n\rcharge_status\u0018\u0002 \u0001(\u000e2%.SEDeviceBatteryStatus.SEChargeStatus\"G\n\u000eSEChargeStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\f\n\bCHARGING\u0010\u0001\u0012\u0010\n\fNOT_CHARGING\u0010\u0002\u0012\b\n\u0004FULL\u0010\u0003\"z\n\nSEPowerLog\u0012\u0011\n\u0002id\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0017\n\bquantity\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0016\n\u0007percent\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028\b\u001a(\n\u0004List\u0012 \n\u0004list\u0018\u0001 \u0003(\u000b2\u000b.SEPowerLogB\u0005\u0092?\u0002\u0018\u0004\"¼\u0001\n\rSEMptPowerLog\u0012\u0018\n\ttimestamp\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028 \u0012\u001c\n\rpower_percent\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012(\n\u000epower_log_list\u0018\u0003 \u0002(\u000b2\u0010.SEPowerLog.List\u0012\u001c\n\rend_timestamp\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028 \u001a+\n\u0004List\u0012#\n\u0004list\u0018\u0001 \u0003(\u000b2\u000e.SEMptPowerLogB\u0005\u0092?\u0002\u0018\u0004B(\n\u0018com.zh.ble.wear.protobufB\fDeviceProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SEDevice_descriptor = messageType;
        internal_static_SEDevice_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"DeviceInfo", "DeviceBatteryStatus", "MptPowerLog", "MptPowerLogList", "DeviceBatteryValueRequest", "DeviceChargingCaseStatus", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SEDeviceInfo_descriptor = messageType2;
        internal_static_SEDeviceInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"FirmwareVersion", "EquipmentNumber", "Mac", "SerialNumber", "DeviceBatteryStatus", "RemoteDeviceRemoteCameraSwitch", "SportsIconFunctionProtocolSwitch", "LastDisconnectReason", "LastDisconnectTimestamp", "SppSupportFlat"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SEDeviceBatteryValue_descriptor = messageType3;
        internal_static_SEDeviceBatteryValue_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"DeviceBatteryValue"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SEDeviceChargingCaseStatus_descriptor = messageType4;
        internal_static_SEDeviceChargingCaseStatus_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"BattLevel", "LidStatus", "SerialNums", "Version", "ChargeStatus"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SEDeviceBatteryStatus_descriptor = messageType5;
        internal_static_SEDeviceBatteryStatus_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"Capacity", "ChargeStatus"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SEPowerLog_descriptor = messageType6;
        internal_static_SEPowerLog_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"Id", "Quantity", "Percent"});
        Descriptors.Descriptor nestedType = messageType6.getNestedType(0);
        internal_static_SEPowerLog_List_descriptor = nestedType;
        internal_static_SEPowerLog_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SEMptPowerLog_descriptor = messageType7;
        internal_static_SEMptPowerLog_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"Timestamp", "PowerPercent", "PowerLogList", "EndTimestamp"});
        Descriptors.Descriptor nestedType2 = messageType7.getNestedType(0);
        internal_static_SEMptPowerLog_List_descriptor = nestedType2;
        internal_static_SEMptPowerLog_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{MessageLiteToString.f20028a});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private DeviceProtos() {
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