package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a33 f23673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rv1 f23674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rv1 f23675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23677e;

    public b43(Context context, Looper looper, jl1 jl1Var) {
        this.f23673a = new a33(context.getApplicationContext());
        this.f23674b = jl1Var.a(looper, null);
        this.f23675c = jl1Var.a(Looper.getMainLooper(), null);
    }

    private final void f(final boolean z11, final boolean z12) {
        if (g(z11, z12)) {
            this.f23674b.i(new Runnable() { // from class: com.google.android.gms.internal.ads.z03
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f38948a.d(z11, z12);
                }
            });
            return;
        }
        final a33 a33Var = this.f23673a;
        Objects.requireNonNull(a33Var);
        final Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.yz2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                a33Var.a();
            }
        };
        this.f23675c.g(runnable, 1000L);
        this.f23674b.i(new Runnable() { // from class: com.google.android.gms.internal.ads.z13
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f38970a.c(runnable, z11, z12);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(boolean z11, boolean z12) {
        return z11 && z12;
    }

    public final void a(boolean z11) {
        if (this.f23676d == z11) {
            return;
        }
        this.f23676d = z11;
        f(z11, this.f23677e);
    }

    public final void b(boolean z11) {
        if (this.f23677e == z11) {
            return;
        }
        this.f23677e = z11;
        if (this.f23676d) {
            f(true, z11);
        }
    }

    final /* synthetic */ void c(Runnable runnable, boolean z11, boolean z12) {
        this.f23675c.k(runnable);
        this.f23673a.b(z11, z12);
    }

    final /* synthetic */ void d(boolean z11, boolean z12) {
        this.f23673a.b(z11, z12);
    }
}
