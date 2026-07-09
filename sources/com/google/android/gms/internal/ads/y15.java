package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class y15 implements Map.Entry, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Map.Entry f38279a;

    public y15(Map.Entry delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38279a = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f38279a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f38279a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
