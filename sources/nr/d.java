package nr;

import com.google.protobuf.s;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public enum d implements s.a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final s.b f119510f = new s.b() { // from class: nr.d.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f119512a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b implements s.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s.c f119513a = new b();

        private b() {
        }
    }

    d(int i11) {
        this.f119512a = i11;
    }

    public static s.c a() {
        return b.f119513a;
    }

    @Override // com.google.protobuf.s.a
    public final int getNumber() {
        return this.f119512a;
    }
}
