package com.theathletic.brackets.component.bffbrackets.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/theathletic/brackets/component/bffbrackets/data/model/UserPickTeam;", "", "id", "", "icon", "name", "namePrefix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getIcon", "getName", "getNamePrefix", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserPickTeam {
    private final String icon;

    @NotNull
    private final String id;
    private final String name;
    private final String namePrefix;

    public UserPickTeam(@NotNull String id2, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.icon = str;
        this.name = str2;
        this.namePrefix = str3;
    }

    public static /* synthetic */ UserPickTeam copy$default(UserPickTeam userPickTeam, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userPickTeam.id;
        }
        if ((i11 & 2) != 0) {
            str2 = userPickTeam.icon;
        }
        if ((i11 & 4) != 0) {
            str3 = userPickTeam.name;
        }
        if ((i11 & 8) != 0) {
            str4 = userPickTeam.namePrefix;
        }
        return userPickTeam.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNamePrefix() {
        return this.namePrefix;
    }

    @NotNull
    public final UserPickTeam copy(@NotNull String id2, String icon, String name, String namePrefix) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new UserPickTeam(id2, icon, name, namePrefix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPickTeam)) {
            return false;
        }
        UserPickTeam userPickTeam = (UserPickTeam) other;
        return Intrinsics.areEqual(this.id, userPickTeam.id) && Intrinsics.areEqual(this.icon, userPickTeam.icon) && Intrinsics.areEqual(this.name, userPickTeam.name) && Intrinsics.areEqual(this.namePrefix, userPickTeam.namePrefix);
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNamePrefix() {
        return this.namePrefix;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.namePrefix;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserPickTeam(id=" + this.id + ", icon=" + this.icon + ", name=" + this.name + ", namePrefix=" + this.namePrefix + ")";
    }
}
