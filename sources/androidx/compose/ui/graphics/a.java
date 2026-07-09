package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import androidx.compose.ui.graphics.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final BlendMode a(int i11) {
        c.a aVar = c.f5125a;
        return c.E(i11, aVar.a()) ? BlendMode.CLEAR : c.E(i11, aVar.x()) ? BlendMode.SRC : c.E(i11, aVar.g()) ? BlendMode.DST : c.E(i11, aVar.B()) ? BlendMode.SRC_OVER : c.E(i11, aVar.k()) ? BlendMode.DST_OVER : c.E(i11, aVar.z()) ? BlendMode.SRC_IN : c.E(i11, aVar.i()) ? BlendMode.DST_IN : c.E(i11, aVar.A()) ? BlendMode.SRC_OUT : c.E(i11, aVar.j()) ? BlendMode.DST_OUT : c.E(i11, aVar.y()) ? BlendMode.SRC_ATOP : c.E(i11, aVar.h()) ? BlendMode.DST_ATOP : c.E(i11, aVar.C()) ? BlendMode.XOR : c.E(i11, aVar.t()) ? BlendMode.PLUS : c.E(i11, aVar.q()) ? BlendMode.MODULATE : c.E(i11, aVar.v()) ? BlendMode.SCREEN : c.E(i11, aVar.s()) ? BlendMode.OVERLAY : c.E(i11, aVar.e()) ? BlendMode.DARKEN : c.E(i11, aVar.o()) ? BlendMode.LIGHTEN : c.E(i11, aVar.d()) ? BlendMode.COLOR_DODGE : c.E(i11, aVar.c()) ? BlendMode.COLOR_BURN : c.E(i11, aVar.m()) ? BlendMode.HARD_LIGHT : c.E(i11, aVar.w()) ? BlendMode.SOFT_LIGHT : c.E(i11, aVar.f()) ? BlendMode.DIFFERENCE : c.E(i11, aVar.l()) ? BlendMode.EXCLUSION : c.E(i11, aVar.r()) ? BlendMode.MULTIPLY : c.E(i11, aVar.n()) ? BlendMode.HUE : c.E(i11, aVar.u()) ? BlendMode.SATURATION : c.E(i11, aVar.b()) ? BlendMode.COLOR : c.E(i11, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }
}
