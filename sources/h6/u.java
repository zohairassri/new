package h6;

import h6.t;
import java.util.Arrays;
import java.util.List;
import k6.n0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[] f100391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100392b;

    public u(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public u a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new u(this.f100392b, (a[]) n0.S0(this.f100391a, aVarArr));
    }

    public u b(u uVar) {
        return uVar == null ? this : a(uVar.f100391a);
    }

    public u c(long j11) {
        return this.f100392b == j11 ? this : new u(j11, this.f100391a);
    }

    public a d(int i11) {
        return this.f100391a[i11];
    }

    public int e() {
        return this.f100391a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (Arrays.equals(this.f100391a, uVar.f100391a) && this.f100392b == uVar.f100392b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f100391a) * 31) + com.google.common.primitives.h.c(this.f100392b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f100391a));
        if (this.f100392b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f100392b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public u(long j11, a... aVarArr) {
        this.f100392b = j11;
        this.f100391a = aVarArr;
    }

    public u(List list) {
        this((a[]) list.toArray(new a[0]));
    }

    public u(long j11, List list) {
        this(j11, (a[]) list.toArray(new a[0]));
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        default byte[] E() {
            return null;
        }

        default androidx.media3.common.a e() {
            return null;
        }

        default void a(t.b bVar) {
        }
    }
}
