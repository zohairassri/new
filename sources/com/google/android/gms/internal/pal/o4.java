package com.google.android.gms.internal.pal;

import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o4 implements n4 {
    protected o4() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long jZzd = zzd();
        long jZzd2 = ((n4) obj).zzd();
        if (jZzd < jZzd2) {
            return -1;
        }
        return jZzd > jZzd2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4) && zzd() == ((n4) obj).zzd();
    }

    public final int hashCode() {
        long jZzd = zzd();
        return (int) (jZzd ^ (jZzd >>> 32));
    }

    public final String toString() {
        long jZzd = zzd();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        r4.a(stringBuffer, jZzd);
        while (true) {
            if (stringBuffer.length() >= (jZzd < 0 ? 7 : 6)) {
                break;
            }
            stringBuffer.insert(jZzd < 0 ? 3 : 2, "0");
        }
        if ((jZzd / 1000) * 1000 == jZzd) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, InstructionFileId.DOT);
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
