package x4;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f137029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137030b;

    public c0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f137030b | this.f137029a;
    }

    public void b(View view, View view2, int i11) {
        c(view, view2, i11, 0);
    }

    public void c(View view, View view2, int i11, int i12) {
        if (i12 == 1) {
            this.f137030b = i11;
        } else {
            this.f137029a = i11;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i11) {
        if (i11 == 1) {
            this.f137030b = 0;
        } else {
            this.f137029a = 0;
        }
    }
}
