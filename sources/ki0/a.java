package ki0;

import kotlin.jvm.internal.LongCompanionObject;
import rx.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final d f110961g = new C1341a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f110962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f110963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f110964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f110965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f110966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f110967f;

    public void a() {
        while (true) {
            synchronized (this) {
                try {
                    long j11 = this.f110965d;
                    long j12 = this.f110966e;
                    d dVar = this.f110967f;
                    if (j11 == 0 && j12 == 0 && dVar == null) {
                        this.f110964c = false;
                        return;
                    }
                    this.f110965d = 0L;
                    this.f110966e = 0L;
                    this.f110967f = null;
                    long j13 = this.f110962a;
                    if (j13 != LongCompanionObject.MAX_VALUE) {
                        long j14 = j13 + j11;
                        if (j14 < 0 || j14 == LongCompanionObject.MAX_VALUE) {
                            this.f110962a = LongCompanionObject.MAX_VALUE;
                            j13 = Long.MAX_VALUE;
                        } else {
                            j13 = j14 - j12;
                            if (j13 < 0) {
                                throw new IllegalStateException("more produced than requested");
                            }
                            this.f110962a = j13;
                        }
                    }
                    if (dVar == null) {
                        d dVar2 = this.f110963b;
                        if (dVar2 != null && j11 != 0) {
                            dVar2.request(j11);
                        }
                    } else if (dVar == f110961g) {
                        this.f110963b = null;
                    } else {
                        this.f110963b = dVar;
                        dVar.request(j13);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void b(long j11) {
        if (j11 <= 0) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            try {
                if (this.f110964c) {
                    this.f110966e += j11;
                    return;
                }
                this.f110964c = true;
                try {
                    long j12 = this.f110962a;
                    if (j12 != LongCompanionObject.MAX_VALUE) {
                        long j13 = j12 - j11;
                        if (j13 < 0) {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                        this.f110962a = j13;
                    }
                    a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f110964c = false;
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    public void c(d dVar) {
        synchronized (this) {
            try {
                if (this.f110964c) {
                    if (dVar == null) {
                        dVar = f110961g;
                    }
                    this.f110967f = dVar;
                    return;
                }
                this.f110964c = true;
                try {
                    this.f110963b = dVar;
                    if (dVar != null) {
                        dVar.request(this.f110962a);
                    }
                    a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f110964c = false;
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    @Override // rx.d
    public void request(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j11 == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f110964c) {
                    this.f110965d += j11;
                    return;
                }
                this.f110964c = true;
                try {
                    long j12 = this.f110962a + j11;
                    if (j12 < 0) {
                        j12 = LongCompanionObject.MAX_VALUE;
                    }
                    this.f110962a = j12;
                    d dVar = this.f110963b;
                    if (dVar != null) {
                        dVar.request(j11);
                    }
                    a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f110964c = false;
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: ki0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class C1341a implements d {
        C1341a() {
        }

        @Override // rx.d
        public void request(long j11) {
        }
    }
}
