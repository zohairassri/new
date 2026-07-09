package r5;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f123711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f123712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f123713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f123714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f123715e = d.a();

    protected int a(int i11) {
        return i11 + this.f123712b.getInt(i11);
    }

    protected int b(int i11) {
        if (i11 < this.f123714d) {
            return this.f123712b.getShort(this.f123713c + i11);
        }
        return 0;
    }

    protected void c(int i11, ByteBuffer byteBuffer) {
        this.f123712b = byteBuffer;
        if (byteBuffer == null) {
            this.f123711a = 0;
            this.f123713c = 0;
            this.f123714d = 0;
        } else {
            this.f123711a = i11;
            int i12 = i11 - byteBuffer.getInt(i11);
            this.f123713c = i12;
            this.f123714d = this.f123712b.getShort(i12);
        }
    }

    protected int d(int i11) {
        int i12 = i11 + this.f123711a;
        return i12 + this.f123712b.getInt(i12) + 4;
    }

    protected int e(int i11) {
        int i12 = i11 + this.f123711a;
        return this.f123712b.getInt(i12 + this.f123712b.getInt(i12));
    }
}
