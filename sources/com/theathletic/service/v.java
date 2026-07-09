package com.theathletic.service;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/service/v;", "", "", "forceNetwork", "", QueryKeys.SUBDOMAIN, "(Z)V", "", TransferTable.COLUMN_STATE, "", "errorMessage", "a", "(ILjava/lang/String;)V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface v {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ void b(v vVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlayingActiveTrack");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        vVar.d(z11);
    }

    static /* synthetic */ void c(v vVar, int i11, String str, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchToState");
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        vVar.a(i11, str);
    }

    void a(int state, String errorMessage);

    void d(boolean forceNetwork);
}
