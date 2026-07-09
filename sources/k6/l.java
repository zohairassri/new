package k6;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f107629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f107630b;

    public l() {
        this(i.f107617a);
    }

    public synchronized void a() {
        while (!this.f107630b) {
            this.f107629a.e();
            wait();
        }
    }

    public synchronized void b() {
        boolean z11 = false;
        while (!this.f107630b) {
            try {
                this.f107629a.e();
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c(long j11) {
        if (j11 <= 0) {
            return this.f107630b;
        }
        long jB = this.f107629a.b();
        long j12 = j11 + jB;
        if (j12 < jB) {
            b();
        } else {
            boolean z11 = false;
            while (!this.f107630b && jB < j12) {
                try {
                    this.f107629a.e();
                    wait(j12 - jB);
                } catch (InterruptedException unused) {
                    z11 = true;
                }
                jB = this.f107629a.b();
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f107630b;
    }

    public synchronized boolean d() {
        boolean z11;
        z11 = this.f107630b;
        this.f107630b = false;
        return z11;
    }

    public synchronized boolean e() {
        return this.f107630b;
    }

    public synchronized boolean f() {
        if (this.f107630b) {
            return false;
        }
        this.f107630b = true;
        notifyAll();
        return true;
    }

    public l(i iVar) {
        this.f107629a = iVar;
    }
}
