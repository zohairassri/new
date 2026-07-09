package ky;

import kotlin.jvm.internal.Intrinsics;
import ky.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f112158a;

    public g(String lireClientId) {
        Intrinsics.checkNotNullParameter(lireClientId, "lireClientId");
        this.f112158a = lireClientId;
    }

    public final f.b.a a(String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new f.b.a(version, this.f112158a);
    }
}
