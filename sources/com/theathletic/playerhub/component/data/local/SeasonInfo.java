package com.theathletic.playerhub.component.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/theathletic/playerhub/component/data/local/SeasonInfo;", "", "name", "", "type", "active", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getType", "getActive", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SeasonInfo {
    private final boolean active;

    @NotNull
    private final String name;
    private final String type;

    public SeasonInfo(@NotNull String name, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.type = str;
        this.active = z11;
    }

    public static /* synthetic */ SeasonInfo copy$default(SeasonInfo seasonInfo, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = seasonInfo.name;
        }
        if ((i11 & 2) != 0) {
            str2 = seasonInfo.type;
        }
        if ((i11 & 4) != 0) {
            z11 = seasonInfo.active;
        }
        return seasonInfo.copy(str, str2, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    @NotNull
    public final SeasonInfo copy(@NotNull String name, String type, boolean active) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new SeasonInfo(name, type, active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonInfo)) {
            return false;
        }
        SeasonInfo seasonInfo = (SeasonInfo) other;
        return Intrinsics.areEqual(this.name, seasonInfo.name) && Intrinsics.areEqual(this.type, seasonInfo.type) && this.active == seasonInfo.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.type;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.active);
    }

    @NotNull
    public String toString() {
        return "SeasonInfo(name=" + this.name + ", type=" + this.type + ", active=" + this.active + ")";
    }
}
