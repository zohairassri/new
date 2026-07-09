package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f2536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f2537d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f2538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f2539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f2540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f2541d;

        public b a() {
            return new b(this.f2538a, this.f2539b, this.f2540c, this.f2541d);
        }

        public a b(int i11) {
            this.f2538a = Integer.valueOf(i11 | (-16777216));
            return this;
        }
    }

    b(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f2534a = num;
        this.f2535b = num2;
        this.f2536c = num3;
        this.f2537d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f2534a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f2535b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f2536c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f2537d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
