package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ArcMotion extends PathMotion {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f12774g = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f12775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f12776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f12777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f12778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f12779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f12780f;

    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12775a = 0.0f;
        this.f12776b = 0.0f;
        this.f12777c = 70.0f;
        this.f12778d = 0.0f;
        this.f12779e = 0.0f;
        this.f12780f = f12774g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f12992j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        d(n4.n.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        c(n4.n.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        b(n4.n.j(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float e(float f11) {
        if (f11 < 0.0f || f11 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f11 / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public Path a(float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        Path path = new Path();
        path.moveTo(f11, f12);
        float f18 = f13 - f11;
        float f19 = f14 - f12;
        float f21 = (f18 * f18) + (f19 * f19);
        float f22 = (f11 + f13) / 2.0f;
        float f23 = (f12 + f14) / 2.0f;
        float f24 = 0.25f * f21;
        boolean z11 = f12 > f14;
        if (Math.abs(f18) < Math.abs(f19)) {
            float fAbs = Math.abs(f21 / (f19 * 2.0f));
            if (z11) {
                f16 = fAbs + f14;
                f15 = f13;
            } else {
                f16 = fAbs + f12;
                f15 = f11;
            }
            f17 = this.f12779e;
        } else {
            float f25 = f21 / (f18 * 2.0f);
            if (z11) {
                f16 = f12;
                f15 = f25 + f11;
            } else {
                f15 = f13 - f25;
                f16 = f14;
            }
            f17 = this.f12778d;
        }
        float f26 = f24 * f17 * f17;
        float f27 = f22 - f15;
        float f28 = f23 - f16;
        float f29 = (f27 * f27) + (f28 * f28);
        float f31 = this.f12780f;
        float f32 = f24 * f31 * f31;
        if (f29 >= f26) {
            f26 = f29 > f32 ? f32 : 0.0f;
        }
        if (f26 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f26 / f29);
            f15 = ((f15 - f22) * fSqrt) + f22;
            f16 = f23 + (fSqrt * (f16 - f23));
        }
        path.cubicTo((f11 + f15) / 2.0f, (f12 + f16) / 2.0f, (f15 + f13) / 2.0f, (f16 + f14) / 2.0f, f13, f14);
        return path;
    }

    public void b(float f11) {
        this.f12777c = f11;
        this.f12780f = e(f11);
    }

    public void c(float f11) {
        this.f12775a = f11;
        this.f12778d = e(f11);
    }

    public void d(float f11) {
        this.f12776b = f11;
        this.f12779e = e(f11);
    }
}
