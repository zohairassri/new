package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class g extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f12963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12964b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static float a(View view) {
            return view.getZ();
        }
    }

    g(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f12963a = viewGroup;
        viewGroup.setTag(n.ghost_view_holder, this);
        this.f12963a.getOverlay().add(this);
        this.f12964b = true;
    }

    static g b(ViewGroup viewGroup) {
        return (g) viewGroup.getTag(n.ghost_view_holder);
    }

    private int c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i11 = 0;
        while (i11 <= childCount) {
            int i12 = (i11 + childCount) / 2;
            d(((h) getChildAt(i12)).f12970c, arrayList2);
            if (f(arrayList, arrayList2)) {
                i11 = i12 + 1;
            } else {
                childCount = i12 - 1;
            }
            arrayList2.clear();
        }
        return i11;
    }

    private static void d(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (a.a(view) != a.a(view2)) {
            return a.a(view) > a.a(view2);
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(h0.a(viewGroup, i11));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                return true;
            }
        }
        return true;
    }

    private static boolean f(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i11 = 1; i11 < iMin; i11++) {
            View view = (View) arrayList.get(i11);
            View view2 = (View) arrayList2.get(i11);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    void a(h hVar) {
        ArrayList arrayList = new ArrayList();
        d(hVar.f12970c, arrayList);
        int iC = c(arrayList);
        if (iC < 0 || iC >= getChildCount()) {
            addView(hVar);
        } else {
            addView(hVar, iC);
        }
    }

    void g() {
        if (!this.f12964b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.f12963a.getOverlay().remove(this);
        this.f12963a.getOverlay().add(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f12964b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f12963a.setTag(n.ghost_view_holder, null);
            this.f12963a.getOverlay().remove(this);
            this.f12964b = false;
        }
    }
}
