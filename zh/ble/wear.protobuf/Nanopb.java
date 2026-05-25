package com.zh.ble.wear.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.DescriptorProtos;
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
import com.google.protobuf.UninitializedMessageException;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class Nanopb extends GeneratedFile {
    public static final int NANOPB_ENUMOPT_FIELD_NUMBER = 1010;
    public static final int NANOPB_FIELD_NUMBER = 1010;
    public static final int NANOPB_FILEOPT_FIELD_NUMBER = 1010;
    public static final int NANOPB_MSGOPT_FIELD_NUMBER = 1010;
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SENanoPBOptions_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SENanoPBOptions_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.FieldOptions, SENanoPBOptions> nanopb;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.EnumOptions, SENanoPBOptions> nanopbEnumopt;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.FileOptions, SENanoPBOptions> nanopbFileopt;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.MessageOptions, SENanoPBOptions> nanopbMsgopt;

    public enum SEDescriptorSize implements ProtocolMessageEnum {
        DS_AUTO(0),
        DS_1(1),
        DS_2(2),
        DS_4(4),
        DS_8(8);

        public static final int DS_1_VALUE = 1;
        public static final int DS_2_VALUE = 2;
        public static final int DS_4_VALUE = 4;
        public static final int DS_8_VALUE = 8;
        public static final int DS_AUTO_VALUE = 0;
        private static final SEDescriptorSize[] VALUES;
        private static final Internal.EnumLiteMap<SEDescriptorSize> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.Nanopb$SEDescriptorSize$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEDescriptorSize> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEDescriptorSize findValueByNumber(int i7) {
                return SEDescriptorSize.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEDescriptorSize");
            internalValueMap = new Internal.EnumLiteMap<SEDescriptorSize>() { // from class: com.zh.ble.wear.protobuf.Nanopb.SEDescriptorSize.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEDescriptorSize findValueByNumber(int i7) {
                    return SEDescriptorSize.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEDescriptorSize(int i7) {
            this.value = i7;
        }

        public static SEDescriptorSize forNumber(int i7) {
            if (i7 == 0) {
                return DS_AUTO;
            }
            if (i7 == 1) {
                return DS_1;
            }
            if (i7 == 2) {
                return DS_2;
            }
            if (i7 == 4) {
                return DS_4;
            }
            if (i7 != 8) {
                return null;
            }
            return DS_8;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return Nanopb.getDescriptor().getEnumType(3);
        }

        public static Internal.EnumLiteMap<SEDescriptorSize> internalGetValueMap() {
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
        public static SEDescriptorSize valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEDescriptorSize valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEFieldType implements ProtocolMessageEnum {
        FT_DEFAULT(0),
        FT_CALLBACK(1),
        FT_POINTER(4),
        FT_STATIC(2),
        FT_IGNORE(3),
        FT_INLINE(5);

        public static final int FT_CALLBACK_VALUE = 1;
        public static final int FT_DEFAULT_VALUE = 0;
        public static final int FT_IGNORE_VALUE = 3;
        public static final int FT_INLINE_VALUE = 5;
        public static final int FT_POINTER_VALUE = 4;
        public static final int FT_STATIC_VALUE = 2;
        private static final SEFieldType[] VALUES;
        private static final Internal.EnumLiteMap<SEFieldType> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.Nanopb$SEFieldType$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEFieldType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEFieldType findValueByNumber(int i7) {
                return SEFieldType.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEFieldType");
            internalValueMap = new Internal.EnumLiteMap<SEFieldType>() { // from class: com.zh.ble.wear.protobuf.Nanopb.SEFieldType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEFieldType findValueByNumber(int i7) {
                    return SEFieldType.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEFieldType(int i7) {
            this.value = i7;
        }

        public static SEFieldType forNumber(int i7) {
            if (i7 == 0) {
                return FT_DEFAULT;
            }
            if (i7 == 1) {
                return FT_CALLBACK;
            }
            if (i7 == 2) {
                return FT_STATIC;
            }
            if (i7 == 3) {
                return FT_IGNORE;
            }
            if (i7 == 4) {
                return FT_POINTER;
            }
            if (i7 != 5) {
                return null;
            }
            return FT_INLINE;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return Nanopb.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SEFieldType> internalGetValueMap() {
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
        public static SEFieldType valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEFieldType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SEIntSize implements ProtocolMessageEnum {
        IS_DEFAULT(0),
        IS_8(8),
        IS_16(16),
        IS_32(32),
        IS_64(64);

        public static final int IS_16_VALUE = 16;
        public static final int IS_32_VALUE = 32;
        public static final int IS_64_VALUE = 64;
        public static final int IS_8_VALUE = 8;
        public static final int IS_DEFAULT_VALUE = 0;
        private static final SEIntSize[] VALUES;
        private static final Internal.EnumLiteMap<SEIntSize> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.Nanopb$SEIntSize$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEIntSize> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEIntSize findValueByNumber(int i7) {
                return SEIntSize.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEIntSize");
            internalValueMap = new Internal.EnumLiteMap<SEIntSize>() { // from class: com.zh.ble.wear.protobuf.Nanopb.SEIntSize.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEIntSize findValueByNumber(int i7) {
                    return SEIntSize.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEIntSize(int i7) {
            this.value = i7;
        }

        public static SEIntSize forNumber(int i7) {
            if (i7 == 0) {
                return IS_DEFAULT;
            }
            if (i7 == 8) {
                return IS_8;
            }
            if (i7 == 16) {
                return IS_16;
            }
            if (i7 == 32) {
                return IS_32;
            }
            if (i7 != 64) {
                return null;
            }
            return IS_64;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return Nanopb.getDescriptor().getEnumType(1);
        }

        public static Internal.EnumLiteMap<SEIntSize> internalGetValueMap() {
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
        public static SEIntSize valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEIntSize valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SENanoPBOptions extends GeneratedMessage implements SENanoPBOptionsOrBuilder {
        public static final int ANONYMOUS_ONEOF_FIELD_NUMBER = 11;
        public static final int CALLBACK_DATATYPE_FIELD_NUMBER = 18;
        public static final int CALLBACK_FUNCTION_FIELD_NUMBER = 19;
        private static final SENanoPBOptions DEFAULT_INSTANCE;
        public static final int DESCRIPTORSIZE_FIELD_NUMBER = 20;
        public static final int ENUM_TO_STRING_FIELD_NUMBER = 13;
        public static final int FIXED_COUNT_FIELD_NUMBER = 16;
        public static final int FIXED_LENGTH_FIELD_NUMBER = 15;
        public static final int INT_SIZE_FIELD_NUMBER = 7;
        public static final int LONG_NAMES_FIELD_NUMBER = 4;
        public static final int MANGLE_NAMES_FIELD_NUMBER = 17;
        public static final int MAX_COUNT_FIELD_NUMBER = 2;
        public static final int MAX_LENGTH_FIELD_NUMBER = 14;
        public static final int MAX_SIZE_FIELD_NUMBER = 1;
        public static final int MSGID_FIELD_NUMBER = 9;
        public static final int NO_UNIONS_FIELD_NUMBER = 8;
        public static final int PACKED_ENUM_FIELD_NUMBER = 10;
        public static final int PACKED_STRUCT_FIELD_NUMBER = 5;
        private static final Parser<SENanoPBOptions> PARSER;
        public static final int PROTO3_FIELD_NUMBER = 12;
        public static final int SKIP_MESSAGE_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private boolean anonymousOneof_;
        private int bitField0_;
        private volatile Object callbackDatatype_;
        private volatile Object callbackFunction_;
        private int descriptorsize_;
        private boolean enumToString_;
        private boolean fixedCount_;
        private boolean fixedLength_;
        private int intSize_;
        private boolean longNames_;
        private int mangleNames_;
        private int maxCount_;
        private int maxLength_;
        private int maxSize_;
        private byte memoizedIsInitialized;
        private int msgid_;
        private boolean noUnions_;
        private boolean packedEnum_;
        private boolean packedStruct_;
        private boolean proto3_;
        private boolean skipMessage_;
        private int type_;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.Nanopb$SENanoPBOptions$1 */
        public class AnonymousClass1 extends AbstractParser<SENanoPBOptions> {
            @Override // com.google.protobuf.Parser
            public SENanoPBOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SENanoPBOptions.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SENanoPBOptionsOrBuilder {
            private boolean anonymousOneof_;
            private int bitField0_;
            private Object callbackDatatype_;
            private Object callbackFunction_;
            private int descriptorsize_;
            private boolean enumToString_;
            private boolean fixedCount_;
            private boolean fixedLength_;
            private int intSize_;
            private boolean longNames_;
            private int mangleNames_;
            private int maxCount_;
            private int maxLength_;
            private int maxSize_;
            private int msgid_;
            private boolean noUnions_;
            private boolean packedEnum_;
            private boolean packedStruct_;
            private boolean proto3_;
            private boolean skipMessage_;
            private int type_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, j jVar) {
                this(builderParent);
            }

            private void buildPartial0(SENanoPBOptions sENanoPBOptions) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sENanoPBOptions.maxSize_ = this.maxSize_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sENanoPBOptions.maxLength_ = this.maxLength_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sENanoPBOptions.maxCount_ = this.maxCount_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sENanoPBOptions.intSize_ = this.intSize_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sENanoPBOptions.type_ = this.type_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sENanoPBOptions.longNames_ = this.longNames_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sENanoPBOptions.packedStruct_ = this.packedStruct_;
                    i7 |= 64;
                }
                if ((i8 & 128) != 0) {
                    sENanoPBOptions.packedEnum_ = this.packedEnum_;
                    i7 |= 128;
                }
                if ((i8 & 256) != 0) {
                    sENanoPBOptions.skipMessage_ = this.skipMessage_;
                    i7 |= 256;
                }
                if ((i8 & 512) != 0) {
                    sENanoPBOptions.noUnions_ = this.noUnions_;
                    i7 |= 512;
                }
                if ((i8 & 1024) != 0) {
                    sENanoPBOptions.msgid_ = this.msgid_;
                    i7 |= 1024;
                }
                if ((i8 & 2048) != 0) {
                    sENanoPBOptions.anonymousOneof_ = this.anonymousOneof_;
                    i7 |= 2048;
                }
                if ((i8 & 4096) != 0) {
                    sENanoPBOptions.proto3_ = this.proto3_;
                    i7 |= 4096;
                }
                if ((i8 & 8192) != 0) {
                    sENanoPBOptions.enumToString_ = this.enumToString_;
                    i7 |= 8192;
                }
                if ((i8 & 16384) != 0) {
                    sENanoPBOptions.fixedLength_ = this.fixedLength_;
                    i7 |= 16384;
                }
                if ((i8 & 32768) != 0) {
                    sENanoPBOptions.fixedCount_ = this.fixedCount_;
                    i7 |= 32768;
                }
                if ((i8 & 65536) != 0) {
                    sENanoPBOptions.mangleNames_ = this.mangleNames_;
                    i7 |= 65536;
                }
                if ((i8 & 131072) != 0) {
                    sENanoPBOptions.callbackDatatype_ = this.callbackDatatype_;
                    i7 |= 131072;
                }
                if ((i8 & 262144) != 0) {
                    sENanoPBOptions.callbackFunction_ = this.callbackFunction_;
                    i7 |= 262144;
                }
                if ((i8 & 524288) != 0) {
                    sENanoPBOptions.descriptorsize_ = this.descriptorsize_;
                    i7 |= 524288;
                }
                sENanoPBOptions.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Nanopb.internal_static_SENanoPBOptions_descriptor;
            }

            public Builder clearAnonymousOneof() {
                this.bitField0_ &= -2049;
                this.anonymousOneof_ = false;
                onChanged();
                return this;
            }

            public Builder clearCallbackDatatype() {
                this.callbackDatatype_ = SENanoPBOptions.getDefaultInstance().getCallbackDatatype();
                this.bitField0_ &= -131073;
                onChanged();
                return this;
            }

            public Builder clearCallbackFunction() {
                this.callbackFunction_ = SENanoPBOptions.getDefaultInstance().getCallbackFunction();
                this.bitField0_ &= -262145;
                onChanged();
                return this;
            }

            public Builder clearDescriptorsize() {
                this.bitField0_ &= -524289;
                this.descriptorsize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEnumToString() {
                this.bitField0_ &= -8193;
                this.enumToString_ = false;
                onChanged();
                return this;
            }

            public Builder clearFixedCount() {
                this.bitField0_ &= -32769;
                this.fixedCount_ = false;
                onChanged();
                return this;
            }

            public Builder clearFixedLength() {
                this.bitField0_ &= -16385;
                this.fixedLength_ = false;
                onChanged();
                return this;
            }

            public Builder clearIntSize() {
                this.bitField0_ &= -9;
                this.intSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLongNames() {
                this.bitField0_ &= -33;
                this.longNames_ = true;
                onChanged();
                return this;
            }

            public Builder clearMangleNames() {
                this.bitField0_ &= -65537;
                this.mangleNames_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxCount() {
                this.bitField0_ &= -5;
                this.maxCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxLength() {
                this.bitField0_ &= -3;
                this.maxLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxSize() {
                this.bitField0_ &= -2;
                this.maxSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMsgid() {
                this.bitField0_ &= -1025;
                this.msgid_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNoUnions() {
                this.bitField0_ &= -513;
                this.noUnions_ = false;
                onChanged();
                return this;
            }

            public Builder clearPackedEnum() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.packedEnum_ = false;
                onChanged();
                return this;
            }

            public Builder clearPackedStruct() {
                this.bitField0_ &= -65;
                this.packedStruct_ = false;
                onChanged();
                return this;
            }

            public Builder clearProto3() {
                this.bitField0_ &= -4097;
                this.proto3_ = false;
                onChanged();
                return this;
            }

            public Builder clearSkipMessage() {
                this.bitField0_ &= -257;
                this.skipMessage_ = false;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -17;
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getAnonymousOneof() {
                return this.anonymousOneof_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public String getCallbackDatatype() {
                Object obj = this.callbackDatatype_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.callbackDatatype_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public ByteString getCallbackDatatypeBytes() {
                Object obj = this.callbackDatatype_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.callbackDatatype_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public String getCallbackFunction() {
                Object obj = this.callbackFunction_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.callbackFunction_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public ByteString getCallbackFunctionBytes() {
                Object obj = this.callbackFunction_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.callbackFunction_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Nanopb.internal_static_SENanoPBOptions_descriptor;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public SEDescriptorSize getDescriptorsize() {
                SEDescriptorSize sEDescriptorSizeForNumber = SEDescriptorSize.forNumber(this.descriptorsize_);
                return sEDescriptorSizeForNumber == null ? SEDescriptorSize.DS_AUTO : sEDescriptorSizeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getEnumToString() {
                return this.enumToString_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getFixedCount() {
                return this.fixedCount_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getFixedLength() {
                return this.fixedLength_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public SEIntSize getIntSize() {
                SEIntSize sEIntSizeForNumber = SEIntSize.forNumber(this.intSize_);
                return sEIntSizeForNumber == null ? SEIntSize.IS_DEFAULT : sEIntSizeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getLongNames() {
                return this.longNames_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public SETypenameMangling getMangleNames() {
                SETypenameMangling sETypenameManglingForNumber = SETypenameMangling.forNumber(this.mangleNames_);
                return sETypenameManglingForNumber == null ? SETypenameMangling.M_NONE : sETypenameManglingForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public int getMaxCount() {
                return this.maxCount_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public int getMaxLength() {
                return this.maxLength_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public int getMaxSize() {
                return this.maxSize_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public int getMsgid() {
                return this.msgid_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getNoUnions() {
                return this.noUnions_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getPackedEnum() {
                return this.packedEnum_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getPackedStruct() {
                return this.packedStruct_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getProto3() {
                return this.proto3_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean getSkipMessage() {
                return this.skipMessage_;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public SEFieldType getType() {
                SEFieldType sEFieldTypeForNumber = SEFieldType.forNumber(this.type_);
                return sEFieldTypeForNumber == null ? SEFieldType.FT_DEFAULT : sEFieldTypeForNumber;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasAnonymousOneof() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasCallbackDatatype() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasCallbackFunction() {
                return (this.bitField0_ & 262144) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasDescriptorsize() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasEnumToString() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasFixedCount() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasFixedLength() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasIntSize() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasLongNames() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasMangleNames() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasMaxCount() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasMaxLength() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasMaxSize() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasMsgid() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasNoUnions() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasPackedEnum() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasPackedStruct() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasProto3() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasSkipMessage() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return Nanopb.internal_static_SENanoPBOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(SENanoPBOptions.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAnonymousOneof(boolean z6) {
                this.anonymousOneof_ = z6;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setCallbackDatatype(String str) {
                str.getClass();
                this.callbackDatatype_ = str;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setCallbackDatatypeBytes(ByteString byteString) {
                byteString.getClass();
                this.callbackDatatype_ = byteString;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setCallbackFunction(String str) {
                str.getClass();
                this.callbackFunction_ = str;
                this.bitField0_ |= 262144;
                onChanged();
                return this;
            }

            public Builder setCallbackFunctionBytes(ByteString byteString) {
                byteString.getClass();
                this.callbackFunction_ = byteString;
                this.bitField0_ |= 262144;
                onChanged();
                return this;
            }

            public Builder setDescriptorsize(SEDescriptorSize sEDescriptorSize) {
                sEDescriptorSize.getClass();
                this.bitField0_ |= 524288;
                this.descriptorsize_ = sEDescriptorSize.getNumber();
                onChanged();
                return this;
            }

            public Builder setEnumToString(boolean z6) {
                this.enumToString_ = z6;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setFixedCount(boolean z6) {
                this.fixedCount_ = z6;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setFixedLength(boolean z6) {
                this.fixedLength_ = z6;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setIntSize(SEIntSize sEIntSize) {
                sEIntSize.getClass();
                this.bitField0_ |= 8;
                this.intSize_ = sEIntSize.getNumber();
                onChanged();
                return this;
            }

            public Builder setLongNames(boolean z6) {
                this.longNames_ = z6;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMangleNames(SETypenameMangling sETypenameMangling) {
                sETypenameMangling.getClass();
                this.bitField0_ |= 65536;
                this.mangleNames_ = sETypenameMangling.getNumber();
                onChanged();
                return this;
            }

            public Builder setMaxCount(int i7) {
                this.maxCount_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMaxLength(int i7) {
                this.maxLength_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMaxSize(int i7) {
                this.maxSize_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMsgid(int i7) {
                this.msgid_ = i7;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setNoUnions(boolean z6) {
                this.noUnions_ = z6;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPackedEnum(boolean z6) {
                this.packedEnum_ = z6;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setPackedStruct(boolean z6) {
                this.packedStruct_ = z6;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setProto3(boolean z6) {
                this.proto3_ = z6;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setSkipMessage(boolean z6) {
                this.skipMessage_ = z6;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setType(SEFieldType sEFieldType) {
                sEFieldType.getClass();
                this.bitField0_ |= 16;
                this.type_ = sEFieldType.getNumber();
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(j jVar) {
                this();
            }

            private Builder() {
                this.intSize_ = 0;
                this.type_ = 0;
                this.longNames_ = true;
                this.mangleNames_ = 0;
                this.callbackDatatype_ = "pb_callback_t";
                this.callbackFunction_ = "pb_default_field_callback";
                this.descriptorsize_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SENanoPBOptions build() {
                SENanoPBOptions sENanoPBOptionsBuildPartial = buildPartial();
                if (sENanoPBOptionsBuildPartial.isInitialized()) {
                    return sENanoPBOptionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sENanoPBOptionsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SENanoPBOptions buildPartial() {
                SENanoPBOptions sENanoPBOptions = new SENanoPBOptions(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sENanoPBOptions);
                }
                onBuilt();
                return sENanoPBOptions;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SENanoPBOptions getDefaultInstanceForType() {
                return SENanoPBOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.maxSize_ = 0;
                this.maxLength_ = 0;
                this.maxCount_ = 0;
                this.intSize_ = 0;
                this.type_ = 0;
                this.longNames_ = true;
                this.packedStruct_ = false;
                this.packedEnum_ = false;
                this.skipMessage_ = false;
                this.noUnions_ = false;
                this.msgid_ = 0;
                this.anonymousOneof_ = false;
                this.proto3_ = false;
                this.enumToString_ = false;
                this.fixedLength_ = false;
                this.fixedCount_ = false;
                this.mangleNames_ = 0;
                this.callbackDatatype_ = "pb_callback_t";
                this.callbackFunction_ = "pb_default_field_callback";
                this.descriptorsize_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SENanoPBOptions) {
                    return mergeFrom((SENanoPBOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SENanoPBOptions sENanoPBOptions) {
                if (sENanoPBOptions == SENanoPBOptions.getDefaultInstance()) {
                    return this;
                }
                if (sENanoPBOptions.hasMaxSize()) {
                    setMaxSize(sENanoPBOptions.getMaxSize());
                }
                if (sENanoPBOptions.hasMaxLength()) {
                    setMaxLength(sENanoPBOptions.getMaxLength());
                }
                if (sENanoPBOptions.hasMaxCount()) {
                    setMaxCount(sENanoPBOptions.getMaxCount());
                }
                if (sENanoPBOptions.hasIntSize()) {
                    setIntSize(sENanoPBOptions.getIntSize());
                }
                if (sENanoPBOptions.hasType()) {
                    setType(sENanoPBOptions.getType());
                }
                if (sENanoPBOptions.hasLongNames()) {
                    setLongNames(sENanoPBOptions.getLongNames());
                }
                if (sENanoPBOptions.hasPackedStruct()) {
                    setPackedStruct(sENanoPBOptions.getPackedStruct());
                }
                if (sENanoPBOptions.hasPackedEnum()) {
                    setPackedEnum(sENanoPBOptions.getPackedEnum());
                }
                if (sENanoPBOptions.hasSkipMessage()) {
                    setSkipMessage(sENanoPBOptions.getSkipMessage());
                }
                if (sENanoPBOptions.hasNoUnions()) {
                    setNoUnions(sENanoPBOptions.getNoUnions());
                }
                if (sENanoPBOptions.hasMsgid()) {
                    setMsgid(sENanoPBOptions.getMsgid());
                }
                if (sENanoPBOptions.hasAnonymousOneof()) {
                    setAnonymousOneof(sENanoPBOptions.getAnonymousOneof());
                }
                if (sENanoPBOptions.hasProto3()) {
                    setProto3(sENanoPBOptions.getProto3());
                }
                if (sENanoPBOptions.hasEnumToString()) {
                    setEnumToString(sENanoPBOptions.getEnumToString());
                }
                if (sENanoPBOptions.hasFixedLength()) {
                    setFixedLength(sENanoPBOptions.getFixedLength());
                }
                if (sENanoPBOptions.hasFixedCount()) {
                    setFixedCount(sENanoPBOptions.getFixedCount());
                }
                if (sENanoPBOptions.hasMangleNames()) {
                    setMangleNames(sENanoPBOptions.getMangleNames());
                }
                if (sENanoPBOptions.hasCallbackDatatype()) {
                    this.callbackDatatype_ = sENanoPBOptions.callbackDatatype_;
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                if (sENanoPBOptions.hasCallbackFunction()) {
                    this.callbackFunction_ = sENanoPBOptions.callbackFunction_;
                    this.bitField0_ |= 262144;
                    onChanged();
                }
                if (sENanoPBOptions.hasDescriptorsize()) {
                    setDescriptorsize(sENanoPBOptions.getDescriptorsize());
                }
                mergeUnknownFields(sENanoPBOptions.getUnknownFields());
                onChanged();
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.intSize_ = 0;
                this.type_ = 0;
                this.longNames_ = true;
                this.mangleNames_ = 0;
                this.callbackDatatype_ = "pb_callback_t";
                this.callbackFunction_ = "pb_default_field_callback";
                this.descriptorsize_ = 0;
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
                                    this.maxSize_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1;
                                    break;
                                case 16:
                                    this.maxCount_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4;
                                    break;
                                case 24:
                                    int i7 = codedInputStream.readEnum();
                                    if (SEFieldType.forNumber(i7) == null) {
                                        mergeUnknownVarintField(3, i7);
                                    } else {
                                        this.type_ = i7;
                                        this.bitField0_ |= 16;
                                    }
                                    break;
                                case 32:
                                    this.longNames_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    break;
                                case 40:
                                    this.packedStruct_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                    break;
                                case 48:
                                    this.skipMessage_ = codedInputStream.readBool();
                                    this.bitField0_ |= 256;
                                    break;
                                case 56:
                                    int i8 = codedInputStream.readEnum();
                                    if (SEIntSize.forNumber(i8) == null) {
                                        mergeUnknownVarintField(7, i8);
                                    } else {
                                        this.intSize_ = i8;
                                        this.bitField0_ |= 8;
                                    }
                                    break;
                                case 64:
                                    this.noUnions_ = codedInputStream.readBool();
                                    this.bitField0_ |= 512;
                                    break;
                                case 72:
                                    this.msgid_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1024;
                                    break;
                                case 80:
                                    this.packedEnum_ = codedInputStream.readBool();
                                    this.bitField0_ |= 128;
                                    break;
                                case 88:
                                    this.anonymousOneof_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 96:
                                    this.proto3_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4096;
                                    break;
                                case 104:
                                    this.enumToString_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 112:
                                    this.maxLength_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                    break;
                                case 120:
                                    this.fixedLength_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16384;
                                    break;
                                case 128:
                                    this.fixedCount_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32768;
                                    break;
                                case 136:
                                    int i9 = codedInputStream.readEnum();
                                    if (SETypenameMangling.forNumber(i9) == null) {
                                        mergeUnknownVarintField(17, i9);
                                    } else {
                                        this.mangleNames_ = i9;
                                        this.bitField0_ |= 65536;
                                    }
                                    break;
                                case 146:
                                    this.callbackDatatype_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 131072;
                                    break;
                                case 154:
                                    this.callbackFunction_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 262144;
                                    break;
                                case 160:
                                    int i10 = codedInputStream.readEnum();
                                    if (SEDescriptorSize.forNumber(i10) == null) {
                                        mergeUnknownVarintField(20, i10);
                                    } else {
                                        this.descriptorsize_ = i10;
                                        this.bitField0_ |= 524288;
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SENanoPBOptions");
            DEFAULT_INSTANCE = new SENanoPBOptions();
            PARSER = new AbstractParser<SENanoPBOptions>() { // from class: com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptions.1
                @Override // com.google.protobuf.Parser
                public SENanoPBOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SENanoPBOptions.newBuilder();
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

        public /* synthetic */ SENanoPBOptions(GeneratedMessage.Builder builder, j jVar) {
            this(builder);
        }

        public static SENanoPBOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Nanopb.internal_static_SENanoPBOptions_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SENanoPBOptions parseDelimitedFrom(InputStream inputStream) {
            return (SENanoPBOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SENanoPBOptions parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SENanoPBOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SENanoPBOptions)) {
                return super.equals(obj);
            }
            SENanoPBOptions sENanoPBOptions = (SENanoPBOptions) obj;
            if (hasMaxSize() != sENanoPBOptions.hasMaxSize()) {
                return false;
            }
            if ((hasMaxSize() && getMaxSize() != sENanoPBOptions.getMaxSize()) || hasMaxLength() != sENanoPBOptions.hasMaxLength()) {
                return false;
            }
            if ((hasMaxLength() && getMaxLength() != sENanoPBOptions.getMaxLength()) || hasMaxCount() != sENanoPBOptions.hasMaxCount()) {
                return false;
            }
            if ((hasMaxCount() && getMaxCount() != sENanoPBOptions.getMaxCount()) || hasIntSize() != sENanoPBOptions.hasIntSize()) {
                return false;
            }
            if ((hasIntSize() && this.intSize_ != sENanoPBOptions.intSize_) || hasType() != sENanoPBOptions.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != sENanoPBOptions.type_) || hasLongNames() != sENanoPBOptions.hasLongNames()) {
                return false;
            }
            if ((hasLongNames() && getLongNames() != sENanoPBOptions.getLongNames()) || hasPackedStruct() != sENanoPBOptions.hasPackedStruct()) {
                return false;
            }
            if ((hasPackedStruct() && getPackedStruct() != sENanoPBOptions.getPackedStruct()) || hasPackedEnum() != sENanoPBOptions.hasPackedEnum()) {
                return false;
            }
            if ((hasPackedEnum() && getPackedEnum() != sENanoPBOptions.getPackedEnum()) || hasSkipMessage() != sENanoPBOptions.hasSkipMessage()) {
                return false;
            }
            if ((hasSkipMessage() && getSkipMessage() != sENanoPBOptions.getSkipMessage()) || hasNoUnions() != sENanoPBOptions.hasNoUnions()) {
                return false;
            }
            if ((hasNoUnions() && getNoUnions() != sENanoPBOptions.getNoUnions()) || hasMsgid() != sENanoPBOptions.hasMsgid()) {
                return false;
            }
            if ((hasMsgid() && getMsgid() != sENanoPBOptions.getMsgid()) || hasAnonymousOneof() != sENanoPBOptions.hasAnonymousOneof()) {
                return false;
            }
            if ((hasAnonymousOneof() && getAnonymousOneof() != sENanoPBOptions.getAnonymousOneof()) || hasProto3() != sENanoPBOptions.hasProto3()) {
                return false;
            }
            if ((hasProto3() && getProto3() != sENanoPBOptions.getProto3()) || hasEnumToString() != sENanoPBOptions.hasEnumToString()) {
                return false;
            }
            if ((hasEnumToString() && getEnumToString() != sENanoPBOptions.getEnumToString()) || hasFixedLength() != sENanoPBOptions.hasFixedLength()) {
                return false;
            }
            if ((hasFixedLength() && getFixedLength() != sENanoPBOptions.getFixedLength()) || hasFixedCount() != sENanoPBOptions.hasFixedCount()) {
                return false;
            }
            if ((hasFixedCount() && getFixedCount() != sENanoPBOptions.getFixedCount()) || hasMangleNames() != sENanoPBOptions.hasMangleNames()) {
                return false;
            }
            if ((hasMangleNames() && this.mangleNames_ != sENanoPBOptions.mangleNames_) || hasCallbackDatatype() != sENanoPBOptions.hasCallbackDatatype()) {
                return false;
            }
            if ((hasCallbackDatatype() && !getCallbackDatatype().equals(sENanoPBOptions.getCallbackDatatype())) || hasCallbackFunction() != sENanoPBOptions.hasCallbackFunction()) {
                return false;
            }
            if ((!hasCallbackFunction() || getCallbackFunction().equals(sENanoPBOptions.getCallbackFunction())) && hasDescriptorsize() == sENanoPBOptions.hasDescriptorsize()) {
                return (!hasDescriptorsize() || this.descriptorsize_ == sENanoPBOptions.descriptorsize_) && getUnknownFields().equals(sENanoPBOptions.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getAnonymousOneof() {
            return this.anonymousOneof_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public String getCallbackDatatype() {
            Object obj = this.callbackDatatype_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.callbackDatatype_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public ByteString getCallbackDatatypeBytes() {
            Object obj = this.callbackDatatype_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callbackDatatype_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public String getCallbackFunction() {
            Object obj = this.callbackFunction_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.callbackFunction_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public ByteString getCallbackFunctionBytes() {
            Object obj = this.callbackFunction_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callbackFunction_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Nanopb.internal_static_SENanoPBOptions_descriptor;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public SEDescriptorSize getDescriptorsize() {
            SEDescriptorSize sEDescriptorSizeForNumber = SEDescriptorSize.forNumber(this.descriptorsize_);
            return sEDescriptorSizeForNumber == null ? SEDescriptorSize.DS_AUTO : sEDescriptorSizeForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getEnumToString() {
            return this.enumToString_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getFixedCount() {
            return this.fixedCount_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getFixedLength() {
            return this.fixedLength_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public SEIntSize getIntSize() {
            SEIntSize sEIntSizeForNumber = SEIntSize.forNumber(this.intSize_);
            return sEIntSizeForNumber == null ? SEIntSize.IS_DEFAULT : sEIntSizeForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getLongNames() {
            return this.longNames_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public SETypenameMangling getMangleNames() {
            SETypenameMangling sETypenameManglingForNumber = SETypenameMangling.forNumber(this.mangleNames_);
            return sETypenameManglingForNumber == null ? SETypenameMangling.M_NONE : sETypenameManglingForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public int getMaxCount() {
            return this.maxCount_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public int getMaxLength() {
            return this.maxLength_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public int getMaxSize() {
            return this.maxSize_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public int getMsgid() {
            return this.msgid_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getNoUnions() {
            return this.noUnions_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getPackedEnum() {
            return this.packedEnum_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getPackedStruct() {
            return this.packedStruct_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SENanoPBOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getProto3() {
            return this.proto3_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.maxSize_) : 0;
            if ((this.bitField0_ & 4) != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.maxCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.type_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(4, this.longNames_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(5, this.packedStruct_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(6, this.skipMessage_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(7, this.intSize_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(8, this.noUnions_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeInt32Size += CodedOutputStream.computeUInt32Size(9, this.msgid_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(10, this.packedEnum_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(11, this.anonymousOneof_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(12, this.proto3_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(13, this.enumToString_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(14, this.maxLength_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(15, this.fixedLength_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(16, this.fixedCount_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(17, this.mangleNames_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(18, this.callbackDatatype_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(19, this.callbackFunction_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(20, this.descriptorsize_);
            }
            int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean getSkipMessage() {
            return this.skipMessage_;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public SEFieldType getType() {
            SEFieldType sEFieldTypeForNumber = SEFieldType.forNumber(this.type_);
            return sEFieldTypeForNumber == null ? SEFieldType.FT_DEFAULT : sEFieldTypeForNumber;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasAnonymousOneof() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasCallbackDatatype() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasCallbackFunction() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasDescriptorsize() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasEnumToString() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasFixedCount() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasFixedLength() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasIntSize() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasLongNames() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasMangleNames() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasMaxCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasMaxLength() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasMaxSize() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasMsgid() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasNoUnions() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasPackedEnum() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasPackedStruct() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasProto3() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasSkipMessage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.zh.ble.wear.protobuf.Nanopb.SENanoPBOptionsOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasMaxSize()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMaxSize();
            }
            if (hasMaxLength()) {
                iHashCode = (((iHashCode * 37) + 14) * 53) + getMaxLength();
            }
            if (hasMaxCount()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMaxCount();
            }
            if (hasIntSize()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + this.intSize_;
            }
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.type_;
            }
            if (hasLongNames()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashBoolean(getLongNames());
            }
            if (hasPackedStruct()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getPackedStruct());
            }
            if (hasPackedEnum()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + Internal.hashBoolean(getPackedEnum());
            }
            if (hasSkipMessage()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + Internal.hashBoolean(getSkipMessage());
            }
            if (hasNoUnions()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + Internal.hashBoolean(getNoUnions());
            }
            if (hasMsgid()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getMsgid();
            }
            if (hasAnonymousOneof()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + Internal.hashBoolean(getAnonymousOneof());
            }
            if (hasProto3()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + Internal.hashBoolean(getProto3());
            }
            if (hasEnumToString()) {
                iHashCode = (((iHashCode * 37) + 13) * 53) + Internal.hashBoolean(getEnumToString());
            }
            if (hasFixedLength()) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + Internal.hashBoolean(getFixedLength());
            }
            if (hasFixedCount()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + Internal.hashBoolean(getFixedCount());
            }
            if (hasMangleNames()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + this.mangleNames_;
            }
            if (hasCallbackDatatype()) {
                iHashCode = (((iHashCode * 37) + 18) * 53) + getCallbackDatatype().hashCode();
            }
            if (hasCallbackFunction()) {
                iHashCode = (((iHashCode * 37) + 19) * 53) + getCallbackFunction().hashCode();
            }
            if (hasDescriptorsize()) {
                iHashCode = (((iHashCode * 37) + 20) * 53) + this.descriptorsize_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return Nanopb.internal_static_SENanoPBOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(SENanoPBOptions.class, Builder.class);
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
                codedOutputStream.writeInt32(1, this.maxSize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeInt32(2, this.maxCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(3, this.type_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(4, this.longNames_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(5, this.packedStruct_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeBool(6, this.skipMessage_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(7, this.intSize_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeBool(8, this.noUnions_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeUInt32(9, this.msgid_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBool(10, this.packedEnum_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeBool(11, this.anonymousOneof_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeBool(12, this.proto3_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeBool(13, this.enumToString_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeInt32(14, this.maxLength_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeBool(15, this.fixedLength_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeBool(16, this.fixedCount_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeEnum(17, this.mangleNames_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 18, this.callbackDatatype_);
            }
            if ((this.bitField0_ & 262144) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 19, this.callbackFunction_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeEnum(20, this.descriptorsize_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SENanoPBOptions(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.maxSize_ = 0;
            this.maxLength_ = 0;
            this.maxCount_ = 0;
            this.intSize_ = 0;
            this.type_ = 0;
            this.longNames_ = true;
            this.packedStruct_ = false;
            this.packedEnum_ = false;
            this.skipMessage_ = false;
            this.noUnions_ = false;
            this.msgid_ = 0;
            this.anonymousOneof_ = false;
            this.proto3_ = false;
            this.enumToString_ = false;
            this.fixedLength_ = false;
            this.fixedCount_ = false;
            this.mangleNames_ = 0;
            this.callbackDatatype_ = "pb_callback_t";
            this.callbackFunction_ = "pb_default_field_callback";
            this.descriptorsize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SENanoPBOptions sENanoPBOptions) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sENanoPBOptions);
        }

        public static SENanoPBOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SENanoPBOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SENanoPBOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SENanoPBOptions parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SENanoPBOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SENanoPBOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SENanoPBOptions parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SENanoPBOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SENanoPBOptions parseFrom(InputStream inputStream) {
            return (SENanoPBOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SENanoPBOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SENanoPBOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SENanoPBOptions parseFrom(CodedInputStream codedInputStream) {
            return (SENanoPBOptions) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SENanoPBOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SENanoPBOptions) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SENanoPBOptions() {
            this.maxSize_ = 0;
            this.maxLength_ = 0;
            this.maxCount_ = 0;
            this.intSize_ = 0;
            this.type_ = 0;
            this.longNames_ = true;
            this.packedStruct_ = false;
            this.packedEnum_ = false;
            this.skipMessage_ = false;
            this.noUnions_ = false;
            this.msgid_ = 0;
            this.anonymousOneof_ = false;
            this.proto3_ = false;
            this.enumToString_ = false;
            this.fixedLength_ = false;
            this.fixedCount_ = false;
            this.mangleNames_ = 0;
            this.callbackDatatype_ = "pb_callback_t";
            this.callbackFunction_ = "pb_default_field_callback";
            this.descriptorsize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.intSize_ = 0;
            this.type_ = 0;
            this.longNames_ = true;
            this.mangleNames_ = 0;
            this.callbackDatatype_ = "pb_callback_t";
            this.callbackFunction_ = "pb_default_field_callback";
            this.descriptorsize_ = 0;
        }
    }

    public interface SENanoPBOptionsOrBuilder extends MessageOrBuilder {
        boolean getAnonymousOneof();

        String getCallbackDatatype();

        ByteString getCallbackDatatypeBytes();

        String getCallbackFunction();

        ByteString getCallbackFunctionBytes();

        SEDescriptorSize getDescriptorsize();

        boolean getEnumToString();

        boolean getFixedCount();

        boolean getFixedLength();

        SEIntSize getIntSize();

        boolean getLongNames();

        SETypenameMangling getMangleNames();

        int getMaxCount();

        int getMaxLength();

        int getMaxSize();

        int getMsgid();

        boolean getNoUnions();

        boolean getPackedEnum();

        boolean getPackedStruct();

        boolean getProto3();

        boolean getSkipMessage();

        SEFieldType getType();

        boolean hasAnonymousOneof();

        boolean hasCallbackDatatype();

        boolean hasCallbackFunction();

        boolean hasDescriptorsize();

        boolean hasEnumToString();

        boolean hasFixedCount();

        boolean hasFixedLength();

        boolean hasIntSize();

        boolean hasLongNames();

        boolean hasMangleNames();

        boolean hasMaxCount();

        boolean hasMaxLength();

        boolean hasMaxSize();

        boolean hasMsgid();

        boolean hasNoUnions();

        boolean hasPackedEnum();

        boolean hasPackedStruct();

        boolean hasProto3();

        boolean hasSkipMessage();

        boolean hasType();
    }

    public enum SETypenameMangling implements ProtocolMessageEnum {
        M_NONE(0),
        M_STRIP_PACKAGE(1),
        M_FLATTEN(2);

        public static final int M_FLATTEN_VALUE = 2;
        public static final int M_NONE_VALUE = 0;
        public static final int M_STRIP_PACKAGE_VALUE = 1;
        private static final SETypenameMangling[] VALUES;
        private static final Internal.EnumLiteMap<SETypenameMangling> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.wear.protobuf.Nanopb$SETypenameMangling$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SETypenameMangling> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SETypenameMangling findValueByNumber(int i7) {
                return SETypenameMangling.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SETypenameMangling");
            internalValueMap = new Internal.EnumLiteMap<SETypenameMangling>() { // from class: com.zh.ble.wear.protobuf.Nanopb.SETypenameMangling.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SETypenameMangling findValueByNumber(int i7) {
                    return SETypenameMangling.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SETypenameMangling(int i7) {
            this.value = i7;
        }

        public static SETypenameMangling forNumber(int i7) {
            if (i7 == 0) {
                return M_NONE;
            }
            if (i7 == 1) {
                return M_STRIP_PACKAGE;
            }
            if (i7 != 2) {
                return null;
            }
            return M_FLATTEN;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return Nanopb.getDescriptor().getEnumType(2);
        }

        public static Internal.EnumLiteMap<SETypenameMangling> internalGetValueMap() {
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
        public static SETypenameMangling valueOf(int i7) {
            return forNumber(i7);
        }

        public static SETypenameMangling valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Nanopb");
        GeneratedMessage.GeneratedExtension<DescriptorProtos.FileOptions, SENanoPBOptions> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(SENanoPBOptions.class, SENanoPBOptions.getDefaultInstance());
        nanopbFileopt = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.MessageOptions, SENanoPBOptions> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(SENanoPBOptions.class, SENanoPBOptions.getDefaultInstance());
        nanopbMsgopt = generatedExtensionNewFileScopedGeneratedExtension2;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.EnumOptions, SENanoPBOptions> generatedExtensionNewFileScopedGeneratedExtension3 = GeneratedMessage.newFileScopedGeneratedExtension(SENanoPBOptions.class, SENanoPBOptions.getDefaultInstance());
        nanopbEnumopt = generatedExtensionNewFileScopedGeneratedExtension3;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.FieldOptions, SENanoPBOptions> generatedExtensionNewFileScopedGeneratedExtension4 = GeneratedMessage.newFileScopedGeneratedExtension(SENanoPBOptions.class, SENanoPBOptions.getDefaultInstance());
        nanopb = generatedExtensionNewFileScopedGeneratedExtension4;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fnanopb.proto\u001a google/protobuf/descriptor.proto\"\u008c\u0005\n\u000fSENanoPBOptions\u0012\u0010\n\bmax_size\u0018\u0001 \u0001(\u0005\u0012\u0012\n\nmax_length\u0018\u000e \u0001(\u0005\u0012\u0011\n\tmax_count\u0018\u0002 \u0001(\u0005\u0012(\n\bint_size\u0018\u0007 \u0001(\u000e2\n.SEIntSize:\nIS_DEFAULT\u0012&\n\u0004type\u0018\u0003 \u0001(\u000e2\f.SEFieldType:\nFT_DEFAULT\u0012\u0018\n\nlong_names\u0018\u0004 \u0001(\b:\u0004true\u0012\u001c\n\rpacked_struct\u0018\u0005 \u0001(\b:\u0005false\u0012\u001a\n\u000bpacked_enum\u0018\n \u0001(\b:\u0005false\u0012\u001b\n\fskip_message\u0018\u0006 \u0001(\b:\u0005false\u0012\u0018\n\tno_unions\u0018\b \u0001(\b:\u0005false\u0012\r\n\u0005msgid\u0018\t \u0001(\r\u0012\u001e\n\u000fanonymous_oneof\u0018\u000b \u0001(\b:\u0005false\u0012\u0015\n\u0006proto3\u0018\f \u0001(\b:\u0005false\u0012\u001d\n\u000eenum_to_string\u0018\r \u0001(\b:\u0005false\u0012\u001b\n\ffixed_length\u0018\u000f \u0001(\b:\u0005false\u0012\u001a\n\u000bfixed_count\u0018\u0010 \u0001(\b:\u0005false\u00121\n\fmangle_names\u0018\u0011 \u0001(\u000e2\u0013.SETypenameMangling:\u0006M_NONE\u0012(\n\u0011callback_datatype\u0018\u0012 \u0001(\t:\rpb_callback_t\u00124\n\u0011callback_function\u0018\u0013 \u0001(\t:\u0019pb_default_field_callback\u00122\n\u000edescriptorsize\u0018\u0014 \u0001(\u000e2\u0011.SEDescriptorSize:\u0007DS_AUTO*k\n\u000bSEFieldType\u0012\u000e\n\nFT_DEFAULT\u0010\u0000\u0012\u000f\n\u000bFT_CALLBACK\u0010\u0001\u0012\u000e\n\nFT_POINTER\u0010\u0004\u0012\r\n\tFT_STATIC\u0010\u0002\u0012\r\n\tFT_IGNORE\u0010\u0003\u0012\r\n\tFT_INLINE\u0010\u0005*F\n\tSEIntSize\u0012\u000e\n\nIS_DEFAULT\u0010\u0000\u0012\b\n\u0004IS_8\u0010\b\u0012\t\n\u0005IS_16\u0010\u0010\u0012\t\n\u0005IS_32\u0010 \u0012\t\n\u0005IS_64\u0010@*D\n\u0012SETypenameMangling\u0012\n\n\u0006M_NONE\u0010\u0000\u0012\u0013\n\u000fM_STRIP_PACKAGE\u0010\u0001\u0012\r\n\tM_FLATTEN\u0010\u0002*G\n\u0010SEDescriptorSize\u0012\u000b\n\u0007DS_AUTO\u0010\u0000\u0012\b\n\u0004DS_1\u0010\u0001\u0012\b\n\u0004DS_2\u0010\u0002\u0012\b\n\u0004DS_4\u0010\u0004\u0012\b\n\u0004DS_8\u0010\b:G\n\u000enanopb_fileopt\u0012\u001c.google.protobuf.FileOptions\u0018ò\u0007 \u0001(\u000b2\u0010.SENanoPBOptions:I\n\rnanopb_msgopt\u0012\u001f.google.protobuf.MessageOptions\u0018ò\u0007 \u0001(\u000b2\u0010.SENanoPBOptions:G\n\u000enanopb_enumopt\u0012\u001c.google.protobuf.EnumOptions\u0018ò\u0007 \u0001(\u000b2\u0010.SENanoPBOptions:@\n\u0006nanopb\u0012\u001d.google.protobuf.FieldOptions\u0018ò\u0007 \u0001(\u000b2\u0010.SENanoPBOptionsB\u001a\n\u0018com.zh.ble.wear.protobuf"}, new Descriptors.FileDescriptor[]{DescriptorProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SENanoPBOptions_descriptor = messageType;
        internal_static_SENanoPBOptions_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"MaxSize", "MaxLength", "MaxCount", "IntSize", "Type", "LongNames", "PackedStruct", "PackedEnum", "SkipMessage", "NoUnions", "Msgid", "AnonymousOneof", "Proto3", "EnumToString", "FixedLength", "FixedCount", "MangleNames", "CallbackDatatype", "CallbackFunction", "Descriptorsize"});
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtension(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtension(1));
        generatedExtensionNewFileScopedGeneratedExtension3.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtension(2));
        generatedExtensionNewFileScopedGeneratedExtension4.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtension(3));
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        DescriptorProtos.getDescriptor();
    }

    private Nanopb() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(nanopbFileopt);
        extensionRegistryLite.add(nanopbMsgopt);
        extensionRegistryLite.add(nanopbEnumopt);
        extensionRegistryLite.add(nanopb);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}