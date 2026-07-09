package bd;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f14252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f14253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f14254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f14255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f14257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14258g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Writer f14260i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14262m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f14259h = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final LinkedHashMap f14261l = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f14263n = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final ThreadPoolExecutor f14264r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Callable f14265s = new CallableC0233a();

    /* JADX INFO: renamed from: bd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class CallableC0233a implements Callable {
        CallableC0233a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f14260i == null) {
                        return null;
                    }
                    a.this.x0();
                    if (a.this.U()) {
                        a.this.j0();
                        a.this.f14262m = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0233a callableC0233a) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f14267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f14268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f14269c;

        /* synthetic */ c(a aVar, d dVar, CallableC0233a callableC0233a) {
            this(dVar);
        }

        public void a() {
            a.this.o(this, false);
        }

        public void b() {
            if (this.f14269c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.o(this, true);
            this.f14269c = true;
        }

        public File f(int i11) {
            File fileK;
            synchronized (a.this) {
                try {
                    if (this.f14267a.f14276f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f14267a.f14275e) {
                        this.f14268b[i11] = true;
                    }
                    fileK = this.f14267a.k(i11);
                    a.this.f14252a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }

        private c(d dVar) {
            this.f14267a = dVar;
            this.f14268b = dVar.f14275e ? null : new boolean[a.this.f14258g];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f14272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f14273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f14274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f14275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f14276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f14277g;

        /* synthetic */ d(a aVar, String str, CallableC0233a callableC0233a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f14258g) {
                throw m(strArr);
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                try {
                    this.f14272b[i11] = Long.parseLong(strArr[i11]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i11) {
            return this.f14273c[i11];
        }

        public File k(int i11) {
            return this.f14274d[i11];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j11 : this.f14272b) {
                sb2.append(' ');
                sb2.append(j11);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f14271a = str;
            this.f14272b = new long[a.this.f14258g];
            this.f14273c = new File[a.this.f14258g];
            this.f14274d = new File[a.this.f14258g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f14258g; i11++) {
                sb2.append(i11);
                this.f14273c[i11] = new File(a.this.f14252a, sb2.toString());
                sb2.append(".tmp");
                this.f14274d[i11] = new File(a.this.f14252a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f14280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f14281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f14282d;

        /* synthetic */ e(a aVar, String str, long j11, File[] fileArr, long[] jArr, CallableC0233a callableC0233a) {
            this(str, j11, fileArr, jArr);
        }

        public File a(int i11) {
            return this.f14282d[i11];
        }

        private e(String str, long j11, File[] fileArr, long[] jArr) {
            this.f14279a = str;
            this.f14280b = j11;
            this.f14282d = fileArr;
            this.f14281c = jArr;
        }
    }

    private a(File file, int i11, int i12, long j11) {
        this.f14252a = file;
        this.f14256e = i11;
        this.f14253b = new File(file, "journal");
        this.f14254c = new File(file, "journal.tmp");
        this.f14255d = new File(file, "journal.bkp");
        this.f14258g = i12;
        this.f14257f = j11;
    }

    private synchronized c E(String str, long j11) {
        l();
        d dVar = (d) this.f14261l.get(str);
        CallableC0233a callableC0233a = null;
        if (j11 != -1 && (dVar == null || dVar.f14277g != j11)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0233a);
            this.f14261l.put(str, dVar);
        } else if (dVar.f14276f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0233a);
        dVar.f14276f = cVar;
        this.f14260i.append((CharSequence) "DIRTY");
        this.f14260i.append(' ');
        this.f14260i.append((CharSequence) str);
        this.f14260i.append('\n');
        J(this.f14260i);
        return cVar;
    }

    private static void J(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U() {
        int i11 = this.f14262m;
        return i11 >= 2000 && i11 >= this.f14261l.size();
    }

    public static a V(File file, int i11, int i12, long j11) throws IOException {
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                v0(file2, file3, false);
            }
        }
        a aVar = new a(file, i11, i12, j11);
        if (aVar.f14253b.exists()) {
            try {
                aVar.a0();
                aVar.Y();
                return aVar;
            } catch (IOException e11) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e11.getMessage() + ", removing");
                aVar.q();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i11, i12, j11);
        aVar2.j0();
        return aVar2;
    }

    private void Y() throws IOException {
        t(this.f14254c);
        Iterator it = this.f14261l.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i11 = 0;
            if (dVar.f14276f == null) {
                while (i11 < this.f14258g) {
                    this.f14259h += dVar.f14272b[i11];
                    i11++;
                }
            } else {
                dVar.f14276f = null;
                while (i11 < this.f14258g) {
                    t(dVar.j(i11));
                    t(dVar.k(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    private void a0() {
        bd.b bVar = new bd.b(new FileInputStream(this.f14253b), bd.c.f14290a);
        try {
            String strF = bVar.f();
            String strF2 = bVar.f();
            String strF3 = bVar.f();
            String strF4 = bVar.f();
            String strF5 = bVar.f();
            if (!"libcore.io.DiskLruCache".equals(strF) || !"1".equals(strF2) || !Integer.toString(this.f14256e).equals(strF3) || !Integer.toString(this.f14258g).equals(strF4) || !"".equals(strF5)) {
                throw new IOException("unexpected journal header: [" + strF + ", " + strF2 + ", " + strF4 + ", " + strF5 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    e0(bVar.f());
                    i11++;
                } catch (EOFException unused) {
                    this.f14262m = i11 - this.f14261l.size();
                    if (bVar.e()) {
                        j0();
                    } else {
                        this.f14260i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14253b, true), bd.c.f14290a));
                    }
                    bd.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            bd.c.a(bVar);
            throw th2;
        }
    }

    private void e0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i11 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i11);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i11);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f14261l.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iIndexOf2);
        }
        d dVar = (d) this.f14261l.get(strSubstring);
        CallableC0233a callableC0233a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0233a);
            this.f14261l.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f14275e = true;
            dVar.f14276f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f14276f = new c(this, dVar, callableC0233a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j0() {
        try {
            Writer writer = this.f14260i;
            if (writer != null) {
                n(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14254c), bd.c.f14290a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f14256e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f14258g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f14261l.values()) {
                    if (dVar.f14276f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f14271a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f14271a + dVar.l() + '\n');
                    }
                }
                n(bufferedWriter);
                if (this.f14253b.exists()) {
                    v0(this.f14253b, this.f14255d, true);
                }
                v0(this.f14254c, this.f14253b, false);
                this.f14255d.delete();
                this.f14260i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14253b, true), bd.c.f14290a));
            } catch (Throwable th2) {
                n(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void l() {
        if (this.f14260i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void n(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(c cVar, boolean z11) {
        d dVar = cVar.f14267a;
        if (dVar.f14276f != cVar) {
            throw new IllegalStateException();
        }
        if (z11 && !dVar.f14275e) {
            for (int i11 = 0; i11 < this.f14258g; i11++) {
                if (!cVar.f14268b[i11]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!dVar.k(i11).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i12 = 0; i12 < this.f14258g; i12++) {
            File fileK = dVar.k(i12);
            if (!z11) {
                t(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i12);
                fileK.renameTo(fileJ);
                long j11 = dVar.f14272b[i12];
                long length = fileJ.length();
                dVar.f14272b[i12] = length;
                this.f14259h = (this.f14259h - j11) + length;
            }
        }
        this.f14262m++;
        dVar.f14276f = null;
        if (dVar.f14275e || z11) {
            dVar.f14275e = true;
            this.f14260i.append((CharSequence) "CLEAN");
            this.f14260i.append(' ');
            this.f14260i.append((CharSequence) dVar.f14271a);
            this.f14260i.append((CharSequence) dVar.l());
            this.f14260i.append('\n');
            if (z11) {
                long j12 = this.f14263n;
                this.f14263n = 1 + j12;
                dVar.f14277g = j12;
            }
        } else {
            this.f14261l.remove(dVar.f14271a);
            this.f14260i.append((CharSequence) "REMOVE");
            this.f14260i.append(' ');
            this.f14260i.append((CharSequence) dVar.f14271a);
            this.f14260i.append('\n');
        }
        J(this.f14260i);
        if (this.f14259h > this.f14257f || U()) {
            this.f14264r.submit(this.f14265s);
        }
    }

    private static void t(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void v0(File file, File file2, boolean z11) throws IOException {
        if (z11) {
            t(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        while (this.f14259h > this.f14257f) {
            p0((String) ((Map.Entry) this.f14261l.entrySet().iterator().next()).getKey());
        }
    }

    public c C(String str) {
        return E(str, -1L);
    }

    public synchronized e M(String str) throws Throwable {
        a aVar;
        Throwable th2;
        try {
            try {
                l();
                d dVar = (d) this.f14261l.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f14275e) {
                    return null;
                }
                for (File file : dVar.f14273c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar = this;
                    }
                }
                this.f14262m++;
                this.f14260i.append((CharSequence) "READ");
                this.f14260i.append(' ');
                this.f14260i.append((CharSequence) str);
                this.f14260i.append('\n');
                if (U()) {
                    this.f14264r.submit(this.f14265s);
                }
                return new e(this, str, dVar.f14277g, dVar.f14273c, dVar.f14272b, null);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            aVar = this;
        }
        th2 = th;
        throw th2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f14260i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f14261l.values());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d dVar = (d) obj;
                if (dVar.f14276f != null) {
                    dVar.f14276f.a();
                }
            }
            x0();
            n(this.f14260i);
            this.f14260i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean p0(String str) {
        try {
            l();
            d dVar = (d) this.f14261l.get(str);
            if (dVar != null && dVar.f14276f == null) {
                for (int i11 = 0; i11 < this.f14258g; i11++) {
                    File fileJ = dVar.j(i11);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f14259h -= dVar.f14272b[i11];
                    dVar.f14272b[i11] = 0;
                }
                this.f14262m++;
                this.f14260i.append((CharSequence) "REMOVE");
                this.f14260i.append(' ');
                this.f14260i.append((CharSequence) str);
                this.f14260i.append('\n');
                this.f14261l.remove(str);
                if (U()) {
                    this.f14264r.submit(this.f14265s);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public void q() throws IOException {
        close();
        bd.c.b(this.f14252a);
    }
}
