package com.zh.ble.sa_zhwear.protobuf;

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
import com.noisefit.DataBinderMapperImpl;
import com.zh.ble.sa_wear.protobuf.SaNanopb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class SA_GnssProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_Data_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_Data_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_GpsInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_GpsInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEGnss_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEGnss_fieldAccessorTable;

    public static final class Data extends GeneratedMessage implements DataOrBuilder {
        public static final int DAYS_FIELD_NUMBER = 4;
        private static final Data DEFAULT_INSTANCE;
        public static final int EXPECTED_SLICE_LENGTH_FIELD_NUMBER = 6;
        public static final int NEED_GPS_INFO_FIELD_NUMBER = 5;
        public static final int NEED_SEND_AGPS_STATUS_FIELD_NUMBER = 3;
        private static final Parser<Data> PARSER;
        public static final int SOURCE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int days_;
        private int expectedSliceLength_;
        private byte memoizedIsInitialized;
        private boolean needGpsInfo_;
        private boolean needSendAgpsStatus_;
        private volatile Object source_;
        private int type_;

        /* JADX INFO: renamed from: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos$Data$1 */
        public class AnonymousClass1 extends AbstractParser<Data> {
            @Override // com.google.protobuf.Parser
            public Data parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Data.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements DataOrBuilder {
            private int bitField0_;
            private int days_;
            private int expectedSliceLength_;
            private boolean needGpsInfo_;
            private boolean needSendAgpsStatus_;
            private Object source_;
            private int type_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(Data data) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    data.type_ = this.type_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    data.source_ = this.source_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    data.needSendAgpsStatus_ = this.needSendAgpsStatus_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    data.days_ = this.days_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    data.needGpsInfo_ = this.needGpsInfo_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    data.expectedSliceLength_ = this.expectedSliceLength_;
                    i7 |= 32;
                }
                data.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_GnssProtos.internal_static_SA_Data_descriptor;
            }

            public Builder clearDays() {
                this.bitField0_ &= -9;
                this.days_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExpectedSliceLength() {
                this.bitField0_ &= -33;
                this.expectedSliceLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNeedGpsInfo() {
                this.bitField0_ &= -17;
                this.needGpsInfo_ = false;
                onChanged();
                return this;
            }

            public Builder clearNeedSendAgpsStatus() {
                this.bitField0_ &= -5;
                this.needSendAgpsStatus_ = false;
                onChanged();
                return this;
            }

            public Builder clearSource() {
                this.source_ = Data.getDefaultInstance().getSource();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 1;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public int getDays() {
                return this.days_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_GnssProtos.internal_static_SA_Data_descriptor;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public int getExpectedSliceLength() {
                return this.expectedSliceLength_;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public boolean getNeedGpsInfo() {
                return this.needGpsInfo_;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public boolean getNeedSendAgpsStatus() {
                return this.needSendAgpsStatus_;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
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

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public ByteString getSourceBytes() {
                Object obj = this.source_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.source_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public Type getType() {
                Type typeForNumber = Type.forNumber(this.type_);
                return typeForNumber == null ? Type.AGPS : typeForNumber;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public boolean hasDays() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public boolean hasExpectedSliceLength() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public boolean hasNeedGpsInfo() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public boolean hasNeedSendAgpsStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public boolean hasSource() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_GnssProtos.internal_static_SA_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasType() && hasSource() && hasNeedSendAgpsStatus();
            }

            public Builder setDays(int i7) {
                this.days_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setExpectedSliceLength(int i7) {
                this.expectedSliceLength_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setNeedGpsInfo(boolean z6) {
                this.needGpsInfo_ = z6;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setNeedSendAgpsStatus(boolean z6) {
                this.needSendAgpsStatus_ = z6;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSource(String str) {
                str.getClass();
                this.source_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                byteString.getClass();
                this.source_ = byteString;
                this.bitField0_ |= 2;
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

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                this.type_ = 1;
                this.source_ = "";
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
                if (this.bitField0_ != 0) {
                    buildPartial0(data);
                }
                onBuilt();
                return data;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Data getDefaultInstanceForType() {
                return Data.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 1;
                this.source_ = "";
                this.needSendAgpsStatus_ = false;
                this.days_ = 0;
                this.needGpsInfo_ = false;
                this.expectedSliceLength_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 1;
                this.source_ = "";
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
                    this.source_ = data.source_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (data.hasNeedSendAgpsStatus()) {
                    setNeedSendAgpsStatus(data.getNeedSendAgpsStatus());
                }
                if (data.hasDays()) {
                    setDays(data.getDays());
                }
                if (data.hasNeedGpsInfo()) {
                    setNeedGpsInfo(data.getNeedGpsInfo());
                }
                if (data.hasExpectedSliceLength()) {
                    setExpectedSliceLength(data.getExpectedSliceLength());
                }
                mergeUnknownFields(data.getUnknownFields());
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
                                    if (Type.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.type_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.source_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.needSendAgpsStatus_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.days_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.needGpsInfo_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.expectedSliceLength_ = codedInputStream.readUInt32();
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

        public enum Type implements ProtocolMessageEnum {
            AGPS(1),
            BEIDOU(2),
            GALILEO(3);

            public static final int AGPS_VALUE = 1;
            public static final int BEIDOU_VALUE = 2;
            public static final int GALILEO_VALUE = 3;
            private static final Type[] VALUES;
            private static final Internal.EnumLiteMap<Type> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos$Data$Type$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<Type> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i7) {
                    return Type.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Type");
                internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.Data.Type.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public Type findValueByNumber(int i7) {
                        return Type.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            Type(int i7) {
                this.value = i7;
            }

            public static Type forNumber(int i7) {
                if (i7 == 1) {
                    return AGPS;
                }
                if (i7 == 2) {
                    return BEIDOU;
                }
                if (i7 != 3) {
                    return null;
                }
                return GALILEO;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return Data.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
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
            public static Type valueOf(int i7) {
                return forNumber(i7);
            }

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "Data");
            DEFAULT_INSTANCE = new Data();
            PARSER = new AbstractParser<Data>() { // from class: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.Data.1
                @Override // com.google.protobuf.Parser
                public Data parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = Data.newBuilder();
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

        public /* synthetic */ Data(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_GnssProtos.internal_static_SA_Data_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Data parseDelimitedFrom(InputStream inputStream) {
            return (Data) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
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
            if (hasType() != data.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != data.type_) || hasSource() != data.hasSource()) {
                return false;
            }
            if ((hasSource() && !getSource().equals(data.getSource())) || hasNeedSendAgpsStatus() != data.hasNeedSendAgpsStatus()) {
                return false;
            }
            if ((hasNeedSendAgpsStatus() && getNeedSendAgpsStatus() != data.getNeedSendAgpsStatus()) || hasDays() != data.hasDays()) {
                return false;
            }
            if ((hasDays() && getDays() != data.getDays()) || hasNeedGpsInfo() != data.hasNeedGpsInfo()) {
                return false;
            }
            if ((!hasNeedGpsInfo() || getNeedGpsInfo() == data.getNeedGpsInfo()) && hasExpectedSliceLength() == data.hasExpectedSliceLength()) {
                return (!hasExpectedSliceLength() || getExpectedSliceLength() == data.getExpectedSliceLength()) && getUnknownFields().equals(data.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public int getDays() {
            return this.days_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_GnssProtos.internal_static_SA_Data_descriptor;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public int getExpectedSliceLength() {
            return this.expectedSliceLength_;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public boolean getNeedGpsInfo() {
            return this.needGpsInfo_;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public boolean getNeedSendAgpsStatus() {
            return this.needSendAgpsStatus_;
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
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.source_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(3, this.needSendAgpsStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.days_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(5, this.needGpsInfo_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.expectedSliceLength_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
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

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public ByteString getSourceBytes() {
            Object obj = this.source_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.source_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.AGPS : typeForNumber;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public boolean hasDays() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public boolean hasExpectedSliceLength() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public boolean hasNeedGpsInfo() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public boolean hasNeedSendAgpsStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public boolean hasSource() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.DataOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
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
            if (hasNeedSendAgpsStatus()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashBoolean(getNeedSendAgpsStatus());
            }
            if (hasDays()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDays();
            }
            if (hasNeedGpsInfo()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getNeedGpsInfo());
            }
            if (hasExpectedSliceLength()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getExpectedSliceLength();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_GnssProtos.internal_static_SA_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
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
            if (!hasType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSource()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasNeedSendAgpsStatus()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.source_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.needSendAgpsStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.days_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.needGpsInfo_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.expectedSliceLength_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private Data(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.type_ = 1;
            this.source_ = "";
            this.needSendAgpsStatus_ = false;
            this.days_ = 0;
            this.needGpsInfo_ = false;
            this.expectedSliceLength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Data data) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Data) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Data parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Data getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Data parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Data parseFrom(InputStream inputStream) {
            return (Data) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Data) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Data() {
            this.type_ = 1;
            this.source_ = "";
            this.needSendAgpsStatus_ = false;
            this.days_ = 0;
            this.needGpsInfo_ = false;
            this.expectedSliceLength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 1;
            this.source_ = "";
        }

        public static Data parseFrom(CodedInputStream codedInputStream) {
            return (Data) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Data) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DataOrBuilder extends MessageOrBuilder {
        int getDays();

        int getExpectedSliceLength();

        boolean getNeedGpsInfo();

        boolean getNeedSendAgpsStatus();

        String getSource();

        ByteString getSourceBytes();

        Data.Type getType();

        boolean hasDays();

        boolean hasExpectedSliceLength();

        boolean hasNeedGpsInfo();

        boolean hasNeedSendAgpsStatus();

        boolean hasSource();

        boolean hasType();
    }

    public static final class GpsInfo extends GeneratedMessage implements GpsInfoOrBuilder {
        public static final int ALTITUDE_FIELD_NUMBER = 4;
        private static final GpsInfo DEFAULT_INSTANCE;
        public static final int LATITUDE_FIELD_NUMBER = 3;
        public static final int LONGITUDE_FIELD_NUMBER = 2;
        private static final Parser<GpsInfo> PARSER;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private double altitude_;
        private int bitField0_;
        private double latitude_;
        private double longitude_;
        private byte memoizedIsInitialized;
        private int timestamp_;

        /* JADX INFO: renamed from: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos$GpsInfo$1 */
        public class AnonymousClass1 extends AbstractParser<GpsInfo> {
            @Override // com.google.protobuf.Parser
            public GpsInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GpsInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GpsInfoOrBuilder {
            private double altitude_;
            private int bitField0_;
            private double latitude_;
            private double longitude_;
            private int timestamp_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(GpsInfo gpsInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    gpsInfo.timestamp_ = this.timestamp_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    gpsInfo.longitude_ = this.longitude_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    gpsInfo.latitude_ = this.latitude_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    gpsInfo.altitude_ = this.altitude_;
                    i7 |= 8;
                }
                gpsInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_GnssProtos.internal_static_SA_GpsInfo_descriptor;
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

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
            public double getAltitude() {
                return this.altitude_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_GnssProtos.internal_static_SA_GpsInfo_descriptor;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
            public double getLatitude() {
                return this.latitude_;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
            public double getLongitude() {
                return this.longitude_;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
            public boolean hasAltitude() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
            public boolean hasLatitude() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
            public boolean hasLongitude() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_GnssProtos.internal_static_SA_GpsInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GpsInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTimestamp() && hasLongitude() && hasLatitude();
            }

            public Builder setAltitude(double d7) {
                this.altitude_ = d7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLatitude(double d7) {
                this.latitude_ = d7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLongitude(double d7) {
                this.longitude_ = d7;
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

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
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
                if (this.bitField0_ != 0) {
                    buildPartial0(gpsInfo);
                }
                onBuilt();
                return gpsInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GpsInfo getDefaultInstanceForType() {
                return GpsInfo.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timestamp_ = 0;
                this.longitude_ = 0.0d;
                this.latitude_ = 0.0d;
                this.altitude_ = 0.0d;
                return this;
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
                mergeUnknownFields(gpsInfo.getUnknownFields());
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
                                } else if (tag == 17) {
                                    this.longitude_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 2;
                                } else if (tag == 25) {
                                    this.latitude_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 4;
                                } else if (tag != 33) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.altitude_ = codedInputStream.readDouble();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "GpsInfo");
            DEFAULT_INSTANCE = new GpsInfo();
            PARSER = new AbstractParser<GpsInfo>() { // from class: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfo.1
                @Override // com.google.protobuf.Parser
                public GpsInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = GpsInfo.newBuilder();
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

        public /* synthetic */ GpsInfo(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static GpsInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_GnssProtos.internal_static_SA_GpsInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GpsInfo parseDelimitedFrom(InputStream inputStream) {
            return (GpsInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GpsInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
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
            if (hasTimestamp() != gpsInfo.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != gpsInfo.getTimestamp()) || hasLongitude() != gpsInfo.hasLongitude()) {
                return false;
            }
            if ((hasLongitude() && Double.doubleToLongBits(getLongitude()) != Double.doubleToLongBits(gpsInfo.getLongitude())) || hasLatitude() != gpsInfo.hasLatitude()) {
                return false;
            }
            if ((!hasLatitude() || Double.doubleToLongBits(getLatitude()) == Double.doubleToLongBits(gpsInfo.getLatitude())) && hasAltitude() == gpsInfo.hasAltitude()) {
                return (!hasAltitude() || Double.doubleToLongBits(getAltitude()) == Double.doubleToLongBits(gpsInfo.getAltitude())) && getUnknownFields().equals(gpsInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
        public double getAltitude() {
            return this.altitude_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_GnssProtos.internal_static_SA_GpsInfo_descriptor;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
        public double getLatitude() {
            return this.latitude_;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
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
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.timestamp_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeDoubleSize(2, this.longitude_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeDoubleSize(3, this.latitude_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeDoubleSize(4, this.altitude_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
        public boolean hasAltitude() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
        public boolean hasLatitude() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
        public boolean hasLongitude() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.GpsInfoOrBuilder
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
            if (hasLongitude()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getLongitude()));
            }
            if (hasLatitude()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getLatitude()));
            }
            if (hasAltitude()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Internal.hashLong(Double.doubleToLongBits(getAltitude()));
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_GnssProtos.internal_static_SA_GpsInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GpsInfo.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.timestamp_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeDouble(2, this.longitude_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeDouble(3, this.latitude_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeDouble(4, this.altitude_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private GpsInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.timestamp_ = 0;
            this.longitude_ = 0.0d;
            this.latitude_ = 0.0d;
            this.altitude_ = 0.0d;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GpsInfo gpsInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gpsInfo);
        }

        public static GpsInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static GpsInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GpsInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GpsInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GpsInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GpsInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static GpsInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GpsInfo parseFrom(InputStream inputStream) {
            return (GpsInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private GpsInfo() {
            this.timestamp_ = 0;
            this.longitude_ = 0.0d;
            this.latitude_ = 0.0d;
            this.altitude_ = 0.0d;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GpsInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GpsInfo parseFrom(CodedInputStream codedInputStream) {
            return (GpsInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static GpsInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GpsInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
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

    public static final class SEGnss extends GeneratedMessage implements SEGnssOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int DAYS_FIELD_NUMBER = 1;
        private static final SEGnss DEFAULT_INSTANCE;
        public static final int GPS_INFO_FIELD_NUMBER = 3;
        private static final Parser<SEGnss> PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos$SEGnss$1 */
        public class AnonymousClass1 extends AbstractParser<SEGnss> {
            @Override // com.google.protobuf.Parser
            public SEGnss parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEGnss.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEGnssOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> dataBuilder_;
            private SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> gpsInfoBuilder_;
            private int payloadCase_;
            private Object payload_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, a aVar) {
                this(builderParent);
            }

            private void buildPartial0(SEGnss sEGnss) {
            }

            private void buildPartialOneofs(SEGnss sEGnss) {
                SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> singleFieldBuilder2;
                int i7 = this.payloadCase_;
                sEGnss.payloadCase_ = i7;
                sEGnss.payload_ = this.payload_;
                if (i7 == 2 && (singleFieldBuilder2 = this.dataBuilder_) != null) {
                    sEGnss.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 3 || (singleFieldBuilder = this.gpsInfoBuilder_) == null) {
                    return;
                }
                sEGnss.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SA_GnssProtos.internal_static_SA_SEGnss_descriptor;
            }

            private SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> internalGetDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = Data.getDefaultInstance();
                    }
                    this.dataBuilder_ = new SingleFieldBuilder<>((Data) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.dataBuilder_;
            }

            private SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> internalGetGpsInfoFieldBuilder() {
                if (this.gpsInfoBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = GpsInfo.getDefaultInstance();
                    }
                    this.gpsInfoBuilder_ = new SingleFieldBuilder<>((GpsInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.gpsInfoBuilder_;
            }

            public Builder clearData() {
                SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> singleFieldBuilder = this.dataBuilder_;
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

            public Builder clearDays() {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearGpsInfo() {
                SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilder = this.gpsInfoBuilder_;
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

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
            public Data getData() {
                SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (Data) this.payload_ : Data.getDefaultInstance() : this.payloadCase_ == 2 ? (Data) singleFieldBuilder.getMessage() : Data.getDefaultInstance();
            }

            public Data.Builder getDataBuilder() {
                return (Data.Builder) internalGetDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
            public DataOrBuilder getDataOrBuilder() {
                SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.dataBuilder_) == null) ? i7 == 2 ? (Data) this.payload_ : Data.getDefaultInstance() : (DataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
            public int getDays() {
                if (this.payloadCase_ == 1) {
                    return ((Integer) this.payload_).intValue();
                }
                return 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SA_GnssProtos.internal_static_SA_SEGnss_descriptor;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
            public GpsInfo getGpsInfo() {
                SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilder = this.gpsInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (GpsInfo) this.payload_ : GpsInfo.getDefaultInstance() : this.payloadCase_ == 3 ? (GpsInfo) singleFieldBuilder.getMessage() : GpsInfo.getDefaultInstance();
            }

            public GpsInfo.Builder getGpsInfoBuilder() {
                return (GpsInfo.Builder) internalGetGpsInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
            public GpsInfoOrBuilder getGpsInfoOrBuilder() {
                SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.gpsInfoBuilder_) == null) ? i7 == 3 ? (GpsInfo) this.payload_ : GpsInfo.getDefaultInstance() : (GpsInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
            public boolean hasData() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
            public boolean hasDays() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
            public boolean hasGpsInfo() {
                return this.payloadCase_ == 3;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SA_GnssProtos.internal_static_SA_SEGnss_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGnss.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasData() || getData().isInitialized()) {
                    return !hasGpsInfo() || getGpsInfo().isInitialized();
                }
                return false;
            }

            public Builder mergeData(Data data) {
                SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == Data.getDefaultInstance()) {
                        this.payload_ = data;
                    } else {
                        this.payload_ = Data.newBuilder((Data) this.payload_).mergeFrom(data).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(data);
                } else {
                    singleFieldBuilder.setMessage(data);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeGpsInfo(GpsInfo gpsInfo) {
                SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilder = this.gpsInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == GpsInfo.getDefaultInstance()) {
                        this.payload_ = gpsInfo;
                    } else {
                        this.payload_ = GpsInfo.newBuilder((GpsInfo) this.payload_).mergeFrom(gpsInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(gpsInfo);
                } else {
                    singleFieldBuilder.setMessage(gpsInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setData(Data data) {
                SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder == null) {
                    data.getClass();
                    this.payload_ = data;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(data);
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

            public Builder setGpsInfo(GpsInfo gpsInfo) {
                SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilder = this.gpsInfoBuilder_;
                if (singleFieldBuilder == null) {
                    gpsInfo.getClass();
                    this.payload_ = gpsInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(gpsInfo);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGnss build() {
                SEGnss sEGnssBuildPartial = buildPartial();
                if (sEGnssBuildPartial.isInitialized()) {
                    return sEGnssBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEGnssBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGnss buildPartial() {
                SEGnss sEGnss = new SEGnss(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEGnss);
                }
                buildPartialOneofs(sEGnss);
                onBuilt();
                return sEGnss;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEGnss getDefaultInstanceForType() {
                return SEGnss.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilder2 = this.gpsInfoBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEGnss) {
                    return mergeFrom((SEGnss) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(Data.Builder builder) {
                SingleFieldBuilder<Data, Data.Builder, DataOrBuilder> singleFieldBuilder = this.dataBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setGpsInfo(GpsInfo.Builder builder) {
                SingleFieldBuilder<GpsInfo, GpsInfo.Builder, GpsInfoOrBuilder> singleFieldBuilder = this.gpsInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeFrom(SEGnss sEGnss) {
                if (sEGnss == SEGnss.getDefaultInstance()) {
                    return this;
                }
                int iOrdinal = sEGnss.getPayloadCase().ordinal();
                if (iOrdinal == 0) {
                    setDays(sEGnss.getDays());
                } else if (iOrdinal == 1) {
                    mergeData(sEGnss.getData());
                } else if (iOrdinal == 2) {
                    mergeGpsInfo(sEGnss.getGpsInfo());
                }
                mergeUnknownFields(sEGnss.getUnknownFields());
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
                                    this.payload_ = Integer.valueOf(codedInputStream.readUInt32());
                                    this.payloadCase_ = 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetGpsInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
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

        public enum GnssID implements ProtocolMessageEnum {
            REQUEST_ONLINE(0),
            REQUEST_OFFLINE(1),
            SEND_GPS_INFO(2),
            REQUEST_GPS_INFO(3),
            APP_REQUEST_AGPS_INFO(4);

            public static final int APP_REQUEST_AGPS_INFO_VALUE = 4;
            public static final int REQUEST_GPS_INFO_VALUE = 3;
            public static final int REQUEST_OFFLINE_VALUE = 1;
            public static final int REQUEST_ONLINE_VALUE = 0;
            public static final int SEND_GPS_INFO_VALUE = 2;
            private static final GnssID[] VALUES;
            private static final Internal.EnumLiteMap<GnssID> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos$SEGnss$GnssID$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<GnssID> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GnssID findValueByNumber(int i7) {
                    return GnssID.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "GnssID");
                internalValueMap = new Internal.EnumLiteMap<GnssID>() { // from class: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnss.GnssID.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public GnssID findValueByNumber(int i7) {
                        return GnssID.forNumber(i7);
                    }
                };
                VALUES = values();
            }

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
                if (i7 == 2) {
                    return SEND_GPS_INFO;
                }
                if (i7 == 3) {
                    return REQUEST_GPS_INFO;
                }
                if (i7 != 4) {
                    return null;
                }
                return APP_REQUEST_AGPS_INFO;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SEGnss.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<GnssID> internalGetValueMap() {
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
            public static GnssID valueOf(int i7) {
                return forNumber(i7);
            }

            public static GnssID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public enum PayloadCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEGnss");
            DEFAULT_INSTANCE = new SEGnss();
            PARSER = new AbstractParser<SEGnss>() { // from class: com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnss.1
                @Override // com.google.protobuf.Parser
                public SEGnss parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEGnss.newBuilder();
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

        public /* synthetic */ SEGnss(GeneratedMessage.Builder builder, a aVar) {
            this(builder);
        }

        public static SEGnss getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SA_GnssProtos.internal_static_SA_SEGnss_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEGnss parseDelimitedFrom(InputStream inputStream) {
            return (SEGnss) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEGnss parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEGnss> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEGnss)) {
                return super.equals(obj);
            }
            SEGnss sEGnss = (SEGnss) obj;
            if (!getPayloadCase().equals(sEGnss.getPayloadCase())) {
                return false;
            }
            int i7 = this.payloadCase_;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3 && !getGpsInfo().equals(sEGnss.getGpsInfo())) {
                        return false;
                    }
                } else if (!getData().equals(sEGnss.getData())) {
                    return false;
                }
            } else if (getDays() != sEGnss.getDays()) {
                return false;
            }
            return getUnknownFields().equals(sEGnss.getUnknownFields());
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
        public Data getData() {
            return this.payloadCase_ == 2 ? (Data) this.payload_ : Data.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
        public DataOrBuilder getDataOrBuilder() {
            return this.payloadCase_ == 2 ? (Data) this.payload_ : Data.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
        public int getDays() {
            if (this.payloadCase_ == 1) {
                return ((Integer) this.payload_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SA_GnssProtos.internal_static_SA_SEGnss_descriptor;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
        public GpsInfo getGpsInfo() {
            return this.payloadCase_ == 3 ? (GpsInfo) this.payload_ : GpsInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
        public GpsInfoOrBuilder getGpsInfoOrBuilder() {
            return this.payloadCase_ == 3 ? (GpsInfo) this.payload_ : GpsInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEGnss> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
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
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
        public boolean hasData() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
        public boolean hasDays() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.ble.sa_zhwear.protobuf.SA_GnssProtos.SEGnssOrBuilder
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
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }
                i7 = ((iHashCode * 37) + 2) * 53;
                days = getData().hashCode();
            }
            iHashCode = i7 + days;
            int iHashCode22 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode22;
            return iHashCode22;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SA_GnssProtos.internal_static_SA_SEGnss_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGnss.class, Builder.class);
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEGnss(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEGnss sEGnss) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEGnss);
        }

        public static SEGnss parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEGnss parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGnss) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGnss parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEGnss getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEGnss parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEGnss() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEGnss parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEGnss parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEGnss parseFrom(InputStream inputStream) {
            return (SEGnss) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEGnss parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGnss) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGnss parseFrom(CodedInputStream codedInputStream) {
            return (SEGnss) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEGnss parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGnss) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEGnssOrBuilder extends MessageOrBuilder {
        Data getData();

        DataOrBuilder getDataOrBuilder();

        int getDays();

        GpsInfo getGpsInfo();

        GpsInfoOrBuilder getGpsInfoOrBuilder();

        SEGnss.PayloadCase getPayloadCase();

        boolean hasData();

        boolean hasDays();

        boolean hasGpsInfo();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SA_GnssProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012sa_wear_gnss.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\"Õ\u0001\n\u0006SEGnss\u0012\u000e\n\u0004days\u0018\u0001 \u0001(\rH\u0000\u0012\u0018\n\u0004data\u0018\u0002 \u0001(\u000b2\b.SA.DataH\u0000\u0012\u001f\n\bgps_info\u0018\u0003 \u0001(\u000b2\u000b.SA.GpsInfoH\u0000\"u\n\u0006GnssID\u0012\u0012\n\u000eREQUEST_ONLINE\u0010\u0000\u0012\u0013\n\u000fREQUEST_OFFLINE\u0010\u0001\u0012\u0011\n\rSEND_GPS_INFO\u0010\u0002\u0012\u0014\n\u0010REQUEST_GPS_INFO\u0010\u0003\u0012\u0019\n\u0015APP_REQUEST_AGPS_INFO\u0010\u0004B\t\n\u0007payload\"Ï\u0001\n\u0004Data\u0012\u001b\n\u0004type\u0018\u0001 \u0002(\u000e2\r.SA.Data.Type\u0012\u0015\n\u0006source\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001d\n\u0015need_send_agps_status\u0018\u0003 \u0002(\b\u0012\u0013\n\u0004days\u0018\u0004 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u0015\n\rneed_gps_info\u0018\u0005 \u0001(\b\u0012\u001d\n\u0015expected_slice_length\u0018\u0006 \u0001(\r\")\n\u0004Type\u0012\b\n\u0004AGPS\u0010\u0001\u0012\n\n\u0006BEIDOU\u0010\u0002\u0012\u000b\n\u0007GALILEO\u0010\u0003\"S\n\u0007GpsInfo\u0012\u0011\n\ttimestamp\u0018\u0001 \u0002(\r\u0012\u0011\n\tlongitude\u0018\u0002 \u0002(\u0001\u0012\u0010\n\blatitude\u0018\u0003 \u0002(\u0001\u0012\u0010\n\baltitude\u0018\u0004 \u0001(\u0001B5\n\u001dcom.zh.ble.sa_zhwear.protobufB\rSA_GnssProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SEGnss_descriptor = messageType;
        internal_static_SA_SEGnss_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"Days", "Data", "GpsInfo", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_Data_descriptor = messageType2;
        internal_static_SA_Data_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"Type", "Source", "NeedSendAgpsStatus", "Days", "NeedGpsInfo", "ExpectedSliceLength"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SA_GpsInfo_descriptor = messageType3;
        internal_static_SA_GpsInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"Timestamp", "Longitude", "Latitude", "Altitude"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private SA_GnssProtos() {
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