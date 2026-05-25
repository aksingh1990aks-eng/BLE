package com.zh.wear.protobuf;

import androidx.browser.trusted.Token;
import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.huawei.hms.network.embedded.y3;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class AccountProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_Account_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Account_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BindInfoV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BindInfoV2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BindInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BindInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BindOOBRequestV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BindOOBRequestV2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BindOOBResponseV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BindOOBResponseV2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BindResultV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BindResultV2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BindResult_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BindResult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BindVerifyRequestV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BindVerifyRequestV2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_BindVerifyResponseV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BindVerifyResponseV2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CompanionDevice_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CompanionDevice_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ConnectConfirmRequestV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ConnectConfirmRequestV2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ConnectConfirmResponseV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ConnectConfirmResponseV2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ConnectVerifyRequestV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ConnectVerifyRequestV2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ConnectVerifyResponseV2_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ConnectVerifyResponseV2_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.AccountProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase;

        static {
            int[] iArr = new int[Account.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase = iArr;
            try {
                iArr[Account.PayloadCase.BIND_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.BIND_KEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.ERROR_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.BIND_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.BIND_RESULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.LOGIN_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.VERIFY_KEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.VERIFY_RESULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.BIND_INFO_V2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.BIND_VERIFY_REQUEST_V2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.BIND_VERIFY_RESPONSE_V2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.BIND_OOB_REQUEST_V2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.BIND_OOB_RESPONSE_V2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.BIND_RESULT_V2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.CONNECT_VERIFY_REQUEST_V2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.CONNECT_VERIFY_RESPONSE_V2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.CONNECT_CONFIRM_REQUEST_V2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.CONNECT_CONFIRM_RESPONSE_V2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[Account.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public static final class Account extends GeneratedMessageV3 implements AccountOrBuilder {
        public static final int BIND_INFO_FIELD_NUMBER = 4;
        public static final int BIND_INFO_V2_FIELD_NUMBER = 11;
        public static final int BIND_KEY_FIELD_NUMBER = 2;
        public static final int BIND_OOB_REQUEST_V2_FIELD_NUMBER = 15;
        public static final int BIND_OOB_RESPONSE_V2_FIELD_NUMBER = 16;
        public static final int BIND_RESULT_FIELD_NUMBER = 5;
        public static final int BIND_RESULT_V2_FIELD_NUMBER = 17;
        public static final int BIND_STATUS_FIELD_NUMBER = 1;
        public static final int BIND_VERIFY_REQUEST_V2_FIELD_NUMBER = 12;
        public static final int BIND_VERIFY_RESPONSE_V2_FIELD_NUMBER = 13;
        public static final int CONNECT_CONFIRM_REQUEST_V2_FIELD_NUMBER = 20;
        public static final int CONNECT_CONFIRM_RESPONSE_V2_FIELD_NUMBER = 21;
        public static final int CONNECT_VERIFY_REQUEST_V2_FIELD_NUMBER = 18;
        public static final int CONNECT_VERIFY_RESPONSE_V2_FIELD_NUMBER = 19;
        public static final int ERROR_CODE_FIELD_NUMBER = 3;
        public static final int LOGIN_STATUS_FIELD_NUMBER = 6;
        public static final int VERIFY_KEY_FIELD_NUMBER = 7;
        public static final int VERIFY_RESULT_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final Account DEFAULT_INSTANCE = new Account();

        @Deprecated
        public static final Parser<Account> PARSER = new AbstractParser<Account>() { // from class: com.zh.wear.protobuf.AccountProtos.Account.1
            @Override // com.google.protobuf.Parser
            public Account parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Account(codedInputStream, extensionRegistryLite);
            }
        };

        public enum AccountID implements ProtocolMessageEnum {
            BIND_STATUS(0),
            BIND_START(1),
            BIND_RESULT(2),
            LOGIN_STATUS(3),
            LOGIN_START(4),
            ACCOUNT_VERIFY(5),
            BIND_START_V2(17),
            BIND_VERIFY_V2(18),
            BIND_OOB_V2(19),
            BIND_RESULT_V2(20),
            CONNECT_VERIFY_V2(21),
            CONNECT_CONFIRM_V2(22);

            public static final int ACCOUNT_VERIFY_VALUE = 5;
            public static final int BIND_OOB_V2_VALUE = 19;
            public static final int BIND_RESULT_V2_VALUE = 20;
            public static final int BIND_RESULT_VALUE = 2;
            public static final int BIND_START_V2_VALUE = 17;
            public static final int BIND_START_VALUE = 1;
            public static final int BIND_STATUS_VALUE = 0;
            public static final int BIND_VERIFY_V2_VALUE = 18;
            public static final int CONNECT_CONFIRM_V2_VALUE = 22;
            public static final int CONNECT_VERIFY_V2_VALUE = 21;
            public static final int LOGIN_START_VALUE = 4;
            public static final int LOGIN_STATUS_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<AccountID> internalValueMap = new Internal.EnumLiteMap<AccountID>() { // from class: com.zh.wear.protobuf.AccountProtos.Account.AccountID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public AccountID findValueByNumber(int i7) {
                    return AccountID.forNumber(i7);
                }
            };
            private static final AccountID[] VALUES = values();

            AccountID(int i7) {
                this.value = i7;
            }

            public static AccountID forNumber(int i7) {
                if (i7 == 0) {
                    return BIND_STATUS;
                }
                if (i7 == 1) {
                    return BIND_START;
                }
                if (i7 == 2) {
                    return BIND_RESULT;
                }
                if (i7 == 3) {
                    return LOGIN_STATUS;
                }
                if (i7 == 4) {
                    return LOGIN_START;
                }
                if (i7 == 5) {
                    return ACCOUNT_VERIFY;
                }
                switch (i7) {
                    case 17:
                        return BIND_START_V2;
                    case 18:
                        return BIND_VERIFY_V2;
                    case 19:
                        return BIND_OOB_V2;
                    case 20:
                        return BIND_RESULT_V2;
                    case 21:
                        return CONNECT_VERIFY_V2;
                    case 22:
                        return CONNECT_CONFIRM_V2;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Account.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<AccountID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static AccountID valueOf(int i7) {
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

            public static AccountID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccountOrBuilder {
            private SingleFieldBuilderV3<BindInfo, BindInfo.Builder, BindInfoOrBuilder> bindInfoBuilder_;
            private SingleFieldBuilderV3<BindInfoV2, BindInfoV2.Builder, BindInfoV2OrBuilder> bindInfoV2Builder_;
            private SingleFieldBuilderV3<BindOOBRequestV2, BindOOBRequestV2.Builder, BindOOBRequestV2OrBuilder> bindOobRequestV2Builder_;
            private SingleFieldBuilderV3<BindOOBResponseV2, BindOOBResponseV2.Builder, BindOOBResponseV2OrBuilder> bindOobResponseV2Builder_;
            private SingleFieldBuilderV3<BindResult, BindResult.Builder, BindResultOrBuilder> bindResultBuilder_;
            private SingleFieldBuilderV3<BindResultV2, BindResultV2.Builder, BindResultV2OrBuilder> bindResultV2Builder_;
            private SingleFieldBuilderV3<BindVerifyRequestV2, BindVerifyRequestV2.Builder, BindVerifyRequestV2OrBuilder> bindVerifyRequestV2Builder_;
            private SingleFieldBuilderV3<BindVerifyResponseV2, BindVerifyResponseV2.Builder, BindVerifyResponseV2OrBuilder> bindVerifyResponseV2Builder_;
            private int bitField0_;
            private SingleFieldBuilderV3<ConnectConfirmRequestV2, ConnectConfirmRequestV2.Builder, ConnectConfirmRequestV2OrBuilder> connectConfirmRequestV2Builder_;
            private SingleFieldBuilderV3<ConnectConfirmResponseV2, ConnectConfirmResponseV2.Builder, ConnectConfirmResponseV2OrBuilder> connectConfirmResponseV2Builder_;
            private SingleFieldBuilderV3<ConnectVerifyRequestV2, ConnectVerifyRequestV2.Builder, ConnectVerifyRequestV2OrBuilder> connectVerifyRequestV2Builder_;
            private SingleFieldBuilderV3<ConnectVerifyResponseV2, ConnectVerifyResponseV2.Builder, ConnectVerifyResponseV2OrBuilder> connectVerifyResponseV2Builder_;
            private int payloadCase_;
            private Object payload_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<BindInfo, BindInfo.Builder, BindInfoOrBuilder> getBindInfoFieldBuilder() {
                if (this.bindInfoBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = BindInfo.getDefaultInstance();
                    }
                    this.bindInfoBuilder_ = new SingleFieldBuilderV3<>((BindInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.bindInfoBuilder_;
            }

            private SingleFieldBuilderV3<BindInfoV2, BindInfoV2.Builder, BindInfoV2OrBuilder> getBindInfoV2FieldBuilder() {
                if (this.bindInfoV2Builder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = BindInfoV2.getDefaultInstance();
                    }
                    this.bindInfoV2Builder_ = new SingleFieldBuilderV3<>((BindInfoV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.bindInfoV2Builder_;
            }

            private SingleFieldBuilderV3<BindOOBRequestV2, BindOOBRequestV2.Builder, BindOOBRequestV2OrBuilder> getBindOobRequestV2FieldBuilder() {
                if (this.bindOobRequestV2Builder_ == null) {
                    if (this.payloadCase_ != 15) {
                        this.payload_ = BindOOBRequestV2.getDefaultInstance();
                    }
                    this.bindOobRequestV2Builder_ = new SingleFieldBuilderV3<>((BindOOBRequestV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 15;
                onChanged();
                return this.bindOobRequestV2Builder_;
            }

            private SingleFieldBuilderV3<BindOOBResponseV2, BindOOBResponseV2.Builder, BindOOBResponseV2OrBuilder> getBindOobResponseV2FieldBuilder() {
                if (this.bindOobResponseV2Builder_ == null) {
                    if (this.payloadCase_ != 16) {
                        this.payload_ = BindOOBResponseV2.getDefaultInstance();
                    }
                    this.bindOobResponseV2Builder_ = new SingleFieldBuilderV3<>((BindOOBResponseV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 16;
                onChanged();
                return this.bindOobResponseV2Builder_;
            }

            private SingleFieldBuilderV3<BindResult, BindResult.Builder, BindResultOrBuilder> getBindResultFieldBuilder() {
                if (this.bindResultBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = BindResult.getDefaultInstance();
                    }
                    this.bindResultBuilder_ = new SingleFieldBuilderV3<>((BindResult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.bindResultBuilder_;
            }

            private SingleFieldBuilderV3<BindResultV2, BindResultV2.Builder, BindResultV2OrBuilder> getBindResultV2FieldBuilder() {
                if (this.bindResultV2Builder_ == null) {
                    if (this.payloadCase_ != 17) {
                        this.payload_ = BindResultV2.getDefaultInstance();
                    }
                    this.bindResultV2Builder_ = new SingleFieldBuilderV3<>((BindResultV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 17;
                onChanged();
                return this.bindResultV2Builder_;
            }

            private SingleFieldBuilderV3<BindVerifyRequestV2, BindVerifyRequestV2.Builder, BindVerifyRequestV2OrBuilder> getBindVerifyRequestV2FieldBuilder() {
                if (this.bindVerifyRequestV2Builder_ == null) {
                    if (this.payloadCase_ != 12) {
                        this.payload_ = BindVerifyRequestV2.getDefaultInstance();
                    }
                    this.bindVerifyRequestV2Builder_ = new SingleFieldBuilderV3<>((BindVerifyRequestV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 12;
                onChanged();
                return this.bindVerifyRequestV2Builder_;
            }

            private SingleFieldBuilderV3<BindVerifyResponseV2, BindVerifyResponseV2.Builder, BindVerifyResponseV2OrBuilder> getBindVerifyResponseV2FieldBuilder() {
                if (this.bindVerifyResponseV2Builder_ == null) {
                    if (this.payloadCase_ != 13) {
                        this.payload_ = BindVerifyResponseV2.getDefaultInstance();
                    }
                    this.bindVerifyResponseV2Builder_ = new SingleFieldBuilderV3<>((BindVerifyResponseV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 13;
                onChanged();
                return this.bindVerifyResponseV2Builder_;
            }

            private SingleFieldBuilderV3<ConnectConfirmRequestV2, ConnectConfirmRequestV2.Builder, ConnectConfirmRequestV2OrBuilder> getConnectConfirmRequestV2FieldBuilder() {
                if (this.connectConfirmRequestV2Builder_ == null) {
                    if (this.payloadCase_ != 20) {
                        this.payload_ = ConnectConfirmRequestV2.getDefaultInstance();
                    }
                    this.connectConfirmRequestV2Builder_ = new SingleFieldBuilderV3<>((ConnectConfirmRequestV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 20;
                onChanged();
                return this.connectConfirmRequestV2Builder_;
            }

            private SingleFieldBuilderV3<ConnectConfirmResponseV2, ConnectConfirmResponseV2.Builder, ConnectConfirmResponseV2OrBuilder> getConnectConfirmResponseV2FieldBuilder() {
                if (this.connectConfirmResponseV2Builder_ == null) {
                    if (this.payloadCase_ != 21) {
                        this.payload_ = ConnectConfirmResponseV2.getDefaultInstance();
                    }
                    this.connectConfirmResponseV2Builder_ = new SingleFieldBuilderV3<>((ConnectConfirmResponseV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 21;
                onChanged();
                return this.connectConfirmResponseV2Builder_;
            }

            private SingleFieldBuilderV3<ConnectVerifyRequestV2, ConnectVerifyRequestV2.Builder, ConnectVerifyRequestV2OrBuilder> getConnectVerifyRequestV2FieldBuilder() {
                if (this.connectVerifyRequestV2Builder_ == null) {
                    if (this.payloadCase_ != 18) {
                        this.payload_ = ConnectVerifyRequestV2.getDefaultInstance();
                    }
                    this.connectVerifyRequestV2Builder_ = new SingleFieldBuilderV3<>((ConnectVerifyRequestV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 18;
                onChanged();
                return this.connectVerifyRequestV2Builder_;
            }

            private SingleFieldBuilderV3<ConnectVerifyResponseV2, ConnectVerifyResponseV2.Builder, ConnectVerifyResponseV2OrBuilder> getConnectVerifyResponseV2FieldBuilder() {
                if (this.connectVerifyResponseV2Builder_ == null) {
                    if (this.payloadCase_ != 19) {
                        this.payload_ = ConnectVerifyResponseV2.getDefaultInstance();
                    }
                    this.connectVerifyResponseV2Builder_ = new SingleFieldBuilderV3<>((ConnectVerifyResponseV2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 19;
                onChanged();
                return this.connectVerifyResponseV2Builder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_Account_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearBindInfo() {
                SingleFieldBuilderV3<BindInfo, BindInfo.Builder, BindInfoOrBuilder> singleFieldBuilderV3 = this.bindInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearBindInfoV2() {
                SingleFieldBuilderV3<BindInfoV2, BindInfoV2.Builder, BindInfoV2OrBuilder> singleFieldBuilderV3 = this.bindInfoV2Builder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearBindKey() {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearBindOobRequestV2() {
                SingleFieldBuilderV3<BindOOBRequestV2, BindOOBRequestV2.Builder, BindOOBRequestV2OrBuilder> singleFieldBuilderV3 = this.bindOobRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearBindOobResponseV2() {
                SingleFieldBuilderV3<BindOOBResponseV2, BindOOBResponseV2.Builder, BindOOBResponseV2OrBuilder> singleFieldBuilderV3 = this.bindOobResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearBindResult() {
                SingleFieldBuilderV3<BindResult, BindResult.Builder, BindResultOrBuilder> singleFieldBuilderV3 = this.bindResultBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearBindResultV2() {
                SingleFieldBuilderV3<BindResultV2, BindResultV2.Builder, BindResultV2OrBuilder> singleFieldBuilderV3 = this.bindResultV2Builder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearBindStatus() {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearBindVerifyRequestV2() {
                SingleFieldBuilderV3<BindVerifyRequestV2, BindVerifyRequestV2.Builder, BindVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearBindVerifyResponseV2() {
                SingleFieldBuilderV3<BindVerifyResponseV2, BindVerifyResponseV2.Builder, BindVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearConnectConfirmRequestV2() {
                SingleFieldBuilderV3<ConnectConfirmRequestV2, ConnectConfirmRequestV2.Builder, ConnectConfirmRequestV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearConnectConfirmResponseV2() {
                SingleFieldBuilderV3<ConnectConfirmResponseV2, ConnectConfirmResponseV2.Builder, ConnectConfirmResponseV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 21) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 21) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearConnectVerifyRequestV2() {
                SingleFieldBuilderV3<ConnectVerifyRequestV2, ConnectVerifyRequestV2.Builder, ConnectVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearConnectVerifyResponseV2() {
                SingleFieldBuilderV3<ConnectVerifyResponseV2, ConnectVerifyResponseV2.Builder, ConnectVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearErrorCode() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearLoginStatus() {
                if (this.payloadCase_ == 6) {
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

            public Builder clearVerifyKey() {
                if (this.payloadCase_ == 7) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearVerifyResult() {
                if (this.payloadCase_ == 8) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindInfo getBindInfo() {
                Object message;
                SingleFieldBuilderV3<BindInfo, BindInfo.Builder, BindInfoOrBuilder> singleFieldBuilderV3 = this.bindInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 4) {
                        return BindInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 4) {
                        return BindInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BindInfo) message;
            }

            public BindInfo.Builder getBindInfoBuilder() {
                return (BindInfo.Builder) getBindInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindInfoOrBuilder getBindInfoOrBuilder() {
                SingleFieldBuilderV3<BindInfo, BindInfo.Builder, BindInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilderV3 = this.bindInfoBuilder_) == null) ? i7 == 4 ? (BindInfo) this.payload_ : BindInfo.getDefaultInstance() : (BindInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindInfoV2 getBindInfoV2() {
                Object message;
                SingleFieldBuilderV3<BindInfoV2, BindInfoV2.Builder, BindInfoV2OrBuilder> singleFieldBuilderV3 = this.bindInfoV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 11) {
                        return BindInfoV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 11) {
                        return BindInfoV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BindInfoV2) message;
            }

            public BindInfoV2.Builder getBindInfoV2Builder() {
                return (BindInfoV2.Builder) getBindInfoV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindInfoV2OrBuilder getBindInfoV2OrBuilder() {
                SingleFieldBuilderV3<BindInfoV2, BindInfoV2.Builder, BindInfoV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilderV3 = this.bindInfoV2Builder_) == null) ? i7 == 11 ? (BindInfoV2) this.payload_ : BindInfoV2.getDefaultInstance() : (BindInfoV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public String getBindKey() {
                String str = this.payloadCase_ == 2 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 2 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ByteString getBindKeyBytes() {
                String str = this.payloadCase_ == 2 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 2) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindOOBRequestV2 getBindOobRequestV2() {
                Object message;
                SingleFieldBuilderV3<BindOOBRequestV2, BindOOBRequestV2.Builder, BindOOBRequestV2OrBuilder> singleFieldBuilderV3 = this.bindOobRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 15) {
                        return BindOOBRequestV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 15) {
                        return BindOOBRequestV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BindOOBRequestV2) message;
            }

            public BindOOBRequestV2.Builder getBindOobRequestV2Builder() {
                return (BindOOBRequestV2.Builder) getBindOobRequestV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindOOBRequestV2OrBuilder getBindOobRequestV2OrBuilder() {
                SingleFieldBuilderV3<BindOOBRequestV2, BindOOBRequestV2.Builder, BindOOBRequestV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 15 || (singleFieldBuilderV3 = this.bindOobRequestV2Builder_) == null) ? i7 == 15 ? (BindOOBRequestV2) this.payload_ : BindOOBRequestV2.getDefaultInstance() : (BindOOBRequestV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindOOBResponseV2 getBindOobResponseV2() {
                Object message;
                SingleFieldBuilderV3<BindOOBResponseV2, BindOOBResponseV2.Builder, BindOOBResponseV2OrBuilder> singleFieldBuilderV3 = this.bindOobResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 16) {
                        return BindOOBResponseV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 16) {
                        return BindOOBResponseV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BindOOBResponseV2) message;
            }

            public BindOOBResponseV2.Builder getBindOobResponseV2Builder() {
                return (BindOOBResponseV2.Builder) getBindOobResponseV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindOOBResponseV2OrBuilder getBindOobResponseV2OrBuilder() {
                SingleFieldBuilderV3<BindOOBResponseV2, BindOOBResponseV2.Builder, BindOOBResponseV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 16 || (singleFieldBuilderV3 = this.bindOobResponseV2Builder_) == null) ? i7 == 16 ? (BindOOBResponseV2) this.payload_ : BindOOBResponseV2.getDefaultInstance() : (BindOOBResponseV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindResult getBindResult() {
                Object message;
                SingleFieldBuilderV3<BindResult, BindResult.Builder, BindResultOrBuilder> singleFieldBuilderV3 = this.bindResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 5) {
                        return BindResult.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 5) {
                        return BindResult.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BindResult) message;
            }

            public BindResult.Builder getBindResultBuilder() {
                return (BindResult.Builder) getBindResultFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindResultOrBuilder getBindResultOrBuilder() {
                SingleFieldBuilderV3<BindResult, BindResult.Builder, BindResultOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilderV3 = this.bindResultBuilder_) == null) ? i7 == 5 ? (BindResult) this.payload_ : BindResult.getDefaultInstance() : (BindResultOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindResultV2 getBindResultV2() {
                Object message;
                SingleFieldBuilderV3<BindResultV2, BindResultV2.Builder, BindResultV2OrBuilder> singleFieldBuilderV3 = this.bindResultV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 17) {
                        return BindResultV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 17) {
                        return BindResultV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BindResultV2) message;
            }

            public BindResultV2.Builder getBindResultV2Builder() {
                return (BindResultV2.Builder) getBindResultV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindResultV2OrBuilder getBindResultV2OrBuilder() {
                SingleFieldBuilderV3<BindResultV2, BindResultV2.Builder, BindResultV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 17 || (singleFieldBuilderV3 = this.bindResultV2Builder_) == null) ? i7 == 17 ? (BindResultV2) this.payload_ : BindResultV2.getDefaultInstance() : (BindResultV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean getBindStatus() {
                if (this.payloadCase_ == 1) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindVerifyRequestV2 getBindVerifyRequestV2() {
                Object message;
                SingleFieldBuilderV3<BindVerifyRequestV2, BindVerifyRequestV2.Builder, BindVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 12) {
                        return BindVerifyRequestV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 12) {
                        return BindVerifyRequestV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BindVerifyRequestV2) message;
            }

            public BindVerifyRequestV2.Builder getBindVerifyRequestV2Builder() {
                return (BindVerifyRequestV2.Builder) getBindVerifyRequestV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindVerifyRequestV2OrBuilder getBindVerifyRequestV2OrBuilder() {
                SingleFieldBuilderV3<BindVerifyRequestV2, BindVerifyRequestV2.Builder, BindVerifyRequestV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 12 || (singleFieldBuilderV3 = this.bindVerifyRequestV2Builder_) == null) ? i7 == 12 ? (BindVerifyRequestV2) this.payload_ : BindVerifyRequestV2.getDefaultInstance() : (BindVerifyRequestV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindVerifyResponseV2 getBindVerifyResponseV2() {
                Object message;
                SingleFieldBuilderV3<BindVerifyResponseV2, BindVerifyResponseV2.Builder, BindVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 13) {
                        return BindVerifyResponseV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 13) {
                        return BindVerifyResponseV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (BindVerifyResponseV2) message;
            }

            public BindVerifyResponseV2.Builder getBindVerifyResponseV2Builder() {
                return (BindVerifyResponseV2.Builder) getBindVerifyResponseV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public BindVerifyResponseV2OrBuilder getBindVerifyResponseV2OrBuilder() {
                SingleFieldBuilderV3<BindVerifyResponseV2, BindVerifyResponseV2.Builder, BindVerifyResponseV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 13 || (singleFieldBuilderV3 = this.bindVerifyResponseV2Builder_) == null) ? i7 == 13 ? (BindVerifyResponseV2) this.payload_ : BindVerifyResponseV2.getDefaultInstance() : (BindVerifyResponseV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ConnectConfirmRequestV2 getConnectConfirmRequestV2() {
                Object message;
                SingleFieldBuilderV3<ConnectConfirmRequestV2, ConnectConfirmRequestV2.Builder, ConnectConfirmRequestV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 20) {
                        return ConnectConfirmRequestV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 20) {
                        return ConnectConfirmRequestV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ConnectConfirmRequestV2) message;
            }

            public ConnectConfirmRequestV2.Builder getConnectConfirmRequestV2Builder() {
                return (ConnectConfirmRequestV2.Builder) getConnectConfirmRequestV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ConnectConfirmRequestV2OrBuilder getConnectConfirmRequestV2OrBuilder() {
                SingleFieldBuilderV3<ConnectConfirmRequestV2, ConnectConfirmRequestV2.Builder, ConnectConfirmRequestV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 20 || (singleFieldBuilderV3 = this.connectConfirmRequestV2Builder_) == null) ? i7 == 20 ? (ConnectConfirmRequestV2) this.payload_ : ConnectConfirmRequestV2.getDefaultInstance() : (ConnectConfirmRequestV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ConnectConfirmResponseV2 getConnectConfirmResponseV2() {
                Object message;
                SingleFieldBuilderV3<ConnectConfirmResponseV2, ConnectConfirmResponseV2.Builder, ConnectConfirmResponseV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 21) {
                        return ConnectConfirmResponseV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 21) {
                        return ConnectConfirmResponseV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ConnectConfirmResponseV2) message;
            }

            public ConnectConfirmResponseV2.Builder getConnectConfirmResponseV2Builder() {
                return (ConnectConfirmResponseV2.Builder) getConnectConfirmResponseV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ConnectConfirmResponseV2OrBuilder getConnectConfirmResponseV2OrBuilder() {
                SingleFieldBuilderV3<ConnectConfirmResponseV2, ConnectConfirmResponseV2.Builder, ConnectConfirmResponseV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 21 || (singleFieldBuilderV3 = this.connectConfirmResponseV2Builder_) == null) ? i7 == 21 ? (ConnectConfirmResponseV2) this.payload_ : ConnectConfirmResponseV2.getDefaultInstance() : (ConnectConfirmResponseV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ConnectVerifyRequestV2 getConnectVerifyRequestV2() {
                Object message;
                SingleFieldBuilderV3<ConnectVerifyRequestV2, ConnectVerifyRequestV2.Builder, ConnectVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 18) {
                        return ConnectVerifyRequestV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 18) {
                        return ConnectVerifyRequestV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ConnectVerifyRequestV2) message;
            }

            public ConnectVerifyRequestV2.Builder getConnectVerifyRequestV2Builder() {
                return (ConnectVerifyRequestV2.Builder) getConnectVerifyRequestV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ConnectVerifyRequestV2OrBuilder getConnectVerifyRequestV2OrBuilder() {
                SingleFieldBuilderV3<ConnectVerifyRequestV2, ConnectVerifyRequestV2.Builder, ConnectVerifyRequestV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 18 || (singleFieldBuilderV3 = this.connectVerifyRequestV2Builder_) == null) ? i7 == 18 ? (ConnectVerifyRequestV2) this.payload_ : ConnectVerifyRequestV2.getDefaultInstance() : (ConnectVerifyRequestV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ConnectVerifyResponseV2 getConnectVerifyResponseV2() {
                Object message;
                SingleFieldBuilderV3<ConnectVerifyResponseV2, ConnectVerifyResponseV2.Builder, ConnectVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 19) {
                        return ConnectVerifyResponseV2.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 19) {
                        return ConnectVerifyResponseV2.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ConnectVerifyResponseV2) message;
            }

            public ConnectVerifyResponseV2.Builder getConnectVerifyResponseV2Builder() {
                return (ConnectVerifyResponseV2.Builder) getConnectVerifyResponseV2FieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ConnectVerifyResponseV2OrBuilder getConnectVerifyResponseV2OrBuilder() {
                SingleFieldBuilderV3<ConnectVerifyResponseV2, ConnectVerifyResponseV2.Builder, ConnectVerifyResponseV2OrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 19 || (singleFieldBuilderV3 = this.connectVerifyResponseV2Builder_) == null) ? i7 == 19 ? (ConnectVerifyResponseV2) this.payload_ : ConnectVerifyResponseV2.getDefaultInstance() : (ConnectVerifyResponseV2OrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_Account_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ErrorCode getErrorCode() {
                ErrorCode errorCodeValueOf;
                return (this.payloadCase_ != 3 || (errorCodeValueOf = ErrorCode.valueOf(((Integer) this.payload_).intValue())) == null) ? ErrorCode.NO_ERROR : errorCodeValueOf;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean getLoginStatus() {
                if (this.payloadCase_ == 6) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public String getVerifyKey() {
                String str = this.payloadCase_ == 7 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 7 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public ByteString getVerifyKeyBytes() {
                String str = this.payloadCase_ == 7 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 7) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean getVerifyResult() {
                if (this.payloadCase_ == 8) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindInfo() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindInfoV2() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindKey() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindOobRequestV2() {
                return this.payloadCase_ == 15;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindOobResponseV2() {
                return this.payloadCase_ == 16;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindResult() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindResultV2() {
                return this.payloadCase_ == 17;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindStatus() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindVerifyRequestV2() {
                return this.payloadCase_ == 12;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasBindVerifyResponseV2() {
                return this.payloadCase_ == 13;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasConnectConfirmRequestV2() {
                return this.payloadCase_ == 20;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasConnectConfirmResponseV2() {
                return this.payloadCase_ == 21;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasConnectVerifyRequestV2() {
                return this.payloadCase_ == 18;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasConnectVerifyResponseV2() {
                return this.payloadCase_ == 19;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasErrorCode() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasLoginStatus() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasVerifyKey() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
            public boolean hasVerifyResult() {
                return this.payloadCase_ == 8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_Account_fieldAccessorTable.ensureFieldAccessorsInitialized(Account.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasBindInfo() && !getBindInfo().isInitialized()) {
                    return false;
                }
                if (hasBindResult() && !getBindResult().isInitialized()) {
                    return false;
                }
                if (hasBindInfoV2() && !getBindInfoV2().isInitialized()) {
                    return false;
                }
                if (hasBindVerifyRequestV2() && !getBindVerifyRequestV2().isInitialized()) {
                    return false;
                }
                if (hasBindVerifyResponseV2() && !getBindVerifyResponseV2().isInitialized()) {
                    return false;
                }
                if (hasBindOobRequestV2() && !getBindOobRequestV2().isInitialized()) {
                    return false;
                }
                if (hasBindOobResponseV2() && !getBindOobResponseV2().isInitialized()) {
                    return false;
                }
                if (hasBindResultV2() && !getBindResultV2().isInitialized()) {
                    return false;
                }
                if (hasConnectVerifyRequestV2() && !getConnectVerifyRequestV2().isInitialized()) {
                    return false;
                }
                if (hasConnectVerifyResponseV2() && !getConnectVerifyResponseV2().isInitialized()) {
                    return false;
                }
                if (!hasConnectConfirmRequestV2() || getConnectConfirmRequestV2().isInitialized()) {
                    return !hasConnectConfirmResponseV2() || getConnectConfirmResponseV2().isInitialized();
                }
                return false;
            }

            public Builder mergeBindInfo(BindInfo bindInfo) {
                SingleFieldBuilderV3<BindInfo, BindInfo.Builder, BindInfoOrBuilder> singleFieldBuilderV3 = this.bindInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 4 && this.payload_ != BindInfo.getDefaultInstance()) {
                        bindInfo = BindInfo.newBuilder((BindInfo) this.payload_).mergeFrom(bindInfo).buildPartial();
                    }
                    this.payload_ = bindInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 4) {
                        singleFieldBuilderV3.mergeFrom(bindInfo);
                    }
                    this.bindInfoBuilder_.setMessage(bindInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeBindInfoV2(BindInfoV2 bindInfoV2) {
                SingleFieldBuilderV3<BindInfoV2, BindInfoV2.Builder, BindInfoV2OrBuilder> singleFieldBuilderV3 = this.bindInfoV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 11 && this.payload_ != BindInfoV2.getDefaultInstance()) {
                        bindInfoV2 = BindInfoV2.newBuilder((BindInfoV2) this.payload_).mergeFrom(bindInfoV2).buildPartial();
                    }
                    this.payload_ = bindInfoV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 11) {
                        singleFieldBuilderV3.mergeFrom(bindInfoV2);
                    }
                    this.bindInfoV2Builder_.setMessage(bindInfoV2);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder mergeBindOobRequestV2(BindOOBRequestV2 bindOOBRequestV2) {
                SingleFieldBuilderV3<BindOOBRequestV2, BindOOBRequestV2.Builder, BindOOBRequestV2OrBuilder> singleFieldBuilderV3 = this.bindOobRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 15 && this.payload_ != BindOOBRequestV2.getDefaultInstance()) {
                        bindOOBRequestV2 = BindOOBRequestV2.newBuilder((BindOOBRequestV2) this.payload_).mergeFrom(bindOOBRequestV2).buildPartial();
                    }
                    this.payload_ = bindOOBRequestV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 15) {
                        singleFieldBuilderV3.mergeFrom(bindOOBRequestV2);
                    }
                    this.bindOobRequestV2Builder_.setMessage(bindOOBRequestV2);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder mergeBindOobResponseV2(BindOOBResponseV2 bindOOBResponseV2) {
                SingleFieldBuilderV3<BindOOBResponseV2, BindOOBResponseV2.Builder, BindOOBResponseV2OrBuilder> singleFieldBuilderV3 = this.bindOobResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 16 && this.payload_ != BindOOBResponseV2.getDefaultInstance()) {
                        bindOOBResponseV2 = BindOOBResponseV2.newBuilder((BindOOBResponseV2) this.payload_).mergeFrom(bindOOBResponseV2).buildPartial();
                    }
                    this.payload_ = bindOOBResponseV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 16) {
                        singleFieldBuilderV3.mergeFrom(bindOOBResponseV2);
                    }
                    this.bindOobResponseV2Builder_.setMessage(bindOOBResponseV2);
                }
                this.payloadCase_ = 16;
                return this;
            }

            public Builder mergeBindResult(BindResult bindResult) {
                SingleFieldBuilderV3<BindResult, BindResult.Builder, BindResultOrBuilder> singleFieldBuilderV3 = this.bindResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 5 && this.payload_ != BindResult.getDefaultInstance()) {
                        bindResult = BindResult.newBuilder((BindResult) this.payload_).mergeFrom(bindResult).buildPartial();
                    }
                    this.payload_ = bindResult;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 5) {
                        singleFieldBuilderV3.mergeFrom(bindResult);
                    }
                    this.bindResultBuilder_.setMessage(bindResult);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeBindResultV2(BindResultV2 bindResultV2) {
                SingleFieldBuilderV3<BindResultV2, BindResultV2.Builder, BindResultV2OrBuilder> singleFieldBuilderV3 = this.bindResultV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 17 && this.payload_ != BindResultV2.getDefaultInstance()) {
                        bindResultV2 = BindResultV2.newBuilder((BindResultV2) this.payload_).mergeFrom(bindResultV2).buildPartial();
                    }
                    this.payload_ = bindResultV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 17) {
                        singleFieldBuilderV3.mergeFrom(bindResultV2);
                    }
                    this.bindResultV2Builder_.setMessage(bindResultV2);
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder mergeBindVerifyRequestV2(BindVerifyRequestV2 bindVerifyRequestV2) {
                SingleFieldBuilderV3<BindVerifyRequestV2, BindVerifyRequestV2.Builder, BindVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 12 && this.payload_ != BindVerifyRequestV2.getDefaultInstance()) {
                        bindVerifyRequestV2 = BindVerifyRequestV2.newBuilder((BindVerifyRequestV2) this.payload_).mergeFrom(bindVerifyRequestV2).buildPartial();
                    }
                    this.payload_ = bindVerifyRequestV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 12) {
                        singleFieldBuilderV3.mergeFrom(bindVerifyRequestV2);
                    }
                    this.bindVerifyRequestV2Builder_.setMessage(bindVerifyRequestV2);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder mergeBindVerifyResponseV2(BindVerifyResponseV2 bindVerifyResponseV2) {
                SingleFieldBuilderV3<BindVerifyResponseV2, BindVerifyResponseV2.Builder, BindVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 13 && this.payload_ != BindVerifyResponseV2.getDefaultInstance()) {
                        bindVerifyResponseV2 = BindVerifyResponseV2.newBuilder((BindVerifyResponseV2) this.payload_).mergeFrom(bindVerifyResponseV2).buildPartial();
                    }
                    this.payload_ = bindVerifyResponseV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 13) {
                        singleFieldBuilderV3.mergeFrom(bindVerifyResponseV2);
                    }
                    this.bindVerifyResponseV2Builder_.setMessage(bindVerifyResponseV2);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder mergeConnectConfirmRequestV2(ConnectConfirmRequestV2 connectConfirmRequestV2) {
                SingleFieldBuilderV3<ConnectConfirmRequestV2, ConnectConfirmRequestV2.Builder, ConnectConfirmRequestV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 20 && this.payload_ != ConnectConfirmRequestV2.getDefaultInstance()) {
                        connectConfirmRequestV2 = ConnectConfirmRequestV2.newBuilder((ConnectConfirmRequestV2) this.payload_).mergeFrom(connectConfirmRequestV2).buildPartial();
                    }
                    this.payload_ = connectConfirmRequestV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 20) {
                        singleFieldBuilderV3.mergeFrom(connectConfirmRequestV2);
                    }
                    this.connectConfirmRequestV2Builder_.setMessage(connectConfirmRequestV2);
                }
                this.payloadCase_ = 20;
                return this;
            }

            public Builder mergeConnectConfirmResponseV2(ConnectConfirmResponseV2 connectConfirmResponseV2) {
                SingleFieldBuilderV3<ConnectConfirmResponseV2, ConnectConfirmResponseV2.Builder, ConnectConfirmResponseV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 21 && this.payload_ != ConnectConfirmResponseV2.getDefaultInstance()) {
                        connectConfirmResponseV2 = ConnectConfirmResponseV2.newBuilder((ConnectConfirmResponseV2) this.payload_).mergeFrom(connectConfirmResponseV2).buildPartial();
                    }
                    this.payload_ = connectConfirmResponseV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 21) {
                        singleFieldBuilderV3.mergeFrom(connectConfirmResponseV2);
                    }
                    this.connectConfirmResponseV2Builder_.setMessage(connectConfirmResponseV2);
                }
                this.payloadCase_ = 21;
                return this;
            }

            public Builder mergeConnectVerifyRequestV2(ConnectVerifyRequestV2 connectVerifyRequestV2) {
                SingleFieldBuilderV3<ConnectVerifyRequestV2, ConnectVerifyRequestV2.Builder, ConnectVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 18 && this.payload_ != ConnectVerifyRequestV2.getDefaultInstance()) {
                        connectVerifyRequestV2 = ConnectVerifyRequestV2.newBuilder((ConnectVerifyRequestV2) this.payload_).mergeFrom(connectVerifyRequestV2).buildPartial();
                    }
                    this.payload_ = connectVerifyRequestV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 18) {
                        singleFieldBuilderV3.mergeFrom(connectVerifyRequestV2);
                    }
                    this.connectVerifyRequestV2Builder_.setMessage(connectVerifyRequestV2);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder mergeConnectVerifyResponseV2(ConnectVerifyResponseV2 connectVerifyResponseV2) {
                SingleFieldBuilderV3<ConnectVerifyResponseV2, ConnectVerifyResponseV2.Builder, ConnectVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 19 && this.payload_ != ConnectVerifyResponseV2.getDefaultInstance()) {
                        connectVerifyResponseV2 = ConnectVerifyResponseV2.newBuilder((ConnectVerifyResponseV2) this.payload_).mergeFrom(connectVerifyResponseV2).buildPartial();
                    }
                    this.payload_ = connectVerifyResponseV2;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 19) {
                        singleFieldBuilderV3.mergeFrom(connectVerifyResponseV2);
                    }
                    this.connectVerifyResponseV2Builder_.setMessage(connectVerifyResponseV2);
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder setBindInfo(BindInfo.Builder builder) {
                SingleFieldBuilderV3<BindInfo, BindInfo.Builder, BindInfoOrBuilder> singleFieldBuilderV3 = this.bindInfoBuilder_;
                BindInfo bindInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = bindInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindInfoBuild);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setBindInfoV2(BindInfoV2.Builder builder) {
                SingleFieldBuilderV3<BindInfoV2, BindInfoV2.Builder, BindInfoV2OrBuilder> singleFieldBuilderV3 = this.bindInfoV2Builder_;
                BindInfoV2 bindInfoV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = bindInfoV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindInfoV2Build);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setBindKey(String str) {
                str.getClass();
                this.payloadCase_ = 2;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setBindKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 2;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBindOobRequestV2(BindOOBRequestV2.Builder builder) {
                SingleFieldBuilderV3<BindOOBRequestV2, BindOOBRequestV2.Builder, BindOOBRequestV2OrBuilder> singleFieldBuilderV3 = this.bindOobRequestV2Builder_;
                BindOOBRequestV2 bindOOBRequestV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = bindOOBRequestV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindOOBRequestV2Build);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setBindOobResponseV2(BindOOBResponseV2.Builder builder) {
                SingleFieldBuilderV3<BindOOBResponseV2, BindOOBResponseV2.Builder, BindOOBResponseV2OrBuilder> singleFieldBuilderV3 = this.bindOobResponseV2Builder_;
                BindOOBResponseV2 bindOOBResponseV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = bindOOBResponseV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindOOBResponseV2Build);
                }
                this.payloadCase_ = 16;
                return this;
            }

            public Builder setBindResult(BindResult.Builder builder) {
                SingleFieldBuilderV3<BindResult, BindResult.Builder, BindResultOrBuilder> singleFieldBuilderV3 = this.bindResultBuilder_;
                BindResult bindResultBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = bindResultBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindResultBuild);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setBindResultV2(BindResultV2.Builder builder) {
                SingleFieldBuilderV3<BindResultV2, BindResultV2.Builder, BindResultV2OrBuilder> singleFieldBuilderV3 = this.bindResultV2Builder_;
                BindResultV2 bindResultV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = bindResultV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindResultV2Build);
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder setBindStatus(boolean z6) {
                this.payloadCase_ = 1;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            public Builder setBindVerifyRequestV2(BindVerifyRequestV2.Builder builder) {
                SingleFieldBuilderV3<BindVerifyRequestV2, BindVerifyRequestV2.Builder, BindVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyRequestV2Builder_;
                BindVerifyRequestV2 bindVerifyRequestV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = bindVerifyRequestV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindVerifyRequestV2Build);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setBindVerifyResponseV2(BindVerifyResponseV2.Builder builder) {
                SingleFieldBuilderV3<BindVerifyResponseV2, BindVerifyResponseV2.Builder, BindVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyResponseV2Builder_;
                BindVerifyResponseV2 bindVerifyResponseV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = bindVerifyResponseV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindVerifyResponseV2Build);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setConnectConfirmRequestV2(ConnectConfirmRequestV2.Builder builder) {
                SingleFieldBuilderV3<ConnectConfirmRequestV2, ConnectConfirmRequestV2.Builder, ConnectConfirmRequestV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmRequestV2Builder_;
                ConnectConfirmRequestV2 connectConfirmRequestV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = connectConfirmRequestV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(connectConfirmRequestV2Build);
                }
                this.payloadCase_ = 20;
                return this;
            }

            public Builder setConnectConfirmResponseV2(ConnectConfirmResponseV2.Builder builder) {
                SingleFieldBuilderV3<ConnectConfirmResponseV2, ConnectConfirmResponseV2.Builder, ConnectConfirmResponseV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmResponseV2Builder_;
                ConnectConfirmResponseV2 connectConfirmResponseV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = connectConfirmResponseV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(connectConfirmResponseV2Build);
                }
                this.payloadCase_ = 21;
                return this;
            }

            public Builder setConnectVerifyRequestV2(ConnectVerifyRequestV2.Builder builder) {
                SingleFieldBuilderV3<ConnectVerifyRequestV2, ConnectVerifyRequestV2.Builder, ConnectVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyRequestV2Builder_;
                ConnectVerifyRequestV2 connectVerifyRequestV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = connectVerifyRequestV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(connectVerifyRequestV2Build);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder setConnectVerifyResponseV2(ConnectVerifyResponseV2.Builder builder) {
                SingleFieldBuilderV3<ConnectVerifyResponseV2, ConnectVerifyResponseV2.Builder, ConnectVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyResponseV2Builder_;
                ConnectVerifyResponseV2 connectVerifyResponseV2Build = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = connectVerifyResponseV2Build;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(connectVerifyResponseV2Build);
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder setErrorCode(ErrorCode errorCode) {
                errorCode.getClass();
                this.payloadCase_ = 3;
                this.payload_ = Integer.valueOf(errorCode.getNumber());
                onChanged();
                return this;
            }

            public Builder setLoginStatus(boolean z6) {
                this.payloadCase_ = 6;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            public Builder setVerifyKey(String str) {
                str.getClass();
                this.payloadCase_ = 7;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setVerifyKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 7;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVerifyResult(boolean z6) {
                this.payloadCase_ = 8;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setBindInfo(BindInfo bindInfo) {
                SingleFieldBuilderV3<BindInfo, BindInfo.Builder, BindInfoOrBuilder> singleFieldBuilderV3 = this.bindInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    bindInfo.getClass();
                    this.payload_ = bindInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindInfo);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setBindInfoV2(BindInfoV2 bindInfoV2) {
                SingleFieldBuilderV3<BindInfoV2, BindInfoV2.Builder, BindInfoV2OrBuilder> singleFieldBuilderV3 = this.bindInfoV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    bindInfoV2.getClass();
                    this.payload_ = bindInfoV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindInfoV2);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setBindOobRequestV2(BindOOBRequestV2 bindOOBRequestV2) {
                SingleFieldBuilderV3<BindOOBRequestV2, BindOOBRequestV2.Builder, BindOOBRequestV2OrBuilder> singleFieldBuilderV3 = this.bindOobRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    bindOOBRequestV2.getClass();
                    this.payload_ = bindOOBRequestV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindOOBRequestV2);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setBindOobResponseV2(BindOOBResponseV2 bindOOBResponseV2) {
                SingleFieldBuilderV3<BindOOBResponseV2, BindOOBResponseV2.Builder, BindOOBResponseV2OrBuilder> singleFieldBuilderV3 = this.bindOobResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    bindOOBResponseV2.getClass();
                    this.payload_ = bindOOBResponseV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindOOBResponseV2);
                }
                this.payloadCase_ = 16;
                return this;
            }

            public Builder setBindResult(BindResult bindResult) {
                SingleFieldBuilderV3<BindResult, BindResult.Builder, BindResultOrBuilder> singleFieldBuilderV3 = this.bindResultBuilder_;
                if (singleFieldBuilderV3 == null) {
                    bindResult.getClass();
                    this.payload_ = bindResult;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindResult);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setBindResultV2(BindResultV2 bindResultV2) {
                SingleFieldBuilderV3<BindResultV2, BindResultV2.Builder, BindResultV2OrBuilder> singleFieldBuilderV3 = this.bindResultV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    bindResultV2.getClass();
                    this.payload_ = bindResultV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindResultV2);
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder setBindVerifyRequestV2(BindVerifyRequestV2 bindVerifyRequestV2) {
                SingleFieldBuilderV3<BindVerifyRequestV2, BindVerifyRequestV2.Builder, BindVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    bindVerifyRequestV2.getClass();
                    this.payload_ = bindVerifyRequestV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindVerifyRequestV2);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setBindVerifyResponseV2(BindVerifyResponseV2 bindVerifyResponseV2) {
                SingleFieldBuilderV3<BindVerifyResponseV2, BindVerifyResponseV2.Builder, BindVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.bindVerifyResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    bindVerifyResponseV2.getClass();
                    this.payload_ = bindVerifyResponseV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(bindVerifyResponseV2);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setConnectConfirmRequestV2(ConnectConfirmRequestV2 connectConfirmRequestV2) {
                SingleFieldBuilderV3<ConnectConfirmRequestV2, ConnectConfirmRequestV2.Builder, ConnectConfirmRequestV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    connectConfirmRequestV2.getClass();
                    this.payload_ = connectConfirmRequestV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(connectConfirmRequestV2);
                }
                this.payloadCase_ = 20;
                return this;
            }

            public Builder setConnectConfirmResponseV2(ConnectConfirmResponseV2 connectConfirmResponseV2) {
                SingleFieldBuilderV3<ConnectConfirmResponseV2, ConnectConfirmResponseV2.Builder, ConnectConfirmResponseV2OrBuilder> singleFieldBuilderV3 = this.connectConfirmResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    connectConfirmResponseV2.getClass();
                    this.payload_ = connectConfirmResponseV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(connectConfirmResponseV2);
                }
                this.payloadCase_ = 21;
                return this;
            }

            public Builder setConnectVerifyRequestV2(ConnectVerifyRequestV2 connectVerifyRequestV2) {
                SingleFieldBuilderV3<ConnectVerifyRequestV2, ConnectVerifyRequestV2.Builder, ConnectVerifyRequestV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyRequestV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    connectVerifyRequestV2.getClass();
                    this.payload_ = connectVerifyRequestV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(connectVerifyRequestV2);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder setConnectVerifyResponseV2(ConnectVerifyResponseV2 connectVerifyResponseV2) {
                SingleFieldBuilderV3<ConnectVerifyResponseV2, ConnectVerifyResponseV2.Builder, ConnectVerifyResponseV2OrBuilder> singleFieldBuilderV3 = this.connectVerifyResponseV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    connectVerifyResponseV2.getClass();
                    this.payload_ = connectVerifyResponseV2;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(connectVerifyResponseV2);
                }
                this.payloadCase_ = 19;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Account build() {
                Account accountBuildPartial = buildPartial();
                if (accountBuildPartial.isInitialized()) {
                    return accountBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) accountBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Account buildPartial() {
                Account account = new Account(this);
                if (this.payloadCase_ == 1) {
                    account.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 2) {
                    account.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 3) {
                    account.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 4) {
                    SingleFieldBuilderV3<BindInfo, BindInfo.Builder, BindInfoOrBuilder> singleFieldBuilderV3 = this.bindInfoBuilder_;
                    account.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 5) {
                    SingleFieldBuilderV3<BindResult, BindResult.Builder, BindResultOrBuilder> singleFieldBuilderV32 = this.bindResultBuilder_;
                    account.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 6) {
                    account.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 7) {
                    account.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 8) {
                    account.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 11) {
                    SingleFieldBuilderV3<BindInfoV2, BindInfoV2.Builder, BindInfoV2OrBuilder> singleFieldBuilderV33 = this.bindInfoV2Builder_;
                    account.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                if (this.payloadCase_ == 12) {
                    SingleFieldBuilderV3<BindVerifyRequestV2, BindVerifyRequestV2.Builder, BindVerifyRequestV2OrBuilder> singleFieldBuilderV34 = this.bindVerifyRequestV2Builder_;
                    account.payload_ = singleFieldBuilderV34 == null ? this.payload_ : singleFieldBuilderV34.build();
                }
                if (this.payloadCase_ == 13) {
                    SingleFieldBuilderV3<BindVerifyResponseV2, BindVerifyResponseV2.Builder, BindVerifyResponseV2OrBuilder> singleFieldBuilderV35 = this.bindVerifyResponseV2Builder_;
                    account.payload_ = singleFieldBuilderV35 == null ? this.payload_ : singleFieldBuilderV35.build();
                }
                if (this.payloadCase_ == 15) {
                    SingleFieldBuilderV3<BindOOBRequestV2, BindOOBRequestV2.Builder, BindOOBRequestV2OrBuilder> singleFieldBuilderV36 = this.bindOobRequestV2Builder_;
                    account.payload_ = singleFieldBuilderV36 == null ? this.payload_ : singleFieldBuilderV36.build();
                }
                if (this.payloadCase_ == 16) {
                    SingleFieldBuilderV3<BindOOBResponseV2, BindOOBResponseV2.Builder, BindOOBResponseV2OrBuilder> singleFieldBuilderV37 = this.bindOobResponseV2Builder_;
                    account.payload_ = singleFieldBuilderV37 == null ? this.payload_ : singleFieldBuilderV37.build();
                }
                if (this.payloadCase_ == 17) {
                    SingleFieldBuilderV3<BindResultV2, BindResultV2.Builder, BindResultV2OrBuilder> singleFieldBuilderV38 = this.bindResultV2Builder_;
                    account.payload_ = singleFieldBuilderV38 == null ? this.payload_ : singleFieldBuilderV38.build();
                }
                if (this.payloadCase_ == 18) {
                    SingleFieldBuilderV3<ConnectVerifyRequestV2, ConnectVerifyRequestV2.Builder, ConnectVerifyRequestV2OrBuilder> singleFieldBuilderV39 = this.connectVerifyRequestV2Builder_;
                    account.payload_ = singleFieldBuilderV39 == null ? this.payload_ : singleFieldBuilderV39.build();
                }
                if (this.payloadCase_ == 19) {
                    SingleFieldBuilderV3<ConnectVerifyResponseV2, ConnectVerifyResponseV2.Builder, ConnectVerifyResponseV2OrBuilder> singleFieldBuilderV310 = this.connectVerifyResponseV2Builder_;
                    account.payload_ = singleFieldBuilderV310 == null ? this.payload_ : singleFieldBuilderV310.build();
                }
                if (this.payloadCase_ == 20) {
                    SingleFieldBuilderV3<ConnectConfirmRequestV2, ConnectConfirmRequestV2.Builder, ConnectConfirmRequestV2OrBuilder> singleFieldBuilderV311 = this.connectConfirmRequestV2Builder_;
                    account.payload_ = singleFieldBuilderV311 == null ? this.payload_ : singleFieldBuilderV311.build();
                }
                if (this.payloadCase_ == 21) {
                    SingleFieldBuilderV3<ConnectConfirmResponseV2, ConnectConfirmResponseV2.Builder, ConnectConfirmResponseV2OrBuilder> singleFieldBuilderV312 = this.connectConfirmResponseV2Builder_;
                    account.payload_ = singleFieldBuilderV312 == null ? this.payload_ : singleFieldBuilderV312.build();
                }
                account.bitField0_ = 0;
                account.payloadCase_ = this.payloadCase_;
                onBuilt();
                return account;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Account getDefaultInstanceForType() {
                return Account.getDefaultInstance();
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
            public com.zh.wear.protobuf.AccountProtos.Account.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$Account> r1 = com.zh.wear.protobuf.AccountProtos.Account.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$Account r3 = (com.zh.wear.protobuf.AccountProtos.Account) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$Account r4 = (com.zh.wear.protobuf.AccountProtos.Account) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.Account.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$Account$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Account) {
                    return mergeFrom((Account) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Account account) {
                int i7;
                if (account == Account.getDefaultInstance()) {
                    return this;
                }
                switch (AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$AccountProtos$Account$PayloadCase[account.getPayloadCase().ordinal()]) {
                    case 1:
                        setBindStatus(account.getBindStatus());
                        break;
                    case 2:
                        i7 = 2;
                        this.payloadCase_ = i7;
                        this.payload_ = account.payload_;
                        onChanged();
                        break;
                    case 3:
                        setErrorCode(account.getErrorCode());
                        break;
                    case 4:
                        mergeBindInfo(account.getBindInfo());
                        break;
                    case 5:
                        mergeBindResult(account.getBindResult());
                        break;
                    case 6:
                        setLoginStatus(account.getLoginStatus());
                        break;
                    case 7:
                        i7 = 7;
                        this.payloadCase_ = i7;
                        this.payload_ = account.payload_;
                        onChanged();
                        break;
                    case 8:
                        setVerifyResult(account.getVerifyResult());
                        break;
                    case 9:
                        mergeBindInfoV2(account.getBindInfoV2());
                        break;
                    case 10:
                        mergeBindVerifyRequestV2(account.getBindVerifyRequestV2());
                        break;
                    case 11:
                        mergeBindVerifyResponseV2(account.getBindVerifyResponseV2());
                        break;
                    case 12:
                        mergeBindOobRequestV2(account.getBindOobRequestV2());
                        break;
                    case 13:
                        mergeBindOobResponseV2(account.getBindOobResponseV2());
                        break;
                    case 14:
                        mergeBindResultV2(account.getBindResultV2());
                        break;
                    case 15:
                        mergeConnectVerifyRequestV2(account.getConnectVerifyRequestV2());
                        break;
                    case 16:
                        mergeConnectVerifyResponseV2(account.getConnectVerifyResponseV2());
                        break;
                    case 17:
                        mergeConnectConfirmRequestV2(account.getConnectConfirmRequestV2());
                        break;
                    case 18:
                        mergeConnectConfirmResponseV2(account.getConnectConfirmResponseV2());
                        break;
                }
                mergeUnknownFields(((GeneratedMessage) account).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum ErrorCode implements ProtocolMessageEnum {
            NO_ERROR(0),
            HAVE_BOUND(1),
            INFO_MISSING(2),
            INVALID_PARAM(3),
            NO_BOUND(4),
            SERVER_ERROR(5),
            CANCEL(6),
            VERIFY_ERROR(7),
            UNKNOWN(100);

            public static final int CANCEL_VALUE = 6;
            public static final int HAVE_BOUND_VALUE = 1;
            public static final int INFO_MISSING_VALUE = 2;
            public static final int INVALID_PARAM_VALUE = 3;
            public static final int NO_BOUND_VALUE = 4;
            public static final int NO_ERROR_VALUE = 0;
            public static final int SERVER_ERROR_VALUE = 5;
            public static final int UNKNOWN_VALUE = 100;
            public static final int VERIFY_ERROR_VALUE = 7;
            private final int value;
            private static final Internal.EnumLiteMap<ErrorCode> internalValueMap = new Internal.EnumLiteMap<ErrorCode>() { // from class: com.zh.wear.protobuf.AccountProtos.Account.ErrorCode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ErrorCode findValueByNumber(int i7) {
                    return ErrorCode.forNumber(i7);
                }
            };
            private static final ErrorCode[] VALUES = values();

            ErrorCode(int i7) {
                this.value = i7;
            }

            public static ErrorCode forNumber(int i7) {
                if (i7 == 100) {
                    return UNKNOWN;
                }
                switch (i7) {
                    case 0:
                        return NO_ERROR;
                    case 1:
                        return HAVE_BOUND;
                    case 2:
                        return INFO_MISSING;
                    case 3:
                        return INVALID_PARAM;
                    case 4:
                        return NO_BOUND;
                    case 5:
                        return SERVER_ERROR;
                    case 6:
                        return CANCEL;
                    case 7:
                        return VERIFY_ERROR;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Account.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<ErrorCode> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static ErrorCode valueOf(int i7) {
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

            public static ErrorCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            BIND_STATUS(1),
            BIND_KEY(2),
            ERROR_CODE(3),
            BIND_INFO(4),
            BIND_RESULT(5),
            LOGIN_STATUS(6),
            VERIFY_KEY(7),
            VERIFY_RESULT(8),
            BIND_INFO_V2(11),
            BIND_VERIFY_REQUEST_V2(12),
            BIND_VERIFY_RESPONSE_V2(13),
            BIND_OOB_REQUEST_V2(15),
            BIND_OOB_RESPONSE_V2(16),
            BIND_RESULT_V2(17),
            CONNECT_VERIFY_REQUEST_V2(18),
            CONNECT_VERIFY_RESPONSE_V2(19),
            CONNECT_CONFIRM_REQUEST_V2(20),
            CONNECT_CONFIRM_RESPONSE_V2(21),
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
                        return BIND_STATUS;
                    case 2:
                        return BIND_KEY;
                    case 3:
                        return ERROR_CODE;
                    case 4:
                        return BIND_INFO;
                    case 5:
                        return BIND_RESULT;
                    case 6:
                        return LOGIN_STATUS;
                    case 7:
                        return VERIFY_KEY;
                    case 8:
                        return VERIFY_RESULT;
                    case 9:
                    case 10:
                    case 14:
                    default:
                        return null;
                    case 11:
                        return BIND_INFO_V2;
                    case 12:
                        return BIND_VERIFY_REQUEST_V2;
                    case 13:
                        return BIND_VERIFY_RESPONSE_V2;
                    case 15:
                        return BIND_OOB_REQUEST_V2;
                    case 16:
                        return BIND_OOB_RESPONSE_V2;
                    case 17:
                        return BIND_RESULT_V2;
                    case 18:
                        return CONNECT_VERIFY_REQUEST_V2;
                    case 19:
                        return CONNECT_VERIFY_RESPONSE_V2;
                    case 20:
                        return CONNECT_CONFIRM_REQUEST_V2;
                    case 21:
                        return CONNECT_CONFIRM_RESPONSE_V2;
                }
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

        private Account() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Account getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_Account_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Account parseDelimitedFrom(InputStream inputStream) {
            return (Account) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Account parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Account> parser() {
            return PARSER;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0021. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0158  */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 406
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.Account.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindInfo getBindInfo() {
            return this.payloadCase_ == 4 ? (BindInfo) this.payload_ : BindInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindInfoOrBuilder getBindInfoOrBuilder() {
            return this.payloadCase_ == 4 ? (BindInfo) this.payload_ : BindInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindInfoV2 getBindInfoV2() {
            return this.payloadCase_ == 11 ? (BindInfoV2) this.payload_ : BindInfoV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindInfoV2OrBuilder getBindInfoV2OrBuilder() {
            return this.payloadCase_ == 11 ? (BindInfoV2) this.payload_ : BindInfoV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public String getBindKey() {
            String str = this.payloadCase_ == 2 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 2) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ByteString getBindKeyBytes() {
            String str = this.payloadCase_ == 2 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 2) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindOOBRequestV2 getBindOobRequestV2() {
            return this.payloadCase_ == 15 ? (BindOOBRequestV2) this.payload_ : BindOOBRequestV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindOOBRequestV2OrBuilder getBindOobRequestV2OrBuilder() {
            return this.payloadCase_ == 15 ? (BindOOBRequestV2) this.payload_ : BindOOBRequestV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindOOBResponseV2 getBindOobResponseV2() {
            return this.payloadCase_ == 16 ? (BindOOBResponseV2) this.payload_ : BindOOBResponseV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindOOBResponseV2OrBuilder getBindOobResponseV2OrBuilder() {
            return this.payloadCase_ == 16 ? (BindOOBResponseV2) this.payload_ : BindOOBResponseV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindResult getBindResult() {
            return this.payloadCase_ == 5 ? (BindResult) this.payload_ : BindResult.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindResultOrBuilder getBindResultOrBuilder() {
            return this.payloadCase_ == 5 ? (BindResult) this.payload_ : BindResult.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindResultV2 getBindResultV2() {
            return this.payloadCase_ == 17 ? (BindResultV2) this.payload_ : BindResultV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindResultV2OrBuilder getBindResultV2OrBuilder() {
            return this.payloadCase_ == 17 ? (BindResultV2) this.payload_ : BindResultV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean getBindStatus() {
            if (this.payloadCase_ == 1) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindVerifyRequestV2 getBindVerifyRequestV2() {
            return this.payloadCase_ == 12 ? (BindVerifyRequestV2) this.payload_ : BindVerifyRequestV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindVerifyRequestV2OrBuilder getBindVerifyRequestV2OrBuilder() {
            return this.payloadCase_ == 12 ? (BindVerifyRequestV2) this.payload_ : BindVerifyRequestV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindVerifyResponseV2 getBindVerifyResponseV2() {
            return this.payloadCase_ == 13 ? (BindVerifyResponseV2) this.payload_ : BindVerifyResponseV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public BindVerifyResponseV2OrBuilder getBindVerifyResponseV2OrBuilder() {
            return this.payloadCase_ == 13 ? (BindVerifyResponseV2) this.payload_ : BindVerifyResponseV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ConnectConfirmRequestV2 getConnectConfirmRequestV2() {
            return this.payloadCase_ == 20 ? (ConnectConfirmRequestV2) this.payload_ : ConnectConfirmRequestV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ConnectConfirmRequestV2OrBuilder getConnectConfirmRequestV2OrBuilder() {
            return this.payloadCase_ == 20 ? (ConnectConfirmRequestV2) this.payload_ : ConnectConfirmRequestV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ConnectConfirmResponseV2 getConnectConfirmResponseV2() {
            return this.payloadCase_ == 21 ? (ConnectConfirmResponseV2) this.payload_ : ConnectConfirmResponseV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ConnectConfirmResponseV2OrBuilder getConnectConfirmResponseV2OrBuilder() {
            return this.payloadCase_ == 21 ? (ConnectConfirmResponseV2) this.payload_ : ConnectConfirmResponseV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ConnectVerifyRequestV2 getConnectVerifyRequestV2() {
            return this.payloadCase_ == 18 ? (ConnectVerifyRequestV2) this.payload_ : ConnectVerifyRequestV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ConnectVerifyRequestV2OrBuilder getConnectVerifyRequestV2OrBuilder() {
            return this.payloadCase_ == 18 ? (ConnectVerifyRequestV2) this.payload_ : ConnectVerifyRequestV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ConnectVerifyResponseV2 getConnectVerifyResponseV2() {
            return this.payloadCase_ == 19 ? (ConnectVerifyResponseV2) this.payload_ : ConnectVerifyResponseV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ConnectVerifyResponseV2OrBuilder getConnectVerifyResponseV2OrBuilder() {
            return this.payloadCase_ == 19 ? (ConnectVerifyResponseV2) this.payload_ : ConnectVerifyResponseV2.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ErrorCode getErrorCode() {
            ErrorCode errorCodeValueOf;
            return (this.payloadCase_ != 3 || (errorCodeValueOf = ErrorCode.valueOf(((Integer) this.payload_).intValue())) == null) ? ErrorCode.NO_ERROR : errorCodeValueOf;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean getLoginStatus() {
            if (this.payloadCase_ == 6) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Account> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = this.payloadCase_ == 1 ? CodedOutputStream.computeBoolSize(1, ((Boolean) this.payload_).booleanValue()) : 0;
            if (this.payloadCase_ == 2) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(4, (BindInfo) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(5, (BindResult) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(6, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 7) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(7, this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(8, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 11) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(11, (BindInfoV2) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(12, (BindVerifyRequestV2) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(13, (BindVerifyResponseV2) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(15, (BindOOBRequestV2) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(16, (BindOOBResponseV2) this.payload_);
            }
            if (this.payloadCase_ == 17) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(17, (BindResultV2) this.payload_);
            }
            if (this.payloadCase_ == 18) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(18, (ConnectVerifyRequestV2) this.payload_);
            }
            if (this.payloadCase_ == 19) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(19, (ConnectVerifyResponseV2) this.payload_);
            }
            if (this.payloadCase_ == 20) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(20, (ConnectConfirmRequestV2) this.payload_);
            }
            if (this.payloadCase_ == 21) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(21, (ConnectConfirmResponseV2) this.payload_);
            }
            int serializedSize = iComputeBoolSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public String getVerifyKey() {
            String str = this.payloadCase_ == 7 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 7) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public ByteString getVerifyKeyBytes() {
            String str = this.payloadCase_ == 7 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 7) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean getVerifyResult() {
            if (this.payloadCase_ == 8) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindInfo() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindInfoV2() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindKey() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindOobRequestV2() {
            return this.payloadCase_ == 15;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindOobResponseV2() {
            return this.payloadCase_ == 16;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindResult() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindResultV2() {
            return this.payloadCase_ == 17;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindStatus() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindVerifyRequestV2() {
            return this.payloadCase_ == 12;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasBindVerifyResponseV2() {
            return this.payloadCase_ == 13;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasConnectConfirmRequestV2() {
            return this.payloadCase_ == 20;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasConnectConfirmResponseV2() {
            return this.payloadCase_ == 21;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasConnectVerifyRequestV2() {
            return this.payloadCase_ == 18;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasConnectVerifyResponseV2() {
            return this.payloadCase_ == 19;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasErrorCode() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasLoginStatus() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasVerifyKey() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.AccountOrBuilder
        public boolean hasVerifyResult() {
            return this.payloadCase_ == 8;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7;
            boolean bindStatus;
            String bindKey;
            int number;
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            switch (this.payloadCase_) {
                case 1:
                    i7 = ((iHashCode * 37) + 1) * 53;
                    bindStatus = getBindStatus();
                    number = Internal.hashBoolean(bindStatus);
                    iHashCode = i7 + number;
                    break;
                case 2:
                    i7 = ((iHashCode * 37) + 2) * 53;
                    bindKey = getBindKey();
                    number = bindKey.hashCode();
                    iHashCode = i7 + number;
                    break;
                case 3:
                    i7 = ((iHashCode * 37) + 3) * 53;
                    number = getErrorCode().getNumber();
                    iHashCode = i7 + number;
                    break;
                case 4:
                    i7 = ((iHashCode * 37) + 4) * 53;
                    number = getBindInfo().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 5:
                    i7 = ((iHashCode * 37) + 5) * 53;
                    number = getBindResult().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 6:
                    i7 = ((iHashCode * 37) + 6) * 53;
                    bindStatus = getLoginStatus();
                    number = Internal.hashBoolean(bindStatus);
                    iHashCode = i7 + number;
                    break;
                case 7:
                    i7 = ((iHashCode * 37) + 7) * 53;
                    bindKey = getVerifyKey();
                    number = bindKey.hashCode();
                    iHashCode = i7 + number;
                    break;
                case 8:
                    i7 = ((iHashCode * 37) + 8) * 53;
                    bindStatus = getVerifyResult();
                    number = Internal.hashBoolean(bindStatus);
                    iHashCode = i7 + number;
                    break;
                case 11:
                    i7 = ((iHashCode * 37) + 11) * 53;
                    number = getBindInfoV2().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 12:
                    i7 = ((iHashCode * 37) + 12) * 53;
                    number = getBindVerifyRequestV2().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 13:
                    i7 = ((iHashCode * 37) + 13) * 53;
                    number = getBindVerifyResponseV2().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 15:
                    i7 = ((iHashCode * 37) + 15) * 53;
                    number = getBindOobRequestV2().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 16:
                    i7 = ((iHashCode * 37) + 16) * 53;
                    number = getBindOobResponseV2().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 17:
                    i7 = ((iHashCode * 37) + 17) * 53;
                    number = getBindResultV2().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 18:
                    i7 = ((iHashCode * 37) + 18) * 53;
                    number = getConnectVerifyRequestV2().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 19:
                    i7 = ((iHashCode * 37) + 19) * 53;
                    number = getConnectVerifyResponseV2().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 20:
                    i7 = ((iHashCode * 37) + 20) * 53;
                    number = getConnectConfirmRequestV2().hashCode();
                    iHashCode = i7 + number;
                    break;
                case 21:
                    i7 = ((iHashCode * 37) + 21) * 53;
                    number = getConnectConfirmResponseV2().hashCode();
                    iHashCode = i7 + number;
                    break;
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_Account_fieldAccessorTable.ensureFieldAccessorsInitialized(Account.class, Builder.class);
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
            if (hasBindInfo() && !getBindInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBindResult() && !getBindResult().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBindInfoV2() && !getBindInfoV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBindVerifyRequestV2() && !getBindVerifyRequestV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBindVerifyResponseV2() && !getBindVerifyResponseV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBindOobRequestV2() && !getBindOobRequestV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBindOobResponseV2() && !getBindOobResponseV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBindResultV2() && !getBindResultV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectVerifyRequestV2() && !getConnectVerifyRequestV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectVerifyResponseV2() && !getConnectVerifyResponseV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectConfirmRequestV2() && !getConnectConfirmRequestV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasConnectConfirmResponseV2() || getConnectConfirmResponseV2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeBool(1, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeEnum(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (BindInfo) this.payload_);
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (BindResult) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeBool(6, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 7) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeBool(8, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (BindInfoV2) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                codedOutputStream.writeMessage(12, (BindVerifyRequestV2) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeMessage(13, (BindVerifyResponseV2) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                codedOutputStream.writeMessage(15, (BindOOBRequestV2) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                codedOutputStream.writeMessage(16, (BindOOBResponseV2) this.payload_);
            }
            if (this.payloadCase_ == 17) {
                codedOutputStream.writeMessage(17, (BindResultV2) this.payload_);
            }
            if (this.payloadCase_ == 18) {
                codedOutputStream.writeMessage(18, (ConnectVerifyRequestV2) this.payload_);
            }
            if (this.payloadCase_ == 19) {
                codedOutputStream.writeMessage(19, (ConnectVerifyResponseV2) this.payload_);
            }
            if (this.payloadCase_ == 20) {
                codedOutputStream.writeMessage(20, (ConnectConfirmRequestV2) this.payload_);
            }
            if (this.payloadCase_ == 21) {
                codedOutputStream.writeMessage(21, (ConnectConfirmResponseV2) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Account(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            boolean bool;
            Object bytes;
            int i7;
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
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
                                this.payloadCase_ = 1;
                                bool = codedInputStream.readBool();
                                bytes = Boolean.valueOf(bool);
                                this.payload_ = bytes;
                                break;
                            case 18:
                                bytes = codedInputStream.readBytes();
                                this.payloadCase_ = 2;
                                this.payload_ = bytes;
                                break;
                            case 24:
                                int i8 = codedInputStream.readEnum();
                                if (ErrorCode.valueOf(i8) != null) {
                                    this.payloadCase_ = 3;
                                    bytes = Integer.valueOf(i8);
                                    this.payload_ = bytes;
                                } else {
                                    builderNewBuilder.mergeVarintField(3, i8);
                                }
                                break;
                            case 34:
                                i7 = 4;
                                BindInfo.Builder builder = this.payloadCase_ == 4 ? ((BindInfo) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(BindInfo.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((BindInfo) message);
                                    this.payload_ = builder.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 42:
                                i7 = 5;
                                BindResult.Builder builder2 = this.payloadCase_ == 5 ? ((BindResult) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(BindResult.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((BindResult) message2);
                                    this.payload_ = builder2.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 48:
                                this.payloadCase_ = 6;
                                bool = codedInputStream.readBool();
                                bytes = Boolean.valueOf(bool);
                                this.payload_ = bytes;
                                break;
                            case 58:
                                bytes = codedInputStream.readBytes();
                                this.payloadCase_ = 7;
                                this.payload_ = bytes;
                                break;
                            case 64:
                                this.payloadCase_ = 8;
                                bool = codedInputStream.readBool();
                                bytes = Boolean.valueOf(bool);
                                this.payload_ = bytes;
                                break;
                            case 90:
                                i7 = 11;
                                BindInfoV2.Builder builder3 = this.payloadCase_ == 11 ? ((BindInfoV2) this.payload_).toBuilder() : null;
                                MessageLite message3 = codedInputStream.readMessage(BindInfoV2.PARSER, extensionRegistryLite);
                                this.payload_ = message3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((BindInfoV2) message3);
                                    this.payload_ = builder3.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 98:
                                i7 = 12;
                                BindVerifyRequestV2.Builder builder4 = this.payloadCase_ == 12 ? ((BindVerifyRequestV2) this.payload_).toBuilder() : null;
                                MessageLite message4 = codedInputStream.readMessage(BindVerifyRequestV2.PARSER, extensionRegistryLite);
                                this.payload_ = message4;
                                if (builder4 != null) {
                                    builder4.mergeFrom((BindVerifyRequestV2) message4);
                                    this.payload_ = builder4.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 106:
                                i7 = 13;
                                BindVerifyResponseV2.Builder builder5 = this.payloadCase_ == 13 ? ((BindVerifyResponseV2) this.payload_).toBuilder() : null;
                                MessageLite message5 = codedInputStream.readMessage(BindVerifyResponseV2.PARSER, extensionRegistryLite);
                                this.payload_ = message5;
                                if (builder5 != null) {
                                    builder5.mergeFrom((BindVerifyResponseV2) message5);
                                    this.payload_ = builder5.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 122:
                                i7 = 15;
                                BindOOBRequestV2.Builder builder6 = this.payloadCase_ == 15 ? ((BindOOBRequestV2) this.payload_).toBuilder() : null;
                                MessageLite message6 = codedInputStream.readMessage(BindOOBRequestV2.PARSER, extensionRegistryLite);
                                this.payload_ = message6;
                                if (builder6 != null) {
                                    builder6.mergeFrom((BindOOBRequestV2) message6);
                                    this.payload_ = builder6.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 130:
                                i7 = 16;
                                BindOOBResponseV2.Builder builder7 = this.payloadCase_ == 16 ? ((BindOOBResponseV2) this.payload_).toBuilder() : null;
                                MessageLite message7 = codedInputStream.readMessage(BindOOBResponseV2.PARSER, extensionRegistryLite);
                                this.payload_ = message7;
                                if (builder7 != null) {
                                    builder7.mergeFrom((BindOOBResponseV2) message7);
                                    this.payload_ = builder7.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 138:
                                i7 = 17;
                                BindResultV2.Builder builder8 = this.payloadCase_ == 17 ? ((BindResultV2) this.payload_).toBuilder() : null;
                                MessageLite message8 = codedInputStream.readMessage(BindResultV2.PARSER, extensionRegistryLite);
                                this.payload_ = message8;
                                if (builder8 != null) {
                                    builder8.mergeFrom((BindResultV2) message8);
                                    this.payload_ = builder8.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 146:
                                i7 = 18;
                                ConnectVerifyRequestV2.Builder builder9 = this.payloadCase_ == 18 ? ((ConnectVerifyRequestV2) this.payload_).toBuilder() : null;
                                MessageLite message9 = codedInputStream.readMessage(ConnectVerifyRequestV2.PARSER, extensionRegistryLite);
                                this.payload_ = message9;
                                if (builder9 != null) {
                                    builder9.mergeFrom((ConnectVerifyRequestV2) message9);
                                    this.payload_ = builder9.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 154:
                                i7 = 19;
                                ConnectVerifyResponseV2.Builder builder10 = this.payloadCase_ == 19 ? ((ConnectVerifyResponseV2) this.payload_).toBuilder() : null;
                                MessageLite message10 = codedInputStream.readMessage(ConnectVerifyResponseV2.PARSER, extensionRegistryLite);
                                this.payload_ = message10;
                                if (builder10 != null) {
                                    builder10.mergeFrom((ConnectVerifyResponseV2) message10);
                                    this.payload_ = builder10.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 162:
                                i7 = 20;
                                ConnectConfirmRequestV2.Builder builder11 = this.payloadCase_ == 20 ? ((ConnectConfirmRequestV2) this.payload_).toBuilder() : null;
                                MessageLite message11 = codedInputStream.readMessage(ConnectConfirmRequestV2.PARSER, extensionRegistryLite);
                                this.payload_ = message11;
                                if (builder11 != null) {
                                    builder11.mergeFrom((ConnectConfirmRequestV2) message11);
                                    this.payload_ = builder11.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 170:
                                i7 = 21;
                                ConnectConfirmResponseV2.Builder builder12 = this.payloadCase_ == 21 ? ((ConnectConfirmResponseV2) this.payload_).toBuilder() : null;
                                MessageLite message12 = codedInputStream.readMessage(ConnectConfirmResponseV2.PARSER, extensionRegistryLite);
                                this.payload_ = message12;
                                if (builder12 != null) {
                                    builder12.mergeFrom((ConnectConfirmResponseV2) message12);
                                    this.payload_ = builder12.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    z6 = true;
                                }
                                break;
                        }
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

        public static Builder newBuilder(Account account) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(account);
        }

        public static Account parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Account) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Account parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Account parseFrom(CodedInputStream codedInputStream) {
            return (Account) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Account getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Account(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Account parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Account) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Account parseFrom(InputStream inputStream) {
            return (Account) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Account parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Account) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Account parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Account parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Account parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Account parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface AccountOrBuilder extends MessageOrBuilder {
        BindInfo getBindInfo();

        BindInfoOrBuilder getBindInfoOrBuilder();

        BindInfoV2 getBindInfoV2();

        BindInfoV2OrBuilder getBindInfoV2OrBuilder();

        String getBindKey();

        ByteString getBindKeyBytes();

        BindOOBRequestV2 getBindOobRequestV2();

        BindOOBRequestV2OrBuilder getBindOobRequestV2OrBuilder();

        BindOOBResponseV2 getBindOobResponseV2();

        BindOOBResponseV2OrBuilder getBindOobResponseV2OrBuilder();

        BindResult getBindResult();

        BindResultOrBuilder getBindResultOrBuilder();

        BindResultV2 getBindResultV2();

        BindResultV2OrBuilder getBindResultV2OrBuilder();

        boolean getBindStatus();

        BindVerifyRequestV2 getBindVerifyRequestV2();

        BindVerifyRequestV2OrBuilder getBindVerifyRequestV2OrBuilder();

        BindVerifyResponseV2 getBindVerifyResponseV2();

        BindVerifyResponseV2OrBuilder getBindVerifyResponseV2OrBuilder();

        ConnectConfirmRequestV2 getConnectConfirmRequestV2();

        ConnectConfirmRequestV2OrBuilder getConnectConfirmRequestV2OrBuilder();

        ConnectConfirmResponseV2 getConnectConfirmResponseV2();

        ConnectConfirmResponseV2OrBuilder getConnectConfirmResponseV2OrBuilder();

        ConnectVerifyRequestV2 getConnectVerifyRequestV2();

        ConnectVerifyRequestV2OrBuilder getConnectVerifyRequestV2OrBuilder();

        ConnectVerifyResponseV2 getConnectVerifyResponseV2();

        ConnectVerifyResponseV2OrBuilder getConnectVerifyResponseV2OrBuilder();

        Account.ErrorCode getErrorCode();

        boolean getLoginStatus();

        Account.PayloadCase getPayloadCase();

        String getVerifyKey();

        ByteString getVerifyKeyBytes();

        boolean getVerifyResult();

        boolean hasBindInfo();

        boolean hasBindInfoV2();

        boolean hasBindKey();

        boolean hasBindOobRequestV2();

        boolean hasBindOobResponseV2();

        boolean hasBindResult();

        boolean hasBindResultV2();

        boolean hasBindStatus();

        boolean hasBindVerifyRequestV2();

        boolean hasBindVerifyResponseV2();

        boolean hasConnectConfirmRequestV2();

        boolean hasConnectConfirmResponseV2();

        boolean hasConnectVerifyRequestV2();

        boolean hasConnectVerifyResponseV2();

        boolean hasErrorCode();

        boolean hasLoginStatus();

        boolean hasVerifyKey();

        boolean hasVerifyResult();
    }

    public static final class BindInfo extends GeneratedMessageV3 implements BindInfoOrBuilder {
        public static final int BIND_KEY_FIELD_NUMBER = 1;
        public static final int DID_FIELD_NUMBER = 2;
        public static final int MAC_FIELD_NUMBER = 4;
        public static final int MODEL_FIELD_NUMBER = 3;
        public static final int SERIAL_NUMBER_FIELD_NUMBER = 6;
        public static final int SIGN_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private volatile Object bindKey_;
        private int bitField0_;
        private volatile Object did_;
        private volatile Object mac_;
        private byte memoizedIsInitialized;
        private volatile Object model_;
        private volatile Object serialNumber_;
        private volatile Object sign_;
        private static final BindInfo DEFAULT_INSTANCE = new BindInfo();

        @Deprecated
        public static final Parser<BindInfo> PARSER = new AbstractParser<BindInfo>() { // from class: com.zh.wear.protobuf.AccountProtos.BindInfo.1
            @Override // com.google.protobuf.Parser
            public BindInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BindInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BindInfoOrBuilder {
            private Object bindKey_;
            private int bitField0_;
            private Object did_;
            private Object mac_;
            private Object model_;
            private Object serialNumber_;
            private Object sign_;

            private Builder() {
                this.bindKey_ = "";
                this.did_ = "";
                this.model_ = "";
                this.mac_ = "";
                this.sign_ = "";
                this.serialNumber_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_BindInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearBindKey() {
                this.bitField0_ &= -2;
                this.bindKey_ = BindInfo.getDefaultInstance().getBindKey();
                onChanged();
                return this;
            }

            public Builder clearDid() {
                this.bitField0_ &= -3;
                this.did_ = BindInfo.getDefaultInstance().getDid();
                onChanged();
                return this;
            }

            public Builder clearMac() {
                this.bitField0_ &= -9;
                this.mac_ = BindInfo.getDefaultInstance().getMac();
                onChanged();
                return this;
            }

            public Builder clearModel() {
                this.bitField0_ &= -5;
                this.model_ = BindInfo.getDefaultInstance().getModel();
                onChanged();
                return this;
            }

            public Builder clearSerialNumber() {
                this.bitField0_ &= -33;
                this.serialNumber_ = BindInfo.getDefaultInstance().getSerialNumber();
                onChanged();
                return this;
            }

            public Builder clearSign() {
                this.bitField0_ &= -17;
                this.sign_ = BindInfo.getDefaultInstance().getSign();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public String getBindKey() {
                Object obj = this.bindKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.bindKey_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public ByteString getBindKeyBytes() {
                Object obj = this.bindKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bindKey_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_BindInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public String getDid() {
                Object obj = this.did_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.did_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public ByteString getDidBytes() {
                Object obj = this.did_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.did_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
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

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public ByteString getMacBytes() {
                Object obj = this.mac_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mac_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public String getModel() {
                Object obj = this.model_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.model_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public ByteString getModelBytes() {
                Object obj = this.model_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.model_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
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

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public ByteString getSerialNumberBytes() {
                Object obj = this.serialNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serialNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public String getSign() {
                Object obj = this.sign_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sign_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public ByteString getSignBytes() {
                Object obj = this.sign_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sign_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public boolean hasBindKey() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public boolean hasDid() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public boolean hasMac() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public boolean hasModel() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public boolean hasSerialNumber() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
            public boolean hasSign() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_BindInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BindInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasBindKey() && hasDid() && hasModel() && hasMac() && hasSign();
            }

            public Builder setBindKey(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.bindKey_ = str;
                onChanged();
                return this;
            }

            public Builder setBindKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.bindKey_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDid(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.did_ = str;
                onChanged();
                return this;
            }

            public Builder setDidBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.did_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMac(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.mac_ = str;
                onChanged();
                return this;
            }

            public Builder setMacBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.mac_ = byteString;
                onChanged();
                return this;
            }

            public Builder setModel(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.model_ = str;
                onChanged();
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.model_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSerialNumber(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.serialNumber_ = str;
                onChanged();
                return this;
            }

            public Builder setSerialNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 32;
                this.serialNumber_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSign(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.sign_ = str;
                onChanged();
                return this;
            }

            public Builder setSignBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.sign_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.bindKey_ = "";
                this.did_ = "";
                this.model_ = "";
                this.mac_ = "";
                this.sign_ = "";
                this.serialNumber_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindInfo build() {
                BindInfo bindInfoBuildPartial = buildPartial();
                if (bindInfoBuildPartial.isInitialized()) {
                    return bindInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bindInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindInfo buildPartial() {
                BindInfo bindInfo = new BindInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                bindInfo.bindKey_ = this.bindKey_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                bindInfo.did_ = this.did_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                bindInfo.model_ = this.model_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                bindInfo.mac_ = this.mac_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                bindInfo.sign_ = this.sign_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                bindInfo.serialNumber_ = this.serialNumber_;
                bindInfo.bitField0_ = i8;
                onBuilt();
                return bindInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BindInfo getDefaultInstanceForType() {
                return BindInfo.getDefaultInstance();
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
                this.bindKey_ = "";
                int i7 = this.bitField0_;
                this.did_ = "";
                this.model_ = "";
                this.mac_ = "";
                this.sign_ = "";
                this.serialNumber_ = "";
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
            public com.zh.wear.protobuf.AccountProtos.BindInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$BindInfo> r1 = com.zh.wear.protobuf.AccountProtos.BindInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$BindInfo r3 = (com.zh.wear.protobuf.AccountProtos.BindInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$BindInfo r4 = (com.zh.wear.protobuf.AccountProtos.BindInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.BindInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$BindInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BindInfo) {
                    return mergeFrom((BindInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BindInfo bindInfo) {
                if (bindInfo == BindInfo.getDefaultInstance()) {
                    return this;
                }
                if (bindInfo.hasBindKey()) {
                    this.bitField0_ |= 1;
                    this.bindKey_ = bindInfo.bindKey_;
                    onChanged();
                }
                if (bindInfo.hasDid()) {
                    this.bitField0_ |= 2;
                    this.did_ = bindInfo.did_;
                    onChanged();
                }
                if (bindInfo.hasModel()) {
                    this.bitField0_ |= 4;
                    this.model_ = bindInfo.model_;
                    onChanged();
                }
                if (bindInfo.hasMac()) {
                    this.bitField0_ |= 8;
                    this.mac_ = bindInfo.mac_;
                    onChanged();
                }
                if (bindInfo.hasSign()) {
                    this.bitField0_ |= 16;
                    this.sign_ = bindInfo.sign_;
                    onChanged();
                }
                if (bindInfo.hasSerialNumber()) {
                    this.bitField0_ |= 32;
                    this.serialNumber_ = bindInfo.serialNumber_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) bindInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        private BindInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.bindKey_ = "";
            this.did_ = "";
            this.model_ = "";
            this.mac_ = "";
            this.sign_ = "";
            this.serialNumber_ = "";
        }

        public static BindInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_BindInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BindInfo parseDelimitedFrom(InputStream inputStream) {
            return (BindInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BindInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BindInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindInfo)) {
                return super.equals(obj);
            }
            BindInfo bindInfo = (BindInfo) obj;
            boolean z6 = hasBindKey() == bindInfo.hasBindKey();
            if (hasBindKey()) {
                z6 = z6 && getBindKey().equals(bindInfo.getBindKey());
            }
            boolean z7 = z6 && hasDid() == bindInfo.hasDid();
            if (hasDid()) {
                z7 = z7 && getDid().equals(bindInfo.getDid());
            }
            boolean z8 = z7 && hasModel() == bindInfo.hasModel();
            if (hasModel()) {
                z8 = z8 && getModel().equals(bindInfo.getModel());
            }
            boolean z9 = z8 && hasMac() == bindInfo.hasMac();
            if (hasMac()) {
                z9 = z9 && getMac().equals(bindInfo.getMac());
            }
            boolean z10 = z9 && hasSign() == bindInfo.hasSign();
            if (hasSign()) {
                z10 = z10 && getSign().equals(bindInfo.getSign());
            }
            boolean z11 = z10 && hasSerialNumber() == bindInfo.hasSerialNumber();
            if (hasSerialNumber()) {
                z11 = z11 && getSerialNumber().equals(bindInfo.getSerialNumber());
            }
            return z11 && this.unknownFields.equals(bindInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public String getBindKey() {
            Object obj = this.bindKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bindKey_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public ByteString getBindKeyBytes() {
            Object obj = this.bindKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bindKey_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public String getDid() {
            Object obj = this.did_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.did_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public ByteString getDidBytes() {
            Object obj = this.did_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.did_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
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

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public ByteString getMacBytes() {
            Object obj = this.mac_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mac_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.model_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BindInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
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

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
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
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.bindKey_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.did_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.model_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.mac_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.sign_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeStringSize += GeneratedMessage.computeStringSize(6, this.serialNumber_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public String getSign() {
            Object obj = this.sign_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sign_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public ByteString getSignBytes() {
            Object obj = this.sign_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sign_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public boolean hasBindKey() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public boolean hasDid() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public boolean hasMac() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public boolean hasModel() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public boolean hasSerialNumber() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoOrBuilder
        public boolean hasSign() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasBindKey()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBindKey().hashCode();
            }
            if (hasDid()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDid().hashCode();
            }
            if (hasModel()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getModel().hashCode();
            }
            if (hasMac()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMac().hashCode();
            }
            if (hasSign()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getSign().hashCode();
            }
            if (hasSerialNumber()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getSerialNumber().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_BindInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BindInfo.class, Builder.class);
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
            if (!hasBindKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasModel()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMac()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSign()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.bindKey_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.did_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.model_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.mac_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.sign_);
            }
            if ((this.bitField0_ & 32) == 32) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.serialNumber_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BindInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bindKey_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.did_ = bytes2;
                            } else if (tag == 26) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.model_ = bytes3;
                            } else if (tag == 34) {
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.mac_ = bytes4;
                            } else if (tag == 42) {
                                ByteString bytes5 = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.sign_ = bytes5;
                            } else if (tag == 50) {
                                ByteString bytes6 = codedInputStream.readBytes();
                                this.bitField0_ |= 32;
                                this.serialNumber_ = bytes6;
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

        public static Builder newBuilder(BindInfo bindInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bindInfo);
        }

        public static BindInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BindInfo parseFrom(CodedInputStream codedInputStream) {
            return (BindInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BindInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BindInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BindInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BindInfo parseFrom(InputStream inputStream) {
            return (BindInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BindInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BindInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BindInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BindInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BindInfoOrBuilder extends MessageOrBuilder {
        String getBindKey();

        ByteString getBindKeyBytes();

        String getDid();

        ByteString getDidBytes();

        String getMac();

        ByteString getMacBytes();

        String getModel();

        ByteString getModelBytes();

        String getSerialNumber();

        ByteString getSerialNumberBytes();

        String getSign();

        ByteString getSignBytes();

        boolean hasBindKey();

        boolean hasDid();

        boolean hasMac();

        boolean hasModel();

        boolean hasSerialNumber();

        boolean hasSign();
    }

    public static final class BindInfoV2 extends GeneratedMessageV3 implements BindInfoV2OrBuilder {
        public static final int DID_FIELD_NUMBER = 7;
        public static final int MAC_FIELD_NUMBER = 3;
        public static final int MODEL_FIELD_NUMBER = 4;
        public static final int OOB_MODE_FIELD_NUMBER = 5;
        public static final int RANDOM_DEV_FIELD_NUMBER = 6;
        public static final int SERIAL_NUMBER_FIELD_NUMBER = 2;
        public static final int VERIFY_MODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object did_;
        private volatile Object mac_;
        private byte memoizedIsInitialized;
        private volatile Object model_;
        private int oobMode_;
        private ByteString randomDev_;
        private volatile Object serialNumber_;
        private int verifyMode_;
        private static final BindInfoV2 DEFAULT_INSTANCE = new BindInfoV2();

        @Deprecated
        public static final Parser<BindInfoV2> PARSER = new AbstractParser<BindInfoV2>() { // from class: com.zh.wear.protobuf.AccountProtos.BindInfoV2.1
            @Override // com.google.protobuf.Parser
            public BindInfoV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BindInfoV2(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BindInfoV2OrBuilder {
            private int bitField0_;
            private Object did_;
            private Object mac_;
            private Object model_;
            private int oobMode_;
            private ByteString randomDev_;
            private Object serialNumber_;
            private int verifyMode_;

            private Builder() {
                this.verifyMode_ = 1;
                this.serialNumber_ = "";
                this.mac_ = "";
                this.model_ = "";
                this.oobMode_ = 1;
                this.randomDev_ = ByteString.EMPTY;
                this.did_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_BindInfoV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearDid() {
                this.bitField0_ &= -65;
                this.did_ = BindInfoV2.getDefaultInstance().getDid();
                onChanged();
                return this;
            }

            public Builder clearMac() {
                this.bitField0_ &= -5;
                this.mac_ = BindInfoV2.getDefaultInstance().getMac();
                onChanged();
                return this;
            }

            public Builder clearModel() {
                this.bitField0_ &= -9;
                this.model_ = BindInfoV2.getDefaultInstance().getModel();
                onChanged();
                return this;
            }

            public Builder clearOobMode() {
                this.bitField0_ &= -17;
                this.oobMode_ = 1;
                onChanged();
                return this;
            }

            public Builder clearRandomDev() {
                this.bitField0_ &= -33;
                this.randomDev_ = BindInfoV2.getDefaultInstance().getRandomDev();
                onChanged();
                return this;
            }

            public Builder clearSerialNumber() {
                this.bitField0_ &= -3;
                this.serialNumber_ = BindInfoV2.getDefaultInstance().getSerialNumber();
                onChanged();
                return this;
            }

            public Builder clearVerifyMode() {
                this.bitField0_ &= -2;
                this.verifyMode_ = 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_BindInfoV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public String getDid() {
                Object obj = this.did_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.did_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public ByteString getDidBytes() {
                Object obj = this.did_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.did_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
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

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public ByteString getMacBytes() {
                Object obj = this.mac_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mac_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public String getModel() {
                Object obj = this.model_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.model_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public ByteString getModelBytes() {
                Object obj = this.model_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.model_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public OOBMode getOobMode() {
                OOBMode oOBModeValueOf = OOBMode.valueOf(this.oobMode_);
                return oOBModeValueOf == null ? OOBMode.NUMERIC_COMPARISON : oOBModeValueOf;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public ByteString getRandomDev() {
                return this.randomDev_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
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

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public ByteString getSerialNumberBytes() {
                Object obj = this.serialNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serialNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public VerifyMode getVerifyMode() {
                VerifyMode verifyModeValueOf = VerifyMode.valueOf(this.verifyMode_);
                return verifyModeValueOf == null ? VerifyMode.PSK_TWO_WAY_VERIFY : verifyModeValueOf;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public boolean hasDid() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public boolean hasMac() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public boolean hasModel() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public boolean hasOobMode() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public boolean hasRandomDev() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public boolean hasSerialNumber() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
            public boolean hasVerifyMode() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_BindInfoV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindInfoV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasVerifyMode() && hasSerialNumber() && hasMac() && hasModel() && hasOobMode() && hasRandomDev();
            }

            public Builder setDid(String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.did_ = str;
                onChanged();
                return this;
            }

            public Builder setDidBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 64;
                this.did_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMac(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.mac_ = str;
                onChanged();
                return this;
            }

            public Builder setMacBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.mac_ = byteString;
                onChanged();
                return this;
            }

            public Builder setModel(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.model_ = str;
                onChanged();
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.model_ = byteString;
                onChanged();
                return this;
            }

            public Builder setOobMode(OOBMode oOBMode) {
                oOBMode.getClass();
                this.bitField0_ |= 16;
                this.oobMode_ = oOBMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setRandomDev(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 32;
                this.randomDev_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSerialNumber(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.serialNumber_ = str;
                onChanged();
                return this;
            }

            public Builder setSerialNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.serialNumber_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVerifyMode(VerifyMode verifyMode) {
                verifyMode.getClass();
                this.bitField0_ |= 1;
                this.verifyMode_ = verifyMode.getNumber();
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.verifyMode_ = 1;
                this.serialNumber_ = "";
                this.mac_ = "";
                this.model_ = "";
                this.oobMode_ = 1;
                this.randomDev_ = ByteString.EMPTY;
                this.did_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindInfoV2 build() {
                BindInfoV2 bindInfoV2BuildPartial = buildPartial();
                if (bindInfoV2BuildPartial.isInitialized()) {
                    return bindInfoV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bindInfoV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindInfoV2 buildPartial() {
                BindInfoV2 bindInfoV2 = new BindInfoV2(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                bindInfoV2.verifyMode_ = this.verifyMode_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                bindInfoV2.serialNumber_ = this.serialNumber_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                bindInfoV2.mac_ = this.mac_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                bindInfoV2.model_ = this.model_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                bindInfoV2.oobMode_ = this.oobMode_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                bindInfoV2.randomDev_ = this.randomDev_;
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                bindInfoV2.did_ = this.did_;
                bindInfoV2.bitField0_ = i8;
                onBuilt();
                return bindInfoV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BindInfoV2 getDefaultInstanceForType() {
                return BindInfoV2.getDefaultInstance();
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
                this.verifyMode_ = 1;
                int i7 = this.bitField0_;
                this.serialNumber_ = "";
                this.mac_ = "";
                this.model_ = "";
                this.oobMode_ = 1;
                this.bitField0_ = i7 & (-32);
                this.randomDev_ = ByteString.EMPTY;
                this.did_ = "";
                this.bitField0_ = i7 & (-128);
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
            public com.zh.wear.protobuf.AccountProtos.BindInfoV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$BindInfoV2> r1 = com.zh.wear.protobuf.AccountProtos.BindInfoV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$BindInfoV2 r3 = (com.zh.wear.protobuf.AccountProtos.BindInfoV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$BindInfoV2 r4 = (com.zh.wear.protobuf.AccountProtos.BindInfoV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.BindInfoV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$BindInfoV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BindInfoV2) {
                    return mergeFrom((BindInfoV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BindInfoV2 bindInfoV2) {
                if (bindInfoV2 == BindInfoV2.getDefaultInstance()) {
                    return this;
                }
                if (bindInfoV2.hasVerifyMode()) {
                    setVerifyMode(bindInfoV2.getVerifyMode());
                }
                if (bindInfoV2.hasSerialNumber()) {
                    this.bitField0_ |= 2;
                    this.serialNumber_ = bindInfoV2.serialNumber_;
                    onChanged();
                }
                if (bindInfoV2.hasMac()) {
                    this.bitField0_ |= 4;
                    this.mac_ = bindInfoV2.mac_;
                    onChanged();
                }
                if (bindInfoV2.hasModel()) {
                    this.bitField0_ |= 8;
                    this.model_ = bindInfoV2.model_;
                    onChanged();
                }
                if (bindInfoV2.hasOobMode()) {
                    setOobMode(bindInfoV2.getOobMode());
                }
                if (bindInfoV2.hasRandomDev()) {
                    setRandomDev(bindInfoV2.getRandomDev());
                }
                if (bindInfoV2.hasDid()) {
                    this.bitField0_ |= 64;
                    this.did_ = bindInfoV2.did_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) bindInfoV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private BindInfoV2() {
            this.memoizedIsInitialized = (byte) -1;
            this.verifyMode_ = 1;
            this.serialNumber_ = "";
            this.mac_ = "";
            this.model_ = "";
            this.oobMode_ = 1;
            this.randomDev_ = ByteString.EMPTY;
            this.did_ = "";
        }

        public static BindInfoV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_BindInfoV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BindInfoV2 parseDelimitedFrom(InputStream inputStream) {
            return (BindInfoV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BindInfoV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BindInfoV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindInfoV2)) {
                return super.equals(obj);
            }
            BindInfoV2 bindInfoV2 = (BindInfoV2) obj;
            boolean z6 = hasVerifyMode() == bindInfoV2.hasVerifyMode();
            if (hasVerifyMode()) {
                z6 = z6 && this.verifyMode_ == bindInfoV2.verifyMode_;
            }
            boolean z7 = z6 && hasSerialNumber() == bindInfoV2.hasSerialNumber();
            if (hasSerialNumber()) {
                z7 = z7 && getSerialNumber().equals(bindInfoV2.getSerialNumber());
            }
            boolean z8 = z7 && hasMac() == bindInfoV2.hasMac();
            if (hasMac()) {
                z8 = z8 && getMac().equals(bindInfoV2.getMac());
            }
            boolean z9 = z8 && hasModel() == bindInfoV2.hasModel();
            if (hasModel()) {
                z9 = z9 && getModel().equals(bindInfoV2.getModel());
            }
            boolean z10 = z9 && hasOobMode() == bindInfoV2.hasOobMode();
            if (hasOobMode()) {
                z10 = z10 && this.oobMode_ == bindInfoV2.oobMode_;
            }
            boolean z11 = z10 && hasRandomDev() == bindInfoV2.hasRandomDev();
            if (hasRandomDev()) {
                z11 = z11 && getRandomDev().equals(bindInfoV2.getRandomDev());
            }
            boolean z12 = z11 && hasDid() == bindInfoV2.hasDid();
            if (hasDid()) {
                z12 = z12 && getDid().equals(bindInfoV2.getDid());
            }
            return z12 && this.unknownFields.equals(bindInfoV2.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public String getDid() {
            Object obj = this.did_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.did_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public ByteString getDidBytes() {
            Object obj = this.did_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.did_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
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

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public ByteString getMacBytes() {
            Object obj = this.mac_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mac_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.model_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public OOBMode getOobMode() {
            OOBMode oOBModeValueOf = OOBMode.valueOf(this.oobMode_);
            return oOBModeValueOf == null ? OOBMode.NUMERIC_COMPARISON : oOBModeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BindInfoV2> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public ByteString getRandomDev() {
            return this.randomDev_;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
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

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
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
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.verifyMode_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.serialNumber_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(3, this.mac_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(4, this.model_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(5, this.oobMode_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(6, this.randomDev_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(7, this.did_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public VerifyMode getVerifyMode() {
            VerifyMode verifyModeValueOf = VerifyMode.valueOf(this.verifyMode_);
            return verifyModeValueOf == null ? VerifyMode.PSK_TWO_WAY_VERIFY : verifyModeValueOf;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public boolean hasDid() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public boolean hasMac() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public boolean hasModel() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public boolean hasOobMode() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public boolean hasRandomDev() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public boolean hasSerialNumber() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindInfoV2OrBuilder
        public boolean hasVerifyMode() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasVerifyMode()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.verifyMode_;
            }
            if (hasSerialNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSerialNumber().hashCode();
            }
            if (hasMac()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMac().hashCode();
            }
            if (hasModel()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getModel().hashCode();
            }
            if (hasOobMode()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + this.oobMode_;
            }
            if (hasRandomDev()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getRandomDev().hashCode();
            }
            if (hasDid()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getDid().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_BindInfoV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindInfoV2.class, Builder.class);
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
            if (!hasVerifyMode()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSerialNumber()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMac()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasModel()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasOobMode()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRandomDev()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.verifyMode_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.serialNumber_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.mac_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.model_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeEnum(5, this.oobMode_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeBytes(6, this.randomDev_);
            }
            if ((this.bitField0_ & 64) == 64) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.did_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BindInfoV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                int i7 = codedInputStream.readEnum();
                                if (VerifyMode.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.verifyMode_ = i7;
                                }
                            } else if (tag == 18) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.serialNumber_ = bytes;
                            } else if (tag == 26) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.mac_ = bytes2;
                            } else if (tag == 34) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.model_ = bytes3;
                            } else if (tag == 40) {
                                int i8 = codedInputStream.readEnum();
                                if (OOBMode.valueOf(i8) == null) {
                                    builderNewBuilder.mergeVarintField(5, i8);
                                } else {
                                    this.bitField0_ |= 16;
                                    this.oobMode_ = i8;
                                }
                            } else if (tag == 50) {
                                this.bitField0_ |= 32;
                                this.randomDev_ = codedInputStream.readBytes();
                            } else if (tag == 58) {
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 64;
                                this.did_ = bytes4;
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

        public static Builder newBuilder(BindInfoV2 bindInfoV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bindInfoV2);
        }

        public static BindInfoV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindInfoV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindInfoV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BindInfoV2 parseFrom(CodedInputStream codedInputStream) {
            return (BindInfoV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BindInfoV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BindInfoV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BindInfoV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindInfoV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BindInfoV2 parseFrom(InputStream inputStream) {
            return (BindInfoV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BindInfoV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindInfoV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindInfoV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BindInfoV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BindInfoV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BindInfoV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BindInfoV2OrBuilder extends MessageOrBuilder {
        String getDid();

        ByteString getDidBytes();

        String getMac();

        ByteString getMacBytes();

        String getModel();

        ByteString getModelBytes();

        OOBMode getOobMode();

        ByteString getRandomDev();

        String getSerialNumber();

        ByteString getSerialNumberBytes();

        VerifyMode getVerifyMode();

        boolean hasDid();

        boolean hasMac();

        boolean hasModel();

        boolean hasOobMode();

        boolean hasRandomDev();

        boolean hasSerialNumber();

        boolean hasVerifyMode();
    }

    public static final class BindOOBRequestV2 extends GeneratedMessageV3 implements BindOOBRequestV2OrBuilder {
        public static final int BIND_KEY_FIELD_NUMBER = 2;
        public static final int ENCRYPT_OOB_CODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object bindKey_;
        private int bitField0_;
        private ByteString encryptOobCode_;
        private byte memoizedIsInitialized;
        private static final BindOOBRequestV2 DEFAULT_INSTANCE = new BindOOBRequestV2();

        @Deprecated
        public static final Parser<BindOOBRequestV2> PARSER = new AbstractParser<BindOOBRequestV2>() { // from class: com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2.1
            @Override // com.google.protobuf.Parser
            public BindOOBRequestV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BindOOBRequestV2(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BindOOBRequestV2OrBuilder {
            private Object bindKey_;
            private int bitField0_;
            private ByteString encryptOobCode_;

            private Builder() {
                this.encryptOobCode_ = ByteString.EMPTY;
                this.bindKey_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_BindOOBRequestV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearBindKey() {
                this.bitField0_ &= -3;
                this.bindKey_ = BindOOBRequestV2.getDefaultInstance().getBindKey();
                onChanged();
                return this;
            }

            public Builder clearEncryptOobCode() {
                this.bitField0_ &= -2;
                this.encryptOobCode_ = BindOOBRequestV2.getDefaultInstance().getEncryptOobCode();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
            public String getBindKey() {
                Object obj = this.bindKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.bindKey_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
            public ByteString getBindKeyBytes() {
                Object obj = this.bindKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bindKey_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_BindOOBRequestV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
            public ByteString getEncryptOobCode() {
                return this.encryptOobCode_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
            public boolean hasBindKey() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
            public boolean hasEncryptOobCode() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_BindOOBRequestV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindOOBRequestV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptOobCode() && hasBindKey();
            }

            public Builder setBindKey(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.bindKey_ = str;
                onChanged();
                return this;
            }

            public Builder setBindKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.bindKey_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEncryptOobCode(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.encryptOobCode_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptOobCode_ = ByteString.EMPTY;
                this.bindKey_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindOOBRequestV2 build() {
                BindOOBRequestV2 bindOOBRequestV2BuildPartial = buildPartial();
                if (bindOOBRequestV2BuildPartial.isInitialized()) {
                    return bindOOBRequestV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bindOOBRequestV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindOOBRequestV2 buildPartial() {
                BindOOBRequestV2 bindOOBRequestV2 = new BindOOBRequestV2(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                bindOOBRequestV2.encryptOobCode_ = this.encryptOobCode_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                bindOOBRequestV2.bindKey_ = this.bindKey_;
                bindOOBRequestV2.bitField0_ = i8;
                onBuilt();
                return bindOOBRequestV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BindOOBRequestV2 getDefaultInstanceForType() {
                return BindOOBRequestV2.getDefaultInstance();
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
                this.encryptOobCode_ = ByteString.EMPTY;
                int i7 = this.bitField0_;
                this.bindKey_ = "";
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
            public com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$BindOOBRequestV2> r1 = com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$BindOOBRequestV2 r3 = (com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$BindOOBRequestV2 r4 = (com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$BindOOBRequestV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BindOOBRequestV2) {
                    return mergeFrom((BindOOBRequestV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BindOOBRequestV2 bindOOBRequestV2) {
                if (bindOOBRequestV2 == BindOOBRequestV2.getDefaultInstance()) {
                    return this;
                }
                if (bindOOBRequestV2.hasEncryptOobCode()) {
                    setEncryptOobCode(bindOOBRequestV2.getEncryptOobCode());
                }
                if (bindOOBRequestV2.hasBindKey()) {
                    this.bitField0_ |= 2;
                    this.bindKey_ = bindOOBRequestV2.bindKey_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessage) bindOOBRequestV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private BindOOBRequestV2() {
            this.memoizedIsInitialized = (byte) -1;
            this.encryptOobCode_ = ByteString.EMPTY;
            this.bindKey_ = "";
        }

        public static BindOOBRequestV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_BindOOBRequestV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BindOOBRequestV2 parseDelimitedFrom(InputStream inputStream) {
            return (BindOOBRequestV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BindOOBRequestV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BindOOBRequestV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindOOBRequestV2)) {
                return super.equals(obj);
            }
            BindOOBRequestV2 bindOOBRequestV2 = (BindOOBRequestV2) obj;
            boolean z6 = hasEncryptOobCode() == bindOOBRequestV2.hasEncryptOobCode();
            if (hasEncryptOobCode()) {
                z6 = z6 && getEncryptOobCode().equals(bindOOBRequestV2.getEncryptOobCode());
            }
            boolean z7 = z6 && hasBindKey() == bindOOBRequestV2.hasBindKey();
            if (hasBindKey()) {
                z7 = z7 && getBindKey().equals(bindOOBRequestV2.getBindKey());
            }
            return z7 && this.unknownFields.equals(bindOOBRequestV2.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
        public String getBindKey() {
            Object obj = this.bindKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bindKey_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
        public ByteString getBindKeyBytes() {
            Object obj = this.bindKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bindKey_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
        public ByteString getEncryptOobCode() {
            return this.encryptOobCode_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BindOOBRequestV2> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, this.encryptOobCode_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += GeneratedMessage.computeStringSize(2, this.bindKey_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
        public boolean hasBindKey() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindOOBRequestV2OrBuilder
        public boolean hasEncryptOobCode() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasEncryptOobCode()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getEncryptOobCode().hashCode();
            }
            if (hasBindKey()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBindKey().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_BindOOBRequestV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindOOBRequestV2.class, Builder.class);
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
            if (!hasEncryptOobCode()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBindKey()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.encryptOobCode_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.bindKey_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BindOOBRequestV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.encryptOobCode_ = codedInputStream.readBytes();
                            } else if (tag == 18) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.bindKey_ = bytes;
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

        public static Builder newBuilder(BindOOBRequestV2 bindOOBRequestV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bindOOBRequestV2);
        }

        public static BindOOBRequestV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindOOBRequestV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindOOBRequestV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BindOOBRequestV2 parseFrom(CodedInputStream codedInputStream) {
            return (BindOOBRequestV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BindOOBRequestV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BindOOBRequestV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BindOOBRequestV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindOOBRequestV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BindOOBRequestV2 parseFrom(InputStream inputStream) {
            return (BindOOBRequestV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BindOOBRequestV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindOOBRequestV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindOOBRequestV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BindOOBRequestV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BindOOBRequestV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BindOOBRequestV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BindOOBRequestV2OrBuilder extends MessageOrBuilder {
        String getBindKey();

        ByteString getBindKeyBytes();

        ByteString getEncryptOobCode();

        boolean hasBindKey();

        boolean hasEncryptOobCode();
    }

    public static final class BindOOBResponseV2 extends GeneratedMessageV3 implements BindOOBResponseV2OrBuilder {
        public static final int BIND_SIGN_FIELD_NUMBER = 1;
        private static final BindOOBResponseV2 DEFAULT_INSTANCE = new BindOOBResponseV2();

        @Deprecated
        public static final Parser<BindOOBResponseV2> PARSER = new AbstractParser<BindOOBResponseV2>() { // from class: com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2.1
            @Override // com.google.protobuf.Parser
            public BindOOBResponseV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BindOOBResponseV2(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private ByteString bindSign_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BindOOBResponseV2OrBuilder {
            private ByteString bindSign_;
            private int bitField0_;

            private Builder() {
                this.bindSign_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_BindOOBResponseV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearBindSign() {
                this.bitField0_ &= -2;
                this.bindSign_ = BindOOBResponseV2.getDefaultInstance().getBindSign();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2OrBuilder
            public ByteString getBindSign() {
                return this.bindSign_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_BindOOBResponseV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2OrBuilder
            public boolean hasBindSign() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_BindOOBResponseV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindOOBResponseV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasBindSign();
            }

            public Builder setBindSign(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.bindSign_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.bindSign_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindOOBResponseV2 build() {
                BindOOBResponseV2 bindOOBResponseV2BuildPartial = buildPartial();
                if (bindOOBResponseV2BuildPartial.isInitialized()) {
                    return bindOOBResponseV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bindOOBResponseV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindOOBResponseV2 buildPartial() {
                BindOOBResponseV2 bindOOBResponseV2 = new BindOOBResponseV2(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                bindOOBResponseV2.bindSign_ = this.bindSign_;
                bindOOBResponseV2.bitField0_ = i7;
                onBuilt();
                return bindOOBResponseV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BindOOBResponseV2 getDefaultInstanceForType() {
                return BindOOBResponseV2.getDefaultInstance();
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
                this.bindSign_ = ByteString.EMPTY;
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
            public com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$BindOOBResponseV2> r1 = com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$BindOOBResponseV2 r3 = (com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$BindOOBResponseV2 r4 = (com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$BindOOBResponseV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BindOOBResponseV2) {
                    return mergeFrom((BindOOBResponseV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BindOOBResponseV2 bindOOBResponseV2) {
                if (bindOOBResponseV2 == BindOOBResponseV2.getDefaultInstance()) {
                    return this;
                }
                if (bindOOBResponseV2.hasBindSign()) {
                    setBindSign(bindOOBResponseV2.getBindSign());
                }
                mergeUnknownFields(((GeneratedMessage) bindOOBResponseV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private BindOOBResponseV2() {
            this.memoizedIsInitialized = (byte) -1;
            this.bindSign_ = ByteString.EMPTY;
        }

        public static BindOOBResponseV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_BindOOBResponseV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BindOOBResponseV2 parseDelimitedFrom(InputStream inputStream) {
            return (BindOOBResponseV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BindOOBResponseV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BindOOBResponseV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindOOBResponseV2)) {
                return super.equals(obj);
            }
            BindOOBResponseV2 bindOOBResponseV2 = (BindOOBResponseV2) obj;
            boolean z6 = hasBindSign() == bindOOBResponseV2.hasBindSign();
            if (hasBindSign()) {
                z6 = z6 && getBindSign().equals(bindOOBResponseV2.getBindSign());
            }
            return z6 && this.unknownFields.equals(bindOOBResponseV2.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2OrBuilder
        public ByteString getBindSign() {
            return this.bindSign_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BindOOBResponseV2> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = ((this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, this.bindSign_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeBytesSize;
            return iComputeBytesSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindOOBResponseV2OrBuilder
        public boolean hasBindSign() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasBindSign()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBindSign().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_BindOOBResponseV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindOOBResponseV2.class, Builder.class);
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
            if (hasBindSign()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.bindSign_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BindOOBResponseV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.bindSign_ = codedInputStream.readBytes();
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

        public static Builder newBuilder(BindOOBResponseV2 bindOOBResponseV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bindOOBResponseV2);
        }

        public static BindOOBResponseV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindOOBResponseV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindOOBResponseV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BindOOBResponseV2 parseFrom(CodedInputStream codedInputStream) {
            return (BindOOBResponseV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BindOOBResponseV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BindOOBResponseV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BindOOBResponseV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindOOBResponseV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BindOOBResponseV2 parseFrom(InputStream inputStream) {
            return (BindOOBResponseV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BindOOBResponseV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindOOBResponseV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindOOBResponseV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BindOOBResponseV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BindOOBResponseV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BindOOBResponseV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BindOOBResponseV2OrBuilder extends MessageOrBuilder {
        ByteString getBindSign();

        boolean hasBindSign();
    }

    public static final class BindResult extends GeneratedMessageV3 implements BindResultOrBuilder {
        public static final int COMPANION_DEVICE_FIELD_NUMBER = 3;
        private static final BindResult DEFAULT_INSTANCE = new BindResult();

        @Deprecated
        public static final Parser<BindResult> PARSER = new AbstractParser<BindResult>() { // from class: com.zh.wear.protobuf.AccountProtos.BindResult.1
            @Override // com.google.protobuf.Parser
            public BindResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BindResult(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TOKEN_FIELD_NUMBER = 2;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CompanionDevice companionDevice_;
        private byte memoizedIsInitialized;
        private volatile Object token_;
        private volatile Object userId_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BindResultOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> companionDeviceBuilder_;
            private CompanionDevice companionDevice_;
            private Object token_;
            private Object userId_;

            private Builder() {
                this.userId_ = "";
                this.token_ = "";
                this.companionDevice_ = null;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> getCompanionDeviceFieldBuilder() {
                if (this.companionDeviceBuilder_ == null) {
                    this.companionDeviceBuilder_ = new SingleFieldBuilderV3<>(getCompanionDevice(), getParentForChildren(), isClean());
                    this.companionDevice_ = null;
                }
                return this.companionDeviceBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_BindResult_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getCompanionDeviceFieldBuilder();
                }
            }

            public Builder clearCompanionDevice() {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.companionDevice_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public Builder clearToken() {
                this.bitField0_ &= -3;
                this.token_ = BindResult.getDefaultInstance().getToken();
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.bitField0_ &= -2;
                this.userId_ = BindResult.getDefaultInstance().getUserId();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
            public CompanionDevice getCompanionDevice() {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CompanionDevice) singleFieldBuilderV3.getMessage();
                }
                CompanionDevice companionDevice = this.companionDevice_;
                return companionDevice == null ? CompanionDevice.getDefaultInstance() : companionDevice;
            }

            public CompanionDevice.Builder getCompanionDeviceBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (CompanionDevice.Builder) getCompanionDeviceFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
            public CompanionDeviceOrBuilder getCompanionDeviceOrBuilder() {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CompanionDeviceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CompanionDevice companionDevice = this.companionDevice_;
                return companionDevice == null ? CompanionDevice.getDefaultInstance() : companionDevice;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_BindResult_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
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

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
            public ByteString getTokenBytes() {
                Object obj = this.token_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.token_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
            public String getUserId() {
                Object obj = this.userId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.userId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
            public ByteString getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
            public boolean hasCompanionDevice() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
            public boolean hasToken() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
            public boolean hasUserId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_BindResult_fieldAccessorTable.ensureFieldAccessorsInitialized(BindResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasUserId() && hasToken()) {
                    return !hasCompanionDevice() || getCompanionDevice().isInitialized();
                }
                return false;
            }

            public Builder mergeCompanionDevice(CompanionDevice companionDevice) {
                CompanionDevice companionDevice2;
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) == 4 && (companionDevice2 = this.companionDevice_) != null && companionDevice2 != CompanionDevice.getDefaultInstance()) {
                        companionDevice = CompanionDevice.newBuilder(this.companionDevice_).mergeFrom(companionDevice).buildPartial();
                    }
                    this.companionDevice_ = companionDevice;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(companionDevice);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder setCompanionDevice(CompanionDevice.Builder builder) {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                CompanionDevice companionDeviceBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.companionDevice_ = companionDeviceBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(companionDeviceBuild);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder setToken(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.token_ = str;
                onChanged();
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.token_ = byteString;
                onChanged();
                return this;
            }

            public Builder setUserId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.userId_ = str;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.userId_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.userId_ = "";
                this.token_ = "";
                this.companionDevice_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setCompanionDevice(CompanionDevice companionDevice) {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    companionDevice.getClass();
                    this.companionDevice_ = companionDevice;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(companionDevice);
                }
                this.bitField0_ |= 4;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindResult build() {
                BindResult bindResultBuildPartial = buildPartial();
                if (bindResultBuildPartial.isInitialized()) {
                    return bindResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bindResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindResult buildPartial() {
                BindResult bindResult = new BindResult(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                bindResult.userId_ = this.userId_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                bindResult.token_ = this.token_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                bindResult.companionDevice_ = singleFieldBuilderV3 == null ? this.companionDevice_ : (CompanionDevice) singleFieldBuilderV3.build();
                bindResult.bitField0_ = i8;
                onBuilt();
                return bindResult;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BindResult getDefaultInstanceForType() {
                return BindResult.getDefaultInstance();
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
                this.userId_ = "";
                int i7 = this.bitField0_;
                this.token_ = "";
                this.bitField0_ = i7 & (-4);
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.companionDevice_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
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
            public com.zh.wear.protobuf.AccountProtos.BindResult.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$BindResult> r1 = com.zh.wear.protobuf.AccountProtos.BindResult.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$BindResult r3 = (com.zh.wear.protobuf.AccountProtos.BindResult) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$BindResult r4 = (com.zh.wear.protobuf.AccountProtos.BindResult) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.BindResult.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$BindResult$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BindResult) {
                    return mergeFrom((BindResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BindResult bindResult) {
                if (bindResult == BindResult.getDefaultInstance()) {
                    return this;
                }
                if (bindResult.hasUserId()) {
                    this.bitField0_ |= 1;
                    this.userId_ = bindResult.userId_;
                    onChanged();
                }
                if (bindResult.hasToken()) {
                    this.bitField0_ |= 2;
                    this.token_ = bindResult.token_;
                    onChanged();
                }
                if (bindResult.hasCompanionDevice()) {
                    mergeCompanionDevice(bindResult.getCompanionDevice());
                }
                mergeUnknownFields(((GeneratedMessage) bindResult).unknownFields);
                onChanged();
                return this;
            }
        }

        private BindResult() {
            this.memoizedIsInitialized = (byte) -1;
            this.userId_ = "";
            this.token_ = "";
        }

        public static BindResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_BindResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BindResult parseDelimitedFrom(InputStream inputStream) {
            return (BindResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BindResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BindResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindResult)) {
                return super.equals(obj);
            }
            BindResult bindResult = (BindResult) obj;
            boolean z6 = hasUserId() == bindResult.hasUserId();
            if (hasUserId()) {
                z6 = z6 && getUserId().equals(bindResult.getUserId());
            }
            boolean z7 = z6 && hasToken() == bindResult.hasToken();
            if (hasToken()) {
                z7 = z7 && getToken().equals(bindResult.getToken());
            }
            boolean z8 = z7 && hasCompanionDevice() == bindResult.hasCompanionDevice();
            if (hasCompanionDevice()) {
                z8 = z8 && getCompanionDevice().equals(bindResult.getCompanionDevice());
            }
            return z8 && this.unknownFields.equals(bindResult.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
        public CompanionDevice getCompanionDevice() {
            CompanionDevice companionDevice = this.companionDevice_;
            return companionDevice == null ? CompanionDevice.getDefaultInstance() : companionDevice;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
        public CompanionDeviceOrBuilder getCompanionDeviceOrBuilder() {
            CompanionDevice companionDevice = this.companionDevice_;
            return companionDevice == null ? CompanionDevice.getDefaultInstance() : companionDevice;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BindResult> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.userId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.token_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, getCompanionDevice());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
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

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
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

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.userId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
        public boolean hasCompanionDevice() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
        public boolean hasToken() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultOrBuilder
        public boolean hasUserId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasUserId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getUserId().hashCode();
            }
            if (hasToken()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getToken().hashCode();
            }
            if (hasCompanionDevice()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getCompanionDevice().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_BindResult_fieldAccessorTable.ensureFieldAccessorsInitialized(BindResult.class, Builder.class);
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
            if (!hasUserId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasToken()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCompanionDevice() || getCompanionDevice().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.userId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.token_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, getCompanionDevice());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BindResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.userId_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.token_ = bytes2;
                            } else if (tag == 26) {
                                CompanionDevice.Builder builder = (this.bitField0_ & 4) == 4 ? this.companionDevice_.toBuilder() : null;
                                CompanionDevice companionDevice = (CompanionDevice) codedInputStream.readMessage(CompanionDevice.PARSER, extensionRegistryLite);
                                this.companionDevice_ = companionDevice;
                                if (builder != null) {
                                    builder.mergeFrom(companionDevice);
                                    this.companionDevice_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
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

        public static Builder newBuilder(BindResult bindResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bindResult);
        }

        public static BindResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BindResult parseFrom(CodedInputStream codedInputStream) {
            return (BindResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BindResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BindResult(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BindResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BindResult parseFrom(InputStream inputStream) {
            return (BindResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BindResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BindResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BindResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BindResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BindResultOrBuilder extends MessageOrBuilder {
        CompanionDevice getCompanionDevice();

        CompanionDeviceOrBuilder getCompanionDeviceOrBuilder();

        String getToken();

        ByteString getTokenBytes();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasCompanionDevice();

        boolean hasToken();

        boolean hasUserId();
    }

    public static final class BindResultV2 extends GeneratedMessageV3 implements BindResultV2OrBuilder {
        public static final int COMPANION_DEVICE_FIELD_NUMBER = 2;
        private static final BindResultV2 DEFAULT_INSTANCE = new BindResultV2();

        @Deprecated
        public static final Parser<BindResultV2> PARSER = new AbstractParser<BindResultV2>() { // from class: com.zh.wear.protobuf.AccountProtos.BindResultV2.1
            @Override // com.google.protobuf.Parser
            public BindResultV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BindResultV2(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CompanionDevice companionDevice_;
        private byte memoizedIsInitialized;
        private volatile Object userId_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BindResultV2OrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> companionDeviceBuilder_;
            private CompanionDevice companionDevice_;
            private Object userId_;

            private Builder() {
                this.userId_ = "";
                this.companionDevice_ = null;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> getCompanionDeviceFieldBuilder() {
                if (this.companionDeviceBuilder_ == null) {
                    this.companionDeviceBuilder_ = new SingleFieldBuilderV3<>(getCompanionDevice(), getParentForChildren(), isClean());
                    this.companionDevice_ = null;
                }
                return this.companionDeviceBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_BindResultV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    getCompanionDeviceFieldBuilder();
                }
            }

            public Builder clearCompanionDevice() {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.companionDevice_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearUserId() {
                this.bitField0_ &= -2;
                this.userId_ = BindResultV2.getDefaultInstance().getUserId();
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
            public CompanionDevice getCompanionDevice() {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CompanionDevice) singleFieldBuilderV3.getMessage();
                }
                CompanionDevice companionDevice = this.companionDevice_;
                return companionDevice == null ? CompanionDevice.getDefaultInstance() : companionDevice;
            }

            public CompanionDevice.Builder getCompanionDeviceBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CompanionDevice.Builder) getCompanionDeviceFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
            public CompanionDeviceOrBuilder getCompanionDeviceOrBuilder() {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CompanionDeviceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CompanionDevice companionDevice = this.companionDevice_;
                return companionDevice == null ? CompanionDevice.getDefaultInstance() : companionDevice;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_BindResultV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
            public String getUserId() {
                Object obj = this.userId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.userId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
            public ByteString getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
            public boolean hasCompanionDevice() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
            public boolean hasUserId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_BindResultV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindResultV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasUserId()) {
                    return !hasCompanionDevice() || getCompanionDevice().isInitialized();
                }
                return false;
            }

            public Builder mergeCompanionDevice(CompanionDevice companionDevice) {
                CompanionDevice companionDevice2;
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) == 2 && (companionDevice2 = this.companionDevice_) != null && companionDevice2 != CompanionDevice.getDefaultInstance()) {
                        companionDevice = CompanionDevice.newBuilder(this.companionDevice_).mergeFrom(companionDevice).buildPartial();
                    }
                    this.companionDevice_ = companionDevice;
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(companionDevice);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setCompanionDevice(CompanionDevice.Builder builder) {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                CompanionDevice companionDeviceBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.companionDevice_ = companionDeviceBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(companionDeviceBuild);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setUserId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.userId_ = str;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.userId_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.userId_ = "";
                this.companionDevice_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder setCompanionDevice(CompanionDevice companionDevice) {
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    companionDevice.getClass();
                    this.companionDevice_ = companionDevice;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(companionDevice);
                }
                this.bitField0_ |= 2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindResultV2 build() {
                BindResultV2 bindResultV2BuildPartial = buildPartial();
                if (bindResultV2BuildPartial.isInitialized()) {
                    return bindResultV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bindResultV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindResultV2 buildPartial() {
                BindResultV2 bindResultV2 = new BindResultV2(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                bindResultV2.userId_ = this.userId_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                bindResultV2.companionDevice_ = singleFieldBuilderV3 == null ? this.companionDevice_ : (CompanionDevice) singleFieldBuilderV3.build();
                bindResultV2.bitField0_ = i8;
                onBuilt();
                return bindResultV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BindResultV2 getDefaultInstanceForType() {
                return BindResultV2.getDefaultInstance();
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
                this.userId_ = "";
                this.bitField0_ &= -2;
                SingleFieldBuilderV3<CompanionDevice, CompanionDevice.Builder, CompanionDeviceOrBuilder> singleFieldBuilderV3 = this.companionDeviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.companionDevice_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
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
            public com.zh.wear.protobuf.AccountProtos.BindResultV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$BindResultV2> r1 = com.zh.wear.protobuf.AccountProtos.BindResultV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$BindResultV2 r3 = (com.zh.wear.protobuf.AccountProtos.BindResultV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$BindResultV2 r4 = (com.zh.wear.protobuf.AccountProtos.BindResultV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.BindResultV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$BindResultV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BindResultV2) {
                    return mergeFrom((BindResultV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BindResultV2 bindResultV2) {
                if (bindResultV2 == BindResultV2.getDefaultInstance()) {
                    return this;
                }
                if (bindResultV2.hasUserId()) {
                    this.bitField0_ |= 1;
                    this.userId_ = bindResultV2.userId_;
                    onChanged();
                }
                if (bindResultV2.hasCompanionDevice()) {
                    mergeCompanionDevice(bindResultV2.getCompanionDevice());
                }
                mergeUnknownFields(((GeneratedMessage) bindResultV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private BindResultV2() {
            this.memoizedIsInitialized = (byte) -1;
            this.userId_ = "";
        }

        public static BindResultV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_BindResultV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BindResultV2 parseDelimitedFrom(InputStream inputStream) {
            return (BindResultV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BindResultV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BindResultV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindResultV2)) {
                return super.equals(obj);
            }
            BindResultV2 bindResultV2 = (BindResultV2) obj;
            boolean z6 = hasUserId() == bindResultV2.hasUserId();
            if (hasUserId()) {
                z6 = z6 && getUserId().equals(bindResultV2.getUserId());
            }
            boolean z7 = z6 && hasCompanionDevice() == bindResultV2.hasCompanionDevice();
            if (hasCompanionDevice()) {
                z7 = z7 && getCompanionDevice().equals(bindResultV2.getCompanionDevice());
            }
            return z7 && this.unknownFields.equals(bindResultV2.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
        public CompanionDevice getCompanionDevice() {
            CompanionDevice companionDevice = this.companionDevice_;
            return companionDevice == null ? CompanionDevice.getDefaultInstance() : companionDevice;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
        public CompanionDeviceOrBuilder getCompanionDeviceOrBuilder() {
            CompanionDevice companionDevice = this.companionDevice_;
            return companionDevice == null ? CompanionDevice.getDefaultInstance() : companionDevice;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BindResultV2> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.userId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getCompanionDevice());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.userId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
        public boolean hasCompanionDevice() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindResultV2OrBuilder
        public boolean hasUserId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasUserId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getUserId().hashCode();
            }
            if (hasCompanionDevice()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getCompanionDevice().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_BindResultV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindResultV2.class, Builder.class);
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
            if (!hasUserId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCompanionDevice() || getCompanionDevice().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.userId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, getCompanionDevice());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BindResultV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.userId_ = bytes;
                            } else if (tag == 18) {
                                CompanionDevice.Builder builder = (this.bitField0_ & 2) == 2 ? this.companionDevice_.toBuilder() : null;
                                CompanionDevice companionDevice = (CompanionDevice) codedInputStream.readMessage(CompanionDevice.PARSER, extensionRegistryLite);
                                this.companionDevice_ = companionDevice;
                                if (builder != null) {
                                    builder.mergeFrom(companionDevice);
                                    this.companionDevice_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
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

        public static Builder newBuilder(BindResultV2 bindResultV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bindResultV2);
        }

        public static BindResultV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindResultV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindResultV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BindResultV2 parseFrom(CodedInputStream codedInputStream) {
            return (BindResultV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BindResultV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BindResultV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BindResultV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindResultV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BindResultV2 parseFrom(InputStream inputStream) {
            return (BindResultV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BindResultV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindResultV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindResultV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BindResultV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BindResultV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BindResultV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BindResultV2OrBuilder extends MessageOrBuilder {
        CompanionDevice getCompanionDevice();

        CompanionDeviceOrBuilder getCompanionDeviceOrBuilder();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasCompanionDevice();

        boolean hasUserId();
    }

    public static final class BindVerifyRequestV2 extends GeneratedMessageV3 implements BindVerifyRequestV2OrBuilder {
        private static final BindVerifyRequestV2 DEFAULT_INSTANCE = new BindVerifyRequestV2();

        @Deprecated
        public static final Parser<BindVerifyRequestV2> PARSER = new AbstractParser<BindVerifyRequestV2>() { // from class: com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2.1
            @Override // com.google.protobuf.Parser
            public BindVerifyRequestV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BindVerifyRequestV2(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PUBLIC_KEY_SERVER_FIELD_NUMBER = 1;
        public static final int RANDOM_SERVER_FIELD_NUMBER = 3;
        public static final int SIGN_SERVER_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString publicKeyServer_;
        private ByteString randomServer_;
        private ByteString signServer_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BindVerifyRequestV2OrBuilder {
            private int bitField0_;
            private ByteString publicKeyServer_;
            private ByteString randomServer_;
            private ByteString signServer_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.publicKeyServer_ = byteString;
                this.signServer_ = byteString;
                this.randomServer_ = byteString;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_BindVerifyRequestV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearPublicKeyServer() {
                this.bitField0_ &= -2;
                this.publicKeyServer_ = BindVerifyRequestV2.getDefaultInstance().getPublicKeyServer();
                onChanged();
                return this;
            }

            public Builder clearRandomServer() {
                this.bitField0_ &= -5;
                this.randomServer_ = BindVerifyRequestV2.getDefaultInstance().getRandomServer();
                onChanged();
                return this;
            }

            public Builder clearSignServer() {
                this.bitField0_ &= -3;
                this.signServer_ = BindVerifyRequestV2.getDefaultInstance().getSignServer();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_BindVerifyRequestV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
            public ByteString getPublicKeyServer() {
                return this.publicKeyServer_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
            public ByteString getRandomServer() {
                return this.randomServer_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
            public ByteString getSignServer() {
                return this.signServer_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
            public boolean hasPublicKeyServer() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
            public boolean hasRandomServer() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
            public boolean hasSignServer() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_BindVerifyRequestV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindVerifyRequestV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPublicKeyServer() && hasSignServer() && hasRandomServer();
            }

            public Builder setPublicKeyServer(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.publicKeyServer_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRandomServer(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.randomServer_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSignServer(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.signServer_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.publicKeyServer_ = byteString;
                this.signServer_ = byteString;
                this.randomServer_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindVerifyRequestV2 build() {
                BindVerifyRequestV2 bindVerifyRequestV2BuildPartial = buildPartial();
                if (bindVerifyRequestV2BuildPartial.isInitialized()) {
                    return bindVerifyRequestV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bindVerifyRequestV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindVerifyRequestV2 buildPartial() {
                BindVerifyRequestV2 bindVerifyRequestV2 = new BindVerifyRequestV2(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                bindVerifyRequestV2.publicKeyServer_ = this.publicKeyServer_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                bindVerifyRequestV2.signServer_ = this.signServer_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                bindVerifyRequestV2.randomServer_ = this.randomServer_;
                bindVerifyRequestV2.bitField0_ = i8;
                onBuilt();
                return bindVerifyRequestV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BindVerifyRequestV2 getDefaultInstanceForType() {
                return BindVerifyRequestV2.getDefaultInstance();
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
                ByteString byteString = ByteString.EMPTY;
                this.publicKeyServer_ = byteString;
                int i7 = this.bitField0_;
                this.signServer_ = byteString;
                this.randomServer_ = byteString;
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
            public com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$BindVerifyRequestV2> r1 = com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$BindVerifyRequestV2 r3 = (com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$BindVerifyRequestV2 r4 = (com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$BindVerifyRequestV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BindVerifyRequestV2) {
                    return mergeFrom((BindVerifyRequestV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BindVerifyRequestV2 bindVerifyRequestV2) {
                if (bindVerifyRequestV2 == BindVerifyRequestV2.getDefaultInstance()) {
                    return this;
                }
                if (bindVerifyRequestV2.hasPublicKeyServer()) {
                    setPublicKeyServer(bindVerifyRequestV2.getPublicKeyServer());
                }
                if (bindVerifyRequestV2.hasSignServer()) {
                    setSignServer(bindVerifyRequestV2.getSignServer());
                }
                if (bindVerifyRequestV2.hasRandomServer()) {
                    setRandomServer(bindVerifyRequestV2.getRandomServer());
                }
                mergeUnknownFields(((GeneratedMessage) bindVerifyRequestV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private BindVerifyRequestV2() {
            this.memoizedIsInitialized = (byte) -1;
            ByteString byteString = ByteString.EMPTY;
            this.publicKeyServer_ = byteString;
            this.signServer_ = byteString;
            this.randomServer_ = byteString;
        }

        public static BindVerifyRequestV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_BindVerifyRequestV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BindVerifyRequestV2 parseDelimitedFrom(InputStream inputStream) {
            return (BindVerifyRequestV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BindVerifyRequestV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BindVerifyRequestV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindVerifyRequestV2)) {
                return super.equals(obj);
            }
            BindVerifyRequestV2 bindVerifyRequestV2 = (BindVerifyRequestV2) obj;
            boolean z6 = hasPublicKeyServer() == bindVerifyRequestV2.hasPublicKeyServer();
            if (hasPublicKeyServer()) {
                z6 = z6 && getPublicKeyServer().equals(bindVerifyRequestV2.getPublicKeyServer());
            }
            boolean z7 = z6 && hasSignServer() == bindVerifyRequestV2.hasSignServer();
            if (hasSignServer()) {
                z7 = z7 && getSignServer().equals(bindVerifyRequestV2.getSignServer());
            }
            boolean z8 = z7 && hasRandomServer() == bindVerifyRequestV2.hasRandomServer();
            if (hasRandomServer()) {
                z8 = z8 && getRandomServer().equals(bindVerifyRequestV2.getRandomServer());
            }
            return z8 && this.unknownFields.equals(bindVerifyRequestV2.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BindVerifyRequestV2> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
        public ByteString getPublicKeyServer() {
            return this.publicKeyServer_;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
        public ByteString getRandomServer() {
            return this.randomServer_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, this.publicKeyServer_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.signServer_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(3, this.randomServer_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
        public ByteString getSignServer() {
            return this.signServer_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
        public boolean hasPublicKeyServer() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
        public boolean hasRandomServer() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyRequestV2OrBuilder
        public boolean hasSignServer() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasPublicKeyServer()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPublicKeyServer().hashCode();
            }
            if (hasSignServer()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSignServer().hashCode();
            }
            if (hasRandomServer()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getRandomServer().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_BindVerifyRequestV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindVerifyRequestV2.class, Builder.class);
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
            if (!hasPublicKeyServer()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSignServer()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRandomServer()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.publicKeyServer_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.signServer_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(3, this.randomServer_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BindVerifyRequestV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.publicKeyServer_ = codedInputStream.readBytes();
                            } else if (tag == 18) {
                                this.bitField0_ |= 2;
                                this.signServer_ = codedInputStream.readBytes();
                            } else if (tag == 26) {
                                this.bitField0_ |= 4;
                                this.randomServer_ = codedInputStream.readBytes();
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

        public static Builder newBuilder(BindVerifyRequestV2 bindVerifyRequestV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bindVerifyRequestV2);
        }

        public static BindVerifyRequestV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindVerifyRequestV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindVerifyRequestV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BindVerifyRequestV2 parseFrom(CodedInputStream codedInputStream) {
            return (BindVerifyRequestV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BindVerifyRequestV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BindVerifyRequestV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BindVerifyRequestV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindVerifyRequestV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BindVerifyRequestV2 parseFrom(InputStream inputStream) {
            return (BindVerifyRequestV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BindVerifyRequestV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindVerifyRequestV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindVerifyRequestV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BindVerifyRequestV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BindVerifyRequestV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BindVerifyRequestV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BindVerifyRequestV2OrBuilder extends MessageOrBuilder {
        ByteString getPublicKeyServer();

        ByteString getRandomServer();

        ByteString getSignServer();

        boolean hasPublicKeyServer();

        boolean hasRandomServer();

        boolean hasSignServer();
    }

    public static final class BindVerifyResponseV2 extends GeneratedMessageV3 implements BindVerifyResponseV2OrBuilder {
        public static final int ENCRYPT_KEY_FIELD_NUMBER = 3;
        public static final int PUBLIC_KEY_DEV_FIELD_NUMBER = 1;
        public static final int SIGN_DEV_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptKey_;
        private byte memoizedIsInitialized;
        private ByteString publicKeyDev_;
        private ByteString signDev_;
        private static final BindVerifyResponseV2 DEFAULT_INSTANCE = new BindVerifyResponseV2();

        @Deprecated
        public static final Parser<BindVerifyResponseV2> PARSER = new AbstractParser<BindVerifyResponseV2>() { // from class: com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2.1
            @Override // com.google.protobuf.Parser
            public BindVerifyResponseV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new BindVerifyResponseV2(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BindVerifyResponseV2OrBuilder {
            private int bitField0_;
            private ByteString encryptKey_;
            private ByteString publicKeyDev_;
            private ByteString signDev_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.publicKeyDev_ = byteString;
                this.signDev_ = byteString;
                this.encryptKey_ = byteString;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_BindVerifyResponseV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearEncryptKey() {
                this.bitField0_ &= -5;
                this.encryptKey_ = BindVerifyResponseV2.getDefaultInstance().getEncryptKey();
                onChanged();
                return this;
            }

            public Builder clearPublicKeyDev() {
                this.bitField0_ &= -2;
                this.publicKeyDev_ = BindVerifyResponseV2.getDefaultInstance().getPublicKeyDev();
                onChanged();
                return this;
            }

            public Builder clearSignDev() {
                this.bitField0_ &= -3;
                this.signDev_ = BindVerifyResponseV2.getDefaultInstance().getSignDev();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_BindVerifyResponseV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
            public ByteString getEncryptKey() {
                return this.encryptKey_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
            public ByteString getPublicKeyDev() {
                return this.publicKeyDev_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
            public ByteString getSignDev() {
                return this.signDev_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
            public boolean hasEncryptKey() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
            public boolean hasPublicKeyDev() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
            public boolean hasSignDev() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_BindVerifyResponseV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindVerifyResponseV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPublicKeyDev() && hasSignDev() && hasEncryptKey();
            }

            public Builder setEncryptKey(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.encryptKey_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPublicKeyDev(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.publicKeyDev_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSignDev(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.signDev_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.publicKeyDev_ = byteString;
                this.signDev_ = byteString;
                this.encryptKey_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindVerifyResponseV2 build() {
                BindVerifyResponseV2 bindVerifyResponseV2BuildPartial = buildPartial();
                if (bindVerifyResponseV2BuildPartial.isInitialized()) {
                    return bindVerifyResponseV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bindVerifyResponseV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BindVerifyResponseV2 buildPartial() {
                BindVerifyResponseV2 bindVerifyResponseV2 = new BindVerifyResponseV2(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                bindVerifyResponseV2.publicKeyDev_ = this.publicKeyDev_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                bindVerifyResponseV2.signDev_ = this.signDev_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                bindVerifyResponseV2.encryptKey_ = this.encryptKey_;
                bindVerifyResponseV2.bitField0_ = i8;
                onBuilt();
                return bindVerifyResponseV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BindVerifyResponseV2 getDefaultInstanceForType() {
                return BindVerifyResponseV2.getDefaultInstance();
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
                ByteString byteString = ByteString.EMPTY;
                this.publicKeyDev_ = byteString;
                int i7 = this.bitField0_;
                this.signDev_ = byteString;
                this.encryptKey_ = byteString;
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
            public com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$BindVerifyResponseV2> r1 = com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$BindVerifyResponseV2 r3 = (com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$BindVerifyResponseV2 r4 = (com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$BindVerifyResponseV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BindVerifyResponseV2) {
                    return mergeFrom((BindVerifyResponseV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BindVerifyResponseV2 bindVerifyResponseV2) {
                if (bindVerifyResponseV2 == BindVerifyResponseV2.getDefaultInstance()) {
                    return this;
                }
                if (bindVerifyResponseV2.hasPublicKeyDev()) {
                    setPublicKeyDev(bindVerifyResponseV2.getPublicKeyDev());
                }
                if (bindVerifyResponseV2.hasSignDev()) {
                    setSignDev(bindVerifyResponseV2.getSignDev());
                }
                if (bindVerifyResponseV2.hasEncryptKey()) {
                    setEncryptKey(bindVerifyResponseV2.getEncryptKey());
                }
                mergeUnknownFields(((GeneratedMessage) bindVerifyResponseV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private BindVerifyResponseV2() {
            this.memoizedIsInitialized = (byte) -1;
            ByteString byteString = ByteString.EMPTY;
            this.publicKeyDev_ = byteString;
            this.signDev_ = byteString;
            this.encryptKey_ = byteString;
        }

        public static BindVerifyResponseV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_BindVerifyResponseV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BindVerifyResponseV2 parseDelimitedFrom(InputStream inputStream) {
            return (BindVerifyResponseV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BindVerifyResponseV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<BindVerifyResponseV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindVerifyResponseV2)) {
                return super.equals(obj);
            }
            BindVerifyResponseV2 bindVerifyResponseV2 = (BindVerifyResponseV2) obj;
            boolean z6 = hasPublicKeyDev() == bindVerifyResponseV2.hasPublicKeyDev();
            if (hasPublicKeyDev()) {
                z6 = z6 && getPublicKeyDev().equals(bindVerifyResponseV2.getPublicKeyDev());
            }
            boolean z7 = z6 && hasSignDev() == bindVerifyResponseV2.hasSignDev();
            if (hasSignDev()) {
                z7 = z7 && getSignDev().equals(bindVerifyResponseV2.getSignDev());
            }
            boolean z8 = z7 && hasEncryptKey() == bindVerifyResponseV2.hasEncryptKey();
            if (hasEncryptKey()) {
                z8 = z8 && getEncryptKey().equals(bindVerifyResponseV2.getEncryptKey());
            }
            return z8 && this.unknownFields.equals(bindVerifyResponseV2.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
        public ByteString getEncryptKey() {
            return this.encryptKey_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BindVerifyResponseV2> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
        public ByteString getPublicKeyDev() {
            return this.publicKeyDev_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, this.publicKeyDev_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.signDev_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(3, this.encryptKey_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
        public ByteString getSignDev() {
            return this.signDev_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
        public boolean hasEncryptKey() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
        public boolean hasPublicKeyDev() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.BindVerifyResponseV2OrBuilder
        public boolean hasSignDev() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasPublicKeyDev()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPublicKeyDev().hashCode();
            }
            if (hasSignDev()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSignDev().hashCode();
            }
            if (hasEncryptKey()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getEncryptKey().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_BindVerifyResponseV2_fieldAccessorTable.ensureFieldAccessorsInitialized(BindVerifyResponseV2.class, Builder.class);
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
            if (!hasPublicKeyDev()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSignDev()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEncryptKey()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.publicKeyDev_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.signDev_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(3, this.encryptKey_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private BindVerifyResponseV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.publicKeyDev_ = codedInputStream.readBytes();
                            } else if (tag == 18) {
                                this.bitField0_ |= 2;
                                this.signDev_ = codedInputStream.readBytes();
                            } else if (tag == 26) {
                                this.bitField0_ |= 4;
                                this.encryptKey_ = codedInputStream.readBytes();
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

        public static Builder newBuilder(BindVerifyResponseV2 bindVerifyResponseV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bindVerifyResponseV2);
        }

        public static BindVerifyResponseV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindVerifyResponseV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindVerifyResponseV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BindVerifyResponseV2 parseFrom(CodedInputStream codedInputStream) {
            return (BindVerifyResponseV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BindVerifyResponseV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private BindVerifyResponseV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BindVerifyResponseV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindVerifyResponseV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BindVerifyResponseV2 parseFrom(InputStream inputStream) {
            return (BindVerifyResponseV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static BindVerifyResponseV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BindVerifyResponseV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BindVerifyResponseV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BindVerifyResponseV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BindVerifyResponseV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BindVerifyResponseV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface BindVerifyResponseV2OrBuilder extends MessageOrBuilder {
        ByteString getEncryptKey();

        ByteString getPublicKeyDev();

        ByteString getSignDev();

        boolean hasEncryptKey();

        boolean hasPublicKeyDev();

        boolean hasSignDev();
    }

    public static final class CompanionDevice extends GeneratedMessageV3 implements CompanionDeviceOrBuilder {
        public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
        public static final int SYSTEM_VERSION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int deviceType_;
        private byte memoizedIsInitialized;
        private float systemVersion_;
        private static final CompanionDevice DEFAULT_INSTANCE = new CompanionDevice();

        @Deprecated
        public static final Parser<CompanionDevice> PARSER = new AbstractParser<CompanionDevice>() { // from class: com.zh.wear.protobuf.AccountProtos.CompanionDevice.1
            @Override // com.google.protobuf.Parser
            public CompanionDevice parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new CompanionDevice(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CompanionDeviceOrBuilder {
            private int bitField0_;
            private int deviceType_;
            private float systemVersion_;

            private Builder() {
                this.deviceType_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_CompanionDevice_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearDeviceType() {
                this.bitField0_ &= -2;
                this.deviceType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSystemVersion() {
                this.bitField0_ &= -3;
                this.systemVersion_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_CompanionDevice_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.CompanionDeviceOrBuilder
            public DeviceType getDeviceType() {
                DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
                return deviceTypeValueOf == null ? DeviceType.ANDROID : deviceTypeValueOf;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.CompanionDeviceOrBuilder
            public float getSystemVersion() {
                return this.systemVersion_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.CompanionDeviceOrBuilder
            public boolean hasDeviceType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.CompanionDeviceOrBuilder
            public boolean hasSystemVersion() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_CompanionDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(CompanionDevice.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasDeviceType();
            }

            public Builder setDeviceType(DeviceType deviceType) {
                deviceType.getClass();
                this.bitField0_ |= 1;
                this.deviceType_ = deviceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setSystemVersion(float f7) {
                this.bitField0_ |= 2;
                this.systemVersion_ = f7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.deviceType_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CompanionDevice build() {
                CompanionDevice companionDeviceBuildPartial = buildPartial();
                if (companionDeviceBuildPartial.isInitialized()) {
                    return companionDeviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) companionDeviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CompanionDevice buildPartial() {
                CompanionDevice companionDevice = new CompanionDevice(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                companionDevice.deviceType_ = this.deviceType_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                companionDevice.systemVersion_ = this.systemVersion_;
                companionDevice.bitField0_ = i8;
                onBuilt();
                return companionDevice;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CompanionDevice getDefaultInstanceForType() {
                return CompanionDevice.getDefaultInstance();
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
                this.deviceType_ = 0;
                int i7 = this.bitField0_;
                this.systemVersion_ = 0.0f;
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
            public com.zh.wear.protobuf.AccountProtos.CompanionDevice.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$CompanionDevice> r1 = com.zh.wear.protobuf.AccountProtos.CompanionDevice.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$CompanionDevice r3 = (com.zh.wear.protobuf.AccountProtos.CompanionDevice) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$CompanionDevice r4 = (com.zh.wear.protobuf.AccountProtos.CompanionDevice) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.CompanionDevice.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$CompanionDevice$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CompanionDevice) {
                    return mergeFrom((CompanionDevice) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CompanionDevice companionDevice) {
                if (companionDevice == CompanionDevice.getDefaultInstance()) {
                    return this;
                }
                if (companionDevice.hasDeviceType()) {
                    setDeviceType(companionDevice.getDeviceType());
                }
                if (companionDevice.hasSystemVersion()) {
                    setSystemVersion(companionDevice.getSystemVersion());
                }
                mergeUnknownFields(((GeneratedMessage) companionDevice).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum DeviceType implements ProtocolMessageEnum {
            ANDROID(0),
            IOS(1);

            public static final int ANDROID_VALUE = 0;
            public static final int IOS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<DeviceType> internalValueMap = new Internal.EnumLiteMap<DeviceType>() { // from class: com.zh.wear.protobuf.AccountProtos.CompanionDevice.DeviceType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DeviceType findValueByNumber(int i7) {
                    return DeviceType.forNumber(i7);
                }
            };
            private static final DeviceType[] VALUES = values();

            DeviceType(int i7) {
                this.value = i7;
            }

            public static DeviceType forNumber(int i7) {
                if (i7 == 0) {
                    return ANDROID;
                }
                if (i7 != 1) {
                    return null;
                }
                return IOS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CompanionDevice.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DeviceType> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static DeviceType valueOf(int i7) {
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

            public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private CompanionDevice() {
            this.memoizedIsInitialized = (byte) -1;
            this.deviceType_ = 0;
            this.systemVersion_ = 0.0f;
        }

        public static CompanionDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_CompanionDevice_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CompanionDevice parseDelimitedFrom(InputStream inputStream) {
            return (CompanionDevice) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CompanionDevice parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<CompanionDevice> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CompanionDevice)) {
                return super.equals(obj);
            }
            CompanionDevice companionDevice = (CompanionDevice) obj;
            boolean z6 = hasDeviceType() == companionDevice.hasDeviceType();
            if (hasDeviceType()) {
                z6 = z6 && this.deviceType_ == companionDevice.deviceType_;
            }
            boolean z7 = z6 && hasSystemVersion() == companionDevice.hasSystemVersion();
            if (hasSystemVersion()) {
                z7 = z7 && Float.floatToIntBits(getSystemVersion()) == Float.floatToIntBits(companionDevice.getSystemVersion());
            }
            return z7 && this.unknownFields.equals(companionDevice.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AccountProtos.CompanionDeviceOrBuilder
        public DeviceType getDeviceType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
            return deviceTypeValueOf == null ? DeviceType.ANDROID : deviceTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CompanionDevice> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.deviceType_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(2, this.systemVersion_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.CompanionDeviceOrBuilder
        public float getSystemVersion() {
            return this.systemVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.CompanionDeviceOrBuilder
        public boolean hasDeviceType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.CompanionDeviceOrBuilder
        public boolean hasSystemVersion() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasDeviceType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.deviceType_;
            }
            if (hasSystemVersion()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Float.floatToIntBits(getSystemVersion());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_CompanionDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(CompanionDevice.class, Builder.class);
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
            if (hasDeviceType()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.deviceType_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeFloat(2, this.systemVersion_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private CompanionDevice(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                int i7 = codedInputStream.readEnum();
                                if (DeviceType.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.deviceType_ = i7;
                                }
                            } else if (tag == 21) {
                                this.bitField0_ |= 2;
                                this.systemVersion_ = codedInputStream.readFloat();
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

        public static Builder newBuilder(CompanionDevice companionDevice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(companionDevice);
        }

        public static CompanionDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CompanionDevice) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CompanionDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CompanionDevice parseFrom(CodedInputStream codedInputStream) {
            return (CompanionDevice) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CompanionDevice getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private CompanionDevice(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CompanionDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CompanionDevice) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CompanionDevice parseFrom(InputStream inputStream) {
            return (CompanionDevice) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CompanionDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CompanionDevice) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CompanionDevice parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CompanionDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CompanionDevice parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CompanionDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface CompanionDeviceOrBuilder extends MessageOrBuilder {
        CompanionDevice.DeviceType getDeviceType();

        float getSystemVersion();

        boolean hasDeviceType();

        boolean hasSystemVersion();
    }

    public static final class ConnectConfirmRequestV2 extends GeneratedMessageV3 implements ConnectConfirmRequestV2OrBuilder {
        private static final ConnectConfirmRequestV2 DEFAULT_INSTANCE = new ConnectConfirmRequestV2();

        @Deprecated
        public static final Parser<ConnectConfirmRequestV2> PARSER = new AbstractParser<ConnectConfirmRequestV2>() { // from class: com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2.1
            @Override // com.google.protobuf.Parser
            public ConnectConfirmRequestV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ConnectConfirmRequestV2(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SIGN_APP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString signApp_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectConfirmRequestV2OrBuilder {
            private int bitField0_;
            private ByteString signApp_;

            private Builder() {
                this.signApp_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_ConnectConfirmRequestV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearSignApp() {
                this.bitField0_ &= -2;
                this.signApp_ = ConnectConfirmRequestV2.getDefaultInstance().getSignApp();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_ConnectConfirmRequestV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2OrBuilder
            public ByteString getSignApp() {
                return this.signApp_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2OrBuilder
            public boolean hasSignApp() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_ConnectConfirmRequestV2_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectConfirmRequestV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSignApp();
            }

            public Builder setSignApp(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.signApp_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.signApp_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectConfirmRequestV2 build() {
                ConnectConfirmRequestV2 connectConfirmRequestV2BuildPartial = buildPartial();
                if (connectConfirmRequestV2BuildPartial.isInitialized()) {
                    return connectConfirmRequestV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectConfirmRequestV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectConfirmRequestV2 buildPartial() {
                ConnectConfirmRequestV2 connectConfirmRequestV2 = new ConnectConfirmRequestV2(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                connectConfirmRequestV2.signApp_ = this.signApp_;
                connectConfirmRequestV2.bitField0_ = i7;
                onBuilt();
                return connectConfirmRequestV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectConfirmRequestV2 getDefaultInstanceForType() {
                return ConnectConfirmRequestV2.getDefaultInstance();
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
                this.signApp_ = ByteString.EMPTY;
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
            public com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$ConnectConfirmRequestV2> r1 = com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$ConnectConfirmRequestV2 r3 = (com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$ConnectConfirmRequestV2 r4 = (com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$ConnectConfirmRequestV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectConfirmRequestV2) {
                    return mergeFrom((ConnectConfirmRequestV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectConfirmRequestV2 connectConfirmRequestV2) {
                if (connectConfirmRequestV2 == ConnectConfirmRequestV2.getDefaultInstance()) {
                    return this;
                }
                if (connectConfirmRequestV2.hasSignApp()) {
                    setSignApp(connectConfirmRequestV2.getSignApp());
                }
                mergeUnknownFields(((GeneratedMessage) connectConfirmRequestV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private ConnectConfirmRequestV2() {
            this.memoizedIsInitialized = (byte) -1;
            this.signApp_ = ByteString.EMPTY;
        }

        public static ConnectConfirmRequestV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_ConnectConfirmRequestV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectConfirmRequestV2 parseDelimitedFrom(InputStream inputStream) {
            return (ConnectConfirmRequestV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectConfirmRequestV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ConnectConfirmRequestV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectConfirmRequestV2)) {
                return super.equals(obj);
            }
            ConnectConfirmRequestV2 connectConfirmRequestV2 = (ConnectConfirmRequestV2) obj;
            boolean z6 = hasSignApp() == connectConfirmRequestV2.hasSignApp();
            if (hasSignApp()) {
                z6 = z6 && getSignApp().equals(connectConfirmRequestV2.getSignApp());
            }
            return z6 && this.unknownFields.equals(connectConfirmRequestV2.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectConfirmRequestV2> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = ((this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, this.signApp_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeBytesSize;
            return iComputeBytesSize;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2OrBuilder
        public ByteString getSignApp() {
            return this.signApp_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectConfirmRequestV2OrBuilder
        public boolean hasSignApp() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSignApp()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getSignApp().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_ConnectConfirmRequestV2_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectConfirmRequestV2.class, Builder.class);
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
            if (hasSignApp()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.signApp_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private ConnectConfirmRequestV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.signApp_ = codedInputStream.readBytes();
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

        public static Builder newBuilder(ConnectConfirmRequestV2 connectConfirmRequestV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectConfirmRequestV2);
        }

        public static ConnectConfirmRequestV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectConfirmRequestV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectConfirmRequestV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectConfirmRequestV2 parseFrom(CodedInputStream codedInputStream) {
            return (ConnectConfirmRequestV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectConfirmRequestV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private ConnectConfirmRequestV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectConfirmRequestV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectConfirmRequestV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectConfirmRequestV2 parseFrom(InputStream inputStream) {
            return (ConnectConfirmRequestV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ConnectConfirmRequestV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectConfirmRequestV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectConfirmRequestV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ConnectConfirmRequestV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ConnectConfirmRequestV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectConfirmRequestV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface ConnectConfirmRequestV2OrBuilder extends MessageOrBuilder {
        ByteString getSignApp();

        boolean hasSignApp();
    }

    public static final class ConnectConfirmResponseV2 extends GeneratedMessageV3 implements ConnectConfirmResponseV2OrBuilder {
        public static final int CONFIRM_RESULT_FIELD_NUMBER = 1;
        private static final ConnectConfirmResponseV2 DEFAULT_INSTANCE = new ConnectConfirmResponseV2();

        @Deprecated
        public static final Parser<ConnectConfirmResponseV2> PARSER = new AbstractParser<ConnectConfirmResponseV2>() { // from class: com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2.1
            @Override // com.google.protobuf.Parser
            public ConnectConfirmResponseV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ConnectConfirmResponseV2(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean confirmResult_;
        private byte memoizedIsInitialized;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectConfirmResponseV2OrBuilder {
            private int bitField0_;
            private boolean confirmResult_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_ConnectConfirmResponseV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearConfirmResult() {
                this.bitField0_ &= -2;
                this.confirmResult_ = false;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2OrBuilder
            public boolean getConfirmResult() {
                return this.confirmResult_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_ConnectConfirmResponseV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2OrBuilder
            public boolean hasConfirmResult() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_ConnectConfirmResponseV2_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectConfirmResponseV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasConfirmResult();
            }

            public Builder setConfirmResult(boolean z6) {
                this.bitField0_ |= 1;
                this.confirmResult_ = z6;
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
            public ConnectConfirmResponseV2 build() {
                ConnectConfirmResponseV2 connectConfirmResponseV2BuildPartial = buildPartial();
                if (connectConfirmResponseV2BuildPartial.isInitialized()) {
                    return connectConfirmResponseV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectConfirmResponseV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectConfirmResponseV2 buildPartial() {
                ConnectConfirmResponseV2 connectConfirmResponseV2 = new ConnectConfirmResponseV2(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                connectConfirmResponseV2.confirmResult_ = this.confirmResult_;
                connectConfirmResponseV2.bitField0_ = i7;
                onBuilt();
                return connectConfirmResponseV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectConfirmResponseV2 getDefaultInstanceForType() {
                return ConnectConfirmResponseV2.getDefaultInstance();
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
                this.confirmResult_ = false;
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
            public com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$ConnectConfirmResponseV2> r1 = com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$ConnectConfirmResponseV2 r3 = (com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$ConnectConfirmResponseV2 r4 = (com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$ConnectConfirmResponseV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectConfirmResponseV2) {
                    return mergeFrom((ConnectConfirmResponseV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectConfirmResponseV2 connectConfirmResponseV2) {
                if (connectConfirmResponseV2 == ConnectConfirmResponseV2.getDefaultInstance()) {
                    return this;
                }
                if (connectConfirmResponseV2.hasConfirmResult()) {
                    setConfirmResult(connectConfirmResponseV2.getConfirmResult());
                }
                mergeUnknownFields(((GeneratedMessage) connectConfirmResponseV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private ConnectConfirmResponseV2() {
            this.memoizedIsInitialized = (byte) -1;
            this.confirmResult_ = false;
        }

        public static ConnectConfirmResponseV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_ConnectConfirmResponseV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectConfirmResponseV2 parseDelimitedFrom(InputStream inputStream) {
            return (ConnectConfirmResponseV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectConfirmResponseV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ConnectConfirmResponseV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectConfirmResponseV2)) {
                return super.equals(obj);
            }
            ConnectConfirmResponseV2 connectConfirmResponseV2 = (ConnectConfirmResponseV2) obj;
            boolean z6 = hasConfirmResult() == connectConfirmResponseV2.hasConfirmResult();
            if (hasConfirmResult()) {
                z6 = z6 && getConfirmResult() == connectConfirmResponseV2.getConfirmResult();
            }
            return z6 && this.unknownFields.equals(connectConfirmResponseV2.unknownFields);
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2OrBuilder
        public boolean getConfirmResult() {
            return this.confirmResult_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectConfirmResponseV2> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = ((this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBoolSize(1, this.confirmResult_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeBoolSize;
            return iComputeBoolSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectConfirmResponseV2OrBuilder
        public boolean hasConfirmResult() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasConfirmResult()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getConfirmResult());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_ConnectConfirmResponseV2_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectConfirmResponseV2.class, Builder.class);
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
            if (hasConfirmResult()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(1, this.confirmResult_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private ConnectConfirmResponseV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.confirmResult_ = codedInputStream.readBool();
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

        public static Builder newBuilder(ConnectConfirmResponseV2 connectConfirmResponseV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectConfirmResponseV2);
        }

        public static ConnectConfirmResponseV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectConfirmResponseV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectConfirmResponseV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectConfirmResponseV2 parseFrom(CodedInputStream codedInputStream) {
            return (ConnectConfirmResponseV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectConfirmResponseV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private ConnectConfirmResponseV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectConfirmResponseV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectConfirmResponseV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectConfirmResponseV2 parseFrom(InputStream inputStream) {
            return (ConnectConfirmResponseV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ConnectConfirmResponseV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectConfirmResponseV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectConfirmResponseV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ConnectConfirmResponseV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ConnectConfirmResponseV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectConfirmResponseV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface ConnectConfirmResponseV2OrBuilder extends MessageOrBuilder {
        boolean getConfirmResult();

        boolean hasConfirmResult();
    }

    public static final class ConnectVerifyRequestV2 extends GeneratedMessageV3 implements ConnectVerifyRequestV2OrBuilder {
        private static final ConnectVerifyRequestV2 DEFAULT_INSTANCE = new ConnectVerifyRequestV2();

        @Deprecated
        public static final Parser<ConnectVerifyRequestV2> PARSER = new AbstractParser<ConnectVerifyRequestV2>() { // from class: com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2.1
            @Override // com.google.protobuf.Parser
            public ConnectVerifyRequestV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ConnectVerifyRequestV2(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int RANDOM_APP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString randomApp_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectVerifyRequestV2OrBuilder {
            private int bitField0_;
            private ByteString randomApp_;

            private Builder() {
                this.randomApp_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_ConnectVerifyRequestV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearRandomApp() {
                this.bitField0_ &= -2;
                this.randomApp_ = ConnectVerifyRequestV2.getDefaultInstance().getRandomApp();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_ConnectVerifyRequestV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2OrBuilder
            public ByteString getRandomApp() {
                return this.randomApp_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2OrBuilder
            public boolean hasRandomApp() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_ConnectVerifyRequestV2_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectVerifyRequestV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasRandomApp();
            }

            public Builder setRandomApp(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.randomApp_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.randomApp_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectVerifyRequestV2 build() {
                ConnectVerifyRequestV2 connectVerifyRequestV2BuildPartial = buildPartial();
                if (connectVerifyRequestV2BuildPartial.isInitialized()) {
                    return connectVerifyRequestV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectVerifyRequestV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectVerifyRequestV2 buildPartial() {
                ConnectVerifyRequestV2 connectVerifyRequestV2 = new ConnectVerifyRequestV2(this);
                int i7 = (this.bitField0_ & 1) != 1 ? 0 : 1;
                connectVerifyRequestV2.randomApp_ = this.randomApp_;
                connectVerifyRequestV2.bitField0_ = i7;
                onBuilt();
                return connectVerifyRequestV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectVerifyRequestV2 getDefaultInstanceForType() {
                return ConnectVerifyRequestV2.getDefaultInstance();
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
                this.randomApp_ = ByteString.EMPTY;
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
            public com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$ConnectVerifyRequestV2> r1 = com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$ConnectVerifyRequestV2 r3 = (com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$ConnectVerifyRequestV2 r4 = (com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$ConnectVerifyRequestV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectVerifyRequestV2) {
                    return mergeFrom((ConnectVerifyRequestV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectVerifyRequestV2 connectVerifyRequestV2) {
                if (connectVerifyRequestV2 == ConnectVerifyRequestV2.getDefaultInstance()) {
                    return this;
                }
                if (connectVerifyRequestV2.hasRandomApp()) {
                    setRandomApp(connectVerifyRequestV2.getRandomApp());
                }
                mergeUnknownFields(((GeneratedMessage) connectVerifyRequestV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private ConnectVerifyRequestV2() {
            this.memoizedIsInitialized = (byte) -1;
            this.randomApp_ = ByteString.EMPTY;
        }

        public static ConnectVerifyRequestV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_ConnectVerifyRequestV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectVerifyRequestV2 parseDelimitedFrom(InputStream inputStream) {
            return (ConnectVerifyRequestV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectVerifyRequestV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ConnectVerifyRequestV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectVerifyRequestV2)) {
                return super.equals(obj);
            }
            ConnectVerifyRequestV2 connectVerifyRequestV2 = (ConnectVerifyRequestV2) obj;
            boolean z6 = hasRandomApp() == connectVerifyRequestV2.hasRandomApp();
            if (hasRandomApp()) {
                z6 = z6 && getRandomApp().equals(connectVerifyRequestV2.getRandomApp());
            }
            return z6 && this.unknownFields.equals(connectVerifyRequestV2.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectVerifyRequestV2> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2OrBuilder
        public ByteString getRandomApp() {
            return this.randomApp_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = ((this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, this.randomApp_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeBytesSize;
            return iComputeBytesSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyRequestV2OrBuilder
        public boolean hasRandomApp() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasRandomApp()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getRandomApp().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_ConnectVerifyRequestV2_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectVerifyRequestV2.class, Builder.class);
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
            if (hasRandomApp()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.randomApp_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private ConnectVerifyRequestV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.randomApp_ = codedInputStream.readBytes();
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

        public static Builder newBuilder(ConnectVerifyRequestV2 connectVerifyRequestV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectVerifyRequestV2);
        }

        public static ConnectVerifyRequestV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectVerifyRequestV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectVerifyRequestV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectVerifyRequestV2 parseFrom(CodedInputStream codedInputStream) {
            return (ConnectVerifyRequestV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectVerifyRequestV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private ConnectVerifyRequestV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectVerifyRequestV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectVerifyRequestV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectVerifyRequestV2 parseFrom(InputStream inputStream) {
            return (ConnectVerifyRequestV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ConnectVerifyRequestV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectVerifyRequestV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectVerifyRequestV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ConnectVerifyRequestV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ConnectVerifyRequestV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectVerifyRequestV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface ConnectVerifyRequestV2OrBuilder extends MessageOrBuilder {
        ByteString getRandomApp();

        boolean hasRandomApp();
    }

    public static final class ConnectVerifyResponseV2 extends GeneratedMessageV3 implements ConnectVerifyResponseV2OrBuilder {
        private static final ConnectVerifyResponseV2 DEFAULT_INSTANCE = new ConnectVerifyResponseV2();

        @Deprecated
        public static final Parser<ConnectVerifyResponseV2> PARSER = new AbstractParser<ConnectVerifyResponseV2>() { // from class: com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2.1
            @Override // com.google.protobuf.Parser
            public ConnectVerifyResponseV2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ConnectVerifyResponseV2(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int RANDOM_DEV_FIELD_NUMBER = 1;
        public static final int SIGN_DEV_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString randomDev_;
        private ByteString signDev_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectVerifyResponseV2OrBuilder {
            private int bitField0_;
            private ByteString randomDev_;
            private ByteString signDev_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.randomDev_ = byteString;
                this.signDev_ = byteString;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AccountProtos.internal_static_ConnectVerifyResponseV2_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearRandomDev() {
                this.bitField0_ &= -2;
                this.randomDev_ = ConnectVerifyResponseV2.getDefaultInstance().getRandomDev();
                onChanged();
                return this;
            }

            public Builder clearSignDev() {
                this.bitField0_ &= -3;
                this.signDev_ = ConnectVerifyResponseV2.getDefaultInstance().getSignDev();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AccountProtos.internal_static_ConnectVerifyResponseV2_descriptor;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2OrBuilder
            public ByteString getRandomDev() {
                return this.randomDev_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2OrBuilder
            public ByteString getSignDev() {
                return this.signDev_;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2OrBuilder
            public boolean hasRandomDev() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2OrBuilder
            public boolean hasSignDev() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AccountProtos.internal_static_ConnectVerifyResponseV2_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectVerifyResponseV2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasRandomDev() && hasSignDev();
            }

            public Builder setRandomDev(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.randomDev_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSignDev(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.signDev_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.randomDev_ = byteString;
                this.signDev_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectVerifyResponseV2 build() {
                ConnectVerifyResponseV2 connectVerifyResponseV2BuildPartial = buildPartial();
                if (connectVerifyResponseV2BuildPartial.isInitialized()) {
                    return connectVerifyResponseV2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectVerifyResponseV2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectVerifyResponseV2 buildPartial() {
                ConnectVerifyResponseV2 connectVerifyResponseV2 = new ConnectVerifyResponseV2(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                connectVerifyResponseV2.randomDev_ = this.randomDev_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                connectVerifyResponseV2.signDev_ = this.signDev_;
                connectVerifyResponseV2.bitField0_ = i8;
                onBuilt();
                return connectVerifyResponseV2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectVerifyResponseV2 getDefaultInstanceForType() {
                return ConnectVerifyResponseV2.getDefaultInstance();
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
                ByteString byteString = ByteString.EMPTY;
                this.randomDev_ = byteString;
                int i7 = this.bitField0_;
                this.signDev_ = byteString;
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
            public com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.AccountProtos$ConnectVerifyResponseV2> r1 = com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.AccountProtos$ConnectVerifyResponseV2 r3 = (com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.AccountProtos$ConnectVerifyResponseV2 r4 = (com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.AccountProtos$ConnectVerifyResponseV2$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectVerifyResponseV2) {
                    return mergeFrom((ConnectVerifyResponseV2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectVerifyResponseV2 connectVerifyResponseV2) {
                if (connectVerifyResponseV2 == ConnectVerifyResponseV2.getDefaultInstance()) {
                    return this;
                }
                if (connectVerifyResponseV2.hasRandomDev()) {
                    setRandomDev(connectVerifyResponseV2.getRandomDev());
                }
                if (connectVerifyResponseV2.hasSignDev()) {
                    setSignDev(connectVerifyResponseV2.getSignDev());
                }
                mergeUnknownFields(((GeneratedMessage) connectVerifyResponseV2).unknownFields);
                onChanged();
                return this;
            }
        }

        private ConnectVerifyResponseV2() {
            this.memoizedIsInitialized = (byte) -1;
            ByteString byteString = ByteString.EMPTY;
            this.randomDev_ = byteString;
            this.signDev_ = byteString;
        }

        public static ConnectVerifyResponseV2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AccountProtos.internal_static_ConnectVerifyResponseV2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectVerifyResponseV2 parseDelimitedFrom(InputStream inputStream) {
            return (ConnectVerifyResponseV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectVerifyResponseV2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ConnectVerifyResponseV2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectVerifyResponseV2)) {
                return super.equals(obj);
            }
            ConnectVerifyResponseV2 connectVerifyResponseV2 = (ConnectVerifyResponseV2) obj;
            boolean z6 = hasRandomDev() == connectVerifyResponseV2.hasRandomDev();
            if (hasRandomDev()) {
                z6 = z6 && getRandomDev().equals(connectVerifyResponseV2.getRandomDev());
            }
            boolean z7 = z6 && hasSignDev() == connectVerifyResponseV2.hasSignDev();
            if (hasSignDev()) {
                z7 = z7 && getSignDev().equals(connectVerifyResponseV2.getSignDev());
            }
            return z7 && this.unknownFields.equals(connectVerifyResponseV2.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectVerifyResponseV2> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2OrBuilder
        public ByteString getRandomDev() {
            return this.randomDev_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeBytesSize(1, this.randomDev_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.signDev_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2OrBuilder
        public ByteString getSignDev() {
            return this.signDev_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2OrBuilder
        public boolean hasRandomDev() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.AccountProtos.ConnectVerifyResponseV2OrBuilder
        public boolean hasSignDev() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasRandomDev()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getRandomDev().hashCode();
            }
            if (hasSignDev()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSignDev().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AccountProtos.internal_static_ConnectVerifyResponseV2_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectVerifyResponseV2.class, Builder.class);
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
            if (!hasRandomDev()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSignDev()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.randomDev_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.signDev_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private ConnectVerifyResponseV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.randomDev_ = codedInputStream.readBytes();
                            } else if (tag == 18) {
                                this.bitField0_ |= 2;
                                this.signDev_ = codedInputStream.readBytes();
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

        public static Builder newBuilder(ConnectVerifyResponseV2 connectVerifyResponseV2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectVerifyResponseV2);
        }

        public static ConnectVerifyResponseV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectVerifyResponseV2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectVerifyResponseV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectVerifyResponseV2 parseFrom(CodedInputStream codedInputStream) {
            return (ConnectVerifyResponseV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectVerifyResponseV2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private ConnectVerifyResponseV2(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectVerifyResponseV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectVerifyResponseV2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectVerifyResponseV2 parseFrom(InputStream inputStream) {
            return (ConnectVerifyResponseV2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ConnectVerifyResponseV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectVerifyResponseV2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectVerifyResponseV2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ConnectVerifyResponseV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ConnectVerifyResponseV2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectVerifyResponseV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface ConnectVerifyResponseV2OrBuilder extends MessageOrBuilder {
        ByteString getRandomDev();

        ByteString getSignDev();

        boolean hasRandomDev();

        boolean hasSignDev();
    }

    public enum OOBMode implements ProtocolMessageEnum {
        NUMERIC_COMPARISON(1);

        public static final int NUMERIC_COMPARISON_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<OOBMode> internalValueMap = new Internal.EnumLiteMap<OOBMode>() { // from class: com.zh.wear.protobuf.AccountProtos.OOBMode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public OOBMode findValueByNumber(int i7) {
                return OOBMode.forNumber(i7);
            }
        };
        private static final OOBMode[] VALUES = values();

        OOBMode(int i7) {
            this.value = i7;
        }

        public static OOBMode forNumber(int i7) {
            if (i7 != 1) {
                return null;
            }
            return NUMERIC_COMPARISON;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return AccountProtos.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<OOBMode> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static OOBMode valueOf(int i7) {
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

        public static OOBMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum VerifyMode implements ProtocolMessageEnum {
        PSK_TWO_WAY_VERIFY(1),
        ROOT_CERT_ONE_WAY_VERIFY(2),
        SECONDARY_CERT_CHAIN_TWO_WAY_VERIFY(3);

        public static final int PSK_TWO_WAY_VERIFY_VALUE = 1;
        public static final int ROOT_CERT_ONE_WAY_VERIFY_VALUE = 2;
        public static final int SECONDARY_CERT_CHAIN_TWO_WAY_VERIFY_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<VerifyMode> internalValueMap = new Internal.EnumLiteMap<VerifyMode>() { // from class: com.zh.wear.protobuf.AccountProtos.VerifyMode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public VerifyMode findValueByNumber(int i7) {
                return VerifyMode.forNumber(i7);
            }
        };
        private static final VerifyMode[] VALUES = values();

        VerifyMode(int i7) {
            this.value = i7;
        }

        public static VerifyMode forNumber(int i7) {
            if (i7 == 1) {
                return PSK_TWO_WAY_VERIFY;
            }
            if (i7 == 2) {
                return ROOT_CERT_ONE_WAY_VERIFY;
            }
            if (i7 != 3) {
                return null;
            }
            return SECONDARY_CERT_CHAIN_TWO_WAY_VERIFY;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return AccountProtos.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<VerifyMode> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static VerifyMode valueOf(int i7) {
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

        public static VerifyMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012wear_account.proto\u001a\fnanopb.proto\"¶\t\n\u0007Account\u0012\u0015\n\u000bbind_status\u0018\u0001 \u0001(\bH\u0000\u0012\u0019\n\bbind_key\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012(\n\nerror_code\u0018\u0003 \u0001(\u000e2\u0012.Account.ErrorCodeH\u0000\u0012\u001e\n\tbind_info\u0018\u0004 \u0001(\u000b2\t.BindInfoH\u0000\u0012\"\n\u000bbind_result\u0018\u0005 \u0001(\u000b2\u000b.BindResultH\u0000\u0012\u0016\n\flogin_status\u0018\u0006 \u0001(\bH\u0000\u0012\u001b\n\nverify_key\u0018\u0007 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012\u0017\n\rverify_result\u0018\b \u0001(\bH\u0000\u0012#\n\fbind_info_v2\u0018\u000b \u0001(\u000b2\u000b.BindInfoV2H\u0000\u00126\n\u0016bind_verify_request_v2\u0018\f \u0001(\u000b2\u0014.BindVerifyRequestV2H\u0000\u00128\n\u0017bind_verify_response_v2\u0018\r \u0001(\u000b2\u0015.BindVerifyResponseV2H\u0000\u00120\n\u0013bind_oob_request_v2\u0018\u000f \u0001(\u000b2\u0011.BindOOBRequestV2H\u0000\u00122\n\u0014bind_oob_response_v2\u0018\u0010 \u0001(\u000b2\u0012.BindOOBResponseV2H\u0000\u0012'\n\u000ebind_result_v2\u0018\u0011 \u0001(\u000b2\r.BindResultV2H\u0000\u0012<\n\u0019connect_verify_request_v2\u0018\u0012 \u0001(\u000b2\u0017.ConnectVerifyRequestV2H\u0000\u0012>\n\u001aconnect_verify_response_v2\u0018\u0013 \u0001(\u000b2\u0018.ConnectVerifyResponseV2H\u0000\u0012>\n\u001aconnect_confirm_request_v2\u0018\u0014 \u0001(\u000b2\u0018.ConnectConfirmRequestV2H\u0000\u0012@\n\u001bconnect_confirm_response_v2\u0018\u0015 \u0001(\u000b2\u0019.ConnectConfirmResponseV2H\u0000\"ï\u0001\n\tAccountID\u0012\u000f\n\u000bBIND_STATUS\u0010\u0000\u0012\u000e\n\nBIND_START\u0010\u0001\u0012\u000f\n\u000bBIND_RESULT\u0010\u0002\u0012\u0010\n\fLOGIN_STATUS\u0010\u0003\u0012\u000f\n\u000bLOGIN_START\u0010\u0004\u0012\u0012\n\u000eACCOUNT_VERIFY\u0010\u0005\u0012\u0011\n\rBIND_START_V2\u0010\u0011\u0012\u0012\n\u000eBIND_VERIFY_V2\u0010\u0012\u0012\u000f\n\u000bBIND_OOB_V2\u0010\u0013\u0012\u0012\n\u000eBIND_RESULT_V2\u0010\u0014\u0012\u0015\n\u0011CONNECT_VERIFY_V2\u0010\u0015\u0012\u0016\n\u0012CONNECT_CONFIRM_V2\u0010\u0016\"\u0099\u0001\n\tErrorCode\u0012\f\n\bNO_ERROR\u0010\u0000\u0012\u000e\n\nHAVE_BOUND\u0010\u0001\u0012\u0010\n\fINFO_MISSING\u0010\u0002\u0012\u0011\n\rINVALID_PARAM\u0010\u0003\u0012\f\n\bNO_BOUND\u0010\u0004\u0012\u0010\n\fSERVER_ERROR\u0010\u0005\u0012\n\n\u0006CANCEL\u0010\u0006\u0012\u0010\n\fVERIFY_ERROR\u0010\u0007\u0012\u000b\n\u0007UNKNOWN\u0010dB\t\n\u0007payload\"Á\u0001\n\nBindInfoV2\u0012 \n\u000bverify_mode\u0018\u0001 \u0002(\u000e2\u000b.VerifyMode\u0012\u001c\n\rserial_number\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003mac\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005model\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\boob_mode\u0018\u0005 \u0002(\u000e2\b.OOBMode\u0012\u0019\n\nrandom_dev\u0018\u0006 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003did\u0018\u0007 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"q\n\u0013BindVerifyRequestV2\u0012 \n\u0011public_key_server\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bsign_server\u0018\u0002 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rrandom_server\u0018\u0003 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"j\n\u0014BindVerifyResponseV2\u0012\u001d\n\u000epublic_key_dev\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u0017\n\bsign_dev\u0018\u0002 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bencrypt_key\u0018\u0003 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"L\n\u0010BindOOBRequestV2\u0012\u001f\n\u0010encrypt_oob_code\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u0017\n\bbind_key\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"-\n\u0011BindOOBResponseV2\u0012\u0018\n\tbind_sign\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"R\n\fBindResultV2\u0012\u0016\n\u0007user_id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012*\n\u0010companion_device\u0018\u0002 \u0001(\u000b2\u0010.CompanionDevice\"3\n\u0016ConnectVerifyRequestV2\u0012\u0019\n\nrandom_app\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"M\n\u0017ConnectVerifyResponseV2\u0012\u0019\n\nrandom_dev\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\u0012\u0017\n\bsign_dev\u0018\u0002 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"2\n\u0017ConnectConfirmRequestV2\u0012\u0017\n\bsign_app\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\u0018\u0004\"2\n\u0018ConnectConfirmResponseV2\u0012\u0016\n\u000econfirm_result\u0018\u0001 \u0002(\b\"\u0094\u0001\n\bBindInfo\u0012\u0017\n\bbind_key\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003did\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005model\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003mac\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004sign\u0018\u0005 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rserial_number\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"f\n\nBindResult\u0012\u0016\n\u0007user_id\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005token\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012*\n\u0010companion_device\u0018\u0003 \u0001(\u000b2\u0010.CompanionDevice\"\u007f\n\u000fCompanionDevice\u00120\n\u000bdevice_type\u0018\u0001 \u0002(\u000e2\u001b.CompanionDevice.DeviceType\u0012\u0016\n\u000esystem_version\u0018\u0002 \u0001(\u0002\"\"\n\nDeviceType\u0012\u000b\n\u0007ANDROID\u0010\u0000\u0012\u0007\n\u0003IOS\u0010\u0001*k\n\nVerifyMode\u0012\u0016\n\u0012PSK_TWO_WAY_VERIFY\u0010\u0001\u0012\u001c\n\u0018ROOT_CERT_ONE_WAY_VERIFY\u0010\u0002\u0012'\n#SECONDARY_CERT_CHAIN_TWO_WAY_VERIFY\u0010\u0003*!\n\u0007OOBMode\u0012\u0016\n\u0012NUMERIC_COMPARISON\u0010\u0001B%\n\u0014com.zh.wear.protobufB\rAccountProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.AccountProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = AccountProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Account_descriptor = descriptor2;
        internal_static_Account_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"BindStatus", "BindKey", "ErrorCode", "BindInfo", "BindResult", "LoginStatus", "VerifyKey", "VerifyResult", "BindInfoV2", "BindVerifyRequestV2", "BindVerifyResponseV2", "BindOobRequestV2", "BindOobResponseV2", "BindResultV2", "ConnectVerifyRequestV2", "ConnectVerifyResponseV2", "ConnectConfirmRequestV2", "ConnectConfirmResponseV2", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_BindInfoV2_descriptor = descriptor3;
        internal_static_BindInfoV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"VerifyMode", "SerialNumber", "Mac", ExifInterface.X, "OobMode", "RandomDev", "Did"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_BindVerifyRequestV2_descriptor = descriptor4;
        internal_static_BindVerifyRequestV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"PublicKeyServer", "SignServer", "RandomServer"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_BindVerifyResponseV2_descriptor = descriptor5;
        internal_static_BindVerifyResponseV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"PublicKeyDev", "SignDev", y3.f111821a});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_BindOOBRequestV2_descriptor = descriptor6;
        internal_static_BindOOBRequestV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"EncryptOobCode", "BindKey"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_BindOOBResponseV2_descriptor = descriptor7;
        internal_static_BindOOBResponseV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"BindSign"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_BindResultV2_descriptor = descriptor8;
        internal_static_BindResultV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"UserId", "CompanionDevice"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_ConnectVerifyRequestV2_descriptor = descriptor9;
        internal_static_ConnectVerifyRequestV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"RandomApp"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_ConnectVerifyResponseV2_descriptor = descriptor10;
        internal_static_ConnectVerifyResponseV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"RandomDev", "SignDev"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_ConnectConfirmRequestV2_descriptor = descriptor11;
        internal_static_ConnectConfirmRequestV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SignApp"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_ConnectConfirmResponseV2_descriptor = descriptor12;
        internal_static_ConnectConfirmResponseV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"ConfirmResult"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_BindInfo_descriptor = descriptor13;
        internal_static_BindInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"BindKey", "Did", ExifInterface.X, "Mac", "Sign", "SerialNumber"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_BindResult_descriptor = descriptor14;
        internal_static_BindResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"UserId", Token.f5084b, "CompanionDevice"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_CompanionDevice_descriptor = descriptor15;
        internal_static_CompanionDevice_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"DeviceType", "SystemVersion"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private AccountProtos() {
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