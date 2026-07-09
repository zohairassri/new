package qb;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f122586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f122587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f122588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f122589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f122590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f122591f;

    public c(String str, String str2, String str3, String str4, boolean z11, String str5) {
        this.f122586a = str;
        this.f122587b = str2;
        this.f122588c = str3;
        this.f122589d = str4;
        this.f122590e = z11;
        this.f122591f = str5;
    }

    public static /* synthetic */ c b(c cVar, String str, String str2, String str3, String str4, boolean z11, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f122586a;
        }
        if ((i11 & 2) != 0) {
            str2 = cVar.f122587b;
        }
        if ((i11 & 4) != 0) {
            str3 = cVar.f122588c;
        }
        if ((i11 & 8) != 0) {
            str4 = cVar.f122589d;
        }
        if ((i11 & 16) != 0) {
            z11 = cVar.f122590e;
        }
        if ((i11 & 32) != 0) {
            str5 = cVar.f122591f;
        }
        boolean z12 = z11;
        String str6 = str5;
        return cVar.a(str, str2, str3, str4, z12, str6);
    }

    public final c a(String str, String str2, String str3, String str4, boolean z11, String str5) {
        return new c(str, str2, str3, str4, z11, str5);
    }

    public final String c() {
        return this.f122587b;
    }

    public final String d() {
        return this.f122588c;
    }

    public final String e() {
        return this.f122586a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f122586a, cVar.f122586a) && Intrinsics.areEqual(this.f122587b, cVar.f122587b) && Intrinsics.areEqual(this.f122588c, cVar.f122588c) && Intrinsics.areEqual(this.f122589d, cVar.f122589d) && this.f122590e == cVar.f122590e && Intrinsics.areEqual(this.f122591f, cVar.f122591f);
    }

    public final String f() {
        return this.f122591f;
    }

    public final boolean g() {
        return this.f122590e;
    }

    public int hashCode() {
        String str = this.f122586a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f122587b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f122588c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f122589d;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.f122590e)) * 31;
        String str5 = this.f122591f;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ShowkaseBrowserScreenMetadata(currentGroup=" + this.f122586a + ", currentComponentName=" + this.f122587b + ", currentComponentStyleName=" + this.f122588c + ", currentComponentKey=" + this.f122589d + ", isSearchActive=" + this.f122590e + ", searchQuery=" + this.f122591f + ")";
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, boolean z11, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : str5);
    }
}
