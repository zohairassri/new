package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class sn5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sn5 f34958d = new sn5(new zu[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o04 f34960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34961c;

    static {
        String str = yy2.f38899a;
        Integer.toString(0, 36);
    }

    public sn5(zu... zuVarArr) {
        this.f34960b = o04.B(zuVarArr);
        this.f34959a = zuVarArr.length;
        int i11 = 0;
        while (i11 < this.f34960b.size()) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < this.f34960b.size(); i13++) {
                if (((zu) this.f34960b.get(i11)).equals(this.f34960b.get(i13))) {
                    y22.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i11 = i12;
        }
    }

    public final zu a(int i11) {
        return (zu) this.f34960b.get(i11);
    }

    public final int b(zu zuVar) {
        int iIndexOf = this.f34960b.indexOf(zuVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final o04 c() {
        return o04.A(p14.c(this.f34960b, rn5.f34282a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sn5.class == obj.getClass()) {
            sn5 sn5Var = (sn5) obj;
            if (this.f34959a == sn5Var.f34959a && this.f34960b.equals(sn5Var.f34960b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f34961c;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = this.f34960b.hashCode();
        this.f34961c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.f34960b.toString();
    }
}
