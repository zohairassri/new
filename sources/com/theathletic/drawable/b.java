package com.theathletic.drawable;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/theathletic/extension/b;", "T", "", "Ljava/lang/ref/WeakReference;", "weakRef", "<init>", "(Ljava/lang/ref/WeakReference;)V", "a", "Ljava/lang/ref/WeakReference;", "getWeakRef", "()Ljava/lang/ref/WeakReference;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference weakRef;

    public b(WeakReference weakRef) {
        Intrinsics.checkNotNullParameter(weakRef, "weakRef");
        this.weakRef = weakRef;
    }
}
