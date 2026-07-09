package h6;

import android.media.AudioAttributes;
import android.os.Build;
import k6.n0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f100076h = new e().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f100077i = n0.B0(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f100078j = n0.B0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f100079k = n0.B0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f100080l = n0.B0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f100081m = n0.B0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f100082n = n0.B0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f100085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f100086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f100087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f100088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1182d f100089g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i11) {
            builder.setAllowedCapturePolicy(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, boolean z11) {
            builder.setIsContentSpatialized(z11);
        }

        public static void b(AudioAttributes.Builder builder, int i11) {
            builder.setSpatializationBehavior(i11);
        }
    }

    /* JADX INFO: renamed from: h6.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1182d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f100090a;

        private C1182d(d dVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.f100083a).setFlags(dVar.f100084b).setUsage(dVar.f100085c);
            int i11 = Build.VERSION.SDK_INT;
            b.a(usage, dVar.f100086d);
            if (i11 >= 32) {
                c.b(usage, dVar.f100087e);
                c.a(usage, dVar.f100088f);
            }
            this.f100090a = usage.build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f100091a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f100092b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f100093c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f100094d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f100095e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f100096f = false;

        public d a() {
            return new d(this.f100091a, this.f100092b, this.f100093c, this.f100094d, this.f100095e, this.f100096f);
        }

        public e b(int i11) {
            this.f100091a = i11;
            return this;
        }

        public e c(int i11) {
            this.f100093c = i11;
            return this;
        }
    }

    public C1182d a() {
        if (this.f100089g == null) {
            this.f100089g = new C1182d();
        }
        return this.f100089g;
    }

    public int b() {
        if ((this.f100084b & 1) == 1) {
            return 1;
        }
        switch (this.f100085c) {
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f100083a == dVar.f100083a && this.f100084b == dVar.f100084b && this.f100085c == dVar.f100085c && this.f100086d == dVar.f100086d && this.f100087e == dVar.f100087e && this.f100088f == dVar.f100088f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((527 + this.f100083a) * 31) + this.f100084b) * 31) + this.f100085c) * 31) + this.f100086d) * 31) + this.f100087e) * 31) + (this.f100088f ? 1 : 0);
    }

    private d(int i11, int i12, int i13, int i14, int i15, boolean z11) {
        this.f100083a = i11;
        this.f100084b = i12;
        this.f100085c = i13;
        this.f100086d = i14;
        this.f100087e = i15;
        this.f100088f = z11;
    }
}
