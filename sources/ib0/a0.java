package ib0;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f103548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f103550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f103551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f103552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f103553f;

    public a0(Map map, String str, byte[] bArr, Map map2, byte[] bArr2, String str2) {
        this.f103548a = map;
        this.f103549b = str;
        this.f103550c = bArr;
        this.f103551d = map2;
        this.f103552e = bArr2;
        this.f103553f = str2;
    }

    public final byte[] a() {
        return this.f103550c;
    }

    public final byte[] b() {
        return this.f103552e;
    }

    public final String c() {
        return this.f103553f;
    }

    public final int d() {
        byte[] bArr = this.f103550c;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public final Map e() {
        return this.f103548a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f103548a, a0Var.f103548a) && Intrinsics.areEqual(this.f103549b, a0Var.f103549b) && Intrinsics.areEqual(this.f103550c, a0Var.f103550c) && Intrinsics.areEqual(this.f103551d, a0Var.f103551d) && Intrinsics.areEqual(this.f103552e, a0Var.f103552e) && Intrinsics.areEqual(this.f103553f, a0Var.f103553f);
    }

    public final String f() {
        return this.f103549b;
    }

    public final int g() {
        byte[] bArr = this.f103552e;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public final Map h() {
        return this.f103551d;
    }

    public int hashCode() {
        Map map = this.f103548a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.f103549b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.f103550c;
        int iHashCode3 = (iHashCode2 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Map map2 = this.f103551d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        byte[] bArr2 = this.f103552e;
        int iHashCode5 = (iHashCode4 + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31;
        String str2 = this.f103553f;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NetworkCaptureData(requestHeaders=" + this.f103548a + ", requestQueryParams=" + this.f103549b + ", capturedRequestBody=" + Arrays.toString(this.f103550c) + ", responseHeaders=" + this.f103551d + ", capturedResponseBody=" + Arrays.toString(this.f103552e) + ", dataCaptureErrorMessage=" + this.f103553f + ')';
    }
}
