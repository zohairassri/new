package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.f f11753a = androidx.concurrent.futures.f.x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f11754b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f11755c = null;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f11756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f11757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f11758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f11759d;

        b(int i11, int i12, long j11, long j12) {
            this.f11756a = i11;
            this.f11757b = i12;
            this.f11758c = j11;
            this.f11759d = j12;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f11756a);
                dataOutputStream.writeInt(this.f11757b);
                dataOutputStream.writeLong(this.f11758c);
                dataOutputStream.writeLong(this.f11759d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f11757b == bVar.f11757b && this.f11758c == bVar.f11758c && this.f11756a == bVar.f11756a && this.f11759d == bVar.f11759d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f11757b), Long.valueOf(this.f11758c), Integer.valueOf(this.f11756a), Long.valueOf(this.f11759d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f11760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f11761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f11762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f11763d;

        c(int i11, boolean z11, boolean z12, boolean z13) {
            this.f11760a = i11;
            this.f11762c = z12;
            this.f11761b = z11;
            this.f11763d = z13;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i11, boolean z11, boolean z12, boolean z13) {
        c cVar = new c(i11, z11, z12, z13);
        f11755c = cVar;
        f11753a.t(cVar);
        return f11755c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046 A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:9:0x000c, B:11:0x0010, B:16:0x0019, B:22:0x002e, B:33:0x0040, B:35:0x0046, B:36:0x004c, B:38:0x004e, B:44:0x0071, B:50:0x0094, B:51:0x0098, B:53:0x00a9, B:62:0x00ba, B:64:0x00c0, B:79:0x00dc, B:82:0x00e2, B:85:0x00e9, B:87:0x00f2, B:92:0x00fe, B:93:0x0102, B:89:0x00f8, B:56:0x00b0, B:57:0x00b4, B:95:0x0104, B:96:0x010a, B:31:0x003e, B:30:0x003b), top: B:102:0x000c, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:9:0x000c, B:11:0x0010, B:16:0x0019, B:22:0x002e, B:33:0x0040, B:35:0x0046, B:36:0x004c, B:38:0x004e, B:44:0x0071, B:50:0x0094, B:51:0x0098, B:53:0x00a9, B:62:0x00ba, B:64:0x00c0, B:79:0x00dc, B:82:0x00e2, B:85:0x00e9, B:87:0x00f2, B:92:0x00fe, B:93:0x0102, B:89:0x00f8, B:56:0x00b0, B:57:0x00b4, B:95:0x0104, B:96:0x010a, B:31:0x003e, B:30:0x003b), top: B:102:0x000c, inners: #2, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.profileinstaller.h.c c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.h.c(android.content.Context, boolean):androidx.profileinstaller.h$c");
    }
}
