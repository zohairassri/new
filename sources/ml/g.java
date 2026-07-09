package ml;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f116770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f116771b;

    public g() {
        this(d.f116754a);
    }

    public synchronized void a() {
        while (!this.f116771b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z11 = false;
        while (!this.f116771b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z11;
        z11 = this.f116771b;
        this.f116771b = false;
        return z11;
    }

    public synchronized boolean d() {
        return this.f116771b;
    }

    public synchronized boolean e() {
        if (this.f116771b) {
            return false;
        }
        this.f116771b = true;
        notifyAll();
        return true;
    }

    public g(d dVar) {
        this.f116770a = dVar;
    }
}
