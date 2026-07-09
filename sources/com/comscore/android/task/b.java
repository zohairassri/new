package com.comscore.android.task;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19408a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f19409b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TaskExecutor f19410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TaskExceptionHandler f19411d;

    b(TaskExecutor taskExecutor, TaskExceptionHandler taskExceptionHandler) {
        this.f19411d = taskExceptionHandler;
        this.f19410c = taskExecutor;
    }

    void a() {
        synchronized (this.f19409b) {
            this.f19409b.notify();
        }
    }

    void b() {
        this.f19408a = true;
    }

    boolean c() {
        return this.f19408a;
    }

    void d() {
        long jB = this.f19410c.b();
        if (jB > 0) {
            a(jB);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        TaskExceptionHandler taskExceptionHandler;
        while (!c()) {
            a aVarA = this.f19410c.a();
            if (aVarA != null) {
                aVarA.run();
                if (aVarA.b() != null && (taskExceptionHandler = this.f19411d) != null) {
                    taskExceptionHandler.exception(aVarA.b(), this.f19410c, aVarA.f());
                }
                this.f19410c.a(aVarA);
                if (aVarA.j()) {
                    this.f19410c.execute(aVarA.f(), aVarA.e(), aVarA.e());
                }
            } else {
                d();
            }
        }
    }

    private void a(long j11) {
        synchronized (this.f19409b) {
            try {
                this.f19409b.wait(j11);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }
    }
}
