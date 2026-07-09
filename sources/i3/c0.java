package i3;

import android.text.StaticLayout;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f103130a = new c0();

    private c0() {
    }

    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i11, int i12) {
        builder.setLineBreakConfig(b0.a().setLineBreakStyle(i11).setLineBreakWordStyle(i12).build());
    }
}
