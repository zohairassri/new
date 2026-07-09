package r5;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public a f(int i11, ByteBuffer byteBuffer) {
        g(i11, byteBuffer);
        return this;
    }

    public void g(int i11, ByteBuffer byteBuffer) {
        c(i11, byteBuffer);
    }

    public int h(int i11) {
        int iB = b(16);
        if (iB != 0) {
            return this.f123712b.getInt(d(iB) + (i11 * 4));
        }
        return 0;
    }

    public int i() {
        int iB = b(16);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public boolean j() {
        int iB = b(6);
        return (iB == 0 || this.f123712b.get(iB + this.f123711a) == 0) ? false : true;
    }

    public short k() {
        int iB = b(14);
        if (iB != 0) {
            return this.f123712b.getShort(iB + this.f123711a);
        }
        return (short) 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f123712b.getInt(iB + this.f123711a);
        }
        return 0;
    }

    public short m() {
        int iB = b(8);
        if (iB != 0) {
            return this.f123712b.getShort(iB + this.f123711a);
        }
        return (short) 0;
    }

    public short n() {
        int iB = b(12);
        if (iB != 0) {
            return this.f123712b.getShort(iB + this.f123711a);
        }
        return (short) 0;
    }
}
