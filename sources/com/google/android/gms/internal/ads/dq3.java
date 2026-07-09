package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class dq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ti f25215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25218d;

    private dq3(ti tiVar, long j11, long j12, String str) {
        this.f25215a = tiVar;
        this.f25216b = j11;
        this.f25217c = j12;
        this.f25218d = str;
    }

    static /* synthetic */ dq3 a(ti tiVar, byte[] bArr) {
        tiVar.zza();
        tiVar.a(bArr);
        List list = (List) tiVar.c(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        tiVar.b(jLongValue, Optional.empty());
        return new dq3(tiVar, jLongValue2, jLongValue3, "3.825731049.".concat(xh3.a(vi.a(), false)));
    }

    final /* synthetic */ String b(Map map) {
        return xh3.a((byte[]) this.f25215a.b(this.f25216b, Optional.of(map)), true);
    }

    final /* synthetic */ void c(Map map) {
        this.f25215a.b(this.f25217c, Optional.of(map));
    }

    final /* synthetic */ String d() {
        return this.f25218d;
    }
}
