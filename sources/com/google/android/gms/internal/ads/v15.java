package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class v15 implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f36572a;

    public v15(Iterator delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f36572a = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36572a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f36572a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
