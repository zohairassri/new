package c60;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p20.d;

/* JADX INFO: renamed from: c60.a, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0014B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lc60/a;", "", "", "id", "firstname", "lastname", "name", "Lc60/a$b;", "staffInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc60/a$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Lc60/a$b;", "()Lc60/a$b;", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LiveAudioRoomUserDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final StaffInfo staffInfo;

    /* JADX INFO: renamed from: c60.a$a, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lc60/a$a;", "", "Lp20/d$a;", "followableId", "", "name", "imageUrl", "<init>", "(Lp20/d$a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp20/d$a;", "()Lp20/d$a;", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FollowableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d.a followableId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String imageUrl;

        public FollowableItem(d.a followableId, String name, String imageUrl) {
            Intrinsics.checkNotNullParameter(followableId, "followableId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.followableId = followableId;
            this.name = name;
            this.imageUrl = imageUrl;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d.a getFollowableId() {
            return this.followableId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FollowableItem)) {
                return false;
            }
            FollowableItem followableItem = (FollowableItem) other;
            return Intrinsics.areEqual(this.followableId, followableItem.followableId) && Intrinsics.areEqual(this.name, followableItem.name) && Intrinsics.areEqual(this.imageUrl, followableItem.imageUrl);
        }

        public int hashCode() {
            return (((this.followableId.hashCode() * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode();
        }

        public String toString() {
            return "FollowableItem(followableId=" + this.followableId + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ")";
        }
    }

    /* JADX INFO: renamed from: c60.a$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lc60/a$b;", "", "", "bio", "imageUrl", "twitterHandle", "description", "", "verified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.MEMFLY_API_VERSION, "()Z", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StaffInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String bio;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String imageUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String twitterHandle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean verified;

        public StaffInfo(String bio, String str, String twitterHandle, String description, boolean z11) {
            Intrinsics.checkNotNullParameter(bio, "bio");
            Intrinsics.checkNotNullParameter(twitterHandle, "twitterHandle");
            Intrinsics.checkNotNullParameter(description, "description");
            this.bio = bio;
            this.imageUrl = str;
            this.twitterHandle = twitterHandle;
            this.description = description;
            this.verified = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBio() {
            return this.bio;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTwitterHandle() {
            return this.twitterHandle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getVerified() {
            return this.verified;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StaffInfo)) {
                return false;
            }
            StaffInfo staffInfo = (StaffInfo) other;
            return Intrinsics.areEqual(this.bio, staffInfo.bio) && Intrinsics.areEqual(this.imageUrl, staffInfo.imageUrl) && Intrinsics.areEqual(this.twitterHandle, staffInfo.twitterHandle) && Intrinsics.areEqual(this.description, staffInfo.description) && this.verified == staffInfo.verified;
        }

        public int hashCode() {
            int iHashCode = this.bio.hashCode() * 31;
            String str = this.imageUrl;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.twitterHandle.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.verified);
        }

        public String toString() {
            return "StaffInfo(bio=" + this.bio + ", imageUrl=" + this.imageUrl + ", twitterHandle=" + this.twitterHandle + ", description=" + this.description + ", verified=" + this.verified + ")";
        }
    }

    public LiveAudioRoomUserDetails(String id2, String firstname, String lastname, String name, StaffInfo staffInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(firstname, "firstname");
        Intrinsics.checkNotNullParameter(lastname, "lastname");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id2;
        this.firstname = firstname;
        this.lastname = lastname;
        this.name = name;
        this.staffInfo = staffInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFirstname() {
        return this.firstname;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLastname() {
        return this.lastname;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final StaffInfo getStaffInfo() {
        return this.staffInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveAudioRoomUserDetails)) {
            return false;
        }
        LiveAudioRoomUserDetails liveAudioRoomUserDetails = (LiveAudioRoomUserDetails) other;
        return Intrinsics.areEqual(this.id, liveAudioRoomUserDetails.id) && Intrinsics.areEqual(this.firstname, liveAudioRoomUserDetails.firstname) && Intrinsics.areEqual(this.lastname, liveAudioRoomUserDetails.lastname) && Intrinsics.areEqual(this.name, liveAudioRoomUserDetails.name) && Intrinsics.areEqual(this.staffInfo, liveAudioRoomUserDetails.staffInfo);
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.firstname.hashCode()) * 31) + this.lastname.hashCode()) * 31) + this.name.hashCode()) * 31;
        StaffInfo staffInfo = this.staffInfo;
        return iHashCode + (staffInfo == null ? 0 : staffInfo.hashCode());
    }

    public String toString() {
        return "LiveAudioRoomUserDetails(id=" + this.id + ", firstname=" + this.firstname + ", lastname=" + this.lastname + ", name=" + this.name + ", staffInfo=" + this.staffInfo + ")";
    }
}
