package z10;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z10.j, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, d2 = {"Lz10/j;", "", "", "isOnFeed", "hasPromptDisplayed", "", "scrollIndex", "<init>", "(ZZI)V", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Z", "a", "(ZZI)Lz10/j;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", QueryKeys.MEMFLY_API_VERSION, QueryKeys.PAGE_LOAD_TIME, "getHasPromptDisplayed", QueryKeys.IDLING, "getScrollIndex", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeatureState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnFeed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasPromptDisplayed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int scrollIndex;

    public FeatureState() {
        this(false, false, 0, 7, null);
    }

    public static /* synthetic */ FeatureState b(FeatureState featureState, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = featureState.isOnFeed;
        }
        if ((i12 & 2) != 0) {
            z12 = featureState.hasPromptDisplayed;
        }
        if ((i12 & 4) != 0) {
            i11 = featureState.scrollIndex;
        }
        return featureState.a(z11, z12, i11);
    }

    public final FeatureState a(boolean isOnFeed, boolean hasPromptDisplayed, int scrollIndex) {
        return new FeatureState(isOnFeed, hasPromptDisplayed, scrollIndex);
    }

    public final boolean c() {
        return this.isOnFeed && !this.hasPromptDisplayed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureState)) {
            return false;
        }
        FeatureState featureState = (FeatureState) other;
        return this.isOnFeed == featureState.isOnFeed && this.hasPromptDisplayed == featureState.hasPromptDisplayed && this.scrollIndex == featureState.scrollIndex;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isOnFeed) * 31) + Boolean.hashCode(this.hasPromptDisplayed)) * 31) + Integer.hashCode(this.scrollIndex);
    }

    public String toString() {
        return "FeatureState(isOnFeed=" + this.isOnFeed + ", hasPromptDisplayed=" + this.hasPromptDisplayed + ", scrollIndex=" + this.scrollIndex + ")";
    }

    public FeatureState(boolean z11, boolean z12, int i11) {
        this.isOnFeed = z11;
        this.hasPromptDisplayed = z12;
        this.scrollIndex = i11;
    }

    public /* synthetic */ FeatureState(boolean z11, boolean z12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? 0 : i11);
    }
}
