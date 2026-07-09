package oo;

import java.util.Date;
import oo.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class l extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f120636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f120637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f120638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Date f120639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f120640e;

    l() {
    }

    @Override // oo.d.a
    public final d a() {
        return new n(this.f120636a, this.f120637b, this.f120638c, this.f120639d, this.f120640e, null);
    }

    @Override // oo.d.a
    public final d.a b(Integer num) {
        this.f120637b = num;
        return this;
    }

    @Override // oo.d.a
    public final d.a c(Integer num) {
        this.f120638c = num;
        return this;
    }

    @Override // oo.d.a
    public final d.a d(String str) {
        this.f120640e = str;
        return this;
    }

    @Override // oo.d.a
    public final d.a e(Date date) {
        this.f120639d = date;
        return this;
    }

    @Override // oo.d.a
    public final d.a f(Integer num) {
        this.f120636a = num;
        return this;
    }
}
