package com.theathletic.pickem.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/theathletic/pickem/component/data/LeaderboardShareParams;", "", "userName", "", "userAccuracy", "", "benchmarkName", "benchmarkAccuracy", "benchmarkSlug", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getUserName", "()Ljava/lang/String;", "getUserAccuracy", "()I", "getBenchmarkName", "getBenchmarkAccuracy", "getBenchmarkSlug", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LeaderboardShareParams {
    private final int benchmarkAccuracy;

    @NotNull
    private final String benchmarkName;

    @NotNull
    private final String benchmarkSlug;
    private final int userAccuracy;

    @NotNull
    private final String userName;

    public LeaderboardShareParams(@NotNull String userName, int i11, @NotNull String benchmarkName, int i12, @NotNull String benchmarkSlug) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(benchmarkName, "benchmarkName");
        Intrinsics.checkNotNullParameter(benchmarkSlug, "benchmarkSlug");
        this.userName = userName;
        this.userAccuracy = i11;
        this.benchmarkName = benchmarkName;
        this.benchmarkAccuracy = i12;
        this.benchmarkSlug = benchmarkSlug;
    }

    public static /* synthetic */ LeaderboardShareParams copy$default(LeaderboardShareParams leaderboardShareParams, String str, int i11, String str2, int i12, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = leaderboardShareParams.userName;
        }
        if ((i13 & 2) != 0) {
            i11 = leaderboardShareParams.userAccuracy;
        }
        if ((i13 & 4) != 0) {
            str2 = leaderboardShareParams.benchmarkName;
        }
        if ((i13 & 8) != 0) {
            i12 = leaderboardShareParams.benchmarkAccuracy;
        }
        if ((i13 & 16) != 0) {
            str3 = leaderboardShareParams.benchmarkSlug;
        }
        String str4 = str3;
        String str5 = str2;
        return leaderboardShareParams.copy(str, i11, str5, i12, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserAccuracy() {
        return this.userAccuracy;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBenchmarkName() {
        return this.benchmarkName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBenchmarkAccuracy() {
        return this.benchmarkAccuracy;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBenchmarkSlug() {
        return this.benchmarkSlug;
    }

    @NotNull
    public final LeaderboardShareParams copy(@NotNull String userName, int userAccuracy, @NotNull String benchmarkName, int benchmarkAccuracy, @NotNull String benchmarkSlug) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(benchmarkName, "benchmarkName");
        Intrinsics.checkNotNullParameter(benchmarkSlug, "benchmarkSlug");
        return new LeaderboardShareParams(userName, userAccuracy, benchmarkName, benchmarkAccuracy, benchmarkSlug);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaderboardShareParams)) {
            return false;
        }
        LeaderboardShareParams leaderboardShareParams = (LeaderboardShareParams) other;
        return Intrinsics.areEqual(this.userName, leaderboardShareParams.userName) && this.userAccuracy == leaderboardShareParams.userAccuracy && Intrinsics.areEqual(this.benchmarkName, leaderboardShareParams.benchmarkName) && this.benchmarkAccuracy == leaderboardShareParams.benchmarkAccuracy && Intrinsics.areEqual(this.benchmarkSlug, leaderboardShareParams.benchmarkSlug);
    }

    public final int getBenchmarkAccuracy() {
        return this.benchmarkAccuracy;
    }

    @NotNull
    public final String getBenchmarkName() {
        return this.benchmarkName;
    }

    @NotNull
    public final String getBenchmarkSlug() {
        return this.benchmarkSlug;
    }

    public final int getUserAccuracy() {
        return this.userAccuracy;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((((this.userName.hashCode() * 31) + Integer.hashCode(this.userAccuracy)) * 31) + this.benchmarkName.hashCode()) * 31) + Integer.hashCode(this.benchmarkAccuracy)) * 31) + this.benchmarkSlug.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeaderboardShareParams(userName=" + this.userName + ", userAccuracy=" + this.userAccuracy + ", benchmarkName=" + this.benchmarkName + ", benchmarkAccuracy=" + this.benchmarkAccuracy + ", benchmarkSlug=" + this.benchmarkSlug + ")";
    }
}
