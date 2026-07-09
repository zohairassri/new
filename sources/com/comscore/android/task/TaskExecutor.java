package com.comscore.android.task;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class TaskExecutor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f19392e = 50000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.comscore.android.task.b f19393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BlockingQueue<com.comscore.android.task.a> f19394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TaskExceptionHandler f19396d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements TaskExceptionHandler {
        a() {
        }

        @Override // com.comscore.android.task.TaskExceptionHandler
        public void exception(Exception exc, TaskExecutor taskExecutor, Runnable runnable) {
            exc.printStackTrace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f19397a;

        b(Runnable runnable) {
            this.f19397a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19397a.run();
            } catch (Exception e11) {
                TaskExecutor taskExecutor = TaskExecutor.this;
                TaskExceptionHandler taskExceptionHandler = taskExecutor.f19396d;
                if (taskExceptionHandler != null) {
                    taskExceptionHandler.exception(e11, taskExecutor, this.f19397a);
                }
            }
        }
    }

    public TaskExecutor(TaskExceptionHandler taskExceptionHandler) {
        this.f19395c = true;
        this.f19396d = taskExceptionHandler;
        this.f19394b = new LinkedBlockingQueue();
        com.comscore.android.task.b bVar = new com.comscore.android.task.b(this, this.f19396d);
        this.f19393a = bVar;
        bVar.start();
    }

    long b() {
        Iterator<com.comscore.android.task.a> it = this.f19394b.iterator();
        long jMin = f19392e;
        while (it.hasNext()) {
            jMin = Math.min(jMin, it.next().d());
        }
        return jMin;
    }

    public boolean containsTask(Runnable runnable) {
        for (com.comscore.android.task.a aVar : this.f19394b) {
            if (aVar.f() == runnable) {
                return true;
            }
            if ((runnable instanceof com.comscore.android.task.a) && aVar == runnable) {
                return true;
            }
        }
        return false;
    }

    public boolean execute(Runnable runnable) {
        return execute(runnable, true);
    }

    public boolean executeInMainThread(Runnable runnable) {
        if (this.f19395c) {
            return new Handler(Looper.getMainLooper()).post(new b(runnable));
        }
        return false;
    }

    public boolean isEnabled() {
        return this.f19395c;
    }

    public void removeAllEnqueuedTasks() {
        ArrayList arrayList = new ArrayList();
        for (com.comscore.android.task.a aVar : this.f19394b) {
            if (aVar.g()) {
                arrayList.add(aVar);
            }
        }
        this.f19394b.removeAll(arrayList);
    }

    public boolean removeEnqueuedTask(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        for (com.comscore.android.task.a aVar : this.f19394b) {
            if (aVar.f() == runnable) {
                return this.f19394b.remove(aVar);
            }
        }
        return false;
    }

    public void setEnabled(boolean z11) {
        this.f19395c = z11;
    }

    public int size() {
        return this.f19394b.size();
    }

    public void waitForLastNonDelayedTaskToFinish() {
        com.comscore.android.task.a aVar;
        int size = this.f19394b.size();
        com.comscore.android.task.a[] aVarArr = new com.comscore.android.task.a[size];
        this.f19394b.toArray(aVarArr);
        int i11 = size - 1;
        while (true) {
            if (i11 >= 0) {
                com.comscore.android.task.a aVar2 = aVarArr[i11];
                if (aVar2 != null && !aVar2.h()) {
                    aVar = aVarArr[i11];
                    break;
                }
                i11--;
            } else {
                aVar = null;
                break;
            }
        }
        waitForTaskToFinish(aVar, 0L);
    }

    public void waitForTaskToFinish(Runnable runnable, long j11) {
        com.comscore.android.task.a next;
        if (!(runnable instanceof com.comscore.android.task.a)) {
            Iterator<com.comscore.android.task.a> it = this.f19394b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.f() == runnable) {
                        break;
                    }
                }
            }
        } else {
            next = (com.comscore.android.task.a) runnable;
        }
        if (next != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (this.f19394b.contains(next)) {
                if (j11 > 0 && System.currentTimeMillis() >= jCurrentTimeMillis + j11) {
                    return;
                }
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    public void waitForTasks() {
        while (this.f19394b.size() != 0) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }
    }

    com.comscore.android.task.a a() {
        for (com.comscore.android.task.a aVar : this.f19394b) {
            if (aVar.c() <= System.currentTimeMillis()) {
                return aVar;
            }
        }
        return null;
    }

    public boolean execute(Runnable runnable, boolean z11) {
        if (z11) {
            return execute(runnable, 0L);
        }
        if (!this.f19395c) {
            return false;
        }
        try {
            runnable.run();
            return true;
        } catch (Exception e11) {
            if (this.f19396d == null) {
                return true;
            }
            this.f19396d.exception(e11, this, runnable);
            return true;
        }
    }

    void a(com.comscore.android.task.a aVar) {
        this.f19394b.remove(aVar);
    }

    public TaskExecutor() {
        this(new a());
    }

    public boolean execute(Runnable runnable, long j11) {
        return execute(runnable, j11, 0L);
    }

    public boolean execute(Runnable runnable, long j11, long j12) {
        return execute(runnable, j11, j12, false);
    }

    public boolean execute(Runnable runnable, long j11, long j12, boolean z11) {
        if (!this.f19395c) {
            return false;
        }
        for (com.comscore.android.task.a aVar : this.f19394b) {
            if (aVar != null && aVar.f() == runnable) {
                return false;
            }
        }
        this.f19394b.add(new com.comscore.android.task.a(runnable, j11, j12, z11));
        this.f19393a.a();
        return true;
    }
}
