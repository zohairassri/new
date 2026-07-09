package u6;

import android.net.Uri;
import k6.k0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f131107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f131108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f131109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f131110d;

    public i(String str, long j11, long j12) {
        this.f131109c = str == null ? "" : str;
        this.f131107a = j11;
        this.f131108b = j12;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        i iVar2 = null;
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j11 = this.f131108b;
            if (j11 != -1) {
                long j12 = this.f131107a;
                if (j12 + j11 == iVar.f131107a) {
                    long j13 = iVar.f131108b;
                    return new i(strC, j12, j13 != -1 ? j11 + j13 : -1L);
                }
            }
            long j14 = iVar.f131108b;
            if (j14 != -1) {
                long j15 = iVar.f131107a;
                if (j15 + j14 == this.f131107a) {
                    iVar2 = new i(strC, j15, j11 != -1 ? j14 + j11 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return k0.g(str, this.f131109c);
    }

    public String c(String str) {
        return k0.f(str, this.f131109c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f131107a == iVar.f131107a && this.f131108b == iVar.f131108b && this.f131109c.equals(iVar.f131109c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f131110d == 0) {
            this.f131110d = ((((527 + ((int) this.f131107a)) * 31) + ((int) this.f131108b)) * 31) + this.f131109c.hashCode();
        }
        return this.f131110d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f131109c + ", start=" + this.f131107a + ", length=" + this.f131108b + ")";
    }
}
