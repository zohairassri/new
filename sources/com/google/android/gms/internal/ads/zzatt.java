package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzatt extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzatt(ui uiVar, si siVar, long j11) {
        int i11 = (((((~2143124030) & 85005376) | 430547086) + ((2143124030 & 878451808) | 1894615585)) - (-2031609844)) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i11];
        objArr[0] = Long.valueOf(uiVar.a());
        objArr[1] = Long.valueOf(siVar.a());
        int i12 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        Long lValueOf = Long.valueOf(j11);
        objArr[i12] = lValueOf;
        super(String.format(locale, jj.a("bk3t6gFTc30="), objArr));
        Optional.of(siVar);
        Optional.of(lValueOf);
    }

    public zzatt(ui uiVar, Throwable th2) {
        super(String.format(Locale.US, jj.a("bk0="), Long.valueOf(uiVar.a())), th2);
        Optional.empty();
        Optional.empty();
    }
}
