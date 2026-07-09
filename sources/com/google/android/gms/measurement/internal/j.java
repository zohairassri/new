package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.v6;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f43088a;

    j() {
        this.f43088a = new EnumMap(v6.a.class);
    }

    public static j b(String str) {
        EnumMap enumMap = new EnumMap(v6.a.class);
        if (str.length() >= v6.a.values().length) {
            int i11 = 0;
            if (str.charAt(0) == '1') {
                v6.a[] aVarArrValues = v6.a.values();
                int length = aVarArrValues.length;
                int i12 = 1;
                while (i11 < length) {
                    enumMap.put(aVarArrValues[i11], i.b(str.charAt(i12)));
                    i11++;
                    i12++;
                }
                return new j(enumMap);
            }
        }
        return new j();
    }

    public final i a(v6.a aVar) {
        i iVar = (i) this.f43088a.get(aVar);
        return iVar == null ? i.UNSET : iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.measurement.internal.v6.a r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.i r0 = com.google.android.gms.measurement.internal.i.UNSET
            r1 = -20
            if (r4 == r1) goto L17
            r1 = -10
            if (r4 == r1) goto L14
            if (r4 == 0) goto L17
            r1 = 30
            if (r4 == r1) goto L11
            goto L19
        L11:
            com.google.android.gms.measurement.internal.i r0 = com.google.android.gms.measurement.internal.i.INITIALIZATION
            goto L19
        L14:
            com.google.android.gms.measurement.internal.i r0 = com.google.android.gms.measurement.internal.i.MANIFEST
            goto L19
        L17:
            com.google.android.gms.measurement.internal.i r0 = com.google.android.gms.measurement.internal.i.API
        L19:
            java.util.EnumMap r2 = r2.f43088a
            r2.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.c(com.google.android.gms.measurement.internal.v6$a, int):void");
    }

    public final void d(v6.a aVar, i iVar) {
        this.f43088a.put(aVar, iVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (v6.a aVar : v6.a.values()) {
            i iVar = (i) this.f43088a.get(aVar);
            if (iVar == null) {
                iVar = i.UNSET;
            }
            sb2.append(iVar.f43063a);
        }
        return sb2.toString();
    }

    private j(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(v6.a.class);
        this.f43088a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
