package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class fa5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f26156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntConsumer f26157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ga5 f26158c;

    /* synthetic */ fa5(ga5 ga5Var, Context context, byte[] bArr) {
        Objects.requireNonNull(ga5Var);
        this.f26158c = ga5Var;
        this.f26156a = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.da5
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i11) {
                ga5 ga5Var2 = this.f24959a.f26158c;
                if (ga5Var2.Q()) {
                    return;
                }
                ga5Var2.F(1, 19, Integer.valueOf(i11));
            }
        };
        this.f26157b = intConsumer;
        final rv1 rv1VarA = ga5Var.K().a(ga5Var.J(), null);
        Objects.requireNonNull(rv1VarA);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.ea5
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                rv1VarA.i(runnable);
            }
        }, intConsumer);
    }

    final /* synthetic */ void a() {
        Context context = (Context) this.f26156a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.f26157b);
    }
}
