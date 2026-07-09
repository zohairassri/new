package r6;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k2 f123842d = new k2("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f123844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f123845c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f123846a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            k6.a.g(this.f123846a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f123846a = logSessionId;
        }
    }

    public k2(String str) {
        this.f123843a = str;
        this.f123844b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.f123845c = new Object();
    }

    public synchronized LogSessionId a() {
        return ((a) k6.a.e(this.f123844b)).f123846a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) k6.a.e(this.f123844b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return Objects.equals(this.f123843a, k2Var.f123843a) && Objects.equals(this.f123844b, k2Var.f123844b) && Objects.equals(this.f123845c, k2Var.f123845c);
    }

    public int hashCode() {
        return Objects.hash(this.f123843a, this.f123844b, this.f123845c);
    }
}
