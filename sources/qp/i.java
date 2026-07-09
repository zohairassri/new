package qp;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qp.j;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f122954b = new i(new j.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f122955c = new i(new j.e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f122956d = new i(new j.g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f122957e = new i(new j.f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f122958f = new i(new j.b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f122959g = new i(new j.d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f122960h = new i(new j.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f122961a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f122962a;

        @Override // qp.i.e
        public Object a(String str) {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f122962a.a(str, (Provider) it.next());
                } catch (Exception e11) {
                    if (exc == null) {
                        exc = e11;
                    }
                }
            }
            return this.f122962a.a(str, null);
        }

        private b(j jVar) {
            this.f122962a = jVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f122963a;

        @Override // qp.i.e
        public Object a(String str) {
            return this.f122963a.a(str, null);
        }

        private c(j jVar) {
            this.f122963a = jVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f122964a;

        @Override // qp.i.e
        public Object a(String str) throws GeneralSecurityException {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f122964a.a(str, (Provider) it.next());
                } catch (Exception e11) {
                    if (exc == null) {
                        exc = e11;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        private d(j jVar) {
            this.f122964a = jVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface e {
        Object a(String str);
    }

    public i(j jVar) {
        if (hp.b.c()) {
            this.f122961a = new d(jVar);
        } else if (q.b()) {
            this.f122961a = new b(jVar);
        } else {
            this.f122961a = new c(jVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f122961a.a(str);
    }
}
