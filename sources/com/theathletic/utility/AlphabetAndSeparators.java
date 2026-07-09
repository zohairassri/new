package com.theathletic.utility;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.utility.d, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/theathletic/utility/d;", "", "", "alphabet", "separators", "guards", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.SUBDOMAIN, "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class AlphabetAndSeparators {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String alphabet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String separators;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String guards;

    public AlphabetAndSeparators(String alphabet, String separators, String guards) {
        Intrinsics.checkNotNullParameter(alphabet, "alphabet");
        Intrinsics.checkNotNullParameter(separators, "separators");
        Intrinsics.checkNotNullParameter(guards, "guards");
        this.alphabet = alphabet;
        this.separators = separators;
        this.guards = guards;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlphabet() {
        return this.alphabet;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSeparators() {
        return this.separators;
    }

    public final String c() {
        return this.alphabet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGuards() {
        return this.guards;
    }

    public final String e() {
        return this.separators;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphabetAndSeparators)) {
            return false;
        }
        AlphabetAndSeparators alphabetAndSeparators = (AlphabetAndSeparators) other;
        return Intrinsics.areEqual(this.alphabet, alphabetAndSeparators.alphabet) && Intrinsics.areEqual(this.separators, alphabetAndSeparators.separators) && Intrinsics.areEqual(this.guards, alphabetAndSeparators.guards);
    }

    public int hashCode() {
        return (((this.alphabet.hashCode() * 31) + this.separators.hashCode()) * 31) + this.guards.hashCode();
    }

    public String toString() {
        return "AlphabetAndSeparators(alphabet=" + this.alphabet + ", separators=" + this.separators + ", guards=" + this.guards + ")";
    }

    public /* synthetic */ AlphabetAndSeparators(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? "" : str3);
    }
}
