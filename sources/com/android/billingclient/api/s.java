package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18658a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18659a;

        /* synthetic */ a(v1 v1Var) {
        }

        public s a() {
            if (this.f18659a != null) {
                return new s(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f18659a = str;
            return this;
        }
    }

    /* synthetic */ s(a aVar, v1 v1Var) {
        this.f18658a = aVar.f18659a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f18658a;
    }
}
