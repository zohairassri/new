package com.datadog.android.core.internal.system;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19526d;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.system.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum EnumC0297a {
        UNKNOWN,
        CHARGING,
        DISCHARGING,
        NOT_CHARGING,
        FULL;


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0298a f19527a = new C0298a(null);

        /* JADX INFO: renamed from: com.datadog.android.core.internal.system.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0298a {
            public /* synthetic */ C0298a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0297a a(int i11) {
                return i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? EnumC0297a.UNKNOWN : EnumC0297a.FULL : EnumC0297a.NOT_CHARGING : EnumC0297a.DISCHARGING : EnumC0297a.CHARGING;
            }

            private C0298a() {
            }
        }
    }

    public a(boolean z11, int i11, boolean z12, boolean z13) {
        this.f19523a = z11;
        this.f19524b = i11;
        this.f19525c = z12;
        this.f19526d = z13;
    }

    public static /* synthetic */ a b(a aVar, boolean z11, int i11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = aVar.f19523a;
        }
        if ((i12 & 2) != 0) {
            i11 = aVar.f19524b;
        }
        if ((i12 & 4) != 0) {
            z12 = aVar.f19525c;
        }
        if ((i12 & 8) != 0) {
            z13 = aVar.f19526d;
        }
        return aVar.a(z11, i11, z12, z13);
    }

    public final a a(boolean z11, int i11, boolean z12, boolean z13) {
        return new a(z11, i11, z12, z13);
    }

    public final boolean c() {
        return this.f19523a;
    }

    public final int d() {
        return this.f19524b;
    }

    public final boolean e() {
        return this.f19526d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19523a == aVar.f19523a && this.f19524b == aVar.f19524b && this.f19525c == aVar.f19525c && this.f19526d == aVar.f19526d;
    }

    public final boolean f() {
        return this.f19525c;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f19523a) * 31) + Integer.hashCode(this.f19524b)) * 31) + Boolean.hashCode(this.f19525c)) * 31) + Boolean.hashCode(this.f19526d);
    }

    public String toString() {
        return "SystemInfo(batteryFullOrCharging=" + this.f19523a + ", batteryLevel=" + this.f19524b + ", powerSaveMode=" + this.f19525c + ", onExternalPowerSource=" + this.f19526d + ")";
    }

    public /* synthetic */ a(boolean z11, int i11, boolean z12, boolean z13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? -1 : i11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13);
    }
}
