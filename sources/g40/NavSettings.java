package g40;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g40.e, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u0006 "}, d2 = {"Lg40/e;", "", "", "isUtilityBarSearchEnabled", "isUtilityBarAccountEnabled", "isUtilityBarNotificationsEnabled", "isPlayNavTabEnabled", "isWorldCupNavTabEnabled", "<init>", "(ZZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, QueryKeys.VISIT_FREQUENCY, "()Z", QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.HOST, "isDiscoverNavTabEnabled", QueryKeys.ACCOUNT_ID, "isUtilityBarVisible", "isAccountNavTabEnabled", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUtilityBarSearchEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUtilityBarAccountEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUtilityBarNotificationsEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPlayNavTabEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isWorldCupNavTabEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isDiscoverNavTabEnabled;

    public NavSettings() {
        this(false, false, false, false, false, 31, null);
    }

    public final boolean a() {
        return !this.isUtilityBarAccountEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsDiscoverNavTabEnabled() {
        return this.isDiscoverNavTabEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsPlayNavTabEnabled() {
        return this.isPlayNavTabEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsUtilityBarAccountEnabled() {
        return this.isUtilityBarAccountEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsUtilityBarNotificationsEnabled() {
        return this.isUtilityBarNotificationsEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavSettings)) {
            return false;
        }
        NavSettings navSettings = (NavSettings) other;
        return this.isUtilityBarSearchEnabled == navSettings.isUtilityBarSearchEnabled && this.isUtilityBarAccountEnabled == navSettings.isUtilityBarAccountEnabled && this.isUtilityBarNotificationsEnabled == navSettings.isUtilityBarNotificationsEnabled && this.isPlayNavTabEnabled == navSettings.isPlayNavTabEnabled && this.isWorldCupNavTabEnabled == navSettings.isWorldCupNavTabEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsUtilityBarSearchEnabled() {
        return this.isUtilityBarSearchEnabled;
    }

    public final boolean g() {
        return this.isUtilityBarSearchEnabled || this.isUtilityBarAccountEnabled || this.isUtilityBarNotificationsEnabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsWorldCupNavTabEnabled() {
        return this.isWorldCupNavTabEnabled;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isUtilityBarSearchEnabled) * 31) + Boolean.hashCode(this.isUtilityBarAccountEnabled)) * 31) + Boolean.hashCode(this.isUtilityBarNotificationsEnabled)) * 31) + Boolean.hashCode(this.isPlayNavTabEnabled)) * 31) + Boolean.hashCode(this.isWorldCupNavTabEnabled);
    }

    public String toString() {
        return "NavSettings(isUtilityBarSearchEnabled=" + this.isUtilityBarSearchEnabled + ", isUtilityBarAccountEnabled=" + this.isUtilityBarAccountEnabled + ", isUtilityBarNotificationsEnabled=" + this.isUtilityBarNotificationsEnabled + ", isPlayNavTabEnabled=" + this.isPlayNavTabEnabled + ", isWorldCupNavTabEnabled=" + this.isWorldCupNavTabEnabled + ")";
    }

    public NavSettings(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.isUtilityBarSearchEnabled = z11;
        this.isUtilityBarAccountEnabled = z12;
        this.isUtilityBarNotificationsEnabled = z13;
        this.isPlayNavTabEnabled = z14;
        this.isWorldCupNavTabEnabled = z15;
        this.isDiscoverNavTabEnabled = !z11;
    }

    public /* synthetic */ NavSettings(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15);
    }
}
