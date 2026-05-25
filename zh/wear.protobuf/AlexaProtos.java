package com.zh.wear.protobuf;

import androidx.browser.trusted.Token;
import androidx.datastore.preferences.protobuf.MessageLiteToString;
import com.google.common.net.HttpHeaders;
import com.google.firebase.installations.local.PersistedInstallation;
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
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class AlexaProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_AlexaAlertsDeleteAlert_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaAlertsDeleteAlert_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaAlertsDeleteAlert_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaAlertsDeleteAlert_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaAlertsSetAlert_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaAlertsSetAlert_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaInstruction_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaInstruction_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaInstruction_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaInstruction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaListsItem_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaListsItem_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaListsItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaListsItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaNotificationsSetIndicator_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaNotificationsSetIndicator_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaQuietMode_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaQuietMode_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaSpeechSynthesizerSpeak_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaSpeechSynthesizerSpeak_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaTemplateGeneral_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaTemplateGeneral_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaTemplateLists_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaTemplateLists_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaTemplateWeather_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaTemplateWeather_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaTitle_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaTitle_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaWeatherItem_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaWeatherItem_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AlexaWeatherItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AlexaWeatherItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Alexa_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Alexa_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.AlexaProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$AlexaProtos$Alexa$PayloadCase;

        static {
            int[] iArr = new int[Alexa.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$AlexaProtos$Alexa$PayloadCase = iArr;
            try {
                iArr[Alexa.PayloadCase.INSTRUCTION_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AlexaProtos$Alexa$PayloadCase[Alexa.PayloadCase.CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AlexaProtos$Alexa$PayloadCase[Alexa.PayloadCase.QUIET_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AlexaProtos$Alexa$PayloadCase[Alexa.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Alexa extends GeneratedMessageV3 implements AlexaOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        public static final int INSTRUCTION_LIST_FIELD_NUMBER = 1;
        public static final int QUIET_MODE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final Alexa DEFAULT_INSTANCE = new Alexa();

        @Deprecated
        public static final Parser<Alexa> PARSER = new AbstractParser<Alexa>() { // from class: com.zh.wear.protobuf.AlexaProtos.Alexa.1
            @Override // com.google.protobuf.Parser
            public Alexa parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Alexa(codedInputStream, extensionRegistryLite);
            }
        };

        public enum AlexaID implements ProtocolMessageEnum {
            SYNC_INSTRUCTION_LIST(0),
            SET_CONFIG(1),
            GET_CONFIG(2),
            REPORT_QUIET_MODE(3);

            public static final int GET_CONFIG_VALUE = 2;
            public static final int REPORT_QUIET_MODE_VALUE = 3;
            public static final int SET_CONFIG_VALUE = 1;
            public static final int SYNC_INSTRUCTION_LIST_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<AlexaID> internalValueMap = new Internal.EnumLiteMap<AlexaID>() { // from class: com.zh.wear.protobuf.AlexaProtos.Alexa.AlexaID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public AlexaID findValueByNumber(int i7) {
                    return AlexaID.forNumber(i7);
                }
            };
            private static final AlexaID[] VALUES = values();

            AlexaID(int i7) {
                this.value = i7;
            }

            public static AlexaID forNumber(int i7) {
                if (i7 == 0) {
                    return SYNC_INSTRUCTION_LIST;
                }
                if (i7 == 1) {
                    return SET_CONFIG;
                }
                if (i7 == 2) {
                    return GET_CONFIG;
                }
                if (i7 != 3) {
                    return null;
                }
                return REPORT_QUIET_MODE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Alexa.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<AlexaID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static AlexaID valueOf(int i7) {
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

            public static AlexaID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<AlexaConfig, AlexaConfig.Builder, AlexaConfigOrBuilder> configBuilder_;
            private SingleFieldBuilderV3<AlexaInstruction.List, AlexaInstruction.List.Builder, AlexaInstruction.ListOrBuilder> instructionListBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilderV3<AlexaQuietMode, AlexaQuietMode.Builder, AlexaQuietModeOrBuilder> quietModeBuilder_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<AlexaConfig, AlexaConfig.Builder, AlexaConfigOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = AlexaConfig.getDefaultInstance();
                    }
                    this.configBuilder_ = new SingleFieldBuilderV3<>((AlexaConfig) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_Alexa_descriptor;
            }

            private SingleFieldBuilderV3<AlexaInstruction.List, AlexaInstruction.List.Builder, AlexaInstruction.ListOrBuilder> getInstructionListFieldBuilder() {
                if (this.instructionListBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = AlexaInstruction.List.getDefaultInstance();
                    }
                    this.instructionListBuilder_ = new SingleFieldBuilderV3<>((AlexaInstruction.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.instructionListBuilder_;
            }

            private SingleFieldBuilderV3<AlexaQuietMode, AlexaQuietMode.Builder, AlexaQuietModeOrBuilder> getQuietModeFieldBuilder() {
                if (this.quietModeBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = AlexaQuietMode.getDefaultInstance();
                    }
                    this.quietModeBuilder_ = new SingleFieldBuilderV3<>((AlexaQuietMode) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.quietModeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearConfig() {
                SingleFieldBuilderV3<AlexaConfig, AlexaConfig.Builder, AlexaConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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

            public Builder clearInstructionList() {
                SingleFieldBuilderV3<AlexaInstruction.List, AlexaInstruction.List.Builder, AlexaInstruction.ListOrBuilder> singleFieldBuilderV3 = this.instructionListBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearQuietMode() {
                SingleFieldBuilderV3<AlexaQuietMode, AlexaQuietMode.Builder, AlexaQuietModeOrBuilder> singleFieldBuilderV3 = this.quietModeBuilder_;
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

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public AlexaConfig getConfig() {
                Object message;
                SingleFieldBuilderV3<AlexaConfig, AlexaConfig.Builder, AlexaConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return AlexaConfig.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return AlexaConfig.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (AlexaConfig) message;
            }

            public AlexaConfig.Builder getConfigBuilder() {
                return (AlexaConfig.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public AlexaConfigOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<AlexaConfig, AlexaConfig.Builder, AlexaConfigOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.configBuilder_) == null) ? i7 == 2 ? (AlexaConfig) this.payload_ : AlexaConfig.getDefaultInstance() : (AlexaConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_Alexa_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public AlexaInstruction.List getInstructionList() {
                Object message;
                SingleFieldBuilderV3<AlexaInstruction.List, AlexaInstruction.List.Builder, AlexaInstruction.ListOrBuilder> singleFieldBuilderV3 = this.instructionListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 1) {
                        return AlexaInstruction.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 1) {
                        return AlexaInstruction.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (AlexaInstruction.List) message;
            }

            public AlexaInstruction.List.Builder getInstructionListBuilder() {
                return (AlexaInstruction.List.Builder) getInstructionListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public AlexaInstruction.ListOrBuilder getInstructionListOrBuilder() {
                SingleFieldBuilderV3<AlexaInstruction.List, AlexaInstruction.List.Builder, AlexaInstruction.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilderV3 = this.instructionListBuilder_) == null) ? i7 == 1 ? (AlexaInstruction.List) this.payload_ : AlexaInstruction.List.getDefaultInstance() : (AlexaInstruction.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public AlexaQuietMode getQuietMode() {
                Object message;
                SingleFieldBuilderV3<AlexaQuietMode, AlexaQuietMode.Builder, AlexaQuietModeOrBuilder> singleFieldBuilderV3 = this.quietModeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 3) {
                        return AlexaQuietMode.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 3) {
                        return AlexaQuietMode.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (AlexaQuietMode) message;
            }

            public AlexaQuietMode.Builder getQuietModeBuilder() {
                return (AlexaQuietMode.Builder) getQuietModeFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public AlexaQuietModeOrBuilder getQuietModeOrBuilder() {
                SingleFieldBuilderV3<AlexaQuietMode, AlexaQuietMode.Builder, AlexaQuietModeOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilderV3 = this.quietModeBuilder_) == null) ? i7 == 3 ? (AlexaQuietMode) this.payload_ : AlexaQuietMode.getDefaultInstance() : (AlexaQuietModeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public boolean hasConfig() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public boolean hasInstructionList() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
            public boolean hasQuietMode() {
                return this.payloadCase_ == 3;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_Alexa_fieldAccessorTable.ensureFieldAccessorsInitialized(Alexa.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasInstructionList() && !getInstructionList().isInitialized()) {
                    return false;
                }
                if (!hasConfig() || getConfig().isInitialized()) {
                    return !hasQuietMode() || getQuietMode().isInitialized();
                }
                return false;
            }

            public Builder mergeConfig(AlexaConfig alexaConfig) {
                SingleFieldBuilderV3<AlexaConfig, AlexaConfig.Builder, AlexaConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != AlexaConfig.getDefaultInstance()) {
                        alexaConfig = AlexaConfig.newBuilder((AlexaConfig) this.payload_).mergeFrom(alexaConfig).buildPartial();
                    }
                    this.payload_ = alexaConfig;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(alexaConfig);
                    }
                    this.configBuilder_.setMessage(alexaConfig);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeInstructionList(AlexaInstruction.List list) {
                SingleFieldBuilderV3<AlexaInstruction.List, AlexaInstruction.List.Builder, AlexaInstruction.ListOrBuilder> singleFieldBuilderV3 = this.instructionListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 1 && this.payload_ != AlexaInstruction.List.getDefaultInstance()) {
                        list = AlexaInstruction.List.newBuilder((AlexaInstruction.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.instructionListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeQuietMode(AlexaQuietMode alexaQuietMode) {
                SingleFieldBuilderV3<AlexaQuietMode, AlexaQuietMode.Builder, AlexaQuietModeOrBuilder> singleFieldBuilderV3 = this.quietModeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 3 && this.payload_ != AlexaQuietMode.getDefaultInstance()) {
                        alexaQuietMode = AlexaQuietMode.newBuilder((AlexaQuietMode) this.payload_).mergeFrom(alexaQuietMode).buildPartial();
                    }
                    this.payload_ = alexaQuietMode;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 3) {
                        singleFieldBuilderV3.mergeFrom(alexaQuietMode);
                    }
                    this.quietModeBuilder_.setMessage(alexaQuietMode);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setConfig(AlexaConfig.Builder builder) {
                SingleFieldBuilderV3<AlexaConfig, AlexaConfig.Builder, AlexaConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                AlexaConfig alexaConfigBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = alexaConfigBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaConfigBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setInstructionList(AlexaInstruction.List.Builder builder) {
                SingleFieldBuilderV3<AlexaInstruction.List, AlexaInstruction.List.Builder, AlexaInstruction.ListOrBuilder> singleFieldBuilderV3 = this.instructionListBuilder_;
                AlexaInstruction.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setQuietMode(AlexaQuietMode.Builder builder) {
                SingleFieldBuilderV3<AlexaQuietMode, AlexaQuietMode.Builder, AlexaQuietModeOrBuilder> singleFieldBuilderV3 = this.quietModeBuilder_;
                AlexaQuietMode alexaQuietModeBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = alexaQuietModeBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaQuietModeBuild);
                }
                this.payloadCase_ = 3;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setConfig(AlexaConfig alexaConfig) {
                SingleFieldBuilderV3<AlexaConfig, AlexaConfig.Builder, AlexaConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaConfig.getClass();
                    this.payload_ = alexaConfig;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaConfig);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setInstructionList(AlexaInstruction.List list) {
                SingleFieldBuilderV3<AlexaInstruction.List, AlexaInstruction.List.Builder, AlexaInstruction.ListOrBuilder> singleFieldBuilderV3 = this.instructionListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setQuietMode(AlexaQuietMode alexaQuietMode) {
                SingleFieldBuilderV3<AlexaQuietMode, AlexaQuietMode.Builder, AlexaQuietModeOrBuilder> singleFieldBuilderV3 = this.quietModeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaQuietMode.getClass();
                    this.payload_ = alexaQuietMode;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaQuietMode);
                }
                this.payloadCase_ = 3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Alexa build() {
                Alexa alexaBuildPartial = buildPartial();
                if (alexaBuildPartial.isInitialized()) {
                    return alexaBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Alexa buildPartial() {
                Alexa alexa = new Alexa(this);
                if (this.payloadCase_ == 1) {
                    SingleFieldBuilderV3<AlexaInstruction.List, AlexaInstruction.List.Builder, AlexaInstruction.ListOrBuilder> singleFieldBuilderV3 = this.instructionListBuilder_;
                    alexa.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<AlexaConfig, AlexaConfig.Builder, AlexaConfigOrBuilder> singleFieldBuilderV32 = this.configBuilder_;
                    alexa.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 3) {
                    SingleFieldBuilderV3<AlexaQuietMode, AlexaQuietMode.Builder, AlexaQuietModeOrBuilder> singleFieldBuilderV33 = this.quietModeBuilder_;
                    alexa.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                alexa.bitField0_ = 0;
                alexa.payloadCase_ = this.payloadCase_;
                onBuilt();
                return alexa;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Alexa getDefaultInstanceForType() {
                return Alexa.getDefaultInstance();
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
            public com.zh.wear.protobuf.AlexaProtos.Alexa.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$Alexa> r1 = com.zh.wear.protobuf.AlexaProtos.Alexa.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$Alexa r3 = (com.zh.wear.protobuf.AlexaProtos.Alexa) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$Alexa r4 = (com.zh.wear.protobuf.AlexaProtos.Alexa) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.Alexa.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$Alexa$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Alexa) {
                    return mergeFrom((Alexa) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Alexa alexa) {
                if (alexa == Alexa.getDefaultInstance()) {
                    return this;
                }
                int i7 = AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$AlexaProtos$Alexa$PayloadCase[alexa.getPayloadCase().ordinal()];
                if (i7 == 1) {
                    mergeInstructionList(alexa.getInstructionList());
                } else if (i7 == 2) {
                    mergeConfig(alexa.getConfig());
                } else if (i7 == 3) {
                    mergeQuietMode(alexa.getQuietMode());
                }
                mergeUnknownFields(((GeneratedMessage) alexa).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            INSTRUCTION_LIST(1),
            CONFIG(2),
            QUIET_MODE(3),
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
                    return INSTRUCTION_LIST;
                }
                if (i7 == 2) {
                    return CONFIG;
                }
                if (i7 != 3) {
                    return null;
                }
                return QUIET_MODE;
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

        private Alexa() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Alexa getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_Alexa_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Alexa parseDelimitedFrom(InputStream inputStream) {
            return (Alexa) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Alexa parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Alexa> parser() {
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
                boolean r1 = r6 instanceof com.zh.wear.protobuf.AlexaProtos.Alexa
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.zh.wear.protobuf.AlexaProtos$Alexa r6 = (com.zh.wear.protobuf.AlexaProtos.Alexa) r6
                com.zh.wear.protobuf.AlexaProtos$Alexa$PayloadCase r1 = r5.getPayloadCase()
                com.zh.wear.protobuf.AlexaProtos$Alexa$PayloadCase r2 = r6.getPayloadCase()
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
                com.zh.wear.protobuf.AlexaProtos$AlexaQuietMode r1 = r5.getQuietMode()
                com.zh.wear.protobuf.AlexaProtos$AlexaQuietMode r3 = r6.getQuietMode()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5e
                goto L5c
            L3b:
                if (r1 == 0) goto L5e
                com.zh.wear.protobuf.AlexaProtos$AlexaConfig r1 = r5.getConfig()
                com.zh.wear.protobuf.AlexaProtos$AlexaConfig r3 = r6.getConfig()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5e
                goto L5c
            L4c:
                if (r1 == 0) goto L5e
                com.zh.wear.protobuf.AlexaProtos$AlexaInstruction$List r1 = r5.getInstructionList()
                com.zh.wear.protobuf.AlexaProtos$AlexaInstruction$List r3 = r6.getInstructionList()
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
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.Alexa.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public AlexaConfig getConfig() {
            return this.payloadCase_ == 2 ? (AlexaConfig) this.payload_ : AlexaConfig.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public AlexaConfigOrBuilder getConfigOrBuilder() {
            return this.payloadCase_ == 2 ? (AlexaConfig) this.payload_ : AlexaConfig.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public AlexaInstruction.List getInstructionList() {
            return this.payloadCase_ == 1 ? (AlexaInstruction.List) this.payload_ : AlexaInstruction.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public AlexaInstruction.ListOrBuilder getInstructionListOrBuilder() {
            return this.payloadCase_ == 1 ? (AlexaInstruction.List) this.payload_ : AlexaInstruction.List.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Alexa> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public AlexaQuietMode getQuietMode() {
            return this.payloadCase_ == 3 ? (AlexaQuietMode) this.payload_ : AlexaQuietMode.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public AlexaQuietModeOrBuilder getQuietModeOrBuilder() {
            return this.payloadCase_ == 3 ? (AlexaQuietMode) this.payload_ : AlexaQuietMode.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (AlexaInstruction.List) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (AlexaConfig) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (AlexaQuietMode) this.payload_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public boolean hasConfig() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public boolean hasInstructionList() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaOrBuilder
        public boolean hasQuietMode() {
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
                iHashCode = getInstructionList().hashCode();
            } else {
                if (i9 != 2) {
                    if (i9 == 3) {
                        i7 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getQuietMode().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i7 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getConfig().hashCode();
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_Alexa_fieldAccessorTable.ensureFieldAccessorsInitialized(Alexa.class, Builder.class);
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
            if (hasInstructionList() && !getInstructionList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConfig() && !getConfig().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasQuietMode() || getQuietMode().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (AlexaInstruction.List) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (AlexaConfig) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (AlexaQuietMode) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Alexa(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                    AlexaInstruction.List.Builder builder = this.payloadCase_ == 1 ? ((AlexaInstruction.List) this.payload_).toBuilder() : null;
                                    MessageLite message = codedInputStream.readMessage(AlexaInstruction.List.PARSER, extensionRegistryLite);
                                    this.payload_ = message;
                                    if (builder != null) {
                                        builder.mergeFrom((AlexaInstruction.List) message);
                                        this.payload_ = builder.buildPartial();
                                    }
                                } else if (tag == 18) {
                                    i7 = 2;
                                    AlexaConfig.Builder builder2 = this.payloadCase_ == 2 ? ((AlexaConfig) this.payload_).toBuilder() : null;
                                    MessageLite message2 = codedInputStream.readMessage(AlexaConfig.PARSER, extensionRegistryLite);
                                    this.payload_ = message2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((AlexaConfig) message2);
                                        this.payload_ = builder2.buildPartial();
                                    }
                                } else if (tag == 26) {
                                    i7 = 3;
                                    AlexaQuietMode.Builder builder3 = this.payloadCase_ == 3 ? ((AlexaQuietMode) this.payload_).toBuilder() : null;
                                    MessageLite message3 = codedInputStream.readMessage(AlexaQuietMode.PARSER, extensionRegistryLite);
                                    this.payload_ = message3;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((AlexaQuietMode) message3);
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

        public static Builder newBuilder(Alexa alexa) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexa);
        }

        public static Alexa parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Alexa) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Alexa parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Alexa parseFrom(CodedInputStream codedInputStream) {
            return (Alexa) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Alexa getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Alexa(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Alexa parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Alexa) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Alexa parseFrom(InputStream inputStream) {
            return (Alexa) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Alexa parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Alexa) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Alexa parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Alexa parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Alexa parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Alexa parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public enum AlexaAlertType implements ProtocolMessageEnum {
        ALEXA_AlertType_UNKNOWN(-1),
        ALEXA_ALARM(0),
        ALEXA_REMINDER(1),
        ALEXA_TIMER(2);

        public static final int ALEXA_ALARM_VALUE = 0;
        public static final int ALEXA_AlertType_UNKNOWN_VALUE = -1;
        public static final int ALEXA_REMINDER_VALUE = 1;
        public static final int ALEXA_TIMER_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<AlexaAlertType> internalValueMap = new Internal.EnumLiteMap<AlexaAlertType>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaAlertType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AlexaAlertType findValueByNumber(int i7) {
                return AlexaAlertType.forNumber(i7);
            }
        };
        private static final AlexaAlertType[] VALUES = values();

        AlexaAlertType(int i7) {
            this.value = i7;
        }

        public static AlexaAlertType forNumber(int i7) {
            if (i7 == -1) {
                return ALEXA_AlertType_UNKNOWN;
            }
            if (i7 == 0) {
                return ALEXA_ALARM;
            }
            if (i7 == 1) {
                return ALEXA_REMINDER;
            }
            if (i7 != 2) {
                return null;
            }
            return ALEXA_TIMER;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return AlexaProtos.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<AlexaAlertType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static AlexaAlertType valueOf(int i7) {
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

        public static AlexaAlertType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class AlexaAlertsDeleteAlert extends GeneratedMessageV3 implements AlexaAlertsDeleteAlertOrBuilder {
        private static final AlexaAlertsDeleteAlert DEFAULT_INSTANCE = new AlexaAlertsDeleteAlert();

        @Deprecated
        public static final Parser<AlexaAlertsDeleteAlert> PARSER = new AbstractParser<AlexaAlertsDeleteAlert>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.1
            @Override // com.google.protobuf.Parser
            public AlexaAlertsDeleteAlert parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaAlertsDeleteAlert(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TOKEN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object token_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaAlertsDeleteAlertOrBuilder {
            private int bitField0_;
            private Object token_;

            private Builder() {
                this.token_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearToken() {
                this.bitField0_ &= -2;
                this.token_ = AlexaAlertsDeleteAlert.getDefaultInstance().getToken();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlertOrBuilder
            public String getToken() {
                Object obj = this.token_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.token_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlertOrBuilder
            public ByteString getTokenBytes() {
                Object obj = this.token_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.token_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlertOrBuilder
            public boolean hasToken() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaAlertsDeleteAlert.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasToken();
            }

            public Builder setToken(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.token_ = str;
                onChanged();
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.token_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.token_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaAlertsDeleteAlert build() {
                AlexaAlertsDeleteAlert alexaAlertsDeleteAlertBuildPartial = buildPartial();
                if (alexaAlertsDeleteAlertBuildPartial.isInitialized()) {
                    return alexaAlertsDeleteAlertBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaAlertsDeleteAlertBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaAlertsDeleteAlert buildPartial() {
                AlexaAlertsDeleteAlert alexaAlertsDeleteAlert = new AlexaAlertsDeleteAlert(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                alexaAlertsDeleteAlert.token_ = this.token_;
                alexaAlertsDeleteAlert.bitField0_ = i7;
                onBuilt();
                return alexaAlertsDeleteAlert;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaAlertsDeleteAlert getDefaultInstanceForType() {
                return AlexaAlertsDeleteAlert.getDefaultInstance();
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
                this.token_ = "";
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaAlertsDeleteAlert> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaAlertsDeleteAlert r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaAlertsDeleteAlert r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaAlertsDeleteAlert$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaAlertsDeleteAlert) {
                    return mergeFrom((AlexaAlertsDeleteAlert) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaAlertsDeleteAlert alexaAlertsDeleteAlert) {
                if (alexaAlertsDeleteAlert == AlexaAlertsDeleteAlert.getDefaultInstance()) {
                    return this;
                }
                if (alexaAlertsDeleteAlert.hasToken()) {
                    this.bitField0_ |= 1;
                    this.token_ = alexaAlertsDeleteAlert.token_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) alexaAlertsDeleteAlert).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<AlexaAlertsDeleteAlert> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> listBuilder_;
                private java.util.List<AlexaAlertsDeleteAlert> list_;

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
                    return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_List_descriptor;
                }

                private RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends AlexaAlertsDeleteAlert> iterable) {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(AlexaAlertsDeleteAlert.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
                public AlexaAlertsDeleteAlert getList(int i7) {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AlexaAlertsDeleteAlert) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
                public java.util.List<AlexaAlertsDeleteAlert> getListList() {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
                public AlexaAlertsDeleteAlertOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AlexaAlertsDeleteAlertOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
                public java.util.List<? extends AlexaAlertsDeleteAlertOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, AlexaAlertsDeleteAlert alexaAlertsDeleteAlert) {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, alexaAlertsDeleteAlert);
                        return this;
                    }
                    alexaAlertsDeleteAlert.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, alexaAlertsDeleteAlert);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, AlexaAlertsDeleteAlert.getDefaultInstance());
                }

                public Builder setList(int i7, AlexaAlertsDeleteAlert alexaAlertsDeleteAlert) {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, alexaAlertsDeleteAlert);
                        return this;
                    }
                    alexaAlertsDeleteAlert.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, alexaAlertsDeleteAlert);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(AlexaAlertsDeleteAlert alexaAlertsDeleteAlert) {
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(alexaAlertsDeleteAlert);
                        return this;
                    }
                    alexaAlertsDeleteAlert.getClass();
                    ensureListIsMutable();
                    this.list_.add(alexaAlertsDeleteAlert);
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
                    RepeatedFieldBuilderV3<AlexaAlertsDeleteAlert, Builder, AlexaAlertsDeleteAlertOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaAlertsDeleteAlert$List> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.AlexaProtos$AlexaAlertsDeleteAlert$List r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.AlexaProtos$AlexaAlertsDeleteAlert$List r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaAlertsDeleteAlert$List$Builder");
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
                return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_List_descriptor;
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

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
            public AlexaAlertsDeleteAlert getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
            public java.util.List<AlexaAlertsDeleteAlert> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
            public AlexaAlertsDeleteAlertOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlert.ListOrBuilder
            public java.util.List<? extends AlexaAlertsDeleteAlertOrBuilder> getListOrBuilderList() {
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
                return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((AlexaAlertsDeleteAlert) codedInputStream.readMessage(AlexaAlertsDeleteAlert.PARSER, extensionRegistryLite));
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
            AlexaAlertsDeleteAlert getList(int i7);

            int getListCount();

            java.util.List<AlexaAlertsDeleteAlert> getListList();

            AlexaAlertsDeleteAlertOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends AlexaAlertsDeleteAlertOrBuilder> getListOrBuilderList();
        }

        private AlexaAlertsDeleteAlert() {
            this.memoizedIsInitialized = (byte) -1;
            this.token_ = "";
        }

        public static AlexaAlertsDeleteAlert getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaAlertsDeleteAlert parseDelimitedFrom(InputStream inputStream) {
            return (AlexaAlertsDeleteAlert) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaAlertsDeleteAlert parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaAlertsDeleteAlert> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaAlertsDeleteAlert)) {
                return super.equals(obj);
            }
            AlexaAlertsDeleteAlert alexaAlertsDeleteAlert = (AlexaAlertsDeleteAlert) obj;
            boolean z6 = hasToken() == alexaAlertsDeleteAlert.hasToken();
            if (hasToken()) {
                z6 = z6 && getToken().equals(alexaAlertsDeleteAlert.getToken());
            }
            return z6 && this.unknownFields.equals(alexaAlertsDeleteAlert.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaAlertsDeleteAlert> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = ((this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.token_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlertOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.token_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlertOrBuilder
        public ByteString getTokenBytes() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsDeleteAlertOrBuilder
        public boolean hasToken() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasToken()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getToken().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaAlertsDeleteAlert_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaAlertsDeleteAlert.class, Builder.class);
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
            if (hasToken()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.token_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaAlertsDeleteAlert(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.token_ = bytes;
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

        public static Builder newBuilder(AlexaAlertsDeleteAlert alexaAlertsDeleteAlert) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaAlertsDeleteAlert);
        }

        public static AlexaAlertsDeleteAlert parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaAlertsDeleteAlert) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaAlertsDeleteAlert parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaAlertsDeleteAlert parseFrom(CodedInputStream codedInputStream) {
            return (AlexaAlertsDeleteAlert) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaAlertsDeleteAlert getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaAlertsDeleteAlert(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaAlertsDeleteAlert parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaAlertsDeleteAlert) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaAlertsDeleteAlert parseFrom(InputStream inputStream) {
            return (AlexaAlertsDeleteAlert) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaAlertsDeleteAlert parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaAlertsDeleteAlert) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaAlertsDeleteAlert parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaAlertsDeleteAlert parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaAlertsDeleteAlert parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaAlertsDeleteAlert parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaAlertsDeleteAlertOrBuilder extends MessageOrBuilder {
        String getToken();

        ByteString getTokenBytes();

        boolean hasToken();
    }

    public static final class AlexaAlertsSetAlert extends GeneratedMessageV3 implements AlexaAlertsSetAlertOrBuilder {
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int SCHEDULEDTIME_FIELD_NUMBER = 3;
        public static final int TOKEN_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object label_;
        private byte memoizedIsInitialized;
        private volatile Object scheduledTime_;
        private volatile Object token_;
        private int type_;
        private static final AlexaAlertsSetAlert DEFAULT_INSTANCE = new AlexaAlertsSetAlert();

        @Deprecated
        public static final Parser<AlexaAlertsSetAlert> PARSER = new AbstractParser<AlexaAlertsSetAlert>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlert.1
            @Override // com.google.protobuf.Parser
            public AlexaAlertsSetAlert parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaAlertsSetAlert(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaAlertsSetAlertOrBuilder {
            private int bitField0_;
            private Object label_;
            private Object scheduledTime_;
            private Object token_;
            private int type_;

            private Builder() {
                this.token_ = "";
                this.type_ = -1;
                this.scheduledTime_ = "";
                this.label_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaAlertsSetAlert_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearLabel() {
                this.bitField0_ &= -9;
                this.label_ = AlexaAlertsSetAlert.getDefaultInstance().getLabel();
                onChanged();
                return this;
            }

            public Builder clearScheduledTime() {
                this.bitField0_ &= -5;
                this.scheduledTime_ = AlexaAlertsSetAlert.getDefaultInstance().getScheduledTime();
                onChanged();
                return this;
            }

            public Builder clearToken() {
                this.bitField0_ &= -2;
                this.token_ = AlexaAlertsSetAlert.getDefaultInstance().getToken();
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -3;
                this.type_ = -1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaAlertsSetAlert_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public String getLabel() {
                Object obj = this.label_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.label_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public ByteString getLabelBytes() {
                Object obj = this.label_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.label_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public String getScheduledTime() {
                Object obj = this.scheduledTime_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.scheduledTime_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public ByteString getScheduledTimeBytes() {
                Object obj = this.scheduledTime_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.scheduledTime_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public String getToken() {
                Object obj = this.token_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.token_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public ByteString getTokenBytes() {
                Object obj = this.token_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.token_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public AlexaAlertType getType() {
                AlexaAlertType alexaAlertTypeValueOf = AlexaAlertType.valueOf(this.type_);
                return alexaAlertTypeValueOf == null ? AlexaAlertType.ALEXA_AlertType_UNKNOWN : alexaAlertTypeValueOf;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public boolean hasLabel() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public boolean hasScheduledTime() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public boolean hasToken() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaAlertsSetAlert_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaAlertsSetAlert.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasToken() && hasType() && hasScheduledTime();
            }

            public Builder setLabel(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.label_ = str;
                onChanged();
                return this;
            }

            public Builder setLabelBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.label_ = byteString;
                onChanged();
                return this;
            }

            public Builder setScheduledTime(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.scheduledTime_ = str;
                onChanged();
                return this;
            }

            public Builder setScheduledTimeBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.scheduledTime_ = byteString;
                onChanged();
                return this;
            }

            public Builder setToken(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.token_ = str;
                onChanged();
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.token_ = byteString;
                onChanged();
                return this;
            }

            public Builder setType(AlexaAlertType alexaAlertType) {
                alexaAlertType.getClass();
                this.bitField0_ |= 2;
                this.type_ = alexaAlertType.getNumber();
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.token_ = "";
                this.type_ = -1;
                this.scheduledTime_ = "";
                this.label_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaAlertsSetAlert build() {
                AlexaAlertsSetAlert alexaAlertsSetAlertBuildPartial = buildPartial();
                if (alexaAlertsSetAlertBuildPartial.isInitialized()) {
                    return alexaAlertsSetAlertBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaAlertsSetAlertBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaAlertsSetAlert buildPartial() {
                AlexaAlertsSetAlert alexaAlertsSetAlert = new AlexaAlertsSetAlert(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                alexaAlertsSetAlert.token_ = this.token_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                alexaAlertsSetAlert.type_ = this.type_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                alexaAlertsSetAlert.scheduledTime_ = this.scheduledTime_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                alexaAlertsSetAlert.label_ = this.label_;
                alexaAlertsSetAlert.bitField0_ = i8;
                onBuilt();
                return alexaAlertsSetAlert;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaAlertsSetAlert getDefaultInstanceForType() {
                return AlexaAlertsSetAlert.getDefaultInstance();
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
                this.token_ = "";
                int i7 = this.bitField0_;
                this.type_ = -1;
                this.scheduledTime_ = "";
                this.label_ = "";
                this.bitField0_ = i7 & (-16);
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlert.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaAlertsSetAlert> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlert.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaAlertsSetAlert r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlert) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaAlertsSetAlert r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlert) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlert.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaAlertsSetAlert$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaAlertsSetAlert) {
                    return mergeFrom((AlexaAlertsSetAlert) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaAlertsSetAlert alexaAlertsSetAlert) {
                if (alexaAlertsSetAlert == AlexaAlertsSetAlert.getDefaultInstance()) {
                    return this;
                }
                if (alexaAlertsSetAlert.hasToken()) {
                    this.bitField0_ |= 1;
                    this.token_ = alexaAlertsSetAlert.token_;
                    onChanged();
                }
                if (alexaAlertsSetAlert.hasType()) {
                    setType(alexaAlertsSetAlert.getType());
                }
                if (alexaAlertsSetAlert.hasScheduledTime()) {
                    this.bitField0_ |= 4;
                    this.scheduledTime_ = alexaAlertsSetAlert.scheduledTime_;
                    onChanged();
                }
                if (alexaAlertsSetAlert.hasLabel()) {
                    this.bitField0_ |= 8;
                    this.label_ = alexaAlertsSetAlert.label_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) alexaAlertsSetAlert).unknownFields);
                onChanged();
                return this;
            }
        }

        private AlexaAlertsSetAlert() {
            this.memoizedIsInitialized = (byte) -1;
            this.token_ = "";
            this.type_ = -1;
            this.scheduledTime_ = "";
            this.label_ = "";
        }

        public static AlexaAlertsSetAlert getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaAlertsSetAlert_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaAlertsSetAlert parseDelimitedFrom(InputStream inputStream) {
            return (AlexaAlertsSetAlert) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaAlertsSetAlert parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaAlertsSetAlert> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaAlertsSetAlert)) {
                return super.equals(obj);
            }
            AlexaAlertsSetAlert alexaAlertsSetAlert = (AlexaAlertsSetAlert) obj;
            boolean z6 = hasToken() == alexaAlertsSetAlert.hasToken();
            if (hasToken()) {
                z6 = z6 && getToken().equals(alexaAlertsSetAlert.getToken());
            }
            boolean z7 = z6 && hasType() == alexaAlertsSetAlert.hasType();
            if (hasType()) {
                z7 = z7 && this.type_ == alexaAlertsSetAlert.type_;
            }
            boolean z8 = z7 && hasScheduledTime() == alexaAlertsSetAlert.hasScheduledTime();
            if (hasScheduledTime()) {
                z8 = z8 && getScheduledTime().equals(alexaAlertsSetAlert.getScheduledTime());
            }
            boolean z9 = z8 && hasLabel() == alexaAlertsSetAlert.hasLabel();
            if (hasLabel()) {
                z9 = z9 && getLabel().equals(alexaAlertsSetAlert.getLabel());
            }
            return z9 && this.unknownFields.equals(alexaAlertsSetAlert.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public String getLabel() {
            Object obj = this.label_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.label_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public ByteString getLabelBytes() {
            Object obj = this.label_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.label_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaAlertsSetAlert> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public String getScheduledTime() {
            Object obj = this.scheduledTime_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.scheduledTime_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public ByteString getScheduledTimeBytes() {
            Object obj = this.scheduledTime_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.scheduledTime_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.token_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.scheduledTime_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.label_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.token_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public ByteString getTokenBytes() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public AlexaAlertType getType() {
            AlexaAlertType alexaAlertTypeValueOf = AlexaAlertType.valueOf(this.type_);
            return alexaAlertTypeValueOf == null ? AlexaAlertType.ALEXA_AlertType_UNKNOWN : alexaAlertTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public boolean hasLabel() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public boolean hasScheduledTime() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public boolean hasToken() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaAlertsSetAlertOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasToken()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getToken().hashCode();
            }
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.type_;
            }
            if (hasScheduledTime()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getScheduledTime().hashCode();
            }
            if (hasLabel()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getLabel().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaAlertsSetAlert_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaAlertsSetAlert.class, Builder.class);
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
            if (!hasToken()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasScheduledTime()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.token_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeEnum(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.scheduledTime_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.label_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaAlertsSetAlert(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.token_ = bytes;
                            } else if (tag == 16) {
                                int i7 = codedInputStream.readEnum();
                                if (AlexaAlertType.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(2, i7);
                                } else {
                                    this.bitField0_ |= 2;
                                    this.type_ = i7;
                                }
                            } else if (tag == 26) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.scheduledTime_ = bytes2;
                            } else if (tag == 34) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.label_ = bytes3;
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

        public static Builder newBuilder(AlexaAlertsSetAlert alexaAlertsSetAlert) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaAlertsSetAlert);
        }

        public static AlexaAlertsSetAlert parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaAlertsSetAlert) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaAlertsSetAlert parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaAlertsSetAlert parseFrom(CodedInputStream codedInputStream) {
            return (AlexaAlertsSetAlert) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaAlertsSetAlert getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaAlertsSetAlert(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaAlertsSetAlert parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaAlertsSetAlert) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaAlertsSetAlert parseFrom(InputStream inputStream) {
            return (AlexaAlertsSetAlert) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaAlertsSetAlert parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaAlertsSetAlert) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaAlertsSetAlert parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaAlertsSetAlert parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaAlertsSetAlert parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaAlertsSetAlert parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaAlertsSetAlertOrBuilder extends MessageOrBuilder {
        String getLabel();

        ByteString getLabelBytes();

        String getScheduledTime();

        ByteString getScheduledTimeBytes();

        String getToken();

        ByteString getTokenBytes();

        AlexaAlertType getType();

        boolean hasLabel();

        boolean hasScheduledTime();

        boolean hasToken();

        boolean hasType();
    }

    public enum AlexaAuthStatus implements ProtocolMessageEnum {
        ALEXA_AUTH(0),
        ALEXA_NO_AUTH(1);

        public static final int ALEXA_AUTH_VALUE = 0;
        public static final int ALEXA_NO_AUTH_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<AlexaAuthStatus> internalValueMap = new Internal.EnumLiteMap<AlexaAuthStatus>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaAuthStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AlexaAuthStatus findValueByNumber(int i7) {
                return AlexaAuthStatus.forNumber(i7);
            }
        };
        private static final AlexaAuthStatus[] VALUES = values();

        AlexaAuthStatus(int i7) {
            this.value = i7;
        }

        public static AlexaAuthStatus forNumber(int i7) {
            if (i7 == 0) {
                return ALEXA_AUTH;
            }
            if (i7 != 1) {
                return null;
            }
            return ALEXA_NO_AUTH;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return AlexaProtos.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<AlexaAuthStatus> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static AlexaAuthStatus valueOf(int i7) {
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

        public static AlexaAuthStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class AlexaConfig extends GeneratedMessageV3 implements AlexaConfigOrBuilder {
        public static final int CLIENT_ID_FIELD_NUMBER = 1;
        public static final int LANGUAGE_FIELD_NUMBER = 3;
        public static final int REFRESH_TOKEN_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object clientId_;
        private volatile Object language_;
        private byte memoizedIsInitialized;
        private volatile Object refreshToken_;
        private static final AlexaConfig DEFAULT_INSTANCE = new AlexaConfig();

        @Deprecated
        public static final Parser<AlexaConfig> PARSER = new AbstractParser<AlexaConfig>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaConfig.1
            @Override // com.google.protobuf.Parser
            public AlexaConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaConfig(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaConfigOrBuilder {
            private int bitField0_;
            private Object clientId_;
            private Object language_;
            private Object refreshToken_;

            private Builder() {
                this.clientId_ = "";
                this.refreshToken_ = "";
                this.language_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaConfig_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearClientId() {
                this.bitField0_ &= -2;
                this.clientId_ = AlexaConfig.getDefaultInstance().getClientId();
                onChanged();
                return this;
            }

            public Builder clearLanguage() {
                this.bitField0_ &= -5;
                this.language_ = AlexaConfig.getDefaultInstance().getLanguage();
                onChanged();
                return this;
            }

            public Builder clearRefreshToken() {
                this.bitField0_ &= -3;
                this.refreshToken_ = AlexaConfig.getDefaultInstance().getRefreshToken();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
            public String getClientId() {
                Object obj = this.clientId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.clientId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
            public ByteString getClientIdBytes() {
                Object obj = this.clientId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.clientId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaConfig_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
            public String getLanguage() {
                Object obj = this.language_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.language_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
            public ByteString getLanguageBytes() {
                Object obj = this.language_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.language_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
            public String getRefreshToken() {
                Object obj = this.refreshToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.refreshToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
            public ByteString getRefreshTokenBytes() {
                Object obj = this.refreshToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.refreshToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
            public boolean hasClientId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
            public boolean hasLanguage() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
            public boolean hasRefreshToken() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasClientId() && hasRefreshToken();
            }

            public Builder setClientId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.clientId_ = str;
                onChanged();
                return this;
            }

            public Builder setClientIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.clientId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLanguage(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.language_ = str;
                onChanged();
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.language_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRefreshToken(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.refreshToken_ = str;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.refreshToken_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.clientId_ = "";
                this.refreshToken_ = "";
                this.language_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaConfig build() {
                AlexaConfig alexaConfigBuildPartial = buildPartial();
                if (alexaConfigBuildPartial.isInitialized()) {
                    return alexaConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaConfig buildPartial() {
                AlexaConfig alexaConfig = new AlexaConfig(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                alexaConfig.clientId_ = this.clientId_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                alexaConfig.refreshToken_ = this.refreshToken_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                alexaConfig.language_ = this.language_;
                alexaConfig.bitField0_ = i8;
                onBuilt();
                return alexaConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaConfig getDefaultInstanceForType() {
                return AlexaConfig.getDefaultInstance();
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
                this.clientId_ = "";
                int i7 = this.bitField0_;
                this.refreshToken_ = "";
                this.language_ = "";
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaConfig.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaConfig> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaConfig.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaConfig r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaConfig) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaConfig r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaConfig) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaConfig.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaConfig$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaConfig) {
                    return mergeFrom((AlexaConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaConfig alexaConfig) {
                if (alexaConfig == AlexaConfig.getDefaultInstance()) {
                    return this;
                }
                if (alexaConfig.hasClientId()) {
                    this.bitField0_ |= 1;
                    this.clientId_ = alexaConfig.clientId_;
                    onChanged();
                }
                if (alexaConfig.hasRefreshToken()) {
                    this.bitField0_ |= 2;
                    this.refreshToken_ = alexaConfig.refreshToken_;
                    onChanged();
                }
                if (alexaConfig.hasLanguage()) {
                    this.bitField0_ |= 4;
                    this.language_ = alexaConfig.language_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) alexaConfig).unknownFields);
                onChanged();
                return this;
            }
        }

        private AlexaConfig() {
            this.memoizedIsInitialized = (byte) -1;
            this.clientId_ = "";
            this.refreshToken_ = "";
            this.language_ = "";
        }

        public static AlexaConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaConfig_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaConfig parseDelimitedFrom(InputStream inputStream) {
            return (AlexaConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaConfig)) {
                return super.equals(obj);
            }
            AlexaConfig alexaConfig = (AlexaConfig) obj;
            boolean z6 = hasClientId() == alexaConfig.hasClientId();
            if (hasClientId()) {
                z6 = z6 && getClientId().equals(alexaConfig.getClientId());
            }
            boolean z7 = z6 && hasRefreshToken() == alexaConfig.hasRefreshToken();
            if (hasRefreshToken()) {
                z7 = z7 && getRefreshToken().equals(alexaConfig.getRefreshToken());
            }
            boolean z8 = z7 && hasLanguage() == alexaConfig.hasLanguage();
            if (hasLanguage()) {
                z8 = z8 && getLanguage().equals(alexaConfig.getLanguage());
            }
            return z8 && this.unknownFields.equals(alexaConfig.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
        public String getClientId() {
            Object obj = this.clientId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.clientId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
        public ByteString getClientIdBytes() {
            Object obj = this.clientId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.clientId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
        public String getLanguage() {
            Object obj = this.language_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.language_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
        public ByteString getLanguageBytes() {
            Object obj = this.language_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.language_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
        public String getRefreshToken() {
            Object obj = this.refreshToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.refreshToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
        public ByteString getRefreshTokenBytes() {
            Object obj = this.refreshToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.refreshToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.clientId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.refreshToken_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.language_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
        public boolean hasClientId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
        public boolean hasLanguage() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaConfigOrBuilder
        public boolean hasRefreshToken() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasClientId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getClientId().hashCode();
            }
            if (hasRefreshToken()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getRefreshToken().hashCode();
            }
            if (hasLanguage()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getLanguage().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaConfig.class, Builder.class);
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
            if (!hasClientId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRefreshToken()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.clientId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.refreshToken_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.language_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.clientId_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.refreshToken_ = bytes2;
                            } else if (tag == 26) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.language_ = bytes3;
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

        public static Builder newBuilder(AlexaConfig alexaConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaConfig);
        }

        public static AlexaConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaConfig) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaConfig parseFrom(CodedInputStream codedInputStream) {
            return (AlexaConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaConfig) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaConfig parseFrom(InputStream inputStream) {
            return (AlexaConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaConfig) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaConfig parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaConfigOrBuilder extends MessageOrBuilder {
        String getClientId();

        ByteString getClientIdBytes();

        String getLanguage();

        ByteString getLanguageBytes();

        String getRefreshToken();

        ByteString getRefreshTokenBytes();

        boolean hasClientId();

        boolean hasLanguage();

        boolean hasRefreshToken();
    }

    public static final class AlexaInstruction extends GeneratedMessageV3 implements AlexaInstructionOrBuilder {
        public static final int ALERTS_DELETEALERTS_FIELD_NUMBER = 12;
        public static final int ALERTS_SETALERT_FIELD_NUMBER = 5;
        public static final int AUTH_STATUS_FIELD_NUMBER = 7;
        public static final int NOTIFICATIONS_SETINDICATOR_FIELD_NUMBER = 13;
        public static final int RESULT_TYPE_FIELD_NUMBER = 1;
        public static final int SPEECHSYNTHESIZER_SPEAK_FIELD_NUMBER = 6;
        public static final int TEMPLATE_GENERAL_FIELD_NUMBER = 2;
        public static final int TEMPLATE_LISTS_FIELD_NUMBER = 4;
        public static final int TEMPLATE_WEATHER_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private AlexaAlertsDeleteAlert.List alertsDeletealerts_;
        private AlexaAlertsSetAlert alertsSetalert_;
        private int authStatus_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private AlexaNotificationsSetIndicator notificationsSetindicator_;
        private int resultType_;
        private AlexaSpeechSynthesizerSpeak speechsynthesizerSpeak_;
        private AlexaTemplateGeneral templateGeneral_;
        private AlexaTemplateLists templateLists_;
        private AlexaTemplateWeather templateWeather_;
        private static final AlexaInstruction DEFAULT_INSTANCE = new AlexaInstruction();

        @Deprecated
        public static final Parser<AlexaInstruction> PARSER = new AbstractParser<AlexaInstruction>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.1
            @Override // com.google.protobuf.Parser
            public AlexaInstruction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaInstruction(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaInstructionOrBuilder {
            private SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> alertsDeletealertsBuilder_;
            private AlexaAlertsDeleteAlert.List alertsDeletealerts_;
            private SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> alertsSetalertBuilder_;
            private AlexaAlertsSetAlert alertsSetalert_;
            private int authStatus_;
            private int bitField0_;
            private SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> notificationsSetindicatorBuilder_;
            private AlexaNotificationsSetIndicator notificationsSetindicator_;
            private int resultType_;
            private SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> speechsynthesizerSpeakBuilder_;
            private AlexaSpeechSynthesizerSpeak speechsynthesizerSpeak_;
            private SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> templateGeneralBuilder_;
            private AlexaTemplateGeneral templateGeneral_;
            private SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> templateListsBuilder_;
            private AlexaTemplateLists templateLists_;
            private SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> templateWeatherBuilder_;
            private AlexaTemplateWeather templateWeather_;

            private Builder() {
                this.resultType_ = 0;
                this.templateGeneral_ = null;
                this.templateWeather_ = null;
                this.templateLists_ = null;
                this.alertsSetalert_ = null;
                this.speechsynthesizerSpeak_ = null;
                this.authStatus_ = 0;
                this.alertsDeletealerts_ = null;
                this.notificationsSetindicator_ = null;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> getAlertsDeletealertsFieldBuilder() {
                if (this.alertsDeletealertsBuilder_ == null) {
                    this.alertsDeletealertsBuilder_ = new SingleFieldBuilderV3<>(getAlertsDeletealerts(), getParentForChildren(), isClean());
                    this.alertsDeletealerts_ = null;
                }
                return this.alertsDeletealertsBuilder_;
            }

            private SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> getAlertsSetalertFieldBuilder() {
                if (this.alertsSetalertBuilder_ == null) {
                    this.alertsSetalertBuilder_ = new SingleFieldBuilderV3<>(getAlertsSetalert(), getParentForChildren(), isClean());
                    this.alertsSetalert_ = null;
                }
                return this.alertsSetalertBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaInstruction_descriptor;
            }

            private SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> getNotificationsSetindicatorFieldBuilder() {
                if (this.notificationsSetindicatorBuilder_ == null) {
                    this.notificationsSetindicatorBuilder_ = new SingleFieldBuilderV3<>(getNotificationsSetindicator(), getParentForChildren(), isClean());
                    this.notificationsSetindicator_ = null;
                }
                return this.notificationsSetindicatorBuilder_;
            }

            private SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> getSpeechsynthesizerSpeakFieldBuilder() {
                if (this.speechsynthesizerSpeakBuilder_ == null) {
                    this.speechsynthesizerSpeakBuilder_ = new SingleFieldBuilderV3<>(getSpeechsynthesizerSpeak(), getParentForChildren(), isClean());
                    this.speechsynthesizerSpeak_ = null;
                }
                return this.speechsynthesizerSpeakBuilder_;
            }

            private SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> getTemplateGeneralFieldBuilder() {
                if (this.templateGeneralBuilder_ == null) {
                    this.templateGeneralBuilder_ = new SingleFieldBuilderV3<>(getTemplateGeneral(), getParentForChildren(), isClean());
                    this.templateGeneral_ = null;
                }
                return this.templateGeneralBuilder_;
            }

            private SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> getTemplateListsFieldBuilder() {
                if (this.templateListsBuilder_ == null) {
                    this.templateListsBuilder_ = new SingleFieldBuilderV3<>(getTemplateLists(), getParentForChildren(), isClean());
                    this.templateLists_ = null;
                }
                return this.templateListsBuilder_;
            }

            private SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> getTemplateWeatherFieldBuilder() {
                if (this.templateWeatherBuilder_ == null) {
                    this.templateWeatherBuilder_ = new SingleFieldBuilderV3<>(getTemplateWeather(), getParentForChildren(), isClean());
                    this.templateWeather_ = null;
                }
                return this.templateWeatherBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getTemplateGeneralFieldBuilder();
                    getTemplateWeatherFieldBuilder();
                    getTemplateListsFieldBuilder();
                    getAlertsSetalertFieldBuilder();
                    getSpeechsynthesizerSpeakFieldBuilder();
                    getAlertsDeletealertsFieldBuilder();
                    getNotificationsSetindicatorFieldBuilder();
                }
            }

            public Builder clearAlertsDeletealerts() {
                SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> singleFieldBuilderV3 = this.alertsDeletealertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.alertsDeletealerts_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                return this;
            }

            public Builder clearAlertsSetalert() {
                SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> singleFieldBuilderV3 = this.alertsSetalertBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.alertsSetalert_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -17;
                return this;
            }

            public Builder clearAuthStatus() {
                this.bitField0_ &= -65;
                this.authStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNotificationsSetindicator() {
                SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> singleFieldBuilderV3 = this.notificationsSetindicatorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.notificationsSetindicator_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -257;
                return this;
            }

            public Builder clearResultType() {
                this.bitField0_ &= -2;
                this.resultType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSpeechsynthesizerSpeak() {
                SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> singleFieldBuilderV3 = this.speechsynthesizerSpeakBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.speechsynthesizerSpeak_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -33;
                return this;
            }

            public Builder clearTemplateGeneral() {
                SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> singleFieldBuilderV3 = this.templateGeneralBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.templateGeneral_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearTemplateLists() {
                SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> singleFieldBuilderV3 = this.templateListsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.templateLists_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public Builder clearTemplateWeather() {
                SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> singleFieldBuilderV3 = this.templateWeatherBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.templateWeather_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaAlertsDeleteAlert.List getAlertsDeletealerts() {
                SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> singleFieldBuilderV3 = this.alertsDeletealertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaAlertsDeleteAlert.List) singleFieldBuilderV3.getMessage();
                }
                AlexaAlertsDeleteAlert.List list = this.alertsDeletealerts_;
                return list == null ? AlexaAlertsDeleteAlert.List.getDefaultInstance() : list;
            }

            public AlexaAlertsDeleteAlert.List.Builder getAlertsDeletealertsBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (AlexaAlertsDeleteAlert.List.Builder) getAlertsDeletealertsFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaAlertsDeleteAlert.ListOrBuilder getAlertsDeletealertsOrBuilder() {
                SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> singleFieldBuilderV3 = this.alertsDeletealertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaAlertsDeleteAlert.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaAlertsDeleteAlert.List list = this.alertsDeletealerts_;
                return list == null ? AlexaAlertsDeleteAlert.List.getDefaultInstance() : list;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaAlertsSetAlert getAlertsSetalert() {
                SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> singleFieldBuilderV3 = this.alertsSetalertBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaAlertsSetAlert) singleFieldBuilderV3.getMessage();
                }
                AlexaAlertsSetAlert alexaAlertsSetAlert = this.alertsSetalert_;
                return alexaAlertsSetAlert == null ? AlexaAlertsSetAlert.getDefaultInstance() : alexaAlertsSetAlert;
            }

            public AlexaAlertsSetAlert.Builder getAlertsSetalertBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (AlexaAlertsSetAlert.Builder) getAlertsSetalertFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaAlertsSetAlertOrBuilder getAlertsSetalertOrBuilder() {
                SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> singleFieldBuilderV3 = this.alertsSetalertBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaAlertsSetAlertOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaAlertsSetAlert alexaAlertsSetAlert = this.alertsSetalert_;
                return alexaAlertsSetAlert == null ? AlexaAlertsSetAlert.getDefaultInstance() : alexaAlertsSetAlert;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaAuthStatus getAuthStatus() {
                AlexaAuthStatus alexaAuthStatusValueOf = AlexaAuthStatus.valueOf(this.authStatus_);
                return alexaAuthStatusValueOf == null ? AlexaAuthStatus.ALEXA_AUTH : alexaAuthStatusValueOf;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaInstruction_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaNotificationsSetIndicator getNotificationsSetindicator() {
                SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> singleFieldBuilderV3 = this.notificationsSetindicatorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaNotificationsSetIndicator) singleFieldBuilderV3.getMessage();
                }
                AlexaNotificationsSetIndicator alexaNotificationsSetIndicator = this.notificationsSetindicator_;
                return alexaNotificationsSetIndicator == null ? AlexaNotificationsSetIndicator.getDefaultInstance() : alexaNotificationsSetIndicator;
            }

            public AlexaNotificationsSetIndicator.Builder getNotificationsSetindicatorBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (AlexaNotificationsSetIndicator.Builder) getNotificationsSetindicatorFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaNotificationsSetIndicatorOrBuilder getNotificationsSetindicatorOrBuilder() {
                SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> singleFieldBuilderV3 = this.notificationsSetindicatorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaNotificationsSetIndicatorOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaNotificationsSetIndicator alexaNotificationsSetIndicator = this.notificationsSetindicator_;
                return alexaNotificationsSetIndicator == null ? AlexaNotificationsSetIndicator.getDefaultInstance() : alexaNotificationsSetIndicator;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaResultType getResultType() {
                AlexaResultType alexaResultTypeValueOf = AlexaResultType.valueOf(this.resultType_);
                return alexaResultTypeValueOf == null ? AlexaResultType.ALEXA_START_LISTENING : alexaResultTypeValueOf;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaSpeechSynthesizerSpeak getSpeechsynthesizerSpeak() {
                SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> singleFieldBuilderV3 = this.speechsynthesizerSpeakBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaSpeechSynthesizerSpeak) singleFieldBuilderV3.getMessage();
                }
                AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak = this.speechsynthesizerSpeak_;
                return alexaSpeechSynthesizerSpeak == null ? AlexaSpeechSynthesizerSpeak.getDefaultInstance() : alexaSpeechSynthesizerSpeak;
            }

            public AlexaSpeechSynthesizerSpeak.Builder getSpeechsynthesizerSpeakBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (AlexaSpeechSynthesizerSpeak.Builder) getSpeechsynthesizerSpeakFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaSpeechSynthesizerSpeakOrBuilder getSpeechsynthesizerSpeakOrBuilder() {
                SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> singleFieldBuilderV3 = this.speechsynthesizerSpeakBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaSpeechSynthesizerSpeakOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak = this.speechsynthesizerSpeak_;
                return alexaSpeechSynthesizerSpeak == null ? AlexaSpeechSynthesizerSpeak.getDefaultInstance() : alexaSpeechSynthesizerSpeak;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaTemplateGeneral getTemplateGeneral() {
                SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> singleFieldBuilderV3 = this.templateGeneralBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTemplateGeneral) singleFieldBuilderV3.getMessage();
                }
                AlexaTemplateGeneral alexaTemplateGeneral = this.templateGeneral_;
                return alexaTemplateGeneral == null ? AlexaTemplateGeneral.getDefaultInstance() : alexaTemplateGeneral;
            }

            public AlexaTemplateGeneral.Builder getTemplateGeneralBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (AlexaTemplateGeneral.Builder) getTemplateGeneralFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaTemplateGeneralOrBuilder getTemplateGeneralOrBuilder() {
                SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> singleFieldBuilderV3 = this.templateGeneralBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTemplateGeneralOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaTemplateGeneral alexaTemplateGeneral = this.templateGeneral_;
                return alexaTemplateGeneral == null ? AlexaTemplateGeneral.getDefaultInstance() : alexaTemplateGeneral;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaTemplateLists getTemplateLists() {
                SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> singleFieldBuilderV3 = this.templateListsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTemplateLists) singleFieldBuilderV3.getMessage();
                }
                AlexaTemplateLists alexaTemplateLists = this.templateLists_;
                return alexaTemplateLists == null ? AlexaTemplateLists.getDefaultInstance() : alexaTemplateLists;
            }

            public AlexaTemplateLists.Builder getTemplateListsBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (AlexaTemplateLists.Builder) getTemplateListsFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaTemplateListsOrBuilder getTemplateListsOrBuilder() {
                SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> singleFieldBuilderV3 = this.templateListsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTemplateListsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaTemplateLists alexaTemplateLists = this.templateLists_;
                return alexaTemplateLists == null ? AlexaTemplateLists.getDefaultInstance() : alexaTemplateLists;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaTemplateWeather getTemplateWeather() {
                SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> singleFieldBuilderV3 = this.templateWeatherBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTemplateWeather) singleFieldBuilderV3.getMessage();
                }
                AlexaTemplateWeather alexaTemplateWeather = this.templateWeather_;
                return alexaTemplateWeather == null ? AlexaTemplateWeather.getDefaultInstance() : alexaTemplateWeather;
            }

            public AlexaTemplateWeather.Builder getTemplateWeatherBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (AlexaTemplateWeather.Builder) getTemplateWeatherFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public AlexaTemplateWeatherOrBuilder getTemplateWeatherOrBuilder() {
                SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> singleFieldBuilderV3 = this.templateWeatherBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTemplateWeatherOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaTemplateWeather alexaTemplateWeather = this.templateWeather_;
                return alexaTemplateWeather == null ? AlexaTemplateWeather.getDefaultInstance() : alexaTemplateWeather;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public boolean hasAlertsDeletealerts() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public boolean hasAlertsSetalert() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public boolean hasAuthStatus() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public boolean hasNotificationsSetindicator() {
                return (this.bitField0_ & 256) == 256;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public boolean hasResultType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public boolean hasSpeechsynthesizerSpeak() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public boolean hasTemplateGeneral() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public boolean hasTemplateLists() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
            public boolean hasTemplateWeather() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaInstruction_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaInstruction.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasResultType()) {
                    return false;
                }
                if (hasTemplateGeneral() && !getTemplateGeneral().isInitialized()) {
                    return false;
                }
                if (hasTemplateWeather() && !getTemplateWeather().isInitialized()) {
                    return false;
                }
                if (hasTemplateLists() && !getTemplateLists().isInitialized()) {
                    return false;
                }
                if (hasAlertsSetalert() && !getAlertsSetalert().isInitialized()) {
                    return false;
                }
                if (hasSpeechsynthesizerSpeak() && !getSpeechsynthesizerSpeak().isInitialized()) {
                    return false;
                }
                if (!hasAlertsDeletealerts() || getAlertsDeletealerts().isInitialized()) {
                    return !hasNotificationsSetindicator() || getNotificationsSetindicator().isInitialized();
                }
                return false;
            }

            public Builder mergeAlertsDeletealerts(AlexaAlertsDeleteAlert.List list) {
                AlexaAlertsDeleteAlert.List list2;
                SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> singleFieldBuilderV3 = this.alertsDeletealertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 128) == 128 && (list2 = this.alertsDeletealerts_) != null && list2 != AlexaAlertsDeleteAlert.List.getDefaultInstance()) {
                        list = AlexaAlertsDeleteAlert.List.newBuilder(this.alertsDeletealerts_).mergeFrom(list).buildPartial();
                    }
                    this.alertsDeletealerts_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(list);
                }
                this.bitField0_ |= 128;
                return this;
            }

            public Builder mergeAlertsSetalert(AlexaAlertsSetAlert alexaAlertsSetAlert) {
                AlexaAlertsSetAlert alexaAlertsSetAlert2;
                SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> singleFieldBuilderV3 = this.alertsSetalertBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 16) == 16 && (alexaAlertsSetAlert2 = this.alertsSetalert_) != null && alexaAlertsSetAlert2 != AlexaAlertsSetAlert.getDefaultInstance()) {
                        alexaAlertsSetAlert = AlexaAlertsSetAlert.newBuilder(this.alertsSetalert_).mergeFrom(alexaAlertsSetAlert).buildPartial();
                    }
                    this.alertsSetalert_ = alexaAlertsSetAlert;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(alexaAlertsSetAlert);
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder mergeNotificationsSetindicator(AlexaNotificationsSetIndicator alexaNotificationsSetIndicator) {
                AlexaNotificationsSetIndicator alexaNotificationsSetIndicator2;
                SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> singleFieldBuilderV3 = this.notificationsSetindicatorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 256) == 256 && (alexaNotificationsSetIndicator2 = this.notificationsSetindicator_) != null && alexaNotificationsSetIndicator2 != AlexaNotificationsSetIndicator.getDefaultInstance()) {
                        alexaNotificationsSetIndicator = AlexaNotificationsSetIndicator.newBuilder(this.notificationsSetindicator_).mergeFrom(alexaNotificationsSetIndicator).buildPartial();
                    }
                    this.notificationsSetindicator_ = alexaNotificationsSetIndicator;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(alexaNotificationsSetIndicator);
                }
                this.bitField0_ |= 256;
                return this;
            }

            public Builder mergeSpeechsynthesizerSpeak(AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak) {
                AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak2;
                SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> singleFieldBuilderV3 = this.speechsynthesizerSpeakBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 32) == 32 && (alexaSpeechSynthesizerSpeak2 = this.speechsynthesizerSpeak_) != null && alexaSpeechSynthesizerSpeak2 != AlexaSpeechSynthesizerSpeak.getDefaultInstance()) {
                        alexaSpeechSynthesizerSpeak = AlexaSpeechSynthesizerSpeak.newBuilder(this.speechsynthesizerSpeak_).mergeFrom(alexaSpeechSynthesizerSpeak).buildPartial();
                    }
                    this.speechsynthesizerSpeak_ = alexaSpeechSynthesizerSpeak;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(alexaSpeechSynthesizerSpeak);
                }
                this.bitField0_ |= 32;
                return this;
            }

            public Builder mergeTemplateGeneral(AlexaTemplateGeneral alexaTemplateGeneral) {
                AlexaTemplateGeneral alexaTemplateGeneral2;
                SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> singleFieldBuilderV3 = this.templateGeneralBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) == 2 && (alexaTemplateGeneral2 = this.templateGeneral_) != null && alexaTemplateGeneral2 != AlexaTemplateGeneral.getDefaultInstance()) {
                        alexaTemplateGeneral = AlexaTemplateGeneral.newBuilder(this.templateGeneral_).mergeFrom(alexaTemplateGeneral).buildPartial();
                    }
                    this.templateGeneral_ = alexaTemplateGeneral;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(alexaTemplateGeneral);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeTemplateLists(AlexaTemplateLists alexaTemplateLists) {
                AlexaTemplateLists alexaTemplateLists2;
                SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> singleFieldBuilderV3 = this.templateListsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) == 8 && (alexaTemplateLists2 = this.templateLists_) != null && alexaTemplateLists2 != AlexaTemplateLists.getDefaultInstance()) {
                        alexaTemplateLists = AlexaTemplateLists.newBuilder(this.templateLists_).mergeFrom(alexaTemplateLists).buildPartial();
                    }
                    this.templateLists_ = alexaTemplateLists;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(alexaTemplateLists);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeTemplateWeather(AlexaTemplateWeather alexaTemplateWeather) {
                AlexaTemplateWeather alexaTemplateWeather2;
                SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> singleFieldBuilderV3 = this.templateWeatherBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) == 4 && (alexaTemplateWeather2 = this.templateWeather_) != null && alexaTemplateWeather2 != AlexaTemplateWeather.getDefaultInstance()) {
                        alexaTemplateWeather = AlexaTemplateWeather.newBuilder(this.templateWeather_).mergeFrom(alexaTemplateWeather).buildPartial();
                    }
                    this.templateWeather_ = alexaTemplateWeather;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(alexaTemplateWeather);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder setAlertsDeletealerts(AlexaAlertsDeleteAlert.List.Builder builder) {
                SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> singleFieldBuilderV3 = this.alertsDeletealertsBuilder_;
                AlexaAlertsDeleteAlert.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.alertsDeletealerts_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.bitField0_ |= 128;
                return this;
            }

            public Builder setAlertsSetalert(AlexaAlertsSetAlert.Builder builder) {
                SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> singleFieldBuilderV3 = this.alertsSetalertBuilder_;
                AlexaAlertsSetAlert alexaAlertsSetAlertBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.alertsSetalert_ = alexaAlertsSetAlertBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaAlertsSetAlertBuild);
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder setAuthStatus(AlexaAuthStatus alexaAuthStatus) {
                alexaAuthStatus.getClass();
                this.bitField0_ |= 64;
                this.authStatus_ = alexaAuthStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setNotificationsSetindicator(AlexaNotificationsSetIndicator.Builder builder) {
                SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> singleFieldBuilderV3 = this.notificationsSetindicatorBuilder_;
                AlexaNotificationsSetIndicator alexaNotificationsSetIndicatorBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.notificationsSetindicator_ = alexaNotificationsSetIndicatorBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaNotificationsSetIndicatorBuild);
                }
                this.bitField0_ |= 256;
                return this;
            }

            public Builder setResultType(AlexaResultType alexaResultType) {
                alexaResultType.getClass();
                this.bitField0_ |= 1;
                this.resultType_ = alexaResultType.getNumber();
                onChanged();
                return this;
            }

            public Builder setSpeechsynthesizerSpeak(AlexaSpeechSynthesizerSpeak.Builder builder) {
                SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> singleFieldBuilderV3 = this.speechsynthesizerSpeakBuilder_;
                AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeakBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.speechsynthesizerSpeak_ = alexaSpeechSynthesizerSpeakBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaSpeechSynthesizerSpeakBuild);
                }
                this.bitField0_ |= 32;
                return this;
            }

            public Builder setTemplateGeneral(AlexaTemplateGeneral.Builder builder) {
                SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> singleFieldBuilderV3 = this.templateGeneralBuilder_;
                AlexaTemplateGeneral alexaTemplateGeneralBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.templateGeneral_ = alexaTemplateGeneralBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTemplateGeneralBuild);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setTemplateLists(AlexaTemplateLists.Builder builder) {
                SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> singleFieldBuilderV3 = this.templateListsBuilder_;
                AlexaTemplateLists alexaTemplateListsBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.templateLists_ = alexaTemplateListsBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTemplateListsBuild);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setTemplateWeather(AlexaTemplateWeather.Builder builder) {
                SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> singleFieldBuilderV3 = this.templateWeatherBuilder_;
                AlexaTemplateWeather alexaTemplateWeatherBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.templateWeather_ = alexaTemplateWeatherBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTemplateWeatherBuild);
                }
                this.bitField0_ |= 4;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.resultType_ = 0;
                this.templateGeneral_ = null;
                this.templateWeather_ = null;
                this.templateLists_ = null;
                this.alertsSetalert_ = null;
                this.speechsynthesizerSpeak_ = null;
                this.authStatus_ = 0;
                this.alertsDeletealerts_ = null;
                this.notificationsSetindicator_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setAlertsDeletealerts(AlexaAlertsDeleteAlert.List list) {
                SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> singleFieldBuilderV3 = this.alertsDeletealertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.alertsDeletealerts_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.bitField0_ |= 128;
                return this;
            }

            public Builder setAlertsSetalert(AlexaAlertsSetAlert alexaAlertsSetAlert) {
                SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> singleFieldBuilderV3 = this.alertsSetalertBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaAlertsSetAlert.getClass();
                    this.alertsSetalert_ = alexaAlertsSetAlert;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaAlertsSetAlert);
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder setNotificationsSetindicator(AlexaNotificationsSetIndicator alexaNotificationsSetIndicator) {
                SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> singleFieldBuilderV3 = this.notificationsSetindicatorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaNotificationsSetIndicator.getClass();
                    this.notificationsSetindicator_ = alexaNotificationsSetIndicator;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaNotificationsSetIndicator);
                }
                this.bitField0_ |= 256;
                return this;
            }

            public Builder setSpeechsynthesizerSpeak(AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak) {
                SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> singleFieldBuilderV3 = this.speechsynthesizerSpeakBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaSpeechSynthesizerSpeak.getClass();
                    this.speechsynthesizerSpeak_ = alexaSpeechSynthesizerSpeak;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaSpeechSynthesizerSpeak);
                }
                this.bitField0_ |= 32;
                return this;
            }

            public Builder setTemplateGeneral(AlexaTemplateGeneral alexaTemplateGeneral) {
                SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> singleFieldBuilderV3 = this.templateGeneralBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaTemplateGeneral.getClass();
                    this.templateGeneral_ = alexaTemplateGeneral;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTemplateGeneral);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setTemplateLists(AlexaTemplateLists alexaTemplateLists) {
                SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> singleFieldBuilderV3 = this.templateListsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaTemplateLists.getClass();
                    this.templateLists_ = alexaTemplateLists;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTemplateLists);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setTemplateWeather(AlexaTemplateWeather alexaTemplateWeather) {
                SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> singleFieldBuilderV3 = this.templateWeatherBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaTemplateWeather.getClass();
                    this.templateWeather_ = alexaTemplateWeather;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTemplateWeather);
                }
                this.bitField0_ |= 4;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaInstruction build() {
                AlexaInstruction alexaInstructionBuildPartial = buildPartial();
                if (alexaInstructionBuildPartial.isInitialized()) {
                    return alexaInstructionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaInstructionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaInstruction buildPartial() {
                AlexaInstruction alexaInstruction = new AlexaInstruction(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                alexaInstruction.resultType_ = this.resultType_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> singleFieldBuilderV3 = this.templateGeneralBuilder_;
                alexaInstruction.templateGeneral_ = singleFieldBuilderV3 == null ? this.templateGeneral_ : (AlexaTemplateGeneral) singleFieldBuilderV3.build();
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> singleFieldBuilderV32 = this.templateWeatherBuilder_;
                alexaInstruction.templateWeather_ = singleFieldBuilderV32 == null ? this.templateWeather_ : (AlexaTemplateWeather) singleFieldBuilderV32.build();
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> singleFieldBuilderV33 = this.templateListsBuilder_;
                alexaInstruction.templateLists_ = singleFieldBuilderV33 == null ? this.templateLists_ : (AlexaTemplateLists) singleFieldBuilderV33.build();
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> singleFieldBuilderV34 = this.alertsSetalertBuilder_;
                alexaInstruction.alertsSetalert_ = singleFieldBuilderV34 == null ? this.alertsSetalert_ : (AlexaAlertsSetAlert) singleFieldBuilderV34.build();
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> singleFieldBuilderV35 = this.speechsynthesizerSpeakBuilder_;
                alexaInstruction.speechsynthesizerSpeak_ = singleFieldBuilderV35 == null ? this.speechsynthesizerSpeak_ : (AlexaSpeechSynthesizerSpeak) singleFieldBuilderV35.build();
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                alexaInstruction.authStatus_ = this.authStatus_;
                if ((i7 & 128) == 128) {
                    i8 |= 128;
                }
                SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> singleFieldBuilderV36 = this.alertsDeletealertsBuilder_;
                alexaInstruction.alertsDeletealerts_ = singleFieldBuilderV36 == null ? this.alertsDeletealerts_ : (AlexaAlertsDeleteAlert.List) singleFieldBuilderV36.build();
                if ((i7 & 256) == 256) {
                    i8 |= 256;
                }
                SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> singleFieldBuilderV37 = this.notificationsSetindicatorBuilder_;
                alexaInstruction.notificationsSetindicator_ = singleFieldBuilderV37 == null ? this.notificationsSetindicator_ : (AlexaNotificationsSetIndicator) singleFieldBuilderV37.build();
                alexaInstruction.bitField0_ = i8;
                onBuilt();
                return alexaInstruction;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaInstruction getDefaultInstanceForType() {
                return AlexaInstruction.getDefaultInstance();
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
                this.resultType_ = 0;
                this.bitField0_ &= -2;
                SingleFieldBuilderV3<AlexaTemplateGeneral, AlexaTemplateGeneral.Builder, AlexaTemplateGeneralOrBuilder> singleFieldBuilderV3 = this.templateGeneralBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.templateGeneral_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                SingleFieldBuilderV3<AlexaTemplateWeather, AlexaTemplateWeather.Builder, AlexaTemplateWeatherOrBuilder> singleFieldBuilderV32 = this.templateWeatherBuilder_;
                if (singleFieldBuilderV32 == null) {
                    this.templateWeather_ = null;
                } else {
                    singleFieldBuilderV32.clear();
                }
                this.bitField0_ &= -5;
                SingleFieldBuilderV3<AlexaTemplateLists, AlexaTemplateLists.Builder, AlexaTemplateListsOrBuilder> singleFieldBuilderV33 = this.templateListsBuilder_;
                if (singleFieldBuilderV33 == null) {
                    this.templateLists_ = null;
                } else {
                    singleFieldBuilderV33.clear();
                }
                this.bitField0_ &= -9;
                SingleFieldBuilderV3<AlexaAlertsSetAlert, AlexaAlertsSetAlert.Builder, AlexaAlertsSetAlertOrBuilder> singleFieldBuilderV34 = this.alertsSetalertBuilder_;
                if (singleFieldBuilderV34 == null) {
                    this.alertsSetalert_ = null;
                } else {
                    singleFieldBuilderV34.clear();
                }
                this.bitField0_ &= -17;
                SingleFieldBuilderV3<AlexaSpeechSynthesizerSpeak, AlexaSpeechSynthesizerSpeak.Builder, AlexaSpeechSynthesizerSpeakOrBuilder> singleFieldBuilderV35 = this.speechsynthesizerSpeakBuilder_;
                if (singleFieldBuilderV35 == null) {
                    this.speechsynthesizerSpeak_ = null;
                } else {
                    singleFieldBuilderV35.clear();
                }
                int i7 = this.bitField0_;
                this.authStatus_ = 0;
                this.bitField0_ = i7 & (-97);
                SingleFieldBuilderV3<AlexaAlertsDeleteAlert.List, AlexaAlertsDeleteAlert.List.Builder, AlexaAlertsDeleteAlert.ListOrBuilder> singleFieldBuilderV36 = this.alertsDeletealertsBuilder_;
                if (singleFieldBuilderV36 == null) {
                    this.alertsDeletealerts_ = null;
                } else {
                    singleFieldBuilderV36.clear();
                }
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                SingleFieldBuilderV3<AlexaNotificationsSetIndicator, AlexaNotificationsSetIndicator.Builder, AlexaNotificationsSetIndicatorOrBuilder> singleFieldBuilderV37 = this.notificationsSetindicatorBuilder_;
                if (singleFieldBuilderV37 == null) {
                    this.notificationsSetindicator_ = null;
                } else {
                    singleFieldBuilderV37.clear();
                }
                this.bitField0_ &= -257;
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaInstruction> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaInstruction r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaInstruction) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaInstruction r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaInstruction) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaInstruction$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaInstruction) {
                    return mergeFrom((AlexaInstruction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaInstruction alexaInstruction) {
                if (alexaInstruction == AlexaInstruction.getDefaultInstance()) {
                    return this;
                }
                if (alexaInstruction.hasResultType()) {
                    setResultType(alexaInstruction.getResultType());
                }
                if (alexaInstruction.hasTemplateGeneral()) {
                    mergeTemplateGeneral(alexaInstruction.getTemplateGeneral());
                }
                if (alexaInstruction.hasTemplateWeather()) {
                    mergeTemplateWeather(alexaInstruction.getTemplateWeather());
                }
                if (alexaInstruction.hasTemplateLists()) {
                    mergeTemplateLists(alexaInstruction.getTemplateLists());
                }
                if (alexaInstruction.hasAlertsSetalert()) {
                    mergeAlertsSetalert(alexaInstruction.getAlertsSetalert());
                }
                if (alexaInstruction.hasSpeechsynthesizerSpeak()) {
                    mergeSpeechsynthesizerSpeak(alexaInstruction.getSpeechsynthesizerSpeak());
                }
                if (alexaInstruction.hasAuthStatus()) {
                    setAuthStatus(alexaInstruction.getAuthStatus());
                }
                if (alexaInstruction.hasAlertsDeletealerts()) {
                    mergeAlertsDeletealerts(alexaInstruction.getAlertsDeletealerts());
                }
                if (alexaInstruction.hasNotificationsSetindicator()) {
                    mergeNotificationsSetindicator(alexaInstruction.getNotificationsSetindicator());
                }
                mergeUnknownFields(((GeneratedMessage) alexaInstruction).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<AlexaInstruction> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> listBuilder_;
                private java.util.List<AlexaInstruction> list_;

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
                    return AlexaProtos.internal_static_AlexaInstruction_List_descriptor;
                }

                private RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends AlexaInstruction> iterable) {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(AlexaInstruction.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return AlexaProtos.internal_static_AlexaInstruction_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
                public AlexaInstruction getList(int i7) {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AlexaInstruction) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
                public java.util.List<AlexaInstruction> getListList() {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
                public AlexaInstructionOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AlexaInstructionOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
                public java.util.List<? extends AlexaInstructionOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AlexaProtos.internal_static_AlexaInstruction_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, AlexaInstruction alexaInstruction) {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, alexaInstruction);
                        return this;
                    }
                    alexaInstruction.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, alexaInstruction);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, AlexaInstruction.getDefaultInstance());
                }

                public Builder setList(int i7, AlexaInstruction alexaInstruction) {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, alexaInstruction);
                        return this;
                    }
                    alexaInstruction.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, alexaInstruction);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(AlexaInstruction alexaInstruction) {
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(alexaInstruction);
                        return this;
                    }
                    alexaInstruction.getClass();
                    ensureListIsMutable();
                    this.list_.add(alexaInstruction);
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
                    RepeatedFieldBuilderV3<AlexaInstruction, Builder, AlexaInstructionOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaInstruction$List> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.AlexaProtos$AlexaInstruction$List r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.AlexaProtos$AlexaInstruction$List r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaInstruction$List$Builder");
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
                return AlexaProtos.internal_static_AlexaInstruction_List_descriptor;
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

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
            public AlexaInstruction getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
            public java.util.List<AlexaInstruction> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
            public AlexaInstructionOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstruction.ListOrBuilder
            public java.util.List<? extends AlexaInstructionOrBuilder> getListOrBuilderList() {
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
                return AlexaProtos.internal_static_AlexaInstruction_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((AlexaInstruction) codedInputStream.readMessage(AlexaInstruction.PARSER, extensionRegistryLite));
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
            AlexaInstruction getList(int i7);

            int getListCount();

            java.util.List<AlexaInstruction> getListList();

            AlexaInstructionOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends AlexaInstructionOrBuilder> getListOrBuilderList();
        }

        private AlexaInstruction() {
            this.memoizedIsInitialized = (byte) -1;
            this.resultType_ = 0;
            this.authStatus_ = 0;
        }

        public static AlexaInstruction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaInstruction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaInstruction parseDelimitedFrom(InputStream inputStream) {
            return (AlexaInstruction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaInstruction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaInstruction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaInstruction)) {
                return super.equals(obj);
            }
            AlexaInstruction alexaInstruction = (AlexaInstruction) obj;
            boolean z6 = hasResultType() == alexaInstruction.hasResultType();
            if (hasResultType()) {
                z6 = z6 && this.resultType_ == alexaInstruction.resultType_;
            }
            boolean z7 = z6 && hasTemplateGeneral() == alexaInstruction.hasTemplateGeneral();
            if (hasTemplateGeneral()) {
                z7 = z7 && getTemplateGeneral().equals(alexaInstruction.getTemplateGeneral());
            }
            boolean z8 = z7 && hasTemplateWeather() == alexaInstruction.hasTemplateWeather();
            if (hasTemplateWeather()) {
                z8 = z8 && getTemplateWeather().equals(alexaInstruction.getTemplateWeather());
            }
            boolean z9 = z8 && hasTemplateLists() == alexaInstruction.hasTemplateLists();
            if (hasTemplateLists()) {
                z9 = z9 && getTemplateLists().equals(alexaInstruction.getTemplateLists());
            }
            boolean z10 = z9 && hasAlertsSetalert() == alexaInstruction.hasAlertsSetalert();
            if (hasAlertsSetalert()) {
                z10 = z10 && getAlertsSetalert().equals(alexaInstruction.getAlertsSetalert());
            }
            boolean z11 = z10 && hasSpeechsynthesizerSpeak() == alexaInstruction.hasSpeechsynthesizerSpeak();
            if (hasSpeechsynthesizerSpeak()) {
                z11 = z11 && getSpeechsynthesizerSpeak().equals(alexaInstruction.getSpeechsynthesizerSpeak());
            }
            boolean z12 = z11 && hasAuthStatus() == alexaInstruction.hasAuthStatus();
            if (hasAuthStatus()) {
                z12 = z12 && this.authStatus_ == alexaInstruction.authStatus_;
            }
            boolean z13 = z12 && hasAlertsDeletealerts() == alexaInstruction.hasAlertsDeletealerts();
            if (hasAlertsDeletealerts()) {
                z13 = z13 && getAlertsDeletealerts().equals(alexaInstruction.getAlertsDeletealerts());
            }
            boolean z14 = z13 && hasNotificationsSetindicator() == alexaInstruction.hasNotificationsSetindicator();
            if (hasNotificationsSetindicator()) {
                z14 = z14 && getNotificationsSetindicator().equals(alexaInstruction.getNotificationsSetindicator());
            }
            return z14 && this.unknownFields.equals(alexaInstruction.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaAlertsDeleteAlert.List getAlertsDeletealerts() {
            AlexaAlertsDeleteAlert.List list = this.alertsDeletealerts_;
            return list == null ? AlexaAlertsDeleteAlert.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaAlertsDeleteAlert.ListOrBuilder getAlertsDeletealertsOrBuilder() {
            AlexaAlertsDeleteAlert.List list = this.alertsDeletealerts_;
            return list == null ? AlexaAlertsDeleteAlert.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaAlertsSetAlert getAlertsSetalert() {
            AlexaAlertsSetAlert alexaAlertsSetAlert = this.alertsSetalert_;
            return alexaAlertsSetAlert == null ? AlexaAlertsSetAlert.getDefaultInstance() : alexaAlertsSetAlert;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaAlertsSetAlertOrBuilder getAlertsSetalertOrBuilder() {
            AlexaAlertsSetAlert alexaAlertsSetAlert = this.alertsSetalert_;
            return alexaAlertsSetAlert == null ? AlexaAlertsSetAlert.getDefaultInstance() : alexaAlertsSetAlert;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaAuthStatus getAuthStatus() {
            AlexaAuthStatus alexaAuthStatusValueOf = AlexaAuthStatus.valueOf(this.authStatus_);
            return alexaAuthStatusValueOf == null ? AlexaAuthStatus.ALEXA_AUTH : alexaAuthStatusValueOf;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaNotificationsSetIndicator getNotificationsSetindicator() {
            AlexaNotificationsSetIndicator alexaNotificationsSetIndicator = this.notificationsSetindicator_;
            return alexaNotificationsSetIndicator == null ? AlexaNotificationsSetIndicator.getDefaultInstance() : alexaNotificationsSetIndicator;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaNotificationsSetIndicatorOrBuilder getNotificationsSetindicatorOrBuilder() {
            AlexaNotificationsSetIndicator alexaNotificationsSetIndicator = this.notificationsSetindicator_;
            return alexaNotificationsSetIndicator == null ? AlexaNotificationsSetIndicator.getDefaultInstance() : alexaNotificationsSetIndicator;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaInstruction> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaResultType getResultType() {
            AlexaResultType alexaResultTypeValueOf = AlexaResultType.valueOf(this.resultType_);
            return alexaResultTypeValueOf == null ? AlexaResultType.ALEXA_START_LISTENING : alexaResultTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.resultType_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getTemplateGeneral());
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getTemplateWeather());
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, getTemplateLists());
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, getAlertsSetalert());
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(6, getSpeechsynthesizerSpeak());
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(7, this.authStatus_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(12, getAlertsDeletealerts());
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(13, getNotificationsSetindicator());
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaSpeechSynthesizerSpeak getSpeechsynthesizerSpeak() {
            AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak = this.speechsynthesizerSpeak_;
            return alexaSpeechSynthesizerSpeak == null ? AlexaSpeechSynthesizerSpeak.getDefaultInstance() : alexaSpeechSynthesizerSpeak;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaSpeechSynthesizerSpeakOrBuilder getSpeechsynthesizerSpeakOrBuilder() {
            AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak = this.speechsynthesizerSpeak_;
            return alexaSpeechSynthesizerSpeak == null ? AlexaSpeechSynthesizerSpeak.getDefaultInstance() : alexaSpeechSynthesizerSpeak;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaTemplateGeneral getTemplateGeneral() {
            AlexaTemplateGeneral alexaTemplateGeneral = this.templateGeneral_;
            return alexaTemplateGeneral == null ? AlexaTemplateGeneral.getDefaultInstance() : alexaTemplateGeneral;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaTemplateGeneralOrBuilder getTemplateGeneralOrBuilder() {
            AlexaTemplateGeneral alexaTemplateGeneral = this.templateGeneral_;
            return alexaTemplateGeneral == null ? AlexaTemplateGeneral.getDefaultInstance() : alexaTemplateGeneral;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaTemplateLists getTemplateLists() {
            AlexaTemplateLists alexaTemplateLists = this.templateLists_;
            return alexaTemplateLists == null ? AlexaTemplateLists.getDefaultInstance() : alexaTemplateLists;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaTemplateListsOrBuilder getTemplateListsOrBuilder() {
            AlexaTemplateLists alexaTemplateLists = this.templateLists_;
            return alexaTemplateLists == null ? AlexaTemplateLists.getDefaultInstance() : alexaTemplateLists;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaTemplateWeather getTemplateWeather() {
            AlexaTemplateWeather alexaTemplateWeather = this.templateWeather_;
            return alexaTemplateWeather == null ? AlexaTemplateWeather.getDefaultInstance() : alexaTemplateWeather;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public AlexaTemplateWeatherOrBuilder getTemplateWeatherOrBuilder() {
            AlexaTemplateWeather alexaTemplateWeather = this.templateWeather_;
            return alexaTemplateWeather == null ? AlexaTemplateWeather.getDefaultInstance() : alexaTemplateWeather;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public boolean hasAlertsDeletealerts() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public boolean hasAlertsSetalert() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public boolean hasAuthStatus() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public boolean hasNotificationsSetindicator() {
            return (this.bitField0_ & 256) == 256;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public boolean hasResultType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public boolean hasSpeechsynthesizerSpeak() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public boolean hasTemplateGeneral() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public boolean hasTemplateLists() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaInstructionOrBuilder
        public boolean hasTemplateWeather() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasResultType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.resultType_;
            }
            if (hasTemplateGeneral()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTemplateGeneral().hashCode();
            }
            if (hasTemplateWeather()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTemplateWeather().hashCode();
            }
            if (hasTemplateLists()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getTemplateLists().hashCode();
            }
            if (hasAlertsSetalert()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getAlertsSetalert().hashCode();
            }
            if (hasSpeechsynthesizerSpeak()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getSpeechsynthesizerSpeak().hashCode();
            }
            if (hasAuthStatus()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + this.authStatus_;
            }
            if (hasAlertsDeletealerts()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + getAlertsDeletealerts().hashCode();
            }
            if (hasNotificationsSetindicator()) {
                iHashCode = (((iHashCode * 37) + 13) * 53) + getNotificationsSetindicator().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaInstruction_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaInstruction.class, Builder.class);
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
            if (!hasResultType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTemplateGeneral() && !getTemplateGeneral().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTemplateWeather() && !getTemplateWeather().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTemplateLists() && !getTemplateLists().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAlertsSetalert() && !getAlertsSetalert().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSpeechsynthesizerSpeak() && !getSpeechsynthesizerSpeak().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAlertsDeletealerts() && !getAlertsDeletealerts().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasNotificationsSetindicator() || getNotificationsSetindicator().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.resultType_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, getTemplateGeneral());
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, getTemplateWeather());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, getTemplateLists());
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(5, getAlertsSetalert());
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(6, getSpeechsynthesizerSpeak());
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeEnum(7, this.authStatus_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(12, getAlertsDeletealerts());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeMessage(13, getNotificationsSetindicator());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaInstruction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            int i7;
            int i8;
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
                                        AlexaTemplateGeneral.Builder builder = (this.bitField0_ & 2) == 2 ? this.templateGeneral_.toBuilder() : null;
                                        AlexaTemplateGeneral alexaTemplateGeneral = (AlexaTemplateGeneral) codedInputStream.readMessage(AlexaTemplateGeneral.PARSER, extensionRegistryLite);
                                        this.templateGeneral_ = alexaTemplateGeneral;
                                        if (builder != null) {
                                            builder.mergeFrom(alexaTemplateGeneral);
                                            this.templateGeneral_ = builder.buildPartial();
                                        }
                                    } else if (tag == 26) {
                                        i7 = 4;
                                        AlexaTemplateWeather.Builder builder2 = (this.bitField0_ & 4) == 4 ? this.templateWeather_.toBuilder() : null;
                                        AlexaTemplateWeather alexaTemplateWeather = (AlexaTemplateWeather) codedInputStream.readMessage(AlexaTemplateWeather.PARSER, extensionRegistryLite);
                                        this.templateWeather_ = alexaTemplateWeather;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(alexaTemplateWeather);
                                            this.templateWeather_ = builder2.buildPartial();
                                        }
                                    } else if (tag == 34) {
                                        AlexaTemplateLists.Builder builder3 = (this.bitField0_ & 8) == 8 ? this.templateLists_.toBuilder() : null;
                                        AlexaTemplateLists alexaTemplateLists = (AlexaTemplateLists) codedInputStream.readMessage(AlexaTemplateLists.PARSER, extensionRegistryLite);
                                        this.templateLists_ = alexaTemplateLists;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(alexaTemplateLists);
                                            this.templateLists_ = builder3.buildPartial();
                                        }
                                        i8 = this.bitField0_ | 8;
                                        this.bitField0_ = i8;
                                    } else if (tag == 42) {
                                        i7 = 16;
                                        AlexaAlertsSetAlert.Builder builder4 = (this.bitField0_ & 16) == 16 ? this.alertsSetalert_.toBuilder() : null;
                                        AlexaAlertsSetAlert alexaAlertsSetAlert = (AlexaAlertsSetAlert) codedInputStream.readMessage(AlexaAlertsSetAlert.PARSER, extensionRegistryLite);
                                        this.alertsSetalert_ = alexaAlertsSetAlert;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(alexaAlertsSetAlert);
                                            this.alertsSetalert_ = builder4.buildPartial();
                                        }
                                    } else if (tag == 50) {
                                        i7 = 32;
                                        AlexaSpeechSynthesizerSpeak.Builder builder5 = (this.bitField0_ & 32) == 32 ? this.speechsynthesizerSpeak_.toBuilder() : null;
                                        AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak = (AlexaSpeechSynthesizerSpeak) codedInputStream.readMessage(AlexaSpeechSynthesizerSpeak.PARSER, extensionRegistryLite);
                                        this.speechsynthesizerSpeak_ = alexaSpeechSynthesizerSpeak;
                                        if (builder5 != null) {
                                            builder5.mergeFrom(alexaSpeechSynthesizerSpeak);
                                            this.speechsynthesizerSpeak_ = builder5.buildPartial();
                                        }
                                    } else if (tag == 56) {
                                        int i9 = codedInputStream.readEnum();
                                        if (AlexaAuthStatus.valueOf(i9) == null) {
                                            builderNewBuilder.mergeVarintField(7, i9);
                                        } else {
                                            this.bitField0_ |= 64;
                                            this.authStatus_ = i9;
                                        }
                                    } else if (tag == 98) {
                                        i7 = 128;
                                        AlexaAlertsDeleteAlert.List.Builder builder6 = (this.bitField0_ & 128) == 128 ? this.alertsDeletealerts_.toBuilder() : null;
                                        AlexaAlertsDeleteAlert.List list = (AlexaAlertsDeleteAlert.List) codedInputStream.readMessage(AlexaAlertsDeleteAlert.List.PARSER, extensionRegistryLite);
                                        this.alertsDeletealerts_ = list;
                                        if (builder6 != null) {
                                            builder6.mergeFrom(list);
                                            this.alertsDeletealerts_ = builder6.buildPartial();
                                        }
                                    } else if (tag == 106) {
                                        i7 = 256;
                                        AlexaNotificationsSetIndicator.Builder builder7 = (this.bitField0_ & 256) == 256 ? this.notificationsSetindicator_.toBuilder() : null;
                                        AlexaNotificationsSetIndicator alexaNotificationsSetIndicator = (AlexaNotificationsSetIndicator) codedInputStream.readMessage(AlexaNotificationsSetIndicator.PARSER, extensionRegistryLite);
                                        this.notificationsSetindicator_ = alexaNotificationsSetIndicator;
                                        if (builder7 != null) {
                                            builder7.mergeFrom(alexaNotificationsSetIndicator);
                                            this.notificationsSetindicator_ = builder7.buildPartial();
                                        }
                                    } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                    i8 = this.bitField0_ | i7;
                                    this.bitField0_ = i8;
                                } else {
                                    int i10 = codedInputStream.readEnum();
                                    if (AlexaResultType.valueOf(i10) == null) {
                                        builderNewBuilder.mergeVarintField(1, i10);
                                    } else {
                                        this.bitField0_ = 1 | this.bitField0_;
                                        this.resultType_ = i10;
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

        public static Builder newBuilder(AlexaInstruction alexaInstruction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaInstruction);
        }

        public static AlexaInstruction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaInstruction) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaInstruction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaInstruction parseFrom(CodedInputStream codedInputStream) {
            return (AlexaInstruction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaInstruction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaInstruction(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaInstruction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaInstruction) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaInstruction parseFrom(InputStream inputStream) {
            return (AlexaInstruction) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaInstruction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaInstruction) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaInstruction parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaInstruction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaInstruction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaInstruction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaInstructionOrBuilder extends MessageOrBuilder {
        AlexaAlertsDeleteAlert.List getAlertsDeletealerts();

        AlexaAlertsDeleteAlert.ListOrBuilder getAlertsDeletealertsOrBuilder();

        AlexaAlertsSetAlert getAlertsSetalert();

        AlexaAlertsSetAlertOrBuilder getAlertsSetalertOrBuilder();

        AlexaAuthStatus getAuthStatus();

        AlexaNotificationsSetIndicator getNotificationsSetindicator();

        AlexaNotificationsSetIndicatorOrBuilder getNotificationsSetindicatorOrBuilder();

        AlexaResultType getResultType();

        AlexaSpeechSynthesizerSpeak getSpeechsynthesizerSpeak();

        AlexaSpeechSynthesizerSpeakOrBuilder getSpeechsynthesizerSpeakOrBuilder();

        AlexaTemplateGeneral getTemplateGeneral();

        AlexaTemplateGeneralOrBuilder getTemplateGeneralOrBuilder();

        AlexaTemplateLists getTemplateLists();

        AlexaTemplateListsOrBuilder getTemplateListsOrBuilder();

        AlexaTemplateWeather getTemplateWeather();

        AlexaTemplateWeatherOrBuilder getTemplateWeatherOrBuilder();

        boolean hasAlertsDeletealerts();

        boolean hasAlertsSetalert();

        boolean hasAuthStatus();

        boolean hasNotificationsSetindicator();

        boolean hasResultType();

        boolean hasSpeechsynthesizerSpeak();

        boolean hasTemplateGeneral();

        boolean hasTemplateLists();

        boolean hasTemplateWeather();
    }

    public static final class AlexaListsItem extends GeneratedMessageV3 implements AlexaListsItemOrBuilder {
        public static final int LEFT_FIELD_NUMBER = 1;
        public static final int RIGHT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object left_;
        private byte memoizedIsInitialized;
        private volatile Object right_;
        private static final AlexaListsItem DEFAULT_INSTANCE = new AlexaListsItem();

        @Deprecated
        public static final Parser<AlexaListsItem> PARSER = new AbstractParser<AlexaListsItem>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.1
            @Override // com.google.protobuf.Parser
            public AlexaListsItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaListsItem(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaListsItemOrBuilder {
            private int bitField0_;
            private Object left_;
            private Object right_;

            private Builder() {
                this.left_ = "";
                this.right_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaListsItem_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearLeft() {
                this.bitField0_ &= -2;
                this.left_ = AlexaListsItem.getDefaultInstance().getLeft();
                onChanged();
                return this;
            }

            public Builder clearRight() {
                this.bitField0_ &= -3;
                this.right_ = AlexaListsItem.getDefaultInstance().getRight();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaListsItem_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
            public String getLeft() {
                Object obj = this.left_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.left_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
            public ByteString getLeftBytes() {
                Object obj = this.left_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.left_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
            public String getRight() {
                Object obj = this.right_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.right_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
            public ByteString getRightBytes() {
                Object obj = this.right_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.right_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
            public boolean hasLeft() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
            public boolean hasRight() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaListsItem_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaListsItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLeft() && hasRight();
            }

            public Builder setLeft(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.left_ = str;
                onChanged();
                return this;
            }

            public Builder setLeftBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.left_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRight(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.right_ = str;
                onChanged();
                return this;
            }

            public Builder setRightBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.right_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.left_ = "";
                this.right_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaListsItem build() {
                AlexaListsItem alexaListsItemBuildPartial = buildPartial();
                if (alexaListsItemBuildPartial.isInitialized()) {
                    return alexaListsItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaListsItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaListsItem buildPartial() {
                AlexaListsItem alexaListsItem = new AlexaListsItem(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                alexaListsItem.left_ = this.left_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                alexaListsItem.right_ = this.right_;
                alexaListsItem.bitField0_ = i8;
                onBuilt();
                return alexaListsItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaListsItem getDefaultInstanceForType() {
                return AlexaListsItem.getDefaultInstance();
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
                this.left_ = "";
                int i7 = this.bitField0_;
                this.right_ = "";
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaListsItem> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaListsItem r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaListsItem) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaListsItem r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaListsItem) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaListsItem$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaListsItem) {
                    return mergeFrom((AlexaListsItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaListsItem alexaListsItem) {
                if (alexaListsItem == AlexaListsItem.getDefaultInstance()) {
                    return this;
                }
                if (alexaListsItem.hasLeft()) {
                    this.bitField0_ |= 1;
                    this.left_ = alexaListsItem.left_;
                    onChanged();
                }
                if (alexaListsItem.hasRight()) {
                    this.bitField0_ |= 2;
                    this.right_ = alexaListsItem.right_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) alexaListsItem).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<AlexaListsItem> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> listBuilder_;
                private java.util.List<AlexaListsItem> list_;

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
                    return AlexaProtos.internal_static_AlexaListsItem_List_descriptor;
                }

                private RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends AlexaListsItem> iterable) {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(AlexaListsItem.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return AlexaProtos.internal_static_AlexaListsItem_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
                public AlexaListsItem getList(int i7) {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AlexaListsItem) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
                public java.util.List<AlexaListsItem> getListList() {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
                public AlexaListsItemOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AlexaListsItemOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
                public java.util.List<? extends AlexaListsItemOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AlexaProtos.internal_static_AlexaListsItem_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, AlexaListsItem alexaListsItem) {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, alexaListsItem);
                        return this;
                    }
                    alexaListsItem.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, alexaListsItem);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, AlexaListsItem.getDefaultInstance());
                }

                public Builder setList(int i7, AlexaListsItem alexaListsItem) {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, alexaListsItem);
                        return this;
                    }
                    alexaListsItem.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, alexaListsItem);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(AlexaListsItem alexaListsItem) {
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(alexaListsItem);
                        return this;
                    }
                    alexaListsItem.getClass();
                    ensureListIsMutable();
                    this.list_.add(alexaListsItem);
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
                    RepeatedFieldBuilderV3<AlexaListsItem, Builder, AlexaListsItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaListsItem$List> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.AlexaProtos$AlexaListsItem$List r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.AlexaProtos$AlexaListsItem$List r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaListsItem$List$Builder");
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
                return AlexaProtos.internal_static_AlexaListsItem_List_descriptor;
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

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
            public AlexaListsItem getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
            public java.util.List<AlexaListsItem> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
            public AlexaListsItemOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItem.ListOrBuilder
            public java.util.List<? extends AlexaListsItemOrBuilder> getListOrBuilderList() {
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
                return AlexaProtos.internal_static_AlexaListsItem_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((AlexaListsItem) codedInputStream.readMessage(AlexaListsItem.PARSER, extensionRegistryLite));
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
            AlexaListsItem getList(int i7);

            int getListCount();

            java.util.List<AlexaListsItem> getListList();

            AlexaListsItemOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends AlexaListsItemOrBuilder> getListOrBuilderList();
        }

        private AlexaListsItem() {
            this.memoizedIsInitialized = (byte) -1;
            this.left_ = "";
            this.right_ = "";
        }

        public static AlexaListsItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaListsItem_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaListsItem parseDelimitedFrom(InputStream inputStream) {
            return (AlexaListsItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaListsItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaListsItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaListsItem)) {
                return super.equals(obj);
            }
            AlexaListsItem alexaListsItem = (AlexaListsItem) obj;
            boolean z6 = hasLeft() == alexaListsItem.hasLeft();
            if (hasLeft()) {
                z6 = z6 && getLeft().equals(alexaListsItem.getLeft());
            }
            boolean z7 = z6 && hasRight() == alexaListsItem.hasRight();
            if (hasRight()) {
                z7 = z7 && getRight().equals(alexaListsItem.getRight());
            }
            return z7 && this.unknownFields.equals(alexaListsItem.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
        public String getLeft() {
            Object obj = this.left_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.left_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
        public ByteString getLeftBytes() {
            Object obj = this.left_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.left_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaListsItem> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
        public String getRight() {
            Object obj = this.right_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.right_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
        public ByteString getRightBytes() {
            Object obj = this.right_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.right_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.left_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.right_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
        public boolean hasLeft() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaListsItemOrBuilder
        public boolean hasRight() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasLeft()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getLeft().hashCode();
            }
            if (hasRight()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getRight().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaListsItem_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaListsItem.class, Builder.class);
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
            if (!hasLeft()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRight()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.left_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.right_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaListsItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.left_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.right_ = bytes2;
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

        public static Builder newBuilder(AlexaListsItem alexaListsItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaListsItem);
        }

        public static AlexaListsItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaListsItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaListsItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaListsItem parseFrom(CodedInputStream codedInputStream) {
            return (AlexaListsItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaListsItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaListsItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaListsItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaListsItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaListsItem parseFrom(InputStream inputStream) {
            return (AlexaListsItem) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaListsItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaListsItem) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaListsItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaListsItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaListsItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaListsItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaListsItemOrBuilder extends MessageOrBuilder {
        String getLeft();

        ByteString getLeftBytes();

        String getRight();

        ByteString getRightBytes();

        boolean hasLeft();

        boolean hasRight();
    }

    public static final class AlexaNotificationsSetIndicator extends GeneratedMessageV3 implements AlexaNotificationsSetIndicatorOrBuilder {
        private static final AlexaNotificationsSetIndicator DEFAULT_INSTANCE = new AlexaNotificationsSetIndicator();

        @Deprecated
        public static final Parser<AlexaNotificationsSetIndicator> PARSER = new AbstractParser<AlexaNotificationsSetIndicator>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicator.1
            @Override // com.google.protobuf.Parser
            public AlexaNotificationsSetIndicator parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaNotificationsSetIndicator(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PERSISTVISUALINDICATOR_FIELD_NUMBER = 2;
        public static final int PLAYAUDIOINDICATOR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean persistVisualIndicator_;
        private boolean playAudioIndicator_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaNotificationsSetIndicatorOrBuilder {
            private int bitField0_;
            private boolean persistVisualIndicator_;
            private boolean playAudioIndicator_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaNotificationsSetIndicator_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearPersistVisualIndicator() {
                this.bitField0_ &= -3;
                this.persistVisualIndicator_ = false;
                onChanged();
                return this;
            }

            public Builder clearPlayAudioIndicator() {
                this.bitField0_ &= -2;
                this.playAudioIndicator_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaNotificationsSetIndicator_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicatorOrBuilder
            public boolean getPersistVisualIndicator() {
                return this.persistVisualIndicator_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicatorOrBuilder
            public boolean getPlayAudioIndicator() {
                return this.playAudioIndicator_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicatorOrBuilder
            public boolean hasPersistVisualIndicator() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicatorOrBuilder
            public boolean hasPlayAudioIndicator() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaNotificationsSetIndicator_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaNotificationsSetIndicator.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPlayAudioIndicator() && hasPersistVisualIndicator();
            }

            public Builder setPersistVisualIndicator(boolean z6) {
                this.bitField0_ |= 2;
                this.persistVisualIndicator_ = z6;
                onChanged();
                return this;
            }

            public Builder setPlayAudioIndicator(boolean z6) {
                this.bitField0_ |= 1;
                this.playAudioIndicator_ = z6;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaNotificationsSetIndicator build() {
                AlexaNotificationsSetIndicator alexaNotificationsSetIndicatorBuildPartial = buildPartial();
                if (alexaNotificationsSetIndicatorBuildPartial.isInitialized()) {
                    return alexaNotificationsSetIndicatorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaNotificationsSetIndicatorBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaNotificationsSetIndicator buildPartial() {
                AlexaNotificationsSetIndicator alexaNotificationsSetIndicator = new AlexaNotificationsSetIndicator(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                alexaNotificationsSetIndicator.playAudioIndicator_ = this.playAudioIndicator_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                alexaNotificationsSetIndicator.persistVisualIndicator_ = this.persistVisualIndicator_;
                alexaNotificationsSetIndicator.bitField0_ = i8;
                onBuilt();
                return alexaNotificationsSetIndicator;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaNotificationsSetIndicator getDefaultInstanceForType() {
                return AlexaNotificationsSetIndicator.getDefaultInstance();
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
                this.playAudioIndicator_ = false;
                int i7 = this.bitField0_;
                this.persistVisualIndicator_ = false;
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicator.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaNotificationsSetIndicator> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicator.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaNotificationsSetIndicator r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicator) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaNotificationsSetIndicator r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicator) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicator.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaNotificationsSetIndicator$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaNotificationsSetIndicator) {
                    return mergeFrom((AlexaNotificationsSetIndicator) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaNotificationsSetIndicator alexaNotificationsSetIndicator) {
                if (alexaNotificationsSetIndicator == AlexaNotificationsSetIndicator.getDefaultInstance()) {
                    return this;
                }
                if (alexaNotificationsSetIndicator.hasPlayAudioIndicator()) {
                    setPlayAudioIndicator(alexaNotificationsSetIndicator.getPlayAudioIndicator());
                }
                if (alexaNotificationsSetIndicator.hasPersistVisualIndicator()) {
                    setPersistVisualIndicator(alexaNotificationsSetIndicator.getPersistVisualIndicator());
                }
                mergeUnknownFields(((GeneratedMessage) alexaNotificationsSetIndicator).unknownFields);
                onChanged();
                return this;
            }
        }

        private AlexaNotificationsSetIndicator() {
            this.memoizedIsInitialized = (byte) -1;
            this.playAudioIndicator_ = false;
            this.persistVisualIndicator_ = false;
        }

        public static AlexaNotificationsSetIndicator getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaNotificationsSetIndicator_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaNotificationsSetIndicator parseDelimitedFrom(InputStream inputStream) {
            return (AlexaNotificationsSetIndicator) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaNotificationsSetIndicator parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaNotificationsSetIndicator> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaNotificationsSetIndicator)) {
                return super.equals(obj);
            }
            AlexaNotificationsSetIndicator alexaNotificationsSetIndicator = (AlexaNotificationsSetIndicator) obj;
            boolean z6 = hasPlayAudioIndicator() == alexaNotificationsSetIndicator.hasPlayAudioIndicator();
            if (hasPlayAudioIndicator()) {
                z6 = z6 && getPlayAudioIndicator() == alexaNotificationsSetIndicator.getPlayAudioIndicator();
            }
            boolean z7 = z6 && hasPersistVisualIndicator() == alexaNotificationsSetIndicator.hasPersistVisualIndicator();
            if (hasPersistVisualIndicator()) {
                z7 = z7 && getPersistVisualIndicator() == alexaNotificationsSetIndicator.getPersistVisualIndicator();
            }
            return z7 && this.unknownFields.equals(alexaNotificationsSetIndicator.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaNotificationsSetIndicator> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicatorOrBuilder
        public boolean getPersistVisualIndicator() {
            return this.persistVisualIndicator_;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicatorOrBuilder
        public boolean getPlayAudioIndicator() {
            return this.playAudioIndicator_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBoolSize(1, this.playAudioIndicator_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.persistVisualIndicator_);
            }
            int serializedSize = iComputeBoolSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicatorOrBuilder
        public boolean hasPersistVisualIndicator() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaNotificationsSetIndicatorOrBuilder
        public boolean hasPlayAudioIndicator() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasPlayAudioIndicator()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getPlayAudioIndicator());
            }
            if (hasPersistVisualIndicator()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getPersistVisualIndicator());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaNotificationsSetIndicator_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaNotificationsSetIndicator.class, Builder.class);
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
            if (!hasPlayAudioIndicator()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPersistVisualIndicator()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(1, this.playAudioIndicator_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBool(2, this.persistVisualIndicator_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaNotificationsSetIndicator(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.playAudioIndicator_ = codedInputStream.readBool();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.persistVisualIndicator_ = codedInputStream.readBool();
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

        public static Builder newBuilder(AlexaNotificationsSetIndicator alexaNotificationsSetIndicator) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaNotificationsSetIndicator);
        }

        public static AlexaNotificationsSetIndicator parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaNotificationsSetIndicator) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaNotificationsSetIndicator parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaNotificationsSetIndicator parseFrom(CodedInputStream codedInputStream) {
            return (AlexaNotificationsSetIndicator) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaNotificationsSetIndicator getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaNotificationsSetIndicator(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaNotificationsSetIndicator parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaNotificationsSetIndicator) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaNotificationsSetIndicator parseFrom(InputStream inputStream) {
            return (AlexaNotificationsSetIndicator) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaNotificationsSetIndicator parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaNotificationsSetIndicator) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaNotificationsSetIndicator parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaNotificationsSetIndicator parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaNotificationsSetIndicator parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaNotificationsSetIndicator parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaNotificationsSetIndicatorOrBuilder extends MessageOrBuilder {
        boolean getPersistVisualIndicator();

        boolean getPlayAudioIndicator();

        boolean hasPersistVisualIndicator();

        boolean hasPlayAudioIndicator();
    }

    public interface AlexaOrBuilder extends MessageOrBuilder {
        AlexaConfig getConfig();

        AlexaConfigOrBuilder getConfigOrBuilder();

        AlexaInstruction.List getInstructionList();

        AlexaInstruction.ListOrBuilder getInstructionListOrBuilder();

        Alexa.PayloadCase getPayloadCase();

        AlexaQuietMode getQuietMode();

        AlexaQuietModeOrBuilder getQuietModeOrBuilder();

        boolean hasConfig();

        boolean hasInstructionList();

        boolean hasQuietMode();
    }

    public static final class AlexaQuietMode extends GeneratedMessageV3 implements AlexaQuietModeOrBuilder {
        public static final int ON_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean on_;
        private static final AlexaQuietMode DEFAULT_INSTANCE = new AlexaQuietMode();

        @Deprecated
        public static final Parser<AlexaQuietMode> PARSER = new AbstractParser<AlexaQuietMode>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaQuietMode.1
            @Override // com.google.protobuf.Parser
            public AlexaQuietMode parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaQuietMode(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaQuietModeOrBuilder {
            private int bitField0_;
            private boolean on_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaQuietMode_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearOn() {
                this.bitField0_ &= -2;
                this.on_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaQuietMode_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaQuietModeOrBuilder
            public boolean getOn() {
                return this.on_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaQuietModeOrBuilder
            public boolean hasOn() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaQuietMode_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaQuietMode.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasOn();
            }

            public Builder setOn(boolean z6) {
                this.bitField0_ |= 1;
                this.on_ = z6;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaQuietMode build() {
                AlexaQuietMode alexaQuietModeBuildPartial = buildPartial();
                if (alexaQuietModeBuildPartial.isInitialized()) {
                    return alexaQuietModeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaQuietModeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaQuietMode buildPartial() {
                AlexaQuietMode alexaQuietMode = new AlexaQuietMode(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                alexaQuietMode.on_ = this.on_;
                alexaQuietMode.bitField0_ = i7;
                onBuilt();
                return alexaQuietMode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaQuietMode getDefaultInstanceForType() {
                return AlexaQuietMode.getDefaultInstance();
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
                this.on_ = false;
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaQuietMode.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaQuietMode> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaQuietMode.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaQuietMode r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaQuietMode) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaQuietMode r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaQuietMode) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaQuietMode.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaQuietMode$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaQuietMode) {
                    return mergeFrom((AlexaQuietMode) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaQuietMode alexaQuietMode) {
                if (alexaQuietMode == AlexaQuietMode.getDefaultInstance()) {
                    return this;
                }
                if (alexaQuietMode.hasOn()) {
                    setOn(alexaQuietMode.getOn());
                }
                mergeUnknownFields(((GeneratedMessage) alexaQuietMode).unknownFields);
                onChanged();
                return this;
            }
        }

        private AlexaQuietMode() {
            this.memoizedIsInitialized = (byte) -1;
            this.on_ = false;
        }

        public static AlexaQuietMode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaQuietMode_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaQuietMode parseDelimitedFrom(InputStream inputStream) {
            return (AlexaQuietMode) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaQuietMode parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaQuietMode> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaQuietMode)) {
                return super.equals(obj);
            }
            AlexaQuietMode alexaQuietMode = (AlexaQuietMode) obj;
            boolean z6 = hasOn() == alexaQuietMode.hasOn();
            if (hasOn()) {
                z6 = z6 && getOn() == alexaQuietMode.getOn();
            }
            return z6 && this.unknownFields.equals(alexaQuietMode.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaQuietModeOrBuilder
        public boolean getOn() {
            return this.on_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaQuietMode> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = ((this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBoolSize(1, this.on_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeBoolSize;
            return iComputeBoolSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaQuietModeOrBuilder
        public boolean hasOn() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasOn()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getOn());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaQuietMode_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaQuietMode.class, Builder.class);
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
            if (hasOn()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(1, this.on_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaQuietMode(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.on_ = codedInputStream.readBool();
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

        public static Builder newBuilder(AlexaQuietMode alexaQuietMode) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaQuietMode);
        }

        public static AlexaQuietMode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaQuietMode) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaQuietMode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaQuietMode parseFrom(CodedInputStream codedInputStream) {
            return (AlexaQuietMode) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaQuietMode getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaQuietMode(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaQuietMode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaQuietMode) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaQuietMode parseFrom(InputStream inputStream) {
            return (AlexaQuietMode) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaQuietMode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaQuietMode) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaQuietMode parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaQuietMode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaQuietMode parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaQuietMode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaQuietModeOrBuilder extends MessageOrBuilder {
        boolean getOn();

        boolean hasOn();
    }

    public enum AlexaResultType implements ProtocolMessageEnum {
        ALEXA_START_LISTENING(0),
        ALEXA_END_LISTENING(1),
        ALEXA_AUTH_STATUS(3),
        ALEXA_ERROR_NETWORK(80),
        ALEXA_ERROR_AUTH(81),
        ALEXA_ERROR_CONTENT_TOO_LONG(82),
        ALEXA_ERROR_UNRECOGNIZABLE_SPEECH(83),
        ALEXA_ERROR_UNSUPPORTED_AREA(84),
        ALEXA_ERROR_IOS_DEVICE_NOT_SUPPORT(85),
        ALEXA_ERROR_ANDROID_DEVICE_NOT_SUPPORT(86),
        ALEXA_TEMPLATE_GENERAL(257),
        ALEXA_TEMPLATE_WEATHER(258),
        ALEXA_TEMPLATE_LISTS(259),
        ALEXA_ALERTS_SETALERT(260),
        ALEXA_ALERTS_DELETEALERTS(261),
        ALEXA_SPEECHSYNTHESIZER_SPEAK(262),
        ALEXA_SPEECHRECOGNIZER_EXPECTSPEECH(263),
        ALEXA_NOTIFICATIONS_SETINDICATOR(264),
        ALEXA_NOTIFICATIONS_CLEARINDICATOR(265);

        public static final int ALEXA_ALERTS_DELETEALERTS_VALUE = 261;
        public static final int ALEXA_ALERTS_SETALERT_VALUE = 260;
        public static final int ALEXA_AUTH_STATUS_VALUE = 3;
        public static final int ALEXA_END_LISTENING_VALUE = 1;
        public static final int ALEXA_ERROR_ANDROID_DEVICE_NOT_SUPPORT_VALUE = 86;
        public static final int ALEXA_ERROR_AUTH_VALUE = 81;
        public static final int ALEXA_ERROR_CONTENT_TOO_LONG_VALUE = 82;
        public static final int ALEXA_ERROR_IOS_DEVICE_NOT_SUPPORT_VALUE = 85;
        public static final int ALEXA_ERROR_NETWORK_VALUE = 80;
        public static final int ALEXA_ERROR_UNRECOGNIZABLE_SPEECH_VALUE = 83;
        public static final int ALEXA_ERROR_UNSUPPORTED_AREA_VALUE = 84;
        public static final int ALEXA_NOTIFICATIONS_CLEARINDICATOR_VALUE = 265;
        public static final int ALEXA_NOTIFICATIONS_SETINDICATOR_VALUE = 264;
        public static final int ALEXA_SPEECHRECOGNIZER_EXPECTSPEECH_VALUE = 263;
        public static final int ALEXA_SPEECHSYNTHESIZER_SPEAK_VALUE = 262;
        public static final int ALEXA_START_LISTENING_VALUE = 0;
        public static final int ALEXA_TEMPLATE_GENERAL_VALUE = 257;
        public static final int ALEXA_TEMPLATE_LISTS_VALUE = 259;
        public static final int ALEXA_TEMPLATE_WEATHER_VALUE = 258;
        private final int value;
        private static final Internal.EnumLiteMap<AlexaResultType> internalValueMap = new Internal.EnumLiteMap<AlexaResultType>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaResultType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AlexaResultType findValueByNumber(int i7) {
                return AlexaResultType.forNumber(i7);
            }
        };
        private static final AlexaResultType[] VALUES = values();

        AlexaResultType(int i7) {
            this.value = i7;
        }

        public static AlexaResultType forNumber(int i7) {
            if (i7 == 0) {
                return ALEXA_START_LISTENING;
            }
            if (i7 == 1) {
                return ALEXA_END_LISTENING;
            }
            if (i7 == 3) {
                return ALEXA_AUTH_STATUS;
            }
            switch (i7) {
                case 80:
                    return ALEXA_ERROR_NETWORK;
                case 81:
                    return ALEXA_ERROR_AUTH;
                case 82:
                    return ALEXA_ERROR_CONTENT_TOO_LONG;
                case 83:
                    return ALEXA_ERROR_UNRECOGNIZABLE_SPEECH;
                case 84:
                    return ALEXA_ERROR_UNSUPPORTED_AREA;
                case 85:
                    return ALEXA_ERROR_IOS_DEVICE_NOT_SUPPORT;
                case 86:
                    return ALEXA_ERROR_ANDROID_DEVICE_NOT_SUPPORT;
                default:
                    switch (i7) {
                        case 257:
                            return ALEXA_TEMPLATE_GENERAL;
                        case 258:
                            return ALEXA_TEMPLATE_WEATHER;
                        case 259:
                            return ALEXA_TEMPLATE_LISTS;
                        case 260:
                            return ALEXA_ALERTS_SETALERT;
                        case 261:
                            return ALEXA_ALERTS_DELETEALERTS;
                        case 262:
                            return ALEXA_SPEECHSYNTHESIZER_SPEAK;
                        case 263:
                            return ALEXA_SPEECHRECOGNIZER_EXPECTSPEECH;
                        case 264:
                            return ALEXA_NOTIFICATIONS_SETINDICATOR;
                        case 265:
                            return ALEXA_NOTIFICATIONS_CLEARINDICATOR;
                        default:
                            return null;
                    }
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return AlexaProtos.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<AlexaResultType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static AlexaResultType valueOf(int i7) {
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

        public static AlexaResultType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class AlexaSpeechSynthesizerSpeak extends GeneratedMessageV3 implements AlexaSpeechSynthesizerSpeakOrBuilder {
        private static final AlexaSpeechSynthesizerSpeak DEFAULT_INSTANCE = new AlexaSpeechSynthesizerSpeak();

        @Deprecated
        public static final Parser<AlexaSpeechSynthesizerSpeak> PARSER = new AbstractParser<AlexaSpeechSynthesizerSpeak>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeak.1
            @Override // com.google.protobuf.Parser
            public AlexaSpeechSynthesizerSpeak parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaSpeechSynthesizerSpeak(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TEXT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object text_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaSpeechSynthesizerSpeakOrBuilder {
            private int bitField0_;
            private Object text_;

            private Builder() {
                this.text_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaSpeechSynthesizerSpeak_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearText() {
                this.bitField0_ &= -2;
                this.text_ = AlexaSpeechSynthesizerSpeak.getDefaultInstance().getText();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaSpeechSynthesizerSpeak_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeakOrBuilder
            public String getText() {
                Object obj = this.text_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.text_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeakOrBuilder
            public ByteString getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeakOrBuilder
            public boolean hasText() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaSpeechSynthesizerSpeak_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaSpeechSynthesizerSpeak.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasText();
            }

            public Builder setText(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.text_ = str;
                onChanged();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.text_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.text_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaSpeechSynthesizerSpeak build() {
                AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeakBuildPartial = buildPartial();
                if (alexaSpeechSynthesizerSpeakBuildPartial.isInitialized()) {
                    return alexaSpeechSynthesizerSpeakBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaSpeechSynthesizerSpeakBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaSpeechSynthesizerSpeak buildPartial() {
                AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak = new AlexaSpeechSynthesizerSpeak(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                alexaSpeechSynthesizerSpeak.text_ = this.text_;
                alexaSpeechSynthesizerSpeak.bitField0_ = i7;
                onBuilt();
                return alexaSpeechSynthesizerSpeak;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaSpeechSynthesizerSpeak getDefaultInstanceForType() {
                return AlexaSpeechSynthesizerSpeak.getDefaultInstance();
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
                this.text_ = "";
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeak.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaSpeechSynthesizerSpeak> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeak.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaSpeechSynthesizerSpeak r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeak) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaSpeechSynthesizerSpeak r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeak) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeak.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaSpeechSynthesizerSpeak$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaSpeechSynthesizerSpeak) {
                    return mergeFrom((AlexaSpeechSynthesizerSpeak) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak) {
                if (alexaSpeechSynthesizerSpeak == AlexaSpeechSynthesizerSpeak.getDefaultInstance()) {
                    return this;
                }
                if (alexaSpeechSynthesizerSpeak.hasText()) {
                    this.bitField0_ |= 1;
                    this.text_ = alexaSpeechSynthesizerSpeak.text_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) alexaSpeechSynthesizerSpeak).unknownFields);
                onChanged();
                return this;
            }
        }

        private AlexaSpeechSynthesizerSpeak() {
            this.memoizedIsInitialized = (byte) -1;
            this.text_ = "";
        }

        public static AlexaSpeechSynthesizerSpeak getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaSpeechSynthesizerSpeak_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaSpeechSynthesizerSpeak parseDelimitedFrom(InputStream inputStream) {
            return (AlexaSpeechSynthesizerSpeak) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaSpeechSynthesizerSpeak> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaSpeechSynthesizerSpeak)) {
                return super.equals(obj);
            }
            AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak = (AlexaSpeechSynthesizerSpeak) obj;
            boolean z6 = hasText() == alexaSpeechSynthesizerSpeak.hasText();
            if (hasText()) {
                z6 = z6 && getText().equals(alexaSpeechSynthesizerSpeak.getText());
            }
            return z6 && this.unknownFields.equals(alexaSpeechSynthesizerSpeak.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaSpeechSynthesizerSpeak> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = ((this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.text_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeakOrBuilder
        public String getText() {
            Object obj = this.text_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.text_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeakOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaSpeechSynthesizerSpeakOrBuilder
        public boolean hasText() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasText()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getText().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaSpeechSynthesizerSpeak_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaSpeechSynthesizerSpeak.class, Builder.class);
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
            if (hasText()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.text_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaSpeechSynthesizerSpeak(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.text_ = bytes;
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

        public static Builder newBuilder(AlexaSpeechSynthesizerSpeak alexaSpeechSynthesizerSpeak) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaSpeechSynthesizerSpeak);
        }

        public static AlexaSpeechSynthesizerSpeak parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaSpeechSynthesizerSpeak) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(CodedInputStream codedInputStream) {
            return (AlexaSpeechSynthesizerSpeak) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaSpeechSynthesizerSpeak getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaSpeechSynthesizerSpeak(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaSpeechSynthesizerSpeak) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(InputStream inputStream) {
            return (AlexaSpeechSynthesizerSpeak) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaSpeechSynthesizerSpeak) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaSpeechSynthesizerSpeak parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaSpeechSynthesizerSpeakOrBuilder extends MessageOrBuilder {
        String getText();

        ByteString getTextBytes();

        boolean hasText();
    }

    public static final class AlexaTemplateGeneral extends GeneratedMessageV3 implements AlexaTemplateGeneralOrBuilder {
        private static final AlexaTemplateGeneral DEFAULT_INSTANCE = new AlexaTemplateGeneral();

        @Deprecated
        public static final Parser<AlexaTemplateGeneral> PARSER = new AbstractParser<AlexaTemplateGeneral>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneral.1
            @Override // com.google.protobuf.Parser
            public AlexaTemplateGeneral parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaTemplateGeneral(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TEXT_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object text_;
        private AlexaTitle title_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaTemplateGeneralOrBuilder {
            private int bitField0_;
            private Object text_;
            private SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> titleBuilder_;
            private AlexaTitle title_;

            private Builder() {
                this.title_ = null;
                this.text_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaTemplateGeneral_descriptor;
            }

            private SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> getTitleFieldBuilder() {
                if (this.titleBuilder_ == null) {
                    this.titleBuilder_ = new SingleFieldBuilderV3<>(getTitle(), getParentForChildren(), isClean());
                    this.title_ = null;
                }
                return this.titleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getTitleFieldBuilder();
                }
            }

            public Builder clearText() {
                this.bitField0_ &= -3;
                this.text_ = AlexaTemplateGeneral.getDefaultInstance().getText();
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.title_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaTemplateGeneral_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
            public String getText() {
                Object obj = this.text_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.text_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
            public ByteString getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
            public AlexaTitle getTitle() {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTitle) singleFieldBuilderV3.getMessage();
                }
                AlexaTitle alexaTitle = this.title_;
                return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
            }

            public AlexaTitle.Builder getTitleBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AlexaTitle.Builder) getTitleFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
            public AlexaTitleOrBuilder getTitleOrBuilder() {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTitleOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaTitle alexaTitle = this.title_;
                return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
            public boolean hasText() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaTemplateGeneral_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaTemplateGeneral.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTitle() && hasText() && getTitle().isInitialized();
            }

            public Builder mergeTitle(AlexaTitle alexaTitle) {
                AlexaTitle alexaTitle2;
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) == 1 && (alexaTitle2 = this.title_) != null && alexaTitle2 != AlexaTitle.getDefaultInstance()) {
                        alexaTitle = AlexaTitle.newBuilder(this.title_).mergeFrom(alexaTitle).buildPartial();
                    }
                    this.title_ = alexaTitle;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(alexaTitle);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setText(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.text_ = str;
                onChanged();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.text_ = byteString;
                onChanged();
                return this;
            }

            public Builder setTitle(AlexaTitle.Builder builder) {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                AlexaTitle alexaTitleBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.title_ = alexaTitleBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTitleBuild);
                }
                this.bitField0_ |= 1;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = null;
                this.text_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setTitle(AlexaTitle alexaTitle) {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaTitle.getClass();
                    this.title_ = alexaTitle;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTitle);
                }
                this.bitField0_ |= 1;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaTemplateGeneral build() {
                AlexaTemplateGeneral alexaTemplateGeneralBuildPartial = buildPartial();
                if (alexaTemplateGeneralBuildPartial.isInitialized()) {
                    return alexaTemplateGeneralBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaTemplateGeneralBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaTemplateGeneral buildPartial() {
                AlexaTemplateGeneral alexaTemplateGeneral = new AlexaTemplateGeneral(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                alexaTemplateGeneral.title_ = singleFieldBuilderV3 == null ? this.title_ : (AlexaTitle) singleFieldBuilderV3.build();
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                alexaTemplateGeneral.text_ = this.text_;
                alexaTemplateGeneral.bitField0_ = i8;
                onBuilt();
                return alexaTemplateGeneral;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaTemplateGeneral getDefaultInstanceForType() {
                return AlexaTemplateGeneral.getDefaultInstance();
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
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.title_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                int i7 = this.bitField0_;
                this.text_ = "";
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneral.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaTemplateGeneral> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneral.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaTemplateGeneral r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneral) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaTemplateGeneral r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneral) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneral.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaTemplateGeneral$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaTemplateGeneral) {
                    return mergeFrom((AlexaTemplateGeneral) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaTemplateGeneral alexaTemplateGeneral) {
                if (alexaTemplateGeneral == AlexaTemplateGeneral.getDefaultInstance()) {
                    return this;
                }
                if (alexaTemplateGeneral.hasTitle()) {
                    mergeTitle(alexaTemplateGeneral.getTitle());
                }
                if (alexaTemplateGeneral.hasText()) {
                    this.bitField0_ |= 2;
                    this.text_ = alexaTemplateGeneral.text_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) alexaTemplateGeneral).unknownFields);
                onChanged();
                return this;
            }
        }

        private AlexaTemplateGeneral() {
            this.memoizedIsInitialized = (byte) -1;
            this.text_ = "";
        }

        public static AlexaTemplateGeneral getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaTemplateGeneral_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaTemplateGeneral parseDelimitedFrom(InputStream inputStream) {
            return (AlexaTemplateGeneral) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaTemplateGeneral parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaTemplateGeneral> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaTemplateGeneral)) {
                return super.equals(obj);
            }
            AlexaTemplateGeneral alexaTemplateGeneral = (AlexaTemplateGeneral) obj;
            boolean z6 = hasTitle() == alexaTemplateGeneral.hasTitle();
            if (hasTitle()) {
                z6 = z6 && getTitle().equals(alexaTemplateGeneral.getTitle());
            }
            boolean z7 = z6 && hasText() == alexaTemplateGeneral.hasText();
            if (hasText()) {
                z7 = z7 && getText().equals(alexaTemplateGeneral.getText());
            }
            return z7 && this.unknownFields.equals(alexaTemplateGeneral.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaTemplateGeneral> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, getTitle()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(2, this.text_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
        public String getText() {
            Object obj = this.text_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.text_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
        public AlexaTitle getTitle() {
            AlexaTitle alexaTitle = this.title_;
            return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
        public AlexaTitleOrBuilder getTitleOrBuilder() {
            AlexaTitle alexaTitle = this.title_;
            return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
        public boolean hasText() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateGeneralOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 1) == 1;
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
            if (hasText()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getText().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaTemplateGeneral_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaTemplateGeneral.class, Builder.class);
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
            if (!hasTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasText()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getTitle().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, getTitle());
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.text_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaTemplateGeneral(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                AlexaTitle.Builder builder = (this.bitField0_ & 1) == 1 ? this.title_.toBuilder() : null;
                                AlexaTitle alexaTitle = (AlexaTitle) codedInputStream.readMessage(AlexaTitle.PARSER, extensionRegistryLite);
                                this.title_ = alexaTitle;
                                if (builder != null) {
                                    builder.mergeFrom(alexaTitle);
                                    this.title_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.text_ = bytes;
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

        public static Builder newBuilder(AlexaTemplateGeneral alexaTemplateGeneral) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaTemplateGeneral);
        }

        public static AlexaTemplateGeneral parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTemplateGeneral) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaTemplateGeneral parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaTemplateGeneral parseFrom(CodedInputStream codedInputStream) {
            return (AlexaTemplateGeneral) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaTemplateGeneral getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaTemplateGeneral(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaTemplateGeneral parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTemplateGeneral) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaTemplateGeneral parseFrom(InputStream inputStream) {
            return (AlexaTemplateGeneral) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaTemplateGeneral parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTemplateGeneral) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaTemplateGeneral parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaTemplateGeneral parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaTemplateGeneral parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaTemplateGeneral parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaTemplateGeneralOrBuilder extends MessageOrBuilder {
        String getText();

        ByteString getTextBytes();

        AlexaTitle getTitle();

        AlexaTitleOrBuilder getTitleOrBuilder();

        boolean hasText();

        boolean hasTitle();
    }

    public static final class AlexaTemplateLists extends GeneratedMessageV3 implements AlexaTemplateListsOrBuilder {
        public static final int EXCEED_MAX_ITEMS_FIELD_NUMBER = 3;
        public static final int ITEMS_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean exceedMaxItems_;
        private AlexaListsItem.List items_;
        private byte memoizedIsInitialized;
        private AlexaTitle title_;
        private static final AlexaTemplateLists DEFAULT_INSTANCE = new AlexaTemplateLists();

        @Deprecated
        public static final Parser<AlexaTemplateLists> PARSER = new AbstractParser<AlexaTemplateLists>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaTemplateLists.1
            @Override // com.google.protobuf.Parser
            public AlexaTemplateLists parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaTemplateLists(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaTemplateListsOrBuilder {
            private int bitField0_;
            private boolean exceedMaxItems_;
            private SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> itemsBuilder_;
            private AlexaListsItem.List items_;
            private SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> titleBuilder_;
            private AlexaTitle title_;

            private Builder() {
                this.title_ = null;
                this.items_ = null;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaTemplateLists_descriptor;
            }

            private SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new SingleFieldBuilderV3<>(getItems(), getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            private SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> getTitleFieldBuilder() {
                if (this.titleBuilder_ == null) {
                    this.titleBuilder_ = new SingleFieldBuilderV3<>(getTitle(), getParentForChildren(), isClean());
                    this.title_ = null;
                }
                return this.titleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getTitleFieldBuilder();
                    getItemsFieldBuilder();
                }
            }

            public Builder clearExceedMaxItems() {
                this.bitField0_ &= -5;
                this.exceedMaxItems_ = false;
                onChanged();
                return this;
            }

            public Builder clearItems() {
                SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> singleFieldBuilderV3 = this.itemsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.items_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearTitle() {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.title_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaTemplateLists_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
            public boolean getExceedMaxItems() {
                return this.exceedMaxItems_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
            public AlexaListsItem.List getItems() {
                SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> singleFieldBuilderV3 = this.itemsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaListsItem.List) singleFieldBuilderV3.getMessage();
                }
                AlexaListsItem.List list = this.items_;
                return list == null ? AlexaListsItem.List.getDefaultInstance() : list;
            }

            public AlexaListsItem.List.Builder getItemsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (AlexaListsItem.List.Builder) getItemsFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
            public AlexaListsItem.ListOrBuilder getItemsOrBuilder() {
                SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> singleFieldBuilderV3 = this.itemsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaListsItem.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaListsItem.List list = this.items_;
                return list == null ? AlexaListsItem.List.getDefaultInstance() : list;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
            public AlexaTitle getTitle() {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTitle) singleFieldBuilderV3.getMessage();
                }
                AlexaTitle alexaTitle = this.title_;
                return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
            }

            public AlexaTitle.Builder getTitleBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AlexaTitle.Builder) getTitleFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
            public AlexaTitleOrBuilder getTitleOrBuilder() {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTitleOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaTitle alexaTitle = this.title_;
                return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
            public boolean hasExceedMaxItems() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
            public boolean hasItems() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaTemplateLists_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaTemplateLists.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTitle() && hasItems() && hasExceedMaxItems() && getTitle().isInitialized() && getItems().isInitialized();
            }

            public Builder mergeItems(AlexaListsItem.List list) {
                AlexaListsItem.List list2;
                SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> singleFieldBuilderV3 = this.itemsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) == 2 && (list2 = this.items_) != null && list2 != AlexaListsItem.List.getDefaultInstance()) {
                        list = AlexaListsItem.List.newBuilder(this.items_).mergeFrom(list).buildPartial();
                    }
                    this.items_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(list);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeTitle(AlexaTitle alexaTitle) {
                AlexaTitle alexaTitle2;
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) == 1 && (alexaTitle2 = this.title_) != null && alexaTitle2 != AlexaTitle.getDefaultInstance()) {
                        alexaTitle = AlexaTitle.newBuilder(this.title_).mergeFrom(alexaTitle).buildPartial();
                    }
                    this.title_ = alexaTitle;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(alexaTitle);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setExceedMaxItems(boolean z6) {
                this.bitField0_ |= 4;
                this.exceedMaxItems_ = z6;
                onChanged();
                return this;
            }

            public Builder setItems(AlexaListsItem.List.Builder builder) {
                SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> singleFieldBuilderV3 = this.itemsBuilder_;
                AlexaListsItem.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.items_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setTitle(AlexaTitle.Builder builder) {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                AlexaTitle alexaTitleBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.title_ = alexaTitleBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTitleBuild);
                }
                this.bitField0_ |= 1;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = null;
                this.items_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setItems(AlexaListsItem.List list) {
                SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> singleFieldBuilderV3 = this.itemsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.items_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setTitle(AlexaTitle alexaTitle) {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaTitle.getClass();
                    this.title_ = alexaTitle;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTitle);
                }
                this.bitField0_ |= 1;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaTemplateLists build() {
                AlexaTemplateLists alexaTemplateListsBuildPartial = buildPartial();
                if (alexaTemplateListsBuildPartial.isInitialized()) {
                    return alexaTemplateListsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaTemplateListsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaTemplateLists buildPartial() {
                AlexaTemplateLists alexaTemplateLists = new AlexaTemplateLists(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                alexaTemplateLists.title_ = singleFieldBuilderV3 == null ? this.title_ : (AlexaTitle) singleFieldBuilderV3.build();
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> singleFieldBuilderV32 = this.itemsBuilder_;
                alexaTemplateLists.items_ = singleFieldBuilderV32 == null ? this.items_ : (AlexaListsItem.List) singleFieldBuilderV32.build();
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                alexaTemplateLists.exceedMaxItems_ = this.exceedMaxItems_;
                alexaTemplateLists.bitField0_ = i8;
                onBuilt();
                return alexaTemplateLists;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaTemplateLists getDefaultInstanceForType() {
                return AlexaTemplateLists.getDefaultInstance();
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
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.title_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                SingleFieldBuilderV3<AlexaListsItem.List, AlexaListsItem.List.Builder, AlexaListsItem.ListOrBuilder> singleFieldBuilderV32 = this.itemsBuilder_;
                if (singleFieldBuilderV32 == null) {
                    this.items_ = null;
                } else {
                    singleFieldBuilderV32.clear();
                }
                int i7 = this.bitField0_;
                this.exceedMaxItems_ = false;
                this.bitField0_ = i7 & (-7);
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaTemplateLists.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaTemplateLists> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaTemplateLists.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaTemplateLists r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaTemplateLists) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaTemplateLists r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaTemplateLists) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaTemplateLists.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaTemplateLists$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaTemplateLists) {
                    return mergeFrom((AlexaTemplateLists) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaTemplateLists alexaTemplateLists) {
                if (alexaTemplateLists == AlexaTemplateLists.getDefaultInstance()) {
                    return this;
                }
                if (alexaTemplateLists.hasTitle()) {
                    mergeTitle(alexaTemplateLists.getTitle());
                }
                if (alexaTemplateLists.hasItems()) {
                    mergeItems(alexaTemplateLists.getItems());
                }
                if (alexaTemplateLists.hasExceedMaxItems()) {
                    setExceedMaxItems(alexaTemplateLists.getExceedMaxItems());
                }
                mergeUnknownFields(((GeneratedMessage) alexaTemplateLists).unknownFields);
                onChanged();
                return this;
            }
        }

        private AlexaTemplateLists() {
            this.memoizedIsInitialized = (byte) -1;
            this.exceedMaxItems_ = false;
        }

        public static AlexaTemplateLists getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaTemplateLists_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaTemplateLists parseDelimitedFrom(InputStream inputStream) {
            return (AlexaTemplateLists) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaTemplateLists parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaTemplateLists> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaTemplateLists)) {
                return super.equals(obj);
            }
            AlexaTemplateLists alexaTemplateLists = (AlexaTemplateLists) obj;
            boolean z6 = hasTitle() == alexaTemplateLists.hasTitle();
            if (hasTitle()) {
                z6 = z6 && getTitle().equals(alexaTemplateLists.getTitle());
            }
            boolean z7 = z6 && hasItems() == alexaTemplateLists.hasItems();
            if (hasItems()) {
                z7 = z7 && getItems().equals(alexaTemplateLists.getItems());
            }
            boolean z8 = z7 && hasExceedMaxItems() == alexaTemplateLists.hasExceedMaxItems();
            if (hasExceedMaxItems()) {
                z8 = z8 && getExceedMaxItems() == alexaTemplateLists.getExceedMaxItems();
            }
            return z8 && this.unknownFields.equals(alexaTemplateLists.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
        public boolean getExceedMaxItems() {
            return this.exceedMaxItems_;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
        public AlexaListsItem.List getItems() {
            AlexaListsItem.List list = this.items_;
            return list == null ? AlexaListsItem.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
        public AlexaListsItem.ListOrBuilder getItemsOrBuilder() {
            AlexaListsItem.List list = this.items_;
            return list == null ? AlexaListsItem.List.getDefaultInstance() : list;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaTemplateLists> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, getTitle()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getItems());
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(3, this.exceedMaxItems_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
        public AlexaTitle getTitle() {
            AlexaTitle alexaTitle = this.title_;
            return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
        public AlexaTitleOrBuilder getTitleOrBuilder() {
            AlexaTitle alexaTitle = this.title_;
            return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
        public boolean hasExceedMaxItems() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
        public boolean hasItems() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateListsOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 1) == 1;
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
            if (hasItems()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getItems().hashCode();
            }
            if (hasExceedMaxItems()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getExceedMaxItems());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaTemplateLists_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaTemplateLists.class, Builder.class);
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
            if (!hasTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasItems()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasExceedMaxItems()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getTitle().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getItems().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, getTitle());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, getItems());
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(3, this.exceedMaxItems_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaTemplateLists(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                    AlexaTitle.Builder builder = (this.bitField0_ & 1) == 1 ? this.title_.toBuilder() : null;
                                    AlexaTitle alexaTitle = (AlexaTitle) codedInputStream.readMessage(AlexaTitle.PARSER, extensionRegistryLite);
                                    this.title_ = alexaTitle;
                                    if (builder != null) {
                                        builder.mergeFrom(alexaTitle);
                                        this.title_ = builder.buildPartial();
                                    }
                                } else if (tag == 18) {
                                    i7 = 2;
                                    AlexaListsItem.List.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.items_.toBuilder() : null;
                                    AlexaListsItem.List list = (AlexaListsItem.List) codedInputStream.readMessage(AlexaListsItem.List.PARSER, extensionRegistryLite);
                                    this.items_ = list;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(list);
                                        this.items_ = builder2.buildPartial();
                                    }
                                } else if (tag == 24) {
                                    this.bitField0_ |= 4;
                                    this.exceedMaxItems_ = codedInputStream.readBool();
                                } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                                this.bitField0_ |= i7;
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

        public static Builder newBuilder(AlexaTemplateLists alexaTemplateLists) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaTemplateLists);
        }

        public static AlexaTemplateLists parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTemplateLists) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaTemplateLists parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaTemplateLists parseFrom(CodedInputStream codedInputStream) {
            return (AlexaTemplateLists) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaTemplateLists getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaTemplateLists(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaTemplateLists parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTemplateLists) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaTemplateLists parseFrom(InputStream inputStream) {
            return (AlexaTemplateLists) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaTemplateLists parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTemplateLists) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaTemplateLists parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaTemplateLists parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaTemplateLists parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaTemplateLists parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaTemplateListsOrBuilder extends MessageOrBuilder {
        boolean getExceedMaxItems();

        AlexaListsItem.List getItems();

        AlexaListsItem.ListOrBuilder getItemsOrBuilder();

        AlexaTitle getTitle();

        AlexaTitleOrBuilder getTitleOrBuilder();

        boolean hasExceedMaxItems();

        boolean hasItems();

        boolean hasTitle();
    }

    public static final class AlexaTemplateWeather extends GeneratedMessageV3 implements AlexaTemplateWeatherOrBuilder {
        public static final int CURRENT_WEATHER_FIELD_NUMBER = 2;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int HIGH_TEMPERATURE_FIELD_NUMBER = 4;
        public static final int IMAGE_FIELD_NUMBER = 6;
        public static final int LOW_TEMPERATURE_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int WEATHERFORECAST_FIELD_NUMBER = 7;
        public static final int WEATHER_CODE_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object currentWeather_;
        private volatile Object description_;
        private volatile Object highTemperature_;
        private volatile Object image_;
        private volatile Object lowTemperature_;
        private byte memoizedIsInitialized;
        private AlexaTitle title_;
        private int weatherCode_;
        private AlexaWeatherItem.List weatherForecast_;
        private static final AlexaTemplateWeather DEFAULT_INSTANCE = new AlexaTemplateWeather();

        @Deprecated
        public static final Parser<AlexaTemplateWeather> PARSER = new AbstractParser<AlexaTemplateWeather>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeather.1
            @Override // com.google.protobuf.Parser
            public AlexaTemplateWeather parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaTemplateWeather(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaTemplateWeatherOrBuilder {
            private int bitField0_;
            private Object currentWeather_;
            private Object description_;
            private Object highTemperature_;
            private Object image_;
            private Object lowTemperature_;
            private SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> titleBuilder_;
            private AlexaTitle title_;
            private int weatherCode_;
            private SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> weatherForecastBuilder_;
            private AlexaWeatherItem.List weatherForecast_;

            private Builder() {
                this.title_ = null;
                this.currentWeather_ = "";
                this.description_ = "";
                this.highTemperature_ = "";
                this.lowTemperature_ = "";
                this.image_ = "";
                this.weatherForecast_ = null;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaTemplateWeather_descriptor;
            }

            private SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> getTitleFieldBuilder() {
                if (this.titleBuilder_ == null) {
                    this.titleBuilder_ = new SingleFieldBuilderV3<>(getTitle(), getParentForChildren(), isClean());
                    this.title_ = null;
                }
                return this.titleBuilder_;
            }

            private SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> getWeatherForecastFieldBuilder() {
                if (this.weatherForecastBuilder_ == null) {
                    this.weatherForecastBuilder_ = new SingleFieldBuilderV3<>(getWeatherForecast(), getParentForChildren(), isClean());
                    this.weatherForecast_ = null;
                }
                return this.weatherForecastBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getTitleFieldBuilder();
                    getWeatherForecastFieldBuilder();
                }
            }

            public Builder clearCurrentWeather() {
                this.bitField0_ &= -3;
                this.currentWeather_ = AlexaTemplateWeather.getDefaultInstance().getCurrentWeather();
                onChanged();
                return this;
            }

            public Builder clearDescription() {
                this.bitField0_ &= -5;
                this.description_ = AlexaTemplateWeather.getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            public Builder clearHighTemperature() {
                this.bitField0_ &= -9;
                this.highTemperature_ = AlexaTemplateWeather.getDefaultInstance().getHighTemperature();
                onChanged();
                return this;
            }

            public Builder clearImage() {
                this.bitField0_ &= -33;
                this.image_ = AlexaTemplateWeather.getDefaultInstance().getImage();
                onChanged();
                return this;
            }

            public Builder clearLowTemperature() {
                this.bitField0_ &= -17;
                this.lowTemperature_ = AlexaTemplateWeather.getDefaultInstance().getLowTemperature();
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.title_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearWeatherCode() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.weatherCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWeatherForecast() {
                SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> singleFieldBuilderV3 = this.weatherForecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.weatherForecast_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -65;
                return this;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public String getCurrentWeather() {
                Object obj = this.currentWeather_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.currentWeather_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public ByteString getCurrentWeatherBytes() {
                Object obj = this.currentWeather_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.currentWeather_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.description_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaTemplateWeather_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public String getHighTemperature() {
                Object obj = this.highTemperature_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.highTemperature_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public ByteString getHighTemperatureBytes() {
                Object obj = this.highTemperature_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.highTemperature_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public String getImage() {
                Object obj = this.image_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.image_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public ByteString getImageBytes() {
                Object obj = this.image_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.image_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public String getLowTemperature() {
                Object obj = this.lowTemperature_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.lowTemperature_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public ByteString getLowTemperatureBytes() {
                Object obj = this.lowTemperature_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lowTemperature_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public AlexaTitle getTitle() {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTitle) singleFieldBuilderV3.getMessage();
                }
                AlexaTitle alexaTitle = this.title_;
                return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
            }

            public AlexaTitle.Builder getTitleBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AlexaTitle.Builder) getTitleFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public AlexaTitleOrBuilder getTitleOrBuilder() {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaTitleOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaTitle alexaTitle = this.title_;
                return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public int getWeatherCode() {
                return this.weatherCode_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public AlexaWeatherItem.List getWeatherForecast() {
                SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> singleFieldBuilderV3 = this.weatherForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaWeatherItem.List) singleFieldBuilderV3.getMessage();
                }
                AlexaWeatherItem.List list = this.weatherForecast_;
                return list == null ? AlexaWeatherItem.List.getDefaultInstance() : list;
            }

            public AlexaWeatherItem.List.Builder getWeatherForecastBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (AlexaWeatherItem.List.Builder) getWeatherForecastFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public AlexaWeatherItem.ListOrBuilder getWeatherForecastOrBuilder() {
                SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> singleFieldBuilderV3 = this.weatherForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlexaWeatherItem.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlexaWeatherItem.List list = this.weatherForecast_;
                return list == null ? AlexaWeatherItem.List.getDefaultInstance() : list;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public boolean hasCurrentWeather() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public boolean hasDescription() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public boolean hasHighTemperature() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public boolean hasImage() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public boolean hasLowTemperature() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public boolean hasWeatherCode() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
            public boolean hasWeatherForecast() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaTemplateWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaTemplateWeather.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTitle() && hasCurrentWeather() && hasDescription() && hasHighTemperature() && hasLowTemperature() && hasImage() && hasWeatherForecast() && hasWeatherCode() && getTitle().isInitialized() && getWeatherForecast().isInitialized();
            }

            public Builder mergeTitle(AlexaTitle alexaTitle) {
                AlexaTitle alexaTitle2;
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) == 1 && (alexaTitle2 = this.title_) != null && alexaTitle2 != AlexaTitle.getDefaultInstance()) {
                        alexaTitle = AlexaTitle.newBuilder(this.title_).mergeFrom(alexaTitle).buildPartial();
                    }
                    this.title_ = alexaTitle;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(alexaTitle);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder mergeWeatherForecast(AlexaWeatherItem.List list) {
                AlexaWeatherItem.List list2;
                SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> singleFieldBuilderV3 = this.weatherForecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 64) == 64 && (list2 = this.weatherForecast_) != null && list2 != AlexaWeatherItem.List.getDefaultInstance()) {
                        list = AlexaWeatherItem.List.newBuilder(this.weatherForecast_).mergeFrom(list).buildPartial();
                    }
                    this.weatherForecast_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(list);
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder setCurrentWeather(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.currentWeather_ = str;
                onChanged();
                return this;
            }

            public Builder setCurrentWeatherBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.currentWeather_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.description_ = str;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.description_ = byteString;
                onChanged();
                return this;
            }

            public Builder setHighTemperature(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.highTemperature_ = str;
                onChanged();
                return this;
            }

            public Builder setHighTemperatureBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.highTemperature_ = byteString;
                onChanged();
                return this;
            }

            public Builder setImage(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.image_ = str;
                onChanged();
                return this;
            }

            public Builder setImageBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 32;
                this.image_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLowTemperature(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.lowTemperature_ = str;
                onChanged();
                return this;
            }

            public Builder setLowTemperatureBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.lowTemperature_ = byteString;
                onChanged();
                return this;
            }

            public Builder setTitle(AlexaTitle.Builder builder) {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                AlexaTitle alexaTitleBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.title_ = alexaTitleBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTitleBuild);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setWeatherCode(int i7) {
                this.bitField0_ |= 128;
                this.weatherCode_ = i7;
                onChanged();
                return this;
            }

            public Builder setWeatherForecast(AlexaWeatherItem.List.Builder builder) {
                SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> singleFieldBuilderV3 = this.weatherForecastBuilder_;
                AlexaWeatherItem.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.weatherForecast_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.bitField0_ |= 64;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = null;
                this.currentWeather_ = "";
                this.description_ = "";
                this.highTemperature_ = "";
                this.lowTemperature_ = "";
                this.image_ = "";
                this.weatherForecast_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setTitle(AlexaTitle alexaTitle) {
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexaTitle.getClass();
                    this.title_ = alexaTitle;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaTitle);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setWeatherForecast(AlexaWeatherItem.List list) {
                SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> singleFieldBuilderV3 = this.weatherForecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.weatherForecast_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.bitField0_ |= 64;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaTemplateWeather build() {
                AlexaTemplateWeather alexaTemplateWeatherBuildPartial = buildPartial();
                if (alexaTemplateWeatherBuildPartial.isInitialized()) {
                    return alexaTemplateWeatherBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaTemplateWeatherBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaTemplateWeather buildPartial() {
                AlexaTemplateWeather alexaTemplateWeather = new AlexaTemplateWeather(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                alexaTemplateWeather.title_ = singleFieldBuilderV3 == null ? this.title_ : (AlexaTitle) singleFieldBuilderV3.build();
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                alexaTemplateWeather.currentWeather_ = this.currentWeather_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                alexaTemplateWeather.description_ = this.description_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                alexaTemplateWeather.highTemperature_ = this.highTemperature_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                alexaTemplateWeather.lowTemperature_ = this.lowTemperature_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                alexaTemplateWeather.image_ = this.image_;
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> singleFieldBuilderV32 = this.weatherForecastBuilder_;
                alexaTemplateWeather.weatherForecast_ = singleFieldBuilderV32 == null ? this.weatherForecast_ : (AlexaWeatherItem.List) singleFieldBuilderV32.build();
                if ((i7 & 128) == 128) {
                    i8 |= 128;
                }
                alexaTemplateWeather.weatherCode_ = this.weatherCode_;
                alexaTemplateWeather.bitField0_ = i8;
                onBuilt();
                return alexaTemplateWeather;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaTemplateWeather getDefaultInstanceForType() {
                return AlexaTemplateWeather.getDefaultInstance();
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
                SingleFieldBuilderV3<AlexaTitle, AlexaTitle.Builder, AlexaTitleOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.title_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                int i7 = this.bitField0_;
                this.currentWeather_ = "";
                this.description_ = "";
                this.highTemperature_ = "";
                this.lowTemperature_ = "";
                this.image_ = "";
                this.bitField0_ = i7 & (-64);
                SingleFieldBuilderV3<AlexaWeatherItem.List, AlexaWeatherItem.List.Builder, AlexaWeatherItem.ListOrBuilder> singleFieldBuilderV32 = this.weatherForecastBuilder_;
                if (singleFieldBuilderV32 == null) {
                    this.weatherForecast_ = null;
                } else {
                    singleFieldBuilderV32.clear();
                }
                int i8 = this.bitField0_;
                this.weatherCode_ = 0;
                this.bitField0_ = i8 & (-193);
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeather.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaTemplateWeather> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeather.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaTemplateWeather r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeather) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaTemplateWeather r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeather) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeather.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaTemplateWeather$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaTemplateWeather) {
                    return mergeFrom((AlexaTemplateWeather) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaTemplateWeather alexaTemplateWeather) {
                if (alexaTemplateWeather == AlexaTemplateWeather.getDefaultInstance()) {
                    return this;
                }
                if (alexaTemplateWeather.hasTitle()) {
                    mergeTitle(alexaTemplateWeather.getTitle());
                }
                if (alexaTemplateWeather.hasCurrentWeather()) {
                    this.bitField0_ |= 2;
                    this.currentWeather_ = alexaTemplateWeather.currentWeather_;
                    onChanged();
                }
                if (alexaTemplateWeather.hasDescription()) {
                    this.bitField0_ |= 4;
                    this.description_ = alexaTemplateWeather.description_;
                    onChanged();
                }
                if (alexaTemplateWeather.hasHighTemperature()) {
                    this.bitField0_ |= 8;
                    this.highTemperature_ = alexaTemplateWeather.highTemperature_;
                    onChanged();
                }
                if (alexaTemplateWeather.hasLowTemperature()) {
                    this.bitField0_ |= 16;
                    this.lowTemperature_ = alexaTemplateWeather.lowTemperature_;
                    onChanged();
                }
                if (alexaTemplateWeather.hasImage()) {
                    this.bitField0_ |= 32;
                    this.image_ = alexaTemplateWeather.image_;
                    onChanged();
                }
                if (alexaTemplateWeather.hasWeatherForecast()) {
                    mergeWeatherForecast(alexaTemplateWeather.getWeatherForecast());
                }
                if (alexaTemplateWeather.hasWeatherCode()) {
                    setWeatherCode(alexaTemplateWeather.getWeatherCode());
                }
                mergeUnknownFields(((GeneratedMessage) alexaTemplateWeather).unknownFields);
                onChanged();
                return this;
            }
        }

        private AlexaTemplateWeather() {
            this.memoizedIsInitialized = (byte) -1;
            this.currentWeather_ = "";
            this.description_ = "";
            this.highTemperature_ = "";
            this.lowTemperature_ = "";
            this.image_ = "";
            this.weatherCode_ = 0;
        }

        public static AlexaTemplateWeather getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaTemplateWeather_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaTemplateWeather parseDelimitedFrom(InputStream inputStream) {
            return (AlexaTemplateWeather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaTemplateWeather parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaTemplateWeather> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaTemplateWeather)) {
                return super.equals(obj);
            }
            AlexaTemplateWeather alexaTemplateWeather = (AlexaTemplateWeather) obj;
            boolean z6 = hasTitle() == alexaTemplateWeather.hasTitle();
            if (hasTitle()) {
                z6 = z6 && getTitle().equals(alexaTemplateWeather.getTitle());
            }
            boolean z7 = z6 && hasCurrentWeather() == alexaTemplateWeather.hasCurrentWeather();
            if (hasCurrentWeather()) {
                z7 = z7 && getCurrentWeather().equals(alexaTemplateWeather.getCurrentWeather());
            }
            boolean z8 = z7 && hasDescription() == alexaTemplateWeather.hasDescription();
            if (hasDescription()) {
                z8 = z8 && getDescription().equals(alexaTemplateWeather.getDescription());
            }
            boolean z9 = z8 && hasHighTemperature() == alexaTemplateWeather.hasHighTemperature();
            if (hasHighTemperature()) {
                z9 = z9 && getHighTemperature().equals(alexaTemplateWeather.getHighTemperature());
            }
            boolean z10 = z9 && hasLowTemperature() == alexaTemplateWeather.hasLowTemperature();
            if (hasLowTemperature()) {
                z10 = z10 && getLowTemperature().equals(alexaTemplateWeather.getLowTemperature());
            }
            boolean z11 = z10 && hasImage() == alexaTemplateWeather.hasImage();
            if (hasImage()) {
                z11 = z11 && getImage().equals(alexaTemplateWeather.getImage());
            }
            boolean z12 = z11 && hasWeatherForecast() == alexaTemplateWeather.hasWeatherForecast();
            if (hasWeatherForecast()) {
                z12 = z12 && getWeatherForecast().equals(alexaTemplateWeather.getWeatherForecast());
            }
            boolean z13 = z12 && hasWeatherCode() == alexaTemplateWeather.hasWeatherCode();
            if (hasWeatherCode()) {
                z13 = z13 && getWeatherCode() == alexaTemplateWeather.getWeatherCode();
            }
            return z13 && this.unknownFields.equals(alexaTemplateWeather.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public String getCurrentWeather() {
            Object obj = this.currentWeather_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.currentWeather_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public ByteString getCurrentWeatherBytes() {
            Object obj = this.currentWeather_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.currentWeather_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.description_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public String getHighTemperature() {
            Object obj = this.highTemperature_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.highTemperature_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public ByteString getHighTemperatureBytes() {
            Object obj = this.highTemperature_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.highTemperature_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public String getImage() {
            Object obj = this.image_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.image_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public ByteString getImageBytes() {
            Object obj = this.image_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.image_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public String getLowTemperature() {
            Object obj = this.lowTemperature_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.lowTemperature_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public ByteString getLowTemperatureBytes() {
            Object obj = this.lowTemperature_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lowTemperature_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaTemplateWeather> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, getTitle()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(2, this.currentWeather_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(3, this.description_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(4, this.highTemperature_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(5, this.lowTemperature_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(6, this.image_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getWeatherForecast());
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(8, this.weatherCode_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public AlexaTitle getTitle() {
            AlexaTitle alexaTitle = this.title_;
            return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public AlexaTitleOrBuilder getTitleOrBuilder() {
            AlexaTitle alexaTitle = this.title_;
            return alexaTitle == null ? AlexaTitle.getDefaultInstance() : alexaTitle;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public int getWeatherCode() {
            return this.weatherCode_;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public AlexaWeatherItem.List getWeatherForecast() {
            AlexaWeatherItem.List list = this.weatherForecast_;
            return list == null ? AlexaWeatherItem.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public AlexaWeatherItem.ListOrBuilder getWeatherForecastOrBuilder() {
            AlexaWeatherItem.List list = this.weatherForecast_;
            return list == null ? AlexaWeatherItem.List.getDefaultInstance() : list;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public boolean hasCurrentWeather() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public boolean hasDescription() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public boolean hasHighTemperature() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public boolean hasImage() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public boolean hasLowTemperature() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public boolean hasWeatherCode() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTemplateWeatherOrBuilder
        public boolean hasWeatherForecast() {
            return (this.bitField0_ & 64) == 64;
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
            if (hasCurrentWeather()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getCurrentWeather().hashCode();
            }
            if (hasDescription()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDescription().hashCode();
            }
            if (hasHighTemperature()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getHighTemperature().hashCode();
            }
            if (hasLowTemperature()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getLowTemperature().hashCode();
            }
            if (hasImage()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getImage().hashCode();
            }
            if (hasWeatherForecast()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getWeatherForecast().hashCode();
            }
            if (hasWeatherCode()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getWeatherCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaTemplateWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaTemplateWeather.class, Builder.class);
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
            if (!hasTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCurrentWeather()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDescription()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHighTemperature()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLowTemperature()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasImage()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWeatherForecast()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWeatherCode()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getTitle().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getWeatherForecast().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, getTitle());
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.currentWeather_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.description_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.highTemperature_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.lowTemperature_);
            }
            if ((this.bitField0_ & 32) == 32) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.image_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeMessage(7, getWeatherForecast());
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeInt32(8, this.weatherCode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaTemplateWeather(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            int i7;
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
                                AlexaTitle.Builder builder = (this.bitField0_ & 1) == 1 ? this.title_.toBuilder() : null;
                                AlexaTitle alexaTitle = (AlexaTitle) codedInputStream.readMessage(AlexaTitle.PARSER, extensionRegistryLite);
                                this.title_ = alexaTitle;
                                if (builder != null) {
                                    builder.mergeFrom(alexaTitle);
                                    this.title_ = builder.buildPartial();
                                }
                                i7 = this.bitField0_ | 1;
                            } else if (tag == 18) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.currentWeather_ = bytes;
                            } else if (tag == 26) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.description_ = bytes2;
                            } else if (tag == 34) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.highTemperature_ = bytes3;
                            } else if (tag == 42) {
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.lowTemperature_ = bytes4;
                            } else if (tag == 50) {
                                ByteString bytes5 = codedInputStream.readBytes();
                                this.bitField0_ |= 32;
                                this.image_ = bytes5;
                            } else if (tag == 58) {
                                AlexaWeatherItem.List.Builder builder2 = (this.bitField0_ & 64) == 64 ? this.weatherForecast_.toBuilder() : null;
                                AlexaWeatherItem.List list = (AlexaWeatherItem.List) codedInputStream.readMessage(AlexaWeatherItem.List.PARSER, extensionRegistryLite);
                                this.weatherForecast_ = list;
                                if (builder2 != null) {
                                    builder2.mergeFrom(list);
                                    this.weatherForecast_ = builder2.buildPartial();
                                }
                                i7 = this.bitField0_ | 64;
                            } else if (tag == 64) {
                                this.bitField0_ |= 128;
                                this.weatherCode_ = codedInputStream.readInt32();
                            } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            }
                            this.bitField0_ = i7;
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

        public static Builder newBuilder(AlexaTemplateWeather alexaTemplateWeather) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaTemplateWeather);
        }

        public static AlexaTemplateWeather parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTemplateWeather) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaTemplateWeather parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaTemplateWeather parseFrom(CodedInputStream codedInputStream) {
            return (AlexaTemplateWeather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaTemplateWeather getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaTemplateWeather(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaTemplateWeather parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTemplateWeather) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaTemplateWeather parseFrom(InputStream inputStream) {
            return (AlexaTemplateWeather) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaTemplateWeather parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTemplateWeather) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaTemplateWeather parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaTemplateWeather parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaTemplateWeather parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaTemplateWeather parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaTemplateWeatherOrBuilder extends MessageOrBuilder {
        String getCurrentWeather();

        ByteString getCurrentWeatherBytes();

        String getDescription();

        ByteString getDescriptionBytes();

        String getHighTemperature();

        ByteString getHighTemperatureBytes();

        String getImage();

        ByteString getImageBytes();

        String getLowTemperature();

        ByteString getLowTemperatureBytes();

        AlexaTitle getTitle();

        AlexaTitleOrBuilder getTitleOrBuilder();

        int getWeatherCode();

        AlexaWeatherItem.List getWeatherForecast();

        AlexaWeatherItem.ListOrBuilder getWeatherForecastOrBuilder();

        boolean hasCurrentWeather();

        boolean hasDescription();

        boolean hasHighTemperature();

        boolean hasImage();

        boolean hasLowTemperature();

        boolean hasTitle();

        boolean hasWeatherCode();

        boolean hasWeatherForecast();
    }

    public static final class AlexaTitle extends GeneratedMessageV3 implements AlexaTitleOrBuilder {
        public static final int MAIN_TITLE_FIELD_NUMBER = 1;
        public static final int SUB_TITLE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object mainTitle_;
        private byte memoizedIsInitialized;
        private volatile Object subTitle_;
        private static final AlexaTitle DEFAULT_INSTANCE = new AlexaTitle();

        @Deprecated
        public static final Parser<AlexaTitle> PARSER = new AbstractParser<AlexaTitle>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaTitle.1
            @Override // com.google.protobuf.Parser
            public AlexaTitle parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaTitle(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaTitleOrBuilder {
            private int bitField0_;
            private Object mainTitle_;
            private Object subTitle_;

            private Builder() {
                this.mainTitle_ = "";
                this.subTitle_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaTitle_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearMainTitle() {
                this.bitField0_ &= -2;
                this.mainTitle_ = AlexaTitle.getDefaultInstance().getMainTitle();
                onChanged();
                return this;
            }

            public Builder clearSubTitle() {
                this.bitField0_ &= -3;
                this.subTitle_ = AlexaTitle.getDefaultInstance().getSubTitle();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaTitle_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
            public String getMainTitle() {
                Object obj = this.mainTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.mainTitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
            public ByteString getMainTitleBytes() {
                Object obj = this.mainTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mainTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
            public String getSubTitle() {
                Object obj = this.subTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.subTitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
            public ByteString getSubTitleBytes() {
                Object obj = this.subTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.subTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
            public boolean hasMainTitle() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
            public boolean hasSubTitle() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaTitle_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaTitle.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasMainTitle() && hasSubTitle();
            }

            public Builder setMainTitle(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.mainTitle_ = str;
                onChanged();
                return this;
            }

            public Builder setMainTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.mainTitle_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSubTitle(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.subTitle_ = str;
                onChanged();
                return this;
            }

            public Builder setSubTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.subTitle_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mainTitle_ = "";
                this.subTitle_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaTitle build() {
                AlexaTitle alexaTitleBuildPartial = buildPartial();
                if (alexaTitleBuildPartial.isInitialized()) {
                    return alexaTitleBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaTitleBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaTitle buildPartial() {
                AlexaTitle alexaTitle = new AlexaTitle(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                alexaTitle.mainTitle_ = this.mainTitle_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                alexaTitle.subTitle_ = this.subTitle_;
                alexaTitle.bitField0_ = i8;
                onBuilt();
                return alexaTitle;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaTitle getDefaultInstanceForType() {
                return AlexaTitle.getDefaultInstance();
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
                this.mainTitle_ = "";
                int i7 = this.bitField0_;
                this.subTitle_ = "";
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaTitle.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaTitle> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaTitle.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaTitle r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaTitle) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaTitle r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaTitle) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaTitle.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaTitle$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaTitle) {
                    return mergeFrom((AlexaTitle) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaTitle alexaTitle) {
                if (alexaTitle == AlexaTitle.getDefaultInstance()) {
                    return this;
                }
                if (alexaTitle.hasMainTitle()) {
                    this.bitField0_ |= 1;
                    this.mainTitle_ = alexaTitle.mainTitle_;
                    onChanged();
                }
                if (alexaTitle.hasSubTitle()) {
                    this.bitField0_ |= 2;
                    this.subTitle_ = alexaTitle.subTitle_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) alexaTitle).unknownFields);
                onChanged();
                return this;
            }
        }

        private AlexaTitle() {
            this.memoizedIsInitialized = (byte) -1;
            this.mainTitle_ = "";
            this.subTitle_ = "";
        }

        public static AlexaTitle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaTitle_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaTitle parseDelimitedFrom(InputStream inputStream) {
            return (AlexaTitle) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaTitle parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaTitle> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaTitle)) {
                return super.equals(obj);
            }
            AlexaTitle alexaTitle = (AlexaTitle) obj;
            boolean z6 = hasMainTitle() == alexaTitle.hasMainTitle();
            if (hasMainTitle()) {
                z6 = z6 && getMainTitle().equals(alexaTitle.getMainTitle());
            }
            boolean z7 = z6 && hasSubTitle() == alexaTitle.hasSubTitle();
            if (hasSubTitle()) {
                z7 = z7 && getSubTitle().equals(alexaTitle.getSubTitle());
            }
            return z7 && this.unknownFields.equals(alexaTitle.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
        public String getMainTitle() {
            Object obj = this.mainTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.mainTitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
        public ByteString getMainTitleBytes() {
            Object obj = this.mainTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mainTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaTitle> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.mainTitle_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.subTitle_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
        public String getSubTitle() {
            Object obj = this.subTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.subTitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
        public ByteString getSubTitleBytes() {
            Object obj = this.subTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.subTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
        public boolean hasMainTitle() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaTitleOrBuilder
        public boolean hasSubTitle() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasMainTitle()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMainTitle().hashCode();
            }
            if (hasSubTitle()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSubTitle().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaTitle_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaTitle.class, Builder.class);
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
            if (!hasMainTitle()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSubTitle()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.mainTitle_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.subTitle_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaTitle(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.mainTitle_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.subTitle_ = bytes2;
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

        public static Builder newBuilder(AlexaTitle alexaTitle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaTitle);
        }

        public static AlexaTitle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTitle) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaTitle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaTitle parseFrom(CodedInputStream codedInputStream) {
            return (AlexaTitle) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaTitle getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaTitle(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaTitle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTitle) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaTitle parseFrom(InputStream inputStream) {
            return (AlexaTitle) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaTitle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaTitle) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaTitle parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaTitle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaTitle parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaTitle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaTitleOrBuilder extends MessageOrBuilder {
        String getMainTitle();

        ByteString getMainTitleBytes();

        String getSubTitle();

        ByteString getSubTitleBytes();

        boolean hasMainTitle();

        boolean hasSubTitle();
    }

    public static final class AlexaWeatherItem extends GeneratedMessageV3 implements AlexaWeatherItemOrBuilder {
        public static final int DATE_FIELD_NUMBER = 1;
        public static final int HIGH_TEMPERATURE_FIELD_NUMBER = 3;
        public static final int IMAGE_FIELD_NUMBER = 5;
        public static final int LOW_TEMPERATURE_FIELD_NUMBER = 4;
        public static final int WEATHER_CODE_FIELD_NUMBER = 6;
        public static final int WEEKDAY_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object date_;
        private volatile Object highTemperature_;
        private volatile Object image_;
        private volatile Object lowTemperature_;
        private byte memoizedIsInitialized;
        private int weatherCode_;
        private volatile Object weekday_;
        private static final AlexaWeatherItem DEFAULT_INSTANCE = new AlexaWeatherItem();

        @Deprecated
        public static final Parser<AlexaWeatherItem> PARSER = new AbstractParser<AlexaWeatherItem>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.1
            @Override // com.google.protobuf.Parser
            public AlexaWeatherItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new AlexaWeatherItem(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlexaWeatherItemOrBuilder {
            private int bitField0_;
            private Object date_;
            private Object highTemperature_;
            private Object image_;
            private Object lowTemperature_;
            private int weatherCode_;
            private Object weekday_;

            private Builder() {
                this.date_ = "";
                this.weekday_ = "";
                this.highTemperature_ = "";
                this.lowTemperature_ = "";
                this.image_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AlexaProtos.internal_static_AlexaWeatherItem_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearDate() {
                this.bitField0_ &= -2;
                this.date_ = AlexaWeatherItem.getDefaultInstance().getDate();
                onChanged();
                return this;
            }

            public Builder clearHighTemperature() {
                this.bitField0_ &= -5;
                this.highTemperature_ = AlexaWeatherItem.getDefaultInstance().getHighTemperature();
                onChanged();
                return this;
            }

            public Builder clearImage() {
                this.bitField0_ &= -17;
                this.image_ = AlexaWeatherItem.getDefaultInstance().getImage();
                onChanged();
                return this;
            }

            public Builder clearLowTemperature() {
                this.bitField0_ &= -9;
                this.lowTemperature_ = AlexaWeatherItem.getDefaultInstance().getLowTemperature();
                onChanged();
                return this;
            }

            public Builder clearWeatherCode() {
                this.bitField0_ &= -33;
                this.weatherCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWeekday() {
                this.bitField0_ &= -3;
                this.weekday_ = AlexaWeatherItem.getDefaultInstance().getWeekday();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public String getDate() {
                Object obj = this.date_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.date_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public ByteString getDateBytes() {
                Object obj = this.date_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.date_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AlexaProtos.internal_static_AlexaWeatherItem_descriptor;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public String getHighTemperature() {
                Object obj = this.highTemperature_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.highTemperature_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public ByteString getHighTemperatureBytes() {
                Object obj = this.highTemperature_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.highTemperature_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public String getImage() {
                Object obj = this.image_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.image_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public ByteString getImageBytes() {
                Object obj = this.image_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.image_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public String getLowTemperature() {
                Object obj = this.lowTemperature_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.lowTemperature_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public ByteString getLowTemperatureBytes() {
                Object obj = this.lowTemperature_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lowTemperature_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public int getWeatherCode() {
                return this.weatherCode_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public String getWeekday() {
                Object obj = this.weekday_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.weekday_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public ByteString getWeekdayBytes() {
                Object obj = this.weekday_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.weekday_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public boolean hasDate() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public boolean hasHighTemperature() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public boolean hasImage() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public boolean hasLowTemperature() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public boolean hasWeatherCode() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
            public boolean hasWeekday() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AlexaProtos.internal_static_AlexaWeatherItem_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaWeatherItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasDate() && hasWeekday() && hasHighTemperature() && hasLowTemperature() && hasImage() && hasWeatherCode();
            }

            public Builder setDate(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.date_ = str;
                onChanged();
                return this;
            }

            public Builder setDateBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.date_ = byteString;
                onChanged();
                return this;
            }

            public Builder setHighTemperature(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.highTemperature_ = str;
                onChanged();
                return this;
            }

            public Builder setHighTemperatureBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.highTemperature_ = byteString;
                onChanged();
                return this;
            }

            public Builder setImage(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.image_ = str;
                onChanged();
                return this;
            }

            public Builder setImageBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.image_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLowTemperature(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.lowTemperature_ = str;
                onChanged();
                return this;
            }

            public Builder setLowTemperatureBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.lowTemperature_ = byteString;
                onChanged();
                return this;
            }

            public Builder setWeatherCode(int i7) {
                this.bitField0_ |= 32;
                this.weatherCode_ = i7;
                onChanged();
                return this;
            }

            public Builder setWeekday(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.weekday_ = str;
                onChanged();
                return this;
            }

            public Builder setWeekdayBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.weekday_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.date_ = "";
                this.weekday_ = "";
                this.highTemperature_ = "";
                this.lowTemperature_ = "";
                this.image_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaWeatherItem build() {
                AlexaWeatherItem alexaWeatherItemBuildPartial = buildPartial();
                if (alexaWeatherItemBuildPartial.isInitialized()) {
                    return alexaWeatherItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alexaWeatherItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlexaWeatherItem buildPartial() {
                AlexaWeatherItem alexaWeatherItem = new AlexaWeatherItem(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                alexaWeatherItem.date_ = this.date_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                alexaWeatherItem.weekday_ = this.weekday_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                alexaWeatherItem.highTemperature_ = this.highTemperature_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                alexaWeatherItem.lowTemperature_ = this.lowTemperature_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                alexaWeatherItem.image_ = this.image_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                alexaWeatherItem.weatherCode_ = this.weatherCode_;
                alexaWeatherItem.bitField0_ = i8;
                onBuilt();
                return alexaWeatherItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlexaWeatherItem getDefaultInstanceForType() {
                return AlexaWeatherItem.getDefaultInstance();
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
                this.date_ = "";
                int i7 = this.bitField0_;
                this.weekday_ = "";
                this.highTemperature_ = "";
                this.lowTemperature_ = "";
                this.image_ = "";
                this.weatherCode_ = 0;
                this.bitField0_ = i7 & (-64);
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
            public com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaWeatherItem> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AlexaProtos$AlexaWeatherItem r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AlexaProtos$AlexaWeatherItem r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaWeatherItem$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlexaWeatherItem) {
                    return mergeFrom((AlexaWeatherItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlexaWeatherItem alexaWeatherItem) {
                if (alexaWeatherItem == AlexaWeatherItem.getDefaultInstance()) {
                    return this;
                }
                if (alexaWeatherItem.hasDate()) {
                    this.bitField0_ |= 1;
                    this.date_ = alexaWeatherItem.date_;
                    onChanged();
                }
                if (alexaWeatherItem.hasWeekday()) {
                    this.bitField0_ |= 2;
                    this.weekday_ = alexaWeatherItem.weekday_;
                    onChanged();
                }
                if (alexaWeatherItem.hasHighTemperature()) {
                    this.bitField0_ |= 4;
                    this.highTemperature_ = alexaWeatherItem.highTemperature_;
                    onChanged();
                }
                if (alexaWeatherItem.hasLowTemperature()) {
                    this.bitField0_ |= 8;
                    this.lowTemperature_ = alexaWeatherItem.lowTemperature_;
                    onChanged();
                }
                if (alexaWeatherItem.hasImage()) {
                    this.bitField0_ |= 16;
                    this.image_ = alexaWeatherItem.image_;
                    onChanged();
                }
                if (alexaWeatherItem.hasWeatherCode()) {
                    setWeatherCode(alexaWeatherItem.getWeatherCode());
                }
                mergeUnknownFields(((GeneratedMessage) alexaWeatherItem).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<AlexaWeatherItem> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> listBuilder_;
                private java.util.List<AlexaWeatherItem> list_;

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
                    return AlexaProtos.internal_static_AlexaWeatherItem_List_descriptor;
                }

                private RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends AlexaWeatherItem> iterable) {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(AlexaWeatherItem.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return AlexaProtos.internal_static_AlexaWeatherItem_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
                public AlexaWeatherItem getList(int i7) {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AlexaWeatherItem) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
                public java.util.List<AlexaWeatherItem> getListList() {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
                public AlexaWeatherItemOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (AlexaWeatherItemOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
                public java.util.List<? extends AlexaWeatherItemOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AlexaProtos.internal_static_AlexaWeatherItem_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, AlexaWeatherItem alexaWeatherItem) {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, alexaWeatherItem);
                        return this;
                    }
                    alexaWeatherItem.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, alexaWeatherItem);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, AlexaWeatherItem.getDefaultInstance());
                }

                public Builder setList(int i7, AlexaWeatherItem alexaWeatherItem) {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, alexaWeatherItem);
                        return this;
                    }
                    alexaWeatherItem.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, alexaWeatherItem);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(AlexaWeatherItem alexaWeatherItem) {
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(alexaWeatherItem);
                        return this;
                    }
                    alexaWeatherItem.getClass();
                    ensureListIsMutable();
                    this.list_.add(alexaWeatherItem);
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
                    RepeatedFieldBuilderV3<AlexaWeatherItem, Builder, AlexaWeatherItemOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.AlexaProtos$AlexaWeatherItem$List> r1 = com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.AlexaProtos$AlexaWeatherItem$List r3 = (com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.AlexaProtos$AlexaWeatherItem$List r4 = (com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AlexaProtos$AlexaWeatherItem$List$Builder");
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
                return AlexaProtos.internal_static_AlexaWeatherItem_List_descriptor;
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

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
            public AlexaWeatherItem getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
            public java.util.List<AlexaWeatherItem> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
            public AlexaWeatherItemOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItem.ListOrBuilder
            public java.util.List<? extends AlexaWeatherItemOrBuilder> getListOrBuilderList() {
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
                return AlexaProtos.internal_static_AlexaWeatherItem_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((AlexaWeatherItem) codedInputStream.readMessage(AlexaWeatherItem.PARSER, extensionRegistryLite));
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
            AlexaWeatherItem getList(int i7);

            int getListCount();

            java.util.List<AlexaWeatherItem> getListList();

            AlexaWeatherItemOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends AlexaWeatherItemOrBuilder> getListOrBuilderList();
        }

        private AlexaWeatherItem() {
            this.memoizedIsInitialized = (byte) -1;
            this.date_ = "";
            this.weekday_ = "";
            this.highTemperature_ = "";
            this.lowTemperature_ = "";
            this.image_ = "";
            this.weatherCode_ = 0;
        }

        public static AlexaWeatherItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AlexaProtos.internal_static_AlexaWeatherItem_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlexaWeatherItem parseDelimitedFrom(InputStream inputStream) {
            return (AlexaWeatherItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlexaWeatherItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<AlexaWeatherItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlexaWeatherItem)) {
                return super.equals(obj);
            }
            AlexaWeatherItem alexaWeatherItem = (AlexaWeatherItem) obj;
            boolean z6 = hasDate() == alexaWeatherItem.hasDate();
            if (hasDate()) {
                z6 = z6 && getDate().equals(alexaWeatherItem.getDate());
            }
            boolean z7 = z6 && hasWeekday() == alexaWeatherItem.hasWeekday();
            if (hasWeekday()) {
                z7 = z7 && getWeekday().equals(alexaWeatherItem.getWeekday());
            }
            boolean z8 = z7 && hasHighTemperature() == alexaWeatherItem.hasHighTemperature();
            if (hasHighTemperature()) {
                z8 = z8 && getHighTemperature().equals(alexaWeatherItem.getHighTemperature());
            }
            boolean z9 = z8 && hasLowTemperature() == alexaWeatherItem.hasLowTemperature();
            if (hasLowTemperature()) {
                z9 = z9 && getLowTemperature().equals(alexaWeatherItem.getLowTemperature());
            }
            boolean z10 = z9 && hasImage() == alexaWeatherItem.hasImage();
            if (hasImage()) {
                z10 = z10 && getImage().equals(alexaWeatherItem.getImage());
            }
            boolean z11 = z10 && hasWeatherCode() == alexaWeatherItem.hasWeatherCode();
            if (hasWeatherCode()) {
                z11 = z11 && getWeatherCode() == alexaWeatherItem.getWeatherCode();
            }
            return z11 && this.unknownFields.equals(alexaWeatherItem.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public String getDate() {
            Object obj = this.date_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.date_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public ByteString getDateBytes() {
            Object obj = this.date_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.date_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public String getHighTemperature() {
            Object obj = this.highTemperature_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.highTemperature_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public ByteString getHighTemperatureBytes() {
            Object obj = this.highTemperature_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.highTemperature_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public String getImage() {
            Object obj = this.image_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.image_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public ByteString getImageBytes() {
            Object obj = this.image_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.image_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public String getLowTemperature() {
            Object obj = this.lowTemperature_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.lowTemperature_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public ByteString getLowTemperatureBytes() {
            Object obj = this.lowTemperature_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lowTemperature_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlexaWeatherItem> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.date_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.weekday_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.highTemperature_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.lowTemperature_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.image_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(6, this.weatherCode_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public int getWeatherCode() {
            return this.weatherCode_;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public String getWeekday() {
            Object obj = this.weekday_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.weekday_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public ByteString getWeekdayBytes() {
            Object obj = this.weekday_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.weekday_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public boolean hasDate() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public boolean hasHighTemperature() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public boolean hasImage() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public boolean hasLowTemperature() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public boolean hasWeatherCode() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.AlexaProtos.AlexaWeatherItemOrBuilder
        public boolean hasWeekday() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasDate()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getDate().hashCode();
            }
            if (hasWeekday()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getWeekday().hashCode();
            }
            if (hasHighTemperature()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getHighTemperature().hashCode();
            }
            if (hasLowTemperature()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getLowTemperature().hashCode();
            }
            if (hasImage()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getImage().hashCode();
            }
            if (hasWeatherCode()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getWeatherCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AlexaProtos.internal_static_AlexaWeatherItem_fieldAccessorTable.ensureFieldAccessorsInitialized(AlexaWeatherItem.class, Builder.class);
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
            if (!hasDate()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWeekday()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHighTemperature()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLowTemperature()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasImage()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasWeatherCode()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.date_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.weekday_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.highTemperature_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.lowTemperature_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.image_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(6, this.weatherCode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AlexaWeatherItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.date_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.weekday_ = bytes2;
                            } else if (tag == 26) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.highTemperature_ = bytes3;
                            } else if (tag == 34) {
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.lowTemperature_ = bytes4;
                            } else if (tag == 42) {
                                ByteString bytes5 = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.image_ = bytes5;
                            } else if (tag == 48) {
                                this.bitField0_ |= 32;
                                this.weatherCode_ = codedInputStream.readInt32();
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

        public static Builder newBuilder(AlexaWeatherItem alexaWeatherItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alexaWeatherItem);
        }

        public static AlexaWeatherItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaWeatherItem) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaWeatherItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlexaWeatherItem parseFrom(CodedInputStream codedInputStream) {
            return (AlexaWeatherItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlexaWeatherItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private AlexaWeatherItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlexaWeatherItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaWeatherItem) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlexaWeatherItem parseFrom(InputStream inputStream) {
            return (AlexaWeatherItem) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AlexaWeatherItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlexaWeatherItem) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlexaWeatherItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AlexaWeatherItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AlexaWeatherItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlexaWeatherItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AlexaWeatherItemOrBuilder extends MessageOrBuilder {
        String getDate();

        ByteString getDateBytes();

        String getHighTemperature();

        ByteString getHighTemperatureBytes();

        String getImage();

        ByteString getImageBytes();

        String getLowTemperature();

        ByteString getLowTemperatureBytes();

        int getWeatherCode();

        String getWeekday();

        ByteString getWeekdayBytes();

        boolean hasDate();

        boolean hasHighTemperature();

        boolean hasImage();

        boolean hasLowTemperature();

        boolean hasWeatherCode();

        boolean hasWeekday();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010wear_alexa.proto\u001a\fnanopb.proto\"ê\u0001\n\u0005Alexa\u00122\n\u0010instruction_list\u0018\u0001 \u0001(\u000b2\u0016.AlexaInstruction.ListH\u0000\u0012\u001e\n\u0006config\u0018\u0002 \u0001(\u000b2\f.AlexaConfigH\u0000\u0012%\n\nquiet_mode\u0018\u0003 \u0001(\u000b2\u000f.AlexaQuietModeH\u0000\"[\n\u0007AlexaID\u0012\u0019\n\u0015SYNC_INSTRUCTION_LIST\u0010\u0000\u0012\u000e\n\nSET_CONFIG\u0010\u0001\u0012\u000e\n\nGET_CONFIG\u0010\u0002\u0012\u0015\n\u0011REPORT_QUIET_MODE\u0010\u0003B\t\n\u0007payload\"^\n\u000bAlexaConfig\u0012\u0018\n\tclient_id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rrefresh_token\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0017\n\blanguage\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"\u001c\n\u000eAlexaQuietMode\u0012\n\n\u0002on\u0018\u0001 \u0002(\b\"\u008d\u0004\n\u0010AlexaInstruction\u0012%\n\u000bresult_type\u0018\u0001 \u0002(\u000e2\u0010.AlexaResultType\u0012/\n\u0010template_general\u0018\u0002 \u0001(\u000b2\u0015.AlexaTemplateGeneral\u0012/\n\u0010template_weather\u0018\u0003 \u0001(\u000b2\u0015.AlexaTemplateWeather\u0012+\n\u000etemplate_lists\u0018\u0004 \u0001(\u000b2\u0013.AlexaTemplateLists\u0012-\n\u000falerts_setalert\u0018\u0005 \u0001(\u000b2\u0014.AlexaAlertsSetAlert\u0012=\n\u0017speechsynthesizer_speak\u0018\u0006 \u0001(\u000b2\u001c.AlexaSpeechSynthesizerSpeak\u0012%\n\u000bauth_status\u0018\u0007 \u0001(\u000e2\u0010.AlexaAuthStatus\u00129\n\u0013alerts_deletealerts\u0018\f \u0001(\u000b2\u001c.AlexaAlertsDeleteAlert.List\u0012C\n\u001anotifications_setindicator\u0018\r \u0001(\u000b2\u001f.AlexaNotificationsSetIndicator\u001a.\n\u0004List\u0012&\n\u0004list\u0018\u0001 \u0003(\u000b2\u0011.AlexaInstructionB\u0005\u0092?\u0002\u0018\u0004\"G\n\u0014AlexaTemplateGeneral\u0012\u001a\n\u0005title\u0018\u0001 \u0002(\u000b2\u000b.AlexaTitle\u0012\u0013\n\u0004text\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"\u008c\u0002\n\u0014AlexaTemplateWeather\u0012\u001a\n\u0005title\u0018\u0001 \u0002(\u000b2\u000b.AlexaTitle\u0012\u001e\n\u000fcurrent_weather\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bdescription\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010high_temperature\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001e\n\u000flow_temperature\u0018\u0005 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005image\u0018\u0006 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012/\n\u000fweatherForecast\u0018\u0007 \u0002(\u000b2\u0016.AlexaWeatherItem.List\u0012\u0014\n\fweather_code\u0018\b \u0002(\u0005\"Ü\u0001\n\u0010AlexaWeatherItem\u0012\u0013\n\u0004date\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0016\n\u0007weekday\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010high_temperature\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001e\n\u000flow_temperature\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005image\u0018\u0005 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\fweather_code\u0018\u0006 \u0002(\u0005\u001a.\n\u0004List\u0012&\n\u0004list\u0018\u0001 \u0003(\u000b2\u0011.AlexaWeatherItemB\u0005\u0092?\u0002\u0018\u0004\"o\n\u0012AlexaTemplateLists\u0012\u001a\n\u0005title\u0018\u0001 \u0002(\u000b2\u000b.AlexaTitle\u0012#\n\u0005items\u0018\u0002 \u0002(\u000b2\u0014.AlexaListsItem.List\u0012\u0018\n\u0010exceed_max_items\u0018\u0003 \u0002(\b\"i\n\u000eAlexaListsItem\u0012\u0013\n\u0004left\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005right\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001a,\n\u0004List\u0012$\n\u0004list\u0018\u0001 \u0003(\u000b2\u000f.AlexaListsItemB\u0005\u0092?\u0002\u0018\u0004\"~\n\u0013AlexaAlertsSetAlert\u0012\u0014\n\u0005token\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001d\n\u0004type\u0018\u0002 \u0002(\u000e2\u000f.AlexaAlertType\u0012\u001c\n\rscheduledTime\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005label\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"d\n\u0016AlexaAlertsDeleteAlert\u0012\u0014\n\u0005token\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001a4\n\u0004List\u0012,\n\u0004list\u0018\u0001 \u0003(\u000b2\u0017.AlexaAlertsDeleteAlertB\u0005\u0092?\u0002\u0018\u0004\"2\n\u001bAlexaSpeechSynthesizerSpeak\u0012\u0013\n\u0004text\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"A\n\nAlexaTitle\u0012\u0019\n\nmain_title\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tsub_title\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"\\\n\u001eAlexaNotificationsSetIndicator\u0012\u001a\n\u0012playAudioIndicator\u0018\u0001 \u0002(\b\u0012\u001e\n\u0016persistVisualIndicator\u0018\u0002 \u0002(\b*ù\u0004\n\u000fAlexaResultType\u0012\u0019\n\u0015ALEXA_START_LISTENING\u0010\u0000\u0012\u0017\n\u0013ALEXA_END_LISTENING\u0010\u0001\u0012\u0015\n\u0011ALEXA_AUTH_STATUS\u0010\u0003\u0012\u0017\n\u0013ALEXA_ERROR_NETWORK\u0010P\u0012\u0014\n\u0010ALEXA_ERROR_AUTH\u0010Q\u0012 \n\u001cALEXA_ERROR_CONTENT_TOO_LONG\u0010R\u0012%\n!ALEXA_ERROR_UNRECOGNIZABLE_SPEECH\u0010S\u0012 \n\u001cALEXA_ERROR_UNSUPPORTED_AREA\u0010T\u0012&\n\"ALEXA_ERROR_IOS_DEVICE_NOT_SUPPORT\u0010U\u0012*\n&ALEXA_ERROR_ANDROID_DEVICE_NOT_SUPPORT\u0010V\u0012\u001b\n\u0016ALEXA_TEMPLATE_GENERAL\u0010\u0081\u0002\u0012\u001b\n\u0016ALEXA_TEMPLATE_WEATHER\u0010\u0082\u0002\u0012\u0019\n\u0014ALEXA_TEMPLATE_LISTS\u0010\u0083\u0002\u0012\u001a\n\u0015ALEXA_ALERTS_SETALERT\u0010\u0084\u0002\u0012\u001e\n\u0019ALEXA_ALERTS_DELETEALERTS\u0010\u0085\u0002\u0012\"\n\u001dALEXA_SPEECHSYNTHESIZER_SPEAK\u0010\u0086\u0002\u0012(\n#ALEXA_SPEECHRECOGNIZER_EXPECTSPEECH\u0010\u0087\u0002\u0012%\n ALEXA_NOTIFICATIONS_SETINDICATOR\u0010\u0088\u0002\u0012'\n\"ALEXA_NOTIFICATIONS_CLEARINDICATOR\u0010\u0089\u0002*l\n\u000eAlexaAlertType\u0012$\n\u0017ALEXA_AlertType_UNKNOWN\u0010ÿÿÿÿÿÿÿÿÿ\u0001\u0012\u000f\n\u000bALEXA_ALARM\u0010\u0000\u0012\u0012\n\u000eALEXA_REMINDER\u0010\u0001\u0012\u000f\n\u000bALEXA_TIMER\u0010\u0002*4\n\u000fAlexaAuthStatus\u0012\u000e\n\nALEXA_AUTH\u0010\u0000\u0012\u0011\n\rALEXA_NO_AUTH\u0010\u0001B#\n\u0014com.zh.wear.protobufB\u000bAlexaProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.AlexaProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = AlexaProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Alexa_descriptor = descriptor2;
        internal_static_Alexa_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"InstructionList", "Config", "QuietMode", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_AlexaConfig_descriptor = descriptor3;
        internal_static_AlexaConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ClientId", PersistedInstallation.f99831f, "Language"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_AlexaQuietMode_descriptor = descriptor4;
        internal_static_AlexaQuietMode_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"On"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_AlexaInstruction_descriptor = descriptor5;
        internal_static_AlexaInstruction_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ResultType", "TemplateGeneral", "TemplateWeather", "TemplateLists", "AlertsSetalert", "SpeechsynthesizerSpeak", "AuthStatus", "AlertsDeletealerts", "NotificationsSetindicator"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_AlexaInstruction_List_descriptor = descriptor6;
        internal_static_AlexaInstruction_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(4);
        internal_static_AlexaTemplateGeneral_descriptor = descriptor7;
        internal_static_AlexaTemplateGeneral_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Title", "Text"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(5);
        internal_static_AlexaTemplateWeather_descriptor = descriptor8;
        internal_static_AlexaTemplateWeather_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Title", "CurrentWeather", "Description", "HighTemperature", "LowTemperature", "Image", "WeatherForecast", "WeatherCode"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(6);
        internal_static_AlexaWeatherItem_descriptor = descriptor9;
        internal_static_AlexaWeatherItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{HttpHeaders.f97097d, "Weekday", "HighTemperature", "LowTemperature", "Image", "WeatherCode"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        internal_static_AlexaWeatherItem_List_descriptor = descriptor10;
        internal_static_AlexaWeatherItem_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(7);
        internal_static_AlexaTemplateLists_descriptor = descriptor11;
        internal_static_AlexaTemplateLists_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Title", "Items", "ExceedMaxItems"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(8);
        internal_static_AlexaListsItem_descriptor = descriptor12;
        internal_static_AlexaListsItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Left", "Right"});
        Descriptors.Descriptor descriptor13 = descriptor12.getNestedTypes().get(0);
        internal_static_AlexaListsItem_List_descriptor = descriptor13;
        internal_static_AlexaListsItem_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(9);
        internal_static_AlexaAlertsSetAlert_descriptor = descriptor14;
        internal_static_AlexaAlertsSetAlert_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{Token.f5084b, "Type", "ScheduledTime", "Label"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(10);
        internal_static_AlexaAlertsDeleteAlert_descriptor = descriptor15;
        internal_static_AlexaAlertsDeleteAlert_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{Token.f5084b});
        Descriptors.Descriptor descriptor16 = descriptor15.getNestedTypes().get(0);
        internal_static_AlexaAlertsDeleteAlert_List_descriptor = descriptor16;
        internal_static_AlexaAlertsDeleteAlert_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(11);
        internal_static_AlexaSpeechSynthesizerSpeak_descriptor = descriptor17;
        internal_static_AlexaSpeechSynthesizerSpeak_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Text"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(12);
        internal_static_AlexaTitle_descriptor = descriptor18;
        internal_static_AlexaTitle_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"MainTitle", "SubTitle"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(13);
        internal_static_AlexaNotificationsSetIndicator_descriptor = descriptor19;
        internal_static_AlexaNotificationsSetIndicator_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"PlayAudioIndicator", "PersistVisualIndicator"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private AlexaProtos() {
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