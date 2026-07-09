package x4;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayCutout f137096a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static List a(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private j(DisplayCutout displayCutout) {
        this.f137096a = displayCutout;
    }

    static j g(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    public List a() {
        return a.a(this.f137096a);
    }

    public int b() {
        return a.b(this.f137096a);
    }

    public int c() {
        return a.c(this.f137096a);
    }

    public int d() {
        return a.d(this.f137096a);
    }

    public int e() {
        return a.e(this.f137096a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return w4.c.a(this.f137096a, ((j) obj).f137096a);
    }

    public o4.f f() {
        return Build.VERSION.SDK_INT >= 30 ? o4.f.e(b.a(this.f137096a)) : o4.f.f120017e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f137096a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f137096a + "}";
    }
}
