package com.theathletic.nytplatform.ads;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/theathletic/nytplatform/ads/a;", "Lws/a;", "Lvs/a;", "adOverride", "<init>", "(Lvs/a;)V", "", "a", QueryKeys.MEMFLY_API_VERSION, "getEnableAds", "()Z", "enableAds", "ads_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ws.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean enableAds;

    public a(vs.a adOverride) {
        Intrinsics.checkNotNullParameter(adOverride, "adOverride");
        this.enableAds = true;
    }
}
