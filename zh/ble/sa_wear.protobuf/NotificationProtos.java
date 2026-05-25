package com.zh.ble.sa_wear.protobuf;

import androidx.datastore.preferences.protobuf.MessageLiteToString;
import androidx.media3.exoplayer.dash.manifest.UrlTemplate;
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.noisefit.DataBinderMapperImpl;
import com.noisefit.MainActivity;
import com.zh.ble.sa_wear.protobuf.CommonProtos;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class NotificationProtos extends GeneratedFile {
    private static final Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_SA_SEAppNotification_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAppNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAppRemoveNotif_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAppRemoveNotif_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAppRemoveNotif_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAppRemoveNotif_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEAppSuperNotification_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEAppSuperNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEContactInfo_List_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEContactInfo_List_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEContactInfo_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEContactInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEContactsAvatarData_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEContactsAvatarData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEContactsAvatar_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEContactsAvatar_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEContactsAvatar_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEContactsAvatar_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEContactsCY_2_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEContactsCY_2_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEContacts_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEContacts_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEContacts_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEContacts_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEGlodFriendContacts_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEGlodFriendContacts_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEGlodFriendContacts_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEGlodFriendContacts_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEGlodFriendEmoji_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEGlodFriendEmoji_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEIOSNotification_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEIOSNotification_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEIOSNotification_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEIOSNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SENotificationString_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SENotificationString_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SENotificationString_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SENotificationString_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SENotification_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SENotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEQuickReplyMessage_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEQuickReplyMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEQuickReply_SEList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEQuickReply_SEList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SEQuickReply_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SEQuickReply_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SESOSContacts_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SESOSContacts_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SA_SESystemNotification_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_SA_SESystemNotification_fieldAccessorTable;

    public static final class SEAppNotification extends GeneratedMessage implements SEAppNotificationOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 1;
        private static final SEAppNotification DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 6;
        public static final int PAGE_NAME_FIELD_NUMBER = 2;
        private static final Parser<SEAppNotification> PARSER;
        public static final int SUPPORT_OPEN_FIELD_NUMBER = 7;
        public static final int TEXT_FIELD_NUMBER = 4;
        public static final int TICKER_TEXT_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object appName_;
        private int bitField0_;
        private volatile Object key_;
        private byte memoizedIsInitialized;
        private volatile Object pageName_;
        private boolean supportOpen_;
        private volatile Object text_;
        private volatile Object tickerText_;
        private volatile Object title_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEAppNotification$1 */
        public class AnonymousClass1 extends AbstractParser<SEAppNotification> {
            @Override // com.google.protobuf.Parser
            public SEAppNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEAppNotification.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAppNotificationOrBuilder {
            private Object appName_;
            private int bitField0_;
            private Object key_;
            private Object pageName_;
            private boolean supportOpen_;
            private Object text_;
            private Object tickerText_;
            private Object title_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEAppNotification sEAppNotification) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAppNotification.appName_ = this.appName_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEAppNotification.pageName_ = this.pageName_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEAppNotification.title_ = this.title_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEAppNotification.text_ = this.text_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEAppNotification.tickerText_ = this.tickerText_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEAppNotification.key_ = this.key_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sEAppNotification.supportOpen_ = this.supportOpen_;
                    i7 |= 64;
                }
                sEAppNotification.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEAppNotification_descriptor;
            }

            public Builder clearAppName() {
                this.appName_ = SEAppNotification.getDefaultInstance().getAppName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearKey() {
                this.key_ = SEAppNotification.getDefaultInstance().getKey();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearPageName() {
                this.pageName_ = SEAppNotification.getDefaultInstance().getPageName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSupportOpen() {
                this.bitField0_ &= -65;
                this.supportOpen_ = false;
                onChanged();
                return this;
            }

            public Builder clearText() {
                this.text_ = SEAppNotification.getDefaultInstance().getText();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearTickerText() {
                this.tickerText_ = SEAppNotification.getDefaultInstance().getTickerText();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = SEAppNotification.getDefaultInstance().getTitle();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public String getAppName() {
                Object obj = this.appName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public ByteString getAppNameBytes() {
                Object obj = this.appName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEAppNotification_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public String getKey() {
                Object obj = this.key_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.key_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public ByteString getKeyBytes() {
                Object obj = this.key_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.key_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public String getPageName() {
                Object obj = this.pageName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.pageName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public ByteString getPageNameBytes() {
                Object obj = this.pageName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.pageName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public boolean getSupportOpen() {
                return this.supportOpen_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public ByteString getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public String getTickerText() {
                Object obj = this.tickerText_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.tickerText_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public ByteString getTickerTextBytes() {
                Object obj = this.tickerText_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tickerText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.title_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public boolean hasAppName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public boolean hasKey() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public boolean hasPageName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public boolean hasSupportOpen() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public boolean hasText() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public boolean hasTickerText() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEAppNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAppNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppName() && hasPageName() && hasTitle() && hasText() && hasTickerText();
            }

            public Builder setAppName(String str) {
                str.getClass();
                this.appName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAppNameBytes(ByteString byteString) {
                byteString.getClass();
                this.appName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setKey(String str) {
                str.getClass();
                this.key_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.key_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPageName(String str) {
                str.getClass();
                this.pageName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPageNameBytes(ByteString byteString) {
                byteString.getClass();
                this.pageName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSupportOpen(boolean z6) {
                this.supportOpen_ = z6;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setText(String str) {
                str.getClass();
                this.text_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                this.text_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTickerText(String str) {
                str.getClass();
                this.tickerText_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTickerTextBytes(ByteString byteString) {
                byteString.getClass();
                this.tickerText_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.title_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.appName_ = "";
                this.pageName_ = "";
                this.title_ = "";
                this.text_ = "";
                this.tickerText_ = "";
                this.key_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAppNotification build() {
                SEAppNotification sEAppNotificationBuildPartial = buildPartial();
                if (sEAppNotificationBuildPartial.isInitialized()) {
                    return sEAppNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAppNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAppNotification buildPartial() {
                SEAppNotification sEAppNotification = new SEAppNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAppNotification);
                }
                onBuilt();
                return sEAppNotification;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAppNotification getDefaultInstanceForType() {
                return SEAppNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appName_ = "";
                this.pageName_ = "";
                this.title_ = "";
                this.text_ = "";
                this.tickerText_ = "";
                this.key_ = "";
                this.supportOpen_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAppNotification) {
                    return mergeFrom((SEAppNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.appName_ = "";
                this.pageName_ = "";
                this.title_ = "";
                this.text_ = "";
                this.tickerText_ = "";
                this.key_ = "";
            }

            public Builder mergeFrom(SEAppNotification sEAppNotification) {
                if (sEAppNotification == SEAppNotification.getDefaultInstance()) {
                    return this;
                }
                if (sEAppNotification.hasAppName()) {
                    this.appName_ = sEAppNotification.appName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEAppNotification.hasPageName()) {
                    this.pageName_ = sEAppNotification.pageName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEAppNotification.hasTitle()) {
                    this.title_ = sEAppNotification.title_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEAppNotification.hasText()) {
                    this.text_ = sEAppNotification.text_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEAppNotification.hasTickerText()) {
                    this.tickerText_ = sEAppNotification.tickerText_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (sEAppNotification.hasKey()) {
                    this.key_ = sEAppNotification.key_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (sEAppNotification.hasSupportOpen()) {
                    setSupportOpen(sEAppNotification.getSupportOpen());
                }
                mergeUnknownFields(sEAppNotification.getUnknownFields());
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
                                    this.appName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.pageName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.title_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.text_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.tickerText_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.key_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag != 56) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.supportOpen_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAppNotification");
            DEFAULT_INSTANCE = new SEAppNotification();
            PARSER = new AbstractParser<SEAppNotification>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotification.1
                @Override // com.google.protobuf.Parser
                public SEAppNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAppNotification.newBuilder();
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

        public /* synthetic */ SEAppNotification(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEAppNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEAppNotification_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAppNotification parseDelimitedFrom(InputStream inputStream) {
            return (SEAppNotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAppNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAppNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAppNotification)) {
                return super.equals(obj);
            }
            SEAppNotification sEAppNotification = (SEAppNotification) obj;
            if (hasAppName() != sEAppNotification.hasAppName()) {
                return false;
            }
            if ((hasAppName() && !getAppName().equals(sEAppNotification.getAppName())) || hasPageName() != sEAppNotification.hasPageName()) {
                return false;
            }
            if ((hasPageName() && !getPageName().equals(sEAppNotification.getPageName())) || hasTitle() != sEAppNotification.hasTitle()) {
                return false;
            }
            if ((hasTitle() && !getTitle().equals(sEAppNotification.getTitle())) || hasText() != sEAppNotification.hasText()) {
                return false;
            }
            if ((hasText() && !getText().equals(sEAppNotification.getText())) || hasTickerText() != sEAppNotification.hasTickerText()) {
                return false;
            }
            if ((hasTickerText() && !getTickerText().equals(sEAppNotification.getTickerText())) || hasKey() != sEAppNotification.hasKey()) {
                return false;
            }
            if ((!hasKey() || getKey().equals(sEAppNotification.getKey())) && hasSupportOpen() == sEAppNotification.hasSupportOpen()) {
                return (!hasSupportOpen() || getSupportOpen() == sEAppNotification.getSupportOpen()) && getUnknownFields().equals(sEAppNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEAppNotification_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public String getKey() {
            Object obj = this.key_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.key_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public ByteString getKeyBytes() {
            Object obj = this.key_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.key_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public String getPageName() {
            Object obj = this.pageName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.pageName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public ByteString getPageNameBytes() {
            Object obj = this.pageName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pageName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAppNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.appName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.pageName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.title_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.text_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.tickerText_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(6, this.key_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(7, this.supportOpen_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public boolean getSupportOpen() {
            return this.supportOpen_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public String getTickerText() {
            Object obj = this.tickerText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.tickerText_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public ByteString getTickerTextBytes() {
            Object obj = this.tickerText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tickerText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.title_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public boolean hasAppName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public boolean hasKey() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public boolean hasPageName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public boolean hasSupportOpen() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public boolean hasText() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public boolean hasTickerText() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppNotificationOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasAppName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAppName().hashCode();
            }
            if (hasPageName()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getPageName().hashCode();
            }
            if (hasTitle()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getTitle().hashCode();
            }
            if (hasText()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getText().hashCode();
            }
            if (hasTickerText()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getTickerText().hashCode();
            }
            if (hasKey()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getKey().hashCode();
            }
            if (hasSupportOpen()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + Internal.hashBoolean(getSupportOpen());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEAppNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAppNotification.class, Builder.class);
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
            if (!hasAppName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPageName()) {
                this.memoizedIsInitialized = (byte) 0;
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
            if (hasTickerText()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.appName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.pageName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.title_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.text_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.tickerText_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.key_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.supportOpen_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEAppNotification(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.appName_ = "";
            this.pageName_ = "";
            this.title_ = "";
            this.text_ = "";
            this.tickerText_ = "";
            this.key_ = "";
            this.supportOpen_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAppNotification sEAppNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAppNotification);
        }

        public static SEAppNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAppNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppNotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAppNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAppNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAppNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEAppNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAppNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAppNotification parseFrom(InputStream inputStream) {
            return (SEAppNotification) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAppNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppNotification) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SEAppNotification() {
            this.appName_ = "";
            this.pageName_ = "";
            this.title_ = "";
            this.text_ = "";
            this.tickerText_ = "";
            this.key_ = "";
            this.supportOpen_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.appName_ = "";
            this.pageName_ = "";
            this.title_ = "";
            this.text_ = "";
            this.tickerText_ = "";
            this.key_ = "";
        }

        public static SEAppNotification parseFrom(CodedInputStream codedInputStream) {
            return (SEAppNotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAppNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppNotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAppNotificationOrBuilder extends MessageOrBuilder {
        String getAppName();

        ByteString getAppNameBytes();

        String getKey();

        ByteString getKeyBytes();

        String getPageName();

        ByteString getPageNameBytes();

        boolean getSupportOpen();

        String getText();

        ByteString getTextBytes();

        String getTickerText();

        ByteString getTickerTextBytes();

        String getTitle();

        ByteString getTitleBytes();

        boolean hasAppName();

        boolean hasKey();

        boolean hasPageName();

        boolean hasSupportOpen();

        boolean hasText();

        boolean hasTickerText();

        boolean hasTitle();
    }

    public static final class SEAppRemoveNotif extends GeneratedMessage implements SEAppRemoveNotifOrBuilder {
        private static final SEAppRemoveNotif DEFAULT_INSTANCE;
        public static final int OPEN_IN_PHONE_KEY_LIST_FIELD_NUMBER = 1;
        private static final Parser<SEAppRemoveNotif> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SEList openInPhoneKeyList_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEAppRemoveNotif$1 */
        public class AnonymousClass1 extends AbstractParser<SEAppRemoveNotif> {
            @Override // com.google.protobuf.Parser
            public SEAppRemoveNotif parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEAppRemoveNotif.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAppRemoveNotifOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> openInPhoneKeyListBuilder_;
            private SEList openInPhoneKeyList_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEAppRemoveNotif sEAppRemoveNotif) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.openInPhoneKeyListBuilder_;
                    sEAppRemoveNotif.openInPhoneKeyList_ = singleFieldBuilder == null ? this.openInPhoneKeyList_ : (SEList) singleFieldBuilder.build();
                } else {
                    i7 = 0;
                }
                sEAppRemoveNotif.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEAppRemoveNotif_descriptor;
            }

            private SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> internalGetOpenInPhoneKeyListFieldBuilder() {
                if (this.openInPhoneKeyListBuilder_ == null) {
                    this.openInPhoneKeyListBuilder_ = new SingleFieldBuilder<>(getOpenInPhoneKeyList(), getParentForChildren(), isClean());
                    this.openInPhoneKeyList_ = null;
                }
                return this.openInPhoneKeyListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetOpenInPhoneKeyListFieldBuilder();
                }
            }

            public Builder clearOpenInPhoneKeyList() {
                this.bitField0_ &= -2;
                this.openInPhoneKeyList_ = null;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.openInPhoneKeyListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.openInPhoneKeyListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEAppRemoveNotif_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotifOrBuilder
            public SEList getOpenInPhoneKeyList() {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.openInPhoneKeyListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEList) singleFieldBuilder.getMessage();
                }
                SEList sEList = this.openInPhoneKeyList_;
                return sEList == null ? SEList.getDefaultInstance() : sEList;
            }

            public SEList.Builder getOpenInPhoneKeyListBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SEList.Builder) internalGetOpenInPhoneKeyListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotifOrBuilder
            public SEListOrBuilder getOpenInPhoneKeyListOrBuilder() {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.openInPhoneKeyListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEList sEList = this.openInPhoneKeyList_;
                return sEList == null ? SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotifOrBuilder
            public boolean hasOpenInPhoneKeyList() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEAppRemoveNotif_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAppRemoveNotif.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasOpenInPhoneKeyList();
            }

            public Builder mergeOpenInPhoneKeyList(SEList sEList) {
                SEList sEList2;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.openInPhoneKeyListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 1) == 0 || (sEList2 = this.openInPhoneKeyList_) == null || sEList2 == SEList.getDefaultInstance()) {
                    this.openInPhoneKeyList_ = sEList;
                } else {
                    getOpenInPhoneKeyListBuilder().mergeFrom(sEList);
                }
                if (this.openInPhoneKeyList_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setOpenInPhoneKeyList(SEList sEList) {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.openInPhoneKeyListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.openInPhoneKeyList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAppRemoveNotif build() {
                SEAppRemoveNotif sEAppRemoveNotifBuildPartial = buildPartial();
                if (sEAppRemoveNotifBuildPartial.isInitialized()) {
                    return sEAppRemoveNotifBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAppRemoveNotifBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAppRemoveNotif buildPartial() {
                SEAppRemoveNotif sEAppRemoveNotif = new SEAppRemoveNotif(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAppRemoveNotif);
                }
                onBuilt();
                return sEAppRemoveNotif;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAppRemoveNotif getDefaultInstanceForType() {
                return SEAppRemoveNotif.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.openInPhoneKeyList_ = null;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.openInPhoneKeyListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.openInPhoneKeyListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAppRemoveNotif) {
                    return mergeFrom((SEAppRemoveNotif) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setOpenInPhoneKeyList(SEList.Builder builder) {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.openInPhoneKeyListBuilder_;
                if (singleFieldBuilder == null) {
                    this.openInPhoneKeyList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEAppRemoveNotif sEAppRemoveNotif) {
                if (sEAppRemoveNotif == SEAppRemoveNotif.getDefaultInstance()) {
                    return this;
                }
                if (sEAppRemoveNotif.hasOpenInPhoneKeyList()) {
                    mergeOpenInPhoneKeyList(sEAppRemoveNotif.getOpenInPhoneKeyList());
                }
                mergeUnknownFields(sEAppRemoveNotif.getUnknownFields());
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetOpenInPhoneKeyListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
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
            private static final long serialVersionUID = 0;
            private LazyStringArrayList list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEAppRemoveNotif$SEList$1 */
            public class AnonymousClass1 extends AbstractParser<SEList> {
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
                private LazyStringArrayList list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
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
                        this.list_ = new LazyStringArrayList((LazyStringList) this.list_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NotificationProtos.internal_static_SA_SEAppRemoveNotif_SEList_descriptor;
                }

                public Builder addAllList(Iterable<String> iterable) {
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addList(String str) {
                    str.getClass();
                    ensureListIsMutable();
                    this.list_.add(str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addListBytes(ByteString byteString) {
                    byteString.getClass();
                    ensureListIsMutable();
                    this.list_.add(byteString);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    this.list_ = LazyStringArrayList.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return NotificationProtos.internal_static_SA_SEAppRemoveNotif_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.SEListOrBuilder
                public String getList(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.SEListOrBuilder
                public ByteString getListBytes(int i7) {
                    return this.list_.getByteString(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.SEListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_SA_SEAppRemoveNotif_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, String str) {
                    str.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(k kVar) {
                    this();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.SEListOrBuilder
                public ProtocolStringList getListList() {
                    this.list_.makeImmutable();
                    return this.list_;
                }

                private Builder() {
                    this.list_ = LazyStringArrayList.emptyList();
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
                    this.list_ = LazyStringArrayList.emptyList();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.list_ = LazyStringArrayList.emptyList();
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
                            this.list_ = sEList.list_;
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
                                    if (tag != 10) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        ByteString bytes = codedInputStream.readBytes();
                                        ensureListIsMutable();
                                        this.list_.add(bytes);
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
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, k kVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEAppRemoveNotif_SEList_descriptor;
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
                return getListList().equals(sEList.getListList()) && getUnknownFields().equals(sEList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEAppRemoveNotif_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.SEListOrBuilder
            public String getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.SEListOrBuilder
            public ByteString getListBytes(int i7) {
                return this.list_.getByteString(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
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
                int iComputeStringSizeNoTag = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.list_.getRaw(i8));
                }
                int size = iComputeStringSizeNoTag + getListList().size() + getUnknownFields().getSerializedSize();
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
                return NotificationProtos.internal_static_SA_SEAppRemoveNotif_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    GeneratedMessage.writeString(codedOutputStream, 1, this.list_.getRaw(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.list_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SEList sEList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEList);
            }

            public static SEList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.SEListOrBuilder
            public ProtocolStringList getListList() {
                return this.list_;
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
                this.list_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = LazyStringArrayList.emptyList();
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
            String getList(int i7);

            ByteString getListBytes(int i7);

            int getListCount();

            List<String> getListList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAppRemoveNotif");
            DEFAULT_INSTANCE = new SEAppRemoveNotif();
            PARSER = new AbstractParser<SEAppRemoveNotif>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotif.1
                @Override // com.google.protobuf.Parser
                public SEAppRemoveNotif parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAppRemoveNotif.newBuilder();
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

        public /* synthetic */ SEAppRemoveNotif(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEAppRemoveNotif getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEAppRemoveNotif_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAppRemoveNotif parseDelimitedFrom(InputStream inputStream) {
            return (SEAppRemoveNotif) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAppRemoveNotif parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAppRemoveNotif> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAppRemoveNotif)) {
                return super.equals(obj);
            }
            SEAppRemoveNotif sEAppRemoveNotif = (SEAppRemoveNotif) obj;
            if (hasOpenInPhoneKeyList() != sEAppRemoveNotif.hasOpenInPhoneKeyList()) {
                return false;
            }
            return (!hasOpenInPhoneKeyList() || getOpenInPhoneKeyList().equals(sEAppRemoveNotif.getOpenInPhoneKeyList())) && getUnknownFields().equals(sEAppRemoveNotif.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEAppRemoveNotif_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotifOrBuilder
        public SEList getOpenInPhoneKeyList() {
            SEList sEList = this.openInPhoneKeyList_;
            return sEList == null ? SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotifOrBuilder
        public SEListOrBuilder getOpenInPhoneKeyListOrBuilder() {
            SEList sEList = this.openInPhoneKeyList_;
            return sEList == null ? SEList.getDefaultInstance() : sEList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAppRemoveNotif> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getOpenInPhoneKeyList()) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppRemoveNotifOrBuilder
        public boolean hasOpenInPhoneKeyList() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasOpenInPhoneKeyList()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getOpenInPhoneKeyList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEAppRemoveNotif_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAppRemoveNotif.class, Builder.class);
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
            if (hasOpenInPhoneKeyList()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getOpenInPhoneKeyList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEAppRemoveNotif(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAppRemoveNotif sEAppRemoveNotif) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAppRemoveNotif);
        }

        public static SEAppRemoveNotif parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAppRemoveNotif parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppRemoveNotif) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAppRemoveNotif parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAppRemoveNotif getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private SEAppRemoveNotif() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEAppRemoveNotif parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEAppRemoveNotif parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAppRemoveNotif parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEAppRemoveNotif parseFrom(InputStream inputStream) {
            return (SEAppRemoveNotif) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAppRemoveNotif parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppRemoveNotif) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAppRemoveNotif parseFrom(CodedInputStream codedInputStream) {
            return (SEAppRemoveNotif) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAppRemoveNotif parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppRemoveNotif) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAppRemoveNotifOrBuilder extends MessageOrBuilder {
        SEAppRemoveNotif.SEList getOpenInPhoneKeyList();

        SEAppRemoveNotif.SEListOrBuilder getOpenInPhoneKeyListOrBuilder();

        boolean hasOpenInPhoneKeyList();
    }

    public static final class SEAppSuperNotification extends GeneratedMessage implements SEAppSuperNotificationOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 2;
        private static final SEAppSuperNotification DEFAULT_INSTANCE;
        public static final int NOTIFICATION_STRING_LIST_FIELD_NUMBER = 4;
        public static final int NOTIFICATION_TYPE_FIELD_NUMBER = 1;
        public static final int PAGE_NAME_FIELD_NUMBER = 3;
        private static final Parser<SEAppSuperNotification> PARSER;
        private static final long serialVersionUID = 0;
        private volatile Object appName_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SENotificationString.SEList notificationStringList_;
        private int notificationType_;
        private volatile Object pageName_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEAppSuperNotification$1 */
        public class AnonymousClass1 extends AbstractParser<SEAppSuperNotification> {
            @Override // com.google.protobuf.Parser
            public SEAppSuperNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEAppSuperNotification.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEAppSuperNotificationOrBuilder {
            private Object appName_;
            private int bitField0_;
            private SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> notificationStringListBuilder_;
            private SENotificationString.SEList notificationStringList_;
            private int notificationType_;
            private Object pageName_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEAppSuperNotification sEAppSuperNotification) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEAppSuperNotification.notificationType_ = this.notificationType_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEAppSuperNotification.appName_ = this.appName_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEAppSuperNotification.pageName_ = this.pageName_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> singleFieldBuilder = this.notificationStringListBuilder_;
                    sEAppSuperNotification.notificationStringList_ = singleFieldBuilder == null ? this.notificationStringList_ : (SENotificationString.SEList) singleFieldBuilder.build();
                    i7 |= 8;
                }
                sEAppSuperNotification.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEAppSuperNotification_descriptor;
            }

            private SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> internalGetNotificationStringListFieldBuilder() {
                if (this.notificationStringListBuilder_ == null) {
                    this.notificationStringListBuilder_ = new SingleFieldBuilder<>(getNotificationStringList(), getParentForChildren(), isClean());
                    this.notificationStringList_ = null;
                }
                return this.notificationStringListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetNotificationStringListFieldBuilder();
                }
            }

            public Builder clearAppName() {
                this.appName_ = SEAppSuperNotification.getDefaultInstance().getAppName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearNotificationStringList() {
                this.bitField0_ &= -9;
                this.notificationStringList_ = null;
                SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> singleFieldBuilder = this.notificationStringListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.notificationStringListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearNotificationType() {
                this.bitField0_ &= -2;
                this.notificationType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPageName() {
                this.pageName_ = SEAppSuperNotification.getDefaultInstance().getPageName();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public String getAppName() {
                Object obj = this.appName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public ByteString getAppNameBytes() {
                Object obj = this.appName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEAppSuperNotification_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public SENotificationString.SEList getNotificationStringList() {
                SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> singleFieldBuilder = this.notificationStringListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SENotificationString.SEList) singleFieldBuilder.getMessage();
                }
                SENotificationString.SEList sEList = this.notificationStringList_;
                return sEList == null ? SENotificationString.SEList.getDefaultInstance() : sEList;
            }

            public SENotificationString.SEList.Builder getNotificationStringListBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SENotificationString.SEList.Builder) internalGetNotificationStringListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public SENotificationString.SEListOrBuilder getNotificationStringListOrBuilder() {
                SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> singleFieldBuilder = this.notificationStringListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SENotificationString.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SENotificationString.SEList sEList = this.notificationStringList_;
                return sEList == null ? SENotificationString.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public int getNotificationType() {
                return this.notificationType_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public String getPageName() {
                Object obj = this.pageName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.pageName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public ByteString getPageNameBytes() {
                Object obj = this.pageName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.pageName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public boolean hasAppName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public boolean hasNotificationStringList() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public boolean hasNotificationType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
            public boolean hasPageName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEAppSuperNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAppSuperNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasNotificationType() && hasAppName() && hasPageName() && hasNotificationStringList();
            }

            public Builder mergeNotificationStringList(SENotificationString.SEList sEList) {
                SENotificationString.SEList sEList2;
                SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> singleFieldBuilder = this.notificationStringListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 8) == 0 || (sEList2 = this.notificationStringList_) == null || sEList2 == SENotificationString.SEList.getDefaultInstance()) {
                    this.notificationStringList_ = sEList;
                } else {
                    getNotificationStringListBuilder().mergeFrom(sEList);
                }
                if (this.notificationStringList_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setAppName(String str) {
                str.getClass();
                this.appName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAppNameBytes(ByteString byteString) {
                byteString.getClass();
                this.appName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNotificationStringList(SENotificationString.SEList sEList) {
                SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> singleFieldBuilder = this.notificationStringListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.notificationStringList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNotificationType(int i7) {
                this.notificationType_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPageName(String str) {
                str.getClass();
                this.pageName_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPageNameBytes(ByteString byteString) {
                byteString.getClass();
                this.pageName_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.appName_ = "";
                this.pageName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAppSuperNotification build() {
                SEAppSuperNotification sEAppSuperNotificationBuildPartial = buildPartial();
                if (sEAppSuperNotificationBuildPartial.isInitialized()) {
                    return sEAppSuperNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEAppSuperNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEAppSuperNotification buildPartial() {
                SEAppSuperNotification sEAppSuperNotification = new SEAppSuperNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEAppSuperNotification);
                }
                onBuilt();
                return sEAppSuperNotification;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEAppSuperNotification getDefaultInstanceForType() {
                return SEAppSuperNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.notificationType_ = 0;
                this.appName_ = "";
                this.pageName_ = "";
                this.notificationStringList_ = null;
                SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> singleFieldBuilder = this.notificationStringListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.notificationStringListBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.appName_ = "";
                this.pageName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEAppSuperNotification) {
                    return mergeFrom((SEAppSuperNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setNotificationStringList(SENotificationString.SEList.Builder builder) {
                SingleFieldBuilder<SENotificationString.SEList, SENotificationString.SEList.Builder, SENotificationString.SEListOrBuilder> singleFieldBuilder = this.notificationStringListBuilder_;
                if (singleFieldBuilder == null) {
                    this.notificationStringList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEAppSuperNotification sEAppSuperNotification) {
                if (sEAppSuperNotification == SEAppSuperNotification.getDefaultInstance()) {
                    return this;
                }
                if (sEAppSuperNotification.hasNotificationType()) {
                    setNotificationType(sEAppSuperNotification.getNotificationType());
                }
                if (sEAppSuperNotification.hasAppName()) {
                    this.appName_ = sEAppSuperNotification.appName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEAppSuperNotification.hasPageName()) {
                    this.pageName_ = sEAppSuperNotification.pageName_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sEAppSuperNotification.hasNotificationStringList()) {
                    mergeNotificationStringList(sEAppSuperNotification.getNotificationStringList());
                }
                mergeUnknownFields(sEAppSuperNotification.getUnknownFields());
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
                                    this.notificationType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.appName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.pageName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetNotificationStringListFieldBuilder().getBuilder(), extensionRegistryLite);
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEAppSuperNotification");
            DEFAULT_INSTANCE = new SEAppSuperNotification();
            PARSER = new AbstractParser<SEAppSuperNotification>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotification.1
                @Override // com.google.protobuf.Parser
                public SEAppSuperNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEAppSuperNotification.newBuilder();
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

        public /* synthetic */ SEAppSuperNotification(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEAppSuperNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEAppSuperNotification_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEAppSuperNotification parseDelimitedFrom(InputStream inputStream) {
            return (SEAppSuperNotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEAppSuperNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEAppSuperNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEAppSuperNotification)) {
                return super.equals(obj);
            }
            SEAppSuperNotification sEAppSuperNotification = (SEAppSuperNotification) obj;
            if (hasNotificationType() != sEAppSuperNotification.hasNotificationType()) {
                return false;
            }
            if ((hasNotificationType() && getNotificationType() != sEAppSuperNotification.getNotificationType()) || hasAppName() != sEAppSuperNotification.hasAppName()) {
                return false;
            }
            if ((hasAppName() && !getAppName().equals(sEAppSuperNotification.getAppName())) || hasPageName() != sEAppSuperNotification.hasPageName()) {
                return false;
            }
            if ((!hasPageName() || getPageName().equals(sEAppSuperNotification.getPageName())) && hasNotificationStringList() == sEAppSuperNotification.hasNotificationStringList()) {
                return (!hasNotificationStringList() || getNotificationStringList().equals(sEAppSuperNotification.getNotificationStringList())) && getUnknownFields().equals(sEAppSuperNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEAppSuperNotification_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public SENotificationString.SEList getNotificationStringList() {
            SENotificationString.SEList sEList = this.notificationStringList_;
            return sEList == null ? SENotificationString.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public SENotificationString.SEListOrBuilder getNotificationStringListOrBuilder() {
            SENotificationString.SEList sEList = this.notificationStringList_;
            return sEList == null ? SENotificationString.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public int getNotificationType() {
            return this.notificationType_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public String getPageName() {
            Object obj = this.pageName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.pageName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public ByteString getPageNameBytes() {
            Object obj = this.pageName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pageName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEAppSuperNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.notificationType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(2, this.appName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += GeneratedMessage.computeStringSize(3, this.pageName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getNotificationStringList());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public boolean hasAppName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public boolean hasNotificationStringList() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public boolean hasNotificationType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEAppSuperNotificationOrBuilder
        public boolean hasPageName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasNotificationType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getNotificationType();
            }
            if (hasAppName()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAppName().hashCode();
            }
            if (hasPageName()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getPageName().hashCode();
            }
            if (hasNotificationStringList()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getNotificationStringList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEAppSuperNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SEAppSuperNotification.class, Builder.class);
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
            if (!hasNotificationType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAppName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPageName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasNotificationStringList()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.notificationType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.appName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.pageName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getNotificationStringList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEAppSuperNotification(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.notificationType_ = 0;
            this.appName_ = "";
            this.pageName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEAppSuperNotification sEAppSuperNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEAppSuperNotification);
        }

        public static SEAppSuperNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEAppSuperNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppSuperNotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAppSuperNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEAppSuperNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEAppSuperNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEAppSuperNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEAppSuperNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEAppSuperNotification() {
            this.notificationType_ = 0;
            this.appName_ = "";
            this.pageName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.appName_ = "";
            this.pageName_ = "";
        }

        public static SEAppSuperNotification parseFrom(InputStream inputStream) {
            return (SEAppSuperNotification) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEAppSuperNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppSuperNotification) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEAppSuperNotification parseFrom(CodedInputStream codedInputStream) {
            return (SEAppSuperNotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEAppSuperNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEAppSuperNotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEAppSuperNotificationOrBuilder extends MessageOrBuilder {
        String getAppName();

        ByteString getAppNameBytes();

        SENotificationString.SEList getNotificationStringList();

        SENotificationString.SEListOrBuilder getNotificationStringListOrBuilder();

        int getNotificationType();

        String getPageName();

        ByteString getPageNameBytes();

        boolean hasAppName();

        boolean hasNotificationStringList();

        boolean hasNotificationType();

        boolean hasPageName();
    }

    public enum SECallState implements ProtocolMessageEnum {
        ANSWER_PHONE(0),
        HANG_PHONE(1),
        MUTE(2);

        public static final int ANSWER_PHONE_VALUE = 0;
        public static final int HANG_PHONE_VALUE = 1;
        public static final int MUTE_VALUE = 2;
        private static final SECallState[] VALUES;
        private static final Internal.EnumLiteMap<SECallState> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SECallState$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SECallState> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SECallState findValueByNumber(int i7) {
                return SECallState.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SECallState");
            internalValueMap = new Internal.EnumLiteMap<SECallState>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SECallState.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SECallState findValueByNumber(int i7) {
                    return SECallState.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SECallState(int i7) {
            this.value = i7;
        }

        public static SECallState forNumber(int i7) {
            if (i7 == 0) {
                return ANSWER_PHONE;
            }
            if (i7 == 1) {
                return HANG_PHONE;
            }
            if (i7 != 2) {
                return null;
            }
            return MUTE;
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return NotificationProtos.getDescriptor().getEnumType(1);
        }

        public static Internal.EnumLiteMap<SECallState> internalGetValueMap() {
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
        public static SECallState valueOf(int i7) {
            return forNumber(i7);
        }

        public static SECallState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEContactInfo extends GeneratedMessage implements SEContactInfoOrBuilder {
        private static final SEContactInfo DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        private static final Parser<SEContactInfo> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object number_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEContactInfo$1 */
        public class AnonymousClass1 extends AbstractParser<SEContactInfo> {
            @Override // com.google.protobuf.Parser
            public SEContactInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEContactInfo.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEContactInfoOrBuilder {
            private int bitField0_;
            private Object name_;
            private Object number_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEContactInfo sEContactInfo) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEContactInfo.name_ = this.name_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEContactInfo.number_ = this.number_;
                    i7 |= 2;
                }
                sEContactInfo.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEContactInfo_descriptor;
            }

            public Builder clearName() {
                this.name_ = SEContactInfo.getDefaultInstance().getName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearNumber() {
                this.number_ = SEContactInfo.getDefaultInstance().getNumber();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEContactInfo_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
            public ByteString getNumberBytes() {
                Object obj = this.number_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.number_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
            public boolean hasNumber() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEContactInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContactInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasName() && hasNumber();
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

            public Builder setNumber(String str) {
                str.getClass();
                this.number_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.number_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.name_ = "";
                this.number_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContactInfo build() {
                SEContactInfo sEContactInfoBuildPartial = buildPartial();
                if (sEContactInfoBuildPartial.isInitialized()) {
                    return sEContactInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEContactInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContactInfo buildPartial() {
                SEContactInfo sEContactInfo = new SEContactInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEContactInfo);
                }
                onBuilt();
                return sEContactInfo;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEContactInfo getDefaultInstanceForType() {
                return SEContactInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.name_ = "";
                this.number_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.number_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEContactInfo) {
                    return mergeFrom((SEContactInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEContactInfo sEContactInfo) {
                if (sEContactInfo == SEContactInfo.getDefaultInstance()) {
                    return this;
                }
                if (sEContactInfo.hasName()) {
                    this.name_ = sEContactInfo.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEContactInfo.hasNumber()) {
                    this.number_ = sEContactInfo.number_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(sEContactInfo.getUnknownFields());
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
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.number_ = codedInputStream.readBytes();
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

        public static final class List extends GeneratedMessage implements ListOrBuilder {
            public static final int CURRENT_SEGMENT_FIELD_NUMBER = 2;
            private static final List DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<List> PARSER;
            public static final int SUPPORT_MAX_NUMBER_FIELD_NUMBER = 4;
            public static final int TOTAL_SEGMENT_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int currentSegment_;
            private java.util.List<SEContactInfo> list_;
            private byte memoizedIsInitialized;
            private int supportMaxNumber_;
            private int totalSegment_;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEContactInfo$List$1 */
            public class AnonymousClass1 extends AbstractParser<List> {
                @Override // com.google.protobuf.Parser
                public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = List.newBuilder();
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

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ListOrBuilder {
                private int bitField0_;
                private int currentSegment_;
                private RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> listBuilder_;
                private java.util.List<SEContactInfo> list_;
                private int supportMaxNumber_;
                private int totalSegment_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                    this(builderParent);
                }

                private void buildPartial0(List list) {
                    int i7;
                    int i8 = this.bitField0_;
                    if ((i8 & 2) != 0) {
                        list.supportMaxNumber_ = this.supportMaxNumber_;
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if ((i8 & 4) != 0) {
                        list.currentSegment_ = this.currentSegment_;
                        i7 |= 2;
                    }
                    if ((i8 & 8) != 0) {
                        list.totalSegment_ = this.totalSegment_;
                        i7 |= 4;
                    }
                    list.bitField0_ |= i7;
                }

                private void buildPartialRepeatedFields(List list) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        list.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    list.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NotificationProtos.internal_static_SA_SEContactInfo_List_descriptor;
                }

                private RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEContactInfo> iterable) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (java.util.List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEContactInfo sEContactInfo) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEContactInfo);
                        return this;
                    }
                    sEContactInfo.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEContactInfo);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEContactInfo.getDefaultInstance());
                }

                public Builder clearCurrentSegment() {
                    this.bitField0_ &= -5;
                    this.currentSegment_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.clear();
                        return this;
                    }
                    this.list_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSupportMaxNumber() {
                    this.bitField0_ &= -3;
                    this.supportMaxNumber_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearTotalSegment() {
                    this.bitField0_ &= -9;
                    this.totalSegment_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public int getCurrentSegment() {
                    return this.currentSegment_;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return NotificationProtos.internal_static_SA_SEContactInfo_List_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public SEContactInfo getList(int i7) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEContactInfo) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public java.util.List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public java.util.List<SEContactInfo> getListList() {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public SEContactInfoOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEContactInfoOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public java.util.List<? extends SEContactInfoOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public int getSupportMaxNumber() {
                    return this.supportMaxNumber_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public int getTotalSegment() {
                    return this.totalSegment_;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public boolean hasCurrentSegment() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public boolean hasSupportMaxNumber() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
                public boolean hasTotalSegment() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_SA_SEContactInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setCurrentSegment(int i7) {
                    this.currentSegment_ = i7;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEContactInfo sEContactInfo) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEContactInfo);
                        return this;
                    }
                    sEContactInfo.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEContactInfo);
                    onChanged();
                    return this;
                }

                public Builder setSupportMaxNumber(int i7) {
                    this.supportMaxNumber_ = i7;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setTotalSegment(int i7) {
                    this.totalSegment_ = i7;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(k kVar) {
                    this();
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
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
                    List list = new List(this);
                    buildPartialRepeatedFields(list);
                    if (this.bitField0_ != 0) {
                        buildPartial0(list);
                    }
                    onBuilt();
                    return list;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public List getDefaultInstanceForType() {
                    return List.getDefaultInstance();
                }

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEContactInfo.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    this.supportMaxNumber_ = 0;
                    this.currentSegment_ = 0;
                    this.totalSegment_ = 0;
                    return this;
                }

                public Builder addList(int i7, SEContactInfo sEContactInfo) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEContactInfo.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEContactInfo);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEContactInfo);
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof List) {
                        return mergeFrom((List) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
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
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(list.list_);
                        }
                    }
                    if (list.hasSupportMaxNumber()) {
                        setSupportMaxNumber(list.getSupportMaxNumber());
                    }
                    if (list.hasCurrentSegment()) {
                        setCurrentSegment(list.getCurrentSegment());
                    }
                    if (list.hasTotalSegment()) {
                        setTotalSegment(list.getTotalSegment());
                    }
                    mergeUnknownFields(list.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                    if (tag == 10) {
                                        SEContactInfo sEContactInfo = (SEContactInfo) codedInputStream.readMessage(SEContactInfo.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEContactInfo, Builder, SEContactInfoOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEContactInfo);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEContactInfo);
                                        }
                                    } else if (tag == 16) {
                                        this.currentSegment_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 4;
                                    } else if (tag == 24) {
                                        this.totalSegment_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 8;
                                    } else if (tag != 32) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.supportMaxNumber_ = codedInputStream.readUInt32();
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", MessageLiteToString.f20028a);
                DEFAULT_INSTANCE = new List();
                PARSER = new AbstractParser<List>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.List.1
                    @Override // com.google.protobuf.Parser
                    public List parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = List.newBuilder();
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

            public /* synthetic */ List(GeneratedMessage.Builder builder, k kVar) {
                this(builder);
            }

            public static List getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEContactInfo_List_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static List parseDelimitedFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
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
                if (!getListList().equals(list.getListList()) || hasSupportMaxNumber() != list.hasSupportMaxNumber()) {
                    return false;
                }
                if ((hasSupportMaxNumber() && getSupportMaxNumber() != list.getSupportMaxNumber()) || hasCurrentSegment() != list.hasCurrentSegment()) {
                    return false;
                }
                if ((!hasCurrentSegment() || getCurrentSegment() == list.getCurrentSegment()) && hasTotalSegment() == list.hasTotalSegment()) {
                    return (!hasTotalSegment() || getTotalSegment() == list.getTotalSegment()) && getUnknownFields().equals(list.getUnknownFields());
                }
                return false;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public int getCurrentSegment() {
                return this.currentSegment_;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEContactInfo_List_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public SEContactInfo getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public java.util.List<SEContactInfo> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public SEContactInfoOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public java.util.List<? extends SEContactInfoOrBuilder> getListOrBuilderList() {
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
                int size = this.list_.size();
                int iComputeMessageSizeNoTag = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    iComputeMessageSizeNoTag += CodedOutputStream.computeMessageSizeNoTag(this.list_.get(i8));
                }
                int iComputeUInt32Size = iComputeMessageSizeNoTag + size;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.currentSegment_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.totalSegment_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.supportMaxNumber_);
                }
                int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public int getSupportMaxNumber() {
                return this.supportMaxNumber_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public int getTotalSegment() {
                return this.totalSegment_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public boolean hasCurrentSegment() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public boolean hasSupportMaxNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.ListOrBuilder
            public boolean hasTotalSegment() {
                return (this.bitField0_ & 4) != 0;
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
                if (hasSupportMaxNumber()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getSupportMaxNumber();
                }
                if (hasCurrentSegment()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getCurrentSegment();
                }
                if (hasTotalSegment()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getTotalSegment();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEContactInfo_List_fieldAccessorTable.ensureFieldAccessorsInitialized(List.class, Builder.class);
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
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeUInt32(2, this.currentSegment_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeUInt32(3, this.totalSegment_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeUInt32(4, this.supportMaxNumber_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private List(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.supportMaxNumber_ = 0;
                this.currentSegment_ = 0;
                this.totalSegment_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(List list) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(list);
            }

            public static List parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static List parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public List getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static List parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static List parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractMessage
            public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static List parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            private List() {
                this.supportMaxNumber_ = 0;
                this.currentSegment_ = 0;
                this.totalSegment_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static List parseFrom(InputStream inputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static List parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static List parseFrom(CodedInputStream codedInputStream) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static List parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (List) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ListOrBuilder extends MessageOrBuilder {
            int getCurrentSegment();

            SEContactInfo getList(int i7);

            int getListCount();

            java.util.List<SEContactInfo> getListList();

            SEContactInfoOrBuilder getListOrBuilder(int i7);

            java.util.List<? extends SEContactInfoOrBuilder> getListOrBuilderList();

            int getSupportMaxNumber();

            int getTotalSegment();

            boolean hasCurrentSegment();

            boolean hasSupportMaxNumber();

            boolean hasTotalSegment();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEContactInfo");
            DEFAULT_INSTANCE = new SEContactInfo();
            PARSER = new AbstractParser<SEContactInfo>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfo.1
                @Override // com.google.protobuf.Parser
                public SEContactInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEContactInfo.newBuilder();
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

        public /* synthetic */ SEContactInfo(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEContactInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEContactInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEContactInfo parseDelimitedFrom(InputStream inputStream) {
            return (SEContactInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEContactInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEContactInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEContactInfo)) {
                return super.equals(obj);
            }
            SEContactInfo sEContactInfo = (SEContactInfo) obj;
            if (hasName() != sEContactInfo.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(sEContactInfo.getName())) && hasNumber() == sEContactInfo.hasNumber()) {
                return (!hasNumber() || getNumber().equals(sEContactInfo.getNumber())) && getUnknownFields().equals(sEContactInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEContactInfo_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
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
        public Parser<SEContactInfo> getParserForType() {
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
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.number_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactInfoOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getNumber().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEContactInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContactInfo.class, Builder.class);
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
            if (hasNumber()) {
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
                GeneratedMessage.writeString(codedOutputStream, 2, this.number_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEContactInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.number_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEContactInfo sEContactInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEContactInfo);
        }

        public static SEContactInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEContactInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContactInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEContactInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEContactInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEContactInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEContactInfo() {
            this.name_ = "";
            this.number_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.number_ = "";
        }

        public static SEContactInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEContactInfo parseFrom(InputStream inputStream) {
            return (SEContactInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEContactInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContactInfo parseFrom(CodedInputStream codedInputStream) {
            return (SEContactInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEContactInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactInfo) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEContactInfoOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        String getNumber();

        ByteString getNumberBytes();

        boolean hasName();

        boolean hasNumber();
    }

    public static final class SEContacts extends GeneratedMessage implements SEContactsOrBuilder {
        public static final int CONTACTS_NAME_FIELD_NUMBER = 1;
        public static final int CONTACTS_NUMBER_FIELD_NUMBER = 2;
        public static final int CONTACTS_SEQUENCE_FIELD_NUMBER = 3;
        private static final SEContacts DEFAULT_INSTANCE;
        private static final Parser<SEContacts> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object contactsName_;
        private volatile Object contactsNumber_;
        private int contactsSequence_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEContacts$1 */
        public class AnonymousClass1 extends AbstractParser<SEContacts> {
            @Override // com.google.protobuf.Parser
            public SEContacts parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEContacts.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEContactsOrBuilder {
            private int bitField0_;
            private Object contactsName_;
            private Object contactsNumber_;
            private int contactsSequence_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEContacts sEContacts) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEContacts.contactsName_ = this.contactsName_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEContacts.contactsNumber_ = this.contactsNumber_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEContacts.contactsSequence_ = this.contactsSequence_;
                    i7 |= 4;
                }
                sEContacts.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEContacts_descriptor;
            }

            public Builder clearContactsName() {
                this.contactsName_ = SEContacts.getDefaultInstance().getContactsName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearContactsNumber() {
                this.contactsNumber_ = SEContacts.getDefaultInstance().getContactsNumber();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearContactsSequence() {
                this.bitField0_ &= -5;
                this.contactsSequence_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
            public String getContactsName() {
                Object obj = this.contactsName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contactsName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
            public ByteString getContactsNameBytes() {
                Object obj = this.contactsName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contactsName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
            public String getContactsNumber() {
                Object obj = this.contactsNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contactsNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
            public ByteString getContactsNumberBytes() {
                Object obj = this.contactsNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contactsNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
            public int getContactsSequence() {
                return this.contactsSequence_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEContacts_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
            public boolean hasContactsName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
            public boolean hasContactsNumber() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
            public boolean hasContactsSequence() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEContacts_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContacts.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setContactsName(String str) {
                str.getClass();
                this.contactsName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setContactsNameBytes(ByteString byteString) {
                byteString.getClass();
                this.contactsName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setContactsNumber(String str) {
                str.getClass();
                this.contactsNumber_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setContactsNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.contactsNumber_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setContactsSequence(int i7) {
                this.contactsSequence_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.contactsName_ = "";
                this.contactsNumber_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContacts build() {
                SEContacts sEContactsBuildPartial = buildPartial();
                if (sEContactsBuildPartial.isInitialized()) {
                    return sEContactsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEContactsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContacts buildPartial() {
                SEContacts sEContacts = new SEContacts(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEContacts);
                }
                onBuilt();
                return sEContacts;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEContacts getDefaultInstanceForType() {
                return SEContacts.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.contactsName_ = "";
                this.contactsNumber_ = "";
                this.contactsSequence_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.contactsName_ = "";
                this.contactsNumber_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEContacts) {
                    return mergeFrom((SEContacts) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEContacts sEContacts) {
                if (sEContacts == SEContacts.getDefaultInstance()) {
                    return this;
                }
                if (sEContacts.hasContactsName()) {
                    this.contactsName_ = sEContacts.contactsName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEContacts.hasContactsNumber()) {
                    this.contactsNumber_ = sEContacts.contactsNumber_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEContacts.hasContactsSequence()) {
                    setContactsSequence(sEContacts.getContactsSequence());
                }
                mergeUnknownFields(sEContacts.getUnknownFields());
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
                                    this.contactsName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.contactsNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.contactsSequence_ = codedInputStream.readUInt32();
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEContacts> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEContacts$SEList$1 */
            public class AnonymousClass1 extends AbstractParser<SEList> {
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
                private RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> listBuilder_;
                private List<SEContacts> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        sEList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    sEList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NotificationProtos.internal_static_SA_SEContacts_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEContacts> iterable) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEContacts sEContacts) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEContacts);
                        return this;
                    }
                    sEContacts.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEContacts);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEContacts.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return NotificationProtos.internal_static_SA_SEContacts_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
                public SEContacts getList(int i7) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEContacts) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
                public List<SEContacts> getListList() {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
                public SEContactsOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEContactsOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
                public List<? extends SEContactsOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_SA_SEContacts_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder removeList(int i7) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEContacts sEContacts) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEContacts);
                        return this;
                    }
                    sEContacts.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEContacts);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(k kVar) {
                    this();
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
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
                    buildPartialRepeatedFields(sEList);
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

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEContacts.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEContacts sEContacts) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEContacts.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEContacts);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEContacts);
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

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(SEList sEList) {
                    if (sEList == SEList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!sEList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = sEList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(sEList.list_);
                            }
                            onChanged();
                        }
                    } else if (!sEList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = sEList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(sEList.list_);
                        }
                    }
                    mergeUnknownFields(sEList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEContacts sEContacts = (SEContacts) codedInputStream.readMessage(SEContacts.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEContacts, Builder, SEContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEContacts);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEContacts);
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, k kVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEContacts_SEList_descriptor;
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
                return getListList().equals(sEList.getListList()) && getUnknownFields().equals(sEList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEContacts_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
            public SEContacts getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
            public List<SEContacts> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
            public SEContactsOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.SEListOrBuilder
            public List<? extends SEContactsOrBuilder> getListOrBuilderList() {
                return this.list_;
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
                return NotificationProtos.internal_static_SA_SEContacts_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    codedOutputStream.writeMessage(1, this.list_.get(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
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

            private SEList() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
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
            SEContacts getList(int i7);

            int getListCount();

            List<SEContacts> getListList();

            SEContactsOrBuilder getListOrBuilder(int i7);

            List<? extends SEContactsOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEContacts");
            DEFAULT_INSTANCE = new SEContacts();
            PARSER = new AbstractParser<SEContacts>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContacts.1
                @Override // com.google.protobuf.Parser
                public SEContacts parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEContacts.newBuilder();
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

        public /* synthetic */ SEContacts(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEContacts getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEContacts_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEContacts parseDelimitedFrom(InputStream inputStream) {
            return (SEContacts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEContacts parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEContacts> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEContacts)) {
                return super.equals(obj);
            }
            SEContacts sEContacts = (SEContacts) obj;
            if (hasContactsName() != sEContacts.hasContactsName()) {
                return false;
            }
            if ((hasContactsName() && !getContactsName().equals(sEContacts.getContactsName())) || hasContactsNumber() != sEContacts.hasContactsNumber()) {
                return false;
            }
            if ((!hasContactsNumber() || getContactsNumber().equals(sEContacts.getContactsNumber())) && hasContactsSequence() == sEContacts.hasContactsSequence()) {
                return (!hasContactsSequence() || getContactsSequence() == sEContacts.getContactsSequence()) && getUnknownFields().equals(sEContacts.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
        public String getContactsName() {
            Object obj = this.contactsName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.contactsName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
        public ByteString getContactsNameBytes() {
            Object obj = this.contactsName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contactsName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
        public String getContactsNumber() {
            Object obj = this.contactsNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.contactsNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
        public ByteString getContactsNumberBytes() {
            Object obj = this.contactsNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contactsNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
        public int getContactsSequence() {
            return this.contactsSequence_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEContacts_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEContacts> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.contactsName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.contactsNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.contactsSequence_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
        public boolean hasContactsName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
        public boolean hasContactsNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsOrBuilder
        public boolean hasContactsSequence() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasContactsName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getContactsName().hashCode();
            }
            if (hasContactsNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getContactsNumber().hashCode();
            }
            if (hasContactsSequence()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getContactsSequence();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEContacts_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContacts.class, Builder.class);
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
                GeneratedMessage.writeString(codedOutputStream, 1, this.contactsName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.contactsNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.contactsSequence_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEContacts(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.contactsName_ = "";
            this.contactsNumber_ = "";
            this.contactsSequence_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEContacts sEContacts) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEContacts);
        }

        public static SEContacts parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEContacts parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContacts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContacts parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEContacts getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEContacts parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEContacts parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEContacts parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SEContacts() {
            this.contactsName_ = "";
            this.contactsNumber_ = "";
            this.contactsSequence_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.contactsName_ = "";
            this.contactsNumber_ = "";
        }

        public static SEContacts parseFrom(InputStream inputStream) {
            return (SEContacts) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEContacts parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContacts) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContacts parseFrom(CodedInputStream codedInputStream) {
            return (SEContacts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEContacts parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContacts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SEContactsAvatar extends GeneratedMessage implements SEContactsAvatarOrBuilder {
        public static final int CONTACTS_AVATAR_EXIST_FIELD_NUMBER = 5;
        public static final int CONTACTS_AVATAR_NAME_FIELD_NUMBER = 4;
        public static final int CONTACTS_NAME_FIELD_NUMBER = 1;
        public static final int CONTACTS_NUMBER_FIELD_NUMBER = 2;
        public static final int CONTACTS_SEQUENCE_FIELD_NUMBER = 3;
        private static final SEContactsAvatar DEFAULT_INSTANCE;
        private static final Parser<SEContactsAvatar> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean contactsAvatarExist_;
        private volatile Object contactsAvatarName_;
        private volatile Object contactsName_;
        private volatile Object contactsNumber_;
        private int contactsSequence_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEContactsAvatar$1 */
        public class AnonymousClass1 extends AbstractParser<SEContactsAvatar> {
            @Override // com.google.protobuf.Parser
            public SEContactsAvatar parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEContactsAvatar.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEContactsAvatarOrBuilder {
            private int bitField0_;
            private boolean contactsAvatarExist_;
            private Object contactsAvatarName_;
            private Object contactsName_;
            private Object contactsNumber_;
            private int contactsSequence_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEContactsAvatar sEContactsAvatar) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEContactsAvatar.contactsName_ = this.contactsName_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEContactsAvatar.contactsNumber_ = this.contactsNumber_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEContactsAvatar.contactsSequence_ = this.contactsSequence_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEContactsAvatar.contactsAvatarName_ = this.contactsAvatarName_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEContactsAvatar.contactsAvatarExist_ = this.contactsAvatarExist_;
                    i7 |= 16;
                }
                sEContactsAvatar.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEContactsAvatar_descriptor;
            }

            public Builder clearContactsAvatarExist() {
                this.bitField0_ &= -17;
                this.contactsAvatarExist_ = false;
                onChanged();
                return this;
            }

            public Builder clearContactsAvatarName() {
                this.contactsAvatarName_ = SEContactsAvatar.getDefaultInstance().getContactsAvatarName();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearContactsName() {
                this.contactsName_ = SEContactsAvatar.getDefaultInstance().getContactsName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearContactsNumber() {
                this.contactsNumber_ = SEContactsAvatar.getDefaultInstance().getContactsNumber();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearContactsSequence() {
                this.bitField0_ &= -5;
                this.contactsSequence_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public boolean getContactsAvatarExist() {
                return this.contactsAvatarExist_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public String getContactsAvatarName() {
                Object obj = this.contactsAvatarName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contactsAvatarName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public ByteString getContactsAvatarNameBytes() {
                Object obj = this.contactsAvatarName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contactsAvatarName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public String getContactsName() {
                Object obj = this.contactsName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contactsName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public ByteString getContactsNameBytes() {
                Object obj = this.contactsName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contactsName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public String getContactsNumber() {
                Object obj = this.contactsNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contactsNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public ByteString getContactsNumberBytes() {
                Object obj = this.contactsNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contactsNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public int getContactsSequence() {
                return this.contactsSequence_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEContactsAvatar_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public boolean hasContactsAvatarExist() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public boolean hasContactsAvatarName() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public boolean hasContactsName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public boolean hasContactsNumber() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
            public boolean hasContactsSequence() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEContactsAvatar_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContactsAvatar.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setContactsAvatarExist(boolean z6) {
                this.contactsAvatarExist_ = z6;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setContactsAvatarName(String str) {
                str.getClass();
                this.contactsAvatarName_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setContactsAvatarNameBytes(ByteString byteString) {
                byteString.getClass();
                this.contactsAvatarName_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setContactsName(String str) {
                str.getClass();
                this.contactsName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setContactsNameBytes(ByteString byteString) {
                byteString.getClass();
                this.contactsName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setContactsNumber(String str) {
                str.getClass();
                this.contactsNumber_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setContactsNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.contactsNumber_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setContactsSequence(int i7) {
                this.contactsSequence_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.contactsName_ = "";
                this.contactsNumber_ = "";
                this.contactsAvatarName_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContactsAvatar build() {
                SEContactsAvatar sEContactsAvatarBuildPartial = buildPartial();
                if (sEContactsAvatarBuildPartial.isInitialized()) {
                    return sEContactsAvatarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEContactsAvatarBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContactsAvatar buildPartial() {
                SEContactsAvatar sEContactsAvatar = new SEContactsAvatar(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEContactsAvatar);
                }
                onBuilt();
                return sEContactsAvatar;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEContactsAvatar getDefaultInstanceForType() {
                return SEContactsAvatar.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.contactsName_ = "";
                this.contactsNumber_ = "";
                this.contactsSequence_ = 0;
                this.contactsAvatarName_ = "";
                this.contactsAvatarExist_ = false;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.contactsName_ = "";
                this.contactsNumber_ = "";
                this.contactsAvatarName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEContactsAvatar) {
                    return mergeFrom((SEContactsAvatar) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEContactsAvatar sEContactsAvatar) {
                if (sEContactsAvatar == SEContactsAvatar.getDefaultInstance()) {
                    return this;
                }
                if (sEContactsAvatar.hasContactsName()) {
                    this.contactsName_ = sEContactsAvatar.contactsName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEContactsAvatar.hasContactsNumber()) {
                    this.contactsNumber_ = sEContactsAvatar.contactsNumber_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sEContactsAvatar.hasContactsSequence()) {
                    setContactsSequence(sEContactsAvatar.getContactsSequence());
                }
                if (sEContactsAvatar.hasContactsAvatarName()) {
                    this.contactsAvatarName_ = sEContactsAvatar.contactsAvatarName_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sEContactsAvatar.hasContactsAvatarExist()) {
                    setContactsAvatarExist(sEContactsAvatar.getContactsAvatarExist());
                }
                mergeUnknownFields(sEContactsAvatar.getUnknownFields());
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
                                    this.contactsName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.contactsNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.contactsSequence_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.contactsAvatarName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag != 40) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.contactsAvatarExist_ = codedInputStream.readBool();
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEContactsAvatar> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEContactsAvatar$SEList$1 */
            public class AnonymousClass1 extends AbstractParser<SEList> {
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
                private RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> listBuilder_;
                private List<SEContactsAvatar> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        sEList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    sEList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NotificationProtos.internal_static_SA_SEContactsAvatar_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEContactsAvatar> iterable) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEContactsAvatar sEContactsAvatar) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEContactsAvatar);
                        return this;
                    }
                    sEContactsAvatar.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEContactsAvatar);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEContactsAvatar.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return NotificationProtos.internal_static_SA_SEContactsAvatar_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
                public SEContactsAvatar getList(int i7) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEContactsAvatar) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
                public List<SEContactsAvatar> getListList() {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
                public SEContactsAvatarOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEContactsAvatarOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
                public List<? extends SEContactsAvatarOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_SA_SEContactsAvatar_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder removeList(int i7) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEContactsAvatar sEContactsAvatar) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEContactsAvatar);
                        return this;
                    }
                    sEContactsAvatar.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEContactsAvatar);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(k kVar) {
                    this();
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
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
                    buildPartialRepeatedFields(sEList);
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

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEContactsAvatar.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEContactsAvatar sEContactsAvatar) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEContactsAvatar.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEContactsAvatar);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEContactsAvatar);
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

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(SEList sEList) {
                    if (sEList == SEList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!sEList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = sEList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(sEList.list_);
                            }
                            onChanged();
                        }
                    } else if (!sEList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = sEList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(sEList.list_);
                        }
                    }
                    mergeUnknownFields(sEList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEContactsAvatar sEContactsAvatar = (SEContactsAvatar) codedInputStream.readMessage(SEContactsAvatar.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEContactsAvatar, Builder, SEContactsAvatarOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEContactsAvatar);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEContactsAvatar);
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, k kVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEContactsAvatar_SEList_descriptor;
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
                return getListList().equals(sEList.getListList()) && getUnknownFields().equals(sEList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEContactsAvatar_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
            public SEContactsAvatar getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
            public List<SEContactsAvatar> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
            public SEContactsAvatarOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.SEListOrBuilder
            public List<? extends SEContactsAvatarOrBuilder> getListOrBuilderList() {
                return this.list_;
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
                return NotificationProtos.internal_static_SA_SEContactsAvatar_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    codedOutputStream.writeMessage(1, this.list_.get(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
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

            private SEList() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
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
            SEContactsAvatar getList(int i7);

            int getListCount();

            List<SEContactsAvatar> getListList();

            SEContactsAvatarOrBuilder getListOrBuilder(int i7);

            List<? extends SEContactsAvatarOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEContactsAvatar");
            DEFAULT_INSTANCE = new SEContactsAvatar();
            PARSER = new AbstractParser<SEContactsAvatar>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatar.1
                @Override // com.google.protobuf.Parser
                public SEContactsAvatar parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEContactsAvatar.newBuilder();
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

        public /* synthetic */ SEContactsAvatar(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEContactsAvatar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEContactsAvatar_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEContactsAvatar parseDelimitedFrom(InputStream inputStream) {
            return (SEContactsAvatar) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEContactsAvatar parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEContactsAvatar> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEContactsAvatar)) {
                return super.equals(obj);
            }
            SEContactsAvatar sEContactsAvatar = (SEContactsAvatar) obj;
            if (hasContactsName() != sEContactsAvatar.hasContactsName()) {
                return false;
            }
            if ((hasContactsName() && !getContactsName().equals(sEContactsAvatar.getContactsName())) || hasContactsNumber() != sEContactsAvatar.hasContactsNumber()) {
                return false;
            }
            if ((hasContactsNumber() && !getContactsNumber().equals(sEContactsAvatar.getContactsNumber())) || hasContactsSequence() != sEContactsAvatar.hasContactsSequence()) {
                return false;
            }
            if ((hasContactsSequence() && getContactsSequence() != sEContactsAvatar.getContactsSequence()) || hasContactsAvatarName() != sEContactsAvatar.hasContactsAvatarName()) {
                return false;
            }
            if ((!hasContactsAvatarName() || getContactsAvatarName().equals(sEContactsAvatar.getContactsAvatarName())) && hasContactsAvatarExist() == sEContactsAvatar.hasContactsAvatarExist()) {
                return (!hasContactsAvatarExist() || getContactsAvatarExist() == sEContactsAvatar.getContactsAvatarExist()) && getUnknownFields().equals(sEContactsAvatar.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public boolean getContactsAvatarExist() {
            return this.contactsAvatarExist_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public String getContactsAvatarName() {
            Object obj = this.contactsAvatarName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.contactsAvatarName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public ByteString getContactsAvatarNameBytes() {
            Object obj = this.contactsAvatarName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contactsAvatarName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public String getContactsName() {
            Object obj = this.contactsName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.contactsName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public ByteString getContactsNameBytes() {
            Object obj = this.contactsName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contactsName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public String getContactsNumber() {
            Object obj = this.contactsNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.contactsNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public ByteString getContactsNumberBytes() {
            Object obj = this.contactsNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contactsNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public int getContactsSequence() {
            return this.contactsSequence_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEContactsAvatar_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEContactsAvatar> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.contactsName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.contactsNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.contactsSequence_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.contactsAvatarName_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(5, this.contactsAvatarExist_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public boolean hasContactsAvatarExist() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public boolean hasContactsAvatarName() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public boolean hasContactsName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public boolean hasContactsNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarOrBuilder
        public boolean hasContactsSequence() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasContactsName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getContactsName().hashCode();
            }
            if (hasContactsNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getContactsNumber().hashCode();
            }
            if (hasContactsSequence()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getContactsSequence();
            }
            if (hasContactsAvatarName()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getContactsAvatarName().hashCode();
            }
            if (hasContactsAvatarExist()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getContactsAvatarExist());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEContactsAvatar_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContactsAvatar.class, Builder.class);
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
                GeneratedMessage.writeString(codedOutputStream, 1, this.contactsName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.contactsNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.contactsSequence_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.contactsAvatarName_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.contactsAvatarExist_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEContactsAvatar(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.contactsName_ = "";
            this.contactsNumber_ = "";
            this.contactsSequence_ = 0;
            this.contactsAvatarName_ = "";
            this.contactsAvatarExist_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEContactsAvatar sEContactsAvatar) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEContactsAvatar);
        }

        public static SEContactsAvatar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEContactsAvatar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactsAvatar) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContactsAvatar parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEContactsAvatar getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEContactsAvatar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEContactsAvatar parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEContactsAvatar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEContactsAvatar parseFrom(InputStream inputStream) {
            return (SEContactsAvatar) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEContactsAvatar() {
            this.contactsName_ = "";
            this.contactsNumber_ = "";
            this.contactsSequence_ = 0;
            this.contactsAvatarName_ = "";
            this.contactsAvatarExist_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.contactsName_ = "";
            this.contactsNumber_ = "";
            this.contactsAvatarName_ = "";
        }

        public static SEContactsAvatar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactsAvatar) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContactsAvatar parseFrom(CodedInputStream codedInputStream) {
            return (SEContactsAvatar) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEContactsAvatar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactsAvatar) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SEContactsAvatarData extends GeneratedMessage implements SEContactsAvatarDataOrBuilder {
        public static final int AVATAR_HIGHT_FIELD_NUMBER = 1;
        public static final int AVATAR_RULE_FIELD_NUMBER = 3;
        public static final int AVATAR_WIDTH_FIELD_NUMBER = 2;
        public static final int CONTACTS_AVATAR_LIST_FIELD_NUMBER = 5;
        private static final SEContactsAvatarData DEFAULT_INSTANCE;
        public static final int MAX_AVATAR_COUNT_FIELD_NUMBER = 4;
        private static final Parser<SEContactsAvatarData> PARSER;
        private static final long serialVersionUID = 0;
        private int avatarHight_;
        private int avatarRule_;
        private int avatarWidth_;
        private int bitField0_;
        private SEContactsAvatar.SEList contactsAvatarList_;
        private int maxAvatarCount_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEContactsAvatarData$1 */
        public class AnonymousClass1 extends AbstractParser<SEContactsAvatarData> {
            @Override // com.google.protobuf.Parser
            public SEContactsAvatarData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEContactsAvatarData.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEContactsAvatarDataOrBuilder {
            private int avatarHight_;
            private int avatarRule_;
            private int avatarWidth_;
            private int bitField0_;
            private SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> contactsAvatarListBuilder_;
            private SEContactsAvatar.SEList contactsAvatarList_;
            private int maxAvatarCount_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEContactsAvatarData sEContactsAvatarData) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEContactsAvatarData.avatarHight_ = this.avatarHight_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEContactsAvatarData.avatarWidth_ = this.avatarWidth_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEContactsAvatarData.avatarRule_ = this.avatarRule_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sEContactsAvatarData.maxAvatarCount_ = this.maxAvatarCount_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                    sEContactsAvatarData.contactsAvatarList_ = singleFieldBuilder == null ? this.contactsAvatarList_ : (SEContactsAvatar.SEList) singleFieldBuilder.build();
                    i7 |= 16;
                }
                sEContactsAvatarData.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEContactsAvatarData_descriptor;
            }

            private SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> internalGetContactsAvatarListFieldBuilder() {
                if (this.contactsAvatarListBuilder_ == null) {
                    this.contactsAvatarListBuilder_ = new SingleFieldBuilder<>(getContactsAvatarList(), getParentForChildren(), isClean());
                    this.contactsAvatarList_ = null;
                }
                return this.contactsAvatarListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetContactsAvatarListFieldBuilder();
                }
            }

            public Builder clearAvatarHight() {
                this.bitField0_ &= -2;
                this.avatarHight_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvatarRule() {
                this.bitField0_ &= -5;
                this.avatarRule_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvatarWidth() {
                this.bitField0_ &= -3;
                this.avatarWidth_ = 0;
                onChanged();
                return this;
            }

            public Builder clearContactsAvatarList() {
                this.bitField0_ &= -17;
                this.contactsAvatarList_ = null;
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.contactsAvatarListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMaxAvatarCount() {
                this.bitField0_ &= -9;
                this.maxAvatarCount_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public int getAvatarHight() {
                return this.avatarHight_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public int getAvatarRule() {
                return this.avatarRule_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public int getAvatarWidth() {
                return this.avatarWidth_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public SEContactsAvatar.SEList getContactsAvatarList() {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEContactsAvatar.SEList) singleFieldBuilder.getMessage();
                }
                SEContactsAvatar.SEList sEList = this.contactsAvatarList_;
                return sEList == null ? SEContactsAvatar.SEList.getDefaultInstance() : sEList;
            }

            public SEContactsAvatar.SEList.Builder getContactsAvatarListBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SEContactsAvatar.SEList.Builder) internalGetContactsAvatarListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public SEContactsAvatar.SEListOrBuilder getContactsAvatarListOrBuilder() {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEContactsAvatar.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEContactsAvatar.SEList sEList = this.contactsAvatarList_;
                return sEList == null ? SEContactsAvatar.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEContactsAvatarData_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public int getMaxAvatarCount() {
                return this.maxAvatarCount_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public boolean hasAvatarHight() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public boolean hasAvatarRule() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public boolean hasAvatarWidth() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public boolean hasContactsAvatarList() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
            public boolean hasMaxAvatarCount() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEContactsAvatarData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContactsAvatarData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAvatarHight() && hasAvatarWidth() && hasAvatarRule() && hasMaxAvatarCount() && hasContactsAvatarList();
            }

            public Builder mergeContactsAvatarList(SEContactsAvatar.SEList sEList) {
                SEContactsAvatar.SEList sEList2;
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 16) == 0 || (sEList2 = this.contactsAvatarList_) == null || sEList2 == SEContactsAvatar.SEList.getDefaultInstance()) {
                    this.contactsAvatarList_ = sEList;
                } else {
                    getContactsAvatarListBuilder().mergeFrom(sEList);
                }
                if (this.contactsAvatarList_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder setAvatarHight(int i7) {
                this.avatarHight_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAvatarRule(int i7) {
                this.avatarRule_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAvatarWidth(int i7) {
                this.avatarWidth_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setContactsAvatarList(SEContactsAvatar.SEList sEList) {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.contactsAvatarList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMaxAvatarCount(int i7) {
                this.maxAvatarCount_ = i7;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContactsAvatarData build() {
                SEContactsAvatarData sEContactsAvatarDataBuildPartial = buildPartial();
                if (sEContactsAvatarDataBuildPartial.isInitialized()) {
                    return sEContactsAvatarDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEContactsAvatarDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContactsAvatarData buildPartial() {
                SEContactsAvatarData sEContactsAvatarData = new SEContactsAvatarData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEContactsAvatarData);
                }
                onBuilt();
                return sEContactsAvatarData;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEContactsAvatarData getDefaultInstanceForType() {
                return SEContactsAvatarData.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.avatarHight_ = 0;
                this.avatarWidth_ = 0;
                this.avatarRule_ = 0;
                this.maxAvatarCount_ = 0;
                this.contactsAvatarList_ = null;
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.contactsAvatarListBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEContactsAvatarData) {
                    return mergeFrom((SEContactsAvatarData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setContactsAvatarList(SEContactsAvatar.SEList.Builder builder) {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder == null) {
                    this.contactsAvatarList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEContactsAvatarData sEContactsAvatarData) {
                if (sEContactsAvatarData == SEContactsAvatarData.getDefaultInstance()) {
                    return this;
                }
                if (sEContactsAvatarData.hasAvatarHight()) {
                    setAvatarHight(sEContactsAvatarData.getAvatarHight());
                }
                if (sEContactsAvatarData.hasAvatarWidth()) {
                    setAvatarWidth(sEContactsAvatarData.getAvatarWidth());
                }
                if (sEContactsAvatarData.hasAvatarRule()) {
                    setAvatarRule(sEContactsAvatarData.getAvatarRule());
                }
                if (sEContactsAvatarData.hasMaxAvatarCount()) {
                    setMaxAvatarCount(sEContactsAvatarData.getMaxAvatarCount());
                }
                if (sEContactsAvatarData.hasContactsAvatarList()) {
                    mergeContactsAvatarList(sEContactsAvatarData.getContactsAvatarList());
                }
                mergeUnknownFields(sEContactsAvatarData.getUnknownFields());
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
                                    this.avatarHight_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.avatarWidth_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.avatarRule_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.maxAvatarCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetContactsAvatarListFieldBuilder().getBuilder(), extensionRegistryLite);
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEContactsAvatarData");
            DEFAULT_INSTANCE = new SEContactsAvatarData();
            PARSER = new AbstractParser<SEContactsAvatarData>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarData.1
                @Override // com.google.protobuf.Parser
                public SEContactsAvatarData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEContactsAvatarData.newBuilder();
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

        public /* synthetic */ SEContactsAvatarData(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEContactsAvatarData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEContactsAvatarData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEContactsAvatarData parseDelimitedFrom(InputStream inputStream) {
            return (SEContactsAvatarData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEContactsAvatarData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEContactsAvatarData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEContactsAvatarData)) {
                return super.equals(obj);
            }
            SEContactsAvatarData sEContactsAvatarData = (SEContactsAvatarData) obj;
            if (hasAvatarHight() != sEContactsAvatarData.hasAvatarHight()) {
                return false;
            }
            if ((hasAvatarHight() && getAvatarHight() != sEContactsAvatarData.getAvatarHight()) || hasAvatarWidth() != sEContactsAvatarData.hasAvatarWidth()) {
                return false;
            }
            if ((hasAvatarWidth() && getAvatarWidth() != sEContactsAvatarData.getAvatarWidth()) || hasAvatarRule() != sEContactsAvatarData.hasAvatarRule()) {
                return false;
            }
            if ((hasAvatarRule() && getAvatarRule() != sEContactsAvatarData.getAvatarRule()) || hasMaxAvatarCount() != sEContactsAvatarData.hasMaxAvatarCount()) {
                return false;
            }
            if ((!hasMaxAvatarCount() || getMaxAvatarCount() == sEContactsAvatarData.getMaxAvatarCount()) && hasContactsAvatarList() == sEContactsAvatarData.hasContactsAvatarList()) {
                return (!hasContactsAvatarList() || getContactsAvatarList().equals(sEContactsAvatarData.getContactsAvatarList())) && getUnknownFields().equals(sEContactsAvatarData.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public int getAvatarHight() {
            return this.avatarHight_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public int getAvatarRule() {
            return this.avatarRule_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public int getAvatarWidth() {
            return this.avatarWidth_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public SEContactsAvatar.SEList getContactsAvatarList() {
            SEContactsAvatar.SEList sEList = this.contactsAvatarList_;
            return sEList == null ? SEContactsAvatar.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public SEContactsAvatar.SEListOrBuilder getContactsAvatarListOrBuilder() {
            SEContactsAvatar.SEList sEList = this.contactsAvatarList_;
            return sEList == null ? SEContactsAvatar.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEContactsAvatarData_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public int getMaxAvatarCount() {
            return this.maxAvatarCount_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEContactsAvatarData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.avatarHight_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.avatarWidth_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.avatarRule_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.maxAvatarCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(5, getContactsAvatarList());
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public boolean hasAvatarHight() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public boolean hasAvatarRule() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public boolean hasAvatarWidth() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public boolean hasContactsAvatarList() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsAvatarDataOrBuilder
        public boolean hasMaxAvatarCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasAvatarHight()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getAvatarHight();
            }
            if (hasAvatarWidth()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAvatarWidth();
            }
            if (hasAvatarRule()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAvatarRule();
            }
            if (hasMaxAvatarCount()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMaxAvatarCount();
            }
            if (hasContactsAvatarList()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getContactsAvatarList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEContactsAvatarData_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContactsAvatarData.class, Builder.class);
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
            if (!hasAvatarHight()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAvatarWidth()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAvatarRule()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMaxAvatarCount()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContactsAvatarList()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.avatarHight_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.avatarWidth_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.avatarRule_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.maxAvatarCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getContactsAvatarList());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEContactsAvatarData(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.avatarHight_ = 0;
            this.avatarWidth_ = 0;
            this.avatarRule_ = 0;
            this.maxAvatarCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEContactsAvatarData sEContactsAvatarData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEContactsAvatarData);
        }

        public static SEContactsAvatarData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEContactsAvatarData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactsAvatarData) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContactsAvatarData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEContactsAvatarData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEContactsAvatarData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEContactsAvatarData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEContactsAvatarData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEContactsAvatarData parseFrom(InputStream inputStream) {
            return (SEContactsAvatarData) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEContactsAvatarData() {
            this.avatarHight_ = 0;
            this.avatarWidth_ = 0;
            this.avatarRule_ = 0;
            this.maxAvatarCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEContactsAvatarData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactsAvatarData) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContactsAvatarData parseFrom(CodedInputStream codedInputStream) {
            return (SEContactsAvatarData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEContactsAvatarData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactsAvatarData) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEContactsAvatarDataOrBuilder extends MessageOrBuilder {
        int getAvatarHight();

        int getAvatarRule();

        int getAvatarWidth();

        SEContactsAvatar.SEList getContactsAvatarList();

        SEContactsAvatar.SEListOrBuilder getContactsAvatarListOrBuilder();

        int getMaxAvatarCount();

        boolean hasAvatarHight();

        boolean hasAvatarRule();

        boolean hasAvatarWidth();

        boolean hasContactsAvatarList();

        boolean hasMaxAvatarCount();
    }

    public interface SEContactsAvatarOrBuilder extends MessageOrBuilder {
        boolean getContactsAvatarExist();

        String getContactsAvatarName();

        ByteString getContactsAvatarNameBytes();

        String getContactsName();

        ByteString getContactsNameBytes();

        String getContactsNumber();

        ByteString getContactsNumberBytes();

        int getContactsSequence();

        boolean hasContactsAvatarExist();

        boolean hasContactsAvatarName();

        boolean hasContactsName();

        boolean hasContactsNumber();

        boolean hasContactsSequence();
    }

    public static final class SEContactsCY_2 extends GeneratedMessage implements SEContactsCY_2OrBuilder {
        public static final int CONTACTS_ALL_COUNT_FIELD_NUMBER = 1;
        public static final int CONTACTS_LIST_FIELD_NUMBER = 2;
        private static final SEContactsCY_2 DEFAULT_INSTANCE;
        public static final int MAX_CONTACTS_ALL_COUNT_FIELD_NUMBER = 3;
        private static final Parser<SEContactsCY_2> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int contactsAllCount_;
        private SEContacts.SEList contactsList_;
        private int maxContactsAllCount_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEContactsCY_2$1 */
        public class AnonymousClass1 extends AbstractParser<SEContactsCY_2> {
            @Override // com.google.protobuf.Parser
            public SEContactsCY_2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEContactsCY_2.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEContactsCY_2OrBuilder {
            private int bitField0_;
            private int contactsAllCount_;
            private SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> contactsListBuilder_;
            private SEContacts.SEList contactsList_;
            private int maxContactsAllCount_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEContactsCY_2 sEContactsCY_2) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEContactsCY_2.contactsAllCount_ = this.contactsAllCount_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                    sEContactsCY_2.contactsList_ = singleFieldBuilder == null ? this.contactsList_ : (SEContacts.SEList) singleFieldBuilder.build();
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEContactsCY_2.maxContactsAllCount_ = this.maxContactsAllCount_;
                    i7 |= 4;
                }
                sEContactsCY_2.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEContactsCY_2_descriptor;
            }

            private SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> internalGetContactsListFieldBuilder() {
                if (this.contactsListBuilder_ == null) {
                    this.contactsListBuilder_ = new SingleFieldBuilder<>(getContactsList(), getParentForChildren(), isClean());
                    this.contactsList_ = null;
                }
                return this.contactsListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetContactsListFieldBuilder();
                }
            }

            public Builder clearContactsAllCount() {
                this.bitField0_ &= -2;
                this.contactsAllCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearContactsList() {
                this.bitField0_ &= -3;
                this.contactsList_ = null;
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.contactsListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMaxContactsAllCount() {
                this.bitField0_ &= -5;
                this.maxContactsAllCount_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
            public int getContactsAllCount() {
                return this.contactsAllCount_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
            public SEContacts.SEList getContactsList() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEContacts.SEList) singleFieldBuilder.getMessage();
                }
                SEContacts.SEList sEList = this.contactsList_;
                return sEList == null ? SEContacts.SEList.getDefaultInstance() : sEList;
            }

            public SEContacts.SEList.Builder getContactsListBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SEContacts.SEList.Builder) internalGetContactsListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
            public SEContacts.SEListOrBuilder getContactsListOrBuilder() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEContacts.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEContacts.SEList sEList = this.contactsList_;
                return sEList == null ? SEContacts.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEContactsCY_2_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
            public int getMaxContactsAllCount() {
                return this.maxContactsAllCount_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
            public boolean hasContactsAllCount() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
            public boolean hasContactsList() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
            public boolean hasMaxContactsAllCount() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEContactsCY_2_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContactsCY_2.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasContactsAllCount() && hasContactsList();
            }

            public Builder mergeContactsList(SEContacts.SEList sEList) {
                SEContacts.SEList sEList2;
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 2) == 0 || (sEList2 = this.contactsList_) == null || sEList2 == SEContacts.SEList.getDefaultInstance()) {
                    this.contactsList_ = sEList;
                } else {
                    getContactsListBuilder().mergeFrom(sEList);
                }
                if (this.contactsList_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setContactsAllCount(int i7) {
                this.contactsAllCount_ = i7;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setContactsList(SEContacts.SEList sEList) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.contactsList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMaxContactsAllCount(int i7) {
                this.maxContactsAllCount_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContactsCY_2 build() {
                SEContactsCY_2 sEContactsCY_2BuildPartial = buildPartial();
                if (sEContactsCY_2BuildPartial.isInitialized()) {
                    return sEContactsCY_2BuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEContactsCY_2BuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEContactsCY_2 buildPartial() {
                SEContactsCY_2 sEContactsCY_2 = new SEContactsCY_2(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEContactsCY_2);
                }
                onBuilt();
                return sEContactsCY_2;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEContactsCY_2 getDefaultInstanceForType() {
                return SEContactsCY_2.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.contactsAllCount_ = 0;
                this.contactsList_ = null;
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.contactsListBuilder_ = null;
                }
                this.maxContactsAllCount_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEContactsCY_2) {
                    return mergeFrom((SEContactsCY_2) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setContactsList(SEContacts.SEList.Builder builder) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder == null) {
                    this.contactsList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEContactsCY_2 sEContactsCY_2) {
                if (sEContactsCY_2 == SEContactsCY_2.getDefaultInstance()) {
                    return this;
                }
                if (sEContactsCY_2.hasContactsAllCount()) {
                    setContactsAllCount(sEContactsCY_2.getContactsAllCount());
                }
                if (sEContactsCY_2.hasContactsList()) {
                    mergeContactsList(sEContactsCY_2.getContactsList());
                }
                if (sEContactsCY_2.hasMaxContactsAllCount()) {
                    setMaxContactsAllCount(sEContactsCY_2.getMaxContactsAllCount());
                }
                mergeUnknownFields(sEContactsCY_2.getUnknownFields());
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
                                    this.contactsAllCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetContactsListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.maxContactsAllCount_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEContactsCY_2");
            DEFAULT_INSTANCE = new SEContactsCY_2();
            PARSER = new AbstractParser<SEContactsCY_2>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2.1
                @Override // com.google.protobuf.Parser
                public SEContactsCY_2 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEContactsCY_2.newBuilder();
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

        public /* synthetic */ SEContactsCY_2(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEContactsCY_2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEContactsCY_2_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEContactsCY_2 parseDelimitedFrom(InputStream inputStream) {
            return (SEContactsCY_2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEContactsCY_2 parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEContactsCY_2> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEContactsCY_2)) {
                return super.equals(obj);
            }
            SEContactsCY_2 sEContactsCY_2 = (SEContactsCY_2) obj;
            if (hasContactsAllCount() != sEContactsCY_2.hasContactsAllCount()) {
                return false;
            }
            if ((hasContactsAllCount() && getContactsAllCount() != sEContactsCY_2.getContactsAllCount()) || hasContactsList() != sEContactsCY_2.hasContactsList()) {
                return false;
            }
            if ((!hasContactsList() || getContactsList().equals(sEContactsCY_2.getContactsList())) && hasMaxContactsAllCount() == sEContactsCY_2.hasMaxContactsAllCount()) {
                return (!hasMaxContactsAllCount() || getMaxContactsAllCount() == sEContactsCY_2.getMaxContactsAllCount()) && getUnknownFields().equals(sEContactsCY_2.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
        public int getContactsAllCount() {
            return this.contactsAllCount_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
        public SEContacts.SEList getContactsList() {
            SEContacts.SEList sEList = this.contactsList_;
            return sEList == null ? SEContacts.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
        public SEContacts.SEListOrBuilder getContactsListOrBuilder() {
            SEContacts.SEList sEList = this.contactsList_;
            return sEList == null ? SEContacts.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEContactsCY_2_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
        public int getMaxContactsAllCount() {
            return this.maxContactsAllCount_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEContactsCY_2> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.contactsAllCount_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getContactsList());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.maxContactsAllCount_);
            }
            int serializedSize = iComputeUInt32Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
        public boolean hasContactsAllCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
        public boolean hasContactsList() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEContactsCY_2OrBuilder
        public boolean hasMaxContactsAllCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasContactsAllCount()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getContactsAllCount();
            }
            if (hasContactsList()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getContactsList().hashCode();
            }
            if (hasMaxContactsAllCount()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMaxContactsAllCount();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEContactsCY_2_fieldAccessorTable.ensureFieldAccessorsInitialized(SEContactsCY_2.class, Builder.class);
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
            if (!hasContactsAllCount()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContactsList()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.contactsAllCount_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getContactsList());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.maxContactsAllCount_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEContactsCY_2(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.contactsAllCount_ = 0;
            this.maxContactsAllCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEContactsCY_2 sEContactsCY_2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEContactsCY_2);
        }

        public static SEContactsCY_2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEContactsCY_2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactsCY_2) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContactsCY_2 parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEContactsCY_2 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEContactsCY_2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEContactsCY_2 parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEContactsCY_2() {
            this.contactsAllCount_ = 0;
            this.maxContactsAllCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SEContactsCY_2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEContactsCY_2 parseFrom(InputStream inputStream) {
            return (SEContactsCY_2) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEContactsCY_2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactsCY_2) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEContactsCY_2 parseFrom(CodedInputStream codedInputStream) {
            return (SEContactsCY_2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEContactsCY_2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEContactsCY_2) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEContactsCY_2OrBuilder extends MessageOrBuilder {
        int getContactsAllCount();

        SEContacts.SEList getContactsList();

        SEContacts.SEListOrBuilder getContactsListOrBuilder();

        int getMaxContactsAllCount();

        boolean hasContactsAllCount();

        boolean hasContactsList();

        boolean hasMaxContactsAllCount();
    }

    public interface SEContactsOrBuilder extends MessageOrBuilder {
        String getContactsName();

        ByteString getContactsNameBytes();

        String getContactsNumber();

        ByteString getContactsNumberBytes();

        int getContactsSequence();

        boolean hasContactsName();

        boolean hasContactsNumber();

        boolean hasContactsSequence();
    }

    public static final class SEGlodFriendContacts extends GeneratedMessage implements SEGlodFriendContactsOrBuilder {
        public static final int CALL_CONTACTS_ID_FIELD_NUMBER = 2;
        public static final int CALL_CONTACTS_NAME_FIELD_NUMBER = 1;
        private static final SEGlodFriendContacts DEFAULT_INSTANCE;
        private static final Parser<SEGlodFriendContacts> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int callContactsId_;
        private volatile Object callContactsName_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEGlodFriendContacts$1 */
        public class AnonymousClass1 extends AbstractParser<SEGlodFriendContacts> {
            @Override // com.google.protobuf.Parser
            public SEGlodFriendContacts parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEGlodFriendContacts.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEGlodFriendContactsOrBuilder {
            private int bitField0_;
            private int callContactsId_;
            private Object callContactsName_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEGlodFriendContacts sEGlodFriendContacts) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEGlodFriendContacts.callContactsName_ = this.callContactsName_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEGlodFriendContacts.callContactsId_ = this.callContactsId_;
                    i7 |= 2;
                }
                sEGlodFriendContacts.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEGlodFriendContacts_descriptor;
            }

            public Builder clearCallContactsId() {
                this.bitField0_ &= -3;
                this.callContactsId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCallContactsName() {
                this.callContactsName_ = SEGlodFriendContacts.getDefaultInstance().getCallContactsName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
            public int getCallContactsId() {
                return this.callContactsId_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
            public String getCallContactsName() {
                Object obj = this.callContactsName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.callContactsName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
            public ByteString getCallContactsNameBytes() {
                Object obj = this.callContactsName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.callContactsName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEGlodFriendContacts_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
            public boolean hasCallContactsId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
            public boolean hasCallContactsName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEGlodFriendContacts_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGlodFriendContacts.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCallContactsName();
            }

            public Builder setCallContactsId(int i7) {
                this.callContactsId_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCallContactsName(String str) {
                str.getClass();
                this.callContactsName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCallContactsNameBytes(ByteString byteString) {
                byteString.getClass();
                this.callContactsName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.callContactsName_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGlodFriendContacts build() {
                SEGlodFriendContacts sEGlodFriendContactsBuildPartial = buildPartial();
                if (sEGlodFriendContactsBuildPartial.isInitialized()) {
                    return sEGlodFriendContactsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEGlodFriendContactsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGlodFriendContacts buildPartial() {
                SEGlodFriendContacts sEGlodFriendContacts = new SEGlodFriendContacts(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEGlodFriendContacts);
                }
                onBuilt();
                return sEGlodFriendContacts;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEGlodFriendContacts getDefaultInstanceForType() {
                return SEGlodFriendContacts.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.callContactsName_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.callContactsName_ = "";
                this.callContactsId_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEGlodFriendContacts) {
                    return mergeFrom((SEGlodFriendContacts) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEGlodFriendContacts sEGlodFriendContacts) {
                if (sEGlodFriendContacts == SEGlodFriendContacts.getDefaultInstance()) {
                    return this;
                }
                if (sEGlodFriendContacts.hasCallContactsName()) {
                    this.callContactsName_ = sEGlodFriendContacts.callContactsName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEGlodFriendContacts.hasCallContactsId()) {
                    setCallContactsId(sEGlodFriendContacts.getCallContactsId());
                }
                mergeUnknownFields(sEGlodFriendContacts.getUnknownFields());
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
                                    this.callContactsName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.callContactsId_ = codedInputStream.readUInt32();
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

        public static final class SEList extends GeneratedMessage implements SEListOrBuilder {
            private static final SEList DEFAULT_INSTANCE;
            public static final int LIST_FIELD_NUMBER = 1;
            private static final Parser<SEList> PARSER;
            private static final long serialVersionUID = 0;
            private List<SEGlodFriendContacts> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEGlodFriendContacts$SEList$1 */
            public class AnonymousClass1 extends AbstractParser<SEList> {
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
                private RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> listBuilder_;
                private List<SEGlodFriendContacts> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        sEList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    sEList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NotificationProtos.internal_static_SA_SEGlodFriendContacts_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEGlodFriendContacts> iterable) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEGlodFriendContacts sEGlodFriendContacts) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEGlodFriendContacts);
                        return this;
                    }
                    sEGlodFriendContacts.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEGlodFriendContacts);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEGlodFriendContacts.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return NotificationProtos.internal_static_SA_SEGlodFriendContacts_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
                public SEGlodFriendContacts getList(int i7) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEGlodFriendContacts) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
                public List<SEGlodFriendContacts> getListList() {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
                public SEGlodFriendContactsOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEGlodFriendContactsOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
                public List<? extends SEGlodFriendContactsOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_SA_SEGlodFriendContacts_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEGlodFriendContacts sEGlodFriendContacts) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEGlodFriendContacts);
                        return this;
                    }
                    sEGlodFriendContacts.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEGlodFriendContacts);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(k kVar) {
                    this();
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
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
                    buildPartialRepeatedFields(sEList);
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

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEGlodFriendContacts.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEGlodFriendContacts sEGlodFriendContacts) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEGlodFriendContacts.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEGlodFriendContacts);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEGlodFriendContacts);
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

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(SEList sEList) {
                    if (sEList == SEList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!sEList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = sEList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(sEList.list_);
                            }
                            onChanged();
                        }
                    } else if (!sEList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = sEList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(sEList.list_);
                        }
                    }
                    mergeUnknownFields(sEList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEGlodFriendContacts sEGlodFriendContacts = (SEGlodFriendContacts) codedInputStream.readMessage(SEGlodFriendContacts.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEGlodFriendContacts, Builder, SEGlodFriendContactsOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEGlodFriendContacts);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEGlodFriendContacts);
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, k kVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEGlodFriendContacts_SEList_descriptor;
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
                return getListList().equals(sEList.getListList()) && getUnknownFields().equals(sEList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEGlodFriendContacts_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
            public SEGlodFriendContacts getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
            public List<SEGlodFriendContacts> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
            public SEGlodFriendContactsOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.SEListOrBuilder
            public List<? extends SEGlodFriendContactsOrBuilder> getListOrBuilderList() {
                return this.list_;
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
                return NotificationProtos.internal_static_SA_SEGlodFriendContacts_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
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

            private SEList() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
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
            SEGlodFriendContacts getList(int i7);

            int getListCount();

            List<SEGlodFriendContacts> getListList();

            SEGlodFriendContactsOrBuilder getListOrBuilder(int i7);

            List<? extends SEGlodFriendContactsOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEGlodFriendContacts");
            DEFAULT_INSTANCE = new SEGlodFriendContacts();
            PARSER = new AbstractParser<SEGlodFriendContacts>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContacts.1
                @Override // com.google.protobuf.Parser
                public SEGlodFriendContacts parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEGlodFriendContacts.newBuilder();
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

        public /* synthetic */ SEGlodFriendContacts(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEGlodFriendContacts getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEGlodFriendContacts_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEGlodFriendContacts parseDelimitedFrom(InputStream inputStream) {
            return (SEGlodFriendContacts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEGlodFriendContacts parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEGlodFriendContacts> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEGlodFriendContacts)) {
                return super.equals(obj);
            }
            SEGlodFriendContacts sEGlodFriendContacts = (SEGlodFriendContacts) obj;
            if (hasCallContactsName() != sEGlodFriendContacts.hasCallContactsName()) {
                return false;
            }
            if ((!hasCallContactsName() || getCallContactsName().equals(sEGlodFriendContacts.getCallContactsName())) && hasCallContactsId() == sEGlodFriendContacts.hasCallContactsId()) {
                return (!hasCallContactsId() || getCallContactsId() == sEGlodFriendContacts.getCallContactsId()) && getUnknownFields().equals(sEGlodFriendContacts.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
        public int getCallContactsId() {
            return this.callContactsId_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
        public String getCallContactsName() {
            Object obj = this.callContactsName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.callContactsName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
        public ByteString getCallContactsNameBytes() {
            Object obj = this.callContactsName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callContactsName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEGlodFriendContacts_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEGlodFriendContacts> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.callContactsName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.callContactsId_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
        public boolean hasCallContactsId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendContactsOrBuilder
        public boolean hasCallContactsName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasCallContactsName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCallContactsName().hashCode();
            }
            if (hasCallContactsId()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getCallContactsId();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEGlodFriendContacts_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGlodFriendContacts.class, Builder.class);
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
            if (hasCallContactsName()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.callContactsName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.callContactsId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEGlodFriendContacts(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.callContactsName_ = "";
            this.callContactsId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEGlodFriendContacts sEGlodFriendContacts) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEGlodFriendContacts);
        }

        public static SEGlodFriendContacts parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEGlodFriendContacts parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGlodFriendContacts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGlodFriendContacts parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEGlodFriendContacts getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEGlodFriendContacts parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEGlodFriendContacts parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEGlodFriendContacts() {
            this.callContactsName_ = "";
            this.callContactsId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.callContactsName_ = "";
        }

        public static SEGlodFriendContacts parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEGlodFriendContacts parseFrom(InputStream inputStream) {
            return (SEGlodFriendContacts) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEGlodFriendContacts parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGlodFriendContacts) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGlodFriendContacts parseFrom(CodedInputStream codedInputStream) {
            return (SEGlodFriendContacts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEGlodFriendContacts parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGlodFriendContacts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEGlodFriendContactsOrBuilder extends MessageOrBuilder {
        int getCallContactsId();

        String getCallContactsName();

        ByteString getCallContactsNameBytes();

        boolean hasCallContactsId();

        boolean hasCallContactsName();
    }

    public static final class SEGlodFriendEmoji extends GeneratedMessage implements SEGlodFriendEmojiOrBuilder {
        public static final int CALL_CONTACTS_ID_FIELD_NUMBER = 6;
        public static final int CALL_CONTACTS_NAME_FIELD_NUMBER = 1;
        public static final int COLOR_FIELD_NUMBER = 3;
        private static final SEGlodFriendEmoji DEFAULT_INSTANCE;
        public static final int EMOJI_FIELD_NUMBER = 2;
        public static final int FRIENDEMOJISTATE_FIELD_NUMBER = 5;
        private static final Parser<SEGlodFriendEmoji> PARSER;
        public static final int TIME_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int callContactsId_;
        private volatile Object callContactsName_;
        private int color_;
        private int emoji_;
        private int friendEmojiState_;
        private byte memoizedIsInitialized;
        private CommonProtos.SETime time_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEGlodFriendEmoji$1 */
        public class AnonymousClass1 extends AbstractParser<SEGlodFriendEmoji> {
            @Override // com.google.protobuf.Parser
            public SEGlodFriendEmoji parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEGlodFriendEmoji.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEGlodFriendEmojiOrBuilder {
            private int bitField0_;
            private int callContactsId_;
            private Object callContactsName_;
            private int color_;
            private int emoji_;
            private int friendEmojiState_;
            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> timeBuilder_;
            private CommonProtos.SETime time_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEGlodFriendEmoji sEGlodFriendEmoji) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEGlodFriendEmoji.callContactsName_ = this.callContactsName_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEGlodFriendEmoji.emoji_ = this.emoji_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sEGlodFriendEmoji.color_ = this.color_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                    sEGlodFriendEmoji.time_ = singleFieldBuilder == null ? this.time_ : (CommonProtos.SETime) singleFieldBuilder.build();
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sEGlodFriendEmoji.friendEmojiState_ = this.friendEmojiState_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sEGlodFriendEmoji.callContactsId_ = this.callContactsId_;
                    i7 |= 32;
                }
                sEGlodFriendEmoji.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEGlodFriendEmoji_descriptor;
            }

            private SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> internalGetTimeFieldBuilder() {
                if (this.timeBuilder_ == null) {
                    this.timeBuilder_ = new SingleFieldBuilder<>(getTime(), getParentForChildren(), isClean());
                    this.time_ = null;
                }
                return this.timeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetTimeFieldBuilder();
                }
            }

            public Builder clearCallContactsId() {
                this.bitField0_ &= -33;
                this.callContactsId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCallContactsName() {
                this.callContactsName_ = SEGlodFriendEmoji.getDefaultInstance().getCallContactsName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearColor() {
                this.bitField0_ &= -5;
                this.color_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEmoji() {
                this.bitField0_ &= -3;
                this.emoji_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFriendEmojiState() {
                this.bitField0_ &= -17;
                this.friendEmojiState_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTime() {
                this.bitField0_ &= -9;
                this.time_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.timeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public int getCallContactsId() {
                return this.callContactsId_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public String getCallContactsName() {
                Object obj = this.callContactsName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.callContactsName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public ByteString getCallContactsNameBytes() {
                Object obj = this.callContactsName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.callContactsName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public int getColor() {
                return this.color_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEGlodFriendEmoji_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public int getEmoji() {
                return this.emoji_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public int getFriendEmojiState() {
                return this.friendEmojiState_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public CommonProtos.SETime getTime() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETime) singleFieldBuilder.getMessage();
                }
                CommonProtos.SETime sETime = this.time_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            public CommonProtos.SETime.Builder getTimeBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (CommonProtos.SETime.Builder) internalGetTimeFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public CommonProtos.SETimeOrBuilder getTimeOrBuilder() {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    return (CommonProtos.SETimeOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                CommonProtos.SETime sETime = this.time_;
                return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public boolean hasCallContactsId() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public boolean hasCallContactsName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public boolean hasColor() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public boolean hasEmoji() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public boolean hasFriendEmojiState() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
            public boolean hasTime() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEGlodFriendEmoji_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGlodFriendEmoji.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCallContactsName() && hasEmoji() && hasColor() && hasTime() && getTime().isInitialized();
            }

            public Builder mergeTime(CommonProtos.SETime sETime) {
                CommonProtos.SETime sETime2;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sETime);
                } else if ((this.bitField0_ & 8) == 0 || (sETime2 = this.time_) == null || sETime2 == CommonProtos.SETime.getDefaultInstance()) {
                    this.time_ = sETime;
                } else {
                    getTimeBuilder().mergeFrom(sETime);
                }
                if (this.time_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setCallContactsId(int i7) {
                this.callContactsId_ = i7;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCallContactsName(String str) {
                str.getClass();
                this.callContactsName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCallContactsNameBytes(ByteString byteString) {
                byteString.getClass();
                this.callContactsName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setColor(int i7) {
                this.color_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setEmoji(int i7) {
                this.emoji_ = i7;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFriendEmojiState(int i7) {
                this.friendEmojiState_ = i7;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTime(CommonProtos.SETime sETime) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder == null) {
                    sETime.getClass();
                    this.time_ = sETime;
                } else {
                    singleFieldBuilder.setMessage(sETime);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.callContactsName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGlodFriendEmoji build() {
                SEGlodFriendEmoji sEGlodFriendEmojiBuildPartial = buildPartial();
                if (sEGlodFriendEmojiBuildPartial.isInitialized()) {
                    return sEGlodFriendEmojiBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEGlodFriendEmojiBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEGlodFriendEmoji buildPartial() {
                SEGlodFriendEmoji sEGlodFriendEmoji = new SEGlodFriendEmoji(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEGlodFriendEmoji);
                }
                onBuilt();
                return sEGlodFriendEmoji;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEGlodFriendEmoji getDefaultInstanceForType() {
                return SEGlodFriendEmoji.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.callContactsName_ = "";
                this.emoji_ = 0;
                this.color_ = 0;
                this.time_ = null;
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.timeBuilder_ = null;
                }
                this.friendEmojiState_ = 0;
                this.callContactsId_ = 0;
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.callContactsName_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEGlodFriendEmoji) {
                    return mergeFrom((SEGlodFriendEmoji) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setTime(CommonProtos.SETime.Builder builder) {
                SingleFieldBuilder<CommonProtos.SETime, CommonProtos.SETime.Builder, CommonProtos.SETimeOrBuilder> singleFieldBuilder = this.timeBuilder_;
                if (singleFieldBuilder == null) {
                    this.time_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SEGlodFriendEmoji sEGlodFriendEmoji) {
                if (sEGlodFriendEmoji == SEGlodFriendEmoji.getDefaultInstance()) {
                    return this;
                }
                if (sEGlodFriendEmoji.hasCallContactsName()) {
                    this.callContactsName_ = sEGlodFriendEmoji.callContactsName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEGlodFriendEmoji.hasEmoji()) {
                    setEmoji(sEGlodFriendEmoji.getEmoji());
                }
                if (sEGlodFriendEmoji.hasColor()) {
                    setColor(sEGlodFriendEmoji.getColor());
                }
                if (sEGlodFriendEmoji.hasTime()) {
                    mergeTime(sEGlodFriendEmoji.getTime());
                }
                if (sEGlodFriendEmoji.hasFriendEmojiState()) {
                    setFriendEmojiState(sEGlodFriendEmoji.getFriendEmojiState());
                }
                if (sEGlodFriendEmoji.hasCallContactsId()) {
                    setCallContactsId(sEGlodFriendEmoji.getCallContactsId());
                }
                mergeUnknownFields(sEGlodFriendEmoji.getUnknownFields());
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
                                    this.callContactsName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.emoji_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.color_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(internalGetTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.friendEmojiState_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.callContactsId_ = codedInputStream.readUInt32();
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

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEGlodFriendEmoji");
            DEFAULT_INSTANCE = new SEGlodFriendEmoji();
            PARSER = new AbstractParser<SEGlodFriendEmoji>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmoji.1
                @Override // com.google.protobuf.Parser
                public SEGlodFriendEmoji parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEGlodFriendEmoji.newBuilder();
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

        public /* synthetic */ SEGlodFriendEmoji(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEGlodFriendEmoji getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEGlodFriendEmoji_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEGlodFriendEmoji parseDelimitedFrom(InputStream inputStream) {
            return (SEGlodFriendEmoji) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEGlodFriendEmoji parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEGlodFriendEmoji> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEGlodFriendEmoji)) {
                return super.equals(obj);
            }
            SEGlodFriendEmoji sEGlodFriendEmoji = (SEGlodFriendEmoji) obj;
            if (hasCallContactsName() != sEGlodFriendEmoji.hasCallContactsName()) {
                return false;
            }
            if ((hasCallContactsName() && !getCallContactsName().equals(sEGlodFriendEmoji.getCallContactsName())) || hasEmoji() != sEGlodFriendEmoji.hasEmoji()) {
                return false;
            }
            if ((hasEmoji() && getEmoji() != sEGlodFriendEmoji.getEmoji()) || hasColor() != sEGlodFriendEmoji.hasColor()) {
                return false;
            }
            if ((hasColor() && getColor() != sEGlodFriendEmoji.getColor()) || hasTime() != sEGlodFriendEmoji.hasTime()) {
                return false;
            }
            if ((hasTime() && !getTime().equals(sEGlodFriendEmoji.getTime())) || hasFriendEmojiState() != sEGlodFriendEmoji.hasFriendEmojiState()) {
                return false;
            }
            if ((!hasFriendEmojiState() || getFriendEmojiState() == sEGlodFriendEmoji.getFriendEmojiState()) && hasCallContactsId() == sEGlodFriendEmoji.hasCallContactsId()) {
                return (!hasCallContactsId() || getCallContactsId() == sEGlodFriendEmoji.getCallContactsId()) && getUnknownFields().equals(sEGlodFriendEmoji.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public int getCallContactsId() {
            return this.callContactsId_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public String getCallContactsName() {
            Object obj = this.callContactsName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.callContactsName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public ByteString getCallContactsNameBytes() {
            Object obj = this.callContactsName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callContactsName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public int getColor() {
            return this.color_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEGlodFriendEmoji_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public int getEmoji() {
            return this.emoji_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public int getFriendEmojiState() {
            return this.friendEmojiState_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEGlodFriendEmoji> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.callContactsName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.emoji_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.color_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(4, getTime());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.friendEmojiState_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(6, this.callContactsId_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public CommonProtos.SETime getTime() {
            CommonProtos.SETime sETime = this.time_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public CommonProtos.SETimeOrBuilder getTimeOrBuilder() {
            CommonProtos.SETime sETime = this.time_;
            return sETime == null ? CommonProtos.SETime.getDefaultInstance() : sETime;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public boolean hasCallContactsId() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public boolean hasCallContactsName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public boolean hasColor() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public boolean hasEmoji() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public boolean hasFriendEmojiState() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEGlodFriendEmojiOrBuilder
        public boolean hasTime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasCallContactsName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCallContactsName().hashCode();
            }
            if (hasEmoji()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEmoji();
            }
            if (hasColor()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getColor();
            }
            if (hasTime()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getTime().hashCode();
            }
            if (hasFriendEmojiState()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getFriendEmojiState();
            }
            if (hasCallContactsId()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getCallContactsId();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEGlodFriendEmoji_fieldAccessorTable.ensureFieldAccessorsInitialized(SEGlodFriendEmoji.class, Builder.class);
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
            if (!hasCallContactsName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasEmoji()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasColor()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getTime().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.callContactsName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.emoji_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.color_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getTime());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.friendEmojiState_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.callContactsId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEGlodFriendEmoji(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.callContactsName_ = "";
            this.emoji_ = 0;
            this.color_ = 0;
            this.friendEmojiState_ = 0;
            this.callContactsId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEGlodFriendEmoji sEGlodFriendEmoji) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEGlodFriendEmoji);
        }

        public static SEGlodFriendEmoji parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEGlodFriendEmoji parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGlodFriendEmoji) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGlodFriendEmoji parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEGlodFriendEmoji getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEGlodFriendEmoji parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEGlodFriendEmoji parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEGlodFriendEmoji parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEGlodFriendEmoji parseFrom(InputStream inputStream) {
            return (SEGlodFriendEmoji) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        private SEGlodFriendEmoji() {
            this.callContactsName_ = "";
            this.emoji_ = 0;
            this.color_ = 0;
            this.friendEmojiState_ = 0;
            this.callContactsId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.callContactsName_ = "";
        }

        public static SEGlodFriendEmoji parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGlodFriendEmoji) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEGlodFriendEmoji parseFrom(CodedInputStream codedInputStream) {
            return (SEGlodFriendEmoji) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEGlodFriendEmoji parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEGlodFriendEmoji) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEGlodFriendEmojiOrBuilder extends MessageOrBuilder {
        int getCallContactsId();

        String getCallContactsName();

        ByteString getCallContactsNameBytes();

        int getColor();

        int getEmoji();

        int getFriendEmojiState();

        CommonProtos.SETime getTime();

        CommonProtos.SETimeOrBuilder getTimeOrBuilder();

        boolean hasCallContactsId();

        boolean hasCallContactsName();

        boolean hasColor();

        boolean hasEmoji();

        boolean hasFriendEmojiState();

        boolean hasTime();
    }

    public enum SEIOSAppTag implements ProtocolMessageEnum {
        APP_MAIN(0),
        APP_CALL(1),
        APP_MISS_CALL(2),
        APP_SMS(3),
        APP_QQ(4),
        APP_WECHAT(5),
        APP_SKYPE(6),
        APP_WHATSAPP(7),
        APP_FACEBOOK(8),
        APP_MESSENGER(9),
        APP_LINKEDLN(16),
        APP_TWITTER(17),
        APP_VIBER(18),
        APP_LINE(19),
        APP_GMAIL(20),
        APP_OUTLOOK(21),
        APP_INSTAGRAM(22),
        APP_SNAPCHAT(23),
        APP_MAIL(24),
        APP_CALENDAR(25),
        APP_ZALO(32),
        APP_TELEGRAM(33),
        APP_KAKAOTALK(34),
        APP_VK(35),
        APP_OK(36),
        APP_ICQ(37),
        APP_YOUTUBE(39),
        APP_PINTEREST(40),
        APP_HANGOUT(41),
        APP_PHONRPE(48),
        APP_GOOGLE_PLAY(49),
        APP_PAYTM(50),
        APP_NAUKRI(51),
        APP_INSHOT(52),
        APP_GOOGLE_NEWS(53),
        APP_OLA(54),
        APP_UBER(55),
        APP_FLIPKART(56),
        APP_AMAZON(57),
        APP_WHATSAPP_BUSINESS(64),
        APP_NOISEFIT(65),
        APP_GOOGLE_CLASSROOM(66),
        APP_TIKTOK(67),
        APP_TEXTNOW(68),
        APP_DISCORD(69),
        APP_AIRTEL_THANKS(70),
        APP_TVS_CONNECT(71),
        APP_KITE(72),
        APP_GROWW(73),
        APP_GOOGLE_CHAT(80),
        APP_BIGBASKET(81),
        APP_BOOKMYSHOW(82),
        APP_ZOMATO_DISTRICT(83),
        APP_NETFLIX(84),
        APP_JIOHOTSTAR(85),
        APP_SPOTIFY(86),
        APP_JIOSAAVN(87),
        APP_MEESHO(88),
        APP_CRED(89),
        APP_MAKEMYTRIP(96),
        APP_MICROSOFT_TEAMS(97),
        APP_OUTLOOK_CALENDAR(98),
        APP_IOS_CALENDAR(99),
        APP_OTHER(255);

        public static final int APP_AIRTEL_THANKS_VALUE = 70;
        public static final int APP_AMAZON_VALUE = 57;
        public static final int APP_BIGBASKET_VALUE = 81;
        public static final int APP_BOOKMYSHOW_VALUE = 82;
        public static final int APP_CALENDAR_VALUE = 25;
        public static final int APP_CALL_VALUE = 1;
        public static final int APP_CRED_VALUE = 89;
        public static final int APP_DISCORD_VALUE = 69;
        public static final int APP_FACEBOOK_VALUE = 8;
        public static final int APP_FLIPKART_VALUE = 56;
        public static final int APP_GMAIL_VALUE = 20;
        public static final int APP_GOOGLE_CHAT_VALUE = 80;
        public static final int APP_GOOGLE_CLASSROOM_VALUE = 66;
        public static final int APP_GOOGLE_NEWS_VALUE = 53;
        public static final int APP_GOOGLE_PLAY_VALUE = 49;
        public static final int APP_GROWW_VALUE = 73;
        public static final int APP_HANGOUT_VALUE = 41;
        public static final int APP_ICQ_VALUE = 37;
        public static final int APP_INSHOT_VALUE = 52;
        public static final int APP_INSTAGRAM_VALUE = 22;
        public static final int APP_IOS_CALENDAR_VALUE = 99;
        public static final int APP_JIOHOTSTAR_VALUE = 85;
        public static final int APP_JIOSAAVN_VALUE = 87;
        public static final int APP_KAKAOTALK_VALUE = 34;
        public static final int APP_KITE_VALUE = 72;
        public static final int APP_LINE_VALUE = 19;
        public static final int APP_LINKEDLN_VALUE = 16;
        public static final int APP_MAIL_VALUE = 24;
        public static final int APP_MAIN_VALUE = 0;
        public static final int APP_MAKEMYTRIP_VALUE = 96;
        public static final int APP_MEESHO_VALUE = 88;
        public static final int APP_MESSENGER_VALUE = 9;
        public static final int APP_MICROSOFT_TEAMS_VALUE = 97;
        public static final int APP_MISS_CALL_VALUE = 2;
        public static final int APP_NAUKRI_VALUE = 51;
        public static final int APP_NETFLIX_VALUE = 84;
        public static final int APP_NOISEFIT_VALUE = 65;
        public static final int APP_OK_VALUE = 36;
        public static final int APP_OLA_VALUE = 54;
        public static final int APP_OTHER_VALUE = 255;
        public static final int APP_OUTLOOK_CALENDAR_VALUE = 98;
        public static final int APP_OUTLOOK_VALUE = 21;
        public static final int APP_PAYTM_VALUE = 50;
        public static final int APP_PHONRPE_VALUE = 48;
        public static final int APP_PINTEREST_VALUE = 40;
        public static final int APP_QQ_VALUE = 4;
        public static final int APP_SKYPE_VALUE = 6;
        public static final int APP_SMS_VALUE = 3;
        public static final int APP_SNAPCHAT_VALUE = 23;
        public static final int APP_SPOTIFY_VALUE = 86;
        public static final int APP_TELEGRAM_VALUE = 33;
        public static final int APP_TEXTNOW_VALUE = 68;
        public static final int APP_TIKTOK_VALUE = 67;
        public static final int APP_TVS_CONNECT_VALUE = 71;
        public static final int APP_TWITTER_VALUE = 17;
        public static final int APP_UBER_VALUE = 55;
        public static final int APP_VIBER_VALUE = 18;
        public static final int APP_VK_VALUE = 35;
        public static final int APP_WECHAT_VALUE = 5;
        public static final int APP_WHATSAPP_BUSINESS_VALUE = 64;
        public static final int APP_WHATSAPP_VALUE = 7;
        public static final int APP_YOUTUBE_VALUE = 39;
        public static final int APP_ZALO_VALUE = 32;
        public static final int APP_ZOMATO_DISTRICT_VALUE = 83;
        private static final SEIOSAppTag[] VALUES;
        private static final Internal.EnumLiteMap<SEIOSAppTag> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEIOSAppTag$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SEIOSAppTag> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SEIOSAppTag findValueByNumber(int i7) {
                return SEIOSAppTag.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEIOSAppTag");
            internalValueMap = new Internal.EnumLiteMap<SEIOSAppTag>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSAppTag.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEIOSAppTag findValueByNumber(int i7) {
                    return SEIOSAppTag.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SEIOSAppTag(int i7) {
            this.value = i7;
        }

        public static SEIOSAppTag forNumber(int i7) {
            if (i7 == 255) {
                return APP_OTHER;
            }
            switch (i7) {
                case 0:
                    return APP_MAIN;
                case 1:
                    return APP_CALL;
                case 2:
                    return APP_MISS_CALL;
                case 3:
                    return APP_SMS;
                case 4:
                    return APP_QQ;
                case 5:
                    return APP_WECHAT;
                case 6:
                    return APP_SKYPE;
                case 7:
                    return APP_WHATSAPP;
                case 8:
                    return APP_FACEBOOK;
                case 9:
                    return APP_MESSENGER;
                default:
                    switch (i7) {
                        case 16:
                            return APP_LINKEDLN;
                        case 17:
                            return APP_TWITTER;
                        case 18:
                            return APP_VIBER;
                        case 19:
                            return APP_LINE;
                        case 20:
                            return APP_GMAIL;
                        case 21:
                            return APP_OUTLOOK;
                        case 22:
                            return APP_INSTAGRAM;
                        case 23:
                            return APP_SNAPCHAT;
                        case 24:
                            return APP_MAIL;
                        case 25:
                            return APP_CALENDAR;
                        default:
                            switch (i7) {
                                case 32:
                                    return APP_ZALO;
                                case 33:
                                    return APP_TELEGRAM;
                                case 34:
                                    return APP_KAKAOTALK;
                                case 35:
                                    return APP_VK;
                                case 36:
                                    return APP_OK;
                                case 37:
                                    return APP_ICQ;
                                default:
                                    switch (i7) {
                                        case 39:
                                            return APP_YOUTUBE;
                                        case 40:
                                            return APP_PINTEREST;
                                        case 41:
                                            return APP_HANGOUT;
                                        default:
                                            switch (i7) {
                                                case 48:
                                                    return APP_PHONRPE;
                                                case 49:
                                                    return APP_GOOGLE_PLAY;
                                                case 50:
                                                    return APP_PAYTM;
                                                case 51:
                                                    return APP_NAUKRI;
                                                case 52:
                                                    return APP_INSHOT;
                                                case 53:
                                                    return APP_GOOGLE_NEWS;
                                                case 54:
                                                    return APP_OLA;
                                                case 55:
                                                    return APP_UBER;
                                                case 56:
                                                    return APP_FLIPKART;
                                                case 57:
                                                    return APP_AMAZON;
                                                default:
                                                    switch (i7) {
                                                        case 64:
                                                            return APP_WHATSAPP_BUSINESS;
                                                        case 65:
                                                            return APP_NOISEFIT;
                                                        case 66:
                                                            return APP_GOOGLE_CLASSROOM;
                                                        case 67:
                                                            return APP_TIKTOK;
                                                        case 68:
                                                            return APP_TEXTNOW;
                                                        case 69:
                                                            return APP_DISCORD;
                                                        case 70:
                                                            return APP_AIRTEL_THANKS;
                                                        case 71:
                                                            return APP_TVS_CONNECT;
                                                        case 72:
                                                            return APP_KITE;
                                                        case 73:
                                                            return APP_GROWW;
                                                        default:
                                                            switch (i7) {
                                                                case 80:
                                                                    return APP_GOOGLE_CHAT;
                                                                case 81:
                                                                    return APP_BIGBASKET;
                                                                case 82:
                                                                    return APP_BOOKMYSHOW;
                                                                case 83:
                                                                    return APP_ZOMATO_DISTRICT;
                                                                case 84:
                                                                    return APP_NETFLIX;
                                                                case 85:
                                                                    return APP_JIOHOTSTAR;
                                                                case 86:
                                                                    return APP_SPOTIFY;
                                                                case 87:
                                                                    return APP_JIOSAAVN;
                                                                case 88:
                                                                    return APP_MEESHO;
                                                                case 89:
                                                                    return APP_CRED;
                                                                default:
                                                                    switch (i7) {
                                                                        case 96:
                                                                            return APP_MAKEMYTRIP;
                                                                        case 97:
                                                                            return APP_MICROSOFT_TEAMS;
                                                                        case 98:
                                                                            return APP_OUTLOOK_CALENDAR;
                                                                        case 99:
                                                                            return APP_IOS_CALENDAR;
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
            return NotificationProtos.getDescriptor().getEnumType(2);
        }

        public static Internal.EnumLiteMap<SEIOSAppTag> internalGetValueMap() {
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
        public static SEIOSAppTag valueOf(int i7) {
            return forNumber(i7);
        }

        public static SEIOSAppTag valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEIOSNotification extends GeneratedMessage implements SEIOSNotificationOrBuilder {
        public static final int APP_TYPE_FIELD_NUMBER = 2;
        private static final SEIOSNotification DEFAULT_INSTANCE;
        public static final int ENABLE_SWITCH_FIELD_NUMBER = 1;
        private static final Parser<SEIOSNotification> PARSER;
        private static final long serialVersionUID = 0;
        private int appType_;
        private int bitField0_;
        private boolean enableSwitch_;
        private byte memoizedIsInitialized;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEIOSNotification$1 */
        public class AnonymousClass1 extends AbstractParser<SEIOSNotification> {
            @Override // com.google.protobuf.Parser
            public SEIOSNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEIOSNotification.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEIOSNotificationOrBuilder {
            private int appType_;
            private int bitField0_;
            private boolean enableSwitch_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEIOSNotification sEIOSNotification) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEIOSNotification.enableSwitch_ = this.enableSwitch_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEIOSNotification.appType_ = this.appType_;
                    i7 |= 2;
                }
                sEIOSNotification.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEIOSNotification_descriptor;
            }

            public Builder clearAppType() {
                this.bitField0_ &= -3;
                this.appType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEnableSwitch() {
                this.bitField0_ &= -2;
                this.enableSwitch_ = false;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotificationOrBuilder
            public SEIOSAppTag getAppType() {
                SEIOSAppTag sEIOSAppTagForNumber = SEIOSAppTag.forNumber(this.appType_);
                return sEIOSAppTagForNumber == null ? SEIOSAppTag.APP_MAIN : sEIOSAppTagForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEIOSNotification_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotificationOrBuilder
            public boolean getEnableSwitch() {
                return this.enableSwitch_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotificationOrBuilder
            public boolean hasAppType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotificationOrBuilder
            public boolean hasEnableSwitch() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEIOSNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SEIOSNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEnableSwitch() && hasAppType();
            }

            public Builder setAppType(SEIOSAppTag sEIOSAppTag) {
                sEIOSAppTag.getClass();
                this.bitField0_ |= 2;
                this.appType_ = sEIOSAppTag.getNumber();
                onChanged();
                return this;
            }

            public Builder setEnableSwitch(boolean z6) {
                this.enableSwitch_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.appType_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEIOSNotification build() {
                SEIOSNotification sEIOSNotificationBuildPartial = buildPartial();
                if (sEIOSNotificationBuildPartial.isInitialized()) {
                    return sEIOSNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEIOSNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEIOSNotification buildPartial() {
                SEIOSNotification sEIOSNotification = new SEIOSNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEIOSNotification);
                }
                onBuilt();
                return sEIOSNotification;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEIOSNotification getDefaultInstanceForType() {
                return SEIOSNotification.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.appType_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.enableSwitch_ = false;
                this.appType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEIOSNotification) {
                    return mergeFrom((SEIOSNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEIOSNotification sEIOSNotification) {
                if (sEIOSNotification == SEIOSNotification.getDefaultInstance()) {
                    return this;
                }
                if (sEIOSNotification.hasEnableSwitch()) {
                    setEnableSwitch(sEIOSNotification.getEnableSwitch());
                }
                if (sEIOSNotification.hasAppType()) {
                    setAppType(sEIOSNotification.getAppType());
                }
                mergeUnknownFields(sEIOSNotification.getUnknownFields());
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
                                    this.enableSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i7 = codedInputStream.readEnum();
                                    if (SEIOSAppTag.forNumber(i7) == null) {
                                        mergeUnknownVarintField(2, i7);
                                    } else {
                                        this.appType_ = i7;
                                        this.bitField0_ |= 2;
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
            private static final long serialVersionUID = 0;
            private List<SEIOSNotification> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEIOSNotification$SEList$1 */
            public class AnonymousClass1 extends AbstractParser<SEList> {
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
                private RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> listBuilder_;
                private List<SEIOSNotification> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        sEList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    sEList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NotificationProtos.internal_static_SA_SEIOSNotification_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEIOSNotification> iterable) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEIOSNotification sEIOSNotification) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEIOSNotification);
                        return this;
                    }
                    sEIOSNotification.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEIOSNotification);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEIOSNotification.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return NotificationProtos.internal_static_SA_SEIOSNotification_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
                public SEIOSNotification getList(int i7) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEIOSNotification) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
                public List<SEIOSNotification> getListList() {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
                public SEIOSNotificationOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEIOSNotificationOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
                public List<? extends SEIOSNotificationOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_SA_SEIOSNotification_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEIOSNotification sEIOSNotification) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEIOSNotification);
                        return this;
                    }
                    sEIOSNotification.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEIOSNotification);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(k kVar) {
                    this();
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
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
                    buildPartialRepeatedFields(sEList);
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

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEIOSNotification.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEIOSNotification sEIOSNotification) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEIOSNotification.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEIOSNotification);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEIOSNotification);
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

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(SEList sEList) {
                    if (sEList == SEList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!sEList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = sEList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(sEList.list_);
                            }
                            onChanged();
                        }
                    } else if (!sEList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = sEList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(sEList.list_);
                        }
                    }
                    mergeUnknownFields(sEList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEIOSNotification sEIOSNotification = (SEIOSNotification) codedInputStream.readMessage(SEIOSNotification.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEIOSNotification, Builder, SEIOSNotificationOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEIOSNotification);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEIOSNotification);
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, k kVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEIOSNotification_SEList_descriptor;
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
                return getListList().equals(sEList.getListList()) && getUnknownFields().equals(sEList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEIOSNotification_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
            public SEIOSNotification getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
            public List<SEIOSNotification> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
            public SEIOSNotificationOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.SEListOrBuilder
            public List<? extends SEIOSNotificationOrBuilder> getListOrBuilderList() {
                return this.list_;
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
                return NotificationProtos.internal_static_SA_SEIOSNotification_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
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

            private SEList() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
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
            SEIOSNotification getList(int i7);

            int getListCount();

            List<SEIOSNotification> getListList();

            SEIOSNotificationOrBuilder getListOrBuilder(int i7);

            List<? extends SEIOSNotificationOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEIOSNotification");
            DEFAULT_INSTANCE = new SEIOSNotification();
            PARSER = new AbstractParser<SEIOSNotification>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotification.1
                @Override // com.google.protobuf.Parser
                public SEIOSNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEIOSNotification.newBuilder();
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

        public /* synthetic */ SEIOSNotification(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEIOSNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEIOSNotification_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEIOSNotification parseDelimitedFrom(InputStream inputStream) {
            return (SEIOSNotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEIOSNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEIOSNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEIOSNotification)) {
                return super.equals(obj);
            }
            SEIOSNotification sEIOSNotification = (SEIOSNotification) obj;
            if (hasEnableSwitch() != sEIOSNotification.hasEnableSwitch()) {
                return false;
            }
            if ((!hasEnableSwitch() || getEnableSwitch() == sEIOSNotification.getEnableSwitch()) && hasAppType() == sEIOSNotification.hasAppType()) {
                return (!hasAppType() || this.appType_ == sEIOSNotification.appType_) && getUnknownFields().equals(sEIOSNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotificationOrBuilder
        public SEIOSAppTag getAppType() {
            SEIOSAppTag sEIOSAppTagForNumber = SEIOSAppTag.forNumber(this.appType_);
            return sEIOSAppTagForNumber == null ? SEIOSAppTag.APP_MAIN : sEIOSAppTagForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEIOSNotification_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotificationOrBuilder
        public boolean getEnableSwitch() {
            return this.enableSwitch_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEIOSNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.enableSwitch_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.appType_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotificationOrBuilder
        public boolean hasAppType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEIOSNotificationOrBuilder
        public boolean hasEnableSwitch() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasEnableSwitch()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getEnableSwitch());
            }
            if (hasAppType()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.appType_;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEIOSNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SEIOSNotification.class, Builder.class);
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
            if (!hasEnableSwitch()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAppType()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.enableSwitch_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.appType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEIOSNotification(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.enableSwitch_ = false;
            this.appType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEIOSNotification sEIOSNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEIOSNotification);
        }

        public static SEIOSNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEIOSNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEIOSNotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEIOSNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEIOSNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEIOSNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEIOSNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEIOSNotification() {
            this.enableSwitch_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.appType_ = 0;
        }

        public static SEIOSNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEIOSNotification parseFrom(InputStream inputStream) {
            return (SEIOSNotification) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEIOSNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEIOSNotification) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEIOSNotification parseFrom(CodedInputStream codedInputStream) {
            return (SEIOSNotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEIOSNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEIOSNotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEIOSNotificationOrBuilder extends MessageOrBuilder {
        SEIOSAppTag getAppType();

        boolean getEnableSwitch();

        boolean hasAppType();

        boolean hasEnableSwitch();
    }

    public static final class SENotification extends GeneratedMessage implements SENotificationOrBuilder {
        public static final int APP_NOTIFICATION_FIELD_NUMBER = 2;
        public static final int APP_SUPER_NOTIFICATION_FIELD_NUMBER = 19;
        public static final int CALL_STATE_FIELD_NUMBER = 4;
        public static final int COLLECTION_CONTACTS_LIST_FIELD_NUMBER = 8;
        public static final int CONTACTS_AVATAR_LIST_FIELD_NUMBER = 12;
        public static final int CONTACTS_CY_2_FIELD_NUMBER = 10;
        public static final int CONTACTS_LIST_FIELD_NUMBER = 7;
        public static final int CONTACT_AVATAR_DATA_FIELD_NUMBER = 11;
        public static final int CONTACT_INFO_FIELD_NUMBER = 15;
        private static final SENotification DEFAULT_INSTANCE;
        public static final int GLOD_FRIEND_CONTACTS_FIELD_NUMBER = 13;
        public static final int GLOD_FRIEND_EMOJI_FIELD_NUMBER = 14;
        public static final int IOS_NOTIFICATION_LIST_FIELD_NUMBER = 3;
        public static final int NUMBER_FIELD_NUMBER = 16;
        public static final int OPEN_IN_PHONE_KEY_FIELD_NUMBER = 17;
        private static final Parser<SENotification> PARSER;
        public static final int QUICK_REPLY_LIST_FIELD_NUMBER = 5;
        public static final int QUICK_REPLY_MESSAGE_FIELD_NUMBER = 6;
        public static final int REMOVE_NOTIF_FIELD_NUMBER = 18;
        public static final int SOS_CONTACTS_FIELD_NUMBER = 9;
        public static final int SYSTEM_NOTIFICATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int payloadCase_;
        private Object payload_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SENotification$1 */
        public class AnonymousClass1 extends AbstractParser<SENotification> {
            @Override // com.google.protobuf.Parser
            public SENotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SENotification.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SENotificationOrBuilder {
            private SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> appNotificationBuilder_;
            private SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> appSuperNotificationBuilder_;
            private int bitField0_;
            private SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> collectionContactsListBuilder_;
            private SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> contactAvatarDataBuilder_;
            private SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> contactInfoBuilder_;
            private SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> contactsAvatarListBuilder_;
            private SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> contactsCy2Builder_;
            private SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> contactsListBuilder_;
            private SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> glodFriendContactsBuilder_;
            private SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> glodFriendEmojiBuilder_;
            private SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> iosNotificationListBuilder_;
            private int payloadCase_;
            private Object payload_;
            private SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> quickReplyListBuilder_;
            private SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> quickReplyMessageBuilder_;
            private SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> removeNotifBuilder_;
            private SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> sosContactsBuilder_;
            private SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> systemNotificationBuilder_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SENotification sENotification) {
            }

            private void buildPartialOneofs(SENotification sENotification) {
                SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> singleFieldBuilder;
                SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> singleFieldBuilder2;
                SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> singleFieldBuilder3;
                SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> singleFieldBuilder4;
                SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> singleFieldBuilder5;
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder6;
                SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> singleFieldBuilder7;
                SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> singleFieldBuilder8;
                SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> singleFieldBuilder9;
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder10;
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder11;
                SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> singleFieldBuilder12;
                SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> singleFieldBuilder13;
                SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> singleFieldBuilder14;
                SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> singleFieldBuilder15;
                SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> singleFieldBuilder16;
                int i7 = this.payloadCase_;
                sENotification.payloadCase_ = i7;
                sENotification.payload_ = this.payload_;
                if (i7 == 1 && (singleFieldBuilder16 = this.systemNotificationBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder16.build();
                }
                if (this.payloadCase_ == 2 && (singleFieldBuilder15 = this.appNotificationBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder15.build();
                }
                if (this.payloadCase_ == 3 && (singleFieldBuilder14 = this.iosNotificationListBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder14.build();
                }
                if (this.payloadCase_ == 5 && (singleFieldBuilder13 = this.quickReplyListBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder13.build();
                }
                if (this.payloadCase_ == 6 && (singleFieldBuilder12 = this.quickReplyMessageBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder12.build();
                }
                if (this.payloadCase_ == 7 && (singleFieldBuilder11 = this.contactsListBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder11.build();
                }
                if (this.payloadCase_ == 8 && (singleFieldBuilder10 = this.collectionContactsListBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder10.build();
                }
                if (this.payloadCase_ == 9 && (singleFieldBuilder9 = this.sosContactsBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder9.build();
                }
                if (this.payloadCase_ == 10 && (singleFieldBuilder8 = this.contactsCy2Builder_) != null) {
                    sENotification.payload_ = singleFieldBuilder8.build();
                }
                if (this.payloadCase_ == 11 && (singleFieldBuilder7 = this.contactAvatarDataBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder7.build();
                }
                if (this.payloadCase_ == 12 && (singleFieldBuilder6 = this.contactsAvatarListBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder6.build();
                }
                if (this.payloadCase_ == 13 && (singleFieldBuilder5 = this.glodFriendContactsBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder5.build();
                }
                if (this.payloadCase_ == 14 && (singleFieldBuilder4 = this.glodFriendEmojiBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder4.build();
                }
                if (this.payloadCase_ == 15 && (singleFieldBuilder3 = this.contactInfoBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder3.build();
                }
                if (this.payloadCase_ == 18 && (singleFieldBuilder2 = this.removeNotifBuilder_) != null) {
                    sENotification.payload_ = singleFieldBuilder2.build();
                }
                if (this.payloadCase_ != 19 || (singleFieldBuilder = this.appSuperNotificationBuilder_) == null) {
                    return;
                }
                sENotification.payload_ = singleFieldBuilder.build();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SENotification_descriptor;
            }

            private SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> internalGetAppNotificationFieldBuilder() {
                if (this.appNotificationBuilder_ == null) {
                    if (this.payloadCase_ != 2) {
                        this.payload_ = SEAppNotification.getDefaultInstance();
                    }
                    this.appNotificationBuilder_ = new SingleFieldBuilder<>((SEAppNotification) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 2;
                onChanged();
                return this.appNotificationBuilder_;
            }

            private SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> internalGetAppSuperNotificationFieldBuilder() {
                if (this.appSuperNotificationBuilder_ == null) {
                    if (this.payloadCase_ != 19) {
                        this.payload_ = SEAppSuperNotification.getDefaultInstance();
                    }
                    this.appSuperNotificationBuilder_ = new SingleFieldBuilder<>((SEAppSuperNotification) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 19;
                onChanged();
                return this.appSuperNotificationBuilder_;
            }

            private SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> internalGetCollectionContactsListFieldBuilder() {
                if (this.collectionContactsListBuilder_ == null) {
                    if (this.payloadCase_ != 8) {
                        this.payload_ = SEContacts.SEList.getDefaultInstance();
                    }
                    this.collectionContactsListBuilder_ = new SingleFieldBuilder<>((SEContacts.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 8;
                onChanged();
                return this.collectionContactsListBuilder_;
            }

            private SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> internalGetContactAvatarDataFieldBuilder() {
                if (this.contactAvatarDataBuilder_ == null) {
                    if (this.payloadCase_ != 11) {
                        this.payload_ = SEContactsAvatarData.getDefaultInstance();
                    }
                    this.contactAvatarDataBuilder_ = new SingleFieldBuilder<>((SEContactsAvatarData) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 11;
                onChanged();
                return this.contactAvatarDataBuilder_;
            }

            private SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> internalGetContactInfoFieldBuilder() {
                if (this.contactInfoBuilder_ == null) {
                    if (this.payloadCase_ != 15) {
                        this.payload_ = SEContactInfo.getDefaultInstance();
                    }
                    this.contactInfoBuilder_ = new SingleFieldBuilder<>((SEContactInfo) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 15;
                onChanged();
                return this.contactInfoBuilder_;
            }

            private SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> internalGetContactsAvatarListFieldBuilder() {
                if (this.contactsAvatarListBuilder_ == null) {
                    if (this.payloadCase_ != 12) {
                        this.payload_ = SEContactsAvatar.SEList.getDefaultInstance();
                    }
                    this.contactsAvatarListBuilder_ = new SingleFieldBuilder<>((SEContactsAvatar.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 12;
                onChanged();
                return this.contactsAvatarListBuilder_;
            }

            private SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> internalGetContactsCy2FieldBuilder() {
                if (this.contactsCy2Builder_ == null) {
                    if (this.payloadCase_ != 10) {
                        this.payload_ = SEContactsCY_2.getDefaultInstance();
                    }
                    this.contactsCy2Builder_ = new SingleFieldBuilder<>((SEContactsCY_2) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 10;
                onChanged();
                return this.contactsCy2Builder_;
            }

            private SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> internalGetContactsListFieldBuilder() {
                if (this.contactsListBuilder_ == null) {
                    if (this.payloadCase_ != 7) {
                        this.payload_ = SEContacts.SEList.getDefaultInstance();
                    }
                    this.contactsListBuilder_ = new SingleFieldBuilder<>((SEContacts.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 7;
                onChanged();
                return this.contactsListBuilder_;
            }

            private SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> internalGetGlodFriendContactsFieldBuilder() {
                if (this.glodFriendContactsBuilder_ == null) {
                    if (this.payloadCase_ != 13) {
                        this.payload_ = SEGlodFriendContacts.SEList.getDefaultInstance();
                    }
                    this.glodFriendContactsBuilder_ = new SingleFieldBuilder<>((SEGlodFriendContacts.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 13;
                onChanged();
                return this.glodFriendContactsBuilder_;
            }

            private SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> internalGetGlodFriendEmojiFieldBuilder() {
                if (this.glodFriendEmojiBuilder_ == null) {
                    if (this.payloadCase_ != 14) {
                        this.payload_ = SEGlodFriendEmoji.getDefaultInstance();
                    }
                    this.glodFriendEmojiBuilder_ = new SingleFieldBuilder<>((SEGlodFriendEmoji) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 14;
                onChanged();
                return this.glodFriendEmojiBuilder_;
            }

            private SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> internalGetIosNotificationListFieldBuilder() {
                if (this.iosNotificationListBuilder_ == null) {
                    if (this.payloadCase_ != 3) {
                        this.payload_ = SEIOSNotification.SEList.getDefaultInstance();
                    }
                    this.iosNotificationListBuilder_ = new SingleFieldBuilder<>((SEIOSNotification.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 3;
                onChanged();
                return this.iosNotificationListBuilder_;
            }

            private SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> internalGetQuickReplyListFieldBuilder() {
                if (this.quickReplyListBuilder_ == null) {
                    if (this.payloadCase_ != 5) {
                        this.payload_ = SEQuickReply.SEList.getDefaultInstance();
                    }
                    this.quickReplyListBuilder_ = new SingleFieldBuilder<>((SEQuickReply.SEList) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 5;
                onChanged();
                return this.quickReplyListBuilder_;
            }

            private SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> internalGetQuickReplyMessageFieldBuilder() {
                if (this.quickReplyMessageBuilder_ == null) {
                    if (this.payloadCase_ != 6) {
                        this.payload_ = SEQuickReplyMessage.getDefaultInstance();
                    }
                    this.quickReplyMessageBuilder_ = new SingleFieldBuilder<>((SEQuickReplyMessage) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 6;
                onChanged();
                return this.quickReplyMessageBuilder_;
            }

            private SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> internalGetRemoveNotifFieldBuilder() {
                if (this.removeNotifBuilder_ == null) {
                    if (this.payloadCase_ != 18) {
                        this.payload_ = SEAppRemoveNotif.getDefaultInstance();
                    }
                    this.removeNotifBuilder_ = new SingleFieldBuilder<>((SEAppRemoveNotif) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 18;
                onChanged();
                return this.removeNotifBuilder_;
            }

            private SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> internalGetSosContactsFieldBuilder() {
                if (this.sosContactsBuilder_ == null) {
                    if (this.payloadCase_ != 9) {
                        this.payload_ = SESOSContacts.getDefaultInstance();
                    }
                    this.sosContactsBuilder_ = new SingleFieldBuilder<>((SESOSContacts) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 9;
                onChanged();
                return this.sosContactsBuilder_;
            }

            private SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> internalGetSystemNotificationFieldBuilder() {
                if (this.systemNotificationBuilder_ == null) {
                    if (this.payloadCase_ != 1) {
                        this.payload_ = SESystemNotification.getDefaultInstance();
                    }
                    this.systemNotificationBuilder_ = new SingleFieldBuilder<>((SESystemNotification) this.payload_, getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                this.payloadCase_ = 1;
                onChanged();
                return this.systemNotificationBuilder_;
            }

            public Builder clearAppNotification() {
                SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> singleFieldBuilder = this.appNotificationBuilder_;
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

            public Builder clearAppSuperNotification() {
                SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> singleFieldBuilder = this.appSuperNotificationBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearCallState() {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearCollectionContactsList() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.collectionContactsListBuilder_;
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

            public Builder clearContactAvatarData() {
                SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> singleFieldBuilder = this.contactAvatarDataBuilder_;
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

            public Builder clearContactInfo() {
                SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> singleFieldBuilder = this.contactInfoBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearContactsAvatarList() {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearContactsCy2() {
                SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> singleFieldBuilder = this.contactsCy2Builder_;
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

            public Builder clearContactsList() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
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

            public Builder clearGlodFriendContacts() {
                SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> singleFieldBuilder = this.glodFriendContactsBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearGlodFriendEmoji() {
                SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> singleFieldBuilder = this.glodFriendEmojiBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearIosNotificationList() {
                SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> singleFieldBuilder = this.iosNotificationListBuilder_;
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

            public Builder clearNumber() {
                if (this.payloadCase_ == 16) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearOpenInPhoneKey() {
                if (this.payloadCase_ == 17) {
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

            public Builder clearQuickReplyList() {
                SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> singleFieldBuilder = this.quickReplyListBuilder_;
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

            public Builder clearQuickReplyMessage() {
                SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> singleFieldBuilder = this.quickReplyMessageBuilder_;
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

            public Builder clearRemoveNotif() {
                SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> singleFieldBuilder = this.removeNotifBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            public Builder clearSosContacts() {
                SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> singleFieldBuilder = this.sosContactsBuilder_;
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

            public Builder clearSystemNotification() {
                SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> singleFieldBuilder = this.systemNotificationBuilder_;
                if (singleFieldBuilder == null) {
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
                singleFieldBuilder.clear();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEAppNotification getAppNotification() {
                SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> singleFieldBuilder = this.appNotificationBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 2 ? (SEAppNotification) this.payload_ : SEAppNotification.getDefaultInstance() : this.payloadCase_ == 2 ? (SEAppNotification) singleFieldBuilder.getMessage() : SEAppNotification.getDefaultInstance();
            }

            public SEAppNotification.Builder getAppNotificationBuilder() {
                return (SEAppNotification.Builder) internalGetAppNotificationFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEAppNotificationOrBuilder getAppNotificationOrBuilder() {
                SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 2 || (singleFieldBuilder = this.appNotificationBuilder_) == null) ? i7 == 2 ? (SEAppNotification) this.payload_ : SEAppNotification.getDefaultInstance() : (SEAppNotificationOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEAppSuperNotification getAppSuperNotification() {
                SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> singleFieldBuilder = this.appSuperNotificationBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 19 ? (SEAppSuperNotification) this.payload_ : SEAppSuperNotification.getDefaultInstance() : this.payloadCase_ == 19 ? (SEAppSuperNotification) singleFieldBuilder.getMessage() : SEAppSuperNotification.getDefaultInstance();
            }

            public SEAppSuperNotification.Builder getAppSuperNotificationBuilder() {
                return (SEAppSuperNotification.Builder) internalGetAppSuperNotificationFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEAppSuperNotificationOrBuilder getAppSuperNotificationOrBuilder() {
                SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 19 || (singleFieldBuilder = this.appSuperNotificationBuilder_) == null) ? i7 == 19 ? (SEAppSuperNotification) this.payload_ : SEAppSuperNotification.getDefaultInstance() : (SEAppSuperNotificationOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SECallState getCallState() {
                SECallState sECallStateForNumber;
                return (this.payloadCase_ != 4 || (sECallStateForNumber = SECallState.forNumber(((Integer) this.payload_).intValue())) == null) ? SECallState.ANSWER_PHONE : sECallStateForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContacts.SEList getCollectionContactsList() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.collectionContactsListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 8 ? (SEContacts.SEList) this.payload_ : SEContacts.SEList.getDefaultInstance() : this.payloadCase_ == 8 ? (SEContacts.SEList) singleFieldBuilder.getMessage() : SEContacts.SEList.getDefaultInstance();
            }

            public SEContacts.SEList.Builder getCollectionContactsListBuilder() {
                return (SEContacts.SEList.Builder) internalGetCollectionContactsListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContacts.SEListOrBuilder getCollectionContactsListOrBuilder() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 8 || (singleFieldBuilder = this.collectionContactsListBuilder_) == null) ? i7 == 8 ? (SEContacts.SEList) this.payload_ : SEContacts.SEList.getDefaultInstance() : (SEContacts.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContactsAvatarData getContactAvatarData() {
                SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> singleFieldBuilder = this.contactAvatarDataBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 11 ? (SEContactsAvatarData) this.payload_ : SEContactsAvatarData.getDefaultInstance() : this.payloadCase_ == 11 ? (SEContactsAvatarData) singleFieldBuilder.getMessage() : SEContactsAvatarData.getDefaultInstance();
            }

            public SEContactsAvatarData.Builder getContactAvatarDataBuilder() {
                return (SEContactsAvatarData.Builder) internalGetContactAvatarDataFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContactsAvatarDataOrBuilder getContactAvatarDataOrBuilder() {
                SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 11 || (singleFieldBuilder = this.contactAvatarDataBuilder_) == null) ? i7 == 11 ? (SEContactsAvatarData) this.payload_ : SEContactsAvatarData.getDefaultInstance() : (SEContactsAvatarDataOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContactInfo getContactInfo() {
                SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> singleFieldBuilder = this.contactInfoBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 15 ? (SEContactInfo) this.payload_ : SEContactInfo.getDefaultInstance() : this.payloadCase_ == 15 ? (SEContactInfo) singleFieldBuilder.getMessage() : SEContactInfo.getDefaultInstance();
            }

            public SEContactInfo.Builder getContactInfoBuilder() {
                return (SEContactInfo.Builder) internalGetContactInfoFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContactInfoOrBuilder getContactInfoOrBuilder() {
                SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 15 || (singleFieldBuilder = this.contactInfoBuilder_) == null) ? i7 == 15 ? (SEContactInfo) this.payload_ : SEContactInfo.getDefaultInstance() : (SEContactInfoOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContactsAvatar.SEList getContactsAvatarList() {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 12 ? (SEContactsAvatar.SEList) this.payload_ : SEContactsAvatar.SEList.getDefaultInstance() : this.payloadCase_ == 12 ? (SEContactsAvatar.SEList) singleFieldBuilder.getMessage() : SEContactsAvatar.SEList.getDefaultInstance();
            }

            public SEContactsAvatar.SEList.Builder getContactsAvatarListBuilder() {
                return (SEContactsAvatar.SEList.Builder) internalGetContactsAvatarListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContactsAvatar.SEListOrBuilder getContactsAvatarListOrBuilder() {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 12 || (singleFieldBuilder = this.contactsAvatarListBuilder_) == null) ? i7 == 12 ? (SEContactsAvatar.SEList) this.payload_ : SEContactsAvatar.SEList.getDefaultInstance() : (SEContactsAvatar.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContactsCY_2 getContactsCy2() {
                SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> singleFieldBuilder = this.contactsCy2Builder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 10 ? (SEContactsCY_2) this.payload_ : SEContactsCY_2.getDefaultInstance() : this.payloadCase_ == 10 ? (SEContactsCY_2) singleFieldBuilder.getMessage() : SEContactsCY_2.getDefaultInstance();
            }

            public SEContactsCY_2.Builder getContactsCy2Builder() {
                return (SEContactsCY_2.Builder) internalGetContactsCy2FieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContactsCY_2OrBuilder getContactsCy2OrBuilder() {
                SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 10 || (singleFieldBuilder = this.contactsCy2Builder_) == null) ? i7 == 10 ? (SEContactsCY_2) this.payload_ : SEContactsCY_2.getDefaultInstance() : (SEContactsCY_2OrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContacts.SEList getContactsList() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 7 ? (SEContacts.SEList) this.payload_ : SEContacts.SEList.getDefaultInstance() : this.payloadCase_ == 7 ? (SEContacts.SEList) singleFieldBuilder.getMessage() : SEContacts.SEList.getDefaultInstance();
            }

            public SEContacts.SEList.Builder getContactsListBuilder() {
                return (SEContacts.SEList.Builder) internalGetContactsListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEContacts.SEListOrBuilder getContactsListOrBuilder() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 7 || (singleFieldBuilder = this.contactsListBuilder_) == null) ? i7 == 7 ? (SEContacts.SEList) this.payload_ : SEContacts.SEList.getDefaultInstance() : (SEContacts.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SENotification_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEGlodFriendContacts.SEList getGlodFriendContacts() {
                SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> singleFieldBuilder = this.glodFriendContactsBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 13 ? (SEGlodFriendContacts.SEList) this.payload_ : SEGlodFriendContacts.SEList.getDefaultInstance() : this.payloadCase_ == 13 ? (SEGlodFriendContacts.SEList) singleFieldBuilder.getMessage() : SEGlodFriendContacts.SEList.getDefaultInstance();
            }

            public SEGlodFriendContacts.SEList.Builder getGlodFriendContactsBuilder() {
                return (SEGlodFriendContacts.SEList.Builder) internalGetGlodFriendContactsFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEGlodFriendContacts.SEListOrBuilder getGlodFriendContactsOrBuilder() {
                SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 13 || (singleFieldBuilder = this.glodFriendContactsBuilder_) == null) ? i7 == 13 ? (SEGlodFriendContacts.SEList) this.payload_ : SEGlodFriendContacts.SEList.getDefaultInstance() : (SEGlodFriendContacts.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEGlodFriendEmoji getGlodFriendEmoji() {
                SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> singleFieldBuilder = this.glodFriendEmojiBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 14 ? (SEGlodFriendEmoji) this.payload_ : SEGlodFriendEmoji.getDefaultInstance() : this.payloadCase_ == 14 ? (SEGlodFriendEmoji) singleFieldBuilder.getMessage() : SEGlodFriendEmoji.getDefaultInstance();
            }

            public SEGlodFriendEmoji.Builder getGlodFriendEmojiBuilder() {
                return (SEGlodFriendEmoji.Builder) internalGetGlodFriendEmojiFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEGlodFriendEmojiOrBuilder getGlodFriendEmojiOrBuilder() {
                SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 14 || (singleFieldBuilder = this.glodFriendEmojiBuilder_) == null) ? i7 == 14 ? (SEGlodFriendEmoji) this.payload_ : SEGlodFriendEmoji.getDefaultInstance() : (SEGlodFriendEmojiOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEIOSNotification.SEList getIosNotificationList() {
                SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> singleFieldBuilder = this.iosNotificationListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 3 ? (SEIOSNotification.SEList) this.payload_ : SEIOSNotification.SEList.getDefaultInstance() : this.payloadCase_ == 3 ? (SEIOSNotification.SEList) singleFieldBuilder.getMessage() : SEIOSNotification.SEList.getDefaultInstance();
            }

            public SEIOSNotification.SEList.Builder getIosNotificationListBuilder() {
                return (SEIOSNotification.SEList.Builder) internalGetIosNotificationListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEIOSNotification.SEListOrBuilder getIosNotificationListOrBuilder() {
                SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 3 || (singleFieldBuilder = this.iosNotificationListBuilder_) == null) ? i7 == 3 ? (SEIOSNotification.SEList) this.payload_ : SEIOSNotification.SEList.getDefaultInstance() : (SEIOSNotification.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public String getNumber() {
                if (this.payloadCase_ != 16) {
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

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public ByteString getNumberBytes() {
                if (this.payloadCase_ != 16) {
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

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public String getOpenInPhoneKey() {
                if (this.payloadCase_ != 17) {
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

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public ByteString getOpenInPhoneKeyBytes() {
                if (this.payloadCase_ != 17) {
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

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public PayloadCase getPayloadCase() {
                return PayloadCase.forNumber(this.payloadCase_);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEQuickReply.SEList getQuickReplyList() {
                SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> singleFieldBuilder = this.quickReplyListBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 5 ? (SEQuickReply.SEList) this.payload_ : SEQuickReply.SEList.getDefaultInstance() : this.payloadCase_ == 5 ? (SEQuickReply.SEList) singleFieldBuilder.getMessage() : SEQuickReply.SEList.getDefaultInstance();
            }

            public SEQuickReply.SEList.Builder getQuickReplyListBuilder() {
                return (SEQuickReply.SEList.Builder) internalGetQuickReplyListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEQuickReply.SEListOrBuilder getQuickReplyListOrBuilder() {
                SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 5 || (singleFieldBuilder = this.quickReplyListBuilder_) == null) ? i7 == 5 ? (SEQuickReply.SEList) this.payload_ : SEQuickReply.SEList.getDefaultInstance() : (SEQuickReply.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEQuickReplyMessage getQuickReplyMessage() {
                SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> singleFieldBuilder = this.quickReplyMessageBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 6 ? (SEQuickReplyMessage) this.payload_ : SEQuickReplyMessage.getDefaultInstance() : this.payloadCase_ == 6 ? (SEQuickReplyMessage) singleFieldBuilder.getMessage() : SEQuickReplyMessage.getDefaultInstance();
            }

            public SEQuickReplyMessage.Builder getQuickReplyMessageBuilder() {
                return (SEQuickReplyMessage.Builder) internalGetQuickReplyMessageFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEQuickReplyMessageOrBuilder getQuickReplyMessageOrBuilder() {
                SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 6 || (singleFieldBuilder = this.quickReplyMessageBuilder_) == null) ? i7 == 6 ? (SEQuickReplyMessage) this.payload_ : SEQuickReplyMessage.getDefaultInstance() : (SEQuickReplyMessageOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEAppRemoveNotif getRemoveNotif() {
                SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> singleFieldBuilder = this.removeNotifBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 18 ? (SEAppRemoveNotif) this.payload_ : SEAppRemoveNotif.getDefaultInstance() : this.payloadCase_ == 18 ? (SEAppRemoveNotif) singleFieldBuilder.getMessage() : SEAppRemoveNotif.getDefaultInstance();
            }

            public SEAppRemoveNotif.Builder getRemoveNotifBuilder() {
                return (SEAppRemoveNotif.Builder) internalGetRemoveNotifFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SEAppRemoveNotifOrBuilder getRemoveNotifOrBuilder() {
                SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 18 || (singleFieldBuilder = this.removeNotifBuilder_) == null) ? i7 == 18 ? (SEAppRemoveNotif) this.payload_ : SEAppRemoveNotif.getDefaultInstance() : (SEAppRemoveNotifOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SESOSContacts getSosContacts() {
                SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> singleFieldBuilder = this.sosContactsBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 9 ? (SESOSContacts) this.payload_ : SESOSContacts.getDefaultInstance() : this.payloadCase_ == 9 ? (SESOSContacts) singleFieldBuilder.getMessage() : SESOSContacts.getDefaultInstance();
            }

            public SESOSContacts.Builder getSosContactsBuilder() {
                return (SESOSContacts.Builder) internalGetSosContactsFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SESOSContactsOrBuilder getSosContactsOrBuilder() {
                SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 9 || (singleFieldBuilder = this.sosContactsBuilder_) == null) ? i7 == 9 ? (SESOSContacts) this.payload_ : SESOSContacts.getDefaultInstance() : (SESOSContactsOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SESystemNotification getSystemNotification() {
                SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> singleFieldBuilder = this.systemNotificationBuilder_;
                return singleFieldBuilder == null ? this.payloadCase_ == 1 ? (SESystemNotification) this.payload_ : SESystemNotification.getDefaultInstance() : this.payloadCase_ == 1 ? (SESystemNotification) singleFieldBuilder.getMessage() : SESystemNotification.getDefaultInstance();
            }

            public SESystemNotification.Builder getSystemNotificationBuilder() {
                return (SESystemNotification.Builder) internalGetSystemNotificationFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public SESystemNotificationOrBuilder getSystemNotificationOrBuilder() {
                SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> singleFieldBuilder;
                int i7 = this.payloadCase_;
                return (i7 != 1 || (singleFieldBuilder = this.systemNotificationBuilder_) == null) ? i7 == 1 ? (SESystemNotification) this.payload_ : SESystemNotification.getDefaultInstance() : (SESystemNotificationOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasAppNotification() {
                return this.payloadCase_ == 2;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasAppSuperNotification() {
                return this.payloadCase_ == 19;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasCallState() {
                return this.payloadCase_ == 4;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasCollectionContactsList() {
                return this.payloadCase_ == 8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasContactAvatarData() {
                return this.payloadCase_ == 11;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasContactInfo() {
                return this.payloadCase_ == 15;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasContactsAvatarList() {
                return this.payloadCase_ == 12;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasContactsCy2() {
                return this.payloadCase_ == 10;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasContactsList() {
                return this.payloadCase_ == 7;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasGlodFriendContacts() {
                return this.payloadCase_ == 13;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasGlodFriendEmoji() {
                return this.payloadCase_ == 14;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasIosNotificationList() {
                return this.payloadCase_ == 3;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasNumber() {
                return this.payloadCase_ == 16;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasOpenInPhoneKey() {
                return this.payloadCase_ == 17;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasQuickReplyList() {
                return this.payloadCase_ == 5;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasQuickReplyMessage() {
                return this.payloadCase_ == 6;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasRemoveNotif() {
                return this.payloadCase_ == 18;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasSosContacts() {
                return this.payloadCase_ == 9;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
            public boolean hasSystemNotification() {
                return this.payloadCase_ == 1;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SENotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SENotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSystemNotification() && !getSystemNotification().isInitialized()) {
                    return false;
                }
                if (hasAppNotification() && !getAppNotification().isInitialized()) {
                    return false;
                }
                if (hasIosNotificationList() && !getIosNotificationList().isInitialized()) {
                    return false;
                }
                if (hasQuickReplyList() && !getQuickReplyList().isInitialized()) {
                    return false;
                }
                if (hasQuickReplyMessage() && !getQuickReplyMessage().isInitialized()) {
                    return false;
                }
                if (hasSosContacts() && !getSosContacts().isInitialized()) {
                    return false;
                }
                if (hasContactsCy2() && !getContactsCy2().isInitialized()) {
                    return false;
                }
                if (hasContactAvatarData() && !getContactAvatarData().isInitialized()) {
                    return false;
                }
                if (hasGlodFriendContacts() && !getGlodFriendContacts().isInitialized()) {
                    return false;
                }
                if (hasGlodFriendEmoji() && !getGlodFriendEmoji().isInitialized()) {
                    return false;
                }
                if (hasContactInfo() && !getContactInfo().isInitialized()) {
                    return false;
                }
                if (!hasRemoveNotif() || getRemoveNotif().isInitialized()) {
                    return !hasAppSuperNotification() || getAppSuperNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeAppNotification(SEAppNotification sEAppNotification) {
                SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> singleFieldBuilder = this.appNotificationBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 2 || this.payload_ == SEAppNotification.getDefaultInstance()) {
                        this.payload_ = sEAppNotification;
                    } else {
                        this.payload_ = SEAppNotification.newBuilder((SEAppNotification) this.payload_).mergeFrom(sEAppNotification).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 2) {
                    singleFieldBuilder.mergeFrom(sEAppNotification);
                } else {
                    singleFieldBuilder.setMessage(sEAppNotification);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder mergeAppSuperNotification(SEAppSuperNotification sEAppSuperNotification) {
                SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> singleFieldBuilder = this.appSuperNotificationBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 19 || this.payload_ == SEAppSuperNotification.getDefaultInstance()) {
                        this.payload_ = sEAppSuperNotification;
                    } else {
                        this.payload_ = SEAppSuperNotification.newBuilder((SEAppSuperNotification) this.payload_).mergeFrom(sEAppSuperNotification).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 19) {
                    singleFieldBuilder.mergeFrom(sEAppSuperNotification);
                } else {
                    singleFieldBuilder.setMessage(sEAppSuperNotification);
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder mergeCollectionContactsList(SEContacts.SEList sEList) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.collectionContactsListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 8 || this.payload_ == SEContacts.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEContacts.SEList.newBuilder((SEContacts.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 8) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder mergeContactAvatarData(SEContactsAvatarData sEContactsAvatarData) {
                SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> singleFieldBuilder = this.contactAvatarDataBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 11 || this.payload_ == SEContactsAvatarData.getDefaultInstance()) {
                        this.payload_ = sEContactsAvatarData;
                    } else {
                        this.payload_ = SEContactsAvatarData.newBuilder((SEContactsAvatarData) this.payload_).mergeFrom(sEContactsAvatarData).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 11) {
                    singleFieldBuilder.mergeFrom(sEContactsAvatarData);
                } else {
                    singleFieldBuilder.setMessage(sEContactsAvatarData);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder mergeContactInfo(SEContactInfo sEContactInfo) {
                SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> singleFieldBuilder = this.contactInfoBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 15 || this.payload_ == SEContactInfo.getDefaultInstance()) {
                        this.payload_ = sEContactInfo;
                    } else {
                        this.payload_ = SEContactInfo.newBuilder((SEContactInfo) this.payload_).mergeFrom(sEContactInfo).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 15) {
                    singleFieldBuilder.mergeFrom(sEContactInfo);
                } else {
                    singleFieldBuilder.setMessage(sEContactInfo);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder mergeContactsAvatarList(SEContactsAvatar.SEList sEList) {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 12 || this.payload_ == SEContactsAvatar.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEContactsAvatar.SEList.newBuilder((SEContactsAvatar.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 12) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder mergeContactsCy2(SEContactsCY_2 sEContactsCY_2) {
                SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> singleFieldBuilder = this.contactsCy2Builder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 10 || this.payload_ == SEContactsCY_2.getDefaultInstance()) {
                        this.payload_ = sEContactsCY_2;
                    } else {
                        this.payload_ = SEContactsCY_2.newBuilder((SEContactsCY_2) this.payload_).mergeFrom(sEContactsCY_2).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 10) {
                    singleFieldBuilder.mergeFrom(sEContactsCY_2);
                } else {
                    singleFieldBuilder.setMessage(sEContactsCY_2);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder mergeContactsList(SEContacts.SEList sEList) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 7 || this.payload_ == SEContacts.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEContacts.SEList.newBuilder((SEContacts.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 7) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder mergeGlodFriendContacts(SEGlodFriendContacts.SEList sEList) {
                SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> singleFieldBuilder = this.glodFriendContactsBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 13 || this.payload_ == SEGlodFriendContacts.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEGlodFriendContacts.SEList.newBuilder((SEGlodFriendContacts.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 13) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder mergeGlodFriendEmoji(SEGlodFriendEmoji sEGlodFriendEmoji) {
                SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> singleFieldBuilder = this.glodFriendEmojiBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 14 || this.payload_ == SEGlodFriendEmoji.getDefaultInstance()) {
                        this.payload_ = sEGlodFriendEmoji;
                    } else {
                        this.payload_ = SEGlodFriendEmoji.newBuilder((SEGlodFriendEmoji) this.payload_).mergeFrom(sEGlodFriendEmoji).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 14) {
                    singleFieldBuilder.mergeFrom(sEGlodFriendEmoji);
                } else {
                    singleFieldBuilder.setMessage(sEGlodFriendEmoji);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder mergeIosNotificationList(SEIOSNotification.SEList sEList) {
                SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> singleFieldBuilder = this.iosNotificationListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 3 || this.payload_ == SEIOSNotification.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEIOSNotification.SEList.newBuilder((SEIOSNotification.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 3) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder mergeQuickReplyList(SEQuickReply.SEList sEList) {
                SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> singleFieldBuilder = this.quickReplyListBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 5 || this.payload_ == SEQuickReply.SEList.getDefaultInstance()) {
                        this.payload_ = sEList;
                    } else {
                        this.payload_ = SEQuickReply.SEList.newBuilder((SEQuickReply.SEList) this.payload_).mergeFrom(sEList).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 5) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder mergeQuickReplyMessage(SEQuickReplyMessage sEQuickReplyMessage) {
                SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> singleFieldBuilder = this.quickReplyMessageBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 6 || this.payload_ == SEQuickReplyMessage.getDefaultInstance()) {
                        this.payload_ = sEQuickReplyMessage;
                    } else {
                        this.payload_ = SEQuickReplyMessage.newBuilder((SEQuickReplyMessage) this.payload_).mergeFrom(sEQuickReplyMessage).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 6) {
                    singleFieldBuilder.mergeFrom(sEQuickReplyMessage);
                } else {
                    singleFieldBuilder.setMessage(sEQuickReplyMessage);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder mergeRemoveNotif(SEAppRemoveNotif sEAppRemoveNotif) {
                SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> singleFieldBuilder = this.removeNotifBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 18 || this.payload_ == SEAppRemoveNotif.getDefaultInstance()) {
                        this.payload_ = sEAppRemoveNotif;
                    } else {
                        this.payload_ = SEAppRemoveNotif.newBuilder((SEAppRemoveNotif) this.payload_).mergeFrom(sEAppRemoveNotif).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 18) {
                    singleFieldBuilder.mergeFrom(sEAppRemoveNotif);
                } else {
                    singleFieldBuilder.setMessage(sEAppRemoveNotif);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder mergeSosContacts(SESOSContacts sESOSContacts) {
                SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> singleFieldBuilder = this.sosContactsBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 9 || this.payload_ == SESOSContacts.getDefaultInstance()) {
                        this.payload_ = sESOSContacts;
                    } else {
                        this.payload_ = SESOSContacts.newBuilder((SESOSContacts) this.payload_).mergeFrom(sESOSContacts).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 9) {
                    singleFieldBuilder.mergeFrom(sESOSContacts);
                } else {
                    singleFieldBuilder.setMessage(sESOSContacts);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder mergeSystemNotification(SESystemNotification sESystemNotification) {
                SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> singleFieldBuilder = this.systemNotificationBuilder_;
                if (singleFieldBuilder == null) {
                    if (this.payloadCase_ != 1 || this.payload_ == SESystemNotification.getDefaultInstance()) {
                        this.payload_ = sESystemNotification;
                    } else {
                        this.payload_ = SESystemNotification.newBuilder((SESystemNotification) this.payload_).mergeFrom(sESystemNotification).buildPartial();
                    }
                    onChanged();
                } else if (this.payloadCase_ == 1) {
                    singleFieldBuilder.mergeFrom(sESystemNotification);
                } else {
                    singleFieldBuilder.setMessage(sESystemNotification);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder setAppNotification(SEAppNotification sEAppNotification) {
                SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> singleFieldBuilder = this.appNotificationBuilder_;
                if (singleFieldBuilder == null) {
                    sEAppNotification.getClass();
                    this.payload_ = sEAppNotification;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEAppNotification);
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setAppSuperNotification(SEAppSuperNotification sEAppSuperNotification) {
                SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> singleFieldBuilder = this.appSuperNotificationBuilder_;
                if (singleFieldBuilder == null) {
                    sEAppSuperNotification.getClass();
                    this.payload_ = sEAppSuperNotification;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEAppSuperNotification);
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder setCallState(SECallState sECallState) {
                sECallState.getClass();
                this.payloadCase_ = 4;
                this.payload_ = Integer.valueOf(sECallState.getNumber());
                onChanged();
                return this;
            }

            public Builder setCollectionContactsList(SEContacts.SEList sEList) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.collectionContactsListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setContactAvatarData(SEContactsAvatarData sEContactsAvatarData) {
                SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> singleFieldBuilder = this.contactAvatarDataBuilder_;
                if (singleFieldBuilder == null) {
                    sEContactsAvatarData.getClass();
                    this.payload_ = sEContactsAvatarData;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEContactsAvatarData);
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setContactInfo(SEContactInfo sEContactInfo) {
                SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> singleFieldBuilder = this.contactInfoBuilder_;
                if (singleFieldBuilder == null) {
                    sEContactInfo.getClass();
                    this.payload_ = sEContactInfo;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEContactInfo);
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setContactsAvatarList(SEContactsAvatar.SEList sEList) {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setContactsCy2(SEContactsCY_2 sEContactsCY_2) {
                SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> singleFieldBuilder = this.contactsCy2Builder_;
                if (singleFieldBuilder == null) {
                    sEContactsCY_2.getClass();
                    this.payload_ = sEContactsCY_2;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEContactsCY_2);
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setContactsList(SEContacts.SEList sEList) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setGlodFriendContacts(SEGlodFriendContacts.SEList sEList) {
                SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> singleFieldBuilder = this.glodFriendContactsBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setGlodFriendEmoji(SEGlodFriendEmoji sEGlodFriendEmoji) {
                SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> singleFieldBuilder = this.glodFriendEmojiBuilder_;
                if (singleFieldBuilder == null) {
                    sEGlodFriendEmoji.getClass();
                    this.payload_ = sEGlodFriendEmoji;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEGlodFriendEmoji);
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setIosNotificationList(SEIOSNotification.SEList sEList) {
                SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> singleFieldBuilder = this.iosNotificationListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setNumber(String str) {
                str.getClass();
                this.payloadCase_ = 16;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 16;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setOpenInPhoneKey(String str) {
                str.getClass();
                this.payloadCase_ = 17;
                this.payload_ = str;
                onChanged();
                return this;
            }

            public Builder setOpenInPhoneKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.payloadCase_ = 17;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            public Builder setQuickReplyList(SEQuickReply.SEList sEList) {
                SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> singleFieldBuilder = this.quickReplyListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.payload_ = sEList;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setQuickReplyMessage(SEQuickReplyMessage sEQuickReplyMessage) {
                SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> singleFieldBuilder = this.quickReplyMessageBuilder_;
                if (singleFieldBuilder == null) {
                    sEQuickReplyMessage.getClass();
                    this.payload_ = sEQuickReplyMessage;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEQuickReplyMessage);
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setRemoveNotif(SEAppRemoveNotif sEAppRemoveNotif) {
                SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> singleFieldBuilder = this.removeNotifBuilder_;
                if (singleFieldBuilder == null) {
                    sEAppRemoveNotif.getClass();
                    this.payload_ = sEAppRemoveNotif;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sEAppRemoveNotif);
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder setSosContacts(SESOSContacts sESOSContacts) {
                SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> singleFieldBuilder = this.sosContactsBuilder_;
                if (singleFieldBuilder == null) {
                    sESOSContacts.getClass();
                    this.payload_ = sESOSContacts;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESOSContacts);
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setSystemNotification(SESystemNotification sESystemNotification) {
                SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> singleFieldBuilder = this.systemNotificationBuilder_;
                if (singleFieldBuilder == null) {
                    sESystemNotification.getClass();
                    this.payload_ = sESystemNotification;
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(sESystemNotification);
                }
                this.payloadCase_ = 1;
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SENotification build() {
                SENotification sENotificationBuildPartial = buildPartial();
                if (sENotificationBuildPartial.isInitialized()) {
                    return sENotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sENotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SENotification buildPartial() {
                SENotification sENotification = new SENotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sENotification);
                }
                buildPartialOneofs(sENotification);
                onBuilt();
                return sENotification;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SENotification getDefaultInstanceForType() {
                return SENotification.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.payloadCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> singleFieldBuilder = this.systemNotificationBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.clear();
                }
                SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> singleFieldBuilder2 = this.appNotificationBuilder_;
                if (singleFieldBuilder2 != null) {
                    singleFieldBuilder2.clear();
                }
                SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> singleFieldBuilder3 = this.iosNotificationListBuilder_;
                if (singleFieldBuilder3 != null) {
                    singleFieldBuilder3.clear();
                }
                SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> singleFieldBuilder4 = this.quickReplyListBuilder_;
                if (singleFieldBuilder4 != null) {
                    singleFieldBuilder4.clear();
                }
                SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> singleFieldBuilder5 = this.quickReplyMessageBuilder_;
                if (singleFieldBuilder5 != null) {
                    singleFieldBuilder5.clear();
                }
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder6 = this.contactsListBuilder_;
                if (singleFieldBuilder6 != null) {
                    singleFieldBuilder6.clear();
                }
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder7 = this.collectionContactsListBuilder_;
                if (singleFieldBuilder7 != null) {
                    singleFieldBuilder7.clear();
                }
                SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> singleFieldBuilder8 = this.sosContactsBuilder_;
                if (singleFieldBuilder8 != null) {
                    singleFieldBuilder8.clear();
                }
                SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> singleFieldBuilder9 = this.contactsCy2Builder_;
                if (singleFieldBuilder9 != null) {
                    singleFieldBuilder9.clear();
                }
                SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> singleFieldBuilder10 = this.contactAvatarDataBuilder_;
                if (singleFieldBuilder10 != null) {
                    singleFieldBuilder10.clear();
                }
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder11 = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder11 != null) {
                    singleFieldBuilder11.clear();
                }
                SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> singleFieldBuilder12 = this.glodFriendContactsBuilder_;
                if (singleFieldBuilder12 != null) {
                    singleFieldBuilder12.clear();
                }
                SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> singleFieldBuilder13 = this.glodFriendEmojiBuilder_;
                if (singleFieldBuilder13 != null) {
                    singleFieldBuilder13.clear();
                }
                SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> singleFieldBuilder14 = this.contactInfoBuilder_;
                if (singleFieldBuilder14 != null) {
                    singleFieldBuilder14.clear();
                }
                SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> singleFieldBuilder15 = this.removeNotifBuilder_;
                if (singleFieldBuilder15 != null) {
                    singleFieldBuilder15.clear();
                }
                SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> singleFieldBuilder16 = this.appSuperNotificationBuilder_;
                if (singleFieldBuilder16 != null) {
                    singleFieldBuilder16.clear();
                }
                this.payloadCase_ = 0;
                this.payload_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SENotification) {
                    return mergeFrom((SENotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAppNotification(SEAppNotification.Builder builder) {
                SingleFieldBuilder<SEAppNotification, SEAppNotification.Builder, SEAppNotificationOrBuilder> singleFieldBuilder = this.appNotificationBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 2;
                return this;
            }

            public Builder setAppSuperNotification(SEAppSuperNotification.Builder builder) {
                SingleFieldBuilder<SEAppSuperNotification, SEAppSuperNotification.Builder, SEAppSuperNotificationOrBuilder> singleFieldBuilder = this.appSuperNotificationBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 19;
                return this;
            }

            public Builder setCollectionContactsList(SEContacts.SEList.Builder builder) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.collectionContactsListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 8;
                return this;
            }

            public Builder setContactAvatarData(SEContactsAvatarData.Builder builder) {
                SingleFieldBuilder<SEContactsAvatarData, SEContactsAvatarData.Builder, SEContactsAvatarDataOrBuilder> singleFieldBuilder = this.contactAvatarDataBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 11;
                return this;
            }

            public Builder setContactInfo(SEContactInfo.Builder builder) {
                SingleFieldBuilder<SEContactInfo, SEContactInfo.Builder, SEContactInfoOrBuilder> singleFieldBuilder = this.contactInfoBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 15;
                return this;
            }

            public Builder setContactsAvatarList(SEContactsAvatar.SEList.Builder builder) {
                SingleFieldBuilder<SEContactsAvatar.SEList, SEContactsAvatar.SEList.Builder, SEContactsAvatar.SEListOrBuilder> singleFieldBuilder = this.contactsAvatarListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 12;
                return this;
            }

            public Builder setContactsCy2(SEContactsCY_2.Builder builder) {
                SingleFieldBuilder<SEContactsCY_2, SEContactsCY_2.Builder, SEContactsCY_2OrBuilder> singleFieldBuilder = this.contactsCy2Builder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 10;
                return this;
            }

            public Builder setContactsList(SEContacts.SEList.Builder builder) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.contactsListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 7;
                return this;
            }

            public Builder setGlodFriendContacts(SEGlodFriendContacts.SEList.Builder builder) {
                SingleFieldBuilder<SEGlodFriendContacts.SEList, SEGlodFriendContacts.SEList.Builder, SEGlodFriendContacts.SEListOrBuilder> singleFieldBuilder = this.glodFriendContactsBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 13;
                return this;
            }

            public Builder setGlodFriendEmoji(SEGlodFriendEmoji.Builder builder) {
                SingleFieldBuilder<SEGlodFriendEmoji, SEGlodFriendEmoji.Builder, SEGlodFriendEmojiOrBuilder> singleFieldBuilder = this.glodFriendEmojiBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 14;
                return this;
            }

            public Builder setIosNotificationList(SEIOSNotification.SEList.Builder builder) {
                SingleFieldBuilder<SEIOSNotification.SEList, SEIOSNotification.SEList.Builder, SEIOSNotification.SEListOrBuilder> singleFieldBuilder = this.iosNotificationListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 3;
                return this;
            }

            public Builder setQuickReplyList(SEQuickReply.SEList.Builder builder) {
                SingleFieldBuilder<SEQuickReply.SEList, SEQuickReply.SEList.Builder, SEQuickReply.SEListOrBuilder> singleFieldBuilder = this.quickReplyListBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 5;
                return this;
            }

            public Builder setQuickReplyMessage(SEQuickReplyMessage.Builder builder) {
                SingleFieldBuilder<SEQuickReplyMessage, SEQuickReplyMessage.Builder, SEQuickReplyMessageOrBuilder> singleFieldBuilder = this.quickReplyMessageBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 6;
                return this;
            }

            public Builder setRemoveNotif(SEAppRemoveNotif.Builder builder) {
                SingleFieldBuilder<SEAppRemoveNotif, SEAppRemoveNotif.Builder, SEAppRemoveNotifOrBuilder> singleFieldBuilder = this.removeNotifBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 18;
                return this;
            }

            public Builder setSosContacts(SESOSContacts.Builder builder) {
                SingleFieldBuilder<SESOSContacts, SESOSContacts.Builder, SESOSContactsOrBuilder> singleFieldBuilder = this.sosContactsBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 9;
                return this;
            }

            public Builder setSystemNotification(SESystemNotification.Builder builder) {
                SingleFieldBuilder<SESystemNotification, SESystemNotification.Builder, SESystemNotificationOrBuilder> singleFieldBuilder = this.systemNotificationBuilder_;
                if (singleFieldBuilder == null) {
                    this.payload_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.payloadCase_ = 1;
                return this;
            }

            public Builder mergeFrom(SENotification sENotification) {
                if (sENotification == SENotification.getDefaultInstance()) {
                    return this;
                }
                switch (sENotification.getPayloadCase()) {
                    case SYSTEM_NOTIFICATION:
                        mergeSystemNotification(sENotification.getSystemNotification());
                        break;
                    case APP_NOTIFICATION:
                        mergeAppNotification(sENotification.getAppNotification());
                        break;
                    case IOS_NOTIFICATION_LIST:
                        mergeIosNotificationList(sENotification.getIosNotificationList());
                        break;
                    case CALL_STATE:
                        setCallState(sENotification.getCallState());
                        break;
                    case QUICK_REPLY_LIST:
                        mergeQuickReplyList(sENotification.getQuickReplyList());
                        break;
                    case QUICK_REPLY_MESSAGE:
                        mergeQuickReplyMessage(sENotification.getQuickReplyMessage());
                        break;
                    case CONTACTS_LIST:
                        mergeContactsList(sENotification.getContactsList());
                        break;
                    case COLLECTION_CONTACTS_LIST:
                        mergeCollectionContactsList(sENotification.getCollectionContactsList());
                        break;
                    case SOS_CONTACTS:
                        mergeSosContacts(sENotification.getSosContacts());
                        break;
                    case CONTACTS_CY_2:
                        mergeContactsCy2(sENotification.getContactsCy2());
                        break;
                    case CONTACT_AVATAR_DATA:
                        mergeContactAvatarData(sENotification.getContactAvatarData());
                        break;
                    case CONTACTS_AVATAR_LIST:
                        mergeContactsAvatarList(sENotification.getContactsAvatarList());
                        break;
                    case GLOD_FRIEND_CONTACTS:
                        mergeGlodFriendContacts(sENotification.getGlodFriendContacts());
                        break;
                    case GLOD_FRIEND_EMOJI:
                        mergeGlodFriendEmoji(sENotification.getGlodFriendEmoji());
                        break;
                    case CONTACT_INFO:
                        mergeContactInfo(sENotification.getContactInfo());
                        break;
                    case NUMBER:
                        this.payloadCase_ = 16;
                        this.payload_ = sENotification.payload_;
                        onChanged();
                        break;
                    case OPEN_IN_PHONE_KEY:
                        this.payloadCase_ = 17;
                        this.payload_ = sENotification.payload_;
                        onChanged();
                        break;
                    case REMOVE_NOTIF:
                        mergeRemoveNotif(sENotification.getRemoveNotif());
                        break;
                    case APP_SUPER_NOTIFICATION:
                        mergeAppSuperNotification(sENotification.getAppSuperNotification());
                        break;
                }
                mergeUnknownFields(sENotification.getUnknownFields());
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
                                case 10:
                                    codedInputStream.readMessage(internalGetSystemNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 1;
                                    break;
                                case 18:
                                    codedInputStream.readMessage(internalGetAppNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 2;
                                    break;
                                case 26:
                                    codedInputStream.readMessage(internalGetIosNotificationListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 3;
                                    break;
                                case 32:
                                    int i7 = codedInputStream.readEnum();
                                    if (SECallState.forNumber(i7) == null) {
                                        mergeUnknownVarintField(4, i7);
                                    } else {
                                        this.payloadCase_ = 4;
                                        this.payload_ = Integer.valueOf(i7);
                                    }
                                    break;
                                case 42:
                                    codedInputStream.readMessage(internalGetQuickReplyListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 5;
                                    break;
                                case 50:
                                    codedInputStream.readMessage(internalGetQuickReplyMessageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 6;
                                    break;
                                case 58:
                                    codedInputStream.readMessage(internalGetContactsListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 7;
                                    break;
                                case 66:
                                    codedInputStream.readMessage(internalGetCollectionContactsListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 8;
                                    break;
                                case 74:
                                    codedInputStream.readMessage(internalGetSosContactsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 9;
                                    break;
                                case 82:
                                    codedInputStream.readMessage(internalGetContactsCy2FieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 10;
                                    break;
                                case 90:
                                    codedInputStream.readMessage(internalGetContactAvatarDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 11;
                                    break;
                                case 98:
                                    codedInputStream.readMessage(internalGetContactsAvatarListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 12;
                                    break;
                                case 106:
                                    codedInputStream.readMessage(internalGetGlodFriendContactsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 13;
                                    break;
                                case 114:
                                    codedInputStream.readMessage(internalGetGlodFriendEmojiFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 14;
                                    break;
                                case 122:
                                    codedInputStream.readMessage(internalGetContactInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 15;
                                    break;
                                case 130:
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.payloadCase_ = 16;
                                    this.payload_ = bytes;
                                    break;
                                case 138:
                                    ByteString bytes2 = codedInputStream.readBytes();
                                    this.payloadCase_ = 17;
                                    this.payload_ = bytes2;
                                    break;
                                case 146:
                                    codedInputStream.readMessage(internalGetRemoveNotifFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 18;
                                    break;
                                case 154:
                                    codedInputStream.readMessage(internalGetAppSuperNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.payloadCase_ = 19;
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
            SYSTEM_NOTIFICATION(1),
            APP_NOTIFICATION(2),
            IOS_NOTIFICATION_LIST(3),
            CALL_STATE(4),
            QUICK_REPLY_LIST(5),
            QUICK_REPLY_MESSAGE(6),
            CONTACTS_LIST(7),
            COLLECTION_CONTACTS_LIST(8),
            SOS_CONTACTS(9),
            CONTACTS_CY_2(10),
            CONTACT_AVATAR_DATA(11),
            CONTACTS_AVATAR_LIST(12),
            GLOD_FRIEND_CONTACTS(13),
            GLOD_FRIEND_EMOJI(14),
            CONTACT_INFO(15),
            NUMBER(16),
            OPEN_IN_PHONE_KEY(17),
            REMOVE_NOTIF(18),
            APP_SUPER_NOTIFICATION(19),
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
                        return SYSTEM_NOTIFICATION;
                    case 2:
                        return APP_NOTIFICATION;
                    case 3:
                        return IOS_NOTIFICATION_LIST;
                    case 4:
                        return CALL_STATE;
                    case 5:
                        return QUICK_REPLY_LIST;
                    case 6:
                        return QUICK_REPLY_MESSAGE;
                    case 7:
                        return CONTACTS_LIST;
                    case 8:
                        return COLLECTION_CONTACTS_LIST;
                    case 9:
                        return SOS_CONTACTS;
                    case 10:
                        return CONTACTS_CY_2;
                    case 11:
                        return CONTACT_AVATAR_DATA;
                    case 12:
                        return CONTACTS_AVATAR_LIST;
                    case 13:
                        return GLOD_FRIEND_CONTACTS;
                    case 14:
                        return GLOD_FRIEND_EMOJI;
                    case 15:
                        return CONTACT_INFO;
                    case 16:
                        return NUMBER;
                    case 17:
                        return OPEN_IN_PHONE_KEY;
                    case 18:
                        return REMOVE_NOTIF;
                    case 19:
                        return APP_SUPER_NOTIFICATION;
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SENotification");
            DEFAULT_INSTANCE = new SENotification();
            PARSER = new AbstractParser<SENotification>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotification.1
                @Override // com.google.protobuf.Parser
                public SENotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SENotification.newBuilder();
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

        public /* synthetic */ SENotification(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SENotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SENotification_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SENotification parseDelimitedFrom(InputStream inputStream) {
            return (SENotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SENotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SENotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SENotification)) {
                return super.equals(obj);
            }
            SENotification sENotification = (SENotification) obj;
            if (!getPayloadCase().equals(sENotification.getPayloadCase())) {
                return false;
            }
            switch (this.payloadCase_) {
                case 1:
                    if (!getSystemNotification().equals(sENotification.getSystemNotification())) {
                        return false;
                    }
                    break;
                case 2:
                    if (!getAppNotification().equals(sENotification.getAppNotification())) {
                        return false;
                    }
                    break;
                case 3:
                    if (!getIosNotificationList().equals(sENotification.getIosNotificationList())) {
                        return false;
                    }
                    break;
                case 4:
                    if (!getCallState().equals(sENotification.getCallState())) {
                        return false;
                    }
                    break;
                case 5:
                    if (!getQuickReplyList().equals(sENotification.getQuickReplyList())) {
                        return false;
                    }
                    break;
                case 6:
                    if (!getQuickReplyMessage().equals(sENotification.getQuickReplyMessage())) {
                        return false;
                    }
                    break;
                case 7:
                    if (!getContactsList().equals(sENotification.getContactsList())) {
                        return false;
                    }
                    break;
                case 8:
                    if (!getCollectionContactsList().equals(sENotification.getCollectionContactsList())) {
                        return false;
                    }
                    break;
                case 9:
                    if (!getSosContacts().equals(sENotification.getSosContacts())) {
                        return false;
                    }
                    break;
                case 10:
                    if (!getContactsCy2().equals(sENotification.getContactsCy2())) {
                        return false;
                    }
                    break;
                case 11:
                    if (!getContactAvatarData().equals(sENotification.getContactAvatarData())) {
                        return false;
                    }
                    break;
                case 12:
                    if (!getContactsAvatarList().equals(sENotification.getContactsAvatarList())) {
                        return false;
                    }
                    break;
                case 13:
                    if (!getGlodFriendContacts().equals(sENotification.getGlodFriendContacts())) {
                        return false;
                    }
                    break;
                case 14:
                    if (!getGlodFriendEmoji().equals(sENotification.getGlodFriendEmoji())) {
                        return false;
                    }
                    break;
                case 15:
                    if (!getContactInfo().equals(sENotification.getContactInfo())) {
                        return false;
                    }
                    break;
                case 16:
                    if (!getNumber().equals(sENotification.getNumber())) {
                        return false;
                    }
                    break;
                case 17:
                    if (!getOpenInPhoneKey().equals(sENotification.getOpenInPhoneKey())) {
                        return false;
                    }
                    break;
                case 18:
                    if (!getRemoveNotif().equals(sENotification.getRemoveNotif())) {
                        return false;
                    }
                    break;
                case 19:
                    if (!getAppSuperNotification().equals(sENotification.getAppSuperNotification())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(sENotification.getUnknownFields());
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEAppNotification getAppNotification() {
            return this.payloadCase_ == 2 ? (SEAppNotification) this.payload_ : SEAppNotification.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEAppNotificationOrBuilder getAppNotificationOrBuilder() {
            return this.payloadCase_ == 2 ? (SEAppNotification) this.payload_ : SEAppNotification.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEAppSuperNotification getAppSuperNotification() {
            return this.payloadCase_ == 19 ? (SEAppSuperNotification) this.payload_ : SEAppSuperNotification.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEAppSuperNotificationOrBuilder getAppSuperNotificationOrBuilder() {
            return this.payloadCase_ == 19 ? (SEAppSuperNotification) this.payload_ : SEAppSuperNotification.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SECallState getCallState() {
            SECallState sECallStateForNumber;
            return (this.payloadCase_ != 4 || (sECallStateForNumber = SECallState.forNumber(((Integer) this.payload_).intValue())) == null) ? SECallState.ANSWER_PHONE : sECallStateForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContacts.SEList getCollectionContactsList() {
            return this.payloadCase_ == 8 ? (SEContacts.SEList) this.payload_ : SEContacts.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContacts.SEListOrBuilder getCollectionContactsListOrBuilder() {
            return this.payloadCase_ == 8 ? (SEContacts.SEList) this.payload_ : SEContacts.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContactsAvatarData getContactAvatarData() {
            return this.payloadCase_ == 11 ? (SEContactsAvatarData) this.payload_ : SEContactsAvatarData.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContactsAvatarDataOrBuilder getContactAvatarDataOrBuilder() {
            return this.payloadCase_ == 11 ? (SEContactsAvatarData) this.payload_ : SEContactsAvatarData.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContactInfo getContactInfo() {
            return this.payloadCase_ == 15 ? (SEContactInfo) this.payload_ : SEContactInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContactInfoOrBuilder getContactInfoOrBuilder() {
            return this.payloadCase_ == 15 ? (SEContactInfo) this.payload_ : SEContactInfo.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContactsAvatar.SEList getContactsAvatarList() {
            return this.payloadCase_ == 12 ? (SEContactsAvatar.SEList) this.payload_ : SEContactsAvatar.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContactsAvatar.SEListOrBuilder getContactsAvatarListOrBuilder() {
            return this.payloadCase_ == 12 ? (SEContactsAvatar.SEList) this.payload_ : SEContactsAvatar.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContactsCY_2 getContactsCy2() {
            return this.payloadCase_ == 10 ? (SEContactsCY_2) this.payload_ : SEContactsCY_2.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContactsCY_2OrBuilder getContactsCy2OrBuilder() {
            return this.payloadCase_ == 10 ? (SEContactsCY_2) this.payload_ : SEContactsCY_2.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContacts.SEList getContactsList() {
            return this.payloadCase_ == 7 ? (SEContacts.SEList) this.payload_ : SEContacts.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEContacts.SEListOrBuilder getContactsListOrBuilder() {
            return this.payloadCase_ == 7 ? (SEContacts.SEList) this.payload_ : SEContacts.SEList.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SENotification_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEGlodFriendContacts.SEList getGlodFriendContacts() {
            return this.payloadCase_ == 13 ? (SEGlodFriendContacts.SEList) this.payload_ : SEGlodFriendContacts.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEGlodFriendContacts.SEListOrBuilder getGlodFriendContactsOrBuilder() {
            return this.payloadCase_ == 13 ? (SEGlodFriendContacts.SEList) this.payload_ : SEGlodFriendContacts.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEGlodFriendEmoji getGlodFriendEmoji() {
            return this.payloadCase_ == 14 ? (SEGlodFriendEmoji) this.payload_ : SEGlodFriendEmoji.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEGlodFriendEmojiOrBuilder getGlodFriendEmojiOrBuilder() {
            return this.payloadCase_ == 14 ? (SEGlodFriendEmoji) this.payload_ : SEGlodFriendEmoji.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEIOSNotification.SEList getIosNotificationList() {
            return this.payloadCase_ == 3 ? (SEIOSNotification.SEList) this.payload_ : SEIOSNotification.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEIOSNotification.SEListOrBuilder getIosNotificationListOrBuilder() {
            return this.payloadCase_ == 3 ? (SEIOSNotification.SEList) this.payload_ : SEIOSNotification.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public String getNumber() {
            if (this.payloadCase_ != 16) {
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

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public ByteString getNumberBytes() {
            if (this.payloadCase_ != 16) {
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

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public String getOpenInPhoneKey() {
            if (this.payloadCase_ != 17) {
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

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public ByteString getOpenInPhoneKeyBytes() {
            if (this.payloadCase_ != 17) {
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SENotification> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEQuickReply.SEList getQuickReplyList() {
            return this.payloadCase_ == 5 ? (SEQuickReply.SEList) this.payload_ : SEQuickReply.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEQuickReply.SEListOrBuilder getQuickReplyListOrBuilder() {
            return this.payloadCase_ == 5 ? (SEQuickReply.SEList) this.payload_ : SEQuickReply.SEList.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEQuickReplyMessage getQuickReplyMessage() {
            return this.payloadCase_ == 6 ? (SEQuickReplyMessage) this.payload_ : SEQuickReplyMessage.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEQuickReplyMessageOrBuilder getQuickReplyMessageOrBuilder() {
            return this.payloadCase_ == 6 ? (SEQuickReplyMessage) this.payload_ : SEQuickReplyMessage.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEAppRemoveNotif getRemoveNotif() {
            return this.payloadCase_ == 18 ? (SEAppRemoveNotif) this.payload_ : SEAppRemoveNotif.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SEAppRemoveNotifOrBuilder getRemoveNotifOrBuilder() {
            return this.payloadCase_ == 18 ? (SEAppRemoveNotif) this.payload_ : SEAppRemoveNotif.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = this.payloadCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (SESystemNotification) this.payload_) : 0;
            if (this.payloadCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (SEAppNotification) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (SEIOSNotification.SEList) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(4, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 5) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (SEQuickReply.SEList) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SEQuickReplyMessage) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (SEContacts.SEList) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, (SEContacts.SEList) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, (SESOSContacts) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, (SEContactsCY_2) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, (SEContactsAvatarData) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, (SEContactsAvatar.SEList) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, (SEGlodFriendContacts.SEList) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, (SEGlodFriendEmoji) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, (SEContactInfo) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(16, this.payload_);
            }
            if (this.payloadCase_ == 17) {
                iComputeMessageSize += GeneratedMessage.computeStringSize(17, this.payload_);
            }
            if (this.payloadCase_ == 18) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, (SEAppRemoveNotif) this.payload_);
            }
            if (this.payloadCase_ == 19) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(19, (SEAppSuperNotification) this.payload_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SESOSContacts getSosContacts() {
            return this.payloadCase_ == 9 ? (SESOSContacts) this.payload_ : SESOSContacts.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SESOSContactsOrBuilder getSosContactsOrBuilder() {
            return this.payloadCase_ == 9 ? (SESOSContacts) this.payload_ : SESOSContacts.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SESystemNotification getSystemNotification() {
            return this.payloadCase_ == 1 ? (SESystemNotification) this.payload_ : SESystemNotification.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public SESystemNotificationOrBuilder getSystemNotificationOrBuilder() {
            return this.payloadCase_ == 1 ? (SESystemNotification) this.payload_ : SESystemNotification.getDefaultInstance();
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasAppNotification() {
            return this.payloadCase_ == 2;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasAppSuperNotification() {
            return this.payloadCase_ == 19;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasCallState() {
            return this.payloadCase_ == 4;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasCollectionContactsList() {
            return this.payloadCase_ == 8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasContactAvatarData() {
            return this.payloadCase_ == 11;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasContactInfo() {
            return this.payloadCase_ == 15;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasContactsAvatarList() {
            return this.payloadCase_ == 12;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasContactsCy2() {
            return this.payloadCase_ == 10;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasContactsList() {
            return this.payloadCase_ == 7;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasGlodFriendContacts() {
            return this.payloadCase_ == 13;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasGlodFriendEmoji() {
            return this.payloadCase_ == 14;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasIosNotificationList() {
            return this.payloadCase_ == 3;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasNumber() {
            return this.payloadCase_ == 16;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasOpenInPhoneKey() {
            return this.payloadCase_ == 17;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasQuickReplyList() {
            return this.payloadCase_ == 5;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasQuickReplyMessage() {
            return this.payloadCase_ == 6;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasRemoveNotif() {
            return this.payloadCase_ == 18;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasSosContacts() {
            return this.payloadCase_ == 9;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationOrBuilder
        public boolean hasSystemNotification() {
            return this.payloadCase_ == 1;
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
            switch (this.payloadCase_) {
                case 1:
                    i7 = ((iHashCode2 * 37) + 1) * 53;
                    iHashCode = getSystemNotification().hashCode();
                    break;
                case 2:
                    i7 = ((iHashCode2 * 37) + 2) * 53;
                    iHashCode = getAppNotification().hashCode();
                    break;
                case 3:
                    i7 = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getIosNotificationList().hashCode();
                    break;
                case 4:
                    i7 = ((iHashCode2 * 37) + 4) * 53;
                    iHashCode = getCallState().getNumber();
                    break;
                case 5:
                    i7 = ((iHashCode2 * 37) + 5) * 53;
                    iHashCode = getQuickReplyList().hashCode();
                    break;
                case 6:
                    i7 = ((iHashCode2 * 37) + 6) * 53;
                    iHashCode = getQuickReplyMessage().hashCode();
                    break;
                case 7:
                    i7 = ((iHashCode2 * 37) + 7) * 53;
                    iHashCode = getContactsList().hashCode();
                    break;
                case 8:
                    i7 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getCollectionContactsList().hashCode();
                    break;
                case 9:
                    i7 = ((iHashCode2 * 37) + 9) * 53;
                    iHashCode = getSosContacts().hashCode();
                    break;
                case 10:
                    i7 = ((iHashCode2 * 37) + 10) * 53;
                    iHashCode = getContactsCy2().hashCode();
                    break;
                case 11:
                    i7 = ((iHashCode2 * 37) + 11) * 53;
                    iHashCode = getContactAvatarData().hashCode();
                    break;
                case 12:
                    i7 = ((iHashCode2 * 37) + 12) * 53;
                    iHashCode = getContactsAvatarList().hashCode();
                    break;
                case 13:
                    i7 = ((iHashCode2 * 37) + 13) * 53;
                    iHashCode = getGlodFriendContacts().hashCode();
                    break;
                case 14:
                    i7 = ((iHashCode2 * 37) + 14) * 53;
                    iHashCode = getGlodFriendEmoji().hashCode();
                    break;
                case 15:
                    i7 = ((iHashCode2 * 37) + 15) * 53;
                    iHashCode = getContactInfo().hashCode();
                    break;
                case 16:
                    i7 = ((iHashCode2 * 37) + 16) * 53;
                    iHashCode = getNumber().hashCode();
                    break;
                case 17:
                    i7 = ((iHashCode2 * 37) + 17) * 53;
                    iHashCode = getOpenInPhoneKey().hashCode();
                    break;
                case 18:
                    i7 = ((iHashCode2 * 37) + 18) * 53;
                    iHashCode = getRemoveNotif().hashCode();
                    break;
                case 19:
                    i7 = ((iHashCode2 * 37) + 19) * 53;
                    iHashCode = getAppSuperNotification().hashCode();
                    break;
                default:
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
            }
            iHashCode2 = i7 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SENotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SENotification.class, Builder.class);
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
            if (hasSystemNotification() && !getSystemNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAppNotification() && !getAppNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasIosNotificationList() && !getIosNotificationList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasQuickReplyList() && !getQuickReplyList().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasQuickReplyMessage() && !getQuickReplyMessage().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSosContacts() && !getSosContacts().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContactsCy2() && !getContactsCy2().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContactAvatarData() && !getContactAvatarData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGlodFriendContacts() && !getGlodFriendContacts().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGlodFriendEmoji() && !getGlodFriendEmoji().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContactInfo() && !getContactInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRemoveNotif() && !getRemoveNotif().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAppSuperNotification() || getAppSuperNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.payloadCase_ == 1) {
                codedOutputStream.writeMessage(1, (SESystemNotification) this.payload_);
            }
            if (this.payloadCase_ == 2) {
                codedOutputStream.writeMessage(2, (SEAppNotification) this.payload_);
            }
            if (this.payloadCase_ == 3) {
                codedOutputStream.writeMessage(3, (SEIOSNotification.SEList) this.payload_);
            }
            if (this.payloadCase_ == 4) {
                codedOutputStream.writeEnum(4, ((Integer) this.payload_).intValue());
            }
            if (this.payloadCase_ == 5) {
                codedOutputStream.writeMessage(5, (SEQuickReply.SEList) this.payload_);
            }
            if (this.payloadCase_ == 6) {
                codedOutputStream.writeMessage(6, (SEQuickReplyMessage) this.payload_);
            }
            if (this.payloadCase_ == 7) {
                codedOutputStream.writeMessage(7, (SEContacts.SEList) this.payload_);
            }
            if (this.payloadCase_ == 8) {
                codedOutputStream.writeMessage(8, (SEContacts.SEList) this.payload_);
            }
            if (this.payloadCase_ == 9) {
                codedOutputStream.writeMessage(9, (SESOSContacts) this.payload_);
            }
            if (this.payloadCase_ == 10) {
                codedOutputStream.writeMessage(10, (SEContactsCY_2) this.payload_);
            }
            if (this.payloadCase_ == 11) {
                codedOutputStream.writeMessage(11, (SEContactsAvatarData) this.payload_);
            }
            if (this.payloadCase_ == 12) {
                codedOutputStream.writeMessage(12, (SEContactsAvatar.SEList) this.payload_);
            }
            if (this.payloadCase_ == 13) {
                codedOutputStream.writeMessage(13, (SEGlodFriendContacts.SEList) this.payload_);
            }
            if (this.payloadCase_ == 14) {
                codedOutputStream.writeMessage(14, (SEGlodFriendEmoji) this.payload_);
            }
            if (this.payloadCase_ == 15) {
                codedOutputStream.writeMessage(15, (SEContactInfo) this.payload_);
            }
            if (this.payloadCase_ == 16) {
                GeneratedMessage.writeString(codedOutputStream, 16, this.payload_);
            }
            if (this.payloadCase_ == 17) {
                GeneratedMessage.writeString(codedOutputStream, 17, this.payload_);
            }
            if (this.payloadCase_ == 18) {
                codedOutputStream.writeMessage(18, (SEAppRemoveNotif) this.payload_);
            }
            if (this.payloadCase_ == 19) {
                codedOutputStream.writeMessage(19, (SEAppSuperNotification) this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SENotification(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SENotification sENotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sENotification);
        }

        public static SENotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SENotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SENotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SENotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SENotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SENotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SENotification() {
            this.payloadCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SENotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SENotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SENotification parseFrom(InputStream inputStream) {
            return (SENotification) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SENotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SENotification) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SENotification parseFrom(CodedInputStream codedInputStream) {
            return (SENotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SENotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SENotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SENotificationOrBuilder extends MessageOrBuilder {
        SEAppNotification getAppNotification();

        SEAppNotificationOrBuilder getAppNotificationOrBuilder();

        SEAppSuperNotification getAppSuperNotification();

        SEAppSuperNotificationOrBuilder getAppSuperNotificationOrBuilder();

        SECallState getCallState();

        SEContacts.SEList getCollectionContactsList();

        SEContacts.SEListOrBuilder getCollectionContactsListOrBuilder();

        SEContactsAvatarData getContactAvatarData();

        SEContactsAvatarDataOrBuilder getContactAvatarDataOrBuilder();

        SEContactInfo getContactInfo();

        SEContactInfoOrBuilder getContactInfoOrBuilder();

        SEContactsAvatar.SEList getContactsAvatarList();

        SEContactsAvatar.SEListOrBuilder getContactsAvatarListOrBuilder();

        SEContactsCY_2 getContactsCy2();

        SEContactsCY_2OrBuilder getContactsCy2OrBuilder();

        SEContacts.SEList getContactsList();

        SEContacts.SEListOrBuilder getContactsListOrBuilder();

        SEGlodFriendContacts.SEList getGlodFriendContacts();

        SEGlodFriendContacts.SEListOrBuilder getGlodFriendContactsOrBuilder();

        SEGlodFriendEmoji getGlodFriendEmoji();

        SEGlodFriendEmojiOrBuilder getGlodFriendEmojiOrBuilder();

        SEIOSNotification.SEList getIosNotificationList();

        SEIOSNotification.SEListOrBuilder getIosNotificationListOrBuilder();

        String getNumber();

        ByteString getNumberBytes();

        String getOpenInPhoneKey();

        ByteString getOpenInPhoneKeyBytes();

        SENotification.PayloadCase getPayloadCase();

        SEQuickReply.SEList getQuickReplyList();

        SEQuickReply.SEListOrBuilder getQuickReplyListOrBuilder();

        SEQuickReplyMessage getQuickReplyMessage();

        SEQuickReplyMessageOrBuilder getQuickReplyMessageOrBuilder();

        SEAppRemoveNotif getRemoveNotif();

        SEAppRemoveNotifOrBuilder getRemoveNotifOrBuilder();

        SESOSContacts getSosContacts();

        SESOSContactsOrBuilder getSosContactsOrBuilder();

        SESystemNotification getSystemNotification();

        SESystemNotificationOrBuilder getSystemNotificationOrBuilder();

        boolean hasAppNotification();

        boolean hasAppSuperNotification();

        boolean hasCallState();

        boolean hasCollectionContactsList();

        boolean hasContactAvatarData();

        boolean hasContactInfo();

        boolean hasContactsAvatarList();

        boolean hasContactsCy2();

        boolean hasContactsList();

        boolean hasGlodFriendContacts();

        boolean hasGlodFriendEmoji();

        boolean hasIosNotificationList();

        boolean hasNumber();

        boolean hasOpenInPhoneKey();

        boolean hasQuickReplyList();

        boolean hasQuickReplyMessage();

        boolean hasRemoveNotif();

        boolean hasSosContacts();

        boolean hasSystemNotification();
    }

    public static final class SENotificationString extends GeneratedMessage implements SENotificationStringOrBuilder {
        private static final SENotificationString DEFAULT_INSTANCE;
        public static final int NOTIFICATION_STRING_FIELD_NUMBER = 1;
        private static final Parser<SENotificationString> PARSER;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SEList notificationString_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SENotificationString$1 */
        public class AnonymousClass1 extends AbstractParser<SENotificationString> {
            @Override // com.google.protobuf.Parser
            public SENotificationString parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SENotificationString.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SENotificationStringOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> notificationStringBuilder_;
            private SEList notificationString_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SENotificationString sENotificationString) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.notificationStringBuilder_;
                    sENotificationString.notificationString_ = singleFieldBuilder == null ? this.notificationString_ : (SEList) singleFieldBuilder.build();
                } else {
                    i7 = 0;
                }
                sENotificationString.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SENotificationString_descriptor;
            }

            private SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> internalGetNotificationStringFieldBuilder() {
                if (this.notificationStringBuilder_ == null) {
                    this.notificationStringBuilder_ = new SingleFieldBuilder<>(getNotificationString(), getParentForChildren(), isClean());
                    this.notificationString_ = null;
                }
                return this.notificationStringBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetNotificationStringFieldBuilder();
                }
            }

            public Builder clearNotificationString() {
                this.bitField0_ &= -2;
                this.notificationString_ = null;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.notificationStringBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.notificationStringBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SENotificationString_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationStringOrBuilder
            public SEList getNotificationString() {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.notificationStringBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEList) singleFieldBuilder.getMessage();
                }
                SEList sEList = this.notificationString_;
                return sEList == null ? SEList.getDefaultInstance() : sEList;
            }

            public SEList.Builder getNotificationStringBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SEList.Builder) internalGetNotificationStringFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationStringOrBuilder
            public SEListOrBuilder getNotificationStringOrBuilder() {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.notificationStringBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEList sEList = this.notificationString_;
                return sEList == null ? SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationStringOrBuilder
            public boolean hasNotificationString() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SENotificationString_fieldAccessorTable.ensureFieldAccessorsInitialized(SENotificationString.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasNotificationString();
            }

            public Builder mergeNotificationString(SEList sEList) {
                SEList sEList2;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.notificationStringBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 1) == 0 || (sEList2 = this.notificationString_) == null || sEList2 == SEList.getDefaultInstance()) {
                    this.notificationString_ = sEList;
                } else {
                    getNotificationStringBuilder().mergeFrom(sEList);
                }
                if (this.notificationString_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setNotificationString(SEList sEList) {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.notificationStringBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.notificationString_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SENotificationString build() {
                SENotificationString sENotificationStringBuildPartial = buildPartial();
                if (sENotificationStringBuildPartial.isInitialized()) {
                    return sENotificationStringBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sENotificationStringBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SENotificationString buildPartial() {
                SENotificationString sENotificationString = new SENotificationString(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sENotificationString);
                }
                onBuilt();
                return sENotificationString;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SENotificationString getDefaultInstanceForType() {
                return SENotificationString.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.notificationString_ = null;
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.notificationStringBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.notificationStringBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SENotificationString) {
                    return mergeFrom((SENotificationString) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setNotificationString(SEList.Builder builder) {
                SingleFieldBuilder<SEList, SEList.Builder, SEListOrBuilder> singleFieldBuilder = this.notificationStringBuilder_;
                if (singleFieldBuilder == null) {
                    this.notificationString_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SENotificationString sENotificationString) {
                if (sENotificationString == SENotificationString.getDefaultInstance()) {
                    return this;
                }
                if (sENotificationString.hasNotificationString()) {
                    mergeNotificationString(sENotificationString.getNotificationString());
                }
                mergeUnknownFields(sENotificationString.getUnknownFields());
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(internalGetNotificationStringFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
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
            private static final long serialVersionUID = 0;
            private LazyStringArrayList list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SENotificationString$SEList$1 */
            public class AnonymousClass1 extends AbstractParser<SEList> {
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
                private LazyStringArrayList list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
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
                        this.list_ = new LazyStringArrayList((LazyStringList) this.list_);
                    }
                    this.bitField0_ |= 1;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NotificationProtos.internal_static_SA_SENotificationString_SEList_descriptor;
                }

                public Builder addAllList(Iterable<String> iterable) {
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addList(String str) {
                    str.getClass();
                    ensureListIsMutable();
                    this.list_.add(str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addListBytes(ByteString byteString) {
                    byteString.getClass();
                    ensureListIsMutable();
                    this.list_.add(byteString);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder clearList() {
                    this.list_ = LazyStringArrayList.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return NotificationProtos.internal_static_SA_SENotificationString_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.SEListOrBuilder
                public String getList(int i7) {
                    return this.list_.get(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.SEListOrBuilder
                public ByteString getListBytes(int i7) {
                    return this.list_.getByteString(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.SEListOrBuilder
                public int getListCount() {
                    return this.list_.size();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_SA_SENotificationString_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setList(int i7, String str) {
                    str.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, str);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(k kVar) {
                    this();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.SEListOrBuilder
                public ProtocolStringList getListList() {
                    this.list_.makeImmutable();
                    return this.list_;
                }

                private Builder() {
                    this.list_ = LazyStringArrayList.emptyList();
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
                    this.list_ = LazyStringArrayList.emptyList();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.list_ = LazyStringArrayList.emptyList();
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
                            this.list_ = sEList.list_;
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
                                    if (tag != 10) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        ByteString bytes = codedInputStream.readBytes();
                                        ensureListIsMutable();
                                        this.list_.add(bytes);
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
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, k kVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SENotificationString_SEList_descriptor;
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
                return getListList().equals(sEList.getListList()) && getUnknownFields().equals(sEList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SENotificationString_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.SEListOrBuilder
            public String getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.SEListOrBuilder
            public ByteString getListBytes(int i7) {
                return this.list_.getByteString(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
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
                int iComputeStringSizeNoTag = 0;
                for (int i8 = 0; i8 < this.list_.size(); i8++) {
                    iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.list_.getRaw(i8));
                }
                int size = iComputeStringSizeNoTag + getListList().size() + getUnknownFields().getSerializedSize();
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
                return NotificationProtos.internal_static_SA_SENotificationString_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    GeneratedMessage.writeString(codedOutputStream, 1, this.list_.getRaw(i7));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.list_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(SEList sEList) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEList);
            }

            public static SEList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.SEListOrBuilder
            public ProtocolStringList getListList() {
                return this.list_;
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
                this.list_ = LazyStringArrayList.emptyList();
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = LazyStringArrayList.emptyList();
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
            String getList(int i7);

            ByteString getListBytes(int i7);

            int getListCount();

            List<String> getListList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SENotificationString");
            DEFAULT_INSTANCE = new SENotificationString();
            PARSER = new AbstractParser<SENotificationString>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationString.1
                @Override // com.google.protobuf.Parser
                public SENotificationString parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SENotificationString.newBuilder();
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

        public /* synthetic */ SENotificationString(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SENotificationString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SENotificationString_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SENotificationString parseDelimitedFrom(InputStream inputStream) {
            return (SENotificationString) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SENotificationString parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SENotificationString> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SENotificationString)) {
                return super.equals(obj);
            }
            SENotificationString sENotificationString = (SENotificationString) obj;
            if (hasNotificationString() != sENotificationString.hasNotificationString()) {
                return false;
            }
            return (!hasNotificationString() || getNotificationString().equals(sENotificationString.getNotificationString())) && getUnknownFields().equals(sENotificationString.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SENotificationString_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationStringOrBuilder
        public SEList getNotificationString() {
            SEList sEList = this.notificationString_;
            return sEList == null ? SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationStringOrBuilder
        public SEListOrBuilder getNotificationStringOrBuilder() {
            SEList sEList = this.notificationString_;
            return sEList == null ? SEList.getDefaultInstance() : sEList;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SENotificationString> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeMessageSize = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getNotificationString()) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotificationStringOrBuilder
        public boolean hasNotificationString() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasNotificationString()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getNotificationString().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SENotificationString_fieldAccessorTable.ensureFieldAccessorsInitialized(SENotificationString.class, Builder.class);
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
            if (hasNotificationString()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getNotificationString());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SENotificationString(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SENotificationString sENotificationString) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sENotificationString);
        }

        public static SENotificationString parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SENotificationString parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SENotificationString) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SENotificationString parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SENotificationString getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private SENotificationString() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SENotificationString parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SENotificationString parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SENotificationString parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SENotificationString parseFrom(InputStream inputStream) {
            return (SENotificationString) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SENotificationString parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SENotificationString) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SENotificationString parseFrom(CodedInputStream codedInputStream) {
            return (SENotificationString) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SENotificationString parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SENotificationString) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SENotificationStringOrBuilder extends MessageOrBuilder {
        SENotificationString.SEList getNotificationString();

        SENotificationString.SEListOrBuilder getNotificationStringOrBuilder();

        boolean hasNotificationString();
    }

    public enum SENotification_NotificationID implements ProtocolMessageEnum {
        SET_IOS_NOTIFICATION_LIST(0),
        GET_IOS_NOTIFICATION_LIST(1),
        SEND_SYSTEM_NOTIFICATION(2),
        SEND_APP_NOTIFICATION(3),
        SEND_CALL_STATE(4),
        GET_QUICK_REPLY_LIST(5),
        SET_QUICK_REPLY_LIST(6),
        SEND_QUICK_REPLY_MESSAGE(7),
        GET_CONTACTS_LIST(8),
        SET_CONTACTS_LIST(9),
        GET_COLLECTION_CONTACTS_LIST(10),
        SET_COLLECTION_CONTACTS_LIST(11),
        GET_SOS_CONTACTS(12),
        SET_SOS_CONTACTS(13),
        GET_CONTACTS_CY_2_LIST(14),
        SET_CONTACTS_CY_2_LIST(15),
        REQUEST_GET_SOS_CONTACTS(16),
        REQUEST_SOS_CONTACTS_MESSAGE_SEND(17),
        GET_CONTACTS_AVATAR_DATA(18),
        SET_CONTACTS_AVATAR_DATA(19),
        GET_DONT_HAVE_AVATAR_LIST(20),
        GET_GLOD_FRIEND_CONTACTS(21),
        SET_GLOD_FRIEND_CONTACTS(22),
        REQUEST_GLOD_FRIEND_EMOJI(23),
        SEND_GLOD_FRIEND_EMOJI(24),
        SEND_GLOD_FRIEND_EMOJI_REQUEST(25),
        SEND_CONTACT_INFO(32),
        QUERY_CONTACT_INFO(33),
        DEVICE_SEND_APP_OPEN_NOTIFY(34),
        APP_CONTROL_DEVICE_REMOVE_NOTIFY(35),
        GET_WHATSAPP_QUICK_REPLY_LIST(36),
        SET_WHATSAPP_QUICK_REPLY_LIST(37),
        SEND_WHATSAPP_QUICK_REPLY_MESSAGE(38),
        SEND_SUPER_NOTIFICATION(39),
        REQUEST_SOS_CONTACTS(40);

        public static final int APP_CONTROL_DEVICE_REMOVE_NOTIFY_VALUE = 35;
        public static final int DEVICE_SEND_APP_OPEN_NOTIFY_VALUE = 34;
        public static final int GET_COLLECTION_CONTACTS_LIST_VALUE = 10;
        public static final int GET_CONTACTS_AVATAR_DATA_VALUE = 18;
        public static final int GET_CONTACTS_CY_2_LIST_VALUE = 14;
        public static final int GET_CONTACTS_LIST_VALUE = 8;
        public static final int GET_DONT_HAVE_AVATAR_LIST_VALUE = 20;
        public static final int GET_GLOD_FRIEND_CONTACTS_VALUE = 21;
        public static final int GET_IOS_NOTIFICATION_LIST_VALUE = 1;
        public static final int GET_QUICK_REPLY_LIST_VALUE = 5;
        public static final int GET_SOS_CONTACTS_VALUE = 12;
        public static final int GET_WHATSAPP_QUICK_REPLY_LIST_VALUE = 36;
        public static final int QUERY_CONTACT_INFO_VALUE = 33;
        public static final int REQUEST_GET_SOS_CONTACTS_VALUE = 16;
        public static final int REQUEST_GLOD_FRIEND_EMOJI_VALUE = 23;
        public static final int REQUEST_SOS_CONTACTS_MESSAGE_SEND_VALUE = 17;
        public static final int REQUEST_SOS_CONTACTS_VALUE = 40;
        public static final int SEND_APP_NOTIFICATION_VALUE = 3;
        public static final int SEND_CALL_STATE_VALUE = 4;
        public static final int SEND_CONTACT_INFO_VALUE = 32;
        public static final int SEND_GLOD_FRIEND_EMOJI_REQUEST_VALUE = 25;
        public static final int SEND_GLOD_FRIEND_EMOJI_VALUE = 24;
        public static final int SEND_QUICK_REPLY_MESSAGE_VALUE = 7;
        public static final int SEND_SUPER_NOTIFICATION_VALUE = 39;
        public static final int SEND_SYSTEM_NOTIFICATION_VALUE = 2;
        public static final int SEND_WHATSAPP_QUICK_REPLY_MESSAGE_VALUE = 38;
        public static final int SET_COLLECTION_CONTACTS_LIST_VALUE = 11;
        public static final int SET_CONTACTS_AVATAR_DATA_VALUE = 19;
        public static final int SET_CONTACTS_CY_2_LIST_VALUE = 15;
        public static final int SET_CONTACTS_LIST_VALUE = 9;
        public static final int SET_GLOD_FRIEND_CONTACTS_VALUE = 22;
        public static final int SET_IOS_NOTIFICATION_LIST_VALUE = 0;
        public static final int SET_QUICK_REPLY_LIST_VALUE = 6;
        public static final int SET_SOS_CONTACTS_VALUE = 13;
        public static final int SET_WHATSAPP_QUICK_REPLY_LIST_VALUE = 37;
        private static final SENotification_NotificationID[] VALUES;
        private static final Internal.EnumLiteMap<SENotification_NotificationID> internalValueMap;
        private final int value;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SENotification_NotificationID$1 */
        public class AnonymousClass1 implements Internal.EnumLiteMap<SENotification_NotificationID> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SENotification_NotificationID findValueByNumber(int i7) {
                return SENotification_NotificationID.forNumber(i7);
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SENotification_NotificationID");
            internalValueMap = new Internal.EnumLiteMap<SENotification_NotificationID>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SENotification_NotificationID.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SENotification_NotificationID findValueByNumber(int i7) {
                    return SENotification_NotificationID.forNumber(i7);
                }
            };
            VALUES = values();
        }

        SENotification_NotificationID(int i7) {
            this.value = i7;
        }

        public static SENotification_NotificationID forNumber(int i7) {
            switch (i7) {
                case 0:
                    return SET_IOS_NOTIFICATION_LIST;
                case 1:
                    return GET_IOS_NOTIFICATION_LIST;
                case 2:
                    return SEND_SYSTEM_NOTIFICATION;
                case 3:
                    return SEND_APP_NOTIFICATION;
                case 4:
                    return SEND_CALL_STATE;
                case 5:
                    return GET_QUICK_REPLY_LIST;
                case 6:
                    return SET_QUICK_REPLY_LIST;
                case 7:
                    return SEND_QUICK_REPLY_MESSAGE;
                case 8:
                    return GET_CONTACTS_LIST;
                case 9:
                    return SET_CONTACTS_LIST;
                case 10:
                    return GET_COLLECTION_CONTACTS_LIST;
                case 11:
                    return SET_COLLECTION_CONTACTS_LIST;
                case 12:
                    return GET_SOS_CONTACTS;
                case 13:
                    return SET_SOS_CONTACTS;
                case 14:
                    return GET_CONTACTS_CY_2_LIST;
                case 15:
                    return SET_CONTACTS_CY_2_LIST;
                case 16:
                    return REQUEST_GET_SOS_CONTACTS;
                case 17:
                    return REQUEST_SOS_CONTACTS_MESSAGE_SEND;
                case 18:
                    return GET_CONTACTS_AVATAR_DATA;
                case 19:
                    return SET_CONTACTS_AVATAR_DATA;
                case 20:
                    return GET_DONT_HAVE_AVATAR_LIST;
                case 21:
                    return GET_GLOD_FRIEND_CONTACTS;
                case 22:
                    return SET_GLOD_FRIEND_CONTACTS;
                case 23:
                    return REQUEST_GLOD_FRIEND_EMOJI;
                case 24:
                    return SEND_GLOD_FRIEND_EMOJI;
                case 25:
                    return SEND_GLOD_FRIEND_EMOJI_REQUEST;
                default:
                    switch (i7) {
                        case 32:
                            return SEND_CONTACT_INFO;
                        case 33:
                            return QUERY_CONTACT_INFO;
                        case 34:
                            return DEVICE_SEND_APP_OPEN_NOTIFY;
                        case 35:
                            return APP_CONTROL_DEVICE_REMOVE_NOTIFY;
                        case 36:
                            return GET_WHATSAPP_QUICK_REPLY_LIST;
                        case 37:
                            return SET_WHATSAPP_QUICK_REPLY_LIST;
                        case 38:
                            return SEND_WHATSAPP_QUICK_REPLY_MESSAGE;
                        case 39:
                            return SEND_SUPER_NOTIFICATION;
                        case 40:
                            return REQUEST_SOS_CONTACTS;
                        default:
                            return null;
                    }
            }
        }

        public static Descriptors.EnumDescriptor getDescriptor() {
            return NotificationProtos.getDescriptor().getEnumType(0);
        }

        public static Internal.EnumLiteMap<SENotification_NotificationID> internalGetValueMap() {
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
        public static SENotification_NotificationID valueOf(int i7) {
            return forNumber(i7);
        }

        public static SENotification_NotificationID valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SEQuickReply extends GeneratedMessage implements SEQuickReplyOrBuilder {
        private static final SEQuickReply DEFAULT_INSTANCE;
        private static final Parser<SEQuickReply> PARSER;
        public static final int TEXT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object text_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEQuickReply$1 */
        public class AnonymousClass1 extends AbstractParser<SEQuickReply> {
            @Override // com.google.protobuf.Parser
            public SEQuickReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEQuickReply.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEQuickReplyOrBuilder {
            private int bitField0_;
            private Object text_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEQuickReply sEQuickReply) {
                int i7 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sEQuickReply.text_ = this.text_;
                } else {
                    i7 = 0;
                }
                sEQuickReply.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEQuickReply_descriptor;
            }

            public Builder clearText() {
                this.text_ = SEQuickReply.getDefaultInstance().getText();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEQuickReply_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyOrBuilder
            public ByteString getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyOrBuilder
            public boolean hasText() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEQuickReply_fieldAccessorTable.ensureFieldAccessorsInitialized(SEQuickReply.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasText();
            }

            public Builder setText(String str) {
                str.getClass();
                this.text_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                this.text_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.text_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEQuickReply build() {
                SEQuickReply sEQuickReplyBuildPartial = buildPartial();
                if (sEQuickReplyBuildPartial.isInitialized()) {
                    return sEQuickReplyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEQuickReplyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEQuickReply buildPartial() {
                SEQuickReply sEQuickReply = new SEQuickReply(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEQuickReply);
                }
                onBuilt();
                return sEQuickReply;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEQuickReply getDefaultInstanceForType() {
                return SEQuickReply.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.text_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.text_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEQuickReply) {
                    return mergeFrom((SEQuickReply) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEQuickReply sEQuickReply) {
                if (sEQuickReply == SEQuickReply.getDefaultInstance()) {
                    return this;
                }
                if (sEQuickReply.hasText()) {
                    this.text_ = sEQuickReply.text_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(sEQuickReply.getUnknownFields());
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.text_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
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
            private static final long serialVersionUID = 0;
            private List<SEQuickReply> list_;
            private byte memoizedIsInitialized;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEQuickReply$SEList$1 */
            public class AnonymousClass1 extends AbstractParser<SEList> {
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
                private RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> listBuilder_;
                private List<SEQuickReply> list_;

                public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                    this(builderParent);
                }

                private void buildPartial0(SEList sEList) {
                }

                private void buildPartialRepeatedFields(SEList sEList) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        sEList.list_ = repeatedFieldBuilder.build();
                        return;
                    }
                    if ((this.bitField0_ & 1) != 0) {
                        this.list_ = Collections.unmodifiableList(this.list_);
                        this.bitField0_ &= -2;
                    }
                    sEList.list_ = this.list_;
                }

                private void ensureListIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.list_ = new ArrayList(this.list_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return NotificationProtos.internal_static_SA_SEQuickReply_SEList_descriptor;
                }

                private RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> internalGetListFieldBuilder() {
                    if (this.listBuilder_ == null) {
                        this.listBuilder_ = new RepeatedFieldBuilder<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.list_ = null;
                    }
                    return this.listBuilder_;
                }

                public Builder addAllList(Iterable<? extends SEQuickReply> iterable) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addAllMessages(iterable);
                        return this;
                    }
                    ensureListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                    onChanged();
                    return this;
                }

                public Builder addList(SEQuickReply sEQuickReply) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.addMessage(sEQuickReply);
                        return this;
                    }
                    sEQuickReply.getClass();
                    ensureListIsMutable();
                    this.list_.add(sEQuickReply);
                    onChanged();
                    return this;
                }

                public Builder addListBuilder() {
                    return (Builder) internalGetListFieldBuilder().addBuilder(SEQuickReply.getDefaultInstance());
                }

                public Builder clearList() {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                    return NotificationProtos.internal_static_SA_SEQuickReply_SEList_descriptor;
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
                public SEQuickReply getList(int i7) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEQuickReply) repeatedFieldBuilder.getMessage(i7);
                }

                public Builder getListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().getBuilder(i7);
                }

                public List<Builder> getListBuilderList() {
                    return internalGetListFieldBuilder().getBuilderList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
                public int getListCount() {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.size() : repeatedFieldBuilder.getCount();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
                public List<SEQuickReply> getListList() {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilder.getMessageList();
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
                public SEQuickReplyOrBuilder getListOrBuilder(int i7) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder == null ? this.list_.get(i7) : (SEQuickReplyOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i7);
                }

                @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
                public List<? extends SEQuickReplyOrBuilder> getListOrBuilderList() {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return NotificationProtos.internal_static_SA_SEQuickReply_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.remove(i7);
                        return this;
                    }
                    ensureListIsMutable();
                    this.list_.remove(i7);
                    onChanged();
                    return this;
                }

                public Builder setList(int i7, SEQuickReply sEQuickReply) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder != null) {
                        repeatedFieldBuilder.setMessage(i7, sEQuickReply);
                        return this;
                    }
                    sEQuickReply.getClass();
                    ensureListIsMutable();
                    this.list_.set(i7, sEQuickReply);
                    onChanged();
                    return this;
                }

                public /* synthetic */ Builder(k kVar) {
                    this();
                }

                private Builder() {
                    this.list_ = Collections.EMPTY_LIST;
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
                    buildPartialRepeatedFields(sEList);
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

                public Builder addListBuilder(int i7) {
                    return (Builder) internalGetListFieldBuilder().addBuilder(i7, SEQuickReply.getDefaultInstance());
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.list_ = Collections.EMPTY_LIST;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        this.list_ = Collections.EMPTY_LIST;
                    } else {
                        this.list_ = null;
                        repeatedFieldBuilder.clear();
                    }
                    this.bitField0_ &= -2;
                    return this;
                }

                public Builder addList(int i7, SEQuickReply sEQuickReply) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        sEQuickReply.getClass();
                        ensureListIsMutable();
                        this.list_.add(i7, sEQuickReply);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(i7, sEQuickReply);
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

                public Builder setList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.set(i7, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.setMessage(i7, builder.build());
                    return this;
                }

                public Builder mergeFrom(SEList sEList) {
                    if (sEList == SEList.getDefaultInstance()) {
                        return this;
                    }
                    if (this.listBuilder_ == null) {
                        if (!sEList.list_.isEmpty()) {
                            if (this.list_.isEmpty()) {
                                this.list_ = sEList.list_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureListIsMutable();
                                this.list_.addAll(sEList.list_);
                            }
                            onChanged();
                        }
                    } else if (!sEList.list_.isEmpty()) {
                        if (this.listBuilder_.isEmpty()) {
                            this.listBuilder_.dispose();
                            this.listBuilder_ = null;
                            this.list_ = sEList.list_;
                            this.bitField0_ &= -2;
                            this.listBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetListFieldBuilder() : null;
                        } else {
                            this.listBuilder_.addAllMessages(sEList.list_);
                        }
                    }
                    mergeUnknownFields(sEList.getUnknownFields());
                    onChanged();
                    return this;
                }

                public Builder addList(Builder builder) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                    if (repeatedFieldBuilder == null) {
                        ensureListIsMutable();
                        this.list_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilder.addMessage(builder.build());
                    return this;
                }

                public Builder addList(int i7, Builder builder) {
                    RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
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
                                        SEQuickReply sEQuickReply = (SEQuickReply) codedInputStream.readMessage(SEQuickReply.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilder<SEQuickReply, Builder, SEQuickReplyOrBuilder> repeatedFieldBuilder = this.listBuilder_;
                                        if (repeatedFieldBuilder == null) {
                                            ensureListIsMutable();
                                            this.list_.add(sEQuickReply);
                                        } else {
                                            repeatedFieldBuilder.addMessage(sEQuickReply);
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
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEList");
                DEFAULT_INSTANCE = new SEList();
                PARSER = new AbstractParser<SEList>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEList.1
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

            public /* synthetic */ SEList(GeneratedMessage.Builder builder, k kVar) {
                this(builder);
            }

            public static SEList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEQuickReply_SEList_descriptor;
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
                return getListList().equals(sEList.getListList()) && getUnknownFields().equals(sEList.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEQuickReply_SEList_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
            public SEQuickReply getList(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
            public int getListCount() {
                return this.list_.size();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
            public List<SEQuickReply> getListList() {
                return this.list_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
            public SEQuickReplyOrBuilder getListOrBuilder(int i7) {
                return this.list_.get(i7);
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.SEListOrBuilder
            public List<? extends SEQuickReplyOrBuilder> getListOrBuilderList() {
                return this.list_;
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
                return NotificationProtos.internal_static_SA_SEQuickReply_SEList_fieldAccessorTable.ensureFieldAccessorsInitialized(SEList.class, Builder.class);
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

            private SEList(GeneratedMessage.Builder<?> builder) {
                super(builder);
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

            private SEList() {
                this.memoizedIsInitialized = (byte) -1;
                this.list_ = Collections.EMPTY_LIST;
            }

            public static SEList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
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
            SEQuickReply getList(int i7);

            int getListCount();

            List<SEQuickReply> getListList();

            SEQuickReplyOrBuilder getListOrBuilder(int i7);

            List<? extends SEQuickReplyOrBuilder> getListOrBuilderList();
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEQuickReply");
            DEFAULT_INSTANCE = new SEQuickReply();
            PARSER = new AbstractParser<SEQuickReply>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReply.1
                @Override // com.google.protobuf.Parser
                public SEQuickReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEQuickReply.newBuilder();
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

        public /* synthetic */ SEQuickReply(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEQuickReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEQuickReply_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEQuickReply parseDelimitedFrom(InputStream inputStream) {
            return (SEQuickReply) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEQuickReply parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEQuickReply> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEQuickReply)) {
                return super.equals(obj);
            }
            SEQuickReply sEQuickReply = (SEQuickReply) obj;
            if (hasText() != sEQuickReply.hasText()) {
                return false;
            }
            return (!hasText() || getText().equals(sEQuickReply.getText())) && getUnknownFields().equals(sEQuickReply.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEQuickReply_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEQuickReply> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = ((this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.text_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyOrBuilder
        public boolean hasText() {
            return (this.bitField0_ & 1) != 0;
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
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEQuickReply_fieldAccessorTable.ensureFieldAccessorsInitialized(SEQuickReply.class, Builder.class);
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
            if (hasText()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.text_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEQuickReply(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEQuickReply sEQuickReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEQuickReply);
        }

        public static SEQuickReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEQuickReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEQuickReply) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEQuickReply parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEQuickReply getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEQuickReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SEQuickReply() {
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.text_ = "";
        }

        public static SEQuickReply parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SEQuickReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEQuickReply parseFrom(InputStream inputStream) {
            return (SEQuickReply) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEQuickReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEQuickReply) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEQuickReply parseFrom(CodedInputStream codedInputStream) {
            return (SEQuickReply) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEQuickReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEQuickReply) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SEQuickReplyMessage extends GeneratedMessage implements SEQuickReplyMessageOrBuilder {
        private static final SEQuickReplyMessage DEFAULT_INSTANCE;
        private static final Parser<SEQuickReplyMessage> PARSER;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
        public static final int TEXT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object phoneNumber_;
        private volatile Object text_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SEQuickReplyMessage$1 */
        public class AnonymousClass1 extends AbstractParser<SEQuickReplyMessage> {
            @Override // com.google.protobuf.Parser
            public SEQuickReplyMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SEQuickReplyMessage.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SEQuickReplyMessageOrBuilder {
            private int bitField0_;
            private Object phoneNumber_;
            private Object text_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SEQuickReplyMessage sEQuickReplyMessage) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sEQuickReplyMessage.phoneNumber_ = this.phoneNumber_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sEQuickReplyMessage.text_ = this.text_;
                    i7 |= 2;
                }
                sEQuickReplyMessage.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SEQuickReplyMessage_descriptor;
            }

            public Builder clearPhoneNumber() {
                this.phoneNumber_ = SEQuickReplyMessage.getDefaultInstance().getPhoneNumber();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearText() {
                this.text_ = SEQuickReplyMessage.getDefaultInstance().getText();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SEQuickReplyMessage_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
            public String getPhoneNumber() {
                Object obj = this.phoneNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.phoneNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
            public ByteString getPhoneNumberBytes() {
                Object obj = this.phoneNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.phoneNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
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

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
            public ByteString getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
            public boolean hasPhoneNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
            public boolean hasText() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SEQuickReplyMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(SEQuickReplyMessage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPhoneNumber() && hasText();
            }

            public Builder setPhoneNumber(String str) {
                str.getClass();
                this.phoneNumber_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPhoneNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.phoneNumber_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setText(String str) {
                str.getClass();
                this.text_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                this.text_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.phoneNumber_ = "";
                this.text_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEQuickReplyMessage build() {
                SEQuickReplyMessage sEQuickReplyMessageBuildPartial = buildPartial();
                if (sEQuickReplyMessageBuildPartial.isInitialized()) {
                    return sEQuickReplyMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sEQuickReplyMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SEQuickReplyMessage buildPartial() {
                SEQuickReplyMessage sEQuickReplyMessage = new SEQuickReplyMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sEQuickReplyMessage);
                }
                onBuilt();
                return sEQuickReplyMessage;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SEQuickReplyMessage getDefaultInstanceForType() {
                return SEQuickReplyMessage.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.phoneNumber_ = "";
                this.text_ = "";
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.phoneNumber_ = "";
                this.text_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SEQuickReplyMessage) {
                    return mergeFrom((SEQuickReplyMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SEQuickReplyMessage sEQuickReplyMessage) {
                if (sEQuickReplyMessage == SEQuickReplyMessage.getDefaultInstance()) {
                    return this;
                }
                if (sEQuickReplyMessage.hasPhoneNumber()) {
                    this.phoneNumber_ = sEQuickReplyMessage.phoneNumber_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sEQuickReplyMessage.hasText()) {
                    this.text_ = sEQuickReplyMessage.text_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(sEQuickReplyMessage.getUnknownFields());
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
                                    this.phoneNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.text_ = codedInputStream.readBytes();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEQuickReplyMessage");
            DEFAULT_INSTANCE = new SEQuickReplyMessage();
            PARSER = new AbstractParser<SEQuickReplyMessage>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessage.1
                @Override // com.google.protobuf.Parser
                public SEQuickReplyMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SEQuickReplyMessage.newBuilder();
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

        public /* synthetic */ SEQuickReplyMessage(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SEQuickReplyMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SEQuickReplyMessage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SEQuickReplyMessage parseDelimitedFrom(InputStream inputStream) {
            return (SEQuickReplyMessage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SEQuickReplyMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SEQuickReplyMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SEQuickReplyMessage)) {
                return super.equals(obj);
            }
            SEQuickReplyMessage sEQuickReplyMessage = (SEQuickReplyMessage) obj;
            if (hasPhoneNumber() != sEQuickReplyMessage.hasPhoneNumber()) {
                return false;
            }
            if ((!hasPhoneNumber() || getPhoneNumber().equals(sEQuickReplyMessage.getPhoneNumber())) && hasText() == sEQuickReplyMessage.hasText()) {
                return (!hasText() || getText().equals(sEQuickReplyMessage.getText())) && getUnknownFields().equals(sEQuickReplyMessage.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SEQuickReplyMessage_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SEQuickReplyMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
        public String getPhoneNumber() {
            Object obj = this.phoneNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phoneNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
        public ByteString getPhoneNumberBytes() {
            Object obj = this.phoneNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phoneNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessage.computeStringSize(1, this.phoneNumber_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.text_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
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

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
        public boolean hasPhoneNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SEQuickReplyMessageOrBuilder
        public boolean hasText() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasPhoneNumber()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPhoneNumber().hashCode();
            }
            if (hasText()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getText().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SEQuickReplyMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(SEQuickReplyMessage.class, Builder.class);
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
            if (!hasPhoneNumber()) {
                this.memoizedIsInitialized = (byte) 0;
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
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.phoneNumber_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.text_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SEQuickReplyMessage(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.phoneNumber_ = "";
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SEQuickReplyMessage sEQuickReplyMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sEQuickReplyMessage);
        }

        public static SEQuickReplyMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SEQuickReplyMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEQuickReplyMessage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEQuickReplyMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SEQuickReplyMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SEQuickReplyMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SEQuickReplyMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SEQuickReplyMessage() {
            this.phoneNumber_ = "";
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.phoneNumber_ = "";
            this.text_ = "";
        }

        public static SEQuickReplyMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SEQuickReplyMessage parseFrom(InputStream inputStream) {
            return (SEQuickReplyMessage) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SEQuickReplyMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEQuickReplyMessage) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SEQuickReplyMessage parseFrom(CodedInputStream codedInputStream) {
            return (SEQuickReplyMessage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SEQuickReplyMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SEQuickReplyMessage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SEQuickReplyMessageOrBuilder extends MessageOrBuilder {
        String getPhoneNumber();

        ByteString getPhoneNumberBytes();

        String getText();

        ByteString getTextBytes();

        boolean hasPhoneNumber();

        boolean hasText();
    }

    public interface SEQuickReplyOrBuilder extends MessageOrBuilder {
        String getText();

        ByteString getTextBytes();

        boolean hasText();
    }

    public static final class SESOSContacts extends GeneratedMessage implements SESOSContactsOrBuilder {
        private static final SESOSContacts DEFAULT_INSTANCE;
        public static final int MAX_SOS_CONTACTS_ALL_COUNT_FIELD_NUMBER = 3;
        private static final Parser<SESOSContacts> PARSER;
        public static final int SOS_CONTACTS_LIST_FIELD_NUMBER = 2;
        public static final int SOS_CONTACTS_SWITCH_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int maxSosContactsAllCount_;
        private byte memoizedIsInitialized;
        private SEContacts.SEList sosContactsList_;
        private boolean sosContactsSwitch_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SESOSContacts$1 */
        public class AnonymousClass1 extends AbstractParser<SESOSContacts> {
            @Override // com.google.protobuf.Parser
            public SESOSContacts parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESOSContacts.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESOSContactsOrBuilder {
            private int bitField0_;
            private int maxSosContactsAllCount_;
            private SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> sosContactsListBuilder_;
            private SEContacts.SEList sosContactsList_;
            private boolean sosContactsSwitch_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SESOSContacts sESOSContacts) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESOSContacts.sosContactsSwitch_ = this.sosContactsSwitch_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.sosContactsListBuilder_;
                    sESOSContacts.sosContactsList_ = singleFieldBuilder == null ? this.sosContactsList_ : (SEContacts.SEList) singleFieldBuilder.build();
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sESOSContacts.maxSosContactsAllCount_ = this.maxSosContactsAllCount_;
                    i7 |= 4;
                }
                sESOSContacts.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SESOSContacts_descriptor;
            }

            private SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> internalGetSosContactsListFieldBuilder() {
                if (this.sosContactsListBuilder_ == null) {
                    this.sosContactsListBuilder_ = new SingleFieldBuilder<>(getSosContactsList(), getParentForChildren(), isClean());
                    this.sosContactsList_ = null;
                }
                return this.sosContactsListBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetSosContactsListFieldBuilder();
                }
            }

            public Builder clearMaxSosContactsAllCount() {
                this.bitField0_ &= -5;
                this.maxSosContactsAllCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSosContactsList() {
                this.bitField0_ &= -3;
                this.sosContactsList_ = null;
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.sosContactsListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.sosContactsListBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSosContactsSwitch() {
                this.bitField0_ &= -2;
                this.sosContactsSwitch_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SESOSContacts_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
            public int getMaxSosContactsAllCount() {
                return this.maxSosContactsAllCount_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
            public SEContacts.SEList getSosContactsList() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.sosContactsListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEContacts.SEList) singleFieldBuilder.getMessage();
                }
                SEContacts.SEList sEList = this.sosContactsList_;
                return sEList == null ? SEContacts.SEList.getDefaultInstance() : sEList;
            }

            public SEContacts.SEList.Builder getSosContactsListBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SEContacts.SEList.Builder) internalGetSosContactsListFieldBuilder().getBuilder();
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
            public SEContacts.SEListOrBuilder getSosContactsListOrBuilder() {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.sosContactsListBuilder_;
                if (singleFieldBuilder != null) {
                    return (SEContacts.SEListOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                SEContacts.SEList sEList = this.sosContactsList_;
                return sEList == null ? SEContacts.SEList.getDefaultInstance() : sEList;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
            public boolean getSosContactsSwitch() {
                return this.sosContactsSwitch_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
            public boolean hasMaxSosContactsAllCount() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
            public boolean hasSosContactsList() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
            public boolean hasSosContactsSwitch() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SESOSContacts_fieldAccessorTable.ensureFieldAccessorsInitialized(SESOSContacts.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSosContactsSwitch() && hasSosContactsList();
            }

            public Builder mergeSosContactsList(SEContacts.SEList sEList) {
                SEContacts.SEList sEList2;
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.sosContactsListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(sEList);
                } else if ((this.bitField0_ & 2) == 0 || (sEList2 = this.sosContactsList_) == null || sEList2 == SEContacts.SEList.getDefaultInstance()) {
                    this.sosContactsList_ = sEList;
                } else {
                    getSosContactsListBuilder().mergeFrom(sEList);
                }
                if (this.sosContactsList_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setMaxSosContactsAllCount(int i7) {
                this.maxSosContactsAllCount_ = i7;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSosContactsList(SEContacts.SEList sEList) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.sosContactsListBuilder_;
                if (singleFieldBuilder == null) {
                    sEList.getClass();
                    this.sosContactsList_ = sEList;
                } else {
                    singleFieldBuilder.setMessage(sEList);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSosContactsSwitch(boolean z6) {
                this.sosContactsSwitch_ = z6;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESOSContacts build() {
                SESOSContacts sESOSContactsBuildPartial = buildPartial();
                if (sESOSContactsBuildPartial.isInitialized()) {
                    return sESOSContactsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESOSContactsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESOSContacts buildPartial() {
                SESOSContacts sESOSContacts = new SESOSContacts(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESOSContacts);
                }
                onBuilt();
                return sESOSContacts;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESOSContacts getDefaultInstanceForType() {
                return SESOSContacts.getDefaultInstance();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sosContactsSwitch_ = false;
                this.sosContactsList_ = null;
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.sosContactsListBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.sosContactsListBuilder_ = null;
                }
                this.maxSosContactsAllCount_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESOSContacts) {
                    return mergeFrom((SESOSContacts) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setSosContactsList(SEContacts.SEList.Builder builder) {
                SingleFieldBuilder<SEContacts.SEList, SEContacts.SEList.Builder, SEContacts.SEListOrBuilder> singleFieldBuilder = this.sosContactsListBuilder_;
                if (singleFieldBuilder == null) {
                    this.sosContactsList_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(SESOSContacts sESOSContacts) {
                if (sESOSContacts == SESOSContacts.getDefaultInstance()) {
                    return this;
                }
                if (sESOSContacts.hasSosContactsSwitch()) {
                    setSosContactsSwitch(sESOSContacts.getSosContactsSwitch());
                }
                if (sESOSContacts.hasSosContactsList()) {
                    mergeSosContactsList(sESOSContacts.getSosContactsList());
                }
                if (sESOSContacts.hasMaxSosContactsAllCount()) {
                    setMaxSosContactsAllCount(sESOSContacts.getMaxSosContactsAllCount());
                }
                mergeUnknownFields(sESOSContacts.getUnknownFields());
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
                                    this.sosContactsSwitch_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(internalGetSosContactsListFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.maxSosContactsAllCount_ = codedInputStream.readUInt32();
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
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESOSContacts");
            DEFAULT_INSTANCE = new SESOSContacts();
            PARSER = new AbstractParser<SESOSContacts>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContacts.1
                @Override // com.google.protobuf.Parser
                public SESOSContacts parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESOSContacts.newBuilder();
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

        public /* synthetic */ SESOSContacts(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SESOSContacts getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SESOSContacts_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESOSContacts parseDelimitedFrom(InputStream inputStream) {
            return (SESOSContacts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESOSContacts parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESOSContacts> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESOSContacts)) {
                return super.equals(obj);
            }
            SESOSContacts sESOSContacts = (SESOSContacts) obj;
            if (hasSosContactsSwitch() != sESOSContacts.hasSosContactsSwitch()) {
                return false;
            }
            if ((hasSosContactsSwitch() && getSosContactsSwitch() != sESOSContacts.getSosContactsSwitch()) || hasSosContactsList() != sESOSContacts.hasSosContactsList()) {
                return false;
            }
            if ((!hasSosContactsList() || getSosContactsList().equals(sESOSContacts.getSosContactsList())) && hasMaxSosContactsAllCount() == sESOSContacts.hasMaxSosContactsAllCount()) {
                return (!hasMaxSosContactsAllCount() || getMaxSosContactsAllCount() == sESOSContacts.getMaxSosContactsAllCount()) && getUnknownFields().equals(sESOSContacts.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SESOSContacts_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
        public int getMaxSosContactsAllCount() {
            return this.maxSosContactsAllCount_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESOSContacts> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.sosContactsSwitch_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(2, getSosContactsList());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(3, this.maxSosContactsAllCount_);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
        public SEContacts.SEList getSosContactsList() {
            SEContacts.SEList sEList = this.sosContactsList_;
            return sEList == null ? SEContacts.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
        public SEContacts.SEListOrBuilder getSosContactsListOrBuilder() {
            SEContacts.SEList sEList = this.sosContactsList_;
            return sEList == null ? SEContacts.SEList.getDefaultInstance() : sEList;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
        public boolean getSosContactsSwitch() {
            return this.sosContactsSwitch_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
        public boolean hasMaxSosContactsAllCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
        public boolean hasSosContactsList() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESOSContactsOrBuilder
        public boolean hasSosContactsSwitch() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i7 = this.memoizedHashCode;
            if (i7 != 0) {
                return i7;
            }
            int iHashCode = getDescriptor().hashCode() + DataBinderMapperImpl.Yd;
            if (hasSosContactsSwitch()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashBoolean(getSosContactsSwitch());
            }
            if (hasSosContactsList()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSosContactsList().hashCode();
            }
            if (hasMaxSosContactsAllCount()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMaxSosContactsAllCount();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SESOSContacts_fieldAccessorTable.ensureFieldAccessorsInitialized(SESOSContacts.class, Builder.class);
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
            if (!hasSosContactsSwitch()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSosContactsList()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.sosContactsSwitch_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSosContactsList());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.maxSosContactsAllCount_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESOSContacts(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.sosContactsSwitch_ = false;
            this.maxSosContactsAllCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESOSContacts sESOSContacts) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESOSContacts);
        }

        public static SESOSContacts parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESOSContacts parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESOSContacts) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESOSContacts parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESOSContacts getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESOSContacts parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESOSContacts parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private SESOSContacts() {
            this.sosContactsSwitch_ = false;
            this.maxSosContactsAllCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SESOSContacts parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESOSContacts parseFrom(InputStream inputStream) {
            return (SESOSContacts) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESOSContacts parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESOSContacts) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESOSContacts parseFrom(CodedInputStream codedInputStream) {
            return (SESOSContacts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESOSContacts parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESOSContacts) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESOSContactsOrBuilder extends MessageOrBuilder {
        int getMaxSosContactsAllCount();

        SEContacts.SEList getSosContactsList();

        SEContacts.SEListOrBuilder getSosContactsListOrBuilder();

        boolean getSosContactsSwitch();

        boolean hasMaxSosContactsAllCount();

        boolean hasSosContactsList();

        boolean hasSosContactsSwitch();
    }

    public static final class SESystemNotification extends GeneratedMessage implements SESystemNotificationOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 5;
        public static final int CONTACTS_INFO_FIELD_NUMBER = 3;
        private static final SESystemNotification DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 6;
        public static final int MESSAGE_TEXT_FIELD_NUMBER = 4;
        private static final Parser<SESystemNotification> PARSER;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 2;
        public static final int SUPPORT_OPEN_FIELD_NUMBER = 7;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object appName_;
        private int bitField0_;
        private volatile Object contactsInfo_;
        private volatile Object key_;
        private byte memoizedIsInitialized;
        private volatile Object messageText_;
        private volatile Object phoneNumber_;
        private boolean supportOpen_;
        private int type_;

        /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SESystemNotification$1 */
        public class AnonymousClass1 extends AbstractParser<SESystemNotification> {
            @Override // com.google.protobuf.Parser
            public SESystemNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SESystemNotification.newBuilder();
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

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SESystemNotificationOrBuilder {
            private Object appName_;
            private int bitField0_;
            private Object contactsInfo_;
            private Object key_;
            private Object messageText_;
            private Object phoneNumber_;
            private boolean supportOpen_;
            private int type_;

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, k kVar) {
                this(builderParent);
            }

            private void buildPartial0(SESystemNotification sESystemNotification) {
                int i7;
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    sESystemNotification.type_ = this.type_;
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i8 & 2) != 0) {
                    sESystemNotification.phoneNumber_ = this.phoneNumber_;
                    i7 |= 2;
                }
                if ((i8 & 4) != 0) {
                    sESystemNotification.contactsInfo_ = this.contactsInfo_;
                    i7 |= 4;
                }
                if ((i8 & 8) != 0) {
                    sESystemNotification.messageText_ = this.messageText_;
                    i7 |= 8;
                }
                if ((i8 & 16) != 0) {
                    sESystemNotification.appName_ = this.appName_;
                    i7 |= 16;
                }
                if ((i8 & 32) != 0) {
                    sESystemNotification.key_ = this.key_;
                    i7 |= 32;
                }
                if ((i8 & 64) != 0) {
                    sESystemNotification.supportOpen_ = this.supportOpen_;
                    i7 |= 64;
                }
                sESystemNotification.bitField0_ |= i7;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NotificationProtos.internal_static_SA_SESystemNotification_descriptor;
            }

            public Builder clearAppName() {
                this.appName_ = SESystemNotification.getDefaultInstance().getAppName();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearContactsInfo() {
                this.contactsInfo_ = SESystemNotification.getDefaultInstance().getContactsInfo();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearKey() {
                this.key_ = SESystemNotification.getDefaultInstance().getKey();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearMessageText() {
                this.messageText_ = SESystemNotification.getDefaultInstance().getMessageText();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearPhoneNumber() {
                this.phoneNumber_ = SESystemNotification.getDefaultInstance().getPhoneNumber();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSupportOpen() {
                this.bitField0_ &= -65;
                this.supportOpen_ = false;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public String getAppName() {
                Object obj = this.appName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public ByteString getAppNameBytes() {
                Object obj = this.appName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public String getContactsInfo() {
                Object obj = this.contactsInfo_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contactsInfo_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public ByteString getContactsInfoBytes() {
                Object obj = this.contactsInfo_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contactsInfo_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NotificationProtos.internal_static_SA_SESystemNotification_descriptor;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public String getKey() {
                Object obj = this.key_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.key_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public ByteString getKeyBytes() {
                Object obj = this.key_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.key_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public String getMessageText() {
                Object obj = this.messageText_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.messageText_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public ByteString getMessageTextBytes() {
                Object obj = this.messageText_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.messageText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public String getPhoneNumber() {
                Object obj = this.phoneNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.phoneNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public ByteString getPhoneNumberBytes() {
                Object obj = this.phoneNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.phoneNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public boolean getSupportOpen() {
                return this.supportOpen_;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public SEType getType() {
                SEType sETypeForNumber = SEType.forNumber(this.type_);
                return sETypeForNumber == null ? SEType.CALL : sETypeForNumber;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public boolean hasAppName() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public boolean hasContactsInfo() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public boolean hasKey() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public boolean hasMessageText() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public boolean hasPhoneNumber() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public boolean hasSupportOpen() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NotificationProtos.internal_static_SA_SESystemNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SESystemNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasType() && hasPhoneNumber() && hasContactsInfo();
            }

            public Builder setAppName(String str) {
                str.getClass();
                this.appName_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAppNameBytes(ByteString byteString) {
                byteString.getClass();
                this.appName_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setContactsInfo(String str) {
                str.getClass();
                this.contactsInfo_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setContactsInfoBytes(ByteString byteString) {
                byteString.getClass();
                this.contactsInfo_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setKey(String str) {
                str.getClass();
                this.key_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.key_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMessageText(String str) {
                str.getClass();
                this.messageText_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMessageTextBytes(ByteString byteString) {
                byteString.getClass();
                this.messageText_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPhoneNumber(String str) {
                str.getClass();
                this.phoneNumber_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPhoneNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.phoneNumber_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSupportOpen(boolean z6) {
                this.supportOpen_ = z6;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setType(SEType sEType) {
                sEType.getClass();
                this.bitField0_ |= 1;
                this.type_ = sEType.getNumber();
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(k kVar) {
                this();
            }

            private Builder() {
                this.type_ = 0;
                this.phoneNumber_ = "";
                this.contactsInfo_ = "";
                this.messageText_ = "";
                this.appName_ = "";
                this.key_ = "";
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESystemNotification build() {
                SESystemNotification sESystemNotificationBuildPartial = buildPartial();
                if (sESystemNotificationBuildPartial.isInitialized()) {
                    return sESystemNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sESystemNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SESystemNotification buildPartial() {
                SESystemNotification sESystemNotification = new SESystemNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sESystemNotification);
                }
                onBuilt();
                return sESystemNotification;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SESystemNotification getDefaultInstanceForType() {
                return SESystemNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
                this.phoneNumber_ = "";
                this.contactsInfo_ = "";
                this.messageText_ = "";
                this.appName_ = "";
                this.key_ = "";
                this.supportOpen_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SESystemNotification) {
                    return mergeFrom((SESystemNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.phoneNumber_ = "";
                this.contactsInfo_ = "";
                this.messageText_ = "";
                this.appName_ = "";
                this.key_ = "";
            }

            public Builder mergeFrom(SESystemNotification sESystemNotification) {
                if (sESystemNotification == SESystemNotification.getDefaultInstance()) {
                    return this;
                }
                if (sESystemNotification.hasType()) {
                    setType(sESystemNotification.getType());
                }
                if (sESystemNotification.hasPhoneNumber()) {
                    this.phoneNumber_ = sESystemNotification.phoneNumber_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sESystemNotification.hasContactsInfo()) {
                    this.contactsInfo_ = sESystemNotification.contactsInfo_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (sESystemNotification.hasMessageText()) {
                    this.messageText_ = sESystemNotification.messageText_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (sESystemNotification.hasAppName()) {
                    this.appName_ = sESystemNotification.appName_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (sESystemNotification.hasKey()) {
                    this.key_ = sESystemNotification.key_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (sESystemNotification.hasSupportOpen()) {
                    setSupportOpen(sESystemNotification.getSupportOpen());
                }
                mergeUnknownFields(sESystemNotification.getUnknownFields());
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
                                    if (SEType.forNumber(i7) == null) {
                                        mergeUnknownVarintField(1, i7);
                                    } else {
                                        this.type_ = i7;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.phoneNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.contactsInfo_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.messageText_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.appName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.key_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag != 56) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.supportOpen_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
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

        public enum SEType implements ProtocolMessageEnum {
            CALL(0),
            MISS_CALL(1),
            MESSAGE(2);

            public static final int CALL_VALUE = 0;
            public static final int MESSAGE_VALUE = 2;
            public static final int MISS_CALL_VALUE = 1;
            private static final SEType[] VALUES;
            private static final Internal.EnumLiteMap<SEType> internalValueMap;
            private final int value;

            /* JADX INFO: renamed from: com.zh.ble.sa_wear.protobuf.NotificationProtos$SESystemNotification$SEType$1 */
            public class AnonymousClass1 implements Internal.EnumLiteMap<SEType> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SEType findValueByNumber(int i7) {
                    return SEType.forNumber(i7);
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SEType");
                internalValueMap = new Internal.EnumLiteMap<SEType>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotification.SEType.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public SEType findValueByNumber(int i7) {
                        return SEType.forNumber(i7);
                    }
                };
                VALUES = values();
            }

            SEType(int i7) {
                this.value = i7;
            }

            public static SEType forNumber(int i7) {
                if (i7 == 0) {
                    return CALL;
                }
                if (i7 == 1) {
                    return MISS_CALL;
                }
                if (i7 != 2) {
                    return null;
                }
                return MESSAGE;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return SESystemNotification.getDescriptor().getEnumType(0);
            }

            public static Internal.EnumLiteMap<SEType> internalGetValueMap() {
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
            public static SEType valueOf(int i7) {
                return forNumber(i7);
            }

            public static SEType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "SESystemNotification");
            DEFAULT_INSTANCE = new SESystemNotification();
            PARSER = new AbstractParser<SESystemNotification>() { // from class: com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotification.1
                @Override // com.google.protobuf.Parser
                public SESystemNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SESystemNotification.newBuilder();
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

        public /* synthetic */ SESystemNotification(GeneratedMessage.Builder builder, k kVar) {
            this(builder);
        }

        public static SESystemNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NotificationProtos.internal_static_SA_SESystemNotification_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SESystemNotification parseDelimitedFrom(InputStream inputStream) {
            return (SESystemNotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SESystemNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SESystemNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SESystemNotification)) {
                return super.equals(obj);
            }
            SESystemNotification sESystemNotification = (SESystemNotification) obj;
            if (hasType() != sESystemNotification.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != sESystemNotification.type_) || hasPhoneNumber() != sESystemNotification.hasPhoneNumber()) {
                return false;
            }
            if ((hasPhoneNumber() && !getPhoneNumber().equals(sESystemNotification.getPhoneNumber())) || hasContactsInfo() != sESystemNotification.hasContactsInfo()) {
                return false;
            }
            if ((hasContactsInfo() && !getContactsInfo().equals(sESystemNotification.getContactsInfo())) || hasMessageText() != sESystemNotification.hasMessageText()) {
                return false;
            }
            if ((hasMessageText() && !getMessageText().equals(sESystemNotification.getMessageText())) || hasAppName() != sESystemNotification.hasAppName()) {
                return false;
            }
            if ((hasAppName() && !getAppName().equals(sESystemNotification.getAppName())) || hasKey() != sESystemNotification.hasKey()) {
                return false;
            }
            if ((!hasKey() || getKey().equals(sESystemNotification.getKey())) && hasSupportOpen() == sESystemNotification.hasSupportOpen()) {
                return (!hasSupportOpen() || getSupportOpen() == sESystemNotification.getSupportOpen()) && getUnknownFields().equals(sESystemNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public String getContactsInfo() {
            Object obj = this.contactsInfo_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.contactsInfo_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public ByteString getContactsInfoBytes() {
            Object obj = this.contactsInfo_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contactsInfo_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return NotificationProtos.internal_static_SA_SESystemNotification_descriptor;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public String getKey() {
            Object obj = this.key_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.key_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public ByteString getKeyBytes() {
            Object obj = this.key_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.key_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public String getMessageText() {
            Object obj = this.messageText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.messageText_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public ByteString getMessageTextBytes() {
            Object obj = this.messageText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.messageText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SESystemNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public String getPhoneNumber() {
            Object obj = this.phoneNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phoneNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public ByteString getPhoneNumberBytes() {
            Object obj = this.phoneNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phoneNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i7 = this.memoizedSize;
            if (i7 != -1) {
                return i7;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.phoneNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(3, this.contactsInfo_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(4, this.messageText_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(5, this.appName_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += GeneratedMessage.computeStringSize(6, this.key_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(7, this.supportOpen_);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public boolean getSupportOpen() {
            return this.supportOpen_;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public SEType getType() {
            SEType sETypeForNumber = SEType.forNumber(this.type_);
            return sETypeForNumber == null ? SEType.CALL : sETypeForNumber;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public boolean hasAppName() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public boolean hasContactsInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public boolean hasKey() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public boolean hasMessageText() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public boolean hasPhoneNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
        public boolean hasSupportOpen() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.zh.ble.sa_wear.protobuf.NotificationProtos.SESystemNotificationOrBuilder
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
            if (hasPhoneNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getPhoneNumber().hashCode();
            }
            if (hasContactsInfo()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getContactsInfo().hashCode();
            }
            if (hasMessageText()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMessageText().hashCode();
            }
            if (hasAppName()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getAppName().hashCode();
            }
            if (hasKey()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getKey().hashCode();
            }
            if (hasSupportOpen()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + Internal.hashBoolean(getSupportOpen());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NotificationProtos.internal_static_SA_SESystemNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SESystemNotification.class, Builder.class);
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
            if (!hasPhoneNumber()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContactsInfo()) {
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
                GeneratedMessage.writeString(codedOutputStream, 2, this.phoneNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.contactsInfo_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.messageText_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.appName_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.key_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.supportOpen_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        private SESystemNotification(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.phoneNumber_ = "";
            this.contactsInfo_ = "";
            this.messageText_ = "";
            this.appName_ = "";
            this.key_ = "";
            this.supportOpen_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SESystemNotification sESystemNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sESystemNotification);
        }

        public static SESystemNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SESystemNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESystemNotification) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SESystemNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SESystemNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SESystemNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SESystemNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SESystemNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SESystemNotification parseFrom(InputStream inputStream) {
            return (SESystemNotification) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SESystemNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESystemNotification) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SESystemNotification() {
            this.type_ = 0;
            this.phoneNumber_ = "";
            this.contactsInfo_ = "";
            this.messageText_ = "";
            this.appName_ = "";
            this.key_ = "";
            this.supportOpen_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.phoneNumber_ = "";
            this.contactsInfo_ = "";
            this.messageText_ = "";
            this.appName_ = "";
            this.key_ = "";
        }

        public static SESystemNotification parseFrom(CodedInputStream codedInputStream) {
            return (SESystemNotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SESystemNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SESystemNotification) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SESystemNotificationOrBuilder extends MessageOrBuilder {
        String getAppName();

        ByteString getAppNameBytes();

        String getContactsInfo();

        ByteString getContactsInfoBytes();

        String getKey();

        ByteString getKeyBytes();

        String getMessageText();

        ByteString getMessageTextBytes();

        String getPhoneNumber();

        ByteString getPhoneNumberBytes();

        boolean getSupportOpen();

        SESystemNotification.SEType getType();

        boolean hasAppName();

        boolean hasContactsInfo();

        boolean hasKey();

        boolean hasMessageText();

        boolean hasPhoneNumber();

        boolean hasSupportOpen();

        boolean hasType();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 34, 1, "", "NotificationProtos");
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015sa_Notification.proto\u0012\u0002SA\u001a\u000fsa_nanopb.proto\u001a\u000fsa_Common.proto\"Ü\u0007\n\u000eSENotification\u00127\n\u0013system_notification\u0018\u0001 \u0001(\u000b2\u0018.SA.SESystemNotificationH\u0000\u00121\n\u0010app_notification\u0018\u0002 \u0001(\u000b2\u0015.SA.SEAppNotificationH\u0000\u0012=\n\u0015ios_notification_list\u0018\u0003 \u0001(\u000b2\u001c.SA.SEIOSNotification.SEListH\u0000\u0012%\n\ncall_state\u0018\u0004 \u0001(\u000e2\u000f.SA.SECallStateH\u0000\u00123\n\u0010quick_reply_list\u0018\u0005 \u0001(\u000b2\u0017.SA.SEQuickReply.SEListH\u0000\u00126\n\u0013quick_reply_message\u0018\u0006 \u0001(\u000b2\u0017.SA.SEQuickReplyMessageH\u0000\u0012.\n\rcontacts_list\u0018\u0007 \u0001(\u000b2\u0015.SA.SEContacts.SEListH\u0000\u00129\n\u0018collection_contacts_list\u0018\b \u0001(\u000b2\u0015.SA.SEContacts.SEListH\u0000\u0012)\n\fsos_contacts\u0018\t \u0001(\u000b2\u0011.SA.SESOSContactsH\u0000\u0012+\n\rcontacts_cy_2\u0018\n \u0001(\u000b2\u0012.SA.SEContactsCY_2H\u0000\u00127\n\u0013contact_avatar_data\u0018\u000b \u0001(\u000b2\u0018.SA.SEContactsAvatarDataH\u0000\u0012;\n\u0014contacts_avatar_list\u0018\f \u0001(\u000b2\u001b.SA.SEContactsAvatar.SEListH\u0000\u0012?\n\u0014glod_friend_contacts\u0018\r \u0001(\u000b2\u001f.SA.SEGlodFriendContacts.SEListH\u0000\u00122\n\u0011glod_friend_emoji\u0018\u000e \u0001(\u000b2\u0015.SA.SEGlodFriendEmojiH\u0000\u0012)\n\fcontact_info\u0018\u000f \u0001(\u000b2\u0011.SA.SEContactInfoH\u0000\u0012\u0017\n\u0006number\u0018\u0010 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012\"\n\u0011open_in_phone_key\u0018\u0011 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004H\u0000\u0012,\n\fremove_notif\u0018\u0012 \u0001(\u000b2\u0014.SA.SEAppRemoveNotifH\u0000\u0012<\n\u0016app_super_notification\u0018\u0013 \u0001(\u000b2\u001a.SA.SEAppSuperNotificationH\u0000B\t\n\u0007payload\"\u0090\u0002\n\u0014SESystemNotification\u0012-\n\u0004type\u0018\u0001 \u0002(\u000e2\u001f.SA.SESystemNotification.SEType\u0012\u001b\n\fphone_number\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001c\n\rcontacts_info\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001b\n\fmessage_text\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0017\n\bapp_name\u0018\u0005 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003key\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\fsupport_open\u0018\u0007 \u0001(\b\".\n\u0006SEType\u0012\b\n\u0004CALL\u0010\u0000\u0012\r\n\tMISS_CALL\u0010\u0001\u0012\u000b\n\u0007MESSAGE\u0010\u0002\"·\u0001\n\u0011SEAppNotification\u0012\u0017\n\bapp_name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tpage_name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005title\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004text\u0018\u0004 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u000bticker_text\u0018\u0005 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0012\n\u0003key\u0018\u0006 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\fsupport_open\u0018\u0007 \u0001(\b\"\u008a\u0001\n\u0011SEIOSNotification\u0012\u0015\n\renable_switch\u0018\u0001 \u0002(\b\u0012(\n\bapp_type\u0018\u0002 \u0002(\u000e2\u000f.SA.SEIOSAppTagB\u0005\u0092?\u00028\u0010\u001a4\n\u0006SEList\u0012*\n\u0004list\u0018\u0001 \u0003(\u000b2\u0015.SA.SEIOSNotificationB\u0005\u0092?\u0002\u0018\u0004\"G\n\u0013SEQuickReplyMessage\u0012\u001b\n\fphone_number\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0013\n\u0004text\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\"T\n\fSEQuickReply\u0012\u0013\n\u0004text\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001a/\n\u0006SEList\u0012%\n\u0004list\u0018\u0001 \u0003(\u000b2\u0010.SA.SEQuickReplyB\u0005\u0092?\u0002\u0018\u0004\"\u009b\u0001\n\nSEContacts\u0012\u001c\n\rcontacts_name\u0018\u0001 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001e\n\u000fcontacts_number\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012 \n\u0011contacts_sequence\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\u001a-\n\u0006SEList\u0012#\n\u0004list\u0018\u0001 \u0003(\u000b2\u000e.SA.SEContactsB\u0005\u0092?\u0002\u0018\u0004\"\u0089\u0001\n\rSESOSContacts\u0012\u001b\n\u0013sos_contacts_switch\u0018\u0001 \u0002(\b\u00120\n\u0011sos_contacts_list\u0018\u0002 \u0002(\u000b2\u0015.SA.SEContacts.SEList\u0012)\n\u001amax_sos_contacts_all_count\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\"\u0088\u0001\n\u000eSEContactsCY_2\u0012!\n\u0012contacts_all_count\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\b\u0012,\n\rcontacts_list\u0018\u0002 \u0002(\u000b2\u0015.SA.SEContacts.SEList\u0012%\n\u0016max_contacts_all_count\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028\b\"ë\u0001\n\u0010SEContactsAvatar\u0012\u001c\n\rcontacts_name\u0018\u0001 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001e\n\u000fcontacts_number\u0018\u0002 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012 \n\u0011contacts_sequence\u0018\u0003 \u0001(\rB\u0005\u0092?\u00028 \u0012#\n\u0014contacts_avatar_name\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001d\n\u0015contacts_avatar_exist\u0018\u0005 \u0001(\b\u001a3\n\u0006SEList\u0012)\n\u0004list\u0018\u0001 \u0003(\u000b2\u0014.SA.SEContactsAvatarB\u0005\u0092?\u0002\u0018\u0004\"È\u0001\n\u0014SEContactsAvatarData\u0012\u001b\n\favatar_hight\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u001b\n\favatar_width\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u001a\n\u000bavatar_rule\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028\b\u0012\u001f\n\u0010max_avatar_count\u0018\u0004 \u0002(\rB\u0005\u0092?\u00028\b\u00129\n\u0014contacts_avatar_list\u0018\u0005 \u0002(\u000b2\u001b.SA.SEContactsAvatar.SEList\"\u0093\u0001\n\u0014SEGlodFriendContacts\u0012!\n\u0012call_contacts_name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u001f\n\u0010call_contacts_id\u0018\u0002 \u0001(\rB\u0005\u0092?\u00028 \u001a7\n\u0006SEList\u0012-\n\u0004list\u0018\u0001 \u0003(\u000b2\u0018.SA.SEGlodFriendContactsB\u0005\u0092?\u0002\u0018\u0004\"¾\u0001\n\u0011SEGlodFriendEmoji\u0012!\n\u0012call_contacts_name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0014\n\u0005emoji\u0018\u0002 \u0002(\rB\u0005\u0092?\u00028\u0010\u0012\u0014\n\u0005color\u0018\u0003 \u0002(\rB\u0005\u0092?\u00028 \u0012\u0018\n\u0004time\u0018\u0004 \u0002(\u000b2\n.SA.SETime\u0012\u001f\n\u0010FriendEmojiState\u0018\u0005 \u0001(\rB\u0005\u0092?\u00028\b\u0012\u001f\n\u0010call_contacts_id\u0018\u0006 \u0001(\rB\u0005\u0092?\u00028 \"·\u0001\n\rSEContactInfo\u0012\u0013\n\u0004name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0015\n\u0006number\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u001az\n\u0004List\u0012&\n\u0004list\u0018\u0001 \u0003(\u000b2\u0011.SA.SEContactInfoB\u0005\u0092?\u0002\u0018\u0004\u0012\u001a\n\u0012support_max_number\u0018\u0004 \u0001(\r\u0012\u0017\n\u000fcurrent_segment\u0018\u0002 \u0001(\r\u0012\u0015\n\rtotal_segment\u0018\u0003 \u0001(\r\"n\n\u0010SEAppRemoveNotif\u0012;\n\u0016open_in_phone_key_list\u0018\u0001 \u0002(\u000b2\u001b.SA.SEAppRemoveNotif.SEList\u001a\u001d\n\u0006SEList\u0012\u0013\n\u0004list\u0018\u0001 \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\"s\n\u0014SENotificationString\u0012<\n\u0013notification_string\u0018\u0001 \u0002(\u000b2\u001f.SA.SENotificationString.SEList\u001a\u001d\n\u0006SEList\u0012\u0013\n\u0004list\u0018\u0001 \u0003(\tB\u0005\u0092?\u0002\u0018\u0004\"°\u0001\n\u0016SEAppSuperNotification\u0012 \n\u0011notification_type\u0018\u0001 \u0002(\rB\u0005\u0092?\u00028 \u0012\u0017\n\bapp_name\u0018\u0002 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012\u0018\n\tpage_name\u0018\u0003 \u0002(\tB\u0005\u0092?\u0002\u0018\u0004\u0012A\n\u0018notification_string_list\u0018\u0004 \u0002(\u000b2\u001f.SA.SENotificationString.SEList*¨\b\n\u001dSENotification_NotificationID\u0012\u001d\n\u0019SET_IOS_NOTIFICATION_LIST\u0010\u0000\u0012\u001d\n\u0019GET_IOS_NOTIFICATION_LIST\u0010\u0001\u0012\u001c\n\u0018SEND_SYSTEM_NOTIFICATION\u0010\u0002\u0012\u0019\n\u0015SEND_APP_NOTIFICATION\u0010\u0003\u0012\u0013\n\u000fSEND_CALL_STATE\u0010\u0004\u0012\u0018\n\u0014GET_QUICK_REPLY_LIST\u0010\u0005\u0012\u0018\n\u0014SET_QUICK_REPLY_LIST\u0010\u0006\u0012\u001c\n\u0018SEND_QUICK_REPLY_MESSAGE\u0010\u0007\u0012\u0015\n\u0011GET_CONTACTS_LIST\u0010\b\u0012\u0015\n\u0011SET_CONTACTS_LIST\u0010\t\u0012 \n\u001cGET_COLLECTION_CONTACTS_LIST\u0010\n\u0012 \n\u001cSET_COLLECTION_CONTACTS_LIST\u0010\u000b\u0012\u0014\n\u0010GET_SOS_CONTACTS\u0010\f\u0012\u0014\n\u0010SET_SOS_CONTACTS\u0010\r\u0012\u001a\n\u0016GET_CONTACTS_CY_2_LIST\u0010\u000e\u0012\u001a\n\u0016SET_CONTACTS_CY_2_LIST\u0010\u000f\u0012\u001c\n\u0018REQUEST_GET_SOS_CONTACTS\u0010\u0010\u0012%\n!REQUEST_SOS_CONTACTS_MESSAGE_SEND\u0010\u0011\u0012\u001c\n\u0018GET_CONTACTS_AVATAR_DATA\u0010\u0012\u0012\u001c\n\u0018SET_CONTACTS_AVATAR_DATA\u0010\u0013\u0012\u001d\n\u0019GET_DONT_HAVE_AVATAR_LIST\u0010\u0014\u0012\u001c\n\u0018GET_GLOD_FRIEND_CONTACTS\u0010\u0015\u0012\u001c\n\u0018SET_GLOD_FRIEND_CONTACTS\u0010\u0016\u0012\u001d\n\u0019REQUEST_GLOD_FRIEND_EMOJI\u0010\u0017\u0012\u001a\n\u0016SEND_GLOD_FRIEND_EMOJI\u0010\u0018\u0012\"\n\u001eSEND_GLOD_FRIEND_EMOJI_REQUEST\u0010\u0019\u0012\u0015\n\u0011SEND_CONTACT_INFO\u0010 \u0012\u0016\n\u0012QUERY_CONTACT_INFO\u0010!\u0012\u001f\n\u001bDEVICE_SEND_APP_OPEN_NOTIFY\u0010\"\u0012$\n APP_CONTROL_DEVICE_REMOVE_NOTIFY\u0010#\u0012!\n\u001dGET_WHATSAPP_QUICK_REPLY_LIST\u0010$\u0012!\n\u001dSET_WHATSAPP_QUICK_REPLY_LIST\u0010%\u0012%\n!SEND_WHATSAPP_QUICK_REPLY_MESSAGE\u0010&\u0012\u001b\n\u0017SEND_SUPER_NOTIFICATION\u0010'\u0012\u0018\n\u0014REQUEST_SOS_CONTACTS\u0010(*9\n\u000bSECallState\u0012\u0010\n\fANSWER_PHONE\u0010\u0000\u0012\u000e\n\nHANG_PHONE\u0010\u0001\u0012\b\n\u0004MUTE\u0010\u0002*î\b\n\u000bSEIOSAppTag\u0012\f\n\bAPP_MAIN\u0010\u0000\u0012\f\n\bAPP_CALL\u0010\u0001\u0012\u0011\n\rAPP_MISS_CALL\u0010\u0002\u0012\u000b\n\u0007APP_SMS\u0010\u0003\u0012\n\n\u0006APP_QQ\u0010\u0004\u0012\u000e\n\nAPP_WECHAT\u0010\u0005\u0012\r\n\tAPP_SKYPE\u0010\u0006\u0012\u0010\n\fAPP_WHATSAPP\u0010\u0007\u0012\u0010\n\fAPP_FACEBOOK\u0010\b\u0012\u0011\n\rAPP_MESSENGER\u0010\t\u0012\u0010\n\fAPP_LINKEDLN\u0010\u0010\u0012\u000f\n\u000bAPP_TWITTER\u0010\u0011\u0012\r\n\tAPP_VIBER\u0010\u0012\u0012\f\n\bAPP_LINE\u0010\u0013\u0012\r\n\tAPP_GMAIL\u0010\u0014\u0012\u000f\n\u000bAPP_OUTLOOK\u0010\u0015\u0012\u0011\n\rAPP_INSTAGRAM\u0010\u0016\u0012\u0010\n\fAPP_SNAPCHAT\u0010\u0017\u0012\f\n\bAPP_MAIL\u0010\u0018\u0012\u0010\n\fAPP_CALENDAR\u0010\u0019\u0012\f\n\bAPP_ZALO\u0010 \u0012\u0010\n\fAPP_TELEGRAM\u0010!\u0012\u0011\n\rAPP_KAKAOTALK\u0010\"\u0012\n\n\u0006APP_VK\u0010#\u0012\n\n\u0006APP_OK\u0010$\u0012\u000b\n\u0007APP_ICQ\u0010%\u0012\u000f\n\u000bAPP_YOUTUBE\u0010'\u0012\u0011\n\rAPP_PINTEREST\u0010(\u0012\u000f\n\u000bAPP_HANGOUT\u0010)\u0012\u000f\n\u000bAPP_PHONRPE\u00100\u0012\u0013\n\u000fAPP_GOOGLE_PLAY\u00101\u0012\r\n\tAPP_PAYTM\u00102\u0012\u000e\n\nAPP_NAUKRI\u00103\u0012\u000e\n\nAPP_INSHOT\u00104\u0012\u0013\n\u000fAPP_GOOGLE_NEWS\u00105\u0012\u000b\n\u0007APP_OLA\u00106\u0012\f\n\bAPP_UBER\u00107\u0012\u0010\n\fAPP_FLIPKART\u00108\u0012\u000e\n\nAPP_AMAZON\u00109\u0012\u0019\n\u0015APP_WHATSAPP_BUSINESS\u0010@\u0012\u0010\n\fAPP_NOISEFIT\u0010A\u0012\u0018\n\u0014APP_GOOGLE_CLASSROOM\u0010B\u0012\u000e\n\nAPP_TIKTOK\u0010C\u0012\u000f\n\u000bAPP_TEXTNOW\u0010D\u0012\u000f\n\u000bAPP_DISCORD\u0010E\u0012\u0015\n\u0011APP_AIRTEL_THANKS\u0010F\u0012\u0013\n\u000fAPP_TVS_CONNECT\u0010G\u0012\f\n\bAPP_KITE\u0010H\u0012\r\n\tAPP_GROWW\u0010I\u0012\u0013\n\u000fAPP_GOOGLE_CHAT\u0010P\u0012\u0011\n\rAPP_BIGBASKET\u0010Q\u0012\u0012\n\u000eAPP_BOOKMYSHOW\u0010R\u0012\u0017\n\u0013APP_ZOMATO_DISTRICT\u0010S\u0012\u000f\n\u000bAPP_NETFLIX\u0010T\u0012\u0012\n\u000eAPP_JIOHOTSTAR\u0010U\u0012\u000f\n\u000bAPP_SPOTIFY\u0010V\u0012\u0010\n\fAPP_JIOSAAVN\u0010W\u0012\u000e\n\nAPP_MEESHO\u0010X\u0012\f\n\bAPP_CRED\u0010Y\u0012\u0012\n\u000eAPP_MAKEMYTRIP\u0010`\u0012\u0017\n\u0013APP_MICROSOFT_TEAMS\u0010a\u0012\u0018\n\u0014APP_OUTLOOK_CALENDAR\u0010b\u0012\u0014\n\u0010APP_IOS_CALENDAR\u0010c\u0012\u000e\n\tAPP_OTHER\u0010ÿ\u0001B8\n\u001bcom.zh.ble.sa_wear.protobufB\u0012NotificationProtos¢\u0002\u0004ZHSA"}, new Descriptors.FileDescriptor[]{SaNanopb.getDescriptor(), CommonProtos.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor messageType = getDescriptor().getMessageType(0);
        internal_static_SA_SENotification_descriptor = messageType;
        internal_static_SA_SENotification_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType, new String[]{"SystemNotification", "AppNotification", "IosNotificationList", "CallState", "QuickReplyList", "QuickReplyMessage", "ContactsList", "CollectionContactsList", "SosContacts", "ContactsCy2", "ContactAvatarData", "ContactsAvatarList", "GlodFriendContacts", "GlodFriendEmoji", "ContactInfo", UrlTemplate.f27967e, "OpenInPhoneKey", "RemoveNotif", "AppSuperNotification", "Payload"});
        Descriptors.Descriptor messageType2 = getDescriptor().getMessageType(1);
        internal_static_SA_SESystemNotification_descriptor = messageType2;
        internal_static_SA_SESystemNotification_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType2, new String[]{"Type", "PhoneNumber", "ContactsInfo", "MessageText", "AppName", "Key", "SupportOpen"});
        Descriptors.Descriptor messageType3 = getDescriptor().getMessageType(2);
        internal_static_SA_SEAppNotification_descriptor = messageType3;
        internal_static_SA_SEAppNotification_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType3, new String[]{"AppName", "PageName", "Title", "Text", "TickerText", "Key", "SupportOpen"});
        Descriptors.Descriptor messageType4 = getDescriptor().getMessageType(3);
        internal_static_SA_SEIOSNotification_descriptor = messageType4;
        internal_static_SA_SEIOSNotification_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType4, new String[]{"EnableSwitch", "AppType"});
        Descriptors.Descriptor nestedType = messageType4.getNestedType(0);
        internal_static_SA_SEIOSNotification_SEList_descriptor = nestedType;
        internal_static_SA_SEIOSNotification_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType5 = getDescriptor().getMessageType(4);
        internal_static_SA_SEQuickReplyMessage_descriptor = messageType5;
        internal_static_SA_SEQuickReplyMessage_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType5, new String[]{"PhoneNumber", "Text"});
        Descriptors.Descriptor messageType6 = getDescriptor().getMessageType(5);
        internal_static_SA_SEQuickReply_descriptor = messageType6;
        internal_static_SA_SEQuickReply_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType6, new String[]{"Text"});
        Descriptors.Descriptor nestedType2 = messageType6.getNestedType(0);
        internal_static_SA_SEQuickReply_SEList_descriptor = nestedType2;
        internal_static_SA_SEQuickReply_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType2, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType7 = getDescriptor().getMessageType(6);
        internal_static_SA_SEContacts_descriptor = messageType7;
        internal_static_SA_SEContacts_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType7, new String[]{"ContactsName", "ContactsNumber", "ContactsSequence"});
        Descriptors.Descriptor nestedType3 = messageType7.getNestedType(0);
        internal_static_SA_SEContacts_SEList_descriptor = nestedType3;
        internal_static_SA_SEContacts_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType3, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType8 = getDescriptor().getMessageType(7);
        internal_static_SA_SESOSContacts_descriptor = messageType8;
        internal_static_SA_SESOSContacts_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType8, new String[]{"SosContactsSwitch", "SosContactsList", "MaxSosContactsAllCount"});
        Descriptors.Descriptor messageType9 = getDescriptor().getMessageType(8);
        internal_static_SA_SEContactsCY_2_descriptor = messageType9;
        internal_static_SA_SEContactsCY_2_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType9, new String[]{"ContactsAllCount", "ContactsList", "MaxContactsAllCount"});
        Descriptors.Descriptor messageType10 = getDescriptor().getMessageType(9);
        internal_static_SA_SEContactsAvatar_descriptor = messageType10;
        internal_static_SA_SEContactsAvatar_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType10, new String[]{"ContactsName", "ContactsNumber", "ContactsSequence", "ContactsAvatarName", "ContactsAvatarExist"});
        Descriptors.Descriptor nestedType4 = messageType10.getNestedType(0);
        internal_static_SA_SEContactsAvatar_SEList_descriptor = nestedType4;
        internal_static_SA_SEContactsAvatar_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType4, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType11 = getDescriptor().getMessageType(10);
        internal_static_SA_SEContactsAvatarData_descriptor = messageType11;
        internal_static_SA_SEContactsAvatarData_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType11, new String[]{"AvatarHight", "AvatarWidth", "AvatarRule", "MaxAvatarCount", "ContactsAvatarList"});
        Descriptors.Descriptor messageType12 = getDescriptor().getMessageType(11);
        internal_static_SA_SEGlodFriendContacts_descriptor = messageType12;
        internal_static_SA_SEGlodFriendContacts_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType12, new String[]{"CallContactsName", "CallContactsId"});
        Descriptors.Descriptor nestedType5 = messageType12.getNestedType(0);
        internal_static_SA_SEGlodFriendContacts_SEList_descriptor = nestedType5;
        internal_static_SA_SEGlodFriendContacts_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType5, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType13 = getDescriptor().getMessageType(12);
        internal_static_SA_SEGlodFriendEmoji_descriptor = messageType13;
        internal_static_SA_SEGlodFriendEmoji_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType13, new String[]{"CallContactsName", "Emoji", "Color", UrlTemplate.f27969g, "FriendEmojiState", "CallContactsId"});
        Descriptors.Descriptor messageType14 = getDescriptor().getMessageType(13);
        internal_static_SA_SEContactInfo_descriptor = messageType14;
        internal_static_SA_SEContactInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType14, new String[]{"Name", UrlTemplate.f27967e});
        Descriptors.Descriptor nestedType6 = messageType14.getNestedType(0);
        internal_static_SA_SEContactInfo_List_descriptor = nestedType6;
        internal_static_SA_SEContactInfo_List_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType6, new String[]{MessageLiteToString.f20028a, "SupportMaxNumber", "CurrentSegment", "TotalSegment"});
        Descriptors.Descriptor messageType15 = getDescriptor().getMessageType(14);
        internal_static_SA_SEAppRemoveNotif_descriptor = messageType15;
        internal_static_SA_SEAppRemoveNotif_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType15, new String[]{"OpenInPhoneKeyList"});
        Descriptors.Descriptor nestedType7 = messageType15.getNestedType(0);
        internal_static_SA_SEAppRemoveNotif_SEList_descriptor = nestedType7;
        internal_static_SA_SEAppRemoveNotif_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType7, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType16 = getDescriptor().getMessageType(15);
        internal_static_SA_SENotificationString_descriptor = messageType16;
        internal_static_SA_SENotificationString_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType16, new String[]{"NotificationString"});
        Descriptors.Descriptor nestedType8 = messageType16.getNestedType(0);
        internal_static_SA_SENotificationString_SEList_descriptor = nestedType8;
        internal_static_SA_SENotificationString_SEList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(nestedType8, new String[]{MessageLiteToString.f20028a});
        Descriptors.Descriptor messageType17 = getDescriptor().getMessageType(16);
        internal_static_SA_SEAppSuperNotification_descriptor = messageType17;
        internal_static_SA_SEAppSuperNotification_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(messageType17, new String[]{MainActivity.f129179b0, "AppName", "PageName", "NotificationStringList"});
        fileDescriptorInternalBuildGeneratedFileFrom.resolveAllFeaturesImmutable();
        SaNanopb.getDescriptor();
        CommonProtos.getDescriptor();
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        GeneratedFile.addOptionalExtension(extensionRegistryNewInstance, "com.zh.ble.wear.protobuf.Nanopb", "nanopb");
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
    }

    private NotificationProtos() {
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