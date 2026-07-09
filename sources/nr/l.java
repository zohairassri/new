package nr;

import com.google.protobuf.s;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public enum l implements s.a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final s.b f119543d = new s.b() { // from class: nr.l.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f119545a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b implements s.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s.c f119546a = new b();

        private b() {
        }
    }

    l(int i11) {
        this.f119545a = i11;
    }

    public static l a(int i11) {
        if (i11 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i11 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static s.c b() {
        return b.f119546a;
    }

    @Override // com.google.protobuf.s.a
    public final int getNumber() {
        return this.f119545a;
    }
}
