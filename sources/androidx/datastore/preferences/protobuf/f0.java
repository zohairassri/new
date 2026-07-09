package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.n1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7566c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n1.b f7567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f7568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n1.b f7569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f7570d;

        public a(n1.b bVar, Object obj, n1.b bVar2, Object obj2) {
            this.f7567a = bVar;
            this.f7568b = obj;
            this.f7569c = bVar2;
            this.f7570d = obj2;
        }
    }

    private f0(n1.b bVar, Object obj, n1.b bVar2, Object obj2) {
        this.f7564a = new a(bVar, obj, bVar2, obj2);
        this.f7565b = obj;
        this.f7566c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return r.b(aVar.f7567a, 1, obj) + r.b(aVar.f7569c, 2, obj2);
    }

    public static f0 d(n1.b bVar, Object obj, n1.b bVar2, Object obj2) {
        return new f0(bVar, obj, bVar2, obj2);
    }

    static void e(CodedOutputStream codedOutputStream, a aVar, Object obj, Object obj2) {
        r.u(codedOutputStream, aVar.f7567a, 1, obj);
        r.u(codedOutputStream, aVar.f7569c, 2, obj2);
    }

    public int a(int i11, Object obj, Object obj2) {
        return CodedOutputStream.P(i11) + CodedOutputStream.y(b(this.f7564a, obj, obj2));
    }

    a c() {
        return this.f7564a;
    }
}
