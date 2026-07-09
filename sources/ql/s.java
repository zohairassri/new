package ql;

import com.google.android.gms.ads.internal.client.zzga;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f122858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f122859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f122860c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f122861a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f122862b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f122863c = false;

        public s a() {
            return new s(this, null);
        }

        public a b(boolean z11) {
            this.f122863c = z11;
            return this;
        }

        public a c(boolean z11) {
            this.f122862b = z11;
            return this;
        }

        public a d(boolean z11) {
            this.f122861a = z11;
            return this;
        }

        final /* synthetic */ boolean e() {
            return this.f122861a;
        }

        final /* synthetic */ boolean f() {
            return this.f122862b;
        }

        final /* synthetic */ boolean g() {
            return this.f122863c;
        }
    }

    public s(zzga zzgaVar) {
        this.f122858a = zzgaVar.f22305a;
        this.f122859b = zzgaVar.f22306b;
        this.f122860c = zzgaVar.f22307c;
    }

    public boolean a() {
        return this.f122860c;
    }

    public boolean b() {
        return this.f122859b;
    }

    public boolean c() {
        return this.f122858a;
    }

    /* synthetic */ s(a aVar, byte[] bArr) {
        this.f122858a = aVar.e();
        this.f122859b = aVar.f();
        this.f122860c = aVar.g();
    }
}
