package w8;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f134942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f134943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f134944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RandomAccessFile f134945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FileChannel f134946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FileLock f134947f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX INFO: renamed from: w8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C1872b extends File {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f134949a;

        public C1872b(File file, String str) {
            super(file, str);
            this.f134949a = -1L;
        }
    }

    b(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f134942a = file;
        this.f134944c = file2;
        this.f134943b = h(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f134945d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f134946e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f134947f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException | Error | RuntimeException e11) {
                c(this.f134946e);
                throw e11;
            }
        } catch (IOException | Error | RuntimeException e12) {
            c(this.f134945d);
            throw e12;
        }
    }

    private void a() {
        File[] fileArrListFiles = this.f134944c.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f134944c.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e11) {
            Log.w("MultiDex", "Failed to close resource", e11);
        }
    }

    private static void e(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i11 = inputStream.read(bArr); i11 != -1; i11 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i11);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    c(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            c(inputStream);
            fileCreateTempFile.delete();
            throw th3;
        }
    }

    private static SharedPreferences f(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private static long g(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long h(File file) throws IOException {
        long jC = c.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    private static boolean j(Context context, File file, long j11, String str) {
        SharedPreferences sharedPreferencesF = f(context);
        if (sharedPreferencesF.getLong(str + "timestamp", -1L) != g(file)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        return sharedPreferencesF.getLong(sb2.toString(), -1L) != j11;
    }

    private List l(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f134942a.getName() + ".classes";
        SharedPreferences sharedPreferencesF = f(context);
        int i11 = sharedPreferencesF.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i11 + (-1));
        int i12 = 2;
        while (i12 <= i11) {
            C1872b c1872b = new C1872b(this.f134944c, str2 + i12 + ".zip");
            if (!c1872b.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + c1872b.getPath() + "'");
            }
            c1872b.f134949a = h(c1872b);
            long j11 = sharedPreferencesF.getLong(str + "dex.crc." + i12, -1L);
            long j12 = sharedPreferencesF.getLong(str + "dex.time." + i12, -1L);
            long jLastModified = c1872b.lastModified();
            if (j12 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesF;
                if (j11 == c1872b.f134949a) {
                    arrayList.add(c1872b);
                    i12++;
                    sharedPreferencesF = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + c1872b + " (key \"" + str + "\"), expected modification time: " + j12 + ", modification time: " + jLastModified + ", expected crc: " + j11 + ", file crc: " + c1872b.f134949a);
        }
        return arrayList;
    }

    private List n() {
        boolean z11;
        String str = this.f134942a.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f134942a);
        try {
            int i11 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                C1872b c1872b = new C1872b(this.f134944c, str + i11 + ".zip");
                arrayList.add(c1872b);
                Log.i("MultiDex", "Extraction is needed for file " + c1872b);
                int i12 = 0;
                boolean z12 = false;
                while (i12 < 3 && !z12) {
                    int i13 = i12 + 1;
                    e(zipFile, entry, c1872b, str);
                    try {
                        c1872b.f134949a = h(c1872b);
                        z11 = true;
                    } catch (IOException e11) {
                        Log.w("MultiDex", "Failed to read crc from " + c1872b.getAbsolutePath(), e11);
                        z11 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z11 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(c1872b.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(c1872b.length());
                    sb2.append(" - crc: ");
                    sb2.append(c1872b.f134949a);
                    Log.i("MultiDex", sb2.toString());
                    if (!z11) {
                        c1872b.delete();
                        if (c1872b.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + c1872b.getPath() + "'");
                        }
                    }
                    z12 = z11;
                    i12 = i13;
                }
                if (!z12) {
                    throw new IOException("Could not create zip file " + c1872b.getAbsolutePath() + " for secondary dex (" + i11 + ")");
                }
                i11++;
                entry = zipFile.getEntry("classes" + i11 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e12) {
                Log.w("MultiDex", "Failed to close resource", e12);
            }
            return arrayList;
        } finally {
        }
    }

    private static void o(Context context, String str, long j11, long j12, List list) {
        SharedPreferences.Editor editorEdit = f(context).edit();
        editorEdit.putLong(str + "timestamp", j11);
        editorEdit.putLong(str + "crc", j12);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i11 = 2;
        while (it.hasNext()) {
            C1872b c1872b = (C1872b) it.next();
            editorEdit.putLong(str + "dex.crc." + i11, c1872b.f134949a);
            editorEdit.putLong(str + "dex.time." + i11, c1872b.lastModified());
            i11++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f134947f.release();
        this.f134946e.close();
        this.f134945d.close();
    }

    List k(Context context, String str, boolean z11) {
        List listN;
        List listL;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f134942a.getPath() + ", " + z11 + ", " + str + ")");
        if (!this.f134947f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z11 && !j(context, this.f134942a, this.f134943b, str)) {
            try {
                listL = l(context, str);
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e11);
                listN = n();
                o(context, str, g(this.f134942a), this.f134943b, listN);
                listL = listN;
            }
            Log.i("MultiDex", "load found " + listL.size() + " secondary dex files");
            return listL;
        }
        if (z11) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listN = n();
        o(context, str, g(this.f134942a), this.f134943b, listN);
        listL = listN;
        Log.i("MultiDex", "load found " + listL.size() + " secondary dex files");
        return listL;
    }
}
