package dq;

import dq.c0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class c extends c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f90232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f90233b;

    c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f90232a = str;
        this.f90233b = str2;
    }

    @Override // dq.c0.a
    public String c() {
        return this.f90232a;
    }

    @Override // dq.c0.a
    public String d() {
        return this.f90233b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.a) {
            c0.a aVar = (c0.a) obj;
            if (this.f90232a.equals(aVar.c()) && ((str = this.f90233b) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f90232a.hashCode() ^ 1000003) * 1000003;
        String str = this.f90233b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f90232a + ", firebaseInstallationId=" + this.f90233b + "}";
    }
}
