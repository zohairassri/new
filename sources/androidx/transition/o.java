package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class o implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f12979a;

    o() {
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f11, Rect rect, Rect rect2) {
        int i11 = rect.left + ((int) ((rect2.left - r0) * f11));
        int i12 = rect.top + ((int) ((rect2.top - r1) * f11));
        int i13 = rect.right + ((int) ((rect2.right - r2) * f11));
        int i14 = rect.bottom + ((int) ((rect2.bottom - r6) * f11));
        Rect rect3 = this.f12979a;
        if (rect3 == null) {
            return new Rect(i11, i12, i13, i14);
        }
        rect3.set(i11, i12, i13, i14);
        return this.f12979a;
    }

    o(Rect rect) {
        this.f12979a = rect;
    }
}
