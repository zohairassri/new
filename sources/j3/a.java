package j3;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104915a = new a();

    /* JADX INFO: renamed from: j3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1278a extends SegmentFinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f104916a;

        C1278a(d dVar) {
            this.f104916a = dVar;
        }

        public int nextEndBoundary(int i11) {
            return this.f104916a.c(i11);
        }

        public int nextStartBoundary(int i11) {
            return this.f104916a.a(i11);
        }

        public int previousEndBoundary(int i11) {
            return this.f104916a.d(i11);
        }

        public int previousStartBoundary(int i11) {
            return this.f104916a.b(i11);
        }
    }

    private a() {
    }

    public final SegmentFinder a(d dVar) {
        return new C1278a(dVar);
    }
}
