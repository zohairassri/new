package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzxo {
    private static final int zza;

    static {
        int i11;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]", 3);
            i11 = Integer.parseInt(strArrSplit[0]);
            if (i11 == 1) {
                i11 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 1;
            }
        } catch (NumberFormatException unused) {
            i11 = -1;
        }
        if (i11 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = 0; i12 < property.length(); i12++) {
                    char cCharAt = property.charAt(i12);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb2.append(cCharAt);
                }
                i11 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
        }
        if (i11 == -1) {
            i11 = 6;
        }
        zza = i11;
    }

    public static boolean zza() {
        return zza >= 9;
    }
}
