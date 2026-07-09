package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import k6.h0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f10846a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f10847b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f10848c = new h0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10849d;

    public static void a(float[] fArr, float[] fArr2) {
        GlUtil.o(fArr);
        float f11 = fArr2[10];
        float f12 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f12 * f12));
        float f13 = fArr2[10];
        fArr[0] = f13 / fSqrt;
        float f14 = fArr2[8];
        fArr[2] = f14 / fSqrt;
        fArr[8] = (-f14) / fSqrt;
        fArr[10] = f13 / fSqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f11 = fArr2[0];
        float f12 = -fArr2[1];
        float f13 = -fArr2[2];
        float length = Matrix.length(f11, f12, f13);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f11 / length, f12 / length, f13 / length);
        } else {
            GlUtil.o(fArr);
        }
    }

    public boolean c(float[] fArr, long j11) {
        float[] fArr2 = (float[]) this.f10848c.j(j11);
        if (fArr2 == null) {
            return false;
        }
        b(this.f10847b, fArr2);
        if (!this.f10849d) {
            a(this.f10846a, this.f10847b);
            this.f10849d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f10846a, 0, this.f10847b, 0);
        return true;
    }

    public void d() {
        this.f10848c.c();
        this.f10849d = false;
    }

    public void e(long j11, float[] fArr) {
        this.f10848c.a(j11, fArr);
    }
}
