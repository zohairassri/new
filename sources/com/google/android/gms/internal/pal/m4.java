package com.google.android.gms.internal.pal;

import io.agora.base.internal.video.FactorBitrateAdjuster;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class m4 extends p4 implements Serializable, n4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m4 f41552b = new m4(0);

    public m4(long j11) {
        super(j11);
    }

    public static m4 a(long j11) {
        return j11 == 0 ? f41552b : new m4(j11);
    }

    public static m4 b(long j11) {
        return new m4(q4.a(j11, 3600000));
    }

    public static m4 c(long j11) {
        return new m4(q4.a(j11, FactorBitrateAdjuster.FACTOR_BASE));
    }
}
