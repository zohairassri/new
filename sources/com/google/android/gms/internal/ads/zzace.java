package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzace extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f39536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f39537e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f1 f39539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39540c;

    /* synthetic */ zzace(f1 f1Var, SurfaceTexture surfaceTexture, boolean z11, byte[] bArr) {
        super(surfaceTexture);
        this.f39539b = f1Var;
        this.f39538a = z11;
    }

    public static synchronized boolean a(Context context) {
        if (!f39537e) {
            try {
            } catch (zzdu e11) {
                y22.e("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e11.getMessage())));
            }
            int i11 = pt1.a(context) ? pt1.b() ? 1 : 2 : 0;
            f39536d = i11;
            f39537e = true;
        }
        return f39536d != 0;
    }

    public static zzace b(Context context, boolean z11) {
        boolean z12 = true;
        if (z11 && !a(context)) {
            z12 = false;
        }
        jx3.i(z12);
        return new f1().a(z11 ? f39536d : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        f1 f1Var = this.f39539b;
        synchronized (f1Var) {
            try {
                if (!this.f39540c) {
                    f1Var.b();
                    this.f39540c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
