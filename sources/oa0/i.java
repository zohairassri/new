package oa0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f120241a;

    public i(Function0 deviceIdProvider) {
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f120241a = deviceIdProvider;
    }

    private final float b(int i11) {
        String str = (String) this.f120241a.invoke();
        Intrinsics.checkNotNullExpressionValue(str.substring(str.length() - i11), "this as java.lang.String).substring(startIndex)");
        return (Integer.valueOf(r5, 16).intValue() / ((int) (Math.pow(16, i11) - ((double) 1)))) * 100;
    }

    public final float a() {
        return b(2);
    }

    public final float c() {
        return b(6);
    }

    public final Boolean d(Float f11) {
        if (f11 != null) {
            return Boolean.valueOf(f(f11.floatValue()));
        }
        return null;
    }

    public final Boolean e(Integer num) {
        return d(num != null ? Float.valueOf(num.intValue()) : null);
    }

    public final boolean f(float f11) {
        return f11 > 0.0f && f11 <= 100.0f && f11 >= c();
    }
}
