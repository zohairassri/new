package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.d3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18557b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18559b = "";

        /* synthetic */ a(g1 g1Var) {
        }

        public h a() {
            h hVar = new h();
            hVar.f18556a = this.f18558a;
            hVar.f18557b = this.f18559b;
            return hVar;
        }

        public a b(String str) {
            this.f18559b = str;
            return this;
        }

        public a c(int i11) {
            this.f18558a = i11;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f18557b;
    }

    public int b() {
        return this.f18556a;
    }

    public String toString() {
        return "Response Code: " + d3.h(this.f18556a) + ", Debug Message: " + this.f18557b;
    }
}
