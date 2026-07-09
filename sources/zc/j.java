package zc;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f142233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f142234b;

    public j(String str, Map payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f142233a = str;
        this.f142234b = payload;
    }

    public final Map a() {
        return this.f142234b;
    }

    @Override // zc.d
    public String getId() {
        return this.f142233a;
    }
}
