package br;

import com.google.firebase.messaging.f0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f15032b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final br.a f15033a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private br.a f15034a = null;

        a() {
        }

        public b a() {
            return new b(this.f15034a);
        }

        public a b(br.a aVar) {
            this.f15034a = aVar;
            return this;
        }
    }

    b(br.a aVar) {
        this.f15033a = aVar;
    }

    public static a b() {
        return new a();
    }

    public br.a a() {
        return this.f15033a;
    }

    public byte[] c() {
        return f0.a(this);
    }
}
