package n4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f117334a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f117335b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f117336c = new Object();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static Drawable a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getDrawable(i11, theme);
        }

        static Drawable b(Resources resources, int i11, int i12, Resources.Theme theme) {
            return resources.getDrawableForDensity(i11, i12, theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        static ColorStateList a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getColorStateList(i11, theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f117337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f117338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f117339c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f117337a = colorStateList;
            this.f117338b = configuration;
            this.f117339c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Resources f117340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Resources.Theme f117341b;

        d(Resources resources, Resources.Theme theme) {
            this.f117340a = resources;
            this.f117341b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f117340a.equals(dVar.f117340a) && w4.c.a(this.f117341b, dVar.f117341b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return w4.c.b(this.f117340a, this.f117341b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i11, Handler handler) {
            e(handler).post(new Runnable() { // from class: n4.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117344a.f(i11);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: n4.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117342a.g(typeface);
                }
            });
        }

        public abstract void f(int i11);

        public abstract void g(Typeface typeface);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class f {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        static class a {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            a.a(theme);
        }
    }

    private static void a(d dVar, int i11, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f117336c) {
            try {
                WeakHashMap weakHashMap = f117335b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i11, new c(colorStateList, dVar.f117340a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f117339c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList b(n4.k.d r5, int r6) {
        /*
            java.lang.Object r0 = n4.k.f117336c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = n4.k.f117335b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            n4.k$c r2 = (n4.k.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f117338b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f117340a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f117341b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f117339c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f117339c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f117337a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.k.b(n4.k$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i11, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i11, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i11);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListK = k(resources, i11, theme);
        if (colorStateListK == null) {
            return b.a(resources, i11, theme);
        }
        a(dVar, i11, colorStateListK, theme);
        return colorStateListK;
    }

    public static Drawable e(Resources resources, int i11, Resources.Theme theme) {
        return a.a(resources, i11, theme);
    }

    public static Drawable f(Resources resources, int i11, int i12, Resources.Theme theme) {
        return a.b(resources, i11, i12, theme);
    }

    public static Typeface g(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i11, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i11, TypedValue typedValue, int i12, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i11, typedValue, i12, eVar, null, true, false);
    }

    public static void i(Context context, int i11, e eVar, Handler handler) {
        w4.i.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            m(context, i11, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal threadLocal = f117334a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i11, Resources.Theme theme) {
        if (l(resources, i11)) {
            return null;
        }
        try {
            return n4.c.a(resources, resources.getXml(i11), theme);
        } catch (Exception e11) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e11);
            return null;
        }
    }

    private static boolean l(Resources resources, int i11) {
        TypedValue typedValueJ = j();
        resources.getValue(i11, typedValueJ, true);
        int i12 = typedValueJ.type;
        return i12 >= 28 && i12 <= 31;
    }

    private static Typeface m(Context context, int i11, TypedValue typedValue, int i12, e eVar, Handler handler, boolean z11, boolean z12) {
        Resources resources = context.getResources();
        resources.getValue(i11, typedValue, true);
        Typeface typefaceN = n(context, resources, typedValue, i11, i12, eVar, handler, z11, z12);
        if (typefaceN != null || eVar != null || z12) {
            return typefaceN;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i11) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface n(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, n4.k.e r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.k.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, n4.k$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
