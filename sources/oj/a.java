package oj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lj.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f120382e = new C1582a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f120383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f120384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f120385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f120386d;

    /* JADX INFO: renamed from: oj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1582a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f120387a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f120388b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f120389c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f120390d = "";

        C1582a() {
        }

        public C1582a a(d dVar) {
            this.f120388b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f120387a, Collections.unmodifiableList(this.f120388b), this.f120389c, this.f120390d);
        }

        public C1582a c(String str) {
            this.f120390d = str;
            return this;
        }

        public C1582a d(b bVar) {
            this.f120389c = bVar;
            return this;
        }

        public C1582a e(f fVar) {
            this.f120387a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f120383a = fVar;
        this.f120384b = list;
        this.f120385c = bVar;
        this.f120386d = str;
    }

    public static C1582a e() {
        return new C1582a();
    }

    public String a() {
        return this.f120386d;
    }

    public b b() {
        return this.f120385c;
    }

    public List c() {
        return this.f120384b;
    }

    public f d() {
        return this.f120383a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
