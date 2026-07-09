package k6;

import android.os.Bundle;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static com.google.common.collect.x a(zo.g gVar, List list) {
        x.a aVarS = com.google.common.collect.x.s();
        for (int i11 = 0; i11 < list.size(); i11++) {
            aVarS.a(gVar.apply((Bundle) a.e((Bundle) list.get(i11))));
        }
        return aVarS.k();
    }

    public static ArrayList b(Collection collection, zo.g gVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) gVar.apply(it.next()));
        }
        return arrayList;
    }
}
