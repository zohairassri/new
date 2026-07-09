package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q3 f33969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f33970b = new AtomicBoolean(false);

    public r3(q3 q3Var) {
        this.f33969a = q3Var;
    }

    public final w3 a(Object... objArr) {
        Constructor constructorZza;
        AtomicBoolean atomicBoolean = this.f33970b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    constructorZza = this.f33969a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f33970b.set(true);
                    constructorZza = null;
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating extension", e11);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (w3) constructorZza.newInstance(objArr);
        } catch (Exception e12) {
            throw new IllegalStateException("Unexpected error creating extractor", e12);
        }
    }
}
