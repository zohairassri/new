package qo;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final s f122896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntentFilter f122897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f122898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Set f122899d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f122900e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f122901f = false;

    protected r(s sVar, IntentFilter intentFilter, Context context) {
        this.f122896a = sVar;
        this.f122897b = intentFilter;
        this.f122898c = e0.a(context);
    }

    private final void e() {
        q qVar;
        if (!this.f122899d.isEmpty() && this.f122900e == null) {
            q qVar2 = new q(this, null);
            this.f122900e = qVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f122898c.registerReceiver(qVar2, this.f122897b, 2);
            } else {
                this.f122898c.registerReceiver(qVar2, this.f122897b);
            }
        }
        if (!this.f122899d.isEmpty() || (qVar = this.f122900e) == null) {
            return;
        }
        this.f122898c.unregisterReceiver(qVar);
        this.f122900e = null;
    }

    protected abstract void a(Context context, Intent intent);

    public final synchronized void b(vo.a aVar) {
        this.f122896a.d("registerListener", new Object[0]);
        d.a(aVar, "Registered Play Core listener should not be null.");
        this.f122899d.add(aVar);
        e();
    }

    public final synchronized void c(vo.a aVar) {
        this.f122896a.d("unregisterListener", new Object[0]);
        d.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f122899d.remove(aVar);
        e();
    }

    public final synchronized void d(Object obj) {
        Iterator it = new HashSet(this.f122899d).iterator();
        while (it.hasNext()) {
            ((vo.a) it.next()).d(obj);
        }
    }
}
