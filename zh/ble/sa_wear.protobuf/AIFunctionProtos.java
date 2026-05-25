package com.zh.ble.sa_wear.protobuf;

import androidx.datastore.preferences.protobuf.MessageLiteToString;
import androidx.media3.exoplayer.dash.manifest.UrlTemplate;
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import com.zh.ble.sa_wear.protobuf.CommonProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class AIFunctionProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SEAIClockInfo_SEAIData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAIClockInfo_SEAIData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAIClockInfo_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAIClockInfo_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAIClockInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAIClockInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAIErrorCodeInfo_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAIErrorCodeInfo_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAIErrorCodeInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAIErrorCodeInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAIFunction_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAIFunction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAIScreenSetting_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAIScreenSetting_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEHistoryTemplateUI_ChartDataList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEHistoryTemplateUI_ChartDataList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEHistoryTemplateUI_ChartData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEHistoryTemplateUI_ChartData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEHistoryTemplateUI_SESummary_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEHistoryTemplateUI_SESummary_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEHistoryTemplateUI_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEHistoryTemplateUI_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEOpenAppFunction_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEOpenAppFunction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SESetActionTemplate_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SESetActionTemplate_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEToggleTemplateUI_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEToggleTemplateUI_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEViewTemplateUI_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEViewTemplateUI_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEVoiceCmd_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEVoiceCmd_fieldAccessorTable;

    public static final class SEAIClockInfo extends GeneratedMessage implements SEAIClockInfoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final SEAIClockInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<SEAIClockInfo> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SEAIData data_;
        private int id_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEAIClockInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEAIClockInfo> {
            @Override // com.google.protobuf.Parser
            public SEAIClockInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEAIClockInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAIClockInfoOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> dataBuilder_;
            private SEAIData data_;
            private int id_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEAIClockInfo sEAIClockInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAIClockInfo.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                    sEAIClockInfo.data_ = singleFieldBuilder == null ? this.data_ : (SEAIData) singleFieldBuilder.build();
                    i7 |= 2;
                }
                sEAIClockInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEAIClockInfo_descriptor;
            }

            private SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> internalGetDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new SingleFieldBuilder<>(getData(), getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetDataFieldBuilder();
                }
            }

            public Builder clearData() {
                this.bitField0_ &= -3;
                this.data_ = null;
                SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.dataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
            public SEAIData getData() {
                SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAIData) singleFieldBuilder.getMessage();
                }
                SEAIData sEAIData = this.data_;
                return sEAIData == null ? SEAIData.getDefaultInstance() : sEAIData;
            }

            public SEAIData.Builder getDataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SEAIData.Builder) internalGetDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
            public SEAIDataOrBuilder getDataOrBuilder() {
                SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAIDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEAIData sEAIData = this.data_;
                return sEAIData == null ? SEAIData.getDefaultInstance() : sEAIData;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEAIClockInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEAIClockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIClockInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasId()) {
                    return !hasData() || getData().isInitialized();
                }
                return false;
            }

            public Builder mergeData(SEAIData sEAIData) {
                SEAIData sEAIData2;
                SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEAIData);
                } else if ((this.bitField0_ & 2) == 0 || (sEAIData2 = this.data_) == null || sEAIData2 == SEAIData.getDefaultInstance()) {
                    this.data_ = sEAIData;
                } else {
                    getDataBuilder().mergeFrom(sEAIData);
                }
                if (this.data_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setData(SEAIData sEAIData) {
                SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder == null) {
                    sEAIData.getClass();
                    this.data_ = sEAIData;
                } else {
                    singleFieldBuilder.setMessage(sEAIData);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(int i7) {
                this.id_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAIClockInfo build() {
                SEAIClockInfo sEAIClockInfoBuildPartial = buildPartial();
                if (sEAIClockInfoBuildPartial.isInitialized()) {
                    return sEAIClockInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAIClockInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAIClockInfo buildPartial() {
                SEAIClockInfo sEAIClockInfo = new SEAIClockInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAIClockInfo);
                }
                onBuilt();
                return sEAIClockInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAIClockInfo getDefaultInstanceForType() {
                return SEAIClockInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.data_ = null;
                SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.dataBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAIClockInfo) {
                    return mergeFrom((SEAIClockInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(SEAIData.Builder builder) {
                SingleFieldBuilder<SEAIData, SEAIData.Builder, SEAIDataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder == null) {
                    this.data_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEAIClockInfo sEAIClockInfo) {
                if (sEAIClockInfo == SEAIClockInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEAIClockInfo.hasId()) {
                    setId(sEAIClockInfo.getId());
                }
                if (sEAIClockInfo.hasData()) {
                    mergeData(sEAIClockInfo.getData());
                }
                mergeUnknownFields(sEAIClockInfo.getUnknownFields());
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
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

        public enum SEAIClockLabel implements ProtocolMessageEnum {
            AI_ALARM_CLOCK(0),
            AI_GET_UP(1),
            AI_MEETING(2),
            AI_APPOINTMENT(3),
            AI_DINNER_PARTY(4);

            public static final int AI_ALARM_CLOCK_VALUE = 0;
            public static final int AI_APPOINTMENT_VALUE = 3;
            public static final int AI_DINNER_PARTY_VALUE = 4;
            public static final int AI_GET_UP_VALUE = 1;
            public static final int AI_MEETING_VALUE = 2;
            private static final SEAIClockLabel[] VALUES;
            private static final Internal.EnumLiteMap<SEAIClockLabel> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEAIClockInfo$SEAIClockLabel$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEAIClockLabel> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEAIClockLabel findValueByNumber(int i7) {
                    return SEAIClockLabel.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAIClockLabel");
                internalValueMap = new Internal.EnumLiteMap<SEAIClockLabel>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIClockLabel.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEAIClockLabel findValueByNumber(int i7) {
                        return SEAIClockLabel.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEAIClockLabel(int i7) {
                this.value = i7;
            }

            public static SEAIClockLabel forNumber(int i7) {
                if (i7 == 0) {
                    return AI_ALARM_CLOCK;
                }
                if (i7 == 1) {
                    return AI_GET_UP;
                }
                if (i7 == 2) {
                    return AI_MEETING;
                }
                if (i7 == 3) {
                    return AI_APPOINTMENT;
                }
                if (i7 != 4) {
                    return null;
                }
                return AI_DINNER_PARTY;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEAIClockInfo.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SEAIClockLabel> internalGetValueMap() {
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
            public static SEAIClockLabel valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEAIClockLabel valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static final class SEAIData extends GeneratedMessage implements SEAIDataOrBuilder {
            public static final int CLOCK_LABEL_FIELD_NUMBER = 5;
            public static final int CLOCK_NAME_FIELD_NUMBER = 4;
            private static final SEAIData DEFAULT_INSTANCE;
            public static final int ENABLE_FIELD_NUMBER = 3;
            private static final Parser<SEAIData> PARSER;
            public static final int TIME_FIELD_NUMBER = 1;
            public static final int WEEK_DAYS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int clockLabel_;
            private volatile Object clockName_;
            private boolean enable_;
            private byte memoizedIsInitialized;
            private CommonProtos.SESettingTime time_;
            private int weekDays_;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEAIClockInfo$SEAIData$1 */
            public class AnonymousClass1 extends AbstractParser<SEAIData> {
                @Override // com.google.protobuf.Parser
                public SEAIData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAIData.newBuilder();
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

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAIDataOrBuilder {
                private int bitField0_;
                private int clockLabel_;
                private Object clockName_;
                private boolean enable_;
                private SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> timeBuilder_;
                private CommonProtos.SESettingTime time_;
                private int weekDays_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEAIData sEAIData) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                        sEAIData.time_ = singleFieldBuilder == null ? this.time_ : (CommonProtos.SESettingTime) singleFieldBuilder.build();
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        sEAIData.weekDays_ = this.weekDays_;
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        sEAIData.enable_ = this.enable_;
                        i7 |= 4;
                    }
                    if ((i8 & 8) != 0) {
                        sEAIData.clockName_ = this.clockName_;
                        i7 |= 8;
                    }
                    if ((i8 & 16) != 0) {
                        sEAIData.clockLabel_ = this.clockLabel_;
                        i7 |= 16;
                    }
                    sEAIData.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEAIData_descriptor;
                }

                private SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> internalGetTimeFieldBuilder() {
                    if (this.timeBuilder_ == null) {
                        this.timeBuilder_ = new SingleFieldBuilder<>(getTime(), getParentForChildren(), isClean());
                        this.time_ = null;
                    }
                    return this.timeBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        internalGetTimeFieldBuilder();
                    }
                }

                public Builder clearClockLabel() {
                    this.bitField0_ &= -17;
                    this.clockLabel_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearClockName() {
                    this.clockName_ = SEAIData.getDefaultInstance().getClockName();
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearEnable() {
                    this.bitField0_ &= -5;
                    this.enable_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearTime() {
                    this.bitField0_ &= -2;
                    this.time_ = null;
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.timeBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearWeekDays() {
                    this.bitField0_ &= -3;
                    this.weekDays_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public SEAIClockLabel getClockLabel() {
                    SEAIClockLabel sEAIClockLabelForNumber = SEAIClockLabel.forNumber(this.clockLabel_);
                    return sEAIClockLabelForNumber == null ? SEAIClockLabel.AI_ALARM_CLOCK : sEAIClockLabelForNumber;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public String getClockName() {
                    Object obj = this.clockName_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.clockName_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public ByteString getClockNameBytes() {
                    Object obj = this.clockName_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.clockName_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEAIData_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public boolean getEnable() {
                    return this.enable_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public CommonProtos.SESettingTime getTime() {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SESettingTime) singleFieldBuilder.getMessage();
                    }
                    CommonProtos.SESettingTime sESettingTime = this.time_;
                    return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
                }

                public CommonProtos.SESettingTime.Builder getTimeBuilder() {
                    this.bitField0_ |= 1;
                    onChanged();
                    return (CommonProtos.SESettingTime.Builder) internalGetTimeFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public CommonProtos.SESettingTimeOrBuilder getTimeOrBuilder() {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SESettingTimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    CommonProtos.SESettingTime sESettingTime = this.time_;
                    return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public int getWeekDays() {
                    return this.weekDays_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public boolean hasClockLabel() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public boolean hasClockName() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public boolean hasEnable() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public boolean hasTime() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
                public boolean hasWeekDays() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEAIData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIData.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasTime() && hasEnable() && hasClockName() && getTime().isInitialized();
                }

                public Builder mergeTime(CommonProtos.SESettingTime sESettingTime) {
                    CommonProtos.SESettingTime sESettingTime2;
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sESettingTime);
                    } else if ((this.bitField0_ & 1) == 0 || (sESettingTime2 = this.time_) == null || sESettingTime2 == CommonProtos.SESettingTime.getDefaultInstance()) {
                        this.time_ = sESettingTime;
                    } else {
                        getTimeBuilder().mergeFrom(sESettingTime);
                    }
                    if (this.time_ != null) {
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    return this;
                }

                public Builder setClockLabel(SEAIClockLabel sEAIClockLabel) {
                    sEAIClockLabel.getClass();
                    this.bitField0_ |= 16;
                    this.clockLabel_ = sEAIClockLabel.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setClockName(String str) {
                    str.getClass();
                    this.clockName_ = str;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setClockNameBytes(ByteString byteString) {
                    byteString.getClass();
                    this.clockName_ = byteString;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setEnable(boolean z6) {
                    this.enable_ = z6;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setTime(CommonProtos.SESettingTime sESettingTime) {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder == null) {
                        sESettingTime.getClass();
                        this.time_ = sESettingTime;
                    } else {
                        singleFieldBuilder.setMessage(sESettingTime);
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setWeekDays(int i7) {
                    this.weekDays_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                private Builder() {
                    this.clockName_ = "";
                    this.clockLabel_ = 0;
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEAIData build() {
                    SEAIData sEAIDataBuildPartial = buildPartial();
                    if (sEAIDataBuildPartial.isInitialized()) {
                        return sEAIDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAIDataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SEAIData buildPartial() {
                    SEAIData sEAIData = new SEAIData(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(sEAIData);
                    }
                    onBuilt();
                    return sEAIData;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SEAIData getDefaultInstanceForType() {
                    return SEAIData.getDefaultInstance();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.time_ = null;
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.timeBuilder_ = null;
                    }
                    this.weekDays_ = 0;
                    this.enable_ = false;
                    this.clockName_ = "";
                    this.clockLabel_ = 0;
                    return this;
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.clockName_ = "";
                    this.clockLabel_ = 0;
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SEAIData) {
                        return mergeFrom((SEAIData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setTime(CommonProtos.SESettingTime.Builder builder) {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    if (singleFieldBuilder == null) {
                        this.time_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(SEAIData sEAIData) {
                    if (sEAIData == SEAIData.getDefaultInstance()) {
                        return this;
                    }
                    if (sEAIData.hasTime()) {
                        mergeTime(sEAIData.getTime());
                    }
                    if (sEAIData.hasWeekDays()) {
                        setWeekDays(sEAIData.getWeekDays());
                    }
                    if (sEAIData.hasEnable()) {
                        setEnable(sEAIData.getEnable());
                    }
                    if (sEAIData.hasClockName()) {
                        this.clockName_ = sEAIData.clockName_;
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    if (sEAIData.hasClockLabel()) {
                        setClockLabel(sEAIData.getClockLabel());
                    }
                    mergeUnknownFields(sEAIData.getUnknownFields());
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
                                        codedInputStream.readMessage(internalGetTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 1;
                                    } else if (tag == 16) {
                                        this.weekDays_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 24) {
                                        this.enable_ = codedInputStream.readBool();
                                        this.bitField0_ |= 4;
                                    } else if (tag == 34) {
                                        this.clockName_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 8;
                                    } else if (tag != 40) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int i7 = codedInputStream.readEnum();
                                        if (SEAIClockLabel.forNumber(i7) == null) {
                                            mergeUnknownVarintField(5, i7);
                                        } else {
                                            this.clockLabel_ = i7;
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

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAIData");
                DEFAULT_INSTANCE = new SEAIData();
                PARSER = new AbstractParser<SEAIData>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIData.1
                    @Override // com.google.protobuf.Parser
                    public SEAIData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = SEAIData.newBuilder();
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

            public /* synthetic */ SEAIData(GeneratedMessage.Builder builder, a aVar) {
                this(builder);
            }

            public static SEAIData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEAIData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SEAIData parseDelimitedFrom(InputStream inputStream) {
                return (SEAIData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SEAIData parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<SEAIData> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SEAIData)) {
                    return super.equals(obj);
                }
                SEAIData sEAIData = (SEAIData) obj;
                if (hasTime() != sEAIData.hasTime()) {
                    return false;
                }
                if ((hasTime() && !getTime().equals(sEAIData.getTime())) || hasWeekDays() != sEAIData.hasWeekDays()) {
                    return false;
                }
                if ((hasWeekDays() && getWeekDays() != sEAIData.getWeekDays()) || hasEnable() != sEAIData.hasEnable()) {
                    return false;
                }
                if ((hasEnable() && getEnable() != sEAIData.getEnable()) || hasClockName() != sEAIData.hasClockName()) {
                    return false;
                }
                if ((!hasClockName() || getClockName().equals(sEAIData.getClockName())) && hasClockLabel() == sEAIData.hasClockLabel()) {
                    return (!hasClockLabel() || this.clockLabel_ == sEAIData.clockLabel_) && getUnknownFields().equals(sEAIData.getUnknownFields());
                }
                return false;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public SEAIClockLabel getClockLabel() {
                SEAIClockLabel sEAIClockLabelForNumber = SEAIClockLabel.forNumber(this.clockLabel_);
                return sEAIClockLabelForNumber == null ? SEAIClockLabel.AI_ALARM_CLOCK : sEAIClockLabelForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public String getClockName() {
                Object obj = this.clockName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.clockName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public ByteString getClockNameBytes() {
                Object obj = this.clockName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.clockName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEAIData_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public boolean getEnable() {
                return this.enable_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<SEAIData> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTime()) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.weekDays_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeBoolSize(3, this.enable_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeMessageSize += GeneratedMessage.computeStringSize(4, this.clockName_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeEnumSize(5, this.clockLabel_);
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public CommonProtos.SESettingTime getTime() {
                CommonProtos.SESettingTime sESettingTime = this.time_;
                return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public CommonProtos.SESettingTimeOrBuilder getTimeOrBuilder() {
                CommonProtos.SESettingTime sESettingTime = this.time_;
                return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public int getWeekDays() {
                return this.weekDays_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public boolean hasClockLabel() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public boolean hasClockName() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public boolean hasEnable() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public boolean hasTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEAIDataOrBuilder
            public boolean hasWeekDays() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasTime()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTime().hashCode();
                }
                if (hasWeekDays()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getWeekDays();
                }
                if (hasEnable()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getEnable());
                }
                if (hasClockName()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getClockName().hashCode();
                }
                if (hasClockLabel()) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + this.clockLabel_;
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEAIData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIData.class, Builder.class);
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
                if (!hasTime()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasEnable()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasClockName()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (getTime().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(1, getTime());
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeUInt32(2, this.weekDays_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeBool(3, this.enable_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 4, this.clockName_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeEnum(5, this.clockLabel_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private SEAIData(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.weekDays_ = 0;
                this.enable_ = false;
                this.clockName_ = "";
                this.clockLabel_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SEAIData sEAIData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAIData);
            }

            public static SEAIData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static SEAIData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEAIData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEAIData parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAIData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SEAIData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static SEAIData parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static SEAIData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static SEAIData parseFrom(InputStream inputStream) {
                return (SEAIData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            private SEAIData() {
                this.weekDays_ = 0;
                this.enable_ = false;
                this.clockName_ = "";
                this.clockLabel_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.clockName_ = "";
                this.clockLabel_ = 0;
            }

            public static SEAIData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEAIData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SEAIData parseFrom(CodedInputStream codedInputStream) {
                return (SEAIData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static SEAIData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SEAIData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface SEAIDataOrBuilder extends MessageOrBuilder {
            SEAIClockLabel getClockLabel();

            String getClockName();

            ByteString getClockNameBytes();

            boolean getEnable();

            CommonProtos.SESettingTime getTime();

            CommonProtos.SESettingTimeOrBuilder getTimeOrBuilder();

            int getWeekDays();

            boolean hasClockLabel();

            boolean hasClockName();

            boolean hasEnable();

            boolean hasTime();

            boolean hasWeekDays();
        }

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            public static final int SUPPORT_MAX_CLOCKS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private List<SEAIClockInfo> list_;
            private byte memoizedIsInitialized;
            private int supportMaxClocks_;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEAIClockInfo$SEList$1 */
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
                private RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> listBuilder_;
                private List<SEAIClockInfo> list_;
                private int supportMaxClocks_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                    int i7;
                    if ((this.bitField0_ & 2) != 0) {
                        sEList.supportMaxClocks_ = this.supportMaxClocks_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    sEList.bitField0_ = i7 | sEList.bitField0_;
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEAIClockInfo> iterable) {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEAIClockInfo sEAIClockInfo) {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEAIClockInfo);
                        return this;
                    }
                    sEAIClockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEAIClockInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEAIClockInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSupportMaxClocks() {
                    this.bitField0_ &= -3;
                    this.supportMaxClocks_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
                public SEAIClockInfo getList(int i7) {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEAIClockInfo) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
                public List<SEAIClockInfo> getListList() {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
                public SEAIClockInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEAIClockInfoOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
                public List<? extends SEAIClockInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
                public int getSupportMaxClocks() {
                    return this.supportMaxClocks_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
                public boolean hasSupportMaxClocks() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEAIClockInfo sEAIClockInfo) {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEAIClockInfo);
                        return this;
                    }
                    sEAIClockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEAIClockInfo);
                    onChanged();
                    return this;
                }

                public Builder setSupportMaxClocks(int i7) {
                    this.supportMaxClocks_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(a aVar) {
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
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEAIClockInfo.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    this.supportMaxClocks_ = 0;
                    return this;
                }

                public Builder addList(int i7, SEAIClockInfo sEAIClockInfo) {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEAIClockInfo.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEAIClockInfo);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEAIClockInfo);
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
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    if (sEList.hasSupportMaxClocks()) {
                        setSupportMaxClocks(sEList.getSupportMaxClocks());
                    }
                    mergeUnknownFields(sEList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                    if (tag == 10) {
                                        SEAIClockInfo sEAIClockInfo = (SEAIClockInfo) codedInputStream.readMessage(SEAIClockInfo.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEAIClockInfo, Builder, SEAIClockInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEAIClockInfo);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEAIClockInfo);
                                        }
                                    } else if (tag != 16) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.supportMaxClocks_ = codedInputStream.readUInt32();
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, a aVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEList_descriptor;
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
                if (getListList().equals(sEList.getListList()) && hasSupportMaxClocks() == sEList.hasSupportMaxClocks()) {
                    return (!hasSupportMaxClocks() || getSupportMaxClocks() == sEList.getSupportMaxClocks()) && getUnknownFields().equals(sEList.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
            public SEAIClockInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
            public List<SEAIClockInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
            public SEAIClockInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
            public List<? extends SEAIClockInfoOrBuilder> getListOrBuilderList() {
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
                int iComputeUInt32Size = iComputeMessageSizeNoTag + size;
                if ((this.bitField0_ & 1) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.supportMaxClocks_);
                }
                int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
            public int getSupportMaxClocks() {
                return this.supportMaxClocks_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.SEListOrBuilder
            public boolean hasSupportMaxClocks() {
                return (this.bitField0_ & 1) != 0;
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
                if (hasSupportMaxClocks()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getSupportMaxClocks();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEAIClockInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeUInt32(2, this.supportMaxClocks_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.supportMaxClocks_ = 0;
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

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private SEList() {
                this.supportMaxClocks_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
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
            SEAIClockInfo getList(int i7);

            int getListCount();

            List<SEAIClockInfo> getListList();

            SEAIClockInfoOrBuilder getListOrBuilder(int i7);

            List<? extends SEAIClockInfoOrBuilder> getListOrBuilderList();

            int getSupportMaxClocks();

            boolean hasSupportMaxClocks();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAIClockInfo");
            DEFAULT_INSTANCE = new SEAIClockInfo();
            PARSER = new AbstractParser<SEAIClockInfo>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfo.1
                @Override // com.google.protobuf.Parser
                public SEAIClockInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAIClockInfo.newBuilder();
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

        public /* synthetic */ SEAIClockInfo(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEAIClockInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SEAIClockInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAIClockInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEAIClockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAIClockInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAIClockInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAIClockInfo)) {
                return super.equals(obj);
            }
            SEAIClockInfo sEAIClockInfo = (SEAIClockInfo) obj;
            if (hasId() != sEAIClockInfo.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == sEAIClockInfo.getId()) && hasData() == sEAIClockInfo.hasData()) {
                return (!hasData() || getData().equals(sEAIClockInfo.getData())) && getUnknownFields().equals(sEAIClockInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
        public SEAIData getData() {
            SEAIData sEAIData = this.data_;
            return sEAIData == null ? SEAIData.getDefaultInstance() : sEAIData;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
        public SEAIDataOrBuilder getDataOrBuilder() {
            SEAIData sEAIData = this.data_;
            return sEAIData == null ? SEAIData.getDefaultInstance() : sEAIData;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SEAIClockInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAIClockInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getData());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIClockInfoOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
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
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AIFunctionProtos.internal_static_SA_SEAIClockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIClockInfo.class, Builder.class);
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
            if (!hasData() || getData().isInitialized()) {
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
                codedOutputStream.writeMessage(2, getData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEAIClockInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAIClockInfo sEAIClockInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAIClockInfo);
        }

        public static SEAIClockInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAIClockInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIClockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAIClockInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAIClockInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAIClockInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEAIClockInfo() {
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEAIClockInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAIClockInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAIClockInfo parseFrom(InputStream inputStream) {
            return (SEAIClockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAIClockInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIClockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAIClockInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEAIClockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAIClockInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIClockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAIClockInfoOrBuilder extends MessageOrBuilder {
        SEAIClockInfo.SEAIData getData();

        SEAIClockInfo.SEAIDataOrBuilder getDataOrBuilder();

        int getId();

        boolean hasData();

        boolean hasId();
    }

    public static final class SEAIErrorCodeInfo extends GeneratedMessage implements SEAIErrorCodeInfoOrBuilder {
        public static final int AI_ERROR_CODE_FIELD_NUMBER = 1;
        public static final int AI_ERROR_STRING_FIELD_NUMBER = 2;
        private static final SEAIErrorCodeInfo DEFAULT_INSTANCE;
        private static final Parser<SEAIErrorCodeInfo> PARSER;
        private static final long serialVersionUID = 0;
        private int aiErrorCode_;
        private SEList aiErrorString_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEAIErrorCodeInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEAIErrorCodeInfo> {
            @Override // com.google.protobuf.Parser
            public SEAIErrorCodeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEAIErrorCodeInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAIErrorCodeInfoOrBuilder {
            private int aiErrorCode_;
            private SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> aiErrorStringBuilder_;
            private SEList aiErrorString_;
            private int bitField0_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEAIErrorCodeInfo sEAIErrorCodeInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAIErrorCodeInfo.aiErrorCode_ = this.aiErrorCode_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.aiErrorStringBuilder_;
                    sEAIErrorCodeInfo.aiErrorString_ = singleFieldBuilder == null ? this.aiErrorString_ : (SEList) singleFieldBuilder.build();
                    i7 |= 2;
                }
                sEAIErrorCodeInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_descriptor;
            }

            private SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> internalGetAiErrorStringFieldBuilder() {
                if (this.aiErrorStringBuilder_ == null) {
                    this.aiErrorStringBuilder_ = new SingleFieldBuilder<>(getAiErrorString(), getParentForChildren(), isClean());
                    this.aiErrorString_ = null;
                }
                return this.aiErrorStringBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetAiErrorStringFieldBuilder();
                }
            }

            public Builder clearAiErrorCode() {
                this.bitField0_ &= -2;
                this.aiErrorCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAiErrorString() {
                this.bitField0_ &= -3;
                this.aiErrorString_ = null;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.aiErrorStringBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.aiErrorStringBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
            public int getAiErrorCode() {
                return this.aiErrorCode_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
            public SEList getAiErrorString() {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.aiErrorStringBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEList) singleFieldBuilder.getMessage();
                }
                SEList sEList = this.aiErrorString_;
                return sEList == null ? SEList.getDefaultInstance() : sEList;
            }

            public SEList.Builder getAiErrorStringBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SEList.Builder) internalGetAiErrorStringFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
            public SEListOrBuilder getAiErrorStringOrBuilder() {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.aiErrorStringBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEList sEList = this.aiErrorString_;
                return sEList == null ? SEList.getDefaultInstance() : sEList;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
            public boolean hasAiErrorCode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
            public boolean hasAiErrorString() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIErrorCodeInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAiErrorCode();
            }

            public Builder mergeAiErrorString(SEList sEList) {
                SEList sEList2;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.aiErrorStringBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 2) == 0 || (sEList2 = this.aiErrorString_) == null || sEList2 == SEList.getDefaultInstance()) {
                    this.aiErrorString_ = sEList;
                } else {
                    getAiErrorStringBuilder().mergeFrom(sEList);
                }
                if (this.aiErrorString_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setAiErrorCode(int i7) {
                this.aiErrorCode_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAiErrorString(SEList sEList) {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.aiErrorStringBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.aiErrorString_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAIErrorCodeInfo build() {
                SEAIErrorCodeInfo sEAIErrorCodeInfoBuildPartial = buildPartial();
                if (sEAIErrorCodeInfoBuildPartial.isInitialized()) {
                    return sEAIErrorCodeInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAIErrorCodeInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAIErrorCodeInfo buildPartial() {
                SEAIErrorCodeInfo sEAIErrorCodeInfo = new SEAIErrorCodeInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAIErrorCodeInfo);
                }
                onBuilt();
                return sEAIErrorCodeInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAIErrorCodeInfo getDefaultInstanceForType() {
                return SEAIErrorCodeInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.aiErrorCode_ = 0;
                this.aiErrorString_ = null;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.aiErrorStringBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.aiErrorStringBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAIErrorCodeInfo) {
                    return mergeFrom((SEAIErrorCodeInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAiErrorString(SEList.Builder builder) {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.aiErrorStringBuilder_;
                if (singleFieldBuilder == null) {
                    this.aiErrorString_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEAIErrorCodeInfo sEAIErrorCodeInfo) {
                if (sEAIErrorCodeInfo == SEAIErrorCodeInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEAIErrorCodeInfo.hasAiErrorCode()) {
                    setAiErrorCode(sEAIErrorCodeInfo.getAiErrorCode());
                }
                if (sEAIErrorCodeInfo.hasAiErrorString()) {
                    mergeAiErrorString(sEAIErrorCodeInfo.getAiErrorString());
                }
                mergeUnknownFields(sEAIErrorCodeInfo.getUnknownFields());
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
                                    this.aiErrorCode_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetAiErrorStringFieldBuilder().getBuilder(), extensionRegistryLite);
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private LazyStringArrayList list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEAIErrorCodeInfo$SEList$1 */
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
                private LazyStringArrayList list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_.makeImmutable();
                        sEList.list_ = this.list_;
                    }
                }

                private void ensureListIsMutable() {
                    if (!this.list_.isModifiable()) {
                        this.list_ = new LazyStringArrayList((LazyStringList) this.list_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_SEList_descriptor;
                }

                public Builder addAllList(Iterable<String> iterable) {
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addList(String str) {
                    str.getClass();
                    ensureListIsMutable();
                    this.list_.add(str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addListBytes(ByteString byteString) {
                    byteString.getClass();
                    ensureListIsMutable();
                    this.list_.add(byteString);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    this.list_ = LazyStringArrayList.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.SEListOrBuilder
                public String getList(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.SEListOrBuilder
                public ByteString getListBytes(int i7) {
                    return this.list_.getByteString(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.SEListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, String str) {
                    str.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.SEListOrBuilder
                public ProtocolStringList getListList() {
                    this.list_.makeImmutable();
                    return this.list_;
                }

                private Builder() {
                    this.list_ = LazyStringArrayList.emptyList();
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

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = LazyStringArrayList.emptyList();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.list_ = LazyStringArrayList.emptyList();
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

                public Builder mergeFrom(SEList sEList) {
                    if (sEList == SEList.getDefaultInstance()) {
                        return this;
                    }
                    if (!sEList.list_.isEmpty()) {
                        if (this.list_.isEmpty()) {
                            this.list_ = sEList.list_;
                            this.bitField0_ |= 1;
                        } else {
                            ensureListIsMutable();
                            this.list_.addAll(sEList.list_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(sEList.getUnknownFields());
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
                                        ByteString bytes = codedInputStream.readBytes();
                                        ensureListIsMutable();
                                        this.list_.add(bytes);
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
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, a aVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_SEList_descriptor;
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
                return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.SEListOrBuilder
            public String getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.SEListOrBuilder
            public ByteString getListBytes(int i7) {
                return this.list_.getByteString(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
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
                int iComputeStringSizeNoTag = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.list_.getRaw(i8));
                }
                int size = iComputeStringSizeNoTag + getListList().size() + getUnknownFields().getSerializedSize();
                this.memoizedSize = size;
                return size;
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
                return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    GeneratedMessage.writeString(codedOutputStream, 1, this.list_.getRaw(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.list_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SEList sEList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEList);
            }

            public static SEList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.SEListOrBuilder
            public ProtocolStringList getListList() {
                return this.list_;
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

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private SEList() {
                this.list_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = LazyStringArrayList.emptyList();
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
            String getList(int i7);

            ByteString getListBytes(int i7);

            int getListCount();

            List<String> getListList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAIErrorCodeInfo");
            DEFAULT_INSTANCE = new SEAIErrorCodeInfo();
            PARSER = new AbstractParser<SEAIErrorCodeInfo>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfo.1
                @Override // com.google.protobuf.Parser
                public SEAIErrorCodeInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAIErrorCodeInfo.newBuilder();
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

        public /* synthetic */ SEAIErrorCodeInfo(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEAIErrorCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAIErrorCodeInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEAIErrorCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAIErrorCodeInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAIErrorCodeInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAIErrorCodeInfo)) {
                return super.equals(obj);
            }
            SEAIErrorCodeInfo sEAIErrorCodeInfo = (SEAIErrorCodeInfo) obj;
            if (hasAiErrorCode() != sEAIErrorCodeInfo.hasAiErrorCode()) {
                return false;
            }
            if ((!hasAiErrorCode() || getAiErrorCode() == sEAIErrorCodeInfo.getAiErrorCode()) && hasAiErrorString() == sEAIErrorCodeInfo.hasAiErrorString()) {
                return (!hasAiErrorString() || getAiErrorString().equals(sEAIErrorCodeInfo.getAiErrorString())) && getUnknownFields().equals(sEAIErrorCodeInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
        public int getAiErrorCode() {
            return this.aiErrorCode_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
        public SEList getAiErrorString() {
            SEList sEList = this.aiErrorString_;
            return sEList == null ? SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
        public SEListOrBuilder getAiErrorStringOrBuilder() {
            SEList sEList = this.aiErrorString_;
            return sEList == null ? SEList.getDefaultInstance() : sEList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAIErrorCodeInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.aiErrorCode_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getAiErrorString());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
        public boolean hasAiErrorCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIErrorCodeInfoOrBuilder
        public boolean hasAiErrorString() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasAiErrorCode()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAiErrorCode();
            }
            if (hasAiErrorString()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAiErrorString().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AIFunctionProtos.internal_static_SA_SEAIErrorCodeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIErrorCodeInfo.class, Builder.class);
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
            if (hasAiErrorCode()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.aiErrorCode_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getAiErrorString());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEAIErrorCodeInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.aiErrorCode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAIErrorCodeInfo sEAIErrorCodeInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAIErrorCodeInfo);
        }

        public static SEAIErrorCodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAIErrorCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIErrorCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAIErrorCodeInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAIErrorCodeInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAIErrorCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEAIErrorCodeInfo() {
            this.aiErrorCode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEAIErrorCodeInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAIErrorCodeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAIErrorCodeInfo parseFrom(InputStream inputStream) {
            return (SEAIErrorCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAIErrorCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIErrorCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAIErrorCodeInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEAIErrorCodeInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAIErrorCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIErrorCodeInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAIErrorCodeInfoOrBuilder extends MessageOrBuilder {
        int getAiErrorCode();

        SEAIErrorCodeInfo.SEList getAiErrorString();

        SEAIErrorCodeInfo.SEListOrBuilder getAiErrorStringOrBuilder();

        boolean hasAiErrorCode();

        boolean hasAiErrorString();
    }

    public static final class SEAIFunction extends GeneratedMessage implements SEAIFunctionOrBuilder {
        public static final int APP_TEXT_FIELD_NUMBER = 2;
        private static final SEAIFunction DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 8;
        public static final int HISTORY_TEMPLATE_UI_FIELD_NUMBER = 4;
        public static final int OPEN_APP_FUNCTION_FIELD_NUMBER = 7;
        private static final Parser<SEAIFunction> PARSER;
        public static final int SET_ACTION_TEMPLATE_FIELD_NUMBER = 5;
        public static final int TOGGLE_TEMPLATE_UI_FIELD_NUMBER = 6;
        public static final int VIEW_TEMPLATE_UI_FIELD_NUMBER = 3;
        public static final int VOICE_CMD_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEAIFunction$1 */
        public class AnonymousClass1 extends AbstractParser<SEAIFunction> {
            @Override // com.google.protobuf.Parser
            public SEAIFunction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEAIFunction.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAIFunctionOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> historyTemplateUIBuilder_;
            private SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> openAppFunctionBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> setActionTemplateBuilder_;
            private SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> toggleTemplateUIBuilder_;
            private SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> viewTemplateUIBuilder_;
            private SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> voiceCmdBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEAIFunction sEAIFunction) {
            }

            private void buildPartialOneofs(SEAIFunction sEAIFunction) {
                SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> singleFieldBuilder6;
                int i7 = this.payloadCase_;
                sEAIFunction.payloadCase_ = i7;
                sEAIFunction.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder6 = this.voiceCmdBuilder_) != null) {
                    sEAIFunction.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 3 && (singleFieldBuilder5 = this.viewTemplateUIBuilder_) != null) {
                    sEAIFunction.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 4 && (singleFieldBuilder4 = this.historyTemplateUIBuilder_) != null) {
                    sEAIFunction.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder3 = this.setActionTemplateBuilder_) != null) {
                    sEAIFunction.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder2 = this.toggleTemplateUIBuilder_) != null) {
                    sEAIFunction.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 7 || (singleFieldBuilder = this.openAppFunctionBuilder_) == null) {
                    return;
                }
                sEAIFunction.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEAIFunction_descriptor;
            }

            private SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> internalGetHistoryTemplateUIFieldBuilder() {
                if (this.historyTemplateUIBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = SEHistoryTemplateUI.getDefaultInstance();
                    }
                    this.historyTemplateUIBuilder_ = new SingleFieldBuilder<>((SEHistoryTemplateUI) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.historyTemplateUIBuilder_;
            }

            private SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> internalGetOpenAppFunctionFieldBuilder() {
                if (this.openAppFunctionBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SEOpenAppFunction.getDefaultInstance();
                    }
                    this.openAppFunctionBuilder_ = new SingleFieldBuilder<>((SEOpenAppFunction) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.openAppFunctionBuilder_;
            }

            private SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> internalGetSetActionTemplateFieldBuilder() {
                if (this.setActionTemplateBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SESetActionTemplate.getDefaultInstance();
                    }
                    this.setActionTemplateBuilder_ = new SingleFieldBuilder<>((SESetActionTemplate) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.setActionTemplateBuilder_;
            }

            private SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> internalGetToggleTemplateUIFieldBuilder() {
                if (this.toggleTemplateUIBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SEToggleTemplateUI.getDefaultInstance();
                    }
                    this.toggleTemplateUIBuilder_ = new SingleFieldBuilder<>((SEToggleTemplateUI) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.toggleTemplateUIBuilder_;
            }

            private SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> internalGetViewTemplateUIFieldBuilder() {
                if (this.viewTemplateUIBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = SEViewTemplateUI.getDefaultInstance();
                    }
                    this.viewTemplateUIBuilder_ = new SingleFieldBuilder<>((SEViewTemplateUI) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.viewTemplateUIBuilder_;
            }

            private SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> internalGetVoiceCmdFieldBuilder() {
                if (this.voiceCmdBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SEVoiceCmd.getDefaultInstance();
                    }
                    this.voiceCmdBuilder_ = new SingleFieldBuilder<>((SEVoiceCmd) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.voiceCmdBuilder_;
            }

            public Builder clearAppText() {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearErrorCode() {
                if (this.payloadCase_ == 8) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearHistoryTemplateUI() {
                SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> singleFieldBuilder = this.historyTemplateUIBuilder_;
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

            public Builder clearOpenAppFunction() {
                SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> singleFieldBuilder = this.openAppFunctionBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearSetActionTemplate() {
                SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> singleFieldBuilder = this.setActionTemplateBuilder_;
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

            public Builder clearToggleTemplateUI() {
                SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> singleFieldBuilder = this.toggleTemplateUIBuilder_;
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

            public Builder clearViewTemplateUI() {
                SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> singleFieldBuilder = this.viewTemplateUIBuilder_;
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

            public Builder clearVoiceCmd() {
                SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> singleFieldBuilder = this.voiceCmdBuilder_;
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

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public String getAppText() {
                if (this.payloadCase_ != 2) {
                    return "";
                }
                Object obj = this.payload_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public ByteString getAppTextBytes() {
                if (this.payloadCase_ != 2) {
                    return ByteString.copyFromUtf8("");
                }
                Object obj = this.payload_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.payload_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEAIFunction_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public int getErrorCode() {
                if (this.payloadCase_ == 8) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEHistoryTemplateUI getHistoryTemplateUI() {
                SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> singleFieldBuilder = this.historyTemplateUIBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 4 ? (SEHistoryTemplateUI) this.payload_ : SEHistoryTemplateUI.getDefaultInstance() : this.payloadCase_ == 4 ? (SEHistoryTemplateUI) singleFieldBuilder.getMessage() : SEHistoryTemplateUI.getDefaultInstance();
            }

            public SEHistoryTemplateUI.Builder getHistoryTemplateUIBuilder() {
                return (SEHistoryTemplateUI.Builder) internalGetHistoryTemplateUIFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEHistoryTemplateUIOrBuilder getHistoryTemplateUIOrBuilder() {
                SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilder = this.historyTemplateUIBuilder_) == null) ? i7 == 4 ? (SEHistoryTemplateUI) this.payload_ : SEHistoryTemplateUI.getDefaultInstance() : (SEHistoryTemplateUIOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEOpenAppFunction getOpenAppFunction() {
                SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> singleFieldBuilder = this.openAppFunctionBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SEOpenAppFunction) this.payload_ : SEOpenAppFunction.getDefaultInstance() : this.payloadCase_ == 7 ? (SEOpenAppFunction) singleFieldBuilder.getMessage() : SEOpenAppFunction.getDefaultInstance();
            }

            public SEOpenAppFunction.Builder getOpenAppFunctionBuilder() {
                return (SEOpenAppFunction.Builder) internalGetOpenAppFunctionFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEOpenAppFunctionOrBuilder getOpenAppFunctionOrBuilder() {
                SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.openAppFunctionBuilder_) == null) ? i7 == 7 ? (SEOpenAppFunction) this.payload_ : SEOpenAppFunction.getDefaultInstance() : (SEOpenAppFunctionOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SESetActionTemplate getSetActionTemplate() {
                SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> singleFieldBuilder = this.setActionTemplateBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SESetActionTemplate) this.payload_ : SESetActionTemplate.getDefaultInstance() : this.payloadCase_ == 5 ? (SESetActionTemplate) singleFieldBuilder.getMessage() : SESetActionTemplate.getDefaultInstance();
            }

            public SESetActionTemplate.Builder getSetActionTemplateBuilder() {
                return (SESetActionTemplate.Builder) internalGetSetActionTemplateFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SESetActionTemplateOrBuilder getSetActionTemplateOrBuilder() {
                SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.setActionTemplateBuilder_) == null) ? i7 == 5 ? (SESetActionTemplate) this.payload_ : SESetActionTemplate.getDefaultInstance() : (SESetActionTemplateOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEToggleTemplateUI getToggleTemplateUI() {
                SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> singleFieldBuilder = this.toggleTemplateUIBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SEToggleTemplateUI) this.payload_ : SEToggleTemplateUI.getDefaultInstance() : this.payloadCase_ == 6 ? (SEToggleTemplateUI) singleFieldBuilder.getMessage() : SEToggleTemplateUI.getDefaultInstance();
            }

            public SEToggleTemplateUI.Builder getToggleTemplateUIBuilder() {
                return (SEToggleTemplateUI.Builder) internalGetToggleTemplateUIFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEToggleTemplateUIOrBuilder getToggleTemplateUIOrBuilder() {
                SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.toggleTemplateUIBuilder_) == null) ? i7 == 6 ? (SEToggleTemplateUI) this.payload_ : SEToggleTemplateUI.getDefaultInstance() : (SEToggleTemplateUIOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEViewTemplateUI getViewTemplateUI() {
                SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> singleFieldBuilder = this.viewTemplateUIBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (SEViewTemplateUI) this.payload_ : SEViewTemplateUI.getDefaultInstance() : this.payloadCase_ == 3 ? (SEViewTemplateUI) singleFieldBuilder.getMessage() : SEViewTemplateUI.getDefaultInstance();
            }

            public SEViewTemplateUI.Builder getViewTemplateUIBuilder() {
                return (SEViewTemplateUI.Builder) internalGetViewTemplateUIFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEViewTemplateUIOrBuilder getViewTemplateUIOrBuilder() {
                SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.viewTemplateUIBuilder_) == null) ? i7 == 3 ? (SEViewTemplateUI) this.payload_ : SEViewTemplateUI.getDefaultInstance() : (SEViewTemplateUIOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEVoiceCmd getVoiceCmd() {
                SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> singleFieldBuilder = this.voiceCmdBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SEVoiceCmd) this.payload_ : SEVoiceCmd.getDefaultInstance() : this.payloadCase_ == 1 ? (SEVoiceCmd) singleFieldBuilder.getMessage() : SEVoiceCmd.getDefaultInstance();
            }

            public SEVoiceCmd.Builder getVoiceCmdBuilder() {
                return (SEVoiceCmd.Builder) internalGetVoiceCmdFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public SEVoiceCmdOrBuilder getVoiceCmdOrBuilder() {
                SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.voiceCmdBuilder_) == null) ? i7 == 1 ? (SEVoiceCmd) this.payload_ : SEVoiceCmd.getDefaultInstance() : (SEVoiceCmdOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public boolean hasAppText() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public boolean hasErrorCode() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public boolean hasHistoryTemplateUI() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public boolean hasOpenAppFunction() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public boolean hasSetActionTemplate() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public boolean hasToggleTemplateUI() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public boolean hasViewTemplateUI() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
            public boolean hasVoiceCmd() {
                return this.payloadCase_ == 1;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEAIFunction_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIFunction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasVoiceCmd() && !getVoiceCmd().isInitialized()) {
                    return false;
                }
                if (hasViewTemplateUI() && !getViewTemplateUI().isInitialized()) {
                    return false;
                }
                if (hasHistoryTemplateUI() && !getHistoryTemplateUI().isInitialized()) {
                    return false;
                }
                if (hasSetActionTemplate() && !getSetActionTemplate().isInitialized()) {
                    return false;
                }
                if (!hasToggleTemplateUI() || getToggleTemplateUI().isInitialized()) {
                    return !hasOpenAppFunction() || getOpenAppFunction().isInitialized();
                }
                return false;
            }

            public Builder mergeHistoryTemplateUI(SEHistoryTemplateUI sEHistoryTemplateUI) {
                SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> singleFieldBuilder = this.historyTemplateUIBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 4 || this.payload_ == SEHistoryTemplateUI.getDefaultInstance()) {
                        this.payload_ = sEHistoryTemplateUI;
                    } else {
                        this.payload_ = SEHistoryTemplateUI.newBuilder((SEHistoryTemplateUI) this.payload_).mergeFrom(sEHistoryTemplateUI).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 4) {
                    singleFieldBuilder.mergeFrom(sEHistoryTemplateUI);
                } else {
                    singleFieldBuilder.setMessage(sEHistoryTemplateUI);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeOpenAppFunction(SEOpenAppFunction sEOpenAppFunction) {
                SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> singleFieldBuilder = this.openAppFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SEOpenAppFunction.getDefaultInstance()) {
                        this.payload_ = sEOpenAppFunction;
                    } else {
                        this.payload_ = SEOpenAppFunction.newBuilder((SEOpenAppFunction) this.payload_).mergeFrom(sEOpenAppFunction).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEOpenAppFunction);
                } else {
                    singleFieldBuilder.setMessage(sEOpenAppFunction);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeSetActionTemplate(SESetActionTemplate sESetActionTemplate) {
                SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> singleFieldBuilder = this.setActionTemplateBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SESetActionTemplate.getDefaultInstance()) {
                        this.payload_ = sESetActionTemplate;
                    } else {
                        this.payload_ = SESetActionTemplate.newBuilder((SESetActionTemplate) this.payload_).mergeFrom(sESetActionTemplate).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sESetActionTemplate);
                } else {
                    singleFieldBuilder.setMessage(sESetActionTemplate);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeToggleTemplateUI(SEToggleTemplateUI sEToggleTemplateUI) {
                SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> singleFieldBuilder = this.toggleTemplateUIBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SEToggleTemplateUI.getDefaultInstance()) {
                        this.payload_ = sEToggleTemplateUI;
                    } else {
                        this.payload_ = SEToggleTemplateUI.newBuilder((SEToggleTemplateUI) this.payload_).mergeFrom(sEToggleTemplateUI).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEToggleTemplateUI);
                } else {
                    singleFieldBuilder.setMessage(sEToggleTemplateUI);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeViewTemplateUI(SEViewTemplateUI sEViewTemplateUI) {
                SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> singleFieldBuilder = this.viewTemplateUIBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == SEViewTemplateUI.getDefaultInstance()) {
                        this.payload_ = sEViewTemplateUI;
                    } else {
                        this.payload_ = SEViewTemplateUI.newBuilder((SEViewTemplateUI) this.payload_).mergeFrom(sEViewTemplateUI).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(sEViewTemplateUI);
                } else {
                    singleFieldBuilder.setMessage(sEViewTemplateUI);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeVoiceCmd(SEVoiceCmd sEVoiceCmd) {
                SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> singleFieldBuilder = this.voiceCmdBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SEVoiceCmd.getDefaultInstance()) {
                        this.payload_ = sEVoiceCmd;
                    } else {
                        this.payload_ = SEVoiceCmd.newBuilder((SEVoiceCmd) this.payload_).mergeFrom(sEVoiceCmd).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sEVoiceCmd);
                } else {
                    singleFieldBuilder.setMessage(sEVoiceCmd);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setAppText(String str) {
                str.getClass();
                this.payloadCase_ = 2;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setAppTextBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 2;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setErrorCode(int i7) {
                this.payloadCase_ = 8;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
                return this;
            }

            public Builder setHistoryTemplateUI(SEHistoryTemplateUI sEHistoryTemplateUI) {
                SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> singleFieldBuilder = this.historyTemplateUIBuilder_;
                if (singleFieldBuilder == null) {
                    sEHistoryTemplateUI.getClass();
                    this.payload_ = sEHistoryTemplateUI;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEHistoryTemplateUI);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setOpenAppFunction(SEOpenAppFunction sEOpenAppFunction) {
                SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> singleFieldBuilder = this.openAppFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    sEOpenAppFunction.getClass();
                    this.payload_ = sEOpenAppFunction;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEOpenAppFunction);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setSetActionTemplate(SESetActionTemplate sESetActionTemplate) {
                SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> singleFieldBuilder = this.setActionTemplateBuilder_;
                if (singleFieldBuilder == null) {
                    sESetActionTemplate.getClass();
                    this.payload_ = sESetActionTemplate;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESetActionTemplate);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setToggleTemplateUI(SEToggleTemplateUI sEToggleTemplateUI) {
                SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> singleFieldBuilder = this.toggleTemplateUIBuilder_;
                if (singleFieldBuilder == null) {
                    sEToggleTemplateUI.getClass();
                    this.payload_ = sEToggleTemplateUI;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEToggleTemplateUI);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setViewTemplateUI(SEViewTemplateUI sEViewTemplateUI) {
                SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> singleFieldBuilder = this.viewTemplateUIBuilder_;
                if (singleFieldBuilder == null) {
                    sEViewTemplateUI.getClass();
                    this.payload_ = sEViewTemplateUI;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEViewTemplateUI);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setVoiceCmd(SEVoiceCmd sEVoiceCmd) {
                SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> singleFieldBuilder = this.voiceCmdBuilder_;
                if (singleFieldBuilder == null) {
                    sEVoiceCmd.getClass();
                    this.payload_ = sEVoiceCmd;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEVoiceCmd);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAIFunction build() {
                SEAIFunction sEAIFunctionBuildPartial = buildPartial();
                if (sEAIFunctionBuildPartial.isInitialized()) {
                    return sEAIFunctionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAIFunctionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAIFunction buildPartial() {
                SEAIFunction sEAIFunction = new SEAIFunction(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAIFunction);
                }
                buildPartialOneofs(sEAIFunction);
                onBuilt();
                return sEAIFunction;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAIFunction getDefaultInstanceForType() {
                return SEAIFunction.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> singleFieldBuilder = this.voiceCmdBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> singleFieldBuilder2 = this.viewTemplateUIBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> singleFieldBuilder3 = this.historyTemplateUIBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> singleFieldBuilder4 = this.setActionTemplateBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> singleFieldBuilder5 = this.toggleTemplateUIBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> singleFieldBuilder6 = this.openAppFunctionBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAIFunction) {
                    return mergeFrom((SEAIFunction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setHistoryTemplateUI(SEHistoryTemplateUI.Builder builder) {
                SingleFieldBuilder<SEHistoryTemplateUI, SEHistoryTemplateUI.Builder, SEHistoryTemplateUIOrBuilder> singleFieldBuilder = this.historyTemplateUIBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setOpenAppFunction(SEOpenAppFunction.Builder builder) {
                SingleFieldBuilder<SEOpenAppFunction, SEOpenAppFunction.Builder, SEOpenAppFunctionOrBuilder> singleFieldBuilder = this.openAppFunctionBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setSetActionTemplate(SESetActionTemplate.Builder builder) {
                SingleFieldBuilder<SESetActionTemplate, SESetActionTemplate.Builder, SESetActionTemplateOrBuilder> singleFieldBuilder = this.setActionTemplateBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setToggleTemplateUI(SEToggleTemplateUI.Builder builder) {
                SingleFieldBuilder<SEToggleTemplateUI, SEToggleTemplateUI.Builder, SEToggleTemplateUIOrBuilder> singleFieldBuilder = this.toggleTemplateUIBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setViewTemplateUI(SEViewTemplateUI.Builder builder) {
                SingleFieldBuilder<SEViewTemplateUI, SEViewTemplateUI.Builder, SEViewTemplateUIOrBuilder> singleFieldBuilder = this.viewTemplateUIBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setVoiceCmd(SEVoiceCmd.Builder builder) {
                SingleFieldBuilder<SEVoiceCmd, SEVoiceCmd.Builder, SEVoiceCmdOrBuilder> singleFieldBuilder = this.voiceCmdBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeFrom(SEAIFunction sEAIFunction) {
                if (sEAIFunction == SEAIFunction.getDefaultInstance()) {
                    return this;
                }
                switch (sEAIFunction.getPayloadCase()) {
                    case VOICE_CMD:
                        mergeVoiceCmd(sEAIFunction.getVoiceCmd());
                        break;
                    case APP_TEXT:
                        this.payloadCase_ = 2;
                        this.payload_ = sEAIFunction.payload_;
                        onChanged();
                        break;
                    case VIEW_TEMPLATE_UI:
                        mergeViewTemplateUI(sEAIFunction.getViewTemplateUI());
                        break;
                    case HISTORY_TEMPLATE_UI:
                        mergeHistoryTemplateUI(sEAIFunction.getHistoryTemplateUI());
                        break;
                    case SET_ACTION_TEMPLATE:
                        mergeSetActionTemplate(sEAIFunction.getSetActionTemplate());
                        break;
                    case TOGGLE_TEMPLATE_UI:
                        mergeToggleTemplateUI(sEAIFunction.getToggleTemplateUI());
                        break;
                    case OPEN_APP_FUNCTION:
                        mergeOpenAppFunction(sEAIFunction.getOpenAppFunction());
                        break;
                    case ERROR_CODE:
                        setErrorCode(sEAIFunction.getErrorCode());
                        break;
                }
                mergeUnknownFields(sEAIFunction.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetVoiceCmdFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.payloadCase_ = 2;
                                    this.payload_ = bytes;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(internalGetViewTemplateUIFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetHistoryTemplateUIFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 4;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetSetActionTemplateFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(internalGetToggleTemplateUIFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(internalGetOpenAppFunctionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                } else if (tag != 64) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.payload_ = Integer.valueOf(codedInputStream.readUInt32());
                                    this.payloadCase_ = 8;
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
            VOICE_CMD(1),
            APP_TEXT(2),
            VIEW_TEMPLATE_UI(3),
            HISTORY_TEMPLATE_UI(4),
            SET_ACTION_TEMPLATE(5),
            TOGGLE_TEMPLATE_UI(6),
            OPEN_APP_FUNCTION(7),
            ERROR_CODE(8),
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
                        return VOICE_CMD;
                    case 2:
                        return APP_TEXT;
                    case 3:
                        return VIEW_TEMPLATE_UI;
                    case 4:
                        return HISTORY_TEMPLATE_UI;
                    case 5:
                        return SET_ACTION_TEMPLATE;
                    case 6:
                        return TOGGLE_TEMPLATE_UI;
                    case 7:
                        return OPEN_APP_FUNCTION;
                    case 8:
                        return ERROR_CODE;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAIFunction");
            DEFAULT_INSTANCE = new SEAIFunction();
            PARSER = new AbstractParser<SEAIFunction>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunction.1
                @Override // com.google.protobuf.Parser
                public SEAIFunction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAIFunction.newBuilder();
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

        public /* synthetic */ SEAIFunction(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEAIFunction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SEAIFunction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAIFunction parseDelimitedFrom(InputStream inputStream) {
            return (SEAIFunction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAIFunction parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAIFunction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAIFunction)) {
                return super.equals(obj);
            }
            SEAIFunction sEAIFunction = (SEAIFunction) obj;
            if (!getPayloadCase().equals(sEAIFunction.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getVoiceCmd().equals(sEAIFunction.getVoiceCmd())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getAppText().equals(sEAIFunction.getAppText())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getViewTemplateUI().equals(sEAIFunction.getViewTemplateUI())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getHistoryTemplateUI().equals(sEAIFunction.getHistoryTemplateUI())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getSetActionTemplate().equals(sEAIFunction.getSetActionTemplate())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getToggleTemplateUI().equals(sEAIFunction.getToggleTemplateUI())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getOpenAppFunction().equals(sEAIFunction.getOpenAppFunction())) {
                        return false;
                    }
                    break;
                case 8:
                    if (getErrorCode() != sEAIFunction.getErrorCode()) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sEAIFunction.getUnknownFields());
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public String getAppText() {
            if (this.payloadCase_ != 2) {
                return "";
            }
            Object obj = this.payload_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public ByteString getAppTextBytes() {
            if (this.payloadCase_ != 2) {
                return ByteString.copyFromUtf8("");
            }
            Object obj = this.payload_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.payload_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SEAIFunction_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public int getErrorCode() {
            if (this.payloadCase_ == 8) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEHistoryTemplateUI getHistoryTemplateUI() {
            return this.payloadCase_ == 4 ? (SEHistoryTemplateUI) this.payload_ : SEHistoryTemplateUI.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEHistoryTemplateUIOrBuilder getHistoryTemplateUIOrBuilder() {
            return this.payloadCase_ == 4 ? (SEHistoryTemplateUI) this.payload_ : SEHistoryTemplateUI.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEOpenAppFunction getOpenAppFunction() {
            return this.payloadCase_ == 7 ? (SEOpenAppFunction) this.payload_ : SEOpenAppFunction.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEOpenAppFunctionOrBuilder getOpenAppFunctionOrBuilder() {
            return this.payloadCase_ == 7 ? (SEOpenAppFunction) this.payload_ : SEOpenAppFunction.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAIFunction> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SEVoiceCmd) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (SEViewTemplateUI) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (SEHistoryTemplateUI) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (SESetActionTemplate) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SEToggleTemplateUI) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (SEOpenAppFunction) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(8, ((Integer) this.payload_).intValue());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SESetActionTemplate getSetActionTemplate() {
            return this.payloadCase_ == 5 ? (SESetActionTemplate) this.payload_ : SESetActionTemplate.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SESetActionTemplateOrBuilder getSetActionTemplateOrBuilder() {
            return this.payloadCase_ == 5 ? (SESetActionTemplate) this.payload_ : SESetActionTemplate.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEToggleTemplateUI getToggleTemplateUI() {
            return this.payloadCase_ == 6 ? (SEToggleTemplateUI) this.payload_ : SEToggleTemplateUI.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEToggleTemplateUIOrBuilder getToggleTemplateUIOrBuilder() {
            return this.payloadCase_ == 6 ? (SEToggleTemplateUI) this.payload_ : SEToggleTemplateUI.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEViewTemplateUI getViewTemplateUI() {
            return this.payloadCase_ == 3 ? (SEViewTemplateUI) this.payload_ : SEViewTemplateUI.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEViewTemplateUIOrBuilder getViewTemplateUIOrBuilder() {
            return this.payloadCase_ == 3 ? (SEViewTemplateUI) this.payload_ : SEViewTemplateUI.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEVoiceCmd getVoiceCmd() {
            return this.payloadCase_ == 1 ? (SEVoiceCmd) this.payload_ : SEVoiceCmd.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public SEVoiceCmdOrBuilder getVoiceCmdOrBuilder() {
            return this.payloadCase_ == 1 ? (SEVoiceCmd) this.payload_ : SEVoiceCmd.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public boolean hasAppText() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public boolean hasErrorCode() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public boolean hasHistoryTemplateUI() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public boolean hasOpenAppFunction() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public boolean hasSetActionTemplate() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public boolean hasToggleTemplateUI() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public boolean hasViewTemplateUI() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunctionOrBuilder
        public boolean hasVoiceCmd() {
            return this.payloadCase_ == 1;
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
                    iHashCode = getVoiceCmd().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getAppText().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getViewTemplateUI().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getHistoryTemplateUI().hashCode();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getSetActionTemplate().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getToggleTemplateUI().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getOpenAppFunction().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getErrorCode();
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
            return AIFunctionProtos.internal_static_SA_SEAIFunction_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIFunction.class, Builder.class);
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
            if (hasVoiceCmd() && !getVoiceCmd().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasViewTemplateUI() && !getViewTemplateUI().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHistoryTemplateUI() && !getHistoryTemplateUI().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetActionTemplate() && !getSetActionTemplate().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasToggleTemplateUI() && !getToggleTemplateUI().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasOpenAppFunction() || getOpenAppFunction().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SEVoiceCmd) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (SEViewTemplateUI) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (SEHistoryTemplateUI) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SESetActionTemplate) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SEToggleTemplateUI) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SEOpenAppFunction) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeUInt32(8, ((Integer) this.payload_).intValue());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEAIFunction(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAIFunction sEAIFunction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAIFunction);
        }

        public static SEAIFunction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAIFunction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIFunction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAIFunction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAIFunction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAIFunction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEAIFunction() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEAIFunction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAIFunction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAIFunction parseFrom(InputStream inputStream) {
            return (SEAIFunction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAIFunction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIFunction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAIFunction parseFrom(CodedInputStream codedInputStream) {
            return (SEAIFunction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAIFunction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIFunction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAIFunctionOrBuilder extends MessageOrBuilder {
        String getAppText();

        ByteString getAppTextBytes();

        int getErrorCode();

        SEHistoryTemplateUI getHistoryTemplateUI();

        SEHistoryTemplateUIOrBuilder getHistoryTemplateUIOrBuilder();

        SEOpenAppFunction getOpenAppFunction();

        SEOpenAppFunctionOrBuilder getOpenAppFunctionOrBuilder();

        SEAIFunction.PayloadCase getPayloadCase();

        SESetActionTemplate getSetActionTemplate();

        SESetActionTemplateOrBuilder getSetActionTemplateOrBuilder();

        SEToggleTemplateUI getToggleTemplateUI();

        SEToggleTemplateUIOrBuilder getToggleTemplateUIOrBuilder();

        SEViewTemplateUI getViewTemplateUI();

        SEViewTemplateUIOrBuilder getViewTemplateUIOrBuilder();

        SEVoiceCmd getVoiceCmd();

        SEVoiceCmdOrBuilder getVoiceCmdOrBuilder();

        boolean hasAppText();

        boolean hasErrorCode();

        boolean hasHistoryTemplateUI();

        boolean hasOpenAppFunction();

        boolean hasSetActionTemplate();

        boolean hasToggleTemplateUI();

        boolean hasViewTemplateUI();

        boolean hasVoiceCmd();
    }

    public enum SEAIFunction_ID implements ProtocolMessageEnum {
        AI_DEVICE_SEND_VOICE_CMD(0),
        AI_APP_SEND_VOICE_CMD(1),
        AI_APP_SEND_TRANSLATED_TEXT(2),
        AI_APP_SEND_ANSWER_TEXT(3),
        AI_APP_VIEW_TEMPLATE_UI(4),
        AI_APP_HISTORY_TEMPLATE_UI(5),
        AI_APP_SET_ACTION_TEMPLATE(6),
        AI_APP_TOGGLE_TEMPLATE_UI(7),
        AI_APP_OPEN_APP_FUNCTION(8),
        AI_ERROR_CODE(9);

        public static final int AI_APP_HISTORY_TEMPLATE_UI_VALUE = 5;
        public static final int AI_APP_OPEN_APP_FUNCTION_VALUE = 8;
        public static final int AI_APP_SEND_ANSWER_TEXT_VALUE = 3;
        public static final int AI_APP_SEND_TRANSLATED_TEXT_VALUE = 2;
        public static final int AI_APP_SEND_VOICE_CMD_VALUE = 1;
        public static final int AI_APP_SET_ACTION_TEMPLATE_VALUE = 6;
        public static final int AI_APP_TOGGLE_TEMPLATE_UI_VALUE = 7;
        public static final int AI_APP_VIEW_TEMPLATE_UI_VALUE = 4;
        public static final int AI_DEVICE_SEND_VOICE_CMD_VALUE = 0;
        public static final int AI_ERROR_CODE_VALUE = 9;
        private static final SEAIFunction_ID[] VALUES;
        private static final Internal.EnumLiteMap<SEAIFunction_ID> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEAIFunction_ID$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEAIFunction_ID> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEAIFunction_ID findValueByNumber(int i7) {
                return SEAIFunction_ID.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAIFunction_ID");
            internalValueMap = new Internal.EnumLiteMap<SEAIFunction_ID>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIFunction_ID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEAIFunction_ID findValueByNumber(int i7) {
                    return SEAIFunction_ID.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEAIFunction_ID(int i7) {
            this.value = i7;
        }

        public static SEAIFunction_ID forNumber(int i7) {
            switch (i7) {
                case 0:
                    return AI_DEVICE_SEND_VOICE_CMD;
                case 1:
                    return AI_APP_SEND_VOICE_CMD;
                case 2:
                    return AI_APP_SEND_TRANSLATED_TEXT;
                case 3:
                    return AI_APP_SEND_ANSWER_TEXT;
                case 4:
                    return AI_APP_VIEW_TEMPLATE_UI;
                case 5:
                    return AI_APP_HISTORY_TEMPLATE_UI;
                case 6:
                    return AI_APP_SET_ACTION_TEMPLATE;
                case 7:
                    return AI_APP_TOGGLE_TEMPLATE_UI;
                case 8:
                    return AI_APP_OPEN_APP_FUNCTION;
                case 9:
                    return AI_ERROR_CODE;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return AIFunctionProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEAIFunction_ID> internalGetValueMap() {
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
        public static SEAIFunction_ID valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEAIFunction_ID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEAIScreenSetting extends GeneratedMessage implements SEAIScreenSettingOrBuilder {
        public static final int BRIGHTNESS_LEVEL_FIELD_NUMBER = 1;
        private static final SEAIScreenSetting DEFAULT_INSTANCE;
        public static final int DOUBLE_CLICK_THE_HIGHLIGHTED_SCREEN_FIELD_NUMBER = 4;
        public static final int NORMALLY_ON_SWITCH_FIELD_NUMBER = 2;
        public static final int ON_SCREEN_DURATION_FIELD_NUMBER = 3;
        private static final Parser<SEAIScreenSetting> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int brightnessLevel_;
        private boolean doubleClickTheHighlightedScreen_;
        private byte memoizedIsInitialized;
        private boolean normallyOnSwitch_;
        private int onScreenDuration_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEAIScreenSetting$1 */
        public class AnonymousClass1 extends AbstractParser<SEAIScreenSetting> {
            @Override // com.google.protobuf.Parser
            public SEAIScreenSetting parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEAIScreenSetting.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAIScreenSettingOrBuilder {
            private int bitField0_;
            private int brightnessLevel_;
            private boolean doubleClickTheHighlightedScreen_;
            private boolean normallyOnSwitch_;
            private int onScreenDuration_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEAIScreenSetting sEAIScreenSetting) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAIScreenSetting.brightnessLevel_ = this.brightnessLevel_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEAIScreenSetting.normallyOnSwitch_ = this.normallyOnSwitch_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEAIScreenSetting.onScreenDuration_ = this.onScreenDuration_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEAIScreenSetting.doubleClickTheHighlightedScreen_ = this.doubleClickTheHighlightedScreen_;
                    i7 |= 8;
                }
                sEAIScreenSetting.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEAIScreenSetting_descriptor;
            }

            public Builder clearBrightnessLevel() {
                this.bitField0_ &= -2;
                this.brightnessLevel_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDoubleClickTheHighlightedScreen() {
                this.bitField0_ &= -9;
                this.doubleClickTheHighlightedScreen_ = false;
                onChanged();
                return this;
            }

            public Builder clearNormallyOnSwitch() {
                this.bitField0_ &= -3;
                this.normallyOnSwitch_ = false;
                onChanged();
                return this;
            }

            public Builder clearOnScreenDuration() {
                this.bitField0_ &= -5;
                this.onScreenDuration_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
            public int getBrightnessLevel() {
                return this.brightnessLevel_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEAIScreenSetting_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
            public boolean getDoubleClickTheHighlightedScreen() {
                return this.doubleClickTheHighlightedScreen_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
            public boolean getNormallyOnSwitch() {
                return this.normallyOnSwitch_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
            public int getOnScreenDuration() {
                return this.onScreenDuration_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
            public boolean hasBrightnessLevel() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
            public boolean hasDoubleClickTheHighlightedScreen() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
            public boolean hasNormallyOnSwitch() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
            public boolean hasOnScreenDuration() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEAIScreenSetting_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIScreenSetting.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setBrightnessLevel(int i7) {
                this.brightnessLevel_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDoubleClickTheHighlightedScreen(boolean z6) {
                this.doubleClickTheHighlightedScreen_ = z6;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNormallyOnSwitch(boolean z6) {
                this.normallyOnSwitch_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOnScreenDuration(int i7) {
                this.onScreenDuration_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAIScreenSetting build() {
                SEAIScreenSetting sEAIScreenSettingBuildPartial = buildPartial();
                if (sEAIScreenSettingBuildPartial.isInitialized()) {
                    return sEAIScreenSettingBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAIScreenSettingBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAIScreenSetting buildPartial() {
                SEAIScreenSetting sEAIScreenSetting = new SEAIScreenSetting(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAIScreenSetting);
                }
                onBuilt();
                return sEAIScreenSetting;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAIScreenSetting getDefaultInstanceForType() {
                return SEAIScreenSetting.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.brightnessLevel_ = 0;
                this.normallyOnSwitch_ = false;
                this.onScreenDuration_ = 0;
                this.doubleClickTheHighlightedScreen_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAIScreenSetting) {
                    return mergeFrom((SEAIScreenSetting) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEAIScreenSetting sEAIScreenSetting) {
                if (sEAIScreenSetting == SEAIScreenSetting.getDefaultInstance()) {
                    return this;
                }
                if (sEAIScreenSetting.hasBrightnessLevel()) {
                    setBrightnessLevel(sEAIScreenSetting.getBrightnessLevel());
                }
                if (sEAIScreenSetting.hasNormallyOnSwitch()) {
                    setNormallyOnSwitch(sEAIScreenSetting.getNormallyOnSwitch());
                }
                if (sEAIScreenSetting.hasOnScreenDuration()) {
                    setOnScreenDuration(sEAIScreenSetting.getOnScreenDuration());
                }
                if (sEAIScreenSetting.hasDoubleClickTheHighlightedScreen()) {
                    setDoubleClickTheHighlightedScreen(sEAIScreenSetting.getDoubleClickTheHighlightedScreen());
                }
                mergeUnknownFields(sEAIScreenSetting.getUnknownFields());
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
                                    this.brightnessLevel_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.normallyOnSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.onScreenDuration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.doubleClickTheHighlightedScreen_ = codedInputStream.readBool();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAIScreenSetting");
            DEFAULT_INSTANCE = new SEAIScreenSetting();
            PARSER = new AbstractParser<SEAIScreenSetting>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSetting.1
                @Override // com.google.protobuf.Parser
                public SEAIScreenSetting parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAIScreenSetting.newBuilder();
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

        public /* synthetic */ SEAIScreenSetting(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEAIScreenSetting getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SEAIScreenSetting_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAIScreenSetting parseDelimitedFrom(InputStream inputStream) {
            return (SEAIScreenSetting) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAIScreenSetting parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAIScreenSetting> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAIScreenSetting)) {
                return super.equals(obj);
            }
            SEAIScreenSetting sEAIScreenSetting = (SEAIScreenSetting) obj;
            if (hasBrightnessLevel() != sEAIScreenSetting.hasBrightnessLevel()) {
                return false;
            }
            if ((hasBrightnessLevel() && getBrightnessLevel() != sEAIScreenSetting.getBrightnessLevel()) || hasNormallyOnSwitch() != sEAIScreenSetting.hasNormallyOnSwitch()) {
                return false;
            }
            if ((hasNormallyOnSwitch() && getNormallyOnSwitch() != sEAIScreenSetting.getNormallyOnSwitch()) || hasOnScreenDuration() != sEAIScreenSetting.hasOnScreenDuration()) {
                return false;
            }
            if ((!hasOnScreenDuration() || getOnScreenDuration() == sEAIScreenSetting.getOnScreenDuration()) && hasDoubleClickTheHighlightedScreen() == sEAIScreenSetting.hasDoubleClickTheHighlightedScreen()) {
                return (!hasDoubleClickTheHighlightedScreen() || getDoubleClickTheHighlightedScreen() == sEAIScreenSetting.getDoubleClickTheHighlightedScreen()) && getUnknownFields().equals(sEAIScreenSetting.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
        public int getBrightnessLevel() {
            return this.brightnessLevel_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SEAIScreenSetting_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
        public boolean getDoubleClickTheHighlightedScreen() {
            return this.doubleClickTheHighlightedScreen_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
        public boolean getNormallyOnSwitch() {
            return this.normallyOnSwitch_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
        public int getOnScreenDuration() {
            return this.onScreenDuration_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAIScreenSetting> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.brightnessLevel_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.normallyOnSwitch_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.onScreenDuration_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(4, this.doubleClickTheHighlightedScreen_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
        public boolean hasBrightnessLevel() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
        public boolean hasDoubleClickTheHighlightedScreen() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
        public boolean hasNormallyOnSwitch() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEAIScreenSettingOrBuilder
        public boolean hasOnScreenDuration() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasBrightnessLevel()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBrightnessLevel();
            }
            if (hasNormallyOnSwitch()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getNormallyOnSwitch());
            }
            if (hasOnScreenDuration()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getOnScreenDuration();
            }
            if (hasDoubleClickTheHighlightedScreen()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashBoolean(getDoubleClickTheHighlightedScreen());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AIFunctionProtos.internal_static_SA_SEAIScreenSetting_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAIScreenSetting.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.brightnessLevel_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.normallyOnSwitch_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.onScreenDuration_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.doubleClickTheHighlightedScreen_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEAIScreenSetting(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.brightnessLevel_ = 0;
            this.normallyOnSwitch_ = false;
            this.onScreenDuration_ = 0;
            this.doubleClickTheHighlightedScreen_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAIScreenSetting sEAIScreenSetting) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAIScreenSetting);
        }

        public static SEAIScreenSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAIScreenSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIScreenSetting) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAIScreenSetting parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAIScreenSetting getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAIScreenSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEAIScreenSetting parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAIScreenSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAIScreenSetting parseFrom(InputStream inputStream) {
            return (SEAIScreenSetting) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEAIScreenSetting() {
            this.brightnessLevel_ = 0;
            this.normallyOnSwitch_ = false;
            this.onScreenDuration_ = 0;
            this.doubleClickTheHighlightedScreen_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEAIScreenSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIScreenSetting) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAIScreenSetting parseFrom(CodedInputStream codedInputStream) {
            return (SEAIScreenSetting) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAIScreenSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAIScreenSetting) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAIScreenSettingOrBuilder extends MessageOrBuilder {
        int getBrightnessLevel();

        boolean getDoubleClickTheHighlightedScreen();

        boolean getNormallyOnSwitch();

        int getOnScreenDuration();

        boolean hasBrightnessLevel();

        boolean hasDoubleClickTheHighlightedScreen();

        boolean hasNormallyOnSwitch();

        boolean hasOnScreenDuration();
    }

    public static final class SEHistoryTemplateUI extends GeneratedMessage implements SEHistoryTemplateUIOrBuilder {
        public static final int CHART_DATA_LIST_FIELD_NUMBER = 6;
        private static final SEHistoryTemplateUI DEFAULT_INSTANCE;
        private static final Parser<SEHistoryTemplateUI> PARSER;
        public static final int PERIOD_FIELD_NUMBER = 2;
        public static final int SUMMARY_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int VALUE_TITLE_FIELD_NUMBER = 3;
        public static final int Y_MAX_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ChartDataList chartDataList_;
        private byte memoizedIsInitialized;
        private volatile Object period_;
        private SESummary summary_;
        private volatile Object title_;
        private volatile Object valueTitle_;
        private int yMax_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEHistoryTemplateUI$1 */
        public class AnonymousClass1 extends AbstractParser<SEHistoryTemplateUI> {
            @Override // com.google.protobuf.Parser
            public SEHistoryTemplateUI parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEHistoryTemplateUI.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEHistoryTemplateUIOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> chartDataListBuilder_;
            private ChartDataList chartDataList_;
            private Object period_;
            private SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> summaryBuilder_;
            private SESummary summary_;
            private Object title_;
            private Object valueTitle_;
            private int yMax_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEHistoryTemplateUI sEHistoryTemplateUI) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEHistoryTemplateUI.title_ = this.title_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEHistoryTemplateUI.period_ = this.period_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEHistoryTemplateUI.valueTitle_ = this.valueTitle_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEHistoryTemplateUI.yMax_ = this.yMax_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> singleFieldBuilder = this.summaryBuilder_;
                    sEHistoryTemplateUI.summary_ = singleFieldBuilder == null ? this.summary_ : (SESummary) singleFieldBuilder.build();
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> singleFieldBuilder2 = this.chartDataListBuilder_;
                    sEHistoryTemplateUI.chartDataList_ = singleFieldBuilder2 == null ? this.chartDataList_ : (ChartDataList) singleFieldBuilder2.build();
                    i7 |= 32;
                }
                sEHistoryTemplateUI.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_descriptor;
            }

            private SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> internalGetChartDataListFieldBuilder() {
                if (this.chartDataListBuilder_ == null) {
                    this.chartDataListBuilder_ = new SingleFieldBuilder<>(getChartDataList(), getParentForChildren(), isClean());
                    this.chartDataList_ = null;
                }
                return this.chartDataListBuilder_;
            }

            private SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> internalGetSummaryFieldBuilder() {
                if (this.summaryBuilder_ == null) {
                    this.summaryBuilder_ = new SingleFieldBuilder<>(getSummary(), getParentForChildren(), isClean());
                    this.summary_ = null;
                }
                return this.summaryBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetSummaryFieldBuilder();
                    internalGetChartDataListFieldBuilder();
                }
            }

            public Builder clearChartDataList() {
                this.bitField0_ &= -33;
                this.chartDataList_ = null;
                SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> singleFieldBuilder = this.chartDataListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.chartDataListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPeriod() {
                this.period_ = SEHistoryTemplateUI.getDefaultInstance().getPeriod();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSummary() {
                this.bitField0_ &= -17;
                this.summary_ = null;
                SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> singleFieldBuilder = this.summaryBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.summaryBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = SEHistoryTemplateUI.getDefaultInstance().getTitle();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearValueTitle() {
                this.valueTitle_ = SEHistoryTemplateUI.getDefaultInstance().getValueTitle();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearYMax() {
                this.bitField0_ &= -9;
                this.yMax_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public ChartDataList getChartDataList() {
                SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> singleFieldBuilder = this.chartDataListBuilder_;
                if (singleFieldBuilder != null) {
                    return (ChartDataList) singleFieldBuilder.getMessage();
                }
                ChartDataList chartDataList = this.chartDataList_;
                return chartDataList == null ? ChartDataList.getDefaultInstance() : chartDataList;
            }

            public ChartDataList.Builder getChartDataListBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (ChartDataList.Builder) internalGetChartDataListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public ChartDataListOrBuilder getChartDataListOrBuilder() {
                SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> singleFieldBuilder = this.chartDataListBuilder_;
                if (singleFieldBuilder != null) {
                    return (ChartDataListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                ChartDataList chartDataList = this.chartDataList_;
                return chartDataList == null ? ChartDataList.getDefaultInstance() : chartDataList;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public String getPeriod() {
                Object obj = this.period_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.period_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public ByteString getPeriodBytes() {
                Object obj = this.period_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.period_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public SESummary getSummary() {
                SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> singleFieldBuilder = this.summaryBuilder_;
                if (singleFieldBuilder != null) {
                    return (SESummary) singleFieldBuilder.getMessage();
                }
                SESummary sESummary = this.summary_;
                return sESummary == null ? SESummary.getDefaultInstance() : sESummary;
            }

            public SESummary.Builder getSummaryBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SESummary.Builder) internalGetSummaryFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public SESummaryOrBuilder getSummaryOrBuilder() {
                SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> singleFieldBuilder = this.summaryBuilder_;
                if (singleFieldBuilder != null) {
                    return (SESummaryOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SESummary sESummary = this.summary_;
                return sESummary == null ? SESummary.getDefaultInstance() : sESummary;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public String getValueTitle() {
                Object obj = this.valueTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.valueTitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public ByteString getValueTitleBytes() {
                Object obj = this.valueTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.valueTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public int getYMax() {
                return this.yMax_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public boolean hasChartDataList() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public boolean hasPeriod() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public boolean hasSummary() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public boolean hasValueTitle() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
            public boolean hasYMax() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_fieldAccessorTable.ensureFieldAccessorsInitialized(SEHistoryTemplateUI.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasTitle() || !hasYMax()) {
                    return false;
                }
                if (!hasSummary() || getSummary().isInitialized()) {
                    return !hasChartDataList() || getChartDataList().isInitialized();
                }
                return false;
            }

            public Builder mergeChartDataList(ChartDataList chartDataList) {
                ChartDataList chartDataList2;
                SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> singleFieldBuilder = this.chartDataListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(chartDataList);
                } else if ((this.bitField0_ & 32) == 0 || (chartDataList2 = this.chartDataList_) == null || chartDataList2 == ChartDataList.getDefaultInstance()) {
                    this.chartDataList_ = chartDataList;
                } else {
                    getChartDataListBuilder().mergeFrom(chartDataList);
                }
                if (this.chartDataList_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSummary(SESummary sESummary) {
                SESummary sESummary2;
                SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> singleFieldBuilder = this.summaryBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sESummary);
                } else if ((this.bitField0_ & 16) == 0 || (sESummary2 = this.summary_) == null || sESummary2 == SESummary.getDefaultInstance()) {
                    this.summary_ = sESummary;
                } else {
                    getSummaryBuilder().mergeFrom(sESummary);
                }
                if (this.summary_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder setChartDataList(ChartDataList chartDataList) {
                SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> singleFieldBuilder = this.chartDataListBuilder_;
                if (singleFieldBuilder == null) {
                    chartDataList.getClass();
                    this.chartDataList_ = chartDataList;
                } else {
                    singleFieldBuilder.setMessage(chartDataList);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPeriod(String str) {
                str.getClass();
                this.period_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPeriodBytes(ByteString byteString) {
                byteString.getClass();
                this.period_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSummary(SESummary sESummary) {
                SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> singleFieldBuilder = this.summaryBuilder_;
                if (singleFieldBuilder == null) {
                    sESummary.getClass();
                    this.summary_ = sESummary;
                } else {
                    singleFieldBuilder.setMessage(sESummary);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.title_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setValueTitle(String str) {
                str.getClass();
                this.valueTitle_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setValueTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.valueTitle_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setYMax(int i7) {
                this.yMax_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                this.title_ = "";
                this.period_ = "";
                this.valueTitle_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEHistoryTemplateUI build() {
                SEHistoryTemplateUI sEHistoryTemplateUIBuildPartial = buildPartial();
                if (sEHistoryTemplateUIBuildPartial.isInitialized()) {
                    return sEHistoryTemplateUIBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEHistoryTemplateUIBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEHistoryTemplateUI buildPartial() {
                SEHistoryTemplateUI sEHistoryTemplateUI = new SEHistoryTemplateUI(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEHistoryTemplateUI);
                }
                onBuilt();
                return sEHistoryTemplateUI;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEHistoryTemplateUI getDefaultInstanceForType() {
                return SEHistoryTemplateUI.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.title_ = "";
                this.period_ = "";
                this.valueTitle_ = "";
                this.yMax_ = 0;
                this.summary_ = null;
                SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> singleFieldBuilder = this.summaryBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.summaryBuilder_ = null;
                }
                this.chartDataList_ = null;
                SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> singleFieldBuilder2 = this.chartDataListBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.chartDataListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEHistoryTemplateUI) {
                    return mergeFrom((SEHistoryTemplateUI) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setChartDataList(ChartDataList.Builder builder) {
                SingleFieldBuilder<ChartDataList, ChartDataList.Builder, ChartDataListOrBuilder> singleFieldBuilder = this.chartDataListBuilder_;
                if (singleFieldBuilder == null) {
                    this.chartDataList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSummary(SESummary.Builder builder) {
                SingleFieldBuilder<SESummary, SESummary.Builder, SESummaryOrBuilder> singleFieldBuilder = this.summaryBuilder_;
                if (singleFieldBuilder == null) {
                    this.summary_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = "";
                this.period_ = "";
                this.valueTitle_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(SEHistoryTemplateUI sEHistoryTemplateUI) {
                if (sEHistoryTemplateUI == SEHistoryTemplateUI.getDefaultInstance()) {
                    return this;
                }
                if (sEHistoryTemplateUI.hasTitle()) {
                    this.title_ = sEHistoryTemplateUI.title_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEHistoryTemplateUI.hasPeriod()) {
                    this.period_ = sEHistoryTemplateUI.period_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEHistoryTemplateUI.hasValueTitle()) {
                    this.valueTitle_ = sEHistoryTemplateUI.valueTitle_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEHistoryTemplateUI.hasYMax()) {
                    setYMax(sEHistoryTemplateUI.getYMax());
                }
                if (sEHistoryTemplateUI.hasSummary()) {
                    mergeSummary(sEHistoryTemplateUI.getSummary());
                }
                if (sEHistoryTemplateUI.hasChartDataList()) {
                    mergeChartDataList(sEHistoryTemplateUI.getChartDataList());
                }
                mergeUnknownFields(sEHistoryTemplateUI.getUnknownFields());
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
                                    this.title_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.period_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.valueTitle_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.yMax_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(internalGetSummaryFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag != 50) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetChartDataListFieldBuilder().getBuilder(), extensionRegistryLite);
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

        public static final class ChartData extends GeneratedMessage implements ChartDataOrBuilder {
            public static final int CATEGORY_FIELD_NUMBER = 4;
            public static final int CHART_VALUE_FIELD_NUMBER = 3;
            private static final ChartData DEFAULT_INSTANCE;
            private static final Parser<ChartData> PARSER;
            public static final int TIME_DATE_FIELD_NUMBER = 1;
            public static final int WEEK_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object category_;
            private int chartValue_;
            private byte memoizedIsInitialized;
            private CommonProtos.SETimeDate timeDate_;
            private int week_;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEHistoryTemplateUI$ChartData$1 */
            public class AnonymousClass1 extends AbstractParser<ChartData> {
                @Override // com.google.protobuf.Parser
                public ChartData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ChartData.newBuilder();
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

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ChartDataOrBuilder {
                private int bitField0_;
                private Object category_;
                private int chartValue_;
                private SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> timeDateBuilder_;
                private CommonProtos.SETimeDate timeDate_;
                private int week_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                    this(builderParent);
                }

                private void buildPartial0(ChartData chartData) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                        chartData.timeDate_ = singleFieldBuilder == null ? this.timeDate_ : (CommonProtos.SETimeDate) singleFieldBuilder.build();
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        chartData.week_ = this.week_;
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        chartData.chartValue_ = this.chartValue_;
                        i7 |= 4;
                    }
                    if ((i8 & 8) != 0) {
                        chartData.category_ = this.category_;
                        i7 |= 8;
                    }
                    chartData.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartData_descriptor;
                }

                private SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> internalGetTimeDateFieldBuilder() {
                    if (this.timeDateBuilder_ == null) {
                        this.timeDateBuilder_ = new SingleFieldBuilder<>(getTimeDate(), getParentForChildren(), isClean());
                        this.timeDate_ = null;
                    }
                    return this.timeDateBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        internalGetTimeDateFieldBuilder();
                    }
                }

                public Builder clearCategory() {
                    this.category_ = ChartData.getDefaultInstance().getCategory();
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearChartValue() {
                    this.bitField0_ &= -5;
                    this.chartValue_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearTimeDate() {
                    this.bitField0_ &= -2;
                    this.timeDate_ = null;
                    SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.timeDateBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearWeek() {
                    this.bitField0_ &= -3;
                    this.week_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public String getCategory() {
                    Object obj = this.category_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.category_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public ByteString getCategoryBytes() {
                    Object obj = this.category_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.category_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public int getChartValue() {
                    return this.chartValue_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartData_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public CommonProtos.SETimeDate getTimeDate() {
                    SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SETimeDate) singleFieldBuilder.getMessage();
                    }
                    CommonProtos.SETimeDate sETimeDate = this.timeDate_;
                    return sETimeDate == null ? CommonProtos.SETimeDate.getDefaultInstance() : sETimeDate;
                }

                public CommonProtos.SETimeDate.Builder getTimeDateBuilder() {
                    this.bitField0_ |= 1;
                    onChanged();
                    return (CommonProtos.SETimeDate.Builder) internalGetTimeDateFieldBuilder().getBuilder();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public CommonProtos.SETimeDateOrBuilder getTimeDateOrBuilder() {
                    SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                    if (singleFieldBuilder != null) {
                        return (CommonProtos.SETimeDateOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                    }
                    CommonProtos.SETimeDate sETimeDate = this.timeDate_;
                    return sETimeDate == null ? CommonProtos.SETimeDate.getDefaultInstance() : sETimeDate;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public int getWeek() {
                    return this.week_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public boolean hasCategory() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public boolean hasChartValue() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public boolean hasTimeDate() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
                public boolean hasWeek() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartData_fieldAccessorTable.ensureFieldAccessorsInitialized(ChartData.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasTimeDate() && hasWeek() && hasChartValue() && hasCategory() && getTimeDate().isInitialized();
                }

                public Builder mergeTimeDate(CommonProtos.SETimeDate sETimeDate) {
                    CommonProtos.SETimeDate sETimeDate2;
                    SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.mergeFrom(sETimeDate);
                    } else if ((this.bitField0_ & 1) == 0 || (sETimeDate2 = this.timeDate_) == null || sETimeDate2 == CommonProtos.SETimeDate.getDefaultInstance()) {
                        this.timeDate_ = sETimeDate;
                    } else {
                        getTimeDateBuilder().mergeFrom(sETimeDate);
                    }
                    if (this.timeDate_ != null) {
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    return this;
                }

                public Builder setCategory(String str) {
                    str.getClass();
                    this.category_ = str;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setCategoryBytes(ByteString byteString) {
                    byteString.getClass();
                    this.category_ = byteString;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setChartValue(int i7) {
                    this.chartValue_ = i7;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setTimeDate(CommonProtos.SETimeDate sETimeDate) {
                    SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                    if (singleFieldBuilder == null) {
                        sETimeDate.getClass();
                        this.timeDate_ = sETimeDate;
                    } else {
                        singleFieldBuilder.setMessage(sETimeDate);
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setWeek(int i7) {
                    this.week_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                private Builder() {
                    this.category_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ChartData build() {
                    ChartData chartDataBuildPartial = buildPartial();
                    if (chartDataBuildPartial.isInitialized()) {
                        return chartDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) chartDataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ChartData buildPartial() {
                    ChartData chartData = new ChartData(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(chartData);
                    }
                    onBuilt();
                    return chartData;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ChartData getDefaultInstanceForType() {
                    return ChartData.getDefaultInstance();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.timeDate_ = null;
                    SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                    if (singleFieldBuilder != null) {
                        singleFieldBuilder.dispose();
                        this.timeDateBuilder_ = null;
                    }
                    this.week_ = 0;
                    this.chartValue_ = 0;
                    this.category_ = "";
                    return this;
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.category_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ChartData) {
                        return mergeFrom((ChartData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setTimeDate(CommonProtos.SETimeDate.Builder builder) {
                    SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                    if (singleFieldBuilder == null) {
                        this.timeDate_ = builder.build();
                    } else {
                        singleFieldBuilder.setMessage(builder.build());
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(ChartData chartData) {
                    if (chartData == ChartData.getDefaultInstance()) {
                        return this;
                    }
                    if (chartData.hasTimeDate()) {
                        mergeTimeDate(chartData.getTimeDate());
                    }
                    if (chartData.hasWeek()) {
                        setWeek(chartData.getWeek());
                    }
                    if (chartData.hasChartValue()) {
                        setChartValue(chartData.getChartValue());
                    }
                    if (chartData.hasCategory()) {
                        this.category_ = chartData.category_;
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    mergeUnknownFields(chartData.getUnknownFields());
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
                                        codedInputStream.readMessage(internalGetTimeDateFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 1;
                                    } else if (tag == 16) {
                                        this.week_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 24) {
                                        this.chartValue_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 4;
                                    } else if (tag != 34) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.category_ = codedInputStream.readBytes();
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "ChartData");
                DEFAULT_INSTANCE = new ChartData();
                PARSER = new AbstractParser<ChartData>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartData.1
                    @Override // com.google.protobuf.Parser
                    public ChartData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = ChartData.newBuilder();
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

            public /* synthetic */ ChartData(GeneratedMessage.Builder builder, a aVar) {
                this(builder);
            }

            public static ChartData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ChartData parseDelimitedFrom(InputStream inputStream) {
                return (ChartData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ChartData parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<ChartData> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ChartData)) {
                    return super.equals(obj);
                }
                ChartData chartData = (ChartData) obj;
                if (hasTimeDate() != chartData.hasTimeDate()) {
                    return false;
                }
                if ((hasTimeDate() && !getTimeDate().equals(chartData.getTimeDate())) || hasWeek() != chartData.hasWeek()) {
                    return false;
                }
                if ((hasWeek() && getWeek() != chartData.getWeek()) || hasChartValue() != chartData.hasChartValue()) {
                    return false;
                }
                if ((!hasChartValue() || getChartValue() == chartData.getChartValue()) && hasCategory() == chartData.hasCategory()) {
                    return (!hasCategory() || getCategory().equals(chartData.getCategory())) && getUnknownFields().equals(chartData.getUnknownFields());
                }
                return false;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public String getCategory() {
                Object obj = this.category_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.category_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public ByteString getCategoryBytes() {
                Object obj = this.category_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.category_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public int getChartValue() {
                return this.chartValue_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartData_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<ChartData> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTimeDate()) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.week_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, this.chartValue_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeMessageSize += GeneratedMessage.computeStringSize(4, this.category_);
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public CommonProtos.SETimeDate getTimeDate() {
                CommonProtos.SETimeDate sETimeDate = this.timeDate_;
                return sETimeDate == null ? CommonProtos.SETimeDate.getDefaultInstance() : sETimeDate;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public CommonProtos.SETimeDateOrBuilder getTimeDateOrBuilder() {
                CommonProtos.SETimeDate sETimeDate = this.timeDate_;
                return sETimeDate == null ? CommonProtos.SETimeDate.getDefaultInstance() : sETimeDate;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public int getWeek() {
                return this.week_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public boolean hasCategory() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public boolean hasChartValue() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public boolean hasTimeDate() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataOrBuilder
            public boolean hasWeek() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasTimeDate()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTimeDate().hashCode();
                }
                if (hasWeek()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getWeek();
                }
                if (hasChartValue()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getChartValue();
                }
                if (hasCategory()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getCategory().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartData_fieldAccessorTable.ensureFieldAccessorsInitialized(ChartData.class, Builder.class);
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
                if (!hasTimeDate()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasWeek()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasChartValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasCategory()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (getTimeDate().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(1, getTimeDate());
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeUInt32(2, this.week_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeUInt32(3, this.chartValue_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 4, this.category_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private ChartData(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.week_ = 0;
                this.chartValue_ = 0;
                this.category_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(ChartData chartData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(chartData);
            }

            public static ChartData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static ChartData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ChartData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ChartData parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChartData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static ChartData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static ChartData parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static ChartData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            private ChartData() {
                this.week_ = 0;
                this.chartValue_ = 0;
                this.category_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.category_ = "";
            }

            public static ChartData parseFrom(InputStream inputStream) {
                return (ChartData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static ChartData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ChartData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ChartData parseFrom(CodedInputStream codedInputStream) {
                return (ChartData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static ChartData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ChartData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ChartDataList extends GeneratedMessage implements ChartDataListOrBuilder {
            public static final int CHART_LIST_FIELD_NUMBER = 1;
            private static final ChartDataList DEFAULT_INSTANCE;
            private static final Parser<ChartDataList> PARSER;
            private static final long serialVersionUID = 0;
            private List<ChartData> chartList_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEHistoryTemplateUI$ChartDataList$1 */
            public class AnonymousClass1 extends AbstractParser<ChartDataList> {
                @Override // com.google.protobuf.Parser
                public ChartDataList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ChartDataList.newBuilder();
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

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ChartDataListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> chartListBuilder_;
                private List<ChartData> chartList_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                    this(builderParent);
                }

                private void buildPartial0(ChartDataList chartDataList) {
                }

                private void buildPartialRepeatedFields(ChartDataList chartDataList) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder != null) {
                        chartDataList.chartList_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.chartList_ = Collections.unmodifiableList(this.chartList_);
                        this.bitField0_ &= -2;
                    }
                    chartDataList.chartList_ = this.chartList_;
                }

                private void ensureChartListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.chartList_ = new ArrayList(this.chartList_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartDataList_descriptor;
                }

                private RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> internalGetChartListFieldBuilder() {
                    if (this.chartListBuilder_ == null) {
                        this.chartListBuilder_ = new RepeatedFieldBuilder<>(this.chartList_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.chartList_ = null;
                    }
                    return this.chartListBuilder_;
                }

                public Builder addAllChartList(Iterable<? extends ChartData> iterable) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureChartListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.chartList_);
                    onChanged();
                    return this;
                }

                public Builder addChartList(ChartData chartData) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(chartData);
                        return this;
                    }
                    chartData.getClass();
                    ensureChartListIsMutable();
                    this.chartList_.add(chartData);
                    onChanged();
                    return this;
                }

                public ChartData.Builder addChartListBuilder() {
                    return (ChartData.Builder) internalGetChartListFieldBuilder().addBuilder(ChartData.getDefaultInstance());
                }

                public Builder clearChartList() {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.clear();
                        return this;
                    }
                    this.chartList_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
                public ChartData getChartList(int i7) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    return repeatedFieldBuilder == null ? this.chartList_.get(i7) : (ChartData) repeatedFieldBuilder.getMessage(i7);
                }

                public ChartData.Builder getChartListBuilder(int i7) {
                    return (ChartData.Builder) internalGetChartListFieldBuilder().getBuilder(i7);
                }

                public List<ChartData.Builder> getChartListBuilderList() {
                    return internalGetChartListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
                public int getChartListCount() {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    return repeatedFieldBuilder == null ? this.chartList_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
                public List<ChartData> getChartListList() {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.chartList_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
                public ChartDataOrBuilder getChartListOrBuilder(int i7) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    return repeatedFieldBuilder == null ? this.chartList_.get(i7) : (ChartDataOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
                public List<? extends ChartDataOrBuilder> getChartListOrBuilderList() {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.chartList_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartDataList_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartDataList_fieldAccessorTable.ensureFieldAccessorsInitialized(ChartDataList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    for (int i7 = 0; i7 < getChartListCount(); i7++) {
                        if (!getChartList(i7).isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                public Builder removeChartList(int i7) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureChartListIsMutable();
                    this.chartList_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setChartList(int i7, ChartData chartData) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, chartData);
                        return this;
                    }
                    chartData.getClass();
                    ensureChartListIsMutable();
                    this.chartList_.set(i7, chartData);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                private Builder() {
                    this.chartList_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ChartDataList build() {
                    ChartDataList chartDataListBuildPartial = buildPartial();
                    if (chartDataListBuildPartial.isInitialized()) {
                        return chartDataListBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) chartDataListBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ChartDataList buildPartial() {
                    ChartDataList chartDataList = new ChartDataList(this);
                    buildPartialRepeatedFields(chartDataList);
                    if (this.bitField0_ != 0) {
                        buildPartial0(chartDataList);
                    }
                    onBuilt();
                    return chartDataList;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ChartDataList getDefaultInstanceForType() {
                    return ChartDataList.getDefaultInstance();
                }

                public ChartData.Builder addChartListBuilder(int i7) {
                    return (ChartData.Builder) internalGetChartListFieldBuilder().addBuilder(i7, ChartData.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.chartList_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.chartList_ = Collections.EMPTY_LIST;
                    } else {
                        this.chartList_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addChartList(int i7, ChartData chartData) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder == null) {
                        chartData.getClass();
                        ensureChartListIsMutable();
                        this.chartList_.add(i7, chartData);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, chartData);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ChartDataList) {
                        return mergeFrom((ChartDataList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setChartList(int i7, ChartData.Builder builder) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureChartListIsMutable();
                        this.chartList_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(ChartDataList chartDataList) {
                    if (chartDataList == ChartDataList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.chartListBuilder_ == null) {
                        if (!chartDataList.chartList_.isEmpty()) {
                            if (this.chartList_.isEmpty()) {
                                this.chartList_ = chartDataList.chartList_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureChartListIsMutable();
                                this.chartList_.addAll(chartDataList.chartList_);
                            }
                            onChanged();
                        }
                    } else if (!chartDataList.chartList_.isEmpty()) {
                        if (this.chartListBuilder_.isEmpty()) {
                            this.chartListBuilder_.dispose();
                            this.chartListBuilder_ = null;
                            this.chartList_ = chartDataList.chartList_;
                            this.bitField0_ &= -2;
                            this.chartListBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetChartListFieldBuilder() : null;
                        } else {
                            this.chartListBuilder_.addAllMessages(chartDataList.chartList_);
                        }
                    }
                    mergeUnknownFields(chartDataList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addChartList(ChartData.Builder builder) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureChartListIsMutable();
                        this.chartList_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addChartList(int i7, ChartData.Builder builder) {
                    RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureChartListIsMutable();
                        this.chartList_.add(i7, builder.build());
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
                                        ChartData chartData = (ChartData) codedInputStream.readMessage(ChartData.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<ChartData, ChartData.Builder, ChartDataOrBuilder> repeatedFieldBuilder = this.chartListBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureChartListIsMutable();
                                            this.chartList_.add(chartData);
                                        } else {
                                            repeatedFieldBuilder.addMessage(chartData);
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "ChartDataList");
                DEFAULT_INSTANCE = new ChartDataList();
                PARSER = new AbstractParser<ChartDataList>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataList.1
                    @Override // com.google.protobuf.Parser
                    public ChartDataList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = ChartDataList.newBuilder();
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

            public /* synthetic */ ChartDataList(GeneratedMessage.Builder builder, a aVar) {
                this(builder);
            }

            public static ChartDataList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartDataList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ChartDataList parseDelimitedFrom(InputStream inputStream) {
                return (ChartDataList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ChartDataList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<ChartDataList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ChartDataList)) {
                    return super.equals(obj);
                }
                ChartDataList chartDataList = (ChartDataList) obj;
                return getChartListList().equals(chartDataList.getChartListList()) && getUnknownFields().equals(chartDataList.getUnknownFields());
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
            public ChartData getChartList(int i7) {
                return this.chartList_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
            public int getChartListCount() {
                return this.chartList_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
            public List<ChartData> getChartListList() {
                return this.chartList_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
            public ChartDataOrBuilder getChartListOrBuilder(int i7) {
                return this.chartList_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.ChartDataListOrBuilder
            public List<? extends ChartDataOrBuilder> getChartListOrBuilderList() {
                return this.chartList_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartDataList_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<ChartDataList> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int size = this.chartList_.size();
                int iComputeMessageSizeNoTag = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    iComputeMessageSizeNoTag += CodedOutputStream.computeMessageSizeNoTag(this.chartList_.get(i8));
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
                if (getChartListCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getChartListList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_ChartDataList_fieldAccessorTable.ensureFieldAccessorsInitialized(ChartDataList.class, Builder.class);
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
                for (int i7 = 0; i7 < getChartListCount(); i7++) {
                    if (!getChartList(i7).isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i7 = 0; i7 < this.chartList_.size(); i7++) {
                    codedOutputStream.writeMessage(1, this.chartList_.get(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private ChartDataList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(ChartDataList chartDataList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(chartDataList);
            }

            public static ChartDataList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static ChartDataList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ChartDataList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ChartDataList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChartDataList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private ChartDataList() {
                this.memoizedIsInitialized = (byte) -1;
                this.chartList_ = Collections.EMPTY_LIST;
            }

            public static ChartDataList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static ChartDataList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static ChartDataList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static ChartDataList parseFrom(InputStream inputStream) {
                return (ChartDataList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static ChartDataList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ChartDataList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ChartDataList parseFrom(CodedInputStream codedInputStream) {
                return (ChartDataList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static ChartDataList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ChartDataList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ChartDataListOrBuilder extends MessageOrBuilder {
            ChartData getChartList(int i7);

            int getChartListCount();

            List<ChartData> getChartListList();

            ChartDataOrBuilder getChartListOrBuilder(int i7);

            List<? extends ChartDataOrBuilder> getChartListOrBuilderList();
        }

        public interface ChartDataOrBuilder extends MessageOrBuilder {
            String getCategory();

            ByteString getCategoryBytes();

            int getChartValue();

            CommonProtos.SETimeDate getTimeDate();

            CommonProtos.SETimeDateOrBuilder getTimeDateOrBuilder();

            int getWeek();

            boolean hasCategory();

            boolean hasChartValue();

            boolean hasTimeDate();

            boolean hasWeek();
        }

        public static final class SESummary extends GeneratedMessage implements SESummaryOrBuilder {
            public static final int AVG_VALUE_FIELD_NUMBER = 3;
            private static final SESummary DEFAULT_INSTANCE;
            public static final int MAX_VALUE_FIELD_NUMBER = 1;
            public static final int MIN_VALUE_FIELD_NUMBER = 2;
            private static final Parser<SESummary> PARSER;
            public static final int UNIT_FIELD_NUMBER = 4;
            private static final long serialVersionUID = 0;
            private int avgValue_;
            private int bitField0_;
            private int maxValue_;
            private byte memoizedIsInitialized;
            private int minValue_;
            private volatile Object unit_;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEHistoryTemplateUI$SESummary$1 */
            public class AnonymousClass1 extends AbstractParser<SESummary> {
                @Override // com.google.protobuf.Parser
                public SESummary parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESummary.newBuilder();
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

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESummaryOrBuilder {
                private int avgValue_;
                private int bitField0_;
                private int maxValue_;
                private int minValue_;
                private Object unit_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                    this(builderParent);
                }

                private void buildPartial0(SESummary sESummary) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        sESummary.maxValue_ = this.maxValue_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 2) != 0) {
                        sESummary.minValue_ = this.minValue_;
                        i7 |= 2;
                    }
                    if ((i8 & 4) != 0) {
                        sESummary.avgValue_ = this.avgValue_;
                        i7 |= 4;
                    }
                    if ((i8 & 8) != 0) {
                        sESummary.unit_ = this.unit_;
                        i7 |= 8;
                    }
                    sESummary.bitField0_ |= i7;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_SESummary_descriptor;
                }

                public Builder clearAvgValue() {
                    this.bitField0_ &= -5;
                    this.avgValue_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearMaxValue() {
                    this.bitField0_ &= -2;
                    this.maxValue_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearMinValue() {
                    this.bitField0_ &= -3;
                    this.minValue_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearUnit() {
                    this.unit_ = SESummary.getDefaultInstance().getUnit();
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
                public int getAvgValue() {
                    return this.avgValue_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_SESummary_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
                public int getMaxValue() {
                    return this.maxValue_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
                public int getMinValue() {
                    return this.minValue_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
                public String getUnit() {
                    Object obj = this.unit_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.unit_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
                public ByteString getUnitBytes() {
                    Object obj = this.unit_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.unit_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
                public boolean hasAvgValue() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
                public boolean hasMaxValue() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
                public boolean hasMinValue() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
                public boolean hasUnit() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_SESummary_fieldAccessorTable.ensureFieldAccessorsInitialized(SESummary.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasMaxValue() && hasMinValue() && hasAvgValue() && hasUnit();
                }

                public Builder setAvgValue(int i7) {
                    this.avgValue_ = i7;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setMaxValue(int i7) {
                    this.maxValue_ = i7;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setMinValue(int i7) {
                    this.minValue_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setUnit(String str) {
                    str.getClass();
                    this.unit_ = str;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setUnitBytes(ByteString byteString) {
                    byteString.getClass();
                    this.unit_ = byteString;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                private Builder() {
                    this.unit_ = "";
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SESummary build() {
                    SESummary sESummaryBuildPartial = buildPartial();
                    if (sESummaryBuildPartial.isInitialized()) {
                        return sESummaryBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESummaryBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SESummary buildPartial() {
                    SESummary sESummary = new SESummary(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(sESummary);
                    }
                    onBuilt();
                    return sESummary;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SESummary getDefaultInstanceForType() {
                    return SESummary.getDefaultInstance();
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.unit_ = "";
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.maxValue_ = 0;
                    this.minValue_ = 0;
                    this.avgValue_ = 0;
                    this.unit_ = "";
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SESummary) {
                        return mergeFrom((SESummary) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(SESummary sESummary) {
                    if (sESummary == SESummary.getDefaultInstance()) {
                        return this;
                    }
                    if (sESummary.hasMaxValue()) {
                        setMaxValue(sESummary.getMaxValue());
                    }
                    if (sESummary.hasMinValue()) {
                        setMinValue(sESummary.getMinValue());
                    }
                    if (sESummary.hasAvgValue()) {
                        setAvgValue(sESummary.getAvgValue());
                    }
                    if (sESummary.hasUnit()) {
                        this.unit_ = sESummary.unit_;
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    mergeUnknownFields(sESummary.getUnknownFields());
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
                                        this.maxValue_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 16) {
                                        this.minValue_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 24) {
                                        this.avgValue_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 4;
                                    } else if (tag != 34) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.unit_ = codedInputStream.readBytes();
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESummary");
                DEFAULT_INSTANCE = new SESummary();
                PARSER = new AbstractParser<SESummary>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummary.1
                    @Override // com.google.protobuf.Parser
                    public SESummary parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = SESummary.newBuilder();
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

            public /* synthetic */ SESummary(GeneratedMessage.Builder builder, a aVar) {
                this(builder);
            }

            public static SESummary getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_SESummary_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SESummary parseDelimitedFrom(InputStream inputStream) {
                return (SESummary) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SESummary parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<SESummary> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SESummary)) {
                    return super.equals(obj);
                }
                SESummary sESummary = (SESummary) obj;
                if (hasMaxValue() != sESummary.hasMaxValue()) {
                    return false;
                }
                if ((hasMaxValue() && getMaxValue() != sESummary.getMaxValue()) || hasMinValue() != sESummary.hasMinValue()) {
                    return false;
                }
                if ((hasMinValue() && getMinValue() != sESummary.getMinValue()) || hasAvgValue() != sESummary.hasAvgValue()) {
                    return false;
                }
                if ((!hasAvgValue() || getAvgValue() == sESummary.getAvgValue()) && hasUnit() == sESummary.hasUnit()) {
                    return (!hasUnit() || getUnit().equals(sESummary.getUnit())) && getUnknownFields().equals(sESummary.getUnknownFields());
                }
                return false;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
            public int getAvgValue() {
                return this.avgValue_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_SESummary_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
            public int getMaxValue() {
                return this.maxValue_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
            public int getMinValue() {
                return this.minValue_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<SESummary> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.maxValue_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.minValue_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.avgValue_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeUInt32Size += GeneratedMessage.computeStringSize(4, this.unit_);
                }
                int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
            public String getUnit() {
                Object obj = this.unit_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.unit_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
            public ByteString getUnitBytes() {
                Object obj = this.unit_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.unit_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
            public boolean hasAvgValue() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
            public boolean hasMaxValue() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
            public boolean hasMinValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.SESummaryOrBuilder
            public boolean hasUnit() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i7 = this.memoizedHashCode;
                if (i7 != 0) {
                    return i7;
                }
                int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
                if (hasMaxValue()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getMaxValue();
                }
                if (hasMinValue()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getMinValue();
                }
                if (hasAvgValue()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getAvgValue();
                }
                if (hasUnit()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getUnit().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_SESummary_fieldAccessorTable.ensureFieldAccessorsInitialized(SESummary.class, Builder.class);
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
                if (!hasMaxValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasMinValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasAvgValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasUnit()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeUInt32(1, this.maxValue_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeUInt32(2, this.minValue_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeUInt32(3, this.avgValue_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    GeneratedMessage.writeString(codedOutputStream, 4, this.unit_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private SESummary(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.maxValue_ = 0;
                this.minValue_ = 0;
                this.avgValue_ = 0;
                this.unit_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SESummary sESummary) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESummary);
            }

            public static SESummary parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static SESummary parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SESummary) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SESummary parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESummary getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SESummary parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static SESummary parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static SESummary parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static SESummary parseFrom(InputStream inputStream) {
                return (SESummary) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            private SESummary() {
                this.maxValue_ = 0;
                this.minValue_ = 0;
                this.avgValue_ = 0;
                this.unit_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.unit_ = "";
            }

            public static SESummary parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SESummary) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SESummary parseFrom(CodedInputStream codedInputStream) {
                return (SESummary) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static SESummary parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SESummary) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface SESummaryOrBuilder extends MessageOrBuilder {
            int getAvgValue();

            int getMaxValue();

            int getMinValue();

            String getUnit();

            ByteString getUnitBytes();

            boolean hasAvgValue();

            boolean hasMaxValue();

            boolean hasMinValue();

            boolean hasUnit();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEHistoryTemplateUI");
            DEFAULT_INSTANCE = new SEHistoryTemplateUI();
            PARSER = new AbstractParser<SEHistoryTemplateUI>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUI.1
                @Override // com.google.protobuf.Parser
                public SEHistoryTemplateUI parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEHistoryTemplateUI.newBuilder();
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

        public /* synthetic */ SEHistoryTemplateUI(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEHistoryTemplateUI getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEHistoryTemplateUI parseDelimitedFrom(InputStream inputStream) {
            return (SEHistoryTemplateUI) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEHistoryTemplateUI parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEHistoryTemplateUI> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEHistoryTemplateUI)) {
                return super.equals(obj);
            }
            SEHistoryTemplateUI sEHistoryTemplateUI = (SEHistoryTemplateUI) obj;
            if (hasTitle() != sEHistoryTemplateUI.hasTitle()) {
                return false;
            }
            if ((hasTitle() && !getTitle().equals(sEHistoryTemplateUI.getTitle())) || hasPeriod() != sEHistoryTemplateUI.hasPeriod()) {
                return false;
            }
            if ((hasPeriod() && !getPeriod().equals(sEHistoryTemplateUI.getPeriod())) || hasValueTitle() != sEHistoryTemplateUI.hasValueTitle()) {
                return false;
            }
            if ((hasValueTitle() && !getValueTitle().equals(sEHistoryTemplateUI.getValueTitle())) || hasYMax() != sEHistoryTemplateUI.hasYMax()) {
                return false;
            }
            if ((hasYMax() && getYMax() != sEHistoryTemplateUI.getYMax()) || hasSummary() != sEHistoryTemplateUI.hasSummary()) {
                return false;
            }
            if ((!hasSummary() || getSummary().equals(sEHistoryTemplateUI.getSummary())) && hasChartDataList() == sEHistoryTemplateUI.hasChartDataList()) {
                return (!hasChartDataList() || getChartDataList().equals(sEHistoryTemplateUI.getChartDataList())) && getUnknownFields().equals(sEHistoryTemplateUI.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public ChartDataList getChartDataList() {
            ChartDataList chartDataList = this.chartDataList_;
            return chartDataList == null ? ChartDataList.getDefaultInstance() : chartDataList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public ChartDataListOrBuilder getChartDataListOrBuilder() {
            ChartDataList chartDataList = this.chartDataList_;
            return chartDataList == null ? ChartDataList.getDefaultInstance() : chartDataList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEHistoryTemplateUI> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public String getPeriod() {
            Object obj = this.period_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.period_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public ByteString getPeriodBytes() {
            Object obj = this.period_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.period_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.title_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.period_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.valueTitle_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.yMax_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(5, getSummary());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, getChartDataList());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public SESummary getSummary() {
            SESummary sESummary = this.summary_;
            return sESummary == null ? SESummary.getDefaultInstance() : sESummary;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public SESummaryOrBuilder getSummaryOrBuilder() {
            SESummary sESummary = this.summary_;
            return sESummary == null ? SESummary.getDefaultInstance() : sESummary;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public String getValueTitle() {
            Object obj = this.valueTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.valueTitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public ByteString getValueTitleBytes() {
            Object obj = this.valueTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.valueTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public int getYMax() {
            return this.yMax_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public boolean hasChartDataList() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public boolean hasPeriod() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public boolean hasSummary() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public boolean hasValueTitle() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEHistoryTemplateUIOrBuilder
        public boolean hasYMax() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasTitle()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTitle().hashCode();
            }
            if (hasPeriod()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getPeriod().hashCode();
            }
            if (hasValueTitle()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getValueTitle().hashCode();
            }
            if (hasYMax()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getYMax();
            }
            if (hasSummary()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getSummary().hashCode();
            }
            if (hasChartDataList()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getChartDataList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AIFunctionProtos.internal_static_SA_SEHistoryTemplateUI_fieldAccessorTable.ensureFieldAccessorsInitialized(SEHistoryTemplateUI.class, Builder.class);
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
            if (!hasTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasYMax()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSummary() && !getSummary().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasChartDataList() || getChartDataList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.title_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.period_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.valueTitle_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.yMax_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSummary());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getChartDataList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEHistoryTemplateUI(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.title_ = "";
            this.period_ = "";
            this.valueTitle_ = "";
            this.yMax_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEHistoryTemplateUI sEHistoryTemplateUI) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEHistoryTemplateUI);
        }

        public static SEHistoryTemplateUI parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEHistoryTemplateUI parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHistoryTemplateUI) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEHistoryTemplateUI parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEHistoryTemplateUI getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEHistoryTemplateUI parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEHistoryTemplateUI parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEHistoryTemplateUI parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEHistoryTemplateUI parseFrom(InputStream inputStream) {
            return (SEHistoryTemplateUI) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEHistoryTemplateUI() {
            this.title_ = "";
            this.period_ = "";
            this.valueTitle_ = "";
            this.yMax_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.title_ = "";
            this.period_ = "";
            this.valueTitle_ = "";
        }

        public static SEHistoryTemplateUI parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHistoryTemplateUI) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEHistoryTemplateUI parseFrom(CodedInputStream codedInputStream) {
            return (SEHistoryTemplateUI) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEHistoryTemplateUI parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEHistoryTemplateUI) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEHistoryTemplateUIOrBuilder extends MessageOrBuilder {
        SEHistoryTemplateUI.ChartDataList getChartDataList();

        SEHistoryTemplateUI.ChartDataListOrBuilder getChartDataListOrBuilder();

        String getPeriod();

        ByteString getPeriodBytes();

        SEHistoryTemplateUI.SESummary getSummary();

        SEHistoryTemplateUI.SESummaryOrBuilder getSummaryOrBuilder();

        String getTitle();

        ByteString getTitleBytes();

        String getValueTitle();

        ByteString getValueTitleBytes();

        int getYMax();

        boolean hasChartDataList();

        boolean hasPeriod();

        boolean hasSummary();

        boolean hasTitle();

        boolean hasValueTitle();

        boolean hasYMax();
    }

    public static final class SEOpenAppFunction extends GeneratedMessage implements SEOpenAppFunctionOrBuilder {
        public static final int ACTION_TIME_FIELD_NUMBER = 2;
        public static final int CLOCK_INFO_LIST_FIELD_NUMBER = 4;
        public static final int CONTACTS_NUMBER_FIELD_NUMBER = 6;
        private static final SEOpenAppFunction DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 5;
        public static final int FUNCTION_FIELD_NUMBER = 1;
        public static final int MUSIC_COMMAND_FIELD_NUMBER = 7;
        private static final Parser<SEOpenAppFunction> PARSER;
        public static final int SCREEN_SETTING_FIELD_NUMBER = 8;
        public static final int WORKOUT_TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private CommonProtos.SETime actionTime_;
        private int bitField0_;
        private SEAIClockInfo.SEList clockInfoList_;
        private volatile Object contactsNumber_;
        private int duration_;
        private int function_;
        private byte memoizedIsInitialized;
        private int musicCommand_;
        private SEAIScreenSetting screenSetting_;
        private int workoutType_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEOpenAppFunction$1 */
        public class AnonymousClass1 extends AbstractParser<SEOpenAppFunction> {
            @Override // com.google.protobuf.Parser
            public SEOpenAppFunction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEOpenAppFunction.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEOpenAppFunctionOrBuilder {
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> actionTimeBuilder_;
            private CommonProtos.SETime actionTime_;
            private int bitField0_;
            private SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> clockInfoListBuilder_;
            private SEAIClockInfo.SEList clockInfoList_;
            private Object contactsNumber_;
            private int duration_;
            private int function_;
            private int musicCommand_;
            private SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> screenSettingBuilder_;
            private SEAIScreenSetting screenSetting_;
            private int workoutType_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEOpenAppFunction sEOpenAppFunction) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEOpenAppFunction.function_ = this.function_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                    sEOpenAppFunction.actionTime_ = singleFieldBuilder == null ? this.actionTime_ : (CommonProtos.SETime) singleFieldBuilder.build();
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEOpenAppFunction.workoutType_ = this.workoutType_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> singleFieldBuilder2 = this.clockInfoListBuilder_;
                    sEOpenAppFunction.clockInfoList_ = singleFieldBuilder2 == null ? this.clockInfoList_ : (SEAIClockInfo.SEList) singleFieldBuilder2.build();
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEOpenAppFunction.duration_ = this.duration_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEOpenAppFunction.contactsNumber_ = this.contactsNumber_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEOpenAppFunction.musicCommand_ = this.musicCommand_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> singleFieldBuilder3 = this.screenSettingBuilder_;
                    sEOpenAppFunction.screenSetting_ = singleFieldBuilder3 == null ? this.screenSetting_ : (SEAIScreenSetting) singleFieldBuilder3.build();
                    i7 |= 128;
                }
                sEOpenAppFunction.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEOpenAppFunction_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetActionTimeFieldBuilder() {
                if (this.actionTimeBuilder_ == null) {
                    this.actionTimeBuilder_ = new SingleFieldBuilder<>(getActionTime(), getParentForChildren(), isClean());
                    this.actionTime_ = null;
                }
                return this.actionTimeBuilder_;
            }

            private SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> internalGetClockInfoListFieldBuilder() {
                if (this.clockInfoListBuilder_ == null) {
                    this.clockInfoListBuilder_ = new SingleFieldBuilder<>(getClockInfoList(), getParentForChildren(), isClean());
                    this.clockInfoList_ = null;
                }
                return this.clockInfoListBuilder_;
            }

            private SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> internalGetScreenSettingFieldBuilder() {
                if (this.screenSettingBuilder_ == null) {
                    this.screenSettingBuilder_ = new SingleFieldBuilder<>(getScreenSetting(), getParentForChildren(), isClean());
                    this.screenSetting_ = null;
                }
                return this.screenSettingBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetActionTimeFieldBuilder();
                    internalGetClockInfoListFieldBuilder();
                    internalGetScreenSettingFieldBuilder();
                }
            }

            public Builder clearActionTime() {
                this.bitField0_ &= -3;
                this.actionTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.actionTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearClockInfoList() {
                this.bitField0_ &= -9;
                this.clockInfoList_ = null;
                SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> singleFieldBuilder = this.clockInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.clockInfoListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearContactsNumber() {
                this.contactsNumber_ = SEOpenAppFunction.getDefaultInstance().getContactsNumber();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearDuration() {
                this.bitField0_ &= -17;
                this.duration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFunction() {
                this.bitField0_ &= -2;
                this.function_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMusicCommand() {
                this.bitField0_ &= -65;
                this.musicCommand_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScreenSetting() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.screenSetting_ = null;
                SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> singleFieldBuilder = this.screenSettingBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.screenSettingBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWorkoutType() {
                this.bitField0_ &= -5;
                this.workoutType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public CommonProtos.SETime getActionTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.actionTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getActionTimeBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetActionTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public CommonProtos.SETimeOrBuilder getActionTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.actionTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public SEAIClockInfo.SEList getClockInfoList() {
                SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> singleFieldBuilder = this.clockInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAIClockInfo.SEList) singleFieldBuilder.getMessage();
                }
                SEAIClockInfo.SEList sEList = this.clockInfoList_;
                return sEList == null ? SEAIClockInfo.SEList.getDefaultInstance() : sEList;
            }

            public SEAIClockInfo.SEList.Builder getClockInfoListBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SEAIClockInfo.SEList.Builder) internalGetClockInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public SEAIClockInfo.SEListOrBuilder getClockInfoListOrBuilder() {
                SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> singleFieldBuilder = this.clockInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAIClockInfo.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEAIClockInfo.SEList sEList = this.clockInfoList_;
                return sEList == null ? SEAIClockInfo.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public String getContactsNumber() {
                Object obj = this.contactsNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contactsNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public ByteString getContactsNumberBytes() {
                Object obj = this.contactsNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contactsNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEOpenAppFunction_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public int getDuration() {
                return this.duration_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public int getFunction() {
                return this.function_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public int getMusicCommand() {
                return this.musicCommand_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public SEAIScreenSetting getScreenSetting() {
                SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> singleFieldBuilder = this.screenSettingBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAIScreenSetting) singleFieldBuilder.getMessage();
                }
                SEAIScreenSetting sEAIScreenSetting = this.screenSetting_;
                return sEAIScreenSetting == null ? SEAIScreenSetting.getDefaultInstance() : sEAIScreenSetting;
            }

            public SEAIScreenSetting.Builder getScreenSettingBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (SEAIScreenSetting.Builder) internalGetScreenSettingFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public SEAIScreenSettingOrBuilder getScreenSettingOrBuilder() {
                SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> singleFieldBuilder = this.screenSettingBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEAIScreenSettingOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEAIScreenSetting sEAIScreenSetting = this.screenSetting_;
                return sEAIScreenSetting == null ? SEAIScreenSetting.getDefaultInstance() : sEAIScreenSetting;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public int getWorkoutType() {
                return this.workoutType_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public boolean hasActionTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public boolean hasClockInfoList() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public boolean hasContactsNumber() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public boolean hasDuration() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public boolean hasFunction() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public boolean hasMusicCommand() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public boolean hasScreenSetting() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
            public boolean hasWorkoutType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEOpenAppFunction_fieldAccessorTable.ensureFieldAccessorsInitialized(SEOpenAppFunction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFunction()) {
                    return false;
                }
                if (!hasActionTime() || getActionTime().isInitialized()) {
                    return !hasClockInfoList() || getClockInfoList().isInitialized();
                }
                return false;
            }

            public Builder mergeActionTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 2) == 0 || (sETime2 = this.actionTime_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.actionTime_ = sETime;
                } else {
                    getActionTimeBuilder().mergeFrom(sETime);
                }
                if (this.actionTime_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeClockInfoList(SEAIClockInfo.SEList sEList) {
                SEAIClockInfo.SEList sEList2;
                SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> singleFieldBuilder = this.clockInfoListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 8) == 0 || (sEList2 = this.clockInfoList_) == null || sEList2 == SEAIClockInfo.SEList.getDefaultInstance()) {
                    this.clockInfoList_ = sEList;
                } else {
                    getClockInfoListBuilder().mergeFrom(sEList);
                }
                if (this.clockInfoList_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeScreenSetting(SEAIScreenSetting sEAIScreenSetting) {
                SEAIScreenSetting sEAIScreenSetting2;
                SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> singleFieldBuilder = this.screenSettingBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEAIScreenSetting);
                } else if ((this.bitField0_ & 128) == 0 || (sEAIScreenSetting2 = this.screenSetting_) == null || sEAIScreenSetting2 == SEAIScreenSetting.getDefaultInstance()) {
                    this.screenSetting_ = sEAIScreenSetting;
                } else {
                    getScreenSettingBuilder().mergeFrom(sEAIScreenSetting);
                }
                if (this.screenSetting_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder setActionTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.actionTime_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setClockInfoList(SEAIClockInfo.SEList sEList) {
                SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> singleFieldBuilder = this.clockInfoListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.clockInfoList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setContactsNumber(String str) {
                str.getClass();
                this.contactsNumber_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setContactsNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.contactsNumber_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setDuration(int i7) {
                this.duration_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setFunction(int i7) {
                this.function_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMusicCommand(int i7) {
                this.musicCommand_ = i7;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setScreenSetting(SEAIScreenSetting sEAIScreenSetting) {
                SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> singleFieldBuilder = this.screenSettingBuilder_;
                if (singleFieldBuilder == null) {
                    sEAIScreenSetting.getClass();
                    this.screenSetting_ = sEAIScreenSetting;
                } else {
                    singleFieldBuilder.setMessage(sEAIScreenSetting);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setWorkoutType(int i7) {
                this.workoutType_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                this.contactsNumber_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEOpenAppFunction build() {
                SEOpenAppFunction sEOpenAppFunctionBuildPartial = buildPartial();
                if (sEOpenAppFunctionBuildPartial.isInitialized()) {
                    return sEOpenAppFunctionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEOpenAppFunctionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEOpenAppFunction buildPartial() {
                SEOpenAppFunction sEOpenAppFunction = new SEOpenAppFunction(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEOpenAppFunction);
                }
                onBuilt();
                return sEOpenAppFunction;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEOpenAppFunction getDefaultInstanceForType() {
                return SEOpenAppFunction.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.function_ = 0;
                this.actionTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.actionTimeBuilder_ = null;
                }
                this.workoutType_ = 0;
                this.clockInfoList_ = null;
                SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> singleFieldBuilder2 = this.clockInfoListBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.clockInfoListBuilder_ = null;
                }
                this.duration_ = 0;
                this.contactsNumber_ = "";
                this.musicCommand_ = 0;
                this.screenSetting_ = null;
                SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> singleFieldBuilder3 = this.screenSettingBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.dispose();
                    this.screenSettingBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.contactsNumber_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEOpenAppFunction) {
                    return mergeFrom((SEOpenAppFunction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setActionTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.actionTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setClockInfoList(SEAIClockInfo.SEList.Builder builder) {
                SingleFieldBuilder<SEAIClockInfo.SEList, SEAIClockInfo.SEList.Builder, SEAIClockInfo.SEListOrBuilder> singleFieldBuilder = this.clockInfoListBuilder_;
                if (singleFieldBuilder == null) {
                    this.clockInfoList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setScreenSetting(SEAIScreenSetting.Builder builder) {
                SingleFieldBuilder<SEAIScreenSetting, SEAIScreenSetting.Builder, SEAIScreenSettingOrBuilder> singleFieldBuilder = this.screenSettingBuilder_;
                if (singleFieldBuilder == null) {
                    this.screenSetting_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEOpenAppFunction sEOpenAppFunction) {
                if (sEOpenAppFunction == SEOpenAppFunction.getDefaultInstance()) {
                    return this;
                }
                if (sEOpenAppFunction.hasFunction()) {
                    setFunction(sEOpenAppFunction.getFunction());
                }
                if (sEOpenAppFunction.hasActionTime()) {
                    mergeActionTime(sEOpenAppFunction.getActionTime());
                }
                if (sEOpenAppFunction.hasWorkoutType()) {
                    setWorkoutType(sEOpenAppFunction.getWorkoutType());
                }
                if (sEOpenAppFunction.hasClockInfoList()) {
                    mergeClockInfoList(sEOpenAppFunction.getClockInfoList());
                }
                if (sEOpenAppFunction.hasDuration()) {
                    setDuration(sEOpenAppFunction.getDuration());
                }
                if (sEOpenAppFunction.hasContactsNumber()) {
                    this.contactsNumber_ = sEOpenAppFunction.contactsNumber_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (sEOpenAppFunction.hasMusicCommand()) {
                    setMusicCommand(sEOpenAppFunction.getMusicCommand());
                }
                if (sEOpenAppFunction.hasScreenSetting()) {
                    mergeScreenSetting(sEOpenAppFunction.getScreenSetting());
                }
                mergeUnknownFields(sEOpenAppFunction.getUnknownFields());
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
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetActionTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.workoutType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetClockInfoListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.duration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.contactsNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.musicCommand_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag != 66) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetScreenSettingFieldBuilder().getBuilder(), extensionRegistryLite);
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEOpenAppFunction");
            DEFAULT_INSTANCE = new SEOpenAppFunction();
            PARSER = new AbstractParser<SEOpenAppFunction>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunction.1
                @Override // com.google.protobuf.Parser
                public SEOpenAppFunction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEOpenAppFunction.newBuilder();
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

        public /* synthetic */ SEOpenAppFunction(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEOpenAppFunction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SEOpenAppFunction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEOpenAppFunction parseDelimitedFrom(InputStream inputStream) {
            return (SEOpenAppFunction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEOpenAppFunction parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEOpenAppFunction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEOpenAppFunction)) {
                return super.equals(obj);
            }
            SEOpenAppFunction sEOpenAppFunction = (SEOpenAppFunction) obj;
            if (hasFunction() != sEOpenAppFunction.hasFunction()) {
                return false;
            }
            if ((hasFunction() && getFunction() != sEOpenAppFunction.getFunction()) || hasActionTime() != sEOpenAppFunction.hasActionTime()) {
                return false;
            }
            if ((hasActionTime() && !getActionTime().equals(sEOpenAppFunction.getActionTime())) || hasWorkoutType() != sEOpenAppFunction.hasWorkoutType()) {
                return false;
            }
            if ((hasWorkoutType() && getWorkoutType() != sEOpenAppFunction.getWorkoutType()) || hasClockInfoList() != sEOpenAppFunction.hasClockInfoList()) {
                return false;
            }
            if ((hasClockInfoList() && !getClockInfoList().equals(sEOpenAppFunction.getClockInfoList())) || hasDuration() != sEOpenAppFunction.hasDuration()) {
                return false;
            }
            if ((hasDuration() && getDuration() != sEOpenAppFunction.getDuration()) || hasContactsNumber() != sEOpenAppFunction.hasContactsNumber()) {
                return false;
            }
            if ((hasContactsNumber() && !getContactsNumber().equals(sEOpenAppFunction.getContactsNumber())) || hasMusicCommand() != sEOpenAppFunction.hasMusicCommand()) {
                return false;
            }
            if ((!hasMusicCommand() || getMusicCommand() == sEOpenAppFunction.getMusicCommand()) && hasScreenSetting() == sEOpenAppFunction.hasScreenSetting()) {
                return (!hasScreenSetting() || getScreenSetting().equals(sEOpenAppFunction.getScreenSetting())) && getUnknownFields().equals(sEOpenAppFunction.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public CommonProtos.SETime getActionTime() {
            CommonProtos.SETime sETime = this.actionTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public CommonProtos.SETimeOrBuilder getActionTimeOrBuilder() {
            CommonProtos.SETime sETime = this.actionTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public SEAIClockInfo.SEList getClockInfoList() {
            SEAIClockInfo.SEList sEList = this.clockInfoList_;
            return sEList == null ? SEAIClockInfo.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public SEAIClockInfo.SEListOrBuilder getClockInfoListOrBuilder() {
            SEAIClockInfo.SEList sEList = this.clockInfoList_;
            return sEList == null ? SEAIClockInfo.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public String getContactsNumber() {
            Object obj = this.contactsNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.contactsNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public ByteString getContactsNumberBytes() {
            Object obj = this.contactsNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contactsNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SEOpenAppFunction_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public int getFunction() {
            return this.function_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public int getMusicCommand() {
            return this.musicCommand_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEOpenAppFunction> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public SEAIScreenSetting getScreenSetting() {
            SEAIScreenSetting sEAIScreenSetting = this.screenSetting_;
            return sEAIScreenSetting == null ? SEAIScreenSetting.getDefaultInstance() : sEAIScreenSetting;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public SEAIScreenSettingOrBuilder getScreenSettingOrBuilder() {
            SEAIScreenSetting sEAIScreenSetting = this.screenSetting_;
            return sEAIScreenSetting == null ? SEAIScreenSetting.getDefaultInstance() : sEAIScreenSetting;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.function_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getActionTime());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.workoutType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getClockInfoList());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.duration_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(6, this.contactsNumber_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.musicCommand_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(8, getScreenSetting());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public int getWorkoutType() {
            return this.workoutType_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public boolean hasActionTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public boolean hasClockInfoList() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public boolean hasContactsNumber() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public boolean hasDuration() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public boolean hasFunction() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public boolean hasMusicCommand() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public boolean hasScreenSetting() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEOpenAppFunctionOrBuilder
        public boolean hasWorkoutType() {
            return (this.bitField0_ & 4) != 0;
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
            if (hasActionTime()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getActionTime().hashCode();
            }
            if (hasWorkoutType()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getWorkoutType();
            }
            if (hasClockInfoList()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getClockInfoList().hashCode();
            }
            if (hasDuration()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getDuration();
            }
            if (hasContactsNumber()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getContactsNumber().hashCode();
            }
            if (hasMusicCommand()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getMusicCommand();
            }
            if (hasScreenSetting()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getScreenSetting().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AIFunctionProtos.internal_static_SA_SEOpenAppFunction_fieldAccessorTable.ensureFieldAccessorsInitialized(SEOpenAppFunction.class, Builder.class);
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
            if (hasActionTime() && !getActionTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasClockInfoList() || getClockInfoList().isInitialized()) {
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
                codedOutputStream.writeMessage(2, getActionTime());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.workoutType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getClockInfoList());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.duration_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.contactsNumber_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.musicCommand_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getScreenSetting());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEOpenAppFunction(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.function_ = 0;
            this.workoutType_ = 0;
            this.duration_ = 0;
            this.contactsNumber_ = "";
            this.musicCommand_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEOpenAppFunction sEOpenAppFunction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEOpenAppFunction);
        }

        public static SEOpenAppFunction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEOpenAppFunction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEOpenAppFunction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEOpenAppFunction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEOpenAppFunction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEOpenAppFunction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEOpenAppFunction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEOpenAppFunction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEOpenAppFunction parseFrom(InputStream inputStream) {
            return (SEOpenAppFunction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEOpenAppFunction() {
            this.function_ = 0;
            this.workoutType_ = 0;
            this.duration_ = 0;
            this.contactsNumber_ = "";
            this.musicCommand_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.contactsNumber_ = "";
        }

        public static SEOpenAppFunction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEOpenAppFunction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEOpenAppFunction parseFrom(CodedInputStream codedInputStream) {
            return (SEOpenAppFunction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEOpenAppFunction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEOpenAppFunction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEOpenAppFunctionOrBuilder extends MessageOrBuilder {
        CommonProtos.SETime getActionTime();

        CommonProtos.SETimeOrBuilder getActionTimeOrBuilder();

        SEAIClockInfo.SEList getClockInfoList();

        SEAIClockInfo.SEListOrBuilder getClockInfoListOrBuilder();

        String getContactsNumber();

        ByteString getContactsNumberBytes();

        int getDuration();

        int getFunction();

        int getMusicCommand();

        SEAIScreenSetting getScreenSetting();

        SEAIScreenSettingOrBuilder getScreenSettingOrBuilder();

        int getWorkoutType();

        boolean hasActionTime();

        boolean hasClockInfoList();

        boolean hasContactsNumber();

        boolean hasDuration();

        boolean hasFunction();

        boolean hasMusicCommand();

        boolean hasScreenSetting();

        boolean hasWorkoutType();
    }

    public static final class SESetActionTemplate extends GeneratedMessage implements SESetActionTemplateOrBuilder {
        public static final int ACTION_TIME_FIELD_NUMBER = 5;
        private static final SESetActionTemplate DEFAULT_INSTANCE;
        private static final Parser<SESetActionTemplate> PARSER;
        public static final int SCENARIO_FIELD_NUMBER = 1;
        public static final int THRESHOLD_VALUE_FIELD_NUMBER = 2;
        public static final int TIME_DATE_FIELD_NUMBER = 3;
        public static final int UNIT_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private CommonProtos.SETime actionTime_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int scenario_;
        private int thresholdValue_;
        private CommonProtos.SETimeDate timeDate_;
        private volatile Object unit_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SESetActionTemplate$1 */
        public class AnonymousClass1 extends AbstractParser<SESetActionTemplate> {
            @Override // com.google.protobuf.Parser
            public SESetActionTemplate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESetActionTemplate.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESetActionTemplateOrBuilder {
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> actionTimeBuilder_;
            private CommonProtos.SETime actionTime_;
            private int bitField0_;
            private int scenario_;
            private int thresholdValue_;
            private SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> timeDateBuilder_;
            private CommonProtos.SETimeDate timeDate_;
            private Object unit_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SESetActionTemplate sESetActionTemplate) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESetActionTemplate.scenario_ = this.scenario_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sESetActionTemplate.thresholdValue_ = this.thresholdValue_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                    sESetActionTemplate.timeDate_ = singleFieldBuilder == null ? this.timeDate_ : (CommonProtos.SETimeDate) singleFieldBuilder.build();
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sESetActionTemplate.unit_ = this.unit_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder2 = this.actionTimeBuilder_;
                    sESetActionTemplate.actionTime_ = singleFieldBuilder2 == null ? this.actionTime_ : (CommonProtos.SETime) singleFieldBuilder2.build();
                    i7 |= 16;
                }
                sESetActionTemplate.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SESetActionTemplate_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetActionTimeFieldBuilder() {
                if (this.actionTimeBuilder_ == null) {
                    this.actionTimeBuilder_ = new SingleFieldBuilder<>(getActionTime(), getParentForChildren(), isClean());
                    this.actionTime_ = null;
                }
                return this.actionTimeBuilder_;
            }

            private SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> internalGetTimeDateFieldBuilder() {
                if (this.timeDateBuilder_ == null) {
                    this.timeDateBuilder_ = new SingleFieldBuilder<>(getTimeDate(), getParentForChildren(), isClean());
                    this.timeDate_ = null;
                }
                return this.timeDateBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetTimeDateFieldBuilder();
                    internalGetActionTimeFieldBuilder();
                }
            }

            public Builder clearActionTime() {
                this.bitField0_ &= -17;
                this.actionTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.actionTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearScenario() {
                this.bitField0_ &= -2;
                this.scenario_ = 0;
                onChanged();
                return this;
            }

            public Builder clearThresholdValue() {
                this.bitField0_ &= -3;
                this.thresholdValue_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimeDate() {
                this.bitField0_ &= -5;
                this.timeDate_ = null;
                SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.timeDateBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = SESetActionTemplate.getDefaultInstance().getUnit();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public CommonProtos.SETime getActionTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.actionTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getActionTimeBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetActionTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public CommonProtos.SETimeOrBuilder getActionTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.actionTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SESetActionTemplate_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public int getScenario() {
                return this.scenario_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public int getThresholdValue() {
                return this.thresholdValue_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public CommonProtos.SETimeDate getTimeDate() {
                SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeDate) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETimeDate sETimeDate = this.timeDate_;
                return sETimeDate == null ? CommonProtos.SETimeDate.getDefaultInstance() : sETimeDate;
            }

            public CommonProtos.SETimeDate.Builder getTimeDateBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (CommonProtos.SETimeDate.Builder) internalGetTimeDateFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public CommonProtos.SETimeDateOrBuilder getTimeDateOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeDateOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETimeDate sETimeDate = this.timeDate_;
                return sETimeDate == null ? CommonProtos.SETimeDate.getDefaultInstance() : sETimeDate;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public String getUnit() {
                Object obj = this.unit_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.unit_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public ByteString getUnitBytes() {
                Object obj = this.unit_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.unit_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public boolean hasActionTime() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public boolean hasScenario() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public boolean hasThresholdValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public boolean hasTimeDate() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
            public boolean hasUnit() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SESetActionTemplate_fieldAccessorTable.ensureFieldAccessorsInitialized(SESetActionTemplate.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasScenario()) {
                    return false;
                }
                if (!hasTimeDate() || getTimeDate().isInitialized()) {
                    return !hasActionTime() || getActionTime().isInitialized();
                }
                return false;
            }

            public Builder mergeActionTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 16) == 0 || (sETime2 = this.actionTime_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.actionTime_ = sETime;
                } else {
                    getActionTimeBuilder().mergeFrom(sETime);
                }
                if (this.actionTime_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTimeDate(CommonProtos.SETimeDate sETimeDate) {
                CommonProtos.SETimeDate sETimeDate2;
                SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETimeDate);
                } else if ((this.bitField0_ & 4) == 0 || (sETimeDate2 = this.timeDate_) == null || sETimeDate2 == CommonProtos.SETimeDate.getDefaultInstance()) {
                    this.timeDate_ = sETimeDate;
                } else {
                    getTimeDateBuilder().mergeFrom(sETimeDate);
                }
                if (this.timeDate_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setActionTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.actionTime_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setScenario(int i7) {
                this.scenario_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setThresholdValue(int i7) {
                this.thresholdValue_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTimeDate(CommonProtos.SETimeDate sETimeDate) {
                SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                if (singleFieldBuilder == null) {
                    sETimeDate.getClass();
                    this.timeDate_ = sETimeDate;
                } else {
                    singleFieldBuilder.setMessage(sETimeDate);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUnit(String str) {
                str.getClass();
                this.unit_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUnitBytes(ByteString byteString) {
                byteString.getClass();
                this.unit_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                this.unit_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESetActionTemplate build() {
                SESetActionTemplate sESetActionTemplateBuildPartial = buildPartial();
                if (sESetActionTemplateBuildPartial.isInitialized()) {
                    return sESetActionTemplateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESetActionTemplateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESetActionTemplate buildPartial() {
                SESetActionTemplate sESetActionTemplate = new SESetActionTemplate(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESetActionTemplate);
                }
                onBuilt();
                return sESetActionTemplate;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESetActionTemplate getDefaultInstanceForType() {
                return SESetActionTemplate.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.scenario_ = 0;
                this.thresholdValue_ = 0;
                this.timeDate_ = null;
                SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.timeDateBuilder_ = null;
                }
                this.unit_ = "";
                this.actionTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder2 = this.actionTimeBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.actionTimeBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.unit_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESetActionTemplate) {
                    return mergeFrom((SESetActionTemplate) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setActionTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.actionTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTimeDate(CommonProtos.SETimeDate.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETimeDate, CommonProtos.SETimeDate.Builder, CommonProtos.SETimeDateOrBuilder> singleFieldBuilder = this.timeDateBuilder_;
                if (singleFieldBuilder == null) {
                    this.timeDate_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SESetActionTemplate sESetActionTemplate) {
                if (sESetActionTemplate == SESetActionTemplate.getDefaultInstance()) {
                    return this;
                }
                if (sESetActionTemplate.hasScenario()) {
                    setScenario(sESetActionTemplate.getScenario());
                }
                if (sESetActionTemplate.hasThresholdValue()) {
                    setThresholdValue(sESetActionTemplate.getThresholdValue());
                }
                if (sESetActionTemplate.hasTimeDate()) {
                    mergeTimeDate(sESetActionTemplate.getTimeDate());
                }
                if (sESetActionTemplate.hasUnit()) {
                    this.unit_ = sESetActionTemplate.unit_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sESetActionTemplate.hasActionTime()) {
                    mergeActionTime(sESetActionTemplate.getActionTime());
                }
                mergeUnknownFields(sESetActionTemplate.getUnknownFields());
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
                                    this.scenario_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.thresholdValue_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(internalGetTimeDateFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.unit_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetActionTimeFieldBuilder().getBuilder(), extensionRegistryLite);
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESetActionTemplate");
            DEFAULT_INSTANCE = new SESetActionTemplate();
            PARSER = new AbstractParser<SESetActionTemplate>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplate.1
                @Override // com.google.protobuf.Parser
                public SESetActionTemplate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESetActionTemplate.newBuilder();
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

        public /* synthetic */ SESetActionTemplate(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SESetActionTemplate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SESetActionTemplate_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESetActionTemplate parseDelimitedFrom(InputStream inputStream) {
            return (SESetActionTemplate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESetActionTemplate parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESetActionTemplate> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESetActionTemplate)) {
                return super.equals(obj);
            }
            SESetActionTemplate sESetActionTemplate = (SESetActionTemplate) obj;
            if (hasScenario() != sESetActionTemplate.hasScenario()) {
                return false;
            }
            if ((hasScenario() && getScenario() != sESetActionTemplate.getScenario()) || hasThresholdValue() != sESetActionTemplate.hasThresholdValue()) {
                return false;
            }
            if ((hasThresholdValue() && getThresholdValue() != sESetActionTemplate.getThresholdValue()) || hasTimeDate() != sESetActionTemplate.hasTimeDate()) {
                return false;
            }
            if ((hasTimeDate() && !getTimeDate().equals(sESetActionTemplate.getTimeDate())) || hasUnit() != sESetActionTemplate.hasUnit()) {
                return false;
            }
            if ((!hasUnit() || getUnit().equals(sESetActionTemplate.getUnit())) && hasActionTime() == sESetActionTemplate.hasActionTime()) {
                return (!hasActionTime() || getActionTime().equals(sESetActionTemplate.getActionTime())) && getUnknownFields().equals(sESetActionTemplate.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public CommonProtos.SETime getActionTime() {
            CommonProtos.SETime sETime = this.actionTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public CommonProtos.SETimeOrBuilder getActionTimeOrBuilder() {
            CommonProtos.SETime sETime = this.actionTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SESetActionTemplate_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESetActionTemplate> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public int getScenario() {
            return this.scenario_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.scenario_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.thresholdValue_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getTimeDate());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(4, this.unit_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(5, getActionTime());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public int getThresholdValue() {
            return this.thresholdValue_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public CommonProtos.SETimeDate getTimeDate() {
            CommonProtos.SETimeDate sETimeDate = this.timeDate_;
            return sETimeDate == null ? CommonProtos.SETimeDate.getDefaultInstance() : sETimeDate;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public CommonProtos.SETimeDateOrBuilder getTimeDateOrBuilder() {
            CommonProtos.SETimeDate sETimeDate = this.timeDate_;
            return sETimeDate == null ? CommonProtos.SETimeDate.getDefaultInstance() : sETimeDate;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public String getUnit() {
            Object obj = this.unit_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.unit_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public ByteString getUnitBytes() {
            Object obj = this.unit_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.unit_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public boolean hasActionTime() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public boolean hasScenario() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public boolean hasThresholdValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public boolean hasTimeDate() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SESetActionTemplateOrBuilder
        public boolean hasUnit() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasScenario()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getScenario();
            }
            if (hasThresholdValue()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getThresholdValue();
            }
            if (hasTimeDate()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTimeDate().hashCode();
            }
            if (hasUnit()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getUnit().hashCode();
            }
            if (hasActionTime()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getActionTime().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AIFunctionProtos.internal_static_SA_SESetActionTemplate_fieldAccessorTable.ensureFieldAccessorsInitialized(SESetActionTemplate.class, Builder.class);
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
            if (!hasScenario()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTimeDate() && !getTimeDate().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasActionTime() || getActionTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.scenario_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.thresholdValue_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getTimeDate());
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.unit_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getActionTime());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESetActionTemplate(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.scenario_ = 0;
            this.thresholdValue_ = 0;
            this.unit_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESetActionTemplate sESetActionTemplate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESetActionTemplate);
        }

        public static SESetActionTemplate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESetActionTemplate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESetActionTemplate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESetActionTemplate parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESetActionTemplate getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESetActionTemplate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESetActionTemplate parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESetActionTemplate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SESetActionTemplate() {
            this.scenario_ = 0;
            this.thresholdValue_ = 0;
            this.unit_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.unit_ = "";
        }

        public static SESetActionTemplate parseFrom(InputStream inputStream) {
            return (SESetActionTemplate) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESetActionTemplate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESetActionTemplate) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESetActionTemplate parseFrom(CodedInputStream codedInputStream) {
            return (SESetActionTemplate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESetActionTemplate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESetActionTemplate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESetActionTemplateOrBuilder extends MessageOrBuilder {
        CommonProtos.SETime getActionTime();

        CommonProtos.SETimeOrBuilder getActionTimeOrBuilder();

        int getScenario();

        int getThresholdValue();

        CommonProtos.SETimeDate getTimeDate();

        CommonProtos.SETimeDateOrBuilder getTimeDateOrBuilder();

        String getUnit();

        ByteString getUnitBytes();

        boolean hasActionTime();

        boolean hasScenario();

        boolean hasThresholdValue();

        boolean hasTimeDate();

        boolean hasUnit();
    }

    public static final class SEToggleTemplateUI extends GeneratedMessage implements SEToggleTemplateUIOrBuilder {
        public static final int ACTION_TIME_FIELD_NUMBER = 3;
        private static final SEToggleTemplateUI DEFAULT_INSTANCE;
        private static final Parser<SEToggleTemplateUI> PARSER;
        public static final int SCENARIO_FIELD_NUMBER = 1;
        public static final int TOGGLE_STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private CommonProtos.SETime actionTime_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int scenario_;
        private boolean toggleStatus_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEToggleTemplateUI$1 */
        public class AnonymousClass1 extends AbstractParser<SEToggleTemplateUI> {
            @Override // com.google.protobuf.Parser
            public SEToggleTemplateUI parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEToggleTemplateUI.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEToggleTemplateUIOrBuilder {
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> actionTimeBuilder_;
            private CommonProtos.SETime actionTime_;
            private int bitField0_;
            private int scenario_;
            private boolean toggleStatus_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEToggleTemplateUI sEToggleTemplateUI) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEToggleTemplateUI.scenario_ = this.scenario_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEToggleTemplateUI.toggleStatus_ = this.toggleStatus_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                    sEToggleTemplateUI.actionTime_ = singleFieldBuilder == null ? this.actionTime_ : (CommonProtos.SETime) singleFieldBuilder.build();
                    i7 |= 4;
                }
                sEToggleTemplateUI.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEToggleTemplateUI_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetActionTimeFieldBuilder() {
                if (this.actionTimeBuilder_ == null) {
                    this.actionTimeBuilder_ = new SingleFieldBuilder<>(getActionTime(), getParentForChildren(), isClean());
                    this.actionTime_ = null;
                }
                return this.actionTimeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetActionTimeFieldBuilder();
                }
            }

            public Builder clearActionTime() {
                this.bitField0_ &= -5;
                this.actionTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.actionTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearScenario() {
                this.bitField0_ &= -2;
                this.scenario_ = 0;
                onChanged();
                return this;
            }

            public Builder clearToggleStatus() {
                this.bitField0_ &= -3;
                this.toggleStatus_ = false;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
            public CommonProtos.SETime getActionTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.actionTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getActionTimeBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetActionTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
            public CommonProtos.SETimeOrBuilder getActionTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.actionTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEToggleTemplateUI_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
            public int getScenario() {
                return this.scenario_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
            public boolean getToggleStatus() {
                return this.toggleStatus_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
            public boolean hasActionTime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
            public boolean hasScenario() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
            public boolean hasToggleStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEToggleTemplateUI_fieldAccessorTable.ensureFieldAccessorsInitialized(SEToggleTemplateUI.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasScenario() && hasToggleStatus()) {
                    return !hasActionTime() || getActionTime().isInitialized();
                }
                return false;
            }

            public Builder mergeActionTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 4) == 0 || (sETime2 = this.actionTime_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.actionTime_ = sETime;
                } else {
                    getActionTimeBuilder().mergeFrom(sETime);
                }
                if (this.actionTime_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setActionTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.actionTime_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setScenario(int i7) {
                this.scenario_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setToggleStatus(boolean z6) {
                this.toggleStatus_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEToggleTemplateUI build() {
                SEToggleTemplateUI sEToggleTemplateUIBuildPartial = buildPartial();
                if (sEToggleTemplateUIBuildPartial.isInitialized()) {
                    return sEToggleTemplateUIBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEToggleTemplateUIBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEToggleTemplateUI buildPartial() {
                SEToggleTemplateUI sEToggleTemplateUI = new SEToggleTemplateUI(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEToggleTemplateUI);
                }
                onBuilt();
                return sEToggleTemplateUI;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEToggleTemplateUI getDefaultInstanceForType() {
                return SEToggleTemplateUI.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.scenario_ = 0;
                this.toggleStatus_ = false;
                this.actionTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.actionTimeBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEToggleTemplateUI) {
                    return mergeFrom((SEToggleTemplateUI) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setActionTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.actionTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEToggleTemplateUI sEToggleTemplateUI) {
                if (sEToggleTemplateUI == SEToggleTemplateUI.getDefaultInstance()) {
                    return this;
                }
                if (sEToggleTemplateUI.hasScenario()) {
                    setScenario(sEToggleTemplateUI.getScenario());
                }
                if (sEToggleTemplateUI.hasToggleStatus()) {
                    setToggleStatus(sEToggleTemplateUI.getToggleStatus());
                }
                if (sEToggleTemplateUI.hasActionTime()) {
                    mergeActionTime(sEToggleTemplateUI.getActionTime());
                }
                mergeUnknownFields(sEToggleTemplateUI.getUnknownFields());
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
                                    this.scenario_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.toggleStatus_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetActionTimeFieldBuilder().getBuilder(), extensionRegistryLite);
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEToggleTemplateUI");
            DEFAULT_INSTANCE = new SEToggleTemplateUI();
            PARSER = new AbstractParser<SEToggleTemplateUI>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUI.1
                @Override // com.google.protobuf.Parser
                public SEToggleTemplateUI parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEToggleTemplateUI.newBuilder();
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

        public /* synthetic */ SEToggleTemplateUI(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEToggleTemplateUI getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SEToggleTemplateUI_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEToggleTemplateUI parseDelimitedFrom(InputStream inputStream) {
            return (SEToggleTemplateUI) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEToggleTemplateUI parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEToggleTemplateUI> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEToggleTemplateUI)) {
                return super.equals(obj);
            }
            SEToggleTemplateUI sEToggleTemplateUI = (SEToggleTemplateUI) obj;
            if (hasScenario() != sEToggleTemplateUI.hasScenario()) {
                return false;
            }
            if ((hasScenario() && getScenario() != sEToggleTemplateUI.getScenario()) || hasToggleStatus() != sEToggleTemplateUI.hasToggleStatus()) {
                return false;
            }
            if ((!hasToggleStatus() || getToggleStatus() == sEToggleTemplateUI.getToggleStatus()) && hasActionTime() == sEToggleTemplateUI.hasActionTime()) {
                return (!hasActionTime() || getActionTime().equals(sEToggleTemplateUI.getActionTime())) && getUnknownFields().equals(sEToggleTemplateUI.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
        public CommonProtos.SETime getActionTime() {
            CommonProtos.SETime sETime = this.actionTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
        public CommonProtos.SETimeOrBuilder getActionTimeOrBuilder() {
            CommonProtos.SETime sETime = this.actionTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SEToggleTemplateUI_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEToggleTemplateUI> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
        public int getScenario() {
            return this.scenario_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.scenario_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.toggleStatus_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getActionTime());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
        public boolean getToggleStatus() {
            return this.toggleStatus_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
        public boolean hasActionTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
        public boolean hasScenario() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEToggleTemplateUIOrBuilder
        public boolean hasToggleStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasScenario()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getScenario();
            }
            if (hasToggleStatus()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getToggleStatus());
            }
            if (hasActionTime()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getActionTime().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AIFunctionProtos.internal_static_SA_SEToggleTemplateUI_fieldAccessorTable.ensureFieldAccessorsInitialized(SEToggleTemplateUI.class, Builder.class);
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
            if (!hasScenario()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasToggleStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasActionTime() || getActionTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.scenario_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.toggleStatus_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getActionTime());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEToggleTemplateUI(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.scenario_ = 0;
            this.toggleStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEToggleTemplateUI sEToggleTemplateUI) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEToggleTemplateUI);
        }

        public static SEToggleTemplateUI parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEToggleTemplateUI parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEToggleTemplateUI) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEToggleTemplateUI parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEToggleTemplateUI getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEToggleTemplateUI parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEToggleTemplateUI parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEToggleTemplateUI() {
            this.scenario_ = 0;
            this.toggleStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEToggleTemplateUI parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEToggleTemplateUI parseFrom(InputStream inputStream) {
            return (SEToggleTemplateUI) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEToggleTemplateUI parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEToggleTemplateUI) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEToggleTemplateUI parseFrom(CodedInputStream codedInputStream) {
            return (SEToggleTemplateUI) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEToggleTemplateUI parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEToggleTemplateUI) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEToggleTemplateUIOrBuilder extends MessageOrBuilder {
        CommonProtos.SETime getActionTime();

        CommonProtos.SETimeOrBuilder getActionTimeOrBuilder();

        int getScenario();

        boolean getToggleStatus();

        boolean hasActionTime();

        boolean hasScenario();

        boolean hasToggleStatus();
    }

    public static final class SEViewTemplateUI extends GeneratedMessage implements SEViewTemplateUIOrBuilder {
        public static final int ACTION_TIME_FIELD_NUMBER = 5;
        private static final SEViewTemplateUI DEFAULT_INSTANCE;
        public static final int FOOTER_FIELD_NUMBER = 4;
        private static final Parser<SEViewTemplateUI> PARSER;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int UNIT_FIELD_NUMBER = 3;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private CommonProtos.SETime actionTime_;
        private int bitField0_;
        private volatile Object footer_;
        private byte memoizedIsInitialized;
        private volatile Object title_;
        private volatile Object unit_;
        private volatile Object value_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEViewTemplateUI$1 */
        public class AnonymousClass1 extends AbstractParser<SEViewTemplateUI> {
            @Override // com.google.protobuf.Parser
            public SEViewTemplateUI parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEViewTemplateUI.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEViewTemplateUIOrBuilder {
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> actionTimeBuilder_;
            private CommonProtos.SETime actionTime_;
            private int bitField0_;
            private Object footer_;
            private Object title_;
            private Object unit_;
            private Object value_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEViewTemplateUI sEViewTemplateUI) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEViewTemplateUI.title_ = this.title_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEViewTemplateUI.value_ = this.value_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEViewTemplateUI.unit_ = this.unit_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEViewTemplateUI.footer_ = this.footer_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                    sEViewTemplateUI.actionTime_ = singleFieldBuilder == null ? this.actionTime_ : (CommonProtos.SETime) singleFieldBuilder.build();
                    i7 |= 16;
                }
                sEViewTemplateUI.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEViewTemplateUI_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetActionTimeFieldBuilder() {
                if (this.actionTimeBuilder_ == null) {
                    this.actionTimeBuilder_ = new SingleFieldBuilder<>(getActionTime(), getParentForChildren(), isClean());
                    this.actionTime_ = null;
                }
                return this.actionTimeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetActionTimeFieldBuilder();
                }
            }

            public Builder clearActionTime() {
                this.bitField0_ &= -17;
                this.actionTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.actionTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFooter() {
                this.footer_ = SEViewTemplateUI.getDefaultInstance().getFooter();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = SEViewTemplateUI.getDefaultInstance().getTitle();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = SEViewTemplateUI.getDefaultInstance().getUnit();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.value_ = SEViewTemplateUI.getDefaultInstance().getValue();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public CommonProtos.SETime getActionTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.actionTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getActionTimeBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetActionTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public CommonProtos.SETimeOrBuilder getActionTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.actionTime_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEViewTemplateUI_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public String getFooter() {
                Object obj = this.footer_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.footer_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public ByteString getFooterBytes() {
                Object obj = this.footer_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.footer_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public String getUnit() {
                Object obj = this.unit_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.unit_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public ByteString getUnitBytes() {
                Object obj = this.unit_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.unit_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.value_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public boolean hasActionTime() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public boolean hasFooter() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public boolean hasUnit() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEViewTemplateUI_fieldAccessorTable.ensureFieldAccessorsInitialized(SEViewTemplateUI.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasTitle() && hasValue() && hasUnit() && hasFooter()) {
                    return !hasActionTime() || getActionTime().isInitialized();
                }
                return false;
            }

            public Builder mergeActionTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 16) == 0 || (sETime2 = this.actionTime_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.actionTime_ = sETime;
                } else {
                    getActionTimeBuilder().mergeFrom(sETime);
                }
                if (this.actionTime_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder setActionTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.actionTime_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setFooter(String str) {
                str.getClass();
                this.footer_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setFooterBytes(ByteString byteString) {
                byteString.getClass();
                this.footer_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.title_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUnit(String str) {
                str.getClass();
                this.unit_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUnitBytes(ByteString byteString) {
                byteString.getClass();
                this.unit_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setValue(String str) {
                str.getClass();
                this.value_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                this.title_ = "";
                this.value_ = "";
                this.unit_ = "";
                this.footer_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEViewTemplateUI build() {
                SEViewTemplateUI sEViewTemplateUIBuildPartial = buildPartial();
                if (sEViewTemplateUIBuildPartial.isInitialized()) {
                    return sEViewTemplateUIBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEViewTemplateUIBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEViewTemplateUI buildPartial() {
                SEViewTemplateUI sEViewTemplateUI = new SEViewTemplateUI(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEViewTemplateUI);
                }
                onBuilt();
                return sEViewTemplateUI;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEViewTemplateUI getDefaultInstanceForType() {
                return SEViewTemplateUI.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.title_ = "";
                this.value_ = "";
                this.unit_ = "";
                this.footer_ = "";
                this.actionTime_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.actionTimeBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEViewTemplateUI) {
                    return mergeFrom((SEViewTemplateUI) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setActionTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.actionTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.actionTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = "";
                this.value_ = "";
                this.unit_ = "";
                this.footer_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(SEViewTemplateUI sEViewTemplateUI) {
                if (sEViewTemplateUI == SEViewTemplateUI.getDefaultInstance()) {
                    return this;
                }
                if (sEViewTemplateUI.hasTitle()) {
                    this.title_ = sEViewTemplateUI.title_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEViewTemplateUI.hasValue()) {
                    this.value_ = sEViewTemplateUI.value_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEViewTemplateUI.hasUnit()) {
                    this.unit_ = sEViewTemplateUI.unit_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEViewTemplateUI.hasFooter()) {
                    this.footer_ = sEViewTemplateUI.footer_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEViewTemplateUI.hasActionTime()) {
                    mergeActionTime(sEViewTemplateUI.getActionTime());
                }
                mergeUnknownFields(sEViewTemplateUI.getUnknownFields());
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
                                    this.title_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.value_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.unit_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.footer_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetActionTimeFieldBuilder().getBuilder(), extensionRegistryLite);
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEViewTemplateUI");
            DEFAULT_INSTANCE = new SEViewTemplateUI();
            PARSER = new AbstractParser<SEViewTemplateUI>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUI.1
                @Override // com.google.protobuf.Parser
                public SEViewTemplateUI parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEViewTemplateUI.newBuilder();
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

        public /* synthetic */ SEViewTemplateUI(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEViewTemplateUI getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SEViewTemplateUI_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEViewTemplateUI parseDelimitedFrom(InputStream inputStream) {
            return (SEViewTemplateUI) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEViewTemplateUI parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEViewTemplateUI> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEViewTemplateUI)) {
                return super.equals(obj);
            }
            SEViewTemplateUI sEViewTemplateUI = (SEViewTemplateUI) obj;
            if (hasTitle() != sEViewTemplateUI.hasTitle()) {
                return false;
            }
            if ((hasTitle() && !getTitle().equals(sEViewTemplateUI.getTitle())) || hasValue() != sEViewTemplateUI.hasValue()) {
                return false;
            }
            if ((hasValue() && !getValue().equals(sEViewTemplateUI.getValue())) || hasUnit() != sEViewTemplateUI.hasUnit()) {
                return false;
            }
            if ((hasUnit() && !getUnit().equals(sEViewTemplateUI.getUnit())) || hasFooter() != sEViewTemplateUI.hasFooter()) {
                return false;
            }
            if ((!hasFooter() || getFooter().equals(sEViewTemplateUI.getFooter())) && hasActionTime() == sEViewTemplateUI.hasActionTime()) {
                return (!hasActionTime() || getActionTime().equals(sEViewTemplateUI.getActionTime())) && getUnknownFields().equals(sEViewTemplateUI.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public CommonProtos.SETime getActionTime() {
            CommonProtos.SETime sETime = this.actionTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public CommonProtos.SETimeOrBuilder getActionTimeOrBuilder() {
            CommonProtos.SETime sETime = this.actionTime_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SEViewTemplateUI_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public String getFooter() {
            Object obj = this.footer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.footer_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public ByteString getFooterBytes() {
            Object obj = this.footer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.footer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEViewTemplateUI> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.title_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.value_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.unit_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.footer_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(5, getActionTime());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public String getUnit() {
            Object obj = this.unit_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.unit_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public ByteString getUnitBytes() {
            Object obj = this.unit_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.unit_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.value_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public boolean hasActionTime() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public boolean hasFooter() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
        public boolean hasUnit() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEViewTemplateUIOrBuilder
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
            if (hasTitle()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTitle().hashCode();
            }
            if (hasValue()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getValue().hashCode();
            }
            if (hasUnit()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getUnit().hashCode();
            }
            if (hasFooter()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getFooter().hashCode();
            }
            if (hasActionTime()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getActionTime().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AIFunctionProtos.internal_static_SA_SEViewTemplateUI_fieldAccessorTable.ensureFieldAccessorsInitialized(SEViewTemplateUI.class, Builder.class);
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
            if (!hasTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasValue()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasUnit()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFooter()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasActionTime() || getActionTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.title_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.value_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.unit_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.footer_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getActionTime());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEViewTemplateUI(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.title_ = "";
            this.value_ = "";
            this.unit_ = "";
            this.footer_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEViewTemplateUI sEViewTemplateUI) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEViewTemplateUI);
        }

        public static SEViewTemplateUI parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEViewTemplateUI parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEViewTemplateUI) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEViewTemplateUI parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEViewTemplateUI getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEViewTemplateUI parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEViewTemplateUI parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEViewTemplateUI parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEViewTemplateUI parseFrom(InputStream inputStream) {
            return (SEViewTemplateUI) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEViewTemplateUI() {
            this.title_ = "";
            this.value_ = "";
            this.unit_ = "";
            this.footer_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.title_ = "";
            this.value_ = "";
            this.unit_ = "";
            this.footer_ = "";
        }

        public static SEViewTemplateUI parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEViewTemplateUI) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEViewTemplateUI parseFrom(CodedInputStream codedInputStream) {
            return (SEViewTemplateUI) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEViewTemplateUI parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEViewTemplateUI) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEViewTemplateUIOrBuilder extends MessageOrBuilder {
        CommonProtos.SETime getActionTime();

        CommonProtos.SETimeOrBuilder getActionTimeOrBuilder();

        String getFooter();

        ByteString getFooterBytes();

        String getTitle();

        ByteString getTitleBytes();

        String getUnit();

        ByteString getUnitBytes();

        String getValue();

        ByteString getValueBytes();

        boolean hasActionTime();

        boolean hasFooter();

        boolean hasTitle();

        boolean hasUnit();

        boolean hasValue();
    }

    public static final class SEVoiceCmd extends GeneratedMessage implements SEVoiceCmdOrBuilder {
        private static final SEVoiceCmd DEFAULT_INSTANCE;
        private static final Parser<SEVoiceCmd> PARSER;
        public static final int VOICE_NAME_FIELD_NUMBER = 2;
        public static final int VOICE_STATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object voiceName_;
        private int voiceState_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.AIFunctionProtos$SEVoiceCmd$1 */
        public class AnonymousClass1 extends AbstractParser<SEVoiceCmd> {
            @Override // com.google.protobuf.Parser
            public SEVoiceCmd parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEVoiceCmd.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEVoiceCmdOrBuilder {
            private int bitField0_;
            private Object voiceName_;
            private int voiceState_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEVoiceCmd sEVoiceCmd) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEVoiceCmd.voiceState_ = this.voiceState_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEVoiceCmd.voiceName_ = this.voiceName_;
                    i7 |= 2;
                }
                sEVoiceCmd.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AIFunctionProtos.internal_static_SA_SEVoiceCmd_descriptor;
            }

            public Builder clearVoiceName() {
                this.voiceName_ = SEVoiceCmd.getDefaultInstance().getVoiceName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearVoiceState() {
                this.bitField0_ &= -2;
                this.voiceState_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AIFunctionProtos.internal_static_SA_SEVoiceCmd_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
            public String getVoiceName() {
                Object obj = this.voiceName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.voiceName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
            public ByteString getVoiceNameBytes() {
                Object obj = this.voiceName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.voiceName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
            public int getVoiceState() {
                return this.voiceState_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
            public boolean hasVoiceName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
            public boolean hasVoiceState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return AIFunctionProtos.internal_static_SA_SEVoiceCmd_fieldAccessorTable.ensureFieldAccessorsInitialized(SEVoiceCmd.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasVoiceState();
            }

            public Builder setVoiceName(String str) {
                str.getClass();
                this.voiceName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVoiceNameBytes(ByteString byteString) {
                byteString.getClass();
                this.voiceName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVoiceState(int i7) {
                this.voiceState_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                this.voiceName_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEVoiceCmd build() {
                SEVoiceCmd sEVoiceCmdBuildPartial = buildPartial();
                if (sEVoiceCmdBuildPartial.isInitialized()) {
                    return sEVoiceCmdBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEVoiceCmdBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEVoiceCmd buildPartial() {
                SEVoiceCmd sEVoiceCmd = new SEVoiceCmd(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEVoiceCmd);
                }
                onBuilt();
                return sEVoiceCmd;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEVoiceCmd getDefaultInstanceForType() {
                return SEVoiceCmd.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.voiceName_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.voiceState_ = 0;
                this.voiceName_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEVoiceCmd) {
                    return mergeFrom((SEVoiceCmd) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEVoiceCmd sEVoiceCmd) {
                if (sEVoiceCmd == SEVoiceCmd.getDefaultInstance()) {
                    return this;
                }
                if (sEVoiceCmd.hasVoiceState()) {
                    setVoiceState(sEVoiceCmd.getVoiceState());
                }
                if (sEVoiceCmd.hasVoiceName()) {
                    this.voiceName_ = sEVoiceCmd.voiceName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(sEVoiceCmd.getUnknownFields());
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
                                    this.voiceState_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.voiceName_ = codedInputStream.readBytes();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEVoiceCmd");
            DEFAULT_INSTANCE = new SEVoiceCmd();
            PARSER = new AbstractParser<SEVoiceCmd>() { // from class: com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmd.1
                @Override // com.google.protobuf.Parser
                public SEVoiceCmd parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEVoiceCmd.newBuilder();
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

        public /* synthetic */ SEVoiceCmd(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEVoiceCmd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AIFunctionProtos.internal_static_SA_SEVoiceCmd_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEVoiceCmd parseDelimitedFrom(InputStream inputStream) {
            return (SEVoiceCmd) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEVoiceCmd parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEVoiceCmd> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEVoiceCmd)) {
                return super.equals(obj);
            }
            SEVoiceCmd sEVoiceCmd = (SEVoiceCmd) obj;
            if (hasVoiceState() != sEVoiceCmd.hasVoiceState()) {
                return false;
            }
            if ((!hasVoiceState() || getVoiceState() == sEVoiceCmd.getVoiceState()) && hasVoiceName() == sEVoiceCmd.hasVoiceName()) {
                return (!hasVoiceName() || getVoiceName().equals(sEVoiceCmd.getVoiceName())) && getUnknownFields().equals(sEVoiceCmd.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AIFunctionProtos.internal_static_SA_SEVoiceCmd_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEVoiceCmd> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.voiceState_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(2, this.voiceName_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
        public String getVoiceName() {
            Object obj = this.voiceName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.voiceName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
        public ByteString getVoiceNameBytes() {
            Object obj = this.voiceName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.voiceName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
        public int getVoiceState() {
            return this.voiceState_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
        public boolean hasVoiceName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.AIFunctionProtos.SEVoiceCmdOrBuilder
        public boolean hasVoiceState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasVoiceState()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getVoiceState();
            }
            if (hasVoiceName()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getVoiceName().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return AIFunctionProtos.internal_static_SA_SEVoiceCmd_fieldAccessorTable.ensureFieldAccessorsInitialized(SEVoiceCmd.class, Builder.class);
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
            if (hasVoiceState()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.voiceState_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.voiceName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEVoiceCmd(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.voiceState_ = 0;
            this.voiceName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEVoiceCmd sEVoiceCmd) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEVoiceCmd);
        }

        public static SEVoiceCmd parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEVoiceCmd parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEVoiceCmd) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEVoiceCmd parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEVoiceCmd getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEVoiceCmd parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEVoiceCmd parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEVoiceCmd() {
            this.voiceState_ = 0;
            this.voiceName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.voiceName_ = "";
        }

        public static SEVoiceCmd parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEVoiceCmd parseFrom(InputStream inputStream) {
            return (SEVoiceCmd) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEVoiceCmd parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEVoiceCmd) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEVoiceCmd parseFrom(CodedInputStream codedInputStream) {
            return (SEVoiceCmd) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEVoiceCmd parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEVoiceCmd) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEVoiceCmdOrBuilder extends MessageOrBuilder {
        String getVoiceName();

        ByteString getVoiceNameBytes();

        int getVoiceState();

        boolean hasVoiceName();

        boolean hasVoiceState();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "AIFunctionProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013sa_AIFunction.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\u001a\u000fsa_Common.proto\u001a\u0014sa_SettingMenu.proto\"û\u0002\n\fSEAIFunction\u0012#\n\tvoice_cmd\u0018\u0001 \u0001(\u000b2\u000e.SA.SEVoiceCmdH\u0000\u0012\u0019\n\bapp_text\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u00120\n\u0010view_template_UI\u0018\u0003 \u0001(\u000b2\u0014.SA.SEViewTemplateUIH\u0000\u00126\n\u0013history_template_UI\u0018\u0004 \u0001(\u000b2\u0017.SA.SEHistoryTemplateUIH\u0000\u00126\n\u0013set_action_template\u0018\u0005 \u0001(\u000b2\u0017.SA.SESetActionTemplateH\u0000\u00124\n\u0012toggle_template_UI\u0018\u0006 \u0001(\u000b2\u0016.SA.SEToggleTemplateUIH\u0000\u00122\n\u0011open_app_function\u0018\u0007 \u0001(\u000b2\u0015.SA.SEOpenAppFunctionH\u0000\u0012\u0014\n\nerror_code\u0018\b \u0001(\rH\u0000B\t\n\u0007payload\"\u0080\u0001\n\u0011SEAIErrorCodeInfo\u0012\u0015\n\rai_error_code\u0018\u0001 \u0002(\r\u00125\n\u000fai_error_string\u0018\u0002 \u0001(\u000b2\u001c.SA.SEAIErrorCodeInfo.SEList\u001a\u001d\n\u0006SEList\u0012\u0013\n\u0004list\u0018\u0001 \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\"<\n\nSEVoiceCmd\u0012\u0013\n\u000bvoice_state\u0018\u0001 \u0002(\r\u0012\u0019\n\nvoice_name\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"\u008b\u0001\n\u0010SEViewTemplateUI\u0012\u0014\n\u0005title\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005value\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004unit\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0015\n\u0006footer\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u000baction_time\u0018\u0005 \u0001(\u000b2\n.SA.SETime\"÷\u0003\n\u0013SEHistoryTemplateUI\u0012\u0014\n\u0005title\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0015\n\u0006period\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bvalue_title\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\r\n\u0005y_max\u0018\u0004 \u0002(\r\u00122\n\u0007summary\u0018\u0005 \u0001(\u000b2!.SA.SEHistoryTemplateUI.SESummary\u0012>\n\u000fchart_data_list\u0018\u0006 \u0001(\u000b2%.SA.SEHistoryTemplateUI.ChartDataList\u001aY\n\tSESummary\u0012\u0011\n\tmax_value\u0018\u0001 \u0002(\r\u0012\u0011\n\tmin_value\u0018\u0002 \u0002(\r\u0012\u0011\n\tavg_value\u0018\u0003 \u0002(\r\u0012\u0013\n\u0004unit\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001aj\n\tChartData\u0012!\n\ttime_date\u0018\u0001 \u0002(\u000b2\u000e.SA.SETimeDate\u0012\f\n\u0004week\u0018\u0002 \u0002(\r\u0012\u0013\n\u000bchart_value\u0018\u0003 \u0002(\r\u0012\u0017\n\bcategory\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001aM\n\rChartDataList\u0012<\n\nchart_list\u0018\u0001 \u0003(\u000b2!.SA.SEHistoryTemplateUI.ChartDataB\u0005\u0092?\u0002\u0018\u0004\"\u0099\u0001\n\u0013SESetActionTemplate\u0012\u0010\n\bscenario\u0018\u0001 \u0002(\r\u0012\u0017\n\u000fthreshold_value\u0018\u0002 \u0001(\r\u0012!\n\ttime_date\u0018\u0003 \u0001(\u000b2\u000e.SA.SETimeDate\u0012\u0013\n\u0004unit\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u000baction_time\u0018\u0005 \u0001(\u000b2\n.SA.SETime\"^\n\u0012SEToggleTemplateUI\u0012\u0010\n\bscenario\u0018\u0001 \u0002(\r\u0012\u0015\n\rtoggle_status\u0018\u0002 \u0002(\b\u0012\u001f\n\u000baction_time\u0018\u0003 \u0001(\u000b2\n.SA.SETime\"\u0087\u0002\n\u0011SEOpenAppFunction\u0012\u0010\n\bfunction\u0018\u0001 \u0002(\r\u0012\u001f\n\u000baction_time\u0018\u0002 \u0001(\u000b2\n.SA.SETime\u0012\u0014\n\fworkout_type\u0018\u0003 \u0001(\r\u00121\n\u000fclock_info_list\u0018\u0004 \u0001(\u000b2\u0018.SA.SEAIClockInfo.SEList\u0012\u0010\n\bduration\u0018\u0005 \u0001(\r\u0012\u001e\n\u000fcontacts_number\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0015\n\rmusic_command\u0018\u0007 \u0001(\r\u0012-\n\u000escreen_setting\u0018\b \u0001(\u000b2\u0015.SA.SEAIScreenSetting\" \u0001\n\u0011SEAIScreenSetting\u0012\u001f\n\u0010brightness_level\u0018\u0001 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001a\n\u0012normally_on_switch\u0018\u0002 \u0001(\b\u0012!\n\u0012on_screen_duration\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u0012+\n#double_click_the_highlighted_screen\u0018\u0004 \u0001(\b\"«\u0003\n\rSEAIClockInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012(\n\u0004data\u0018\u0002 \u0001(\u000b2\u001a.SA.SEAIClockInfo.SEAIData\u001a§\u0001\n\bSEAIData\u0012\u001f\n\u0004time\u0018\u0001 \u0002(\u000b2\u0011.SA.SESettingTime\u0012\u0018\n\tweek_days\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u000e\n\u0006enable\u0018\u0003 \u0002(\b\u0012\u0019\n\nClock_name\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u00125\n\u000bclock_label\u0018\u0005 \u0001(\u000e2 .SA.SEAIClockInfo.SEAIClockLabel\u001aL\n\u0006SEList\u0012&\n\u0004list\u0018\u0001 \u0003(\u000b2\u0011.SA.SEAIClockInfoB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u0012support_max_clocks\u0018\u0002 \u0001(\r\"l\n\u000eSEAIClockLabel\u0012\u0012\n\u000eAI_ALARM_CLOCK\u0010\u0000\u0012\r\n\tAI_GET_UP\u0010\u0001\u0012\u000e\n\nAI_MEETING\u0010\u0002\u0012\u0012\n\u000eAI_APPOINTMENT\u0010\u0003\u0012\u0013\n\u000fAI_DINNER_PARTY\u0010\u0004*µ\u0002\n\u000fSEAIFunction_ID\u0012\u001c\n\u0018AI_DEVICE_SEND_VOICE_CMD\u0010\u0000\u0012\u0019\n\u0015AI_APP_SEND_VOICE_CMD\u0010\u0001\u0012\u001f\n\u001bAI_APP_SEND_TRANSLATED_TEXT\u0010\u0002\u0012\u001b\n\u0017AI_APP_SEND_ANSWER_TEXT\u0010\u0003\u0012\u001b\n\u0017AI_APP_VIEW_TEMPLATE_UI\u0010\u0004\u0012\u001e\n\u001aAI_APP_HISTORY_TEMPLATE_UI\u0010\u0005\u0012\u001e\n\u001aAI_APP_SET_ACTION_TEMPLATE\u0010\u0006\u0012\u001d\n\u0019AI_APP_TOGGLE_TEMPLATE_UI\u0010\u0007\u0012\u001c\n\u0018AI_APP_OPEN_APP_FUNCTION\u0010\b\u0012\u0011\n\rAI_ERROR_CODE\u0010\tB6\n\u001bcom.zh.ble.sa_wear.protobufB\u0010AIFunctionProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor(), CommonProtos.getDescriptor(), SettingMenuProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SEAIFunction_descriptor = messageType;
        internal_static_SA_SEAIFunction_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"VoiceCmd", "AppText", "ViewTemplateUI", "HistoryTemplateUI", "SetActionTemplate", "ToggleTemplateUI", "OpenAppFunction", "ErrorCode", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_SEAIErrorCodeInfo_descriptor = messageType2;
        internal_static_SA_SEAIErrorCodeInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"AiErrorCode", "AiErrorString"});
        Descriptors.Descriptor nestedType = messageType2.getNestedType(0);
        internal_static_SA_SEAIErrorCodeInfo_SEList_descriptor = nestedType;
        internal_static_SA_SEAIErrorCodeInfo_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SA_SEVoiceCmd_descriptor = messageType3;
        internal_static_SA_SEVoiceCmd_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"VoiceState", "VoiceName"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SA_SEViewTemplateUI_descriptor = messageType4;
        internal_static_SA_SEViewTemplateUI_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"Title", "Value", "Unit", "Footer", "ActionTime"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SA_SEHistoryTemplateUI_descriptor = messageType5;
        internal_static_SA_SEHistoryTemplateUI_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"Title", "Period", "ValueTitle", "YMax", "Summary", "ChartDataList"});
        Descriptors.Descriptor nestedType2 = messageType5.getNestedType(0);
        internal_static_SA_SEHistoryTemplateUI_SESummary_descriptor = nestedType2;
        internal_static_SA_SEHistoryTemplateUI_SESummary_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{"MaxValue", "MinValue", "AvgValue", "Unit"});
        Descriptors.Descriptor nestedType3 = messageType5.getNestedType(1);
        internal_static_SA_SEHistoryTemplateUI_ChartData_descriptor = nestedType3;
        internal_static_SA_SEHistoryTemplateUI_ChartData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType3, new String[]{"TimeDate", "Week", "ChartValue", "Category"});
        Descriptors.Descriptor nestedType4 = messageType5.getNestedType(2);
        internal_static_SA_SEHistoryTemplateUI_ChartDataList_descriptor = nestedType4;
        internal_static_SA_SEHistoryTemplateUI_ChartDataList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType4, new String[]{"ChartList"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SA_SESetActionTemplate_descriptor = messageType6;
        internal_static_SA_SESetActionTemplate_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"Scenario", "ThresholdValue", "TimeDate", "Unit", "ActionTime"});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SA_SEToggleTemplateUI_descriptor = messageType7;
        internal_static_SA_SEToggleTemplateUI_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"Scenario", "ToggleStatus", "ActionTime"});
        Descriptors.Descriptor messageType8 = getDescriptor().getMessageType(7);
        internal_static_SA_SEOpenAppFunction_descriptor = messageType8;
        internal_static_SA_SEOpenAppFunction_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType8, new String[]{"Function", "ActionTime", "WorkoutType", "ClockInfoList", "Duration", "ContactsNumber", "MusicCommand", "ScreenSetting"});
        Descriptors.Descriptor messageType9 = getDescriptor().getMessageType(8);
        internal_static_SA_SEAIScreenSetting_descriptor = messageType9;
        internal_static_SA_SEAIScreenSetting_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType9, new String[]{"BrightnessLevel", "NormallyOnSwitch", "OnScreenDuration", "DoubleClickTheHighlightedScreen"});
        Descriptors.Descriptor messageType10 = getDescriptor().getMessageType(9);
        internal_static_SA_SEAIClockInfo_descriptor = messageType10;
        internal_static_SA_SEAIClockInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType10, new String[]{"Id", "Data"});
        Descriptors.Descriptor nestedType5 = messageType10.getNestedType(0);
        internal_static_SA_SEAIClockInfo_SEAIData_descriptor = nestedType5;
        internal_static_SA_SEAIClockInfo_SEAIData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType5, new String[]{UrlTemplate.f27969g, "WeekDays", "Enable", "ClockName", "ClockLabel"});
        Descriptors.Descriptor nestedType6 = messageType10.getNestedType(1);
        internal_static_SA_SEAIClockInfo_SEList_descriptor = nestedType6;
        internal_static_SA_SEAIClockInfo_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType6, new String[]{MessageLiteToString.f20028a, "SupportMaxClocks"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        CommonProtos.getDescriptor();
        SettingMenuProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private AIFunctionProtos() {
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