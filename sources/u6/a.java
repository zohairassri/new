package u6;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f131051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f131052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f131054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f131055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f131056f;

    public a(long j11, int i11, List list, List list2, List list3, List list4) {
        this.f131051a = j11;
        this.f131052b = i11;
        this.f131053c = Collections.unmodifiableList(list);
        this.f131054d = Collections.unmodifiableList(list2);
        this.f131055e = Collections.unmodifiableList(list3);
        this.f131056f = Collections.unmodifiableList(list4);
    }
}
