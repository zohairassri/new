package com.theathletic.utility;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.utility.u1, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/theathletic/utility/u1;", "", "", "", "alphabet", "", "salt", "", "cumulative", "saltReminder", "<init>", "(Ljava/util/List;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.IDLING, QueryKeys.SUBDOMAIN, "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class ShuffleData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List alphabet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String salt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cumulative;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int saltReminder;

    public ShuffleData(List alphabet, String salt, int i11, int i12) {
        Intrinsics.checkNotNullParameter(alphabet, "alphabet");
        Intrinsics.checkNotNullParameter(salt, "salt");
        this.alphabet = alphabet;
        this.salt = salt;
        this.cumulative = i11;
        this.saltReminder = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAlphabet() {
        return this.alphabet;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCumulative() {
        return this.cumulative;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSalt() {
        return this.salt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSaltReminder() {
        return this.saltReminder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShuffleData)) {
            return false;
        }
        ShuffleData shuffleData = (ShuffleData) other;
        return Intrinsics.areEqual(this.alphabet, shuffleData.alphabet) && Intrinsics.areEqual(this.salt, shuffleData.salt) && this.cumulative == shuffleData.cumulative && this.saltReminder == shuffleData.saltReminder;
    }

    public int hashCode() {
        return (((((this.alphabet.hashCode() * 31) + this.salt.hashCode()) * 31) + Integer.hashCode(this.cumulative)) * 31) + Integer.hashCode(this.saltReminder);
    }

    public String toString() {
        return "ShuffleData(alphabet=" + this.alphabet + ", salt=" + this.salt + ", cumulative=" + this.cumulative + ", saltReminder=" + this.saltReminder + ")";
    }
}
