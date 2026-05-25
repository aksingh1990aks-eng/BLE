package com.zh.wear.protobuf;

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
import com.noisefit.DataBinderMapperImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class GnssProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_Data_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Data_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Gnss_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Gnss_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GpsInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GpsInfo_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.GnssProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$GnssProtos$Gnss$PayloadCase;

        static {
            int[] iArr = new int[Gnss.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$GnssProtos$Gnss$PayloadCase = iArr;
            try {
                iArr[Gnss.PayloadCase.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$GnssProtos$Gnss$PayloadCase[Gnss.PayloadCase.DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$GnssProtos$Gnss$PayloadCase[Gnss.PayloadCase.GPS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$GnssProtos$Gnss$PayloadCase[Gnss.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Data extends GeneratedMessageV3 implements DataOrBuilder {
        public static final int DAYS_FIELD_NUMBER = 3;
        public static final int NEED_GPS_INFO_FIELD_NUMBER = 4;
        public static final int SOURCE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int days_;
        private byte memoizedIsInitialized;
        private boolean needGpsInfo_;
        private volatile Object source_;
        private int type_;
        private static final Data DEFAULT_INSTANCE = new Data();

        @Deprecated
        public static final Parser<Data> PARSER = new AbstractParser<Data>() { // from class: com.zh.wear.protobuf.GnssProtos.Data.1
            @Override // com.google.protobuf.Parser
            public Data parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Data(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataOrBuilder {
            private int bitField0_;
            private int days_;
            private boolean needGpsInfo_;
            private Object source_;
            private int type_;

            private Builder() {
                this.type_ = 1;
                this.source_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GnssProtos.internal_static_Data_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearDays() {
                this.bitField0_ &= -5;
                this.days_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNeedGpsInfo() {
                this.bitField0_ &= -9;
                this.needGpsInfo_ = false;
                onChanged();
                return this;
            }

            public Builder clearSource() {
                this.bitField0_ &= -3;
                this.source_ = Data.getDefaultInstance().getSource();
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 1;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
            public int getDays() {
                return this.days_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GnssProtos.internal_static_Data_descriptor;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
            public boolean getNeedGpsInfo() {
                return this.needGpsInfo_;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
            public String getSource() {
                Object obj = this.source_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.source_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
            public ByteString getSourceBytes() {
                Object obj = this.source_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.source_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
            public Type getType() {
                Type typeValueOf = Type.valueOf(this.type_);
                return typeValueOf == null ? Type.AGPS : typeValueOf;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
            public boolean hasDays() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
            public boolean hasNeedGpsInfo() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
            public boolean hasSource() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GnssProtos.internal_static_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasType() && hasSource();
            }

            public Builder setDays(int i7) {
                this.bitField0_ |= 4;
                this.days_ = i7;
                onChanged();
                return this;
            }

            public Builder setNeedGpsInfo(boolean z6) {
                this.bitField0_ |= 8;
                this.needGpsInfo_ = z6;
                onChanged();
                return this;
            }

            public Builder setSource(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.source_ = str;
                onChanged();
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.source_ = byteString;
                onChanged();
                return this;
            }

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 1;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 1;
                this.source_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Data build() {
                Data dataBuildPartial = buildPartial();
                if (dataBuildPartial.isInitialized()) {
                    return dataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Data buildPartial() {
                Data data = new Data(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                data.type_ = this.type_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                data.source_ = this.source_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                data.days_ = this.days_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                data.needGpsInfo_ = this.needGpsInfo_;
                data.bitField0_ = i8;
                onBuilt();
                return data;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Data getDefaultInstanceForType() {
                return Data.getDefaultInstance();
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
                this.type_ = 1;
                int i7 = this.bitField0_;
                this.source_ = "";
                this.days_ = 0;
                this.needGpsInfo_ = false;
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
            public com.zh.wear.protobuf.GnssProtos.Data.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.GnssProtos$Data> r1 = com.zh.wear.protobuf.GnssProtos.Data.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.GnssProtos$Data r3 = (com.zh.wear.protobuf.GnssProtos.Data) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.GnssProtos$Data r4 = (com.zh.wear.protobuf.GnssProtos.Data) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.GnssProtos.Data.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.GnssProtos$Data$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Data) {
                    return mergeFrom((Data) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Data data) {
                if (data == Data.getDefaultInstance()) {
                    return this;
                }
                if (data.hasType()) {
                    setType(data.getType());
                }
                if (data.hasSource()) {
                    this.bitField0_ |= 2;
                    this.source_ = data.source_;
                    onChanged();
                }
                if (data.hasDays()) {
                    setDays(data.getDays());
                }
                if (data.hasNeedGpsInfo()) {
                    setNeedGpsInfo(data.getNeedGpsInfo());
                }
                mergeUnknownFields(((GeneratedMessage) data).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum Type implements ProtocolMessageEnum {
            AGPS(1),
            BEIDOU(2);

            public static final int AGPS_VALUE = 1;
            public static final int BEIDOU_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.zh.wear.protobuf.GnssProtos.Data.Type.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i7) {
                    return Type.forNumber(i7);
                }
            };
            private static final Type[] VALUES = values();

            Type(int i7) {
                this.value = i7;
            }

            public static Type forNumber(int i7) {
                if (i7 == 1) {
                    return AGPS;
                }
                if (i7 != 2) {
                    return null;
                }
                return BEIDOU;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Data.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static Type valueOf(int i7) {
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

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private Data() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 1;
            this.source_ = "";
            this.days_ = 0;
            this.needGpsInfo_ = false;
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GnssProtos.internal_static_Data_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Data parseDelimitedFrom(InputStream inputStream) {
            return (Data) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Data> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return super.equals(obj);
            }
            Data data = (Data) obj;
            boolean z6 = hasType() == data.hasType();
            if (hasType()) {
                z6 = z6 && this.type_ == data.type_;
            }
            boolean z7 = z6 && hasSource() == data.hasSource();
            if (hasSource()) {
                z7 = z7 && getSource().equals(data.getSource());
            }
            boolean z8 = z7 && hasDays() == data.hasDays();
            if (hasDays()) {
                z8 = z8 && getDays() == data.getDays();
            }
            boolean z9 = z8 && hasNeedGpsInfo() == data.hasNeedGpsInfo();
            if (hasNeedGpsInfo()) {
                z9 = z9 && getNeedGpsInfo() == data.getNeedGpsInfo();
            }
            return z9 && this.unknownFields.equals(data.unknownFields);
        }

        @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
        public int getDays() {
            return this.days_;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
        public boolean getNeedGpsInfo() {
            return this.needGpsInfo_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Data> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.source_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.days_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(4, this.needGpsInfo_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
        public String getSource() {
            Object obj = this.source_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.source_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
        public ByteString getSourceBytes() {
            Object obj = this.source_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.source_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
        public Type getType() {
            Type typeValueOf = Type.valueOf(this.type_);
            return typeValueOf == null ? Type.AGPS : typeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
        public boolean hasDays() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
        public boolean hasNeedGpsInfo() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
        public boolean hasSource() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.DataOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.type_;
            }
            if (hasSource()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSource().hashCode();
            }
            if (hasDays()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDays();
            }
            if (hasNeedGpsInfo()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashBoolean(getNeedGpsInfo());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GnssProtos.internal_static_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
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
            if (!hasType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSource()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.source_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeUInt32(3, this.days_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeBool(4, this.needGpsInfo_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Data(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                if (Type.valueOf(i7) == null) {
                                    builderNewBuilder.mergeVarintField(1, i7);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.type_ = i7;
                                }
                            } else if (tag == 18) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.source_ = bytes;
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.days_ = codedInputStream.readUInt32();
                            } else if (tag == 32) {
                                this.bitField0_ |= 8;
                                this.needGpsInfo_ = codedInputStream.readBool();
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

        public static Builder newBuilder(Data data) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
        }

        public static Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Data) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Data parseFrom(CodedInputStream codedInputStream) {
            return (Data) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Data getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Data(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Data) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Data parseFrom(InputStream inputStream) {
            return (Data) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Data) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Data parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Data parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface DataOrBuilder extends MessageOrBuilder {
        int getDays();

        boolean getNeedGpsInfo();

        String getSource();

        ByteString getSourceBytes();

        Data.Type getType();

        boolean hasDays();

        boolean hasNeedGpsInfo();

        boolean hasSource();

        boolean hasType();
    }

    public static final class Gnss extends GeneratedMessageV3 implements GnssOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int DAYS_FIELD_NUMBER = 1;
        public static final int GPS_INFO_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private static final Gnss DEFAULT_INSTANCE = new Gnss();

        @Deprecated
        public static final Parser<Gnss> PARSER = new AbstractParser<Gnss>() { // from class: com.zh.wear.protobuf.GnssProtos.Gnss.1
            @Override // com.google.protobuf.Parser
            public Gnss parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Gnss(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GnssOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> dataBuilder_;
            private SingleFieldBuilderV3<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> gpsInfoBuilder_;
            private int payloadCase_;
            private Object payload_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = Data.getDefaultInstance();
                    }
                    this.dataBuilder_ = new SingleFieldBuilderV3<>((Data) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GnssProtos.internal_static_Gnss_descriptor;
            }

            private SingleFieldBuilderV3<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> getGpsInfoFieldBuilder() {
                if (this.gpsInfoBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = GpsInfo.getDefaultInstance();
                    }
                    this.gpsInfoBuilder_ = new SingleFieldBuilderV3<>((GpsInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.gpsInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearData() {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
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

            public Builder clearDays() {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearGpsInfo() {
                SingleFieldBuilderV3<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilderV3 = this.gpsInfoBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
            public Data getData() {
                Object message;
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return Data.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return Data.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (Data) message;
            }

            public Data.Builder getDataBuilder() {
                return (Data.Builder) getDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
            public DataOrBuilder getDataOrBuilder() {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.dataBuilder_) == null) ? i7 == 2 ? (Data) this.payload_ : Data.getDefaultInstance() : (DataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
            public int getDays() {
                if (this.payloadCase_ == 1) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GnssProtos.internal_static_Gnss_descriptor;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
            public GpsInfo getGpsInfo() {
                Object message;
                SingleFieldBuilderV3<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilderV3 = this.gpsInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 3) {
                        return GpsInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 3) {
                        return GpsInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (GpsInfo) message;
            }

            public GpsInfo.Builder getGpsInfoBuilder() {
                return (GpsInfo.Builder) getGpsInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
            public GpsInfoOrBuilder getGpsInfoOrBuilder() {
                SingleFieldBuilderV3<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilderV3 = this.gpsInfoBuilder_) == null) ? i7 == 3 ? (GpsInfo) this.payload_ : GpsInfo.getDefaultInstance() : (GpsInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
            public boolean hasData() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
            public boolean hasDays() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
            public boolean hasGpsInfo() {
                return this.payloadCase_ == 3;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GnssProtos.internal_static_Gnss_fieldAccessorTable.ensureFieldAccessorsInitialized(Gnss.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasData() || getData().isInitialized()) {
                    return !hasGpsInfo() || getGpsInfo().isInitialized();
                }
                return false;
            }

            public Builder mergeData(Data data) {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != Data.getDefaultInstance()) {
                        data = Data.newBuilder((Data) this.payload_).mergeFrom(data).buildPartial();
                    }
                    this.payload_ = data;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(data);
                    }
                    this.dataBuilder_.setMessage(data);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeGpsInfo(GpsInfo gpsInfo) {
                SingleFieldBuilderV3<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilderV3 = this.gpsInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 3 && this.payload_ != GpsInfo.getDefaultInstance()) {
                        gpsInfo = GpsInfo.newBuilder((GpsInfo) this.payload_).mergeFrom(gpsInfo).buildPartial();
                    }
                    this.payload_ = gpsInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 3) {
                        singleFieldBuilderV3.mergeFrom(gpsInfo);
                    }
                    this.gpsInfoBuilder_.setMessage(gpsInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setData(Data.Builder builder) {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                Data dataBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = dataBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(dataBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setDays(int i7) {
                this.payloadCase_ = 1;
                this.payload_ = Integer.valueOf(i7);
                onChanged();
                return this;
            }

            public Builder setGpsInfo(GpsInfo.Builder builder) {
                SingleFieldBuilderV3<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilderV3 = this.gpsInfoBuilder_;
                GpsInfo gpsInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = gpsInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(gpsInfoBuild);
                }
                this.payloadCase_ = 3;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setData(Data data) {
                SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    data.getClass();
                    this.payload_ = data;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(data);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setGpsInfo(GpsInfo gpsInfo) {
                SingleFieldBuilderV3<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilderV3 = this.gpsInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gpsInfo.getClass();
                    this.payload_ = gpsInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(gpsInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Gnss build() {
                Gnss gnssBuildPartial = buildPartial();
                if (gnssBuildPartial.isInitialized()) {
                    return gnssBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gnssBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Gnss buildPartial() {
                Gnss gnss = new Gnss(this);
                if (this.payloadCase_ == 1) {
                    gnss.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<Data, Data.Builder, DataOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                    gnss.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 3) {
                    SingleFieldBuilderV3<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilderV32 = this.gpsInfoBuilder_;
                    gnss.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                gnss.bitField0_ = 0;
                gnss.payloadCase_ = this.payloadCase_;
                onBuilt();
                return gnss;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Gnss getDefaultInstanceForType() {
                return Gnss.getDefaultInstance();
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
            public com.zh.wear.protobuf.GnssProtos.Gnss.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.GnssProtos$Gnss> r1 = com.zh.wear.protobuf.GnssProtos.Gnss.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.GnssProtos$Gnss r3 = (com.zh.wear.protobuf.GnssProtos.Gnss) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.GnssProtos$Gnss r4 = (com.zh.wear.protobuf.GnssProtos.Gnss) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.GnssProtos.Gnss.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.GnssProtos$Gnss$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Gnss) {
                    return mergeFrom((Gnss) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Gnss gnss) {
                if (gnss == Gnss.getDefaultInstance()) {
                    return this;
                }
                int i7 = AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$GnssProtos$Gnss$PayloadCase[gnss.getPayloadCase().ordinal()];
                if (i7 == 1) {
                    setDays(gnss.getDays());
                } else if (i7 == 2) {
                    mergeData(gnss.getData());
                } else if (i7 == 3) {
                    mergeGpsInfo(gnss.getGpsInfo());
                }
                mergeUnknownFields(((GeneratedMessage) gnss).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum GnssID implements ProtocolMessageEnum {
            REQUEST_ONLINE(0),
            REQUEST_OFFLINE(1),
            SEND_GPS_INFO(2);

            public static final int REQUEST_OFFLINE_VALUE = 1;
            public static final int REQUEST_ONLINE_VALUE = 0;
            public static final int SEND_GPS_INFO_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<GnssID> internalValueMap = new Internal.EnumLiteMap<GnssID>() { // from class: com.zh.wear.protobuf.GnssProtos.Gnss.GnssID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GnssID findValueByNumber(int i7) {
                    return GnssID.forNumber(i7);
                }
            };
            private static final GnssID[] VALUES = values();

            GnssID(int i7) {
                this.value = i7;
            }

            public static GnssID forNumber(int i7) {
                if (i7 == 0) {
                    return REQUEST_ONLINE;
                }
                if (i7 == 1) {
                    return REQUEST_OFFLINE;
                }
                if (i7 != 2) {
                    return null;
                }
                return SEND_GPS_INFO;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Gnss.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<GnssID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static GnssID valueOf(int i7) {
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

            public static GnssID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            DAYS(1),
            DATA(2),
            GPS_INFO(3),
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
                    return DAYS;
                }
                if (i7 == 2) {
                    return DATA;
                }
                if (i7 != 3) {
                    return null;
                }
                return GPS_INFO;
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

        private Gnss() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Gnss getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GnssProtos.internal_static_Gnss_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Gnss parseDelimitedFrom(InputStream inputStream) {
            return (Gnss) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Gnss parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Gnss> parser() {
            return PARSER;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
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
                boolean r1 = r6 instanceof com.zh.wear.protobuf.GnssProtos.Gnss
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.zh.wear.protobuf.GnssProtos$Gnss r6 = (com.zh.wear.protobuf.GnssProtos.Gnss) r6
                com.zh.wear.protobuf.GnssProtos$Gnss$PayloadCase r1 = r5.getPayloadCase()
                com.zh.wear.protobuf.GnssProtos$Gnss$PayloadCase r2 = r6.getPayloadCase()
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
                goto L5b
            L2a:
                if (r1 == 0) goto L5a
                com.zh.wear.protobuf.GnssProtos$GpsInfo r1 = r5.getGpsInfo()
                com.zh.wear.protobuf.GnssProtos$GpsInfo r3 = r6.getGpsInfo()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5a
                goto L58
            L3b:
                if (r1 == 0) goto L5a
                com.zh.wear.protobuf.GnssProtos$Data r1 = r5.getData()
                com.zh.wear.protobuf.GnssProtos$Data r3 = r6.getData()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5a
                goto L58
            L4c:
                if (r1 == 0) goto L5a
                int r1 = r5.getDays()
                int r3 = r6.getDays()
                if (r1 != r3) goto L5a
            L58:
                r1 = r0
                goto L5b
            L5a:
                r1 = r2
            L5b:
                if (r1 == 0) goto L68
                com.google.protobuf.UnknownFieldSet r1 = r5.unknownFields
                com.google.protobuf.UnknownFieldSet r6 = r6.unknownFields
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L68
                return r0
            L68:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.GnssProtos.Gnss.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
        public Data getData() {
            return this.payloadCase_ == 2 ? (Data) this.payload_ : Data.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
        public DataOrBuilder getDataOrBuilder() {
            return this.payloadCase_ == 2 ? (Data) this.payload_ : Data.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
        public int getDays() {
            if (this.payloadCase_ == 1) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
        public GpsInfo getGpsInfo() {
            return this.payloadCase_ == 3 ? (GpsInfo) this.payload_ : GpsInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
        public GpsInfoOrBuilder getGpsInfoOrBuilder() {
            return this.payloadCase_ == 3 ? (GpsInfo) this.payload_ : GpsInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Gnss> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = this.payloadCase_ == 1 ? CodedOutputStream.computeUInt32Size(1, ((Integer) this.payload_).intValue()) : 0;
            if (this.payloadCase_ == 2) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, (Data) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, (GpsInfo) this.payload_);
            }
            int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
        public boolean hasData() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
        public boolean hasDays() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GnssOrBuilder
        public boolean hasGpsInfo() {
            return this.payloadCase_ == 3;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7;
            int days;
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            int i9 = this.payloadCase_;
            if (i9 == 1) {
                i7 = ((iHashCode * 37) + 1) * 53;
                days = getDays();
            } else {
                if (i9 != 2) {
                    if (i9 == 3) {
                        i7 = ((iHashCode * 37) + 3) * 53;
                        days = getGpsInfo().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }
                i7 = ((iHashCode * 37) + 2) * 53;
                days = getData().hashCode();
            }
            iHashCode = i7 + days;
            int iHashCode22 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode22;
            return iHashCode22;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GnssProtos.internal_static_Gnss_fieldAccessorTable.ensureFieldAccessorsInitialized(Gnss.class, Builder.class);
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
            if (hasData() && !getData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasGpsInfo() || getGpsInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeUInt32(1, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (Data) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (GpsInfo) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Gnss(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            if (tag != 8) {
                                if (tag == 18) {
                                    i7 = 2;
                                    Data.Builder builder = this.payloadCase_ == 2 ? ((Data) this.payload_).toBuilder() : null;
                                    MessageLite message = codedInputStream.readMessage(Data.PARSER, extensionRegistryLite);
                                    this.payload_ = message;
                                    if (builder != null) {
                                        builder.mergeFrom((Data) message);
                                        this.payload_ = builder.buildPartial();
                                    }
                                } else if (tag == 26) {
                                    i7 = 3;
                                    GpsInfo.Builder builder2 = this.payloadCase_ == 3 ? ((GpsInfo) this.payload_).toBuilder() : null;
                                    MessageLite message2 = codedInputStream.readMessage(GpsInfo.PARSER, extensionRegistryLite);
                                    this.payload_ = message2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((GpsInfo) message2);
                                        this.payload_ = builder2.buildPartial();
                                    }
                                } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                                this.payloadCase_ = i7;
                            } else {
                                this.payloadCase_ = 1;
                                this.payload_ = Integer.valueOf(codedInputStream.readUInt32());
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

        public static Builder newBuilder(Gnss gnss) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gnss);
        }

        public static Gnss parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Gnss) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Gnss parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Gnss parseFrom(CodedInputStream codedInputStream) {
            return (Gnss) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Gnss getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Gnss(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Gnss parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Gnss) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Gnss parseFrom(InputStream inputStream) {
            return (Gnss) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Gnss parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Gnss) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Gnss parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Gnss parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Gnss parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Gnss parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface GnssOrBuilder extends MessageOrBuilder {
        Data getData();

        DataOrBuilder getDataOrBuilder();

        int getDays();

        GpsInfo getGpsInfo();

        GpsInfoOrBuilder getGpsInfoOrBuilder();

        Gnss.PayloadCase getPayloadCase();

        boolean hasData();

        boolean hasDays();

        boolean hasGpsInfo();
    }

    public static final class GpsInfo extends GeneratedMessageV3 implements GpsInfoOrBuilder {
        public static final int ALTITUDE_FIELD_NUMBER = 4;
        public static final int LATITUDE_FIELD_NUMBER = 3;
        public static final int LONGITUDE_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private double altitude_;
        private int bitField0_;
        private double latitude_;
        private double longitude_;
        private byte memoizedIsInitialized;
        private int timestamp_;
        private static final GpsInfo DEFAULT_INSTANCE = new GpsInfo();

        @Deprecated
        public static final Parser<GpsInfo> PARSER = new AbstractParser<GpsInfo>() { // from class: com.zh.wear.protobuf.GnssProtos.GpsInfo.1
            @Override // com.google.protobuf.Parser
            public GpsInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new GpsInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GpsInfoOrBuilder {
            private double altitude_;
            private int bitField0_;
            private double latitude_;
            private double longitude_;
            private int timestamp_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GnssProtos.internal_static_GpsInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAltitude() {
                this.bitField0_ &= -9;
                this.altitude_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearLatitude() {
                this.bitField0_ &= -5;
                this.latitude_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearLongitude() {
                this.bitField0_ &= -3;
                this.longitude_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -2;
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
            public double getAltitude() {
                return this.altitude_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GnssProtos.internal_static_GpsInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
            public double getLatitude() {
                return this.latitude_;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
            public double getLongitude() {
                return this.longitude_;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
            public boolean hasAltitude() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
            public boolean hasLatitude() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
            public boolean hasLongitude() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GnssProtos.internal_static_GpsInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GpsInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTimestamp() && hasLongitude() && hasLatitude();
            }

            public Builder setAltitude(double d7) {
                this.bitField0_ |= 8;
                this.altitude_ = d7;
                onChanged();
                return this;
            }

            public Builder setLatitude(double d7) {
                this.bitField0_ |= 4;
                this.latitude_ = d7;
                onChanged();
                return this;
            }

            public Builder setLongitude(double d7) {
                this.bitField0_ |= 2;
                this.longitude_ = d7;
                onChanged();
                return this;
            }

            public Builder setTimestamp(int i7) {
                this.bitField0_ |= 1;
                this.timestamp_ = i7;
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
            public GpsInfo build() {
                GpsInfo gpsInfoBuildPartial = buildPartial();
                if (gpsInfoBuildPartial.isInitialized()) {
                    return gpsInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gpsInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GpsInfo buildPartial() {
                GpsInfo gpsInfo = new GpsInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                gpsInfo.timestamp_ = this.timestamp_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                gpsInfo.longitude_ = this.longitude_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                gpsInfo.latitude_ = this.latitude_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                gpsInfo.altitude_ = this.altitude_;
                gpsInfo.bitField0_ = i8;
                onBuilt();
                return gpsInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GpsInfo getDefaultInstanceForType() {
                return GpsInfo.getDefaultInstance();
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
                this.timestamp_ = 0;
                int i7 = this.bitField0_;
                this.longitude_ = 0.0d;
                this.latitude_ = 0.0d;
                this.altitude_ = 0.0d;
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
            public com.zh.wear.protobuf.GnssProtos.GpsInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.GnssProtos$GpsInfo> r1 = com.zh.wear.protobuf.GnssProtos.GpsInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.GnssProtos$GpsInfo r3 = (com.zh.wear.protobuf.GnssProtos.GpsInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.GnssProtos$GpsInfo r4 = (com.zh.wear.protobuf.GnssProtos.GpsInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.GnssProtos.GpsInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.GnssProtos$GpsInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GpsInfo) {
                    return mergeFrom((GpsInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GpsInfo gpsInfo) {
                if (gpsInfo == GpsInfo.getDefaultInstance()) {
                    return this;
                }
                if (gpsInfo.hasTimestamp()) {
                    setTimestamp(gpsInfo.getTimestamp());
                }
                if (gpsInfo.hasLongitude()) {
                    setLongitude(gpsInfo.getLongitude());
                }
                if (gpsInfo.hasLatitude()) {
                    setLatitude(gpsInfo.getLatitude());
                }
                if (gpsInfo.hasAltitude()) {
                    setAltitude(gpsInfo.getAltitude());
                }
                mergeUnknownFields(((GeneratedMessage) gpsInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        private GpsInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.timestamp_ = 0;
            this.longitude_ = 0.0d;
            this.latitude_ = 0.0d;
            this.altitude_ = 0.0d;
        }

        public static GpsInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GnssProtos.internal_static_GpsInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GpsInfo parseDelimitedFrom(InputStream inputStream) {
            return (GpsInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GpsInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<GpsInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GpsInfo)) {
                return super.equals(obj);
            }
            GpsInfo gpsInfo = (GpsInfo) obj;
            boolean z6 = hasTimestamp() == gpsInfo.hasTimestamp();
            if (hasTimestamp()) {
                z6 = z6 && getTimestamp() == gpsInfo.getTimestamp();
            }
            boolean z7 = z6 && hasLongitude() == gpsInfo.hasLongitude();
            if (hasLongitude()) {
                z7 = z7 && Double.doubleToLongBits(getLongitude()) == Double.doubleToLongBits(gpsInfo.getLongitude());
            }
            boolean z8 = z7 && hasLatitude() == gpsInfo.hasLatitude();
            if (hasLatitude()) {
                z8 = z8 && Double.doubleToLongBits(getLatitude()) == Double.doubleToLongBits(gpsInfo.getLatitude());
            }
            boolean z9 = z8 && hasAltitude() == gpsInfo.hasAltitude();
            if (hasAltitude()) {
                z9 = z9 && Double.doubleToLongBits(getAltitude()) == Double.doubleToLongBits(gpsInfo.getAltitude());
            }
            return z9 && this.unknownFields.equals(gpsInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
        public double getAltitude() {
            return this.altitude_;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
        public double getLatitude() {
            return this.latitude_;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
        public double getLongitude() {
            return this.longitude_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GpsInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeUInt32Size(1, this.timestamp_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeUInt32Size += CodedOutputStream.computeDoubleSize(2, this.longitude_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeUInt32Size += CodedOutputStream.computeDoubleSize(3, this.latitude_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeUInt32Size += CodedOutputStream.computeDoubleSize(4, this.altitude_);
            }
            int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
        public boolean hasAltitude() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
        public boolean hasLatitude() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
        public boolean hasLongitude() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.GnssProtos.GpsInfoOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) == 1;
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
            if (hasLongitude()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getLongitude()));
            }
            if (hasLatitude()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getLatitude()));
            }
            if (hasAltitude()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashLong(Double.doubleToLongBits(getAltitude()));
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GnssProtos.internal_static_GpsInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GpsInfo.class, Builder.class);
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
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeUInt32(1, this.timestamp_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeDouble(2, this.longitude_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeDouble(3, this.latitude_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeDouble(4, this.altitude_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private GpsInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.timestamp_ = codedInputStream.readUInt32();
                            } else if (tag == 17) {
                                this.bitField0_ |= 2;
                                this.longitude_ = codedInputStream.readDouble();
                            } else if (tag == 25) {
                                this.bitField0_ |= 4;
                                this.latitude_ = codedInputStream.readDouble();
                            } else if (tag == 33) {
                                this.bitField0_ |= 8;
                                this.altitude_ = codedInputStream.readDouble();
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

        public static Builder newBuilder(GpsInfo gpsInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gpsInfo);
        }

        public static GpsInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GpsInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GpsInfo parseFrom(CodedInputStream codedInputStream) {
            return (GpsInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GpsInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private GpsInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GpsInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GpsInfo parseFrom(InputStream inputStream) {
            return (GpsInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static GpsInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GpsInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static GpsInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static GpsInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GpsInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface GpsInfoOrBuilder extends MessageOrBuilder {
        double getAltitude();

        double getLatitude();

        double getLongitude();

        int getTimestamp();

        boolean hasAltitude();

        boolean hasLatitude();

        boolean hasLongitude();

        boolean hasTimestamp();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fwear_gnss.proto\u001a\fnanopb.proto\"\u009c\u0001\n\u0004Gnss\u0012\u000e\n\u0004days\u0018\u0001 \u0001(\rH\u0000\u0012\u0015\n\u0004data\u0018\u0002 \u0001(\u000b2\u0005.DataH\u0000\u0012\u001c\n\bgps_info\u0018\u0003 \u0001(\u000b2\b.GpsInfoH\u0000\"D\n\u0006GnssID\u0012\u0012\n\u000eREQUEST_ONLINE\u0010\u0000\u0012\u0013\n\u000fREQUEST_OFFLINE\u0010\u0001\u0012\u0011\n\rSEND_GPS_INFO\u0010\u0002B\t\n\u0007payload\"\u0081\u0001\n\u0004Data\u0012\u0018\n\u0004type\u0018\u0001 \u0002(\u000e2\n.Data.Type\u0012\u0015\n\u0006source\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004days\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u0015\n\rneed_gps_info\u0018\u0004 \u0001(\b\"\u001c\n\u0004Type\u0012\b\n\u0004AGPS\u0010\u0001\u0012\n\n\u0006BEIDOU\u0010\u0002\"S\n\u0007GpsInfo\u0012\u0011\n\ttimestamp\u0018\u0001 \u0002(\r\u0012\u0011\n\tlongitude\u0018\u0002 \u0002(\u0001\u0012\u0010\n\blatitude\u0018\u0003 \u0002(\u0001\u0012\u0010\n\baltitude\u0018\u0004 \u0001(\u0001B\"\n\u0014com.zh.wear.protobufB\nGnssProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.GnssProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = GnssProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Gnss_descriptor = descriptor2;
        internal_static_Gnss_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Days", "Data", "GpsInfo", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_Data_descriptor = descriptor3;
        internal_static_Data_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", "Source", "Days", "NeedGpsInfo"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GpsInfo_descriptor = descriptor4;
        internal_static_GpsInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Timestamp", "Longitude", "Latitude", "Altitude"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private GnssProtos() {
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