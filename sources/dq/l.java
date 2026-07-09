package dq;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f90267d = new FilenameFilter() { // from class: dq.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f90268e = new Comparator() { // from class: dq.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iq.f f90269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f90270b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f90271c = null;

    l(iq.f fVar) {
        this.f90269a = fVar;
    }

    private static void d(iq.f fVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fVar.o(str, "aqs." + str2).createNewFile();
        } catch (IOException e11) {
            aq.g.f().l("Failed to persist App Quality Sessions session id.", e11);
        }
    }

    static String e(iq.f fVar, String str) {
        List listP = fVar.p(str, f90267d);
        if (!listP.isEmpty()) {
            return ((File) Collections.min(listP, f90268e)).getName().substring(4);
        }
        aq.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f90270b, str)) {
            return this.f90271c;
        }
        return e(this.f90269a, str);
    }

    public synchronized void f(String str) {
        if (!Objects.equals(this.f90271c, str)) {
            d(this.f90269a, this.f90270b, str);
            this.f90271c = str;
        }
    }

    public synchronized void g(String str) {
        if (!Objects.equals(this.f90270b, str)) {
            d(this.f90269a, str, this.f90271c);
            this.f90270b = str;
        }
    }
}
