package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f7325b;

    public r(boolean z11) {
        this.f7324a = z11;
    }

    public final boolean a() {
        return this.f7324a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(boolean z11, Configuration newConfig) {
        this(z11);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f7325b = newConfig;
    }
}
