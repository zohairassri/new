package ia;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class j implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f103496b = new j();

    private j() {
    }

    @Override // ia.h
    public float a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }
}
