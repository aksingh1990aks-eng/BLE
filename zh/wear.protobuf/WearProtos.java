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
import com.topstep.wearkit.base.utils.media.AbsMediaController;
import com.zh.wear.protobuf.AccountProtos;
import com.zh.wear.protobuf.AivsProtos;
import com.zh.wear.protobuf.AlexaProtos;
import com.zh.wear.protobuf.CalendarProtos;
import com.zh.wear.protobuf.ClockProtos;
import com.zh.wear.protobuf.CommonProtos;
import com.zh.wear.protobuf.FactoryProtos;
import com.zh.wear.protobuf.FitnessProtos;
import com.zh.wear.protobuf.GnssProtos;
import com.zh.wear.protobuf.LpaProtos;
import com.zh.wear.protobuf.MarketProtos;
import com.zh.wear.protobuf.MediaProtos;
import com.zh.wear.protobuf.NfcProtos;
import com.zh.wear.protobuf.NotificationProtos;
import com.zh.wear.protobuf.StockProtos;
import com.zh.wear.protobuf.SystemProtos;
import com.zh.wear.protobuf.WatchFaceProtos;
import com.zh.wear.protobuf.WeatherProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class WearProtos {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_WearPacket_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WearPacket_fieldAccessorTable;

    /* JADX INFO: renamed from: com.zh.wear.protobuf.WearProtos$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase;

        static {
            int[] iArr = new int[WearPacket.PayloadCase.values().length];
            $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase = iArr;
            try {
                iArr[WearPacket.PayloadCase.ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.WATCH_FACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.NFC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.FITNESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.LPA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.WEATHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.STOCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.CALENDAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.FACTORY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.AIVS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.MARKET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.GNSS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.CLOCK.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.MEDIA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.ALEXA.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.ERROR_CODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[WearPacket.PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public static final class WearPacket extends GeneratedMessageV3 implements WearPacketOrBuilder {
        public static final int ACCOUNT_FIELD_NUMBER = 3;
        public static final int AIVS_FIELD_NUMBER = 16;
        public static final int ALEXA_FIELD_NUMBER = 21;
        public static final int CALENDAR_FIELD_NUMBER = 14;
        public static final int CLOCK_FIELD_NUMBER = 19;
        public static final int ERROR_CODE_FIELD_NUMBER = 100;
        public static final int FACTORY_FIELD_NUMBER = 15;
        public static final int FITNESS_FIELD_NUMBER = 10;
        public static final int GNSS_FIELD_NUMBER = 18;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int LPA_FIELD_NUMBER = 11;
        public static final int MARKET_FIELD_NUMBER = 17;
        public static final int MEDIA_FIELD_NUMBER = 20;
        public static final int NFC_FIELD_NUMBER = 7;
        public static final int NOTIFICATION_FIELD_NUMBER = 9;
        public static final int STOCK_FIELD_NUMBER = 13;
        public static final int SYSTEM_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int WATCH_FACE_FIELD_NUMBER = 6;
        public static final int WEATHER_FIELD_NUMBER = 12;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;
        private int type_;
        private static final WearPacket DEFAULT_INSTANCE = new WearPacket();

        @Deprecated
        public static final Parser<WearPacket> PARSER = new AbstractParser<WearPacket>() { // from class: com.zh.wear.protobuf.WearProtos.WearPacket.1
            @Override // com.google.protobuf.Parser
            public WearPacket parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new WearPacket(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WearPacketOrBuilder {
            private SingleFieldBuilderV3<AccountProtos.Account, AccountProtos.Account.Builder, AccountProtos.AccountOrBuilder> accountBuilder_;
            private SingleFieldBuilderV3<AivsProtos.Aivs, AivsProtos.Aivs.Builder, AivsProtos.AivsOrBuilder> aivsBuilder_;
            private SingleFieldBuilderV3<AlexaProtos.Alexa, AlexaProtos.Alexa.Builder, AlexaProtos.AlexaOrBuilder> alexaBuilder_;
            private int bitField0_;
            private SingleFieldBuilderV3<CalendarProtos.Calendar, CalendarProtos.Calendar.Builder, CalendarProtos.CalendarOrBuilder> calendarBuilder_;
            private SingleFieldBuilderV3<ClockProtos.Clock, ClockProtos.Clock.Builder, ClockProtos.ClockOrBuilder> clockBuilder_;
            private SingleFieldBuilderV3<FactoryProtos.Factory, FactoryProtos.Factory.Builder, FactoryProtos.FactoryOrBuilder> factoryBuilder_;
            private SingleFieldBuilderV3<FitnessProtos.Fitness, FitnessProtos.Fitness.Builder, FitnessProtos.FitnessOrBuilder> fitnessBuilder_;
            private SingleFieldBuilderV3<GnssProtos.Gnss, GnssProtos.Gnss.Builder, GnssProtos.GnssOrBuilder> gnssBuilder_;
            private int id_;
            private SingleFieldBuilderV3<LpaProtos.Lpa, LpaProtos.Lpa.Builder, LpaProtos.LpaOrBuilder> lpaBuilder_;
            private SingleFieldBuilderV3<MarketProtos.Market, MarketProtos.Market.Builder, MarketProtos.MarketOrBuilder> marketBuilder_;
            private SingleFieldBuilderV3<MediaProtos.Media, MediaProtos.Media.Builder, MediaProtos.MediaOrBuilder> mediaBuilder_;
            private SingleFieldBuilderV3<NfcProtos.Nfc, NfcProtos.Nfc.Builder, NfcProtos.NfcOrBuilder> nfcBuilder_;
            private SingleFieldBuilderV3<NotificationProtos.Notification, NotificationProtos.Notification.Builder, NotificationProtos.NotificationOrBuilder> notificationBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilderV3<StockProtos.Stock, StockProtos.Stock.Builder, StockProtos.StockOrBuilder> stockBuilder_;
            private SingleFieldBuilderV3<SystemProtos.System, SystemProtos.System.Builder, SystemProtos.SystemOrBuilder> systemBuilder_;
            private int type_;
            private SingleFieldBuilderV3<WatchFaceProtos.WatchFace, WatchFaceProtos.WatchFace.Builder, WatchFaceProtos.WatchFaceOrBuilder> watchFaceBuilder_;
            private SingleFieldBuilderV3<WeatherProtos.Weather, WeatherProtos.Weather.Builder, WeatherProtos.WeatherOrBuilder> weatherBuilder_;

            private Builder() {
                this.payloadCase_ = 0;
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            private SingleFieldBuilderV3<AccountProtos.Account, AccountProtos.Account.Builder, AccountProtos.AccountOrBuilder> getAccountFieldBuilder() {
                if (this.accountBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = AccountProtos.Account.getDefaultInstance();
                    }
                    this.accountBuilder_ = new SingleFieldBuilderV3<>((AccountProtos.Account) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.accountBuilder_;
            }

            private SingleFieldBuilderV3<AivsProtos.Aivs, AivsProtos.Aivs.Builder, AivsProtos.AivsOrBuilder> getAivsFieldBuilder() {
                if (this.aivsBuilder_ == null) {
                    if (this.payloadCase_ != 16) {
                        this.payload_ = AivsProtos.Aivs.getDefaultInstance();
                    }
                    this.aivsBuilder_ = new SingleFieldBuilderV3<>((AivsProtos.Aivs) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 16;
                onChanged();
                return this.aivsBuilder_;
            }

            private SingleFieldBuilderV3<AlexaProtos.Alexa, AlexaProtos.Alexa.Builder, AlexaProtos.AlexaOrBuilder> getAlexaFieldBuilder() {
                if (this.alexaBuilder_ == null) {
                    if (this.payloadCase_ != 21) {
                        this.payload_ = AlexaProtos.Alexa.getDefaultInstance();
                    }
                    this.alexaBuilder_ = new SingleFieldBuilderV3<>((AlexaProtos.Alexa) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 21;
                onChanged();
                return this.alexaBuilder_;
            }

            private SingleFieldBuilderV3<CalendarProtos.Calendar, CalendarProtos.Calendar.Builder, CalendarProtos.CalendarOrBuilder> getCalendarFieldBuilder() {
                if (this.calendarBuilder_ == null) {
                    if (this.payloadCase_ != 14) {
                        this.payload_ = CalendarProtos.Calendar.getDefaultInstance();
                    }
                    this.calendarBuilder_ = new SingleFieldBuilderV3<>((CalendarProtos.Calendar) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 14;
                onChanged();
                return this.calendarBuilder_;
            }

            private SingleFieldBuilderV3<ClockProtos.Clock, ClockProtos.Clock.Builder, ClockProtos.ClockOrBuilder> getClockFieldBuilder() {
                if (this.clockBuilder_ == null) {
                    if (this.payloadCase_ != 19) {
                        this.payload_ = ClockProtos.Clock.getDefaultInstance();
                    }
                    this.clockBuilder_ = new SingleFieldBuilderV3<>((ClockProtos.Clock) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 19;
                onChanged();
                return this.clockBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WearProtos.internal_static_WearPacket_descriptor;
            }

            private SingleFieldBuilderV3<FactoryProtos.Factory, FactoryProtos.Factory.Builder, FactoryProtos.FactoryOrBuilder> getFactoryFieldBuilder() {
                if (this.factoryBuilder_ == null) {
                    if (this.payloadCase_ != 15) {
                        this.payload_ = FactoryProtos.Factory.getDefaultInstance();
                    }
                    this.factoryBuilder_ = new SingleFieldBuilderV3<>((FactoryProtos.Factory) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 15;
                onChanged();
                return this.factoryBuilder_;
            }

            private SingleFieldBuilderV3<FitnessProtos.Fitness, FitnessProtos.Fitness.Builder, FitnessProtos.FitnessOrBuilder> getFitnessFieldBuilder() {
                if (this.fitnessBuilder_ == null) {
                    if (this.payloadCase_ != 10) {
                        this.payload_ = FitnessProtos.Fitness.getDefaultInstance();
                    }
                    this.fitnessBuilder_ = new SingleFieldBuilderV3<>((FitnessProtos.Fitness) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 10;
                onChanged();
                return this.fitnessBuilder_;
            }

            private SingleFieldBuilderV3<GnssProtos.Gnss, GnssProtos.Gnss.Builder, GnssProtos.GnssOrBuilder> getGnssFieldBuilder() {
                if (this.gnssBuilder_ == null) {
                    if (this.payloadCase_ != 18) {
                        this.payload_ = GnssProtos.Gnss.getDefaultInstance();
                    }
                    this.gnssBuilder_ = new SingleFieldBuilderV3<>((GnssProtos.Gnss) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 18;
                onChanged();
                return this.gnssBuilder_;
            }

            private SingleFieldBuilderV3<LpaProtos.Lpa, LpaProtos.Lpa.Builder, LpaProtos.LpaOrBuilder> getLpaFieldBuilder() {
                if (this.lpaBuilder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = LpaProtos.Lpa.getDefaultInstance();
                    }
                    this.lpaBuilder_ = new SingleFieldBuilderV3<>((LpaProtos.Lpa) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.lpaBuilder_;
            }

            private SingleFieldBuilderV3<MarketProtos.Market, MarketProtos.Market.Builder, MarketProtos.MarketOrBuilder> getMarketFieldBuilder() {
                if (this.marketBuilder_ == null) {
                    if (this.payloadCase_ != 17) {
                        this.payload_ = MarketProtos.Market.getDefaultInstance();
                    }
                    this.marketBuilder_ = new SingleFieldBuilderV3<>((MarketProtos.Market) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 17;
                onChanged();
                return this.marketBuilder_;
            }

            private SingleFieldBuilderV3<MediaProtos.Media, MediaProtos.Media.Builder, MediaProtos.MediaOrBuilder> getMediaFieldBuilder() {
                if (this.mediaBuilder_ == null) {
                    if (this.payloadCase_ != 20) {
                        this.payload_ = MediaProtos.Media.getDefaultInstance();
                    }
                    this.mediaBuilder_ = new SingleFieldBuilderV3<>((MediaProtos.Media) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 20;
                onChanged();
                return this.mediaBuilder_;
            }

            private SingleFieldBuilderV3<NfcProtos.Nfc, NfcProtos.Nfc.Builder, NfcProtos.NfcOrBuilder> getNfcFieldBuilder() {
                if (this.nfcBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = NfcProtos.Nfc.getDefaultInstance();
                    }
                    this.nfcBuilder_ = new SingleFieldBuilderV3<>((NfcProtos.Nfc) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.nfcBuilder_;
            }

            private SingleFieldBuilderV3<NotificationProtos.Notification, NotificationProtos.Notification.Builder, NotificationProtos.NotificationOrBuilder> getNotificationFieldBuilder() {
                if (this.notificationBuilder_ == null) {
                    if (this.payloadCase_ != 9) {
                        this.payload_ = NotificationProtos.Notification.getDefaultInstance();
                    }
                    this.notificationBuilder_ = new SingleFieldBuilderV3<>((NotificationProtos.Notification) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 9;
                onChanged();
                return this.notificationBuilder_;
            }

            private SingleFieldBuilderV3<StockProtos.Stock, StockProtos.Stock.Builder, StockProtos.StockOrBuilder> getStockFieldBuilder() {
                if (this.stockBuilder_ == null) {
                    if (this.payloadCase_ != 13) {
                        this.payload_ = StockProtos.Stock.getDefaultInstance();
                    }
                    this.stockBuilder_ = new SingleFieldBuilderV3<>((StockProtos.Stock) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 13;
                onChanged();
                return this.stockBuilder_;
            }

            private SingleFieldBuilderV3<SystemProtos.System, SystemProtos.System.Builder, SystemProtos.SystemOrBuilder> getSystemFieldBuilder() {
                if (this.systemBuilder_ == null) {
                    if (this.payloadCase_ != 4) {
                        this.payload_ = SystemProtos.System.getDefaultInstance();
                    }
                    this.systemBuilder_ = new SingleFieldBuilderV3<>((SystemProtos.System) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 4;
                onChanged();
                return this.systemBuilder_;
            }

            private SingleFieldBuilderV3<WatchFaceProtos.WatchFace, WatchFaceProtos.WatchFace.Builder, WatchFaceProtos.WatchFaceOrBuilder> getWatchFaceFieldBuilder() {
                if (this.watchFaceBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = WatchFaceProtos.WatchFace.getDefaultInstance();
                    }
                    this.watchFaceBuilder_ = new SingleFieldBuilderV3<>((WatchFaceProtos.WatchFace) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.watchFaceBuilder_;
            }

            private SingleFieldBuilderV3<WeatherProtos.Weather, WeatherProtos.Weather.Builder, WeatherProtos.WeatherOrBuilder> getWeatherFieldBuilder() {
                if (this.weatherBuilder_ == null) {
                    if (this.payloadCase_ != 12) {
                        this.payload_ = WeatherProtos.Weather.getDefaultInstance();
                    }
                    this.weatherBuilder_ = new SingleFieldBuilderV3<>((WeatherProtos.Weather) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 12;
                onChanged();
                return this.weatherBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessage.alwaysUseFieldBuilders;
            }

            public Builder clearAccount() {
                SingleFieldBuilderV3<AccountProtos.Account, AccountProtos.Account.Builder, AccountProtos.AccountOrBuilder> singleFieldBuilderV3 = this.accountBuilder_;
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

            public Builder clearAivs() {
                SingleFieldBuilderV3<AivsProtos.Aivs, AivsProtos.Aivs.Builder, AivsProtos.AivsOrBuilder> singleFieldBuilderV3 = this.aivsBuilder_;
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

            public Builder clearAlexa() {
                SingleFieldBuilderV3<AlexaProtos.Alexa, AlexaProtos.Alexa.Builder, AlexaProtos.AlexaOrBuilder> singleFieldBuilderV3 = this.alexaBuilder_;
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

            public Builder clearCalendar() {
                SingleFieldBuilderV3<CalendarProtos.Calendar, CalendarProtos.Calendar.Builder, CalendarProtos.CalendarOrBuilder> singleFieldBuilderV3 = this.calendarBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 14) {
                        this.payloadCase_ = 0;
                        this.payload_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.payloadCase_ == 14) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearClock() {
                SingleFieldBuilderV3<ClockProtos.Clock, ClockProtos.Clock.Builder, ClockProtos.ClockOrBuilder> singleFieldBuilderV3 = this.clockBuilder_;
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
                if (this.payloadCase_ == 100) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearFactory() {
                SingleFieldBuilderV3<FactoryProtos.Factory, FactoryProtos.Factory.Builder, FactoryProtos.FactoryOrBuilder> singleFieldBuilderV3 = this.factoryBuilder_;
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

            public Builder clearFitness() {
                SingleFieldBuilderV3<FitnessProtos.Fitness, FitnessProtos.Fitness.Builder, FitnessProtos.FitnessOrBuilder> singleFieldBuilderV3 = this.fitnessBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearGnss() {
                SingleFieldBuilderV3<GnssProtos.Gnss, GnssProtos.Gnss.Builder, GnssProtos.GnssOrBuilder> singleFieldBuilderV3 = this.gnssBuilder_;
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

            public Builder clearId() {
                this.bitField0_ &= -3;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLpa() {
                SingleFieldBuilderV3<LpaProtos.Lpa, LpaProtos.Lpa.Builder, LpaProtos.LpaOrBuilder> singleFieldBuilderV3 = this.lpaBuilder_;
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

            public Builder clearMarket() {
                SingleFieldBuilderV3<MarketProtos.Market, MarketProtos.Market.Builder, MarketProtos.MarketOrBuilder> singleFieldBuilderV3 = this.marketBuilder_;
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

            public Builder clearMedia() {
                SingleFieldBuilderV3<MediaProtos.Media, MediaProtos.Media.Builder, MediaProtos.MediaOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
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

            public Builder clearNfc() {
                SingleFieldBuilderV3<NfcProtos.Nfc, NfcProtos.Nfc.Builder, NfcProtos.NfcOrBuilder> singleFieldBuilderV3 = this.nfcBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearNotification() {
                SingleFieldBuilderV3<NotificationProtos.Notification, NotificationProtos.Notification.Builder, NotificationProtos.NotificationOrBuilder> singleFieldBuilderV3 = this.notificationBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearPayload() {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
                return this;
            }

            public Builder clearStock() {
                SingleFieldBuilderV3<StockProtos.Stock, StockProtos.Stock.Builder, StockProtos.StockOrBuilder> singleFieldBuilderV3 = this.stockBuilder_;
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

            public Builder clearSystem() {
                SingleFieldBuilderV3<SystemProtos.System, SystemProtos.System.Builder, SystemProtos.SystemOrBuilder> singleFieldBuilderV3 = this.systemBuilder_;
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

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWatchFace() {
                SingleFieldBuilderV3<WatchFaceProtos.WatchFace, WatchFaceProtos.WatchFace.Builder, WatchFaceProtos.WatchFaceOrBuilder> singleFieldBuilderV3 = this.watchFaceBuilder_;
                if (singleFieldBuilderV3 == null) {
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
                singleFieldBuilderV3.clear();
                return this;
            }

            public Builder clearWeather() {
                SingleFieldBuilderV3<WeatherProtos.Weather, WeatherProtos.Weather.Builder, WeatherProtos.WeatherOrBuilder> singleFieldBuilderV3 = this.weatherBuilder_;
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

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public AccountProtos.Account getAccount() {
                Object message;
                SingleFieldBuilderV3<AccountProtos.Account, AccountProtos.Account.Builder, AccountProtos.AccountOrBuilder> singleFieldBuilderV3 = this.accountBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 3) {
                        return AccountProtos.Account.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 3) {
                        return AccountProtos.Account.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (AccountProtos.Account) message;
            }

            public AccountProtos.Account.Builder getAccountBuilder() {
                return (AccountProtos.Account.Builder) getAccountFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public AccountProtos.AccountOrBuilder getAccountOrBuilder() {
                SingleFieldBuilderV3<AccountProtos.Account, AccountProtos.Account.Builder, AccountProtos.AccountOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilderV3 = this.accountBuilder_) == null) ? i7 == 3 ? (AccountProtos.Account) this.payload_ : AccountProtos.Account.getDefaultInstance() : (AccountProtos.AccountOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public AivsProtos.Aivs getAivs() {
                Object message;
                SingleFieldBuilderV3<AivsProtos.Aivs, AivsProtos.Aivs.Builder, AivsProtos.AivsOrBuilder> singleFieldBuilderV3 = this.aivsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 16) {
                        return AivsProtos.Aivs.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 16) {
                        return AivsProtos.Aivs.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (AivsProtos.Aivs) message;
            }

            public AivsProtos.Aivs.Builder getAivsBuilder() {
                return (AivsProtos.Aivs.Builder) getAivsFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public AivsProtos.AivsOrBuilder getAivsOrBuilder() {
                SingleFieldBuilderV3<AivsProtos.Aivs, AivsProtos.Aivs.Builder, AivsProtos.AivsOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 16 || (singleFieldBuilderV3 = this.aivsBuilder_) == null) ? i7 == 16 ? (AivsProtos.Aivs) this.payload_ : AivsProtos.Aivs.getDefaultInstance() : (AivsProtos.AivsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public AlexaProtos.Alexa getAlexa() {
                Object message;
                SingleFieldBuilderV3<AlexaProtos.Alexa, AlexaProtos.Alexa.Builder, AlexaProtos.AlexaOrBuilder> singleFieldBuilderV3 = this.alexaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 21) {
                        return AlexaProtos.Alexa.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 21) {
                        return AlexaProtos.Alexa.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (AlexaProtos.Alexa) message;
            }

            public AlexaProtos.Alexa.Builder getAlexaBuilder() {
                return (AlexaProtos.Alexa.Builder) getAlexaFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public AlexaProtos.AlexaOrBuilder getAlexaOrBuilder() {
                SingleFieldBuilderV3<AlexaProtos.Alexa, AlexaProtos.Alexa.Builder, AlexaProtos.AlexaOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 21 || (singleFieldBuilderV3 = this.alexaBuilder_) == null) ? i7 == 21 ? (AlexaProtos.Alexa) this.payload_ : AlexaProtos.Alexa.getDefaultInstance() : (AlexaProtos.AlexaOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public CalendarProtos.Calendar getCalendar() {
                Object message;
                SingleFieldBuilderV3<CalendarProtos.Calendar, CalendarProtos.Calendar.Builder, CalendarProtos.CalendarOrBuilder> singleFieldBuilderV3 = this.calendarBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 14) {
                        return CalendarProtos.Calendar.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 14) {
                        return CalendarProtos.Calendar.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (CalendarProtos.Calendar) message;
            }

            public CalendarProtos.Calendar.Builder getCalendarBuilder() {
                return (CalendarProtos.Calendar.Builder) getCalendarFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public CalendarProtos.CalendarOrBuilder getCalendarOrBuilder() {
                SingleFieldBuilderV3<CalendarProtos.Calendar, CalendarProtos.Calendar.Builder, CalendarProtos.CalendarOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 14 || (singleFieldBuilderV3 = this.calendarBuilder_) == null) ? i7 == 14 ? (CalendarProtos.Calendar) this.payload_ : CalendarProtos.Calendar.getDefaultInstance() : (CalendarProtos.CalendarOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public ClockProtos.Clock getClock() {
                Object message;
                SingleFieldBuilderV3<ClockProtos.Clock, ClockProtos.Clock.Builder, ClockProtos.ClockOrBuilder> singleFieldBuilderV3 = this.clockBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 19) {
                        return ClockProtos.Clock.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 19) {
                        return ClockProtos.Clock.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (ClockProtos.Clock) message;
            }

            public ClockProtos.Clock.Builder getClockBuilder() {
                return (ClockProtos.Clock.Builder) getClockFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public ClockProtos.ClockOrBuilder getClockOrBuilder() {
                SingleFieldBuilderV3<ClockProtos.Clock, ClockProtos.Clock.Builder, ClockProtos.ClockOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 19 || (singleFieldBuilderV3 = this.clockBuilder_) == null) ? i7 == 19 ? (ClockProtos.Clock) this.payload_ : ClockProtos.Clock.getDefaultInstance() : (ClockProtos.ClockOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WearProtos.internal_static_WearPacket_descriptor;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public CommonProtos.ErrorCode getErrorCode() {
                CommonProtos.ErrorCode errorCodeValueOf;
                return (this.payloadCase_ != 100 || (errorCodeValueOf = CommonProtos.ErrorCode.valueOf(((Integer) this.payload_).intValue())) == null) ? CommonProtos.ErrorCode.NO_ERROR : errorCodeValueOf;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public FactoryProtos.Factory getFactory() {
                Object message;
                SingleFieldBuilderV3<FactoryProtos.Factory, FactoryProtos.Factory.Builder, FactoryProtos.FactoryOrBuilder> singleFieldBuilderV3 = this.factoryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 15) {
                        return FactoryProtos.Factory.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 15) {
                        return FactoryProtos.Factory.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (FactoryProtos.Factory) message;
            }

            public FactoryProtos.Factory.Builder getFactoryBuilder() {
                return (FactoryProtos.Factory.Builder) getFactoryFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public FactoryProtos.FactoryOrBuilder getFactoryOrBuilder() {
                SingleFieldBuilderV3<FactoryProtos.Factory, FactoryProtos.Factory.Builder, FactoryProtos.FactoryOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 15 || (singleFieldBuilderV3 = this.factoryBuilder_) == null) ? i7 == 15 ? (FactoryProtos.Factory) this.payload_ : FactoryProtos.Factory.getDefaultInstance() : (FactoryProtos.FactoryOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public FitnessProtos.Fitness getFitness() {
                Object message;
                SingleFieldBuilderV3<FitnessProtos.Fitness, FitnessProtos.Fitness.Builder, FitnessProtos.FitnessOrBuilder> singleFieldBuilderV3 = this.fitnessBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 10) {
                        return FitnessProtos.Fitness.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 10) {
                        return FitnessProtos.Fitness.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (FitnessProtos.Fitness) message;
            }

            public FitnessProtos.Fitness.Builder getFitnessBuilder() {
                return (FitnessProtos.Fitness.Builder) getFitnessFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public FitnessProtos.FitnessOrBuilder getFitnessOrBuilder() {
                SingleFieldBuilderV3<FitnessProtos.Fitness, FitnessProtos.Fitness.Builder, FitnessProtos.FitnessOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 10 || (singleFieldBuilderV3 = this.fitnessBuilder_) == null) ? i7 == 10 ? (FitnessProtos.Fitness) this.payload_ : FitnessProtos.Fitness.getDefaultInstance() : (FitnessProtos.FitnessOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public GnssProtos.Gnss getGnss() {
                Object message;
                SingleFieldBuilderV3<GnssProtos.Gnss, GnssProtos.Gnss.Builder, GnssProtos.GnssOrBuilder> singleFieldBuilderV3 = this.gnssBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 18) {
                        return GnssProtos.Gnss.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 18) {
                        return GnssProtos.Gnss.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (GnssProtos.Gnss) message;
            }

            public GnssProtos.Gnss.Builder getGnssBuilder() {
                return (GnssProtos.Gnss.Builder) getGnssFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public GnssProtos.GnssOrBuilder getGnssOrBuilder() {
                SingleFieldBuilderV3<GnssProtos.Gnss, GnssProtos.Gnss.Builder, GnssProtos.GnssOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 18 || (singleFieldBuilderV3 = this.gnssBuilder_) == null) ? i7 == 18 ? (GnssProtos.Gnss) this.payload_ : GnssProtos.Gnss.getDefaultInstance() : (GnssProtos.GnssOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public LpaProtos.Lpa getLpa() {
                Object message;
                SingleFieldBuilderV3<LpaProtos.Lpa, LpaProtos.Lpa.Builder, LpaProtos.LpaOrBuilder> singleFieldBuilderV3 = this.lpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 11) {
                        return LpaProtos.Lpa.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 11) {
                        return LpaProtos.Lpa.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (LpaProtos.Lpa) message;
            }

            public LpaProtos.Lpa.Builder getLpaBuilder() {
                return (LpaProtos.Lpa.Builder) getLpaFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public LpaProtos.LpaOrBuilder getLpaOrBuilder() {
                SingleFieldBuilderV3<LpaProtos.Lpa, LpaProtos.Lpa.Builder, LpaProtos.LpaOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilderV3 = this.lpaBuilder_) == null) ? i7 == 11 ? (LpaProtos.Lpa) this.payload_ : LpaProtos.Lpa.getDefaultInstance() : (LpaProtos.LpaOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public MarketProtos.Market getMarket() {
                Object message;
                SingleFieldBuilderV3<MarketProtos.Market, MarketProtos.Market.Builder, MarketProtos.MarketOrBuilder> singleFieldBuilderV3 = this.marketBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 17) {
                        return MarketProtos.Market.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 17) {
                        return MarketProtos.Market.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (MarketProtos.Market) message;
            }

            public MarketProtos.Market.Builder getMarketBuilder() {
                return (MarketProtos.Market.Builder) getMarketFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public MarketProtos.MarketOrBuilder getMarketOrBuilder() {
                SingleFieldBuilderV3<MarketProtos.Market, MarketProtos.Market.Builder, MarketProtos.MarketOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 17 || (singleFieldBuilderV3 = this.marketBuilder_) == null) ? i7 == 17 ? (MarketProtos.Market) this.payload_ : MarketProtos.Market.getDefaultInstance() : (MarketProtos.MarketOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public MediaProtos.Media getMedia() {
                Object message;
                SingleFieldBuilderV3<MediaProtos.Media, MediaProtos.Media.Builder, MediaProtos.MediaOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 20) {
                        return MediaProtos.Media.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 20) {
                        return MediaProtos.Media.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (MediaProtos.Media) message;
            }

            public MediaProtos.Media.Builder getMediaBuilder() {
                return (MediaProtos.Media.Builder) getMediaFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public MediaProtos.MediaOrBuilder getMediaOrBuilder() {
                SingleFieldBuilderV3<MediaProtos.Media, MediaProtos.Media.Builder, MediaProtos.MediaOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 20 || (singleFieldBuilderV3 = this.mediaBuilder_) == null) ? i7 == 20 ? (MediaProtos.Media) this.payload_ : MediaProtos.Media.getDefaultInstance() : (MediaProtos.MediaOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public NfcProtos.Nfc getNfc() {
                Object message;
                SingleFieldBuilderV3<NfcProtos.Nfc, NfcProtos.Nfc.Builder, NfcProtos.NfcOrBuilder> singleFieldBuilderV3 = this.nfcBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 7) {
                        return NfcProtos.Nfc.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 7) {
                        return NfcProtos.Nfc.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (NfcProtos.Nfc) message;
            }

            public NfcProtos.Nfc.Builder getNfcBuilder() {
                return (NfcProtos.Nfc.Builder) getNfcFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public NfcProtos.NfcOrBuilder getNfcOrBuilder() {
                SingleFieldBuilderV3<NfcProtos.Nfc, NfcProtos.Nfc.Builder, NfcProtos.NfcOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilderV3 = this.nfcBuilder_) == null) ? i7 == 7 ? (NfcProtos.Nfc) this.payload_ : NfcProtos.Nfc.getDefaultInstance() : (NfcProtos.NfcOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public NotificationProtos.Notification getNotification() {
                Object message;
                SingleFieldBuilderV3<NotificationProtos.Notification, NotificationProtos.Notification.Builder, NotificationProtos.NotificationOrBuilder> singleFieldBuilderV3 = this.notificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 9) {
                        return NotificationProtos.Notification.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 9) {
                        return NotificationProtos.Notification.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (NotificationProtos.Notification) message;
            }

            public NotificationProtos.Notification.Builder getNotificationBuilder() {
                return (NotificationProtos.Notification.Builder) getNotificationFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public NotificationProtos.NotificationOrBuilder getNotificationOrBuilder() {
                SingleFieldBuilderV3<NotificationProtos.Notification, NotificationProtos.Notification.Builder, NotificationProtos.NotificationOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilderV3 = this.notificationBuilder_) == null) ? i7 == 9 ? (NotificationProtos.Notification) this.payload_ : NotificationProtos.Notification.getDefaultInstance() : (NotificationProtos.NotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public StockProtos.Stock getStock() {
                Object message;
                SingleFieldBuilderV3<StockProtos.Stock, StockProtos.Stock.Builder, StockProtos.StockOrBuilder> singleFieldBuilderV3 = this.stockBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 13) {
                        return StockProtos.Stock.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 13) {
                        return StockProtos.Stock.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (StockProtos.Stock) message;
            }

            public StockProtos.Stock.Builder getStockBuilder() {
                return (StockProtos.Stock.Builder) getStockFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public StockProtos.StockOrBuilder getStockOrBuilder() {
                SingleFieldBuilderV3<StockProtos.Stock, StockProtos.Stock.Builder, StockProtos.StockOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 13 || (singleFieldBuilderV3 = this.stockBuilder_) == null) ? i7 == 13 ? (StockProtos.Stock) this.payload_ : StockProtos.Stock.getDefaultInstance() : (StockProtos.StockOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public SystemProtos.System getSystem() {
                Object message;
                SingleFieldBuilderV3<SystemProtos.System, SystemProtos.System.Builder, SystemProtos.SystemOrBuilder> singleFieldBuilderV3 = this.systemBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 4) {
                        return SystemProtos.System.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 4) {
                        return SystemProtos.System.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (SystemProtos.System) message;
            }

            public SystemProtos.System.Builder getSystemBuilder() {
                return (SystemProtos.System.Builder) getSystemFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public SystemProtos.SystemOrBuilder getSystemOrBuilder() {
                SingleFieldBuilderV3<SystemProtos.System, SystemProtos.System.Builder, SystemProtos.SystemOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 4 || (singleFieldBuilderV3 = this.systemBuilder_) == null) ? i7 == 4 ? (SystemProtos.System) this.payload_ : SystemProtos.System.getDefaultInstance() : (SystemProtos.SystemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public Type getType() {
                Type typeValueOf = Type.valueOf(this.type_);
                return typeValueOf == null ? Type.OTHER : typeValueOf;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public WatchFaceProtos.WatchFace getWatchFace() {
                Object message;
                SingleFieldBuilderV3<WatchFaceProtos.WatchFace, WatchFaceProtos.WatchFace.Builder, WatchFaceProtos.WatchFaceOrBuilder> singleFieldBuilderV3 = this.watchFaceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 6) {
                        return WatchFaceProtos.WatchFace.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 6) {
                        return WatchFaceProtos.WatchFace.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (WatchFaceProtos.WatchFace) message;
            }

            public WatchFaceProtos.WatchFace.Builder getWatchFaceBuilder() {
                return (WatchFaceProtos.WatchFace.Builder) getWatchFaceFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public WatchFaceProtos.WatchFaceOrBuilder getWatchFaceOrBuilder() {
                SingleFieldBuilderV3<WatchFaceProtos.WatchFace, WatchFaceProtos.WatchFace.Builder, WatchFaceProtos.WatchFaceOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilderV3 = this.watchFaceBuilder_) == null) ? i7 == 6 ? (WatchFaceProtos.WatchFace) this.payload_ : WatchFaceProtos.WatchFace.getDefaultInstance() : (WatchFaceProtos.WatchFaceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public WeatherProtos.Weather getWeather() {
                Object message;
                SingleFieldBuilderV3<WeatherProtos.Weather, WeatherProtos.Weather.Builder, WeatherProtos.WeatherOrBuilder> singleFieldBuilderV3 = this.weatherBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ != 12) {
                        return WeatherProtos.Weather.getDefaultInstance();
                    }
                    message = this.payload_;
                } else {
                    if (this.payloadCase_ != 12) {
                        return WeatherProtos.Weather.getDefaultInstance();
                    }
                    message = singleFieldBuilderV3.getMessage();
                }
                return (WeatherProtos.Weather) message;
            }

            public WeatherProtos.Weather.Builder getWeatherBuilder() {
                return (WeatherProtos.Weather.Builder) getWeatherFieldBuilder().getBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public WeatherProtos.WeatherOrBuilder getWeatherOrBuilder() {
                SingleFieldBuilderV3<WeatherProtos.Weather, WeatherProtos.Weather.Builder, WeatherProtos.WeatherOrBuilder> singleFieldBuilderV3;
                int i7 = this.payloadCase_;
                return (i7 != 12 || (singleFieldBuilderV3 = this.weatherBuilder_) == null) ? i7 == 12 ? (WeatherProtos.Weather) this.payload_ : WeatherProtos.Weather.getDefaultInstance() : (WeatherProtos.WeatherOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasAccount() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasAivs() {
                return this.payloadCase_ == 16;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasAlexa() {
                return this.payloadCase_ == 21;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasCalendar() {
                return this.payloadCase_ == 14;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasClock() {
                return this.payloadCase_ == 19;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasErrorCode() {
                return this.payloadCase_ == 100;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasFactory() {
                return this.payloadCase_ == 15;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasFitness() {
                return this.payloadCase_ == 10;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasGnss() {
                return this.payloadCase_ == 18;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasLpa() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasMarket() {
                return this.payloadCase_ == 17;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasMedia() {
                return this.payloadCase_ == 20;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasNfc() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasNotification() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasStock() {
                return this.payloadCase_ == 13;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasSystem() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasWatchFace() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
            public boolean hasWeather() {
                return this.payloadCase_ == 12;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WearProtos.internal_static_WearPacket_fieldAccessorTable.ensureFieldAccessorsInitialized(WearPacket.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasType() || !hasId()) {
                    return false;
                }
                if (hasAccount() && !getAccount().isInitialized()) {
                    return false;
                }
                if (hasSystem() && !getSystem().isInitialized()) {
                    return false;
                }
                if (hasWatchFace() && !getWatchFace().isInitialized()) {
                    return false;
                }
                if (hasNfc() && !getNfc().isInitialized()) {
                    return false;
                }
                if (hasNotification() && !getNotification().isInitialized()) {
                    return false;
                }
                if (hasFitness() && !getFitness().isInitialized()) {
                    return false;
                }
                if (hasWeather() && !getWeather().isInitialized()) {
                    return false;
                }
                if (hasStock() && !getStock().isInitialized()) {
                    return false;
                }
                if (hasCalendar() && !getCalendar().isInitialized()) {
                    return false;
                }
                if (hasFactory() && !getFactory().isInitialized()) {
                    return false;
                }
                if (hasAivs() && !getAivs().isInitialized()) {
                    return false;
                }
                if (hasMarket() && !getMarket().isInitialized()) {
                    return false;
                }
                if (hasGnss() && !getGnss().isInitialized()) {
                    return false;
                }
                if (hasClock() && !getClock().isInitialized()) {
                    return false;
                }
                if (!hasMedia() || getMedia().isInitialized()) {
                    return !hasAlexa() || getAlexa().isInitialized();
                }
                return false;
            }

            public Builder mergeAccount(AccountProtos.Account account) {
                SingleFieldBuilderV3<AccountProtos.Account, AccountProtos.Account.Builder, AccountProtos.AccountOrBuilder> singleFieldBuilderV3 = this.accountBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 3 && this.payload_ != AccountProtos.Account.getDefaultInstance()) {
                        account = AccountProtos.Account.newBuilder((AccountProtos.Account) this.payload_).mergeFrom(account).buildPartial();
                    }
                    this.payload_ = account;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 3) {
                        singleFieldBuilderV3.mergeFrom(account);
                    }
                    this.accountBuilder_.setMessage(account);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeAivs(AivsProtos.Aivs aivs) {
                SingleFieldBuilderV3<AivsProtos.Aivs, AivsProtos.Aivs.Builder, AivsProtos.AivsOrBuilder> singleFieldBuilderV3 = this.aivsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 16 && this.payload_ != AivsProtos.Aivs.getDefaultInstance()) {
                        aivs = AivsProtos.Aivs.newBuilder((AivsProtos.Aivs) this.payload_).mergeFrom(aivs).buildPartial();
                    }
                    this.payload_ = aivs;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 16) {
                        singleFieldBuilderV3.mergeFrom(aivs);
                    }
                    this.aivsBuilder_.setMessage(aivs);
                }
                this.payloadCase_ = 16;
                return this;
            }

            public Builder mergeAlexa(AlexaProtos.Alexa alexa) {
                SingleFieldBuilderV3<AlexaProtos.Alexa, AlexaProtos.Alexa.Builder, AlexaProtos.AlexaOrBuilder> singleFieldBuilderV3 = this.alexaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 21 && this.payload_ != AlexaProtos.Alexa.getDefaultInstance()) {
                        alexa = AlexaProtos.Alexa.newBuilder((AlexaProtos.Alexa) this.payload_).mergeFrom(alexa).buildPartial();
                    }
                    this.payload_ = alexa;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 21) {
                        singleFieldBuilderV3.mergeFrom(alexa);
                    }
                    this.alexaBuilder_.setMessage(alexa);
                }
                this.payloadCase_ = 21;
                return this;
            }

            public Builder mergeCalendar(CalendarProtos.Calendar calendar) {
                SingleFieldBuilderV3<CalendarProtos.Calendar, CalendarProtos.Calendar.Builder, CalendarProtos.CalendarOrBuilder> singleFieldBuilderV3 = this.calendarBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 14 && this.payload_ != CalendarProtos.Calendar.getDefaultInstance()) {
                        calendar = CalendarProtos.Calendar.newBuilder((CalendarProtos.Calendar) this.payload_).mergeFrom(calendar).buildPartial();
                    }
                    this.payload_ = calendar;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 14) {
                        singleFieldBuilderV3.mergeFrom(calendar);
                    }
                    this.calendarBuilder_.setMessage(calendar);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder mergeClock(ClockProtos.Clock clock) {
                SingleFieldBuilderV3<ClockProtos.Clock, ClockProtos.Clock.Builder, ClockProtos.ClockOrBuilder> singleFieldBuilderV3 = this.clockBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 19 && this.payload_ != ClockProtos.Clock.getDefaultInstance()) {
                        clock = ClockProtos.Clock.newBuilder((ClockProtos.Clock) this.payload_).mergeFrom(clock).buildPartial();
                    }
                    this.payload_ = clock;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 19) {
                        singleFieldBuilderV3.mergeFrom(clock);
                    }
                    this.clockBuilder_.setMessage(clock);
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder mergeFactory(FactoryProtos.Factory factory) {
                SingleFieldBuilderV3<FactoryProtos.Factory, FactoryProtos.Factory.Builder, FactoryProtos.FactoryOrBuilder> singleFieldBuilderV3 = this.factoryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 15 && this.payload_ != FactoryProtos.Factory.getDefaultInstance()) {
                        factory = FactoryProtos.Factory.newBuilder((FactoryProtos.Factory) this.payload_).mergeFrom(factory).buildPartial();
                    }
                    this.payload_ = factory;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 15) {
                        singleFieldBuilderV3.mergeFrom(factory);
                    }
                    this.factoryBuilder_.setMessage(factory);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder mergeFitness(FitnessProtos.Fitness fitness) {
                SingleFieldBuilderV3<FitnessProtos.Fitness, FitnessProtos.Fitness.Builder, FitnessProtos.FitnessOrBuilder> singleFieldBuilderV3 = this.fitnessBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 10 && this.payload_ != FitnessProtos.Fitness.getDefaultInstance()) {
                        fitness = FitnessProtos.Fitness.newBuilder((FitnessProtos.Fitness) this.payload_).mergeFrom(fitness).buildPartial();
                    }
                    this.payload_ = fitness;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 10) {
                        singleFieldBuilderV3.mergeFrom(fitness);
                    }
                    this.fitnessBuilder_.setMessage(fitness);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder mergeGnss(GnssProtos.Gnss gnss) {
                SingleFieldBuilderV3<GnssProtos.Gnss, GnssProtos.Gnss.Builder, GnssProtos.GnssOrBuilder> singleFieldBuilderV3 = this.gnssBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 18 && this.payload_ != GnssProtos.Gnss.getDefaultInstance()) {
                        gnss = GnssProtos.Gnss.newBuilder((GnssProtos.Gnss) this.payload_).mergeFrom(gnss).buildPartial();
                    }
                    this.payload_ = gnss;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 18) {
                        singleFieldBuilderV3.mergeFrom(gnss);
                    }
                    this.gnssBuilder_.setMessage(gnss);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder mergeLpa(LpaProtos.Lpa lpa) {
                SingleFieldBuilderV3<LpaProtos.Lpa, LpaProtos.Lpa.Builder, LpaProtos.LpaOrBuilder> singleFieldBuilderV3 = this.lpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 11 && this.payload_ != LpaProtos.Lpa.getDefaultInstance()) {
                        lpa = LpaProtos.Lpa.newBuilder((LpaProtos.Lpa) this.payload_).mergeFrom(lpa).buildPartial();
                    }
                    this.payload_ = lpa;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 11) {
                        singleFieldBuilderV3.mergeFrom(lpa);
                    }
                    this.lpaBuilder_.setMessage(lpa);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder mergeMarket(MarketProtos.Market market) {
                SingleFieldBuilderV3<MarketProtos.Market, MarketProtos.Market.Builder, MarketProtos.MarketOrBuilder> singleFieldBuilderV3 = this.marketBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 17 && this.payload_ != MarketProtos.Market.getDefaultInstance()) {
                        market = MarketProtos.Market.newBuilder((MarketProtos.Market) this.payload_).mergeFrom(market).buildPartial();
                    }
                    this.payload_ = market;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 17) {
                        singleFieldBuilderV3.mergeFrom(market);
                    }
                    this.marketBuilder_.setMessage(market);
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder mergeMedia(MediaProtos.Media media) {
                SingleFieldBuilderV3<MediaProtos.Media, MediaProtos.Media.Builder, MediaProtos.MediaOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 20 && this.payload_ != MediaProtos.Media.getDefaultInstance()) {
                        media = MediaProtos.Media.newBuilder((MediaProtos.Media) this.payload_).mergeFrom(media).buildPartial();
                    }
                    this.payload_ = media;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 20) {
                        singleFieldBuilderV3.mergeFrom(media);
                    }
                    this.mediaBuilder_.setMessage(media);
                }
                this.payloadCase_ = 20;
                return this;
            }

            public Builder mergeNfc(NfcProtos.Nfc nfc) {
                SingleFieldBuilderV3<NfcProtos.Nfc, NfcProtos.Nfc.Builder, NfcProtos.NfcOrBuilder> singleFieldBuilderV3 = this.nfcBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 7 && this.payload_ != NfcProtos.Nfc.getDefaultInstance()) {
                        nfc = NfcProtos.Nfc.newBuilder((NfcProtos.Nfc) this.payload_).mergeFrom(nfc).buildPartial();
                    }
                    this.payload_ = nfc;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 7) {
                        singleFieldBuilderV3.mergeFrom(nfc);
                    }
                    this.nfcBuilder_.setMessage(nfc);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeNotification(NotificationProtos.Notification notification) {
                SingleFieldBuilderV3<NotificationProtos.Notification, NotificationProtos.Notification.Builder, NotificationProtos.NotificationOrBuilder> singleFieldBuilderV3 = this.notificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 9 && this.payload_ != NotificationProtos.Notification.getDefaultInstance()) {
                        notification = NotificationProtos.Notification.newBuilder((NotificationProtos.Notification) this.payload_).mergeFrom(notification).buildPartial();
                    }
                    this.payload_ = notification;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 9) {
                        singleFieldBuilderV3.mergeFrom(notification);
                    }
                    this.notificationBuilder_.setMessage(notification);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder mergeStock(StockProtos.Stock stock) {
                SingleFieldBuilderV3<StockProtos.Stock, StockProtos.Stock.Builder, StockProtos.StockOrBuilder> singleFieldBuilderV3 = this.stockBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 13 && this.payload_ != StockProtos.Stock.getDefaultInstance()) {
                        stock = StockProtos.Stock.newBuilder((StockProtos.Stock) this.payload_).mergeFrom(stock).buildPartial();
                    }
                    this.payload_ = stock;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 13) {
                        singleFieldBuilderV3.mergeFrom(stock);
                    }
                    this.stockBuilder_.setMessage(stock);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder mergeSystem(SystemProtos.System system) {
                SingleFieldBuilderV3<SystemProtos.System, SystemProtos.System.Builder, SystemProtos.SystemOrBuilder> singleFieldBuilderV3 = this.systemBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 4 && this.payload_ != SystemProtos.System.getDefaultInstance()) {
                        system = SystemProtos.System.newBuilder((SystemProtos.System) this.payload_).mergeFrom(system).buildPartial();
                    }
                    this.payload_ = system;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 4) {
                        singleFieldBuilderV3.mergeFrom(system);
                    }
                    this.systemBuilder_.setMessage(system);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder mergeWatchFace(WatchFaceProtos.WatchFace watchFace) {
                SingleFieldBuilderV3<WatchFaceProtos.WatchFace, WatchFaceProtos.WatchFace.Builder, WatchFaceProtos.WatchFaceOrBuilder> singleFieldBuilderV3 = this.watchFaceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 6 && this.payload_ != WatchFaceProtos.WatchFace.getDefaultInstance()) {
                        watchFace = WatchFaceProtos.WatchFace.newBuilder((WatchFaceProtos.WatchFace) this.payload_).mergeFrom(watchFace).buildPartial();
                    }
                    this.payload_ = watchFace;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 6) {
                        singleFieldBuilderV3.mergeFrom(watchFace);
                    }
                    this.watchFaceBuilder_.setMessage(watchFace);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeWeather(WeatherProtos.Weather weather) {
                SingleFieldBuilderV3<WeatherProtos.Weather, WeatherProtos.Weather.Builder, WeatherProtos.WeatherOrBuilder> singleFieldBuilderV3 = this.weatherBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.payloadCase_ == 12 && this.payload_ != WeatherProtos.Weather.getDefaultInstance()) {
                        weather = WeatherProtos.Weather.newBuilder((WeatherProtos.Weather) this.payload_).mergeFrom(weather).buildPartial();
                    }
                    this.payload_ = weather;
                    onChanged();
                } else {
                    if (this.payloadCase_ == 12) {
                        singleFieldBuilderV3.mergeFrom(weather);
                    }
                    this.weatherBuilder_.setMessage(weather);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setAccount(AccountProtos.Account.Builder builder) {
                SingleFieldBuilderV3<AccountProtos.Account, AccountProtos.Account.Builder, AccountProtos.AccountOrBuilder> singleFieldBuilderV3 = this.accountBuilder_;
                AccountProtos.Account accountBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = accountBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(accountBuild);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setAivs(AivsProtos.Aivs.Builder builder) {
                SingleFieldBuilderV3<AivsProtos.Aivs, AivsProtos.Aivs.Builder, AivsProtos.AivsOrBuilder> singleFieldBuilderV3 = this.aivsBuilder_;
                AivsProtos.Aivs aivsBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = aivsBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(aivsBuild);
                }
                this.payloadCase_ = 16;
                return this;
            }

            public Builder setAlexa(AlexaProtos.Alexa.Builder builder) {
                SingleFieldBuilderV3<AlexaProtos.Alexa, AlexaProtos.Alexa.Builder, AlexaProtos.AlexaOrBuilder> singleFieldBuilderV3 = this.alexaBuilder_;
                AlexaProtos.Alexa alexaBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = alexaBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexaBuild);
                }
                this.payloadCase_ = 21;
                return this;
            }

            public Builder setCalendar(CalendarProtos.Calendar.Builder builder) {
                SingleFieldBuilderV3<CalendarProtos.Calendar, CalendarProtos.Calendar.Builder, CalendarProtos.CalendarOrBuilder> singleFieldBuilderV3 = this.calendarBuilder_;
                CalendarProtos.Calendar calendarBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = calendarBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(calendarBuild);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setClock(ClockProtos.Clock.Builder builder) {
                SingleFieldBuilderV3<ClockProtos.Clock, ClockProtos.Clock.Builder, ClockProtos.ClockOrBuilder> singleFieldBuilderV3 = this.clockBuilder_;
                ClockProtos.Clock clockBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = clockBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(clockBuild);
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder setErrorCode(CommonProtos.ErrorCode errorCode) {
                errorCode.getClass();
                this.payloadCase_ = 100;
                this.payload_ = Integer.valueOf(errorCode.getNumber());
                onChanged();
                return this;
            }

            public Builder setFactory(FactoryProtos.Factory.Builder builder) {
                SingleFieldBuilderV3<FactoryProtos.Factory, FactoryProtos.Factory.Builder, FactoryProtos.FactoryOrBuilder> singleFieldBuilderV3 = this.factoryBuilder_;
                FactoryProtos.Factory factoryBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = factoryBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(factoryBuild);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setFitness(FitnessProtos.Fitness.Builder builder) {
                SingleFieldBuilderV3<FitnessProtos.Fitness, FitnessProtos.Fitness.Builder, FitnessProtos.FitnessOrBuilder> singleFieldBuilderV3 = this.fitnessBuilder_;
                FitnessProtos.Fitness fitnessBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = fitnessBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(fitnessBuild);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setGnss(GnssProtos.Gnss.Builder builder) {
                SingleFieldBuilderV3<GnssProtos.Gnss, GnssProtos.Gnss.Builder, GnssProtos.GnssOrBuilder> singleFieldBuilderV3 = this.gnssBuilder_;
                GnssProtos.Gnss gnssBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = gnssBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(gnssBuild);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder setId(int i7) {
                this.bitField0_ |= 2;
                this.id_ = i7;
                onChanged();
                return this;
            }

            public Builder setLpa(LpaProtos.Lpa.Builder builder) {
                SingleFieldBuilderV3<LpaProtos.Lpa, LpaProtos.Lpa.Builder, LpaProtos.LpaOrBuilder> singleFieldBuilderV3 = this.lpaBuilder_;
                LpaProtos.Lpa lpaBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = lpaBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(lpaBuild);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setMarket(MarketProtos.Market.Builder builder) {
                SingleFieldBuilderV3<MarketProtos.Market, MarketProtos.Market.Builder, MarketProtos.MarketOrBuilder> singleFieldBuilderV3 = this.marketBuilder_;
                MarketProtos.Market marketBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = marketBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(marketBuild);
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder setMedia(MediaProtos.Media.Builder builder) {
                SingleFieldBuilderV3<MediaProtos.Media, MediaProtos.Media.Builder, MediaProtos.MediaOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                MediaProtos.Media mediaBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = mediaBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(mediaBuild);
                }
                this.payloadCase_ = 20;
                return this;
            }

            public Builder setNfc(NfcProtos.Nfc.Builder builder) {
                SingleFieldBuilderV3<NfcProtos.Nfc, NfcProtos.Nfc.Builder, NfcProtos.NfcOrBuilder> singleFieldBuilderV3 = this.nfcBuilder_;
                NfcProtos.Nfc nfcBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = nfcBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(nfcBuild);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setNotification(NotificationProtos.Notification.Builder builder) {
                SingleFieldBuilderV3<NotificationProtos.Notification, NotificationProtos.Notification.Builder, NotificationProtos.NotificationOrBuilder> singleFieldBuilderV3 = this.notificationBuilder_;
                NotificationProtos.Notification notificationBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = notificationBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(notificationBuild);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setStock(StockProtos.Stock.Builder builder) {
                SingleFieldBuilderV3<StockProtos.Stock, StockProtos.Stock.Builder, StockProtos.StockOrBuilder> singleFieldBuilderV3 = this.stockBuilder_;
                StockProtos.Stock stockBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = stockBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stockBuild);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setSystem(SystemProtos.System.Builder builder) {
                SingleFieldBuilderV3<SystemProtos.System, SystemProtos.System.Builder, SystemProtos.SystemOrBuilder> singleFieldBuilderV3 = this.systemBuilder_;
                SystemProtos.System systemBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = systemBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(systemBuild);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 1;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            public Builder setWatchFace(WatchFaceProtos.WatchFace.Builder builder) {
                SingleFieldBuilderV3<WatchFaceProtos.WatchFace, WatchFaceProtos.WatchFace.Builder, WatchFaceProtos.WatchFaceOrBuilder> singleFieldBuilderV3 = this.watchFaceBuilder_;
                WatchFaceProtos.WatchFace watchFaceBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = watchFaceBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(watchFaceBuild);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setWeather(WeatherProtos.Weather.Builder builder) {
                SingleFieldBuilderV3<WeatherProtos.Weather, WeatherProtos.Weather.Builder, WeatherProtos.WeatherOrBuilder> singleFieldBuilderV3 = this.weatherBuilder_;
                WeatherProtos.Weather weatherBuild = builder.build();
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = weatherBuild;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weatherBuild);
                }
                this.payloadCase_ = 12;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setAccount(AccountProtos.Account account) {
                SingleFieldBuilderV3<AccountProtos.Account, AccountProtos.Account.Builder, AccountProtos.AccountOrBuilder> singleFieldBuilderV3 = this.accountBuilder_;
                if (singleFieldBuilderV3 == null) {
                    account.getClass();
                    this.payload_ = account;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(account);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setAivs(AivsProtos.Aivs aivs) {
                SingleFieldBuilderV3<AivsProtos.Aivs, AivsProtos.Aivs.Builder, AivsProtos.AivsOrBuilder> singleFieldBuilderV3 = this.aivsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    aivs.getClass();
                    this.payload_ = aivs;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(aivs);
                }
                this.payloadCase_ = 16;
                return this;
            }

            public Builder setAlexa(AlexaProtos.Alexa alexa) {
                SingleFieldBuilderV3<AlexaProtos.Alexa, AlexaProtos.Alexa.Builder, AlexaProtos.AlexaOrBuilder> singleFieldBuilderV3 = this.alexaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alexa.getClass();
                    this.payload_ = alexa;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(alexa);
                }
                this.payloadCase_ = 21;
                return this;
            }

            public Builder setCalendar(CalendarProtos.Calendar calendar) {
                SingleFieldBuilderV3<CalendarProtos.Calendar, CalendarProtos.Calendar.Builder, CalendarProtos.CalendarOrBuilder> singleFieldBuilderV3 = this.calendarBuilder_;
                if (singleFieldBuilderV3 == null) {
                    calendar.getClass();
                    this.payload_ = calendar;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(calendar);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setClock(ClockProtos.Clock clock) {
                SingleFieldBuilderV3<ClockProtos.Clock, ClockProtos.Clock.Builder, ClockProtos.ClockOrBuilder> singleFieldBuilderV3 = this.clockBuilder_;
                if (singleFieldBuilderV3 == null) {
                    clock.getClass();
                    this.payload_ = clock;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(clock);
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder setFactory(FactoryProtos.Factory factory) {
                SingleFieldBuilderV3<FactoryProtos.Factory, FactoryProtos.Factory.Builder, FactoryProtos.FactoryOrBuilder> singleFieldBuilderV3 = this.factoryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    factory.getClass();
                    this.payload_ = factory;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(factory);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setFitness(FitnessProtos.Fitness fitness) {
                SingleFieldBuilderV3<FitnessProtos.Fitness, FitnessProtos.Fitness.Builder, FitnessProtos.FitnessOrBuilder> singleFieldBuilderV3 = this.fitnessBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitness.getClass();
                    this.payload_ = fitness;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(fitness);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setGnss(GnssProtos.Gnss gnss) {
                SingleFieldBuilderV3<GnssProtos.Gnss, GnssProtos.Gnss.Builder, GnssProtos.GnssOrBuilder> singleFieldBuilderV3 = this.gnssBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gnss.getClass();
                    this.payload_ = gnss;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(gnss);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder setLpa(LpaProtos.Lpa lpa) {
                SingleFieldBuilderV3<LpaProtos.Lpa, LpaProtos.Lpa.Builder, LpaProtos.LpaOrBuilder> singleFieldBuilderV3 = this.lpaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lpa.getClass();
                    this.payload_ = lpa;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(lpa);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setMarket(MarketProtos.Market market) {
                SingleFieldBuilderV3<MarketProtos.Market, MarketProtos.Market.Builder, MarketProtos.MarketOrBuilder> singleFieldBuilderV3 = this.marketBuilder_;
                if (singleFieldBuilderV3 == null) {
                    market.getClass();
                    this.payload_ = market;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(market);
                }
                this.payloadCase_ = 17;
                return this;
            }

            public Builder setMedia(MediaProtos.Media media) {
                SingleFieldBuilderV3<MediaProtos.Media, MediaProtos.Media.Builder, MediaProtos.MediaOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    media.getClass();
                    this.payload_ = media;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(media);
                }
                this.payloadCase_ = 20;
                return this;
            }

            public Builder setNfc(NfcProtos.Nfc nfc) {
                SingleFieldBuilderV3<NfcProtos.Nfc, NfcProtos.Nfc.Builder, NfcProtos.NfcOrBuilder> singleFieldBuilderV3 = this.nfcBuilder_;
                if (singleFieldBuilderV3 == null) {
                    nfc.getClass();
                    this.payload_ = nfc;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(nfc);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setNotification(NotificationProtos.Notification notification) {
                SingleFieldBuilderV3<NotificationProtos.Notification, NotificationProtos.Notification.Builder, NotificationProtos.NotificationOrBuilder> singleFieldBuilderV3 = this.notificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    notification.getClass();
                    this.payload_ = notification;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(notification);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setStock(StockProtos.Stock stock) {
                SingleFieldBuilderV3<StockProtos.Stock, StockProtos.Stock.Builder, StockProtos.StockOrBuilder> singleFieldBuilderV3 = this.stockBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stock.getClass();
                    this.payload_ = stock;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(stock);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setSystem(SystemProtos.System system) {
                SingleFieldBuilderV3<SystemProtos.System, SystemProtos.System.Builder, SystemProtos.SystemOrBuilder> singleFieldBuilderV3 = this.systemBuilder_;
                if (singleFieldBuilderV3 == null) {
                    system.getClass();
                    this.payload_ = system;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(system);
                }
                this.payloadCase_ = 4;
                return this;
            }

            public Builder setWatchFace(WatchFaceProtos.WatchFace watchFace) {
                SingleFieldBuilderV3<WatchFaceProtos.WatchFace, WatchFaceProtos.WatchFace.Builder, WatchFaceProtos.WatchFaceOrBuilder> singleFieldBuilderV3 = this.watchFaceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    watchFace.getClass();
                    this.payload_ = watchFace;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(watchFace);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setWeather(WeatherProtos.Weather weather) {
                SingleFieldBuilderV3<WeatherProtos.Weather, WeatherProtos.Weather.Builder, WeatherProtos.WeatherOrBuilder> singleFieldBuilderV3 = this.weatherBuilder_;
                if (singleFieldBuilderV3 == null) {
                    weather.getClass();
                    this.payload_ = weather;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(weather);
                }
                this.payloadCase_ = 12;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WearPacket build() {
                WearPacket wearPacketBuildPartial = buildPartial();
                if (wearPacketBuildPartial.isInitialized()) {
                    return wearPacketBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wearPacketBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WearPacket buildPartial() {
                WearPacket wearPacket = new WearPacket(this);
                int i7 = this.bitField0_;
                int i8 = (i7 & 1) != 1 ? 0 : 1;
                wearPacket.type_ = this.type_;
                if ((i7 & 2) == 2) {
                    i8 |= 2;
                }
                wearPacket.id_ = this.id_;
                if (this.payloadCase_ == 3) {
                    SingleFieldBuilderV3<AccountProtos.Account, AccountProtos.Account.Builder, AccountProtos.AccountOrBuilder> singleFieldBuilderV3 = this.accountBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV3 == null ? this.payload_ : singleFieldBuilderV3.build();
                }
                if (this.payloadCase_ == 4) {
                    SingleFieldBuilderV3<SystemProtos.System, SystemProtos.System.Builder, SystemProtos.SystemOrBuilder> singleFieldBuilderV32 = this.systemBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV32 == null ? this.payload_ : singleFieldBuilderV32.build();
                }
                if (this.payloadCase_ == 6) {
                    SingleFieldBuilderV3<WatchFaceProtos.WatchFace, WatchFaceProtos.WatchFace.Builder, WatchFaceProtos.WatchFaceOrBuilder> singleFieldBuilderV33 = this.watchFaceBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV33 == null ? this.payload_ : singleFieldBuilderV33.build();
                }
                if (this.payloadCase_ == 7) {
                    SingleFieldBuilderV3<NfcProtos.Nfc, NfcProtos.Nfc.Builder, NfcProtos.NfcOrBuilder> singleFieldBuilderV34 = this.nfcBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV34 == null ? this.payload_ : singleFieldBuilderV34.build();
                }
                if (this.payloadCase_ == 9) {
                    SingleFieldBuilderV3<NotificationProtos.Notification, NotificationProtos.Notification.Builder, NotificationProtos.NotificationOrBuilder> singleFieldBuilderV35 = this.notificationBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV35 == null ? this.payload_ : singleFieldBuilderV35.build();
                }
                if (this.payloadCase_ == 10) {
                    SingleFieldBuilderV3<FitnessProtos.Fitness, FitnessProtos.Fitness.Builder, FitnessProtos.FitnessOrBuilder> singleFieldBuilderV36 = this.fitnessBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV36 == null ? this.payload_ : singleFieldBuilderV36.build();
                }
                if (this.payloadCase_ == 11) {
                    SingleFieldBuilderV3<LpaProtos.Lpa, LpaProtos.Lpa.Builder, LpaProtos.LpaOrBuilder> singleFieldBuilderV37 = this.lpaBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV37 == null ? this.payload_ : singleFieldBuilderV37.build();
                }
                if (this.payloadCase_ == 12) {
                    SingleFieldBuilderV3<WeatherProtos.Weather, WeatherProtos.Weather.Builder, WeatherProtos.WeatherOrBuilder> singleFieldBuilderV38 = this.weatherBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV38 == null ? this.payload_ : singleFieldBuilderV38.build();
                }
                if (this.payloadCase_ == 13) {
                    SingleFieldBuilderV3<StockProtos.Stock, StockProtos.Stock.Builder, StockProtos.StockOrBuilder> singleFieldBuilderV39 = this.stockBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV39 == null ? this.payload_ : singleFieldBuilderV39.build();
                }
                if (this.payloadCase_ == 14) {
                    SingleFieldBuilderV3<CalendarProtos.Calendar, CalendarProtos.Calendar.Builder, CalendarProtos.CalendarOrBuilder> singleFieldBuilderV310 = this.calendarBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV310 == null ? this.payload_ : singleFieldBuilderV310.build();
                }
                if (this.payloadCase_ == 15) {
                    SingleFieldBuilderV3<FactoryProtos.Factory, FactoryProtos.Factory.Builder, FactoryProtos.FactoryOrBuilder> singleFieldBuilderV311 = this.factoryBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV311 == null ? this.payload_ : singleFieldBuilderV311.build();
                }
                if (this.payloadCase_ == 16) {
                    SingleFieldBuilderV3<AivsProtos.Aivs, AivsProtos.Aivs.Builder, AivsProtos.AivsOrBuilder> singleFieldBuilderV312 = this.aivsBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV312 == null ? this.payload_ : singleFieldBuilderV312.build();
                }
                if (this.payloadCase_ == 17) {
                    SingleFieldBuilderV3<MarketProtos.Market, MarketProtos.Market.Builder, MarketProtos.MarketOrBuilder> singleFieldBuilderV313 = this.marketBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV313 == null ? this.payload_ : singleFieldBuilderV313.build();
                }
                if (this.payloadCase_ == 18) {
                    SingleFieldBuilderV3<GnssProtos.Gnss, GnssProtos.Gnss.Builder, GnssProtos.GnssOrBuilder> singleFieldBuilderV314 = this.gnssBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV314 == null ? this.payload_ : singleFieldBuilderV314.build();
                }
                if (this.payloadCase_ == 19) {
                    SingleFieldBuilderV3<ClockProtos.Clock, ClockProtos.Clock.Builder, ClockProtos.ClockOrBuilder> singleFieldBuilderV315 = this.clockBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV315 == null ? this.payload_ : singleFieldBuilderV315.build();
                }
                if (this.payloadCase_ == 20) {
                    SingleFieldBuilderV3<MediaProtos.Media, MediaProtos.Media.Builder, MediaProtos.MediaOrBuilder> singleFieldBuilderV316 = this.mediaBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV316 == null ? this.payload_ : singleFieldBuilderV316.build();
                }
                if (this.payloadCase_ == 21) {
                    SingleFieldBuilderV3<AlexaProtos.Alexa, AlexaProtos.Alexa.Builder, AlexaProtos.AlexaOrBuilder> singleFieldBuilderV317 = this.alexaBuilder_;
                    wearPacket.payload_ = singleFieldBuilderV317 == null ? this.payload_ : singleFieldBuilderV317.build();
                }
                if (this.payloadCase_ == 100) {
                    wearPacket.payload_ = this.payload_;
                }
                wearPacket.bitField0_ = i8;
                wearPacket.payloadCase_ = this.payloadCase_;
                onBuilt();
                return wearPacket;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WearPacket getDefaultInstanceForType() {
                return WearPacket.getDefaultInstance();
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
                this.type_ = 0;
                int i7 = this.bitField0_;
                this.id_ = 0;
                this.bitField0_ = i7 & (-4);
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
            public com.zh.wear.protobuf.WearProtos.WearPacket.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser<com.zh.wear.protobuf.WearProtos$WearPacket> r1 = com.zh.wear.protobuf.WearProtos.WearPacket.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.zh.wear.protobuf.WearProtos$WearPacket r3 = (com.zh.wear.protobuf.WearProtos.WearPacket) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
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
                    com.zh.wear.protobuf.WearProtos$WearPacket r4 = (com.zh.wear.protobuf.WearProtos.WearPacket) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WearProtos.WearPacket.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zh.wear.protobuf.WearProtos$WearPacket$Builder");
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WearPacket) {
                    return mergeFrom((WearPacket) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WearPacket wearPacket) {
                if (wearPacket == WearPacket.getDefaultInstance()) {
                    return this;
                }
                if (wearPacket.hasType()) {
                    setType(wearPacket.getType());
                }
                if (wearPacket.hasId()) {
                    setId(wearPacket.getId());
                }
                switch (AnonymousClass2.$SwitchMap$com$zh$wear$protobuf$WearProtos$WearPacket$PayloadCase[wearPacket.getPayloadCase().ordinal()]) {
                    case 1:
                        mergeAccount(wearPacket.getAccount());
                        break;
                    case 2:
                        mergeSystem(wearPacket.getSystem());
                        break;
                    case 3:
                        mergeWatchFace(wearPacket.getWatchFace());
                        break;
                    case 4:
                        mergeNfc(wearPacket.getNfc());
                        break;
                    case 5:
                        mergeNotification(wearPacket.getNotification());
                        break;
                    case 6:
                        mergeFitness(wearPacket.getFitness());
                        break;
                    case 7:
                        mergeLpa(wearPacket.getLpa());
                        break;
                    case 8:
                        mergeWeather(wearPacket.getWeather());
                        break;
                    case 9:
                        mergeStock(wearPacket.getStock());
                        break;
                    case 10:
                        mergeCalendar(wearPacket.getCalendar());
                        break;
                    case 11:
                        mergeFactory(wearPacket.getFactory());
                        break;
                    case 12:
                        mergeAivs(wearPacket.getAivs());
                        break;
                    case 13:
                        mergeMarket(wearPacket.getMarket());
                        break;
                    case 14:
                        mergeGnss(wearPacket.getGnss());
                        break;
                    case 15:
                        mergeClock(wearPacket.getClock());
                        break;
                    case 16:
                        mergeMedia(wearPacket.getMedia());
                        break;
                    case 17:
                        mergeAlexa(wearPacket.getAlexa());
                        break;
                    case 18:
                        setErrorCode(wearPacket.getErrorCode());
                        break;
                }
                mergeUnknownFields(((GeneratedMessage) wearPacket).unknownFields);
                onChanged();
                return this;
            }
        }

        public enum PayloadCase implements Internal.EnumLite {
            ACCOUNT(3),
            SYSTEM(4),
            WATCH_FACE(6),
            NFC(7),
            NOTIFICATION(9),
            FITNESS(10),
            LPA(11),
            WEATHER(12),
            STOCK(13),
            CALENDAR(14),
            FACTORY(15),
            AIVS(16),
            MARKET(17),
            GNSS(18),
            CLOCK(19),
            MEDIA(20),
            ALEXA(21),
            ERROR_CODE(100),
            PAYLOAD_NOT_SET(0);

            private final int value;

            PayloadCase(int i7) {
                this.value = i7;
            }

            public static PayloadCase forNumber(int i7) {
                if (i7 == 0) {
                    return PAYLOAD_NOT_SET;
                }
                if (i7 == 100) {
                    return ERROR_CODE;
                }
                if (i7 == 3) {
                    return ACCOUNT;
                }
                if (i7 == 4) {
                    return SYSTEM;
                }
                if (i7 == 6) {
                    return WATCH_FACE;
                }
                if (i7 == 7) {
                    return NFC;
                }
                switch (i7) {
                    case 9:
                        return NOTIFICATION;
                    case 10:
                        return FITNESS;
                    case 11:
                        return LPA;
                    case 12:
                        return WEATHER;
                    case 13:
                        return STOCK;
                    case 14:
                        return CALENDAR;
                    case 15:
                        return FACTORY;
                    case 16:
                        return AIVS;
                    case 17:
                        return MARKET;
                    case 18:
                        return GNSS;
                    case 19:
                        return CLOCK;
                    case 20:
                        return MEDIA;
                    case 21:
                        return ALEXA;
                    default:
                        return null;
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

        public enum Type implements ProtocolMessageEnum {
            OTHER(0),
            ACCOUNT(1),
            SYSTEM(2),
            WATCH_FACE(4),
            NFC(5),
            NOTIFICATION(7),
            FITNESS(8),
            LPA(9),
            WEATHER(10),
            STOCK(11),
            CALENDAR(12),
            FACTORY(13),
            AIVS(14),
            MARKET(15),
            GNSS(16),
            CLOCK(17),
            MEDIA(18),
            ALEXA(19);

            public static final int ACCOUNT_VALUE = 1;
            public static final int AIVS_VALUE = 14;
            public static final int ALEXA_VALUE = 19;
            public static final int CALENDAR_VALUE = 12;
            public static final int CLOCK_VALUE = 17;
            public static final int FACTORY_VALUE = 13;
            public static final int FITNESS_VALUE = 8;
            public static final int GNSS_VALUE = 16;
            public static final int LPA_VALUE = 9;
            public static final int MARKET_VALUE = 15;
            public static final int MEDIA_VALUE = 18;
            public static final int NFC_VALUE = 5;
            public static final int NOTIFICATION_VALUE = 7;
            public static final int OTHER_VALUE = 0;
            public static final int STOCK_VALUE = 11;
            public static final int SYSTEM_VALUE = 2;
            public static final int WATCH_FACE_VALUE = 4;
            public static final int WEATHER_VALUE = 10;
            private final int value;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.zh.wear.protobuf.WearProtos.WearPacket.Type.1
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
                switch (i7) {
                    case 0:
                        return OTHER;
                    case 1:
                        return ACCOUNT;
                    case 2:
                        return SYSTEM;
                    case 3:
                    case 6:
                    default:
                        return null;
                    case 4:
                        return WATCH_FACE;
                    case 5:
                        return NFC;
                    case 7:
                        return NOTIFICATION;
                    case 8:
                        return FITNESS;
                    case 9:
                        return LPA;
                    case 10:
                        return WEATHER;
                    case 11:
                        return STOCK;
                    case 12:
                        return CALENDAR;
                    case 13:
                        return FACTORY;
                    case 14:
                        return AIVS;
                    case 15:
                        return MARKET;
                    case 16:
                        return GNSS;
                    case 17:
                        return CLOCK;
                    case 18:
                        return MEDIA;
                    case 19:
                        return ALEXA;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return WearPacket.getDescriptor().getEnumTypes().get(0);
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

        private WearPacket() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.id_ = 0;
        }

        public static WearPacket getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WearProtos.internal_static_WearPacket_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WearPacket parseDelimitedFrom(InputStream inputStream) {
            return (WearPacket) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WearPacket parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<WearPacket> parser() {
            return PARSER;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:49:0x007a. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01bd  */
        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 490
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zh.wear.protobuf.WearProtos.WearPacket.equals(java.lang.Object):boolean");
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public AccountProtos.Account getAccount() {
            return this.payloadCase_ == 3 ? (AccountProtos.Account) this.payload_ : AccountProtos.Account.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public AccountProtos.AccountOrBuilder getAccountOrBuilder() {
            return this.payloadCase_ == 3 ? (AccountProtos.Account) this.payload_ : AccountProtos.Account.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public AivsProtos.Aivs getAivs() {
            return this.payloadCase_ == 16 ? (AivsProtos.Aivs) this.payload_ : AivsProtos.Aivs.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public AivsProtos.AivsOrBuilder getAivsOrBuilder() {
            return this.payloadCase_ == 16 ? (AivsProtos.Aivs) this.payload_ : AivsProtos.Aivs.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public AlexaProtos.Alexa getAlexa() {
            return this.payloadCase_ == 21 ? (AlexaProtos.Alexa) this.payload_ : AlexaProtos.Alexa.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public AlexaProtos.AlexaOrBuilder getAlexaOrBuilder() {
            return this.payloadCase_ == 21 ? (AlexaProtos.Alexa) this.payload_ : AlexaProtos.Alexa.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public CalendarProtos.Calendar getCalendar() {
            return this.payloadCase_ == 14 ? (CalendarProtos.Calendar) this.payload_ : CalendarProtos.Calendar.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public CalendarProtos.CalendarOrBuilder getCalendarOrBuilder() {
            return this.payloadCase_ == 14 ? (CalendarProtos.Calendar) this.payload_ : CalendarProtos.Calendar.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public ClockProtos.Clock getClock() {
            return this.payloadCase_ == 19 ? (ClockProtos.Clock) this.payload_ : ClockProtos.Clock.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public ClockProtos.ClockOrBuilder getClockOrBuilder() {
            return this.payloadCase_ == 19 ? (ClockProtos.Clock) this.payload_ : ClockProtos.Clock.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public CommonProtos.ErrorCode getErrorCode() {
            CommonProtos.ErrorCode errorCodeValueOf;
            return (this.payloadCase_ != 100 || (errorCodeValueOf = CommonProtos.ErrorCode.valueOf(((Integer) this.payload_).intValue())) == null) ? CommonProtos.ErrorCode.NO_ERROR : errorCodeValueOf;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public FactoryProtos.Factory getFactory() {
            return this.payloadCase_ == 15 ? (FactoryProtos.Factory) this.payload_ : FactoryProtos.Factory.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public FactoryProtos.FactoryOrBuilder getFactoryOrBuilder() {
            return this.payloadCase_ == 15 ? (FactoryProtos.Factory) this.payload_ : FactoryProtos.Factory.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public FitnessProtos.Fitness getFitness() {
            return this.payloadCase_ == 10 ? (FitnessProtos.Fitness) this.payload_ : FitnessProtos.Fitness.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public FitnessProtos.FitnessOrBuilder getFitnessOrBuilder() {
            return this.payloadCase_ == 10 ? (FitnessProtos.Fitness) this.payload_ : FitnessProtos.Fitness.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public GnssProtos.Gnss getGnss() {
            return this.payloadCase_ == 18 ? (GnssProtos.Gnss) this.payload_ : GnssProtos.Gnss.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public GnssProtos.GnssOrBuilder getGnssOrBuilder() {
            return this.payloadCase_ == 18 ? (GnssProtos.Gnss) this.payload_ : GnssProtos.Gnss.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public LpaProtos.Lpa getLpa() {
            return this.payloadCase_ == 11 ? (LpaProtos.Lpa) this.payload_ : LpaProtos.Lpa.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public LpaProtos.LpaOrBuilder getLpaOrBuilder() {
            return this.payloadCase_ == 11 ? (LpaProtos.Lpa) this.payload_ : LpaProtos.Lpa.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public MarketProtos.Market getMarket() {
            return this.payloadCase_ == 17 ? (MarketProtos.Market) this.payload_ : MarketProtos.Market.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public MarketProtos.MarketOrBuilder getMarketOrBuilder() {
            return this.payloadCase_ == 17 ? (MarketProtos.Market) this.payload_ : MarketProtos.Market.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public MediaProtos.Media getMedia() {
            return this.payloadCase_ == 20 ? (MediaProtos.Media) this.payload_ : MediaProtos.Media.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public MediaProtos.MediaOrBuilder getMediaOrBuilder() {
            return this.payloadCase_ == 20 ? (MediaProtos.Media) this.payload_ : MediaProtos.Media.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public NfcProtos.Nfc getNfc() {
            return this.payloadCase_ == 7 ? (NfcProtos.Nfc) this.payload_ : NfcProtos.Nfc.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public NfcProtos.NfcOrBuilder getNfcOrBuilder() {
            return this.payloadCase_ == 7 ? (NfcProtos.Nfc) this.payload_ : NfcProtos.Nfc.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public NotificationProtos.Notification getNotification() {
            return this.payloadCase_ == 9 ? (NotificationProtos.Notification) this.payload_ : NotificationProtos.Notification.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public NotificationProtos.NotificationOrBuilder getNotificationOrBuilder() {
            return this.payloadCase_ == 9 ? (NotificationProtos.Notification) this.payload_ : NotificationProtos.Notification.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WearPacket> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.id_);
            }
            if (this.payloadCase_ == 3) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, (AccountProtos.Account) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, (SystemProtos.System) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(6, (WatchFaceProtos.WatchFace) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(7, (NfcProtos.Nfc) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(9, (NotificationProtos.Notification) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(10, (FitnessProtos.Fitness) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(11, (LpaProtos.Lpa) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(12, (WeatherProtos.Weather) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(13, (StockProtos.Stock) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(14, (CalendarProtos.Calendar) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(15, (FactoryProtos.Factory) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(16, (AivsProtos.Aivs) this.payload_);
            }
            if (this.payloadCase_ == 17) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(17, (MarketProtos.Market) this.payload_);
            }
            if (this.payloadCase_ == 18) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(18, (GnssProtos.Gnss) this.payload_);
            }
            if (this.payloadCase_ == 19) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(19, (ClockProtos.Clock) this.payload_);
            }
            if (this.payloadCase_ == 20) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(20, (MediaProtos.Media) this.payload_);
            }
            if (this.payloadCase_ == 21) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(21, (AlexaProtos.Alexa) this.payload_);
            }
            if (this.payloadCase_ == 100) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(100, ((Integer) this.payload_).intValue());
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public StockProtos.Stock getStock() {
            return this.payloadCase_ == 13 ? (StockProtos.Stock) this.payload_ : StockProtos.Stock.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public StockProtos.StockOrBuilder getStockOrBuilder() {
            return this.payloadCase_ == 13 ? (StockProtos.Stock) this.payload_ : StockProtos.Stock.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public SystemProtos.System getSystem() {
            return this.payloadCase_ == 4 ? (SystemProtos.System) this.payload_ : SystemProtos.System.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public SystemProtos.SystemOrBuilder getSystemOrBuilder() {
            return this.payloadCase_ == 4 ? (SystemProtos.System) this.payload_ : SystemProtos.System.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public Type getType() {
            Type typeValueOf = Type.valueOf(this.type_);
            return typeValueOf == null ? Type.OTHER : typeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public WatchFaceProtos.WatchFace getWatchFace() {
            return this.payloadCase_ == 6 ? (WatchFaceProtos.WatchFace) this.payload_ : WatchFaceProtos.WatchFace.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public WatchFaceProtos.WatchFaceOrBuilder getWatchFaceOrBuilder() {
            return this.payloadCase_ == 6 ? (WatchFaceProtos.WatchFace) this.payload_ : WatchFaceProtos.WatchFace.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public WeatherProtos.Weather getWeather() {
            return this.payloadCase_ == 12 ? (WeatherProtos.Weather) this.payload_ : WeatherProtos.Weather.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public WeatherProtos.WeatherOrBuilder getWeatherOrBuilder() {
            return this.payloadCase_ == 12 ? (WeatherProtos.Weather) this.payload_ : WeatherProtos.Weather.getDefaultInstance();
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasAccount() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasAivs() {
            return this.payloadCase_ == 16;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasAlexa() {
            return this.payloadCase_ == 21;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasCalendar() {
            return this.payloadCase_ == 14;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasClock() {
            return this.payloadCase_ == 19;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasErrorCode() {
            return this.payloadCase_ == 100;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasFactory() {
            return this.payloadCase_ == 15;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasFitness() {
            return this.payloadCase_ == 10;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasGnss() {
            return this.payloadCase_ == 18;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasLpa() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasMarket() {
            return this.payloadCase_ == 17;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasMedia() {
            return this.payloadCase_ == 20;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasNfc() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasNotification() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasStock() {
            return this.payloadCase_ == 13;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasSystem() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasWatchFace() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.wear.protobuf.WearProtos.WearPacketOrBuilder
        public boolean hasWeather() {
            return this.payloadCase_ == 12;
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
            if (hasType()) {
                iHashCode2 = (((iHashCode2 * 37) + 1) * 53) + this.type_;
            }
            if (hasId()) {
                iHashCode2 = (((iHashCode2 * 37) + 2) * 53) + getId();
            }
            int i9 = this.payloadCase_;
            if (i9 == 3) {
                i7 = ((iHashCode2 * 37) + 3) * 53;
                iHashCode = getAccount().hashCode();
            } else if (i9 == 4) {
                i7 = ((iHashCode2 * 37) + 4) * 53;
                iHashCode = getSystem().hashCode();
            } else if (i9 == 6) {
                i7 = ((iHashCode2 * 37) + 6) * 53;
                iHashCode = getWatchFace().hashCode();
            } else if (i9 == 7) {
                i7 = ((iHashCode2 * 37) + 7) * 53;
                iHashCode = getNfc().hashCode();
            } else if (i9 != 100) {
                switch (i9) {
                    case 9:
                        i7 = ((iHashCode2 * 37) + 9) * 53;
                        iHashCode = getNotification().hashCode();
                        break;
                    case 10:
                        i7 = ((iHashCode2 * 37) + 10) * 53;
                        iHashCode = getFitness().hashCode();
                        break;
                    case 11:
                        i7 = ((iHashCode2 * 37) + 11) * 53;
                        iHashCode = getLpa().hashCode();
                        break;
                    case 12:
                        i7 = ((iHashCode2 * 37) + 12) * 53;
                        iHashCode = getWeather().hashCode();
                        break;
                    case 13:
                        i7 = ((iHashCode2 * 37) + 13) * 53;
                        iHashCode = getStock().hashCode();
                        break;
                    case 14:
                        i7 = ((iHashCode2 * 37) + 14) * 53;
                        iHashCode = getCalendar().hashCode();
                        break;
                    case 15:
                        i7 = ((iHashCode2 * 37) + 15) * 53;
                        iHashCode = getFactory().hashCode();
                        break;
                    case 16:
                        i7 = ((iHashCode2 * 37) + 16) * 53;
                        iHashCode = getAivs().hashCode();
                        break;
                    case 17:
                        i7 = ((iHashCode2 * 37) + 17) * 53;
                        iHashCode = getMarket().hashCode();
                        break;
                    case 18:
                        i7 = ((iHashCode2 * 37) + 18) * 53;
                        iHashCode = getGnss().hashCode();
                        break;
                    case 19:
                        i7 = ((iHashCode2 * 37) + 19) * 53;
                        iHashCode = getClock().hashCode();
                        break;
                    case 20:
                        i7 = ((iHashCode2 * 37) + 20) * 53;
                        iHashCode = getMedia().hashCode();
                        break;
                    case 21:
                        i7 = ((iHashCode2 * 37) + 21) * 53;
                        iHashCode = getAlexa().hashCode();
                        break;
                }
            } else {
                i7 = ((iHashCode2 * 37) + 100) * 53;
                iHashCode = getErrorCode().getNumber();
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WearProtos.internal_static_WearPacket_fieldAccessorTable.ensureFieldAccessorsInitialized(WearPacket.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAccount() && !getAccount().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSystem() && !getSystem().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasWatchFace() && !getWatchFace().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasNfc() && !getNfc().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasNotification() && !getNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitness() && !getFitness().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasWeather() && !getWeather().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStock() && !getStock().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCalendar() && !getCalendar().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFactory() && !getFactory().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAivs() && !getAivs().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMarket() && !getMarket().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGnss() && !getGnss().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasClock() && !getClock().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMedia() && !getMedia().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAlexa() || getAlexa().isInitialized()) {
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
                codedOutputStream.writeUInt32(2, this.id_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (AccountProtos.Account) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeMessage(4, (SystemProtos.System) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (WatchFaceProtos.WatchFace) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (NfcProtos.Nfc) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (NotificationProtos.Notification) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                codedOutputStream.writeMessage(10, (FitnessProtos.Fitness) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (LpaProtos.Lpa) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                codedOutputStream.writeMessage(12, (WeatherProtos.Weather) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeMessage(13, (StockProtos.Stock) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                codedOutputStream.writeMessage(14, (CalendarProtos.Calendar) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                codedOutputStream.writeMessage(15, (FactoryProtos.Factory) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                codedOutputStream.writeMessage(16, (AivsProtos.Aivs) this.payload_);
            }
            if (this.payloadCase_ == 17) {
                codedOutputStream.writeMessage(17, (MarketProtos.Market) this.payload_);
            }
            if (this.payloadCase_ == 18) {
                codedOutputStream.writeMessage(18, (GnssProtos.Gnss) this.payload_);
            }
            if (this.payloadCase_ == 19) {
                codedOutputStream.writeMessage(19, (ClockProtos.Clock) this.payload_);
            }
            if (this.payloadCase_ == 20) {
                codedOutputStream.writeMessage(20, (MediaProtos.Media) this.payload_);
            }
            if (this.payloadCase_ == 21) {
                codedOutputStream.writeMessage(21, (AlexaProtos.Alexa) this.payload_);
            }
            if (this.payloadCase_ == 100) {
                codedOutputStream.writeEnum(100, ((Integer) this.payload_).intValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WearPacket(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                                int i8 = codedInputStream.readEnum();
                                if (Type.valueOf(i8) == null) {
                                    builderNewBuilder.mergeVarintField(1, i8);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.type_ = i8;
                                }
                                break;
                            case 16:
                                this.bitField0_ |= 2;
                                this.id_ = codedInputStream.readUInt32();
                                break;
                            case 26:
                                i7 = 3;
                                AccountProtos.Account.Builder builder = this.payloadCase_ == 3 ? ((AccountProtos.Account) this.payload_).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(AccountProtos.Account.PARSER, extensionRegistryLite);
                                this.payload_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((AccountProtos.Account) message);
                                    this.payload_ = builder.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 34:
                                i7 = 4;
                                SystemProtos.System.Builder builder2 = this.payloadCase_ == 4 ? ((SystemProtos.System) this.payload_).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(SystemProtos.System.PARSER, extensionRegistryLite);
                                this.payload_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((SystemProtos.System) message2);
                                    this.payload_ = builder2.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 50:
                                i7 = 6;
                                WatchFaceProtos.WatchFace.Builder builder3 = this.payloadCase_ == 6 ? ((WatchFaceProtos.WatchFace) this.payload_).toBuilder() : null;
                                MessageLite message3 = codedInputStream.readMessage(WatchFaceProtos.WatchFace.PARSER, extensionRegistryLite);
                                this.payload_ = message3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((WatchFaceProtos.WatchFace) message3);
                                    this.payload_ = builder3.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 58:
                                i7 = 7;
                                NfcProtos.Nfc.Builder builder4 = this.payloadCase_ == 7 ? ((NfcProtos.Nfc) this.payload_).toBuilder() : null;
                                MessageLite message4 = codedInputStream.readMessage(NfcProtos.Nfc.PARSER, extensionRegistryLite);
                                this.payload_ = message4;
                                if (builder4 != null) {
                                    builder4.mergeFrom((NfcProtos.Nfc) message4);
                                    this.payload_ = builder4.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 74:
                                i7 = 9;
                                NotificationProtos.Notification.Builder builder5 = this.payloadCase_ == 9 ? ((NotificationProtos.Notification) this.payload_).toBuilder() : null;
                                MessageLite message5 = codedInputStream.readMessage(NotificationProtos.Notification.PARSER, extensionRegistryLite);
                                this.payload_ = message5;
                                if (builder5 != null) {
                                    builder5.mergeFrom((NotificationProtos.Notification) message5);
                                    this.payload_ = builder5.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 82:
                                i7 = 10;
                                FitnessProtos.Fitness.Builder builder6 = this.payloadCase_ == 10 ? ((FitnessProtos.Fitness) this.payload_).toBuilder() : null;
                                MessageLite message6 = codedInputStream.readMessage(FitnessProtos.Fitness.PARSER, extensionRegistryLite);
                                this.payload_ = message6;
                                if (builder6 != null) {
                                    builder6.mergeFrom((FitnessProtos.Fitness) message6);
                                    this.payload_ = builder6.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 90:
                                i7 = 11;
                                LpaProtos.Lpa.Builder builder7 = this.payloadCase_ == 11 ? ((LpaProtos.Lpa) this.payload_).toBuilder() : null;
                                MessageLite message7 = codedInputStream.readMessage(LpaProtos.Lpa.PARSER, extensionRegistryLite);
                                this.payload_ = message7;
                                if (builder7 != null) {
                                    builder7.mergeFrom((LpaProtos.Lpa) message7);
                                    this.payload_ = builder7.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 98:
                                i7 = 12;
                                WeatherProtos.Weather.Builder builder8 = this.payloadCase_ == 12 ? ((WeatherProtos.Weather) this.payload_).toBuilder() : null;
                                MessageLite message8 = codedInputStream.readMessage(WeatherProtos.Weather.PARSER, extensionRegistryLite);
                                this.payload_ = message8;
                                if (builder8 != null) {
                                    builder8.mergeFrom((WeatherProtos.Weather) message8);
                                    this.payload_ = builder8.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 106:
                                i7 = 13;
                                StockProtos.Stock.Builder builder9 = this.payloadCase_ == 13 ? ((StockProtos.Stock) this.payload_).toBuilder() : null;
                                MessageLite message9 = codedInputStream.readMessage(StockProtos.Stock.PARSER, extensionRegistryLite);
                                this.payload_ = message9;
                                if (builder9 != null) {
                                    builder9.mergeFrom((StockProtos.Stock) message9);
                                    this.payload_ = builder9.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 114:
                                i7 = 14;
                                CalendarProtos.Calendar.Builder builder10 = this.payloadCase_ == 14 ? ((CalendarProtos.Calendar) this.payload_).toBuilder() : null;
                                MessageLite message10 = codedInputStream.readMessage(CalendarProtos.Calendar.PARSER, extensionRegistryLite);
                                this.payload_ = message10;
                                if (builder10 != null) {
                                    builder10.mergeFrom((CalendarProtos.Calendar) message10);
                                    this.payload_ = builder10.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 122:
                                i7 = 15;
                                FactoryProtos.Factory.Builder builder11 = this.payloadCase_ == 15 ? ((FactoryProtos.Factory) this.payload_).toBuilder() : null;
                                MessageLite message11 = codedInputStream.readMessage(FactoryProtos.Factory.PARSER, extensionRegistryLite);
                                this.payload_ = message11;
                                if (builder11 != null) {
                                    builder11.mergeFrom((FactoryProtos.Factory) message11);
                                    this.payload_ = builder11.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 130:
                                i7 = 16;
                                AivsProtos.Aivs.Builder builder12 = this.payloadCase_ == 16 ? ((AivsProtos.Aivs) this.payload_).toBuilder() : null;
                                MessageLite message12 = codedInputStream.readMessage(AivsProtos.Aivs.PARSER, extensionRegistryLite);
                                this.payload_ = message12;
                                if (builder12 != null) {
                                    builder12.mergeFrom((AivsProtos.Aivs) message12);
                                    this.payload_ = builder12.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 138:
                                i7 = 17;
                                MarketProtos.Market.Builder builder13 = this.payloadCase_ == 17 ? ((MarketProtos.Market) this.payload_).toBuilder() : null;
                                MessageLite message13 = codedInputStream.readMessage(MarketProtos.Market.PARSER, extensionRegistryLite);
                                this.payload_ = message13;
                                if (builder13 != null) {
                                    builder13.mergeFrom((MarketProtos.Market) message13);
                                    this.payload_ = builder13.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 146:
                                i7 = 18;
                                GnssProtos.Gnss.Builder builder14 = this.payloadCase_ == 18 ? ((GnssProtos.Gnss) this.payload_).toBuilder() : null;
                                MessageLite message14 = codedInputStream.readMessage(GnssProtos.Gnss.PARSER, extensionRegistryLite);
                                this.payload_ = message14;
                                if (builder14 != null) {
                                    builder14.mergeFrom((GnssProtos.Gnss) message14);
                                    this.payload_ = builder14.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 154:
                                i7 = 19;
                                ClockProtos.Clock.Builder builder15 = this.payloadCase_ == 19 ? ((ClockProtos.Clock) this.payload_).toBuilder() : null;
                                MessageLite message15 = codedInputStream.readMessage(ClockProtos.Clock.PARSER, extensionRegistryLite);
                                this.payload_ = message15;
                                if (builder15 != null) {
                                    builder15.mergeFrom((ClockProtos.Clock) message15);
                                    this.payload_ = builder15.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 162:
                                i7 = 20;
                                MediaProtos.Media.Builder builder16 = this.payloadCase_ == 20 ? ((MediaProtos.Media) this.payload_).toBuilder() : null;
                                MessageLite message16 = codedInputStream.readMessage(MediaProtos.Media.PARSER, extensionRegistryLite);
                                this.payload_ = message16;
                                if (builder16 != null) {
                                    builder16.mergeFrom((MediaProtos.Media) message16);
                                    this.payload_ = builder16.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 170:
                                i7 = 21;
                                AlexaProtos.Alexa.Builder builder17 = this.payloadCase_ == 21 ? ((AlexaProtos.Alexa) this.payload_).toBuilder() : null;
                                MessageLite message17 = codedInputStream.readMessage(AlexaProtos.Alexa.PARSER, extensionRegistryLite);
                                this.payload_ = message17;
                                if (builder17 != null) {
                                    builder17.mergeFrom((AlexaProtos.Alexa) message17);
                                    this.payload_ = builder17.buildPartial();
                                }
                                this.payloadCase_ = i7;
                                break;
                            case 800:
                                int i9 = codedInputStream.readEnum();
                                if (CommonProtos.ErrorCode.valueOf(i9) == null) {
                                    builderNewBuilder.mergeVarintField(100, i9);
                                } else {
                                    this.payloadCase_ = 100;
                                    this.payload_ = Integer.valueOf(i9);
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

        public static Builder newBuilder(WearPacket wearPacket) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wearPacket);
        }

        public static WearPacket parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WearPacket) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WearPacket parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WearPacket parseFrom(CodedInputStream codedInputStream) {
            return (WearPacket) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WearPacket getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private WearPacket(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WearPacket parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WearPacket) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WearPacket parseFrom(InputStream inputStream) {
            return (WearPacket) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WearPacket parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WearPacket) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WearPacket parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static WearPacket parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static WearPacket parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WearPacket parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }
    }

    public interface WearPacketOrBuilder extends MessageOrBuilder {
        AccountProtos.Account getAccount();

        AccountProtos.AccountOrBuilder getAccountOrBuilder();

        AivsProtos.Aivs getAivs();

        AivsProtos.AivsOrBuilder getAivsOrBuilder();

        AlexaProtos.Alexa getAlexa();

        AlexaProtos.AlexaOrBuilder getAlexaOrBuilder();

        CalendarProtos.Calendar getCalendar();

        CalendarProtos.CalendarOrBuilder getCalendarOrBuilder();

        ClockProtos.Clock getClock();

        ClockProtos.ClockOrBuilder getClockOrBuilder();

        CommonProtos.ErrorCode getErrorCode();

        FactoryProtos.Factory getFactory();

        FactoryProtos.FactoryOrBuilder getFactoryOrBuilder();

        FitnessProtos.Fitness getFitness();

        FitnessProtos.FitnessOrBuilder getFitnessOrBuilder();

        GnssProtos.Gnss getGnss();

        GnssProtos.GnssOrBuilder getGnssOrBuilder();

        int getId();

        LpaProtos.Lpa getLpa();

        LpaProtos.LpaOrBuilder getLpaOrBuilder();

        MarketProtos.Market getMarket();

        MarketProtos.MarketOrBuilder getMarketOrBuilder();

        MediaProtos.Media getMedia();

        MediaProtos.MediaOrBuilder getMediaOrBuilder();

        NfcProtos.Nfc getNfc();

        NfcProtos.NfcOrBuilder getNfcOrBuilder();

        NotificationProtos.Notification getNotification();

        NotificationProtos.NotificationOrBuilder getNotificationOrBuilder();

        WearPacket.PayloadCase getPayloadCase();

        StockProtos.Stock getStock();

        StockProtos.StockOrBuilder getStockOrBuilder();

        SystemProtos.System getSystem();

        SystemProtos.SystemOrBuilder getSystemOrBuilder();

        WearPacket.Type getType();

        WatchFaceProtos.WatchFace getWatchFace();

        WatchFaceProtos.WatchFaceOrBuilder getWatchFaceOrBuilder();

        WeatherProtos.Weather getWeather();

        WeatherProtos.WeatherOrBuilder getWeatherOrBuilder();

        boolean hasAccount();

        boolean hasAivs();

        boolean hasAlexa();

        boolean hasCalendar();

        boolean hasClock();

        boolean hasErrorCode();

        boolean hasFactory();

        boolean hasFitness();

        boolean hasGnss();

        boolean hasId();

        boolean hasLpa();

        boolean hasMarket();

        boolean hasMedia();

        boolean hasNfc();

        boolean hasNotification();

        boolean hasStock();

        boolean hasSystem();

        boolean hasType();

        boolean hasWatchFace();

        boolean hasWeather();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\nwear.proto\u001a\fnanopb.proto\u001a\u0011wear_common.proto\u001a\u0012wear_account.proto\u001a\u0011wear_system.proto\u001a\u0015wear_watch_face.proto\u001a\u000ewear_nfc.proto\u001a\u0017wear_notification.proto\u001a\u0012wear_fitness.proto\u001a\u000ewear_lpa.proto\u001a\u0012wear_weather.proto\u001a\u0010wear_stock.proto\u001a\u0013wear_calendar.proto\u001a\u0012wear_factory.proto\u001a\u000fwear_aivs.proto\u001a\u0011wear_market.proto\u001a\u000fwear_gnss.proto\u001a\u0010wear_clock.proto\u001a\u0010wear_media.proto\u001a\u0010wear_alexa.proto\"\u009c\u0006\n\nWearPacket\u0012\u001e\n\u0004type\u0018\u0001 \u0002(\u000e2\u0010.WearPacket.Type\u0012\u0011\n\u0002id\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u001b\n\u0007account\u0018\u0003 \u0001(\u000b2\b.AccountH\u0000\u0012\u0019\n\u0006system\u0018\u0004 \u0001(\u000b2\u0007.SystemH\u0000\u0012 \n\nwatch_face\u0018\u0006 \u0001(\u000b2\n.WatchFaceH\u0000\u0012\u0013\n\u0003nfc\u0018\u0007 \u0001(\u000b2\u0004.NfcH\u0000\u0012%\n\fnotification\u0018\t \u0001(\u000b2\r.NotificationH\u0000\u0012\u001b\n\u0007fitness\u0018\n \u0001(\u000b2\b.FitnessH\u0000\u0012\u0013\n\u0003lpa\u0018\u000b \u0001(\u000b2\u0004.LpaH\u0000\u0012\u001b\n\u0007weather\u0018\f \u0001(\u000b2\b.WeatherH\u0000\u0012\u0017\n\u0005stock\u0018\r \u0001(\u000b2\u0006.StockH\u0000\u0012\u001d\n\bcalendar\u0018\u000e \u0001(\u000b2\t.CalendarH\u0000\u0012\u001b\n\u0007factory\u0018\u000f \u0001(\u000b2\b.FactoryH\u0000\u0012\u0015\n\u0004aivs\u0018\u0010 \u0001(\u000b2\u0005.AivsH\u0000\u0012\u0019\n\u0006market\u0018\u0011 \u0001(\u000b2\u0007.MarketH\u0000\u0012\u0015\n\u0004gnss\u0018\u0012 \u0001(\u000b2\u0005.GnssH\u0000\u0012\u0017\n\u0005clock\u0018\u0013 \u0001(\u000b2\u0006.ClockH\u0000\u0012\u0017\n\u0005media\u0018\u0014 \u0001(\u000b2\u0006.MediaH\u0000\u0012\u0017\n\u0005alexa\u0018\u0015 \u0001(\u000b2\u0006.AlexaH\u0000\u0012 \n\nerror_code\u0018d \u0001(\u000e2\n.ErrorCodeH\u0000\"ß\u0001\n\u0004Type\u0012\t\n\u0005OTHER\u0010\u0000\u0012\u000b\n\u0007ACCOUNT\u0010\u0001\u0012\n\n\u0006SYSTEM\u0010\u0002\u0012\u000e\n\nWATCH_FACE\u0010\u0004\u0012\u0007\n\u0003NFC\u0010\u0005\u0012\u0010\n\fNOTIFICATION\u0010\u0007\u0012\u000b\n\u0007FITNESS\u0010\b\u0012\u0007\n\u0003LPA\u0010\t\u0012\u000b\n\u0007WEATHER\u0010\n\u0012\t\n\u0005STOCK\u0010\u000b\u0012\f\n\bCALENDAR\u0010\f\u0012\u000b\n\u0007FACTORY\u0010\r\u0012\b\n\u0004AIVS\u0010\u000e\u0012\n\n\u0006MARKET\u0010\u000f\u0012\b\n\u0004GNSS\u0010\u0010\u0012\t\n\u0005CLOCK\u0010\u0011\u0012\t\n\u0005MEDIA\u0010\u0012\u0012\t\n\u0005ALEXA\u0010\u0013B\t\n\u0007payloadB\"\n\u0014com.zh.wear.protobufB\nWearProtos"}, new Descriptors.FileDescriptor[]{Nanopb.getDescriptor(), CommonProtos.getDescriptor(), AccountProtos.getDescriptor(), SystemProtos.getDescriptor(), WatchFaceProtos.getDescriptor(), NfcProtos.getDescriptor(), NotificationProtos.getDescriptor(), FitnessProtos.getDescriptor(), LpaProtos.getDescriptor(), WeatherProtos.getDescriptor(), StockProtos.getDescriptor(), CalendarProtos.getDescriptor(), FactoryProtos.getDescriptor(), AivsProtos.getDescriptor(), MarketProtos.getDescriptor(), GnssProtos.getDescriptor(), ClockProtos.getDescriptor(), MediaProtos.getDescriptor(), AlexaProtos.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.zh.wear.protobuf.WearProtos.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = WearProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_WearPacket_descriptor = descriptor2;
        internal_static_WearPacket_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Type", "Id", "Account", "System", "WatchFace", "Nfc", "Notification", "Fitness", "Lpa", "Weather", "Stock", "Calendar", "Factory", "Aivs", "Market", "Gnss", "Clock", AbsMediaController.f193280h, "Alexa", "ErrorCode", "Payload"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) Nanopb.nanopb);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, extensionRegistryNewInstance);
        Nanopb.getDescriptor();
        CommonProtos.getDescriptor();
        AccountProtos.getDescriptor();
        SystemProtos.getDescriptor();
        WatchFaceProtos.getDescriptor();
        NfcProtos.getDescriptor();
        NotificationProtos.getDescriptor();
        FitnessProtos.getDescriptor();
        LpaProtos.getDescriptor();
        WeatherProtos.getDescriptor();
        StockProtos.getDescriptor();
        CalendarProtos.getDescriptor();
        FactoryProtos.getDescriptor();
        AivsProtos.getDescriptor();
        MarketProtos.getDescriptor();
        GnssProtos.getDescriptor();
        ClockProtos.getDescriptor();
        MediaProtos.getDescriptor();
        AlexaProtos.getDescriptor();
    }

    private WearProtos() {
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