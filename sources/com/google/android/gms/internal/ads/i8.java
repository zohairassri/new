package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class i8 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f28220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f28221c;

    /* synthetic */ i8(long j11, long j12, long j13, byte[] bArr) {
        this.f28219a = j11;
        this.f28220b = j12;
        this.f28221c = j13;
    }

    final /* synthetic */ long a() {
        return this.f28219a;
    }

    final /* synthetic */ long b() {
        return this.f28220b;
    }

    final /* synthetic */ long c() {
        return this.f28221c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f28219a, ((i8) obj).f28219a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return this.f28219a == i8Var.f28219a && this.f28220b == i8Var.f28220b && this.f28221c == i8Var.f28221c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f28219a), Long.valueOf(this.f28220b), Long.valueOf(this.f28221c));
    }
}
