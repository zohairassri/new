package com.nytimes.android.subauth.core.purchase.network.response;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/nytimes/android/subauth/core/purchase/network/response/LinkResponseMeta;", "", "<init>", "()V", "", "a", QueryKeys.IDLING, "()I", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(I)V", "code", "", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", "()Ljava/lang/String;", QueryKeys.SUBDOMAIN, "(Ljava/lang/String;)V", "msg", "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkResponseMeta {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String msg;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final void c(int i11) {
        this.code = i11;
    }

    public final void d(String str) {
        this.msg = str;
    }
}
