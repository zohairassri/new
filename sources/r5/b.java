package r5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public static b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new b());
    }

    public static b i(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b f(int i11, ByteBuffer byteBuffer) {
        g(i11, byteBuffer);
        return this;
    }

    public void g(int i11, ByteBuffer byteBuffer) {
        c(i11, byteBuffer);
    }

    public a j(a aVar, int i11) {
        int iB = b(6);
        if (iB != 0) {
            return aVar.f(a(d(iB) + (i11 * 4)), this.f123712b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f123712b.getInt(iB + this.f123711a);
        }
        return 0;
    }
}
