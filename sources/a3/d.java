package a3;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f148a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void d(ViewStructure viewStructure, int i11, int i12, int i13, int i14, int i15, int i16) {
            viewStructure.setDimens(i11, i12, i13, i14, i15, i16);
        }

        static void e(ViewStructure viewStructure, int i11, String str, String str2, String str3) {
            viewStructure.setId(i11, str, str2, str3);
        }

        static void f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void g(ViewStructure viewStructure, float f11, int i11, int i12, int i13) {
            viewStructure.setTextStyle(f11, i11, i12, i13);
        }
    }

    private d(ViewStructure viewStructure) {
        this.f148a = viewStructure;
    }

    public static d i(ViewStructure viewStructure) {
        return new d(viewStructure);
    }

    public Bundle a() {
        return a.a((ViewStructure) this.f148a);
    }

    public void b(String str) {
        a.b((ViewStructure) this.f148a, str);
    }

    public void c(CharSequence charSequence) {
        a.c((ViewStructure) this.f148a, charSequence);
    }

    public void d(int i11, int i12, int i13, int i14, int i15, int i16) {
        a.d((ViewStructure) this.f148a, i11, i12, i13, i14, i15, i16);
    }

    public void e(int i11, String str, String str2, String str3) {
        a.e((ViewStructure) this.f148a, i11, str, str2, str3);
    }

    public void f(CharSequence charSequence) {
        a.f((ViewStructure) this.f148a, charSequence);
    }

    public void g(float f11, int i11, int i12, int i13) {
        a.g((ViewStructure) this.f148a, f11, i11, i12, i13);
    }

    public ViewStructure h() {
        return (ViewStructure) this.f148a;
    }
}
