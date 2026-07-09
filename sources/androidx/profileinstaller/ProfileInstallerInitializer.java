package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.profileinstaller.f;
import com.comscore.util.crashreport.CrashReportManager;
import io.agora.base.internal.video.FactorBitrateAdjuster;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ProfileInstallerInitializer implements u9.a {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: f9.e
            @Override // java.lang.Runnable
            public final void run() {
                f.h(context);
            }
        });
    }

    @Override // u9.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: f9.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                this.f93999a.e(applicationContext);
            }
        });
        return new b();
    }

    @Override // u9.a
    public List dependencies() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(final Context context) {
        a.a(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: f9.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.f(context);
            }
        }, new Random().nextInt(Math.max(FactorBitrateAdjuster.FACTOR_BASE, 1)) + CrashReportManager.TIME_WINDOW);
    }
}
