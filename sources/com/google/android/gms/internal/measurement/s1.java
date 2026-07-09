package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class s1 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f40707a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40708b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get(com.chartbeat.androidsdk.QueryKeys.EXTERNAL_REFERRER);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object I0(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L3e
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            java.lang.String r3 = java.lang.String.format(r1, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s1.I0(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void E(Bundle bundle) {
        synchronized (this.f40707a) {
            try {
                try {
                    this.f40707a.set(bundle);
                    this.f40708b = true;
                } finally {
                    this.f40707a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bundle Y(long j11) {
        Bundle bundle;
        synchronized (this.f40707a) {
            if (!this.f40708b) {
                try {
                    this.f40707a.wait(j11);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f40707a.get();
        }
        return bundle;
    }

    public final Long k1(long j11) {
        return (Long) I0(Y(j11), Long.class);
    }

    public final String z1(long j11) {
        return (String) I0(Y(j11), String.class);
    }
}
