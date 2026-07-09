package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f12975a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property f12976b = new a(Float.class, "translationAlpha");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property f12977c = new b(Rect.class, "clipBounds");

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(i0.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f11) {
            i0.f(view, f11.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static void a(View view) {
        f12975a.a(view);
    }

    static float b(View view) {
        return f12975a.b(view);
    }

    static void c(View view) {
        f12975a.c(view);
    }

    static void d(View view, Matrix matrix) {
        f12975a.d(view, matrix);
    }

    static void e(View view, int i11, int i12, int i13, int i14) {
        f12975a.e(view, i11, i12, i13, i14);
    }

    static void f(View view, float f11) {
        f12975a.f(view, f11);
    }

    static void g(View view, int i11) {
        f12975a.g(view, i11);
    }

    static void h(View view, Matrix matrix) {
        f12975a.h(view, matrix);
    }

    static void i(View view, Matrix matrix) {
        f12975a.i(view, matrix);
    }
}
