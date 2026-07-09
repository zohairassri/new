package com.theathletic.profile.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JY\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013¨\u0006!"}, d2 = {"Lcom/theathletic/profile/component/data/ManageAccountUser;", "", "firstName", "", "lastName", "email", "avatarUrl", "nickname", "isFbLinked", "", "isUserSubscribed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getEmail", "getAvatarUrl", "getNickname", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManageAccountUser {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String email;
    private final String firstName;
    private final boolean isFbLinked;
    private final boolean isUserSubscribed;
    private final String lastName;
    private final String nickname;

    public ManageAccountUser(String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12) {
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.avatarUrl = str4;
        this.nickname = str5;
        this.isFbLinked = z11;
        this.isUserSubscribed = z12;
    }

    public static /* synthetic */ ManageAccountUser copy$default(ManageAccountUser manageAccountUser, String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = manageAccountUser.firstName;
        }
        if ((i11 & 2) != 0) {
            str2 = manageAccountUser.lastName;
        }
        if ((i11 & 4) != 0) {
            str3 = manageAccountUser.email;
        }
        if ((i11 & 8) != 0) {
            str4 = manageAccountUser.avatarUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = manageAccountUser.nickname;
        }
        if ((i11 & 32) != 0) {
            z11 = manageAccountUser.isFbLinked;
        }
        if ((i11 & 64) != 0) {
            z12 = manageAccountUser.isUserSubscribed;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        String str6 = str5;
        String str7 = str3;
        return manageAccountUser.copy(str, str2, str7, str4, str6, z13, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsFbLinked() {
        return this.isFbLinked;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsUserSubscribed() {
        return this.isUserSubscribed;
    }

    @NotNull
    public final ManageAccountUser copy(String firstName, String lastName, String email, String avatarUrl, String nickname, boolean isFbLinked, boolean isUserSubscribed) {
        return new ManageAccountUser(firstName, lastName, email, avatarUrl, nickname, isFbLinked, isUserSubscribed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManageAccountUser)) {
            return false;
        }
        ManageAccountUser manageAccountUser = (ManageAccountUser) other;
        return Intrinsics.areEqual(this.firstName, manageAccountUser.firstName) && Intrinsics.areEqual(this.lastName, manageAccountUser.lastName) && Intrinsics.areEqual(this.email, manageAccountUser.email) && Intrinsics.areEqual(this.avatarUrl, manageAccountUser.avatarUrl) && Intrinsics.areEqual(this.nickname, manageAccountUser.nickname) && this.isFbLinked == manageAccountUser.isFbLinked && this.isUserSubscribed == manageAccountUser.isUserSubscribed;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatarUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nickname;
        return ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFbLinked)) * 31) + Boolean.hashCode(this.isUserSubscribed);
    }

    public final boolean isFbLinked() {
        return this.isFbLinked;
    }

    public final boolean isUserSubscribed() {
        return this.isUserSubscribed;
    }

    @NotNull
    public String toString() {
        return "ManageAccountUser(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", avatarUrl=" + this.avatarUrl + ", nickname=" + this.nickname + ", isFbLinked=" + this.isFbLinked + ", isUserSubscribed=" + this.isUserSubscribed + ")";
    }
}
