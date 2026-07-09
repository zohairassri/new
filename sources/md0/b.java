package md0;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f116083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function f116084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentMap f116085c = new ConcurrentHashMap(1);

    private b(String str, Function function) {
        this.f116083a = str;
        this.f116084b = function;
    }

    public static b a(String str) {
        return new b(str, new Function() { // from class: md0.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return gc0.e.a((String) obj);
            }
        });
    }
}
