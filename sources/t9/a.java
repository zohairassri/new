package t9;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C1756a f129479e = new C1756a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f129480f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f129481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f129482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lock f129483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileChannel f129484d;

    /* JADX INFO: renamed from: t9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class C1756a {
        public /* synthetic */ C1756a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f129480f) {
                try {
                    Map map = a.f129480f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }

        private C1756a() {
        }
    }

    public a(String name, File file, boolean z11) {
        File file2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f129481a = z11;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f129482b = file2;
        this.f129483c = f129479e.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = aVar.f129481a;
        }
        aVar.b(z11);
    }

    public final void b(boolean z11) {
        this.f129483c.lock();
        if (z11) {
            try {
                File file = this.f129482b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f129482b).getChannel();
                channel.lock();
                this.f129484d = channel;
            } catch (IOException e11) {
                this.f129484d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e11);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f129484d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f129483c.unlock();
    }
}
