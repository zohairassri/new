package o6;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f120065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f120066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f120067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f120068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f120069f;

    public c(String str, long j11, long j12, long j13, File file) {
        this.f120064a = str;
        this.f120065b = j11;
        this.f120066c = j12;
        this.f120067d = file != null;
        this.f120068e = file;
        this.f120069f = j13;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        if (!this.f120064a.equals(cVar.f120064a)) {
            return this.f120064a.compareTo(cVar.f120064a);
        }
        long j11 = this.f120065b - cVar.f120065b;
        if (j11 == 0) {
            return 0;
        }
        return j11 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f120067d;
    }

    public boolean c() {
        return this.f120066c == -1;
    }

    public String toString() {
        return "[" + this.f120065b + ", " + this.f120066c + "]";
    }
}
