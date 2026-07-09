package tf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static final Map a(Map map, a attribute) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return b(map, attribute.getKey(), attribute);
    }

    public static final Map b(Map map, b key, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        map.put(key.toString(), obj);
        return map;
    }

    public static final Map c(Map map, b key, Object obj) {
        Map mapB;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (obj == null || (mapB = b(map, key, obj)) == null) ? map : mapB;
    }
}
