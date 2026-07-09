package dq;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f90365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iq.f f90366b;

    public s(String str, iq.f fVar) {
        this.f90365a = str;
        this.f90366b = fVar;
    }

    private File b() {
        return this.f90366b.e(this.f90365a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e11) {
            aq.g.f().e("Error creating marker: " + this.f90365a, e11);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
