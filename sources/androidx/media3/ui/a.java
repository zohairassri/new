package androidx.media3.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f11201g = new a(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f11207f;

    public a(int i11, int i12, int i13, int i14, int i15, Typeface typeface) {
        this.f11202a = i11;
        this.f11203b = i12;
        this.f11204c = i13;
        this.f11205d = i14;
        this.f11206e = i15;
        this.f11207f = typeface;
    }

    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f11201g.f11202a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f11201g.f11203b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f11201g.f11204c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f11201g.f11205d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f11201g.f11206e, captionStyle.getTypeface());
    }
}
