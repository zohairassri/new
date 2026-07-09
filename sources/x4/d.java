package x4;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f137031a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f137032a;

        public a(ClipData clipData, int i11) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f137032a = new b(clipData, i11);
            } else {
                this.f137032a = new C1922d(clipData, i11);
            }
        }

        public d a() {
            return this.f137032a.build();
        }

        public a b(Bundle bundle) {
            this.f137032a.setExtras(bundle);
            return this;
        }

        public a c(int i11) {
            this.f137032a.b(i11);
            return this;
        }

        public a d(Uri uri) {
            this.f137032a.a(uri);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f137033a;

        b(ClipData clipData, int i11) {
            this.f137033a = x4.e.a(clipData, i11);
        }

        @Override // x4.d.c
        public void a(Uri uri) {
            this.f137033a.setLinkUri(uri);
        }

        @Override // x4.d.c
        public void b(int i11) {
            this.f137033a.setFlags(i11);
        }

        @Override // x4.d.c
        public d build() {
            return new d(new e(this.f137033a.build()));
        }

        @Override // x4.d.c
        public void setExtras(Bundle bundle) {
            this.f137033a.setExtras(bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface c {
        void a(Uri uri);

        void b(int i11);

        d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: x4.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class C1922d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f137034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f137035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f137036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f137037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f137038e;

        C1922d(ClipData clipData, int i11) {
            this.f137034a = clipData;
            this.f137035b = i11;
        }

        @Override // x4.d.c
        public void a(Uri uri) {
            this.f137037d = uri;
        }

        @Override // x4.d.c
        public void b(int i11) {
            this.f137036c = i11;
        }

        @Override // x4.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // x4.d.c
        public void setExtras(Bundle bundle) {
            this.f137038e = bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f137039a;

        e(ContentInfo contentInfo) {
            this.f137039a = x4.c.a(w4.i.g(contentInfo));
        }

        @Override // x4.d.f
        public int A0() {
            return this.f137039a.getFlags();
        }

        @Override // x4.d.f
        public ClipData a() {
            return this.f137039a.getClip();
        }

        @Override // x4.d.f
        public int b() {
            return this.f137039a.getSource();
        }

        @Override // x4.d.f
        public ContentInfo c() {
            return this.f137039a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f137039a + "}";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface f {
        int A0();

        ClipData a();

        int b();

        ContentInfo c();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f137040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f137041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f137042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f137043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f137044e;

        g(C1922d c1922d) {
            this.f137040a = (ClipData) w4.i.g(c1922d.f137034a);
            this.f137041b = w4.i.c(c1922d.f137035b, 0, 5, "source");
            this.f137042c = w4.i.f(c1922d.f137036c, 1);
            this.f137043d = c1922d.f137037d;
            this.f137044e = c1922d.f137038e;
        }

        @Override // x4.d.f
        public int A0() {
            return this.f137042c;
        }

        @Override // x4.d.f
        public ClipData a() {
            return this.f137040a;
        }

        @Override // x4.d.f
        public int b() {
            return this.f137041b;
        }

        @Override // x4.d.f
        public ContentInfo c() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f137040a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.f137041b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f137042c));
            if (this.f137043d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f137043d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f137044e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    d(f fVar) {
        this.f137031a = fVar;
    }

    static String a(int i11) {
        return (i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11);
    }

    static String e(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? String.valueOf(i11) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f137031a.a();
    }

    public int c() {
        return this.f137031a.A0();
    }

    public int d() {
        return this.f137031a.b();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.f137031a.c();
        Objects.requireNonNull(contentInfoC);
        x4.c.a(contentInfoC);
        return contentInfoC;
    }

    public String toString() {
        return this.f137031a.toString();
    }
}
