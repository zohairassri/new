package com.google.protobuf;

import com.google.protobuf.i1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f47316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f47317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f47318c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i1.b f47319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f47320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i1.b f47321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f47322d;

        public a(i1.b bVar, Object obj, i1.b bVar2, Object obj2) {
            this.f47319a = bVar;
            this.f47320b = obj;
            this.f47321c = bVar2;
            this.f47322d = obj2;
        }
    }

    private b0(i1.b bVar, Object obj, i1.b bVar2, Object obj2) {
        this.f47316a = new a(bVar, obj, bVar2, obj2);
        this.f47317b = obj;
        this.f47318c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return n.b(aVar.f47319a, 1, obj) + n.b(aVar.f47321c, 2, obj2);
    }

    public static b0 d(i1.b bVar, Object obj, i1.b bVar2, Object obj2) {
        return new b0(bVar, obj, bVar2, obj2);
    }

    static void e(CodedOutputStream codedOutputStream, a aVar, Object obj, Object obj2) {
        n.u(codedOutputStream, aVar.f47319a, 1, obj);
        n.u(codedOutputStream, aVar.f47321c, 2, obj2);
    }

    public int a(int i11, Object obj, Object obj2) {
        return CodedOutputStream.O(i11) + CodedOutputStream.z(b(this.f47316a, obj, obj2));
    }

    a c() {
        return this.f47316a;
    }
}
