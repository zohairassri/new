package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface f extends r {
    default void T0(s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void o(s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onDestroy(s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onPause(s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStart(s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStop(s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }
}
