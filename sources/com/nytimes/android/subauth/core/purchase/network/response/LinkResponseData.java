package com.nytimes.android.subauth.core.purchase.network.response;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/nytimes/android/subauth/core/purchase/network/response/LinkResponseData;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "(Ljava/lang/String;)V", "getSubscriptionId$annotations", "subscriptionId", "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkResponseData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String subscriptionId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final void b(String str) {
        this.subscriptionId = str;
    }

    @g(name = "subscription_id")
    public static /* synthetic */ void getSubscriptionId$annotations() {
    }
}
