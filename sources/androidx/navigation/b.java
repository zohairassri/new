package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f11331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f11334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f11335e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o f11336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f11338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f11339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11340e;

        public final b a() {
            o oVarA = this.f11336a;
            if (oVarA == null) {
                oVarA = o.f11544c.a(this.f11338c);
                Intrinsics.checkNotNull(oVarA, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new b(oVarA, this.f11337b, this.f11338c, this.f11339d, this.f11340e);
        }

        public final a b(Object obj) {
            this.f11338c = obj;
            this.f11339d = true;
            return this;
        }

        public final a c(boolean z11) {
            this.f11337b = z11;
            return this;
        }

        public final a d(o type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f11336a = type;
            return this;
        }

        public final a e(boolean z11) {
            this.f11340e = z11;
            return this;
        }
    }

    public b(o type, boolean z11, Object obj, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.c() && z11) {
            throw new IllegalArgumentException((type.b() + " does not allow nullable values").toString());
        }
        if (!z11 && z12 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.f11331a = type;
        this.f11332b = z11;
        this.f11335e = obj;
        this.f11333c = z12 || z13;
        this.f11334d = z13;
    }

    public final o a() {
        return this.f11331a;
    }

    public final boolean b() {
        return this.f11333c;
    }

    public final boolean c() {
        return this.f11334d;
    }

    public final boolean d() {
        return this.f11332b;
    }

    public final void e(String name, Bundle bundle) {
        Object obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.f11333c || (obj = this.f11335e) == null) {
            return;
        }
        this.f11331a.h(bundle, name, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(b.class, obj.getClass())) {
            b bVar = (b) obj;
            if (this.f11332b != bVar.f11332b || this.f11333c != bVar.f11333c || !Intrinsics.areEqual(this.f11331a, bVar.f11331a)) {
                return false;
            }
            Object obj2 = this.f11335e;
            if (obj2 != null) {
                return Intrinsics.areEqual(obj2, bVar.f11335e);
            }
            if (bVar.f11335e == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String name, Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.f11332b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f11331a.a(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.f11331a.hashCode() * 31) + (this.f11332b ? 1 : 0)) * 31) + (this.f11333c ? 1 : 0)) * 31;
        Object obj = this.f11335e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(" Type: " + this.f11331a);
        sb2.append(" Nullable: " + this.f11332b);
        if (this.f11333c) {
            sb2.append(" DefaultValue: " + this.f11335e);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
