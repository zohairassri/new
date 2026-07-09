package zw;

import com.android.billingclient.api.n;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(n nVar, String str) {
        Object next;
        String strD;
        List listF = nVar.f();
        if (listF == null) {
            return "";
        }
        Iterator it = listF.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((n.e) next).b(), str)) {
                break;
            }
        }
        n.e eVar = (n.e) next;
        return (eVar == null || (strD = eVar.d()) == null) ? "" : strD;
    }
}
