package com.zh.wear.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class Nanopb {
    public static final int NANOPB_ENUMOPT_FIELD_NUMBER = 1010;
    public static final int NANOPB_FIELD_NUMBER = 1010;
    public static final int NANOPB_FILEOPT_FIELD_NUMBER = 1010;
    public static final int NANOPB_MSGOPT_FIELD_NUMBER = 1010;
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_NanoPBOptions_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NanoPBOptions_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.FieldOptions, NanoPBOptions> nanopb;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.EnumOptions, NanoPBOptions> nanopbEnumopt;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.FileOptions, NanoPBOptions> nanopbFileopt;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.MessageOptions, NanoPBOptions> nanopbMsgopt;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.Nanopb$1 */
    public class AnonymousClass1 implements Descriptors.FileDescriptor.InternalDescriptorAssigner {
        @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
        public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
            Descriptors.FileDescriptor unused = Nanopb.descriptor = fileDescriptor;
            return null;
        }
    }

    public enum DescriptorSize implements ProtocolMessageEnum {
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
        private final int value;
        private static final Internal.EnumLiteMap<DescriptorSize> internalValueMap = new Internal.EnumLiteMap<DescriptorSize>() { // from class: com.zh.wear.protobuf.Nanopb.DescriptorSize.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DescriptorSize findValueByNumber(int i7) {
                return DescriptorSize.forNumber(i7);
            }
        };
        private static final DescriptorSize[] VALUES = values();

        /* JADX INFO: renamed from: com.zh.wear.protobuf.Nanopb$DescriptorSize$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<DescriptorSize> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DescriptorSize findValueByNumber(int i7) {
                return DescriptorSize.forNumber(i7);
            }
        }

        DescriptorSize(int i7) {
            this.value = i7;
        }

        public static DescriptorSize forNumber(int i7) {
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

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Nanopb.getDescriptor().getEnumTypes().get(3);
        }

        public static Internal.EnumLiteMap<DescriptorSize> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static DescriptorSize valueOf(int i7) {
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

        public static DescriptorSize valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum FieldType implements ProtocolMessageEnum {
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
        private final int value;
        private static final Internal.EnumLiteMap<FieldType> internalValueMap = new Internal.EnumLiteMap<FieldType>() { // from class: com.zh.wear.protobuf.Nanopb.FieldType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public FieldType findValueByNumber(int i7) {
                return FieldType.forNumber(i7);
            }
        };
        private static final FieldType[] VALUES = values();

        /* JADX INFO: renamed from: com.zh.wear.protobuf.Nanopb$FieldType$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<FieldType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public FieldType findValueByNumber(int i7) {
                return FieldType.forNumber(i7);
            }
        }

        FieldType(int i7) {
            this.value = i7;
        }

        public static FieldType forNumber(int i7) {
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

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Nanopb.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<FieldType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static FieldType valueOf(int i7) {
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

        public static FieldType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum IntSize implements ProtocolMessageEnum {
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
        private final int value;
        private static final Internal.EnumLiteMap<IntSize> internalValueMap = new Internal.EnumLiteMap<IntSize>() { // from class: com.zh.wear.protobuf.Nanopb.IntSize.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public IntSize findValueByNumber(int i7) {
                return IntSize.forNumber(i7);
            }
        };
        private static final IntSize[] VALUES = values();

        /* JADX INFO: renamed from: com.zh.wear.protobuf.Nanopb$IntSize$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<IntSize> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public IntSize findValueByNumber(int i7) {
                return IntSize.forNumber(i7);
            }
        }

        IntSize(int i7) {
            this.value = i7;
        }

        public static IntSize forNumber(int i7) {
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

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Nanopb.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<IntSize> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static IntSize valueOf(int i7) {
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

        public static IntSize valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class NanoPBOptions extends GeneratedMessageV3 implements NanoPBOptionsOrBuilder {
        public static final int ANONYMOUS_ONEOF_FIELD_NUMBER = 11;
        public static final int CALLBACK_DATATYPE_FIELD_NUMBER = 18;
        public static final int CALLBACK_FUNCTION_FIELD_NUMBER = 19;
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
        private static final NanoPBOptions DEFAULT_INSTANCE = new NanoPBOptions();

        @Deprecated
        public static final Parser<NanoPBOptions> PARSER = new AbstractParser<NanoPBOptions>() { // from class: com.zh.wear.protobuf.Nanopb.NanoPBOptions.1
            @Override // com.google.protobuf.Parser
            public NanoPBOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new NanoPBOptions(codedInputStream, extensionRegistryLite);
            }
        };

        /* JADX INFO: renamed from: com.zh.wear.protobuf.Nanopb$NanoPBOptions$1 */
        public class AnonymousClass1 extends AbstractParser<NanoPBOptions> {
            @Override // com.google.protobuf.Parser
            public NanoPBOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new NanoPBOptions(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NanoPBOptionsOrBuilder {
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

            private Builder() {
                this.intSize_ = 0;
                this.type_ = 0;
                this.longNames_ = true;
                this.mangleNames_ = 0;
                this.callbackDatatype_ = "pb_callback_t";
                this.callbackFunction_ = "pb_default_field_callback";
                this.descriptorsize_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Nanopb.internal_static_NanoPBOptions_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAnonymousOneof() {
                this.bitField0_ &= -2049;
                this.anonymousOneof_ = false;
                onChanged();
                return this;
            }

            public Builder clearCallbackDatatype() {
                this.bitField0_ &= -131073;
                this.callbackDatatype_ = NanoPBOptions.getDefaultInstance().getCallbackDatatype();
                onChanged();
                return this;
            }

            public Builder clearCallbackFunction() {
                this.bitField0_ &= -262145;
                this.callbackFunction_ = NanoPBOptions.getDefaultInstance().getCallbackFunction();
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

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getAnonymousOneof() {
                return this.anonymousOneof_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
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

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public ByteString getCallbackDatatypeBytes() {
                Object obj = this.callbackDatatype_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.callbackDatatype_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
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

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
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
                return Nanopb.internal_static_NanoPBOptions_descriptor;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public DescriptorSize getDescriptorsize() {
                DescriptorSize descriptorSizeValueOf = DescriptorSize.valueOf(this.descriptorsize_);
                return descriptorSizeValueOf == null ? DescriptorSize.DS_AUTO : descriptorSizeValueOf;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getEnumToString() {
                return this.enumToString_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getFixedCount() {
                return this.fixedCount_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getFixedLength() {
                return this.fixedLength_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public IntSize getIntSize() {
                IntSize intSizeValueOf = IntSize.valueOf(this.intSize_);
                return intSizeValueOf == null ? IntSize.IS_DEFAULT : intSizeValueOf;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getLongNames() {
                return this.longNames_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public TypenameMangling getMangleNames() {
                TypenameMangling typenameManglingValueOf = TypenameMangling.valueOf(this.mangleNames_);
                return typenameManglingValueOf == null ? TypenameMangling.M_NONE : typenameManglingValueOf;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public int getMaxCount() {
                return this.maxCount_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public int getMaxLength() {
                return this.maxLength_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public int getMaxSize() {
                return this.maxSize_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public int getMsgid() {
                return this.msgid_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getNoUnions() {
                return this.noUnions_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getPackedEnum() {
                return this.packedEnum_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getPackedStruct() {
                return this.packedStruct_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getProto3() {
                return this.proto3_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean getSkipMessage() {
                return this.skipMessage_;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public FieldType getType() {
                FieldType fieldTypeValueOf = FieldType.valueOf(this.type_);
                return fieldTypeValueOf == null ? FieldType.FT_DEFAULT : fieldTypeValueOf;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasAnonymousOneof() {
                return (this.bitField0_ & 2048) == 2048;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasCallbackDatatype() {
                return (this.bitField0_ & 131072) == 131072;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasCallbackFunction() {
                return (this.bitField0_ & 262144) == 262144;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasDescriptorsize() {
                return (this.bitField0_ & 524288) == 524288;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasEnumToString() {
                return (this.bitField0_ & 8192) == 8192;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasFixedCount() {
                return (this.bitField0_ & 32768) == 32768;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasFixedLength() {
                return (this.bitField0_ & 16384) == 16384;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasIntSize() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasLongNames() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMangleNames() {
                return (this.bitField0_ & 65536) == 65536;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMaxCount() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMaxLength() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMaxSize() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMsgid() {
                return (this.bitField0_ & 1024) == 1024;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasNoUnions() {
                return (this.bitField0_ & 512) == 512;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasPackedEnum() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasPackedStruct() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasProto3() {
                return (this.bitField0_ & 4096) == 4096;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasSkipMessage() {
                return (this.bitField0_ & 256) == 256;
            }

            @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Nanopb.internal_static_NanoPBOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(NanoPBOptions.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAnonymousOneof(boolean z6) {
                this.bitField0_ |= 2048;
                this.anonymousOneof_ = z6;
                onChanged();
                return this;
            }

            public Builder setCallbackDatatype(String str) {
                str.getClass();
                this.bitField0_ |= 131072;
                this.callbackDatatype_ = str;
                onChanged();
                return this;
            }

            public Builder setCallbackDatatypeBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 131072;
                this.callbackDatatype_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCallbackFunction(String str) {
                str.getClass();
                this.bitField0_ |= 262144;
                this.callbackFunction_ = str;
                onChanged();
                return this;
            }

            public Builder setCallbackFunctionBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 262144;
                this.callbackFunction_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDescriptorsize(DescriptorSize descriptorSize) {
                descriptorSize.getClass();
                this.bitField0_ |= 524288;
                this.descriptorsize_ = descriptorSize.getNumber();
                onChanged();
                return this;
            }

            public Builder setEnumToString(boolean z6) {
                this.bitField0_ |= 8192;
                this.enumToString_ = z6;
                onChanged();
                return this;
            }

            public Builder setFixedCount(boolean z6) {
                this.bitField0_ |= 32768;
                this.fixedCount_ = z6;
                onChanged();
                return this;
            }

            public Builder setFixedLength(boolean z6) {
                this.bitField0_ |= 16384;
                this.fixedLength_ = z6;
                onChanged();
                return this;
            }

            public Builder setIntSize(IntSize intSize) {
                intSize.getClass();
                this.bitField0_ |= 8;
                this.intSize_ = intSize.getNumber();
                onChanged();
                return this;
            }

            public Builder setLongNames(boolean z6) {
                this.bitField0_ |= 32;
                this.longNames_ = z6;
                onChanged();
                return this;
            }

            public Builder setMangleNames(TypenameMangling typenameMangling) {
                typenameMangling.getClass();
                this.bitField0_ |= 65536;
                this.mangleNames_ = typenameMangling.getNumber();
                onChanged();
                return this;
            }

            public Builder setMaxCount(int i7) {
                this.bitField0_ |= 4;
                this.maxCount_ = i7;
                onChanged();
                return this;
            }

            public Builder setMaxLength(int i7) {
                this.bitField0_ |= 2;
                this.maxLength_ = i7;
                onChanged();
                return this;
            }

            public Builder setMaxSize(int i7) {
                this.bitField0_ |= 1;
                this.maxSize_ = i7;
                onChanged();
                return this;
            }

            public Builder setMsgid(int i7) {
                this.bitField0_ |= 1024;
                this.msgid_ = i7;
                onChanged();
                return this;
            }

            public Builder setNoUnions(boolean z6) {
                this.bitField0_ |= 512;
                this.noUnions_ = z6;
                onChanged();
                return this;
            }

            public Builder setPackedEnum(boolean z6) {
                this.bitField0_ |= 128;
                this.packedEnum_ = z6;
                onChanged();
                return this;
            }

            public Builder setPackedStruct(boolean z6) {
                this.bitField0_ |= 64;
                this.packedStruct_ = z6;
                onChanged();
                return this;
            }

            public Builder setProto3(boolean z6) {
                this.bitField0_ |= 4096;
                this.proto3_ = z6;
                onChanged();
                return this;
            }

            public Builder setSkipMessage(boolean z6) {
                this.bitField0_ |= 256;
                this.skipMessage_ = z6;
                onChanged();
                return this;
            }

            public Builder setType(FieldType fieldType) {
                fieldType.getClass();
                this.bitField0_ |= 16;
                this.type_ = fieldType.getNumber();
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.intSize_ = 0;
                this.type_ = 0;
                this.longNames_ = true;
                this.mangleNames_ = 0;
                this.callbackDatatype_ = "pb_callback_t";
                this.callbackFunction_ = "pb_default_field_callback";
                this.descriptorsize_ = 0;
                maybeForceBuilderInitialization();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, AnonymousClass1 anonymousClass1) {
                this(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NanoPBOptions build() {
                NanoPBOptions nanoPBOptionsBuildPartial = buildPartial();
                if (nanoPBOptionsBuildPartial.isInitialized()) {
                    return nanoPBOptionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) nanoPBOptionsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NanoPBOptions buildPartial() {
                NanoPBOptions nanoPBOptions = new NanoPBOptions(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                nanoPBOptions.maxSize_ = this.maxSize_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                nanoPBOptions.maxLength_ = this.maxLength_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                nanoPBOptions.maxCount_ = this.maxCount_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                nanoPBOptions.intSize_ = this.intSize_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                nanoPBOptions.type_ = this.type_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                nanoPBOptions.longNames_ = this.longNames_;
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                nanoPBOptions.packedStruct_ = this.packedStruct_;
                if ((i7 & 128) == 128) {
                    i8 |= 128;
                }
                nanoPBOptions.packedEnum_ = this.packedEnum_;
                if ((i7 & 256) == 256) {
                    i8 |= 256;
                }
                nanoPBOptions.skipMessage_ = this.skipMessage_;
                if ((i7 & 512) == 512) {
                    i8 |= 512;
                }
                nanoPBOptions.noUnions_ = this.noUnions_;
                if ((i7 & 1024) == 1024) {
                    i8 |= 1024;
                }
                nanoPBOptions.msgid_ = this.msgid_;
                if ((i7 & 2048) == 2048) {
                    i8 |= 2048;
                }
                nanoPBOptions.anonymousOneof_ = this.anonymousOneof_;
                if ((i7 & 4096) == 4096) {
                    i8 |= 4096;
                }
                nanoPBOptions.proto3_ = this.proto3_;
                if ((i7 & 8192) == 8192) {
                    i8 |= 8192;
                }
                nanoPBOptions.enumToString_ = this.enumToString_;
                if ((i7 & 16384) == 16384) {
                    i8 |= 16384;
                }
                nanoPBOptions.fixedLength_ = this.fixedLength_;
                if ((i7 & 32768) == 32768) {
                    i8 |= 32768;
                }
                nanoPBOptions.fixedCount_ = this.fixedCount_;
                if ((i7 & 65536) == 65536) {
                    i8 |= 65536;
                }
                nanoPBOptions.mangleNames_ = this.mangleNames_;
                if ((i7 & 131072) == 131072) {
                    i8 |= 131072;
                }
                nanoPBOptions.callbackDatatype_ = this.callbackDatatype_;
                if ((i7 & 262144) == 262144) {
                    i8 |= 262144;
                }
                nanoPBOptions.callbackFunction_ = this.callbackFunction_;
                if ((i7 & 524288) == 524288) {
                    i8 |= 524288;
                }
                nanoPBOptions.descriptorsize_ = this.descriptorsize_;
                nanoPBOptions.bitField0_ = i8;
                onBuilt();
                return nanoPBOptions;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NanoPBOptions getDefaultInstanceForType() {
                return NanoPBOptions.getDefaultInstance();
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

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
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
                this.maxSize_ = 0;
                int i7 = this.bitField0_;
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
                this.bitField0_ = (-1048576) & i7;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo7408clone() {
                return (Builder) super.mo7408clone();
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.zh.wear.protobuf.Nanopb.NanoPBOptions.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.Nanopb$NanoPBOptions> r1 = com.zh.wear.protobuf.Nanopb.NanoPBOptions.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.Nanopb$NanoPBOptions r3 = (com.zh.wear.protobuf.Nanopb.NanoPBOptions) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.Nanopb$NanoPBOptions r4 = (com.zh.wear.protobuf.Nanopb.NanoPBOptions) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.Nanopb.NanoPBOptions.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.Nanopb$NanoPBOptions$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NanoPBOptions) {
                    return mergeFrom((NanoPBOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NanoPBOptions nanoPBOptions) {
                if (nanoPBOptions == NanoPBOptions.getDefaultInstance()) {
                    return this;
                }
                if (nanoPBOptions.hasMaxSize()) {
                    setMaxSize(nanoPBOptions.getMaxSize());
                }
                if (nanoPBOptions.hasMaxLength()) {
                    setMaxLength(nanoPBOptions.getMaxLength());
                }
                if (nanoPBOptions.hasMaxCount()) {
                    setMaxCount(nanoPBOptions.getMaxCount());
                }
                if (nanoPBOptions.hasIntSize()) {
                    setIntSize(nanoPBOptions.getIntSize());
                }
                if (nanoPBOptions.hasType()) {
                    setType(nanoPBOptions.getType());
                }
                if (nanoPBOptions.hasLongNames()) {
                    setLongNames(nanoPBOptions.getLongNames());
                }
                if (nanoPBOptions.hasPackedStruct()) {
                    setPackedStruct(nanoPBOptions.getPackedStruct());
                }
                if (nanoPBOptions.hasPackedEnum()) {
                    setPackedEnum(nanoPBOptions.getPackedEnum());
                }
                if (nanoPBOptions.hasSkipMessage()) {
                    setSkipMessage(nanoPBOptions.getSkipMessage());
                }
                if (nanoPBOptions.hasNoUnions()) {
                    setNoUnions(nanoPBOptions.getNoUnions());
                }
                if (nanoPBOptions.hasMsgid()) {
                    setMsgid(nanoPBOptions.getMsgid());
                }
                if (nanoPBOptions.hasAnonymousOneof()) {
                    setAnonymousOneof(nanoPBOptions.getAnonymousOneof());
                }
                if (nanoPBOptions.hasProto3()) {
                    setProto3(nanoPBOptions.getProto3());
                }
                if (nanoPBOptions.hasEnumToString()) {
                    setEnumToString(nanoPBOptions.getEnumToString());
                }
                if (nanoPBOptions.hasFixedLength()) {
                    setFixedLength(nanoPBOptions.getFixedLength());
                }
                if (nanoPBOptions.hasFixedCount()) {
                    setFixedCount(nanoPBOptions.getFixedCount());
                }
                if (nanoPBOptions.hasMangleNames()) {
                    setMangleNames(nanoPBOptions.getMangleNames());
                }
                if (nanoPBOptions.hasCallbackDatatype()) {
                    this.bitField0_ |= 131072;
                    this.callbackDatatype_ = nanoPBOptions.callbackDatatype_;
                    onChanged();
                }
                if (nanoPBOptions.hasCallbackFunction()) {
                    this.bitField0_ |= 262144;
                    this.callbackFunction_ = nanoPBOptions.callbackFunction_;
                    onChanged();
                }
                if (nanoPBOptions.hasDescriptorsize()) {
                    setDescriptorsize(nanoPBOptions.getDescriptorsize());
                }
                mergeUnknownFields(((GeneratedMessage) nanoPBOptions).unknownFields);
                onChanged();
                return this;
            }
        }

        private NanoPBOptions() {
            this.memoizedIsInitialized = (byte) -1;
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
        }

        public static NanoPBOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Nanopb.internal_static_NanoPBOptions_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NanoPBOptions parseDelimitedFrom(InputStream inputStream) {
            return (NanoPBOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NanoPBOptions parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<NanoPBOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NanoPBOptions)) {
                return super.equals(obj);
            }
            NanoPBOptions nanoPBOptions = (NanoPBOptions) obj;
            boolean z6 = hasMaxSize() == nanoPBOptions.hasMaxSize();
            if (hasMaxSize()) {
                z6 = z6 && getMaxSize() == nanoPBOptions.getMaxSize();
            }
            boolean z7 = z6 && hasMaxLength() == nanoPBOptions.hasMaxLength();
            if (hasMaxLength()) {
                z7 = z7 && getMaxLength() == nanoPBOptions.getMaxLength();
            }
            boolean z8 = z7 && hasMaxCount() == nanoPBOptions.hasMaxCount();
            if (hasMaxCount()) {
                z8 = z8 && getMaxCount() == nanoPBOptions.getMaxCount();
            }
            boolean z9 = z8 && hasIntSize() == nanoPBOptions.hasIntSize();
            if (hasIntSize()) {
                z9 = z9 && this.intSize_ == nanoPBOptions.intSize_;
            }
            boolean z10 = z9 && hasType() == nanoPBOptions.hasType();
            if (hasType()) {
                z10 = z10 && this.type_ == nanoPBOptions.type_;
            }
            boolean z11 = z10 && hasLongNames() == nanoPBOptions.hasLongNames();
            if (hasLongNames()) {
                z11 = z11 && getLongNames() == nanoPBOptions.getLongNames();
            }
            boolean z12 = z11 && hasPackedStruct() == nanoPBOptions.hasPackedStruct();
            if (hasPackedStruct()) {
                z12 = z12 && getPackedStruct() == nanoPBOptions.getPackedStruct();
            }
            boolean z13 = z12 && hasPackedEnum() == nanoPBOptions.hasPackedEnum();
            if (hasPackedEnum()) {
                z13 = z13 && getPackedEnum() == nanoPBOptions.getPackedEnum();
            }
            boolean z14 = z13 && hasSkipMessage() == nanoPBOptions.hasSkipMessage();
            if (hasSkipMessage()) {
                z14 = z14 && getSkipMessage() == nanoPBOptions.getSkipMessage();
            }
            boolean z15 = z14 && hasNoUnions() == nanoPBOptions.hasNoUnions();
            if (hasNoUnions()) {
                z15 = z15 && getNoUnions() == nanoPBOptions.getNoUnions();
            }
            boolean z16 = z15 && hasMsgid() == nanoPBOptions.hasMsgid();
            if (hasMsgid()) {
                z16 = z16 && getMsgid() == nanoPBOptions.getMsgid();
            }
            boolean z17 = z16 && hasAnonymousOneof() == nanoPBOptions.hasAnonymousOneof();
            if (hasAnonymousOneof()) {
                z17 = z17 && getAnonymousOneof() == nanoPBOptions.getAnonymousOneof();
            }
            boolean z18 = z17 && hasProto3() == nanoPBOptions.hasProto3();
            if (hasProto3()) {
                z18 = z18 && getProto3() == nanoPBOptions.getProto3();
            }
            boolean z19 = z18 && hasEnumToString() == nanoPBOptions.hasEnumToString();
            if (hasEnumToString()) {
                z19 = z19 && getEnumToString() == nanoPBOptions.getEnumToString();
            }
            boolean z20 = z19 && hasFixedLength() == nanoPBOptions.hasFixedLength();
            if (hasFixedLength()) {
                z20 = z20 && getFixedLength() == nanoPBOptions.getFixedLength();
            }
            boolean z21 = z20 && hasFixedCount() == nanoPBOptions.hasFixedCount();
            if (hasFixedCount()) {
                z21 = z21 && getFixedCount() == nanoPBOptions.getFixedCount();
            }
            boolean z22 = z21 && hasMangleNames() == nanoPBOptions.hasMangleNames();
            if (hasMangleNames()) {
                z22 = z22 && this.mangleNames_ == nanoPBOptions.mangleNames_;
            }
            boolean z23 = z22 && hasCallbackDatatype() == nanoPBOptions.hasCallbackDatatype();
            if (hasCallbackDatatype()) {
                z23 = z23 && getCallbackDatatype().equals(nanoPBOptions.getCallbackDatatype());
            }
            boolean z24 = z23 && hasCallbackFunction() == nanoPBOptions.hasCallbackFunction();
            if (hasCallbackFunction()) {
                z24 = z24 && getCallbackFunction().equals(nanoPBOptions.getCallbackFunction());
            }
            boolean z25 = z24 && hasDescriptorsize() == nanoPBOptions.hasDescriptorsize();
            if (hasDescriptorsize()) {
                z25 = z25 && this.descriptorsize_ == nanoPBOptions.descriptorsize_;
            }
            return z25 && this.unknownFields.equals(nanoPBOptions.unknownFields);
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getAnonymousOneof() {
            return this.anonymousOneof_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
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

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public ByteString getCallbackDatatypeBytes() {
            Object obj = this.callbackDatatype_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callbackDatatype_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
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

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public ByteString getCallbackFunctionBytes() {
            Object obj = this.callbackFunction_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callbackFunction_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public DescriptorSize getDescriptorsize() {
            DescriptorSize descriptorSizeValueOf = DescriptorSize.valueOf(this.descriptorsize_);
            return descriptorSizeValueOf == null ? DescriptorSize.DS_AUTO : descriptorSizeValueOf;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getEnumToString() {
            return this.enumToString_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getFixedCount() {
            return this.fixedCount_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getFixedLength() {
            return this.fixedLength_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public IntSize getIntSize() {
            IntSize intSizeValueOf = IntSize.valueOf(this.intSize_);
            return intSizeValueOf == null ? IntSize.IS_DEFAULT : intSizeValueOf;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getLongNames() {
            return this.longNames_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public TypenameMangling getMangleNames() {
            TypenameMangling typenameManglingValueOf = TypenameMangling.valueOf(this.mangleNames_);
            return typenameManglingValueOf == null ? TypenameMangling.M_NONE : typenameManglingValueOf;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public int getMaxCount() {
            return this.maxCount_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public int getMaxLength() {
            return this.maxLength_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public int getMaxSize() {
            return this.maxSize_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public int getMsgid() {
            return this.msgid_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getNoUnions() {
            return this.noUnions_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getPackedEnum() {
            return this.packedEnum_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getPackedStruct() {
            return this.packedStruct_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NanoPBOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getProto3() {
            return this.proto3_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.maxSize_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.maxCount_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.type_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(4, this.longNames_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(5, this.packedStruct_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(6, this.skipMessage_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(7, this.intSize_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(8, this.noUnions_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                iComputeInt32Size += CodedOutputStream.computeUInt32Size(9, this.msgid_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(10, this.packedEnum_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(11, this.anonymousOneof_);
            }
            if ((this.bitField0_ & 4096) == 4096) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(12, this.proto3_);
            }
            if ((this.bitField0_ & 8192) == 8192) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(13, this.enumToString_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(14, this.maxLength_);
            }
            if ((this.bitField0_ & 16384) == 16384) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(15, this.fixedLength_);
            }
            if ((this.bitField0_ & 32768) == 32768) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(16, this.fixedCount_);
            }
            if ((this.bitField0_ & 65536) == 65536) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(17, this.mangleNames_);
            }
            if ((this.bitField0_ & 131072) == 131072) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(18, this.callbackDatatype_);
            }
            if ((this.bitField0_ & 262144) == 262144) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(19, this.callbackFunction_);
            }
            if ((this.bitField0_ & 524288) == 524288) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(20, this.descriptorsize_);
            }
            int serializedSize = iComputeInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean getSkipMessage() {
            return this.skipMessage_;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public FieldType getType() {
            FieldType fieldTypeValueOf = FieldType.valueOf(this.type_);
            return fieldTypeValueOf == null ? FieldType.FT_DEFAULT : fieldTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasAnonymousOneof() {
            return (this.bitField0_ & 2048) == 2048;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasCallbackDatatype() {
            return (this.bitField0_ & 131072) == 131072;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasCallbackFunction() {
            return (this.bitField0_ & 262144) == 262144;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasDescriptorsize() {
            return (this.bitField0_ & 524288) == 524288;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasEnumToString() {
            return (this.bitField0_ & 8192) == 8192;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasFixedCount() {
            return (this.bitField0_ & 32768) == 32768;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasFixedLength() {
            return (this.bitField0_ & 16384) == 16384;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasIntSize() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasLongNames() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMangleNames() {
            return (this.bitField0_ & 65536) == 65536;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMaxCount() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMaxLength() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMaxSize() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMsgid() {
            return (this.bitField0_ & 1024) == 1024;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasNoUnions() {
            return (this.bitField0_ & 512) == 512;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasPackedEnum() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasPackedStruct() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasProto3() {
            return (this.bitField0_ & 4096) == 4096;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasSkipMessage() {
            return (this.bitField0_ & 256) == 256;
        }

        @Override // com.zh.wear.protobuf.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 16) == 16;
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
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Nanopb.internal_static_NanoPBOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(NanoPBOptions.class, Builder.class);
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.maxSize_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.maxCount_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeEnum(3, this.type_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeBool(4, this.longNames_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeBool(5, this.packedStruct_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeBool(6, this.skipMessage_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeEnum(7, this.intSize_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeBool(8, this.noUnions_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.writeUInt32(9, this.msgid_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeBool(10, this.packedEnum_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.writeBool(11, this.anonymousOneof_);
            }
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.writeBool(12, this.proto3_);
            }
            if ((this.bitField0_ & 8192) == 8192) {
                codedOutputStream.writeBool(13, this.enumToString_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(14, this.maxLength_);
            }
            if ((this.bitField0_ & 16384) == 16384) {
                codedOutputStream.writeBool(15, this.fixedLength_);
            }
            if ((this.bitField0_ & 32768) == 32768) {
                codedOutputStream.writeBool(16, this.fixedCount_);
            }
            if ((this.bitField0_ & 65536) == 65536) {
                codedOutputStream.writeEnum(17, this.mangleNames_);
            }
            if ((this.bitField0_ & 131072) == 131072) {
                GeneratedMessage.writeString(codedOutputStream, 18, this.callbackDatatype_);
            }
            if ((this.bitField0_ & 262144) == 262144) {
                GeneratedMessage.writeString(codedOutputStream, 19, this.callbackFunction_);
            }
            if ((this.bitField0_ & 524288) == 524288) {
                codedOutputStream.writeEnum(20, this.descriptorsize_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private NanoPBOptions(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.bitField0_ |= 1;
                                this.maxSize_ = codedInputStream.readInt32();
                                break;
                            case 16:
                                this.bitField0_ |= 4;
                                this.maxCount_ = codedInputStream.readInt32();
                                break;
                            case 24:
                                int i7 = codedInputStream.readEnum();
                                if (FieldType.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(3, i7);
                                } else {
                                    this.bitField0_ |= 16;
                                    this.type_ = i7;
                                }
                                break;
                            case 32:
                                this.bitField0_ |= 32;
                                this.longNames_ = codedInputStream.readBool();
                                break;
                            case 40:
                                this.bitField0_ |= 64;
                                this.packedStruct_ = codedInputStream.readBool();
                                break;
                            case 48:
                                this.bitField0_ |= 256;
                                this.skipMessage_ = codedInputStream.readBool();
                                break;
                            case 56:
                                int i8 = codedInputStream.readEnum();
                                if (IntSize.valueOf(i8) == null) {
                                    builderNewBuilder.mergeVarintField(7, i8);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.intSize_ = i8;
                                }
                                break;
                            case 64:
                                this.bitField0_ |= 512;
                                this.noUnions_ = codedInputStream.readBool();
                                break;
                            case 72:
                                this.bitField0_ |= 1024;
                                this.msgid_ = codedInputStream.readUInt32();
                                break;
                            case 80:
                                this.bitField0_ |= 128;
                                this.packedEnum_ = codedInputStream.readBool();
                                break;
                            case 88:
                                this.bitField0_ |= 2048;
                                this.anonymousOneof_ = codedInputStream.readBool();
                                break;
                            case 96:
                                this.bitField0_ |= 4096;
                                this.proto3_ = codedInputStream.readBool();
                                break;
                            case 104:
                                this.bitField0_ |= 8192;
                                this.enumToString_ = codedInputStream.readBool();
                                break;
                            case 112:
                                this.bitField0_ |= 2;
                                this.maxLength_ = codedInputStream.readInt32();
                                break;
                            case 120:
                                this.bitField0_ |= 16384;
                                this.fixedLength_ = codedInputStream.readBool();
                                break;
                            case 128:
                                this.bitField0_ |= 32768;
                                this.fixedCount_ = codedInputStream.readBool();
                                break;
                            case 136:
                                int i9 = codedInputStream.readEnum();
                                if (TypenameMangling.valueOf(i9) == null) {
                                    builderNewBuilder.mergeVarintField(17, i9);
                                } else {
                                    this.bitField0_ |= 65536;
                                    this.mangleNames_ = i9;
                                }
                                break;
                            case 146:
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 131072;
                                this.callbackDatatype_ = bytes;
                                break;
                            case 154:
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 262144;
                                this.callbackFunction_ = bytes2;
                                break;
                            case 160:
                                int i10 = codedInputStream.readEnum();
                                if (DescriptorSize.valueOf(i10) == null) {
                                    builderNewBuilder.mergeVarintField(20, i10);
                                } else {
                                    this.bitField0_ |= 524288;
                                    this.descriptorsize_ = i10;
                                }
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

        public static Builder newBuilder(NanoPBOptions nanoPBOptions) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(nanoPBOptions);
        }

        public static NanoPBOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NanoPBOptions) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NanoPBOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ NanoPBOptions(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, AnonymousClass1 anonymousClass1) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static NanoPBOptions parseFrom(CodedInputStream codedInputStream) {
            return (NanoPBOptions) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NanoPBOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private NanoPBOptions(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NanoPBOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NanoPBOptions) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ NanoPBOptions(GeneratedMessageV3.Builder builder, AnonymousClass1 anonymousClass1) {
            this(builder);
        }

        public static NanoPBOptions parseFrom(InputStream inputStream) {
            return (NanoPBOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static NanoPBOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NanoPBOptions) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NanoPBOptions parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static NanoPBOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static NanoPBOptions parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NanoPBOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface NanoPBOptionsOrBuilder extends MessageOrBuilder {
        boolean getAnonymousOneof();

        String getCallbackDatatype();

        ByteString getCallbackDatatypeBytes();

        String getCallbackFunction();

        ByteString getCallbackFunctionBytes();

        DescriptorSize getDescriptorsize();

        boolean getEnumToString();

        boolean getFixedCount();

        boolean getFixedLength();

        IntSize getIntSize();

        boolean getLongNames();

        TypenameMangling getMangleNames();

        int getMaxCount();

        int getMaxLength();

        int getMaxSize();

        int getMsgid();

        boolean getNoUnions();

        boolean getPackedEnum();

        boolean getPackedStruct();

        boolean getProto3();

        boolean getSkipMessage();

        FieldType getType();

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

    public enum TypenameMangling implements ProtocolMessageEnum {
        M_NONE(0),
        M_STRIP_PACKAGE(1),
        M_FLATTEN(2);

        public static final int M_FLATTEN_VALUE = 2;
        public static final int M_NONE_VALUE = 0;
        public static final int M_STRIP_PACKAGE_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<TypenameMangling> internalValueMap = new Internal.EnumLiteMap<TypenameMangling>() { // from class: com.zh.wear.protobuf.Nanopb.TypenameMangling.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TypenameMangling findValueByNumber(int i7) {
                return TypenameMangling.forNumber(i7);
            }
        };
        private static final TypenameMangling[] VALUES = values();

        /* JADX INFO: renamed from: com.zh.wear.protobuf.Nanopb$TypenameMangling$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<TypenameMangling> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TypenameMangling findValueByNumber(int i7) {
                return TypenameMangling.forNumber(i7);
            }
        }

        TypenameMangling(int i7) {
            this.value = i7;
        }

        public static TypenameMangling forNumber(int i7) {
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

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Nanopb.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<TypenameMangling> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static TypenameMangling valueOf(int i7) {
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

        public static TypenameMangling valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        GeneratedMessage.GeneratedExtension<DescriptorProtos.FileOptions, NanoPBOptions> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(NanoPBOptions.class, NanoPBOptions.getDefaultInstance());
        nanopbFileopt = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.MessageOptions, NanoPBOptions> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(NanoPBOptions.class, NanoPBOptions.getDefaultInstance());
        nanopbMsgopt = generatedExtensionNewFileScopedGeneratedExtension2;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.EnumOptions, NanoPBOptions> generatedExtensionNewFileScopedGeneratedExtension3 = GeneratedMessage.newFileScopedGeneratedExtension(NanoPBOptions.class, NanoPBOptions.getDefaultInstance());
        nanopbEnumopt = generatedExtensionNewFileScopedGeneratedExtension3;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.FieldOptions, NanoPBOptions> generatedExtensionNewFileScopedGeneratedExtension4 = GeneratedMessage.newFileScopedGeneratedExtension(NanoPBOptions.class, NanoPBOptions.getDefaultInstance());
        nanopb = generatedExtensionNewFileScopedGeneratedExtension4;
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fnanopb.proto\u001a google/protobuf/descriptor.proto\"\u0082\u0005\n\rNanoPBOptions\u0012\u0010\n\bmax_size\u0018\u0001 \u0001(\u0005\u0012\u0012\n\nmax_length\u0018\u000e \u0001(\u0005\u0012\u0011\n\tmax_count\u0018\u0002 \u0001(\u0005\u0012&\n\bint_size\u0018\u0007 \u0001(\u000e2\b.IntSize:\nIS_DEFAULT\u0012$\n\u0004type\u0018\u0003 \u0001(\u000e2\n.FieldType:\nFT_DEFAULT\u0012\u0018\n\nlong_names\u0018\u0004 \u0001(\b:\u0004true\u0012\u001c\n\rpacked_struct\u0018\u0005 \u0001(\b:\u0005false\u0012\u001a\n\u000bpacked_enum\u0018\n \u0001(\b:\u0005false\u0012\u001b\n\fskip_message\u0018\u0006 \u0001(\b:\u0005false\u0012\u0018\n\tno_unions\u0018\b \u0001(\b:\u0005false\u0012\r\n\u0005msgid\u0018\t \u0001(\r\u0012\u001e\n\u000fanonymous_oneof\u0018\u000b \u0001(\b:\u0005false\u0012\u0015\n\u0006proto3\u0018\f \u0001(\b:\u0005false\u0012\u001d\n\u000eenum_to_string\u0018\r \u0001(\b:\u0005false\u0012\u001b\n\ffixed_length\u0018\u000f \u0001(\b:\u0005false\u0012\u001a\n\u000bfixed_count\u0018\u0010 \u0001(\b:\u0005false\u0012/\n\fmangle_names\u0018\u0011 \u0001(\u000e2\u0011.TypenameMangling:\u0006M_NONE\u0012(\n\u0011callback_datatype\u0018\u0012 \u0001(\t:\rpb_callback_t\u00124\n\u0011callback_function\u0018\u0013 \u0001(\t:\u0019pb_default_field_callback\u00120\n\u000edescriptorsize\u0018\u0014 \u0001(\u000e2\u000f.DescriptorSize:\u0007DS_AUTO*i\n\tFieldType\u0012\u000e\n\nFT_DEFAULT\u0010\u0000\u0012\u000f\n\u000bFT_CALLBACK\u0010\u0001\u0012\u000e\n\nFT_POINTER\u0010\u0004\u0012\r\n\tFT_STATIC\u0010\u0002\u0012\r\n\tFT_IGNORE\u0010\u0003\u0012\r\n\tFT_INLINE\u0010\u0005*D\n\u0007IntSize\u0012\u000e\n\nIS_DEFAULT\u0010\u0000\u0012\b\n\u0004IS_8\u0010\b\u0012\t\n\u0005IS_16\u0010\u0010\u0012\t\n\u0005IS_32\u0010 \u0012\t\n\u0005IS_64\u0010@*B\n\u0010TypenameMangling\u0012\n\n\u0006M_NONE\u0010\u0000\u0012\u0013\n\u000fM_STRIP_PACKAGE\u0010\u0001\u0012\r\n\tM_FLATTEN\u0010\u0002*E\n\u000eDescriptorSize\u0012\u000b\n\u0007DS_AUTO\u0010\u0000\u0012\b\n\u0004DS_1\u0010\u0001\u0012\b\n\u0004DS_2\u0010\u0002\u0012\b\n\u0004DS_4\u0010\u0004\u0012\b\n\u0004DS_8\u0010\b:E\n\u000enanopb_fileopt\u0012\u001c.google.protobuf.FileOptions\u0018ò\u0007 \u0001(\u000b2\u000e.NanoPBOptions:G\n\rnanopb_msgopt\u0012\u001f.google.protobuf.MessageOptions\u0018ò\u0007 \u0001(\u000b2\u000e.NanoPBOptions:E\n\u000enanopb_enumopt\u0012\u001c.google.protobuf.EnumOptions\u0018ò\u0007 \u0001(\u000b2\u000e.NanoPBOptions:>\n\u0006nanopb\u0012\u001d.google.protobuf.FieldOptions\u0018ò\u0007 \u0001(\u000b2\u000e.NanoPBOptionsB\u0016\n\u0014com.zh.wear.protobuf"}, new Descriptors.FileDescriptor[]{DescriptorProtos.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.Nanopb.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = Nanopb.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_NanoPBOptions_descriptor = descriptor2;
        internal_static_NanoPBOptions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"MaxSize", "MaxLength", "MaxCount", "IntSize", "Type", "LongNames", "PackedStruct", "PackedEnum", "SkipMessage", "NoUnions", "Msgid", "AnonymousOneof", "Proto3", "EnumToString", "FixedLength", "FixedCount", "MangleNames", "CallbackDatatype", "CallbackFunction", "Descriptorsize"});
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        generatedExtensionNewFileScopedGeneratedExtension3.internalInit(descriptor.getExtensions().get(2));
        generatedExtensionNewFileScopedGeneratedExtension4.internalInit(descriptor.getExtensions().get(3));
        DescriptorProtos.getDescriptor();
    }

    private Nanopb() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(nanopbFileopt);
        extensionRegistryLite.add(nanopbMsgopt);
        extensionRegistryLite.add(nanopbEnumopt);
        extensionRegistryLite.add(nanopb);
    }
}