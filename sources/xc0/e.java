package xc0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f137420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f137423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f137425f;

    e() {
    }

    public d a() {
        jc0.j.a((this.f137420a == null && this.f137421b == null && this.f137422c == null && this.f137423d == null && this.f137424e == null && this.f137425f == null) ? false : true, "Instrument selector must contain selection criteria");
        return d.b(this.f137420a, this.f137421b, this.f137422c, this.f137423d, this.f137424e, this.f137425f);
    }

    public e b(String str) {
        Objects.requireNonNull(str, "name");
        this.f137421b = str;
        return this;
    }
}
