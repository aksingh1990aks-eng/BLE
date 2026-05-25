package com.zh.wear.protobuf;

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
public final class StockProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_StockInfo_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_StockInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_StockInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_StockInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_StockSymbol_List_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_StockSymbol_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_StockSymbol_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_StockSymbol_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Stock_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Stock_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.StockProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$StockProtos$Stock$PayloadCase;

        static {
            int[] iArr = new int[Stock.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$StockProtos$Stock$PayloadCase = iArr;
            try {
                iArr[Stock.PayloadCase.STOCK_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$StockProtos$Stock$PayloadCase[Stock.PayloadCase.STOCK_INFO_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$StockProtos$Stock$PayloadCase[Stock.PayloadCase.SYMBOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$StockProtos$Stock$PayloadCase[Stock.PayloadCase.STOCK_SYMBOL_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$StockProtos$Stock$PayloadCase[Stock.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class Stock extends GeneratedMessageV3 implements StockOrBuilder {
        private static final Stock DEFAULT_INSTANCE = new Stock();

        @Deprecated
        public static final Parser<Stock> PARSER = new AbstractParser<Stock>() { // from class: com.zh.wear.protobuf.StockProtos.Stock.1
            @Override // com.google.protobuf.Parser
            public Stock parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Stock(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int STOCK_INFO_FIELD_NUMBER = 1;
        public static final int STOCK_INFO_LIST_FIELD_NUMBER = 2;
        public static final int STOCK_SYMBOL_LIST_FIELD_NUMBER = 4;
        public static final int SYMBOL_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StockOrBuilder {
            private int bitField0_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilderV3<StockInfo, StockInfo.Builder, StockInfoOrBuilder> stockInfoBuilder_;
            private SingleFieldBuilderV3<StockInfo.List, StockInfo.List.Builder, StockInfo.ListOrBuilder> stockInfoListBuilder_;
            private SingleFieldBuilderV3<StockSymbol.List, StockSymbol.List.Builder, StockSymbol.ListOrBuilder> stockSymbolListBuilder_;

            private Builder() {
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return StockProtos.internal_static_Stock_descriptor;
            }

            private SingleFieldBuilderV3<StockInfo, StockInfo.Builder, StockInfoOrBuilder> getStockInfoFieldBuilder() {
                if (this.stockInfoBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = StockInfo.getDefaultInstance();
                    }
                    this.stockInfoBuilder_ = new SingleFieldBuilderV3<>((StockInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.stockInfoBuilder_;
            }

            private SingleFieldBuilderV3<StockInfo.List, StockInfo.List.Builder, StockInfo.ListOrBuilder> getStockInfoListFieldBuilder() {
                if (this.stockInfoListBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = StockInfo.List.getDefaultInstance();
                    }
                    this.stockInfoListBuilder_ = new SingleFieldBuilderV3<>((StockInfo.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.stockInfoListBuilder_;
            }

            private SingleFieldBuilderV3<StockSymbol.List, StockSymbol.List.Builder, StockSymbol.ListOrBuilder> getStockSymbolListFieldBuilder() {
                if (this.stockSymbolListBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = StockSymbol.List.getDefaultInstance();
                    }
                    this.stockSymbolListBuilder_ = new SingleFieldBuilderV3<>((StockSymbol.List) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.stockSymbolListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearStockInfo() {
                SingleFieldBuilderV3<StockInfo, StockInfo.Builder, StockInfoOrBuilder> singleFieldBuilderV3 = this.stockInfoBuilder_;
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

            public Builder clearStockInfoList() {
                SingleFieldBuilderV3<StockInfo.List, StockInfo.List.Builder, StockInfo.ListOrBuilder> singleFieldBuilderV3 = this.stockInfoListBuilder_;
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

            public Builder clearStockSymbolList() {
                SingleFieldBuilderV3<StockSymbol.List, StockSymbol.List.Builder, StockSymbol.ListOrBuilder> singleFieldBuilderV3 = this.stockSymbolListBuilder_;
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

            public Builder clearSymbol() {
                if (this.payloadCase_ == 3) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return StockProtos.internal_static_Stock_descriptor;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public StockInfo getStockInfo() {
                Object message;
                SingleFieldBuilderV3<StockInfo, StockInfo.Builder, StockInfoOrBuilder> singleFieldBuilderV3 = this.stockInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 1) {
                        return StockInfo.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 1) {
                        return StockInfo.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (StockInfo) message;
            }

            public StockInfo.Builder getStockInfoBuilder() {
                return (StockInfo.Builder) getStockInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public StockInfo.List getStockInfoList() {
                Object message;
                SingleFieldBuilderV3<StockInfo.List, StockInfo.List.Builder, StockInfo.ListOrBuilder> singleFieldBuilderV3 = this.stockInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 2) {
                        return StockInfo.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 2) {
                        return StockInfo.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (StockInfo.List) message;
            }

            public StockInfo.List.Builder getStockInfoListBuilder() {
                return (StockInfo.List.Builder) getStockInfoListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public StockInfo.ListOrBuilder getStockInfoListOrBuilder() {
                SingleFieldBuilderV3<StockInfo.List, StockInfo.List.Builder, StockInfo.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilderV3 = this.stockInfoListBuilder_) == null) ? i7 == 2 ? (StockInfo.List) this.payload_ : StockInfo.List.getDefaultInstance() : (StockInfo.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public StockInfoOrBuilder getStockInfoOrBuilder() {
                SingleFieldBuilderV3<StockInfo, StockInfo.Builder, StockInfoOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilderV3 = this.stockInfoBuilder_) == null) ? i7 == 1 ? (StockInfo) this.payload_ : StockInfo.getDefaultInstance() : (StockInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public StockSymbol.List getStockSymbolList() {
                Object message;
                SingleFieldBuilderV3<StockSymbol.List, StockSymbol.List.Builder, StockSymbol.ListOrBuilder> singleFieldBuilderV3 = this.stockSymbolListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 4) {
                        return StockSymbol.List.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 4) {
                        return StockSymbol.List.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (StockSymbol.List) message;
            }

            public StockSymbol.List.Builder getStockSymbolListBuilder() {
                return (StockSymbol.List.Builder) getStockSymbolListFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public StockSymbol.ListOrBuilder getStockSymbolListOrBuilder() {
                SingleFieldBuilderV3<StockSymbol.List, StockSymbol.List.Builder, StockSymbol.ListOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilderV3 = this.stockSymbolListBuilder_) == null) ? i7 == 4 ? (StockSymbol.List) this.payload_ : StockSymbol.List.getDefaultInstance() : (StockSymbol.ListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public String getSymbol() {
                String str = this.payloadCase_ == 3 ? this.payload_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                ByteString byteString = (ByteString) str;
                String stringUtf8 = byteString.toStringUtf8();
                if (this.payloadCase_ == 3 && byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public ByteString getSymbolBytes() {
                String str = this.payloadCase_ == 3 ? this.payload_ : "";
                if (!(str instanceof String)) {
                    return (ByteString) str;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.payloadCase_ == 3) {
                    this.payload_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public boolean hasStockInfo() {
                return this.payloadCase_ == 1;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public boolean hasStockInfoList() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public boolean hasStockSymbolList() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
            public boolean hasSymbol() {
                return this.payloadCase_ == 3;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return StockProtos.internal_static_Stock_fieldAccessorTable.ensureFieldAccessorsInitialized(Stock.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasStockInfo() && !getStockInfo().isInitialized()) {
                    return false;
                }
                if (!hasStockInfoList() || getStockInfoList().isInitialized()) {
                    return !hasStockSymbolList() || getStockSymbolList().isInitialized();
                }
                return false;
            }

            public Builder mergeStockInfo(StockInfo stockInfo) {
                SingleFieldBuilderV3<StockInfo, StockInfo.Builder, StockInfoOrBuilder> singleFieldBuilderV3 = this.stockInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 1 && this.payload_ != StockInfo.getDefaultInstance()) {
                        stockInfo = StockInfo.newBuilder((StockInfo) this.payload_).mergeFrom(stockInfo).buildPartial();
                    }
                    this.payload_ = stockInfo;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(stockInfo);
                    }
                    this.stockInfoBuilder_.setMessage(stockInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeStockInfoList(StockInfo.List list) {
                SingleFieldBuilderV3<StockInfo.List, StockInfo.List.Builder, StockInfo.ListOrBuilder> singleFieldBuilderV3 = this.stockInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 2 && this.payload_ != StockInfo.List.getDefaultInstance()) {
                        list = StockInfo.List.newBuilder((StockInfo.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.stockInfoListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeStockSymbolList(StockSymbol.List list) {
                SingleFieldBuilderV3<StockSymbol.List, StockSymbol.List.Builder, StockSymbol.ListOrBuilder> singleFieldBuilderV3 = this.stockSymbolListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 4 && this.payload_ != StockSymbol.List.getDefaultInstance()) {
                        list = StockSymbol.List.newBuilder((StockSymbol.List) this.payload_).mergeFrom(list).buildPartial();
                    }
                    this.payload_ = list;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 4) {
                        singleFieldBuilderV3.mergeFrom(list);
                    }
                    this.stockSymbolListBuilder_.setMessage(list);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setStockInfo(StockInfo.Builder builder) {
                SingleFieldBuilderV3<StockInfo, StockInfo.Builder, StockInfoOrBuilder> singleFieldBuilderV3 = this.stockInfoBuilder_;
                StockInfo stockInfoBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = stockInfoBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stockInfoBuild);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setStockInfoList(StockInfo.List.Builder builder) {
                SingleFieldBuilderV3<StockInfo.List, StockInfo.List.Builder, StockInfo.ListOrBuilder> singleFieldBuilderV3 = this.stockInfoListBuilder_;
                StockInfo.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setStockSymbolList(StockSymbol.List.Builder builder) {
                SingleFieldBuilderV3<StockSymbol.List, StockSymbol.List.Builder, StockSymbol.ListOrBuilder> singleFieldBuilderV3 = this.stockSymbolListBuilder_;
                StockSymbol.List listBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = listBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(listBuild);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setSymbol(String str) {
                str.getClass();
                this.payloadCase_ = 3;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 3;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setStockInfo(StockInfo stockInfo) {
                SingleFieldBuilderV3<StockInfo, StockInfo.Builder, StockInfoOrBuilder> singleFieldBuilderV3 = this.stockInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stockInfo.getClass();
                    this.payload_ = stockInfo;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stockInfo);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setStockInfoList(StockInfo.List list) {
                SingleFieldBuilderV3<StockInfo.List, StockInfo.List.Builder, StockInfo.ListOrBuilder> singleFieldBuilderV3 = this.stockInfoListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setStockSymbolList(StockSymbol.List list) {
                SingleFieldBuilderV3<StockSymbol.List, StockSymbol.List.Builder, StockSymbol.ListOrBuilder> singleFieldBuilderV3 = this.stockSymbolListBuilder_;
                if (singleFieldBuilderV3 == null) {
                    list.getClass();
                    this.payload_ = list;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(list);
                }
                this.payloadCase_ = 4;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Stock build() {
                Stock stockBuildPartial = buildPartial();
                if (stockBuildPartial.isInitialized()) {
                    return stockBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stockBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Stock buildPartial() {
                Stock stock = new Stock(this);
                if (this.payloadCase_ == 1) {
                    SingleFieldBuilderV3<StockInfo, StockInfo.Builder, StockInfoOrBuilder> singleFieldBuilderV3 = this.stockInfoBuilder_;
                    stock.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 2) {
                    SingleFieldBuilderV3<StockInfo.List, StockInfo.List.Builder, StockInfo.ListOrBuilder> singleFieldBuilderV32 = this.stockInfoListBuilder_;
                    stock.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 3) {
                    stock.payload_ = this.payload_;
                }
                if (this.payloadCase_ == 4) {
                    SingleFieldBuilderV3<StockSymbol.List, StockSymbol.List.Builder, StockSymbol.ListOrBuilder> singleFieldBuilderV33 = this.stockSymbolListBuilder_;
                    stock.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                stock.bitField0_ = 0;
                stock.payloadCase_ = this.payloadCase_;
                onBuilt();
                return stock;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Stock getDefaultInstanceForType() {
                return Stock.getDefaultInstance();
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
            public com.zh.wear.protobuf.StockProtos.Stock.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.StockProtos$Stock> r1 = com.zh.wear.protobuf.StockProtos.Stock.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.StockProtos$Stock r3 = (com.zh.wear.protobuf.StockProtos.Stock) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.StockProtos$Stock r4 = (com.zh.wear.protobuf.StockProtos.Stock) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.StockProtos.Stock.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.StockProtos$Stock$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Stock) {
                    return mergeFrom((Stock) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Stock stock) {
                if (stock == Stock.getDefaultInstance()) {
                    return this;
                }
                int i7 = AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$StockProtos$Stock$PayloadCase[stock.getPayloadCase().ordinal()];
                if (i7 == 1) {
                    mergeStockInfo(stock.getStockInfo());
                } else if (i7 == 2) {
                    mergeStockInfoList(stock.getStockInfoList());
                } else if (i7 == 3) {
                    this.payloadCase_ = 3;
                    this.payload_ = stock.payload_;
                    onChanged();
                } else if (i7 == 4) {
                    mergeStockSymbolList(stock.getStockSymbolList());
                }
                mergeUnknownFields(((GeneratedMessage) stock).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            STOCK_INFO(1),
            STOCK_INFO_LIST(2),
            SYMBOL(3),
            STOCK_SYMBOL_LIST(4),
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
                    return STOCK_INFO;
                }
                if (i7 == 2) {
                    return STOCK_INFO_LIST;
                }
                if (i7 == 3) {
                    return SYMBOL;
                }
                if (i7 != 4) {
                    return null;
                }
                return STOCK_SYMBOL_LIST;
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

        public enum StockID implements ProtocolMessageEnum {
            SYNC_STOCK_INFO(0),
            SYNC_STOCK_INFO_LIST(1),
            DELETE_STOCK(2),
            SET_STOCK_LIST(3),
            GET_STOCK_LIST(4),
            WEAR_REQUEST(5);

            public static final int DELETE_STOCK_VALUE = 2;
            public static final int GET_STOCK_LIST_VALUE = 4;
            public static final int SET_STOCK_LIST_VALUE = 3;
            public static final int SYNC_STOCK_INFO_LIST_VALUE = 1;
            public static final int SYNC_STOCK_INFO_VALUE = 0;
            public static final int WEAR_REQUEST_VALUE = 5;
            private final int value;
            private static final Internal.EnumLiteMap<StockID> internalValueMap = new Internal.EnumLiteMap<StockID>() { // from class: com.zh.wear.protobuf.StockProtos.Stock.StockID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public StockID findValueByNumber(int i7) {
                    return StockID.forNumber(i7);
                }
            };
            private static final StockID[] VALUES = values();

            StockID(int i7) {
                this.value = i7;
            }

            public static StockID forNumber(int i7) {
                if (i7 == 0) {
                    return SYNC_STOCK_INFO;
                }
                if (i7 == 1) {
                    return SYNC_STOCK_INFO_LIST;
                }
                if (i7 == 2) {
                    return DELETE_STOCK;
                }
                if (i7 == 3) {
                    return SET_STOCK_LIST;
                }
                if (i7 == 4) {
                    return GET_STOCK_LIST;
                }
                if (i7 != 5) {
                    return null;
                }
                return WEAR_REQUEST;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Stock.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<StockID> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static StockID valueOf(int i7) {
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

            public static StockID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        private Stock() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Stock getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return StockProtos.internal_static_Stock_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Stock parseDelimitedFrom(InputStream inputStream) {
            return (Stock) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Stock parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Stock> parser() {
            return PARSER;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
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
                boolean r1 = r6 instanceof com.zh.wear.protobuf.StockProtos.Stock
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.zh.wear.protobuf.StockProtos$Stock r6 = (com.zh.wear.protobuf.StockProtos.Stock) r6
                com.zh.wear.protobuf.StockProtos$Stock$PayloadCase r1 = r5.getPayloadCase()
                com.zh.wear.protobuf.StockProtos$Stock$PayloadCase r2 = r6.getPayloadCase()
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 != 0) goto L1f
                return r2
            L1f:
                int r3 = r5.payloadCase_
                if (r3 == r0) goto L60
                r4 = 2
                if (r3 == r4) goto L4f
                r4 = 3
                if (r3 == r4) goto L3e
                r4 = 4
                if (r3 == r4) goto L2d
                goto L73
            L2d:
                if (r1 == 0) goto L72
                com.zh.wear.protobuf.StockProtos$StockSymbol$List r1 = r5.getStockSymbolList()
                com.zh.wear.protobuf.StockProtos$StockSymbol$List r3 = r6.getStockSymbolList()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L72
                goto L70
            L3e:
                if (r1 == 0) goto L72
                java.lang.String r1 = r5.getSymbol()
                java.lang.String r3 = r6.getSymbol()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L72
                goto L70
            L4f:
                if (r1 == 0) goto L72
                com.zh.wear.protobuf.StockProtos$StockInfo$List r1 = r5.getStockInfoList()
                com.zh.wear.protobuf.StockProtos$StockInfo$List r3 = r6.getStockInfoList()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L72
                goto L70
            L60:
                if (r1 == 0) goto L72
                com.zh.wear.protobuf.StockProtos$StockInfo r1 = r5.getStockInfo()
                com.zh.wear.protobuf.StockProtos$StockInfo r3 = r6.getStockInfo()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L72
            L70:
                r1 = r0
                goto L73
            L72:
                r1 = r2
            L73:
                if (r1 == 0) goto L80
                com.google.protobuf.UnknownFieldSet r1 = r5.unknownFields
                com.google.protobuf.UnknownFieldSet r6 = r6.unknownFields
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L80
                return r0
            L80:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.StockProtos.Stock.equals(java.lang.Object):boolean");
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Stock> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (StockInfo) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (StockInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(3, this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (StockSymbol.List) this.payload_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public StockInfo getStockInfo() {
            return this.payloadCase_ == 1 ? (StockInfo) this.payload_ : StockInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public StockInfo.List getStockInfoList() {
            return this.payloadCase_ == 2 ? (StockInfo.List) this.payload_ : StockInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public StockInfo.ListOrBuilder getStockInfoListOrBuilder() {
            return this.payloadCase_ == 2 ? (StockInfo.List) this.payload_ : StockInfo.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public StockInfoOrBuilder getStockInfoOrBuilder() {
            return this.payloadCase_ == 1 ? (StockInfo) this.payload_ : StockInfo.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public StockSymbol.List getStockSymbolList() {
            return this.payloadCase_ == 4 ? (StockSymbol.List) this.payload_ : StockSymbol.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public StockSymbol.ListOrBuilder getStockSymbolListOrBuilder() {
            return this.payloadCase_ == 4 ? (StockSymbol.List) this.payload_ : StockSymbol.List.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public String getSymbol() {
            String str = this.payloadCase_ == 3 ? this.payload_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            ByteString byteString = (ByteString) str;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8() && this.payloadCase_ == 3) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public ByteString getSymbolBytes() {
            String str = this.payloadCase_ == 3 ? this.payload_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadCase_ == 3) {
                this.payload_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public boolean hasStockInfo() {
            return this.payloadCase_ == 1;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public boolean hasStockInfoList() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public boolean hasStockSymbolList() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockOrBuilder
        public boolean hasSymbol() {
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
                iHashCode = getStockInfo().hashCode();
            } else if (i9 == 2) {
                i7 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getStockInfoList().hashCode();
            } else {
                if (i9 != 3) {
                    if (i9 == 4) {
                        i7 = ((iHashCode2 * 37) + 4) * 53;
                        iHashCode = getStockSymbolList().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i7 = ((iHashCode2 * 37) + 3) * 53;
                iHashCode = getSymbol().hashCode();
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StockProtos.internal_static_Stock_fieldAccessorTable.ensureFieldAccessorsInitialized(Stock.class, Builder.class);
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
            if (hasStockInfo() && !getStockInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStockInfoList() && !getStockInfoList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasStockSymbolList() || getStockSymbolList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (StockInfo) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (StockInfo.List) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (StockSymbol.List) this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Stock(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        int i7 = 1;
                        if (tag != 0) {
                            if (tag == 10) {
                                StockInfo.Builder builder = this.payloadCase_ == 1 ? ((StockInfo) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(StockInfo.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((StockInfo) message);
                                    this.payload_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                i7 = 2;
                                StockInfo.List.Builder builder2 = this.payloadCase_ == 2 ? ((StockInfo.List) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(StockInfo.List.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((StockInfo.List) message2);
                                    this.payload_ = builder2.buildPartial();
                                }
                            } else if (tag == 26) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.payloadCase_ = 3;
                                this.payload_ = bytes;
                            } else if (tag == 34) {
                                i7 = 4;
                                StockSymbol.List.Builder builder3 = this.payloadCase_ == 4 ? ((StockSymbol.List) this.payload_).toBuilder() : null;
                                MessageLite message3 = codedInputStream.readMessage(StockSymbol.List.PARSER, extensionRegistryLite);
                                this.payload_ = message3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((StockSymbol.List) message3);
                                    this.payload_ = builder3.buildPartial();
                                }
                            } else if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            }
                            this.payloadCase_ = i7;
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

        public static Builder newBuilder(Stock stock) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stock);
        }

        public static Stock parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Stock) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Stock parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Stock parseFrom(CodedInputStream codedInputStream) {
            return (Stock) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Stock getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private Stock(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Stock parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Stock) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Stock parseFrom(InputStream inputStream) {
            return (Stock) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Stock parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Stock) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Stock parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Stock parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Stock parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Stock parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public static final class StockInfo extends GeneratedMessageV3 implements StockInfoOrBuilder {
        public static final int DELAY_MINTUE_FIELD_NUMBER = 8;
        public static final int HALTED_FIELD_NUMBER = 6;
        public static final int LATEST_PRICE_FIELD_NUMBER = 4;
        public static final int MARKET_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 3;
        public static final int PRE_CLOSE_FIELD_NUMBER = 5;
        public static final int SYMBOL_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int delayMintue_;
        private int halted_;
        private float latestPrice_;
        private volatile Object market_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private float preClose_;
        private volatile Object symbol_;
        private int timestamp_;
        private static final StockInfo DEFAULT_INSTANCE = new StockInfo();

        @Deprecated
        public static final Parser<StockInfo> PARSER = new AbstractParser<StockInfo>() { // from class: com.zh.wear.protobuf.StockProtos.StockInfo.1
            @Override // com.google.protobuf.Parser
            public StockInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StockInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StockInfoOrBuilder {
            private int bitField0_;
            private int delayMintue_;
            private int halted_;
            private float latestPrice_;
            private Object market_;
            private Object name_;
            private float preClose_;
            private Object symbol_;
            private int timestamp_;

            private Builder() {
                this.symbol_ = "";
                this.market_ = "";
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return StockProtos.internal_static_StockInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearDelayMintue() {
                this.bitField0_ &= ErrorCode.ERR_ENC_FAILURE;
                this.delayMintue_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHalted() {
                this.bitField0_ &= -33;
                this.halted_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLatestPrice() {
                this.bitField0_ &= -9;
                this.latestPrice_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMarket() {
                this.bitField0_ &= -3;
                this.market_ = StockInfo.getDefaultInstance().getMarket();
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= -5;
                this.name_ = StockInfo.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearPreClose() {
                this.bitField0_ &= -17;
                this.preClose_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearSymbol() {
                this.bitField0_ &= -2;
                this.symbol_ = StockInfo.getDefaultInstance().getSymbol();
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -65;
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public int getDelayMintue() {
                return this.delayMintue_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return StockProtos.internal_static_StockInfo_descriptor;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public int getHalted() {
                return this.halted_;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public float getLatestPrice() {
                return this.latestPrice_;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public String getMarket() {
                Object obj = this.market_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.market_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public ByteString getMarketBytes() {
                Object obj = this.market_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.market_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
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

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public float getPreClose() {
                return this.preClose_;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public String getSymbol() {
                Object obj = this.symbol_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.symbol_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public ByteString getSymbolBytes() {
                Object obj = this.symbol_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.symbol_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public boolean hasDelayMintue() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public boolean hasHalted() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public boolean hasLatestPrice() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public boolean hasMarket() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public boolean hasPreClose() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public boolean hasSymbol() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return StockProtos.internal_static_StockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(StockInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSymbol() && hasLatestPrice() && hasPreClose() && hasHalted() && hasTimestamp() && hasDelayMintue();
            }

            public Builder setDelayMintue(int i7) {
                this.bitField0_ |= 128;
                this.delayMintue_ = i7;
                onChanged();
                return this;
            }

            public Builder setHalted(int i7) {
                this.bitField0_ |= 32;
                this.halted_ = i7;
                onChanged();
                return this;
            }

            public Builder setLatestPrice(float f7) {
                this.bitField0_ |= 8;
                this.latestPrice_ = f7;
                onChanged();
                return this;
            }

            public Builder setMarket(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.market_ = str;
                onChanged();
                return this;
            }

            public Builder setMarketBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.market_ = byteString;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPreClose(float f7) {
                this.bitField0_ |= 16;
                this.preClose_ = f7;
                onChanged();
                return this;
            }

            public Builder setSymbol(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.symbol_ = str;
                onChanged();
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.symbol_ = byteString;
                onChanged();
                return this;
            }

            public Builder setTimestamp(int i7) {
                this.bitField0_ |= 64;
                this.timestamp_ = i7;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.symbol_ = "";
                this.market_ = "";
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StockInfo build() {
                StockInfo stockInfoBuildPartial = buildPartial();
                if (stockInfoBuildPartial.isInitialized()) {
                    return stockInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stockInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StockInfo buildPartial() {
                StockInfo stockInfo = new StockInfo(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                stockInfo.symbol_ = this.symbol_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                stockInfo.market_ = this.market_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                stockInfo.name_ = this.name_;
                if ((i7 & 8) == 8) {
                    i8 |= 8;
                }
                stockInfo.latestPrice_ = this.latestPrice_;
                if ((i7 & 16) == 16) {
                    i8 |= 16;
                }
                stockInfo.preClose_ = this.preClose_;
                if ((i7 & 32) == 32) {
                    i8 |= 32;
                }
                stockInfo.halted_ = this.halted_;
                if ((i7 & 64) == 64) {
                    i8 |= 64;
                }
                stockInfo.timestamp_ = this.timestamp_;
                if ((i7 & 128) == 128) {
                    i8 |= 128;
                }
                stockInfo.delayMintue_ = this.delayMintue_;
                stockInfo.bitField0_ = i8;
                onBuilt();
                return stockInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StockInfo getDefaultInstanceForType() {
                return StockInfo.getDefaultInstance();
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
                this.symbol_ = "";
                int i7 = this.bitField0_;
                this.market_ = "";
                this.name_ = "";
                this.latestPrice_ = 0.0f;
                this.preClose_ = 0.0f;
                this.halted_ = 0;
                this.timestamp_ = 0;
                this.delayMintue_ = 0;
                this.bitField0_ = i7 & (-256);
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
            public com.zh.wear.protobuf.StockProtos.StockInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.StockProtos$StockInfo> r1 = com.zh.wear.protobuf.StockProtos.StockInfo.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.StockProtos$StockInfo r3 = (com.zh.wear.protobuf.StockProtos.StockInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.StockProtos$StockInfo r4 = (com.zh.wear.protobuf.StockProtos.StockInfo) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.StockProtos.StockInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.StockProtos$StockInfo$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StockInfo) {
                    return mergeFrom((StockInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StockInfo stockInfo) {
                if (stockInfo == StockInfo.getDefaultInstance()) {
                    return this;
                }
                if (stockInfo.hasSymbol()) {
                    this.bitField0_ |= 1;
                    this.symbol_ = stockInfo.symbol_;
                    onChanged();
                }
                if (stockInfo.hasMarket()) {
                    this.bitField0_ |= 2;
                    this.market_ = stockInfo.market_;
                    onChanged();
                }
                if (stockInfo.hasName()) {
                    this.bitField0_ |= 4;
                    this.name_ = stockInfo.name_;
                    onChanged();
                }
                if (stockInfo.hasLatestPrice()) {
                    setLatestPrice(stockInfo.getLatestPrice());
                }
                if (stockInfo.hasPreClose()) {
                    setPreClose(stockInfo.getPreClose());
                }
                if (stockInfo.hasHalted()) {
                    setHalted(stockInfo.getHalted());
                }
                if (stockInfo.hasTimestamp()) {
                    setTimestamp(stockInfo.getTimestamp());
                }
                if (stockInfo.hasDelayMintue()) {
                    setDelayMintue(stockInfo.getDelayMintue());
                }
                mergeUnknownFields(((GeneratedMessage) stockInfo).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<StockInfo> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.StockProtos.StockInfo.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> listBuilder_;
                private java.util.List<StockInfo> list_;

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
                    return StockProtos.internal_static_StockInfo_List_descriptor;
                }

                private RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends StockInfo> iterable) {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(StockInfo.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return StockProtos.internal_static_StockInfo_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
                public StockInfo getList(int i7) {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (StockInfo) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
                public java.util.List<StockInfo> getListList() {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
                public StockInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (StockInfoOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
                public java.util.List<? extends StockInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return StockProtos.internal_static_StockInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, StockInfo stockInfo) {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, stockInfo);
                        return this;
                    }
                    stockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, stockInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, StockInfo.getDefaultInstance());
                }

                public Builder setList(int i7, StockInfo stockInfo) {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, stockInfo);
                        return this;
                    }
                    stockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, stockInfo);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(StockInfo stockInfo) {
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(stockInfo);
                        return this;
                    }
                    stockInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(stockInfo);
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
                    RepeatedFieldBuilderV3<StockInfo, Builder, StockInfoOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.StockProtos.StockInfo.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.StockProtos$StockInfo$List> r1 = com.zh.wear.protobuf.StockProtos.StockInfo.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.StockProtos$StockInfo$List r3 = (com.zh.wear.protobuf.StockProtos.StockInfo.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.StockProtos$StockInfo$List r4 = (com.zh.wear.protobuf.StockProtos.StockInfo.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.StockProtos.StockInfo.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.StockProtos$StockInfo$List$Builder");
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
                return StockProtos.internal_static_StockInfo_List_descriptor;
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

            @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
            public StockInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
            public java.util.List<StockInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
            public StockInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockInfo.ListOrBuilder
            public java.util.List<? extends StockInfoOrBuilder> getListOrBuilderList() {
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
                return StockProtos.internal_static_StockInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((StockInfo) codedInputStream.readMessage(StockInfo.PARSER, extensionRegistryLite));
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
            StockInfo getList(int i7);

            int getListCount();

            java.util.List<StockInfo> getListList();

            StockInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends StockInfoOrBuilder> getListOrBuilderList();
        }

        private StockInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.symbol_ = "";
            this.market_ = "";
            this.name_ = "";
            this.latestPrice_ = 0.0f;
            this.preClose_ = 0.0f;
            this.halted_ = 0;
            this.timestamp_ = 0;
            this.delayMintue_ = 0;
        }

        public static StockInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return StockProtos.internal_static_StockInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StockInfo parseDelimitedFrom(InputStream inputStream) {
            return (StockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StockInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<StockInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StockInfo)) {
                return super.equals(obj);
            }
            StockInfo stockInfo = (StockInfo) obj;
            boolean z6 = hasSymbol() == stockInfo.hasSymbol();
            if (hasSymbol()) {
                z6 = z6 && getSymbol().equals(stockInfo.getSymbol());
            }
            boolean z7 = z6 && hasMarket() == stockInfo.hasMarket();
            if (hasMarket()) {
                z7 = z7 && getMarket().equals(stockInfo.getMarket());
            }
            boolean z8 = z7 && hasName() == stockInfo.hasName();
            if (hasName()) {
                z8 = z8 && getName().equals(stockInfo.getName());
            }
            boolean z9 = z8 && hasLatestPrice() == stockInfo.hasLatestPrice();
            if (hasLatestPrice()) {
                z9 = z9 && Float.floatToIntBits(getLatestPrice()) == Float.floatToIntBits(stockInfo.getLatestPrice());
            }
            boolean z10 = z9 && hasPreClose() == stockInfo.hasPreClose();
            if (hasPreClose()) {
                z10 = z10 && Float.floatToIntBits(getPreClose()) == Float.floatToIntBits(stockInfo.getPreClose());
            }
            boolean z11 = z10 && hasHalted() == stockInfo.hasHalted();
            if (hasHalted()) {
                z11 = z11 && getHalted() == stockInfo.getHalted();
            }
            boolean z12 = z11 && hasTimestamp() == stockInfo.hasTimestamp();
            if (hasTimestamp()) {
                z12 = z12 && getTimestamp() == stockInfo.getTimestamp();
            }
            boolean z13 = z12 && hasDelayMintue() == stockInfo.hasDelayMintue();
            if (hasDelayMintue()) {
                z13 = z13 && getDelayMintue() == stockInfo.getDelayMintue();
            }
            return z13 && this.unknownFields.equals(stockInfo.unknownFields);
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public int getDelayMintue() {
            return this.delayMintue_;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public int getHalted() {
            return this.halted_;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public float getLatestPrice() {
            return this.latestPrice_;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public String getMarket() {
            Object obj = this.market_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.market_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public ByteString getMarketBytes() {
            Object obj = this.market_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.market_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
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

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
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
        public Parser<StockInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public float getPreClose() {
            return this.preClose_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.symbol_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.market_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(4, this.latestPrice_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(5, this.preClose_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(6, this.halted_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(7, this.timestamp_);
            }
            if ((this.bitField0_ & 128) == 128) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(8, this.delayMintue_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public String getSymbol() {
            Object obj = this.symbol_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.symbol_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public ByteString getSymbolBytes() {
            Object obj = this.symbol_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.symbol_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public boolean hasDelayMintue() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public boolean hasHalted() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public boolean hasLatestPrice() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public boolean hasMarket() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public boolean hasPreClose() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public boolean hasSymbol() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockInfoOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSymbol()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getSymbol().hashCode();
            }
            if (hasMarket()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMarket().hashCode();
            }
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getName().hashCode();
            }
            if (hasLatestPrice()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + Float.floatToIntBits(getLatestPrice());
            }
            if (hasPreClose()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Float.floatToIntBits(getPreClose());
            }
            if (hasHalted()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getHalted();
            }
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getTimestamp();
            }
            if (hasDelayMintue()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getDelayMintue();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StockProtos.internal_static_StockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(StockInfo.class, Builder.class);
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
            if (!hasSymbol()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLatestPrice()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPreClose()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHalted()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTimestamp()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDelayMintue()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.symbol_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.market_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeFloat(4, this.latestPrice_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeFloat(5, this.preClose_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeUInt32(6, this.halted_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeUInt32(7, this.timestamp_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeUInt32(8, this.delayMintue_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private StockInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.symbol_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.market_ = bytes2;
                            } else if (tag == 26) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.name_ = bytes3;
                            } else if (tag == 37) {
                                this.bitField0_ |= 8;
                                this.latestPrice_ = codedInputStream.readFloat();
                            } else if (tag == 45) {
                                this.bitField0_ |= 16;
                                this.preClose_ = codedInputStream.readFloat();
                            } else if (tag == 48) {
                                this.bitField0_ |= 32;
                                this.halted_ = codedInputStream.readUInt32();
                            } else if (tag == 56) {
                                this.bitField0_ |= 64;
                                this.timestamp_ = codedInputStream.readUInt32();
                            } else if (tag == 64) {
                                this.bitField0_ |= 128;
                                this.delayMintue_ = codedInputStream.readUInt32();
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

        public static Builder newBuilder(StockInfo stockInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stockInfo);
        }

        public static StockInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StockInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StockInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StockInfo parseFrom(CodedInputStream codedInputStream) {
            return (StockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StockInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private StockInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StockInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StockInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StockInfo parseFrom(InputStream inputStream) {
            return (StockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static StockInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StockInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StockInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static StockInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static StockInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StockInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface StockInfoOrBuilder extends MessageOrBuilder {
        int getDelayMintue();

        int getHalted();

        float getLatestPrice();

        String getMarket();

        ByteString getMarketBytes();

        String getName();

        ByteString getNameBytes();

        float getPreClose();

        String getSymbol();

        ByteString getSymbolBytes();

        int getTimestamp();

        boolean hasDelayMintue();

        boolean hasHalted();

        boolean hasLatestPrice();

        boolean hasMarket();

        boolean hasName();

        boolean hasPreClose();

        boolean hasSymbol();

        boolean hasTimestamp();
    }

    public interface StockOrBuilder extends MessageOrBuilder {
        Stock.PayloadCase getPayloadCase();

        StockInfo getStockInfo();

        StockInfo.List getStockInfoList();

        StockInfo.ListOrBuilder getStockInfoListOrBuilder();

        StockInfoOrBuilder getStockInfoOrBuilder();

        StockSymbol.List getStockSymbolList();

        StockSymbol.ListOrBuilder getStockSymbolListOrBuilder();

        String getSymbol();

        ByteString getSymbolBytes();

        boolean hasStockInfo();

        boolean hasStockInfoList();

        boolean hasStockSymbolList();

        boolean hasSymbol();
    }

    public static final class StockSymbol extends GeneratedMessageV3 implements StockSymbolOrBuilder {
        public static final int IS_WIDGET_FIELD_NUMBER = 2;
        public static final int ORDER_FIELD_NUMBER = 3;
        public static final int SYMBOL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isWidget_;
        private byte memoizedIsInitialized;
        private int order_;
        private volatile Object symbol_;
        private static final StockSymbol DEFAULT_INSTANCE = new StockSymbol();

        @Deprecated
        public static final Parser<StockSymbol> PARSER = new AbstractParser<StockSymbol>() { // from class: com.zh.wear.protobuf.StockProtos.StockSymbol.1
            @Override // com.google.protobuf.Parser
            public StockSymbol parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StockSymbol(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StockSymbolOrBuilder {
            private int bitField0_;
            private boolean isWidget_;
            private int order_;
            private Object symbol_;

            private Builder() {
                this.symbol_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return StockProtos.internal_static_StockSymbol_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearIsWidget() {
                this.bitField0_ &= -3;
                this.isWidget_ = false;
                onChanged();
                return this;
            }

            public Builder clearOrder() {
                this.bitField0_ &= -5;
                this.order_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSymbol() {
                this.bitField0_ &= -2;
                this.symbol_ = StockSymbol.getDefaultInstance().getSymbol();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return StockProtos.internal_static_StockSymbol_descriptor;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
            public boolean getIsWidget() {
                return this.isWidget_;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
            public int getOrder() {
                return this.order_;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
            public String getSymbol() {
                Object obj = this.symbol_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.symbol_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
            public ByteString getSymbolBytes() {
                Object obj = this.symbol_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.symbol_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
            public boolean hasIsWidget() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
            public boolean hasOrder() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
            public boolean hasSymbol() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return StockProtos.internal_static_StockSymbol_fieldAccessorTable.ensureFieldAccessorsInitialized(StockSymbol.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSymbol() && hasIsWidget() && hasOrder();
            }

            public Builder setIsWidget(boolean z6) {
                this.bitField0_ |= 2;
                this.isWidget_ = z6;
                onChanged();
                return this;
            }

            public Builder setOrder(int i7) {
                this.bitField0_ |= 4;
                this.order_ = i7;
                onChanged();
                return this;
            }

            public Builder setSymbol(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.symbol_ = str;
                onChanged();
                return this;
            }

            public Builder setSymbolBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.symbol_ = byteString;
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.symbol_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StockSymbol build() {
                StockSymbol stockSymbolBuildPartial = buildPartial();
                if (stockSymbolBuildPartial.isInitialized()) {
                    return stockSymbolBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stockSymbolBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StockSymbol buildPartial() {
                StockSymbol stockSymbol = new StockSymbol(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                stockSymbol.symbol_ = this.symbol_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                stockSymbol.isWidget_ = this.isWidget_;
                if ((i7 & 4) == 4) {
                    i8 |= 4;
                }
                stockSymbol.order_ = this.order_;
                stockSymbol.bitField0_ = i8;
                onBuilt();
                return stockSymbol;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StockSymbol getDefaultInstanceForType() {
                return StockSymbol.getDefaultInstance();
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
                this.symbol_ = "";
                int i7 = this.bitField0_;
                this.isWidget_ = false;
                this.order_ = 0;
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
            public com.zh.wear.protobuf.StockProtos.StockSymbol.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.StockProtos$StockSymbol> r1 = com.zh.wear.protobuf.StockProtos.StockSymbol.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.StockProtos$StockSymbol r3 = (com.zh.wear.protobuf.StockProtos.StockSymbol) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.StockProtos$StockSymbol r4 = (com.zh.wear.protobuf.StockProtos.StockSymbol) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.StockProtos.StockSymbol.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.StockProtos$StockSymbol$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StockSymbol) {
                    return mergeFrom((StockSymbol) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StockSymbol stockSymbol) {
                if (stockSymbol == StockSymbol.getDefaultInstance()) {
                    return this;
                }
                if (stockSymbol.hasSymbol()) {
                    this.bitField0_ |= 1;
                    this.symbol_ = stockSymbol.symbol_;
                    onChanged();
                }
                if (stockSymbol.hasIsWidget()) {
                    setIsWidget(stockSymbol.getIsWidget());
                }
                if (stockSymbol.hasOrder()) {
                    setOrder(stockSymbol.getOrder());
                }
                mergeUnknownFields(((GeneratedMessage) stockSymbol).unknownFields);
                onChanged();
                return this;
            }
        }

        public static final class List extends GeneratedMessageV3 implements ListOrBuilder {
            public static final int LIST_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private java.util.List<StockSymbol> list_;
            private byte memoizedIsInitialized;
            private static final List DEFAULT_INSTANCE = new List();

            @Deprecated
            public static final Parser<List> PARSER = new AbstractParser<List>() { // from class: com.zh.wear.protobuf.StockProtos.StockSymbol.List.1
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new List(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> listBuilder_;
                private java.util.List<StockSymbol> list_;

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
                    return StockProtos.internal_static_StockSymbol_List_descriptor;
                }

                private RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> getListFieldBuilder() {
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

                public Builder addAllList(Iterable<? extends StockSymbol> iterable) {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return (Builder) getListFieldBuilder().addBuilder(StockSymbol.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    return StockProtos.internal_static_StockSymbol_List_descriptor;
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
                public StockSymbol getList(int i7) {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (StockSymbol) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessage(i7));
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return getListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
                public java.util.List<StockSymbol> getListList() {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
                public StockSymbolOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return (StockSymbolOrBuilder) (repeatedFieldBuilderV3 == null ? this.list_.get(i7) : repeatedFieldBuilderV3.getMessageOrBuilder(i7));
                }

                @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
                public java.util.List<? extends StockSymbolOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return StockProtos.internal_static_StockSymbol_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(int i7, StockSymbol stockSymbol) {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i7, stockSymbol);
                        return this;
                    }
                    stockSymbol.getClass();
                    ensureListIsMutable();
                    this.list_.add(i7, stockSymbol);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) getListFieldBuilder().addBuilder(i7, StockSymbol.getDefaultInstance());
                }

                public Builder setList(int i7, StockSymbol stockSymbol) {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i7, stockSymbol);
                        return this;
                    }
                    stockSymbol.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, stockSymbol);
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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

                public Builder addList(StockSymbol stockSymbol) {
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(stockSymbol);
                        return this;
                    }
                    stockSymbol.getClass();
                    ensureListIsMutable();
                    this.list_.add(stockSymbol);
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
                    RepeatedFieldBuilderV3<StockSymbol, Builder, StockSymbolOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
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
                public com.zh.wear.protobuf.StockProtos.StockSymbol.List.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.Parser<com.zh.wear.protobuf.StockProtos$StockSymbol$List> r1 = com.zh.wear.protobuf.StockProtos.StockSymbol.List.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                        com.zh.wear.protobuf.StockProtos$StockSymbol$List r3 = (com.zh.wear.protobuf.StockProtos.StockSymbol.List) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                        com.zh.wear.protobuf.StockProtos$StockSymbol$List r4 = (com.zh.wear.protobuf.StockProtos.StockSymbol.List) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.StockProtos.StockSymbol.List.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.StockProtos$StockSymbol$List$Builder");
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
                return StockProtos.internal_static_StockSymbol_List_descriptor;
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

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
            public StockSymbol getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
            public java.util.List<StockSymbol> getListList() {
                return this.list_;
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
            public StockSymbolOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.wear.protobuf.StockProtos.StockSymbol.ListOrBuilder
            public java.util.List<? extends StockSymbolOrBuilder> getListOrBuilderList() {
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
                return StockProtos.internal_static_StockSymbol_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                                        this.list_.add((StockSymbol) codedInputStream.readMessage(StockSymbol.PARSER, extensionRegistryLite));
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
            StockSymbol getList(int i7);

            int getListCount();

            java.util.List<StockSymbol> getListList();

            StockSymbolOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends StockSymbolOrBuilder> getListOrBuilderList();
        }

        private StockSymbol() {
            this.memoizedIsInitialized = (byte) -1;
            this.symbol_ = "";
            this.isWidget_ = false;
            this.order_ = 0;
        }

        public static StockSymbol getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return StockProtos.internal_static_StockSymbol_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StockSymbol parseDelimitedFrom(InputStream inputStream) {
            return (StockSymbol) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StockSymbol parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<StockSymbol> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StockSymbol)) {
                return super.equals(obj);
            }
            StockSymbol stockSymbol = (StockSymbol) obj;
            boolean z6 = hasSymbol() == stockSymbol.hasSymbol();
            if (hasSymbol()) {
                z6 = z6 && getSymbol().equals(stockSymbol.getSymbol());
            }
            boolean z7 = z6 && hasIsWidget() == stockSymbol.hasIsWidget();
            if (hasIsWidget()) {
                z7 = z7 && getIsWidget() == stockSymbol.getIsWidget();
            }
            boolean z8 = z7 && hasOrder() == stockSymbol.hasOrder();
            if (hasOrder()) {
                z8 = z8 && getOrder() == stockSymbol.getOrder();
            }
            return z8 && this.unknownFields.equals(stockSymbol.unknownFields);
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
        public boolean getIsWidget() {
            return this.isWidget_;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
        public int getOrder() {
            return this.order_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StockSymbol> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? GeneratedMessage.computeStringSize(1, this.symbol_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(2, this.isWidget_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.order_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
        public String getSymbol() {
            Object obj = this.symbol_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.symbol_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
        public ByteString getSymbolBytes() {
            Object obj = this.symbol_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.symbol_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
        public boolean hasIsWidget() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
        public boolean hasOrder() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.zh.wear.protobuf.StockProtos.StockSymbolOrBuilder
        public boolean hasSymbol() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSymbol()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getSymbol().hashCode();
            }
            if (hasIsWidget()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getIsWidget());
            }
            if (hasOrder()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getOrder();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StockProtos.internal_static_StockSymbol_fieldAccessorTable.ensureFieldAccessorsInitialized(StockSymbol.class, Builder.class);
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
            if (!hasSymbol()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasIsWidget()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOrder()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.symbol_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBool(2, this.isWidget_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeUInt32(3, this.order_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private StockSymbol(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                this.symbol_ = bytes;
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.isWidget_ = codedInputStream.readBool();
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.order_ = codedInputStream.readUInt32();
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

        public static Builder newBuilder(StockSymbol stockSymbol) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stockSymbol);
        }

        public static StockSymbol parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StockSymbol) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StockSymbol parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StockSymbol parseFrom(CodedInputStream codedInputStream) {
            return (StockSymbol) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StockSymbol getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private StockSymbol(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StockSymbol parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StockSymbol) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StockSymbol parseFrom(InputStream inputStream) {
            return (StockSymbol) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static StockSymbol parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StockSymbol) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StockSymbol parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static StockSymbol parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static StockSymbol parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StockSymbol parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface StockSymbolOrBuilder extends MessageOrBuilder {
        boolean getIsWidget();

        int getOrder();

        String getSymbol();

        ByteString getSymbolBytes();

        boolean hasIsWidget();

        boolean hasOrder();

        boolean hasSymbol();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010wear_stock.proto\u001a\fnanopb.proto\"°\u0002\n\u0005Stock\u0012 \n\nstock_info\u0018\u0001 \u0001(\u000b2\n.StockInfoH\u0000\u0012*\n\u000fstock_info_list\u0018\u0002 \u0001(\u000b2\u000f.StockInfo.ListH\u0000\u0012\u0017\n\u0006symbol\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012.\n\u0011stock_symbol_list\u0018\u0004 \u0001(\u000b2\u0011.StockSymbol.ListH\u0000\"\u0084\u0001\n\u0007StockID\u0012\u0013\n\u000fSYNC_STOCK_INFO\u0010\u0000\u0012\u0018\n\u0014SYNC_STOCK_INFO_LIST\u0010\u0001\u0012\u0010\n\fDELETE_STOCK\u0010\u0002\u0012\u0012\n\u000eSET_STOCK_LIST\u0010\u0003\u0012\u0012\n\u000eGET_STOCK_LIST\u0010\u0004\u0012\u0010\n\fWEAR_REQUEST\u0010\u0005B\t\n\u0007payload\"à\u0001\n\tStockInfo\u0012\u0015\n\u0006symbol\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0015\n\u0006market\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004name\u0018\u0003 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\flatest_price\u0018\u0004 \u0002(\u0002\u0012\u0011\n\tpre_close\u0018\u0005 \u0002(\u0002\u0012\u0015\n\u0006halted\u0018\u0006 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u0011\n\ttimestamp\u0018\u0007 \u0002(\r\u0012\u0014\n\fdelay_mintue\u0018\b \u0002(\r\u001a'\n\u0004List\u0012\u001f\n\u0004list\u0018\u0001 \u0003(\u000b2\n.StockInfoB\u0005\u0092?\u0002\u0018\u0004\"x\n\u000bStockSymbol\u0012\u0015\n\u0006symbol\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0011\n\tis_widget\u0018\u0002 \u0002(\b\u0012\u0014\n\u0005order\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028\b\u001a)\n\u0004List\u0012!\n\u0004list\u0018\u0001 \u0003(\u000b2\f.StockSymbolB\u0005\u0092?\u0002\u0018\u0004B#\n\u0014com.zh.wear.protobufB\u000bStockProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.StockProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = StockProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_Stock_descriptor = descriptor2;
        internal_static_Stock_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"StockInfo", "StockInfoList", "Symbol", "StockSymbolList", "Payload"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_StockInfo_descriptor = descriptor3;
        internal_static_StockInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Symbol", "Market", "Name", "LatestPrice", "PreClose", "Halted", "Timestamp", "DelayMintue"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_StockInfo_List_descriptor = descriptor4;
        internal_static_StockInfo_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(2);
        internal_static_StockSymbol_descriptor = descriptor5;
        internal_static_StockSymbol_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Symbol", "IsWidget", "Order"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_StockSymbol_List_descriptor = descriptor6;
        internal_static_StockSymbol_List_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{MessageLiteToString.f20028a});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
    }

    private StockProtos() {
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