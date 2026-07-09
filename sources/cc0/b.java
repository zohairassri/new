package cc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Runnable f17479b;

    public b(Object priorityInfo, Runnable impl) {
        Intrinsics.checkNotNullParameter(priorityInfo, "priorityInfo");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f17478a = priorityInfo;
        this.f17479b = impl;
    }

    public final Object a() {
        return this.f17478a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f17479b.run();
    }
}
