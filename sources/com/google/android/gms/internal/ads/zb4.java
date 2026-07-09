package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zb4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f39122h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f39123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f39125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f39126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39129g;

    static {
        ea.b("media3.datasource");
    }

    /* synthetic */ zb4(Uri uri, long j11, int i11, byte[] bArr, Map map, long j12, long j13, String str, int i12, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j12, j13, null, i12, null);
    }

    public final boolean a(int i11) {
        return (this.f39129g & i11) == i11;
    }

    public final za4 b() {
        return new za4(this, null);
    }

    public final String toString() {
        String string = this.f39123a.toString();
        int length = string.length();
        long j11 = this.f39127e;
        int length2 = String.valueOf(j11).length();
        long j12 = this.f39128f;
        int length3 = String.valueOf(j12).length();
        int i11 = this.f39129g;
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i11).length() + 1);
        sb2.append("DataSpec[");
        sb2.append("GET");
        sb2.append(" ");
        sb2.append(string);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(", ");
        sb2.append(j12);
        sb2.append(", null, ");
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }

    private zb4(Uri uri, long j11, int i11, byte[] bArr, Map map, long j12, long j13, String str, int i12, Object obj) {
        boolean z11 = false;
        boolean z12 = j12 >= 0;
        jx3.a(z12);
        jx3.a(z12);
        if (j13 > 0) {
            z11 = true;
        } else if (j13 == -1) {
            j13 = -1;
            z11 = true;
        }
        jx3.a(z11);
        uri.getClass();
        this.f39123a = uri;
        this.f39124b = 1;
        this.f39125c = null;
        this.f39126d = Collections.unmodifiableMap(new HashMap(map));
        this.f39127e = j12;
        this.f39128f = j13;
        this.f39129g = i12;
    }

    public zb4(Uri uri, long j11, long j12, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j11, j12, null, 0, null);
    }
}
