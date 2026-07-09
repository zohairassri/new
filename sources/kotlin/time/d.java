package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class d {
    public static final double a(double d11, rf0.b sourceUnit, rf0.b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.b().convert(1L, sourceUnit.b());
        return jConvert > 0 ? d11 * jConvert : d11 / sourceUnit.b().convert(1L, targetUnit.b());
    }

    public static final long b(long j11, rf0.b sourceUnit, rf0.b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.b().convert(j11, sourceUnit.b());
    }

    public static final long c(long j11, rf0.b sourceUnit, rf0.b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.b().convert(j11, sourceUnit.b());
    }
}
