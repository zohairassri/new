package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class w93 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final w93 f37235d = new w93();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f37236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37237b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37238c = false;

    public static w93 a() {
        return f37235d;
    }

    public final void b(Context context) {
        if (context == null) {
            return;
        }
        this.f37236a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new v93(this), intentFilter);
    }

    public final void c() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f37236a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        d(this.f37237b, zIsDeviceLocked);
        this.f37238c = zIsDeviceLocked;
    }

    public final void d(boolean z11, boolean z12) {
        if ((z12 || z11) == (this.f37238c || this.f37237b)) {
            return;
        }
        Iterator it = m93.a().e().iterator();
        while (it.hasNext()) {
            ((s83) it.next()).g().g(z12 || z11);
        }
    }

    final /* synthetic */ void e(boolean z11) {
        this.f37237b = z11;
    }

    final /* synthetic */ boolean f() {
        return this.f37238c;
    }
}
