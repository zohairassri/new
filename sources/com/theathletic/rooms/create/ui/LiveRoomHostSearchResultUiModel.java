package com.theathletic.rooms.create.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.rooms.create.ui.v0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/theathletic/rooms/create/ui/v0;", "Lcom/theathletic/ui/d1;", "", "id", "name", "avatarUrl", "", "isChecked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, QueryKeys.MEMFLY_API_VERSION, "()Z", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "getStableId", "stableId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LiveRoomHostSearchResultUiModel implements com.theathletic.ui.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String avatarUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChecked;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String stableId;

    /* JADX INFO: renamed from: com.theathletic.rooms.create.ui.v0$a */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/theathletic/rooms/create/ui/v0$a;", "", "", "id", "", "B", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void B(String id2);
    }

    public LiveRoomHostSearchResultUiModel(String id2, String name, String avatarUrl, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.id = id2;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.isChecked = z11;
        this.stableId = "LiveRoomHostSearchItem:" + id2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveRoomHostSearchResultUiModel)) {
            return false;
        }
        LiveRoomHostSearchResultUiModel liveRoomHostSearchResultUiModel = (LiveRoomHostSearchResultUiModel) other;
        return Intrinsics.areEqual(this.id, liveRoomHostSearchResultUiModel.id) && Intrinsics.areEqual(this.name, liveRoomHostSearchResultUiModel.name) && Intrinsics.areEqual(this.avatarUrl, liveRoomHostSearchResultUiModel.avatarUrl) && this.isChecked == liveRoomHostSearchResultUiModel.isChecked;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
    }

    public String toString() {
        return "LiveRoomHostSearchResultUiModel(id=" + this.id + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", isChecked=" + this.isChecked + ")";
    }
}
