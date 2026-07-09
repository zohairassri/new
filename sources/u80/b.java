package u80;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f131156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f131157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f131158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View.OnClickListener f131159d;

    public b(int i11, String str, View.OnClickListener onClickListener) {
        this.f131157b = i11;
        this.f131158c = str;
        this.f131159d = onClickListener;
    }

    public final View.OnClickListener a() {
        return this.f131159d;
    }

    public final Drawable b() {
        return this.f131156a;
    }

    public final int c() {
        return this.f131157b;
    }

    public final String d() {
        return this.f131158c;
    }
}
