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
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class BindAccountProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SEBindAccount_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEBindAccount_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEBindCheck_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEBindCheck_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEBindResult_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEBindResult_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEClassicBluetoothStatus_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEClassicBluetoothStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SEVerifyResult_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SEVerifyResult_fieldAccessorTable;

    public static final class SEBindAccount extends GeneratedMessage implements SEBindAccountOrBuilder {
        public static final int BIND_CHECK_FIELD_NUMBER = 2;
        public static final int BIND_RESULT_FIELD_NUMBER = 3;
        public static final int CLASSIC_BLUETOOTH_STATUS_FIELD_NUMBER = 8;
        private static final SEBindAccount DEFAULT_INSTANCE;
        public static final int INQUIRY_PAIRING_STATUS_FIELD_NUMBER = 4;
        private static final Parser<SEBindAccount> PARSER;
        public static final int REQUEST_BINDING_STATUS_FIELD_NUMBER = 1;
        public static final int REQUEST_PAIRING_RESULT_FIELD_NUMBER = 5;
        public static final int VERIFY_RESULT_FIELD_NUMBER = 7;
        public static final int VERIFY_USER_NUMBER_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.BindAccountProtos$SEBindAccount$1 */
        public class AnonymousClass1 extends AbstractParser<SEBindAccount> {
            @Override // com.google.protobuf.Parser
            public SEBindAccount parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEBindAccount.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEBindAccountOrBuilder {
            private SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> bindCheckBuilder_;
            private SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> bindResultBuilder_;
            private int bitField0_;
            private SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> classicBluetoothStatusBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> verifyResultBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, b bVar) {
                this(builderParent);
            }

            private void buildPartial0(SEBindAccount sEBindAccount) {
            }

            private void buildPartialOneofs(SEBindAccount sEBindAccount) {
                SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> singleFieldBuilder4;
                int i7 = this.payloadCase_;
                sEBindAccount.payloadCase_ = i7;
                sEBindAccount.payload_ = this.payload_;
                if (i7 == 2 && (singleFieldBuilder4 = this.bindCheckBuilder_) != null) {
                    sEBindAccount.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 3 && (singleFieldBuilder3 = this.bindResultBuilder_) != null) {
                    sEBindAccount.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder2 = this.verifyResultBuilder_) != null) {
                    sEBindAccount.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 8 || (singleFieldBuilder = this.classicBluetoothStatusBuilder_) == null) {
                    return;
                }
                sEBindAccount.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return BindAccountProtos.internal_static_SEBindAccount_descriptor;
            }

            private SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> internalGetBindCheckFieldBuilder() {
                if (this.bindCheckBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SEBindCheck.getDefaultInstance();
                    }
                    this.bindCheckBuilder_ = new SingleFieldBuilder<>((SEBindCheck) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.bindCheckBuilder_;
            }

            private SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> internalGetBindResultFieldBuilder() {
                if (this.bindResultBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = SEBindResult.getDefaultInstance();
                    }
                    this.bindResultBuilder_ = new SingleFieldBuilder<>((SEBindResult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.bindResultBuilder_;
            }

            private SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> internalGetClassicBluetoothStatusFieldBuilder() {
                if (this.classicBluetoothStatusBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SEClassicBluetoothStatus.getDefaultInstance();
                    }
                    this.classicBluetoothStatusBuilder_ = new SingleFieldBuilder<>((SEClassicBluetoothStatus) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.classicBluetoothStatusBuilder_;
            }

            private SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> internalGetVerifyResultFieldBuilder() {
                if (this.verifyResultBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SEVerifyResult.getDefaultInstance();
                    }
                    this.verifyResultBuilder_ = new SingleFieldBuilder<>((SEVerifyResult) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.verifyResultBuilder_;
            }

            public Builder clearBindCheck() {
                SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> singleFieldBuilder = this.bindCheckBuilder_;
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

            public Builder clearBindResult() {
                SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> singleFieldBuilder = this.bindResultBuilder_;
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

            public Builder clearClassicBluetoothStatus() {
                SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> singleFieldBuilder = this.classicBluetoothStatusBuilder_;
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

            public Builder clearInquiryPairingStatus() {
                if (this.payloadCase_ == 4) {
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

            public Builder clearRequestBindingStatus() {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearRequestPairingResult() {
                if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearVerifyResult() {
                SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> singleFieldBuilder = this.verifyResultBuilder_;
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

            public Builder clearVerifyUserNumber() {
                if (this.payloadCase_ == 6) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public SEBindCheck getBindCheck() {
                SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> singleFieldBuilder = this.bindCheckBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SEBindCheck) this.payload_ : SEBindCheck.getDefaultInstance() : this.payloadCase_ == 2 ? (SEBindCheck) singleFieldBuilder.getMessage() : SEBindCheck.getDefaultInstance();
            }

            public SEBindCheck.Builder getBindCheckBuilder() {
                return (SEBindCheck.Builder) internalGetBindCheckFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public SEBindCheckOrBuilder getBindCheckOrBuilder() {
                SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.bindCheckBuilder_) == null) ? i7 == 2 ? (SEBindCheck) this.payload_ : SEBindCheck.getDefaultInstance() : (SEBindCheckOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public SEBindResult getBindResult() {
                SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> singleFieldBuilder = this.bindResultBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (SEBindResult) this.payload_ : SEBindResult.getDefaultInstance() : this.payloadCase_ == 3 ? (SEBindResult) singleFieldBuilder.getMessage() : SEBindResult.getDefaultInstance();
            }

            public SEBindResult.Builder getBindResultBuilder() {
                return (SEBindResult.Builder) internalGetBindResultFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public SEBindResultOrBuilder getBindResultOrBuilder() {
                SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.bindResultBuilder_) == null) ? i7 == 3 ? (SEBindResult) this.payload_ : SEBindResult.getDefaultInstance() : (SEBindResultOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public SEClassicBluetoothStatus getClassicBluetoothStatus() {
                SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> singleFieldBuilder = this.classicBluetoothStatusBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SEClassicBluetoothStatus) this.payload_ : SEClassicBluetoothStatus.getDefaultInstance() : this.payloadCase_ == 8 ? (SEClassicBluetoothStatus) singleFieldBuilder.getMessage() : SEClassicBluetoothStatus.getDefaultInstance();
            }

            public SEClassicBluetoothStatus.Builder getClassicBluetoothStatusBuilder() {
                return (SEClassicBluetoothStatus.Builder) internalGetClassicBluetoothStatusFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public SEClassicBluetoothStatusOrBuilder getClassicBluetoothStatusOrBuilder() {
                SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.classicBluetoothStatusBuilder_) == null) ? i7 == 8 ? (SEClassicBluetoothStatus) this.payload_ : SEClassicBluetoothStatus.getDefaultInstance() : (SEClassicBluetoothStatusOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return BindAccountProtos.internal_static_SEBindAccount_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean getInquiryPairingStatus() {
                if (this.payloadCase_ == 4) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean getRequestBindingStatus() {
                if (this.payloadCase_ == 1) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean getRequestPairingResult() {
                if (this.payloadCase_ == 5) {
                    return ((Boolean) this.payload_).booleanValue();
                }
                return false;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public SEVerifyResult getVerifyResult() {
                SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> singleFieldBuilder = this.verifyResultBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SEVerifyResult) this.payload_ : SEVerifyResult.getDefaultInstance() : this.payloadCase_ == 7 ? (SEVerifyResult) singleFieldBuilder.getMessage() : SEVerifyResult.getDefaultInstance();
            }

            public SEVerifyResult.Builder getVerifyResultBuilder() {
                return (SEVerifyResult.Builder) internalGetVerifyResultFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public SEVerifyResultOrBuilder getVerifyResultOrBuilder() {
                SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.verifyResultBuilder_) == null) ? i7 == 7 ? (SEVerifyResult) this.payload_ : SEVerifyResult.getDefaultInstance() : (SEVerifyResultOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public String getVerifyUserNumber() {
                if (this.payloadCase_ != 6) {
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

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public ByteString getVerifyUserNumberBytes() {
                if (this.payloadCase_ != 6) {
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

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean hasBindCheck() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean hasBindResult() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean hasClassicBluetoothStatus() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean hasInquiryPairingStatus() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean hasRequestBindingStatus() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean hasRequestPairingResult() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean hasVerifyResult() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
            public boolean hasVerifyUserNumber() {
                return this.payloadCase_ == 6;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return BindAccountProtos.internal_static_SEBindAccount_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBindAccount.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasBindCheck() && !getBindCheck().isInitialized()) {
                    return false;
                }
                if (!hasVerifyResult() || getVerifyResult().isInitialized()) {
                    return !hasClassicBluetoothStatus() || getClassicBluetoothStatus().isInitialized();
                }
                return false;
            }

            public Builder mergeBindCheck(SEBindCheck sEBindCheck) {
                SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> singleFieldBuilder = this.bindCheckBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SEBindCheck.getDefaultInstance()) {
                        this.payload_ = sEBindCheck;
                    } else {
                        this.payload_ = SEBindCheck.newBuilder((SEBindCheck) this.payload_).mergeFrom(sEBindCheck).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(sEBindCheck);
                } else {
                    singleFieldBuilder.setMessage(sEBindCheck);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeBindResult(SEBindResult sEBindResult) {
                SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> singleFieldBuilder = this.bindResultBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == SEBindResult.getDefaultInstance()) {
                        this.payload_ = sEBindResult;
                    } else {
                        this.payload_ = SEBindResult.newBuilder((SEBindResult) this.payload_).mergeFrom(sEBindResult).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(sEBindResult);
                } else {
                    singleFieldBuilder.setMessage(sEBindResult);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeClassicBluetoothStatus(SEClassicBluetoothStatus sEClassicBluetoothStatus) {
                SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> singleFieldBuilder = this.classicBluetoothStatusBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SEClassicBluetoothStatus.getDefaultInstance()) {
                        this.payload_ = sEClassicBluetoothStatus;
                    } else {
                        this.payload_ = SEClassicBluetoothStatus.newBuilder((SEClassicBluetoothStatus) this.payload_).mergeFrom(sEClassicBluetoothStatus).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(sEClassicBluetoothStatus);
                } else {
                    singleFieldBuilder.setMessage(sEClassicBluetoothStatus);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeVerifyResult(SEVerifyResult sEVerifyResult) {
                SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> singleFieldBuilder = this.verifyResultBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SEVerifyResult.getDefaultInstance()) {
                        this.payload_ = sEVerifyResult;
                    } else {
                        this.payload_ = SEVerifyResult.newBuilder((SEVerifyResult) this.payload_).mergeFrom(sEVerifyResult).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEVerifyResult);
                } else {
                    singleFieldBuilder.setMessage(sEVerifyResult);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setBindCheck(SEBindCheck sEBindCheck) {
                SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> singleFieldBuilder = this.bindCheckBuilder_;
                if (singleFieldBuilder == null) {
                    sEBindCheck.getClass();
                    this.payload_ = sEBindCheck;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEBindCheck);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setBindResult(SEBindResult sEBindResult) {
                SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> singleFieldBuilder = this.bindResultBuilder_;
                if (singleFieldBuilder == null) {
                    sEBindResult.getClass();
                    this.payload_ = sEBindResult;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEBindResult);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setClassicBluetoothStatus(SEClassicBluetoothStatus sEClassicBluetoothStatus) {
                SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> singleFieldBuilder = this.classicBluetoothStatusBuilder_;
                if (singleFieldBuilder == null) {
                    sEClassicBluetoothStatus.getClass();
                    this.payload_ = sEClassicBluetoothStatus;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEClassicBluetoothStatus);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setInquiryPairingStatus(boolean z6) {
                this.payloadCase_ = 4;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            public Builder setRequestBindingStatus(boolean z6) {
                this.payloadCase_ = 1;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            public Builder setRequestPairingResult(boolean z6) {
                this.payloadCase_ = 5;
                this.payload_ = Boolean.valueOf(z6);
                onChanged();
                return this;
            }

            public Builder setVerifyResult(SEVerifyResult sEVerifyResult) {
                SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> singleFieldBuilder = this.verifyResultBuilder_;
                if (singleFieldBuilder == null) {
                    sEVerifyResult.getClass();
                    this.payload_ = sEVerifyResult;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEVerifyResult);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setVerifyUserNumber(String str) {
                str.getClass();
                this.payloadCase_ = 6;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setVerifyUserNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 6;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(b bVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBindAccount build() {
                SEBindAccount sEBindAccountBuildPartial = buildPartial();
                if (sEBindAccountBuildPartial.isInitialized()) {
                    return sEBindAccountBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEBindAccountBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBindAccount buildPartial() {
                SEBindAccount sEBindAccount = new SEBindAccount(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEBindAccount);
                }
                buildPartialOneofs(sEBindAccount);
                onBuilt();
                return sEBindAccount;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEBindAccount getDefaultInstanceForType() {
                return SEBindAccount.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> singleFieldBuilder = this.bindCheckBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> singleFieldBuilder2 = this.bindResultBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> singleFieldBuilder3 = this.verifyResultBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> singleFieldBuilder4 = this.classicBluetoothStatusBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEBindAccount) {
                    return mergeFrom((SEBindAccount) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setBindCheck(SEBindCheck.Builder builder) {
                SingleFieldBuilder<SEBindCheck, SEBindCheck.Builder, SEBindCheckOrBuilder> singleFieldBuilder = this.bindCheckBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setBindResult(SEBindResult.Builder builder) {
                SingleFieldBuilder<SEBindResult, SEBindResult.Builder, SEBindResultOrBuilder> singleFieldBuilder = this.bindResultBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setClassicBluetoothStatus(SEClassicBluetoothStatus.Builder builder) {
                SingleFieldBuilder<SEClassicBluetoothStatus, SEClassicBluetoothStatus.Builder, SEClassicBluetoothStatusOrBuilder> singleFieldBuilder = this.classicBluetoothStatusBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setVerifyResult(SEVerifyResult.Builder builder) {
                SingleFieldBuilder<SEVerifyResult, SEVerifyResult.Builder, SEVerifyResultOrBuilder> singleFieldBuilder = this.verifyResultBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeFrom(SEBindAccount sEBindAccount) {
                if (sEBindAccount == SEBindAccount.getDefaultInstance()) {
                    return this;
                }
                switch (sEBindAccount.getPayloadCase()) {
                    case REQUEST_BINDING_STATUS:
                        setRequestBindingStatus(sEBindAccount.getRequestBindingStatus());
                        break;
                    case BIND_CHECK:
                        mergeBindCheck(sEBindAccount.getBindCheck());
                        break;
                    case BIND_RESULT:
                        mergeBindResult(sEBindAccount.getBindResult());
                        break;
                    case INQUIRY_PAIRING_STATUS:
                        setInquiryPairingStatus(sEBindAccount.getInquiryPairingStatus());
                        break;
                    case REQUEST_PAIRING_RESULT:
                        setRequestPairingResult(sEBindAccount.getRequestPairingResult());
                        break;
                    case VERIFY_USER_NUMBER:
                        this.payloadCase_ = 6;
                        this.payload_ = sEBindAccount.payload_;
                        onChanged();
                        break;
                    case VERIFY_RESULT:
                        mergeVerifyResult(sEBindAccount.getVerifyResult());
                        break;
                    case CLASSIC_BLUETOOTH_STATUS:
                        mergeClassicBluetoothStatus(sEBindAccount.getClassicBluetoothStatus());
                        break;
                }
                mergeUnknownFields(sEBindAccount.getUnknownFields());
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
                                    this.payload_ = Boolean.valueOf(codedInputStream.readBool());
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetBindCheckFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(internalGetBindResultFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
                                } else if (tag == 32) {
                                    this.payload_ = Boolean.valueOf(codedInputStream.readBool());
                                    this.payloadCase_ = 4;
                                } else if (tag == 40) {
                                    this.payload_ = Boolean.valueOf(codedInputStream.readBool());
                                    this.payloadCase_ = 5;
                                } else if (tag == 50) {
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.payloadCase_ = 6;
                                    this.payload_ = bytes;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(internalGetVerifyResultFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                } else if (tag != 66) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetClassicBluetoothStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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
            REQUEST_BINDING_STATUS(1),
            BIND_CHECK(2),
            BIND_RESULT(3),
            INQUIRY_PAIRING_STATUS(4),
            REQUEST_PAIRING_RESULT(5),
            VERIFY_USER_NUMBER(6),
            VERIFY_RESULT(7),
            CLASSIC_BLUETOOTH_STATUS(8),
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
                        return REQUEST_BINDING_STATUS;
                    case 2:
                        return BIND_CHECK;
                    case 3:
                        return BIND_RESULT;
                    case 4:
                        return INQUIRY_PAIRING_STATUS;
                    case 5:
                        return REQUEST_PAIRING_RESULT;
                    case 6:
                        return VERIFY_USER_NUMBER;
                    case 7:
                        return VERIFY_RESULT;
                    case 8:
                        return CLASSIC_BLUETOOTH_STATUS;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBindAccount");
            DEFAULT_INSTANCE = new SEBindAccount();
            PARSER = new AbstractParser<SEBindAccount>() { // from class: com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccount.1
                @Override // com.google.protobuf.Parser
                public SEBindAccount parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEBindAccount.newBuilder();
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

        public /* synthetic */ SEBindAccount(GeneratedMessage.Builder builder, b bVar) {
            this(builder);
        }

        public static SEBindAccount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return BindAccountProtos.internal_static_SEBindAccount_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEBindAccount parseDelimitedFrom(InputStream inputStream) {
            return (SEBindAccount) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEBindAccount parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEBindAccount> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEBindAccount)) {
                return super.equals(obj);
            }
            SEBindAccount sEBindAccount = (SEBindAccount) obj;
            if (!getPayloadCase().equals(sEBindAccount.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (getRequestBindingStatus() != sEBindAccount.getRequestBindingStatus()) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getBindCheck().equals(sEBindAccount.getBindCheck())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getBindResult().equals(sEBindAccount.getBindResult())) {
                        return false;
                    }
                    break;
                case 4:
                    if (getInquiryPairingStatus() != sEBindAccount.getInquiryPairingStatus()) {
                        return false;
                    }
                    break;
                case 5:
                    if (getRequestPairingResult() != sEBindAccount.getRequestPairingResult()) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getVerifyUserNumber().equals(sEBindAccount.getVerifyUserNumber())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getVerifyResult().equals(sEBindAccount.getVerifyResult())) {
                        return false;
                    }
                    break;
                case 8:
                    if (!getClassicBluetoothStatus().equals(sEBindAccount.getClassicBluetoothStatus())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sEBindAccount.getUnknownFields());
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public SEBindCheck getBindCheck() {
            return this.payloadCase_ == 2 ? (SEBindCheck) this.payload_ : SEBindCheck.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public SEBindCheckOrBuilder getBindCheckOrBuilder() {
            return this.payloadCase_ == 2 ? (SEBindCheck) this.payload_ : SEBindCheck.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public SEBindResult getBindResult() {
            return this.payloadCase_ == 3 ? (SEBindResult) this.payload_ : SEBindResult.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public SEBindResultOrBuilder getBindResultOrBuilder() {
            return this.payloadCase_ == 3 ? (SEBindResult) this.payload_ : SEBindResult.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public SEClassicBluetoothStatus getClassicBluetoothStatus() {
            return this.payloadCase_ == 8 ? (SEClassicBluetoothStatus) this.payload_ : SEClassicBluetoothStatus.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public SEClassicBluetoothStatusOrBuilder getClassicBluetoothStatusOrBuilder() {
            return this.payloadCase_ == 8 ? (SEClassicBluetoothStatus) this.payload_ : SEClassicBluetoothStatus.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return BindAccountProtos.internal_static_SEBindAccount_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean getInquiryPairingStatus() {
            if (this.payloadCase_ == 4) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEBindAccount> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean getRequestBindingStatus() {
            if (this.payloadCase_ == 1) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean getRequestPairingResult() {
            if (this.payloadCase_ == 5) {
                return ((Boolean) this.payload_).booleanValue();
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = this.payloadCase_ == 1 ? CodedOutputStream.computeBoolSize(1, ((Boolean) this.payload_).booleanValue()) : 0;
            if (this.payloadCase_ == 2) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(2, (SEBindCheck) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(3, (SEBindResult) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 5) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(5, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 6) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(6, this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(7, (SEVerifyResult) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(8, (SEClassicBluetoothStatus) this.payload_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public SEVerifyResult getVerifyResult() {
            return this.payloadCase_ == 7 ? (SEVerifyResult) this.payload_ : SEVerifyResult.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public SEVerifyResultOrBuilder getVerifyResultOrBuilder() {
            return this.payloadCase_ == 7 ? (SEVerifyResult) this.payload_ : SEVerifyResult.getDefaultInstance();
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public String getVerifyUserNumber() {
            if (this.payloadCase_ != 6) {
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

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public ByteString getVerifyUserNumberBytes() {
            if (this.payloadCase_ != 6) {
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

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean hasBindCheck() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean hasBindResult() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean hasClassicBluetoothStatus() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean hasInquiryPairingStatus() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean hasRequestBindingStatus() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean hasRequestPairingResult() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean hasVerifyResult() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindAccountOrBuilder
        public boolean hasVerifyUserNumber() {
            return this.payloadCase_ == 6;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7;
            int iHashBoolean;
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            switch (this.payloadCase_) {
                case 1:
                    i7 = ((iHashCode * 37) + 1) * 53;
                    iHashBoolean = Internal.hashBoolean(getRequestBindingStatus());
                    break;
                case 2:
                    i7 = ((iHashCode * 37) + 2) * 53;
                    iHashBoolean = getBindCheck().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode * 37) + 3) * 53;
                    iHashBoolean = getBindResult().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode * 37) + 4) * 53;
                    iHashBoolean = Internal.hashBoolean(getInquiryPairingStatus());
                    break;
                case 5:
                    i7 = ((iHashCode * 37) + 5) * 53;
                    iHashBoolean = Internal.hashBoolean(getRequestPairingResult());
                    break;
                case 6:
                    i7 = ((iHashCode * 37) + 6) * 53;
                    iHashBoolean = getVerifyUserNumber().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode * 37) + 7) * 53;
                    iHashBoolean = getVerifyResult().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode * 37) + 8) * 53;
                    iHashBoolean = getClassicBluetoothStatus().hashCode();
                    break;
                default:
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
            }
            iHashCode = i7 + iHashBoolean;
            int iHashCode22 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode22;
            return iHashCode22;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return BindAccountProtos.internal_static_SEBindAccount_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBindAccount.class, Builder.class);
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
            if (hasBindCheck() && !getBindCheck().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVerifyResult() && !getVerifyResult().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasClassicBluetoothStatus() || getClassicBluetoothStatus().isInitialized()) {
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
                codedOutputStream.writeMessage(2, (SEBindCheck) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (SEBindResult) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeBool(4, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeBool(5, ((Boolean) this.payload_).booleanValue());
            }
            if (this.payloadCase_ == 6) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SEVerifyResult) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SEClassicBluetoothStatus) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEBindAccount(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEBindAccount sEBindAccount) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEBindAccount);
        }

        public static SEBindAccount parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEBindAccount parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBindAccount) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBindAccount parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEBindAccount getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEBindAccount parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEBindAccount() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEBindAccount parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEBindAccount parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEBindAccount parseFrom(InputStream inputStream) {
            return (SEBindAccount) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEBindAccount parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBindAccount) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBindAccount parseFrom(CodedInputStream codedInputStream) {
            return (SEBindAccount) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEBindAccount parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBindAccount) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEBindAccountOrBuilder extends MessageOrBuilder {
        SEBindCheck getBindCheck();

        SEBindCheckOrBuilder getBindCheckOrBuilder();

        SEBindResult getBindResult();

        SEBindResultOrBuilder getBindResultOrBuilder();

        SEClassicBluetoothStatus getClassicBluetoothStatus();

        SEClassicBluetoothStatusOrBuilder getClassicBluetoothStatusOrBuilder();

        boolean getInquiryPairingStatus();

        SEBindAccount.PayloadCase getPayloadCase();

        boolean getRequestBindingStatus();

        boolean getRequestPairingResult();

        SEVerifyResult getVerifyResult();

        SEVerifyResultOrBuilder getVerifyResultOrBuilder();

        String getVerifyUserNumber();

        ByteString getVerifyUserNumberBytes();

        boolean hasBindCheck();

        boolean hasBindResult();

        boolean hasClassicBluetoothStatus();

        boolean hasInquiryPairingStatus();

        boolean hasRequestBindingStatus();

        boolean hasRequestPairingResult();

        boolean hasVerifyResult();

        boolean hasVerifyUserNumber();
    }

    public static final class SEBindCheck extends GeneratedMessage implements SEBindCheckOrBuilder {
        public static final int BIND_CHECK_RESULT_FIELD_NUMBER = 3;
        public static final int BIND_RANDOM_KEY_FIELD_NUMBER = 2;
        private static final SEBindCheck DEFAULT_INSTANCE;
        public static final int DEVICE_NAME_FIELD_NUMBER = 8;
        public static final int DEVICE_NUMBER_FIELD_NUMBER = 4;
        public static final int DEVICE_VERIFY_FIELD_NUMBER = 1;
        public static final int FIRMWARE_VERSION_FIELD_NUMBER = 7;
        public static final int MAC_FIELD_NUMBER = 5;
        private static final Parser<SEBindCheck> PARSER;
        public static final int SERIAL_NUMBER_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bindCheckResult_;
        private volatile Object bindRandomKey_;
        private int bitField0_;
        private volatile Object deviceName_;
        private volatile Object deviceNumber_;
        private boolean deviceVerify_;
        private volatile Object firmwareVersion_;
        private volatile Object mac_;
        private byte memoizedIsInitialized;
        private volatile Object serialNumber_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.BindAccountProtos$SEBindCheck$1 */
        public class AnonymousClass1 extends AbstractParser<SEBindCheck> {
            @Override // com.google.protobuf.Parser
            public SEBindCheck parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEBindCheck.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEBindCheckOrBuilder {
            private int bindCheckResult_;
            private Object bindRandomKey_;
            private int bitField0_;
            private Object deviceName_;
            private Object deviceNumber_;
            private boolean deviceVerify_;
            private Object firmwareVersion_;
            private Object mac_;
            private Object serialNumber_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, b bVar) {
                this(builderParent);
            }

            private void buildPartial0(SEBindCheck sEBindCheck) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEBindCheck.deviceVerify_ = this.deviceVerify_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEBindCheck.bindRandomKey_ = this.bindRandomKey_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEBindCheck.bindCheckResult_ = this.bindCheckResult_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEBindCheck.deviceNumber_ = this.deviceNumber_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEBindCheck.mac_ = this.mac_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEBindCheck.serialNumber_ = this.serialNumber_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEBindCheck.firmwareVersion_ = this.firmwareVersion_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sEBindCheck.deviceName_ = this.deviceName_;
                    i7 |= 128;
                }
                sEBindCheck.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return BindAccountProtos.internal_static_SEBindCheck_descriptor;
            }

            public Builder clearBindCheckResult() {
                this.bitField0_ &= -5;
                this.bindCheckResult_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBindRandomKey() {
                this.bindRandomKey_ = SEBindCheck.getDefaultInstance().getBindRandomKey();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearDeviceName() {
                this.deviceName_ = SEBindCheck.getDefaultInstance().getDeviceName();
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                onChanged();
                return this;
            }

            public Builder clearDeviceNumber() {
                this.deviceNumber_ = SEBindCheck.getDefaultInstance().getDeviceNumber();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearDeviceVerify() {
                this.bitField0_ &= -2;
                this.deviceVerify_ = false;
                onChanged();
                return this;
            }

            public Builder clearFirmwareVersion() {
                this.firmwareVersion_ = SEBindCheck.getDefaultInstance().getFirmwareVersion();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearMac() {
                this.mac_ = SEBindCheck.getDefaultInstance().getMac();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearSerialNumber() {
                this.serialNumber_ = SEBindCheck.getDefaultInstance().getSerialNumber();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public SEBindCheckResult getBindCheckResult() {
                SEBindCheckResult sEBindCheckResultForNumber = SEBindCheckResult.forNumber(this.bindCheckResult_);
                return sEBindCheckResultForNumber == null ? SEBindCheckResult.SUCCESS : sEBindCheckResultForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public String getBindRandomKey() {
                Object obj = this.bindRandomKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.bindRandomKey_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public ByteString getBindRandomKeyBytes() {
                Object obj = this.bindRandomKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bindRandomKey_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return BindAccountProtos.internal_static_SEBindCheck_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public String getDeviceName() {
                Object obj = this.deviceName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public ByteString getDeviceNameBytes() {
                Object obj = this.deviceName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public String getDeviceNumber() {
                Object obj = this.deviceNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public ByteString getDeviceNumberBytes() {
                Object obj = this.deviceNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public boolean getDeviceVerify() {
                return this.deviceVerify_;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public ByteString getFirmwareVersionBytes() {
                Object obj = this.firmwareVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.firmwareVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public ByteString getMacBytes() {
                Object obj = this.mac_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mac_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public ByteString getSerialNumberBytes() {
                Object obj = this.serialNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serialNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public boolean hasBindCheckResult() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public boolean hasBindRandomKey() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public boolean hasDeviceName() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public boolean hasDeviceNumber() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public boolean hasDeviceVerify() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public boolean hasFirmwareVersion() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public boolean hasMac() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
            public boolean hasSerialNumber() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return BindAccountProtos.internal_static_SEBindCheck_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBindCheck.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasDeviceVerify();
            }

            public Builder setBindCheckResult(SEBindCheckResult sEBindCheckResult) {
                sEBindCheckResult.getClass();
                this.bitField0_ |= 4;
                this.bindCheckResult_ = sEBindCheckResult.getNumber();
                onChanged();
                return this;
            }

            public Builder setBindRandomKey(String str) {
                str.getClass();
                this.bindRandomKey_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setBindRandomKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.bindRandomKey_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDeviceName(String str) {
                str.getClass();
                this.deviceName_ = str;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setDeviceNameBytes(ByteString byteString) {
                byteString.getClass();
                this.deviceName_ = byteString;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setDeviceNumber(String str) {
                str.getClass();
                this.deviceNumber_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDeviceNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.deviceNumber_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDeviceVerify(boolean z6) {
                this.deviceVerify_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFirmwareVersion(String str) {
                str.getClass();
                this.firmwareVersion_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setFirmwareVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.firmwareVersion_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setMac(String str) {
                str.getClass();
                this.mac_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMacBytes(ByteString byteString) {
                byteString.getClass();
                this.mac_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSerialNumber(String str) {
                str.getClass();
                this.serialNumber_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSerialNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.serialNumber_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(b bVar) {
                this();
            }

            private Builder() {
                this.bindRandomKey_ = "";
                this.bindCheckResult_ = 0;
                this.deviceNumber_ = "";
                this.mac_ = "";
                this.serialNumber_ = "";
                this.firmwareVersion_ = "";
                this.deviceName_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBindCheck build() {
                SEBindCheck sEBindCheckBuildPartial = buildPartial();
                if (sEBindCheckBuildPartial.isInitialized()) {
                    return sEBindCheckBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEBindCheckBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBindCheck buildPartial() {
                SEBindCheck sEBindCheck = new SEBindCheck(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEBindCheck);
                }
                onBuilt();
                return sEBindCheck;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEBindCheck getDefaultInstanceForType() {
                return SEBindCheck.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.deviceVerify_ = false;
                this.bindRandomKey_ = "";
                this.bindCheckResult_ = 0;
                this.deviceNumber_ = "";
                this.mac_ = "";
                this.serialNumber_ = "";
                this.firmwareVersion_ = "";
                this.deviceName_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEBindCheck) {
                    return mergeFrom((SEBindCheck) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEBindCheck sEBindCheck) {
                if (sEBindCheck == SEBindCheck.getDefaultInstance()) {
                    return this;
                }
                if (sEBindCheck.hasDeviceVerify()) {
                    setDeviceVerify(sEBindCheck.getDeviceVerify());
                }
                if (sEBindCheck.hasBindRandomKey()) {
                    this.bindRandomKey_ = sEBindCheck.bindRandomKey_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEBindCheck.hasBindCheckResult()) {
                    setBindCheckResult(sEBindCheck.getBindCheckResult());
                }
                if (sEBindCheck.hasDeviceNumber()) {
                    this.deviceNumber_ = sEBindCheck.deviceNumber_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEBindCheck.hasMac()) {
                    this.mac_ = sEBindCheck.mac_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (sEBindCheck.hasSerialNumber()) {
                    this.serialNumber_ = sEBindCheck.serialNumber_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (sEBindCheck.hasFirmwareVersion()) {
                    this.firmwareVersion_ = sEBindCheck.firmwareVersion_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (sEBindCheck.hasDeviceName()) {
                    this.deviceName_ = sEBindCheck.deviceName_;
                    this.bitField0_ |= 128;
                    onChanged();
                }
                mergeUnknownFields(sEBindCheck.getUnknownFields());
                onChanged();
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.bindRandomKey_ = "";
                this.bindCheckResult_ = 0;
                this.deviceNumber_ = "";
                this.mac_ = "";
                this.serialNumber_ = "";
                this.firmwareVersion_ = "";
                this.deviceName_ = "";
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
                                    this.deviceVerify_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.bindRandomKey_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i7 = codedInputStream.readEnum();
                                    if (SEBindCheckResult.forNumber(i7) == null) {
                                        mergeUnknownVarintField(3, i7);
                                    } else {
                                        this.bindCheckResult_ = i7;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 34) {
                                    this.deviceNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.mac_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.serialNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    this.firmwareVersion_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                } else if (tag != 66) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.deviceName_ = codedInputStream.readBytes();
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

        public enum SEBindCheckResult implements ProtocolMessageEnum {
            SUCCESS(0),
            REFUSE(1),
            OVER_TIME(2),
            VERIFICATION_FAILED(3);

            public static final int OVER_TIME_VALUE = 2;
            public static final int REFUSE_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private static final SEBindCheckResult[] VALUES;
            public static final int VERIFICATION_FAILED_VALUE = 3;
            private static final Internal.EnumLiteMap<SEBindCheckResult> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.BindAccountProtos$SEBindCheck$SEBindCheckResult$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEBindCheckResult> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEBindCheckResult findValueByNumber(int i7) {
                    return SEBindCheckResult.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBindCheckResult");
                internalValueMap = new Internal.EnumLiteMap<SEBindCheckResult>() { // from class: com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheck.SEBindCheckResult.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEBindCheckResult findValueByNumber(int i7) {
                        return SEBindCheckResult.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEBindCheckResult(int i7) {
                this.value = i7;
            }

            public static SEBindCheckResult forNumber(int i7) {
                if (i7 == 0) {
                    return SUCCESS;
                }
                if (i7 == 1) {
                    return REFUSE;
                }
                if (i7 == 2) {
                    return OVER_TIME;
                }
                if (i7 != 3) {
                    return null;
                }
                return VERIFICATION_FAILED;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEBindCheck.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SEBindCheckResult> internalGetValueMap() {
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
            public static SEBindCheckResult valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEBindCheckResult valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBindCheck");
            DEFAULT_INSTANCE = new SEBindCheck();
            PARSER = new AbstractParser<SEBindCheck>() { // from class: com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheck.1
                @Override // com.google.protobuf.Parser
                public SEBindCheck parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEBindCheck.newBuilder();
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

        public /* synthetic */ SEBindCheck(GeneratedMessage.Builder builder, b bVar) {
            this(builder);
        }

        public static SEBindCheck getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return BindAccountProtos.internal_static_SEBindCheck_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEBindCheck parseDelimitedFrom(InputStream inputStream) {
            return (SEBindCheck) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEBindCheck parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEBindCheck> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEBindCheck)) {
                return super.equals(obj);
            }
            SEBindCheck sEBindCheck = (SEBindCheck) obj;
            if (hasDeviceVerify() != sEBindCheck.hasDeviceVerify()) {
                return false;
            }
            if ((hasDeviceVerify() && getDeviceVerify() != sEBindCheck.getDeviceVerify()) || hasBindRandomKey() != sEBindCheck.hasBindRandomKey()) {
                return false;
            }
            if ((hasBindRandomKey() && !getBindRandomKey().equals(sEBindCheck.getBindRandomKey())) || hasBindCheckResult() != sEBindCheck.hasBindCheckResult()) {
                return false;
            }
            if ((hasBindCheckResult() && this.bindCheckResult_ != sEBindCheck.bindCheckResult_) || hasDeviceNumber() != sEBindCheck.hasDeviceNumber()) {
                return false;
            }
            if ((hasDeviceNumber() && !getDeviceNumber().equals(sEBindCheck.getDeviceNumber())) || hasMac() != sEBindCheck.hasMac()) {
                return false;
            }
            if ((hasMac() && !getMac().equals(sEBindCheck.getMac())) || hasSerialNumber() != sEBindCheck.hasSerialNumber()) {
                return false;
            }
            if ((hasSerialNumber() && !getSerialNumber().equals(sEBindCheck.getSerialNumber())) || hasFirmwareVersion() != sEBindCheck.hasFirmwareVersion()) {
                return false;
            }
            if ((!hasFirmwareVersion() || getFirmwareVersion().equals(sEBindCheck.getFirmwareVersion())) && hasDeviceName() == sEBindCheck.hasDeviceName()) {
                return (!hasDeviceName() || getDeviceName().equals(sEBindCheck.getDeviceName())) && getUnknownFields().equals(sEBindCheck.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public SEBindCheckResult getBindCheckResult() {
            SEBindCheckResult sEBindCheckResultForNumber = SEBindCheckResult.forNumber(this.bindCheckResult_);
            return sEBindCheckResultForNumber == null ? SEBindCheckResult.SUCCESS : sEBindCheckResultForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public String getBindRandomKey() {
            Object obj = this.bindRandomKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bindRandomKey_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public ByteString getBindRandomKeyBytes() {
            Object obj = this.bindRandomKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bindRandomKey_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return BindAccountProtos.internal_static_SEBindCheck_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public String getDeviceName() {
            Object obj = this.deviceName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public ByteString getDeviceNameBytes() {
            Object obj = this.deviceName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public String getDeviceNumber() {
            Object obj = this.deviceNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public ByteString getDeviceNumberBytes() {
            Object obj = this.deviceNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public boolean getDeviceVerify() {
            return this.deviceVerify_;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public ByteString getFirmwareVersionBytes() {
            Object obj = this.firmwareVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.firmwareVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
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
        public Parser<SEBindCheck> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
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
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.deviceVerify_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(2, this.bindRandomKey_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(3, this.bindCheckResult_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(4, this.deviceNumber_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(5, this.mac_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(6, this.serialNumber_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(7, this.firmwareVersion_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(8, this.deviceName_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public boolean hasBindCheckResult() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public boolean hasBindRandomKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public boolean hasDeviceName() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public boolean hasDeviceNumber() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public boolean hasDeviceVerify() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public boolean hasFirmwareVersion() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public boolean hasMac() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindCheckOrBuilder
        public boolean hasSerialNumber() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasDeviceVerify()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getDeviceVerify());
            }
            if (hasBindRandomKey()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBindRandomKey().hashCode();
            }
            if (hasBindCheckResult()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.bindCheckResult_;
            }
            if (hasDeviceNumber()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDeviceNumber().hashCode();
            }
            if (hasMac()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getMac().hashCode();
            }
            if (hasSerialNumber()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getSerialNumber().hashCode();
            }
            if (hasFirmwareVersion()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getFirmwareVersion().hashCode();
            }
            if (hasDeviceName()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getDeviceName().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return BindAccountProtos.internal_static_SEBindCheck_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBindCheck.class, Builder.class);
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
            if (hasDeviceVerify()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.deviceVerify_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.bindRandomKey_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.bindCheckResult_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.deviceNumber_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.mac_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.serialNumber_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.firmwareVersion_);
            }
            if ((this.bitField0_ & 128) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 8, this.deviceName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEBindCheck(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.deviceVerify_ = false;
            this.bindRandomKey_ = "";
            this.bindCheckResult_ = 0;
            this.deviceNumber_ = "";
            this.mac_ = "";
            this.serialNumber_ = "";
            this.firmwareVersion_ = "";
            this.deviceName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEBindCheck sEBindCheck) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEBindCheck);
        }

        public static SEBindCheck parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEBindCheck parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBindCheck) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBindCheck parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEBindCheck getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEBindCheck parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEBindCheck parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEBindCheck parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEBindCheck parseFrom(InputStream inputStream) {
            return (SEBindCheck) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEBindCheck parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBindCheck) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBindCheck parseFrom(CodedInputStream codedInputStream) {
            return (SEBindCheck) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        private SEBindCheck() {
            this.deviceVerify_ = false;
            this.bindRandomKey_ = "";
            this.bindCheckResult_ = 0;
            this.deviceNumber_ = "";
            this.mac_ = "";
            this.serialNumber_ = "";
            this.firmwareVersion_ = "";
            this.deviceName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.bindRandomKey_ = "";
            this.bindCheckResult_ = 0;
            this.deviceNumber_ = "";
            this.mac_ = "";
            this.serialNumber_ = "";
            this.firmwareVersion_ = "";
            this.deviceName_ = "";
        }

        public static SEBindCheck parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBindCheck) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEBindCheckOrBuilder extends MessageOrBuilder {
        SEBindCheck.SEBindCheckResult getBindCheckResult();

        String getBindRandomKey();

        ByteString getBindRandomKeyBytes();

        String getDeviceName();

        ByteString getDeviceNameBytes();

        String getDeviceNumber();

        ByteString getDeviceNumberBytes();

        boolean getDeviceVerify();

        String getFirmwareVersion();

        ByteString getFirmwareVersionBytes();

        String getMac();

        ByteString getMacBytes();

        String getSerialNumber();

        ByteString getSerialNumberBytes();

        boolean hasBindCheckResult();

        boolean hasBindRandomKey();

        boolean hasDeviceName();

        boolean hasDeviceNumber();

        boolean hasDeviceVerify();

        boolean hasFirmwareVersion();

        boolean hasMac();

        boolean hasSerialNumber();
    }

    public static final class SEBindResult extends GeneratedMessage implements SEBindResultOrBuilder {
        public static final int BIND_RESULT_TYPE_FIELD_NUMBER = 1;
        private static final SEBindResult DEFAULT_INSTANCE;
        private static final Parser<SEBindResult> PARSER;
        public static final int PHONE_TYPE_FIELD_NUMBER = 3;
        public static final int USER_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bindResultType_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int phoneType_;
        private volatile Object userId_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.BindAccountProtos$SEBindResult$1 */
        public class AnonymousClass1 extends AbstractParser<SEBindResult> {
            @Override // com.google.protobuf.Parser
            public SEBindResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEBindResult.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEBindResultOrBuilder {
            private int bindResultType_;
            private int bitField0_;
            private int phoneType_;
            private Object userId_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, b bVar) {
                this(builderParent);
            }

            private void buildPartial0(SEBindResult sEBindResult) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEBindResult.bindResultType_ = this.bindResultType_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEBindResult.userId_ = this.userId_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEBindResult.phoneType_ = this.phoneType_;
                    i7 |= 4;
                }
                sEBindResult.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return BindAccountProtos.internal_static_SEBindResult_descriptor;
            }

            public Builder clearBindResultType() {
                this.bitField0_ &= -2;
                this.bindResultType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPhoneType() {
                this.bitField0_ &= -5;
                this.phoneType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = SEBindResult.getDefaultInstance().getUserId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
            public SEBindResultType getBindResultType() {
                SEBindResultType sEBindResultTypeForNumber = SEBindResultType.forNumber(this.bindResultType_);
                return sEBindResultTypeForNumber == null ? SEBindResultType.SUCCESS : sEBindResultTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return BindAccountProtos.internal_static_SEBindResult_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
            public SEPhoneType getPhoneType() {
                SEPhoneType sEPhoneTypeForNumber = SEPhoneType.forNumber(this.phoneType_);
                return sEPhoneTypeForNumber == null ? SEPhoneType.ANDROID : sEPhoneTypeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
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

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
            public ByteString getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
            public boolean hasBindResultType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
            public boolean hasPhoneType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
            public boolean hasUserId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return BindAccountProtos.internal_static_SEBindResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBindResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setBindResultType(SEBindResultType sEBindResultType) {
                sEBindResultType.getClass();
                this.bitField0_ |= 1;
                this.bindResultType_ = sEBindResultType.getNumber();
                onChanged();
                return this;
            }

            public Builder setPhoneType(SEPhoneType sEPhoneType) {
                sEPhoneType.getClass();
                this.bitField0_ |= 4;
                this.phoneType_ = sEPhoneType.getNumber();
                onChanged();
                return this;
            }

            public Builder setUserId(String str) {
                str.getClass();
                this.userId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                byteString.getClass();
                this.userId_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(b bVar) {
                this();
            }

            private Builder() {
                this.bindResultType_ = 0;
                this.userId_ = "";
                this.phoneType_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBindResult build() {
                SEBindResult sEBindResultBuildPartial = buildPartial();
                if (sEBindResultBuildPartial.isInitialized()) {
                    return sEBindResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEBindResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEBindResult buildPartial() {
                SEBindResult sEBindResult = new SEBindResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEBindResult);
                }
                onBuilt();
                return sEBindResult;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEBindResult getDefaultInstanceForType() {
                return SEBindResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.bindResultType_ = 0;
                this.userId_ = "";
                this.phoneType_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.bindResultType_ = 0;
                this.userId_ = "";
                this.phoneType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEBindResult) {
                    return mergeFrom((SEBindResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEBindResult sEBindResult) {
                if (sEBindResult == SEBindResult.getDefaultInstance()) {
                    return this;
                }
                if (sEBindResult.hasBindResultType()) {
                    setBindResultType(sEBindResult.getBindResultType());
                }
                if (sEBindResult.hasUserId()) {
                    this.userId_ = sEBindResult.userId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEBindResult.hasPhoneType()) {
                    setPhoneType(sEBindResult.getPhoneType());
                }
                mergeUnknownFields(sEBindResult.getUnknownFields());
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
                                    if (SEBindResultType.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.bindResultType_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.userId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i8 = codedInputStream.readEnum();
                                    if (SEPhoneType.forNumber(i8) == null) {
                                        mergeUnknownVarintField(3, i8);
                                    } else {
                                        this.phoneType_ = i8;
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

        public enum SEBindResultType implements ProtocolMessageEnum {
            SUCCESS(0),
            REFUSE(1),
            OVER_TIME(2);

            public static final int OVER_TIME_VALUE = 2;
            public static final int REFUSE_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private static final SEBindResultType[] VALUES;
            private static final Internal.EnumLiteMap<SEBindResultType> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.BindAccountProtos$SEBindResult$SEBindResultType$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEBindResultType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEBindResultType findValueByNumber(int i7) {
                    return SEBindResultType.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBindResultType");
                internalValueMap = new Internal.EnumLiteMap<SEBindResultType>() { // from class: com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResult.SEBindResultType.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEBindResultType findValueByNumber(int i7) {
                        return SEBindResultType.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEBindResultType(int i7) {
                this.value = i7;
            }

            public static SEBindResultType forNumber(int i7) {
                if (i7 == 0) {
                    return SUCCESS;
                }
                if (i7 == 1) {
                    return REFUSE;
                }
                if (i7 != 2) {
                    return null;
                }
                return OVER_TIME;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEBindResult.getDescriptor().getEnumType(1);
            }

            public static Internal.EnumLiteMap<SEBindResultType> internalGetValueMap() {
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
            public static SEBindResultType valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEBindResultType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
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

            /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.BindAccountProtos$SEBindResult$SEPhoneType$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEPhoneType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEPhoneType findValueByNumber(int i7) {
                    return SEPhoneType.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEPhoneType");
                internalValueMap = new Internal.EnumLiteMap<SEPhoneType>() { // from class: com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResult.SEPhoneType.1
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
                return SEBindResult.getDescriptor().getEnumType(0);
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEBindResult");
            DEFAULT_INSTANCE = new SEBindResult();
            PARSER = new AbstractParser<SEBindResult>() { // from class: com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResult.1
                @Override // com.google.protobuf.Parser
                public SEBindResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEBindResult.newBuilder();
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

        public /* synthetic */ SEBindResult(GeneratedMessage.Builder builder, b bVar) {
            this(builder);
        }

        public static SEBindResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return BindAccountProtos.internal_static_SEBindResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEBindResult parseDelimitedFrom(InputStream inputStream) {
            return (SEBindResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEBindResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEBindResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEBindResult)) {
                return super.equals(obj);
            }
            SEBindResult sEBindResult = (SEBindResult) obj;
            if (hasBindResultType() != sEBindResult.hasBindResultType()) {
                return false;
            }
            if ((hasBindResultType() && this.bindResultType_ != sEBindResult.bindResultType_) || hasUserId() != sEBindResult.hasUserId()) {
                return false;
            }
            if ((!hasUserId() || getUserId().equals(sEBindResult.getUserId())) && hasPhoneType() == sEBindResult.hasPhoneType()) {
                return (!hasPhoneType() || this.phoneType_ == sEBindResult.phoneType_) && getUnknownFields().equals(sEBindResult.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
        public SEBindResultType getBindResultType() {
            SEBindResultType sEBindResultTypeForNumber = SEBindResultType.forNumber(this.bindResultType_);
            return sEBindResultTypeForNumber == null ? SEBindResultType.SUCCESS : sEBindResultTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return BindAccountProtos.internal_static_SEBindResult_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEBindResult> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
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
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.bindResultType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.userId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.phoneType_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
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

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
        public boolean hasBindResultType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
        public boolean hasPhoneType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEBindResultOrBuilder
        public boolean hasUserId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasBindResultType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.bindResultType_;
            }
            if (hasUserId()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getUserId().hashCode();
            }
            if (hasPhoneType()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.phoneType_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return BindAccountProtos.internal_static_SEBindResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SEBindResult.class, Builder.class);
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
                codedOutputStream.writeEnum(1, this.bindResultType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.userId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.phoneType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEBindResult(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.bindResultType_ = 0;
            this.userId_ = "";
            this.phoneType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEBindResult sEBindResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEBindResult);
        }

        public static SEBindResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEBindResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBindResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBindResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEBindResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEBindResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEBindResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEBindResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEBindResult() {
            this.bindResultType_ = 0;
            this.userId_ = "";
            this.phoneType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.bindResultType_ = 0;
            this.userId_ = "";
            this.phoneType_ = 0;
        }

        public static SEBindResult parseFrom(InputStream inputStream) {
            return (SEBindResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEBindResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBindResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEBindResult parseFrom(CodedInputStream codedInputStream) {
            return (SEBindResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEBindResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEBindResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEBindResultOrBuilder extends MessageOrBuilder {
        SEBindResult.SEBindResultType getBindResultType();

        SEBindResult.SEPhoneType getPhoneType();

        String getUserId();

        ByteString getUserIdBytes();

        boolean hasBindResultType();

        boolean hasPhoneType();

        boolean hasUserId();
    }

    public static final class SEClassicBluetoothStatus extends GeneratedMessage implements SEClassicBluetoothStatusOrBuilder {
        private static final SEClassicBluetoothStatus DEFAULT_INSTANCE;
        public static final int INQUIRY_CLASSIC_BLUETOOTH_CONNECT_STATUS_FIELD_NUMBER = 1;
        public static final int INQUIRY_CLASSIC_BLUETOOTH_MAC_FIELD_NUMBER = 3;
        public static final int INQUIRY_CLASSIC_BLUETOOTH_SWITCH_FIELD_NUMBER = 2;
        private static final Parser<SEClassicBluetoothStatus> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean inquiryClassicBluetoothConnectStatus_;
        private volatile Object inquiryClassicBluetoothMac_;
        private boolean inquiryClassicBluetoothSwitch_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.BindAccountProtos$SEClassicBluetoothStatus$1 */
        public class AnonymousClass1 extends AbstractParser<SEClassicBluetoothStatus> {
            @Override // com.google.protobuf.Parser
            public SEClassicBluetoothStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEClassicBluetoothStatus.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEClassicBluetoothStatusOrBuilder {
            private int bitField0_;
            private boolean inquiryClassicBluetoothConnectStatus_;
            private Object inquiryClassicBluetoothMac_;
            private boolean inquiryClassicBluetoothSwitch_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, b bVar) {
                this(builderParent);
            }

            private void buildPartial0(SEClassicBluetoothStatus sEClassicBluetoothStatus) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEClassicBluetoothStatus.inquiryClassicBluetoothConnectStatus_ = this.inquiryClassicBluetoothConnectStatus_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEClassicBluetoothStatus.inquiryClassicBluetoothSwitch_ = this.inquiryClassicBluetoothSwitch_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEClassicBluetoothStatus.inquiryClassicBluetoothMac_ = this.inquiryClassicBluetoothMac_;
                    i7 |= 4;
                }
                sEClassicBluetoothStatus.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return BindAccountProtos.internal_static_SEClassicBluetoothStatus_descriptor;
            }

            public Builder clearInquiryClassicBluetoothConnectStatus() {
                this.bitField0_ &= -2;
                this.inquiryClassicBluetoothConnectStatus_ = false;
                onChanged();
                return this;
            }

            public Builder clearInquiryClassicBluetoothMac() {
                this.inquiryClassicBluetoothMac_ = SEClassicBluetoothStatus.getDefaultInstance().getInquiryClassicBluetoothMac();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearInquiryClassicBluetoothSwitch() {
                this.bitField0_ &= -3;
                this.inquiryClassicBluetoothSwitch_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return BindAccountProtos.internal_static_SEClassicBluetoothStatus_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
            public boolean getInquiryClassicBluetoothConnectStatus() {
                return this.inquiryClassicBluetoothConnectStatus_;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
            public String getInquiryClassicBluetoothMac() {
                Object obj = this.inquiryClassicBluetoothMac_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.inquiryClassicBluetoothMac_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
            public ByteString getInquiryClassicBluetoothMacBytes() {
                Object obj = this.inquiryClassicBluetoothMac_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.inquiryClassicBluetoothMac_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
            public boolean getInquiryClassicBluetoothSwitch() {
                return this.inquiryClassicBluetoothSwitch_;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
            public boolean hasInquiryClassicBluetoothConnectStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
            public boolean hasInquiryClassicBluetoothMac() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
            public boolean hasInquiryClassicBluetoothSwitch() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return BindAccountProtos.internal_static_SEClassicBluetoothStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SEClassicBluetoothStatus.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasInquiryClassicBluetoothConnectStatus() && hasInquiryClassicBluetoothSwitch();
            }

            public Builder setInquiryClassicBluetoothConnectStatus(boolean z6) {
                this.inquiryClassicBluetoothConnectStatus_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInquiryClassicBluetoothMac(String str) {
                str.getClass();
                this.inquiryClassicBluetoothMac_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setInquiryClassicBluetoothMacBytes(ByteString byteString) {
                byteString.getClass();
                this.inquiryClassicBluetoothMac_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setInquiryClassicBluetoothSwitch(boolean z6) {
                this.inquiryClassicBluetoothSwitch_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(b bVar) {
                this();
            }

            private Builder() {
                this.inquiryClassicBluetoothMac_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEClassicBluetoothStatus build() {
                SEClassicBluetoothStatus sEClassicBluetoothStatusBuildPartial = buildPartial();
                if (sEClassicBluetoothStatusBuildPartial.isInitialized()) {
                    return sEClassicBluetoothStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEClassicBluetoothStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEClassicBluetoothStatus buildPartial() {
                SEClassicBluetoothStatus sEClassicBluetoothStatus = new SEClassicBluetoothStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEClassicBluetoothStatus);
                }
                onBuilt();
                return sEClassicBluetoothStatus;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEClassicBluetoothStatus getDefaultInstanceForType() {
                return SEClassicBluetoothStatus.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.inquiryClassicBluetoothMac_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.inquiryClassicBluetoothConnectStatus_ = false;
                this.inquiryClassicBluetoothSwitch_ = false;
                this.inquiryClassicBluetoothMac_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEClassicBluetoothStatus) {
                    return mergeFrom((SEClassicBluetoothStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEClassicBluetoothStatus sEClassicBluetoothStatus) {
                if (sEClassicBluetoothStatus == SEClassicBluetoothStatus.getDefaultInstance()) {
                    return this;
                }
                if (sEClassicBluetoothStatus.hasInquiryClassicBluetoothConnectStatus()) {
                    setInquiryClassicBluetoothConnectStatus(sEClassicBluetoothStatus.getInquiryClassicBluetoothConnectStatus());
                }
                if (sEClassicBluetoothStatus.hasInquiryClassicBluetoothSwitch()) {
                    setInquiryClassicBluetoothSwitch(sEClassicBluetoothStatus.getInquiryClassicBluetoothSwitch());
                }
                if (sEClassicBluetoothStatus.hasInquiryClassicBluetoothMac()) {
                    this.inquiryClassicBluetoothMac_ = sEClassicBluetoothStatus.inquiryClassicBluetoothMac_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(sEClassicBluetoothStatus.getUnknownFields());
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
                                    this.inquiryClassicBluetoothConnectStatus_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.inquiryClassicBluetoothSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.inquiryClassicBluetoothMac_ = codedInputStream.readBytes();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEClassicBluetoothStatus");
            DEFAULT_INSTANCE = new SEClassicBluetoothStatus();
            PARSER = new AbstractParser<SEClassicBluetoothStatus>() { // from class: com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatus.1
                @Override // com.google.protobuf.Parser
                public SEClassicBluetoothStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEClassicBluetoothStatus.newBuilder();
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

        public /* synthetic */ SEClassicBluetoothStatus(GeneratedMessage.Builder builder, b bVar) {
            this(builder);
        }

        public static SEClassicBluetoothStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return BindAccountProtos.internal_static_SEClassicBluetoothStatus_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEClassicBluetoothStatus parseDelimitedFrom(InputStream inputStream) {
            return (SEClassicBluetoothStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEClassicBluetoothStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEClassicBluetoothStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEClassicBluetoothStatus)) {
                return super.equals(obj);
            }
            SEClassicBluetoothStatus sEClassicBluetoothStatus = (SEClassicBluetoothStatus) obj;
            if (hasInquiryClassicBluetoothConnectStatus() != sEClassicBluetoothStatus.hasInquiryClassicBluetoothConnectStatus()) {
                return false;
            }
            if ((hasInquiryClassicBluetoothConnectStatus() && getInquiryClassicBluetoothConnectStatus() != sEClassicBluetoothStatus.getInquiryClassicBluetoothConnectStatus()) || hasInquiryClassicBluetoothSwitch() != sEClassicBluetoothStatus.hasInquiryClassicBluetoothSwitch()) {
                return false;
            }
            if ((!hasInquiryClassicBluetoothSwitch() || getInquiryClassicBluetoothSwitch() == sEClassicBluetoothStatus.getInquiryClassicBluetoothSwitch()) && hasInquiryClassicBluetoothMac() == sEClassicBluetoothStatus.hasInquiryClassicBluetoothMac()) {
                return (!hasInquiryClassicBluetoothMac() || getInquiryClassicBluetoothMac().equals(sEClassicBluetoothStatus.getInquiryClassicBluetoothMac())) && getUnknownFields().equals(sEClassicBluetoothStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return BindAccountProtos.internal_static_SEClassicBluetoothStatus_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
        public boolean getInquiryClassicBluetoothConnectStatus() {
            return this.inquiryClassicBluetoothConnectStatus_;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
        public String getInquiryClassicBluetoothMac() {
            Object obj = this.inquiryClassicBluetoothMac_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.inquiryClassicBluetoothMac_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
        public ByteString getInquiryClassicBluetoothMacBytes() {
            Object obj = this.inquiryClassicBluetoothMac_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.inquiryClassicBluetoothMac_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
        public boolean getInquiryClassicBluetoothSwitch() {
            return this.inquiryClassicBluetoothSwitch_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEClassicBluetoothStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.inquiryClassicBluetoothConnectStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.inquiryClassicBluetoothSwitch_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += GeneratedMessage.computeStringSize(3, this.inquiryClassicBluetoothMac_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
        public boolean hasInquiryClassicBluetoothConnectStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
        public boolean hasInquiryClassicBluetoothMac() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEClassicBluetoothStatusOrBuilder
        public boolean hasInquiryClassicBluetoothSwitch() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasInquiryClassicBluetoothConnectStatus()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getInquiryClassicBluetoothConnectStatus());
            }
            if (hasInquiryClassicBluetoothSwitch()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getInquiryClassicBluetoothSwitch());
            }
            if (hasInquiryClassicBluetoothMac()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getInquiryClassicBluetoothMac().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return BindAccountProtos.internal_static_SEClassicBluetoothStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SEClassicBluetoothStatus.class, Builder.class);
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
            if (!hasInquiryClassicBluetoothConnectStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasInquiryClassicBluetoothSwitch()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.inquiryClassicBluetoothConnectStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.inquiryClassicBluetoothSwitch_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.inquiryClassicBluetoothMac_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEClassicBluetoothStatus(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.inquiryClassicBluetoothConnectStatus_ = false;
            this.inquiryClassicBluetoothSwitch_ = false;
            this.inquiryClassicBluetoothMac_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEClassicBluetoothStatus sEClassicBluetoothStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEClassicBluetoothStatus);
        }

        public static SEClassicBluetoothStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEClassicBluetoothStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEClassicBluetoothStatus) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEClassicBluetoothStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEClassicBluetoothStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEClassicBluetoothStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEClassicBluetoothStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEClassicBluetoothStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEClassicBluetoothStatus() {
            this.inquiryClassicBluetoothConnectStatus_ = false;
            this.inquiryClassicBluetoothSwitch_ = false;
            this.inquiryClassicBluetoothMac_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.inquiryClassicBluetoothMac_ = "";
        }

        public static SEClassicBluetoothStatus parseFrom(InputStream inputStream) {
            return (SEClassicBluetoothStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEClassicBluetoothStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEClassicBluetoothStatus) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEClassicBluetoothStatus parseFrom(CodedInputStream codedInputStream) {
            return (SEClassicBluetoothStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEClassicBluetoothStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEClassicBluetoothStatus) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEClassicBluetoothStatusOrBuilder extends MessageOrBuilder {
        boolean getInquiryClassicBluetoothConnectStatus();

        String getInquiryClassicBluetoothMac();

        ByteString getInquiryClassicBluetoothMacBytes();

        boolean getInquiryClassicBluetoothSwitch();

        boolean hasInquiryClassicBluetoothConnectStatus();

        boolean hasInquiryClassicBluetoothMac();

        boolean hasInquiryClassicBluetoothSwitch();
    }

    public static final class SEVerifyResult extends GeneratedMessage implements SEVerifyResultOrBuilder {
        public static final int BINDING_STATUS_FIELD_NUMBER = 2;
        private static final SEVerifyResult DEFAULT_INSTANCE;
        private static final Parser<SEVerifyResult> PARSER;
        public static final int VERIFY_RESULT_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private boolean bindingStatus_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean verifyResultType_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.BindAccountProtos$SEVerifyResult$1 */
        public class AnonymousClass1 extends AbstractParser<SEVerifyResult> {
            @Override // com.google.protobuf.Parser
            public SEVerifyResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEVerifyResult.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEVerifyResultOrBuilder {
            private boolean bindingStatus_;
            private int bitField0_;
            private boolean verifyResultType_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, b bVar) {
                this(builderParent);
            }

            private void buildPartial0(SEVerifyResult sEVerifyResult) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEVerifyResult.verifyResultType_ = this.verifyResultType_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEVerifyResult.bindingStatus_ = this.bindingStatus_;
                    i7 |= 2;
                }
                sEVerifyResult.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return BindAccountProtos.internal_static_SEVerifyResult_descriptor;
            }

            public Builder clearBindingStatus() {
                this.bitField0_ &= -3;
                this.bindingStatus_ = false;
                onChanged();
                return this;
            }

            public Builder clearVerifyResultType() {
                this.bitField0_ &= -2;
                this.verifyResultType_ = false;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEVerifyResultOrBuilder
            public boolean getBindingStatus() {
                return this.bindingStatus_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return BindAccountProtos.internal_static_SEVerifyResult_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEVerifyResultOrBuilder
            public boolean getVerifyResultType() {
                return this.verifyResultType_;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEVerifyResultOrBuilder
            public boolean hasBindingStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEVerifyResultOrBuilder
            public boolean hasVerifyResultType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return BindAccountProtos.internal_static_SEVerifyResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SEVerifyResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasVerifyResultType();
            }

            public Builder setBindingStatus(boolean z6) {
                this.bindingStatus_ = z6;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVerifyResultType(boolean z6) {
                this.verifyResultType_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(b bVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEVerifyResult build() {
                SEVerifyResult sEVerifyResultBuildPartial = buildPartial();
                if (sEVerifyResultBuildPartial.isInitialized()) {
                    return sEVerifyResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEVerifyResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEVerifyResult buildPartial() {
                SEVerifyResult sEVerifyResult = new SEVerifyResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEVerifyResult);
                }
                onBuilt();
                return sEVerifyResult;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEVerifyResult getDefaultInstanceForType() {
                return SEVerifyResult.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.verifyResultType_ = false;
                this.bindingStatus_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEVerifyResult) {
                    return mergeFrom((SEVerifyResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEVerifyResult sEVerifyResult) {
                if (sEVerifyResult == SEVerifyResult.getDefaultInstance()) {
                    return this;
                }
                if (sEVerifyResult.hasVerifyResultType()) {
                    setVerifyResultType(sEVerifyResult.getVerifyResultType());
                }
                if (sEVerifyResult.hasBindingStatus()) {
                    setBindingStatus(sEVerifyResult.getBindingStatus());
                }
                mergeUnknownFields(sEVerifyResult.getUnknownFields());
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
                                    this.verifyResultType_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.bindingStatus_ = codedInputStream.readBool();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEVerifyResult");
            DEFAULT_INSTANCE = new SEVerifyResult();
            PARSER = new AbstractParser<SEVerifyResult>() { // from class: com.zh.ble.wear.protobuf.BindAccountProtos.SEVerifyResult.1
                @Override // com.google.protobuf.Parser
                public SEVerifyResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEVerifyResult.newBuilder();
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

        public /* synthetic */ SEVerifyResult(GeneratedMessage.Builder builder, b bVar) {
            this(builder);
        }

        public static SEVerifyResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return BindAccountProtos.internal_static_SEVerifyResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEVerifyResult parseDelimitedFrom(InputStream inputStream) {
            return (SEVerifyResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEVerifyResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEVerifyResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEVerifyResult)) {
                return super.equals(obj);
            }
            SEVerifyResult sEVerifyResult = (SEVerifyResult) obj;
            if (hasVerifyResultType() != sEVerifyResult.hasVerifyResultType()) {
                return false;
            }
            if ((!hasVerifyResultType() || getVerifyResultType() == sEVerifyResult.getVerifyResultType()) && hasBindingStatus() == sEVerifyResult.hasBindingStatus()) {
                return (!hasBindingStatus() || getBindingStatus() == sEVerifyResult.getBindingStatus()) && getUnknownFields().equals(sEVerifyResult.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEVerifyResultOrBuilder
        public boolean getBindingStatus() {
            return this.bindingStatus_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return BindAccountProtos.internal_static_SEVerifyResult_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEVerifyResult> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.verifyResultType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.bindingStatus_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEVerifyResultOrBuilder
        public boolean getVerifyResultType() {
            return this.verifyResultType_;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEVerifyResultOrBuilder
        public boolean hasBindingStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.BindAccountProtos.SEVerifyResultOrBuilder
        public boolean hasVerifyResultType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasVerifyResultType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getVerifyResultType());
            }
            if (hasBindingStatus()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getBindingStatus());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return BindAccountProtos.internal_static_SEVerifyResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SEVerifyResult.class, Builder.class);
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
            if (hasVerifyResultType()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.verifyResultType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.bindingStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEVerifyResult(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.verifyResultType_ = false;
            this.bindingStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEVerifyResult sEVerifyResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEVerifyResult);
        }

        public static SEVerifyResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEVerifyResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEVerifyResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEVerifyResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEVerifyResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEVerifyResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEVerifyResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEVerifyResult() {
            this.verifyResultType_ = false;
            this.bindingStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEVerifyResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEVerifyResult parseFrom(InputStream inputStream) {
            return (SEVerifyResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEVerifyResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEVerifyResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEVerifyResult parseFrom(CodedInputStream codedInputStream) {
            return (SEVerifyResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEVerifyResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEVerifyResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEVerifyResultOrBuilder extends MessageOrBuilder {
        boolean getBindingStatus();

        boolean getVerifyResultType();

        boolean hasBindingStatus();

        boolean hasVerifyResultType();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "BindAccountProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011BindAccount.proto\u001a\fnanopb.proto\u001a\fCommon.proto\"Ø\u0002\n\rSEBindAccount\u0012 \n\u0016request_binding_status\u0018\u0001 \u0001(\bH\u0000\u0012\"\n\nbind_check\u0018\u0002 \u0001(\u000b2\f.SEBindCheckH\u0000\u0012$\n\u000bbind_result\u0018\u0003 \u0001(\u000b2\r.SEBindResultH\u0000\u0012 \n\u0016inquiry_pairing_status\u0018\u0004 \u0001(\bH\u0000\u0012 \n\u0016request_pairing_result\u0018\u0005 \u0001(\bH\u0000\u0012#\n\u0012verify_user_number\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012(\n\rverify_result\u0018\u0007 \u0001(\u000b2\u000f.SEVerifyResultH\u0000\u0012=\n\u0018classic_bluetooth_status\u0018\b \u0001(\u000b2\u0019.SEClassicBluetoothStatusH\u0000B\t\n\u0007payload\"â\u0002\n\u000bSEBindCheck\u0012\u0015\n\rdevice_verify\u0018\u0001 \u0002(\b\u0012\u001e\n\u000fbind_random_key\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u00129\n\u0011bind_check_result\u0018\u0003 \u0001(\u000e2\u001e.SEBindCheck.SEBindCheckResult\u0012\u001c\n\rdevice_number\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003mac\u0018\u0005 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rserial_number\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010firmware_version\u0018\u0007 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bdevice_name\u0018\b \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\"T\n\u0011SEBindCheckResult\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\n\n\u0006REFUSE\u0010\u0001\u0012\r\n\tOVER_TIME\u0010\u0002\u0012\u0017\n\u0013VERIFICATION_FAILED\u0010\u0003\"ð\u0001\n\fSEBindResult\u00128\n\u0010bind_result_type\u0018\u0001 \u0001(\u000e2\u001e.SEBindResult.SEBindResultType\u0012\u0016\n\u0007user_id\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012-\n\nphone_type\u0018\u0003 \u0001(\u000e2\u0019.SEBindResult.SEPhoneType\"#\n\u000bSEPhoneType\u0012\u000b\n\u0007ANDROID\u0010\u0000\u0012\u0007\n\u0003IOS\u0010\u0001\":\n\u0010SEBindResultType\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\n\n\u0006REFUSE\u0010\u0001\u0012\r\n\tOVER_TIME\u0010\u0002\"D\n\u000eSEVerifyResult\u0012\u001a\n\u0012verify_result_type\u0018\u0001 \u0002(\b\u0012\u0016\n\u000ebinding_status\u0018\u0002 \u0001(\b\"¤\u0001\n\u0018SEClassicBluetoothStatus\u00120\n(inquiry_classic_bluetooth_connect_status\u0018\u0001 \u0002(\b\u0012(\n inquiry_classic_bluetooth_switch\u0018\u0002 \u0002(\b\u0012,\n\u001dinquiry_classic_bluetooth_mac\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004B-\n\u0018com.zh.ble.wear.protobufB\u0011BindAccountProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SEBindAccount_descriptor = messageType;
        internal_static_SEBindAccount_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"RequestBindingStatus", "BindCheck", "BindResult", "InquiryPairingStatus", "RequestPairingResult", "VerifyUserNumber", "VerifyResult", "ClassicBluetoothStatus", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SEBindCheck_descriptor = messageType2;
        internal_static_SEBindCheck_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"DeviceVerify", "BindRandomKey", "BindCheckResult", "DeviceNumber", "Mac", "SerialNumber", "FirmwareVersion", "DeviceName"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SEBindResult_descriptor = messageType3;
        internal_static_SEBindResult_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"BindResultType", "UserId", "PhoneType"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SEVerifyResult_descriptor = messageType4;
        internal_static_SEVerifyResult_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"VerifyResultType", "BindingStatus"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SEClassicBluetoothStatus_descriptor = messageType5;
        internal_static_SEClassicBluetoothStatus_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"InquiryClassicBluetoothConnectStatus", "InquiryClassicBluetoothSwitch", "InquiryClassicBluetoothMac"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private BindAccountProtos() {
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