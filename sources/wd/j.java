package wd;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import zd.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j extends wd.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f135134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f135135g = com.bumptech.glide.i.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final View f135136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f135137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnAttachStateChangeListener f135138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f135139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f135140e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static Integer f135141e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f135142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f135143b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f135144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC1878a f135145d;

        /* JADX INFO: renamed from: wd.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        private static final class ViewTreeObserverOnPreDrawListenerC1878a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference f135146a;

            ViewTreeObserverOnPreDrawListenerC1878a(a aVar) {
                this.f135146a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = (a) this.f135146a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f135142a = view;
        }

        private static int c(Context context) {
            if (f135141e == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f135141e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f135141e.intValue();
        }

        private int e(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            if (this.f135144c && this.f135142a.isLayoutRequested()) {
                return 0;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (this.f135142a.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f135142a.getContext());
        }

        private int f() {
            int paddingTop = this.f135142a.getPaddingTop() + this.f135142a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f135142a.getLayoutParams();
            return e(this.f135142a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f135142a.getPaddingLeft() + this.f135142a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f135142a.getLayoutParams();
            return e(this.f135142a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i11) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }

        private boolean i(int i11, int i12) {
            return h(i11) && h(i12);
        }

        private void j(int i11, int i12) {
            ArrayList arrayList = new ArrayList(this.f135143b);
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                ((h) obj).f(i11, i12);
            }
        }

        void a() {
            if (this.f135143b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f135142a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f135145d);
            }
            this.f135145d = null;
            this.f135143b.clear();
        }

        void d(h hVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                hVar.f(iG, iF);
                return;
            }
            if (!this.f135143b.contains(hVar)) {
                this.f135143b.add(hVar);
            }
            if (this.f135145d == null) {
                ViewTreeObserver viewTreeObserver = this.f135142a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC1878a viewTreeObserverOnPreDrawListenerC1878a = new ViewTreeObserverOnPreDrawListenerC1878a(this);
                this.f135145d = viewTreeObserverOnPreDrawListenerC1878a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1878a);
            }
        }

        void k(h hVar) {
            this.f135143b.remove(hVar);
        }
    }

    public j(View view) {
        this.f135136a = (View) k.d(view);
        this.f135137b = new a(view);
    }

    private Object m() {
        return this.f135136a.getTag(f135135g);
    }

    private void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f135138c;
        if (onAttachStateChangeListener == null || this.f135140e) {
            return;
        }
        this.f135136a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f135140e = true;
    }

    private void o() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f135138c;
        if (onAttachStateChangeListener == null || !this.f135140e) {
            return;
        }
        this.f135136a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f135140e = false;
    }

    private void p(Object obj) {
        f135134f = true;
        this.f135136a.setTag(f135135g, obj);
    }

    @Override // wd.i
    public vd.c b() {
        Object objM = m();
        if (objM == null) {
            return null;
        }
        if (objM instanceof vd.c) {
            return (vd.c) objM;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // wd.i
    public void d(h hVar) {
        this.f135137b.d(hVar);
    }

    @Override // wd.i
    public void f(vd.c cVar) {
        p(cVar);
    }

    @Override // wd.a, wd.i
    public void h(Drawable drawable) {
        super.h(drawable);
        n();
    }

    @Override // wd.a, wd.i
    public void j(Drawable drawable) {
        super.j(drawable);
        this.f135137b.b();
        if (this.f135139d) {
            return;
        }
        o();
    }

    @Override // wd.i
    public void k(h hVar) {
        this.f135137b.k(hVar);
    }

    public String toString() {
        return "Target for: " + this.f135136a;
    }
}
