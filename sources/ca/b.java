package ca;

import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f17298e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f17299f = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17303d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(int i11, int i12, int i13, int i14) {
        this.f17300a = i11;
        this.f17301b = i12;
        this.f17302c = i13;
        this.f17303d = i14;
        if (i11 > i13) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i11 + ", right: " + i13).toString());
        }
        if (i12 <= i14) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i12 + ", bottom: " + i14).toString());
    }

    public final int a() {
        return this.f17303d - this.f17301b;
    }

    public final int b() {
        return this.f17300a;
    }

    public final int c() {
        return this.f17301b;
    }

    public final int d() {
        return this.f17302c - this.f17300a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f17300a == bVar.f17300a && this.f17301b == bVar.f17301b && this.f17302c == bVar.f17302c && this.f17303d == bVar.f17303d;
    }

    public final Rect f() {
        return new Rect(this.f17300a, this.f17301b, this.f17302c, this.f17303d);
    }

    public int hashCode() {
        return (((((this.f17300a * 31) + this.f17301b) * 31) + this.f17302c) * 31) + this.f17303d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f17300a + ',' + this.f17301b + ',' + this.f17302c + ',' + this.f17303d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        Intrinsics.checkNotNullParameter(rect, "rect");
    }
}
