package com.iterable.iterableapi;

import java.util.Date;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f47728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f47729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f47730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f47731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f47732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f47733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f47734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f47735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f47736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f47737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f47738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f47739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f47740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f47741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    m0 f47742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f47743p;

    j0(String str, String str2, int i11, long j11, long j12, long j13, long j14, long j15, boolean z11, boolean z12, boolean z13, String str3, String str4, m0 m0Var, int i12) {
        this.f47728a = 1;
        this.f47729b = str;
        this.f47730c = str2;
        this.f47731d = i11;
        this.f47732e = j11;
        this.f47733f = j12;
        this.f47734g = j13;
        this.f47735h = j14;
        this.f47736i = j15;
        this.f47737j = z11;
        this.f47738k = z12;
        this.f47739l = z13;
        this.f47740m = str3;
        this.f47741n = str4;
        this.f47742o = m0Var;
        this.f47743p = i12;
    }

    j0(String str, m0 m0Var, String str2) {
        this.f47728a = 1;
        this.f47729b = UUID.randomUUID().toString();
        this.f47730c = str;
        this.f47732e = new Date().getTime();
        this.f47735h = new Date().getTime();
        this.f47736i = new Date().getTime();
        this.f47740m = str2;
        this.f47742o = m0Var;
    }
}
