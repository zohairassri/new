package sc0;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final TimeUnit f126428e = TimeUnit.MINUTES;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Logger f126429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f126430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f126431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s f126432d;

    public x(Logger logger) {
        this(logger, rc0.b.getDefault());
    }

    x(Logger logger, rc0.b bVar) {
        this.f126430b = new AtomicBoolean(false);
        this.f126429a = logger;
        TimeUnit timeUnit = f126428e;
        this.f126431c = new s(5.0d / timeUnit.toSeconds(1L), 5.0d, bVar);
        this.f126432d = new s(5.0d / timeUnit.toSeconds(1L), 1.0d, bVar);
    }
}
