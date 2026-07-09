package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class oj implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f31956a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ oj f31955c = new oj(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ oj f31954b = new oj(0);

    private /* synthetic */ oj(int i11) {
        this.f31956a = i11;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.f31956a != 0 ? yj.a(null) : new zzaut();
    }
}
