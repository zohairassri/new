package eq;

import com.amazonaws.services.s3.internal.Constants;
import eq.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class h implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f92843d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f92844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f92846c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f92847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f92848b;

        a(byte[] bArr, int[] iArr) {
            this.f92847a = bArr;
            this.f92848b = iArr;
        }

        @Override // eq.g.d
        public void a(InputStream inputStream, int i11) throws IOException {
            try {
                inputStream.read(this.f92847a, this.f92848b[0], i11);
                int[] iArr = this.f92848b;
                iArr[0] = iArr[0] + i11;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f92850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f92851b;

        b(byte[] bArr, int i11) {
            this.f92850a = bArr;
            this.f92851b = i11;
        }
    }

    h(File file, int i11) {
        this.f92844a = file;
        this.f92845b = i11;
    }

    private void f(long j11, String str) {
        if (this.f92846c == null) {
            return;
        }
        if (str == null) {
            str = Constants.NULL_VERSION_ID;
        }
        try {
            int i11 = this.f92845b / 4;
            if (str.length() > i11) {
                str = "..." + str.substring(str.length() - i11);
            }
            this.f92846c.g(String.format(Locale.US, "%d %s%n", Long.valueOf(j11), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f92843d));
            while (!this.f92846c.o() && this.f92846c.e0() > this.f92845b) {
                this.f92846c.U();
            }
        } catch (IOException e11) {
            aq.g.f().e("There was a problem writing to the Crashlytics log.", e11);
        }
    }

    private b g() {
        if (!this.f92844a.exists()) {
            return null;
        }
        h();
        g gVar = this.f92846c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.e0()];
        try {
            this.f92846c.l(new a(bArr, iArr));
        } catch (IOException e11) {
            aq.g.f().e("A problem occurred while reading the Crashlytics log file.", e11);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f92846c == null) {
            try {
                this.f92846c = new g(this.f92844a);
            } catch (IOException e11) {
                aq.g.f().e("Could not open log file: " + this.f92844a, e11);
            }
        }
    }

    @Override // eq.c
    public void a() {
        dq.i.f(this.f92846c, "There was a problem closing the Crashlytics log file.");
        this.f92846c = null;
    }

    @Override // eq.c
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f92843d);
        }
        return null;
    }

    @Override // eq.c
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i11 = bVarG.f92851b;
        byte[] bArr = new byte[i11];
        System.arraycopy(bVarG.f92850a, 0, bArr, 0, i11);
        return bArr;
    }

    @Override // eq.c
    public void d() {
        a();
        this.f92844a.delete();
    }

    @Override // eq.c
    public void e(long j11, String str) {
        h();
        f(j11, str);
    }
}
