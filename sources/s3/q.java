package s3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f125519c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final q f125520d = new q(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f125521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f125522b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return q.f125520d;
        }

        private a() {
        }
    }

    public q(float f11, float f12) {
        this.f125521a = f11;
        this.f125522b = f12;
    }

    public final float b() {
        return this.f125521a;
    }

    public final float c() {
        return this.f125522b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f125521a == qVar.f125521a && this.f125522b == qVar.f125522b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f125521a) * 31) + Float.hashCode(this.f125522b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f125521a + ", skewX=" + this.f125522b + ')';
    }
}
