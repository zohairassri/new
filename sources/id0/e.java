package id0;

import io.opentelemetry.api.trace.StatusCode;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final g f103649a = d(StatusCode.OK, "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final g f103650b = d(StatusCode.UNSET, "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final g f103651c = d(StatusCode.ERROR, "");

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103652a;

        static {
            int[] iArr = new int[StatusCode.values().length];
            f103652a = iArr;
            try {
                iArr[StatusCode.UNSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103652a[StatusCode.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103652a[StatusCode.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    e() {
    }

    static g a(StatusCode statusCode, String str) {
        if (str == null || str.isEmpty()) {
            int i11 = a.f103652a[statusCode.ordinal()];
            if (i11 == 1) {
                return g.b();
            }
            if (i11 == 2) {
                return g.c();
            }
            if (i11 == 3) {
                return g.m();
            }
        }
        return d(statusCode, str);
    }

    private static g d(StatusCode statusCode, String str) {
        return new b(statusCode, str);
    }
}
