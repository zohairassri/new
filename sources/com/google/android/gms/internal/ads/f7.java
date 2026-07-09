package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f7 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26087b;

    public f7(String str, String str2) {
        this.f26086a = sw3.b(str);
        this.f26087b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.gd
    public final void a(fb fbVar) {
        Integer numH;
        Integer numH2;
        Integer numH3;
        Integer numH4;
        String str = this.f26086a;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numH = i44.h(this.f26087b, 10)) != null) {
                    fbVar.E(numH);
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numH2 = i44.h(this.f26087b, 10)) != null) {
                    fbVar.P(numH2);
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numH3 = i44.h(this.f26087b, 10)) != null) {
                    fbVar.D(numH3);
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    fbVar.z(this.f26087b);
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    fbVar.Q(this.f26087b);
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    fbVar.x(this.f26087b);
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    fbVar.B(this.f26087b);
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numH4 = i44.h(this.f26087b, 10)) != null) {
                    fbVar.O(numH4);
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    fbVar.A(this.f26087b);
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    fbVar.y(this.f26087b);
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f7 f7Var = (f7) obj;
            if (this.f26086a.equals(f7Var.f26086a) && this.f26087b.equals(f7Var.f26087b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f26086a.hashCode() + 527) * 31) + this.f26087b.hashCode();
    }

    public final String toString() {
        String str = this.f26086a;
        int length = String.valueOf(str).length();
        String str2 = this.f26087b;
        StringBuilder sb2 = new StringBuilder(length + 5 + String.valueOf(str2).length());
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }
}
