package com.theathletic.network;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import wf0.g;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bJ\u001d\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/theathletic/network/NetworkManager;", "", "Lwf0/g;", "Lcom/theathletic/network/NetworkState;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Lwf0/g;", "", "a", "()Z", QueryKeys.SUBDOMAIN, QueryKeys.PAGE_LOAD_TIME, "Lkotlin/Function0;", "", "function", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "(Lkotlin/jvm/functions/Function0;)V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NetworkManager {
    boolean a();

    boolean b();

    g c();

    boolean d();

    void e(Function0 function);
}
