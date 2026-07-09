package u6;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f131098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f131100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f131101e;

    public g(String str, long j11, List list, List list2) {
        this(str, j11, list, list2, null);
    }

    public int a(int i11) {
        int size = this.f131099c.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((a) this.f131099c.get(i12)).f131052b == i11) {
                return i12;
            }
        }
        return -1;
    }

    public g(String str, long j11, List list, List list2, e eVar) {
        this.f131097a = str;
        this.f131098b = j11;
        this.f131099c = Collections.unmodifiableList(list);
        this.f131100d = Collections.unmodifiableList(list2);
        this.f131101e = eVar;
    }
}
