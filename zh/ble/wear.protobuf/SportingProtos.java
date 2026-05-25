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
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SportingProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SEAppMessageType_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEAppMessageType_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEAutoSportData_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEAutoSportData_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEAutoSportData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEAutoSportData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEEcgCalibrationData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEEcgCalibrationData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEEcgData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEEcgData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEEcgReportData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEEcgReportData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEPhoneSportData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEPhoneSportData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SERingSportStatusData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SERingSportStatusData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SESportRequest_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESportRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SESportResponse_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESportResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SESportStatus_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESportStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SESporting_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SESporting_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEWearSportData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEWearSportData_fieldAccessorTable;

    public static final class SEAppMessageType extends GeneratedMessage implements SEAppMessageTypeOrBuilder {
        private static final SEAppMessageType DEFAULT_INSTANCE;
        public static final int ERROR_REASON_FIELD_NUMBER = 6;
        public static final int MEASURE_TIME_FIELD_NUMBER = 5;
        public static final int MEASURE_TYPE_FIELD_NUMBER = 1;
        public static final int MEASURE_VALUE_FIELD_NUMBER = 4;
        private static final Parser<SEAppMessageType> PARSER;
        public static final int SWITCH_MEASURE_FIELD_NUMBER = 2;
        public static final int WRIST_STATUS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int errorReason_;
        private int measureTime_;
        private int measureType_;
        private int measureValue_;
        private byte memoizedIsInitialized;
        private boolean switchMeasure_;
        private boolean wristStatus_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEAppMessageType$1 */
        public class AnonymousClass1 extends AbstractParser<SEAppMessageType> {
            @Override // com.google.protobuf.Parser
            public SEAppMessageType parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEAppMessageType.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAppMessageTypeOrBuilder {
            private int bitField0_;
            private int errorReason_;
            private int measureTime_;
            private int measureType_;
            private int measureValue_;
            private boolean switchMeasure_;
            private boolean wristStatus_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SEAppMessageType sEAppMessageType) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAppMessageType.measureType_ = this.measureType_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEAppMessageType.switchMeasure_ = this.switchMeasure_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEAppMessageType.wristStatus_ = this.wristStatus_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEAppMessageType.measureValue_ = this.measureValue_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEAppMessageType.measureTime_ = this.measureTime_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEAppMessageType.errorReason_ = this.errorReason_;
                    i7 |= 32;
                }
                sEAppMessageType.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SEAppMessageType_descriptor;
            }

            public Builder clearErrorReason() {
                this.bitField0_ &= -33;
                this.errorReason_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMeasureTime() {
                this.bitField0_ &= -17;
                this.measureTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMeasureType() {
                this.bitField0_ &= -2;
                this.measureType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMeasureValue() {
                this.bitField0_ &= -9;
                this.measureValue_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSwitchMeasure() {
                this.bitField0_ &= -3;
                this.switchMeasure_ = false;
                onChanged();
                return this;
            }

            public Builder clearWristStatus() {
                this.bitField0_ &= -5;
                this.wristStatus_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SEAppMessageType_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public int getErrorReason() {
                return this.errorReason_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public int getMeasureTime() {
                return this.measureTime_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public int getMeasureType() {
                return this.measureType_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public int getMeasureValue() {
                return this.measureValue_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public boolean getSwitchMeasure() {
                return this.switchMeasure_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public boolean getWristStatus() {
                return this.wristStatus_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public boolean hasErrorReason() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public boolean hasMeasureTime() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public boolean hasMeasureType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public boolean hasMeasureValue() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public boolean hasSwitchMeasure() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
            public boolean hasWristStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SEAppMessageType_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAppMessageType.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasMeasureType();
            }

            public Builder setErrorReason(int i7) {
                this.errorReason_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMeasureTime(int i7) {
                this.measureTime_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMeasureType(int i7) {
                this.measureType_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMeasureValue(int i7) {
                this.measureValue_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSwitchMeasure(boolean z6) {
                this.switchMeasure_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setWristStatus(boolean z6) {
                this.wristStatus_ = z6;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAppMessageType build() {
                SEAppMessageType sEAppMessageTypeBuildPartial = buildPartial();
                if (sEAppMessageTypeBuildPartial.isInitialized()) {
                    return sEAppMessageTypeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAppMessageTypeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAppMessageType buildPartial() {
                SEAppMessageType sEAppMessageType = new SEAppMessageType(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAppMessageType);
                }
                onBuilt();
                return sEAppMessageType;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAppMessageType getDefaultInstanceForType() {
                return SEAppMessageType.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.measureType_ = 0;
                this.switchMeasure_ = false;
                this.wristStatus_ = false;
                this.measureValue_ = 0;
                this.measureTime_ = 0;
                this.errorReason_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAppMessageType) {
                    return mergeFrom((SEAppMessageType) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEAppMessageType sEAppMessageType) {
                if (sEAppMessageType == SEAppMessageType.getDefaultInstance()) {
                    return this;
                }
                if (sEAppMessageType.hasMeasureType()) {
                    setMeasureType(sEAppMessageType.getMeasureType());
                }
                if (sEAppMessageType.hasSwitchMeasure()) {
                    setSwitchMeasure(sEAppMessageType.getSwitchMeasure());
                }
                if (sEAppMessageType.hasWristStatus()) {
                    setWristStatus(sEAppMessageType.getWristStatus());
                }
                if (sEAppMessageType.hasMeasureValue()) {
                    setMeasureValue(sEAppMessageType.getMeasureValue());
                }
                if (sEAppMessageType.hasMeasureTime()) {
                    setMeasureTime(sEAppMessageType.getMeasureTime());
                }
                if (sEAppMessageType.hasErrorReason()) {
                    setErrorReason(sEAppMessageType.getErrorReason());
                }
                mergeUnknownFields(sEAppMessageType.getUnknownFields());
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
                                    this.measureType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.switchMeasure_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.wristStatus_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.measureValue_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.measureTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.errorReason_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAppMessageType");
            DEFAULT_INSTANCE = new SEAppMessageType();
            PARSER = new AbstractParser<SEAppMessageType>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageType.1
                @Override // com.google.protobuf.Parser
                public SEAppMessageType parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAppMessageType.newBuilder();
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

        public /* synthetic */ SEAppMessageType(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SEAppMessageType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SEAppMessageType_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAppMessageType parseDelimitedFrom(InputStream inputStream) {
            return (SEAppMessageType) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAppMessageType parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAppMessageType> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAppMessageType)) {
                return super.equals(obj);
            }
            SEAppMessageType sEAppMessageType = (SEAppMessageType) obj;
            if (hasMeasureType() != sEAppMessageType.hasMeasureType()) {
                return false;
            }
            if ((hasMeasureType() && getMeasureType() != sEAppMessageType.getMeasureType()) || hasSwitchMeasure() != sEAppMessageType.hasSwitchMeasure()) {
                return false;
            }
            if ((hasSwitchMeasure() && getSwitchMeasure() != sEAppMessageType.getSwitchMeasure()) || hasWristStatus() != sEAppMessageType.hasWristStatus()) {
                return false;
            }
            if ((hasWristStatus() && getWristStatus() != sEAppMessageType.getWristStatus()) || hasMeasureValue() != sEAppMessageType.hasMeasureValue()) {
                return false;
            }
            if ((hasMeasureValue() && getMeasureValue() != sEAppMessageType.getMeasureValue()) || hasMeasureTime() != sEAppMessageType.hasMeasureTime()) {
                return false;
            }
            if ((!hasMeasureTime() || getMeasureTime() == sEAppMessageType.getMeasureTime()) && hasErrorReason() == sEAppMessageType.hasErrorReason()) {
                return (!hasErrorReason() || getErrorReason() == sEAppMessageType.getErrorReason()) && getUnknownFields().equals(sEAppMessageType.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SEAppMessageType_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public int getErrorReason() {
            return this.errorReason_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public int getMeasureTime() {
            return this.measureTime_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public int getMeasureType() {
            return this.measureType_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public int getMeasureValue() {
            return this.measureValue_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAppMessageType> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.measureType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.switchMeasure_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(3, this.wristStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.measureValue_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.measureTime_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.errorReason_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public boolean getSwitchMeasure() {
            return this.switchMeasure_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public boolean getWristStatus() {
            return this.wristStatus_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public boolean hasErrorReason() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public boolean hasMeasureTime() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public boolean hasMeasureType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public boolean hasMeasureValue() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public boolean hasSwitchMeasure() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAppMessageTypeOrBuilder
        public boolean hasWristStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasMeasureType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMeasureType();
            }
            if (hasSwitchMeasure()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getSwitchMeasure());
            }
            if (hasWristStatus()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getWristStatus());
            }
            if (hasMeasureValue()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMeasureValue();
            }
            if (hasMeasureTime()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getMeasureTime();
            }
            if (hasErrorReason()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getErrorReason();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SEAppMessageType_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAppMessageType.class, Builder.class);
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
            if (hasMeasureType()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.measureType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.switchMeasure_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.wristStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.measureValue_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.measureTime_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.errorReason_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEAppMessageType(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.measureType_ = 0;
            this.switchMeasure_ = false;
            this.wristStatus_ = false;
            this.measureValue_ = 0;
            this.measureTime_ = 0;
            this.errorReason_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAppMessageType sEAppMessageType) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAppMessageType);
        }

        public static SEAppMessageType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAppMessageType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppMessageType) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAppMessageType parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAppMessageType getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAppMessageType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEAppMessageType parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAppMessageType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAppMessageType parseFrom(InputStream inputStream) {
            return (SEAppMessageType) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAppMessageType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppMessageType) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SEAppMessageType() {
            this.measureType_ = 0;
            this.switchMeasure_ = false;
            this.wristStatus_ = false;
            this.measureValue_ = 0;
            this.measureTime_ = 0;
            this.errorReason_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEAppMessageType parseFrom(CodedInputStream codedInputStream) {
            return (SEAppMessageType) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAppMessageType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppMessageType) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAppMessageTypeOrBuilder extends MessageOrBuilder {
        int getErrorReason();

        int getMeasureTime();

        int getMeasureType();

        int getMeasureValue();

        boolean getSwitchMeasure();

        boolean getWristStatus();

        boolean hasErrorReason();

        boolean hasMeasureTime();

        boolean hasMeasureType();

        boolean hasMeasureValue();

        boolean hasSwitchMeasure();

        boolean hasWristStatus();
    }

    public static final class SEAutoSportData extends GeneratedMessage implements SEAutoSportDataOrBuilder {
        public static final int AUTOSPORT_DURATION_FIELD_NUMBER = 3;
        public static final int AUTOSPORT_INTENSITY_FIELD_NUMBER = 5;
        public static final int AUTOSPORT_KCAL_FIELD_NUMBER = 6;
        public static final int AUTOSPORT_STARTTIME_FIELD_NUMBER = 2;
        public static final int AUTOSPORT_STEPS_FIELD_NUMBER = 4;
        public static final int AUTOSPORT_TYPE_FIELD_NUMBER = 1;
        private static final SEAutoSportData DEFAULT_INSTANCE;
        public static final int HR_DATA_FIELD_NUMBER = 7;
        private static final Parser<SEAutoSportData> PARSER;
        private static final long serialVersionUID = 0;
        private int autosportDuration_;
        private int autosportIntensity_;
        private int autosportKcal_;
        private int autosportStarttime_;
        private int autosportSteps_;
        private int autosportType_;
        private int bitField0_;
        private ByteString hrData_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEAutoSportData$1 */
        public class AnonymousClass1 extends AbstractParser<SEAutoSportData> {
            @Override // com.google.protobuf.Parser
            public SEAutoSportData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEAutoSportData.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAutoSportDataOrBuilder {
            private int autosportDuration_;
            private int autosportIntensity_;
            private int autosportKcal_;
            private int autosportStarttime_;
            private int autosportSteps_;
            private int autosportType_;
            private int bitField0_;
            private ByteString hrData_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SEAutoSportData sEAutoSportData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAutoSportData.autosportType_ = this.autosportType_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEAutoSportData.autosportStarttime_ = this.autosportStarttime_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEAutoSportData.autosportDuration_ = this.autosportDuration_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEAutoSportData.autosportSteps_ = this.autosportSteps_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEAutoSportData.autosportIntensity_ = this.autosportIntensity_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEAutoSportData.autosportKcal_ = this.autosportKcal_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEAutoSportData.hrData_ = this.hrData_;
                    i7 |= 64;
                }
                sEAutoSportData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SEAutoSportData_descriptor;
            }

            public Builder clearAutosportDuration() {
                this.bitField0_ &= -5;
                this.autosportDuration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAutosportIntensity() {
                this.bitField0_ &= -17;
                this.autosportIntensity_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAutosportKcal() {
                this.bitField0_ &= -33;
                this.autosportKcal_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAutosportStarttime() {
                this.bitField0_ &= -3;
                this.autosportStarttime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAutosportSteps() {
                this.bitField0_ &= -9;
                this.autosportSteps_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAutosportType() {
                this.bitField0_ &= -2;
                this.autosportType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHrData() {
                this.bitField0_ &= -65;
                this.hrData_ = SEAutoSportData.getDefaultInstance().getHrData();
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public int getAutosportDuration() {
                return this.autosportDuration_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public int getAutosportIntensity() {
                return this.autosportIntensity_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public int getAutosportKcal() {
                return this.autosportKcal_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public int getAutosportStarttime() {
                return this.autosportStarttime_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public int getAutosportSteps() {
                return this.autosportSteps_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public int getAutosportType() {
                return this.autosportType_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SEAutoSportData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public ByteString getHrData() {
                return this.hrData_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public boolean hasAutosportDuration() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public boolean hasAutosportIntensity() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public boolean hasAutosportKcal() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public boolean hasAutosportStarttime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public boolean hasAutosportSteps() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public boolean hasAutosportType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
            public boolean hasHrData() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SEAutoSportData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAutoSportData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAutosportDuration(int i7) {
                this.autosportDuration_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAutosportIntensity(int i7) {
                this.autosportIntensity_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAutosportKcal(int i7) {
                this.autosportKcal_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setAutosportStarttime(int i7) {
                this.autosportStarttime_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAutosportSteps(int i7) {
                this.autosportSteps_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAutosportType(int i7) {
                this.autosportType_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setHrData(ByteString byteString) {
                byteString.getClass();
                this.hrData_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
                this.hrData_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAutoSportData build() {
                SEAutoSportData sEAutoSportDataBuildPartial = buildPartial();
                if (sEAutoSportDataBuildPartial.isInitialized()) {
                    return sEAutoSportDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAutoSportDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAutoSportData buildPartial() {
                SEAutoSportData sEAutoSportData = new SEAutoSportData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAutoSportData);
                }
                onBuilt();
                return sEAutoSportData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAutoSportData getDefaultInstanceForType() {
                return SEAutoSportData.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.hrData_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.autosportType_ = 0;
                this.autosportStarttime_ = 0;
                this.autosportDuration_ = 0;
                this.autosportSteps_ = 0;
                this.autosportIntensity_ = 0;
                this.autosportKcal_ = 0;
                this.hrData_ = ByteString.EMPTY;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAutoSportData) {
                    return mergeFrom((SEAutoSportData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEAutoSportData sEAutoSportData) {
                if (sEAutoSportData == SEAutoSportData.getDefaultInstance()) {
                    return this;
                }
                if (sEAutoSportData.hasAutosportType()) {
                    setAutosportType(sEAutoSportData.getAutosportType());
                }
                if (sEAutoSportData.hasAutosportStarttime()) {
                    setAutosportStarttime(sEAutoSportData.getAutosportStarttime());
                }
                if (sEAutoSportData.hasAutosportDuration()) {
                    setAutosportDuration(sEAutoSportData.getAutosportDuration());
                }
                if (sEAutoSportData.hasAutosportSteps()) {
                    setAutosportSteps(sEAutoSportData.getAutosportSteps());
                }
                if (sEAutoSportData.hasAutosportIntensity()) {
                    setAutosportIntensity(sEAutoSportData.getAutosportIntensity());
                }
                if (sEAutoSportData.hasAutosportKcal()) {
                    setAutosportKcal(sEAutoSportData.getAutosportKcal());
                }
                if (sEAutoSportData.hasHrData()) {
                    setHrData(sEAutoSportData.getHrData());
                }
                mergeUnknownFields(sEAutoSportData.getUnknownFields());
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
                                    this.autosportType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.autosportStarttime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.autosportDuration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.autosportSteps_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.autosportIntensity_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.autosportKcal_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag != 58) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.hrData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
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
            private List<SEAutoSportData> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEAutoSportData$SEList$1 */
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
                private RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> listBuilder_;
                private List<SEAutoSportData> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return SportingProtos.internal_static_SEAutoSportData_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEAutoSportData> iterable) {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEAutoSportData sEAutoSportData) {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEAutoSportData);
                        return this;
                    }
                    sEAutoSportData.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEAutoSportData);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEAutoSportData.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return SportingProtos.internal_static_SEAutoSportData_SEList_descriptor;
                }

                @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
                public SEAutoSportData getList(int i7) {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEAutoSportData) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
                public List<SEAutoSportData> getListList() {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
                public SEAutoSportDataOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEAutoSportDataOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
                public List<? extends SEAutoSportDataOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SportingProtos.internal_static_SEAutoSportData_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder removeList(int i7) {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEAutoSportData sEAutoSportData) {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEAutoSportData);
                        return this;
                    }
                    sEAutoSportData.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEAutoSportData);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(m mVar) {
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEAutoSportData.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEAutoSportData sEAutoSportData) {
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEAutoSportData.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEAutoSportData);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEAutoSportData);
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
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEAutoSportData sEAutoSportData = (SEAutoSportData) codedInputStream.readMessage(SEAutoSportData.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEAutoSportData, Builder, SEAutoSportDataOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEAutoSportData);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEAutoSportData);
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
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, m mVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SEAutoSportData_SEList_descriptor;
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
                return SportingProtos.internal_static_SEAutoSportData_SEList_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
            public SEAutoSportData getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
            public List<SEAutoSportData> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
            public SEAutoSportDataOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.SEListOrBuilder
            public List<? extends SEAutoSportDataOrBuilder> getListOrBuilderList() {
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
                return SportingProtos.internal_static_SEAutoSportData_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
            SEAutoSportData getList(int i7);

            int getListCount();

            List<SEAutoSportData> getListList();

            SEAutoSportDataOrBuilder getListOrBuilder(int i7);

            List<? extends SEAutoSportDataOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAutoSportData");
            DEFAULT_INSTANCE = new SEAutoSportData();
            PARSER = new AbstractParser<SEAutoSportData>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportData.1
                @Override // com.google.protobuf.Parser
                public SEAutoSportData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAutoSportData.newBuilder();
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

        public /* synthetic */ SEAutoSportData(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SEAutoSportData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SEAutoSportData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAutoSportData parseDelimitedFrom(InputStream inputStream) {
            return (SEAutoSportData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAutoSportData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAutoSportData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAutoSportData)) {
                return super.equals(obj);
            }
            SEAutoSportData sEAutoSportData = (SEAutoSportData) obj;
            if (hasAutosportType() != sEAutoSportData.hasAutosportType()) {
                return false;
            }
            if ((hasAutosportType() && getAutosportType() != sEAutoSportData.getAutosportType()) || hasAutosportStarttime() != sEAutoSportData.hasAutosportStarttime()) {
                return false;
            }
            if ((hasAutosportStarttime() && getAutosportStarttime() != sEAutoSportData.getAutosportStarttime()) || hasAutosportDuration() != sEAutoSportData.hasAutosportDuration()) {
                return false;
            }
            if ((hasAutosportDuration() && getAutosportDuration() != sEAutoSportData.getAutosportDuration()) || hasAutosportSteps() != sEAutoSportData.hasAutosportSteps()) {
                return false;
            }
            if ((hasAutosportSteps() && getAutosportSteps() != sEAutoSportData.getAutosportSteps()) || hasAutosportIntensity() != sEAutoSportData.hasAutosportIntensity()) {
                return false;
            }
            if ((hasAutosportIntensity() && getAutosportIntensity() != sEAutoSportData.getAutosportIntensity()) || hasAutosportKcal() != sEAutoSportData.hasAutosportKcal()) {
                return false;
            }
            if ((!hasAutosportKcal() || getAutosportKcal() == sEAutoSportData.getAutosportKcal()) && hasHrData() == sEAutoSportData.hasHrData()) {
                return (!hasHrData() || getHrData().equals(sEAutoSportData.getHrData())) && getUnknownFields().equals(sEAutoSportData.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public int getAutosportDuration() {
            return this.autosportDuration_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public int getAutosportIntensity() {
            return this.autosportIntensity_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public int getAutosportKcal() {
            return this.autosportKcal_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public int getAutosportStarttime() {
            return this.autosportStarttime_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public int getAutosportSteps() {
            return this.autosportSteps_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public int getAutosportType() {
            return this.autosportType_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SEAutoSportData_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public ByteString getHrData() {
            return this.hrData_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAutoSportData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.autosportType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.autosportStarttime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.autosportDuration_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.autosportSteps_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.autosportIntensity_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.autosportKcal_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(7, this.hrData_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public boolean hasAutosportDuration() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public boolean hasAutosportIntensity() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public boolean hasAutosportKcal() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public boolean hasAutosportStarttime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public boolean hasAutosportSteps() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public boolean hasAutosportType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEAutoSportDataOrBuilder
        public boolean hasHrData() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasAutosportType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAutosportType();
            }
            if (hasAutosportStarttime()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAutosportStarttime();
            }
            if (hasAutosportDuration()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAutosportDuration();
            }
            if (hasAutosportSteps()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getAutosportSteps();
            }
            if (hasAutosportIntensity()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getAutosportIntensity();
            }
            if (hasAutosportKcal()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getAutosportKcal();
            }
            if (hasHrData()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getHrData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SEAutoSportData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAutoSportData.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.autosportType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.autosportStarttime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.autosportDuration_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.autosportSteps_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.autosportIntensity_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.autosportKcal_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBytes(7, this.hrData_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEAutoSportData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.autosportType_ = 0;
            this.autosportStarttime_ = 0;
            this.autosportDuration_ = 0;
            this.autosportSteps_ = 0;
            this.autosportIntensity_ = 0;
            this.autosportKcal_ = 0;
            this.hrData_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAutoSportData sEAutoSportData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAutoSportData);
        }

        public static SEAutoSportData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAutoSportData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAutoSportData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAutoSportData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAutoSportData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAutoSportData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEAutoSportData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAutoSportData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAutoSportData parseFrom(InputStream inputStream) {
            return (SEAutoSportData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAutoSportData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAutoSportData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SEAutoSportData() {
            this.autosportType_ = 0;
            this.autosportStarttime_ = 0;
            this.autosportDuration_ = 0;
            this.autosportSteps_ = 0;
            this.autosportIntensity_ = 0;
            this.autosportKcal_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.hrData_ = byteString;
        }

        public static SEAutoSportData parseFrom(CodedInputStream codedInputStream) {
            return (SEAutoSportData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAutoSportData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAutoSportData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAutoSportDataOrBuilder extends MessageOrBuilder {
        int getAutosportDuration();

        int getAutosportIntensity();

        int getAutosportKcal();

        int getAutosportStarttime();

        int getAutosportSteps();

        int getAutosportType();

        ByteString getHrData();

        boolean hasAutosportDuration();

        boolean hasAutosportIntensity();

        boolean hasAutosportKcal();

        boolean hasAutosportStarttime();

        boolean hasAutosportSteps();

        boolean hasAutosportType();

        boolean hasHrData();
    }

    public static final class SEEcgCalibrationData extends GeneratedMessage implements SEEcgCalibrationDataOrBuilder {
        private static final SEEcgCalibrationData DEFAULT_INSTANCE;
        public static final int ECG_CALIBRATION_DIASTOLIC_FIELD_NUMBER = 6;
        public static final int ECG_CALIBRATION_HEART_FIELD_NUMBER = 4;
        public static final int ECG_CALIBRATION_MODE_FIELD_NUMBER = 2;
        public static final int ECG_CALIBRATION_STATE_FIELD_NUMBER = 1;
        public static final int ECG_CALIBRATION_SYSTOLIC_FIELD_NUMBER = 5;
        public static final int ECG_LEVEL_CALIBRATION_FIELD_NUMBER = 3;
        private static final Parser<SEEcgCalibrationData> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int ecgCalibrationDiastolic_;
        private int ecgCalibrationHeart_;
        private int ecgCalibrationMode_;
        private boolean ecgCalibrationState_;
        private int ecgCalibrationSystolic_;
        private int ecgLevelCalibration_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEEcgCalibrationData$1 */
        public class AnonymousClass1 extends AbstractParser<SEEcgCalibrationData> {
            @Override // com.google.protobuf.Parser
            public SEEcgCalibrationData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEEcgCalibrationData.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEEcgCalibrationDataOrBuilder {
            private int bitField0_;
            private int ecgCalibrationDiastolic_;
            private int ecgCalibrationHeart_;
            private int ecgCalibrationMode_;
            private boolean ecgCalibrationState_;
            private int ecgCalibrationSystolic_;
            private int ecgLevelCalibration_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SEEcgCalibrationData sEEcgCalibrationData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEEcgCalibrationData.ecgCalibrationState_ = this.ecgCalibrationState_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEEcgCalibrationData.ecgCalibrationMode_ = this.ecgCalibrationMode_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEEcgCalibrationData.ecgLevelCalibration_ = this.ecgLevelCalibration_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEEcgCalibrationData.ecgCalibrationHeart_ = this.ecgCalibrationHeart_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEEcgCalibrationData.ecgCalibrationSystolic_ = this.ecgCalibrationSystolic_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEEcgCalibrationData.ecgCalibrationDiastolic_ = this.ecgCalibrationDiastolic_;
                    i7 |= 32;
                }
                sEEcgCalibrationData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SEEcgCalibrationData_descriptor;
            }

            public Builder clearEcgCalibrationDiastolic() {
                this.bitField0_ &= -33;
                this.ecgCalibrationDiastolic_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgCalibrationHeart() {
                this.bitField0_ &= -9;
                this.ecgCalibrationHeart_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgCalibrationMode() {
                this.bitField0_ &= -3;
                this.ecgCalibrationMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgCalibrationState() {
                this.bitField0_ &= -2;
                this.ecgCalibrationState_ = false;
                onChanged();
                return this;
            }

            public Builder clearEcgCalibrationSystolic() {
                this.bitField0_ &= -17;
                this.ecgCalibrationSystolic_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgLevelCalibration() {
                this.bitField0_ &= -5;
                this.ecgLevelCalibration_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SEEcgCalibrationData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public int getEcgCalibrationDiastolic() {
                return this.ecgCalibrationDiastolic_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public int getEcgCalibrationHeart() {
                return this.ecgCalibrationHeart_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public int getEcgCalibrationMode() {
                return this.ecgCalibrationMode_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public boolean getEcgCalibrationState() {
                return this.ecgCalibrationState_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public int getEcgCalibrationSystolic() {
                return this.ecgCalibrationSystolic_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public int getEcgLevelCalibration() {
                return this.ecgLevelCalibration_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public boolean hasEcgCalibrationDiastolic() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public boolean hasEcgCalibrationHeart() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public boolean hasEcgCalibrationMode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public boolean hasEcgCalibrationState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public boolean hasEcgCalibrationSystolic() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
            public boolean hasEcgLevelCalibration() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SEEcgCalibrationData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEEcgCalibrationData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEcgCalibrationState();
            }

            public Builder setEcgCalibrationDiastolic(int i7) {
                this.ecgCalibrationDiastolic_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setEcgCalibrationHeart(int i7) {
                this.ecgCalibrationHeart_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEcgCalibrationMode(int i7) {
                this.ecgCalibrationMode_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEcgCalibrationState(boolean z6) {
                this.ecgCalibrationState_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEcgCalibrationSystolic(int i7) {
                this.ecgCalibrationSystolic_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEcgLevelCalibration(int i7) {
                this.ecgLevelCalibration_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEEcgCalibrationData build() {
                SEEcgCalibrationData sEEcgCalibrationDataBuildPartial = buildPartial();
                if (sEEcgCalibrationDataBuildPartial.isInitialized()) {
                    return sEEcgCalibrationDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEEcgCalibrationDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEEcgCalibrationData buildPartial() {
                SEEcgCalibrationData sEEcgCalibrationData = new SEEcgCalibrationData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEEcgCalibrationData);
                }
                onBuilt();
                return sEEcgCalibrationData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEEcgCalibrationData getDefaultInstanceForType() {
                return SEEcgCalibrationData.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ecgCalibrationState_ = false;
                this.ecgCalibrationMode_ = 0;
                this.ecgLevelCalibration_ = 0;
                this.ecgCalibrationHeart_ = 0;
                this.ecgCalibrationSystolic_ = 0;
                this.ecgCalibrationDiastolic_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEEcgCalibrationData) {
                    return mergeFrom((SEEcgCalibrationData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEEcgCalibrationData sEEcgCalibrationData) {
                if (sEEcgCalibrationData == SEEcgCalibrationData.getDefaultInstance()) {
                    return this;
                }
                if (sEEcgCalibrationData.hasEcgCalibrationState()) {
                    setEcgCalibrationState(sEEcgCalibrationData.getEcgCalibrationState());
                }
                if (sEEcgCalibrationData.hasEcgCalibrationMode()) {
                    setEcgCalibrationMode(sEEcgCalibrationData.getEcgCalibrationMode());
                }
                if (sEEcgCalibrationData.hasEcgLevelCalibration()) {
                    setEcgLevelCalibration(sEEcgCalibrationData.getEcgLevelCalibration());
                }
                if (sEEcgCalibrationData.hasEcgCalibrationHeart()) {
                    setEcgCalibrationHeart(sEEcgCalibrationData.getEcgCalibrationHeart());
                }
                if (sEEcgCalibrationData.hasEcgCalibrationSystolic()) {
                    setEcgCalibrationSystolic(sEEcgCalibrationData.getEcgCalibrationSystolic());
                }
                if (sEEcgCalibrationData.hasEcgCalibrationDiastolic()) {
                    setEcgCalibrationDiastolic(sEEcgCalibrationData.getEcgCalibrationDiastolic());
                }
                mergeUnknownFields(sEEcgCalibrationData.getUnknownFields());
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
                                    this.ecgCalibrationState_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.ecgCalibrationMode_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.ecgLevelCalibration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.ecgCalibrationHeart_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.ecgCalibrationSystolic_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.ecgCalibrationDiastolic_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEEcgCalibrationData");
            DEFAULT_INSTANCE = new SEEcgCalibrationData();
            PARSER = new AbstractParser<SEEcgCalibrationData>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationData.1
                @Override // com.google.protobuf.Parser
                public SEEcgCalibrationData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEEcgCalibrationData.newBuilder();
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

        public /* synthetic */ SEEcgCalibrationData(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SEEcgCalibrationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SEEcgCalibrationData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEEcgCalibrationData parseDelimitedFrom(InputStream inputStream) {
            return (SEEcgCalibrationData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEEcgCalibrationData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEEcgCalibrationData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEEcgCalibrationData)) {
                return super.equals(obj);
            }
            SEEcgCalibrationData sEEcgCalibrationData = (SEEcgCalibrationData) obj;
            if (hasEcgCalibrationState() != sEEcgCalibrationData.hasEcgCalibrationState()) {
                return false;
            }
            if ((hasEcgCalibrationState() && getEcgCalibrationState() != sEEcgCalibrationData.getEcgCalibrationState()) || hasEcgCalibrationMode() != sEEcgCalibrationData.hasEcgCalibrationMode()) {
                return false;
            }
            if ((hasEcgCalibrationMode() && getEcgCalibrationMode() != sEEcgCalibrationData.getEcgCalibrationMode()) || hasEcgLevelCalibration() != sEEcgCalibrationData.hasEcgLevelCalibration()) {
                return false;
            }
            if ((hasEcgLevelCalibration() && getEcgLevelCalibration() != sEEcgCalibrationData.getEcgLevelCalibration()) || hasEcgCalibrationHeart() != sEEcgCalibrationData.hasEcgCalibrationHeart()) {
                return false;
            }
            if ((hasEcgCalibrationHeart() && getEcgCalibrationHeart() != sEEcgCalibrationData.getEcgCalibrationHeart()) || hasEcgCalibrationSystolic() != sEEcgCalibrationData.hasEcgCalibrationSystolic()) {
                return false;
            }
            if ((!hasEcgCalibrationSystolic() || getEcgCalibrationSystolic() == sEEcgCalibrationData.getEcgCalibrationSystolic()) && hasEcgCalibrationDiastolic() == sEEcgCalibrationData.hasEcgCalibrationDiastolic()) {
                return (!hasEcgCalibrationDiastolic() || getEcgCalibrationDiastolic() == sEEcgCalibrationData.getEcgCalibrationDiastolic()) && getUnknownFields().equals(sEEcgCalibrationData.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SEEcgCalibrationData_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public int getEcgCalibrationDiastolic() {
            return this.ecgCalibrationDiastolic_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public int getEcgCalibrationHeart() {
            return this.ecgCalibrationHeart_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public int getEcgCalibrationMode() {
            return this.ecgCalibrationMode_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public boolean getEcgCalibrationState() {
            return this.ecgCalibrationState_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public int getEcgCalibrationSystolic() {
            return this.ecgCalibrationSystolic_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public int getEcgLevelCalibration() {
            return this.ecgLevelCalibration_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEEcgCalibrationData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.ecgCalibrationState_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(2, this.ecgCalibrationMode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(3, this.ecgLevelCalibration_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(4, this.ecgCalibrationHeart_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(5, this.ecgCalibrationSystolic_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(6, this.ecgCalibrationDiastolic_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public boolean hasEcgCalibrationDiastolic() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public boolean hasEcgCalibrationHeart() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public boolean hasEcgCalibrationMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public boolean hasEcgCalibrationState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public boolean hasEcgCalibrationSystolic() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgCalibrationDataOrBuilder
        public boolean hasEcgLevelCalibration() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasEcgCalibrationState()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getEcgCalibrationState());
            }
            if (hasEcgCalibrationMode()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEcgCalibrationMode();
            }
            if (hasEcgLevelCalibration()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getEcgLevelCalibration();
            }
            if (hasEcgCalibrationHeart()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getEcgCalibrationHeart();
            }
            if (hasEcgCalibrationSystolic()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getEcgCalibrationSystolic();
            }
            if (hasEcgCalibrationDiastolic()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getEcgCalibrationDiastolic();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SEEcgCalibrationData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEEcgCalibrationData.class, Builder.class);
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
            if (hasEcgCalibrationState()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.ecgCalibrationState_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.ecgCalibrationMode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.ecgLevelCalibration_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.ecgCalibrationHeart_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.ecgCalibrationSystolic_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.ecgCalibrationDiastolic_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEEcgCalibrationData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.ecgCalibrationState_ = false;
            this.ecgCalibrationMode_ = 0;
            this.ecgLevelCalibration_ = 0;
            this.ecgCalibrationHeart_ = 0;
            this.ecgCalibrationSystolic_ = 0;
            this.ecgCalibrationDiastolic_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEEcgCalibrationData sEEcgCalibrationData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEEcgCalibrationData);
        }

        public static SEEcgCalibrationData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEEcgCalibrationData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEcgCalibrationData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEEcgCalibrationData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEEcgCalibrationData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEEcgCalibrationData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEEcgCalibrationData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEEcgCalibrationData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEEcgCalibrationData parseFrom(InputStream inputStream) {
            return (SEEcgCalibrationData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEEcgCalibrationData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEcgCalibrationData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SEEcgCalibrationData() {
            this.ecgCalibrationState_ = false;
            this.ecgCalibrationMode_ = 0;
            this.ecgLevelCalibration_ = 0;
            this.ecgCalibrationHeart_ = 0;
            this.ecgCalibrationSystolic_ = 0;
            this.ecgCalibrationDiastolic_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEEcgCalibrationData parseFrom(CodedInputStream codedInputStream) {
            return (SEEcgCalibrationData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEEcgCalibrationData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEcgCalibrationData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEEcgCalibrationDataOrBuilder extends MessageOrBuilder {
        int getEcgCalibrationDiastolic();

        int getEcgCalibrationHeart();

        int getEcgCalibrationMode();

        boolean getEcgCalibrationState();

        int getEcgCalibrationSystolic();

        int getEcgLevelCalibration();

        boolean hasEcgCalibrationDiastolic();

        boolean hasEcgCalibrationHeart();

        boolean hasEcgCalibrationMode();

        boolean hasEcgCalibrationState();

        boolean hasEcgCalibrationSystolic();

        boolean hasEcgLevelCalibration();
    }

    public static final class SEEcgData extends GeneratedMessage implements SEEcgDataOrBuilder {
        private static final SEEcgData DEFAULT_INSTANCE;
        public static final int ECG_CALIBRATION_DATA_FIELD_NUMBER = 6;
        public static final int ECG_COMMAND_FIELD_NUMBER = 1;
        public static final int ECG_DATA_FIELD_NUMBER = 5;
        public static final int ECG_DATA_INDEX_FIELD_NUMBER = 4;
        public static final int ECG_END_RESULT_FIELD_NUMBER = 3;
        public static final int ECG_MODE_FIELD_NUMBER = 7;
        public static final int ECG_REPORT_DATA_FIELD_NUMBER = 8;
        public static final int ECG_RESPOND_FIELD_NUMBER = 2;
        private static final Parser<SEEcgData> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SEEcgCalibrationData ecgCalibrationData_;
        private int ecgCommand_;
        private int ecgDataIndex_;
        private ByteString ecgData_;
        private int ecgEndResult_;
        private int ecgMode_;
        private SEEcgReportData ecgReportData_;
        private int ecgRespond_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEEcgData$1 */
        public class AnonymousClass1 extends AbstractParser<SEEcgData> {
            @Override // com.google.protobuf.Parser
            public SEEcgData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEEcgData.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEEcgDataOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> ecgCalibrationDataBuilder_;
            private SEEcgCalibrationData ecgCalibrationData_;
            private int ecgCommand_;
            private int ecgDataIndex_;
            private ByteString ecgData_;
            private int ecgEndResult_;
            private int ecgMode_;
            private SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> ecgReportDataBuilder_;
            private SEEcgReportData ecgReportData_;
            private int ecgRespond_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SEEcgData sEEcgData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEEcgData.ecgCommand_ = this.ecgCommand_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEEcgData.ecgRespond_ = this.ecgRespond_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEEcgData.ecgEndResult_ = this.ecgEndResult_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEEcgData.ecgDataIndex_ = this.ecgDataIndex_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEEcgData.ecgData_ = this.ecgData_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                    sEEcgData.ecgCalibrationData_ = singleFieldBuilder == null ? this.ecgCalibrationData_ : (SEEcgCalibrationData) singleFieldBuilder.build();
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEEcgData.ecgMode_ = this.ecgMode_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> singleFieldBuilder2 = this.ecgReportDataBuilder_;
                    sEEcgData.ecgReportData_ = singleFieldBuilder2 == null ? this.ecgReportData_ : (SEEcgReportData) singleFieldBuilder2.build();
                    i7 |= 128;
                }
                sEEcgData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SEEcgData_descriptor;
            }

            private SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> internalGetEcgCalibrationDataFieldBuilder() {
                if (this.ecgCalibrationDataBuilder_ == null) {
                    this.ecgCalibrationDataBuilder_ = new SingleFieldBuilder<>(getEcgCalibrationData(), getParentForChildren(), isClean());
                    this.ecgCalibrationData_ = null;
                }
                return this.ecgCalibrationDataBuilder_;
            }

            private SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> internalGetEcgReportDataFieldBuilder() {
                if (this.ecgReportDataBuilder_ == null) {
                    this.ecgReportDataBuilder_ = new SingleFieldBuilder<>(getEcgReportData(), getParentForChildren(), isClean());
                    this.ecgReportData_ = null;
                }
                return this.ecgReportDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetEcgCalibrationDataFieldBuilder();
                    internalGetEcgReportDataFieldBuilder();
                }
            }

            public Builder clearEcgCalibrationData() {
                this.bitField0_ &= -33;
                this.ecgCalibrationData_ = null;
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.ecgCalibrationDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEcgCommand() {
                this.bitField0_ &= -2;
                this.ecgCommand_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgData() {
                this.bitField0_ &= -17;
                this.ecgData_ = SEEcgData.getDefaultInstance().getEcgData();
                onChanged();
                return this;
            }

            public Builder clearEcgDataIndex() {
                this.bitField0_ &= -9;
                this.ecgDataIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgEndResult() {
                this.bitField0_ &= -5;
                this.ecgEndResult_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgMode() {
                this.bitField0_ &= -65;
                this.ecgMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgReportData() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.ecgReportData_ = null;
                SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> singleFieldBuilder = this.ecgReportDataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.ecgReportDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEcgRespond() {
                this.bitField0_ &= -3;
                this.ecgRespond_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SEEcgData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public SEEcgCalibrationData getEcgCalibrationData() {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEEcgCalibrationData) singleFieldBuilder.getMessage();
                }
                SEEcgCalibrationData sEEcgCalibrationData = this.ecgCalibrationData_;
                return sEEcgCalibrationData == null ? SEEcgCalibrationData.getDefaultInstance() : sEEcgCalibrationData;
            }

            public SEEcgCalibrationData.Builder getEcgCalibrationDataBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (SEEcgCalibrationData.Builder) internalGetEcgCalibrationDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public SEEcgCalibrationDataOrBuilder getEcgCalibrationDataOrBuilder() {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEEcgCalibrationDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEEcgCalibrationData sEEcgCalibrationData = this.ecgCalibrationData_;
                return sEEcgCalibrationData == null ? SEEcgCalibrationData.getDefaultInstance() : sEEcgCalibrationData;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public SEECGCommand getEcgCommand() {
                SEECGCommand sEECGCommandForNumber = SEECGCommand.forNumber(this.ecgCommand_);
                return sEECGCommandForNumber == null ? SEECGCommand.ECG_REQUEST_MEASUREMENT : sEECGCommandForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public ByteString getEcgData() {
                return this.ecgData_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public int getEcgDataIndex() {
                return this.ecgDataIndex_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public SEECGRespond getEcgEndResult() {
                SEECGRespond sEECGRespondForNumber = SEECGRespond.forNumber(this.ecgEndResult_);
                return sEECGRespondForNumber == null ? SEECGRespond.OK : sEECGRespondForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public int getEcgMode() {
                return this.ecgMode_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public SEEcgReportData getEcgReportData() {
                SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> singleFieldBuilder = this.ecgReportDataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEEcgReportData) singleFieldBuilder.getMessage();
                }
                SEEcgReportData sEEcgReportData = this.ecgReportData_;
                return sEEcgReportData == null ? SEEcgReportData.getDefaultInstance() : sEEcgReportData;
            }

            public SEEcgReportData.Builder getEcgReportDataBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (SEEcgReportData.Builder) internalGetEcgReportDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public SEEcgReportDataOrBuilder getEcgReportDataOrBuilder() {
                SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> singleFieldBuilder = this.ecgReportDataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEEcgReportDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEEcgReportData sEEcgReportData = this.ecgReportData_;
                return sEEcgReportData == null ? SEEcgReportData.getDefaultInstance() : sEEcgReportData;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public SEECGRespond getEcgRespond() {
                SEECGRespond sEECGRespondForNumber = SEECGRespond.forNumber(this.ecgRespond_);
                return sEECGRespondForNumber == null ? SEECGRespond.OK : sEECGRespondForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public boolean hasEcgCalibrationData() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public boolean hasEcgCommand() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public boolean hasEcgData() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public boolean hasEcgDataIndex() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public boolean hasEcgEndResult() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public boolean hasEcgMode() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public boolean hasEcgReportData() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
            public boolean hasEcgRespond() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SEEcgData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEEcgData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasEcgCalibrationData() || getEcgCalibrationData().isInitialized();
            }

            public Builder mergeEcgCalibrationData(SEEcgCalibrationData sEEcgCalibrationData) {
                SEEcgCalibrationData sEEcgCalibrationData2;
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEEcgCalibrationData);
                } else if ((this.bitField0_ & 32) == 0 || (sEEcgCalibrationData2 = this.ecgCalibrationData_) == null || sEEcgCalibrationData2 == SEEcgCalibrationData.getDefaultInstance()) {
                    this.ecgCalibrationData_ = sEEcgCalibrationData;
                } else {
                    getEcgCalibrationDataBuilder().mergeFrom(sEEcgCalibrationData);
                }
                if (this.ecgCalibrationData_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEcgReportData(SEEcgReportData sEEcgReportData) {
                SEEcgReportData sEEcgReportData2;
                SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> singleFieldBuilder = this.ecgReportDataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEEcgReportData);
                } else if ((this.bitField0_ & 128) == 0 || (sEEcgReportData2 = this.ecgReportData_) == null || sEEcgReportData2 == SEEcgReportData.getDefaultInstance()) {
                    this.ecgReportData_ = sEEcgReportData;
                } else {
                    getEcgReportDataBuilder().mergeFrom(sEEcgReportData);
                }
                if (this.ecgReportData_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder setEcgCalibrationData(SEEcgCalibrationData sEEcgCalibrationData) {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder == null) {
                    sEEcgCalibrationData.getClass();
                    this.ecgCalibrationData_ = sEEcgCalibrationData;
                } else {
                    singleFieldBuilder.setMessage(sEEcgCalibrationData);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setEcgCommand(SEECGCommand sEECGCommand) {
                sEECGCommand.getClass();
                this.bitField0_ |= 1;
                this.ecgCommand_ = sEECGCommand.getNumber();
                onChanged();
                return this;
            }

            public Builder setEcgData(ByteString byteString) {
                byteString.getClass();
                this.ecgData_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEcgDataIndex(int i7) {
                this.ecgDataIndex_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEcgEndResult(SEECGRespond sEECGRespond) {
                sEECGRespond.getClass();
                this.bitField0_ |= 4;
                this.ecgEndResult_ = sEECGRespond.getNumber();
                onChanged();
                return this;
            }

            public Builder setEcgMode(int i7) {
                this.ecgMode_ = i7;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setEcgReportData(SEEcgReportData sEEcgReportData) {
                SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> singleFieldBuilder = this.ecgReportDataBuilder_;
                if (singleFieldBuilder == null) {
                    sEEcgReportData.getClass();
                    this.ecgReportData_ = sEEcgReportData;
                } else {
                    singleFieldBuilder.setMessage(sEEcgReportData);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setEcgRespond(SEECGRespond sEECGRespond) {
                sEECGRespond.getClass();
                this.bitField0_ |= 2;
                this.ecgRespond_ = sEECGRespond.getNumber();
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
                this.ecgCommand_ = 0;
                this.ecgRespond_ = 0;
                this.ecgEndResult_ = 0;
                this.ecgData_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEEcgData build() {
                SEEcgData sEEcgDataBuildPartial = buildPartial();
                if (sEEcgDataBuildPartial.isInitialized()) {
                    return sEEcgDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEEcgDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEEcgData buildPartial() {
                SEEcgData sEEcgData = new SEEcgData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEEcgData);
                }
                onBuilt();
                return sEEcgData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEEcgData getDefaultInstanceForType() {
                return SEEcgData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ecgCommand_ = 0;
                this.ecgRespond_ = 0;
                this.ecgEndResult_ = 0;
                this.ecgDataIndex_ = 0;
                this.ecgData_ = ByteString.EMPTY;
                this.ecgCalibrationData_ = null;
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.ecgCalibrationDataBuilder_ = null;
                }
                this.ecgMode_ = 0;
                this.ecgReportData_ = null;
                SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> singleFieldBuilder2 = this.ecgReportDataBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.ecgReportDataBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEEcgData) {
                    return mergeFrom((SEEcgData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEcgCalibrationData(SEEcgCalibrationData.Builder builder) {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.ecgCalibrationData_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setEcgReportData(SEEcgReportData.Builder builder) {
                SingleFieldBuilder<SEEcgReportData, SEEcgReportData.Builder, SEEcgReportDataOrBuilder> singleFieldBuilder = this.ecgReportDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.ecgReportData_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.ecgCommand_ = 0;
                this.ecgRespond_ = 0;
                this.ecgEndResult_ = 0;
                this.ecgData_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(SEEcgData sEEcgData) {
                if (sEEcgData == SEEcgData.getDefaultInstance()) {
                    return this;
                }
                if (sEEcgData.hasEcgCommand()) {
                    setEcgCommand(sEEcgData.getEcgCommand());
                }
                if (sEEcgData.hasEcgRespond()) {
                    setEcgRespond(sEEcgData.getEcgRespond());
                }
                if (sEEcgData.hasEcgEndResult()) {
                    setEcgEndResult(sEEcgData.getEcgEndResult());
                }
                if (sEEcgData.hasEcgDataIndex()) {
                    setEcgDataIndex(sEEcgData.getEcgDataIndex());
                }
                if (sEEcgData.hasEcgData()) {
                    setEcgData(sEEcgData.getEcgData());
                }
                if (sEEcgData.hasEcgCalibrationData()) {
                    mergeEcgCalibrationData(sEEcgData.getEcgCalibrationData());
                }
                if (sEEcgData.hasEcgMode()) {
                    setEcgMode(sEEcgData.getEcgMode());
                }
                if (sEEcgData.hasEcgReportData()) {
                    mergeEcgReportData(sEEcgData.getEcgReportData());
                }
                mergeUnknownFields(sEEcgData.getUnknownFields());
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
                                    if (SEECGCommand.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.ecgCommand_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i8 = codedInputStream.readEnum();
                                    if (SEECGRespond.forNumber(i8) == null) {
                                        mergeUnknownVarintField(2, i8);
                                    } else {
                                        this.ecgRespond_ = i8;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    int i9 = codedInputStream.readEnum();
                                    if (SEECGRespond.forNumber(i9) == null) {
                                        mergeUnknownVarintField(3, i9);
                                    } else {
                                        this.ecgEndResult_ = i9;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    this.ecgDataIndex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.ecgData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(internalGetEcgCalibrationDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.ecgMode_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag != 66) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetEcgReportDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

        public enum SEECGCommand implements ProtocolMessageEnum {
            ECG_REQUEST_MEASUREMENT(0),
            ECG_START_MEASUREMENT(1),
            ECG_ABNORMAL_END_MEASUREMENT(2),
            ECG_END_MEASUREMENT(3),
            ECG_MANUAL_END_MEASUREMENT(4);

            public static final int ECG_ABNORMAL_END_MEASUREMENT_VALUE = 2;
            public static final int ECG_END_MEASUREMENT_VALUE = 3;
            public static final int ECG_MANUAL_END_MEASUREMENT_VALUE = 4;
            public static final int ECG_REQUEST_MEASUREMENT_VALUE = 0;
            public static final int ECG_START_MEASUREMENT_VALUE = 1;
            private static final SEECGCommand[] VALUES;
            private static final Internal.EnumLiteMap<SEECGCommand> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEEcgData$SEECGCommand$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEECGCommand> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEECGCommand findValueByNumber(int i7) {
                    return SEECGCommand.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEECGCommand");
                internalValueMap = new Internal.EnumLiteMap<SEECGCommand>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEEcgData.SEECGCommand.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEECGCommand findValueByNumber(int i7) {
                        return SEECGCommand.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEECGCommand(int i7) {
                this.value = i7;
            }

            public static SEECGCommand forNumber(int i7) {
                if (i7 == 0) {
                    return ECG_REQUEST_MEASUREMENT;
                }
                if (i7 == 1) {
                    return ECG_START_MEASUREMENT;
                }
                if (i7 == 2) {
                    return ECG_ABNORMAL_END_MEASUREMENT;
                }
                if (i7 == 3) {
                    return ECG_END_MEASUREMENT;
                }
                if (i7 != 4) {
                    return null;
                }
                return ECG_MANUAL_END_MEASUREMENT;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEEcgData.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SEECGCommand> internalGetValueMap() {
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
            public static SEECGCommand valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEECGCommand valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum SEECGRespond implements ProtocolMessageEnum {
            OK(0),
            BUSY(1),
            CHARGING(2),
            LOW_BATTERY(3),
            END_MEASUREMENT_DATA_OK(4),
            END_MEASUREMENT_DATA_ERROR(5),
            UNKNOWN(10);

            public static final int BUSY_VALUE = 1;
            public static final int CHARGING_VALUE = 2;
            public static final int END_MEASUREMENT_DATA_ERROR_VALUE = 5;
            public static final int END_MEASUREMENT_DATA_OK_VALUE = 4;
            public static final int LOW_BATTERY_VALUE = 3;
            public static final int OK_VALUE = 0;
            public static final int UNKNOWN_VALUE = 10;
            private static final SEECGRespond[] VALUES;
            private static final Internal.EnumLiteMap<SEECGRespond> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEEcgData$SEECGRespond$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEECGRespond> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEECGRespond findValueByNumber(int i7) {
                    return SEECGRespond.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEECGRespond");
                internalValueMap = new Internal.EnumLiteMap<SEECGRespond>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEEcgData.SEECGRespond.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEECGRespond findValueByNumber(int i7) {
                        return SEECGRespond.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEECGRespond(int i7) {
                this.value = i7;
            }

            public static SEECGRespond forNumber(int i7) {
                if (i7 == 10) {
                    return UNKNOWN;
                }
                if (i7 == 0) {
                    return OK;
                }
                if (i7 == 1) {
                    return BUSY;
                }
                if (i7 == 2) {
                    return CHARGING;
                }
                if (i7 == 3) {
                    return LOW_BATTERY;
                }
                if (i7 == 4) {
                    return END_MEASUREMENT_DATA_OK;
                }
                if (i7 != 5) {
                    return null;
                }
                return END_MEASUREMENT_DATA_ERROR;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEEcgData.getDescriptor().getEnumType(1);
            }

            public static Internal.EnumLiteMap<SEECGRespond> internalGetValueMap() {
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
            public static SEECGRespond valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEECGRespond valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEEcgData");
            DEFAULT_INSTANCE = new SEEcgData();
            PARSER = new AbstractParser<SEEcgData>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEEcgData.1
                @Override // com.google.protobuf.Parser
                public SEEcgData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEEcgData.newBuilder();
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

        public /* synthetic */ SEEcgData(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SEEcgData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SEEcgData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEEcgData parseDelimitedFrom(InputStream inputStream) {
            return (SEEcgData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEEcgData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEEcgData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEEcgData)) {
                return super.equals(obj);
            }
            SEEcgData sEEcgData = (SEEcgData) obj;
            if (hasEcgCommand() != sEEcgData.hasEcgCommand()) {
                return false;
            }
            if ((hasEcgCommand() && this.ecgCommand_ != sEEcgData.ecgCommand_) || hasEcgRespond() != sEEcgData.hasEcgRespond()) {
                return false;
            }
            if ((hasEcgRespond() && this.ecgRespond_ != sEEcgData.ecgRespond_) || hasEcgEndResult() != sEEcgData.hasEcgEndResult()) {
                return false;
            }
            if ((hasEcgEndResult() && this.ecgEndResult_ != sEEcgData.ecgEndResult_) || hasEcgDataIndex() != sEEcgData.hasEcgDataIndex()) {
                return false;
            }
            if ((hasEcgDataIndex() && getEcgDataIndex() != sEEcgData.getEcgDataIndex()) || hasEcgData() != sEEcgData.hasEcgData()) {
                return false;
            }
            if ((hasEcgData() && !getEcgData().equals(sEEcgData.getEcgData())) || hasEcgCalibrationData() != sEEcgData.hasEcgCalibrationData()) {
                return false;
            }
            if ((hasEcgCalibrationData() && !getEcgCalibrationData().equals(sEEcgData.getEcgCalibrationData())) || hasEcgMode() != sEEcgData.hasEcgMode()) {
                return false;
            }
            if ((!hasEcgMode() || getEcgMode() == sEEcgData.getEcgMode()) && hasEcgReportData() == sEEcgData.hasEcgReportData()) {
                return (!hasEcgReportData() || getEcgReportData().equals(sEEcgData.getEcgReportData())) && getUnknownFields().equals(sEEcgData.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SEEcgData_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public SEEcgCalibrationData getEcgCalibrationData() {
            SEEcgCalibrationData sEEcgCalibrationData = this.ecgCalibrationData_;
            return sEEcgCalibrationData == null ? SEEcgCalibrationData.getDefaultInstance() : sEEcgCalibrationData;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public SEEcgCalibrationDataOrBuilder getEcgCalibrationDataOrBuilder() {
            SEEcgCalibrationData sEEcgCalibrationData = this.ecgCalibrationData_;
            return sEEcgCalibrationData == null ? SEEcgCalibrationData.getDefaultInstance() : sEEcgCalibrationData;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public SEECGCommand getEcgCommand() {
            SEECGCommand sEECGCommandForNumber = SEECGCommand.forNumber(this.ecgCommand_);
            return sEECGCommandForNumber == null ? SEECGCommand.ECG_REQUEST_MEASUREMENT : sEECGCommandForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public ByteString getEcgData() {
            return this.ecgData_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public int getEcgDataIndex() {
            return this.ecgDataIndex_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public SEECGRespond getEcgEndResult() {
            SEECGRespond sEECGRespondForNumber = SEECGRespond.forNumber(this.ecgEndResult_);
            return sEECGRespondForNumber == null ? SEECGRespond.OK : sEECGRespondForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public int getEcgMode() {
            return this.ecgMode_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public SEEcgReportData getEcgReportData() {
            SEEcgReportData sEEcgReportData = this.ecgReportData_;
            return sEEcgReportData == null ? SEEcgReportData.getDefaultInstance() : sEEcgReportData;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public SEEcgReportDataOrBuilder getEcgReportDataOrBuilder() {
            SEEcgReportData sEEcgReportData = this.ecgReportData_;
            return sEEcgReportData == null ? SEEcgReportData.getDefaultInstance() : sEEcgReportData;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public SEECGRespond getEcgRespond() {
            SEECGRespond sEECGRespondForNumber = SEECGRespond.forNumber(this.ecgRespond_);
            return sEECGRespondForNumber == null ? SEECGRespond.OK : sEECGRespondForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEEcgData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.ecgCommand_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.ecgRespond_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.ecgEndResult_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.ecgDataIndex_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(5, this.ecgData_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(6, getEcgCalibrationData());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(7, this.ecgMode_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(8, getEcgReportData());
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public boolean hasEcgCalibrationData() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public boolean hasEcgCommand() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public boolean hasEcgData() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public boolean hasEcgDataIndex() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public boolean hasEcgEndResult() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public boolean hasEcgMode() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public boolean hasEcgReportData() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgDataOrBuilder
        public boolean hasEcgRespond() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasEcgCommand()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.ecgCommand_;
            }
            if (hasEcgRespond()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.ecgRespond_;
            }
            if (hasEcgEndResult()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.ecgEndResult_;
            }
            if (hasEcgDataIndex()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getEcgDataIndex();
            }
            if (hasEcgData()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getEcgData().hashCode();
            }
            if (hasEcgCalibrationData()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getEcgCalibrationData().hashCode();
            }
            if (hasEcgMode()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getEcgMode();
            }
            if (hasEcgReportData()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getEcgReportData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SEEcgData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEEcgData.class, Builder.class);
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
            if (!hasEcgCalibrationData() || getEcgCalibrationData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.ecgCommand_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.ecgRespond_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.ecgEndResult_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.ecgDataIndex_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBytes(5, this.ecgData_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getEcgCalibrationData());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.ecgMode_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getEcgReportData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEEcgData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.ecgCommand_ = 0;
            this.ecgRespond_ = 0;
            this.ecgEndResult_ = 0;
            this.ecgDataIndex_ = 0;
            this.ecgData_ = ByteString.EMPTY;
            this.ecgMode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEEcgData sEEcgData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEEcgData);
        }

        public static SEEcgData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEEcgData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEcgData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEEcgData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEEcgData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEEcgData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEEcgData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEEcgData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEEcgData parseFrom(InputStream inputStream) {
            return (SEEcgData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEEcgData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEcgData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SEEcgData() {
            this.ecgCommand_ = 0;
            this.ecgRespond_ = 0;
            this.ecgEndResult_ = 0;
            this.ecgDataIndex_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.ecgMode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.ecgCommand_ = 0;
            this.ecgRespond_ = 0;
            this.ecgEndResult_ = 0;
            this.ecgData_ = byteString;
        }

        public static SEEcgData parseFrom(CodedInputStream codedInputStream) {
            return (SEEcgData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEEcgData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEcgData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEEcgDataOrBuilder extends MessageOrBuilder {
        SEEcgCalibrationData getEcgCalibrationData();

        SEEcgCalibrationDataOrBuilder getEcgCalibrationDataOrBuilder();

        SEEcgData.SEECGCommand getEcgCommand();

        ByteString getEcgData();

        int getEcgDataIndex();

        SEEcgData.SEECGRespond getEcgEndResult();

        int getEcgMode();

        SEEcgReportData getEcgReportData();

        SEEcgReportDataOrBuilder getEcgReportDataOrBuilder();

        SEEcgData.SEECGRespond getEcgRespond();

        boolean hasEcgCalibrationData();

        boolean hasEcgCommand();

        boolean hasEcgData();

        boolean hasEcgDataIndex();

        boolean hasEcgEndResult();

        boolean hasEcgMode();

        boolean hasEcgReportData();

        boolean hasEcgRespond();
    }

    public static final class SEEcgReportData extends GeneratedMessage implements SEEcgReportDataOrBuilder {
        private static final SEEcgReportData DEFAULT_INSTANCE;
        public static final int ECG_BODYLOAD_FIELD_NUMBER = 7;
        public static final int ECG_BODYQUALITY_FIELD_NUMBER = 8;
        public static final int ECG_CARDIACFUNCTION_FIELD_NUMBER = 9;
        public static final int ECG_DIASTOLIC_FIELD_NUMBER = 3;
        public static final int ECG_FATIGUEINDEX_FIELD_NUMBER = 6;
        public static final int ECG_HEALTHINDEX_FIELD_NUMBER = 5;
        public static final int ECG_HEART_FIELD_NUMBER = 1;
        public static final int ECG_HRVRESULT_FIELD_NUMBER = 4;
        public static final int ECG_SYSTOLIC_FIELD_NUMBER = 2;
        private static final Parser<SEEcgReportData> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int ecgBodyLoad_;
        private int ecgBodyQuality_;
        private int ecgCardiacFunction_;
        private int ecgDiastolic_;
        private int ecgFatigueIndex_;
        private int ecgHealthIndex_;
        private int ecgHeart_;
        private int ecgHrvResult_;
        private int ecgSystolic_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEEcgReportData$1 */
        public class AnonymousClass1 extends AbstractParser<SEEcgReportData> {
            @Override // com.google.protobuf.Parser
            public SEEcgReportData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEEcgReportData.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEEcgReportDataOrBuilder {
            private int bitField0_;
            private int ecgBodyLoad_;
            private int ecgBodyQuality_;
            private int ecgCardiacFunction_;
            private int ecgDiastolic_;
            private int ecgFatigueIndex_;
            private int ecgHealthIndex_;
            private int ecgHeart_;
            private int ecgHrvResult_;
            private int ecgSystolic_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SEEcgReportData sEEcgReportData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEEcgReportData.ecgHeart_ = this.ecgHeart_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEEcgReportData.ecgSystolic_ = this.ecgSystolic_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEEcgReportData.ecgDiastolic_ = this.ecgDiastolic_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEEcgReportData.ecgHrvResult_ = this.ecgHrvResult_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEEcgReportData.ecgHealthIndex_ = this.ecgHealthIndex_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEEcgReportData.ecgFatigueIndex_ = this.ecgFatigueIndex_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEEcgReportData.ecgBodyLoad_ = this.ecgBodyLoad_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sEEcgReportData.ecgBodyQuality_ = this.ecgBodyQuality_;
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    sEEcgReportData.ecgCardiacFunction_ = this.ecgCardiacFunction_;
                    i7 |= 256;
                }
                sEEcgReportData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SEEcgReportData_descriptor;
            }

            public Builder clearEcgBodyLoad() {
                this.bitField0_ &= -65;
                this.ecgBodyLoad_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgBodyQuality() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.ecgBodyQuality_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgCardiacFunction() {
                this.bitField0_ &= -257;
                this.ecgCardiacFunction_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgDiastolic() {
                this.bitField0_ &= -5;
                this.ecgDiastolic_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgFatigueIndex() {
                this.bitField0_ &= -33;
                this.ecgFatigueIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgHealthIndex() {
                this.bitField0_ &= -17;
                this.ecgHealthIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgHeart() {
                this.bitField0_ &= -2;
                this.ecgHeart_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgHrvResult() {
                this.bitField0_ &= -9;
                this.ecgHrvResult_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEcgSystolic() {
                this.bitField0_ &= -3;
                this.ecgSystolic_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SEEcgReportData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public int getEcgBodyLoad() {
                return this.ecgBodyLoad_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public int getEcgBodyQuality() {
                return this.ecgBodyQuality_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public int getEcgCardiacFunction() {
                return this.ecgCardiacFunction_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public int getEcgDiastolic() {
                return this.ecgDiastolic_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public int getEcgFatigueIndex() {
                return this.ecgFatigueIndex_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public int getEcgHealthIndex() {
                return this.ecgHealthIndex_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public int getEcgHeart() {
                return this.ecgHeart_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public int getEcgHrvResult() {
                return this.ecgHrvResult_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public int getEcgSystolic() {
                return this.ecgSystolic_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public boolean hasEcgBodyLoad() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public boolean hasEcgBodyQuality() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public boolean hasEcgCardiacFunction() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public boolean hasEcgDiastolic() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public boolean hasEcgFatigueIndex() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public boolean hasEcgHealthIndex() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public boolean hasEcgHeart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public boolean hasEcgHrvResult() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
            public boolean hasEcgSystolic() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SEEcgReportData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEEcgReportData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setEcgBodyLoad(int i7) {
                this.ecgBodyLoad_ = i7;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setEcgBodyQuality(int i7) {
                this.ecgBodyQuality_ = i7;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setEcgCardiacFunction(int i7) {
                this.ecgCardiacFunction_ = i7;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setEcgDiastolic(int i7) {
                this.ecgDiastolic_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setEcgFatigueIndex(int i7) {
                this.ecgFatigueIndex_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setEcgHealthIndex(int i7) {
                this.ecgHealthIndex_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEcgHeart(int i7) {
                this.ecgHeart_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEcgHrvResult(int i7) {
                this.ecgHrvResult_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEcgSystolic(int i7) {
                this.ecgSystolic_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEEcgReportData build() {
                SEEcgReportData sEEcgReportDataBuildPartial = buildPartial();
                if (sEEcgReportDataBuildPartial.isInitialized()) {
                    return sEEcgReportDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEEcgReportDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEEcgReportData buildPartial() {
                SEEcgReportData sEEcgReportData = new SEEcgReportData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEEcgReportData);
                }
                onBuilt();
                return sEEcgReportData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEEcgReportData getDefaultInstanceForType() {
                return SEEcgReportData.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ecgHeart_ = 0;
                this.ecgSystolic_ = 0;
                this.ecgDiastolic_ = 0;
                this.ecgHrvResult_ = 0;
                this.ecgHealthIndex_ = 0;
                this.ecgFatigueIndex_ = 0;
                this.ecgBodyLoad_ = 0;
                this.ecgBodyQuality_ = 0;
                this.ecgCardiacFunction_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEEcgReportData) {
                    return mergeFrom((SEEcgReportData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEEcgReportData sEEcgReportData) {
                if (sEEcgReportData == SEEcgReportData.getDefaultInstance()) {
                    return this;
                }
                if (sEEcgReportData.hasEcgHeart()) {
                    setEcgHeart(sEEcgReportData.getEcgHeart());
                }
                if (sEEcgReportData.hasEcgSystolic()) {
                    setEcgSystolic(sEEcgReportData.getEcgSystolic());
                }
                if (sEEcgReportData.hasEcgDiastolic()) {
                    setEcgDiastolic(sEEcgReportData.getEcgDiastolic());
                }
                if (sEEcgReportData.hasEcgHrvResult()) {
                    setEcgHrvResult(sEEcgReportData.getEcgHrvResult());
                }
                if (sEEcgReportData.hasEcgHealthIndex()) {
                    setEcgHealthIndex(sEEcgReportData.getEcgHealthIndex());
                }
                if (sEEcgReportData.hasEcgFatigueIndex()) {
                    setEcgFatigueIndex(sEEcgReportData.getEcgFatigueIndex());
                }
                if (sEEcgReportData.hasEcgBodyLoad()) {
                    setEcgBodyLoad(sEEcgReportData.getEcgBodyLoad());
                }
                if (sEEcgReportData.hasEcgBodyQuality()) {
                    setEcgBodyQuality(sEEcgReportData.getEcgBodyQuality());
                }
                if (sEEcgReportData.hasEcgCardiacFunction()) {
                    setEcgCardiacFunction(sEEcgReportData.getEcgCardiacFunction());
                }
                mergeUnknownFields(sEEcgReportData.getUnknownFields());
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
                                    this.ecgHeart_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.ecgSystolic_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.ecgDiastolic_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.ecgHrvResult_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.ecgHealthIndex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.ecgFatigueIndex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.ecgBodyLoad_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag == 64) {
                                    this.ecgBodyQuality_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                } else if (tag != 72) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.ecgCardiacFunction_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEEcgReportData");
            DEFAULT_INSTANCE = new SEEcgReportData();
            PARSER = new AbstractParser<SEEcgReportData>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportData.1
                @Override // com.google.protobuf.Parser
                public SEEcgReportData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEEcgReportData.newBuilder();
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

        public /* synthetic */ SEEcgReportData(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SEEcgReportData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SEEcgReportData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEEcgReportData parseDelimitedFrom(InputStream inputStream) {
            return (SEEcgReportData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEEcgReportData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEEcgReportData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEEcgReportData)) {
                return super.equals(obj);
            }
            SEEcgReportData sEEcgReportData = (SEEcgReportData) obj;
            if (hasEcgHeart() != sEEcgReportData.hasEcgHeart()) {
                return false;
            }
            if ((hasEcgHeart() && getEcgHeart() != sEEcgReportData.getEcgHeart()) || hasEcgSystolic() != sEEcgReportData.hasEcgSystolic()) {
                return false;
            }
            if ((hasEcgSystolic() && getEcgSystolic() != sEEcgReportData.getEcgSystolic()) || hasEcgDiastolic() != sEEcgReportData.hasEcgDiastolic()) {
                return false;
            }
            if ((hasEcgDiastolic() && getEcgDiastolic() != sEEcgReportData.getEcgDiastolic()) || hasEcgHrvResult() != sEEcgReportData.hasEcgHrvResult()) {
                return false;
            }
            if ((hasEcgHrvResult() && getEcgHrvResult() != sEEcgReportData.getEcgHrvResult()) || hasEcgHealthIndex() != sEEcgReportData.hasEcgHealthIndex()) {
                return false;
            }
            if ((hasEcgHealthIndex() && getEcgHealthIndex() != sEEcgReportData.getEcgHealthIndex()) || hasEcgFatigueIndex() != sEEcgReportData.hasEcgFatigueIndex()) {
                return false;
            }
            if ((hasEcgFatigueIndex() && getEcgFatigueIndex() != sEEcgReportData.getEcgFatigueIndex()) || hasEcgBodyLoad() != sEEcgReportData.hasEcgBodyLoad()) {
                return false;
            }
            if ((hasEcgBodyLoad() && getEcgBodyLoad() != sEEcgReportData.getEcgBodyLoad()) || hasEcgBodyQuality() != sEEcgReportData.hasEcgBodyQuality()) {
                return false;
            }
            if ((!hasEcgBodyQuality() || getEcgBodyQuality() == sEEcgReportData.getEcgBodyQuality()) && hasEcgCardiacFunction() == sEEcgReportData.hasEcgCardiacFunction()) {
                return (!hasEcgCardiacFunction() || getEcgCardiacFunction() == sEEcgReportData.getEcgCardiacFunction()) && getUnknownFields().equals(sEEcgReportData.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SEEcgReportData_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public int getEcgBodyLoad() {
            return this.ecgBodyLoad_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public int getEcgBodyQuality() {
            return this.ecgBodyQuality_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public int getEcgCardiacFunction() {
            return this.ecgCardiacFunction_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public int getEcgDiastolic() {
            return this.ecgDiastolic_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public int getEcgFatigueIndex() {
            return this.ecgFatigueIndex_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public int getEcgHealthIndex() {
            return this.ecgHealthIndex_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public int getEcgHeart() {
            return this.ecgHeart_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public int getEcgHrvResult() {
            return this.ecgHrvResult_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public int getEcgSystolic() {
            return this.ecgSystolic_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEEcgReportData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.ecgHeart_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.ecgSystolic_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.ecgDiastolic_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.ecgHrvResult_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.ecgHealthIndex_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.ecgFatigueIndex_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.ecgBodyLoad_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(8, this.ecgBodyQuality_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(9, this.ecgCardiacFunction_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public boolean hasEcgBodyLoad() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public boolean hasEcgBodyQuality() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public boolean hasEcgCardiacFunction() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public boolean hasEcgDiastolic() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public boolean hasEcgFatigueIndex() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public boolean hasEcgHealthIndex() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public boolean hasEcgHeart() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public boolean hasEcgHrvResult() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEEcgReportDataOrBuilder
        public boolean hasEcgSystolic() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasEcgHeart()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getEcgHeart();
            }
            if (hasEcgSystolic()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEcgSystolic();
            }
            if (hasEcgDiastolic()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getEcgDiastolic();
            }
            if (hasEcgHrvResult()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getEcgHrvResult();
            }
            if (hasEcgHealthIndex()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getEcgHealthIndex();
            }
            if (hasEcgFatigueIndex()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getEcgFatigueIndex();
            }
            if (hasEcgBodyLoad()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getEcgBodyLoad();
            }
            if (hasEcgBodyQuality()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getEcgBodyQuality();
            }
            if (hasEcgCardiacFunction()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getEcgCardiacFunction();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SEEcgReportData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEEcgReportData.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.ecgHeart_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.ecgSystolic_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.ecgDiastolic_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.ecgHrvResult_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.ecgHealthIndex_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.ecgFatigueIndex_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.ecgBodyLoad_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.ecgBodyQuality_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.ecgCardiacFunction_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEEcgReportData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.ecgHeart_ = 0;
            this.ecgSystolic_ = 0;
            this.ecgDiastolic_ = 0;
            this.ecgHrvResult_ = 0;
            this.ecgHealthIndex_ = 0;
            this.ecgFatigueIndex_ = 0;
            this.ecgBodyLoad_ = 0;
            this.ecgBodyQuality_ = 0;
            this.ecgCardiacFunction_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEEcgReportData sEEcgReportData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEEcgReportData);
        }

        public static SEEcgReportData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEEcgReportData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEcgReportData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEEcgReportData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEEcgReportData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEEcgReportData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEEcgReportData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEEcgReportData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEEcgReportData parseFrom(InputStream inputStream) {
            return (SEEcgReportData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEEcgReportData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEcgReportData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEEcgReportData parseFrom(CodedInputStream codedInputStream) {
            return (SEEcgReportData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private SEEcgReportData() {
            this.ecgHeart_ = 0;
            this.ecgSystolic_ = 0;
            this.ecgDiastolic_ = 0;
            this.ecgHrvResult_ = 0;
            this.ecgHealthIndex_ = 0;
            this.ecgFatigueIndex_ = 0;
            this.ecgBodyLoad_ = 0;
            this.ecgBodyQuality_ = 0;
            this.ecgCardiacFunction_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEEcgReportData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEEcgReportData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEEcgReportDataOrBuilder extends MessageOrBuilder {
        int getEcgBodyLoad();

        int getEcgBodyQuality();

        int getEcgCardiacFunction();

        int getEcgDiastolic();

        int getEcgFatigueIndex();

        int getEcgHealthIndex();

        int getEcgHeart();

        int getEcgHrvResult();

        int getEcgSystolic();

        boolean hasEcgBodyLoad();

        boolean hasEcgBodyQuality();

        boolean hasEcgCardiacFunction();

        boolean hasEcgDiastolic();

        boolean hasEcgFatigueIndex();

        boolean hasEcgHealthIndex();

        boolean hasEcgHeart();

        boolean hasEcgHrvResult();

        boolean hasEcgSystolic();
    }

    public enum SEGpsAccuracy implements ProtocolMessageEnum {
        GPS_LOW(0),
        GPS_MEDIUM(1),
        GPS_HIGH(2),
        GPS_UNKNOWN(10);

        public static final int GPS_HIGH_VALUE = 2;
        public static final int GPS_LOW_VALUE = 0;
        public static final int GPS_MEDIUM_VALUE = 1;
        public static final int GPS_UNKNOWN_VALUE = 10;
        private static final SEGpsAccuracy[] VALUES;
        private static final Internal.EnumLiteMap<SEGpsAccuracy> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEGpsAccuracy$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEGpsAccuracy> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEGpsAccuracy findValueByNumber(int i7) {
                return SEGpsAccuracy.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEGpsAccuracy");
            internalValueMap = new Internal.EnumLiteMap<SEGpsAccuracy>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEGpsAccuracy.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEGpsAccuracy findValueByNumber(int i7) {
                    return SEGpsAccuracy.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEGpsAccuracy(int i7) {
            this.value = i7;
        }

        public static SEGpsAccuracy forNumber(int i7) {
            if (i7 == 0) {
                return GPS_LOW;
            }
            if (i7 == 1) {
                return GPS_MEDIUM;
            }
            if (i7 == 2) {
                return GPS_HIGH;
            }
            if (i7 != 10) {
                return null;
            }
            return GPS_UNKNOWN;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return SportingProtos.getDescriptor().getEnumType(2);
        }

        public static Internal.EnumLiteMap<SEGpsAccuracy> internalGetValueMap() {
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
        public static SEGpsAccuracy valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEGpsAccuracy valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEInfoWearSportType implements ProtocolMessageEnum {
        SESportType_NONE(0),
        SESportType_OUTSIDE_RUN(1),
        SESportType_OUTSIDE_MOVE(2),
        SESportType_INDOOR_RUN(3),
        SESportType_CLIMB(4),
        SESportType_CROSS_COUNTRY(5),
        SESportType_OUTSIDE_CYCLE(6),
        SESportType_INDOOR_CYCLE(7),
        SESportType_FREE_SPORT(8),
        SESportType_BASKETBALL(9),
        SESportType_FOOTBALL(10),
        SESportType_TABLE_TENNIS(11),
        SESportType_BADMINTON(12),
        SESportType_OUTSIDE_HIKING(13),
        SESportType_BMX(14),
        SESportType_HUNTING(15),
        SESportType_SAILING(16),
        SESportType_SKATEBOARDING(17),
        SESportType_ROLLER_SKATING(18),
        SESportType_OUTDOOR_SKATING(19),
        SESportType_EQUESTRIAN(20),
        SESportType_INDOOR_SWIMMING_L(21),
        SESportType_OPEN_WATER_L(22),
        SESportType_CORE_TRAINING(23),
        SESportType_MIXED_AEROBIC(24),
        SESportType_STRENGTH_TRAINING(25),
        SESportType_STRETCHING(26),
        SESportType_CLIMBING_MACHINE(27),
        SESportType_PILATES(28),
        SESportType_FLEXIBILITY_TRAINING(29),
        SESportType_INDOOR_FITNESS(30),
        SESportType_STEPPER(31),
        SESportType_STEP_TRAINING(32),
        SESportType_GYMNASTICS(33),
        SESportType_ELLIPTICAL(34),
        SESportType_YOGA(35),
        SESportType_FISHING(36),
        SESportType_CURLING(37),
        SESportType_INDOOR_SKATING(38),
        SESportType_CRICKET(39),
        SESportType_BASEBALL(40),
        SESportType_BOWLING(41),
        SESportType_SQUASH(42),
        SESportType_SOFTBALL(43),
        SESportType_CROQUET(44),
        SESportType_VOLLEYBALL(45),
        SESportType_HANDBALL(46),
        SESportType_BALLET(47),
        SESportType_BELLY_DANCE(48),
        SESportType_SQUARE_DANCE(49),
        SESportType_STREET_DANCE(50),
        SESportType_BALLROOM_DANCING(51),
        SESportType_DANCE(52),
        SESportType_ZUMBA(53),
        SESportType_KENDO(54),
        SESportType_KARATE(55),
        SESportType_BOXING(56),
        SESportType_JUDO(57),
        SESportType_WRESTLING(58),
        SESportType_TAICHI(59),
        SESportType_MUAY_THAI(60),
        SESportType_TAEKWONDO(61),
        SESportType_MARTIAL_ARTS(62),
        SESportType_FREE_SPARRING(63),
        SESportType_HIGH_INTENSITY_INTERVAL_TRAINING(64),
        SESportType_ARCHERY(65),
        SESportType_INDOOR_RUNNING(66),
        SESportType_PADDLE_BOARD(67),
        SESportType_WATER_POLO(68),
        SESportType_WATER_SPORTS(69),
        SESportType_WATER_SKIING(70),
        SESportType_KAYAKING(71),
        SESportType_KAYAK_RAFTING(72),
        SESportType_MOTORBOAT(73),
        SESportType_FIN_SWIMMING(74),
        SESportType_DIVING(75),
        SESportType_SYNCHRONIZED_SWIMMING(76),
        SESportType_SNORKELING(77),
        SESportType_KITE_SURFING(78),
        SESportType_ROCK_CLIMBING(79),
        SESportType_PARKOUR(80),
        SESportType_ATV(81),
        SESportType_PARAGLIDER(82),
        SESportType_STAIR_CLIMBING(83),
        SESportType_CROSSFIT(84),
        SESportType_AEROBICS(85),
        SESportType_PHYSICAL_TRAINING(86),
        SESportType_WALL_BALL(87),
        SESportType_DUMBBELL_TRAINING(88),
        SESportType_BARBELL_TRAINING(89),
        SESportType_WEIGHTLIFTING(90),
        SESportType_DEADLIFT(91),
        SESportType_BOBBY_JUMP(92),
        SESportType_SIT_UPS(93),
        SESportType_FUNCTIONAL_TRAINING(94),
        SESportType_UPPER_LIMB_TRAINING(95),
        SESportType_LOWER_LIMB_TRAINING(96),
        SESportType_WAISESportType_AND_ABDOMEN_TRAINING(97),
        SESportType_BACK_TRAINING(98),
        SESportType_NATIONAL_DANCE(99),
        SESportType_JAZZ(100),
        SESportType_LATIN_DANCE(101),
        SESportType_FENCING(102),
        SESportType_RUGBY(103),
        SESportType_HOCKEY(104),
        SESportType_TENNIS(105),
        SESportType_BILLIARDS(106),
        SESportType_SHUTTLECOCK(107),
        SESportType_SEPAK_TAKRAW(108),
        SESportType_SNOW_SPORTS(109),
        SESportType_SNOWMOBILE(110),
        SESportType_PUCK(111),
        SESportType_SNOW_CAR(112),
        SESportType_SLED(113),
        SESportType_DARTS(114),
        SESportType_TUG_OF_WAR(115),
        SESportType_HULA_HOOP(116),
        SESportType_FLY_A_KITE(117),
        SESportType_FRISBEE(118),
        SESportType_TRACK_AND_FIELD(119),
        SESportType_RACING_CAR(120),
        SESportType_ROWING_MACHINE_L(121),
        SESportType_ROPE_SKIPPING_L(122),
        SESportType_TRIATHLON_L(123),
        SESportType_MOUNTAIN_CYCLING(124),
        SESportType_KICKBOXING(125),
        SESportType_SKIING(126),
        SESportType_CROSS_COUNTRY_SKIING(127),
        SESportType_SNOWBOARDING(128),
        SESportType_ALPINE_SKIING(129),
        SESportType_DOUBLE_BOARD_SKIING(130),
        SESportType_FREE_EXERCISE(131),
        SESportType_PADDLEBOARD_SURFING(132),
        SESportType_KABADDI(133),
        SESportType_Golf(134),
        SESportType_INDOOR_WALKING(135),
        SESportType_Table_football(136),
        SESportType_Seven_stones(137),
        SESportType_Kho_kho(138),
        SESportType_Marathon(139),
        SESportType_Jumping_Jacks(140),
        SESportType_Pull_up_Bar(141),
        SESportType_Parallel_Bars(142),
        SESportType_High_Jump(143),
        SESportType_Long_Jump(144),
        SESportType_Pull_up(145),
        SESportType_Push_up(146),
        SESportType_Plank(147),
        SESportType_Foam_Rolling(148),
        SESportType_Fitness_Games(149),
        SESportType_Relaxing_Meditation(150),
        SESportType_Treadmill(151),
        SESportType_VO2_Max(152),
        SESportType_Australian_Rules_Football(153),
        SESportType_AmericanvFootball(154),
        SESportType_Pickleball(155),
        SESportType_Snowboarding_156(156),
        SESportType_Group_Gymnastics(157),
        SESportType_Combat_Aerobics(158),
        SESportType_Bungee_Jumping(159),
        SESportType_Kick_Scooter(160),
        SESportType_Balance_Bike(161),
        SESportType_Leisure_Sports(162),
        SESportType_Shooting(163),
        SESportType_Trampoline(164),
        SESportType_Field_Hockey(165),
        SESportType_Outdoor_Football(166),
        SESportType_OPEN_WATER(199),
        SESportType_INDOOR_SWIMMING_H(200),
        SESportType_OUTSIDE_SWIMMING_H(201),
        SESportType_ROWING_MACHINE_H(202),
        SESportType_ROPE_SKIPPING_H(203),
        SESportType_TRIATHLON_H(204),
        SESportType_Outdoor_football_H(205),
        SESportType_Indoor_running_Ring(206),
        SESportType_Outdoor_running_Ring(207),
        SESportType_Outdoor_Walking_Ring(208),
        SESportType_Indoor_cycling_Ring(209),
        SESportType_Outdoor_cycling_Ring(210),
        SESportType_Badminton_Ring(211),
        SESportType_Tennis_Ring(212),
        SESportType_Soccer_Ring(213),
        SESportType_Cricket_Ring(214),
        SESportType_Yoga_Ring(215);

        public static final int SESportType_AEROBICS_VALUE = 85;
        public static final int SESportType_ALPINE_SKIING_VALUE = 129;
        public static final int SESportType_ARCHERY_VALUE = 65;
        public static final int SESportType_ATV_VALUE = 81;
        public static final int SESportType_AmericanvFootball_VALUE = 154;
        public static final int SESportType_Australian_Rules_Football_VALUE = 153;
        public static final int SESportType_BACK_TRAINING_VALUE = 98;
        public static final int SESportType_BADMINTON_VALUE = 12;
        public static final int SESportType_BALLET_VALUE = 47;
        public static final int SESportType_BALLROOM_DANCING_VALUE = 51;
        public static final int SESportType_BARBELL_TRAINING_VALUE = 89;
        public static final int SESportType_BASEBALL_VALUE = 40;
        public static final int SESportType_BASKETBALL_VALUE = 9;
        public static final int SESportType_BELLY_DANCE_VALUE = 48;
        public static final int SESportType_BILLIARDS_VALUE = 106;
        public static final int SESportType_BMX_VALUE = 14;
        public static final int SESportType_BOBBY_JUMP_VALUE = 92;
        public static final int SESportType_BOWLING_VALUE = 41;
        public static final int SESportType_BOXING_VALUE = 56;
        public static final int SESportType_Badminton_Ring_VALUE = 211;
        public static final int SESportType_Balance_Bike_VALUE = 161;
        public static final int SESportType_Bungee_Jumping_VALUE = 159;
        public static final int SESportType_CLIMBING_MACHINE_VALUE = 27;
        public static final int SESportType_CLIMB_VALUE = 4;
        public static final int SESportType_CORE_TRAINING_VALUE = 23;
        public static final int SESportType_CRICKET_VALUE = 39;
        public static final int SESportType_CROQUET_VALUE = 44;
        public static final int SESportType_CROSSFIT_VALUE = 84;
        public static final int SESportType_CROSS_COUNTRY_SKIING_VALUE = 127;
        public static final int SESportType_CROSS_COUNTRY_VALUE = 5;
        public static final int SESportType_CURLING_VALUE = 37;
        public static final int SESportType_Combat_Aerobics_VALUE = 158;
        public static final int SESportType_Cricket_Ring_VALUE = 214;
        public static final int SESportType_DANCE_VALUE = 52;
        public static final int SESportType_DARTS_VALUE = 114;
        public static final int SESportType_DEADLIFT_VALUE = 91;
        public static final int SESportType_DIVING_VALUE = 75;
        public static final int SESportType_DOUBLE_BOARD_SKIING_VALUE = 130;
        public static final int SESportType_DUMBBELL_TRAINING_VALUE = 88;
        public static final int SESportType_ELLIPTICAL_VALUE = 34;
        public static final int SESportType_EQUESTRIAN_VALUE = 20;
        public static final int SESportType_FENCING_VALUE = 102;
        public static final int SESportType_FIN_SWIMMING_VALUE = 74;
        public static final int SESportType_FISHING_VALUE = 36;
        public static final int SESportType_FLEXIBILITY_TRAINING_VALUE = 29;
        public static final int SESportType_FLY_A_KITE_VALUE = 117;
        public static final int SESportType_FOOTBALL_VALUE = 10;
        public static final int SESportType_FREE_EXERCISE_VALUE = 131;
        public static final int SESportType_FREE_SPARRING_VALUE = 63;
        public static final int SESportType_FREE_SPORT_VALUE = 8;
        public static final int SESportType_FRISBEE_VALUE = 118;
        public static final int SESportType_FUNCTIONAL_TRAINING_VALUE = 94;
        public static final int SESportType_Field_Hockey_VALUE = 165;
        public static final int SESportType_Fitness_Games_VALUE = 149;
        public static final int SESportType_Foam_Rolling_VALUE = 148;
        public static final int SESportType_GYMNASTICS_VALUE = 33;
        public static final int SESportType_Golf_VALUE = 134;
        public static final int SESportType_Group_Gymnastics_VALUE = 157;
        public static final int SESportType_HANDBALL_VALUE = 46;
        public static final int SESportType_HIGH_INTENSITY_INTERVAL_TRAINING_VALUE = 64;
        public static final int SESportType_HOCKEY_VALUE = 104;
        public static final int SESportType_HULA_HOOP_VALUE = 116;
        public static final int SESportType_HUNTING_VALUE = 15;
        public static final int SESportType_High_Jump_VALUE = 143;
        public static final int SESportType_INDOOR_CYCLE_VALUE = 7;
        public static final int SESportType_INDOOR_FITNESS_VALUE = 30;
        public static final int SESportType_INDOOR_RUNNING_VALUE = 66;
        public static final int SESportType_INDOOR_RUN_VALUE = 3;
        public static final int SESportType_INDOOR_SKATING_VALUE = 38;
        public static final int SESportType_INDOOR_SWIMMING_H_VALUE = 200;
        public static final int SESportType_INDOOR_SWIMMING_L_VALUE = 21;
        public static final int SESportType_INDOOR_WALKING_VALUE = 135;
        public static final int SESportType_Indoor_cycling_Ring_VALUE = 209;
        public static final int SESportType_Indoor_running_Ring_VALUE = 206;
        public static final int SESportType_JAZZ_VALUE = 100;
        public static final int SESportType_JUDO_VALUE = 57;
        public static final int SESportType_Jumping_Jacks_VALUE = 140;
        public static final int SESportType_KABADDI_VALUE = 133;
        public static final int SESportType_KARATE_VALUE = 55;
        public static final int SESportType_KAYAKING_VALUE = 71;
        public static final int SESportType_KAYAK_RAFTING_VALUE = 72;
        public static final int SESportType_KENDO_VALUE = 54;
        public static final int SESportType_KICKBOXING_VALUE = 125;
        public static final int SESportType_KITE_SURFING_VALUE = 78;
        public static final int SESportType_Kho_kho_VALUE = 138;
        public static final int SESportType_Kick_Scooter_VALUE = 160;
        public static final int SESportType_LATIN_DANCE_VALUE = 101;
        public static final int SESportType_LOWER_LIMB_TRAINING_VALUE = 96;
        public static final int SESportType_Leisure_Sports_VALUE = 162;
        public static final int SESportType_Long_Jump_VALUE = 144;
        public static final int SESportType_MARTIAL_ARTS_VALUE = 62;
        public static final int SESportType_MIXED_AEROBIC_VALUE = 24;
        public static final int SESportType_MOTORBOAT_VALUE = 73;
        public static final int SESportType_MOUNTAIN_CYCLING_VALUE = 124;
        public static final int SESportType_MUAY_THAI_VALUE = 60;
        public static final int SESportType_Marathon_VALUE = 139;
        public static final int SESportType_NATIONAL_DANCE_VALUE = 99;
        public static final int SESportType_NONE_VALUE = 0;
        public static final int SESportType_OPEN_WATER_L_VALUE = 22;
        public static final int SESportType_OPEN_WATER_VALUE = 199;
        public static final int SESportType_OUTDOOR_SKATING_VALUE = 19;
        public static final int SESportType_OUTSIDE_CYCLE_VALUE = 6;
        public static final int SESportType_OUTSIDE_HIKING_VALUE = 13;
        public static final int SESportType_OUTSIDE_MOVE_VALUE = 2;
        public static final int SESportType_OUTSIDE_RUN_VALUE = 1;
        public static final int SESportType_OUTSIDE_SWIMMING_H_VALUE = 201;
        public static final int SESportType_Outdoor_Football_VALUE = 166;
        public static final int SESportType_Outdoor_Walking_Ring_VALUE = 208;
        public static final int SESportType_Outdoor_cycling_Ring_VALUE = 210;
        public static final int SESportType_Outdoor_football_H_VALUE = 205;
        public static final int SESportType_Outdoor_running_Ring_VALUE = 207;
        public static final int SESportType_PADDLEBOARD_SURFING_VALUE = 132;
        public static final int SESportType_PADDLE_BOARD_VALUE = 67;
        public static final int SESportType_PARAGLIDER_VALUE = 82;
        public static final int SESportType_PARKOUR_VALUE = 80;
        public static final int SESportType_PHYSICAL_TRAINING_VALUE = 86;
        public static final int SESportType_PILATES_VALUE = 28;
        public static final int SESportType_PUCK_VALUE = 111;
        public static final int SESportType_Parallel_Bars_VALUE = 142;
        public static final int SESportType_Pickleball_VALUE = 155;
        public static final int SESportType_Plank_VALUE = 147;
        public static final int SESportType_Pull_up_Bar_VALUE = 141;
        public static final int SESportType_Pull_up_VALUE = 145;
        public static final int SESportType_Push_up_VALUE = 146;
        public static final int SESportType_RACING_CAR_VALUE = 120;
        public static final int SESportType_ROCK_CLIMBING_VALUE = 79;
        public static final int SESportType_ROLLER_SKATING_VALUE = 18;
        public static final int SESportType_ROPE_SKIPPING_H_VALUE = 203;
        public static final int SESportType_ROPE_SKIPPING_L_VALUE = 122;
        public static final int SESportType_ROWING_MACHINE_H_VALUE = 202;
        public static final int SESportType_ROWING_MACHINE_L_VALUE = 121;
        public static final int SESportType_RUGBY_VALUE = 103;
        public static final int SESportType_Relaxing_Meditation_VALUE = 150;
        public static final int SESportType_SAILING_VALUE = 16;
        public static final int SESportType_SEPAK_TAKRAW_VALUE = 108;
        public static final int SESportType_SHUTTLECOCK_VALUE = 107;
        public static final int SESportType_SIT_UPS_VALUE = 93;
        public static final int SESportType_SKATEBOARDING_VALUE = 17;
        public static final int SESportType_SKIING_VALUE = 126;
        public static final int SESportType_SLED_VALUE = 113;
        public static final int SESportType_SNORKELING_VALUE = 77;
        public static final int SESportType_SNOWBOARDING_VALUE = 128;
        public static final int SESportType_SNOWMOBILE_VALUE = 110;
        public static final int SESportType_SNOW_CAR_VALUE = 112;
        public static final int SESportType_SNOW_SPORTS_VALUE = 109;
        public static final int SESportType_SOFTBALL_VALUE = 43;
        public static final int SESportType_SQUARE_DANCE_VALUE = 49;
        public static final int SESportType_SQUASH_VALUE = 42;
        public static final int SESportType_STAIR_CLIMBING_VALUE = 83;
        public static final int SESportType_STEPPER_VALUE = 31;
        public static final int SESportType_STEP_TRAINING_VALUE = 32;
        public static final int SESportType_STREET_DANCE_VALUE = 50;
        public static final int SESportType_STRENGTH_TRAINING_VALUE = 25;
        public static final int SESportType_STRETCHING_VALUE = 26;
        public static final int SESportType_SYNCHRONIZED_SWIMMING_VALUE = 76;
        public static final int SESportType_Seven_stones_VALUE = 137;
        public static final int SESportType_Shooting_VALUE = 163;
        public static final int SESportType_Snowboarding_156_VALUE = 156;
        public static final int SESportType_Soccer_Ring_VALUE = 213;
        public static final int SESportType_TABLE_TENNIS_VALUE = 11;
        public static final int SESportType_TAEKWONDO_VALUE = 61;
        public static final int SESportType_TAICHI_VALUE = 59;
        public static final int SESportType_TENNIS_VALUE = 105;
        public static final int SESportType_TRACK_AND_FIELD_VALUE = 119;
        public static final int SESportType_TRIATHLON_H_VALUE = 204;
        public static final int SESportType_TRIATHLON_L_VALUE = 123;
        public static final int SESportType_TUG_OF_WAR_VALUE = 115;
        public static final int SESportType_Table_football_VALUE = 136;
        public static final int SESportType_Tennis_Ring_VALUE = 212;
        public static final int SESportType_Trampoline_VALUE = 164;
        public static final int SESportType_Treadmill_VALUE = 151;
        public static final int SESportType_UPPER_LIMB_TRAINING_VALUE = 95;
        public static final int SESportType_VO2_Max_VALUE = 152;
        public static final int SESportType_VOLLEYBALL_VALUE = 45;
        public static final int SESportType_WAISESportType_AND_ABDOMEN_TRAINING_VALUE = 97;
        public static final int SESportType_WALL_BALL_VALUE = 87;
        public static final int SESportType_WATER_POLO_VALUE = 68;
        public static final int SESportType_WATER_SKIING_VALUE = 70;
        public static final int SESportType_WATER_SPORTS_VALUE = 69;
        public static final int SESportType_WEIGHTLIFTING_VALUE = 90;
        public static final int SESportType_WRESTLING_VALUE = 58;
        public static final int SESportType_YOGA_VALUE = 35;
        public static final int SESportType_Yoga_Ring_VALUE = 215;
        public static final int SESportType_ZUMBA_VALUE = 53;
        private static final SEInfoWearSportType[] VALUES;
        private static final Internal.EnumLiteMap<SEInfoWearSportType> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEInfoWearSportType$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEInfoWearSportType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEInfoWearSportType findValueByNumber(int i7) {
                return SEInfoWearSportType.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEInfoWearSportType");
            internalValueMap = new Internal.EnumLiteMap<SEInfoWearSportType>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEInfoWearSportType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEInfoWearSportType findValueByNumber(int i7) {
                    return SEInfoWearSportType.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEInfoWearSportType(int i7) {
            this.value = i7;
        }

        public static SEInfoWearSportType forNumber(int i7) {
            switch (i7) {
                case 0:
                    return SESportType_NONE;
                case 1:
                    return SESportType_OUTSIDE_RUN;
                case 2:
                    return SESportType_OUTSIDE_MOVE;
                case 3:
                    return SESportType_INDOOR_RUN;
                case 4:
                    return SESportType_CLIMB;
                case 5:
                    return SESportType_CROSS_COUNTRY;
                case 6:
                    return SESportType_OUTSIDE_CYCLE;
                case 7:
                    return SESportType_INDOOR_CYCLE;
                case 8:
                    return SESportType_FREE_SPORT;
                case 9:
                    return SESportType_BASKETBALL;
                case 10:
                    return SESportType_FOOTBALL;
                case 11:
                    return SESportType_TABLE_TENNIS;
                case 12:
                    return SESportType_BADMINTON;
                case 13:
                    return SESportType_OUTSIDE_HIKING;
                case 14:
                    return SESportType_BMX;
                case 15:
                    return SESportType_HUNTING;
                case 16:
                    return SESportType_SAILING;
                case 17:
                    return SESportType_SKATEBOARDING;
                case 18:
                    return SESportType_ROLLER_SKATING;
                case 19:
                    return SESportType_OUTDOOR_SKATING;
                case 20:
                    return SESportType_EQUESTRIAN;
                case 21:
                    return SESportType_INDOOR_SWIMMING_L;
                case 22:
                    return SESportType_OPEN_WATER_L;
                case 23:
                    return SESportType_CORE_TRAINING;
                case 24:
                    return SESportType_MIXED_AEROBIC;
                case 25:
                    return SESportType_STRENGTH_TRAINING;
                case 26:
                    return SESportType_STRETCHING;
                case 27:
                    return SESportType_CLIMBING_MACHINE;
                case 28:
                    return SESportType_PILATES;
                case 29:
                    return SESportType_FLEXIBILITY_TRAINING;
                case 30:
                    return SESportType_INDOOR_FITNESS;
                case 31:
                    return SESportType_STEPPER;
                case 32:
                    return SESportType_STEP_TRAINING;
                case 33:
                    return SESportType_GYMNASTICS;
                case 34:
                    return SESportType_ELLIPTICAL;
                case 35:
                    return SESportType_YOGA;
                case 36:
                    return SESportType_FISHING;
                case 37:
                    return SESportType_CURLING;
                case 38:
                    return SESportType_INDOOR_SKATING;
                case 39:
                    return SESportType_CRICKET;
                case 40:
                    return SESportType_BASEBALL;
                case 41:
                    return SESportType_BOWLING;
                case 42:
                    return SESportType_SQUASH;
                case 43:
                    return SESportType_SOFTBALL;
                case 44:
                    return SESportType_CROQUET;
                case 45:
                    return SESportType_VOLLEYBALL;
                case 46:
                    return SESportType_HANDBALL;
                case 47:
                    return SESportType_BALLET;
                case 48:
                    return SESportType_BELLY_DANCE;
                case 49:
                    return SESportType_SQUARE_DANCE;
                case 50:
                    return SESportType_STREET_DANCE;
                case 51:
                    return SESportType_BALLROOM_DANCING;
                case 52:
                    return SESportType_DANCE;
                case 53:
                    return SESportType_ZUMBA;
                case 54:
                    return SESportType_KENDO;
                case 55:
                    return SESportType_KARATE;
                case 56:
                    return SESportType_BOXING;
                case 57:
                    return SESportType_JUDO;
                case 58:
                    return SESportType_WRESTLING;
                case 59:
                    return SESportType_TAICHI;
                case 60:
                    return SESportType_MUAY_THAI;
                case 61:
                    return SESportType_TAEKWONDO;
                case 62:
                    return SESportType_MARTIAL_ARTS;
                case 63:
                    return SESportType_FREE_SPARRING;
                case 64:
                    return SESportType_HIGH_INTENSITY_INTERVAL_TRAINING;
                case 65:
                    return SESportType_ARCHERY;
                case 66:
                    return SESportType_INDOOR_RUNNING;
                case 67:
                    return SESportType_PADDLE_BOARD;
                case 68:
                    return SESportType_WATER_POLO;
                case 69:
                    return SESportType_WATER_SPORTS;
                case 70:
                    return SESportType_WATER_SKIING;
                case 71:
                    return SESportType_KAYAKING;
                case 72:
                    return SESportType_KAYAK_RAFTING;
                case 73:
                    return SESportType_MOTORBOAT;
                case 74:
                    return SESportType_FIN_SWIMMING;
                case 75:
                    return SESportType_DIVING;
                case 76:
                    return SESportType_SYNCHRONIZED_SWIMMING;
                case 77:
                    return SESportType_SNORKELING;
                case 78:
                    return SESportType_KITE_SURFING;
                case 79:
                    return SESportType_ROCK_CLIMBING;
                case 80:
                    return SESportType_PARKOUR;
                case 81:
                    return SESportType_ATV;
                case 82:
                    return SESportType_PARAGLIDER;
                case 83:
                    return SESportType_STAIR_CLIMBING;
                case 84:
                    return SESportType_CROSSFIT;
                case 85:
                    return SESportType_AEROBICS;
                case 86:
                    return SESportType_PHYSICAL_TRAINING;
                case 87:
                    return SESportType_WALL_BALL;
                case 88:
                    return SESportType_DUMBBELL_TRAINING;
                case 89:
                    return SESportType_BARBELL_TRAINING;
                case 90:
                    return SESportType_WEIGHTLIFTING;
                case 91:
                    return SESportType_DEADLIFT;
                case 92:
                    return SESportType_BOBBY_JUMP;
                case 93:
                    return SESportType_SIT_UPS;
                case 94:
                    return SESportType_FUNCTIONAL_TRAINING;
                case 95:
                    return SESportType_UPPER_LIMB_TRAINING;
                case 96:
                    return SESportType_LOWER_LIMB_TRAINING;
                case 97:
                    return SESportType_WAISESportType_AND_ABDOMEN_TRAINING;
                case 98:
                    return SESportType_BACK_TRAINING;
                case 99:
                    return SESportType_NATIONAL_DANCE;
                case 100:
                    return SESportType_JAZZ;
                case 101:
                    return SESportType_LATIN_DANCE;
                case 102:
                    return SESportType_FENCING;
                case 103:
                    return SESportType_RUGBY;
                case 104:
                    return SESportType_HOCKEY;
                case 105:
                    return SESportType_TENNIS;
                case 106:
                    return SESportType_BILLIARDS;
                case 107:
                    return SESportType_SHUTTLECOCK;
                case 108:
                    return SESportType_SEPAK_TAKRAW;
                case 109:
                    return SESportType_SNOW_SPORTS;
                case 110:
                    return SESportType_SNOWMOBILE;
                case 111:
                    return SESportType_PUCK;
                case 112:
                    return SESportType_SNOW_CAR;
                case 113:
                    return SESportType_SLED;
                case 114:
                    return SESportType_DARTS;
                case 115:
                    return SESportType_TUG_OF_WAR;
                case 116:
                    return SESportType_HULA_HOOP;
                case 117:
                    return SESportType_FLY_A_KITE;
                case 118:
                    return SESportType_FRISBEE;
                case 119:
                    return SESportType_TRACK_AND_FIELD;
                case 120:
                    return SESportType_RACING_CAR;
                case 121:
                    return SESportType_ROWING_MACHINE_L;
                case 122:
                    return SESportType_ROPE_SKIPPING_L;
                case 123:
                    return SESportType_TRIATHLON_L;
                case 124:
                    return SESportType_MOUNTAIN_CYCLING;
                case 125:
                    return SESportType_KICKBOXING;
                case 126:
                    return SESportType_SKIING;
                case 127:
                    return SESportType_CROSS_COUNTRY_SKIING;
                case 128:
                    return SESportType_SNOWBOARDING;
                case 129:
                    return SESportType_ALPINE_SKIING;
                case 130:
                    return SESportType_DOUBLE_BOARD_SKIING;
                case 131:
                    return SESportType_FREE_EXERCISE;
                case 132:
                    return SESportType_PADDLEBOARD_SURFING;
                case 133:
                    return SESportType_KABADDI;
                case 134:
                    return SESportType_Golf;
                case 135:
                    return SESportType_INDOOR_WALKING;
                case 136:
                    return SESportType_Table_football;
                case 137:
                    return SESportType_Seven_stones;
                case 138:
                    return SESportType_Kho_kho;
                case 139:
                    return SESportType_Marathon;
                case 140:
                    return SESportType_Jumping_Jacks;
                case 141:
                    return SESportType_Pull_up_Bar;
                case 142:
                    return SESportType_Parallel_Bars;
                case 143:
                    return SESportType_High_Jump;
                case 144:
                    return SESportType_Long_Jump;
                case 145:
                    return SESportType_Pull_up;
                case 146:
                    return SESportType_Push_up;
                case 147:
                    return SESportType_Plank;
                case 148:
                    return SESportType_Foam_Rolling;
                case 149:
                    return SESportType_Fitness_Games;
                case 150:
                    return SESportType_Relaxing_Meditation;
                case 151:
                    return SESportType_Treadmill;
                case 152:
                    return SESportType_VO2_Max;
                case 153:
                    return SESportType_Australian_Rules_Football;
                case 154:
                    return SESportType_AmericanvFootball;
                case 155:
                    return SESportType_Pickleball;
                case 156:
                    return SESportType_Snowboarding_156;
                case 157:
                    return SESportType_Group_Gymnastics;
                case 158:
                    return SESportType_Combat_Aerobics;
                case 159:
                    return SESportType_Bungee_Jumping;
                case 160:
                    return SESportType_Kick_Scooter;
                case 161:
                    return SESportType_Balance_Bike;
                case 162:
                    return SESportType_Leisure_Sports;
                case 163:
                    return SESportType_Shooting;
                case 164:
                    return SESportType_Trampoline;
                case 165:
                    return SESportType_Field_Hockey;
                case 166:
                    return SESportType_Outdoor_Football;
                default:
                    switch (i7) {
                        case 199:
                            return SESportType_OPEN_WATER;
                        case 200:
                            return SESportType_INDOOR_SWIMMING_H;
                        case 201:
                            return SESportType_OUTSIDE_SWIMMING_H;
                        case 202:
                            return SESportType_ROWING_MACHINE_H;
                        case 203:
                            return SESportType_ROPE_SKIPPING_H;
                        case 204:
                            return SESportType_TRIATHLON_H;
                        case 205:
                            return SESportType_Outdoor_football_H;
                        case 206:
                            return SESportType_Indoor_running_Ring;
                        case 207:
                            return SESportType_Outdoor_running_Ring;
                        case 208:
                            return SESportType_Outdoor_Walking_Ring;
                        case 209:
                            return SESportType_Indoor_cycling_Ring;
                        case 210:
                            return SESportType_Outdoor_cycling_Ring;
                        case 211:
                            return SESportType_Badminton_Ring;
                        case 212:
                            return SESportType_Tennis_Ring;
                        case 213:
                            return SESportType_Soccer_Ring;
                        case 214:
                            return SESportType_Cricket_Ring;
                        case 215:
                            return SESportType_Yoga_Ring;
                        default:
                            return null;
                    }
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return SportingProtos.getDescriptor().getEnumType(1);
        }

        public static Internal.EnumLiteMap<SEInfoWearSportType> internalGetValueMap() {
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
        public static SEInfoWearSportType valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEInfoWearSportType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEPhoneSportData extends GeneratedMessage implements SEPhoneSportDataOrBuilder {
        public static final int ALTITUDE_FIELD_NUMBER = 5;
        public static final int BEARING_FIELD_NUMBER = 7;
        private static final SEPhoneSportData DEFAULT_INSTANCE;
        public static final int GPS_ACCURACY_FIELD_NUMBER = 1;
        public static final int GPS_COORDINATE_SYSTEM_TYPE_FIELD_NUMBER = 10;
        public static final int HORIZONTAL_ACCURACY_FIELD_NUMBER = 8;
        public static final int LATITUDE_FIELD_NUMBER = 4;
        public static final int LONGITUDE_FIELD_NUMBER = 3;
        private static final Parser<SEPhoneSportData> PARSER;
        public static final int SPEED_FIELD_NUMBER = 6;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VERTICAL_ACCURACY_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private double altitude_;
        private float bearing_;
        private int bitField0_;
        private int gpsAccuracy_;
        private int gpsCoordinateSystemType_;
        private float horizontalAccuracy_;
        private double latitude_;
        private double longitude_;
        private byte memoizedIsInitialized;
        private float speed_;
        private int timestamp_;
        private float verticalAccuracy_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEPhoneSportData$1 */
        public class AnonymousClass1 extends AbstractParser<SEPhoneSportData> {
            @Override // com.google.protobuf.Parser
            public SEPhoneSportData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEPhoneSportData.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEPhoneSportDataOrBuilder {
            private double altitude_;
            private float bearing_;
            private int bitField0_;
            private int gpsAccuracy_;
            private int gpsCoordinateSystemType_;
            private float horizontalAccuracy_;
            private double latitude_;
            private double longitude_;
            private float speed_;
            private int timestamp_;
            private float verticalAccuracy_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SEPhoneSportData sEPhoneSportData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEPhoneSportData.gpsAccuracy_ = this.gpsAccuracy_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEPhoneSportData.timestamp_ = this.timestamp_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEPhoneSportData.longitude_ = this.longitude_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEPhoneSportData.latitude_ = this.latitude_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEPhoneSportData.altitude_ = this.altitude_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEPhoneSportData.speed_ = this.speed_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEPhoneSportData.bearing_ = this.bearing_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sEPhoneSportData.horizontalAccuracy_ = this.horizontalAccuracy_;
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    sEPhoneSportData.verticalAccuracy_ = this.verticalAccuracy_;
                    i7 |= 256;
                }
                if ((i8 & 512) != 0) {
                    sEPhoneSportData.gpsCoordinateSystemType_ = this.gpsCoordinateSystemType_;
                    i7 |= 512;
                }
                sEPhoneSportData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SEPhoneSportData_descriptor;
            }

            public Builder clearAltitude() {
                this.bitField0_ &= -17;
                this.altitude_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearBearing() {
                this.bitField0_ &= -65;
                this.bearing_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearGpsAccuracy() {
                this.bitField0_ &= -2;
                this.gpsAccuracy_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGpsCoordinateSystemType() {
                this.bitField0_ &= -513;
                this.gpsCoordinateSystemType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHorizontalAccuracy() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.horizontalAccuracy_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearLatitude() {
                this.bitField0_ &= -9;
                this.latitude_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearLongitude() {
                this.bitField0_ &= -5;
                this.longitude_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearSpeed() {
                this.bitField0_ &= -33;
                this.speed_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -3;
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVerticalAccuracy() {
                this.bitField0_ &= -257;
                this.verticalAccuracy_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public double getAltitude() {
                return this.altitude_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public float getBearing() {
                return this.bearing_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SEPhoneSportData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public SEGpsAccuracy getGpsAccuracy() {
                SEGpsAccuracy sEGpsAccuracyForNumber = SEGpsAccuracy.forNumber(this.gpsAccuracy_);
                return sEGpsAccuracyForNumber == null ? SEGpsAccuracy.GPS_LOW : sEGpsAccuracyForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public int getGpsCoordinateSystemType() {
                return this.gpsCoordinateSystemType_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public float getHorizontalAccuracy() {
                return this.horizontalAccuracy_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public double getLatitude() {
                return this.latitude_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public double getLongitude() {
                return this.longitude_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public float getSpeed() {
                return this.speed_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public float getVerticalAccuracy() {
                return this.verticalAccuracy_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasAltitude() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasBearing() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasGpsAccuracy() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasGpsCoordinateSystemType() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasHorizontalAccuracy() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasLatitude() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasLongitude() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasSpeed() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
            public boolean hasVerticalAccuracy() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SEPhoneSportData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPhoneSportData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasGpsAccuracy() && hasTimestamp() && hasLongitude() && hasLatitude();
            }

            public Builder setAltitude(double d7) {
                this.altitude_ = d7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setBearing(float f7) {
                this.bearing_ = f7;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setGpsAccuracy(SEGpsAccuracy sEGpsAccuracy) {
                sEGpsAccuracy.getClass();
                this.bitField0_ |= 1;
                this.gpsAccuracy_ = sEGpsAccuracy.getNumber();
                onChanged();
                return this;
            }

            public Builder setGpsCoordinateSystemType(int i7) {
                this.gpsCoordinateSystemType_ = i7;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setHorizontalAccuracy(float f7) {
                this.horizontalAccuracy_ = f7;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setLatitude(double d7) {
                this.latitude_ = d7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLongitude(double d7) {
                this.longitude_ = d7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSpeed(float f7) {
                this.speed_ = f7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setTimestamp(int i7) {
                this.timestamp_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVerticalAccuracy(float f7) {
                this.verticalAccuracy_ = f7;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
                this.gpsAccuracy_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEPhoneSportData build() {
                SEPhoneSportData sEPhoneSportDataBuildPartial = buildPartial();
                if (sEPhoneSportDataBuildPartial.isInitialized()) {
                    return sEPhoneSportDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEPhoneSportDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEPhoneSportData buildPartial() {
                SEPhoneSportData sEPhoneSportData = new SEPhoneSportData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEPhoneSportData);
                }
                onBuilt();
                return sEPhoneSportData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEPhoneSportData getDefaultInstanceForType() {
                return SEPhoneSportData.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.gpsAccuracy_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.gpsAccuracy_ = 0;
                this.timestamp_ = 0;
                this.longitude_ = 0.0d;
                this.latitude_ = 0.0d;
                this.altitude_ = 0.0d;
                this.speed_ = 0.0f;
                this.bearing_ = 0.0f;
                this.horizontalAccuracy_ = 0.0f;
                this.verticalAccuracy_ = 0.0f;
                this.gpsCoordinateSystemType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEPhoneSportData) {
                    return mergeFrom((SEPhoneSportData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEPhoneSportData sEPhoneSportData) {
                if (sEPhoneSportData == SEPhoneSportData.getDefaultInstance()) {
                    return this;
                }
                if (sEPhoneSportData.hasGpsAccuracy()) {
                    setGpsAccuracy(sEPhoneSportData.getGpsAccuracy());
                }
                if (sEPhoneSportData.hasTimestamp()) {
                    setTimestamp(sEPhoneSportData.getTimestamp());
                }
                if (sEPhoneSportData.hasLongitude()) {
                    setLongitude(sEPhoneSportData.getLongitude());
                }
                if (sEPhoneSportData.hasLatitude()) {
                    setLatitude(sEPhoneSportData.getLatitude());
                }
                if (sEPhoneSportData.hasAltitude()) {
                    setAltitude(sEPhoneSportData.getAltitude());
                }
                if (sEPhoneSportData.hasSpeed()) {
                    setSpeed(sEPhoneSportData.getSpeed());
                }
                if (sEPhoneSportData.hasBearing()) {
                    setBearing(sEPhoneSportData.getBearing());
                }
                if (sEPhoneSportData.hasHorizontalAccuracy()) {
                    setHorizontalAccuracy(sEPhoneSportData.getHorizontalAccuracy());
                }
                if (sEPhoneSportData.hasVerticalAccuracy()) {
                    setVerticalAccuracy(sEPhoneSportData.getVerticalAccuracy());
                }
                if (sEPhoneSportData.hasGpsCoordinateSystemType()) {
                    setGpsCoordinateSystemType(sEPhoneSportData.getGpsCoordinateSystemType());
                }
                mergeUnknownFields(sEPhoneSportData.getUnknownFields());
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
                                    if (SEGpsAccuracy.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.gpsAccuracy_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                    break;
                                case 16:
                                    this.timestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    break;
                                case 25:
                                    this.longitude_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 4;
                                    break;
                                case 33:
                                    this.latitude_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 8;
                                    break;
                                case 41:
                                    this.altitude_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 16;
                                    break;
                                case 53:
                                    this.speed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32;
                                    break;
                                case 61:
                                    this.bearing_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 64;
                                    break;
                                case 69:
                                    this.horizontalAccuracy_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 128;
                                    break;
                                case 77:
                                    this.verticalAccuracy_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 256;
                                    break;
                                case 80:
                                    this.gpsCoordinateSystemType_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPhoneSportData");
            DEFAULT_INSTANCE = new SEPhoneSportData();
            PARSER = new AbstractParser<SEPhoneSportData>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportData.1
                @Override // com.google.protobuf.Parser
                public SEPhoneSportData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEPhoneSportData.newBuilder();
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

        public /* synthetic */ SEPhoneSportData(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SEPhoneSportData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SEPhoneSportData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEPhoneSportData parseDelimitedFrom(InputStream inputStream) {
            return (SEPhoneSportData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEPhoneSportData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEPhoneSportData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEPhoneSportData)) {
                return super.equals(obj);
            }
            SEPhoneSportData sEPhoneSportData = (SEPhoneSportData) obj;
            if (hasGpsAccuracy() != sEPhoneSportData.hasGpsAccuracy()) {
                return false;
            }
            if ((hasGpsAccuracy() && this.gpsAccuracy_ != sEPhoneSportData.gpsAccuracy_) || hasTimestamp() != sEPhoneSportData.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != sEPhoneSportData.getTimestamp()) || hasLongitude() != sEPhoneSportData.hasLongitude()) {
                return false;
            }
            if ((hasLongitude() && Double.doubleToLongBits(getLongitude()) != Double.doubleToLongBits(sEPhoneSportData.getLongitude())) || hasLatitude() != sEPhoneSportData.hasLatitude()) {
                return false;
            }
            if ((hasLatitude() && Double.doubleToLongBits(getLatitude()) != Double.doubleToLongBits(sEPhoneSportData.getLatitude())) || hasAltitude() != sEPhoneSportData.hasAltitude()) {
                return false;
            }
            if ((hasAltitude() && Double.doubleToLongBits(getAltitude()) != Double.doubleToLongBits(sEPhoneSportData.getAltitude())) || hasSpeed() != sEPhoneSportData.hasSpeed()) {
                return false;
            }
            if ((hasSpeed() && Float.floatToIntBits(getSpeed()) != Float.floatToIntBits(sEPhoneSportData.getSpeed())) || hasBearing() != sEPhoneSportData.hasBearing()) {
                return false;
            }
            if ((hasBearing() && Float.floatToIntBits(getBearing()) != Float.floatToIntBits(sEPhoneSportData.getBearing())) || hasHorizontalAccuracy() != sEPhoneSportData.hasHorizontalAccuracy()) {
                return false;
            }
            if ((hasHorizontalAccuracy() && Float.floatToIntBits(getHorizontalAccuracy()) != Float.floatToIntBits(sEPhoneSportData.getHorizontalAccuracy())) || hasVerticalAccuracy() != sEPhoneSportData.hasVerticalAccuracy()) {
                return false;
            }
            if ((!hasVerticalAccuracy() || Float.floatToIntBits(getVerticalAccuracy()) == Float.floatToIntBits(sEPhoneSportData.getVerticalAccuracy())) && hasGpsCoordinateSystemType() == sEPhoneSportData.hasGpsCoordinateSystemType()) {
                return (!hasGpsCoordinateSystemType() || getGpsCoordinateSystemType() == sEPhoneSportData.getGpsCoordinateSystemType()) && getUnknownFields().equals(sEPhoneSportData.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public double getAltitude() {
            return this.altitude_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public float getBearing() {
            return this.bearing_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SEPhoneSportData_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public SEGpsAccuracy getGpsAccuracy() {
            SEGpsAccuracy sEGpsAccuracyForNumber = SEGpsAccuracy.forNumber(this.gpsAccuracy_);
            return sEGpsAccuracyForNumber == null ? SEGpsAccuracy.GPS_LOW : sEGpsAccuracyForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public int getGpsCoordinateSystemType() {
            return this.gpsCoordinateSystemType_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public float getHorizontalAccuracy() {
            return this.horizontalAccuracy_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public double getLatitude() {
            return this.latitude_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public double getLongitude() {
            return this.longitude_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEPhoneSportData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.gpsAccuracy_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.timestamp_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeDoubleSize(3, this.longitude_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeDoubleSize(4, this.latitude_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeDoubleSize(5, this.altitude_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(6, this.speed_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(7, this.bearing_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(8, this.horizontalAccuracy_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(9, this.verticalAccuracy_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(10, this.gpsCoordinateSystemType_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public float getSpeed() {
            return this.speed_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public float getVerticalAccuracy() {
            return this.verticalAccuracy_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasAltitude() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasBearing() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasGpsAccuracy() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasGpsCoordinateSystemType() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasHorizontalAccuracy() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasLatitude() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasLongitude() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasSpeed() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEPhoneSportDataOrBuilder
        public boolean hasVerticalAccuracy() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasGpsAccuracy()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.gpsAccuracy_;
            }
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTimestamp();
            }
            if (hasLongitude()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getLongitude()));
            }
            if (hasLatitude()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashLong(Double.doubleToLongBits(getLatitude()));
            }
            if (hasAltitude()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashLong(Double.doubleToLongBits(getAltitude()));
            }
            if (hasSpeed()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + Float.floatToIntBits(getSpeed());
            }
            if (hasBearing()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + Float.floatToIntBits(getBearing());
            }
            if (hasHorizontalAccuracy()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + Float.floatToIntBits(getHorizontalAccuracy());
            }
            if (hasVerticalAccuracy()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + Float.floatToIntBits(getVerticalAccuracy());
            }
            if (hasGpsCoordinateSystemType()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getGpsCoordinateSystemType();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SEPhoneSportData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEPhoneSportData.class, Builder.class);
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
            if (!hasGpsAccuracy()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTimestamp()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLongitude()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLatitude()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.gpsAccuracy_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.timestamp_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeDouble(3, this.longitude_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeDouble(4, this.latitude_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeDouble(5, this.altitude_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeFloat(6, this.speed_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(7, this.bearing_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeFloat(8, this.horizontalAccuracy_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(9, this.verticalAccuracy_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.gpsCoordinateSystemType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEPhoneSportData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.gpsAccuracy_ = 0;
            this.timestamp_ = 0;
            this.longitude_ = 0.0d;
            this.latitude_ = 0.0d;
            this.altitude_ = 0.0d;
            this.speed_ = 0.0f;
            this.bearing_ = 0.0f;
            this.horizontalAccuracy_ = 0.0f;
            this.verticalAccuracy_ = 0.0f;
            this.gpsCoordinateSystemType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEPhoneSportData sEPhoneSportData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEPhoneSportData);
        }

        public static SEPhoneSportData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEPhoneSportData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPhoneSportData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPhoneSportData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEPhoneSportData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEPhoneSportData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEPhoneSportData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEPhoneSportData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEPhoneSportData parseFrom(InputStream inputStream) {
            return (SEPhoneSportData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEPhoneSportData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPhoneSportData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEPhoneSportData parseFrom(CodedInputStream codedInputStream) {
            return (SEPhoneSportData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEPhoneSportData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEPhoneSportData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SEPhoneSportData() {
            this.timestamp_ = 0;
            this.longitude_ = 0.0d;
            this.latitude_ = 0.0d;
            this.altitude_ = 0.0d;
            this.speed_ = 0.0f;
            this.bearing_ = 0.0f;
            this.horizontalAccuracy_ = 0.0f;
            this.verticalAccuracy_ = 0.0f;
            this.gpsCoordinateSystemType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.gpsAccuracy_ = 0;
        }
    }

    public interface SEPhoneSportDataOrBuilder extends MessageOrBuilder {
        double getAltitude();

        float getBearing();

        SEGpsAccuracy getGpsAccuracy();

        int getGpsCoordinateSystemType();

        float getHorizontalAccuracy();

        double getLatitude();

        double getLongitude();

        float getSpeed();

        int getTimestamp();

        float getVerticalAccuracy();

        boolean hasAltitude();

        boolean hasBearing();

        boolean hasGpsAccuracy();

        boolean hasGpsCoordinateSystemType();

        boolean hasHorizontalAccuracy();

        boolean hasLatitude();

        boolean hasLongitude();

        boolean hasSpeed();

        boolean hasTimestamp();

        boolean hasVerticalAccuracy();
    }

    public static final class SERingSportStatusData extends GeneratedMessage implements SERingSportStatusDataOrBuilder {
        private static final SERingSportStatusData DEFAULT_INSTANCE;
        public static final int IS_SPORT_ING_FIELD_NUMBER = 2;
        public static final int IS_SPORT_NO_SYNC_FIELD_NUMBER = 1;
        private static final Parser<SERingSportStatusData> PARSER;
        public static final int SPORT_END_STATUS_FIELD_NUMBER = 3;
        public static final int SPORT_START_STATUS_FIELD_NUMBER = 5;
        public static final int SPORT_STATUS_FIELD_NUMBER = 4;
        public static final int STARTSPORT_CURTIME_FIELD_NUMBER = 7;
        public static final int STARTSPORT_DURATION_FIELD_NUMBER = 8;
        public static final int STARTSPORT_TYPE_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isSportIng_;
        private boolean isSportNoSync_;
        private byte memoizedIsInitialized;
        private int sportEndStatus_;
        private int sportStartStatus_;
        private int sportStatus_;
        private int startsportCurtime_;
        private int startsportDuration_;
        private int startsportType_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SERingSportStatusData$1 */
        public class AnonymousClass1 extends AbstractParser<SERingSportStatusData> {
            @Override // com.google.protobuf.Parser
            public SERingSportStatusData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SERingSportStatusData.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SERingSportStatusDataOrBuilder {
            private int bitField0_;
            private boolean isSportIng_;
            private boolean isSportNoSync_;
            private int sportEndStatus_;
            private int sportStartStatus_;
            private int sportStatus_;
            private int startsportCurtime_;
            private int startsportDuration_;
            private int startsportType_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SERingSportStatusData sERingSportStatusData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sERingSportStatusData.isSportNoSync_ = this.isSportNoSync_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sERingSportStatusData.isSportIng_ = this.isSportIng_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sERingSportStatusData.sportEndStatus_ = this.sportEndStatus_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sERingSportStatusData.sportStatus_ = this.sportStatus_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sERingSportStatusData.sportStartStatus_ = this.sportStartStatus_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sERingSportStatusData.startsportType_ = this.startsportType_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sERingSportStatusData.startsportCurtime_ = this.startsportCurtime_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sERingSportStatusData.startsportDuration_ = this.startsportDuration_;
                    i7 |= 128;
                }
                sERingSportStatusData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SERingSportStatusData_descriptor;
            }

            public Builder clearIsSportIng() {
                this.bitField0_ &= -3;
                this.isSportIng_ = false;
                onChanged();
                return this;
            }

            public Builder clearIsSportNoSync() {
                this.bitField0_ &= -2;
                this.isSportNoSync_ = false;
                onChanged();
                return this;
            }

            public Builder clearSportEndStatus() {
                this.bitField0_ &= -5;
                this.sportEndStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSportStartStatus() {
                this.bitField0_ &= -17;
                this.sportStartStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSportStatus() {
                this.bitField0_ &= -9;
                this.sportStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStartsportCurtime() {
                this.bitField0_ &= -65;
                this.startsportCurtime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStartsportDuration() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.startsportDuration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStartsportType() {
                this.bitField0_ &= -33;
                this.startsportType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SERingSportStatusData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean getIsSportIng() {
                return this.isSportIng_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean getIsSportNoSync() {
                return this.isSportNoSync_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public SESportEndstatus getSportEndStatus() {
                SESportEndstatus sESportEndstatusForNumber = SESportEndstatus.forNumber(this.sportEndStatus_);
                return sESportEndstatusForNumber == null ? SESportEndstatus.SPORT_ENDSTATUS_NONE : sESportEndstatusForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public SESportStartstatus getSportStartStatus() {
                SESportStartstatus sESportStartstatusForNumber = SESportStartstatus.forNumber(this.sportStartStatus_);
                return sESportStartstatusForNumber == null ? SESportStartstatus.SPORT_STARTSTATUS_NONE : sESportStartstatusForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public SESportstatus getSportStatus() {
                SESportstatus sESportstatusForNumber = SESportstatus.forNumber(this.sportStatus_);
                return sESportstatusForNumber == null ? SESportstatus.SPORT_STATUS_NONE : sESportstatusForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public int getStartsportCurtime() {
                return this.startsportCurtime_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public int getStartsportDuration() {
                return this.startsportDuration_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public int getStartsportType() {
                return this.startsportType_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean hasIsSportIng() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean hasIsSportNoSync() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean hasSportEndStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean hasSportStartStatus() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean hasSportStatus() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean hasStartsportCurtime() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean hasStartsportDuration() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
            public boolean hasStartsportType() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SERingSportStatusData_fieldAccessorTable.ensureFieldAccessorsInitialized(SERingSportStatusData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setIsSportIng(boolean z6) {
                this.isSportIng_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setIsSportNoSync(boolean z6) {
                this.isSportNoSync_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSportEndStatus(SESportEndstatus sESportEndstatus) {
                sESportEndstatus.getClass();
                this.bitField0_ |= 4;
                this.sportEndStatus_ = sESportEndstatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setSportStartStatus(SESportStartstatus sESportStartstatus) {
                sESportStartstatus.getClass();
                this.bitField0_ |= 16;
                this.sportStartStatus_ = sESportStartstatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setSportStatus(SESportstatus sESportstatus) {
                sESportstatus.getClass();
                this.bitField0_ |= 8;
                this.sportStatus_ = sESportstatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setStartsportCurtime(int i7) {
                this.startsportCurtime_ = i7;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStartsportDuration(int i7) {
                this.startsportDuration_ = i7;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setStartsportType(int i7) {
                this.startsportType_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
                this.sportEndStatus_ = 0;
                this.sportStatus_ = 0;
                this.sportStartStatus_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SERingSportStatusData build() {
                SERingSportStatusData sERingSportStatusDataBuildPartial = buildPartial();
                if (sERingSportStatusDataBuildPartial.isInitialized()) {
                    return sERingSportStatusDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sERingSportStatusDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SERingSportStatusData buildPartial() {
                SERingSportStatusData sERingSportStatusData = new SERingSportStatusData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sERingSportStatusData);
                }
                onBuilt();
                return sERingSportStatusData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SERingSportStatusData getDefaultInstanceForType() {
                return SERingSportStatusData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.isSportNoSync_ = false;
                this.isSportIng_ = false;
                this.sportEndStatus_ = 0;
                this.sportStatus_ = 0;
                this.sportStartStatus_ = 0;
                this.startsportType_ = 0;
                this.startsportCurtime_ = 0;
                this.startsportDuration_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.sportEndStatus_ = 0;
                this.sportStatus_ = 0;
                this.sportStartStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SERingSportStatusData) {
                    return mergeFrom((SERingSportStatusData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SERingSportStatusData sERingSportStatusData) {
                if (sERingSportStatusData == SERingSportStatusData.getDefaultInstance()) {
                    return this;
                }
                if (sERingSportStatusData.hasIsSportNoSync()) {
                    setIsSportNoSync(sERingSportStatusData.getIsSportNoSync());
                }
                if (sERingSportStatusData.hasIsSportIng()) {
                    setIsSportIng(sERingSportStatusData.getIsSportIng());
                }
                if (sERingSportStatusData.hasSportEndStatus()) {
                    setSportEndStatus(sERingSportStatusData.getSportEndStatus());
                }
                if (sERingSportStatusData.hasSportStatus()) {
                    setSportStatus(sERingSportStatusData.getSportStatus());
                }
                if (sERingSportStatusData.hasSportStartStatus()) {
                    setSportStartStatus(sERingSportStatusData.getSportStartStatus());
                }
                if (sERingSportStatusData.hasStartsportType()) {
                    setStartsportType(sERingSportStatusData.getStartsportType());
                }
                if (sERingSportStatusData.hasStartsportCurtime()) {
                    setStartsportCurtime(sERingSportStatusData.getStartsportCurtime());
                }
                if (sERingSportStatusData.hasStartsportDuration()) {
                    setStartsportDuration(sERingSportStatusData.getStartsportDuration());
                }
                mergeUnknownFields(sERingSportStatusData.getUnknownFields());
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
                                    this.isSportNoSync_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.isSportIng_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i7 = codedInputStream.readEnum();
                                    if (SESportEndstatus.forNumber(i7) == null) {
                                        mergeUnknownVarintField(3, i7);
                                    } else {
                                        this.sportEndStatus_ = i7;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    int i8 = codedInputStream.readEnum();
                                    if (SESportstatus.forNumber(i8) == null) {
                                        mergeUnknownVarintField(4, i8);
                                    } else {
                                        this.sportStatus_ = i8;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 40) {
                                    int i9 = codedInputStream.readEnum();
                                    if (SESportStartstatus.forNumber(i9) == null) {
                                        mergeUnknownVarintField(5, i9);
                                    } else {
                                        this.sportStartStatus_ = i9;
                                        this.bitField0_ |= 16;
                                    }
                                } else if (tag == 48) {
                                    this.startsportType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.startsportCurtime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag != 64) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.startsportDuration_ = codedInputStream.readUInt32();
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

        public enum SESportEndstatus implements ProtocolMessageEnum {
            SPORT_ENDSTATUS_NONE(0),
            SPORT_ENDSTATUS_LOW_POWER(1),
            SPORT_ENDSTATUS_TIMEOUT(2),
            SPORT_ENDSTATUS_MEMOVER(3),
            SPORT_ENDSTATUS_CHARGE(4);

            public static final int SPORT_ENDSTATUS_CHARGE_VALUE = 4;
            public static final int SPORT_ENDSTATUS_LOW_POWER_VALUE = 1;
            public static final int SPORT_ENDSTATUS_MEMOVER_VALUE = 3;
            public static final int SPORT_ENDSTATUS_NONE_VALUE = 0;
            public static final int SPORT_ENDSTATUS_TIMEOUT_VALUE = 2;
            private static final SESportEndstatus[] VALUES;
            private static final Internal.EnumLiteMap<SESportEndstatus> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SERingSportStatusData$SESportEndstatus$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SESportEndstatus> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESportEndstatus findValueByNumber(int i7) {
                    return SESportEndstatus.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportEndstatus");
                internalValueMap = new Internal.EnumLiteMap<SESportEndstatus>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusData.SESportEndstatus.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SESportEndstatus findValueByNumber(int i7) {
                        return SESportEndstatus.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SESportEndstatus(int i7) {
                this.value = i7;
            }

            public static SESportEndstatus forNumber(int i7) {
                if (i7 == 0) {
                    return SPORT_ENDSTATUS_NONE;
                }
                if (i7 == 1) {
                    return SPORT_ENDSTATUS_LOW_POWER;
                }
                if (i7 == 2) {
                    return SPORT_ENDSTATUS_TIMEOUT;
                }
                if (i7 == 3) {
                    return SPORT_ENDSTATUS_MEMOVER;
                }
                if (i7 != 4) {
                    return null;
                }
                return SPORT_ENDSTATUS_CHARGE;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SERingSportStatusData.getDescriptor().getEnumType(1);
            }

            public static Internal.EnumLiteMap<SESportEndstatus> internalGetValueMap() {
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
            public static SESportEndstatus valueOf(int i7) {
                return forNumber(i7);
            }

            public static SESportEndstatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum SESportStartstatus implements ProtocolMessageEnum {
            SPORT_STARTSTATUS_NONE(0),
            SPORT_STARTSTATUS_LOW_POWER(1),
            SPORT_STARTSTATUS_UNWEAR(2),
            SPORT_STARTSTATUS_CHARING(3),
            SPORT_STARTSTATUS_SPORTING(4);

            public static final int SPORT_STARTSTATUS_CHARING_VALUE = 3;
            public static final int SPORT_STARTSTATUS_LOW_POWER_VALUE = 1;
            public static final int SPORT_STARTSTATUS_NONE_VALUE = 0;
            public static final int SPORT_STARTSTATUS_SPORTING_VALUE = 4;
            public static final int SPORT_STARTSTATUS_UNWEAR_VALUE = 2;
            private static final SESportStartstatus[] VALUES;
            private static final Internal.EnumLiteMap<SESportStartstatus> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SERingSportStatusData$SESportStartstatus$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SESportStartstatus> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESportStartstatus findValueByNumber(int i7) {
                    return SESportStartstatus.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportStartstatus");
                internalValueMap = new Internal.EnumLiteMap<SESportStartstatus>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusData.SESportStartstatus.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SESportStartstatus findValueByNumber(int i7) {
                        return SESportStartstatus.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SESportStartstatus(int i7) {
                this.value = i7;
            }

            public static SESportStartstatus forNumber(int i7) {
                if (i7 == 0) {
                    return SPORT_STARTSTATUS_NONE;
                }
                if (i7 == 1) {
                    return SPORT_STARTSTATUS_LOW_POWER;
                }
                if (i7 == 2) {
                    return SPORT_STARTSTATUS_UNWEAR;
                }
                if (i7 == 3) {
                    return SPORT_STARTSTATUS_CHARING;
                }
                if (i7 != 4) {
                    return null;
                }
                return SPORT_STARTSTATUS_SPORTING;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SERingSportStatusData.getDescriptor().getEnumType(2);
            }

            public static Internal.EnumLiteMap<SESportStartstatus> internalGetValueMap() {
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
            public static SESportStartstatus valueOf(int i7) {
                return forNumber(i7);
            }

            public static SESportStartstatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum SESportstatus implements ProtocolMessageEnum {
            SPORT_STATUS_NONE(0),
            SPORT_STATUS_START(1),
            SPORT_STATUS_PAUSE(2),
            SPORT_STATUS_RESUME(3),
            SPORT_STATUS_END(4);

            public static final int SPORT_STATUS_END_VALUE = 4;
            public static final int SPORT_STATUS_NONE_VALUE = 0;
            public static final int SPORT_STATUS_PAUSE_VALUE = 2;
            public static final int SPORT_STATUS_RESUME_VALUE = 3;
            public static final int SPORT_STATUS_START_VALUE = 1;
            private static final SESportstatus[] VALUES;
            private static final Internal.EnumLiteMap<SESportstatus> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SERingSportStatusData$SESportstatus$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SESportstatus> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESportstatus findValueByNumber(int i7) {
                    return SESportstatus.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportstatus");
                internalValueMap = new Internal.EnumLiteMap<SESportstatus>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusData.SESportstatus.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SESportstatus findValueByNumber(int i7) {
                        return SESportstatus.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SESportstatus(int i7) {
                this.value = i7;
            }

            public static SESportstatus forNumber(int i7) {
                if (i7 == 0) {
                    return SPORT_STATUS_NONE;
                }
                if (i7 == 1) {
                    return SPORT_STATUS_START;
                }
                if (i7 == 2) {
                    return SPORT_STATUS_PAUSE;
                }
                if (i7 == 3) {
                    return SPORT_STATUS_RESUME;
                }
                if (i7 != 4) {
                    return null;
                }
                return SPORT_STATUS_END;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SERingSportStatusData.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SESportstatus> internalGetValueMap() {
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
            public static SESportstatus valueOf(int i7) {
                return forNumber(i7);
            }

            public static SESportstatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SERingSportStatusData");
            DEFAULT_INSTANCE = new SERingSportStatusData();
            PARSER = new AbstractParser<SERingSportStatusData>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusData.1
                @Override // com.google.protobuf.Parser
                public SERingSportStatusData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SERingSportStatusData.newBuilder();
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

        public /* synthetic */ SERingSportStatusData(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SERingSportStatusData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SERingSportStatusData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SERingSportStatusData parseDelimitedFrom(InputStream inputStream) {
            return (SERingSportStatusData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SERingSportStatusData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SERingSportStatusData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SERingSportStatusData)) {
                return super.equals(obj);
            }
            SERingSportStatusData sERingSportStatusData = (SERingSportStatusData) obj;
            if (hasIsSportNoSync() != sERingSportStatusData.hasIsSportNoSync()) {
                return false;
            }
            if ((hasIsSportNoSync() && getIsSportNoSync() != sERingSportStatusData.getIsSportNoSync()) || hasIsSportIng() != sERingSportStatusData.hasIsSportIng()) {
                return false;
            }
            if ((hasIsSportIng() && getIsSportIng() != sERingSportStatusData.getIsSportIng()) || hasSportEndStatus() != sERingSportStatusData.hasSportEndStatus()) {
                return false;
            }
            if ((hasSportEndStatus() && this.sportEndStatus_ != sERingSportStatusData.sportEndStatus_) || hasSportStatus() != sERingSportStatusData.hasSportStatus()) {
                return false;
            }
            if ((hasSportStatus() && this.sportStatus_ != sERingSportStatusData.sportStatus_) || hasSportStartStatus() != sERingSportStatusData.hasSportStartStatus()) {
                return false;
            }
            if ((hasSportStartStatus() && this.sportStartStatus_ != sERingSportStatusData.sportStartStatus_) || hasStartsportType() != sERingSportStatusData.hasStartsportType()) {
                return false;
            }
            if ((hasStartsportType() && getStartsportType() != sERingSportStatusData.getStartsportType()) || hasStartsportCurtime() != sERingSportStatusData.hasStartsportCurtime()) {
                return false;
            }
            if ((!hasStartsportCurtime() || getStartsportCurtime() == sERingSportStatusData.getStartsportCurtime()) && hasStartsportDuration() == sERingSportStatusData.hasStartsportDuration()) {
                return (!hasStartsportDuration() || getStartsportDuration() == sERingSportStatusData.getStartsportDuration()) && getUnknownFields().equals(sERingSportStatusData.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SERingSportStatusData_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean getIsSportIng() {
            return this.isSportIng_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean getIsSportNoSync() {
            return this.isSportNoSync_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SERingSportStatusData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.isSportNoSync_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.isSportIng_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(3, this.sportEndStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(4, this.sportStatus_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(5, this.sportStartStatus_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(6, this.startsportType_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(7, this.startsportCurtime_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(8, this.startsportDuration_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public SESportEndstatus getSportEndStatus() {
            SESportEndstatus sESportEndstatusForNumber = SESportEndstatus.forNumber(this.sportEndStatus_);
            return sESportEndstatusForNumber == null ? SESportEndstatus.SPORT_ENDSTATUS_NONE : sESportEndstatusForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public SESportStartstatus getSportStartStatus() {
            SESportStartstatus sESportStartstatusForNumber = SESportStartstatus.forNumber(this.sportStartStatus_);
            return sESportStartstatusForNumber == null ? SESportStartstatus.SPORT_STARTSTATUS_NONE : sESportStartstatusForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public SESportstatus getSportStatus() {
            SESportstatus sESportstatusForNumber = SESportstatus.forNumber(this.sportStatus_);
            return sESportstatusForNumber == null ? SESportstatus.SPORT_STATUS_NONE : sESportstatusForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public int getStartsportCurtime() {
            return this.startsportCurtime_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public int getStartsportDuration() {
            return this.startsportDuration_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public int getStartsportType() {
            return this.startsportType_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean hasIsSportIng() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean hasIsSportNoSync() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean hasSportEndStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean hasSportStartStatus() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean hasSportStatus() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean hasStartsportCurtime() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean hasStartsportDuration() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SERingSportStatusDataOrBuilder
        public boolean hasStartsportType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasIsSportNoSync()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getIsSportNoSync());
            }
            if (hasIsSportIng()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getIsSportIng());
            }
            if (hasSportEndStatus()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.sportEndStatus_;
            }
            if (hasSportStatus()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + this.sportStatus_;
            }
            if (hasSportStartStatus()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + this.sportStartStatus_;
            }
            if (hasStartsportType()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getStartsportType();
            }
            if (hasStartsportCurtime()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getStartsportCurtime();
            }
            if (hasStartsportDuration()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getStartsportDuration();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SERingSportStatusData_fieldAccessorTable.ensureFieldAccessorsInitialized(SERingSportStatusData.class, Builder.class);
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
                codedOutputStream.writeBool(1, this.isSportNoSync_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.isSportIng_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.sportEndStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.sportStatus_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.sportStartStatus_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.startsportType_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.startsportCurtime_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.startsportDuration_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SERingSportStatusData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.isSportNoSync_ = false;
            this.isSportIng_ = false;
            this.sportEndStatus_ = 0;
            this.sportStatus_ = 0;
            this.sportStartStatus_ = 0;
            this.startsportType_ = 0;
            this.startsportCurtime_ = 0;
            this.startsportDuration_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SERingSportStatusData sERingSportStatusData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sERingSportStatusData);
        }

        public static SERingSportStatusData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SERingSportStatusData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SERingSportStatusData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SERingSportStatusData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SERingSportStatusData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SERingSportStatusData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SERingSportStatusData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SERingSportStatusData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SERingSportStatusData parseFrom(InputStream inputStream) {
            return (SERingSportStatusData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SERingSportStatusData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SERingSportStatusData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SERingSportStatusData parseFrom(CodedInputStream codedInputStream) {
            return (SERingSportStatusData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private SERingSportStatusData() {
            this.isSportNoSync_ = false;
            this.isSportIng_ = false;
            this.startsportType_ = 0;
            this.startsportCurtime_ = 0;
            this.startsportDuration_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.sportEndStatus_ = 0;
            this.sportStatus_ = 0;
            this.sportStartStatus_ = 0;
        }

        public static SERingSportStatusData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SERingSportStatusData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SERingSportStatusDataOrBuilder extends MessageOrBuilder {
        boolean getIsSportIng();

        boolean getIsSportNoSync();

        SERingSportStatusData.SESportEndstatus getSportEndStatus();

        SERingSportStatusData.SESportStartstatus getSportStartStatus();

        SERingSportStatusData.SESportstatus getSportStatus();

        int getStartsportCurtime();

        int getStartsportDuration();

        int getStartsportType();

        boolean hasIsSportIng();

        boolean hasIsSportNoSync();

        boolean hasSportEndStatus();

        boolean hasSportStartStatus();

        boolean hasSportStatus();

        boolean hasStartsportCurtime();

        boolean hasStartsportDuration();

        boolean hasStartsportType();
    }

    public static final class SESportRequest extends GeneratedMessage implements SESportRequestOrBuilder {
        private static final SESportRequest DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 5;
        private static final Parser<SESportRequest> PARSER;
        public static final int SPORT_TYPE_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 3;
        public static final int SUPPORT_VERSIONS_FIELD_NUMBER = 4;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int errorCode_;
        private byte memoizedIsInitialized;
        private int sportType_;
        private int state_;
        private int supportVersions_;
        private int timestamp_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SESportRequest$1 */
        public class AnonymousClass1 extends AbstractParser<SESportRequest> {
            @Override // com.google.protobuf.Parser
            public SESportRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESportRequest.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESportRequestOrBuilder {
            private int bitField0_;
            private int errorCode_;
            private int sportType_;
            private int state_;
            private int supportVersions_;
            private int timestamp_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SESportRequest sESportRequest) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESportRequest.timestamp_ = this.timestamp_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sESportRequest.sportType_ = this.sportType_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sESportRequest.state_ = this.state_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sESportRequest.supportVersions_ = this.supportVersions_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sESportRequest.errorCode_ = this.errorCode_;
                    i7 |= 16;
                }
                sESportRequest.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SESportRequest_descriptor;
            }

            public Builder clearErrorCode() {
                this.bitField0_ &= -17;
                this.errorCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSportType() {
                this.bitField0_ &= -3;
                this.sportType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -5;
                this.state_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSupportVersions() {
                this.bitField0_ &= -9;
                this.supportVersions_ = 0;
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
                return SportingProtos.internal_static_SESportRequest_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public SECode getErrorCode() {
                SECode sECodeForNumber = SECode.forNumber(this.errorCode_);
                return sECodeForNumber == null ? SECode.NORMAL_END : sECodeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public int getSportType() {
                return this.sportType_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public SEState getState() {
                SEState sEStateForNumber = SEState.forNumber(this.state_);
                return sEStateForNumber == null ? SEState.GPS_START_REQUEST : sEStateForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public int getSupportVersions() {
                return this.supportVersions_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public boolean hasErrorCode() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public boolean hasSportType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public boolean hasSupportVersions() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SESportRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SESportRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTimestamp() && hasSportType() && hasState();
            }

            public Builder setErrorCode(SECode sECode) {
                sECode.getClass();
                this.bitField0_ |= 16;
                this.errorCode_ = sECode.getNumber();
                onChanged();
                return this;
            }

            public Builder setSportType(int i7) {
                this.sportType_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setState(SEState sEState) {
                sEState.getClass();
                this.bitField0_ |= 4;
                this.state_ = sEState.getNumber();
                onChanged();
                return this;
            }

            public Builder setSupportVersions(int i7) {
                this.supportVersions_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTimestamp(int i7) {
                this.timestamp_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
                this.state_ = 0;
                this.errorCode_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESportRequest build() {
                SESportRequest sESportRequestBuildPartial = buildPartial();
                if (sESportRequestBuildPartial.isInitialized()) {
                    return sESportRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESportRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESportRequest buildPartial() {
                SESportRequest sESportRequest = new SESportRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESportRequest);
                }
                onBuilt();
                return sESportRequest;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESportRequest getDefaultInstanceForType() {
                return SESportRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timestamp_ = 0;
                this.sportType_ = 0;
                this.state_ = 0;
                this.supportVersions_ = 0;
                this.errorCode_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.state_ = 0;
                this.errorCode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESportRequest) {
                    return mergeFrom((SESportRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SESportRequest sESportRequest) {
                if (sESportRequest == SESportRequest.getDefaultInstance()) {
                    return this;
                }
                if (sESportRequest.hasTimestamp()) {
                    setTimestamp(sESportRequest.getTimestamp());
                }
                if (sESportRequest.hasSportType()) {
                    setSportType(sESportRequest.getSportType());
                }
                if (sESportRequest.hasState()) {
                    setState(sESportRequest.getState());
                }
                if (sESportRequest.hasSupportVersions()) {
                    setSupportVersions(sESportRequest.getSupportVersions());
                }
                if (sESportRequest.hasErrorCode()) {
                    setErrorCode(sESportRequest.getErrorCode());
                }
                mergeUnknownFields(sESportRequest.getUnknownFields());
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
                                    this.sportType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i7 = codedInputStream.readEnum();
                                    if (SEState.forNumber(i7) == null) {
                                        mergeUnknownVarintField(3, i7);
                                    } else {
                                        this.state_ = i7;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    this.supportVersions_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag != 40) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i8 = codedInputStream.readEnum();
                                    if (SECode.forNumber(i8) == null) {
                                        mergeUnknownVarintField(5, i8);
                                    } else {
                                        this.errorCode_ = i8;
                                        this.bitField0_ |= 16;
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

        public enum SECode implements ProtocolMessageEnum {
            NORMAL_END(0),
            SPORT_DURATION_NO_METTING(1),
            DEVICE_STORAGE_SPACE_FULL(2),
            UNKNOWN(10);

            public static final int DEVICE_STORAGE_SPACE_FULL_VALUE = 2;
            public static final int NORMAL_END_VALUE = 0;
            public static final int SPORT_DURATION_NO_METTING_VALUE = 1;
            public static final int UNKNOWN_VALUE = 10;
            private static final SECode[] VALUES;
            private static final Internal.EnumLiteMap<SECode> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SESportRequest$SECode$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SECode> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SECode findValueByNumber(int i7) {
                    return SECode.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SECode");
                internalValueMap = new Internal.EnumLiteMap<SECode>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SESportRequest.SECode.1
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
                    return NORMAL_END;
                }
                if (i7 == 1) {
                    return SPORT_DURATION_NO_METTING;
                }
                if (i7 == 2) {
                    return DEVICE_STORAGE_SPACE_FULL;
                }
                if (i7 != 10) {
                    return null;
                }
                return UNKNOWN;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SESportRequest.getDescriptor().getEnumType(1);
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

        public enum SEState implements ProtocolMessageEnum {
            GPS_START_REQUEST(0),
            START(1),
            PAUSE(2),
            RESUME(3),
            STOP(4);

            public static final int GPS_START_REQUEST_VALUE = 0;
            public static final int PAUSE_VALUE = 2;
            public static final int RESUME_VALUE = 3;
            public static final int START_VALUE = 1;
            public static final int STOP_VALUE = 4;
            private static final SEState[] VALUES;
            private static final Internal.EnumLiteMap<SEState> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SESportRequest$SEState$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEState> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEState findValueByNumber(int i7) {
                    return SEState.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEState");
                internalValueMap = new Internal.EnumLiteMap<SEState>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SESportRequest.SEState.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEState findValueByNumber(int i7) {
                        return SEState.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEState(int i7) {
                this.value = i7;
            }

            public static SEState forNumber(int i7) {
                if (i7 == 0) {
                    return GPS_START_REQUEST;
                }
                if (i7 == 1) {
                    return START;
                }
                if (i7 == 2) {
                    return PAUSE;
                }
                if (i7 == 3) {
                    return RESUME;
                }
                if (i7 != 4) {
                    return null;
                }
                return STOP;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SESportRequest.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SEState> internalGetValueMap() {
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
            public static SEState valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportRequest");
            DEFAULT_INSTANCE = new SESportRequest();
            PARSER = new AbstractParser<SESportRequest>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SESportRequest.1
                @Override // com.google.protobuf.Parser
                public SESportRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESportRequest.newBuilder();
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

        public /* synthetic */ SESportRequest(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SESportRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SESportRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESportRequest parseDelimitedFrom(InputStream inputStream) {
            return (SESportRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESportRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESportRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESportRequest)) {
                return super.equals(obj);
            }
            SESportRequest sESportRequest = (SESportRequest) obj;
            if (hasTimestamp() != sESportRequest.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != sESportRequest.getTimestamp()) || hasSportType() != sESportRequest.hasSportType()) {
                return false;
            }
            if ((hasSportType() && getSportType() != sESportRequest.getSportType()) || hasState() != sESportRequest.hasState()) {
                return false;
            }
            if ((hasState() && this.state_ != sESportRequest.state_) || hasSupportVersions() != sESportRequest.hasSupportVersions()) {
                return false;
            }
            if ((!hasSupportVersions() || getSupportVersions() == sESportRequest.getSupportVersions()) && hasErrorCode() == sESportRequest.hasErrorCode()) {
                return (!hasErrorCode() || this.errorCode_ == sESportRequest.errorCode_) && getUnknownFields().equals(sESportRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SESportRequest_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
        public SECode getErrorCode() {
            SECode sECodeForNumber = SECode.forNumber(this.errorCode_);
            return sECodeForNumber == null ? SECode.NORMAL_END : sECodeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESportRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.timestamp_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.sportType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(3, this.state_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.supportVersions_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(5, this.errorCode_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
        public int getSportType() {
            return this.sportType_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
        public SEState getState() {
            SEState sEStateForNumber = SEState.forNumber(this.state_);
            return sEStateForNumber == null ? SEState.GPS_START_REQUEST : sEStateForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
        public int getSupportVersions() {
            return this.supportVersions_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
        public boolean hasErrorCode() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
        public boolean hasSportType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
        public boolean hasSupportVersions() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportRequestOrBuilder
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
            if (hasSportType()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSportType();
            }
            if (hasState()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.state_;
            }
            if (hasSupportVersions()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getSupportVersions();
            }
            if (hasErrorCode()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + this.errorCode_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SESportRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SESportRequest.class, Builder.class);
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
            if (!hasSportType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasState()) {
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
                codedOutputStream.writeUInt32(2, this.sportType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.state_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.supportVersions_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.errorCode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESportRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.timestamp_ = 0;
            this.sportType_ = 0;
            this.state_ = 0;
            this.supportVersions_ = 0;
            this.errorCode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESportRequest sESportRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESportRequest);
        }

        public static SESportRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESportRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESportRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESportRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESportRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESportRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESportRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESportRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESportRequest parseFrom(InputStream inputStream) {
            return (SESportRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SESportRequest() {
            this.timestamp_ = 0;
            this.sportType_ = 0;
            this.supportVersions_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
            this.errorCode_ = 0;
        }

        public static SESportRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESportRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESportRequest parseFrom(CodedInputStream codedInputStream) {
            return (SESportRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESportRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESportRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESportRequestOrBuilder extends MessageOrBuilder {
        SESportRequest.SECode getErrorCode();

        int getSportType();

        SESportRequest.SEState getState();

        int getSupportVersions();

        int getTimestamp();

        boolean hasErrorCode();

        boolean hasSportType();

        boolean hasState();

        boolean hasSupportVersions();

        boolean hasTimestamp();
    }

    public static final class SESportResponse extends GeneratedMessage implements SESportResponseOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final SESportResponse DEFAULT_INSTANCE;
        public static final int GPS_ACCURACY_FIELD_NUMBER = 3;
        private static final Parser<SESportResponse> PARSER;
        public static final int SELECT_VERSION_FIELD_NUMBER = 4;
        public static final int SPORT_STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private int gpsAccuracy_;
        private byte memoizedIsInitialized;
        private int selectVersion_;
        private SESportStatus sportStatus_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SESportResponse$1 */
        public class AnonymousClass1 extends AbstractParser<SESportResponse> {
            @Override // com.google.protobuf.Parser
            public SESportResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESportResponse.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESportResponseOrBuilder {
            private int bitField0_;
            private int code_;
            private int gpsAccuracy_;
            private int selectVersion_;
            private SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> sportStatusBuilder_;
            private SESportStatus sportStatus_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SESportResponse sESportResponse) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESportResponse.code_ = this.code_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                    sESportResponse.sportStatus_ = singleFieldBuilder == null ? this.sportStatus_ : (SESportStatus) singleFieldBuilder.build();
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sESportResponse.gpsAccuracy_ = this.gpsAccuracy_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sESportResponse.selectVersion_ = this.selectVersion_;
                    i7 |= 8;
                }
                sESportResponse.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SESportResponse_descriptor;
            }

            private SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> internalGetSportStatusFieldBuilder() {
                if (this.sportStatusBuilder_ == null) {
                    this.sportStatusBuilder_ = new SingleFieldBuilder<>(getSportStatus(), getParentForChildren(), isClean());
                    this.sportStatus_ = null;
                }
                return this.sportStatusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetSportStatusFieldBuilder();
                }
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGpsAccuracy() {
                this.bitField0_ &= -5;
                this.gpsAccuracy_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSelectVersion() {
                this.bitField0_ &= -9;
                this.selectVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSportStatus() {
                this.bitField0_ &= -3;
                this.sportStatus_ = null;
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.sportStatusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
            public SECode getCode() {
                SECode sECodeForNumber = SECode.forNumber(this.code_);
                return sECodeForNumber == null ? SECode.OK : sECodeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SESportResponse_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
            public SEGpsAccuracy getGpsAccuracy() {
                SEGpsAccuracy sEGpsAccuracyForNumber = SEGpsAccuracy.forNumber(this.gpsAccuracy_);
                return sEGpsAccuracyForNumber == null ? SEGpsAccuracy.GPS_LOW : sEGpsAccuracyForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
            public int getSelectVersion() {
                return this.selectVersion_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
            public SESportStatus getSportStatus() {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder != null) {
                    return (SESportStatus) singleFieldBuilder.getMessage();
                }
                SESportStatus sESportStatus = this.sportStatus_;
                return sESportStatus == null ? SESportStatus.getDefaultInstance() : sESportStatus;
            }

            public SESportStatus.Builder getSportStatusBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SESportStatus.Builder) internalGetSportStatusFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
            public SESportStatusOrBuilder getSportStatusOrBuilder() {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder != null) {
                    return (SESportStatusOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SESportStatus sESportStatus = this.sportStatus_;
                return sESportStatus == null ? SESportStatus.getDefaultInstance() : sESportStatus;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
            public boolean hasGpsAccuracy() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
            public boolean hasSelectVersion() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
            public boolean hasSportStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SESportResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SESportResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasCode()) {
                    return !hasSportStatus() || getSportStatus().isInitialized();
                }
                return false;
            }

            public Builder mergeSportStatus(SESportStatus sESportStatus) {
                SESportStatus sESportStatus2;
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sESportStatus);
                } else if ((this.bitField0_ & 2) == 0 || (sESportStatus2 = this.sportStatus_) == null || sESportStatus2 == SESportStatus.getDefaultInstance()) {
                    this.sportStatus_ = sESportStatus;
                } else {
                    getSportStatusBuilder().mergeFrom(sESportStatus);
                }
                if (this.sportStatus_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setCode(SECode sECode) {
                sECode.getClass();
                this.bitField0_ |= 1;
                this.code_ = sECode.getNumber();
                onChanged();
                return this;
            }

            public Builder setGpsAccuracy(SEGpsAccuracy sEGpsAccuracy) {
                sEGpsAccuracy.getClass();
                this.bitField0_ |= 4;
                this.gpsAccuracy_ = sEGpsAccuracy.getNumber();
                onChanged();
                return this;
            }

            public Builder setSelectVersion(int i7) {
                this.selectVersion_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSportStatus(SESportStatus sESportStatus) {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder == null) {
                    sESportStatus.getClass();
                    this.sportStatus_ = sESportStatus;
                } else {
                    singleFieldBuilder.setMessage(sESportStatus);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
                this.code_ = 0;
                this.gpsAccuracy_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESportResponse build() {
                SESportResponse sESportResponseBuildPartial = buildPartial();
                if (sESportResponseBuildPartial.isInitialized()) {
                    return sESportResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESportResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESportResponse buildPartial() {
                SESportResponse sESportResponse = new SESportResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESportResponse);
                }
                onBuilt();
                return sESportResponse;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESportResponse getDefaultInstanceForType() {
                return SESportResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.code_ = 0;
                this.sportStatus_ = null;
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.sportStatusBuilder_ = null;
                }
                this.gpsAccuracy_ = 0;
                this.selectVersion_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.code_ = 0;
                this.gpsAccuracy_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESportResponse) {
                    return mergeFrom((SESportResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setSportStatus(SESportStatus.Builder builder) {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder == null) {
                    this.sportStatus_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SESportResponse sESportResponse) {
                if (sESportResponse == SESportResponse.getDefaultInstance()) {
                    return this;
                }
                if (sESportResponse.hasCode()) {
                    setCode(sESportResponse.getCode());
                }
                if (sESportResponse.hasSportStatus()) {
                    mergeSportStatus(sESportResponse.getSportStatus());
                }
                if (sESportResponse.hasGpsAccuracy()) {
                    setGpsAccuracy(sESportResponse.getGpsAccuracy());
                }
                if (sESportResponse.hasSelectVersion()) {
                    setSelectVersion(sESportResponse.getSelectVersion());
                }
                mergeUnknownFields(sESportResponse.getUnknownFields());
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
                                    if (SECode.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.code_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetSportStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i8 = codedInputStream.readEnum();
                                    if (SEGpsAccuracy.forNumber(i8) == null) {
                                        mergeUnknownVarintField(3, i8);
                                    } else {
                                        this.gpsAccuracy_ = i8;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.selectVersion_ = codedInputStream.readUInt32();
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

        public enum SECode implements ProtocolMessageEnum {
            OK(0),
            BUSY(1),
            TYPE_NOT_MATCH(2),
            NO_PERMISSION(3),
            NOT_SUPPORT(4),
            LACK_OF_ACCURACY(5),
            CHARGING(6),
            LOW_BATTERY(7),
            SEEK_FAIL(8),
            SPACE_WILL_BE_FULL(9),
            SPACE_IS_FULL(11),
            DEVICE_IS_SPORTING(12),
            NORMAL_END(13),
            SPORT_DURATION_NO_METTING(14),
            DEVICE_STORAGE_SPACE_FULL(15),
            UNKNOWN(10);

            public static final int BUSY_VALUE = 1;
            public static final int CHARGING_VALUE = 6;
            public static final int DEVICE_IS_SPORTING_VALUE = 12;
            public static final int DEVICE_STORAGE_SPACE_FULL_VALUE = 15;
            public static final int LACK_OF_ACCURACY_VALUE = 5;
            public static final int LOW_BATTERY_VALUE = 7;
            public static final int NORMAL_END_VALUE = 13;
            public static final int NOT_SUPPORT_VALUE = 4;
            public static final int NO_PERMISSION_VALUE = 3;
            public static final int OK_VALUE = 0;
            public static final int SEEK_FAIL_VALUE = 8;
            public static final int SPACE_IS_FULL_VALUE = 11;
            public static final int SPACE_WILL_BE_FULL_VALUE = 9;
            public static final int SPORT_DURATION_NO_METTING_VALUE = 14;
            public static final int TYPE_NOT_MATCH_VALUE = 2;
            public static final int UNKNOWN_VALUE = 10;
            private static final SECode[] VALUES;
            private static final Internal.EnumLiteMap<SECode> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SESportResponse$SECode$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SECode> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SECode findValueByNumber(int i7) {
                    return SECode.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SECode");
                internalValueMap = new Internal.EnumLiteMap<SECode>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SESportResponse.SECode.1
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
                switch (i7) {
                    case 0:
                        return OK;
                    case 1:
                        return BUSY;
                    case 2:
                        return TYPE_NOT_MATCH;
                    case 3:
                        return NO_PERMISSION;
                    case 4:
                        return NOT_SUPPORT;
                    case 5:
                        return LACK_OF_ACCURACY;
                    case 6:
                        return CHARGING;
                    case 7:
                        return LOW_BATTERY;
                    case 8:
                        return SEEK_FAIL;
                    case 9:
                        return SPACE_WILL_BE_FULL;
                    case 10:
                        return UNKNOWN;
                    case 11:
                        return SPACE_IS_FULL;
                    case 12:
                        return DEVICE_IS_SPORTING;
                    case 13:
                        return NORMAL_END;
                    case 14:
                        return SPORT_DURATION_NO_METTING;
                    case 15:
                        return DEVICE_STORAGE_SPACE_FULL;
                    default:
                        return null;
                }
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SESportResponse.getDescriptor().getEnumType(0);
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportResponse");
            DEFAULT_INSTANCE = new SESportResponse();
            PARSER = new AbstractParser<SESportResponse>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SESportResponse.1
                @Override // com.google.protobuf.Parser
                public SESportResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESportResponse.newBuilder();
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

        public /* synthetic */ SESportResponse(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SESportResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SESportResponse_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESportResponse parseDelimitedFrom(InputStream inputStream) {
            return (SESportResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESportResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESportResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESportResponse)) {
                return super.equals(obj);
            }
            SESportResponse sESportResponse = (SESportResponse) obj;
            if (hasCode() != sESportResponse.hasCode()) {
                return false;
            }
            if ((hasCode() && this.code_ != sESportResponse.code_) || hasSportStatus() != sESportResponse.hasSportStatus()) {
                return false;
            }
            if ((hasSportStatus() && !getSportStatus().equals(sESportResponse.getSportStatus())) || hasGpsAccuracy() != sESportResponse.hasGpsAccuracy()) {
                return false;
            }
            if ((!hasGpsAccuracy() || this.gpsAccuracy_ == sESportResponse.gpsAccuracy_) && hasSelectVersion() == sESportResponse.hasSelectVersion()) {
                return (!hasSelectVersion() || getSelectVersion() == sESportResponse.getSelectVersion()) && getUnknownFields().equals(sESportResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
        public SECode getCode() {
            SECode sECodeForNumber = SECode.forNumber(this.code_);
            return sECodeForNumber == null ? SECode.OK : sECodeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SESportResponse_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
        public SEGpsAccuracy getGpsAccuracy() {
            SEGpsAccuracy sEGpsAccuracyForNumber = SEGpsAccuracy.forNumber(this.gpsAccuracy_);
            return sEGpsAccuracyForNumber == null ? SEGpsAccuracy.GPS_LOW : sEGpsAccuracyForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESportResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
        public int getSelectVersion() {
            return this.selectVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.code_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getSportStatus());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.gpsAccuracy_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.selectVersion_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
        public SESportStatus getSportStatus() {
            SESportStatus sESportStatus = this.sportStatus_;
            return sESportStatus == null ? SESportStatus.getDefaultInstance() : sESportStatus;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
        public SESportStatusOrBuilder getSportStatusOrBuilder() {
            SESportStatus sESportStatus = this.sportStatus_;
            return sESportStatus == null ? SESportStatus.getDefaultInstance() : sESportStatus;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
        public boolean hasGpsAccuracy() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
        public boolean hasSelectVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportResponseOrBuilder
        public boolean hasSportStatus() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasSportStatus()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSportStatus().hashCode();
            }
            if (hasGpsAccuracy()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.gpsAccuracy_;
            }
            if (hasSelectVersion()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getSelectVersion();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SESportResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SESportResponse.class, Builder.class);
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
            if (!hasCode()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSportStatus() || getSportStatus().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.code_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSportStatus());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.gpsAccuracy_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.selectVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESportResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.code_ = 0;
            this.gpsAccuracy_ = 0;
            this.selectVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESportResponse sESportResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESportResponse);
        }

        public static SESportResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESportResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESportResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESportResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESportResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESportResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESportResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESportResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SESportResponse() {
            this.selectVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.code_ = 0;
            this.gpsAccuracy_ = 0;
        }

        public static SESportResponse parseFrom(InputStream inputStream) {
            return (SESportResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESportResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESportResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESportResponse parseFrom(CodedInputStream codedInputStream) {
            return (SESportResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESportResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESportResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESportResponseOrBuilder extends MessageOrBuilder {
        SESportResponse.SECode getCode();

        SEGpsAccuracy getGpsAccuracy();

        int getSelectVersion();

        SESportStatus getSportStatus();

        SESportStatusOrBuilder getSportStatusOrBuilder();

        boolean hasCode();

        boolean hasGpsAccuracy();

        boolean hasSelectVersion();

        boolean hasSportStatus();
    }

    public static final class SESportStatus extends GeneratedMessage implements SESportStatusOrBuilder {
        public static final int APP_LAUNCHED_FIELD_NUMBER = 7;
        private static final SESportStatus DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 3;
        private static final Parser<SESportStatus> PARSER;
        public static final int PAUSED_FIELD_NUMBER = 4;
        public static final int SELECT_VERSION_FIELD_NUMBER = 6;
        public static final int SPORT_TYPE_FIELD_NUMBER = 1;
        public static final int STANDALONE_FIELD_NUMBER = 5;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean appLaunched_;
        private int bitField0_;
        private int duration_;
        private byte memoizedIsInitialized;
        private boolean paused_;
        private int selectVersion_;
        private int sportType_;
        private boolean standalone_;
        private int timestamp_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SESportStatus$1 */
        public class AnonymousClass1 extends AbstractParser<SESportStatus> {
            @Override // com.google.protobuf.Parser
            public SESportStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESportStatus.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESportStatusOrBuilder {
            private boolean appLaunched_;
            private int bitField0_;
            private int duration_;
            private boolean paused_;
            private int selectVersion_;
            private int sportType_;
            private boolean standalone_;
            private int timestamp_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SESportStatus sESportStatus) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESportStatus.sportType_ = this.sportType_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sESportStatus.timestamp_ = this.timestamp_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sESportStatus.duration_ = this.duration_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sESportStatus.paused_ = this.paused_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sESportStatus.standalone_ = this.standalone_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sESportStatus.selectVersion_ = this.selectVersion_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sESportStatus.appLaunched_ = this.appLaunched_;
                    i7 |= 64;
                }
                sESportStatus.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SESportStatus_descriptor;
            }

            public Builder clearAppLaunched() {
                this.bitField0_ &= -65;
                this.appLaunched_ = false;
                onChanged();
                return this;
            }

            public Builder clearDuration() {
                this.bitField0_ &= -5;
                this.duration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPaused() {
                this.bitField0_ &= -9;
                this.paused_ = false;
                onChanged();
                return this;
            }

            public Builder clearSelectVersion() {
                this.bitField0_ &= -33;
                this.selectVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSportType() {
                this.bitField0_ &= -2;
                this.sportType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStandalone() {
                this.bitField0_ &= -17;
                this.standalone_ = false;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -3;
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean getAppLaunched() {
                return this.appLaunched_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SESportStatus_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public int getDuration() {
                return this.duration_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean getPaused() {
                return this.paused_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public int getSelectVersion() {
                return this.selectVersion_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public int getSportType() {
                return this.sportType_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean getStandalone() {
                return this.standalone_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean hasAppLaunched() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean hasDuration() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean hasPaused() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean hasSelectVersion() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean hasSportType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean hasStandalone() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SESportStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SESportStatus.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSportType();
            }

            public Builder setAppLaunched(boolean z6) {
                this.appLaunched_ = z6;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDuration(int i7) {
                this.duration_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPaused(boolean z6) {
                this.paused_ = z6;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSelectVersion(int i7) {
                this.selectVersion_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSportType(int i7) {
                this.sportType_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStandalone(boolean z6) {
                this.standalone_ = z6;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTimestamp(int i7) {
                this.timestamp_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESportStatus build() {
                SESportStatus sESportStatusBuildPartial = buildPartial();
                if (sESportStatusBuildPartial.isInitialized()) {
                    return sESportStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESportStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESportStatus buildPartial() {
                SESportStatus sESportStatus = new SESportStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESportStatus);
                }
                onBuilt();
                return sESportStatus;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESportStatus getDefaultInstanceForType() {
                return SESportStatus.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sportType_ = 0;
                this.timestamp_ = 0;
                this.duration_ = 0;
                this.paused_ = false;
                this.standalone_ = false;
                this.selectVersion_ = 0;
                this.appLaunched_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESportStatus) {
                    return mergeFrom((SESportStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SESportStatus sESportStatus) {
                if (sESportStatus == SESportStatus.getDefaultInstance()) {
                    return this;
                }
                if (sESportStatus.hasSportType()) {
                    setSportType(sESportStatus.getSportType());
                }
                if (sESportStatus.hasTimestamp()) {
                    setTimestamp(sESportStatus.getTimestamp());
                }
                if (sESportStatus.hasDuration()) {
                    setDuration(sESportStatus.getDuration());
                }
                if (sESportStatus.hasPaused()) {
                    setPaused(sESportStatus.getPaused());
                }
                if (sESportStatus.hasStandalone()) {
                    setStandalone(sESportStatus.getStandalone());
                }
                if (sESportStatus.hasSelectVersion()) {
                    setSelectVersion(sESportStatus.getSelectVersion());
                }
                if (sESportStatus.hasAppLaunched()) {
                    setAppLaunched(sESportStatus.getAppLaunched());
                }
                mergeUnknownFields(sESportStatus.getUnknownFields());
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
                                    this.sportType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.timestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.duration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.paused_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.standalone_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.selectVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag != 56) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.appLaunched_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportStatus");
            DEFAULT_INSTANCE = new SESportStatus();
            PARSER = new AbstractParser<SESportStatus>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SESportStatus.1
                @Override // com.google.protobuf.Parser
                public SESportStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESportStatus.newBuilder();
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

        public /* synthetic */ SESportStatus(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SESportStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SESportStatus_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESportStatus parseDelimitedFrom(InputStream inputStream) {
            return (SESportStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESportStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESportStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESportStatus)) {
                return super.equals(obj);
            }
            SESportStatus sESportStatus = (SESportStatus) obj;
            if (hasSportType() != sESportStatus.hasSportType()) {
                return false;
            }
            if ((hasSportType() && getSportType() != sESportStatus.getSportType()) || hasTimestamp() != sESportStatus.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != sESportStatus.getTimestamp()) || hasDuration() != sESportStatus.hasDuration()) {
                return false;
            }
            if ((hasDuration() && getDuration() != sESportStatus.getDuration()) || hasPaused() != sESportStatus.hasPaused()) {
                return false;
            }
            if ((hasPaused() && getPaused() != sESportStatus.getPaused()) || hasStandalone() != sESportStatus.hasStandalone()) {
                return false;
            }
            if ((hasStandalone() && getStandalone() != sESportStatus.getStandalone()) || hasSelectVersion() != sESportStatus.hasSelectVersion()) {
                return false;
            }
            if ((!hasSelectVersion() || getSelectVersion() == sESportStatus.getSelectVersion()) && hasAppLaunched() == sESportStatus.hasAppLaunched()) {
                return (!hasAppLaunched() || getAppLaunched() == sESportStatus.getAppLaunched()) && getUnknownFields().equals(sESportStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean getAppLaunched() {
            return this.appLaunched_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SESportStatus_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESportStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean getPaused() {
            return this.paused_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public int getSelectVersion() {
            return this.selectVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sportType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.timestamp_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.duration_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(4, this.paused_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(5, this.standalone_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.selectVersion_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(7, this.appLaunched_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public int getSportType() {
            return this.sportType_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean getStandalone() {
            return this.standalone_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean hasAppLaunched() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean hasDuration() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean hasPaused() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean hasSelectVersion() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean hasSportType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean hasStandalone() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportStatusOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSportType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getSportType();
            }
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTimestamp();
            }
            if (hasDuration()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDuration();
            }
            if (hasPaused()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashBoolean(getPaused());
            }
            if (hasStandalone()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getStandalone());
            }
            if (hasSelectVersion()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getSelectVersion();
            }
            if (hasAppLaunched()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + Internal.hashBoolean(getAppLaunched());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SESportStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SESportStatus.class, Builder.class);
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
            if (hasSportType()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sportType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.timestamp_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.duration_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.paused_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.standalone_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.selectVersion_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.appLaunched_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESportStatus(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.sportType_ = 0;
            this.timestamp_ = 0;
            this.duration_ = 0;
            this.paused_ = false;
            this.standalone_ = false;
            this.selectVersion_ = 0;
            this.appLaunched_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESportStatus sESportStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESportStatus);
        }

        public static SESportStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESportStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESportStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESportStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESportStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESportStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESportStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESportStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESportStatus parseFrom(InputStream inputStream) {
            return (SESportStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESportStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESportStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SESportStatus() {
            this.sportType_ = 0;
            this.timestamp_ = 0;
            this.duration_ = 0;
            this.paused_ = false;
            this.standalone_ = false;
            this.selectVersion_ = 0;
            this.appLaunched_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SESportStatus parseFrom(CodedInputStream codedInputStream) {
            return (SESportStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESportStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESportStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESportStatusOrBuilder extends MessageOrBuilder {
        boolean getAppLaunched();

        int getDuration();

        boolean getPaused();

        int getSelectVersion();

        int getSportType();

        boolean getStandalone();

        int getTimestamp();

        boolean hasAppLaunched();

        boolean hasDuration();

        boolean hasPaused();

        boolean hasSelectVersion();

        boolean hasSportType();

        boolean hasStandalone();

        boolean hasTimestamp();
    }

    public enum SESportType implements ProtocolMessageEnum {
        NONE(0),
        RUN_OUTDOOR(1),
        WALK_OUTDOOR(2),
        RUN_INDOOR(3),
        CLIMBING(4),
        CROSS_COUNTRY(5),
        RIDE_OUTDOOR(6),
        RIDE_INDOOR(7),
        FREE_TRAINING(8),
        SWIM_INDOOR(9),
        SWIM_OUTDOOR(10),
        ELLIPTICAL_MACHINE(11),
        YOGA(12),
        ROWING_MACHINE(13),
        ROPE_SKIPPING(14),
        HIKING_OUTDOOR(15),
        HIGH_INTERVAL_TRAINING(16),
        TRIATHLON(17),
        SAILBOAT(100),
        PADDLE_BOARD(101),
        WATER_POLO(102),
        AQUATIC_SPORT(103),
        SURFING(104),
        CANOEING(105),
        KAYAK_RAFTING(106),
        ROWING(107),
        MOTORBOAT(108),
        WEB_SWIMMING(109),
        DRIVING(110),
        FANCY_SWIMMING(111),
        SNORKELING(112),
        KITE_SURFING(113),
        ROCK_CLIMBING(200),
        SKATE(201),
        ROLLER_SKATING(202),
        PARKOUR(203),
        ATV(204),
        PARAGLIDER(205),
        CLIMBING_MACHINE(300),
        CLIMB_STAIRS(301),
        STEPPER(302),
        CORE_TRAINING(303),
        FLEXIBILITY_TRAINING(304),
        PILATES(305),
        GYMNASTICS(306),
        STRETCH(307),
        STRENGTH_TRAINING(308),
        CROSS_FIT(309),
        AEROBICS(310),
        PHYSICAL_TRAINING(311),
        WALL_BALL(312),
        DUMBBELL_TRAINING(313),
        BARBELL_TRAINING(314),
        WEIGHTLIFTING(315),
        DEADLIFT(316),
        BOBBY_JUMP(317),
        SIT_UPS(318),
        FUNCTIONAL_TRAINING(319),
        UPPER_LIMB_TRAINING(320),
        LOWER_LIMB_TRAINING(321),
        WAIST_TRAINING(322),
        BACK_TRAINING(323),
        SQUARE_DANCE(400),
        BELLY_DANCE(401),
        BALLET(402),
        STREET_DANCE(403),
        ZUMBA(404),
        NATIONAL_DANCE(405),
        JAZZ(406),
        LATIN_DANCE(407),
        BOXING(500),
        WRESTLING(501),
        MARTIAL_ARTS(502),
        TAICHI(503),
        MUAY_THAI(504),
        JUDO(505),
        TAEKWONDO(506),
        KARATE(507),
        FREE_SPARRING(508),
        SWORDSMANSHIP(509),
        FENCING(510),
        FOOTBALL(600),
        BASKETBALL(601),
        VOLLEYBALL(602),
        BASEBALL(603),
        SOFTBALL(604),
        RUGBY(605),
        HOCKEY(606),
        PINGPONG(607),
        BADMINTON(608),
        TENNIS(609),
        CRICKET(610),
        HANDBALL(611),
        BOWLING(612),
        SQUASH(613),
        BILLIARDS(614),
        SHUTTLECOCK(615),
        BEACH_FOOTBALL(616),
        BEACH_VOLLEYBALL(617),
        SEPAK_TAKRAW(618),
        OUTDOOR_SKATING(700),
        CURLING(701),
        SNOW_SPORTS(702),
        SNOWMOBILE(703),
        PUCK(704),
        SNOW_CAR(705),
        SLED(706),
        ARCHERY(800),
        DARTS(801),
        HORSE_RIDING(802),
        TUG_OF_WAR(803),
        HULA_HOOP(804),
        FLY_KITE(805),
        FISHING(806),
        FRISBEE(807),
        EQUESTRIAN(10000),
        TRACK_AND_FIELD(10001),
        RACING_CAR(10002);

        public static final int AEROBICS_VALUE = 310;
        public static final int AQUATIC_SPORT_VALUE = 103;
        public static final int ARCHERY_VALUE = 800;
        public static final int ATV_VALUE = 204;
        public static final int BACK_TRAINING_VALUE = 323;
        public static final int BADMINTON_VALUE = 608;
        public static final int BALLET_VALUE = 402;
        public static final int BARBELL_TRAINING_VALUE = 314;
        public static final int BASEBALL_VALUE = 603;
        public static final int BASKETBALL_VALUE = 601;
        public static final int BEACH_FOOTBALL_VALUE = 616;
        public static final int BEACH_VOLLEYBALL_VALUE = 617;
        public static final int BELLY_DANCE_VALUE = 401;
        public static final int BILLIARDS_VALUE = 614;
        public static final int BOBBY_JUMP_VALUE = 317;
        public static final int BOWLING_VALUE = 612;
        public static final int BOXING_VALUE = 500;
        public static final int CANOEING_VALUE = 105;
        public static final int CLIMBING_MACHINE_VALUE = 300;
        public static final int CLIMBING_VALUE = 4;
        public static final int CLIMB_STAIRS_VALUE = 301;
        public static final int CORE_TRAINING_VALUE = 303;
        public static final int CRICKET_VALUE = 610;
        public static final int CROSS_COUNTRY_VALUE = 5;
        public static final int CROSS_FIT_VALUE = 309;
        public static final int CURLING_VALUE = 701;
        public static final int DARTS_VALUE = 801;
        public static final int DEADLIFT_VALUE = 316;
        public static final int DRIVING_VALUE = 110;
        public static final int DUMBBELL_TRAINING_VALUE = 313;
        public static final int ELLIPTICAL_MACHINE_VALUE = 11;
        public static final int EQUESTRIAN_VALUE = 10000;
        public static final int FANCY_SWIMMING_VALUE = 111;
        public static final int FENCING_VALUE = 510;
        public static final int FISHING_VALUE = 806;
        public static final int FLEXIBILITY_TRAINING_VALUE = 304;
        public static final int FLY_KITE_VALUE = 805;
        public static final int FOOTBALL_VALUE = 600;
        public static final int FREE_SPARRING_VALUE = 508;
        public static final int FREE_TRAINING_VALUE = 8;
        public static final int FRISBEE_VALUE = 807;
        public static final int FUNCTIONAL_TRAINING_VALUE = 319;
        public static final int GYMNASTICS_VALUE = 306;
        public static final int HANDBALL_VALUE = 611;
        public static final int HIGH_INTERVAL_TRAINING_VALUE = 16;
        public static final int HIKING_OUTDOOR_VALUE = 15;
        public static final int HOCKEY_VALUE = 606;
        public static final int HORSE_RIDING_VALUE = 802;
        public static final int HULA_HOOP_VALUE = 804;
        public static final int JAZZ_VALUE = 406;
        public static final int JUDO_VALUE = 505;
        public static final int KARATE_VALUE = 507;
        public static final int KAYAK_RAFTING_VALUE = 106;
        public static final int KITE_SURFING_VALUE = 113;
        public static final int LATIN_DANCE_VALUE = 407;
        public static final int LOWER_LIMB_TRAINING_VALUE = 321;
        public static final int MARTIAL_ARTS_VALUE = 502;
        public static final int MOTORBOAT_VALUE = 108;
        public static final int MUAY_THAI_VALUE = 504;
        public static final int NATIONAL_DANCE_VALUE = 405;
        public static final int NONE_VALUE = 0;
        public static final int OUTDOOR_SKATING_VALUE = 700;
        public static final int PADDLE_BOARD_VALUE = 101;
        public static final int PARAGLIDER_VALUE = 205;
        public static final int PARKOUR_VALUE = 203;
        public static final int PHYSICAL_TRAINING_VALUE = 311;
        public static final int PILATES_VALUE = 305;
        public static final int PINGPONG_VALUE = 607;
        public static final int PUCK_VALUE = 704;
        public static final int RACING_CAR_VALUE = 10002;
        public static final int RIDE_INDOOR_VALUE = 7;
        public static final int RIDE_OUTDOOR_VALUE = 6;
        public static final int ROCK_CLIMBING_VALUE = 200;
        public static final int ROLLER_SKATING_VALUE = 202;
        public static final int ROPE_SKIPPING_VALUE = 14;
        public static final int ROWING_MACHINE_VALUE = 13;
        public static final int ROWING_VALUE = 107;
        public static final int RUGBY_VALUE = 605;
        public static final int RUN_INDOOR_VALUE = 3;
        public static final int RUN_OUTDOOR_VALUE = 1;
        public static final int SAILBOAT_VALUE = 100;
        public static final int SEPAK_TAKRAW_VALUE = 618;
        public static final int SHUTTLECOCK_VALUE = 615;
        public static final int SIT_UPS_VALUE = 318;
        public static final int SKATE_VALUE = 201;
        public static final int SLED_VALUE = 706;
        public static final int SNORKELING_VALUE = 112;
        public static final int SNOWMOBILE_VALUE = 703;
        public static final int SNOW_CAR_VALUE = 705;
        public static final int SNOW_SPORTS_VALUE = 702;
        public static final int SOFTBALL_VALUE = 604;
        public static final int SQUARE_DANCE_VALUE = 400;
        public static final int SQUASH_VALUE = 613;
        public static final int STEPPER_VALUE = 302;
        public static final int STREET_DANCE_VALUE = 403;
        public static final int STRENGTH_TRAINING_VALUE = 308;
        public static final int STRETCH_VALUE = 307;
        public static final int SURFING_VALUE = 104;
        public static final int SWIM_INDOOR_VALUE = 9;
        public static final int SWIM_OUTDOOR_VALUE = 10;
        public static final int SWORDSMANSHIP_VALUE = 509;
        public static final int TAEKWONDO_VALUE = 506;
        public static final int TAICHI_VALUE = 503;
        public static final int TENNIS_VALUE = 609;
        public static final int TRACK_AND_FIELD_VALUE = 10001;
        public static final int TRIATHLON_VALUE = 17;
        public static final int TUG_OF_WAR_VALUE = 803;
        public static final int UPPER_LIMB_TRAINING_VALUE = 320;
        private static final SESportType[] VALUES;
        public static final int VOLLEYBALL_VALUE = 602;
        public static final int WAIST_TRAINING_VALUE = 322;
        public static final int WALK_OUTDOOR_VALUE = 2;
        public static final int WALL_BALL_VALUE = 312;
        public static final int WATER_POLO_VALUE = 102;
        public static final int WEB_SWIMMING_VALUE = 109;
        public static final int WEIGHTLIFTING_VALUE = 315;
        public static final int WRESTLING_VALUE = 501;
        public static final int YOGA_VALUE = 12;
        public static final int ZUMBA_VALUE = 404;
        private static final Internal.EnumLiteMap<SESportType> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SESportType$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SESportType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SESportType findValueByNumber(int i7) {
                return SESportType.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportType");
            internalValueMap = new Internal.EnumLiteMap<SESportType>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SESportType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESportType findValueByNumber(int i7) {
                    return SESportType.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SESportType(int i7) {
            this.value = i7;
        }

        public static SESportType forNumber(int i7) {
            switch (i7) {
                case 0:
                    return NONE;
                case 1:
                    return RUN_OUTDOOR;
                case 2:
                    return WALK_OUTDOOR;
                case 3:
                    return RUN_INDOOR;
                case 4:
                    return CLIMBING;
                case 5:
                    return CROSS_COUNTRY;
                case 6:
                    return RIDE_OUTDOOR;
                case 7:
                    return RIDE_INDOOR;
                case 8:
                    return FREE_TRAINING;
                case 9:
                    return SWIM_INDOOR;
                case 10:
                    return SWIM_OUTDOOR;
                case 11:
                    return ELLIPTICAL_MACHINE;
                case 12:
                    return YOGA;
                case 13:
                    return ROWING_MACHINE;
                case 14:
                    return ROPE_SKIPPING;
                case 15:
                    return HIKING_OUTDOOR;
                case 16:
                    return HIGH_INTERVAL_TRAINING;
                case 17:
                    return TRIATHLON;
                default:
                    switch (i7) {
                        case 100:
                            return SAILBOAT;
                        case 101:
                            return PADDLE_BOARD;
                        case 102:
                            return WATER_POLO;
                        case 103:
                            return AQUATIC_SPORT;
                        case 104:
                            return SURFING;
                        case 105:
                            return CANOEING;
                        case 106:
                            return KAYAK_RAFTING;
                        case 107:
                            return ROWING;
                        case 108:
                            return MOTORBOAT;
                        case 109:
                            return WEB_SWIMMING;
                        case 110:
                            return DRIVING;
                        case 111:
                            return FANCY_SWIMMING;
                        case 112:
                            return SNORKELING;
                        case 113:
                            return KITE_SURFING;
                        default:
                            switch (i7) {
                                case 200:
                                    return ROCK_CLIMBING;
                                case 201:
                                    return SKATE;
                                case 202:
                                    return ROLLER_SKATING;
                                case 203:
                                    return PARKOUR;
                                case 204:
                                    return ATV;
                                case 205:
                                    return PARAGLIDER;
                                default:
                                    switch (i7) {
                                        case 300:
                                            return CLIMBING_MACHINE;
                                        case 301:
                                            return CLIMB_STAIRS;
                                        case 302:
                                            return STEPPER;
                                        case 303:
                                            return CORE_TRAINING;
                                        case 304:
                                            return FLEXIBILITY_TRAINING;
                                        case 305:
                                            return PILATES;
                                        case 306:
                                            return GYMNASTICS;
                                        case 307:
                                            return STRETCH;
                                        case 308:
                                            return STRENGTH_TRAINING;
                                        case 309:
                                            return CROSS_FIT;
                                        case 310:
                                            return AEROBICS;
                                        case 311:
                                            return PHYSICAL_TRAINING;
                                        case 312:
                                            return WALL_BALL;
                                        case 313:
                                            return DUMBBELL_TRAINING;
                                        case 314:
                                            return BARBELL_TRAINING;
                                        case 315:
                                            return WEIGHTLIFTING;
                                        case 316:
                                            return DEADLIFT;
                                        case 317:
                                            return BOBBY_JUMP;
                                        case 318:
                                            return SIT_UPS;
                                        case 319:
                                            return FUNCTIONAL_TRAINING;
                                        case 320:
                                            return UPPER_LIMB_TRAINING;
                                        case 321:
                                            return LOWER_LIMB_TRAINING;
                                        case 322:
                                            return WAIST_TRAINING;
                                        case 323:
                                            return BACK_TRAINING;
                                        default:
                                            switch (i7) {
                                                case 400:
                                                    return SQUARE_DANCE;
                                                case 401:
                                                    return BELLY_DANCE;
                                                case 402:
                                                    return BALLET;
                                                case 403:
                                                    return STREET_DANCE;
                                                case 404:
                                                    return ZUMBA;
                                                case 405:
                                                    return NATIONAL_DANCE;
                                                case 406:
                                                    return JAZZ;
                                                case 407:
                                                    return LATIN_DANCE;
                                                default:
                                                    switch (i7) {
                                                        case 500:
                                                            return BOXING;
                                                        case 501:
                                                            return WRESTLING;
                                                        case 502:
                                                            return MARTIAL_ARTS;
                                                        case 503:
                                                            return TAICHI;
                                                        case 504:
                                                            return MUAY_THAI;
                                                        case 505:
                                                            return JUDO;
                                                        case 506:
                                                            return TAEKWONDO;
                                                        case 507:
                                                            return KARATE;
                                                        case 508:
                                                            return FREE_SPARRING;
                                                        case 509:
                                                            return SWORDSMANSHIP;
                                                        case 510:
                                                            return FENCING;
                                                        default:
                                                            switch (i7) {
                                                                case 600:
                                                                    return FOOTBALL;
                                                                case 601:
                                                                    return BASKETBALL;
                                                                case 602:
                                                                    return VOLLEYBALL;
                                                                case 603:
                                                                    return BASEBALL;
                                                                case 604:
                                                                    return SOFTBALL;
                                                                case 605:
                                                                    return RUGBY;
                                                                case 606:
                                                                    return HOCKEY;
                                                                case 607:
                                                                    return PINGPONG;
                                                                case 608:
                                                                    return BADMINTON;
                                                                case 609:
                                                                    return TENNIS;
                                                                case 610:
                                                                    return CRICKET;
                                                                case 611:
                                                                    return HANDBALL;
                                                                case 612:
                                                                    return BOWLING;
                                                                case 613:
                                                                    return SQUASH;
                                                                case 614:
                                                                    return BILLIARDS;
                                                                case 615:
                                                                    return SHUTTLECOCK;
                                                                case 616:
                                                                    return BEACH_FOOTBALL;
                                                                case 617:
                                                                    return BEACH_VOLLEYBALL;
                                                                case 618:
                                                                    return SEPAK_TAKRAW;
                                                                default:
                                                                    switch (i7) {
                                                                        case 700:
                                                                            return OUTDOOR_SKATING;
                                                                        case 701:
                                                                            return CURLING;
                                                                        case 702:
                                                                            return SNOW_SPORTS;
                                                                        case 703:
                                                                            return SNOWMOBILE;
                                                                        case 704:
                                                                            return PUCK;
                                                                        case 705:
                                                                            return SNOW_CAR;
                                                                        case 706:
                                                                            return SLED;
                                                                        default:
                                                                            switch (i7) {
                                                                                case 800:
                                                                                    return ARCHERY;
                                                                                case 801:
                                                                                    return DARTS;
                                                                                case 802:
                                                                                    return HORSE_RIDING;
                                                                                case 803:
                                                                                    return TUG_OF_WAR;
                                                                                case 804:
                                                                                    return HULA_HOOP;
                                                                                case 805:
                                                                                    return FLY_KITE;
                                                                                case 806:
                                                                                    return FISHING;
                                                                                case 807:
                                                                                    return FRISBEE;
                                                                                default:
                                                                                    switch (i7) {
                                                                                        case 10000:
                                                                                            return EQUESTRIAN;
                                                                                        case 10001:
                                                                                            return TRACK_AND_FIELD;
                                                                                        case 10002:
                                                                                            return RACING_CAR;
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

        public static Descriptors.EnumDescriptor getDescriptor() {
            return SportingProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SESportType> internalGetValueMap() {
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
        public static SESportType valueOf(int i7) {
            return forNumber(i7);
        }

        public static SESportType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SESporting extends GeneratedMessage implements SESportingOrBuilder {
        public static final int APP_MESSAGE_TYPE_FIELD_NUMBER = 8;
        public static final int AUTO_SPORT_DATA_LIST_FIELD_NUMBER = 9;
        private static final SESporting DEFAULT_INSTANCE;
        public static final int ECG_CALIBRATION_DATA_FIELD_NUMBER = 7;
        public static final int ECG_DATA_FIELD_NUMBER = 6;
        private static final Parser<SESporting> PARSER;
        public static final int PHONE_SPORT_DATA_FIELD_NUMBER = 4;
        public static final int RING_SPORT_PARAM_DATA_FIELD_NUMBER = 10;
        public static final int SPORT_REQUEST_FIELD_NUMBER = 2;
        public static final int SPORT_RESPONSE_FIELD_NUMBER = 3;
        public static final int SPORT_STATUS_FIELD_NUMBER = 1;
        public static final int WEAR_SPORT_DATA_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SESporting$1 */
        public class AnonymousClass1 extends AbstractParser<SESporting> {
            @Override // com.google.protobuf.Parser
            public SESporting parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESporting.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESportingOrBuilder {
            private SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> appMessageTypeBuilder_;
            private SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> autoSportDataListBuilder_;
            private int bitField0_;
            private SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> ecgCalibrationDataBuilder_;
            private SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> ecgDataBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> phoneSportDataBuilder_;
            private SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> ringSportParamDataBuilder_;
            private SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> sportRequestBuilder_;
            private SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> sportResponseBuilder_;
            private SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> sportStatusBuilder_;
            private SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> wearSportDataBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SESporting sESporting) {
            }

            private void buildPartialOneofs(SESporting sESporting) {
                SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> singleFieldBuilder6;
                SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> singleFieldBuilder7;
                SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> singleFieldBuilder8;
                SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> singleFieldBuilder9;
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder10;
                int i7 = this.payloadCase_;
                sESporting.payloadCase_ = i7;
                sESporting.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder10 = this.sportStatusBuilder_) != null) {
                    sESporting.payload_ = singleFieldBuilder10.build();
                }
                if (this.payloadCase_ == 2 && (singleFieldBuilder9 = this.sportRequestBuilder_) != null) {
                    sESporting.payload_ = singleFieldBuilder9.build();
                }
                if (this.payloadCase_ == 3 && (singleFieldBuilder8 = this.sportResponseBuilder_) != null) {
                    sESporting.payload_ = singleFieldBuilder8.build();
                }
                if (this.payloadCase_ == 4 && (singleFieldBuilder7 = this.phoneSportDataBuilder_) != null) {
                    sESporting.payload_ = singleFieldBuilder7.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder6 = this.wearSportDataBuilder_) != null) {
                    sESporting.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder5 = this.ecgDataBuilder_) != null) {
                    sESporting.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder4 = this.ecgCalibrationDataBuilder_) != null) {
                    sESporting.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 8 && (singleFieldBuilder3 = this.appMessageTypeBuilder_) != null) {
                    sESporting.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 9 && (singleFieldBuilder2 = this.autoSportDataListBuilder_) != null) {
                    sESporting.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 10 || (singleFieldBuilder = this.ringSportParamDataBuilder_) == null) {
                    return;
                }
                sESporting.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SESporting_descriptor;
            }

            private SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> internalGetAppMessageTypeFieldBuilder() {
                if (this.appMessageTypeBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SEAppMessageType.getDefaultInstance();
                    }
                    this.appMessageTypeBuilder_ = new SingleFieldBuilder<>((SEAppMessageType) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.appMessageTypeBuilder_;
            }

            private SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> internalGetAutoSportDataListFieldBuilder() {
                if (this.autoSportDataListBuilder_ == null) {
                    if (this.payloadCase_ != 9) {
                        this.payload_ = SEAutoSportData.SEList.getDefaultInstance();
                    }
                    this.autoSportDataListBuilder_ = new SingleFieldBuilder<>((SEAutoSportData.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 9;
                onChanged();
                return this.autoSportDataListBuilder_;
            }

            private SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> internalGetEcgCalibrationDataFieldBuilder() {
                if (this.ecgCalibrationDataBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SEEcgCalibrationData.getDefaultInstance();
                    }
                    this.ecgCalibrationDataBuilder_ = new SingleFieldBuilder<>((SEEcgCalibrationData) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.ecgCalibrationDataBuilder_;
            }

            private SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> internalGetEcgDataFieldBuilder() {
                if (this.ecgDataBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SEEcgData.getDefaultInstance();
                    }
                    this.ecgDataBuilder_ = new SingleFieldBuilder<>((SEEcgData) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.ecgDataBuilder_;
            }

            private SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> internalGetPhoneSportDataFieldBuilder() {
                if (this.phoneSportDataBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = SEPhoneSportData.getDefaultInstance();
                    }
                    this.phoneSportDataBuilder_ = new SingleFieldBuilder<>((SEPhoneSportData) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.phoneSportDataBuilder_;
            }

            private SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> internalGetRingSportParamDataFieldBuilder() {
                if (this.ringSportParamDataBuilder_ == null) {
                    if (this.payloadCase_ != 10) {
                        this.payload_ = SERingSportStatusData.getDefaultInstance();
                    }
                    this.ringSportParamDataBuilder_ = new SingleFieldBuilder<>((SERingSportStatusData) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 10;
                onChanged();
                return this.ringSportParamDataBuilder_;
            }

            private SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> internalGetSportRequestFieldBuilder() {
                if (this.sportRequestBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SESportRequest.getDefaultInstance();
                    }
                    this.sportRequestBuilder_ = new SingleFieldBuilder<>((SESportRequest) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.sportRequestBuilder_;
            }

            private SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> internalGetSportResponseFieldBuilder() {
                if (this.sportResponseBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = SESportResponse.getDefaultInstance();
                    }
                    this.sportResponseBuilder_ = new SingleFieldBuilder<>((SESportResponse) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.sportResponseBuilder_;
            }

            private SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> internalGetSportStatusFieldBuilder() {
                if (this.sportStatusBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SESportStatus.getDefaultInstance();
                    }
                    this.sportStatusBuilder_ = new SingleFieldBuilder<>((SESportStatus) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.sportStatusBuilder_;
            }

            private SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> internalGetWearSportDataFieldBuilder() {
                if (this.wearSportDataBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SEWearSportData.getDefaultInstance();
                    }
                    this.wearSportDataBuilder_ = new SingleFieldBuilder<>((SEWearSportData) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.wearSportDataBuilder_;
            }

            public Builder clearAppMessageType() {
                SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> singleFieldBuilder = this.appMessageTypeBuilder_;
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

            public Builder clearAutoSportDataList() {
                SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> singleFieldBuilder = this.autoSportDataListBuilder_;
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

            public Builder clearEcgCalibrationData() {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
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

            public Builder clearEcgData() {
                SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> singleFieldBuilder = this.ecgDataBuilder_;
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

            public Builder clearPhoneSportData() {
                SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> singleFieldBuilder = this.phoneSportDataBuilder_;
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

            public Builder clearRingSportParamData() {
                SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> singleFieldBuilder = this.ringSportParamDataBuilder_;
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

            public Builder clearSportRequest() {
                SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> singleFieldBuilder = this.sportRequestBuilder_;
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

            public Builder clearSportResponse() {
                SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> singleFieldBuilder = this.sportResponseBuilder_;
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

            public Builder clearSportStatus() {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
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

            public Builder clearWearSportData() {
                SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> singleFieldBuilder = this.wearSportDataBuilder_;
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

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEAppMessageType getAppMessageType() {
                SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> singleFieldBuilder = this.appMessageTypeBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SEAppMessageType) this.payload_ : SEAppMessageType.getDefaultInstance() : this.payloadCase_ == 8 ? (SEAppMessageType) singleFieldBuilder.getMessage() : SEAppMessageType.getDefaultInstance();
            }

            public SEAppMessageType.Builder getAppMessageTypeBuilder() {
                return (SEAppMessageType.Builder) internalGetAppMessageTypeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEAppMessageTypeOrBuilder getAppMessageTypeOrBuilder() {
                SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.appMessageTypeBuilder_) == null) ? i7 == 8 ? (SEAppMessageType) this.payload_ : SEAppMessageType.getDefaultInstance() : (SEAppMessageTypeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEAutoSportData.SEList getAutoSportDataList() {
                SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> singleFieldBuilder = this.autoSportDataListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 9 ? (SEAutoSportData.SEList) this.payload_ : SEAutoSportData.SEList.getDefaultInstance() : this.payloadCase_ == 9 ? (SEAutoSportData.SEList) singleFieldBuilder.getMessage() : SEAutoSportData.SEList.getDefaultInstance();
            }

            public SEAutoSportData.SEList.Builder getAutoSportDataListBuilder() {
                return (SEAutoSportData.SEList.Builder) internalGetAutoSportDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEAutoSportData.SEListOrBuilder getAutoSportDataListOrBuilder() {
                SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilder = this.autoSportDataListBuilder_) == null) ? i7 == 9 ? (SEAutoSportData.SEList) this.payload_ : SEAutoSportData.SEList.getDefaultInstance() : (SEAutoSportData.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SESporting_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEEcgCalibrationData getEcgCalibrationData() {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SEEcgCalibrationData) this.payload_ : SEEcgCalibrationData.getDefaultInstance() : this.payloadCase_ == 7 ? (SEEcgCalibrationData) singleFieldBuilder.getMessage() : SEEcgCalibrationData.getDefaultInstance();
            }

            public SEEcgCalibrationData.Builder getEcgCalibrationDataBuilder() {
                return (SEEcgCalibrationData.Builder) internalGetEcgCalibrationDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEEcgCalibrationDataOrBuilder getEcgCalibrationDataOrBuilder() {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.ecgCalibrationDataBuilder_) == null) ? i7 == 7 ? (SEEcgCalibrationData) this.payload_ : SEEcgCalibrationData.getDefaultInstance() : (SEEcgCalibrationDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEEcgData getEcgData() {
                SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> singleFieldBuilder = this.ecgDataBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SEEcgData) this.payload_ : SEEcgData.getDefaultInstance() : this.payloadCase_ == 6 ? (SEEcgData) singleFieldBuilder.getMessage() : SEEcgData.getDefaultInstance();
            }

            public SEEcgData.Builder getEcgDataBuilder() {
                return (SEEcgData.Builder) internalGetEcgDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEEcgDataOrBuilder getEcgDataOrBuilder() {
                SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.ecgDataBuilder_) == null) ? i7 == 6 ? (SEEcgData) this.payload_ : SEEcgData.getDefaultInstance() : (SEEcgDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEPhoneSportData getPhoneSportData() {
                SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> singleFieldBuilder = this.phoneSportDataBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (SEPhoneSportData) this.payload_ : SEPhoneSportData.getDefaultInstance() : this.payloadCase_ == 4 ? (SEPhoneSportData) singleFieldBuilder.getMessage() : SEPhoneSportData.getDefaultInstance();
            }

            public SEPhoneSportData.Builder getPhoneSportDataBuilder() {
                return (SEPhoneSportData.Builder) internalGetPhoneSportDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEPhoneSportDataOrBuilder getPhoneSportDataOrBuilder() {
                SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.phoneSportDataBuilder_) == null) ? i7 == 4 ? (SEPhoneSportData) this.payload_ : SEPhoneSportData.getDefaultInstance() : (SEPhoneSportDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SERingSportStatusData getRingSportParamData() {
                SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> singleFieldBuilder = this.ringSportParamDataBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 10 ? (SERingSportStatusData) this.payload_ : SERingSportStatusData.getDefaultInstance() : this.payloadCase_ == 10 ? (SERingSportStatusData) singleFieldBuilder.getMessage() : SERingSportStatusData.getDefaultInstance();
            }

            public SERingSportStatusData.Builder getRingSportParamDataBuilder() {
                return (SERingSportStatusData.Builder) internalGetRingSportParamDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SERingSportStatusDataOrBuilder getRingSportParamDataOrBuilder() {
                SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 10 || (singleFieldBuilder = this.ringSportParamDataBuilder_) == null) ? i7 == 10 ? (SERingSportStatusData) this.payload_ : SERingSportStatusData.getDefaultInstance() : (SERingSportStatusDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SESportRequest getSportRequest() {
                SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> singleFieldBuilder = this.sportRequestBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SESportRequest) this.payload_ : SESportRequest.getDefaultInstance() : this.payloadCase_ == 2 ? (SESportRequest) singleFieldBuilder.getMessage() : SESportRequest.getDefaultInstance();
            }

            public SESportRequest.Builder getSportRequestBuilder() {
                return (SESportRequest.Builder) internalGetSportRequestFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SESportRequestOrBuilder getSportRequestOrBuilder() {
                SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.sportRequestBuilder_) == null) ? i7 == 2 ? (SESportRequest) this.payload_ : SESportRequest.getDefaultInstance() : (SESportRequestOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SESportResponse getSportResponse() {
                SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> singleFieldBuilder = this.sportResponseBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (SESportResponse) this.payload_ : SESportResponse.getDefaultInstance() : this.payloadCase_ == 3 ? (SESportResponse) singleFieldBuilder.getMessage() : SESportResponse.getDefaultInstance();
            }

            public SESportResponse.Builder getSportResponseBuilder() {
                return (SESportResponse.Builder) internalGetSportResponseFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SESportResponseOrBuilder getSportResponseOrBuilder() {
                SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.sportResponseBuilder_) == null) ? i7 == 3 ? (SESportResponse) this.payload_ : SESportResponse.getDefaultInstance() : (SESportResponseOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SESportStatus getSportStatus() {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SESportStatus) this.payload_ : SESportStatus.getDefaultInstance() : this.payloadCase_ == 1 ? (SESportStatus) singleFieldBuilder.getMessage() : SESportStatus.getDefaultInstance();
            }

            public SESportStatus.Builder getSportStatusBuilder() {
                return (SESportStatus.Builder) internalGetSportStatusFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SESportStatusOrBuilder getSportStatusOrBuilder() {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.sportStatusBuilder_) == null) ? i7 == 1 ? (SESportStatus) this.payload_ : SESportStatus.getDefaultInstance() : (SESportStatusOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEWearSportData getWearSportData() {
                SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> singleFieldBuilder = this.wearSportDataBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SEWearSportData) this.payload_ : SEWearSportData.getDefaultInstance() : this.payloadCase_ == 5 ? (SEWearSportData) singleFieldBuilder.getMessage() : SEWearSportData.getDefaultInstance();
            }

            public SEWearSportData.Builder getWearSportDataBuilder() {
                return (SEWearSportData.Builder) internalGetWearSportDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public SEWearSportDataOrBuilder getWearSportDataOrBuilder() {
                SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.wearSportDataBuilder_) == null) ? i7 == 5 ? (SEWearSportData) this.payload_ : SEWearSportData.getDefaultInstance() : (SEWearSportDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasAppMessageType() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasAutoSportDataList() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasEcgCalibrationData() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasEcgData() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasPhoneSportData() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasRingSportParamData() {
                return this.payloadCase_ == 10;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasSportRequest() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasSportResponse() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasSportStatus() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
            public boolean hasWearSportData() {
                return this.payloadCase_ == 5;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SESporting_fieldAccessorTable.ensureFieldAccessorsInitialized(SESporting.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSportStatus() && !getSportStatus().isInitialized()) {
                    return false;
                }
                if (hasSportRequest() && !getSportRequest().isInitialized()) {
                    return false;
                }
                if (hasSportResponse() && !getSportResponse().isInitialized()) {
                    return false;
                }
                if (hasPhoneSportData() && !getPhoneSportData().isInitialized()) {
                    return false;
                }
                if (hasWearSportData() && !getWearSportData().isInitialized()) {
                    return false;
                }
                if (hasEcgData() && !getEcgData().isInitialized()) {
                    return false;
                }
                if (!hasEcgCalibrationData() || getEcgCalibrationData().isInitialized()) {
                    return !hasAppMessageType() || getAppMessageType().isInitialized();
                }
                return false;
            }

            public Builder mergeAppMessageType(SEAppMessageType sEAppMessageType) {
                SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> singleFieldBuilder = this.appMessageTypeBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SEAppMessageType.getDefaultInstance()) {
                        this.payload_ = sEAppMessageType;
                    } else {
                        this.payload_ = SEAppMessageType.newBuilder((SEAppMessageType) this.payload_).mergeFrom(sEAppMessageType).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(sEAppMessageType);
                } else {
                    singleFieldBuilder.setMessage(sEAppMessageType);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeAutoSportDataList(SEAutoSportData.SEList sEList) {
                SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> singleFieldBuilder = this.autoSportDataListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 9 || this.payload_ == SEAutoSportData.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEAutoSportData.SEList.newBuilder((SEAutoSportData.SEList) this.payload_).mergeFrom(sEList).buildPartial();
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

            public Builder mergeEcgCalibrationData(SEEcgCalibrationData sEEcgCalibrationData) {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SEEcgCalibrationData.getDefaultInstance()) {
                        this.payload_ = sEEcgCalibrationData;
                    } else {
                        this.payload_ = SEEcgCalibrationData.newBuilder((SEEcgCalibrationData) this.payload_).mergeFrom(sEEcgCalibrationData).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEEcgCalibrationData);
                } else {
                    singleFieldBuilder.setMessage(sEEcgCalibrationData);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeEcgData(SEEcgData sEEcgData) {
                SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> singleFieldBuilder = this.ecgDataBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SEEcgData.getDefaultInstance()) {
                        this.payload_ = sEEcgData;
                    } else {
                        this.payload_ = SEEcgData.newBuilder((SEEcgData) this.payload_).mergeFrom(sEEcgData).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEEcgData);
                } else {
                    singleFieldBuilder.setMessage(sEEcgData);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergePhoneSportData(SEPhoneSportData sEPhoneSportData) {
                SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> singleFieldBuilder = this.phoneSportDataBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == SEPhoneSportData.getDefaultInstance()) {
                        this.payload_ = sEPhoneSportData;
                    } else {
                        this.payload_ = SEPhoneSportData.newBuilder((SEPhoneSportData) this.payload_).mergeFrom(sEPhoneSportData).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(sEPhoneSportData);
                } else {
                    singleFieldBuilder.setMessage(sEPhoneSportData);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeRingSportParamData(SERingSportStatusData sERingSportStatusData) {
                SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> singleFieldBuilder = this.ringSportParamDataBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 10 || this.payload_ == SERingSportStatusData.getDefaultInstance()) {
                        this.payload_ = sERingSportStatusData;
                    } else {
                        this.payload_ = SERingSportStatusData.newBuilder((SERingSportStatusData) this.payload_).mergeFrom(sERingSportStatusData).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 10) {
                    singleFieldBuilder.mergeFrom(sERingSportStatusData);
                } else {
                    singleFieldBuilder.setMessage(sERingSportStatusData);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder mergeSportRequest(SESportRequest sESportRequest) {
                SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> singleFieldBuilder = this.sportRequestBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SESportRequest.getDefaultInstance()) {
                        this.payload_ = sESportRequest;
                    } else {
                        this.payload_ = SESportRequest.newBuilder((SESportRequest) this.payload_).mergeFrom(sESportRequest).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(sESportRequest);
                } else {
                    singleFieldBuilder.setMessage(sESportRequest);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeSportResponse(SESportResponse sESportResponse) {
                SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> singleFieldBuilder = this.sportResponseBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == SESportResponse.getDefaultInstance()) {
                        this.payload_ = sESportResponse;
                    } else {
                        this.payload_ = SESportResponse.newBuilder((SESportResponse) this.payload_).mergeFrom(sESportResponse).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(sESportResponse);
                } else {
                    singleFieldBuilder.setMessage(sESportResponse);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeSportStatus(SESportStatus sESportStatus) {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SESportStatus.getDefaultInstance()) {
                        this.payload_ = sESportStatus;
                    } else {
                        this.payload_ = SESportStatus.newBuilder((SESportStatus) this.payload_).mergeFrom(sESportStatus).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sESportStatus);
                } else {
                    singleFieldBuilder.setMessage(sESportStatus);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeWearSportData(SEWearSportData sEWearSportData) {
                SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> singleFieldBuilder = this.wearSportDataBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SEWearSportData.getDefaultInstance()) {
                        this.payload_ = sEWearSportData;
                    } else {
                        this.payload_ = SEWearSportData.newBuilder((SEWearSportData) this.payload_).mergeFrom(sEWearSportData).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sEWearSportData);
                } else {
                    singleFieldBuilder.setMessage(sEWearSportData);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setAppMessageType(SEAppMessageType sEAppMessageType) {
                SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> singleFieldBuilder = this.appMessageTypeBuilder_;
                if (singleFieldBuilder == null) {
                    sEAppMessageType.getClass();
                    this.payload_ = sEAppMessageType;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEAppMessageType);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setAutoSportDataList(SEAutoSportData.SEList sEList) {
                SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> singleFieldBuilder = this.autoSportDataListBuilder_;
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

            public Builder setEcgCalibrationData(SEEcgCalibrationData sEEcgCalibrationData) {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder == null) {
                    sEEcgCalibrationData.getClass();
                    this.payload_ = sEEcgCalibrationData;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEEcgCalibrationData);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setEcgData(SEEcgData sEEcgData) {
                SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> singleFieldBuilder = this.ecgDataBuilder_;
                if (singleFieldBuilder == null) {
                    sEEcgData.getClass();
                    this.payload_ = sEEcgData;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEEcgData);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setPhoneSportData(SEPhoneSportData sEPhoneSportData) {
                SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> singleFieldBuilder = this.phoneSportDataBuilder_;
                if (singleFieldBuilder == null) {
                    sEPhoneSportData.getClass();
                    this.payload_ = sEPhoneSportData;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEPhoneSportData);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setRingSportParamData(SERingSportStatusData sERingSportStatusData) {
                SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> singleFieldBuilder = this.ringSportParamDataBuilder_;
                if (singleFieldBuilder == null) {
                    sERingSportStatusData.getClass();
                    this.payload_ = sERingSportStatusData;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sERingSportStatusData);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setSportRequest(SESportRequest sESportRequest) {
                SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> singleFieldBuilder = this.sportRequestBuilder_;
                if (singleFieldBuilder == null) {
                    sESportRequest.getClass();
                    this.payload_ = sESportRequest;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESportRequest);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setSportResponse(SESportResponse sESportResponse) {
                SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> singleFieldBuilder = this.sportResponseBuilder_;
                if (singleFieldBuilder == null) {
                    sESportResponse.getClass();
                    this.payload_ = sESportResponse;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESportResponse);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setSportStatus(SESportStatus sESportStatus) {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder == null) {
                    sESportStatus.getClass();
                    this.payload_ = sESportStatus;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESportStatus);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setWearSportData(SEWearSportData sEWearSportData) {
                SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> singleFieldBuilder = this.wearSportDataBuilder_;
                if (singleFieldBuilder == null) {
                    sEWearSportData.getClass();
                    this.payload_ = sEWearSportData;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEWearSportData);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESporting build() {
                SESporting sESportingBuildPartial = buildPartial();
                if (sESportingBuildPartial.isInitialized()) {
                    return sESportingBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESportingBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESporting buildPartial() {
                SESporting sESporting = new SESporting(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESporting);
                }
                buildPartialOneofs(sESporting);
                onBuilt();
                return sESporting;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESporting getDefaultInstanceForType() {
                return SESporting.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> singleFieldBuilder2 = this.sportRequestBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> singleFieldBuilder3 = this.sportResponseBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> singleFieldBuilder4 = this.phoneSportDataBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> singleFieldBuilder5 = this.wearSportDataBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> singleFieldBuilder6 = this.ecgDataBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder7 = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.clear();
                }
                SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> singleFieldBuilder8 = this.appMessageTypeBuilder_;
                if (singleFieldBuilder8 != null) {
                    singleFieldBuilder8.clear();
                }
                SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> singleFieldBuilder9 = this.autoSportDataListBuilder_;
                if (singleFieldBuilder9 != null) {
                    singleFieldBuilder9.clear();
                }
                SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> singleFieldBuilder10 = this.ringSportParamDataBuilder_;
                if (singleFieldBuilder10 != null) {
                    singleFieldBuilder10.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESporting) {
                    return mergeFrom((SESporting) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAppMessageType(SEAppMessageType.Builder builder) {
                SingleFieldBuilder<SEAppMessageType, SEAppMessageType.Builder, SEAppMessageTypeOrBuilder> singleFieldBuilder = this.appMessageTypeBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setAutoSportDataList(SEAutoSportData.SEList.Builder builder) {
                SingleFieldBuilder<SEAutoSportData.SEList, SEAutoSportData.SEList.Builder, SEAutoSportData.SEListOrBuilder> singleFieldBuilder = this.autoSportDataListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setEcgCalibrationData(SEEcgCalibrationData.Builder builder) {
                SingleFieldBuilder<SEEcgCalibrationData, SEEcgCalibrationData.Builder, SEEcgCalibrationDataOrBuilder> singleFieldBuilder = this.ecgCalibrationDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setEcgData(SEEcgData.Builder builder) {
                SingleFieldBuilder<SEEcgData, SEEcgData.Builder, SEEcgDataOrBuilder> singleFieldBuilder = this.ecgDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setPhoneSportData(SEPhoneSportData.Builder builder) {
                SingleFieldBuilder<SEPhoneSportData, SEPhoneSportData.Builder, SEPhoneSportDataOrBuilder> singleFieldBuilder = this.phoneSportDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setRingSportParamData(SERingSportStatusData.Builder builder) {
                SingleFieldBuilder<SERingSportStatusData, SERingSportStatusData.Builder, SERingSportStatusDataOrBuilder> singleFieldBuilder = this.ringSportParamDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setSportRequest(SESportRequest.Builder builder) {
                SingleFieldBuilder<SESportRequest, SESportRequest.Builder, SESportRequestOrBuilder> singleFieldBuilder = this.sportRequestBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setSportResponse(SESportResponse.Builder builder) {
                SingleFieldBuilder<SESportResponse, SESportResponse.Builder, SESportResponseOrBuilder> singleFieldBuilder = this.sportResponseBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setSportStatus(SESportStatus.Builder builder) {
                SingleFieldBuilder<SESportStatus, SESportStatus.Builder, SESportStatusOrBuilder> singleFieldBuilder = this.sportStatusBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setWearSportData(SEWearSportData.Builder builder) {
                SingleFieldBuilder<SEWearSportData, SEWearSportData.Builder, SEWearSportDataOrBuilder> singleFieldBuilder = this.wearSportDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeFrom(SESporting sESporting) {
                if (sESporting == SESporting.getDefaultInstance()) {
                    return this;
                }
                switch (sESporting.getPayloadCase()) {
                    case SPORT_STATUS:
                        mergeSportStatus(sESporting.getSportStatus());
                        break;
                    case SPORT_REQUEST:
                        mergeSportRequest(sESporting.getSportRequest());
                        break;
                    case SPORT_RESPONSE:
                        mergeSportResponse(sESporting.getSportResponse());
                        break;
                    case PHONE_SPORT_DATA:
                        mergePhoneSportData(sESporting.getPhoneSportData());
                        break;
                    case WEAR_SPORT_DATA:
                        mergeWearSportData(sESporting.getWearSportData());
                        break;
                    case ECG_DATA:
                        mergeEcgData(sESporting.getEcgData());
                        break;
                    case ECG_CALIBRATION_DATA:
                        mergeEcgCalibrationData(sESporting.getEcgCalibrationData());
                        break;
                    case APP_MESSAGE_TYPE:
                        mergeAppMessageType(sESporting.getAppMessageType());
                        break;
                    case AUTO_SPORT_DATA_LIST:
                        mergeAutoSportDataList(sESporting.getAutoSportDataList());
                        break;
                    case RING_SPORT_PARAM_DATA:
                        mergeRingSportParamData(sESporting.getRingSportParamData());
                        break;
                }
                mergeUnknownFields(sESporting.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetSportStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                    break;
                                case 18:
                                    codedInputStream.readMessage(internalGetSportRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                    break;
                                case 26:
                                    codedInputStream.readMessage(internalGetSportResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
                                    break;
                                case 34:
                                    codedInputStream.readMessage(internalGetPhoneSportDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                    break;
                                case 42:
                                    codedInputStream.readMessage(internalGetWearSportDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                    break;
                                case 50:
                                    codedInputStream.readMessage(internalGetEcgDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                    break;
                                case 58:
                                    codedInputStream.readMessage(internalGetEcgCalibrationDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                    break;
                                case 66:
                                    codedInputStream.readMessage(internalGetAppMessageTypeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 8;
                                    break;
                                case 74:
                                    codedInputStream.readMessage(internalGetAutoSportDataListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 9;
                                    break;
                                case 82:
                                    codedInputStream.readMessage(internalGetRingSportParamDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 10;
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
            SPORT_STATUS(1),
            SPORT_REQUEST(2),
            SPORT_RESPONSE(3),
            PHONE_SPORT_DATA(4),
            WEAR_SPORT_DATA(5),
            ECG_DATA(6),
            ECG_CALIBRATION_DATA(7),
            APP_MESSAGE_TYPE(8),
            AUTO_SPORT_DATA_LIST(9),
            RING_SPORT_PARAM_DATA(10),
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
                        return SPORT_STATUS;
                    case 2:
                        return SPORT_REQUEST;
                    case 3:
                        return SPORT_RESPONSE;
                    case 4:
                        return PHONE_SPORT_DATA;
                    case 5:
                        return WEAR_SPORT_DATA;
                    case 6:
                        return ECG_DATA;
                    case 7:
                        return ECG_CALIBRATION_DATA;
                    case 8:
                        return APP_MESSAGE_TYPE;
                    case 9:
                        return AUTO_SPORT_DATA_LIST;
                    case 10:
                        return RING_SPORT_PARAM_DATA;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESporting");
            DEFAULT_INSTANCE = new SESporting();
            PARSER = new AbstractParser<SESporting>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SESporting.1
                @Override // com.google.protobuf.Parser
                public SESporting parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESporting.newBuilder();
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

        public /* synthetic */ SESporting(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SESporting getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SESporting_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESporting parseDelimitedFrom(InputStream inputStream) {
            return (SESporting) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESporting parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESporting> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESporting)) {
                return super.equals(obj);
            }
            SESporting sESporting = (SESporting) obj;
            if (!getPayloadCase().equals(sESporting.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getSportStatus().equals(sESporting.getSportStatus())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getSportRequest().equals(sESporting.getSportRequest())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getSportResponse().equals(sESporting.getSportResponse())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getPhoneSportData().equals(sESporting.getPhoneSportData())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getWearSportData().equals(sESporting.getWearSportData())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getEcgData().equals(sESporting.getEcgData())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getEcgCalibrationData().equals(sESporting.getEcgCalibrationData())) {
                        return false;
                    }
                    break;
                case 8:
                    if (!getAppMessageType().equals(sESporting.getAppMessageType())) {
                        return false;
                    }
                    break;
                case 9:
                    if (!getAutoSportDataList().equals(sESporting.getAutoSportDataList())) {
                        return false;
                    }
                    break;
                case 10:
                    if (!getRingSportParamData().equals(sESporting.getRingSportParamData())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sESporting.getUnknownFields());
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEAppMessageType getAppMessageType() {
            return this.payloadCase_ == 8 ? (SEAppMessageType) this.payload_ : SEAppMessageType.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEAppMessageTypeOrBuilder getAppMessageTypeOrBuilder() {
            return this.payloadCase_ == 8 ? (SEAppMessageType) this.payload_ : SEAppMessageType.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEAutoSportData.SEList getAutoSportDataList() {
            return this.payloadCase_ == 9 ? (SEAutoSportData.SEList) this.payload_ : SEAutoSportData.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEAutoSportData.SEListOrBuilder getAutoSportDataListOrBuilder() {
            return this.payloadCase_ == 9 ? (SEAutoSportData.SEList) this.payload_ : SEAutoSportData.SEList.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SESporting_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEEcgCalibrationData getEcgCalibrationData() {
            return this.payloadCase_ == 7 ? (SEEcgCalibrationData) this.payload_ : SEEcgCalibrationData.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEEcgCalibrationDataOrBuilder getEcgCalibrationDataOrBuilder() {
            return this.payloadCase_ == 7 ? (SEEcgCalibrationData) this.payload_ : SEEcgCalibrationData.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEEcgData getEcgData() {
            return this.payloadCase_ == 6 ? (SEEcgData) this.payload_ : SEEcgData.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEEcgDataOrBuilder getEcgDataOrBuilder() {
            return this.payloadCase_ == 6 ? (SEEcgData) this.payload_ : SEEcgData.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESporting> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEPhoneSportData getPhoneSportData() {
            return this.payloadCase_ == 4 ? (SEPhoneSportData) this.payload_ : SEPhoneSportData.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEPhoneSportDataOrBuilder getPhoneSportDataOrBuilder() {
            return this.payloadCase_ == 4 ? (SEPhoneSportData) this.payload_ : SEPhoneSportData.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SERingSportStatusData getRingSportParamData() {
            return this.payloadCase_ == 10 ? (SERingSportStatusData) this.payload_ : SERingSportStatusData.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SERingSportStatusDataOrBuilder getRingSportParamDataOrBuilder() {
            return this.payloadCase_ == 10 ? (SERingSportStatusData) this.payload_ : SERingSportStatusData.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SESportStatus) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (SESportRequest) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (SESportResponse) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (SEPhoneSportData) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (SEWearSportData) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SEEcgData) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (SEEcgCalibrationData) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, (SEAppMessageType) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, (SEAutoSportData.SEList) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, (SERingSportStatusData) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SESportRequest getSportRequest() {
            return this.payloadCase_ == 2 ? (SESportRequest) this.payload_ : SESportRequest.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SESportRequestOrBuilder getSportRequestOrBuilder() {
            return this.payloadCase_ == 2 ? (SESportRequest) this.payload_ : SESportRequest.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SESportResponse getSportResponse() {
            return this.payloadCase_ == 3 ? (SESportResponse) this.payload_ : SESportResponse.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SESportResponseOrBuilder getSportResponseOrBuilder() {
            return this.payloadCase_ == 3 ? (SESportResponse) this.payload_ : SESportResponse.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SESportStatus getSportStatus() {
            return this.payloadCase_ == 1 ? (SESportStatus) this.payload_ : SESportStatus.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SESportStatusOrBuilder getSportStatusOrBuilder() {
            return this.payloadCase_ == 1 ? (SESportStatus) this.payload_ : SESportStatus.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEWearSportData getWearSportData() {
            return this.payloadCase_ == 5 ? (SEWearSportData) this.payload_ : SEWearSportData.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public SEWearSportDataOrBuilder getWearSportDataOrBuilder() {
            return this.payloadCase_ == 5 ? (SEWearSportData) this.payload_ : SEWearSportData.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasAppMessageType() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasAutoSportDataList() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasEcgCalibrationData() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasEcgData() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasPhoneSportData() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasRingSportParamData() {
            return this.payloadCase_ == 10;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasSportRequest() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasSportResponse() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasSportStatus() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SESportingOrBuilder
        public boolean hasWearSportData() {
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
                    iHashCode = getSportStatus().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getSportRequest().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getSportResponse().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getPhoneSportData().hashCode();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getWearSportData().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getEcgData().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getEcgCalibrationData().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getAppMessageType().hashCode();
                    break;
                case 9:
                    i7 = ((iHashCode2 * 37) + 9) * 53;
                    iHashCode = getAutoSportDataList().hashCode();
                    break;
                case 10:
                    i7 = ((iHashCode2 * 37) + 10) * 53;
                    iHashCode = getRingSportParamData().hashCode();
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
            return SportingProtos.internal_static_SESporting_fieldAccessorTable.ensureFieldAccessorsInitialized(SESporting.class, Builder.class);
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
            if (hasSportStatus() && !getSportStatus().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSportRequest() && !getSportRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSportResponse() && !getSportResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPhoneSportData() && !getPhoneSportData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasWearSportData() && !getWearSportData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEcgData() && !getEcgData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEcgCalibrationData() && !getEcgCalibrationData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAppMessageType() || getAppMessageType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SESportStatus) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (SESportRequest) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (SESportResponse) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (SEPhoneSportData) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SEWearSportData) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SEEcgData) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SEEcgCalibrationData) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SEAppMessageType) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (SEAutoSportData.SEList) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                codedOutputStream.writeMessage(10, (SERingSportStatusData) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESporting(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESporting sESporting) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESporting);
        }

        public static SESporting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESporting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESporting) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESporting parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESporting getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESporting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SESporting() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SESporting parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESporting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESporting parseFrom(InputStream inputStream) {
            return (SESporting) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESporting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESporting) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESporting parseFrom(CodedInputStream codedInputStream) {
            return (SESporting) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESporting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESporting) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESportingOrBuilder extends MessageOrBuilder {
        SEAppMessageType getAppMessageType();

        SEAppMessageTypeOrBuilder getAppMessageTypeOrBuilder();

        SEAutoSportData.SEList getAutoSportDataList();

        SEAutoSportData.SEListOrBuilder getAutoSportDataListOrBuilder();

        SEEcgCalibrationData getEcgCalibrationData();

        SEEcgCalibrationDataOrBuilder getEcgCalibrationDataOrBuilder();

        SEEcgData getEcgData();

        SEEcgDataOrBuilder getEcgDataOrBuilder();

        SESporting.PayloadCase getPayloadCase();

        SEPhoneSportData getPhoneSportData();

        SEPhoneSportDataOrBuilder getPhoneSportDataOrBuilder();

        SERingSportStatusData getRingSportParamData();

        SERingSportStatusDataOrBuilder getRingSportParamDataOrBuilder();

        SESportRequest getSportRequest();

        SESportRequestOrBuilder getSportRequestOrBuilder();

        SESportResponse getSportResponse();

        SESportResponseOrBuilder getSportResponseOrBuilder();

        SESportStatus getSportStatus();

        SESportStatusOrBuilder getSportStatusOrBuilder();

        SEWearSportData getWearSportData();

        SEWearSportDataOrBuilder getWearSportDataOrBuilder();

        boolean hasAppMessageType();

        boolean hasAutoSportDataList();

        boolean hasEcgCalibrationData();

        boolean hasEcgData();

        boolean hasPhoneSportData();

        boolean hasRingSportParamData();

        boolean hasSportRequest();

        boolean hasSportResponse();

        boolean hasSportStatus();

        boolean hasWearSportData();
    }

    public static final class SEWearSportData extends GeneratedMessage implements SEWearSportDataOrBuilder {
        public static final int CALORIES_FIELD_NUMBER = 2;
        private static final SEWearSportData DEFAULT_INSTANCE;
        public static final int DISTANCE_FIELD_NUMBER = 4;
        public static final int HEART_RATE_FIELD_NUMBER = 1;
        private static final Parser<SEWearSportData> PARSER;
        public static final int SPORT_LEVEL_FIELD_NUMBER = 6;
        public static final int SPORT_TIMESTAMP_FIELD_NUMBER = 5;
        public static final int STEPS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int calories_;
        private int distance_;
        private int heartRate_;
        private byte memoizedIsInitialized;
        private int sportLevel_;
        private int sportTimestamp_;
        private int steps_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEWearSportData$1 */
        public class AnonymousClass1 extends AbstractParser<SEWearSportData> {
            @Override // com.google.protobuf.Parser
            public SEWearSportData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEWearSportData.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEWearSportDataOrBuilder {
            private int bitField0_;
            private int calories_;
            private int distance_;
            private int heartRate_;
            private int sportLevel_;
            private int sportTimestamp_;
            private int steps_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, m mVar) {
                this(builderParent);
            }

            private void buildPartial0(SEWearSportData sEWearSportData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEWearSportData.heartRate_ = this.heartRate_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEWearSportData.calories_ = this.calories_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEWearSportData.steps_ = this.steps_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEWearSportData.distance_ = this.distance_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEWearSportData.sportTimestamp_ = this.sportTimestamp_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEWearSportData.sportLevel_ = this.sportLevel_;
                    i7 |= 32;
                }
                sEWearSportData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SportingProtos.internal_static_SEWearSportData_descriptor;
            }

            public Builder clearCalories() {
                this.bitField0_ &= -3;
                this.calories_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDistance() {
                this.bitField0_ &= -9;
                this.distance_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHeartRate() {
                this.bitField0_ &= -2;
                this.heartRate_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSportLevel() {
                this.bitField0_ &= -33;
                this.sportLevel_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSportTimestamp() {
                this.bitField0_ &= -17;
                this.sportTimestamp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSteps() {
                this.bitField0_ &= -5;
                this.steps_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public int getCalories() {
                return this.calories_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SportingProtos.internal_static_SEWearSportData_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public int getDistance() {
                return this.distance_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public int getHeartRate() {
                return this.heartRate_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public SESportLevel getSportLevel() {
                SESportLevel sESportLevelForNumber = SESportLevel.forNumber(this.sportLevel_);
                return sESportLevelForNumber == null ? SESportLevel.INACTIVE : sESportLevelForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public int getSportTimestamp() {
                return this.sportTimestamp_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public int getSteps() {
                return this.steps_;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public boolean hasCalories() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public boolean hasDistance() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public boolean hasHeartRate() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public boolean hasSportLevel() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public boolean hasSportTimestamp() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
            public boolean hasSteps() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SportingProtos.internal_static_SEWearSportData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWearSportData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasHeartRate() && hasCalories();
            }

            public Builder setCalories(int i7) {
                this.calories_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDistance(int i7) {
                this.distance_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setHeartRate(int i7) {
                this.heartRate_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSportLevel(SESportLevel sESportLevel) {
                sESportLevel.getClass();
                this.bitField0_ |= 32;
                this.sportLevel_ = sESportLevel.getNumber();
                onChanged();
                return this;
            }

            public Builder setSportTimestamp(int i7) {
                this.sportTimestamp_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSteps(int i7) {
                this.steps_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(m mVar) {
                this();
            }

            private Builder() {
                this.sportLevel_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWearSportData build() {
                SEWearSportData sEWearSportDataBuildPartial = buildPartial();
                if (sEWearSportDataBuildPartial.isInitialized()) {
                    return sEWearSportDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEWearSportDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEWearSportData buildPartial() {
                SEWearSportData sEWearSportData = new SEWearSportData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEWearSportData);
                }
                onBuilt();
                return sEWearSportData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEWearSportData getDefaultInstanceForType() {
                return SEWearSportData.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.sportLevel_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.heartRate_ = 0;
                this.calories_ = 0;
                this.steps_ = 0;
                this.distance_ = 0;
                this.sportTimestamp_ = 0;
                this.sportLevel_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEWearSportData) {
                    return mergeFrom((SEWearSportData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEWearSportData sEWearSportData) {
                if (sEWearSportData == SEWearSportData.getDefaultInstance()) {
                    return this;
                }
                if (sEWearSportData.hasHeartRate()) {
                    setHeartRate(sEWearSportData.getHeartRate());
                }
                if (sEWearSportData.hasCalories()) {
                    setCalories(sEWearSportData.getCalories());
                }
                if (sEWearSportData.hasSteps()) {
                    setSteps(sEWearSportData.getSteps());
                }
                if (sEWearSportData.hasDistance()) {
                    setDistance(sEWearSportData.getDistance());
                }
                if (sEWearSportData.hasSportTimestamp()) {
                    setSportTimestamp(sEWearSportData.getSportTimestamp());
                }
                if (sEWearSportData.hasSportLevel()) {
                    setSportLevel(sEWearSportData.getSportLevel());
                }
                mergeUnknownFields(sEWearSportData.getUnknownFields());
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
                                    this.heartRate_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.calories_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.steps_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.distance_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.sportTimestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i7 = codedInputStream.readEnum();
                                    if (SESportLevel.forNumber(i7) == null) {
                                        mergeUnknownVarintField(6, i7);
                                    } else {
                                        this.sportLevel_ = i7;
                                        this.bitField0_ |= 32;
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

        public enum SESportLevel implements ProtocolMessageEnum {
            INACTIVE(0),
            LOW(1),
            MEDIUM(2),
            HIGH(3);

            public static final int HIGH_VALUE = 3;
            public static final int INACTIVE_VALUE = 0;
            public static final int LOW_VALUE = 1;
            public static final int MEDIUM_VALUE = 2;
            private static final SESportLevel[] VALUES;
            private static final Internal.EnumLiteMap<SESportLevel> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.SportingProtos$SEWearSportData$SESportLevel$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SESportLevel> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESportLevel findValueByNumber(int i7) {
                    return SESportLevel.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESportLevel");
                internalValueMap = new Internal.EnumLiteMap<SESportLevel>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEWearSportData.SESportLevel.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SESportLevel findValueByNumber(int i7) {
                        return SESportLevel.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SESportLevel(int i7) {
                this.value = i7;
            }

            public static SESportLevel forNumber(int i7) {
                if (i7 == 0) {
                    return INACTIVE;
                }
                if (i7 == 1) {
                    return LOW;
                }
                if (i7 == 2) {
                    return MEDIUM;
                }
                if (i7 != 3) {
                    return null;
                }
                return HIGH;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEWearSportData.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SESportLevel> internalGetValueMap() {
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
            public static SESportLevel valueOf(int i7) {
                return forNumber(i7);
            }

            public static SESportLevel valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWearSportData");
            DEFAULT_INSTANCE = new SEWearSportData();
            PARSER = new AbstractParser<SEWearSportData>() { // from class: com.zh.ble.wear.protobuf.SportingProtos.SEWearSportData.1
                @Override // com.google.protobuf.Parser
                public SEWearSportData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEWearSportData.newBuilder();
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

        public /* synthetic */ SEWearSportData(GeneratedMessage.Builder builder, m mVar) {
            this(builder);
        }

        public static SEWearSportData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SportingProtos.internal_static_SEWearSportData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEWearSportData parseDelimitedFrom(InputStream inputStream) {
            return (SEWearSportData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEWearSportData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEWearSportData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEWearSportData)) {
                return super.equals(obj);
            }
            SEWearSportData sEWearSportData = (SEWearSportData) obj;
            if (hasHeartRate() != sEWearSportData.hasHeartRate()) {
                return false;
            }
            if ((hasHeartRate() && getHeartRate() != sEWearSportData.getHeartRate()) || hasCalories() != sEWearSportData.hasCalories()) {
                return false;
            }
            if ((hasCalories() && getCalories() != sEWearSportData.getCalories()) || hasSteps() != sEWearSportData.hasSteps()) {
                return false;
            }
            if ((hasSteps() && getSteps() != sEWearSportData.getSteps()) || hasDistance() != sEWearSportData.hasDistance()) {
                return false;
            }
            if ((hasDistance() && getDistance() != sEWearSportData.getDistance()) || hasSportTimestamp() != sEWearSportData.hasSportTimestamp()) {
                return false;
            }
            if ((!hasSportTimestamp() || getSportTimestamp() == sEWearSportData.getSportTimestamp()) && hasSportLevel() == sEWearSportData.hasSportLevel()) {
                return (!hasSportLevel() || this.sportLevel_ == sEWearSportData.sportLevel_) && getUnknownFields().equals(sEWearSportData.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public int getCalories() {
            return this.calories_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SportingProtos.internal_static_SEWearSportData_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public int getDistance() {
            return this.distance_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public int getHeartRate() {
            return this.heartRate_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEWearSportData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.heartRate_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.calories_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.steps_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.distance_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.sportTimestamp_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(6, this.sportLevel_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public SESportLevel getSportLevel() {
            SESportLevel sESportLevelForNumber = SESportLevel.forNumber(this.sportLevel_);
            return sESportLevelForNumber == null ? SESportLevel.INACTIVE : sESportLevelForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public int getSportTimestamp() {
            return this.sportTimestamp_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public int getSteps() {
            return this.steps_;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public boolean hasCalories() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public boolean hasDistance() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public boolean hasHeartRate() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public boolean hasSportLevel() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public boolean hasSportTimestamp() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.SportingProtos.SEWearSportDataOrBuilder
        public boolean hasSteps() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasHeartRate()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getHeartRate();
            }
            if (hasCalories()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getCalories();
            }
            if (hasSteps()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getSteps();
            }
            if (hasDistance()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDistance();
            }
            if (hasSportTimestamp()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getSportTimestamp();
            }
            if (hasSportLevel()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + this.sportLevel_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SportingProtos.internal_static_SEWearSportData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEWearSportData.class, Builder.class);
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
            if (!hasHeartRate()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCalories()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.heartRate_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.calories_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.steps_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.distance_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.sportTimestamp_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(6, this.sportLevel_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEWearSportData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.heartRate_ = 0;
            this.calories_ = 0;
            this.steps_ = 0;
            this.distance_ = 0;
            this.sportTimestamp_ = 0;
            this.sportLevel_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEWearSportData sEWearSportData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEWearSportData);
        }

        public static SEWearSportData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEWearSportData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWearSportData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEWearSportData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEWearSportData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEWearSportData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEWearSportData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEWearSportData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEWearSportData parseFrom(InputStream inputStream) {
            return (SEWearSportData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEWearSportData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWearSportData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SEWearSportData() {
            this.heartRate_ = 0;
            this.calories_ = 0;
            this.steps_ = 0;
            this.distance_ = 0;
            this.sportTimestamp_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.sportLevel_ = 0;
        }

        public static SEWearSportData parseFrom(CodedInputStream codedInputStream) {
            return (SEWearSportData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEWearSportData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEWearSportData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEWearSportDataOrBuilder extends MessageOrBuilder {
        int getCalories();

        int getDistance();

        int getHeartRate();

        SEWearSportData.SESportLevel getSportLevel();

        int getSportTimestamp();

        int getSteps();

        boolean hasCalories();

        boolean hasDistance();

        boolean hasHeartRate();

        boolean hasSportLevel();

        boolean hasSportTimestamp();

        boolean hasSteps();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SportingProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000eSporting.proto\u001a\fnanopb.proto\"é\u0003\n\nSESporting\u0012&\n\fsport_status\u0018\u0001 \u0001(\u000b2\u000e.SESportStatusH\u0000\u0012(\n\rsport_request\u0018\u0002 \u0001(\u000b2\u000f.SESportRequestH\u0000\u0012*\n\u000esport_response\u0018\u0003 \u0001(\u000b2\u0010.SESportResponseH\u0000\u0012-\n\u0010phone_sport_data\u0018\u0004 \u0001(\u000b2\u0011.SEPhoneSportDataH\u0000\u0012+\n\u000fwear_sport_data\u0018\u0005 \u0001(\u000b2\u0010.SEWearSportDataH\u0000\u0012\u001e\n\becg_data\u0018\u0006 \u0001(\u000b2\n.SEEcgDataH\u0000\u00125\n\u0014ecg_calibration_data\u0018\u0007 \u0001(\u000b2\u0015.SEEcgCalibrationDataH\u0000\u0012-\n\u0010App_message_type\u0018\b \u0001(\u000b2\u0011.SEAppMessageTypeH\u0000\u00127\n\u0014auto_sport_data_list\u0018\t \u0001(\u000b2\u0017.SEAutoSportData.SEListH\u0000\u00127\n\u0015ring_Sport_Param_Data\u0018\n \u0001(\u000b2\u0016.SERingSportStatusDataH\u0000B\t\n\u0007payload\"¨\u0001\n\rSESportStatus\u0012\u0019\n\nsport_type\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028 \u0012\u0011\n\ttimestamp\u0018\u0002 \u0001(\r\u0012\u0010\n\bduration\u0018\u0003 \u0001(\r\u0012\u000e\n\u0006paused\u0018\u0004 \u0001(\b\u0012\u0012\n\nstandalone\u0018\u0005 \u0001(\b\u0012\u001d\n\u000eselect_version\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u0014\n\fapp_launched\u0018\u0007 \u0001(\b\"æ\u0002\n\u000eSESportRequest\u0012\u0011\n\ttimestamp\u0018\u0001 \u0002(\r\u0012\u0019\n\nsport_type\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028 \u0012&\n\u0005state\u0018\u0003 \u0002(\u000e2\u0017.SESportRequest.SEState\u0012\u001f\n\u0010support_versions\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\u0012*\n\nerror_code\u0018\u0005 \u0001(\u000e2\u0016.SESportRequest.SECode\"L\n\u0007SEState\u0012\u0015\n\u0011GPS_START_REQUEST\u0010\u0000\u0012\t\n\u0005START\u0010\u0001\u0012\t\n\u0005PAUSE\u0010\u0002\u0012\n\n\u0006RESUME\u0010\u0003\u0012\b\n\u0004STOP\u0010\u0004\"c\n\u0006SECode\u0012\u000e\n\nNORMAL_END\u0010\u0000\u0012\u001d\n\u0019SPORT_DURATION_NO_METTING\u0010\u0001\u0012\u001d\n\u0019DEVICE_STORAGE_SPACE_FULL\u0010\u0002\u0012\u000b\n\u0007UNKNOWN\u0010\n\"Ú\u0003\n\u000fSESportResponse\u0012%\n\u0004code\u0018\u0001 \u0002(\u000e2\u0017.SESportResponse.SECode\u0012$\n\fsport_status\u0018\u0002 \u0001(\u000b2\u000e.SESportStatus\u0012$\n\fgps_accuracy\u0018\u0003 \u0001(\u000e2\u000e.SEGpsAccuracy\u0012\u001d\n\u000eselect_version\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\"´\u0002\n\u0006SECode\u0012\u0006\n\u0002OK\u0010\u0000\u0012\b\n\u0004BUSY\u0010\u0001\u0012\u0012\n\u000eTYPE_NOT_MATCH\u0010\u0002\u0012\u0011\n\rNO_PERMISSION\u0010\u0003\u0012\u000f\n\u000bNOT_SUPPORT\u0010\u0004\u0012\u0014\n\u0010LACK_OF_ACCURACY\u0010\u0005\u0012\f\n\bCHARGING\u0010\u0006\u0012\u000f\n\u000bLOW_BATTERY\u0010\u0007\u0012\r\n\tSEEK_FAIL\u0010\b\u0012\u0016\n\u0012SPACE_WILL_BE_FULL\u0010\t\u0012\u0011\n\rSPACE_IS_FULL\u0010\u000b\u0012\u0016\n\u0012DEVICE_IS_SPORTING\u0010\f\u0012\u000e\n\nNORMAL_END\u0010\r\u0012\u001d\n\u0019SPORT_DURATION_NO_METTING\u0010\u000e\u0012\u001d\n\u0019DEVICE_STORAGE_SPACE_FULL\u0010\u000f\u0012\u000b\n\u0007UNKNOWN\u0010\n\"\u0085\u0002\n\u0010SEPhoneSportData\u0012$\n\fgps_accuracy\u0018\u0001 \u0002(\u000e2\u000e.SEGpsAccuracy\u0012\u0011\n\ttimestamp\u0018\u0002 \u0002(\r\u0012\u0011\n\tlongitude\u0018\u0003 \u0002(\u0001\u0012\u0010\n\blatitude\u0018\u0004 \u0002(\u0001\u0012\u0010\n\baltitude\u0018\u0005 \u0001(\u0001\u0012\r\n\u0005speed\u0018\u0006 \u0001(\u0002\u0012\u000f\n\u0007bearing\u0018\u0007 \u0001(\u0002\u0012\u001b\n\u0013horizontal_accuracy\u0018\b \u0001(\u0002\u0012\u0019\n\u0011vertical_accuracy\u0018\t \u0001(\u0002\u0012)\n\u001agps_Coordinate_system_type\u0018\n \u0001(\rB\u0005\u0092?\u00028\b\"ð\u0001\n\u000fSEWearSportData\u0012\u0019\n\nheart_rate\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0017\n\bcalories\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\r\n\u0005steps\u0018\u0003 \u0001(\r\u0012\u0010\n\bdistance\u0018\u0004 \u0001(\r\u0012\u0017\n\u000fsport_timestamp\u0018\u0005 \u0001(\r\u00122\n\u000bsport_level\u0018\u0006 \u0001(\u000e2\u001d.SEWearSportData.SESportLevel\";\n\fSESportLevel\u0012\f\n\bINACTIVE\u0010\u0000\u0012\u0007\n\u0003LOW\u0010\u0001\u0012\n\n\u0006MEDIUM\u0010\u0002\u0012\b\n\u0004HIGH\u0010\u0003\"ù\u0001\n\u0014SEEcgCalibrationData\u0012\u001d\n\u0015ecg_calibration_state\u0018\u0001 \u0002(\b\u0012#\n\u0014ecg_calibration_mode\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\b\u0012$\n\u0015ecg_level_calibration\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u0012$\n\u0015ecg_calibration_heart\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\u0012'\n\u0018ecg_calibration_systolic\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\u0012(\n\u0019ecg_calibration_diastolic\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\b\"¦\u0002\n\u000fSEEcgReportData\u0012\u0018\n\tecg_heart\u0018\u0001 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001b\n\fecg_systolic\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001c\n\recg_diastolic\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001c\n\recg_hrvResult\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001e\n\u000fecg_healthIndex\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001f\n\u0010ecg_fatigueIndex\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001b\n\fecg_bodyLoad\u0018\u0007 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001e\n\u000fecg_bodyQuality\u0018\b \u0001(\rB\u0005\u0092?\u00028\b\u0012\"\n\u0013ecg_cardiacFunction\u0018\t \u0001(\rB\u0005\u0092?\u00028\b\"\u0080\u0005\n\tSEEcgData\u0012,\n\u000becg_command\u0018\u0001 \u0001(\u000e2\u0017.SEEcgData.SEECGCommand\u0012,\n\u000becg_respond\u0018\u0002 \u0001(\u000e2\u0017.SEEcgData.SEECGRespond\u0012/\n\u000eecg_end_result\u0018\u0003 \u0001(\u000e2\u0017.SEEcgData.SEECGRespond\u0012\u001d\n\u000eecg_data_index\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0017\n\becg_data\u0018\u0005 \u0001(\fB\u0005\u0092?\u0002\u0018\u0004\u00123\n\u0014ecg_calibration_data\u0018\u0006 \u0001(\u000b2\u0015.SEEcgCalibrationData\u0012\u0017\n\becg_mode\u0018\u0007 \u0001(\rB\u0005\u0092?\u00028\b\u00120\n\u000fecg_report_data\u0018\b \u0001(\u000b2\u0010.SEEcgReportDataB\u0005\u0092?\u00028\b\"¡\u0001\n\fSEECGCommand\u0012\u001b\n\u0017ECG_REQUEST_MEASUREMENT\u0010\u0000\u0012\u0019\n\u0015ECG_START_MEASUREMENT\u0010\u0001\u0012 \n\u001cECG_ABNORMAL_END_MEASUREMENT\u0010\u0002\u0012\u0017\n\u0013ECG_END_MEASUREMENT\u0010\u0003\u0012\u001e\n\u001aECG_MANUAL_END_MEASUREMENT\u0010\u0004\"\u0089\u0001\n\fSEECGRespond\u0012\u0006\n\u0002OK\u0010\u0000\u0012\b\n\u0004BUSY\u0010\u0001\u0012\f\n\bCHARGING\u0010\u0002\u0012\u000f\n\u000bLOW_BATTERY\u0010\u0003\u0012\u001b\n\u0017END_MEASUREMENT_DATA_OK\u0010\u0004\u0012\u001e\n\u001aEND_MEASUREMENT_DATA_ERROR\u0010\u0005\u0012\u000b\n\u0007UNKNOWN\u0010\n\"µ\u0001\n\u0010SEAppMessageType\u0012\u001b\n\fmeasure_type\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0016\n\u000eswitch_measure\u0018\u0002 \u0001(\b\u0012\u0014\n\fwrist_status\u0018\u0003 \u0001(\b\u0012\u001c\n\rmeasure_value\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u001b\n\fmeasure_time\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001b\n\ferror_reason\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\b\"£\u0002\n\u000fSEAutoSportData\u0012\u001d\n\u000eautosport_type\u0018\u0001 \u0001(\rB\u0005\u0092?\u00028 \u0012\"\n\u0013autosport_starttime\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028 \u0012!\n\u0012autosport_duration\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028 \u0012\u001e\n\u000fautosport_steps\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028 \u0012\"\n\u0013autosport_intensity\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001d\n\u000eautosport_kcal\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0016\n\u0007hr_data\u0018\u0007 \u0001(\fB\u0005\u0092?\u0002\u0018\u0004\u001a/\n\u0006SEList\u0012%\n\u0004list\u0018\u0001 \u0003(\u000b2\u0010.SEAutoSportDataB\u0005\u0092?\u0002\u0018\u0004\"Ñ\u0006\n\u0015SERingSportStatusData\u0012\u0018\n\u0010is_sport_no_sync\u0018\u0001 \u0001(\b\u0012\u0014\n\fis_sport_ing\u0018\u0002 \u0001(\b\u0012A\n\u0010sport_end_status\u0018\u0003 \u0001(\u000e2'.SERingSportStatusData.SESportEndstatus\u0012:\n\fsport_status\u0018\u0004 \u0001(\u000e2$.SERingSportStatusData.SESportstatus\u0012E\n\u0012sport_start_status\u0018\u0005 \u0001(\u000e2).SERingSportStatusData.SESportStartstatus\u0012\u001e\n\u000fstartsport_type\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028 \u0012!\n\u0012startsport_curtime\u0018\u0007 \u0001(\rB\u0005\u0092?\u00028 \u0012\"\n\u0013startsport_duration\u0018\b \u0001(\rB\u0005\u0092?\u00028 \"\u0085\u0001\n\rSESportstatus\u0012\u0015\n\u0011SPORT_STATUS_NONE\u0010\u0000\u0012\u0016\n\u0012SPORT_STATUS_START\u0010\u0001\u0012\u0016\n\u0012SPORT_STATUS_PAUSE\u0010\u0002\u0012\u0017\n\u0013SPORT_STATUS_RESUME\u0010\u0003\u0012\u0014\n\u0010SPORT_STATUS_END\u0010\u0004\"¡\u0001\n\u0010SESportEndstatus\u0012\u0018\n\u0014SPORT_ENDSTATUS_NONE\u0010\u0000\u0012\u001d\n\u0019SPORT_ENDSTATUS_LOW_POWER\u0010\u0001\u0012\u001b\n\u0017SPORT_ENDSTATUS_TIMEOUT\u0010\u0002\u0012\u001b\n\u0017SPORT_ENDSTATUS_MEMOVER\u0010\u0003\u0012\u001a\n\u0016SPORT_ENDSTATUS_CHARGE\u0010\u0004\"®\u0001\n\u0012SESportStartstatus\u0012\u001a\n\u0016SPORT_STARTSTATUS_NONE\u0010\u0000\u0012\u001f\n\u001bSPORT_STARTSTATUS_LOW_POWER\u0010\u0001\u0012\u001c\n\u0018SPORT_STARTSTATUS_UNWEAR\u0010\u0002\u0012\u001d\n\u0019SPORT_STARTSTATUS_CHARING\u0010\u0003\u0012\u001e\n\u001aSPORT_STARTSTATUS_SPORTING\u0010\u0004*Þ\u000f\n\u000bSESportType\u0012\b\n\u0004NONE\u0010\u0000\u0012\u000f\n\u000bRUN_OUTDOOR\u0010\u0001\u0012\u0010\n\fWALK_OUTDOOR\u0010\u0002\u0012\u000e\n\nRUN_INDOOR\u0010\u0003\u0012\f\n\bCLIMBING\u0010\u0004\u0012\u0011\n\rCROSS_COUNTRY\u0010\u0005\u0012\u0010\n\fRIDE_OUTDOOR\u0010\u0006\u0012\u000f\n\u000bRIDE_INDOOR\u0010\u0007\u0012\u0011\n\rFREE_TRAINING\u0010\b\u0012\u000f\n\u000bSWIM_INDOOR\u0010\t\u0012\u0010\n\fSWIM_OUTDOOR\u0010\n\u0012\u0016\n\u0012ELLIPTICAL_MACHINE\u0010\u000b\u0012\b\n\u0004YOGA\u0010\f\u0012\u0012\n\u000eROWING_MACHINE\u0010\r\u0012\u0011\n\rROPE_SKIPPING\u0010\u000e\u0012\u0012\n\u000eHIKING_OUTDOOR\u0010\u000f\u0012\u001a\n\u0016HIGH_INTERVAL_TRAINING\u0010\u0010\u0012\r\n\tTRIATHLON\u0010\u0011\u0012\f\n\bSAILBOAT\u0010d\u0012\u0010\n\fPADDLE_BOARD\u0010e\u0012\u000e\n\nWATER_POLO\u0010f\u0012\u0011\n\rAQUATIC_SPORT\u0010g\u0012\u000b\n\u0007SURFING\u0010h\u0012\f\n\bCANOEING\u0010i\u0012\u0011\n\rKAYAK_RAFTING\u0010j\u0012\n\n\u0006ROWING\u0010k\u0012\r\n\tMOTORBOAT\u0010l\u0012\u0010\n\fWEB_SWIMMING\u0010m\u0012\u000b\n\u0007DRIVING\u0010n\u0012\u0012\n\u000eFANCY_SWIMMING\u0010o\u0012\u000e\n\nSNORKELING\u0010p\u0012\u0010\n\fKITE_SURFING\u0010q\u0012\u0012\n\rROCK_CLIMBING\u0010È\u0001\u0012\n\n\u0005SKATE\u0010É\u0001\u0012\u0013\n\u000eROLLER_SKATING\u0010Ê\u0001\u0012\f\n\u0007PARKOUR\u0010Ë\u0001\u0012\b\n\u0003ATV\u0010Ì\u0001\u0012\u000f\n\nPARAGLIDER\u0010Í\u0001\u0012\u0015\n\u0010CLIMBING_MACHINE\u0010¬\u0002\u0012\u0011\n\fCLIMB_STAIRS\u0010\u00ad\u0002\u0012\f\n\u0007STEPPER\u0010®\u0002\u0012\u0012\n\rCORE_TRAINING\u0010¯\u0002\u0012\u0019\n\u0014FLEXIBILITY_TRAINING\u0010°\u0002\u0012\f\n\u0007PILATES\u0010±\u0002\u0012\u000f\n\nGYMNASTICS\u0010²\u0002\u0012\f\n\u0007STRETCH\u0010³\u0002\u0012\u0016\n\u0011STRENGTH_TRAINING\u0010´\u0002\u0012\u000e\n\tCROSS_FIT\u0010µ\u0002\u0012\r\n\bAEROBICS\u0010¶\u0002\u0012\u0016\n\u0011PHYSICAL_TRAINING\u0010·\u0002\u0012\u000e\n\tWALL_BALL\u0010¸\u0002\u0012\u0016\n\u0011DUMBBELL_TRAINING\u0010¹\u0002\u0012\u0015\n\u0010BARBELL_TRAINING\u0010º\u0002\u0012\u0012\n\rWEIGHTLIFTING\u0010»\u0002\u0012\r\n\bDEADLIFT\u0010¼\u0002\u0012\u000f\n\nBOBBY_JUMP\u0010½\u0002\u0012\f\n\u0007SIT_UPS\u0010¾\u0002\u0012\u0018\n\u0013FUNCTIONAL_TRAINING\u0010¿\u0002\u0012\u0018\n\u0013UPPER_LIMB_TRAINING\u0010À\u0002\u0012\u0018\n\u0013LOWER_LIMB_TRAINING\u0010Á\u0002\u0012\u0013\n\u000eWAIST_TRAINING\u0010Â\u0002\u0012\u0012\n\rBACK_TRAINING\u0010Ã\u0002\u0012\u0011\n\fSQUARE_DANCE\u0010\u0090\u0003\u0012\u0010\n\u000bBELLY_DANCE\u0010\u0091\u0003\u0012\u000b\n\u0006BALLET\u0010\u0092\u0003\u0012\u0011\n\fSTREET_DANCE\u0010\u0093\u0003\u0012\n\n\u0005ZUMBA\u0010\u0094\u0003\u0012\u0013\n\u000eNATIONAL_DANCE\u0010\u0095\u0003\u0012\t\n\u0004JAZZ\u0010\u0096\u0003\u0012\u0010\n\u000bLATIN_DANCE\u0010\u0097\u0003\u0012\u000b\n\u0006BOXING\u0010ô\u0003\u0012\u000e\n\tWRESTLING\u0010õ\u0003\u0012\u0011\n\fMARTIAL_ARTS\u0010ö\u0003\u0012\u000b\n\u0006TAICHI\u0010÷\u0003\u0012\u000e\n\tMUAY_THAI\u0010ø\u0003\u0012\t\n\u0004JUDO\u0010ù\u0003\u0012\u000e\n\tTAEKWONDO\u0010ú\u0003\u0012\u000b\n\u0006KARATE\u0010û\u0003\u0012\u0012\n\rFREE_SPARRING\u0010ü\u0003\u0012\u0012\n\rSWORDSMANSHIP\u0010ý\u0003\u0012\f\n\u0007FENCING\u0010þ\u0003\u0012\r\n\bFOOTBALL\u0010Ø\u0004\u0012\u000f\n\nBASKETBALL\u0010Ù\u0004\u0012\u000f\n\nVOLLEYBALL\u0010Ú\u0004\u0012\r\n\bBASEBALL\u0010Û\u0004\u0012\r\n\bSOFTBALL\u0010Ü\u0004\u0012\n\n\u0005RUGBY\u0010Ý\u0004\u0012\u000b\n\u0006HOCKEY\u0010Þ\u0004\u0012\r\n\bPINGPONG\u0010ß\u0004\u0012\u000e\n\tBADMINTON\u0010à\u0004\u0012\u000b\n\u0006TENNIS\u0010á\u0004\u0012\f\n\u0007CRICKET\u0010â\u0004\u0012\r\n\bHANDBALL\u0010ã\u0004\u0012\f\n\u0007BOWLING\u0010ä\u0004\u0012\u000b\n\u0006SQUASH\u0010å\u0004\u0012\u000e\n\tBILLIARDS\u0010æ\u0004\u0012\u0010\n\u000bSHUTTLECOCK\u0010ç\u0004\u0012\u0013\n\u000eBEACH_FOOTBALL\u0010è\u0004\u0012\u0015\n\u0010BEACH_VOLLEYBALL\u0010é\u0004\u0012\u0011\n\fSEPAK_TAKRAW\u0010ê\u0004\u0012\u0014\n\u000fOUTDOOR_SKATING\u0010¼\u0005\u0012\f\n\u0007CURLING\u0010½\u0005\u0012\u0010\n\u000bSNOW_SPORTS\u0010¾\u0005\u0012\u000f\n\nSNOWMOBILE\u0010¿\u0005\u0012\t\n\u0004PUCK\u0010À\u0005\u0012\r\n\bSNOW_CAR\u0010Á\u0005\u0012\t\n\u0004SLED\u0010Â\u0005\u0012\f\n\u0007ARCHERY\u0010 \u0006\u0012\n\n\u0005DARTS\u0010¡\u0006\u0012\u0011\n\fHORSE_RIDING\u0010¢\u0006\u0012\u000f\n\nTUG_OF_WAR\u0010£\u0006\u0012\u000e\n\tHULA_HOOP\u0010¤\u0006\u0012\r\n\bFLY_KITE\u0010¥\u0006\u0012\f\n\u0007FISHING\u0010¦\u0006\u0012\f\n\u0007FRISBEE\u0010§\u0006\u0012\u000f\n\nEQUESTRIAN\u0010\u0090N\u0012\u0014\n\u000fTRACK_AND_FIELD\u0010\u0091N\u0012\u000f\n\nRACING_CAR\u0010\u0092N*ñ*\n\u0013SEInfoWearSportType\u0012\u0014\n\u0010SESportType_NONE\u0010\u0000\u0012\u001b\n\u0017SESportType_OUTSIDE_RUN\u0010\u0001\u0012\u001c\n\u0018SESportType_OUTSIDE_MOVE\u0010\u0002\u0012\u001a\n\u0016SESportType_INDOOR_RUN\u0010\u0003\u0012\u0015\n\u0011SESportType_CLIMB\u0010\u0004\u0012\u001d\n\u0019SESportType_CROSS_COUNTRY\u0010\u0005\u0012\u001d\n\u0019SESportType_OUTSIDE_CYCLE\u0010\u0006\u0012\u001c\n\u0018SESportType_INDOOR_CYCLE\u0010\u0007\u0012\u001a\n\u0016SESportType_FREE_SPORT\u0010\b\u0012\u001a\n\u0016SESportType_BASKETBALL\u0010\t\u0012\u0018\n\u0014SESportType_FOOTBALL\u0010\n\u0012\u001c\n\u0018SESportType_TABLE_TENNIS\u0010\u000b\u0012\u0019\n\u0015SESportType_BADMINTON\u0010\f\u0012\u001e\n\u001aSESportType_OUTSIDE_HIKING\u0010\r\u0012\u0013\n\u000fSESportType_BMX\u0010\u000e\u0012\u0017\n\u0013SESportType_HUNTING\u0010\u000f\u0012\u0017\n\u0013SESportType_SAILING\u0010\u0010\u0012\u001d\n\u0019SESportType_SKATEBOARDING\u0010\u0011\u0012\u001e\n\u001aSESportType_ROLLER_SKATING\u0010\u0012\u0012\u001f\n\u001bSESportType_OUTDOOR_SKATING\u0010\u0013\u0012\u001a\n\u0016SESportType_EQUESTRIAN\u0010\u0014\u0012!\n\u001dSESportType_INDOOR_SWIMMING_L\u0010\u0015\u0012\u001c\n\u0018SESportType_OPEN_WATER_L\u0010\u0016\u0012\u001d\n\u0019SESportType_CORE_TRAINING\u0010\u0017\u0012\u001d\n\u0019SESportType_MIXED_AEROBIC\u0010\u0018\u0012!\n\u001dSESportType_STRENGTH_TRAINING\u0010\u0019\u0012\u001a\n\u0016SESportType_STRETCHING\u0010\u001a\u0012 \n\u001cSESportType_CLIMBING_MACHINE\u0010\u001b\u0012\u0017\n\u0013SESportType_PILATES\u0010\u001c\u0012$\n SESportType_FLEXIBILITY_TRAINING\u0010\u001d\u0012\u001e\n\u001aSESportType_INDOOR_FITNESS\u0010\u001e\u0012\u0017\n\u0013SESportType_STEPPER\u0010\u001f\u0012\u001d\n\u0019SESportType_STEP_TRAINING\u0010 \u0012\u001a\n\u0016SESportType_GYMNASTICS\u0010!\u0012\u001a\n\u0016SESportType_ELLIPTICAL\u0010\"\u0012\u0014\n\u0010SESportType_YOGA\u0010#\u0012\u0017\n\u0013SESportType_FISHING\u0010$\u0012\u0017\n\u0013SESportType_CURLING\u0010%\u0012\u001e\n\u001aSESportType_INDOOR_SKATING\u0010&\u0012\u0017\n\u0013SESportType_CRICKET\u0010'\u0012\u0018\n\u0014SESportType_BASEBALL\u0010(\u0012\u0017\n\u0013SESportType_BOWLING\u0010)\u0012\u0016\n\u0012SESportType_SQUASH\u0010*\u0012\u0018\n\u0014SESportType_SOFTBALL\u0010+\u0012\u0017\n\u0013SESportType_CROQUET\u0010,\u0012\u001a\n\u0016SESportType_VOLLEYBALL\u0010-\u0012\u0018\n\u0014SESportType_HANDBALL\u0010.\u0012\u0016\n\u0012SESportType_BALLET\u0010/\u0012\u001b\n\u0017SESportType_BELLY_DANCE\u00100\u0012\u001c\n\u0018SESportType_SQUARE_DANCE\u00101\u0012\u001c\n\u0018SESportType_STREET_DANCE\u00102\u0012 \n\u001cSESportType_BALLROOM_DANCING\u00103\u0012\u0015\n\u0011SESportType_DANCE\u00104\u0012\u0015\n\u0011SESportType_ZUMBA\u00105\u0012\u0015\n\u0011SESportType_KENDO\u00106\u0012\u0016\n\u0012SESportType_KARATE\u00107\u0012\u0016\n\u0012SESportType_BOXING\u00108\u0012\u0014\n\u0010SESportType_JUDO\u00109\u0012\u0019\n\u0015SESportType_WRESTLING\u0010:\u0012\u0016\n\u0012SESportType_TAICHI\u0010;\u0012\u0019\n\u0015SESportType_MUAY_THAI\u0010<\u0012\u0019\n\u0015SESportType_TAEKWONDO\u0010=\u0012\u001c\n\u0018SESportType_MARTIAL_ARTS\u0010>\u0012\u001d\n\u0019SESportType_FREE_SPARRING\u0010?\u00120\n,SESportType_HIGH_INTENSITY_INTERVAL_TRAINING\u0010@\u0012\u0017\n\u0013SESportType_ARCHERY\u0010A\u0012\u001e\n\u001aSESportType_INDOOR_RUNNING\u0010B\u0012\u001c\n\u0018SESportType_PADDLE_BOARD\u0010C\u0012\u001a\n\u0016SESportType_WATER_POLO\u0010D\u0012\u001c\n\u0018SESportType_WATER_SPORTS\u0010E\u0012\u001c\n\u0018SESportType_WATER_SKIING\u0010F\u0012\u0018\n\u0014SESportType_KAYAKING\u0010G\u0012\u001d\n\u0019SESportType_KAYAK_RAFTING\u0010H\u0012\u0019\n\u0015SESportType_MOTORBOAT\u0010I\u0012\u001c\n\u0018SESportType_FIN_SWIMMING\u0010J\u0012\u0016\n\u0012SESportType_DIVING\u0010K\u0012%\n!SESportType_SYNCHRONIZED_SWIMMING\u0010L\u0012\u001a\n\u0016SESportType_SNORKELING\u0010M\u0012\u001c\n\u0018SESportType_KITE_SURFING\u0010N\u0012\u001d\n\u0019SESportType_ROCK_CLIMBING\u0010O\u0012\u0017\n\u0013SESportType_PARKOUR\u0010P\u0012\u0013\n\u000fSESportType_ATV\u0010Q\u0012\u001a\n\u0016SESportType_PARAGLIDER\u0010R\u0012\u001e\n\u001aSESportType_STAIR_CLIMBING\u0010S\u0012\u0018\n\u0014SESportType_CROSSFIT\u0010T\u0012\u0018\n\u0014SESportType_AEROBICS\u0010U\u0012!\n\u001dSESportType_PHYSICAL_TRAINING\u0010V\u0012\u0019\n\u0015SESportType_WALL_BALL\u0010W\u0012!\n\u001dSESportType_DUMBBELL_TRAINING\u0010X\u0012 \n\u001cSESportType_BARBELL_TRAINING\u0010Y\u0012\u001d\n\u0019SESportType_WEIGHTLIFTING\u0010Z\u0012\u0018\n\u0014SESportType_DEADLIFT\u0010[\u0012\u001a\n\u0016SESportType_BOBBY_JUMP\u0010\\\u0012\u0017\n\u0013SESportType_SIT_UPS\u0010]\u0012#\n\u001fSESportType_FUNCTIONAL_TRAINING\u0010^\u0012#\n\u001fSESportType_UPPER_LIMB_TRAINING\u0010_\u0012#\n\u001fSESportType_LOWER_LIMB_TRAINING\u0010`\u00123\n/SESportType_WAISESportType_AND_ABDOMEN_TRAINING\u0010a\u0012\u001d\n\u0019SESportType_BACK_TRAINING\u0010b\u0012\u001e\n\u001aSESportType_NATIONAL_DANCE\u0010c\u0012\u0014\n\u0010SESportType_JAZZ\u0010d\u0012\u001b\n\u0017SESportType_LATIN_DANCE\u0010e\u0012\u0017\n\u0013SESportType_FENCING\u0010f\u0012\u0015\n\u0011SESportType_RUGBY\u0010g\u0012\u0016\n\u0012SESportType_HOCKEY\u0010h\u0012\u0016\n\u0012SESportType_TENNIS\u0010i\u0012\u0019\n\u0015SESportType_BILLIARDS\u0010j\u0012\u001b\n\u0017SESportType_SHUTTLECOCK\u0010k\u0012\u001c\n\u0018SESportType_SEPAK_TAKRAW\u0010l\u0012\u001b\n\u0017SESportType_SNOW_SPORTS\u0010m\u0012\u001a\n\u0016SESportType_SNOWMOBILE\u0010n\u0012\u0014\n\u0010SESportType_PUCK\u0010o\u0012\u0018\n\u0014SESportType_SNOW_CAR\u0010p\u0012\u0014\n\u0010SESportType_SLED\u0010q\u0012\u0015\n\u0011SESportType_DARTS\u0010r\u0012\u001a\n\u0016SESportType_TUG_OF_WAR\u0010s\u0012\u0019\n\u0015SESportType_HULA_HOOP\u0010t\u0012\u001a\n\u0016SESportType_FLY_A_KITE\u0010u\u0012\u0017\n\u0013SESportType_FRISBEE\u0010v\u0012\u001f\n\u001bSESportType_TRACK_AND_FIELD\u0010w\u0012\u001a\n\u0016SESportType_RACING_CAR\u0010x\u0012 \n\u001cSESportType_ROWING_MACHINE_L\u0010y\u0012\u001f\n\u001bSESportType_ROPE_SKIPPING_L\u0010z\u0012\u001b\n\u0017SESportType_TRIATHLON_L\u0010{\u0012 \n\u001cSESportType_MOUNTAIN_CYCLING\u0010|\u0012\u001a\n\u0016SESportType_KICKBOXING\u0010}\u0012\u0016\n\u0012SESportType_SKIING\u0010~\u0012$\n SESportType_CROSS_COUNTRY_SKIING\u0010\u007f\u0012\u001d\n\u0018SESportType_SNOWBOARDING\u0010\u0080\u0001\u0012\u001e\n\u0019SESportType_ALPINE_SKIING\u0010\u0081\u0001\u0012$\n\u001fSESportType_DOUBLE_BOARD_SKIING\u0010\u0082\u0001\u0012\u001e\n\u0019SESportType_FREE_EXERCISE\u0010\u0083\u0001\u0012$\n\u001fSESportType_PADDLEBOARD_SURFING\u0010\u0084\u0001\u0012\u0018\n\u0013SESportType_KABADDI\u0010\u0085\u0001\u0012\u0015\n\u0010SESportType_Golf\u0010\u0086\u0001\u0012\u001f\n\u001aSESportType_INDOOR_WALKING\u0010\u0087\u0001\u0012\u001f\n\u001aSESportType_Table_football\u0010\u0088\u0001\u0012\u001d\n\u0018SESportType_Seven_stones\u0010\u0089\u0001\u0012\u0018\n\u0013SESportType_Kho_kho\u0010\u008a\u0001\u0012\u0019\n\u0014SESportType_Marathon\u0010\u008b\u0001\u0012\u001e\n\u0019SESportType_Jumping_Jacks\u0010\u008c\u0001\u0012\u001c\n\u0017SESportType_Pull_up_Bar\u0010\u008d\u0001\u0012\u001e\n\u0019SESportType_Parallel_Bars\u0010\u008e\u0001\u0012\u001a\n\u0015SESportType_High_Jump\u0010\u008f\u0001\u0012\u001a\n\u0015SESportType_Long_Jump\u0010\u0090\u0001\u0012\u0018\n\u0013SESportType_Pull_up\u0010\u0091\u0001\u0012\u0018\n\u0013SESportType_Push_up\u0010\u0092\u0001\u0012\u0016\n\u0011SESportType_Plank\u0010\u0093\u0001\u0012\u001d\n\u0018SESportType_Foam_Rolling\u0010\u0094\u0001\u0012\u001e\n\u0019SESportType_Fitness_Games\u0010\u0095\u0001\u0012$\n\u001fSESportType_Relaxing_Meditation\u0010\u0096\u0001\u0012\u001a\n\u0015SESportType_Treadmill\u0010\u0097\u0001\u0012\u0018\n\u0013SESportType_VO2_Max\u0010\u0098\u0001\u0012*\n%SESportType_Australian_Rules_Football\u0010\u0099\u0001\u0012\"\n\u001dSESportType_AmericanvFootball\u0010\u009a\u0001\u0012\u001b\n\u0016SESportType_Pickleball\u0010\u009b\u0001\u0012!\n\u001cSESportType_Snowboarding_156\u0010\u009c\u0001\u0012!\n\u001cSESportType_Group_Gymnastics\u0010\u009d\u0001\u0012 \n\u001bSESportType_Combat_Aerobics\u0010\u009e\u0001\u0012\u001f\n\u001aSESportType_Bungee_Jumping\u0010\u009f\u0001\u0012\u001d\n\u0018SESportType_Kick_Scooter\u0010 \u0001\u0012\u001d\n\u0018SESportType_Balance_Bike\u0010¡\u0001\u0012\u001f\n\u001aSESportType_Leisure_Sports\u0010¢\u0001\u0012\u0019\n\u0014SESportType_Shooting\u0010£\u0001\u0012\u001b\n\u0016SESportType_Trampoline\u0010¤\u0001\u0012\u001d\n\u0018SESportType_Field_Hockey\u0010¥\u0001\u0012!\n\u001cSESportType_Outdoor_Football\u0010¦\u0001\u0012\u001b\n\u0016SESportType_OPEN_WATER\u0010Ç\u0001\u0012\"\n\u001dSESportType_INDOOR_SWIMMING_H\u0010È\u0001\u0012#\n\u001eSESportType_OUTSIDE_SWIMMING_H\u0010É\u0001\u0012!\n\u001cSESportType_ROWING_MACHINE_H\u0010Ê\u0001\u0012 \n\u001bSESportType_ROPE_SKIPPING_H\u0010Ë\u0001\u0012\u001c\n\u0017SESportType_TRIATHLON_H\u0010Ì\u0001\u0012#\n\u001eSESportType_Outdoor_football_H\u0010Í\u0001\u0012$\n\u001fSESportType_Indoor_running_Ring\u0010Î\u0001\u0012%\n SESportType_Outdoor_running_Ring\u0010Ï\u0001\u0012%\n SESportType_Outdoor_Walking_Ring\u0010Ð\u0001\u0012$\n\u001fSESportType_Indoor_cycling_Ring\u0010Ñ\u0001\u0012%\n SESportType_Outdoor_cycling_Ring\u0010Ò\u0001\u0012\u001f\n\u001aSESportType_Badminton_Ring\u0010Ó\u0001\u0012\u001c\n\u0017SESportType_Tennis_Ring\u0010Ô\u0001\u0012\u001c\n\u0017SESportType_Soccer_Ring\u0010Õ\u0001\u0012\u001d\n\u0018SESportType_Cricket_Ring\u0010Ö\u0001\u0012\u001a\n\u0015SESportType_Yoga_Ring\u0010×\u0001*K\n\rSEGpsAccuracy\u0012\u000b\n\u0007GPS_LOW\u0010\u0000\u0012\u000e\n\nGPS_MEDIUM\u0010\u0001\u0012\f\n\bGPS_HIGH\u0010\u0002\u0012\u000f\n\u000bGPS_UNKNOWN\u0010\nB*\n\u0018com.zh.ble.wear.protobufB\u000eSportingProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SESporting_descriptor = messageType;
        internal_static_SESporting_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"SportStatus", "SportRequest", "SportResponse", "PhoneSportData", "WearSportData", "EcgData", "EcgCalibrationData", "AppMessageType", "AutoSportDataList", "RingSportParamData", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SESportStatus_descriptor = messageType2;
        internal_static_SESportStatus_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"SportType", "Timestamp", "Duration", "Paused", "Standalone", "SelectVersion", "AppLaunched"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SESportRequest_descriptor = messageType3;
        internal_static_SESportRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"Timestamp", "SportType", "State", "SupportVersions", "ErrorCode"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SESportResponse_descriptor = messageType4;
        internal_static_SESportResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"Code", "SportStatus", "GpsAccuracy", "SelectVersion"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SEPhoneSportData_descriptor = messageType5;
        internal_static_SEPhoneSportData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"GpsAccuracy", "Timestamp", "Longitude", "Latitude", "Altitude", "Speed", "Bearing", "HorizontalAccuracy", "VerticalAccuracy", "GpsCoordinateSystemType"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SEWearSportData_descriptor = messageType6;
        internal_static_SEWearSportData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"HeartRate", "Calories", "Steps", "Distance", "SportTimestamp", "SportLevel"});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SEEcgCalibrationData_descriptor = messageType7;
        internal_static_SEEcgCalibrationData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"EcgCalibrationState", "EcgCalibrationMode", "EcgLevelCalibration", "EcgCalibrationHeart", "EcgCalibrationSystolic", "EcgCalibrationDiastolic"});
        Descriptors.Descriptor messageType8 = getDescriptor().getMessageType(7);
        internal_static_SEEcgReportData_descriptor = messageType8;
        internal_static_SEEcgReportData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType8, new String[]{"EcgHeart", "EcgSystolic", "EcgDiastolic", "EcgHrvResult", "EcgHealthIndex", "EcgFatigueIndex", "EcgBodyLoad", "EcgBodyQuality", "EcgCardiacFunction"});
        Descriptors.Descriptor messageType9 = getDescriptor().getMessageType(8);
        internal_static_SEEcgData_descriptor = messageType9;
        internal_static_SEEcgData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType9, new String[]{"EcgCommand", "EcgRespond", "EcgEndResult", "EcgDataIndex", "EcgData", "EcgCalibrationData", "EcgMode", "EcgReportData"});
        Descriptors.Descriptor messageType10 = getDescriptor().getMessageType(9);
        internal_static_SEAppMessageType_descriptor = messageType10;
        internal_static_SEAppMessageType_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType10, new String[]{"MeasureType", "SwitchMeasure", "WristStatus", "MeasureValue", "MeasureTime", "ErrorReason"});
        Descriptors.Descriptor messageType11 = getDescriptor().getMessageType(10);
        internal_static_SEAutoSportData_descriptor = messageType11;
        internal_static_SEAutoSportData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType11, new String[]{"AutosportType", "AutosportStarttime", "AutosportDuration", "AutosportSteps", "AutosportIntensity", "AutosportKcal", "HrData"});
        Descriptors.Descriptor nestedType = messageType11.getNestedType(0);
        internal_static_SEAutoSportData_SEList_descriptor = nestedType;
        internal_static_SEAutoSportData_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType12 = getDescriptor().getMessageType(11);
        internal_static_SERingSportStatusData_descriptor = messageType12;
        internal_static_SERingSportStatusData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType12, new String[]{"IsSportNoSync", "IsSportIng", "SportEndStatus", "SportStatus", "SportStartStatus", "StartsportType", "StartsportCurtime", "StartsportDuration"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private SportingProtos() {
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