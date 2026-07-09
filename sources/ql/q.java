package ql;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f122852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f122853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f122854c;

    public q(int i11, int i12, int i13) {
        this.f122852a = i11;
        this.f122853b = i12;
        this.f122854c = i13;
    }

    public int a() {
        return this.f122852a;
    }

    public int b() {
        return this.f122854c;
    }

    public int c() {
        return this.f122853b;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.f122852a), Integer.valueOf(this.f122853b), Integer.valueOf(this.f122854c));
    }
}
