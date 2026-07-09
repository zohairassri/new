package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8593a = new HashMap();

    public boolean a(String name, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f8593a.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z11 = (iIntValue & i11) != 0;
        this.f8593a.put(name, Integer.valueOf(i11 | iIntValue));
        return !z11;
    }
}
