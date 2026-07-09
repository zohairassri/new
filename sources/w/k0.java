package w;

import io.agora.base.internal.video.FactorBitrateAdjuster;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f133713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f133714b;

    public k0(float f11, float f12) {
        this.f133713a = Math.max(1.0E-7f, Math.abs(f12));
        this.f133714b = Math.max(1.0E-4f, f11) * (-4.2f);
    }

    @Override // w.j0
    public float a() {
        return this.f133713a;
    }

    @Override // w.j0
    public float b(long j11, float f11, float f12) {
        return f12 * ((float) Math.exp(((j11 / 1000000) / 1000.0f) * this.f133714b));
    }

    @Override // w.j0
    public long c(float f11, float f12) {
        return ((long) ((((float) Math.log(a() / Math.abs(f12))) * 1000.0f) / this.f133714b)) * 1000000;
    }

    @Override // w.j0
    public float d(float f11, float f12) {
        if (Math.abs(f12) <= a()) {
            return f11;
        }
        double dLog = Math.log(Math.abs(a() / f12));
        float f13 = this.f133714b;
        return (f11 - (f12 / f13)) + ((f12 / f13) * ((float) Math.exp((((double) f13) * ((dLog / ((double) f13)) * ((double) FactorBitrateAdjuster.FACTOR_BASE))) / ((double) 1000.0f))));
    }

    @Override // w.j0
    public float e(long j11, float f11, float f12) {
        float f13 = this.f133714b;
        return (f11 - (f12 / f13)) + ((f12 / f13) * ((float) Math.exp((f13 * (j11 / 1000000)) / 1000.0f)));
    }

    public /* synthetic */ k0(float f11, float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 0.1f : f12);
    }
}
