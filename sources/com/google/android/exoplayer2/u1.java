package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.u1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class u1 implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u1 f21261d = new u1(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f21262e = ml.l0.o0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f21263f = ml.l0.o0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a f21264g = new g.a() { // from class: xj.b0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return u1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21267c;

    public u1(float f11) {
        this(f11, 1.0f);
    }

    public static /* synthetic */ u1 a(Bundle bundle) {
        return new u1(bundle.getFloat(f21262e, 1.0f), bundle.getFloat(f21263f, 1.0f));
    }

    public long b(long j11) {
        return j11 * ((long) this.f21267c);
    }

    public u1 c(float f11) {
        return new u1(f11, this.f21266b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u1.class == obj.getClass()) {
            u1 u1Var = (u1) obj;
            if (this.f21265a == u1Var.f21265a && this.f21266b == u1Var.f21266b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f21265a)) * 31) + Float.floatToRawIntBits(this.f21266b);
    }

    public String toString() {
        return ml.l0.z("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f21265a), Float.valueOf(this.f21266b));
    }

    public u1(float f11, float f12) {
        ml.a.a(f11 > 0.0f);
        ml.a.a(f12 > 0.0f);
        this.f21265a = f11;
        this.f21266b = f12;
        this.f21267c = Math.round(f11 * 1000.0f);
    }
}
