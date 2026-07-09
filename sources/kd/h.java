package kd;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class h implements ed.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f110535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URL f110536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f110537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f110538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URL f110539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[] f110540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f110541h;

    public h(URL url) {
        this(url, i.f110543b);
    }

    private byte[] d() {
        if (this.f110540g == null) {
            this.f110540g = c().getBytes(ed.e.f92466a);
        }
        return this.f110540g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f110538e)) {
            String string = this.f110537d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) zd.k.d(this.f110536c)).toString();
            }
            this.f110538e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f110538e;
    }

    private URL g() {
        if (this.f110539f == null) {
            this.f110539f = new URL(f());
        }
        return this.f110539f;
    }

    @Override // ed.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f110537d;
        return str != null ? str : ((URL) zd.k.d(this.f110536c)).toString();
    }

    public Map e() {
        return this.f110535b.getHeaders();
    }

    @Override // ed.e
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f110535b.equals(hVar.f110535b)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return f();
    }

    @Override // ed.e
    public int hashCode() {
        if (this.f110541h == 0) {
            int iHashCode = c().hashCode();
            this.f110541h = iHashCode;
            this.f110541h = (iHashCode * 31) + this.f110535b.hashCode();
        }
        return this.f110541h;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f110543b);
    }

    public h(URL url, i iVar) {
        this.f110536c = (URL) zd.k.d(url);
        this.f110537d = null;
        this.f110535b = (i) zd.k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f110536c = null;
        this.f110537d = zd.k.b(str);
        this.f110535b = (i) zd.k.d(iVar);
    }
}
