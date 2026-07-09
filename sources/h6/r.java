package h6;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.x;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import k6.n0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f100169i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f100170j = n0.B0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f100171k = n0.B0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f100172l = n0.B0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f100173m = n0.B0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f100174n = n0.B0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f100175o = n0.B0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f100177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f100178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f100179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f100180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f100181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f100182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f100183h;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f100184c = n0.B0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f100185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f100186b;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f100187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f100188b;

            public a(Uri uri) {
                this.f100187a = uri;
            }

            public b c() {
                return new b(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f100185a.equals(bVar.f100185a) && Objects.equals(this.f100186b, bVar.f100186b);
        }

        public int hashCode() {
            int iHashCode = this.f100185a.hashCode() * 31;
            Object obj = this.f100186b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        private b(a aVar) {
            this.f100185a = aVar.f100187a;
            this.f100186b = aVar.f100188b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f100189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f100190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f100191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f100192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f100193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f100194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f100195g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.common.collect.x f100196h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private b f100197i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f100198j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f100199k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private t f100200l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private g.a f100201m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private i f100202n;

        public r a() {
            h hVar;
            k6.a.g(this.f100193e.f100247b == null || this.f100193e.f100246a != null);
            Uri uri = this.f100190b;
            if (uri != null) {
                hVar = new h(uri, this.f100191c, this.f100193e.f100246a != null ? this.f100193e.i() : null, this.f100197i, this.f100194f, this.f100195g, this.f100196h, this.f100198j, this.f100199k);
            } else {
                hVar = null;
            }
            String str = this.f100189a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarH = this.f100192d.h();
            g gVarF = this.f100201m.f();
            t tVar = this.f100200l;
            if (tVar == null) {
                tVar = t.I;
            }
            return new r(str2, eVarH, hVar, gVarF, tVar, this.f100202n);
        }

        public c b(b bVar) {
            this.f100197i = bVar;
            return this;
        }

        public c c(f fVar) {
            this.f100193e = fVar != null ? fVar.b() : new f.a();
            return this;
        }

        public c d(g gVar) {
            this.f100201m = gVar.a();
            return this;
        }

        public c e(String str) {
            this.f100189a = (String) k6.a.e(str);
            return this;
        }

        public c f(String str) {
            this.f100191c = str;
            return this;
        }

        public c g(List list) {
            this.f100196h = com.google.common.collect.x.w(list);
            return this;
        }

        public c h(Object obj) {
            this.f100198j = obj;
            return this;
        }

        public c i(Uri uri) {
            this.f100190b = uri;
            return this;
        }

        public c j(String str) {
            return i(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f100192d = new d.a();
            this.f100193e = new f.a();
            this.f100194f = Collections.EMPTY_LIST;
            this.f100196h = com.google.common.collect.x.A();
            this.f100201m = new g.a();
            this.f100202n = i.f100288d;
            this.f100199k = -9223372036854775807L;
        }

        private c(r rVar) {
            f.a aVar;
            this();
            this.f100192d = rVar.f100181f.a();
            this.f100189a = rVar.f100176a;
            this.f100200l = rVar.f100180e;
            this.f100201m = rVar.f100179d.a();
            this.f100202n = rVar.f100183h;
            h hVar = rVar.f100177b;
            if (hVar != null) {
                this.f100195g = hVar.f100283f;
                this.f100191c = hVar.f100279b;
                this.f100190b = hVar.f100278a;
                this.f100194f = hVar.f100282e;
                this.f100196h = hVar.f100284g;
                this.f100198j = hVar.f100286i;
                f fVar = hVar.f100280c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f100193e = aVar;
                this.f100197i = hVar.f100281d;
                this.f100199k = hVar.f100287j;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f100203i = new a().g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f100204j = n0.B0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f100205k = n0.B0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f100206l = n0.B0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f100207m = n0.B0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f100208n = n0.B0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f100209o = n0.B0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f100210p = n0.B0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f100211q = n0.B0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f100212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f100213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f100214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f100215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f100216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f100217f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f100218g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f100219h;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f100220a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f100221b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f100222c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f100223d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f100224e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f100225f;

            public d g() {
                return new d(this);
            }

            public e h() {
                return new e(this);
            }

            public a() {
                this.f100221b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f100220a = dVar.f100213b;
                this.f100221b = dVar.f100215d;
                this.f100222c = dVar.f100216e;
                this.f100223d = dVar.f100217f;
                this.f100224e = dVar.f100218g;
                this.f100225f = dVar.f100219h;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f100213b == dVar.f100213b && this.f100215d == dVar.f100215d && this.f100216e == dVar.f100216e && this.f100217f == dVar.f100217f && this.f100218g == dVar.f100218g && this.f100219h == dVar.f100219h;
        }

        public int hashCode() {
            long j11 = this.f100213b;
            int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
            long j12 = this.f100215d;
            return ((((((((i11 + ((int) ((j12 >>> 32) ^ j12))) * 31) + (this.f100216e ? 1 : 0)) * 31) + (this.f100217f ? 1 : 0)) * 31) + (this.f100218g ? 1 : 0)) * 31) + (this.f100219h ? 1 : 0);
        }

        private d(a aVar) {
            this.f100212a = n0.u1(aVar.f100220a);
            this.f100214c = n0.u1(aVar.f100221b);
            this.f100213b = aVar.f100220a;
            this.f100215d = aVar.f100221b;
            this.f100216e = aVar.f100222c;
            this.f100217f = aVar.f100223d;
            this.f100218g = aVar.f100224e;
            this.f100219h = aVar.f100225f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class e extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f100226r = new d.a().h();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f100227l = n0.B0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f100228m = n0.B0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f100229n = n0.B0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f100230o = n0.B0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f100231p = n0.B0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f100232q = n0.B0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f100233r = n0.B0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f100234s = n0.B0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f100235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f100236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f100237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.common.collect.y f100238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.common.collect.y f100239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f100240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f100241g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f100242h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final com.google.common.collect.x f100243i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final com.google.common.collect.x f100244j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f100245k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f100245k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f100235a.equals(fVar.f100235a) && Objects.equals(this.f100237c, fVar.f100237c) && Objects.equals(this.f100239e, fVar.f100239e) && this.f100240f == fVar.f100240f && this.f100242h == fVar.f100242h && this.f100241g == fVar.f100241g && this.f100244j.equals(fVar.f100244j) && Arrays.equals(this.f100245k, fVar.f100245k);
        }

        public int hashCode() {
            int iHashCode = this.f100235a.hashCode() * 31;
            Uri uri = this.f100237c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f100239e.hashCode()) * 31) + (this.f100240f ? 1 : 0)) * 31) + (this.f100242h ? 1 : 0)) * 31) + (this.f100241g ? 1 : 0)) * 31) + this.f100244j.hashCode()) * 31) + Arrays.hashCode(this.f100245k);
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f100246a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f100247b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.google.common.collect.y f100248c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f100249d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f100250e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f100251f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private com.google.common.collect.x f100252g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f100253h;

            public f i() {
                return new f(this);
            }

            private a() {
                this.f100248c = com.google.common.collect.y.m();
                this.f100250e = true;
                this.f100252g = com.google.common.collect.x.A();
            }

            private a(f fVar) {
                this.f100246a = fVar.f100235a;
                this.f100247b = fVar.f100237c;
                this.f100248c = fVar.f100239e;
                this.f100249d = fVar.f100240f;
                this.f100250e = fVar.f100241g;
                this.f100251f = fVar.f100242h;
                this.f100252g = fVar.f100244j;
                this.f100253h = fVar.f100245k;
            }
        }

        private f(a aVar) {
            k6.a.g((aVar.f100251f && aVar.f100247b == null) ? false : true);
            UUID uuid = (UUID) k6.a.e(aVar.f100246a);
            this.f100235a = uuid;
            this.f100236b = uuid;
            this.f100237c = aVar.f100247b;
            this.f100238d = aVar.f100248c;
            this.f100239e = aVar.f100248c;
            this.f100240f = aVar.f100249d;
            this.f100242h = aVar.f100251f;
            this.f100241g = aVar.f100250e;
            this.f100243i = aVar.f100252g;
            this.f100244j = aVar.f100252g;
            this.f100245k = aVar.f100253h != null ? Arrays.copyOf(aVar.f100253h, aVar.f100253h.length) : null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f100254f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f100255g = n0.B0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f100256h = n0.B0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f100257i = n0.B0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f100258j = n0.B0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f100259k = n0.B0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f100260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f100261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f100262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f100263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f100264e;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f100265a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f100266b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f100267c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f100268d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f100269e;

            public g f() {
                return new g(this);
            }

            public a g(long j11) {
                this.f100267c = j11;
                return this;
            }

            public a h(float f11) {
                this.f100269e = f11;
                return this;
            }

            public a i(long j11) {
                this.f100266b = j11;
                return this;
            }

            public a j(float f11) {
                this.f100268d = f11;
                return this;
            }

            public a k(long j11) {
                this.f100265a = j11;
                return this;
            }

            public a() {
                this.f100265a = -9223372036854775807L;
                this.f100266b = -9223372036854775807L;
                this.f100267c = -9223372036854775807L;
                this.f100268d = -3.4028235E38f;
                this.f100269e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f100265a = gVar.f100260a;
                this.f100266b = gVar.f100261b;
                this.f100267c = gVar.f100262c;
                this.f100268d = gVar.f100263d;
                this.f100269e = gVar.f100264e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f100260a == gVar.f100260a && this.f100261b == gVar.f100261b && this.f100262c == gVar.f100262c && this.f100263d == gVar.f100263d && this.f100264e == gVar.f100264e;
        }

        public int hashCode() {
            long j11 = this.f100260a;
            long j12 = this.f100261b;
            int i11 = ((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f100262c;
            int i12 = (i11 + ((int) ((j13 >>> 32) ^ j13))) * 31;
            float f11 = this.f100263d;
            int iFloatToIntBits = (i12 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f100264e;
            return iFloatToIntBits + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0);
        }

        private g(a aVar) {
            this(aVar.f100265a, aVar.f100266b, aVar.f100267c, aVar.f100268d, aVar.f100269e);
        }

        public g(long j11, long j12, long j13, float f11, float f12) {
            this.f100260a = j11;
            this.f100261b = j12;
            this.f100262c = j13;
            this.f100263d = f11;
            this.f100264e = f12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class h {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f100270k = n0.B0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f100271l = n0.B0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f100272m = n0.B0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f100273n = n0.B0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f100274o = n0.B0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f100275p = n0.B0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f100276q = n0.B0(6);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f100277r = n0.B0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f100278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f100280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f100281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f100282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f100283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final com.google.common.collect.x f100284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f100285h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f100286i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f100287j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f100278a.equals(hVar.f100278a) && Objects.equals(this.f100279b, hVar.f100279b) && Objects.equals(this.f100280c, hVar.f100280c) && Objects.equals(this.f100281d, hVar.f100281d) && this.f100282e.equals(hVar.f100282e) && Objects.equals(this.f100283f, hVar.f100283f) && this.f100284g.equals(hVar.f100284g) && Objects.equals(this.f100286i, hVar.f100286i) && this.f100287j == hVar.f100287j;
        }

        public int hashCode() {
            int iHashCode = this.f100278a.hashCode() * 31;
            String str = this.f100279b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f100280c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f100281d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f100282e.hashCode()) * 31;
            String str2 = this.f100283f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f100284g.hashCode()) * 31;
            Object obj = this.f100286i;
            return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f100287j);
        }

        private h(Uri uri, String str, f fVar, b bVar, List list, String str2, com.google.common.collect.x xVar, Object obj, long j11) {
            this.f100278a = uri;
            this.f100279b = v.u(str);
            this.f100280c = fVar;
            this.f100281d = bVar;
            this.f100282e = list;
            this.f100283f = str2;
            this.f100284g = xVar;
            x.a aVarS = com.google.common.collect.x.s();
            for (int i11 = 0; i11 < xVar.size(); i11++) {
                aVarS.a(((k) xVar.get(i11)).a().i());
            }
            this.f100285h = aVarS.k();
            this.f100286i = obj;
            this.f100287j = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f100288d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f100289e = n0.B0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f100290f = n0.B0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f100291g = n0.B0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f100292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f100294c;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f100295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f100296b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f100297c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f100292a, iVar.f100292a) && Objects.equals(this.f100293b, iVar.f100293b)) {
                if ((this.f100294c == null) == (iVar.f100294c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f100292a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f100293b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f100294c != null ? 1 : 0);
        }

        private i(a aVar) {
            this.f100292a = aVar.f100295a;
            this.f100293b = aVar.f100296b;
            this.f100294c = aVar.f100297c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f100298h = n0.B0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f100299i = n0.B0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f100300j = n0.B0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f100301k = n0.B0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f100302l = n0.B0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f100303m = n0.B0(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f100304n = n0.B0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f100305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f100308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f100309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f100310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f100311g;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f100312a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f100313b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f100314c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f100315d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f100316e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f100317f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f100318g;

            /* JADX INFO: Access modifiers changed from: private */
            public j i() {
                return new j(this);
            }

            private a(k kVar) {
                this.f100312a = kVar.f100305a;
                this.f100313b = kVar.f100306b;
                this.f100314c = kVar.f100307c;
                this.f100315d = kVar.f100308d;
                this.f100316e = kVar.f100309e;
                this.f100317f = kVar.f100310f;
                this.f100318g = kVar.f100311g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f100305a.equals(kVar.f100305a) && Objects.equals(this.f100306b, kVar.f100306b) && Objects.equals(this.f100307c, kVar.f100307c) && this.f100308d == kVar.f100308d && this.f100309e == kVar.f100309e && Objects.equals(this.f100310f, kVar.f100310f) && Objects.equals(this.f100311g, kVar.f100311g);
        }

        public int hashCode() {
            int iHashCode = this.f100305a.hashCode() * 31;
            String str = this.f100306b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f100307c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f100308d) * 31) + this.f100309e) * 31;
            String str3 = this.f100310f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f100311g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.f100305a = aVar.f100312a;
            this.f100306b = aVar.f100313b;
            this.f100307c = aVar.f100314c;
            this.f100308d = aVar.f100315d;
            this.f100309e = aVar.f100316e;
            this.f100310f = aVar.f100317f;
            this.f100311g = aVar.f100318g;
        }
    }

    public static r b(String str) {
        return new c().j(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Objects.equals(this.f100176a, rVar.f100176a) && this.f100181f.equals(rVar.f100181f) && Objects.equals(this.f100177b, rVar.f100177b) && Objects.equals(this.f100179d, rVar.f100179d) && Objects.equals(this.f100180e, rVar.f100180e) && Objects.equals(this.f100183h, rVar.f100183h);
    }

    public int hashCode() {
        int iHashCode = this.f100176a.hashCode() * 31;
        h hVar = this.f100177b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f100179d.hashCode()) * 31) + this.f100181f.hashCode()) * 31) + this.f100180e.hashCode()) * 31) + this.f100183h.hashCode();
    }

    private r(String str, e eVar, h hVar, g gVar, t tVar, i iVar) {
        this.f100176a = str;
        this.f100177b = hVar;
        this.f100178c = hVar;
        this.f100179d = gVar;
        this.f100180e = tVar;
        this.f100181f = eVar;
        this.f100182g = eVar;
        this.f100183h = iVar;
    }
}
