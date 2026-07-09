package qd0;

import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: qd0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1635a implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f122687b = new C1635a("TEXT_MAP");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f122688c = new C1635a("TEXT_MAP_INJECT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f122689d = new C1635a("TEXT_MAP_EXTRACT");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f122690e = new C1635a("HTTP_HEADERS");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f122691f = new C1635a("BINARY");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f122692g = new C1635a("BINARY_INJECT");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f122693h = new C1635a("BINARY_EXTRACT");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f122694a;

        private C1635a(String str) {
            this.f122694a = str;
        }

        public String toString() {
            return C1635a.class.getSimpleName() + InstructionFileId.DOT + this.f122694a;
        }
    }
}
