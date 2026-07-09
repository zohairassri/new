package lc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f114002b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String name, String className) {
        super(name, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(className, "className");
        this.f114002b = className;
    }

    public final String b() {
        return this.f114002b;
    }
}
