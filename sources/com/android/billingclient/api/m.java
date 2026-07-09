package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f18603b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18605b;

        private a() {
        }

        public m a() {
            if (!this.f18604a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new m(true, this.f18605b);
        }

        public a b() {
            this.f18604a = true;
            return this;
        }
    }

    private m(boolean z11, boolean z12) {
        this.f18602a = z11;
        this.f18603b = z12;
    }

    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f18602a;
    }

    boolean b() {
        return this.f18603b;
    }
}
