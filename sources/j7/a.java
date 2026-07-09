package j7;

import java.nio.ByteBuffer;
import java.util.List;
import l6.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h.e f105037a;

    private boolean a(h.d dVar, boolean z11) {
        h.e eVar;
        h.b bVarB;
        int i11 = dVar.f113363a;
        if (i11 == 2 || i11 == 15) {
            return true;
        }
        if (i11 != 3 || z11) {
            return ((i11 != 6 && i11 != 3) || (eVar = this.f105037a) == null || (bVarB = h.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    private void e(List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((h.d) list.get(i11)).f113363a == 1) {
                this.f105037a = h.e.a((h.d) list.get(i11));
            }
        }
    }

    public void b(ByteBuffer byteBuffer) {
        e(l6.h.e(byteBuffer));
    }

    public void c() {
        this.f105037a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z11) {
        List listE = l6.h.e(byteBuffer);
        e(listE);
        int size = listE.size() - 1;
        int i11 = 0;
        while (size >= 0 && a((h.d) listE.get(size), z11)) {
            if (((h.d) listE.get(size)).f113363a == 6 || ((h.d) listE.get(size)).f113363a == 3) {
                i11++;
            }
            size--;
        }
        return (i11 > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((h.d) listE.get(size)).f113364b.limit() : byteBuffer.position();
    }
}
