package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class w extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakReference f22933c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f22934b;

    w(byte[] bArr) {
        super(bArr);
        this.f22934b = f22933c;
    }

    @Override // com.google.android.gms.common.t
    final byte[] I0() {
        byte[] bArrZ1;
        synchronized (this) {
            try {
                bArrZ1 = (byte[]) this.f22934b.get();
                if (bArrZ1 == null) {
                    bArrZ1 = z1();
                    this.f22934b = new WeakReference(bArrZ1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrZ1;
    }

    protected abstract byte[] z1();
}
