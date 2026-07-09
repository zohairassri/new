package x7;

import com.google.common.primitives.f;
import h6.t;
import h6.u;
import zo.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137228b;

    public b(String str, String str2) {
        this.f137227a = c.f(str);
        this.f137228b = str2;
    }

    @Override // h6.u.a
    public void a(t.b bVar) {
        String str = this.f137227a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numO = f.o(this.f137228b);
                if (numO != null) {
                    bVar.r0(numO);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numO2 = f.o(this.f137228b);
                if (numO2 != null) {
                    bVar.q0(numO2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numO3 = f.o(this.f137228b);
                if (numO3 != null) {
                    bVar.s0(numO3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f137228b);
                break;
            case "GENRE":
                bVar.c0(this.f137228b);
                break;
            case "TITLE":
                bVar.p0(this.f137228b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f137228b);
                break;
            case "DISCNUMBER":
                Integer numO4 = f.o(this.f137228b);
                if (numO4 != null) {
                    bVar.X(numO4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f137228b);
                break;
            case "ARTIST":
                bVar.Q(this.f137228b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f137227a.equals(bVar.f137227a) && this.f137228b.equals(bVar.f137228b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f137227a.hashCode()) * 31) + this.f137228b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f137227a + "=" + this.f137228b;
    }
}
