package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract String C();

    public abstract long j();

    public abstract int l();

    public final String toString() {
        long j11 = j();
        int iL = l();
        String strC = C();
        int length = String.valueOf(j11).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(iL).length() + 3 + strC.length());
        sb2.append(j11);
        sb2.append("\t");
        sb2.append(iL);
        sb2.append("\t-1");
        sb2.append(strC);
        return sb2.toString();
    }
}
