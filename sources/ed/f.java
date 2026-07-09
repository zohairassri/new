package ed;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class f implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f92467b;

    public f(l... lVarArr) {
        if (lVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f92467b = Arrays.asList(lVarArr);
    }

    @Override // ed.e
    public void a(MessageDigest messageDigest) {
        Iterator it = this.f92467b.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(messageDigest);
        }
    }

    @Override // ed.l
    public gd.c b(Context context, gd.c cVar, int i11, int i12) {
        Iterator it = this.f92467b.iterator();
        gd.c cVar2 = cVar;
        while (it.hasNext()) {
            gd.c cVarB = ((l) it.next()).b(context, cVar2, i11, i12);
            if (cVar2 != null && !cVar2.equals(cVar) && !cVar2.equals(cVarB)) {
                cVar2.b();
            }
            cVar2 = cVarB;
        }
        return cVar2;
    }

    @Override // ed.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f92467b.equals(((f) obj).f92467b);
        }
        return false;
    }

    @Override // ed.e
    public int hashCode() {
        return this.f92467b.hashCode();
    }
}
