package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f7384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f7385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f7386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f7387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f7388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f7389f;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f7386c = false;
        if (contentLoadingProgressBar.f7387d) {
            return;
        }
        contentLoadingProgressBar.f7384a = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void b(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f7385b = false;
        contentLoadingProgressBar.f7384a = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    private void c() {
        removeCallbacks(this.f7388e);
        removeCallbacks(this.f7389f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7384a = -1L;
        this.f7385b = false;
        this.f7386c = false;
        this.f7387d = false;
        this.f7388e = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.b(this.f7452a);
            }
        };
        this.f7389f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.a(this.f7453a);
            }
        };
    }
}
