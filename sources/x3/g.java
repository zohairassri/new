package x3;

import java.util.List;
import x1.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f137000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f137001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f137002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f137003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f137004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f137005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f137006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f137007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f137008i;

    public g(String str, String str2, int i11, List list, int i12, List list2, boolean z11, boolean z12) {
        this.f137000a = str;
        this.f137001b = str2;
        this.f137002c = i11;
        this.f137003d = list;
        this.f137004e = i12;
        this.f137005f = list2;
        this.f137006g = z11;
        this.f137007h = z12;
    }

    public final String a() {
        return this.f137000a;
    }

    public final int b() {
        return this.f137002c;
    }

    public final List c() {
        return this.f137005f;
    }

    public final String d() {
        return this.f137001b;
    }

    public final boolean e() {
        return this.f137006g;
    }

    public final boolean f() {
        return this.f137007h;
    }

    public final h g() {
        int i11;
        if (this.f137008i >= this.f137003d.size() && (i11 = this.f137004e) >= 0) {
            this.f137008i = i11;
        }
        if (this.f137008i >= this.f137003d.size()) {
            return null;
        }
        List list = this.f137003d;
        int i12 = this.f137008i;
        this.f137008i = i12 + 1;
        o oVar = (o) list.get(i12);
        return new h(oVar.b(), oVar.c(), oVar.a(), this.f137001b, this.f137002c);
    }
}
