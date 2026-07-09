package com.theathletic.profile.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/theathletic/profile/ui/e8;", "Lcom/theathletic/ui/d1;", "", "name", "", "isSubscriber", "<init>", "(Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, "()Z", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "getStableId", "stableId", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e8 implements com.theathletic.ui.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isSubscriber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String stableId;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/theathletic/profile/ui/e8$a;", "", "", "Q", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void Q();
    }

    public e8(String name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.isSubscriber = z11;
        this.stableId = "PROFILE_HEADER";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsSubscriber() {
        return this.isSubscriber;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }
}
