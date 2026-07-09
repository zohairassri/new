package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18462a;

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18463a;

        /* synthetic */ C0286a(w wVar) {
        }

        public a a() {
            String str = this.f18463a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            a aVar = new a(null);
            aVar.f18462a = str;
            return aVar;
        }

        public C0286a b(String str) {
            this.f18463a = str;
            return this;
        }
    }

    /* synthetic */ a(w wVar) {
    }

    public static C0286a b() {
        return new C0286a(null);
    }

    public String a() {
        return this.f18462a;
    }
}
