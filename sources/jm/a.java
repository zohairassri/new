package jm;

import android.content.Context;
import android.os.RemoteException;
import cm.o;
import ql.b;
import ql.t;
import yl.d0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d0 f105820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f105821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f105822c;

    protected a(Context context, b bVar) {
        this.f105820a = t.a(context);
        this.f105822c = context.getApplicationContext();
        this.f105821b = bVar;
    }

    public final void a() {
        try {
            this.f105820a.G(this.f105821b.b());
        } catch (RemoteException e11) {
            o.i("#007 Could not call remote method.", e11);
        }
    }
}
