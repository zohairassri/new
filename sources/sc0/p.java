package sc0;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f126418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f126419b;

    static {
        Logger logger = Logger.getLogger(p.class.getName());
        f126418a = logger;
        p pVarA = o.a();
        f126419b = pVarA;
        if (pVarA.getClass() != p.class) {
            logger.log(Level.FINE, "Using the APIs optimized for: {0}", pVarA.c());
        }
    }

    public static p b() {
        return f126419b;
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    String c() {
        return "Java 8";
    }
}
