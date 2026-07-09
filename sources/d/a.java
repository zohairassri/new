package d;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f.b f87627a;

    public final void a(Object obj, androidx.core.app.b bVar) {
        Unit unit;
        f.b bVar2 = this.f87627a;
        if (bVar2 != null) {
            bVar2.b(obj, bVar);
            unit = Unit.f111650a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void b(f.b bVar) {
        this.f87627a = bVar;
    }

    public final void c() {
        Unit unit;
        f.b bVar = this.f87627a;
        if (bVar != null) {
            bVar.c();
            unit = Unit.f111650a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
