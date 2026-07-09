package androidx.browser.trusted;

import android.os.IBinder;
import c.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.a f2611a;

    private c(c.a aVar) {
        this.f2611a = aVar;
    }

    static c a(IBinder iBinder) {
        c.a aVarR = iBinder == null ? null : a.AbstractBinderC0255a.R(iBinder);
        if (aVarR == null) {
            return null;
        }
        return new c(aVarR);
    }
}
