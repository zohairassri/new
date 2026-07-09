package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import wk.l;
import wk.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f21680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f21681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f21682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f21683d;

        public a(l lVar, o oVar, IOException iOException, int i11) {
            this.f21680a = lVar;
            this.f21681b = oVar;
            this.f21682c = iOException;
            this.f21683d = i11;
        }
    }

    int a(int i11);

    long c(a aVar);

    default void b(long j11) {
    }
}
