package kotlin.text;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class w extends v {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean r(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.w.r(java.lang.String):boolean");
    }

    public static BigInteger s(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return t(str, 10);
    }

    public static final BigInteger t(String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i12 = str.charAt(0) == '-' ? 1 : 0; i12 < length; i12++) {
                if (CharsKt__CharJVMKt.a(str.charAt(i12), i11) < 0) {
                    return null;
                }
            }
        } else if (CharsKt__CharJVMKt.a(str.charAt(0), i11) < 0) {
            return null;
        }
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i11));
    }

    public static Double u(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (r(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
