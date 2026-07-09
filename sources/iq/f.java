package iq;

import android.app.Application;
import android.content.Context;
import aq.g;
import com.chartbeat.androidsdk.QueryKeys;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f104573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f104574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f104575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f104576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f104577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f104578f;

    public f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f104573a = filesDir;
        if (v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileQ = q(new File(filesDir, str));
        this.f104574b = fileQ;
        this.f104575c = q(new File(fileQ, "open-sessions"));
        this.f104576d = q(new File(fileQ, "reports"));
        this.f104577e = q(new File(fileQ, "priority-reports"));
        this.f104578f = q(new File(fileQ, "native-reports"));
    }

    private void a(File file) {
        if (file.exists() && s(file)) {
            g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private File n(String str) {
        return r(new File(this.f104575c, str));
    }

    private static synchronized File q(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static File r(File file) {
        file.mkdirs();
        return file;
    }

    static boolean s(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                s(file2);
            }
        }
        return file.delete();
    }

    private static List t(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    static String u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", QueryKeys.END_MARKER);
    }

    private static boolean v() {
        return true;
    }

    public void b() {
        a(new File(this.f104573a, ".com.google.firebase.crashlytics"));
        a(new File(this.f104573a, ".com.google.firebase.crashlytics-ndk"));
        if (v()) {
            a(new File(this.f104573a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public boolean c(String str) {
        return s(new File(this.f104575c, str));
    }

    public List d() {
        return t(this.f104575c.list());
    }

    public File e(String str) {
        return new File(this.f104574b, str);
    }

    public List f(FilenameFilter filenameFilter) {
        return t(this.f104574b.listFiles(filenameFilter));
    }

    public File g(String str) {
        return new File(this.f104578f, str);
    }

    public List h() {
        return t(this.f104578f.listFiles());
    }

    public File i(String str) {
        return r(new File(n(str), "native"));
    }

    public File j(String str) {
        return new File(this.f104577e, str);
    }

    public List k() {
        return t(this.f104577e.listFiles());
    }

    public File l(String str) {
        return new File(this.f104576d, str);
    }

    public List m() {
        return t(this.f104576d.listFiles());
    }

    public File o(String str, String str2) {
        return new File(n(str), str2);
    }

    public List p(String str, FilenameFilter filenameFilter) {
        return t(n(str).listFiles(filenameFilter));
    }
}
