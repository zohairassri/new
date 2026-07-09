package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class o {
    private static t4.i a(t4.i iVar, t4.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i11 = 0;
        while (i11 < iVar.f() + iVar2.f()) {
            Locale localeC = i11 < iVar.f() ? iVar.c(i11) : iVar2.c(i11 - iVar.f());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i11++;
        }
        return t4.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static t4.i b(t4.i iVar, t4.i iVar2) {
        return (iVar == null || iVar.e()) ? t4.i.d() : a(iVar, iVar2);
    }
}
