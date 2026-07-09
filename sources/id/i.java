package id;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f103626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103627d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f103628i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f103629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f103630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f103631c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f103633e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f103632d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f103634f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f103635g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f103636h = 4194304;

        public a(Context context) {
            this.f103633e = f103628i;
            this.f103629a = context;
            this.f103630b = (ActivityManager) context.getSystemService("activity");
            this.f103631c = new b(context.getResources().getDisplayMetrics());
            if (i.e(this.f103630b)) {
                this.f103633e = 0.0f;
            }
        }

        public i a() {
            return new i(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f103637a;

        b(DisplayMetrics displayMetrics) {
            this.f103637a = displayMetrics;
        }

        @Override // id.i.c
        public int a() {
            return this.f103637a.heightPixels;
        }

        @Override // id.i.c
        public int b() {
            return this.f103637a.widthPixels;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f103626c = aVar.f103629a;
        int i11 = e(aVar.f103630b) ? aVar.f103636h / 2 : aVar.f103636h;
        this.f103627d = i11;
        int iC = c(aVar.f103630b, aVar.f103634f, aVar.f103635g);
        float fB = aVar.f103631c.b() * aVar.f103631c.a() * 4;
        int iRound = Math.round(aVar.f103633e * fB);
        int iRound2 = Math.round(fB * aVar.f103632d);
        int i12 = iC - i11;
        if (iRound2 + iRound <= i12) {
            this.f103625b = iRound2;
            this.f103624a = iRound;
        } else {
            float f11 = i12;
            float f12 = aVar.f103633e;
            float f13 = aVar.f103632d;
            float f14 = f11 / (f12 + f13);
            this.f103625b = Math.round(f13 * f14);
            this.f103624a = Math.round(f14 * aVar.f103633e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            f(this.f103625b);
            f(this.f103624a);
            f(i11);
            f(iC);
            aVar.f103630b.getMemoryClass();
            e(aVar.f103630b);
        }
    }

    private static int c(ActivityManager activityManager, float f11, float f12) {
        float memoryClass = activityManager.getMemoryClass() * Constants.MB;
        if (e(activityManager)) {
            f11 = f12;
        }
        return Math.round(memoryClass * f11);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i11) {
        return Formatter.formatFileSize(this.f103626c, i11);
    }

    public int a() {
        return this.f103627d;
    }

    public int b() {
        return this.f103624a;
    }

    public int d() {
        return this.f103625b;
    }
}
