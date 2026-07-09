package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class nc {
    public static oc a(oc ocVar, String[] strArr, Map map) {
        int length;
        int i11 = 0;
        if (ocVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (oc) map.get(strArr[0]);
            }
            if (length2 > 1) {
                oc ocVar2 = new oc();
                while (i11 < length2) {
                    ocVar2.F((oc) map.get(strArr[i11]));
                    i11++;
                }
                return ocVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ocVar.F((oc) map.get(strArr[0]));
                return ocVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i11 < length) {
                    ocVar.F((oc) map.get(strArr[i11]));
                    i11++;
                }
            }
        }
        return ocVar;
    }
}
