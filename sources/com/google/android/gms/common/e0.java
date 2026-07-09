package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class e0 extends f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Callable f22645f;

    /* synthetic */ e0(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f22645f = callable;
    }

    @Override // com.google.android.gms.common.f0
    final String a() {
        try {
            return (String) this.f22645f.call();
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
