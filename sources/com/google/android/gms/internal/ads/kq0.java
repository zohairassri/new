package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class kq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AudioManager f29806a;

    public static synchronized AudioManager a(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f29806a = null;
            }
            AudioManager audioManager = f29806a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final mo1 mo1Var = new mo1(jl1.f29118a);
                ef1.a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jp0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        kq0.b(applicationContext, mo1Var);
                    }
                });
                mo1Var.d();
                AudioManager audioManager2 = f29806a;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f29806a = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static /* synthetic */ void b(Context context, mo1 mo1Var) {
        f29806a = (AudioManager) context.getSystemService("audio");
        mo1Var.a();
    }
}
