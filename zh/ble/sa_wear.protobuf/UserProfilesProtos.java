package com.zh.ble.sa_wear.protobuf;

import androidx.datastore.preferences.protobuf.MessageLiteToString;
import androidx.media3.exoplayer.dash.manifest.UrlTemplate;
import com.google.common.net.HttpHeaders;
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
import com.zh.ble.sa_wear.protobuf.CommonProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class UserProfilesProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SEChildrenInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEChildrenInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEGoMoreAlldaySleep_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEGoMoreAlldaySleep_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEGoMoreAutoActiveSport_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEGoMoreAutoActiveSport_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SELanguageDetailed_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SELanguageDetailed_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SELanguageDetailed_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SELanguageDetailed_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEParentsInfo_ParentsDelList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEParentsInfo_ParentsDelList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEParentsInfo_ParentsInfoList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEParentsInfo_ParentsInfoList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEParentsInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEParentsInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEParentsInfo_t_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEParentsInfo_t_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEUserInformation_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEUserInformation_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEUserProfile_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEUserProfile_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEUserSettings_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEUserSettings_fieldAccessorTable;

    public static final class SEChildrenInfo extends GeneratedMessage implements SEChildrenInfoOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 5;
        public static final int ALLERGY_FIELD_NUMBER = 3;
        public static final int BLOOD_GROUP_FIELD_NUMBER = 2;
        private static final SEChildrenInfo DEFAULT_INSTANCE;
        public static final int MEDICATION_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final Parser<SEChildrenInfo> PARSER;
        private static final long serialVersionUID = 0;
        private volatile Object address_;
        private volatile Object allergy_;
        private int bitField0_;
        private volatile Object bloodGroup_;
        private volatile Object medication_;
        private byte memoizedIsInitialized;
        private volatile Object name_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEChildrenInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEChildrenInfo> {
            @Override // com.google.protobuf.Parser
            public SEChildrenInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEChildrenInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEChildrenInfoOrBuilder {
            private Object address_;
            private Object allergy_;
            private int bitField0_;
            private Object bloodGroup_;
            private Object medication_;
            private Object name_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                this(builderParent);
            }

            private void buildPartial0(SEChildrenInfo sEChildrenInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEChildrenInfo.name_ = this.name_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEChildrenInfo.bloodGroup_ = this.bloodGroup_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEChildrenInfo.allergy_ = this.allergy_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEChildrenInfo.medication_ = this.medication_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEChildrenInfo.address_ = this.address_;
                    i7 |= 16;
                }
                sEChildrenInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEChildrenInfo_descriptor;
            }

            public Builder clearAddress() {
                this.address_ = SEChildrenInfo.getDefaultInstance().getAddress();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearAllergy() {
                this.allergy_ = SEChildrenInfo.getDefaultInstance().getAllergy();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearBloodGroup() {
                this.bloodGroup_ = SEChildrenInfo.getDefaultInstance().getBloodGroup();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearMedication() {
                this.medication_ = SEChildrenInfo.getDefaultInstance().getMedication();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = SEChildrenInfo.getDefaultInstance().getName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public String getAddress() {
                Object obj = this.address_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.address_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public ByteString getAddressBytes() {
                Object obj = this.address_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.address_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public String getAllergy() {
                Object obj = this.allergy_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.allergy_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public ByteString getAllergyBytes() {
                Object obj = this.allergy_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.allergy_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public String getBloodGroup() {
                Object obj = this.bloodGroup_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.bloodGroup_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public ByteString getBloodGroupBytes() {
                Object obj = this.bloodGroup_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bloodGroup_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEChildrenInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public String getMedication() {
                Object obj = this.medication_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.medication_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public ByteString getMedicationBytes() {
                Object obj = this.medication_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.medication_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public boolean hasAddress() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public boolean hasAllergy() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public boolean hasBloodGroup() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public boolean hasMedication() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SEChildrenInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChildrenInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasName() && hasBloodGroup() && hasAllergy() && hasMedication() && hasAddress();
            }

            public Builder setAddress(String str) {
                str.getClass();
                this.address_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                byteString.getClass();
                this.address_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAllergy(String str) {
                str.getClass();
                this.allergy_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAllergyBytes(ByteString byteString) {
                byteString.getClass();
                this.allergy_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setBloodGroup(String str) {
                str.getClass();
                this.bloodGroup_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setBloodGroupBytes(ByteString byteString) {
                byteString.getClass();
                this.bloodGroup_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMedication(String str) {
                str.getClass();
                this.medication_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMedicationBytes(ByteString byteString) {
                byteString.getClass();
                this.medication_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(r rVar) {
                this();
            }

            private Builder() {
                this.name_ = "";
                this.bloodGroup_ = "";
                this.allergy_ = "";
                this.medication_ = "";
                this.address_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChildrenInfo build() {
                SEChildrenInfo sEChildrenInfoBuildPartial = buildPartial();
                if (sEChildrenInfoBuildPartial.isInitialized()) {
                    return sEChildrenInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEChildrenInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEChildrenInfo buildPartial() {
                SEChildrenInfo sEChildrenInfo = new SEChildrenInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEChildrenInfo);
                }
                onBuilt();
                return sEChildrenInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEChildrenInfo getDefaultInstanceForType() {
                return SEChildrenInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.name_ = "";
                this.bloodGroup_ = "";
                this.allergy_ = "";
                this.medication_ = "";
                this.address_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEChildrenInfo) {
                    return mergeFrom((SEChildrenInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.bloodGroup_ = "";
                this.allergy_ = "";
                this.medication_ = "";
                this.address_ = "";
            }

            public Builder mergeFrom(SEChildrenInfo sEChildrenInfo) {
                if (sEChildrenInfo == SEChildrenInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEChildrenInfo.hasName()) {
                    this.name_ = sEChildrenInfo.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEChildrenInfo.hasBloodGroup()) {
                    this.bloodGroup_ = sEChildrenInfo.bloodGroup_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEChildrenInfo.hasAllergy()) {
                    this.allergy_ = sEChildrenInfo.allergy_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEChildrenInfo.hasMedication()) {
                    this.medication_ = sEChildrenInfo.medication_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEChildrenInfo.hasAddress()) {
                    this.address_ = sEChildrenInfo.address_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(sEChildrenInfo.getUnknownFields());
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
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.bloodGroup_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.allergy_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.medication_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.address_ = codedInputStream.readBytes();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEChildrenInfo");
            DEFAULT_INSTANCE = new SEChildrenInfo();
            PARSER = new AbstractParser<SEChildrenInfo>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfo.1
                @Override // com.google.protobuf.Parser
                public SEChildrenInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEChildrenInfo.newBuilder();
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

        public /* synthetic */ SEChildrenInfo(GeneratedMessage.Builder builder, r rVar) {
            this(builder);
        }

        public static SEChildrenInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProfilesProtos.internal_static_SA_SEChildrenInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEChildrenInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEChildrenInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEChildrenInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEChildrenInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEChildrenInfo)) {
                return super.equals(obj);
            }
            SEChildrenInfo sEChildrenInfo = (SEChildrenInfo) obj;
            if (hasName() != sEChildrenInfo.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(sEChildrenInfo.getName())) || hasBloodGroup() != sEChildrenInfo.hasBloodGroup()) {
                return false;
            }
            if ((hasBloodGroup() && !getBloodGroup().equals(sEChildrenInfo.getBloodGroup())) || hasAllergy() != sEChildrenInfo.hasAllergy()) {
                return false;
            }
            if ((hasAllergy() && !getAllergy().equals(sEChildrenInfo.getAllergy())) || hasMedication() != sEChildrenInfo.hasMedication()) {
                return false;
            }
            if ((!hasMedication() || getMedication().equals(sEChildrenInfo.getMedication())) && hasAddress() == sEChildrenInfo.hasAddress()) {
                return (!hasAddress() || getAddress().equals(sEChildrenInfo.getAddress())) && getUnknownFields().equals(sEChildrenInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public String getAddress() {
            Object obj = this.address_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.address_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public ByteString getAddressBytes() {
            Object obj = this.address_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.address_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public String getAllergy() {
            Object obj = this.allergy_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.allergy_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public ByteString getAllergyBytes() {
            Object obj = this.allergy_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.allergy_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public String getBloodGroup() {
            Object obj = this.bloodGroup_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bloodGroup_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public ByteString getBloodGroupBytes() {
            Object obj = this.bloodGroup_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bloodGroup_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UserProfilesProtos.internal_static_SA_SEChildrenInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public String getMedication() {
            Object obj = this.medication_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.medication_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public ByteString getMedicationBytes() {
            Object obj = this.medication_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.medication_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEChildrenInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.bloodGroup_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.allergy_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.medication_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.address_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public boolean hasAddress() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public boolean hasAllergy() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public boolean hasBloodGroup() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public boolean hasMedication() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEChildrenInfoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasBloodGroup()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBloodGroup().hashCode();
            }
            if (hasAllergy()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAllergy().hashCode();
            }
            if (hasMedication()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMedication().hashCode();
            }
            if (hasAddress()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getAddress().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProfilesProtos.internal_static_SA_SEChildrenInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEChildrenInfo.class, Builder.class);
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
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasBloodGroup()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAllergy()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMedication()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAddress()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.bloodGroup_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.allergy_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.medication_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.address_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEChildrenInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.bloodGroup_ = "";
            this.allergy_ = "";
            this.medication_ = "";
            this.address_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEChildrenInfo sEChildrenInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEChildrenInfo);
        }

        public static SEChildrenInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEChildrenInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChildrenInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChildrenInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEChildrenInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEChildrenInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEChildrenInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEChildrenInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEChildrenInfo parseFrom(InputStream inputStream) {
            return (SEChildrenInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEChildrenInfo() {
            this.name_ = "";
            this.bloodGroup_ = "";
            this.allergy_ = "";
            this.medication_ = "";
            this.address_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.bloodGroup_ = "";
            this.allergy_ = "";
            this.medication_ = "";
            this.address_ = "";
        }

        public static SEChildrenInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChildrenInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEChildrenInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEChildrenInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEChildrenInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEChildrenInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEChildrenInfoOrBuilder extends MessageOrBuilder {
        String getAddress();

        ByteString getAddressBytes();

        String getAllergy();

        ByteString getAllergyBytes();

        String getBloodGroup();

        ByteString getBloodGroupBytes();

        String getMedication();

        ByteString getMedicationBytes();

        String getName();

        ByteString getNameBytes();

        boolean hasAddress();

        boolean hasAllergy();

        boolean hasBloodGroup();

        boolean hasMedication();

        boolean hasName();
    }

    public static final class SEGoMoreAlldaySleep extends GeneratedMessage implements SEGoMoreAlldaySleepOrBuilder {
        private static final SEGoMoreAlldaySleep DEFAULT_INSTANCE;
        public static final int GOMORE_ALLDAYSLEEP_STARTTIME_FIELD_NUMBER = 2;
        public static final int GOMORE_ALLDAYSLEEP_STOPTIME_FIELD_NUMBER = 3;
        public static final int GOMORE_ALLDAYSLEEP_SWITCH_FIELD_NUMBER = 1;
        private static final Parser<SEGoMoreAlldaySleep> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int gomoreAlldaysleepStarttime_;
        private int gomoreAlldaysleepStoptime_;
        private boolean gomoreAlldaysleepSwitch_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEGoMoreAlldaySleep$1 */
        public class AnonymousClass1 extends AbstractParser<SEGoMoreAlldaySleep> {
            @Override // com.google.protobuf.Parser
            public SEGoMoreAlldaySleep parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEGoMoreAlldaySleep.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEGoMoreAlldaySleepOrBuilder {
            private int bitField0_;
            private int gomoreAlldaysleepStarttime_;
            private int gomoreAlldaysleepStoptime_;
            private boolean gomoreAlldaysleepSwitch_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                this(builderParent);
            }

            private void buildPartial0(SEGoMoreAlldaySleep sEGoMoreAlldaySleep) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEGoMoreAlldaySleep.gomoreAlldaysleepSwitch_ = this.gomoreAlldaysleepSwitch_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEGoMoreAlldaySleep.gomoreAlldaysleepStarttime_ = this.gomoreAlldaysleepStarttime_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEGoMoreAlldaySleep.gomoreAlldaysleepStoptime_ = this.gomoreAlldaysleepStoptime_;
                    i7 |= 4;
                }
                sEGoMoreAlldaySleep.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEGoMoreAlldaySleep_descriptor;
            }

            public Builder clearGomoreAlldaysleepStarttime() {
                this.bitField0_ &= -3;
                this.gomoreAlldaysleepStarttime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGomoreAlldaysleepStoptime() {
                this.bitField0_ &= -5;
                this.gomoreAlldaysleepStoptime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGomoreAlldaysleepSwitch() {
                this.bitField0_ &= -2;
                this.gomoreAlldaysleepSwitch_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEGoMoreAlldaySleep_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
            public int getGomoreAlldaysleepStarttime() {
                return this.gomoreAlldaysleepStarttime_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
            public int getGomoreAlldaysleepStoptime() {
                return this.gomoreAlldaysleepStoptime_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
            public boolean getGomoreAlldaysleepSwitch() {
                return this.gomoreAlldaysleepSwitch_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
            public boolean hasGomoreAlldaysleepStarttime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
            public boolean hasGomoreAlldaysleepStoptime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
            public boolean hasGomoreAlldaysleepSwitch() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SEGoMoreAlldaySleep_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGoMoreAlldaySleep.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setGomoreAlldaysleepStarttime(int i7) {
                this.gomoreAlldaysleepStarttime_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setGomoreAlldaysleepStoptime(int i7) {
                this.gomoreAlldaysleepStoptime_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGomoreAlldaysleepSwitch(boolean z6) {
                this.gomoreAlldaysleepSwitch_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(r rVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGoMoreAlldaySleep build() {
                SEGoMoreAlldaySleep sEGoMoreAlldaySleepBuildPartial = buildPartial();
                if (sEGoMoreAlldaySleepBuildPartial.isInitialized()) {
                    return sEGoMoreAlldaySleepBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEGoMoreAlldaySleepBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGoMoreAlldaySleep buildPartial() {
                SEGoMoreAlldaySleep sEGoMoreAlldaySleep = new SEGoMoreAlldaySleep(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEGoMoreAlldaySleep);
                }
                onBuilt();
                return sEGoMoreAlldaySleep;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEGoMoreAlldaySleep getDefaultInstanceForType() {
                return SEGoMoreAlldaySleep.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.gomoreAlldaysleepSwitch_ = false;
                this.gomoreAlldaysleepStarttime_ = 0;
                this.gomoreAlldaysleepStoptime_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEGoMoreAlldaySleep) {
                    return mergeFrom((SEGoMoreAlldaySleep) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEGoMoreAlldaySleep sEGoMoreAlldaySleep) {
                if (sEGoMoreAlldaySleep == SEGoMoreAlldaySleep.getDefaultInstance()) {
                    return this;
                }
                if (sEGoMoreAlldaySleep.hasGomoreAlldaysleepSwitch()) {
                    setGomoreAlldaysleepSwitch(sEGoMoreAlldaySleep.getGomoreAlldaysleepSwitch());
                }
                if (sEGoMoreAlldaySleep.hasGomoreAlldaysleepStarttime()) {
                    setGomoreAlldaysleepStarttime(sEGoMoreAlldaySleep.getGomoreAlldaysleepStarttime());
                }
                if (sEGoMoreAlldaySleep.hasGomoreAlldaysleepStoptime()) {
                    setGomoreAlldaysleepStoptime(sEGoMoreAlldaySleep.getGomoreAlldaysleepStoptime());
                }
                mergeUnknownFields(sEGoMoreAlldaySleep.getUnknownFields());
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
                                    this.gomoreAlldaysleepSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.gomoreAlldaysleepStarttime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.gomoreAlldaysleepStoptime_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEGoMoreAlldaySleep");
            DEFAULT_INSTANCE = new SEGoMoreAlldaySleep();
            PARSER = new AbstractParser<SEGoMoreAlldaySleep>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleep.1
                @Override // com.google.protobuf.Parser
                public SEGoMoreAlldaySleep parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEGoMoreAlldaySleep.newBuilder();
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

        public /* synthetic */ SEGoMoreAlldaySleep(GeneratedMessage.Builder builder, r rVar) {
            this(builder);
        }

        public static SEGoMoreAlldaySleep getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProfilesProtos.internal_static_SA_SEGoMoreAlldaySleep_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEGoMoreAlldaySleep parseDelimitedFrom(InputStream inputStream) {
            return (SEGoMoreAlldaySleep) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEGoMoreAlldaySleep parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEGoMoreAlldaySleep> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEGoMoreAlldaySleep)) {
                return super.equals(obj);
            }
            SEGoMoreAlldaySleep sEGoMoreAlldaySleep = (SEGoMoreAlldaySleep) obj;
            if (hasGomoreAlldaysleepSwitch() != sEGoMoreAlldaySleep.hasGomoreAlldaysleepSwitch()) {
                return false;
            }
            if ((hasGomoreAlldaysleepSwitch() && getGomoreAlldaysleepSwitch() != sEGoMoreAlldaySleep.getGomoreAlldaysleepSwitch()) || hasGomoreAlldaysleepStarttime() != sEGoMoreAlldaySleep.hasGomoreAlldaysleepStarttime()) {
                return false;
            }
            if ((!hasGomoreAlldaysleepStarttime() || getGomoreAlldaysleepStarttime() == sEGoMoreAlldaySleep.getGomoreAlldaysleepStarttime()) && hasGomoreAlldaysleepStoptime() == sEGoMoreAlldaySleep.hasGomoreAlldaysleepStoptime()) {
                return (!hasGomoreAlldaysleepStoptime() || getGomoreAlldaysleepStoptime() == sEGoMoreAlldaySleep.getGomoreAlldaysleepStoptime()) && getUnknownFields().equals(sEGoMoreAlldaySleep.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UserProfilesProtos.internal_static_SA_SEGoMoreAlldaySleep_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
        public int getGomoreAlldaysleepStarttime() {
            return this.gomoreAlldaysleepStarttime_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
        public int getGomoreAlldaysleepStoptime() {
            return this.gomoreAlldaysleepStoptime_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
        public boolean getGomoreAlldaysleepSwitch() {
            return this.gomoreAlldaysleepSwitch_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEGoMoreAlldaySleep> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.gomoreAlldaysleepSwitch_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(2, this.gomoreAlldaysleepStarttime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(3, this.gomoreAlldaysleepStoptime_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
        public boolean hasGomoreAlldaysleepStarttime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
        public boolean hasGomoreAlldaysleepStoptime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAlldaySleepOrBuilder
        public boolean hasGomoreAlldaysleepSwitch() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasGomoreAlldaysleepSwitch()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getGomoreAlldaysleepSwitch());
            }
            if (hasGomoreAlldaysleepStarttime()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getGomoreAlldaysleepStarttime();
            }
            if (hasGomoreAlldaysleepStoptime()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getGomoreAlldaysleepStoptime();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProfilesProtos.internal_static_SA_SEGoMoreAlldaySleep_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGoMoreAlldaySleep.class, Builder.class);
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
                codedOutputStream.writeBool(1, this.gomoreAlldaysleepSwitch_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.gomoreAlldaysleepStarttime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.gomoreAlldaysleepStoptime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEGoMoreAlldaySleep(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.gomoreAlldaysleepSwitch_ = false;
            this.gomoreAlldaysleepStarttime_ = 0;
            this.gomoreAlldaysleepStoptime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEGoMoreAlldaySleep sEGoMoreAlldaySleep) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEGoMoreAlldaySleep);
        }

        public static SEGoMoreAlldaySleep parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEGoMoreAlldaySleep parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGoMoreAlldaySleep) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGoMoreAlldaySleep parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEGoMoreAlldaySleep getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEGoMoreAlldaySleep parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEGoMoreAlldaySleep parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEGoMoreAlldaySleep parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEGoMoreAlldaySleep() {
            this.gomoreAlldaysleepSwitch_ = false;
            this.gomoreAlldaysleepStarttime_ = 0;
            this.gomoreAlldaysleepStoptime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEGoMoreAlldaySleep parseFrom(InputStream inputStream) {
            return (SEGoMoreAlldaySleep) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEGoMoreAlldaySleep parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGoMoreAlldaySleep) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGoMoreAlldaySleep parseFrom(CodedInputStream codedInputStream) {
            return (SEGoMoreAlldaySleep) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEGoMoreAlldaySleep parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGoMoreAlldaySleep) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEGoMoreAlldaySleepOrBuilder extends MessageOrBuilder {
        int getGomoreAlldaysleepStarttime();

        int getGomoreAlldaysleepStoptime();

        boolean getGomoreAlldaysleepSwitch();

        boolean hasGomoreAlldaysleepStarttime();

        boolean hasGomoreAlldaysleepStoptime();

        boolean hasGomoreAlldaysleepSwitch();
    }

    public static final class SEGoMoreAutoActiveSport extends GeneratedMessage implements SEGoMoreAutoActiveSportOrBuilder {
        private static final SEGoMoreAutoActiveSport DEFAULT_INSTANCE;
        public static final int GOMORE_AUTO_ACTIVE_SPORT_ACTIVETIME_FIELD_NUMBER = 4;
        public static final int GOMORE_AUTO_ACTIVE_SPORT_STARTTIME_FIELD_NUMBER = 2;
        public static final int GOMORE_AUTO_ACTIVE_SPORT_STOPTIME_FIELD_NUMBER = 3;
        public static final int GOMORE_AUTO_ACTIVE_SPORT_SWITCH_FIELD_NUMBER = 1;
        private static final Parser<SEGoMoreAutoActiveSport> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int gomoreAutoActiveSportActivetime_;
        private int gomoreAutoActiveSportStarttime_;
        private int gomoreAutoActiveSportStoptime_;
        private boolean gomoreAutoActiveSportSwitch_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEGoMoreAutoActiveSport$1 */
        public class AnonymousClass1 extends AbstractParser<SEGoMoreAutoActiveSport> {
            @Override // com.google.protobuf.Parser
            public SEGoMoreAutoActiveSport parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEGoMoreAutoActiveSport.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEGoMoreAutoActiveSportOrBuilder {
            private int bitField0_;
            private int gomoreAutoActiveSportActivetime_;
            private int gomoreAutoActiveSportStarttime_;
            private int gomoreAutoActiveSportStoptime_;
            private boolean gomoreAutoActiveSportSwitch_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                this(builderParent);
            }

            private void buildPartial0(SEGoMoreAutoActiveSport sEGoMoreAutoActiveSport) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEGoMoreAutoActiveSport.gomoreAutoActiveSportSwitch_ = this.gomoreAutoActiveSportSwitch_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEGoMoreAutoActiveSport.gomoreAutoActiveSportStarttime_ = this.gomoreAutoActiveSportStarttime_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEGoMoreAutoActiveSport.gomoreAutoActiveSportStoptime_ = this.gomoreAutoActiveSportStoptime_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEGoMoreAutoActiveSport.gomoreAutoActiveSportActivetime_ = this.gomoreAutoActiveSportActivetime_;
                    i7 |= 8;
                }
                sEGoMoreAutoActiveSport.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEGoMoreAutoActiveSport_descriptor;
            }

            public Builder clearGomoreAutoActiveSportActivetime() {
                this.bitField0_ &= -9;
                this.gomoreAutoActiveSportActivetime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGomoreAutoActiveSportStarttime() {
                this.bitField0_ &= -3;
                this.gomoreAutoActiveSportStarttime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGomoreAutoActiveSportStoptime() {
                this.bitField0_ &= -5;
                this.gomoreAutoActiveSportStoptime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGomoreAutoActiveSportSwitch() {
                this.bitField0_ &= -2;
                this.gomoreAutoActiveSportSwitch_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEGoMoreAutoActiveSport_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
            public int getGomoreAutoActiveSportActivetime() {
                return this.gomoreAutoActiveSportActivetime_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
            public int getGomoreAutoActiveSportStarttime() {
                return this.gomoreAutoActiveSportStarttime_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
            public int getGomoreAutoActiveSportStoptime() {
                return this.gomoreAutoActiveSportStoptime_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
            public boolean getGomoreAutoActiveSportSwitch() {
                return this.gomoreAutoActiveSportSwitch_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
            public boolean hasGomoreAutoActiveSportActivetime() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
            public boolean hasGomoreAutoActiveSportStarttime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
            public boolean hasGomoreAutoActiveSportStoptime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
            public boolean hasGomoreAutoActiveSportSwitch() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SEGoMoreAutoActiveSport_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGoMoreAutoActiveSport.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setGomoreAutoActiveSportActivetime(int i7) {
                this.gomoreAutoActiveSportActivetime_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setGomoreAutoActiveSportStarttime(int i7) {
                this.gomoreAutoActiveSportStarttime_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setGomoreAutoActiveSportStoptime(int i7) {
                this.gomoreAutoActiveSportStoptime_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGomoreAutoActiveSportSwitch(boolean z6) {
                this.gomoreAutoActiveSportSwitch_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(r rVar) {
                this();
            }

            private Builder() {
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGoMoreAutoActiveSport build() {
                SEGoMoreAutoActiveSport sEGoMoreAutoActiveSportBuildPartial = buildPartial();
                if (sEGoMoreAutoActiveSportBuildPartial.isInitialized()) {
                    return sEGoMoreAutoActiveSportBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEGoMoreAutoActiveSportBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGoMoreAutoActiveSport buildPartial() {
                SEGoMoreAutoActiveSport sEGoMoreAutoActiveSport = new SEGoMoreAutoActiveSport(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEGoMoreAutoActiveSport);
                }
                onBuilt();
                return sEGoMoreAutoActiveSport;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEGoMoreAutoActiveSport getDefaultInstanceForType() {
                return SEGoMoreAutoActiveSport.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.gomoreAutoActiveSportSwitch_ = false;
                this.gomoreAutoActiveSportStarttime_ = 0;
                this.gomoreAutoActiveSportStoptime_ = 0;
                this.gomoreAutoActiveSportActivetime_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEGoMoreAutoActiveSport) {
                    return mergeFrom((SEGoMoreAutoActiveSport) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEGoMoreAutoActiveSport sEGoMoreAutoActiveSport) {
                if (sEGoMoreAutoActiveSport == SEGoMoreAutoActiveSport.getDefaultInstance()) {
                    return this;
                }
                if (sEGoMoreAutoActiveSport.hasGomoreAutoActiveSportSwitch()) {
                    setGomoreAutoActiveSportSwitch(sEGoMoreAutoActiveSport.getGomoreAutoActiveSportSwitch());
                }
                if (sEGoMoreAutoActiveSport.hasGomoreAutoActiveSportStarttime()) {
                    setGomoreAutoActiveSportStarttime(sEGoMoreAutoActiveSport.getGomoreAutoActiveSportStarttime());
                }
                if (sEGoMoreAutoActiveSport.hasGomoreAutoActiveSportStoptime()) {
                    setGomoreAutoActiveSportStoptime(sEGoMoreAutoActiveSport.getGomoreAutoActiveSportStoptime());
                }
                if (sEGoMoreAutoActiveSport.hasGomoreAutoActiveSportActivetime()) {
                    setGomoreAutoActiveSportActivetime(sEGoMoreAutoActiveSport.getGomoreAutoActiveSportActivetime());
                }
                mergeUnknownFields(sEGoMoreAutoActiveSport.getUnknownFields());
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
                                    this.gomoreAutoActiveSportSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.gomoreAutoActiveSportStarttime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.gomoreAutoActiveSportStoptime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.gomoreAutoActiveSportActivetime_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEGoMoreAutoActiveSport");
            DEFAULT_INSTANCE = new SEGoMoreAutoActiveSport();
            PARSER = new AbstractParser<SEGoMoreAutoActiveSport>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSport.1
                @Override // com.google.protobuf.Parser
                public SEGoMoreAutoActiveSport parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEGoMoreAutoActiveSport.newBuilder();
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

        public /* synthetic */ SEGoMoreAutoActiveSport(GeneratedMessage.Builder builder, r rVar) {
            this(builder);
        }

        public static SEGoMoreAutoActiveSport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProfilesProtos.internal_static_SA_SEGoMoreAutoActiveSport_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEGoMoreAutoActiveSport parseDelimitedFrom(InputStream inputStream) {
            return (SEGoMoreAutoActiveSport) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEGoMoreAutoActiveSport parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEGoMoreAutoActiveSport> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEGoMoreAutoActiveSport)) {
                return super.equals(obj);
            }
            SEGoMoreAutoActiveSport sEGoMoreAutoActiveSport = (SEGoMoreAutoActiveSport) obj;
            if (hasGomoreAutoActiveSportSwitch() != sEGoMoreAutoActiveSport.hasGomoreAutoActiveSportSwitch()) {
                return false;
            }
            if ((hasGomoreAutoActiveSportSwitch() && getGomoreAutoActiveSportSwitch() != sEGoMoreAutoActiveSport.getGomoreAutoActiveSportSwitch()) || hasGomoreAutoActiveSportStarttime() != sEGoMoreAutoActiveSport.hasGomoreAutoActiveSportStarttime()) {
                return false;
            }
            if ((hasGomoreAutoActiveSportStarttime() && getGomoreAutoActiveSportStarttime() != sEGoMoreAutoActiveSport.getGomoreAutoActiveSportStarttime()) || hasGomoreAutoActiveSportStoptime() != sEGoMoreAutoActiveSport.hasGomoreAutoActiveSportStoptime()) {
                return false;
            }
            if ((!hasGomoreAutoActiveSportStoptime() || getGomoreAutoActiveSportStoptime() == sEGoMoreAutoActiveSport.getGomoreAutoActiveSportStoptime()) && hasGomoreAutoActiveSportActivetime() == sEGoMoreAutoActiveSport.hasGomoreAutoActiveSportActivetime()) {
                return (!hasGomoreAutoActiveSportActivetime() || getGomoreAutoActiveSportActivetime() == sEGoMoreAutoActiveSport.getGomoreAutoActiveSportActivetime()) && getUnknownFields().equals(sEGoMoreAutoActiveSport.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UserProfilesProtos.internal_static_SA_SEGoMoreAutoActiveSport_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
        public int getGomoreAutoActiveSportActivetime() {
            return this.gomoreAutoActiveSportActivetime_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
        public int getGomoreAutoActiveSportStarttime() {
            return this.gomoreAutoActiveSportStarttime_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
        public int getGomoreAutoActiveSportStoptime() {
            return this.gomoreAutoActiveSportStoptime_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
        public boolean getGomoreAutoActiveSportSwitch() {
            return this.gomoreAutoActiveSportSwitch_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEGoMoreAutoActiveSport> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.gomoreAutoActiveSportSwitch_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(2, this.gomoreAutoActiveSportStarttime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(3, this.gomoreAutoActiveSportStoptime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(4, this.gomoreAutoActiveSportActivetime_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
        public boolean hasGomoreAutoActiveSportActivetime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
        public boolean hasGomoreAutoActiveSportStarttime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
        public boolean hasGomoreAutoActiveSportStoptime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEGoMoreAutoActiveSportOrBuilder
        public boolean hasGomoreAutoActiveSportSwitch() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasGomoreAutoActiveSportSwitch()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getGomoreAutoActiveSportSwitch());
            }
            if (hasGomoreAutoActiveSportStarttime()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getGomoreAutoActiveSportStarttime();
            }
            if (hasGomoreAutoActiveSportStoptime()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getGomoreAutoActiveSportStoptime();
            }
            if (hasGomoreAutoActiveSportActivetime()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getGomoreAutoActiveSportActivetime();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProfilesProtos.internal_static_SA_SEGoMoreAutoActiveSport_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGoMoreAutoActiveSport.class, Builder.class);
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
                codedOutputStream.writeBool(1, this.gomoreAutoActiveSportSwitch_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.gomoreAutoActiveSportStarttime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.gomoreAutoActiveSportStoptime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.gomoreAutoActiveSportActivetime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEGoMoreAutoActiveSport(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.gomoreAutoActiveSportSwitch_ = false;
            this.gomoreAutoActiveSportStarttime_ = 0;
            this.gomoreAutoActiveSportStoptime_ = 0;
            this.gomoreAutoActiveSportActivetime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEGoMoreAutoActiveSport sEGoMoreAutoActiveSport) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEGoMoreAutoActiveSport);
        }

        public static SEGoMoreAutoActiveSport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEGoMoreAutoActiveSport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGoMoreAutoActiveSport) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGoMoreAutoActiveSport parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEGoMoreAutoActiveSport getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEGoMoreAutoActiveSport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEGoMoreAutoActiveSport parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEGoMoreAutoActiveSport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEGoMoreAutoActiveSport parseFrom(InputStream inputStream) {
            return (SEGoMoreAutoActiveSport) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEGoMoreAutoActiveSport() {
            this.gomoreAutoActiveSportSwitch_ = false;
            this.gomoreAutoActiveSportStarttime_ = 0;
            this.gomoreAutoActiveSportStoptime_ = 0;
            this.gomoreAutoActiveSportActivetime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEGoMoreAutoActiveSport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGoMoreAutoActiveSport) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGoMoreAutoActiveSport parseFrom(CodedInputStream codedInputStream) {
            return (SEGoMoreAutoActiveSport) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEGoMoreAutoActiveSport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGoMoreAutoActiveSport) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEGoMoreAutoActiveSportOrBuilder extends MessageOrBuilder {
        int getGomoreAutoActiveSportActivetime();

        int getGomoreAutoActiveSportStarttime();

        int getGomoreAutoActiveSportStoptime();

        boolean getGomoreAutoActiveSportSwitch();

        boolean hasGomoreAutoActiveSportActivetime();

        boolean hasGomoreAutoActiveSportStarttime();

        boolean hasGomoreAutoActiveSportStoptime();

        boolean hasGomoreAutoActiveSportSwitch();
    }

    public static final class SELanguageDetailed extends GeneratedMessage implements SELanguageDetailedOrBuilder {
        private static final SELanguageDetailed DEFAULT_INSTANCE;
        public static final int DEFAULT_LANGUAGE_ID_FIELD_NUMBER = 2;
        public static final int LANGUAGE_LIST_FIELD_NUMBER = 1;
        private static final Parser<SELanguageDetailed> PARSER;
        public static final int SELECT_LANGUAGE_ID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int defaultLanguageId_;
        private SEList languageList_;
        private byte memoizedIsInitialized;
        private int selectLanguageId_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SELanguageDetailed$1 */
        public class AnonymousClass1 extends AbstractParser<SELanguageDetailed> {
            @Override // com.google.protobuf.Parser
            public SELanguageDetailed parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SELanguageDetailed.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SELanguageDetailedOrBuilder {
            private int bitField0_;
            private int defaultLanguageId_;
            private SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> languageListBuilder_;
            private SEList languageList_;
            private int selectLanguageId_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                this(builderParent);
            }

            private void buildPartial0(SELanguageDetailed sELanguageDetailed) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.languageListBuilder_;
                    sELanguageDetailed.languageList_ = singleFieldBuilder == null ? this.languageList_ : (SEList) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sELanguageDetailed.defaultLanguageId_ = this.defaultLanguageId_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sELanguageDetailed.selectLanguageId_ = this.selectLanguageId_;
                    i7 |= 4;
                }
                sELanguageDetailed.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SELanguageDetailed_descriptor;
            }

            private SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> internalGetLanguageListFieldBuilder() {
                if (this.languageListBuilder_ == null) {
                    this.languageListBuilder_ = new SingleFieldBuilder<>(getLanguageList(), getParentForChildren(), isClean());
                    this.languageList_ = null;
                }
                return this.languageListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetLanguageListFieldBuilder();
                }
            }

            public Builder clearDefaultLanguageId() {
                this.bitField0_ &= -3;
                this.defaultLanguageId_ = 1;
                onChanged();
                return this;
            }

            public Builder clearLanguageList() {
                this.bitField0_ &= -2;
                this.languageList_ = null;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.languageListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.languageListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSelectLanguageId() {
                this.bitField0_ &= -5;
                this.selectLanguageId_ = 1;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
            public SELanguageId getDefaultLanguageId() {
                SELanguageId sELanguageIdForNumber = SELanguageId.forNumber(this.defaultLanguageId_);
                return sELanguageIdForNumber == null ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SELanguageDetailed_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
            public SEList getLanguageList() {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.languageListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEList) singleFieldBuilder.getMessage();
                }
                SEList sEList = this.languageList_;
                return sEList == null ? SEList.getDefaultInstance() : sEList;
            }

            public SEList.Builder getLanguageListBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SEList.Builder) internalGetLanguageListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
            public SEListOrBuilder getLanguageListOrBuilder() {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.languageListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEList sEList = this.languageList_;
                return sEList == null ? SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
            public SELanguageId getSelectLanguageId() {
                SELanguageId sELanguageIdForNumber = SELanguageId.forNumber(this.selectLanguageId_);
                return sELanguageIdForNumber == null ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
            public boolean hasDefaultLanguageId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
            public boolean hasLanguageList() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
            public boolean hasSelectLanguageId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SELanguageDetailed_fieldAccessorTable.ensureFieldAccessorsInitialized(SELanguageDetailed.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLanguageList() && hasDefaultLanguageId() && hasSelectLanguageId();
            }

            public Builder mergeLanguageList(SEList sEList) {
                SEList sEList2;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.languageListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 1) == 0 || (sEList2 = this.languageList_) == null || sEList2 == SEList.getDefaultInstance()) {
                    this.languageList_ = sEList;
                } else {
                    getLanguageListBuilder().mergeFrom(sEList);
                }
                if (this.languageList_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setDefaultLanguageId(SELanguageId sELanguageId) {
                sELanguageId.getClass();
                this.bitField0_ |= 2;
                this.defaultLanguageId_ = sELanguageId.getNumber();
                onChanged();
                return this;
            }

            public Builder setLanguageList(SEList sEList) {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.languageListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.languageList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSelectLanguageId(SELanguageId sELanguageId) {
                sELanguageId.getClass();
                this.bitField0_ |= 4;
                this.selectLanguageId_ = sELanguageId.getNumber();
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(r rVar) {
                this();
            }

            private Builder() {
                this.defaultLanguageId_ = 1;
                this.selectLanguageId_ = 1;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SELanguageDetailed build() {
                SELanguageDetailed sELanguageDetailedBuildPartial = buildPartial();
                if (sELanguageDetailedBuildPartial.isInitialized()) {
                    return sELanguageDetailedBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sELanguageDetailedBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SELanguageDetailed buildPartial() {
                SELanguageDetailed sELanguageDetailed = new SELanguageDetailed(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sELanguageDetailed);
                }
                onBuilt();
                return sELanguageDetailed;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SELanguageDetailed getDefaultInstanceForType() {
                return SELanguageDetailed.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.languageList_ = null;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.languageListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.languageListBuilder_ = null;
                }
                this.defaultLanguageId_ = 1;
                this.selectLanguageId_ = 1;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.defaultLanguageId_ = 1;
                this.selectLanguageId_ = 1;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SELanguageDetailed) {
                    return mergeFrom((SELanguageDetailed) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setLanguageList(SEList.Builder builder) {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.languageListBuilder_;
                if (singleFieldBuilder == null) {
                    this.languageList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SELanguageDetailed sELanguageDetailed) {
                if (sELanguageDetailed == SELanguageDetailed.getDefaultInstance()) {
                    return this;
                }
                if (sELanguageDetailed.hasLanguageList()) {
                    mergeLanguageList(sELanguageDetailed.getLanguageList());
                }
                if (sELanguageDetailed.hasDefaultLanguageId()) {
                    setDefaultLanguageId(sELanguageDetailed.getDefaultLanguageId());
                }
                if (sELanguageDetailed.hasSelectLanguageId()) {
                    setSelectLanguageId(sELanguageDetailed.getSelectLanguageId());
                }
                mergeUnknownFields(sELanguageDetailed.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetLanguageListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i7 = codedInputStream.readEnum();
                                    if (SELanguageId.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.defaultLanguageId_ = i7;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i8 = codedInputStream.readEnum();
                                    if (SELanguageId.forNumber(i8) == null) {
                                        mergeUnknownVarintField(3, i8);
                                    } else {
                                        this.selectLanguageId_ = i8;
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final Internal.IntListAdapter.IntConverter<SELanguageId> list_converter_;
            private static final long serialVersionUID = 0;
            private Internal.IntList list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SELanguageDetailed$SEList$1 */
            public class AnonymousClass1 implements Internal.IntListAdapter.IntConverter<SELanguageId> {
                @Override // com.google.protobuf.Internal.IntListAdapter.IntConverter
                public SELanguageId convert(int i7) {
                    SELanguageId sELanguageIdForNumber = SELanguageId.forNumber(i7);
                    return sELanguageIdForNumber == null ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
                }
            }

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SELanguageDetailed$SEList$2 */
            public class AnonymousClass2 extends AbstractParser<SEList> {
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
                private Internal.IntList list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
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
                        this.list_ = (Internal.IntList) GeneratedMessage.makeMutableCopy(this.list_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return UserProfilesProtos.internal_static_SA_SELanguageDetailed_SEList_descriptor;
                }

                public Builder addAllList(Iterable<? extends SELanguageId> iterable) {
                    ensureListIsMutable();
                    Iterator<? extends SELanguageId> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.list_.addInt(it.next().getNumber());
                    }
                    onChanged();
                    return this;
                }

                public Builder addList(SELanguageId sELanguageId) {
                    sELanguageId.getClass();
                    ensureListIsMutable();
                    this.list_.addInt(sELanguageId.getNumber());
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    this.list_ = GeneratedMessage.emptyIntList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return UserProfilesProtos.internal_static_SA_SELanguageDetailed_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailed.SEListOrBuilder
                public SELanguageId getList(int i7) {
                    return (SELanguageId) SEList.list_converter_.convert(this.list_.getInt(i7));
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailed.SEListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailed.SEListOrBuilder
                public List<SELanguageId> getListList() {
                    return new Internal.IntListAdapter(this.list_, SEList.list_converter_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return UserProfilesProtos.internal_static_SA_SELanguageDetailed_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, SELanguageId sELanguageId) {
                    sELanguageId.getClass();
                    ensureListIsMutable();
                    this.list_.setInt(i7, sELanguageId.getNumber());
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(r rVar) {
                    this();
                }

                private Builder() {
                    this.list_ = GeneratedMessage.emptyIntList();
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
                    this.list_ = GeneratedMessage.emptyIntList();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.list_ = GeneratedMessage.emptyIntList();
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
                            Internal.IntList intList = sEList.list_;
                            this.list_ = intList;
                            intList.makeImmutable();
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
                                    if (tag == 8) {
                                        int i7 = codedInputStream.readEnum();
                                        if (SELanguageId.forNumber(i7) == null) {
                                            mergeUnknownVarintField(1, i7);
                                        } else {
                                            ensureListIsMutable();
                                            this.list_.addInt(i7);
                                        }
                                    } else if (tag != 10) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        ensureListIsMutable();
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            int i8 = codedInputStream.readEnum();
                                            if (SELanguageId.forNumber(i8) == null) {
                                                mergeUnknownVarintField(1, i8);
                                            } else {
                                                this.list_.addInt(i8);
                                            }
                                        }
                                        codedInputStream.popLimit(iPushLimit);
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
                list_converter_ = new Internal.IntListAdapter.IntConverter<SELanguageId>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailed.SEList.1
                    @Override // com.google.protobuf.Internal.IntListAdapter.IntConverter
                    public SELanguageId convert(int i7) {
                        SELanguageId sELanguageIdForNumber = SELanguageId.forNumber(i7);
                        return sELanguageIdForNumber == null ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
                    }
                };
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailed.SEList.2
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, r rVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SELanguageDetailed_SEList_descriptor;
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
                return this.list_.equals(sEList.list_) && getUnknownFields().equals(sEList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SELanguageDetailed_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailed.SEListOrBuilder
            public SELanguageId getList(int i7) {
                return list_converter_.convert(this.list_.getInt(i7));
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailed.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailed.SEListOrBuilder
            public List<SELanguageId> getListList() {
                return new Internal.IntListAdapter(this.list_, list_converter_);
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
                int iComputeEnumSizeNoTag = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.list_.getInt(i8));
                }
                int size = iComputeEnumSizeNoTag + this.list_.size() + getUnknownFields().getSerializedSize();
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
                    iHashCode = (((iHashCode * 37) + 1) * 53) + this.list_.hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SELanguageDetailed_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    codedOutputStream.writeEnum(1, this.list_.getInt(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.list_ = GeneratedMessage.emptyIntList();
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
                this.list_ = GeneratedMessage.emptyIntList();
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = GeneratedMessage.emptyIntList();
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
            SELanguageId getList(int i7);

            int getListCount();

            List<SELanguageId> getListList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SELanguageDetailed");
            DEFAULT_INSTANCE = new SELanguageDetailed();
            PARSER = new AbstractParser<SELanguageDetailed>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailed.1
                @Override // com.google.protobuf.Parser
                public SELanguageDetailed parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SELanguageDetailed.newBuilder();
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

        public /* synthetic */ SELanguageDetailed(GeneratedMessage.Builder builder, r rVar) {
            this(builder);
        }

        public static SELanguageDetailed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProfilesProtos.internal_static_SA_SELanguageDetailed_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SELanguageDetailed parseDelimitedFrom(InputStream inputStream) {
            return (SELanguageDetailed) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SELanguageDetailed parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SELanguageDetailed> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SELanguageDetailed)) {
                return super.equals(obj);
            }
            SELanguageDetailed sELanguageDetailed = (SELanguageDetailed) obj;
            if (hasLanguageList() != sELanguageDetailed.hasLanguageList()) {
                return false;
            }
            if ((hasLanguageList() && !getLanguageList().equals(sELanguageDetailed.getLanguageList())) || hasDefaultLanguageId() != sELanguageDetailed.hasDefaultLanguageId()) {
                return false;
            }
            if ((!hasDefaultLanguageId() || this.defaultLanguageId_ == sELanguageDetailed.defaultLanguageId_) && hasSelectLanguageId() == sELanguageDetailed.hasSelectLanguageId()) {
                return (!hasSelectLanguageId() || this.selectLanguageId_ == sELanguageDetailed.selectLanguageId_) && getUnknownFields().equals(sELanguageDetailed.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
        public SELanguageId getDefaultLanguageId() {
            SELanguageId sELanguageIdForNumber = SELanguageId.forNumber(this.defaultLanguageId_);
            return sELanguageIdForNumber == null ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UserProfilesProtos.internal_static_SA_SELanguageDetailed_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
        public SEList getLanguageList() {
            SEList sEList = this.languageList_;
            return sEList == null ? SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
        public SEListOrBuilder getLanguageListOrBuilder() {
            SEList sEList = this.languageList_;
            return sEList == null ? SEList.getDefaultInstance() : sEList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SELanguageDetailed> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
        public SELanguageId getSelectLanguageId() {
            SELanguageId sELanguageIdForNumber = SELanguageId.forNumber(this.selectLanguageId_);
            return sELanguageIdForNumber == null ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLanguageList()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.defaultLanguageId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(3, this.selectLanguageId_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
        public boolean hasDefaultLanguageId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
        public boolean hasLanguageList() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageDetailedOrBuilder
        public boolean hasSelectLanguageId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasLanguageList()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getLanguageList().hashCode();
            }
            if (hasDefaultLanguageId()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.defaultLanguageId_;
            }
            if (hasSelectLanguageId()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.selectLanguageId_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProfilesProtos.internal_static_SA_SELanguageDetailed_fieldAccessorTable.ensureFieldAccessorsInitialized(SELanguageDetailed.class, Builder.class);
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
            if (!hasLanguageList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDefaultLanguageId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSelectLanguageId()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLanguageList());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.defaultLanguageId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.selectLanguageId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SELanguageDetailed(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.defaultLanguageId_ = 1;
            this.selectLanguageId_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SELanguageDetailed sELanguageDetailed) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sELanguageDetailed);
        }

        public static SELanguageDetailed parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SELanguageDetailed parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SELanguageDetailed) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SELanguageDetailed parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SELanguageDetailed getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SELanguageDetailed parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SELanguageDetailed parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SELanguageDetailed() {
            this.memoizedIsInitialized = (byte) -1;
            this.defaultLanguageId_ = 1;
            this.selectLanguageId_ = 1;
        }

        public static SELanguageDetailed parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SELanguageDetailed parseFrom(InputStream inputStream) {
            return (SELanguageDetailed) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SELanguageDetailed parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SELanguageDetailed) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SELanguageDetailed parseFrom(CodedInputStream codedInputStream) {
            return (SELanguageDetailed) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SELanguageDetailed parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SELanguageDetailed) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SELanguageDetailedOrBuilder extends MessageOrBuilder {
        SELanguageId getDefaultLanguageId();

        SELanguageDetailed.SEList getLanguageList();

        SELanguageDetailed.SEListOrBuilder getLanguageListOrBuilder();

        SELanguageId getSelectLanguageId();

        boolean hasDefaultLanguageId();

        boolean hasLanguageList();

        boolean hasSelectLanguageId();
    }

    public enum SELanguageId implements ProtocolMessageEnum {
        ALBANIAN(1),
        ARABIC(2),
        AM_HARIC(3),
        IRISH(4),
        ORIYA(5),
        BASQUE(6),
        BELARUSIAN(7),
        BULGARIAN(8),
        POLISH(9),
        PERSIAN(16),
        BOOLEAN(17),
        DANISH(18),
        GERMAN(19),
        RUSSIAN(20),
        FRENCH(21),
        FILIPINO(22),
        FINNISH(23),
        CAMBODIAN(24),
        GEORGIAN(25),
        GUJARATI(32),
        KAZAKH(33),
        JAITAN_CREOLE(34),
        KOREAN(35),
        DUTCH(36),
        GALICIAN(37),
        CATALAN(38),
        CZECH(39),
        KANNADA(40),
        CROATIAN(41),
        KURDISH(48),
        LATIN(49),
        LAO(50),
        KINYARWANDA(51),
        ROMANIAN(52),
        MALAGASY(53),
        MARATHI(54),
        MALAYALAM(55),
        MALAY(56),
        MONGOLIAN(57),
        BENGALI(64),
        BURMESE(65),
        HMONG(66),
        ZULU_SOYTH_AFRICA(67),
        NEPALI(68),
        NORWEGIAN(69),
        PORTUGUESE(70),
        JAPANESE(71),
        SWEDISH(72),
        SERBIAN(73),
        SINHALA(80),
        SLOVAK(81),
        SOMALI(82),
        TAJIK(83),
        TELUGU(84),
        TAMIL(85),
        THAI(86),
        TURKISH(87),
        URDU(88),
        UKRAINIAN(89),
        UZBEK(96),
        SPANISH(97),
        GREEK(98),
        HUNGARIAN(99),
        IGBO(100),
        ITALIAN(101),
        HINDI(102),
        INDONESIAN(103),
        ENGLISH(104),
        VIETNAMESE(105),
        TRADITIONAL_CHINESE(112),
        SIMPLIFIED_CHINESE(113),
        HEBREW(114),
        LITHUANIAN(115),
        LATVIAN(116),
        ESTONIAN(117),
        SLOVENIAN(118),
        Maltese(119);

        public static final int ALBANIAN_VALUE = 1;
        public static final int AM_HARIC_VALUE = 3;
        public static final int ARABIC_VALUE = 2;
        public static final int BASQUE_VALUE = 6;
        public static final int BELARUSIAN_VALUE = 7;
        public static final int BENGALI_VALUE = 64;
        public static final int BOOLEAN_VALUE = 17;
        public static final int BULGARIAN_VALUE = 8;
        public static final int BURMESE_VALUE = 65;
        public static final int CAMBODIAN_VALUE = 24;
        public static final int CATALAN_VALUE = 38;
        public static final int CROATIAN_VALUE = 41;
        public static final int CZECH_VALUE = 39;
        public static final int DANISH_VALUE = 18;
        public static final int DUTCH_VALUE = 36;
        public static final int ENGLISH_VALUE = 104;
        public static final int ESTONIAN_VALUE = 117;
        public static final int FILIPINO_VALUE = 22;
        public static final int FINNISH_VALUE = 23;
        public static final int FRENCH_VALUE = 21;
        public static final int GALICIAN_VALUE = 37;
        public static final int GEORGIAN_VALUE = 25;
        public static final int GERMAN_VALUE = 19;
        public static final int GREEK_VALUE = 98;
        public static final int GUJARATI_VALUE = 32;
        public static final int HEBREW_VALUE = 114;
        public static final int HINDI_VALUE = 102;
        public static final int HMONG_VALUE = 66;
        public static final int HUNGARIAN_VALUE = 99;
        public static final int IGBO_VALUE = 100;
        public static final int INDONESIAN_VALUE = 103;
        public static final int IRISH_VALUE = 4;
        public static final int ITALIAN_VALUE = 101;
        public static final int JAITAN_CREOLE_VALUE = 34;
        public static final int JAPANESE_VALUE = 71;
        public static final int KANNADA_VALUE = 40;
        public static final int KAZAKH_VALUE = 33;
        public static final int KINYARWANDA_VALUE = 51;
        public static final int KOREAN_VALUE = 35;
        public static final int KURDISH_VALUE = 48;
        public static final int LAO_VALUE = 50;
        public static final int LATIN_VALUE = 49;
        public static final int LATVIAN_VALUE = 116;
        public static final int LITHUANIAN_VALUE = 115;
        public static final int MALAGASY_VALUE = 53;
        public static final int MALAYALAM_VALUE = 55;
        public static final int MALAY_VALUE = 56;
        public static final int MARATHI_VALUE = 54;
        public static final int MONGOLIAN_VALUE = 57;
        public static final int Maltese_VALUE = 119;
        public static final int NEPALI_VALUE = 68;
        public static final int NORWEGIAN_VALUE = 69;
        public static final int ORIYA_VALUE = 5;
        public static final int PERSIAN_VALUE = 16;
        public static final int POLISH_VALUE = 9;
        public static final int PORTUGUESE_VALUE = 70;
        public static final int ROMANIAN_VALUE = 52;
        public static final int RUSSIAN_VALUE = 20;
        public static final int SERBIAN_VALUE = 73;
        public static final int SIMPLIFIED_CHINESE_VALUE = 113;
        public static final int SINHALA_VALUE = 80;
        public static final int SLOVAK_VALUE = 81;
        public static final int SLOVENIAN_VALUE = 118;
        public static final int SOMALI_VALUE = 82;
        public static final int SPANISH_VALUE = 97;
        public static final int SWEDISH_VALUE = 72;
        public static final int TAJIK_VALUE = 83;
        public static final int TAMIL_VALUE = 85;
        public static final int TELUGU_VALUE = 84;
        public static final int THAI_VALUE = 86;
        public static final int TRADITIONAL_CHINESE_VALUE = 112;
        public static final int TURKISH_VALUE = 87;
        public static final int UKRAINIAN_VALUE = 89;
        public static final int URDU_VALUE = 88;
        public static final int UZBEK_VALUE = 96;
        private static final SELanguageId[] VALUES;
        public static final int VIETNAMESE_VALUE = 105;
        public static final int ZULU_SOYTH_AFRICA_VALUE = 67;
        private static final Internal.EnumLiteMap<SELanguageId> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SELanguageId$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SELanguageId> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SELanguageId findValueByNumber(int i7) {
                return SELanguageId.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SELanguageId");
            internalValueMap = new Internal.EnumLiteMap<SELanguageId>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SELanguageId.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SELanguageId findValueByNumber(int i7) {
                    return SELanguageId.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SELanguageId(int i7) {
            this.value = i7;
        }

        public static SELanguageId forNumber(int i7) {
            switch (i7) {
                case 1:
                    return ALBANIAN;
                case 2:
                    return ARABIC;
                case 3:
                    return AM_HARIC;
                case 4:
                    return IRISH;
                case 5:
                    return ORIYA;
                case 6:
                    return BASQUE;
                case 7:
                    return BELARUSIAN;
                case 8:
                    return BULGARIAN;
                case 9:
                    return POLISH;
                default:
                    switch (i7) {
                        case 16:
                            return PERSIAN;
                        case 17:
                            return BOOLEAN;
                        case 18:
                            return DANISH;
                        case 19:
                            return GERMAN;
                        case 20:
                            return RUSSIAN;
                        case 21:
                            return FRENCH;
                        case 22:
                            return FILIPINO;
                        case 23:
                            return FINNISH;
                        case 24:
                            return CAMBODIAN;
                        case 25:
                            return GEORGIAN;
                        default:
                            switch (i7) {
                                case 32:
                                    return GUJARATI;
                                case 33:
                                    return KAZAKH;
                                case 34:
                                    return JAITAN_CREOLE;
                                case 35:
                                    return KOREAN;
                                case 36:
                                    return DUTCH;
                                case 37:
                                    return GALICIAN;
                                case 38:
                                    return CATALAN;
                                case 39:
                                    return CZECH;
                                case 40:
                                    return KANNADA;
                                case 41:
                                    return CROATIAN;
                                default:
                                    switch (i7) {
                                        case 48:
                                            return KURDISH;
                                        case 49:
                                            return LATIN;
                                        case 50:
                                            return LAO;
                                        case 51:
                                            return KINYARWANDA;
                                        case 52:
                                            return ROMANIAN;
                                        case 53:
                                            return MALAGASY;
                                        case 54:
                                            return MARATHI;
                                        case 55:
                                            return MALAYALAM;
                                        case 56:
                                            return MALAY;
                                        case 57:
                                            return MONGOLIAN;
                                        default:
                                            switch (i7) {
                                                case 64:
                                                    return BENGALI;
                                                case 65:
                                                    return BURMESE;
                                                case 66:
                                                    return HMONG;
                                                case 67:
                                                    return ZULU_SOYTH_AFRICA;
                                                case 68:
                                                    return NEPALI;
                                                case 69:
                                                    return NORWEGIAN;
                                                case 70:
                                                    return PORTUGUESE;
                                                case 71:
                                                    return JAPANESE;
                                                case 72:
                                                    return SWEDISH;
                                                case 73:
                                                    return SERBIAN;
                                                default:
                                                    switch (i7) {
                                                        case 80:
                                                            return SINHALA;
                                                        case 81:
                                                            return SLOVAK;
                                                        case 82:
                                                            return SOMALI;
                                                        case 83:
                                                            return TAJIK;
                                                        case 84:
                                                            return TELUGU;
                                                        case 85:
                                                            return TAMIL;
                                                        case 86:
                                                            return THAI;
                                                        case 87:
                                                            return TURKISH;
                                                        case 88:
                                                            return URDU;
                                                        case 89:
                                                            return UKRAINIAN;
                                                        default:
                                                            switch (i7) {
                                                                case 96:
                                                                    return UZBEK;
                                                                case 97:
                                                                    return SPANISH;
                                                                case 98:
                                                                    return GREEK;
                                                                case 99:
                                                                    return HUNGARIAN;
                                                                case 100:
                                                                    return IGBO;
                                                                case 101:
                                                                    return ITALIAN;
                                                                case 102:
                                                                    return HINDI;
                                                                case 103:
                                                                    return INDONESIAN;
                                                                case 104:
                                                                    return ENGLISH;
                                                                case 105:
                                                                    return VIETNAMESE;
                                                                default:
                                                                    switch (i7) {
                                                                        case 112:
                                                                            return TRADITIONAL_CHINESE;
                                                                        case 113:
                                                                            return SIMPLIFIED_CHINESE;
                                                                        case 114:
                                                                            return HEBREW;
                                                                        case 115:
                                                                            return LITHUANIAN;
                                                                        case 116:
                                                                            return LATVIAN;
                                                                        case 117:
                                                                            return ESTONIAN;
                                                                        case 118:
                                                                            return SLOVENIAN;
                                                                        case 119:
                                                                            return Maltese;
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

        public static Descriptors.EnumDescriptor getDescriptor() {
            return UserProfilesProtos.getDescriptor().getEnumType(1);
        }

        public static Internal.EnumLiteMap<SELanguageId> internalGetValueMap() {
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
        public static SELanguageId valueOf(int i7) {
            return forNumber(i7);
        }

        public static SELanguageId valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEParentsInfo extends GeneratedMessage implements SEParentsInfoOrBuilder {
        private static final SEParentsInfo DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        public static final int INFO_LIST_FIELD_NUMBER = 4;
        private static final Parser<SEParentsInfo> PARSER;
        public static final int SCREEN_RADIUS_FIELD_NUMBER = 3;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int height_;
        private ParentsInfoList infoList_;
        private byte memoizedIsInitialized;
        private int screenRadius_;
        private int width_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEParentsInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEParentsInfo> {
            @Override // com.google.protobuf.Parser
            public SEParentsInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEParentsInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEParentsInfoOrBuilder {
            private int bitField0_;
            private int height_;
            private SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> infoListBuilder_;
            private ParentsInfoList infoList_;
            private int screenRadius_;
            private int width_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                this(builderParent);
            }

            private void buildPartial0(SEParentsInfo sEParentsInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEParentsInfo.width_ = this.width_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEParentsInfo.height_ = this.height_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEParentsInfo.screenRadius_ = this.screenRadius_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                    sEParentsInfo.infoList_ = singleFieldBuilder == null ? this.infoList_ : (ParentsInfoList) singleFieldBuilder.build();
                    i7 |= 8;
                }
                sEParentsInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_descriptor;
            }

            private SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> internalGetInfoListFieldBuilder() {
                if (this.infoListBuilder_ == null) {
                    this.infoListBuilder_ = new SingleFieldBuilder<>(getInfoList(), getParentForChildren(), isClean());
                    this.infoList_ = null;
                }
                return this.infoListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetInfoListFieldBuilder();
                }
            }

            public Builder clearHeight() {
                this.bitField0_ &= -3;
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearInfoList() {
                this.bitField0_ &= -9;
                this.infoList_ = null;
                SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.infoListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearScreenRadius() {
                this.bitField0_ &= -5;
                this.screenRadius_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.bitField0_ &= -2;
                this.width_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
            public ParentsInfoList getInfoList() {
                SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder != null) {
                    return (ParentsInfoList) singleFieldBuilder.getMessage();
                }
                ParentsInfoList parentsInfoList = this.infoList_;
                return parentsInfoList == null ? ParentsInfoList.getDefaultInstance() : parentsInfoList;
            }

            public ParentsInfoList.Builder getInfoListBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ParentsInfoList.Builder) internalGetInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
            public ParentsInfoListOrBuilder getInfoListOrBuilder() {
                SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder != null) {
                    return (ParentsInfoListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                ParentsInfoList parentsInfoList = this.infoList_;
                return parentsInfoList == null ? ParentsInfoList.getDefaultInstance() : parentsInfoList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
            public int getScreenRadius() {
                return this.screenRadius_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
            public boolean hasHeight() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
            public boolean hasInfoList() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
            public boolean hasScreenRadius() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
            public boolean hasWidth() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEParentsInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasWidth() && hasHeight() && hasScreenRadius() && hasInfoList() && getInfoList().isInitialized();
            }

            public Builder mergeInfoList(ParentsInfoList parentsInfoList) {
                ParentsInfoList parentsInfoList2;
                SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(parentsInfoList);
                } else if ((this.bitField0_ & 8) == 0 || (parentsInfoList2 = this.infoList_) == null || parentsInfoList2 == ParentsInfoList.getDefaultInstance()) {
                    this.infoList_ = parentsInfoList;
                } else {
                    getInfoListBuilder().mergeFrom(parentsInfoList);
                }
                if (this.infoList_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setHeight(int i7) {
                this.height_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setInfoList(ParentsInfoList parentsInfoList) {
                SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder == null) {
                    parentsInfoList.getClass();
                    this.infoList_ = parentsInfoList;
                } else {
                    singleFieldBuilder.setMessage(parentsInfoList);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setScreenRadius(int i7) {
                this.screenRadius_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setWidth(int i7) {
                this.width_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(r rVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEParentsInfo build() {
                SEParentsInfo sEParentsInfoBuildPartial = buildPartial();
                if (sEParentsInfoBuildPartial.isInitialized()) {
                    return sEParentsInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEParentsInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEParentsInfo buildPartial() {
                SEParentsInfo sEParentsInfo = new SEParentsInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEParentsInfo);
                }
                onBuilt();
                return sEParentsInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEParentsInfo getDefaultInstanceForType() {
                return SEParentsInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.width_ = 0;
                this.height_ = 0;
                this.screenRadius_ = 0;
                this.infoList_ = null;
                SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.infoListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEParentsInfo) {
                    return mergeFrom((SEParentsInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setInfoList(ParentsInfoList.Builder builder) {
                SingleFieldBuilder<ParentsInfoList, ParentsInfoList.Builder, ParentsInfoListOrBuilder> singleFieldBuilder = this.infoListBuilder_;
                if (singleFieldBuilder == null) {
                    this.infoList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEParentsInfo sEParentsInfo) {
                if (sEParentsInfo == SEParentsInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEParentsInfo.hasWidth()) {
                    setWidth(sEParentsInfo.getWidth());
                }
                if (sEParentsInfo.hasHeight()) {
                    setHeight(sEParentsInfo.getHeight());
                }
                if (sEParentsInfo.hasScreenRadius()) {
                    setScreenRadius(sEParentsInfo.getScreenRadius());
                }
                if (sEParentsInfo.hasInfoList()) {
                    mergeInfoList(sEParentsInfo.getInfoList());
                }
                mergeUnknownFields(sEParentsInfo.getUnknownFields());
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
                                    this.width_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.height_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.screenRadius_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetInfoListFieldBuilder().getBuilder(), extensionRegistryLite);
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

        public static final class ParentsDelList extends GeneratedMessage implements ParentsDelListOrBuilder {
            private static final ParentsDelList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<ParentsDelList> PARSER;
            private static final long serialVersionUID = 0;
            private Internal.IntList list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEParentsInfo$ParentsDelList$1 */
            public class AnonymousClass1 extends AbstractParser<ParentsDelList> {
                @Override // com.google.protobuf.Parser
                public ParentsDelList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ParentsDelList.newBuilder();
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

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ParentsDelListOrBuilder {
                private int bitField0_;
                private Internal.IntList list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                    this(builderParent);
                }

                private void buildPartial0(ParentsDelList parentsDelList) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_.makeImmutable();
                        parentsDelList.list_ = this.list_;
                    }
                }

                private void ensureListIsMutable() {
                    if (!this.list_.isModifiable()) {
                        this.list_ = (Internal.IntList) GeneratedMessage.makeMutableCopy(this.list_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsDelList_descriptor;
                }

                public Builder addAllList(Iterable<? extends Integer> iterable) {
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addList(int i7) {
                    ensureListIsMutable();
                    this.list_.addInt(i7);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    this.list_ = GeneratedMessage.emptyIntList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsDelList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsDelListOrBuilder
                public int getList(int i7) {
                    return this.list_.getInt(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsDelListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsDelListOrBuilder
                public List<Integer> getListList() {
                    this.list_.makeImmutable();
                    return this.list_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsDelList_fieldAccessorTable.ensureFieldAccessorsInitialized(ParentsDelList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, int i8) {
                    ensureListIsMutable();
                    this.list_.setInt(i7, i8);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(r rVar) {
                    this();
                }

                private Builder() {
                    this.list_ = GeneratedMessage.emptyIntList();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ParentsDelList build() {
                    ParentsDelList parentsDelListBuildPartial = buildPartial();
                    if (parentsDelListBuildPartial.isInitialized()) {
                        return parentsDelListBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) parentsDelListBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ParentsDelList buildPartial() {
                    ParentsDelList parentsDelList = new ParentsDelList(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(parentsDelList);
                    }
                    onBuilt();
                    return parentsDelList;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ParentsDelList getDefaultInstanceForType() {
                    return ParentsDelList.getDefaultInstance();
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = GeneratedMessage.emptyIntList();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.list_ = GeneratedMessage.emptyIntList();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ParentsDelList) {
                        return mergeFrom((ParentsDelList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(ParentsDelList parentsDelList) {
                    if (parentsDelList == ParentsDelList.getDefaultInstance()) {
                        return this;
                    }
                    if (!parentsDelList.list_.isEmpty()) {
                        if (this.list_.isEmpty()) {
                            Internal.IntList intList = parentsDelList.list_;
                            this.list_ = intList;
                            intList.makeImmutable();
                            this.bitField0_ |= 1;
                        } else {
                            ensureListIsMutable();
                            this.list_.addAll(parentsDelList.list_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(parentsDelList.getUnknownFields());
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
                                        int uInt32 = codedInputStream.readUInt32();
                                        ensureListIsMutable();
                                        this.list_.addInt(uInt32);
                                    } else if (tag != 10) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        ensureListIsMutable();
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.list_.addInt(codedInputStream.readUInt32());
                                        }
                                        codedInputStream.popLimit(iPushLimit);
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "ParentsDelList");
                DEFAULT_INSTANCE = new ParentsDelList();
                PARSER = new AbstractParser<ParentsDelList>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsDelList.1
                    @Override // com.google.protobuf.Parser
                    public ParentsDelList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = ParentsDelList.newBuilder();
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

            public /* synthetic */ ParentsDelList(GeneratedMessage.Builder builder, r rVar) {
                this(builder);
            }

            public static ParentsDelList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsDelList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ParentsDelList parseDelimitedFrom(InputStream inputStream) {
                return (ParentsDelList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ParentsDelList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<ParentsDelList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ParentsDelList)) {
                    return super.equals(obj);
                }
                ParentsDelList parentsDelList = (ParentsDelList) obj;
                return getListList().equals(parentsDelList.getListList()) && getUnknownFields().equals(parentsDelList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsDelList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsDelListOrBuilder
            public int getList(int i7) {
                return this.list_.getInt(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsDelListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsDelListOrBuilder
            public List<Integer> getListList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<ParentsDelList> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i7 = this.memoizedSize;
                if (i7 != -1) {
                    return i7;
                }
                int iComputeUInt32SizeNoTag = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(this.list_.getInt(i8));
                }
                int size = iComputeUInt32SizeNoTag + getListList().size() + getUnknownFields().getSerializedSize();
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
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsDelList_fieldAccessorTable.ensureFieldAccessorsInitialized(ParentsDelList.class, Builder.class);
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
                    codedOutputStream.writeUInt32(1, this.list_.getInt(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private ParentsDelList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.list_ = GeneratedMessage.emptyIntList();
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(ParentsDelList parentsDelList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(parentsDelList);
            }

            public static ParentsDelList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static ParentsDelList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ParentsDelList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ParentsDelList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ParentsDelList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static ParentsDelList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private ParentsDelList() {
                this.list_ = GeneratedMessage.emptyIntList();
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = GeneratedMessage.emptyIntList();
            }

            public static ParentsDelList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static ParentsDelList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static ParentsDelList parseFrom(InputStream inputStream) {
                return (ParentsDelList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static ParentsDelList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ParentsDelList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ParentsDelList parseFrom(CodedInputStream codedInputStream) {
                return (ParentsDelList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static ParentsDelList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ParentsDelList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ParentsDelListOrBuilder extends MessageOrBuilder {
            int getList(int i7);

            int getListCount();

            List<Integer> getListList();
        }

        public static final class ParentsInfoList extends GeneratedMessage implements ParentsInfoListOrBuilder {
            private static final ParentsInfoList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<ParentsInfoList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEParentsInfo_t> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEParentsInfo$ParentsInfoList$1 */
            public class AnonymousClass1 extends AbstractParser<ParentsInfoList> {
                @Override // com.google.protobuf.Parser
                public ParentsInfoList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ParentsInfoList.newBuilder();
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

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ParentsInfoListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> listBuilder_;
                private List<SEParentsInfo_t> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                    this(builderParent);
                }

                private void buildPartial0(ParentsInfoList parentsInfoList) {
                }

                private void buildPartialRepeatedFields(ParentsInfoList parentsInfoList) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        parentsInfoList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    parentsInfoList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsInfoList_descriptor;
                }

                private RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEParentsInfo_t> iterable) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEParentsInfo_t sEParentsInfo_t) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEParentsInfo_t);
                        return this;
                    }
                    sEParentsInfo_t.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEParentsInfo_t);
                    onChanged();
                    return this;
                }

                public SEParentsInfo_t.Builder addListBuilder() {
                    return (SEParentsInfo_t.Builder) internalGetListFieldBuilder().addBuilder(SEParentsInfo_t.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsInfoList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
                public SEParentsInfo_t getList(int i7) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEParentsInfo_t) repeatedFieldBuilder.getMessage(i7);
                }

                public SEParentsInfo_t.Builder getListBuilder(int i7) {
                    return (SEParentsInfo_t.Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<SEParentsInfo_t.Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
                public List<SEParentsInfo_t> getListList() {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
                public SEParentsInfo_tOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEParentsInfo_tOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
                public List<? extends SEParentsInfo_tOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsInfoList_fieldAccessorTable.ensureFieldAccessorsInitialized(ParentsInfoList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEParentsInfo_t sEParentsInfo_t) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEParentsInfo_t);
                        return this;
                    }
                    sEParentsInfo_t.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEParentsInfo_t);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(r rVar) {
                    this();
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ParentsInfoList build() {
                    ParentsInfoList parentsInfoListBuildPartial = buildPartial();
                    if (parentsInfoListBuildPartial.isInitialized()) {
                        return parentsInfoListBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) parentsInfoListBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ParentsInfoList buildPartial() {
                    ParentsInfoList parentsInfoList = new ParentsInfoList(this);
                    buildPartialRepeatedFields(parentsInfoList);
                    if (this.bitField0_ != 0) {
                        buildPartial0(parentsInfoList);
                    }
                    onBuilt();
                    return parentsInfoList;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ParentsInfoList getDefaultInstanceForType() {
                    return ParentsInfoList.getDefaultInstance();
                }

                public SEParentsInfo_t.Builder addListBuilder(int i7) {
                    return (SEParentsInfo_t.Builder) internalGetListFieldBuilder().addBuilder(i7, SEParentsInfo_t.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEParentsInfo_t sEParentsInfo_t) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEParentsInfo_t.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEParentsInfo_t);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEParentsInfo_t);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ParentsInfoList) {
                        return mergeFrom((ParentsInfoList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setList(int i7, SEParentsInfo_t.Builder builder) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(ParentsInfoList parentsInfoList) {
                    if (parentsInfoList == ParentsInfoList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!parentsInfoList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = parentsInfoList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(parentsInfoList.list_);
                            }
                            onChanged();
                        }
                    } else if (!parentsInfoList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = parentsInfoList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(parentsInfoList.list_);
                        }
                    }
                    mergeUnknownFields(parentsInfoList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(SEParentsInfo_t.Builder builder) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, SEParentsInfo_t.Builder builder) {
                    RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEParentsInfo_t sEParentsInfo_t = (SEParentsInfo_t) codedInputStream.readMessage(SEParentsInfo_t.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEParentsInfo_t, SEParentsInfo_t.Builder, SEParentsInfo_tOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEParentsInfo_t);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEParentsInfo_t);
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "ParentsInfoList");
                DEFAULT_INSTANCE = new ParentsInfoList();
                PARSER = new AbstractParser<ParentsInfoList>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoList.1
                    @Override // com.google.protobuf.Parser
                    public ParentsInfoList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = ParentsInfoList.newBuilder();
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

            public /* synthetic */ ParentsInfoList(GeneratedMessage.Builder builder, r rVar) {
                this(builder);
            }

            public static ParentsInfoList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsInfoList_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ParentsInfoList parseDelimitedFrom(InputStream inputStream) {
                return (ParentsInfoList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ParentsInfoList parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<ParentsInfoList> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ParentsInfoList)) {
                    return super.equals(obj);
                }
                ParentsInfoList parentsInfoList = (ParentsInfoList) obj;
                return getListList().equals(parentsInfoList.getListList()) && getUnknownFields().equals(parentsInfoList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsInfoList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
            public SEParentsInfo_t getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
            public List<SEParentsInfo_t> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
            public SEParentsInfo_tOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.ParentsInfoListOrBuilder
            public List<? extends SEParentsInfo_tOrBuilder> getListOrBuilderList() {
                return this.list_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<ParentsInfoList> getParserForType() {
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
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_ParentsInfoList_fieldAccessorTable.ensureFieldAccessorsInitialized(ParentsInfoList.class, Builder.class);
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

            private ParentsInfoList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(ParentsInfoList parentsInfoList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(parentsInfoList);
            }

            public static ParentsInfoList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static ParentsInfoList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ParentsInfoList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ParentsInfoList parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ParentsInfoList getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            private ParentsInfoList() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static ParentsInfoList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static ParentsInfoList parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static ParentsInfoList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static ParentsInfoList parseFrom(InputStream inputStream) {
                return (ParentsInfoList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static ParentsInfoList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ParentsInfoList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ParentsInfoList parseFrom(CodedInputStream codedInputStream) {
                return (ParentsInfoList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static ParentsInfoList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ParentsInfoList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ParentsInfoListOrBuilder extends MessageOrBuilder {
            SEParentsInfo_t getList(int i7);

            int getListCount();

            List<SEParentsInfo_t> getListList();

            SEParentsInfo_tOrBuilder getListOrBuilder(int i7);

            List<? extends SEParentsInfo_tOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEParentsInfo");
            DEFAULT_INSTANCE = new SEParentsInfo();
            PARSER = new AbstractParser<SEParentsInfo>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo.1
                @Override // com.google.protobuf.Parser
                public SEParentsInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEParentsInfo.newBuilder();
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

        public /* synthetic */ SEParentsInfo(GeneratedMessage.Builder builder, r rVar) {
            this(builder);
        }

        public static SEParentsInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProfilesProtos.internal_static_SA_SEParentsInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEParentsInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEParentsInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEParentsInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEParentsInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEParentsInfo)) {
                return super.equals(obj);
            }
            SEParentsInfo sEParentsInfo = (SEParentsInfo) obj;
            if (hasWidth() != sEParentsInfo.hasWidth()) {
                return false;
            }
            if ((hasWidth() && getWidth() != sEParentsInfo.getWidth()) || hasHeight() != sEParentsInfo.hasHeight()) {
                return false;
            }
            if ((hasHeight() && getHeight() != sEParentsInfo.getHeight()) || hasScreenRadius() != sEParentsInfo.hasScreenRadius()) {
                return false;
            }
            if ((!hasScreenRadius() || getScreenRadius() == sEParentsInfo.getScreenRadius()) && hasInfoList() == sEParentsInfo.hasInfoList()) {
                return (!hasInfoList() || getInfoList().equals(sEParentsInfo.getInfoList())) && getUnknownFields().equals(sEParentsInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UserProfilesProtos.internal_static_SA_SEParentsInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
        public ParentsInfoList getInfoList() {
            ParentsInfoList parentsInfoList = this.infoList_;
            return parentsInfoList == null ? ParentsInfoList.getDefaultInstance() : parentsInfoList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
        public ParentsInfoListOrBuilder getInfoListOrBuilder() {
            ParentsInfoList parentsInfoList = this.infoList_;
            return parentsInfoList == null ? ParentsInfoList.getDefaultInstance() : parentsInfoList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEParentsInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
        public int getScreenRadius() {
            return this.screenRadius_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.width_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.height_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.screenRadius_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getInfoList());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
        public boolean hasHeight() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
        public boolean hasInfoList() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
        public boolean hasScreenRadius() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfoOrBuilder
        public boolean hasWidth() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasWidth()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getWidth();
            }
            if (hasHeight()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getHeight();
            }
            if (hasScreenRadius()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getScreenRadius();
            }
            if (hasInfoList()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getInfoList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProfilesProtos.internal_static_SA_SEParentsInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEParentsInfo.class, Builder.class);
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
            if (!hasWidth()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHeight()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasScreenRadius()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasInfoList()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.width_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.height_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.screenRadius_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getInfoList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEParentsInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.width_ = 0;
            this.height_ = 0;
            this.screenRadius_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEParentsInfo sEParentsInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEParentsInfo);
        }

        public static SEParentsInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEParentsInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEParentsInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEParentsInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEParentsInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEParentsInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEParentsInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEParentsInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEParentsInfo() {
            this.width_ = 0;
            this.height_ = 0;
            this.screenRadius_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEParentsInfo parseFrom(InputStream inputStream) {
            return (SEParentsInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEParentsInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEParentsInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEParentsInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEParentsInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEParentsInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEParentsInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEParentsInfoOrBuilder extends MessageOrBuilder {
        int getHeight();

        SEParentsInfo.ParentsInfoList getInfoList();

        SEParentsInfo.ParentsInfoListOrBuilder getInfoListOrBuilder();

        int getScreenRadius();

        int getWidth();

        boolean hasHeight();

        boolean hasInfoList();

        boolean hasScreenRadius();

        boolean hasWidth();
    }

    public static final class SEParentsInfo_t extends GeneratedMessage implements SEParentsInfo_tOrBuilder {
        private static final SEParentsInfo_t DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MD5_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 3;
        private static final Parser<SEParentsInfo_t> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private volatile Object md5_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object number_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEParentsInfo_t$1 */
        public class AnonymousClass1 extends AbstractParser<SEParentsInfo_t> {
            @Override // com.google.protobuf.Parser
            public SEParentsInfo_t parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEParentsInfo_t.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEParentsInfo_tOrBuilder {
            private int bitField0_;
            private int id_;
            private Object md5_;
            private Object name_;
            private Object number_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                this(builderParent);
            }

            private void buildPartial0(SEParentsInfo_t sEParentsInfo_t) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEParentsInfo_t.id_ = this.id_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEParentsInfo_t.name_ = this.name_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEParentsInfo_t.number_ = this.number_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEParentsInfo_t.md5_ = this.md5_;
                    i7 |= 8;
                }
                sEParentsInfo_t.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_t_descriptor;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMd5() {
                this.md5_ = SEParentsInfo_t.getDefaultInstance().getMd5();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = SEParentsInfo_t.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearNumber() {
                this.number_ = SEParentsInfo_t.getDefaultInstance().getNumber();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_t_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public String getMd5() {
                Object obj = this.md5_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.md5_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public ByteString getMd5Bytes() {
                Object obj = this.md5_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.md5_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public String getNumber() {
                Object obj = this.number_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.number_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public ByteString getNumberBytes() {
                Object obj = this.number_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.number_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public boolean hasMd5() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
            public boolean hasNumber() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SEParentsInfo_t_fieldAccessorTable.ensureFieldAccessorsInitialized(SEParentsInfo_t.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasName() && hasNumber() && hasMd5();
            }

            public Builder setId(int i7) {
                this.id_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMd5(String str) {
                str.getClass();
                this.md5_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMd5Bytes(ByteString byteString) {
                byteString.getClass();
                this.md5_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNumber(String str) {
                str.getClass();
                this.number_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.number_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(r rVar) {
                this();
            }

            private Builder() {
                this.name_ = "";
                this.number_ = "";
                this.md5_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEParentsInfo_t build() {
                SEParentsInfo_t sEParentsInfo_tBuildPartial = buildPartial();
                if (sEParentsInfo_tBuildPartial.isInitialized()) {
                    return sEParentsInfo_tBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEParentsInfo_tBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEParentsInfo_t buildPartial() {
                SEParentsInfo_t sEParentsInfo_t = new SEParentsInfo_t(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEParentsInfo_t);
                }
                onBuilt();
                return sEParentsInfo_t;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEParentsInfo_t getDefaultInstanceForType() {
                return SEParentsInfo_t.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.name_ = "";
                this.number_ = "";
                this.md5_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.number_ = "";
                this.md5_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEParentsInfo_t) {
                    return mergeFrom((SEParentsInfo_t) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEParentsInfo_t sEParentsInfo_t) {
                if (sEParentsInfo_t == SEParentsInfo_t.getDefaultInstance()) {
                    return this;
                }
                if (sEParentsInfo_t.hasId()) {
                    setId(sEParentsInfo_t.getId());
                }
                if (sEParentsInfo_t.hasName()) {
                    this.name_ = sEParentsInfo_t.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEParentsInfo_t.hasNumber()) {
                    this.number_ = sEParentsInfo_t.number_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEParentsInfo_t.hasMd5()) {
                    this.md5_ = sEParentsInfo_t.md5_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(sEParentsInfo_t.getUnknownFields());
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
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.number_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.md5_ = codedInputStream.readBytes();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEParentsInfo_t");
            DEFAULT_INSTANCE = new SEParentsInfo_t();
            PARSER = new AbstractParser<SEParentsInfo_t>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_t.1
                @Override // com.google.protobuf.Parser
                public SEParentsInfo_t parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEParentsInfo_t.newBuilder();
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

        public /* synthetic */ SEParentsInfo_t(GeneratedMessage.Builder builder, r rVar) {
            this(builder);
        }

        public static SEParentsInfo_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProfilesProtos.internal_static_SA_SEParentsInfo_t_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEParentsInfo_t parseDelimitedFrom(InputStream inputStream) {
            return (SEParentsInfo_t) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEParentsInfo_t parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEParentsInfo_t> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEParentsInfo_t)) {
                return super.equals(obj);
            }
            SEParentsInfo_t sEParentsInfo_t = (SEParentsInfo_t) obj;
            if (hasId() != sEParentsInfo_t.hasId()) {
                return false;
            }
            if ((hasId() && getId() != sEParentsInfo_t.getId()) || hasName() != sEParentsInfo_t.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(sEParentsInfo_t.getName())) || hasNumber() != sEParentsInfo_t.hasNumber()) {
                return false;
            }
            if ((!hasNumber() || getNumber().equals(sEParentsInfo_t.getNumber())) && hasMd5() == sEParentsInfo_t.hasMd5()) {
                return (!hasMd5() || getMd5().equals(sEParentsInfo_t.getMd5())) && getUnknownFields().equals(sEParentsInfo_t.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UserProfilesProtos.internal_static_SA_SEParentsInfo_t_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public String getMd5() {
            Object obj = this.md5_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.md5_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public ByteString getMd5Bytes() {
            Object obj = this.md5_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.md5_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public String getNumber() {
            Object obj = this.number_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.number_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public ByteString getNumberBytes() {
            Object obj = this.number_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.number_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEParentsInfo_t> getParserForType() {
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
                iComputeUInt32Size += GeneratedMessage.computeStringSize(2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(3, this.number_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(4, this.md5_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public boolean hasMd5() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEParentsInfo_tOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 4) != 0;
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
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getName().hashCode();
            }
            if (hasNumber()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getNumber().hashCode();
            }
            if (hasMd5()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMd5().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProfilesProtos.internal_static_SA_SEParentsInfo_t_fieldAccessorTable.ensureFieldAccessorsInitialized(SEParentsInfo_t.class, Builder.class);
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
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasNumber()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMd5()) {
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
                GeneratedMessage.writeString(codedOutputStream, 2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.number_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.md5_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEParentsInfo_t(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.name_ = "";
            this.number_ = "";
            this.md5_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEParentsInfo_t sEParentsInfo_t) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEParentsInfo_t);
        }

        public static SEParentsInfo_t parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEParentsInfo_t parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEParentsInfo_t) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEParentsInfo_t parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEParentsInfo_t getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEParentsInfo_t parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEParentsInfo_t parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEParentsInfo_t parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEParentsInfo_t parseFrom(InputStream inputStream) {
            return (SEParentsInfo_t) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEParentsInfo_t() {
            this.id_ = 0;
            this.name_ = "";
            this.number_ = "";
            this.md5_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.number_ = "";
            this.md5_ = "";
        }

        public static SEParentsInfo_t parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEParentsInfo_t) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEParentsInfo_t parseFrom(CodedInputStream codedInputStream) {
            return (SEParentsInfo_t) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEParentsInfo_t parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEParentsInfo_t) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEParentsInfo_tOrBuilder extends MessageOrBuilder {
        int getId();

        String getMd5();

        ByteString getMd5Bytes();

        String getName();

        ByteString getNameBytes();

        String getNumber();

        ByteString getNumberBytes();

        boolean hasId();

        boolean hasMd5();

        boolean hasName();

        boolean hasNumber();
    }

    public enum SESex implements ProtocolMessageEnum {
        NEUTRAL(0),
        MALE(1),
        FEMALE(2);

        public static final int FEMALE_VALUE = 2;
        public static final int MALE_VALUE = 1;
        public static final int NEUTRAL_VALUE = 0;
        private static final SESex[] VALUES;
        private static final Internal.EnumLiteMap<SESex> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SESex$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SESex> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SESex findValueByNumber(int i7) {
                return SESex.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESex");
            internalValueMap = new Internal.EnumLiteMap<SESex>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SESex.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SESex findValueByNumber(int i7) {
                    return SESex.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SESex(int i7) {
            this.value = i7;
        }

        public static SESex forNumber(int i7) {
            if (i7 == 0) {
                return NEUTRAL;
            }
            if (i7 == 1) {
                return MALE;
            }
            if (i7 != 2) {
                return null;
            }
            return FEMALE;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return UserProfilesProtos.getDescriptor().getEnumType(4);
        }

        public static Internal.EnumLiteMap<SESex> internalGetValueMap() {
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
        public static SESex valueOf(int i7) {
            return forNumber(i7);
        }

        public static SESex valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SETemperatureType implements ProtocolMessageEnum {
        CENTIGRADE(0),
        FAHRENHEIT_DEGREE(1);

        public static final int CENTIGRADE_VALUE = 0;
        public static final int FAHRENHEIT_DEGREE_VALUE = 1;
        private static final SETemperatureType[] VALUES;
        private static final Internal.EnumLiteMap<SETemperatureType> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SETemperatureType$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SETemperatureType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SETemperatureType findValueByNumber(int i7) {
                return SETemperatureType.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SETemperatureType");
            internalValueMap = new Internal.EnumLiteMap<SETemperatureType>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SETemperatureType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SETemperatureType findValueByNumber(int i7) {
                    return SETemperatureType.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SETemperatureType(int i7) {
            this.value = i7;
        }

        public static SETemperatureType forNumber(int i7) {
            if (i7 == 0) {
                return CENTIGRADE;
            }
            if (i7 != 1) {
                return null;
            }
            return FAHRENHEIT_DEGREE;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return UserProfilesProtos.getDescriptor().getEnumType(3);
        }

        public static Internal.EnumLiteMap<SETemperatureType> internalGetValueMap() {
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
        public static SETemperatureType valueOf(int i7) {
            return forNumber(i7);
        }

        public static SETemperatureType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEUnitType implements ProtocolMessageEnum {
        METRIC_SYSTEM(0),
        BRITISH_SYSTEM(1);

        public static final int BRITISH_SYSTEM_VALUE = 1;
        public static final int METRIC_SYSTEM_VALUE = 0;
        private static final SEUnitType[] VALUES;
        private static final Internal.EnumLiteMap<SEUnitType> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEUnitType$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEUnitType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEUnitType findValueByNumber(int i7) {
                return SEUnitType.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEUnitType");
            internalValueMap = new Internal.EnumLiteMap<SEUnitType>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUnitType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEUnitType findValueByNumber(int i7) {
                    return SEUnitType.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEUnitType(int i7) {
            this.value = i7;
        }

        public static SEUnitType forNumber(int i7) {
            if (i7 == 0) {
                return METRIC_SYSTEM;
            }
            if (i7 != 1) {
                return null;
            }
            return BRITISH_SYSTEM;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return UserProfilesProtos.getDescriptor().getEnumType(2);
        }

        public static Internal.EnumLiteMap<SEUnitType> internalGetValueMap() {
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
        public static SEUnitType valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEUnitType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEUserInformation extends GeneratedMessage implements SEUserInformationOrBuilder {
        private static final SEUserInformation DEFAULT_INSTANCE;
        public static final int LANGUAGE_ID_FIELD_NUMBER = 2;
        private static final Parser<SEUserInformation> PARSER;
        public static final int TEMPERATURE_TYPE_FIELD_NUMBER = 4;
        public static final int UNIT_TYPE_FIELD_NUMBER = 3;
        public static final int USER_PROFILE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int languageId_;
        private byte memoizedIsInitialized;
        private int temperatureType_;
        private int unitType_;
        private SEUserProfile userProfile_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEUserInformation$1 */
        public class AnonymousClass1 extends AbstractParser<SEUserInformation> {
            @Override // com.google.protobuf.Parser
            public SEUserInformation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEUserInformation.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEUserInformationOrBuilder {
            private int bitField0_;
            private int languageId_;
            private int temperatureType_;
            private int unitType_;
            private SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> userProfileBuilder_;
            private SEUserProfile userProfile_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                this(builderParent);
            }

            private void buildPartial0(SEUserInformation sEUserInformation) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                    sEUserInformation.userProfile_ = singleFieldBuilder == null ? this.userProfile_ : (SEUserProfile) singleFieldBuilder.build();
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEUserInformation.languageId_ = this.languageId_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEUserInformation.unitType_ = this.unitType_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEUserInformation.temperatureType_ = this.temperatureType_;
                    i7 |= 8;
                }
                sEUserInformation.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEUserInformation_descriptor;
            }

            private SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> internalGetUserProfileFieldBuilder() {
                if (this.userProfileBuilder_ == null) {
                    this.userProfileBuilder_ = new SingleFieldBuilder<>(getUserProfile(), getParentForChildren(), isClean());
                    this.userProfile_ = null;
                }
                return this.userProfileBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetUserProfileFieldBuilder();
                }
            }

            public Builder clearLanguageId() {
                this.bitField0_ &= -3;
                this.languageId_ = 1;
                onChanged();
                return this;
            }

            public Builder clearTemperatureType() {
                this.bitField0_ &= -9;
                this.temperatureType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUnitType() {
                this.bitField0_ &= -5;
                this.unitType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserProfile() {
                this.bitField0_ &= -2;
                this.userProfile_ = null;
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.userProfileBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEUserInformation_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
            public SELanguageId getLanguageId() {
                SELanguageId sELanguageIdForNumber = SELanguageId.forNumber(this.languageId_);
                return sELanguageIdForNumber == null ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
            public SETemperatureType getTemperatureType() {
                SETemperatureType sETemperatureTypeForNumber = SETemperatureType.forNumber(this.temperatureType_);
                return sETemperatureTypeForNumber == null ? SETemperatureType.CENTIGRADE : sETemperatureTypeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
            public SEUnitType getUnitType() {
                SEUnitType sEUnitTypeForNumber = SEUnitType.forNumber(this.unitType_);
                return sEUnitTypeForNumber == null ? SEUnitType.METRIC_SYSTEM : sEUnitTypeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
            public SEUserProfile getUserProfile() {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEUserProfile) singleFieldBuilder.getMessage();
                }
                SEUserProfile sEUserProfile = this.userProfile_;
                return sEUserProfile == null ? SEUserProfile.getDefaultInstance() : sEUserProfile;
            }

            public SEUserProfile.Builder getUserProfileBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SEUserProfile.Builder) internalGetUserProfileFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
            public SEUserProfileOrBuilder getUserProfileOrBuilder() {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEUserProfileOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEUserProfile sEUserProfile = this.userProfile_;
                return sEUserProfile == null ? SEUserProfile.getDefaultInstance() : sEUserProfile;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
            public boolean hasLanguageId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
            public boolean hasTemperatureType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
            public boolean hasUnitType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
            public boolean hasUserProfile() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SEUserInformation_fieldAccessorTable.ensureFieldAccessorsInitialized(SEUserInformation.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUserProfile() && getUserProfile().isInitialized();
            }

            public Builder mergeUserProfile(SEUserProfile sEUserProfile) {
                SEUserProfile sEUserProfile2;
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEUserProfile);
                } else if ((this.bitField0_ & 1) == 0 || (sEUserProfile2 = this.userProfile_) == null || sEUserProfile2 == SEUserProfile.getDefaultInstance()) {
                    this.userProfile_ = sEUserProfile;
                } else {
                    getUserProfileBuilder().mergeFrom(sEUserProfile);
                }
                if (this.userProfile_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setLanguageId(SELanguageId sELanguageId) {
                sELanguageId.getClass();
                this.bitField0_ |= 2;
                this.languageId_ = sELanguageId.getNumber();
                onChanged();
                return this;
            }

            public Builder setTemperatureType(SETemperatureType sETemperatureType) {
                sETemperatureType.getClass();
                this.bitField0_ |= 8;
                this.temperatureType_ = sETemperatureType.getNumber();
                onChanged();
                return this;
            }

            public Builder setUnitType(SEUnitType sEUnitType) {
                sEUnitType.getClass();
                this.bitField0_ |= 4;
                this.unitType_ = sEUnitType.getNumber();
                onChanged();
                return this;
            }

            public Builder setUserProfile(SEUserProfile sEUserProfile) {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder == null) {
                    sEUserProfile.getClass();
                    this.userProfile_ = sEUserProfile;
                } else {
                    singleFieldBuilder.setMessage(sEUserProfile);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(r rVar) {
                this();
            }

            private Builder() {
                this.languageId_ = 1;
                this.unitType_ = 0;
                this.temperatureType_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEUserInformation build() {
                SEUserInformation sEUserInformationBuildPartial = buildPartial();
                if (sEUserInformationBuildPartial.isInitialized()) {
                    return sEUserInformationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEUserInformationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEUserInformation buildPartial() {
                SEUserInformation sEUserInformation = new SEUserInformation(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEUserInformation);
                }
                onBuilt();
                return sEUserInformation;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEUserInformation getDefaultInstanceForType() {
                return SEUserInformation.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.userProfile_ = null;
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.userProfileBuilder_ = null;
                }
                this.languageId_ = 1;
                this.unitType_ = 0;
                this.temperatureType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEUserInformation) {
                    return mergeFrom((SEUserInformation) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setUserProfile(SEUserProfile.Builder builder) {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder == null) {
                    this.userProfile_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.languageId_ = 1;
                this.unitType_ = 0;
                this.temperatureType_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(SEUserInformation sEUserInformation) {
                if (sEUserInformation == SEUserInformation.getDefaultInstance()) {
                    return this;
                }
                if (sEUserInformation.hasUserProfile()) {
                    mergeUserProfile(sEUserInformation.getUserProfile());
                }
                if (sEUserInformation.hasLanguageId()) {
                    setLanguageId(sEUserInformation.getLanguageId());
                }
                if (sEUserInformation.hasUnitType()) {
                    setUnitType(sEUserInformation.getUnitType());
                }
                if (sEUserInformation.hasTemperatureType()) {
                    setTemperatureType(sEUserInformation.getTemperatureType());
                }
                mergeUnknownFields(sEUserInformation.getUnknownFields());
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
                                    codedInputStream.readMessage(internalGetUserProfileFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i7 = codedInputStream.readEnum();
                                    if (SELanguageId.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.languageId_ = i7;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    int i8 = codedInputStream.readEnum();
                                    if (SEUnitType.forNumber(i8) == null) {
                                        mergeUnknownVarintField(3, i8);
                                    } else {
                                        this.unitType_ = i8;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i9 = codedInputStream.readEnum();
                                    if (SETemperatureType.forNumber(i9) == null) {
                                        mergeUnknownVarintField(4, i9);
                                    } else {
                                        this.temperatureType_ = i9;
                                        this.bitField0_ |= 8;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEUserInformation");
            DEFAULT_INSTANCE = new SEUserInformation();
            PARSER = new AbstractParser<SEUserInformation>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformation.1
                @Override // com.google.protobuf.Parser
                public SEUserInformation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEUserInformation.newBuilder();
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

        public /* synthetic */ SEUserInformation(GeneratedMessage.Builder builder, r rVar) {
            this(builder);
        }

        public static SEUserInformation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProfilesProtos.internal_static_SA_SEUserInformation_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEUserInformation parseDelimitedFrom(InputStream inputStream) {
            return (SEUserInformation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEUserInformation parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEUserInformation> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEUserInformation)) {
                return super.equals(obj);
            }
            SEUserInformation sEUserInformation = (SEUserInformation) obj;
            if (hasUserProfile() != sEUserInformation.hasUserProfile()) {
                return false;
            }
            if ((hasUserProfile() && !getUserProfile().equals(sEUserInformation.getUserProfile())) || hasLanguageId() != sEUserInformation.hasLanguageId()) {
                return false;
            }
            if ((hasLanguageId() && this.languageId_ != sEUserInformation.languageId_) || hasUnitType() != sEUserInformation.hasUnitType()) {
                return false;
            }
            if ((!hasUnitType() || this.unitType_ == sEUserInformation.unitType_) && hasTemperatureType() == sEUserInformation.hasTemperatureType()) {
                return (!hasTemperatureType() || this.temperatureType_ == sEUserInformation.temperatureType_) && getUnknownFields().equals(sEUserInformation.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UserProfilesProtos.internal_static_SA_SEUserInformation_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
        public SELanguageId getLanguageId() {
            SELanguageId sELanguageIdForNumber = SELanguageId.forNumber(this.languageId_);
            return sELanguageIdForNumber == null ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEUserInformation> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUserProfile()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.languageId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(3, this.unitType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(4, this.temperatureType_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
        public SETemperatureType getTemperatureType() {
            SETemperatureType sETemperatureTypeForNumber = SETemperatureType.forNumber(this.temperatureType_);
            return sETemperatureTypeForNumber == null ? SETemperatureType.CENTIGRADE : sETemperatureTypeForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
        public SEUnitType getUnitType() {
            SEUnitType sEUnitTypeForNumber = SEUnitType.forNumber(this.unitType_);
            return sEUnitTypeForNumber == null ? SEUnitType.METRIC_SYSTEM : sEUnitTypeForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
        public SEUserProfile getUserProfile() {
            SEUserProfile sEUserProfile = this.userProfile_;
            return sEUserProfile == null ? SEUserProfile.getDefaultInstance() : sEUserProfile;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
        public SEUserProfileOrBuilder getUserProfileOrBuilder() {
            SEUserProfile sEUserProfile = this.userProfile_;
            return sEUserProfile == null ? SEUserProfile.getDefaultInstance() : sEUserProfile;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
        public boolean hasLanguageId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
        public boolean hasTemperatureType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
        public boolean hasUnitType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserInformationOrBuilder
        public boolean hasUserProfile() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasUserProfile()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getUserProfile().hashCode();
            }
            if (hasLanguageId()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.languageId_;
            }
            if (hasUnitType()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.unitType_;
            }
            if (hasTemperatureType()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + this.temperatureType_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProfilesProtos.internal_static_SA_SEUserInformation_fieldAccessorTable.ensureFieldAccessorsInitialized(SEUserInformation.class, Builder.class);
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
            if (!hasUserProfile()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getUserProfile().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUserProfile());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.languageId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.unitType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.temperatureType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEUserInformation(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.languageId_ = 1;
            this.unitType_ = 0;
            this.temperatureType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEUserInformation sEUserInformation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEUserInformation);
        }

        public static SEUserInformation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEUserInformation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEUserInformation) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEUserInformation parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEUserInformation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEUserInformation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEUserInformation parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEUserInformation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEUserInformation() {
            this.memoizedIsInitialized = (byte) -1;
            this.languageId_ = 1;
            this.unitType_ = 0;
            this.temperatureType_ = 0;
        }

        public static SEUserInformation parseFrom(InputStream inputStream) {
            return (SEUserInformation) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEUserInformation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEUserInformation) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEUserInformation parseFrom(CodedInputStream codedInputStream) {
            return (SEUserInformation) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEUserInformation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEUserInformation) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEUserInformationOrBuilder extends MessageOrBuilder {
        SELanguageId getLanguageId();

        SETemperatureType getTemperatureType();

        SEUnitType getUnitType();

        SEUserProfile getUserProfile();

        SEUserProfileOrBuilder getUserProfileOrBuilder();

        boolean hasLanguageId();

        boolean hasTemperatureType();

        boolean hasUnitType();

        boolean hasUserProfile();
    }

    public static final class SEUserProfile extends GeneratedMessage implements SEUserProfileOrBuilder {
        public static final int AGE_FIELD_NUMBER = 4;
        public static final int APP_WEATHER_SWITCH_FIELD_NUMBER = 17;
        public static final int BIRTH_FIELD_NUMBER = 3;
        private static final SEUserProfile DEFAULT_INSTANCE;
        public static final int GOAL_ACTIVITY_DURATION_FIELD_NUMBER = 13;
        public static final int GOAL_ACTIVITY_DURATION_SWITCH_FIELD_NUMBER = 16;
        public static final int GOAL_CALORIE_FIELD_NUMBER = 7;
        public static final int GOAL_CALORIE_SWITCH_FIELD_NUMBER = 15;
        public static final int GOAL_DISTANCE_FIELD_NUMBER = 9;
        public static final int GOAL_DRINK_WATER_FIELD_NUMBER = 21;
        public static final int GOAL_SLEEP_HOUR_FIELD_NUMBER = 12;
        public static final int GOAL_STANDING_TIMES_FIELD_NUMBER = 10;
        public static final int GOAL_STEP_FIELD_NUMBER = 8;
        public static final int GOAL_STEP_SWITCH_FIELD_NUMBER = 14;
        public static final int HEIGHT_FIELD_NUMBER = 1;
        public static final int MAX_HR_FIELD_NUMBER = 6;
        private static final Parser<SEUserProfile> PARSER;
        public static final int SEX_FIELD_NUMBER = 5;
        public static final int USER_NAME_FIELD_NUMBER = 18;
        public static final int USER_SLEEP_END_TIME_FIELD_NUMBER = 20;
        public static final int USER_SLEEP_START_TIME_FIELD_NUMBER = 19;
        public static final int WEAR_MODE_FIELD_NUMBER = 11;
        public static final int WEIGHT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean aPPWeatherSwitch_;
        private int age_;
        private int birth_;
        private int bitField0_;
        private boolean goalActivityDurationSwitch_;
        private int goalActivityDuration_;
        private boolean goalCalorieSwitch_;
        private int goalCalorie_;
        private int goalDistance_;
        private int goalDrinkWater_;
        private int goalSleepHour_;
        private int goalStandingTimes_;
        private boolean goalStepSwitch_;
        private int goalStep_;
        private int height_;
        private int maxHr_;
        private byte memoizedIsInitialized;
        private int sex_;
        private volatile Object userName_;
        private CommonProtos.SESettingTime userSleepEndTime_;
        private CommonProtos.SESettingTime userSleepStartTime_;
        private int wearMode_;
        private float weight_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEUserProfile$1 */
        public class AnonymousClass1 extends AbstractParser<SEUserProfile> {
            @Override // com.google.protobuf.Parser
            public SEUserProfile parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEUserProfile.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEUserProfileOrBuilder {
            private boolean aPPWeatherSwitch_;
            private int age_;
            private int birth_;
            private int bitField0_;
            private boolean goalActivityDurationSwitch_;
            private int goalActivityDuration_;
            private boolean goalCalorieSwitch_;
            private int goalCalorie_;
            private int goalDistance_;
            private int goalDrinkWater_;
            private int goalSleepHour_;
            private int goalStandingTimes_;
            private boolean goalStepSwitch_;
            private int goalStep_;
            private int height_;
            private int maxHr_;
            private int sex_;
            private Object userName_;
            private SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> userSleepEndTimeBuilder_;
            private CommonProtos.SESettingTime userSleepEndTime_;
            private SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> userSleepStartTimeBuilder_;
            private CommonProtos.SESettingTime userSleepStartTime_;
            private int wearMode_;
            private float weight_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                this(builderParent);
            }

            private void buildPartial0(SEUserProfile sEUserProfile) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEUserProfile.height_ = this.height_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEUserProfile.weight_ = this.weight_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEUserProfile.birth_ = this.birth_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEUserProfile.age_ = this.age_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEUserProfile.sex_ = this.sex_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEUserProfile.maxHr_ = this.maxHr_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEUserProfile.goalCalorie_ = this.goalCalorie_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sEUserProfile.goalStep_ = this.goalStep_;
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    sEUserProfile.goalDistance_ = this.goalDistance_;
                    i7 |= 256;
                }
                if ((i8 & 512) != 0) {
                    sEUserProfile.goalStandingTimes_ = this.goalStandingTimes_;
                    i7 |= 512;
                }
                if ((i8 & 1024) != 0) {
                    sEUserProfile.wearMode_ = this.wearMode_;
                    i7 |= 1024;
                }
                if ((i8 & 2048) != 0) {
                    sEUserProfile.goalSleepHour_ = this.goalSleepHour_;
                    i7 |= 2048;
                }
                if ((i8 & 4096) != 0) {
                    sEUserProfile.goalActivityDuration_ = this.goalActivityDuration_;
                    i7 |= 4096;
                }
                if ((i8 & 8192) != 0) {
                    sEUserProfile.goalStepSwitch_ = this.goalStepSwitch_;
                    i7 |= 8192;
                }
                if ((i8 & 16384) != 0) {
                    sEUserProfile.goalCalorieSwitch_ = this.goalCalorieSwitch_;
                    i7 |= 16384;
                }
                if ((i8 & 32768) != 0) {
                    sEUserProfile.goalActivityDurationSwitch_ = this.goalActivityDurationSwitch_;
                    i7 |= 32768;
                }
                if ((i8 & 65536) != 0) {
                    sEUserProfile.aPPWeatherSwitch_ = this.aPPWeatherSwitch_;
                    i7 |= 65536;
                }
                if ((i8 & 131072) != 0) {
                    sEUserProfile.userName_ = this.userName_;
                    i7 |= 131072;
                }
                if ((i8 & 262144) != 0) {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepStartTimeBuilder_;
                    sEUserProfile.userSleepStartTime_ = singleFieldBuilder == null ? this.userSleepStartTime_ : (CommonProtos.SESettingTime) singleFieldBuilder.build();
                    i7 |= 262144;
                }
                if ((i8 & 524288) != 0) {
                    SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder2 = this.userSleepEndTimeBuilder_;
                    sEUserProfile.userSleepEndTime_ = singleFieldBuilder2 == null ? this.userSleepEndTime_ : (CommonProtos.SESettingTime) singleFieldBuilder2.build();
                    i7 |= 524288;
                }
                if ((i8 & 1048576) != 0) {
                    sEUserProfile.goalDrinkWater_ = this.goalDrinkWater_;
                    i7 |= 1048576;
                }
                sEUserProfile.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEUserProfile_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> internalGetUserSleepEndTimeFieldBuilder() {
                if (this.userSleepEndTimeBuilder_ == null) {
                    this.userSleepEndTimeBuilder_ = new SingleFieldBuilder<>(getUserSleepEndTime(), getParentForChildren(), isClean());
                    this.userSleepEndTime_ = null;
                }
                return this.userSleepEndTimeBuilder_;
            }

            private SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> internalGetUserSleepStartTimeFieldBuilder() {
                if (this.userSleepStartTimeBuilder_ == null) {
                    this.userSleepStartTimeBuilder_ = new SingleFieldBuilder<>(getUserSleepStartTime(), getParentForChildren(), isClean());
                    this.userSleepStartTime_ = null;
                }
                return this.userSleepStartTimeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetUserSleepStartTimeFieldBuilder();
                    internalGetUserSleepEndTimeFieldBuilder();
                }
            }

            public Builder clearAPPWeatherSwitch() {
                this.bitField0_ &= -65537;
                this.aPPWeatherSwitch_ = false;
                onChanged();
                return this;
            }

            public Builder clearAge() {
                this.bitField0_ &= -9;
                this.age_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBirth() {
                this.bitField0_ &= -5;
                this.birth_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGoalActivityDuration() {
                this.bitField0_ &= -4097;
                this.goalActivityDuration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGoalActivityDurationSwitch() {
                this.bitField0_ &= -32769;
                this.goalActivityDurationSwitch_ = false;
                onChanged();
                return this;
            }

            public Builder clearGoalCalorie() {
                this.bitField0_ &= -65;
                this.goalCalorie_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGoalCalorieSwitch() {
                this.bitField0_ &= -16385;
                this.goalCalorieSwitch_ = false;
                onChanged();
                return this;
            }

            public Builder clearGoalDistance() {
                this.bitField0_ &= -257;
                this.goalDistance_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGoalDrinkWater() {
                this.bitField0_ &= -1048577;
                this.goalDrinkWater_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGoalSleepHour() {
                this.bitField0_ &= -2049;
                this.goalSleepHour_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGoalStandingTimes() {
                this.bitField0_ &= -513;
                this.goalStandingTimes_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGoalStep() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.goalStep_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGoalStepSwitch() {
                this.bitField0_ &= -8193;
                this.goalStepSwitch_ = false;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.bitField0_ &= -2;
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxHr() {
                this.bitField0_ &= -33;
                this.maxHr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSex() {
                this.bitField0_ &= -17;
                this.sex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserName() {
                this.userName_ = SEUserProfile.getDefaultInstance().getUserName();
                this.bitField0_ &= -131073;
                onChanged();
                return this;
            }

            public Builder clearUserSleepEndTime() {
                this.bitField0_ &= -524289;
                this.userSleepEndTime_ = null;
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepEndTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.userSleepEndTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUserSleepStartTime() {
                this.bitField0_ &= -262145;
                this.userSleepStartTime_ = null;
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepStartTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.userSleepStartTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWearMode() {
                this.bitField0_ &= -1025;
                this.wearMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWeight() {
                this.bitField0_ &= -3;
                this.weight_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean getAPPWeatherSwitch() {
                return this.aPPWeatherSwitch_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getAge() {
                return this.age_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getBirth() {
                return this.birth_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEUserProfile_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getGoalActivityDuration() {
                return this.goalActivityDuration_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean getGoalActivityDurationSwitch() {
                return this.goalActivityDurationSwitch_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getGoalCalorie() {
                return this.goalCalorie_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean getGoalCalorieSwitch() {
                return this.goalCalorieSwitch_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getGoalDistance() {
                return this.goalDistance_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getGoalDrinkWater() {
                return this.goalDrinkWater_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getGoalSleepHour() {
                return this.goalSleepHour_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getGoalStandingTimes() {
                return this.goalStandingTimes_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getGoalStep() {
                return this.goalStep_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean getGoalStepSwitch() {
                return this.goalStepSwitch_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public int getMaxHr() {
                return this.maxHr_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public SESex getSex() {
                SESex sESexForNumber = SESex.forNumber(this.sex_);
                return sESexForNumber == null ? SESex.NEUTRAL : sESexForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public String getUserName() {
                Object obj = this.userName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.userName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public ByteString getUserNameBytes() {
                Object obj = this.userName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public CommonProtos.SESettingTime getUserSleepEndTime() {
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepEndTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SESettingTime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SESettingTime sESettingTime = this.userSleepEndTime_;
                return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
            }

            public CommonProtos.SESettingTime.Builder getUserSleepEndTimeBuilder() {
                this.bitField0_ |= 524288;
                onChanged();
                return (CommonProtos.SESettingTime.Builder) internalGetUserSleepEndTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public CommonProtos.SESettingTimeOrBuilder getUserSleepEndTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepEndTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SESettingTimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SESettingTime sESettingTime = this.userSleepEndTime_;
                return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public CommonProtos.SESettingTime getUserSleepStartTime() {
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepStartTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SESettingTime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SESettingTime sESettingTime = this.userSleepStartTime_;
                return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
            }

            public CommonProtos.SESettingTime.Builder getUserSleepStartTimeBuilder() {
                this.bitField0_ |= 262144;
                onChanged();
                return (CommonProtos.SESettingTime.Builder) internalGetUserSleepStartTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public CommonProtos.SESettingTimeOrBuilder getUserSleepStartTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepStartTimeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SESettingTimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SESettingTime sESettingTime = this.userSleepStartTime_;
                return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public SEWearMode getWearMode() {
                SEWearMode sEWearModeForNumber = SEWearMode.forNumber(this.wearMode_);
                return sEWearModeForNumber == null ? SEWearMode.NotSet : sEWearModeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public float getWeight() {
                return this.weight_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasAPPWeatherSwitch() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasAge() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasBirth() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalActivityDuration() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalActivityDurationSwitch() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalCalorie() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalCalorieSwitch() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalDistance() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalDrinkWater() {
                return (this.bitField0_ & 1048576) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalSleepHour() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalStandingTimes() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalStep() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasGoalStepSwitch() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasHeight() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasMaxHr() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasSex() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasUserName() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasUserSleepEndTime() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasUserSleepStartTime() {
                return (this.bitField0_ & 262144) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasWearMode() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
            public boolean hasWeight() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SEUserProfile_fieldAccessorTable.ensureFieldAccessorsInitialized(SEUserProfile.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasUserSleepStartTime() || getUserSleepStartTime().isInitialized()) {
                    return !hasUserSleepEndTime() || getUserSleepEndTime().isInitialized();
                }
                return false;
            }

            public Builder mergeUserSleepEndTime(CommonProtos.SESettingTime sESettingTime) {
                CommonProtos.SESettingTime sESettingTime2;
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepEndTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sESettingTime);
                } else if ((this.bitField0_ & 524288) == 0 || (sESettingTime2 = this.userSleepEndTime_) == null || sESettingTime2 == CommonProtos.SESettingTime.getDefaultInstance()) {
                    this.userSleepEndTime_ = sESettingTime;
                } else {
                    getUserSleepEndTimeBuilder().mergeFrom(sESettingTime);
                }
                if (this.userSleepEndTime_ != null) {
                    this.bitField0_ |= 524288;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUserSleepStartTime(CommonProtos.SESettingTime sESettingTime) {
                CommonProtos.SESettingTime sESettingTime2;
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepStartTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sESettingTime);
                } else if ((this.bitField0_ & 262144) == 0 || (sESettingTime2 = this.userSleepStartTime_) == null || sESettingTime2 == CommonProtos.SESettingTime.getDefaultInstance()) {
                    this.userSleepStartTime_ = sESettingTime;
                } else {
                    getUserSleepStartTimeBuilder().mergeFrom(sESettingTime);
                }
                if (this.userSleepStartTime_ != null) {
                    this.bitField0_ |= 262144;
                    onChanged();
                }
                return this;
            }

            public Builder setAPPWeatherSwitch(boolean z6) {
                this.aPPWeatherSwitch_ = z6;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setAge(int i7) {
                this.age_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBirth(int i7) {
                this.birth_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGoalActivityDuration(int i7) {
                this.goalActivityDuration_ = i7;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setGoalActivityDurationSwitch(boolean z6) {
                this.goalActivityDurationSwitch_ = z6;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setGoalCalorie(int i7) {
                this.goalCalorie_ = i7;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setGoalCalorieSwitch(boolean z6) {
                this.goalCalorieSwitch_ = z6;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setGoalDistance(int i7) {
                this.goalDistance_ = i7;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setGoalDrinkWater(int i7) {
                this.goalDrinkWater_ = i7;
                this.bitField0_ |= 1048576;
                onChanged();
                return this;
            }

            public Builder setGoalSleepHour(int i7) {
                this.goalSleepHour_ = i7;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setGoalStandingTimes(int i7) {
                this.goalStandingTimes_ = i7;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setGoalStep(int i7) {
                this.goalStep_ = i7;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setGoalStepSwitch(boolean z6) {
                this.goalStepSwitch_ = z6;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setHeight(int i7) {
                this.height_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMaxHr(int i7) {
                this.maxHr_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSex(SESex sESex) {
                sESex.getClass();
                this.bitField0_ |= 16;
                this.sex_ = sESex.getNumber();
                onChanged();
                return this;
            }

            public Builder setUserName(String str) {
                str.getClass();
                this.userName_ = str;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                byteString.getClass();
                this.userName_ = byteString;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setUserSleepEndTime(CommonProtos.SESettingTime sESettingTime) {
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepEndTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sESettingTime.getClass();
                    this.userSleepEndTime_ = sESettingTime;
                } else {
                    singleFieldBuilder.setMessage(sESettingTime);
                }
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setUserSleepStartTime(CommonProtos.SESettingTime sESettingTime) {
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepStartTimeBuilder_;
                if (singleFieldBuilder == null) {
                    sESettingTime.getClass();
                    this.userSleepStartTime_ = sESettingTime;
                } else {
                    singleFieldBuilder.setMessage(sESettingTime);
                }
                this.bitField0_ |= 262144;
                onChanged();
                return this;
            }

            public Builder setWearMode(SEWearMode sEWearMode) {
                sEWearMode.getClass();
                this.bitField0_ |= 1024;
                this.wearMode_ = sEWearMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setWeight(float f7) {
                this.weight_ = f7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(r rVar) {
                this();
            }

            private Builder() {
                this.sex_ = 0;
                this.wearMode_ = 0;
                this.userName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEUserProfile build() {
                SEUserProfile sEUserProfileBuildPartial = buildPartial();
                if (sEUserProfileBuildPartial.isInitialized()) {
                    return sEUserProfileBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEUserProfileBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEUserProfile buildPartial() {
                SEUserProfile sEUserProfile = new SEUserProfile(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEUserProfile);
                }
                onBuilt();
                return sEUserProfile;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEUserProfile getDefaultInstanceForType() {
                return SEUserProfile.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.height_ = 0;
                this.weight_ = 0.0f;
                this.birth_ = 0;
                this.age_ = 0;
                this.sex_ = 0;
                this.maxHr_ = 0;
                this.goalCalorie_ = 0;
                this.goalStep_ = 0;
                this.goalDistance_ = 0;
                this.goalStandingTimes_ = 0;
                this.wearMode_ = 0;
                this.goalSleepHour_ = 0;
                this.goalActivityDuration_ = 0;
                this.goalStepSwitch_ = false;
                this.goalCalorieSwitch_ = false;
                this.goalActivityDurationSwitch_ = false;
                this.aPPWeatherSwitch_ = false;
                this.userName_ = "";
                this.userSleepStartTime_ = null;
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepStartTimeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.userSleepStartTimeBuilder_ = null;
                }
                this.userSleepEndTime_ = null;
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder2 = this.userSleepEndTimeBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.dispose();
                    this.userSleepEndTimeBuilder_ = null;
                }
                this.goalDrinkWater_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEUserProfile) {
                    return mergeFrom((SEUserProfile) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setUserSleepEndTime(CommonProtos.SESettingTime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepEndTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.userSleepEndTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setUserSleepStartTime(CommonProtos.SESettingTime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SESettingTime, CommonProtos.SESettingTime.Builder, CommonProtos.SESettingTimeOrBuilder> singleFieldBuilder = this.userSleepStartTimeBuilder_;
                if (singleFieldBuilder == null) {
                    this.userSleepStartTime_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 262144;
                onChanged();
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.sex_ = 0;
                this.wearMode_ = 0;
                this.userName_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(SEUserProfile sEUserProfile) {
                if (sEUserProfile == SEUserProfile.getDefaultInstance()) {
                    return this;
                }
                if (sEUserProfile.hasHeight()) {
                    setHeight(sEUserProfile.getHeight());
                }
                if (sEUserProfile.hasWeight()) {
                    setWeight(sEUserProfile.getWeight());
                }
                if (sEUserProfile.hasBirth()) {
                    setBirth(sEUserProfile.getBirth());
                }
                if (sEUserProfile.hasAge()) {
                    setAge(sEUserProfile.getAge());
                }
                if (sEUserProfile.hasSex()) {
                    setSex(sEUserProfile.getSex());
                }
                if (sEUserProfile.hasMaxHr()) {
                    setMaxHr(sEUserProfile.getMaxHr());
                }
                if (sEUserProfile.hasGoalCalorie()) {
                    setGoalCalorie(sEUserProfile.getGoalCalorie());
                }
                if (sEUserProfile.hasGoalStep()) {
                    setGoalStep(sEUserProfile.getGoalStep());
                }
                if (sEUserProfile.hasGoalDistance()) {
                    setGoalDistance(sEUserProfile.getGoalDistance());
                }
                if (sEUserProfile.hasGoalStandingTimes()) {
                    setGoalStandingTimes(sEUserProfile.getGoalStandingTimes());
                }
                if (sEUserProfile.hasWearMode()) {
                    setWearMode(sEUserProfile.getWearMode());
                }
                if (sEUserProfile.hasGoalSleepHour()) {
                    setGoalSleepHour(sEUserProfile.getGoalSleepHour());
                }
                if (sEUserProfile.hasGoalActivityDuration()) {
                    setGoalActivityDuration(sEUserProfile.getGoalActivityDuration());
                }
                if (sEUserProfile.hasGoalStepSwitch()) {
                    setGoalStepSwitch(sEUserProfile.getGoalStepSwitch());
                }
                if (sEUserProfile.hasGoalCalorieSwitch()) {
                    setGoalCalorieSwitch(sEUserProfile.getGoalCalorieSwitch());
                }
                if (sEUserProfile.hasGoalActivityDurationSwitch()) {
                    setGoalActivityDurationSwitch(sEUserProfile.getGoalActivityDurationSwitch());
                }
                if (sEUserProfile.hasAPPWeatherSwitch()) {
                    setAPPWeatherSwitch(sEUserProfile.getAPPWeatherSwitch());
                }
                if (sEUserProfile.hasUserName()) {
                    this.userName_ = sEUserProfile.userName_;
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                if (sEUserProfile.hasUserSleepStartTime()) {
                    mergeUserSleepStartTime(sEUserProfile.getUserSleepStartTime());
                }
                if (sEUserProfile.hasUserSleepEndTime()) {
                    mergeUserSleepEndTime(sEUserProfile.getUserSleepEndTime());
                }
                if (sEUserProfile.hasGoalDrinkWater()) {
                    setGoalDrinkWater(sEUserProfile.getGoalDrinkWater());
                }
                mergeUnknownFields(sEUserProfile.getUnknownFields());
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
                                    this.height_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    break;
                                case 21:
                                    this.weight_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                    break;
                                case 24:
                                    this.birth_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    break;
                                case 32:
                                    this.age_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    break;
                                case 40:
                                    int i7 = codedInputStream.readEnum();
                                    if (SESex.forNumber(i7) == null) {
                                        mergeUnknownVarintField(5, i7);
                                    } else {
                                        this.sex_ = i7;
                                        this.bitField0_ |= 16;
                                    }
                                    break;
                                case 48:
                                    this.maxHr_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    break;
                                case 56:
                                    this.goalCalorie_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.goalStep_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 72:
                                    this.goalDistance_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    break;
                                case 80:
                                    this.goalStandingTimes_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
                                    break;
                                case 88:
                                    int i8 = codedInputStream.readEnum();
                                    if (SEWearMode.forNumber(i8) == null) {
                                        mergeUnknownVarintField(11, i8);
                                    } else {
                                        this.wearMode_ = i8;
                                        this.bitField0_ |= 1024;
                                    }
                                    break;
                                case 96:
                                    this.goalSleepHour_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 104:
                                    this.goalActivityDuration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4096;
                                    break;
                                case 112:
                                    this.goalStepSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 120:
                                    this.goalCalorieSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16384;
                                    break;
                                case 128:
                                    this.goalActivityDurationSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32768;
                                    break;
                                case 136:
                                    this.aPPWeatherSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 65536;
                                    break;
                                case 146:
                                    this.userName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 131072;
                                    break;
                                case 154:
                                    codedInputStream.readMessage(internalGetUserSleepStartTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 262144;
                                    break;
                                case 162:
                                    codedInputStream.readMessage(internalGetUserSleepEndTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 524288;
                                    break;
                                case 168:
                                    this.goalDrinkWater_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1048576;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEUserProfile");
            DEFAULT_INSTANCE = new SEUserProfile();
            PARSER = new AbstractParser<SEUserProfile>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfile.1
                @Override // com.google.protobuf.Parser
                public SEUserProfile parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEUserProfile.newBuilder();
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

        public /* synthetic */ SEUserProfile(GeneratedMessage.Builder builder, r rVar) {
            this(builder);
        }

        public static SEUserProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProfilesProtos.internal_static_SA_SEUserProfile_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEUserProfile parseDelimitedFrom(InputStream inputStream) {
            return (SEUserProfile) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEUserProfile parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEUserProfile> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEUserProfile)) {
                return super.equals(obj);
            }
            SEUserProfile sEUserProfile = (SEUserProfile) obj;
            if (hasHeight() != sEUserProfile.hasHeight()) {
                return false;
            }
            if ((hasHeight() && getHeight() != sEUserProfile.getHeight()) || hasWeight() != sEUserProfile.hasWeight()) {
                return false;
            }
            if ((hasWeight() && Float.floatToIntBits(getWeight()) != Float.floatToIntBits(sEUserProfile.getWeight())) || hasBirth() != sEUserProfile.hasBirth()) {
                return false;
            }
            if ((hasBirth() && getBirth() != sEUserProfile.getBirth()) || hasAge() != sEUserProfile.hasAge()) {
                return false;
            }
            if ((hasAge() && getAge() != sEUserProfile.getAge()) || hasSex() != sEUserProfile.hasSex()) {
                return false;
            }
            if ((hasSex() && this.sex_ != sEUserProfile.sex_) || hasMaxHr() != sEUserProfile.hasMaxHr()) {
                return false;
            }
            if ((hasMaxHr() && getMaxHr() != sEUserProfile.getMaxHr()) || hasGoalCalorie() != sEUserProfile.hasGoalCalorie()) {
                return false;
            }
            if ((hasGoalCalorie() && getGoalCalorie() != sEUserProfile.getGoalCalorie()) || hasGoalStep() != sEUserProfile.hasGoalStep()) {
                return false;
            }
            if ((hasGoalStep() && getGoalStep() != sEUserProfile.getGoalStep()) || hasGoalDistance() != sEUserProfile.hasGoalDistance()) {
                return false;
            }
            if ((hasGoalDistance() && getGoalDistance() != sEUserProfile.getGoalDistance()) || hasGoalStandingTimes() != sEUserProfile.hasGoalStandingTimes()) {
                return false;
            }
            if ((hasGoalStandingTimes() && getGoalStandingTimes() != sEUserProfile.getGoalStandingTimes()) || hasWearMode() != sEUserProfile.hasWearMode()) {
                return false;
            }
            if ((hasWearMode() && this.wearMode_ != sEUserProfile.wearMode_) || hasGoalSleepHour() != sEUserProfile.hasGoalSleepHour()) {
                return false;
            }
            if ((hasGoalSleepHour() && getGoalSleepHour() != sEUserProfile.getGoalSleepHour()) || hasGoalActivityDuration() != sEUserProfile.hasGoalActivityDuration()) {
                return false;
            }
            if ((hasGoalActivityDuration() && getGoalActivityDuration() != sEUserProfile.getGoalActivityDuration()) || hasGoalStepSwitch() != sEUserProfile.hasGoalStepSwitch()) {
                return false;
            }
            if ((hasGoalStepSwitch() && getGoalStepSwitch() != sEUserProfile.getGoalStepSwitch()) || hasGoalCalorieSwitch() != sEUserProfile.hasGoalCalorieSwitch()) {
                return false;
            }
            if ((hasGoalCalorieSwitch() && getGoalCalorieSwitch() != sEUserProfile.getGoalCalorieSwitch()) || hasGoalActivityDurationSwitch() != sEUserProfile.hasGoalActivityDurationSwitch()) {
                return false;
            }
            if ((hasGoalActivityDurationSwitch() && getGoalActivityDurationSwitch() != sEUserProfile.getGoalActivityDurationSwitch()) || hasAPPWeatherSwitch() != sEUserProfile.hasAPPWeatherSwitch()) {
                return false;
            }
            if ((hasAPPWeatherSwitch() && getAPPWeatherSwitch() != sEUserProfile.getAPPWeatherSwitch()) || hasUserName() != sEUserProfile.hasUserName()) {
                return false;
            }
            if ((hasUserName() && !getUserName().equals(sEUserProfile.getUserName())) || hasUserSleepStartTime() != sEUserProfile.hasUserSleepStartTime()) {
                return false;
            }
            if ((hasUserSleepStartTime() && !getUserSleepStartTime().equals(sEUserProfile.getUserSleepStartTime())) || hasUserSleepEndTime() != sEUserProfile.hasUserSleepEndTime()) {
                return false;
            }
            if ((!hasUserSleepEndTime() || getUserSleepEndTime().equals(sEUserProfile.getUserSleepEndTime())) && hasGoalDrinkWater() == sEUserProfile.hasGoalDrinkWater()) {
                return (!hasGoalDrinkWater() || getGoalDrinkWater() == sEUserProfile.getGoalDrinkWater()) && getUnknownFields().equals(sEUserProfile.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean getAPPWeatherSwitch() {
            return this.aPPWeatherSwitch_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getAge() {
            return this.age_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getBirth() {
            return this.birth_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UserProfilesProtos.internal_static_SA_SEUserProfile_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getGoalActivityDuration() {
            return this.goalActivityDuration_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean getGoalActivityDurationSwitch() {
            return this.goalActivityDurationSwitch_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getGoalCalorie() {
            return this.goalCalorie_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean getGoalCalorieSwitch() {
            return this.goalCalorieSwitch_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getGoalDistance() {
            return this.goalDistance_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getGoalDrinkWater() {
            return this.goalDrinkWater_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getGoalSleepHour() {
            return this.goalSleepHour_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getGoalStandingTimes() {
            return this.goalStandingTimes_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getGoalStep() {
            return this.goalStep_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean getGoalStepSwitch() {
            return this.goalStepSwitch_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public int getMaxHr() {
            return this.maxHr_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEUserProfile> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.height_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(2, this.weight_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.birth_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.age_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(5, this.sex_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.maxHr_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.goalCalorie_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(8, this.goalStep_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(9, this.goalDistance_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(10, this.goalStandingTimes_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(11, this.wearMode_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(12, this.goalSleepHour_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(13, this.goalActivityDuration_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(14, this.goalStepSwitch_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(15, this.goalCalorieSwitch_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(16, this.goalActivityDurationSwitch_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(17, this.aPPWeatherSwitch_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(18, this.userName_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(19, getUserSleepStartTime());
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(20, getUserSleepEndTime());
            }
            if ((this.bitField0_ & 1048576) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(21, this.goalDrinkWater_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public SESex getSex() {
            SESex sESexForNumber = SESex.forNumber(this.sex_);
            return sESexForNumber == null ? SESex.NEUTRAL : sESexForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public String getUserName() {
            Object obj = this.userName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.userName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public ByteString getUserNameBytes() {
            Object obj = this.userName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public CommonProtos.SESettingTime getUserSleepEndTime() {
            CommonProtos.SESettingTime sESettingTime = this.userSleepEndTime_;
            return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public CommonProtos.SESettingTimeOrBuilder getUserSleepEndTimeOrBuilder() {
            CommonProtos.SESettingTime sESettingTime = this.userSleepEndTime_;
            return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public CommonProtos.SESettingTime getUserSleepStartTime() {
            CommonProtos.SESettingTime sESettingTime = this.userSleepStartTime_;
            return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public CommonProtos.SESettingTimeOrBuilder getUserSleepStartTimeOrBuilder() {
            CommonProtos.SESettingTime sESettingTime = this.userSleepStartTime_;
            return sESettingTime == null ? CommonProtos.SESettingTime.getDefaultInstance() : sESettingTime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public SEWearMode getWearMode() {
            SEWearMode sEWearModeForNumber = SEWearMode.forNumber(this.wearMode_);
            return sEWearModeForNumber == null ? SEWearMode.NotSet : sEWearModeForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public float getWeight() {
            return this.weight_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasAPPWeatherSwitch() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasAge() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasBirth() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalActivityDuration() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalActivityDurationSwitch() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalCalorie() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalCalorieSwitch() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalDistance() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalDrinkWater() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalSleepHour() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalStandingTimes() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalStep() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasGoalStepSwitch() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasHeight() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasMaxHr() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasSex() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasUserName() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasUserSleepEndTime() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasUserSleepStartTime() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasWearMode() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserProfileOrBuilder
        public boolean hasWeight() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasHeight()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getHeight();
            }
            if (hasWeight()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Float.floatToIntBits(getWeight());
            }
            if (hasBirth()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getBirth();
            }
            if (hasAge()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getAge();
            }
            if (hasSex()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + this.sex_;
            }
            if (hasMaxHr()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getMaxHr();
            }
            if (hasGoalCalorie()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getGoalCalorie();
            }
            if (hasGoalStep()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getGoalStep();
            }
            if (hasGoalDistance()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getGoalDistance();
            }
            if (hasGoalStandingTimes()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getGoalStandingTimes();
            }
            if (hasWearMode()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + this.wearMode_;
            }
            if (hasGoalSleepHour()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + getGoalSleepHour();
            }
            if (hasGoalActivityDuration()) {
                iHashCode = (((iHashCode * 37) + 13) * 53) + getGoalActivityDuration();
            }
            if (hasGoalStepSwitch()) {
                iHashCode = (((iHashCode * 37) + 14) * 53) + Internal.hashBoolean(getGoalStepSwitch());
            }
            if (hasGoalCalorieSwitch()) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + Internal.hashBoolean(getGoalCalorieSwitch());
            }
            if (hasGoalActivityDurationSwitch()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + Internal.hashBoolean(getGoalActivityDurationSwitch());
            }
            if (hasAPPWeatherSwitch()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + Internal.hashBoolean(getAPPWeatherSwitch());
            }
            if (hasUserName()) {
                iHashCode = (((iHashCode * 37) + 18) * 53) + getUserName().hashCode();
            }
            if (hasUserSleepStartTime()) {
                iHashCode = (((iHashCode * 37) + 19) * 53) + getUserSleepStartTime().hashCode();
            }
            if (hasUserSleepEndTime()) {
                iHashCode = (((iHashCode * 37) + 20) * 53) + getUserSleepEndTime().hashCode();
            }
            if (hasGoalDrinkWater()) {
                iHashCode = (((iHashCode * 37) + 21) * 53) + getGoalDrinkWater();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProfilesProtos.internal_static_SA_SEUserProfile_fieldAccessorTable.ensureFieldAccessorsInitialized(SEUserProfile.class, Builder.class);
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
            if (hasUserSleepStartTime() && !getUserSleepStartTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasUserSleepEndTime() || getUserSleepEndTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.height_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.weight_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.birth_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.age_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.sex_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.maxHr_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.goalCalorie_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.goalStep_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.goalDistance_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.goalStandingTimes_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeEnum(11, this.wearMode_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(12, this.goalSleepHour_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeUInt32(13, this.goalActivityDuration_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeBool(14, this.goalStepSwitch_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeBool(15, this.goalCalorieSwitch_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeBool(16, this.goalActivityDurationSwitch_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeBool(17, this.aPPWeatherSwitch_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 18, this.userName_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                codedOutputStream.writeMessage(19, getUserSleepStartTime());
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeMessage(20, getUserSleepEndTime());
            }
            if ((this.bitField0_ & 1048576) != 0) {
                codedOutputStream.writeUInt32(21, this.goalDrinkWater_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEUserProfile(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.height_ = 0;
            this.weight_ = 0.0f;
            this.birth_ = 0;
            this.age_ = 0;
            this.sex_ = 0;
            this.maxHr_ = 0;
            this.goalCalorie_ = 0;
            this.goalStep_ = 0;
            this.goalDistance_ = 0;
            this.goalStandingTimes_ = 0;
            this.wearMode_ = 0;
            this.goalSleepHour_ = 0;
            this.goalActivityDuration_ = 0;
            this.goalStepSwitch_ = false;
            this.goalCalorieSwitch_ = false;
            this.goalActivityDurationSwitch_ = false;
            this.aPPWeatherSwitch_ = false;
            this.userName_ = "";
            this.goalDrinkWater_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEUserProfile sEUserProfile) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEUserProfile);
        }

        public static SEUserProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEUserProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEUserProfile) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEUserProfile parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEUserProfile getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEUserProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEUserProfile parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEUserProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEUserProfile parseFrom(InputStream inputStream) {
            return (SEUserProfile) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEUserProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEUserProfile) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEUserProfile parseFrom(CodedInputStream codedInputStream) {
            return (SEUserProfile) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEUserProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEUserProfile) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SEUserProfile() {
            this.height_ = 0;
            this.weight_ = 0.0f;
            this.birth_ = 0;
            this.age_ = 0;
            this.sex_ = 0;
            this.maxHr_ = 0;
            this.goalCalorie_ = 0;
            this.goalStep_ = 0;
            this.goalDistance_ = 0;
            this.goalStandingTimes_ = 0;
            this.wearMode_ = 0;
            this.goalSleepHour_ = 0;
            this.goalActivityDuration_ = 0;
            this.goalStepSwitch_ = false;
            this.goalCalorieSwitch_ = false;
            this.goalActivityDurationSwitch_ = false;
            this.aPPWeatherSwitch_ = false;
            this.userName_ = "";
            this.goalDrinkWater_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.sex_ = 0;
            this.wearMode_ = 0;
            this.userName_ = "";
        }
    }

    public interface SEUserProfileOrBuilder extends MessageOrBuilder {
        boolean getAPPWeatherSwitch();

        int getAge();

        int getBirth();

        int getGoalActivityDuration();

        boolean getGoalActivityDurationSwitch();

        int getGoalCalorie();

        boolean getGoalCalorieSwitch();

        int getGoalDistance();

        int getGoalDrinkWater();

        int getGoalSleepHour();

        int getGoalStandingTimes();

        int getGoalStep();

        boolean getGoalStepSwitch();

        int getHeight();

        int getMaxHr();

        SESex getSex();

        String getUserName();

        ByteString getUserNameBytes();

        CommonProtos.SESettingTime getUserSleepEndTime();

        CommonProtos.SESettingTimeOrBuilder getUserSleepEndTimeOrBuilder();

        CommonProtos.SESettingTime getUserSleepStartTime();

        CommonProtos.SESettingTimeOrBuilder getUserSleepStartTimeOrBuilder();

        SEWearMode getWearMode();

        float getWeight();

        boolean hasAPPWeatherSwitch();

        boolean hasAge();

        boolean hasBirth();

        boolean hasGoalActivityDuration();

        boolean hasGoalActivityDurationSwitch();

        boolean hasGoalCalorie();

        boolean hasGoalCalorieSwitch();

        boolean hasGoalDistance();

        boolean hasGoalDrinkWater();

        boolean hasGoalSleepHour();

        boolean hasGoalStandingTimes();

        boolean hasGoalStep();

        boolean hasGoalStepSwitch();

        boolean hasHeight();

        boolean hasMaxHr();

        boolean hasSex();

        boolean hasUserName();

        boolean hasUserSleepEndTime();

        boolean hasUserSleepStartTime();

        boolean hasWearMode();

        boolean hasWeight();
    }

    public enum SEUserSetting_UserSettingID implements ProtocolMessageEnum {
        SET_LANGUAGE_ID(0),
        GET_LANGUAGE_DETAILED(1),
        SET_UNIT_TYPE(2),
        SET_TEMPERATURE_TYPE(3),
        SET_USER_PROFILE(4),
        SET_USER_INFORMATION(5),
        GET_USER_PROFILE(6),
        SET_GOMORE_ALLDAY_SLEEP_CONFIG(7),
        GET_GOMORE_ALLDAY_SLEEP_CONFIG(8),
        SET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG(9),
        GET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG(10),
        SET_CHILD_INFO(11),
        GET_CHILD_INFO(12),
        GET_PARENTS_INFO(13),
        DELETE_PARENTS_INFO(14);

        public static final int DELETE_PARENTS_INFO_VALUE = 14;
        public static final int GET_CHILD_INFO_VALUE = 12;
        public static final int GET_GOMORE_ALLDAY_SLEEP_CONFIG_VALUE = 8;
        public static final int GET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG_VALUE = 10;
        public static final int GET_LANGUAGE_DETAILED_VALUE = 1;
        public static final int GET_PARENTS_INFO_VALUE = 13;
        public static final int GET_USER_PROFILE_VALUE = 6;
        public static final int SET_CHILD_INFO_VALUE = 11;
        public static final int SET_GOMORE_ALLDAY_SLEEP_CONFIG_VALUE = 7;
        public static final int SET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG_VALUE = 9;
        public static final int SET_LANGUAGE_ID_VALUE = 0;
        public static final int SET_TEMPERATURE_TYPE_VALUE = 3;
        public static final int SET_UNIT_TYPE_VALUE = 2;
        public static final int SET_USER_INFORMATION_VALUE = 5;
        public static final int SET_USER_PROFILE_VALUE = 4;
        private static final SEUserSetting_UserSettingID[] VALUES;
        private static final Internal.EnumLiteMap<SEUserSetting_UserSettingID> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEUserSetting_UserSettingID$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEUserSetting_UserSettingID> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEUserSetting_UserSettingID findValueByNumber(int i7) {
                return SEUserSetting_UserSettingID.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEUserSetting_UserSettingID");
            internalValueMap = new Internal.EnumLiteMap<SEUserSetting_UserSettingID>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSetting_UserSettingID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEUserSetting_UserSettingID findValueByNumber(int i7) {
                    return SEUserSetting_UserSettingID.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEUserSetting_UserSettingID(int i7) {
            this.value = i7;
        }

        public static SEUserSetting_UserSettingID forNumber(int i7) {
            switch (i7) {
                case 0:
                    return SET_LANGUAGE_ID;
                case 1:
                    return GET_LANGUAGE_DETAILED;
                case 2:
                    return SET_UNIT_TYPE;
                case 3:
                    return SET_TEMPERATURE_TYPE;
                case 4:
                    return SET_USER_PROFILE;
                case 5:
                    return SET_USER_INFORMATION;
                case 6:
                    return GET_USER_PROFILE;
                case 7:
                    return SET_GOMORE_ALLDAY_SLEEP_CONFIG;
                case 8:
                    return GET_GOMORE_ALLDAY_SLEEP_CONFIG;
                case 9:
                    return SET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG;
                case 10:
                    return GET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG;
                case 11:
                    return SET_CHILD_INFO;
                case 12:
                    return GET_CHILD_INFO;
                case 13:
                    return GET_PARENTS_INFO;
                case 14:
                    return DELETE_PARENTS_INFO;
                default:
                    return null;
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return UserProfilesProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEUserSetting_UserSettingID> internalGetValueMap() {
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
        public static SEUserSetting_UserSettingID valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEUserSetting_UserSettingID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEUserSettings extends GeneratedMessage implements SEUserSettingsOrBuilder {
        public static final int CHILD_INFO_FIELD_NUMBER = 9;
        private static final SEUserSettings DEFAULT_INSTANCE;
        public static final int LANGUAGE_DETAILED_FIELD_NUMBER = 2;
        public static final int LANGUAGE_ID_FIELD_NUMBER = 1;
        public static final int PARENTS_ID_FIELD_NUMBER = 11;
        public static final int PARENTS_INFO_FIELD_NUMBER = 10;
        private static final Parser<SEUserSettings> PARSER;
        public static final int TEMPERATURE_TYPE_FIELD_NUMBER = 4;
        public static final int UNIT_TYPE_FIELD_NUMBER = 3;
        public static final int USER_GOMORE_ALLDAY_SLEEP_FIELD_NUMBER = 7;
        public static final int USER_GOMORE_AUTO_ACTIVE_SPORT_FIELD_NUMBER = 8;
        public static final int USER_INFORMATION_FIELD_NUMBER = 6;
        public static final int USER_PROFILE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEUserSettings$1 */
        public class AnonymousClass1 extends AbstractParser<SEUserSettings> {
            @Override // com.google.protobuf.Parser
            public SEUserSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEUserSettings.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEUserSettingsOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> childInfoBuilder_;
            private SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> languageDetailedBuilder_;
            private SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> parentsIdBuilder_;
            private SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> parentsInfoBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> userGomoreAlldaySleepBuilder_;
            private SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> userGomoreAutoActiveSportBuilder_;
            private SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> userInformationBuilder_;
            private SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> userProfileBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, r rVar) {
                this(builderParent);
            }

            private void buildPartial0(SEUserSettings sEUserSettings) {
            }

            private void buildPartialOneofs(SEUserSettings sEUserSettings) {
                SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> singleFieldBuilder6;
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder7;
                SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> singleFieldBuilder8;
                int i7 = this.payloadCase_;
                sEUserSettings.payloadCase_ = i7;
                sEUserSettings.payload_ = this.payload_;
                if (i7 == 2 && (singleFieldBuilder8 = this.languageDetailedBuilder_) != null) {
                    sEUserSettings.payload_ = singleFieldBuilder8.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder7 = this.userProfileBuilder_) != null) {
                    sEUserSettings.payload_ = singleFieldBuilder7.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder6 = this.userInformationBuilder_) != null) {
                    sEUserSettings.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder5 = this.userGomoreAlldaySleepBuilder_) != null) {
                    sEUserSettings.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 8 && (singleFieldBuilder4 = this.userGomoreAutoActiveSportBuilder_) != null) {
                    sEUserSettings.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 9 && (singleFieldBuilder3 = this.childInfoBuilder_) != null) {
                    sEUserSettings.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 10 && (singleFieldBuilder2 = this.parentsInfoBuilder_) != null) {
                    sEUserSettings.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 11 || (singleFieldBuilder = this.parentsIdBuilder_) == null) {
                    return;
                }
                sEUserSettings.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProfilesProtos.internal_static_SA_SEUserSettings_descriptor;
            }

            private SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> internalGetChildInfoFieldBuilder() {
                if (this.childInfoBuilder_ == null) {
                    if (this.payloadCase_ != 9) {
                        this.payload_ = SEChildrenInfo.getDefaultInstance();
                    }
                    this.childInfoBuilder_ = new SingleFieldBuilder<>((SEChildrenInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 9;
                onChanged();
                return this.childInfoBuilder_;
            }

            private SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> internalGetLanguageDetailedFieldBuilder() {
                if (this.languageDetailedBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SELanguageDetailed.getDefaultInstance();
                    }
                    this.languageDetailedBuilder_ = new SingleFieldBuilder<>((SELanguageDetailed) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.languageDetailedBuilder_;
            }

            private SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> internalGetParentsIdFieldBuilder() {
                if (this.parentsIdBuilder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = SEParentsInfo.ParentsDelList.getDefaultInstance();
                    }
                    this.parentsIdBuilder_ = new SingleFieldBuilder<>((SEParentsInfo.ParentsDelList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.parentsIdBuilder_;
            }

            private SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> internalGetParentsInfoFieldBuilder() {
                if (this.parentsInfoBuilder_ == null) {
                    if (this.payloadCase_ != 10) {
                        this.payload_ = SEParentsInfo.getDefaultInstance();
                    }
                    this.parentsInfoBuilder_ = new SingleFieldBuilder<>((SEParentsInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 10;
                onChanged();
                return this.parentsInfoBuilder_;
            }

            private SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> internalGetUserGomoreAlldaySleepFieldBuilder() {
                if (this.userGomoreAlldaySleepBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SEGoMoreAlldaySleep.getDefaultInstance();
                    }
                    this.userGomoreAlldaySleepBuilder_ = new SingleFieldBuilder<>((SEGoMoreAlldaySleep) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.userGomoreAlldaySleepBuilder_;
            }

            private SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> internalGetUserGomoreAutoActiveSportFieldBuilder() {
                if (this.userGomoreAutoActiveSportBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SEGoMoreAutoActiveSport.getDefaultInstance();
                    }
                    this.userGomoreAutoActiveSportBuilder_ = new SingleFieldBuilder<>((SEGoMoreAutoActiveSport) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.userGomoreAutoActiveSportBuilder_;
            }

            private SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> internalGetUserInformationFieldBuilder() {
                if (this.userInformationBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SEUserInformation.getDefaultInstance();
                    }
                    this.userInformationBuilder_ = new SingleFieldBuilder<>((SEUserInformation) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.userInformationBuilder_;
            }

            private SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> internalGetUserProfileFieldBuilder() {
                if (this.userProfileBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SEUserProfile.getDefaultInstance();
                    }
                    this.userProfileBuilder_ = new SingleFieldBuilder<>((SEUserProfile) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.userProfileBuilder_;
            }

            public Builder clearChildInfo() {
                SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> singleFieldBuilder = this.childInfoBuilder_;
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

            public Builder clearLanguageDetailed() {
                SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> singleFieldBuilder = this.languageDetailedBuilder_;
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

            public Builder clearLanguageId() {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearParentsId() {
                SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> singleFieldBuilder = this.parentsIdBuilder_;
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

            public Builder clearParentsInfo() {
                SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> singleFieldBuilder = this.parentsInfoBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearTemperatureType() {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearUnitType() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearUserGomoreAlldaySleep() {
                SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> singleFieldBuilder = this.userGomoreAlldaySleepBuilder_;
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

            public Builder clearUserGomoreAutoActiveSport() {
                SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> singleFieldBuilder = this.userGomoreAutoActiveSportBuilder_;
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

            public Builder clearUserInformation() {
                SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> singleFieldBuilder = this.userInformationBuilder_;
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

            public Builder clearUserProfile() {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
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

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEChildrenInfo getChildInfo() {
                SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> singleFieldBuilder = this.childInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 9 ? (SEChildrenInfo) this.payload_ : SEChildrenInfo.getDefaultInstance() : this.payloadCase_ == 9 ? (SEChildrenInfo) singleFieldBuilder.getMessage() : SEChildrenInfo.getDefaultInstance();
            }

            public SEChildrenInfo.Builder getChildInfoBuilder() {
                return (SEChildrenInfo.Builder) internalGetChildInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEChildrenInfoOrBuilder getChildInfoOrBuilder() {
                SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilder = this.childInfoBuilder_) == null) ? i7 == 9 ? (SEChildrenInfo) this.payload_ : SEChildrenInfo.getDefaultInstance() : (SEChildrenInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProfilesProtos.internal_static_SA_SEUserSettings_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SELanguageDetailed getLanguageDetailed() {
                SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> singleFieldBuilder = this.languageDetailedBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SELanguageDetailed) this.payload_ : SELanguageDetailed.getDefaultInstance() : this.payloadCase_ == 2 ? (SELanguageDetailed) singleFieldBuilder.getMessage() : SELanguageDetailed.getDefaultInstance();
            }

            public SELanguageDetailed.Builder getLanguageDetailedBuilder() {
                return (SELanguageDetailed.Builder) internalGetLanguageDetailedFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SELanguageDetailedOrBuilder getLanguageDetailedOrBuilder() {
                SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.languageDetailedBuilder_) == null) ? i7 == 2 ? (SELanguageDetailed) this.payload_ : SELanguageDetailed.getDefaultInstance() : (SELanguageDetailedOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SELanguageId getLanguageId() {
                SELanguageId sELanguageIdForNumber;
                return (this.payloadCase_ != 1 || (sELanguageIdForNumber = SELanguageId.forNumber(((Integer) this.payload_).intValue())) == null) ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEParentsInfo.ParentsDelList getParentsId() {
                SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> singleFieldBuilder = this.parentsIdBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 11 ? (SEParentsInfo.ParentsDelList) this.payload_ : SEParentsInfo.ParentsDelList.getDefaultInstance() : this.payloadCase_ == 11 ? (SEParentsInfo.ParentsDelList) singleFieldBuilder.getMessage() : SEParentsInfo.ParentsDelList.getDefaultInstance();
            }

            public SEParentsInfo.ParentsDelList.Builder getParentsIdBuilder() {
                return (SEParentsInfo.ParentsDelList.Builder) internalGetParentsIdFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEParentsInfo.ParentsDelListOrBuilder getParentsIdOrBuilder() {
                SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilder = this.parentsIdBuilder_) == null) ? i7 == 11 ? (SEParentsInfo.ParentsDelList) this.payload_ : SEParentsInfo.ParentsDelList.getDefaultInstance() : (SEParentsInfo.ParentsDelListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEParentsInfo getParentsInfo() {
                SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> singleFieldBuilder = this.parentsInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 10 ? (SEParentsInfo) this.payload_ : SEParentsInfo.getDefaultInstance() : this.payloadCase_ == 10 ? (SEParentsInfo) singleFieldBuilder.getMessage() : SEParentsInfo.getDefaultInstance();
            }

            public SEParentsInfo.Builder getParentsInfoBuilder() {
                return (SEParentsInfo.Builder) internalGetParentsInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEParentsInfoOrBuilder getParentsInfoOrBuilder() {
                SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 10 || (singleFieldBuilder = this.parentsInfoBuilder_) == null) ? i7 == 10 ? (SEParentsInfo) this.payload_ : SEParentsInfo.getDefaultInstance() : (SEParentsInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SETemperatureType getTemperatureType() {
                SETemperatureType sETemperatureTypeForNumber;
                return (this.payloadCase_ != 4 || (sETemperatureTypeForNumber = SETemperatureType.forNumber(((Integer) this.payload_).intValue())) == null) ? SETemperatureType.CENTIGRADE : sETemperatureTypeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEUnitType getUnitType() {
                SEUnitType sEUnitTypeForNumber;
                return (this.payloadCase_ != 3 || (sEUnitTypeForNumber = SEUnitType.forNumber(((Integer) this.payload_).intValue())) == null) ? SEUnitType.METRIC_SYSTEM : sEUnitTypeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEGoMoreAlldaySleep getUserGomoreAlldaySleep() {
                SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> singleFieldBuilder = this.userGomoreAlldaySleepBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SEGoMoreAlldaySleep) this.payload_ : SEGoMoreAlldaySleep.getDefaultInstance() : this.payloadCase_ == 7 ? (SEGoMoreAlldaySleep) singleFieldBuilder.getMessage() : SEGoMoreAlldaySleep.getDefaultInstance();
            }

            public SEGoMoreAlldaySleep.Builder getUserGomoreAlldaySleepBuilder() {
                return (SEGoMoreAlldaySleep.Builder) internalGetUserGomoreAlldaySleepFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEGoMoreAlldaySleepOrBuilder getUserGomoreAlldaySleepOrBuilder() {
                SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.userGomoreAlldaySleepBuilder_) == null) ? i7 == 7 ? (SEGoMoreAlldaySleep) this.payload_ : SEGoMoreAlldaySleep.getDefaultInstance() : (SEGoMoreAlldaySleepOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEGoMoreAutoActiveSport getUserGomoreAutoActiveSport() {
                SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> singleFieldBuilder = this.userGomoreAutoActiveSportBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SEGoMoreAutoActiveSport) this.payload_ : SEGoMoreAutoActiveSport.getDefaultInstance() : this.payloadCase_ == 8 ? (SEGoMoreAutoActiveSport) singleFieldBuilder.getMessage() : SEGoMoreAutoActiveSport.getDefaultInstance();
            }

            public SEGoMoreAutoActiveSport.Builder getUserGomoreAutoActiveSportBuilder() {
                return (SEGoMoreAutoActiveSport.Builder) internalGetUserGomoreAutoActiveSportFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEGoMoreAutoActiveSportOrBuilder getUserGomoreAutoActiveSportOrBuilder() {
                SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.userGomoreAutoActiveSportBuilder_) == null) ? i7 == 8 ? (SEGoMoreAutoActiveSport) this.payload_ : SEGoMoreAutoActiveSport.getDefaultInstance() : (SEGoMoreAutoActiveSportOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEUserInformation getUserInformation() {
                SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> singleFieldBuilder = this.userInformationBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SEUserInformation) this.payload_ : SEUserInformation.getDefaultInstance() : this.payloadCase_ == 6 ? (SEUserInformation) singleFieldBuilder.getMessage() : SEUserInformation.getDefaultInstance();
            }

            public SEUserInformation.Builder getUserInformationBuilder() {
                return (SEUserInformation.Builder) internalGetUserInformationFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEUserInformationOrBuilder getUserInformationOrBuilder() {
                SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.userInformationBuilder_) == null) ? i7 == 6 ? (SEUserInformation) this.payload_ : SEUserInformation.getDefaultInstance() : (SEUserInformationOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEUserProfile getUserProfile() {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SEUserProfile) this.payload_ : SEUserProfile.getDefaultInstance() : this.payloadCase_ == 5 ? (SEUserProfile) singleFieldBuilder.getMessage() : SEUserProfile.getDefaultInstance();
            }

            public SEUserProfile.Builder getUserProfileBuilder() {
                return (SEUserProfile.Builder) internalGetUserProfileFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public SEUserProfileOrBuilder getUserProfileOrBuilder() {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.userProfileBuilder_) == null) ? i7 == 5 ? (SEUserProfile) this.payload_ : SEUserProfile.getDefaultInstance() : (SEUserProfileOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasChildInfo() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasLanguageDetailed() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasLanguageId() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasParentsId() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasParentsInfo() {
                return this.payloadCase_ == 10;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasTemperatureType() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasUnitType() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasUserGomoreAlldaySleep() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasUserGomoreAutoActiveSport() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasUserInformation() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
            public boolean hasUserProfile() {
                return this.payloadCase_ == 5;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProfilesProtos.internal_static_SA_SEUserSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(SEUserSettings.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasLanguageDetailed() && !getLanguageDetailed().isInitialized()) {
                    return false;
                }
                if (hasUserProfile() && !getUserProfile().isInitialized()) {
                    return false;
                }
                if (hasUserInformation() && !getUserInformation().isInitialized()) {
                    return false;
                }
                if (!hasChildInfo() || getChildInfo().isInitialized()) {
                    return !hasParentsInfo() || getParentsInfo().isInitialized();
                }
                return false;
            }

            public Builder mergeChildInfo(SEChildrenInfo sEChildrenInfo) {
                SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> singleFieldBuilder = this.childInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 9 || this.payload_ == SEChildrenInfo.getDefaultInstance()) {
                        this.payload_ = sEChildrenInfo;
                    } else {
                        this.payload_ = SEChildrenInfo.newBuilder((SEChildrenInfo) this.payload_).mergeFrom(sEChildrenInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 9) {
                    singleFieldBuilder.mergeFrom(sEChildrenInfo);
                } else {
                    singleFieldBuilder.setMessage(sEChildrenInfo);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder mergeLanguageDetailed(SELanguageDetailed sELanguageDetailed) {
                SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> singleFieldBuilder = this.languageDetailedBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SELanguageDetailed.getDefaultInstance()) {
                        this.payload_ = sELanguageDetailed;
                    } else {
                        this.payload_ = SELanguageDetailed.newBuilder((SELanguageDetailed) this.payload_).mergeFrom(sELanguageDetailed).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(sELanguageDetailed);
                } else {
                    singleFieldBuilder.setMessage(sELanguageDetailed);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeParentsId(SEParentsInfo.ParentsDelList parentsDelList) {
                SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> singleFieldBuilder = this.parentsIdBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 11 || this.payload_ == SEParentsInfo.ParentsDelList.getDefaultInstance()) {
                        this.payload_ = parentsDelList;
                    } else {
                        this.payload_ = SEParentsInfo.ParentsDelList.newBuilder((SEParentsInfo.ParentsDelList) this.payload_).mergeFrom(parentsDelList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 11) {
                    singleFieldBuilder.mergeFrom(parentsDelList);
                } else {
                    singleFieldBuilder.setMessage(parentsDelList);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder mergeParentsInfo(SEParentsInfo sEParentsInfo) {
                SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> singleFieldBuilder = this.parentsInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 10 || this.payload_ == SEParentsInfo.getDefaultInstance()) {
                        this.payload_ = sEParentsInfo;
                    } else {
                        this.payload_ = SEParentsInfo.newBuilder((SEParentsInfo) this.payload_).mergeFrom(sEParentsInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 10) {
                    singleFieldBuilder.mergeFrom(sEParentsInfo);
                } else {
                    singleFieldBuilder.setMessage(sEParentsInfo);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder mergeUserGomoreAlldaySleep(SEGoMoreAlldaySleep sEGoMoreAlldaySleep) {
                SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> singleFieldBuilder = this.userGomoreAlldaySleepBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SEGoMoreAlldaySleep.getDefaultInstance()) {
                        this.payload_ = sEGoMoreAlldaySleep;
                    } else {
                        this.payload_ = SEGoMoreAlldaySleep.newBuilder((SEGoMoreAlldaySleep) this.payload_).mergeFrom(sEGoMoreAlldaySleep).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEGoMoreAlldaySleep);
                } else {
                    singleFieldBuilder.setMessage(sEGoMoreAlldaySleep);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeUserGomoreAutoActiveSport(SEGoMoreAutoActiveSport sEGoMoreAutoActiveSport) {
                SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> singleFieldBuilder = this.userGomoreAutoActiveSportBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SEGoMoreAutoActiveSport.getDefaultInstance()) {
                        this.payload_ = sEGoMoreAutoActiveSport;
                    } else {
                        this.payload_ = SEGoMoreAutoActiveSport.newBuilder((SEGoMoreAutoActiveSport) this.payload_).mergeFrom(sEGoMoreAutoActiveSport).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(sEGoMoreAutoActiveSport);
                } else {
                    singleFieldBuilder.setMessage(sEGoMoreAutoActiveSport);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeUserInformation(SEUserInformation sEUserInformation) {
                SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> singleFieldBuilder = this.userInformationBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SEUserInformation.getDefaultInstance()) {
                        this.payload_ = sEUserInformation;
                    } else {
                        this.payload_ = SEUserInformation.newBuilder((SEUserInformation) this.payload_).mergeFrom(sEUserInformation).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEUserInformation);
                } else {
                    singleFieldBuilder.setMessage(sEUserInformation);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeUserProfile(SEUserProfile sEUserProfile) {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SEUserProfile.getDefaultInstance()) {
                        this.payload_ = sEUserProfile;
                    } else {
                        this.payload_ = SEUserProfile.newBuilder((SEUserProfile) this.payload_).mergeFrom(sEUserProfile).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sEUserProfile);
                } else {
                    singleFieldBuilder.setMessage(sEUserProfile);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setChildInfo(SEChildrenInfo sEChildrenInfo) {
                SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> singleFieldBuilder = this.childInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEChildrenInfo.getClass();
                    this.payload_ = sEChildrenInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEChildrenInfo);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setLanguageDetailed(SELanguageDetailed sELanguageDetailed) {
                SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> singleFieldBuilder = this.languageDetailedBuilder_;
                if (singleFieldBuilder == null) {
                    sELanguageDetailed.getClass();
                    this.payload_ = sELanguageDetailed;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sELanguageDetailed);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setLanguageId(SELanguageId sELanguageId) {
                sELanguageId.getClass();
                this.payloadCase_ = 1;
                this.payload_ = Integer.valueOf(sELanguageId.getNumber());
                onChanged();
                return this;
            }

            public Builder setParentsId(SEParentsInfo.ParentsDelList parentsDelList) {
                SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> singleFieldBuilder = this.parentsIdBuilder_;
                if (singleFieldBuilder == null) {
                    parentsDelList.getClass();
                    this.payload_ = parentsDelList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(parentsDelList);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setParentsInfo(SEParentsInfo sEParentsInfo) {
                SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> singleFieldBuilder = this.parentsInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEParentsInfo.getClass();
                    this.payload_ = sEParentsInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEParentsInfo);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setTemperatureType(SETemperatureType sETemperatureType) {
                sETemperatureType.getClass();
                this.payloadCase_ = 4;
                this.payload_ = Integer.valueOf(sETemperatureType.getNumber());
                onChanged();
                return this;
            }

            public Builder setUnitType(SEUnitType sEUnitType) {
                sEUnitType.getClass();
                this.payloadCase_ = 3;
                this.payload_ = Integer.valueOf(sEUnitType.getNumber());
                onChanged();
                return this;
            }

            public Builder setUserGomoreAlldaySleep(SEGoMoreAlldaySleep sEGoMoreAlldaySleep) {
                SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> singleFieldBuilder = this.userGomoreAlldaySleepBuilder_;
                if (singleFieldBuilder == null) {
                    sEGoMoreAlldaySleep.getClass();
                    this.payload_ = sEGoMoreAlldaySleep;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEGoMoreAlldaySleep);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setUserGomoreAutoActiveSport(SEGoMoreAutoActiveSport sEGoMoreAutoActiveSport) {
                SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> singleFieldBuilder = this.userGomoreAutoActiveSportBuilder_;
                if (singleFieldBuilder == null) {
                    sEGoMoreAutoActiveSport.getClass();
                    this.payload_ = sEGoMoreAutoActiveSport;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEGoMoreAutoActiveSport);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setUserInformation(SEUserInformation sEUserInformation) {
                SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> singleFieldBuilder = this.userInformationBuilder_;
                if (singleFieldBuilder == null) {
                    sEUserInformation.getClass();
                    this.payload_ = sEUserInformation;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEUserInformation);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setUserProfile(SEUserProfile sEUserProfile) {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder == null) {
                    sEUserProfile.getClass();
                    this.payload_ = sEUserProfile;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEUserProfile);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public /* synthetic */ Builder(r rVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEUserSettings build() {
                SEUserSettings sEUserSettingsBuildPartial = buildPartial();
                if (sEUserSettingsBuildPartial.isInitialized()) {
                    return sEUserSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEUserSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEUserSettings buildPartial() {
                SEUserSettings sEUserSettings = new SEUserSettings(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEUserSettings);
                }
                buildPartialOneofs(sEUserSettings);
                onBuilt();
                return sEUserSettings;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEUserSettings getDefaultInstanceForType() {
                return SEUserSettings.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> singleFieldBuilder = this.languageDetailedBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder2 = this.userProfileBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> singleFieldBuilder3 = this.userInformationBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> singleFieldBuilder4 = this.userGomoreAlldaySleepBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> singleFieldBuilder5 = this.userGomoreAutoActiveSportBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> singleFieldBuilder6 = this.childInfoBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> singleFieldBuilder7 = this.parentsInfoBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.clear();
                }
                SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> singleFieldBuilder8 = this.parentsIdBuilder_;
                if (singleFieldBuilder8 != null) {
                    singleFieldBuilder8.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEUserSettings) {
                    return mergeFrom((SEUserSettings) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setChildInfo(SEChildrenInfo.Builder builder) {
                SingleFieldBuilder<SEChildrenInfo, SEChildrenInfo.Builder, SEChildrenInfoOrBuilder> singleFieldBuilder = this.childInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setLanguageDetailed(SELanguageDetailed.Builder builder) {
                SingleFieldBuilder<SELanguageDetailed, SELanguageDetailed.Builder, SELanguageDetailedOrBuilder> singleFieldBuilder = this.languageDetailedBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setParentsId(SEParentsInfo.ParentsDelList.Builder builder) {
                SingleFieldBuilder<SEParentsInfo.ParentsDelList, SEParentsInfo.ParentsDelList.Builder, SEParentsInfo.ParentsDelListOrBuilder> singleFieldBuilder = this.parentsIdBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setParentsInfo(SEParentsInfo.Builder builder) {
                SingleFieldBuilder<SEParentsInfo, SEParentsInfo.Builder, SEParentsInfoOrBuilder> singleFieldBuilder = this.parentsInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setUserGomoreAlldaySleep(SEGoMoreAlldaySleep.Builder builder) {
                SingleFieldBuilder<SEGoMoreAlldaySleep, SEGoMoreAlldaySleep.Builder, SEGoMoreAlldaySleepOrBuilder> singleFieldBuilder = this.userGomoreAlldaySleepBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setUserGomoreAutoActiveSport(SEGoMoreAutoActiveSport.Builder builder) {
                SingleFieldBuilder<SEGoMoreAutoActiveSport, SEGoMoreAutoActiveSport.Builder, SEGoMoreAutoActiveSportOrBuilder> singleFieldBuilder = this.userGomoreAutoActiveSportBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setUserInformation(SEUserInformation.Builder builder) {
                SingleFieldBuilder<SEUserInformation, SEUserInformation.Builder, SEUserInformationOrBuilder> singleFieldBuilder = this.userInformationBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setUserProfile(SEUserProfile.Builder builder) {
                SingleFieldBuilder<SEUserProfile, SEUserProfile.Builder, SEUserProfileOrBuilder> singleFieldBuilder = this.userProfileBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeFrom(SEUserSettings sEUserSettings) {
                if (sEUserSettings == SEUserSettings.getDefaultInstance()) {
                    return this;
                }
                switch (sEUserSettings.getPayloadCase()) {
                    case LANGUAGE_ID:
                        setLanguageId(sEUserSettings.getLanguageId());
                        break;
                    case LANGUAGE_DETAILED:
                        mergeLanguageDetailed(sEUserSettings.getLanguageDetailed());
                        break;
                    case UNIT_TYPE:
                        setUnitType(sEUserSettings.getUnitType());
                        break;
                    case TEMPERATURE_TYPE:
                        setTemperatureType(sEUserSettings.getTemperatureType());
                        break;
                    case USER_PROFILE:
                        mergeUserProfile(sEUserSettings.getUserProfile());
                        break;
                    case USER_INFORMATION:
                        mergeUserInformation(sEUserSettings.getUserInformation());
                        break;
                    case USER_GOMORE_ALLDAY_SLEEP:
                        mergeUserGomoreAlldaySleep(sEUserSettings.getUserGomoreAlldaySleep());
                        break;
                    case USER_GOMORE_AUTO_ACTIVE_SPORT:
                        mergeUserGomoreAutoActiveSport(sEUserSettings.getUserGomoreAutoActiveSport());
                        break;
                    case CHILD_INFO:
                        mergeChildInfo(sEUserSettings.getChildInfo());
                        break;
                    case PARENTS_INFO:
                        mergeParentsInfo(sEUserSettings.getParentsInfo());
                        break;
                    case PARENTS_ID:
                        mergeParentsId(sEUserSettings.getParentsId());
                        break;
                }
                mergeUnknownFields(sEUserSettings.getUnknownFields());
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
                                    if (SELanguageId.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.payloadCase_ = 1;
                                        this.payload_ = Integer.valueOf(i7);
                                    }
                                    break;
                                case 18:
                                    codedInputStream.readMessage(internalGetLanguageDetailedFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                    break;
                                case 24:
                                    int i8 = codedInputStream.readEnum();
                                    if (SEUnitType.forNumber(i8) == null) {
                                        mergeUnknownVarintField(3, i8);
                                    } else {
                                        this.payloadCase_ = 3;
                                        this.payload_ = Integer.valueOf(i8);
                                    }
                                    break;
                                case 32:
                                    int i9 = codedInputStream.readEnum();
                                    if (SETemperatureType.forNumber(i9) == null) {
                                        mergeUnknownVarintField(4, i9);
                                    } else {
                                        this.payloadCase_ = 4;
                                        this.payload_ = Integer.valueOf(i9);
                                    }
                                    break;
                                case 42:
                                    codedInputStream.readMessage(internalGetUserProfileFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                    break;
                                case 50:
                                    codedInputStream.readMessage(internalGetUserInformationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                    break;
                                case 58:
                                    codedInputStream.readMessage(internalGetUserGomoreAlldaySleepFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                    break;
                                case 66:
                                    codedInputStream.readMessage(internalGetUserGomoreAutoActiveSportFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 8;
                                    break;
                                case 74:
                                    codedInputStream.readMessage(internalGetChildInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 9;
                                    break;
                                case 82:
                                    codedInputStream.readMessage(internalGetParentsInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 10;
                                    break;
                                case 90:
                                    codedInputStream.readMessage(internalGetParentsIdFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 11;
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
            LANGUAGE_ID(1),
            LANGUAGE_DETAILED(2),
            UNIT_TYPE(3),
            TEMPERATURE_TYPE(4),
            USER_PROFILE(5),
            USER_INFORMATION(6),
            USER_GOMORE_ALLDAY_SLEEP(7),
            USER_GOMORE_AUTO_ACTIVE_SPORT(8),
            CHILD_INFO(9),
            PARENTS_INFO(10),
            PARENTS_ID(11),
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
                        return LANGUAGE_ID;
                    case 2:
                        return LANGUAGE_DETAILED;
                    case 3:
                        return UNIT_TYPE;
                    case 4:
                        return TEMPERATURE_TYPE;
                    case 5:
                        return USER_PROFILE;
                    case 6:
                        return USER_INFORMATION;
                    case 7:
                        return USER_GOMORE_ALLDAY_SLEEP;
                    case 8:
                        return USER_GOMORE_AUTO_ACTIVE_SPORT;
                    case 9:
                        return CHILD_INFO;
                    case 10:
                        return PARENTS_INFO;
                    case 11:
                        return PARENTS_ID;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEUserSettings");
            DEFAULT_INSTANCE = new SEUserSettings();
            PARSER = new AbstractParser<SEUserSettings>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettings.1
                @Override // com.google.protobuf.Parser
                public SEUserSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEUserSettings.newBuilder();
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

        public /* synthetic */ SEUserSettings(GeneratedMessage.Builder builder, r rVar) {
            this(builder);
        }

        public static SEUserSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProfilesProtos.internal_static_SA_SEUserSettings_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEUserSettings parseDelimitedFrom(InputStream inputStream) {
            return (SEUserSettings) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEUserSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEUserSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEUserSettings)) {
                return super.equals(obj);
            }
            SEUserSettings sEUserSettings = (SEUserSettings) obj;
            if (!getPayloadCase().equals(sEUserSettings.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getLanguageId().equals(sEUserSettings.getLanguageId())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getLanguageDetailed().equals(sEUserSettings.getLanguageDetailed())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getUnitType().equals(sEUserSettings.getUnitType())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getTemperatureType().equals(sEUserSettings.getTemperatureType())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getUserProfile().equals(sEUserSettings.getUserProfile())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getUserInformation().equals(sEUserSettings.getUserInformation())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getUserGomoreAlldaySleep().equals(sEUserSettings.getUserGomoreAlldaySleep())) {
                        return false;
                    }
                    break;
                case 8:
                    if (!getUserGomoreAutoActiveSport().equals(sEUserSettings.getUserGomoreAutoActiveSport())) {
                        return false;
                    }
                    break;
                case 9:
                    if (!getChildInfo().equals(sEUserSettings.getChildInfo())) {
                        return false;
                    }
                    break;
                case 10:
                    if (!getParentsInfo().equals(sEUserSettings.getParentsInfo())) {
                        return false;
                    }
                    break;
                case 11:
                    if (!getParentsId().equals(sEUserSettings.getParentsId())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sEUserSettings.getUnknownFields());
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEChildrenInfo getChildInfo() {
            return this.payloadCase_ == 9 ? (SEChildrenInfo) this.payload_ : SEChildrenInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEChildrenInfoOrBuilder getChildInfoOrBuilder() {
            return this.payloadCase_ == 9 ? (SEChildrenInfo) this.payload_ : SEChildrenInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return UserProfilesProtos.internal_static_SA_SEUserSettings_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SELanguageDetailed getLanguageDetailed() {
            return this.payloadCase_ == 2 ? (SELanguageDetailed) this.payload_ : SELanguageDetailed.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SELanguageDetailedOrBuilder getLanguageDetailedOrBuilder() {
            return this.payloadCase_ == 2 ? (SELanguageDetailed) this.payload_ : SELanguageDetailed.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SELanguageId getLanguageId() {
            SELanguageId sELanguageIdForNumber;
            return (this.payloadCase_ != 1 || (sELanguageIdForNumber = SELanguageId.forNumber(((Integer) this.payload_).intValue())) == null) ? SELanguageId.ALBANIAN : sELanguageIdForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEParentsInfo.ParentsDelList getParentsId() {
            return this.payloadCase_ == 11 ? (SEParentsInfo.ParentsDelList) this.payload_ : SEParentsInfo.ParentsDelList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEParentsInfo.ParentsDelListOrBuilder getParentsIdOrBuilder() {
            return this.payloadCase_ == 11 ? (SEParentsInfo.ParentsDelList) this.payload_ : SEParentsInfo.ParentsDelList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEParentsInfo getParentsInfo() {
            return this.payloadCase_ == 10 ? (SEParentsInfo) this.payload_ : SEParentsInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEParentsInfoOrBuilder getParentsInfoOrBuilder() {
            return this.payloadCase_ == 10 ? (SEParentsInfo) this.payload_ : SEParentsInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEUserSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = this.payloadCase_ == 1 ? CodedOutputStream.computeEnumSize(1, ((Integer) this.payload_).intValue()) : 0;
            if (this.payloadCase_ == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, (SELanguageDetailed) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 5) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, (SEUserProfile) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(6, (SEUserInformation) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(7, (SEGoMoreAlldaySleep) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(8, (SEGoMoreAutoActiveSport) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(9, (SEChildrenInfo) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(10, (SEParentsInfo) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(11, (SEParentsInfo.ParentsDelList) this.payload_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SETemperatureType getTemperatureType() {
            SETemperatureType sETemperatureTypeForNumber;
            return (this.payloadCase_ != 4 || (sETemperatureTypeForNumber = SETemperatureType.forNumber(((Integer) this.payload_).intValue())) == null) ? SETemperatureType.CENTIGRADE : sETemperatureTypeForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEUnitType getUnitType() {
            SEUnitType sEUnitTypeForNumber;
            return (this.payloadCase_ != 3 || (sEUnitTypeForNumber = SEUnitType.forNumber(((Integer) this.payload_).intValue())) == null) ? SEUnitType.METRIC_SYSTEM : sEUnitTypeForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEGoMoreAlldaySleep getUserGomoreAlldaySleep() {
            return this.payloadCase_ == 7 ? (SEGoMoreAlldaySleep) this.payload_ : SEGoMoreAlldaySleep.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEGoMoreAlldaySleepOrBuilder getUserGomoreAlldaySleepOrBuilder() {
            return this.payloadCase_ == 7 ? (SEGoMoreAlldaySleep) this.payload_ : SEGoMoreAlldaySleep.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEGoMoreAutoActiveSport getUserGomoreAutoActiveSport() {
            return this.payloadCase_ == 8 ? (SEGoMoreAutoActiveSport) this.payload_ : SEGoMoreAutoActiveSport.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEGoMoreAutoActiveSportOrBuilder getUserGomoreAutoActiveSportOrBuilder() {
            return this.payloadCase_ == 8 ? (SEGoMoreAutoActiveSport) this.payload_ : SEGoMoreAutoActiveSport.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEUserInformation getUserInformation() {
            return this.payloadCase_ == 6 ? (SEUserInformation) this.payload_ : SEUserInformation.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEUserInformationOrBuilder getUserInformationOrBuilder() {
            return this.payloadCase_ == 6 ? (SEUserInformation) this.payload_ : SEUserInformation.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEUserProfile getUserProfile() {
            return this.payloadCase_ == 5 ? (SEUserProfile) this.payload_ : SEUserProfile.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public SEUserProfileOrBuilder getUserProfileOrBuilder() {
            return this.payloadCase_ == 5 ? (SEUserProfile) this.payload_ : SEUserProfile.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasChildInfo() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasLanguageDetailed() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasLanguageId() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasParentsId() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasParentsInfo() {
            return this.payloadCase_ == 10;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasTemperatureType() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasUnitType() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasUserGomoreAlldaySleep() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasUserGomoreAutoActiveSport() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasUserInformation() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEUserSettingsOrBuilder
        public boolean hasUserProfile() {
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
                    number = getLanguageId().getNumber();
                    break;
                case 2:
                    i7 = ((iHashCode * 37) + 2) * 53;
                    number = getLanguageDetailed().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode * 37) + 3) * 53;
                    number = getUnitType().getNumber();
                    break;
                case 4:
                    i7 = ((iHashCode * 37) + 4) * 53;
                    number = getTemperatureType().getNumber();
                    break;
                case 5:
                    i7 = ((iHashCode * 37) + 5) * 53;
                    number = getUserProfile().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode * 37) + 6) * 53;
                    number = getUserInformation().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode * 37) + 7) * 53;
                    number = getUserGomoreAlldaySleep().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode * 37) + 8) * 53;
                    number = getUserGomoreAutoActiveSport().hashCode();
                    break;
                case 9:
                    i7 = ((iHashCode * 37) + 9) * 53;
                    number = getChildInfo().hashCode();
                    break;
                case 10:
                    i7 = ((iHashCode * 37) + 10) * 53;
                    number = getParentsInfo().hashCode();
                    break;
                case 11:
                    i7 = ((iHashCode * 37) + 11) * 53;
                    number = getParentsId().hashCode();
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
            return UserProfilesProtos.internal_static_SA_SEUserSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(SEUserSettings.class, Builder.class);
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
            if (hasLanguageDetailed() && !getLanguageDetailed().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUserProfile() && !getUserProfile().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUserInformation() && !getUserInformation().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasChildInfo() && !getChildInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasParentsInfo() || getParentsInfo().isInitialized()) {
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
                codedOutputStream.writeMessage(2, (SELanguageDetailed) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeEnum(3, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeEnum(4, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SEUserProfile) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SEUserInformation) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SEGoMoreAlldaySleep) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SEGoMoreAutoActiveSport) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (SEChildrenInfo) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                codedOutputStream.writeMessage(10, (SEParentsInfo) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (SEParentsInfo.ParentsDelList) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEUserSettings(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEUserSettings sEUserSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEUserSettings);
        }

        public static SEUserSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEUserSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEUserSettings) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEUserSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEUserSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEUserSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEUserSettings() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEUserSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEUserSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEUserSettings parseFrom(InputStream inputStream) {
            return (SEUserSettings) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEUserSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEUserSettings) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEUserSettings parseFrom(CodedInputStream codedInputStream) {
            return (SEUserSettings) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEUserSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEUserSettings) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEUserSettingsOrBuilder extends MessageOrBuilder {
        SEChildrenInfo getChildInfo();

        SEChildrenInfoOrBuilder getChildInfoOrBuilder();

        SELanguageDetailed getLanguageDetailed();

        SELanguageDetailedOrBuilder getLanguageDetailedOrBuilder();

        SELanguageId getLanguageId();

        SEParentsInfo.ParentsDelList getParentsId();

        SEParentsInfo.ParentsDelListOrBuilder getParentsIdOrBuilder();

        SEParentsInfo getParentsInfo();

        SEParentsInfoOrBuilder getParentsInfoOrBuilder();

        SEUserSettings.PayloadCase getPayloadCase();

        SETemperatureType getTemperatureType();

        SEUnitType getUnitType();

        SEGoMoreAlldaySleep getUserGomoreAlldaySleep();

        SEGoMoreAlldaySleepOrBuilder getUserGomoreAlldaySleepOrBuilder();

        SEGoMoreAutoActiveSport getUserGomoreAutoActiveSport();

        SEGoMoreAutoActiveSportOrBuilder getUserGomoreAutoActiveSportOrBuilder();

        SEUserInformation getUserInformation();

        SEUserInformationOrBuilder getUserInformationOrBuilder();

        SEUserProfile getUserProfile();

        SEUserProfileOrBuilder getUserProfileOrBuilder();

        boolean hasChildInfo();

        boolean hasLanguageDetailed();

        boolean hasLanguageId();

        boolean hasParentsId();

        boolean hasParentsInfo();

        boolean hasTemperatureType();

        boolean hasUnitType();

        boolean hasUserGomoreAlldaySleep();

        boolean hasUserGomoreAutoActiveSport();

        boolean hasUserInformation();

        boolean hasUserProfile();
    }

    public enum SEWearMode implements ProtocolMessageEnum {
        NotSet(0),
        LEFT(1),
        RIGHT(2);

        public static final int LEFT_VALUE = 1;
        public static final int NotSet_VALUE = 0;
        public static final int RIGHT_VALUE = 2;
        private static final SEWearMode[] VALUES;
        private static final Internal.EnumLiteMap<SEWearMode> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.UserProfilesProtos$SEWearMode$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEWearMode> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEWearMode findValueByNumber(int i7) {
                return SEWearMode.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEWearMode");
            internalValueMap = new Internal.EnumLiteMap<SEWearMode>() { // from class: com.zh.ble.sa_wear.protobuf.UserProfilesProtos.SEWearMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEWearMode findValueByNumber(int i7) {
                    return SEWearMode.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEWearMode(int i7) {
            this.value = i7;
        }

        public static SEWearMode forNumber(int i7) {
            if (i7 == 0) {
                return NotSet;
            }
            if (i7 == 1) {
                return LEFT;
            }
            if (i7 != 2) {
                return null;
            }
            return RIGHT;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return UserProfilesProtos.getDescriptor().getEnumType(5);
        }

        public static Internal.EnumLiteMap<SEWearMode> internalGetValueMap() {
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
        public static SEWearMode valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEWearMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "UserProfilesProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015sa_UserSettings.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\u001a\u000fsa_Common.proto\"¿\u0004\n\u000eSEUserSettings\u0012'\n\u000blanguage_id\u0018\u0001 \u0001(\u000e2\u0010.SA.SELanguageIdH\u0000\u00123\n\u0011language_detailed\u0018\u0002 \u0001(\u000b2\u0016.SA.SELanguageDetailedH\u0000\u0012#\n\tunit_type\u0018\u0003 \u0001(\u000e2\u000e.SA.SEUnitTypeH\u0000\u00121\n\u0010temperature_type\u0018\u0004 \u0001(\u000e2\u0015.SA.SETemperatureTypeH\u0000\u0012)\n\fuser_profile\u0018\u0005 \u0001(\u000b2\u0011.SA.SEUserProfileH\u0000\u00121\n\u0010user_information\u0018\u0006 \u0001(\u000b2\u0015.SA.SEUserInformationH\u0000\u0012;\n\u0018user_gomore_allday_sleep\u0018\u0007 \u0001(\u000b2\u0017.SA.SEGoMoreAlldaySleepH\u0000\u0012D\n\u001duser_gomore_auto_active_sport\u0018\b \u0001(\u000b2\u001b.SA.SEGoMoreAutoActiveSportH\u0000\u0012(\n\nchild_info\u0018\t \u0001(\u000b2\u0012.SA.SEChildrenInfoH\u0000\u0012)\n\fparents_info\u0018\n \u0001(\u000b2\u0011.SA.SEParentsInfoH\u0000\u00126\n\nparents_id\u0018\u000b \u0001(\u000b2 .SA.SEParentsInfo.ParentsDelListH\u0000B\t\n\u0007payload\"\u0090\u0005\n\rSEUserProfile\u0012\u0015\n\u0006height\u0018\u0001 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u000e\n\u0006weight\u0018\u0002 \u0001(\u0002\u0012\u0014\n\u0005birth\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028 \u0012\u0012\n\u0003age\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u0016\n\u0003sex\u0018\u0005 \u0001(\u000e2\t.SA.SESex\u0012\u0015\n\u0006max_hr\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u001b\n\fgoal_calorie\u0018\u0007 \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0018\n\tgoal_step\u0018\b \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u001c\n\rgoal_distance\u0018\t \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\"\n\u0013goal_standing_times\u0018\n \u0001(\rB\u0005\u0092?\u00028\u0010\u0012(\n\twear_mode\u0018\u000b \u0001(\u000e2\u000e.SA.SEWearModeB\u0005\u0092?\u00028\u0010\u0012\u001e\n\u000fgoal_sleep_hour\u0018\f \u0001(\rB\u0005\u0092?\u00028\u0010\u0012%\n\u0016goal_activity_duration\u0018\r \u0001(\rB\u0005\u0092?\u00028\u0010\u0012\u0018\n\u0010goal_step_switch\u0018\u000e \u0001(\b\u0012\u001b\n\u0013goal_calorie_switch\u0018\u000f \u0001(\b\u0012%\n\u001dgoal_activity_duration_switch\u0018\u0010 \u0001(\b\u0012\u001a\n\u0012APP_weather_switch\u0018\u0011 \u0001(\b\u0012\u0018\n\tuser_name\u0018\u0012 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u00120\n\u0015user_sleep_start_time\u0018\u0013 \u0001(\u000b2\u0011.SA.SESettingTime\u0012.\n\u0013user_sleep_end_time\u0018\u0014 \u0001(\u000b2\u0011.SA.SESettingTime\u0012\u001f\n\u0010goal_drink_water\u0018\u0015 \u0001(\rB\u0005\u0092?\u00028 \"·\u0001\n\u0011SEUserInformation\u0012'\n\fuser_profile\u0018\u0001 \u0002(\u000b2\u0011.SA.SEUserProfile\u0012%\n\u000blanguage_id\u0018\u0002 \u0001(\u000e2\u0010.SA.SELanguageId\u0012!\n\tunit_type\u0018\u0003 \u0001(\u000e2\u000e.SA.SEUnitType\u0012/\n\u0010temperature_type\u0018\u0004 \u0001(\u000e2\u0015.SA.SETemperatureType\"\u0091\u0001\n\u0013SEGoMoreAlldaySleep\u0012!\n\u0019gomore_alldaysleep_switch\u0018\u0001 \u0001(\b\u0012+\n\u001cgomore_alldaysleep_starttime\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028 \u0012*\n\u001bgomore_alldaysleep_stoptime\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028 \"Û\u0001\n\u0017SEGoMoreAutoActiveSport\u0012'\n\u001fgomore_auto_active_sport_switch\u0018\u0001 \u0001(\b\u00121\n\"gomore_auto_active_sport_starttime\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028 \u00120\n!gomore_auto_active_sport_stoptime\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028 \u00122\n#gomore_auto_active_sport_activetime\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028 \"Ø\u0001\n\u0012SELanguageDetailed\u00124\n\rlanguage_list\u0018\u0001 \u0002(\u000b2\u001d.SA.SELanguageDetailed.SEList\u0012-\n\u0013default_language_id\u0018\u0002 \u0002(\u000e2\u0010.SA.SELanguageId\u0012,\n\u0012select_language_id\u0018\u0003 \u0002(\u000e2\u0010.SA.SELanguageId\u001a/\n\u0006SEList\u0012%\n\u0004list\u0018\u0001 \u0003(\u000e2\u0010.SA.SELanguageIdB\u0005\u0092?\u0002\u0018\u0004\"\u008c\u0001\n\u000eSEChildrenInfo\u0012\u0013\n\u0004name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bblood_group\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0016\n\u0007allergy\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0019\n\nmedication\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0016\n\u0007address\u0018\u0005 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"]\n\u000fSEParentsInfo_t\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\u0013\n\u0004name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0015\n\u0006number\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003md5\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"æ\u0001\n\rSEParentsInfo\u0012\u0014\n\u0005width\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0015\n\u0006height\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0015\n\rscreen_radius\u0018\u0003 \u0002(\r\u00124\n\tinfo_list\u0018\u0004 \u0002(\u000b2!.SA.SEParentsInfo.ParentsInfoList\u001a;\n\u000fParentsInfoList\u0012(\n\u0004list\u0018\u0001 \u0003(\u000b2\u0013.SA.SEParentsInfo_tB\u0005\u0092?\u0002\u0018\u0004\u001a\u001e\n\u000eParentsDelList\u0012\f\n\u0004list\u0018\u0001 \u0003(\r*±\u0003\n\u001bSEUserSetting_UserSettingID\u0012\u0013\n\u000fSET_LANGUAGE_ID\u0010\u0000\u0012\u0019\n\u0015GET_LANGUAGE_DETAILED\u0010\u0001\u0012\u0011\n\rSET_UNIT_TYPE\u0010\u0002\u0012\u0018\n\u0014SET_TEMPERATURE_TYPE\u0010\u0003\u0012\u0014\n\u0010SET_USER_PROFILE\u0010\u0004\u0012\u0018\n\u0014SET_USER_INFORMATION\u0010\u0005\u0012\u0014\n\u0010GET_USER_PROFILE\u0010\u0006\u0012\"\n\u001eSET_GOMORE_ALLDAY_SLEEP_CONFIG\u0010\u0007\u0012\"\n\u001eGET_GOMORE_ALLDAY_SLEEP_CONFIG\u0010\b\u0012'\n#SET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG\u0010\t\u0012'\n#GET_GOMORE_AUTO_ACTIVE_SPORT_CONFIG\u0010\n\u0012\u0012\n\u000eSET_CHILD_INFO\u0010\u000b\u0012\u0012\n\u000eGET_CHILD_INFO\u0010\f\u0012\u0014\n\u0010GET_PARENTS_INFO\u0010\r\u0012\u0017\n\u0013DELETE_PARENTS_INFO\u0010\u000e*\u009a\b\n\fSELanguageId\u0012\f\n\bALBANIAN\u0010\u0001\u0012\n\n\u0006ARABIC\u0010\u0002\u0012\f\n\bAM_HARIC\u0010\u0003\u0012\t\n\u0005IRISH\u0010\u0004\u0012\t\n\u0005ORIYA\u0010\u0005\u0012\n\n\u0006BASQUE\u0010\u0006\u0012\u000e\n\nBELARUSIAN\u0010\u0007\u0012\r\n\tBULGARIAN\u0010\b\u0012\n\n\u0006POLISH\u0010\t\u0012\u000b\n\u0007PERSIAN\u0010\u0010\u0012\u000b\n\u0007BOOLEAN\u0010\u0011\u0012\n\n\u0006DANISH\u0010\u0012\u0012\n\n\u0006GERMAN\u0010\u0013\u0012\u000b\n\u0007RUSSIAN\u0010\u0014\u0012\n\n\u0006FRENCH\u0010\u0015\u0012\f\n\bFILIPINO\u0010\u0016\u0012\u000b\n\u0007FINNISH\u0010\u0017\u0012\r\n\tCAMBODIAN\u0010\u0018\u0012\f\n\bGEORGIAN\u0010\u0019\u0012\f\n\bGUJARATI\u0010 \u0012\n\n\u0006KAZAKH\u0010!\u0012\u0011\n\rJAITAN_CREOLE\u0010\"\u0012\n\n\u0006KOREAN\u0010#\u0012\t\n\u0005DUTCH\u0010$\u0012\f\n\bGALICIAN\u0010%\u0012\u000b\n\u0007CATALAN\u0010&\u0012\t\n\u0005CZECH\u0010'\u0012\u000b\n\u0007KANNADA\u0010(\u0012\f\n\bCROATIAN\u0010)\u0012\u000b\n\u0007KURDISH\u00100\u0012\t\n\u0005LATIN\u00101\u0012\u0007\n\u0003LAO\u00102\u0012\u000f\n\u000bKINYARWANDA\u00103\u0012\f\n\bROMANIAN\u00104\u0012\f\n\bMALAGASY\u00105\u0012\u000b\n\u0007MARATHI\u00106\u0012\r\n\tMALAYALAM\u00107\u0012\t\n\u0005MALAY\u00108\u0012\r\n\tMONGOLIAN\u00109\u0012\u000b\n\u0007BENGALI\u0010@\u0012\u000b\n\u0007BURMESE\u0010A\u0012\t\n\u0005HMONG\u0010B\u0012\u0015\n\u0011ZULU_SOYTH_AFRICA\u0010C\u0012\n\n\u0006NEPALI\u0010D\u0012\r\n\tNORWEGIAN\u0010E\u0012\u000e\n\nPORTUGUESE\u0010F\u0012\f\n\bJAPANESE\u0010G\u0012\u000b\n\u0007SWEDISH\u0010H\u0012\u000b\n\u0007SERBIAN\u0010I\u0012\u000b\n\u0007SINHALA\u0010P\u0012\n\n\u0006SLOVAK\u0010Q\u0012\n\n\u0006SOMALI\u0010R\u0012\t\n\u0005TAJIK\u0010S\u0012\n\n\u0006TELUGU\u0010T\u0012\t\n\u0005TAMIL\u0010U\u0012\b\n\u0004THAI\u0010V\u0012\u000b\n\u0007TURKISH\u0010W\u0012\b\n\u0004URDU\u0010X\u0012\r\n\tUKRAINIAN\u0010Y\u0012\t\n\u0005UZBEK\u0010`\u0012\u000b\n\u0007SPANISH\u0010a\u0012\t\n\u0005GREEK\u0010b\u0012\r\n\tHUNGARIAN\u0010c\u0012\b\n\u0004IGBO\u0010d\u0012\u000b\n\u0007ITALIAN\u0010e\u0012\t\n\u0005HINDI\u0010f\u0012\u000e\n\nINDONESIAN\u0010g\u0012\u000b\n\u0007ENGLISH\u0010h\u0012\u000e\n\nVIETNAMESE\u0010i\u0012\u0017\n\u0013TRADITIONAL_CHINESE\u0010p\u0012\u0016\n\u0012SIMPLIFIED_CHINESE\u0010q\u0012\n\n\u0006HEBREW\u0010r\u0012\u000e\n\nLITHUANIAN\u0010s\u0012\u000b\n\u0007LATVIAN\u0010t\u0012\f\n\bESTONIAN\u0010u\u0012\r\n\tSLOVENIAN\u0010v\u0012\u000b\n\u0007Maltese\u0010w*3\n\nSEUnitType\u0012\u0011\n\rMETRIC_SYSTEM\u0010\u0000\u0012\u0012\n\u000eBRITISH_SYSTEM\u0010\u0001*:\n\u0011SETemperatureType\u0012\u000e\n\nCENTIGRADE\u0010\u0000\u0012\u0015\n\u0011FAHRENHEIT_DEGREE\u0010\u0001**\n\u0005SESex\u0012\u000b\n\u0007NEUTRAL\u0010\u0000\u0012\b\n\u0004MALE\u0010\u0001\u0012\n\n\u0006FEMALE\u0010\u0002*-\n\nSEWearMode\u0012\n\n\u0006NotSet\u0010\u0000\u0012\b\n\u0004LEFT\u0010\u0001\u0012\t\n\u0005RIGHT\u0010\u0002B8\n\u001bcom.zh.ble.sa_wear.protobufB\u0012UserProfilesProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SEUserSettings_descriptor = messageType;
        internal_static_SA_SEUserSettings_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"LanguageId", "LanguageDetailed", "UnitType", "TemperatureType", "UserProfile", "UserInformation", "UserGomoreAlldaySleep", "UserGomoreAutoActiveSport", "ChildInfo", "ParentsInfo", "ParentsId", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_SEUserProfile_descriptor = messageType2;
        internal_static_SA_SEUserProfile_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"Height", "Weight", "Birth", HttpHeaders.Y, "Sex", "MaxHr", "GoalCalorie", "GoalStep", "GoalDistance", "GoalStandingTimes", "WearMode", "GoalSleepHour", "GoalActivityDuration", "GoalStepSwitch", "GoalCalorieSwitch", "GoalActivityDurationSwitch", "APPWeatherSwitch", "UserName", "UserSleepStartTime", "UserSleepEndTime", "GoalDrinkWater"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SA_SEUserInformation_descriptor = messageType3;
        internal_static_SA_SEUserInformation_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"UserProfile", "LanguageId", "UnitType", "TemperatureType"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SA_SEGoMoreAlldaySleep_descriptor = messageType4;
        internal_static_SA_SEGoMoreAlldaySleep_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"GomoreAlldaysleepSwitch", "GomoreAlldaysleepStarttime", "GomoreAlldaysleepStoptime"});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SA_SEGoMoreAutoActiveSport_descriptor = messageType5;
        internal_static_SA_SEGoMoreAutoActiveSport_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"GomoreAutoActiveSportSwitch", "GomoreAutoActiveSportStarttime", "GomoreAutoActiveSportStoptime", "GomoreAutoActiveSportActivetime"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SA_SELanguageDetailed_descriptor = messageType6;
        internal_static_SA_SELanguageDetailed_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"LanguageList", "DefaultLanguageId", "SelectLanguageId"});
        Descriptors.Descriptor nestedType = messageType6.getNestedType(0);
        internal_static_SA_SELanguageDetailed_SEList_descriptor = nestedType;
        internal_static_SA_SELanguageDetailed_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SA_SEChildrenInfo_descriptor = messageType7;
        internal_static_SA_SEChildrenInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"Name", "BloodGroup", "Allergy", "Medication", "Address"});
        Descriptors.Descriptor messageType8 = getDescriptor().getMessageType(7);
        internal_static_SA_SEParentsInfo_t_descriptor = messageType8;
        internal_static_SA_SEParentsInfo_t_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType8, new String[]{"Id", "Name", UrlTemplate.f27967e, "Md5"});
        Descriptors.Descriptor messageType9 = getDescriptor().getMessageType(8);
        internal_static_SA_SEParentsInfo_descriptor = messageType9;
        internal_static_SA_SEParentsInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType9, new String[]{HttpHeaders.f97161v1, "Height", "ScreenRadius", "InfoList"});
        Descriptors.Descriptor nestedType2 = messageType9.getNestedType(0);
        internal_static_SA_SEParentsInfo_ParentsInfoList_descriptor = nestedType2;
        internal_static_SA_SEParentsInfo_ParentsInfoList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor nestedType3 = messageType9.getNestedType(1);
        internal_static_SA_SEParentsInfo_ParentsDelList_descriptor = nestedType3;
        internal_static_SA_SEParentsInfo_ParentsDelList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType3, new String[]{MessageLiteToString.f20028a});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private UserProfilesProtos() {
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