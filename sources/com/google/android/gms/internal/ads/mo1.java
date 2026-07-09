package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30923a;

    public mo1(jl1 jl1Var) {
    }

    public final synchronized boolean a() {
        if (this.f30923a) {
            return false;
        }
        this.f30923a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z11;
        z11 = this.f30923a;
        this.f30923a = false;
        return z11;
    }

    public final synchronized void c() {
        while (!this.f30923a) {
            wait();
        }
    }

    public final synchronized void d() {
        boolean z11 = false;
        while (!this.f30923a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean e(long j11) {
        if (j11 > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = j11 + jElapsedRealtime;
                if (j12 < jElapsedRealtime) {
                    d();
                } else {
                    boolean z11 = false;
                    while (!this.f30923a && jElapsedRealtime < j12) {
                        try {
                            wait(j12 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z11 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f30923a;
    }

    public final synchronized boolean f() {
        return this.f30923a;
    }
}
