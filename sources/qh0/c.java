package qh0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f122788a;

    public c(b level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.f122788a = level;
    }

    public abstract void a(b bVar, String str);

    public final boolean b(b lvl) {
        Intrinsics.checkNotNullParameter(lvl, "lvl");
        return this.f122788a.compareTo(lvl) <= 0;
    }
}
