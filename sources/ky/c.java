package ky;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f112128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f112129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f112130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f112131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f112132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f112133f;

    public c(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f112128a = z11;
        this.f112129b = z12;
        this.f112130c = z13;
        this.f112131d = z14;
        this.f112132e = z15;
        this.f112133f = z11 || z12 || z15;
    }

    public static /* synthetic */ c b(c cVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = cVar.f112128a;
        }
        if ((i11 & 2) != 0) {
            z12 = cVar.f112129b;
        }
        if ((i11 & 4) != 0) {
            z13 = cVar.f112130c;
        }
        if ((i11 & 8) != 0) {
            z14 = cVar.f112131d;
        }
        if ((i11 & 16) != 0) {
            z15 = cVar.f112132e;
        }
        boolean z16 = z15;
        boolean z17 = z13;
        return cVar.a(z11, z12, z17, z14, z16);
    }

    public final c a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return new c(z11, z12, z13, z14, z15);
    }

    public final boolean c() {
        return this.f112131d;
    }

    public final boolean d() {
        return this.f112130c;
    }

    public final boolean e() {
        return this.f112128a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f112128a == cVar.f112128a && this.f112129b == cVar.f112129b && this.f112130c == cVar.f112130c && this.f112131d == cVar.f112131d && this.f112132e == cVar.f112132e;
    }

    public final boolean f() {
        return this.f112129b;
    }

    public final boolean g() {
        return this.f112133f;
    }

    public final boolean h() {
        return this.f112132e;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f112128a) * 31) + Boolean.hashCode(this.f112129b)) * 31) + Boolean.hashCode(this.f112130c)) * 31) + Boolean.hashCode(this.f112131d)) * 31) + Boolean.hashCode(this.f112132e);
    }

    public String toString() {
        return "PrivacySettingsScreenState(showDoNotSell=" + this.f112128a + ", showLimitSensitiveInformation=" + this.f112129b + ", showCaliforniaNotices=" + this.f112130c + ", showAccountDelete=" + this.f112131d + ", showTCFManagePrivacyPreferences=" + this.f112132e + ")";
    }

    public /* synthetic */ c(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15);
    }
}
