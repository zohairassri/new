package l6;

import h6.u;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113269a;

    public c(int i11) {
        this.f113269a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f113269a == ((c) obj).f113269a;
    }

    public int hashCode() {
        return this.f113269a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f113269a;
    }
}
