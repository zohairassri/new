package lc;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f114068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f114069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f114070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f114071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f114072e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f114073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f114074b;

        public a(int i11, int i12) {
            this.f114073a = i11;
            this.f114074b = i12;
        }

        public String toString() {
            return "Location(line = " + this.f114073a + ", column = " + this.f114074b + ')';
        }
    }

    public e0(String message, List list, List list2, Map map, Map map2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f114068a = message;
        this.f114069b = list;
        this.f114070c = list2;
        this.f114071d = map;
        this.f114072e = map2;
    }

    public final String a() {
        return this.f114068a;
    }

    public String toString() {
        return "Error(message = " + this.f114068a + ", locations = " + this.f114069b + ", path=" + this.f114070c + ", extensions = " + this.f114071d + ", nonStandardFields = " + this.f114072e + ')';
    }
}
