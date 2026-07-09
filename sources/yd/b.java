package yd;

import ed.e;
import java.security.MessageDigest;
import zd.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f140341b;

    public b(Object obj) {
        this.f140341b = k.d(obj);
    }

    @Override // ed.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f140341b.toString().getBytes(e.f92466a));
    }

    @Override // ed.e
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f140341b.equals(((b) obj).f140341b);
        }
        return false;
    }

    @Override // ed.e
    public int hashCode() {
        return this.f140341b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f140341b + '}';
    }
}
