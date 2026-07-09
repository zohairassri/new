package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfb extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39748b;

    public zzfb(int i11, int i12) {
        String string;
        if (i11 == 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 46);
            sb2.append("Player stuck buffering and not loading for ");
            sb2.append(i12);
            sb2.append(" ms");
            string = sb2.toString();
        } else if (i11 == 1) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 47);
            sb3.append("Player stuck buffering with no progress for ");
            sb3.append(i12);
            sb3.append(" ms");
            string = sb3.toString();
        } else if (i11 == 2) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(i12).length() + 45);
            sb4.append("Player stuck playing with no progress for ");
            sb4.append(i12);
            sb4.append(" ms");
            string = sb4.toString();
        } else if (i11 != 3) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i12).length() + 31);
            sb5.append("Player stuck suppressed for ");
            sb5.append(i12);
            sb5.append(" ms");
            string = sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder(String.valueOf(i12).length() + 43);
            sb6.append("Player stuck playing without ending for ");
            sb6.append(i12);
            sb6.append(" ms");
            string = sb6.toString();
        }
        super(string);
        this.f39747a = i11;
        this.f39748b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfb.class == obj.getClass()) {
            zzfb zzfbVar = (zzfb) obj;
            if (this.f39747a == zzfbVar.f39747a && this.f39748b == zzfbVar.f39748b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f39747a + 527) * 31) + this.f39748b;
    }
}
