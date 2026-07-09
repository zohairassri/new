package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39038c;

    public z7(long j11, long j12, int i11) {
        jx3.a(j11 < j12);
        this.f39036a = j11;
        this.f39037b = j12;
        this.f39038c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z7.class == obj.getClass()) {
            z7 z7Var = (z7) obj;
            if (this.f39036a == z7Var.f39036a && this.f39037b == z7Var.f39037b && this.f39038c == z7Var.f39038c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f39036a), Long.valueOf(this.f39037b), Integer.valueOf(this.f39038c));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f39036a), Long.valueOf(this.f39037b), Integer.valueOf(this.f39038c)};
        String str = yy2.f38899a;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
