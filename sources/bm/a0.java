package bm;

import com.google.android.gms.internal.ads.ul0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f14761a = new a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Thread f14762b;

    public abstract void a();

    public com.google.common.util.concurrent.e b() {
        return ul0.f36186a.y(this.f14761a);
    }

    final /* synthetic */ void c(Thread thread) {
        this.f14762b = thread;
    }
}
