package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class m81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jz2 f30634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f30635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cz2 f30636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e81 f30637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o92 f30638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f30639g;

    /* synthetic */ m81(l81 l81Var, byte[] bArr) {
        this.f30633a = l81Var.i();
        this.f30634b = l81Var.j();
        this.f30635c = l81Var.k();
        this.f30636d = l81Var.l();
        this.f30637e = l81Var.m();
        this.f30638f = l81Var.n();
        this.f30639g = l81Var.o();
    }

    final l81 a() {
        l81 l81Var = new l81();
        l81Var.a(this.f30633a);
        l81Var.b(this.f30634b);
        l81Var.c(this.f30635c);
        l81Var.d(this.f30637e);
        l81Var.g(this.f30638f);
        return l81Var;
    }

    final jz2 b() {
        return this.f30634b;
    }

    final cz2 c() {
        return this.f30636d;
    }

    final Bundle d() {
        return this.f30635c;
    }

    final e81 e() {
        return this.f30637e;
    }

    final Context f(Context context) {
        return this.f30633a;
    }

    final o92 g(String str) {
        o92 o92Var = this.f30638f;
        return o92Var != null ? o92Var : new o92(str);
    }

    final int h() {
        return this.f30639g;
    }
}
