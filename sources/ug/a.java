package ug;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements tg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f131435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f131436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f131437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f131438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f131439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f131440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Boolean f131441g;

    public a(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.f131435a = str;
        this.f131436b = bool;
        this.f131437c = bool2;
        this.f131438d = bool3;
        this.f131439e = bool4;
        this.f131440f = bool5;
        this.f131441g = bool6;
    }

    public static /* synthetic */ a b(a aVar, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f131435a;
        }
        if ((i11 & 2) != 0) {
            bool = aVar.f131436b;
        }
        if ((i11 & 4) != 0) {
            bool2 = aVar.f131437c;
        }
        if ((i11 & 8) != 0) {
            bool3 = aVar.f131438d;
        }
        if ((i11 & 16) != 0) {
            bool4 = aVar.f131439e;
        }
        if ((i11 & 32) != 0) {
            bool5 = aVar.f131440f;
        }
        if ((i11 & 64) != 0) {
            bool6 = aVar.f131441g;
        }
        Boolean bool7 = bool5;
        Boolean bool8 = bool6;
        Boolean bool9 = bool4;
        Boolean bool10 = bool2;
        return aVar.a(str, bool, bool10, bool3, bool9, bool7, bool8);
    }

    public final a a(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        return new a(str, bool, bool2, bool3, bool4, bool5, bool6);
    }

    public final String c() {
        return this.f131435a;
    }

    public final Boolean d() {
        return this.f131438d;
    }

    public final Boolean e() {
        return this.f131437c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f131435a, aVar.f131435a) && Intrinsics.areEqual(this.f131436b, aVar.f131436b) && Intrinsics.areEqual(this.f131437c, aVar.f131437c) && Intrinsics.areEqual(this.f131438d, aVar.f131438d) && Intrinsics.areEqual(this.f131439e, aVar.f131439e) && Intrinsics.areEqual(this.f131440f, aVar.f131440f) && Intrinsics.areEqual(this.f131441g, aVar.f131441g);
    }

    public final Boolean f() {
        return this.f131439e;
    }

    public final Boolean g() {
        return this.f131441g;
    }

    public final Boolean h() {
        return this.f131440f;
    }

    public int hashCode() {
        String str = this.f131435a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f131436b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f131437c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f131438d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f131439e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f131440f;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f131441g;
        return iHashCode6 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final Boolean i() {
        return this.f131436b;
    }

    public String toString() {
        return "AccessibilityInfo(textSize=" + this.f131435a + ", isScreenReaderEnabled=" + this.f131436b + ", isColorInversionEnabled=" + this.f131437c + ", isClosedCaptioningEnabled=" + this.f131438d + ", isReducedAnimationsEnabled=" + this.f131439e + ", isScreenPinningEnabled=" + this.f131440f + ", isRtlEnabled=" + this.f131441g + ")";
    }

    public /* synthetic */ a(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : bool3, (i11 & 16) != 0 ? null : bool4, (i11 & 32) != 0 ? null : bool5, (i11 & 64) != 0 ? null : bool6);
    }
}
