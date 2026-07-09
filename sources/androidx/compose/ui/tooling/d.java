package androidx.compose.ui.tooling;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f6038b = Collections.newSetFromMap(new WeakHashMap());

    @Override // androidx.compose.ui.tooling.c
    public Set a() {
        return this.f6038b;
    }
}
