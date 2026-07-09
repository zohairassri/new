package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final Object f7215h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap f7216i = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f7217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f7218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f7219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f7220d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f7221e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f7222f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ArrayList f7223g = null;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class a extends AsyncTask {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                d dVarA = JobIntentService.this.a();
                if (dVarA == null) {
                    return null;
                }
                JobIntentService.this.d(dVarA.getIntent());
                dVarA.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            JobIntentService.this.f();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            JobIntentService.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface b {
        IBinder a();

        d b();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f7225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f7226b;

        c(Intent intent, int i11) {
            this.f7225a = intent;
            this.f7226b = i11;
        }

        @Override // androidx.core.app.JobIntentService.d
        public void e() {
            JobIntentService.this.stopSelf(this.f7226b);
        }

        @Override // androidx.core.app.JobIntentService.d
        public Intent getIntent() {
            return this.f7225a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface d {
        void e();

        Intent getIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class e extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final JobIntentService f7228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f7229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        JobParameters f7230c;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final JobWorkItem f7231a;

            a(JobWorkItem jobWorkItem) {
                this.f7231a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.d
            public void e() {
                synchronized (e.this.f7229b) {
                    try {
                        JobParameters jobParameters = e.this.f7230c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f7231a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.d
            public Intent getIntent() {
                return this.f7231a.getIntent();
            }
        }

        e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f7229b = new Object();
            this.f7228a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.b
        public d b() {
            synchronized (this.f7229b) {
                try {
                    JobParameters jobParameters = this.f7230c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f7228a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f7230c = jobParameters;
            this.f7228a.c(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f7228a.b();
            synchronized (this.f7229b) {
                this.f7230c = null;
            }
            return zB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class f {
        public abstract void a();

        public abstract void b();

        public abstract void c();
    }

    d a() {
        b bVar = this.f7217a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f7223g) {
            try {
                if (this.f7223g.size() <= 0) {
                    return null;
                }
                return (d) this.f7223g.remove(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean b() {
        a aVar = this.f7219c;
        if (aVar != null) {
            aVar.cancel(this.f7220d);
        }
        this.f7221e = true;
        return e();
    }

    void c(boolean z11) {
        if (this.f7219c == null) {
            this.f7219c = new a();
            this.f7219c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected abstract void d(Intent intent);

    public boolean e() {
        return true;
    }

    void f() {
        ArrayList arrayList = this.f7223g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f7219c = null;
                    ArrayList arrayList2 = this.f7223g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        c(false);
                    } else if (!this.f7222f) {
                        this.f7218b.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f7217a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f7217a = new e(this);
        this.f7218b = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f7223g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f7222f = true;
                this.f7218b.a();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        if (this.f7223g == null) {
            return 2;
        }
        this.f7218b.c();
        synchronized (this.f7223g) {
            ArrayList arrayList = this.f7223g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c(intent, i12));
            c(true);
        }
        return 3;
    }
}
