package com.theathletic.rooms.create.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.rooms.create.ui.n, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b!\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b$\u0010\u0019R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b(\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b\u001d\u0010,R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b-\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b)\u0010 R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b.\u0010 R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b'\u0010 R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b/\u0010 R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b0\u0010 ¨\u00061"}, d2 = {"Lcom/theathletic/rooms/create/ui/n;", "", "", "isEditing", "", "titleInput", "", "titleMaxLength", "descriptionInput", "descriptionMaxLength", "", "topicTags", "hosts", "categories", "selfAsHost", "record", "sendAutoPush", "disableChat", "submitButtonEnabled", "isCreatingRoom", "<init>", "(ZLjava/lang/String;ILjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;ZZZZZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, QueryKeys.IS_NEW_USER, "()Z", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", QueryKeys.DECAY, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.IDLING, "k", QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.VISIT_FREQUENCY, "Ljava/util/List;", "l", "()Ljava/util/List;", QueryKeys.ACCOUNT_ID, QueryKeys.HOST, QueryKeys.VIEW_TITLE, QueryKeys.MAX_SCROLL_DEPTH, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateLiveRoomUi {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f78042o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEditing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleInput;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int titleMaxLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String descriptionInput;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int descriptionMaxLength;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List topicTags;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List hosts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List categories;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean selfAsHost;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean record;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sendAutoPush;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean disableChat;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean submitButtonEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCreatingRoom;

    /* JADX INFO: renamed from: com.theathletic.rooms.create.ui.n$a */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH&¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0004¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/theathletic/rooms/create/ui/n$a;", "", "", "O0", "()V", "", "title", "P0", "(Ljava/lang/String;)V", "description", "k0", "a1", QueryKeys.FORCE_DECAY, "G", "", "recordingOn", "V0", "(Z)V", "autoPushOn", "u0", "userIsHost", QueryKeys.SDK_VERSION, "disableChat", "F", "X0", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void D();

        void F(boolean disableChat);

        void G();

        void O0();

        void P0(String title);

        void V(boolean userIsHost);

        void V0(boolean recordingOn);

        void X0();

        void a1();

        void k0(String description);

        void u0(boolean autoPushOn);
    }

    public CreateLiveRoomUi(boolean z11, String titleInput, int i11, String descriptionInput, int i12, List topicTags, List hosts, List categories, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        Intrinsics.checkNotNullParameter(titleInput, "titleInput");
        Intrinsics.checkNotNullParameter(descriptionInput, "descriptionInput");
        Intrinsics.checkNotNullParameter(topicTags, "topicTags");
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.isEditing = z11;
        this.titleInput = titleInput;
        this.titleMaxLength = i11;
        this.descriptionInput = descriptionInput;
        this.descriptionMaxLength = i12;
        this.topicTags = topicTags;
        this.hosts = hosts;
        this.categories = categories;
        this.selfAsHost = z12;
        this.record = z13;
        this.sendAutoPush = z14;
        this.disableChat = z15;
        this.submitButtonEnabled = z16;
        this.isCreatingRoom = z17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescriptionInput() {
        return this.descriptionInput;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDescriptionMaxLength() {
        return this.descriptionMaxLength;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDisableChat() {
        return this.disableChat;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getHosts() {
        return this.hosts;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateLiveRoomUi)) {
            return false;
        }
        CreateLiveRoomUi createLiveRoomUi = (CreateLiveRoomUi) other;
        return this.isEditing == createLiveRoomUi.isEditing && Intrinsics.areEqual(this.titleInput, createLiveRoomUi.titleInput) && this.titleMaxLength == createLiveRoomUi.titleMaxLength && Intrinsics.areEqual(this.descriptionInput, createLiveRoomUi.descriptionInput) && this.descriptionMaxLength == createLiveRoomUi.descriptionMaxLength && Intrinsics.areEqual(this.topicTags, createLiveRoomUi.topicTags) && Intrinsics.areEqual(this.hosts, createLiveRoomUi.hosts) && Intrinsics.areEqual(this.categories, createLiveRoomUi.categories) && this.selfAsHost == createLiveRoomUi.selfAsHost && this.record == createLiveRoomUi.record && this.sendAutoPush == createLiveRoomUi.sendAutoPush && this.disableChat == createLiveRoomUi.disableChat && this.submitButtonEnabled == createLiveRoomUi.submitButtonEnabled && this.isCreatingRoom == createLiveRoomUi.isCreatingRoom;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRecord() {
        return this.record;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getSelfAsHost() {
        return this.selfAsHost;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSendAutoPush() {
        return this.sendAutoPush;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Boolean.hashCode(this.isEditing) * 31) + this.titleInput.hashCode()) * 31) + Integer.hashCode(this.titleMaxLength)) * 31) + this.descriptionInput.hashCode()) * 31) + Integer.hashCode(this.descriptionMaxLength)) * 31) + this.topicTags.hashCode()) * 31) + this.hosts.hashCode()) * 31) + this.categories.hashCode()) * 31) + Boolean.hashCode(this.selfAsHost)) * 31) + Boolean.hashCode(this.record)) * 31) + Boolean.hashCode(this.sendAutoPush)) * 31) + Boolean.hashCode(this.disableChat)) * 31) + Boolean.hashCode(this.submitButtonEnabled)) * 31) + Boolean.hashCode(this.isCreatingRoom);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getSubmitButtonEnabled() {
        return this.submitButtonEnabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitleInput() {
        return this.titleInput;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getTitleMaxLength() {
        return this.titleMaxLength;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getTopicTags() {
        return this.topicTags;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsCreatingRoom() {
        return this.isCreatingRoom;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    public String toString() {
        return "CreateLiveRoomUi(isEditing=" + this.isEditing + ", titleInput=" + this.titleInput + ", titleMaxLength=" + this.titleMaxLength + ", descriptionInput=" + this.descriptionInput + ", descriptionMaxLength=" + this.descriptionMaxLength + ", topicTags=" + this.topicTags + ", hosts=" + this.hosts + ", categories=" + this.categories + ", selfAsHost=" + this.selfAsHost + ", record=" + this.record + ", sendAutoPush=" + this.sendAutoPush + ", disableChat=" + this.disableChat + ", submitButtonEnabled=" + this.submitButtonEnabled + ", isCreatingRoom=" + this.isCreatingRoom + ")";
    }
}
