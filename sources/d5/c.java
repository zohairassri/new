package d5;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f89289i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f89290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LayoutInflater f89291m;

    public c(Context context, int i11, Cursor cursor, boolean z11) {
        super(context, cursor, z11);
        this.f89290l = i11;
        this.f89289i = i11;
        this.f89291m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // d5.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f89291m.inflate(this.f89290l, viewGroup, false);
    }

    @Override // d5.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f89291m.inflate(this.f89289i, viewGroup, false);
    }
}
