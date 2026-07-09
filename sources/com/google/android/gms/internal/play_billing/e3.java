package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e3 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j11, Object obj2, Object obj3) {
        while (!com.google.ads.interactivemedia.v3.internal.b.a(unsafe, obj, j11, obj2, obj3)) {
            if (unsafe.getObject(obj, j11) != obj2) {
                return false;
            }
        }
        return true;
    }
}
