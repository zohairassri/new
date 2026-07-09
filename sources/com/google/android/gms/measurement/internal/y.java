package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f43640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f43641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f43642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f43643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f43644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f43645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f43646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Long f43647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Long f43648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Long f43649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Boolean f43650k;

    y(String str, String str2, long j11, long j12, long j13, long j14, Long l11, Long l12, Long l13, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j13, 0L, null, null, null, null);
    }

    final y a(long j11) {
        return new y(this.f43640a, this.f43641b, this.f43642c, this.f43643d, this.f43644e, j11, this.f43646g, this.f43647h, this.f43648i, this.f43649j, this.f43650k);
    }

    final y b(long j11, long j12) {
        return new y(this.f43640a, this.f43641b, this.f43642c, this.f43643d, this.f43644e, this.f43645f, j11, Long.valueOf(j12), this.f43648i, this.f43649j, this.f43650k);
    }

    final y c(Long l11, Long l12, Boolean bool) {
        return new y(this.f43640a, this.f43641b, this.f43642c, this.f43643d, this.f43644e, this.f43645f, this.f43646g, this.f43647h, l11, l12, (bool == null || bool.booleanValue()) ? bool : null);
    }

    y(String str, String str2, long j11, long j12, long j13, long j14, long j15, Long l11, Long l12, Long l13, Boolean bool) {
        com.google.android.gms.common.internal.n.f(str);
        com.google.android.gms.common.internal.n.f(str2);
        com.google.android.gms.common.internal.n.a(j11 >= 0);
        com.google.android.gms.common.internal.n.a(j12 >= 0);
        com.google.android.gms.common.internal.n.a(j13 >= 0);
        com.google.android.gms.common.internal.n.a(j15 >= 0);
        this.f43640a = str;
        this.f43641b = str2;
        this.f43642c = j11;
        this.f43643d = j12;
        this.f43644e = j13;
        this.f43645f = j14;
        this.f43646g = j15;
        this.f43647h = l11;
        this.f43648i = l12;
        this.f43649j = l13;
        this.f43650k = bool;
    }
}
