package nd;

import gd.c;
import zd.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f117717a;

    public b(byte[] bArr) {
        this.f117717a = (byte[]) k.d(bArr);
    }

    @Override // gd.c
    public int a() {
        return this.f117717a.length;
    }

    @Override // gd.c
    public Class c() {
        return byte[].class;
    }

    @Override // gd.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f117717a;
    }

    @Override // gd.c
    public void b() {
    }
}
