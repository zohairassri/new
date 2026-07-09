package g2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f97890d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f97892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f97893c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(String str, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j11, i11);
    }

    public final int a() {
        return b.f(this.f97892b);
    }

    public final int b() {
        return this.f97893c;
    }

    public abstract float c(int i11);

    public abstract float d(int i11);

    public final long e() {
        return this.f97892b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f97893c == cVar.f97893c && Intrinsics.areEqual(this.f97891a, cVar.f97891a)) {
            return b.e(this.f97892b, cVar.f97892b);
        }
        return false;
    }

    public final String f() {
        return this.f97891a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f11, float f12, float f13);

    public int hashCode() {
        return (((this.f97891a.hashCode() * 31) + b.g(this.f97892b)) * 31) + this.f97893c;
    }

    public abstract float i(float f11, float f12, float f13);

    public abstract long j(float f11, float f12, float f13, float f14, c cVar);

    public String toString() {
        return this.f97891a + " (id=" + this.f97893c + ", model=" + ((Object) b.h(this.f97892b)) + ')';
    }

    private c(String str, long j11, int i11) {
        this.f97891a = str;
        this.f97892b = j11;
        this.f97893c = i11;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i11 < -1 || i11 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
