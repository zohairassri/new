package kw;

import com.amazonaws.event.ProgressEvent;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private final String advertisingId;
    private final String displayName;
    private final String email;
    private final String experimentationId;
    private final String familyName;
    private final String gamesAvatarIcon;
    private final String gamesUsername;
    private final String givenName;
    private final Boolean isEmailVerified;
    private final String name;
    private final String regiId;
    private final String username;

    public c() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final String a() {
        return this.email + " (" + this.regiId + ")";
    }

    public final String b() {
        return this.advertisingId;
    }

    public final String c() {
        return this.displayName;
    }

    public final String d() {
        return this.email;
    }

    public final String e() {
        return this.experimentationId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.regiId, cVar.regiId) && Intrinsics.areEqual(this.experimentationId, cVar.experimentationId) && Intrinsics.areEqual(this.advertisingId, cVar.advertisingId) && Intrinsics.areEqual(this.email, cVar.email) && Intrinsics.areEqual(this.isEmailVerified, cVar.isEmailVerified) && Intrinsics.areEqual(this.displayName, cVar.displayName) && Intrinsics.areEqual(this.name, cVar.name) && Intrinsics.areEqual(this.givenName, cVar.givenName) && Intrinsics.areEqual(this.familyName, cVar.familyName) && Intrinsics.areEqual(this.username, cVar.username) && Intrinsics.areEqual(this.gamesUsername, cVar.gamesUsername) && Intrinsics.areEqual(this.gamesAvatarIcon, cVar.gamesAvatarIcon);
    }

    public final String f() {
        return this.familyName;
    }

    public final String g() {
        return this.gamesAvatarIcon;
    }

    public final String h() {
        return this.gamesUsername;
    }

    public int hashCode() {
        String str = this.regiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.experimentationId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.advertisingId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isEmailVerified;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.displayName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.givenName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.familyName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.username;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.gamesUsername;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.gamesAvatarIcon;
        return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String i() {
        return this.givenName;
    }

    public final String j() {
        return this.name;
    }

    public final String k() {
        return this.regiId;
    }

    public final String l() {
        return this.username;
    }

    public final Boolean m() {
        return this.isEmailVerified;
    }

    public String toString() {
        return "UserAccount(regiId=" + this.regiId + ", experimentationId=" + this.experimentationId + ", advertisingId=" + this.advertisingId + ", email=" + this.email + ", isEmailVerified=" + this.isEmailVerified + ", displayName=" + this.displayName + ", name=" + this.name + ", givenName=" + this.givenName + ", familyName=" + this.familyName + ", username=" + this.username + ", gamesUsername=" + this.gamesUsername + ", gamesAvatarIcon=" + this.gamesAvatarIcon + ")";
    }

    public c(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.regiId = str;
        this.experimentationId = str2;
        this.advertisingId = str3;
        this.email = str4;
        this.isEmailVerified = bool;
        this.displayName = str5;
        this.name = str6;
        this.givenName = str7;
        this.familyName = str8;
        this.username = str9;
        this.gamesUsername = str10;
        this.gamesAvatarIcon = str11;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0 ? null : str9, (i11 & 1024) != 0 ? null : str10, (i11 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str11);
    }
}
