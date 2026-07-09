package com.theathletic.user;

import android.net.Uri;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\rH¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/theathletic/user/j;", "", "", "a", "()V", QueryKeys.SUBDOMAIN, "(Laf0/c;)Ljava/lang/Object;", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Landroid/net/Uri;", "deeplink", "Lcom/theathletic/user/b;", QueryKeys.PAGE_LOAD_TIME, "(Landroid/net/Uri;Laf0/c;)Ljava/lang/Object;", "", "isOnMainActivity", "", "deeplinkUrl", "crossAppLoggedIn", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(ZLjava/lang/String;ZLaf0/c;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ Object f(j jVar, boolean z11, String str, boolean z12, af0.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyTaTokenAndNYTS");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return jVar.c(z11, str, z12, cVar);
    }

    void a();

    Object b(Uri uri, af0.c cVar);

    Object c(boolean z11, String str, boolean z12, af0.c cVar);

    Object d(af0.c cVar);

    Object e(af0.c cVar);
}
