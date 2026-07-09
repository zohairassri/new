package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class eu3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25934b = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25933a = new ArrayList();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f25934b, ((eu3) obj).f25934b);
    }
}
