package com.google.android.gms.internal.ads;

import android.content.Context;
import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class fg3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f26308h = new UUID(0, 0).toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final eg3 f26314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final dg3 f26315g;

    fg3(Context context, String str, String str2, String str3) {
        this.f26314f = eg3.a(context);
        this.f26315g = dg3.a(context);
        this.f26309a = str;
        this.f26310b = str.concat("_3p");
        this.f26311c = str2;
        this.f26312d = str2.concat("_3p");
        this.f26313e = str3;
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + str3.length());
            sb2.append(str);
            sb2.append(str2);
            sb2.append(str3);
            return UUID.nameUUIDFromBytes(sb2.toString().getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f26313e;
        String str5 = str2 == null ? Constants.NULL_VERSION_ID : "not null";
        int length = str5.length();
        String str6 = str3 == null ? Constants.NULL_VERSION_ID : "not null";
        StringBuilder sb3 = new StringBuilder(length + 120 + str6.length());
        sb3.append(str4);
        sb3.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb3.append(str5);
        sb3.append(", hashKey is ");
        sb3.append(str6);
        throw new IllegalArgumentException(sb3.toString());
    }

    final cg3 a(String str, String str2, long j11, boolean z11) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f26308h)) {
                    String strE = e(true);
                    String strC = this.f26314f.c("paid_3p_hash_key", null);
                    if (strE != null && strC != null && !strE.equals(h(str, str2, strC))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new cg3();
        }
        boolean z12 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f26313e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jD = d(z12);
        if (jD != -1) {
            if (jCurrentTimeMillis < jD) {
                this.f26314f.b(z12 ? this.f26312d : this.f26311c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jD + j11) {
                return b(str, str2);
            }
        }
        String strE2 = e(z12);
        return (strE2 != null || z11) ? new cg3(strE2, d(z12)) : b(str, str2);
    }

    final cg3 b(String str, String str2) throws IOException {
        if (str == null) {
            return f(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f26314f.b("paid_3p_hash_key", string);
        return f(h(str, str2, string), true);
    }

    final void c(boolean z11) throws IOException {
        String str = z11 ? this.f26312d : this.f26311c;
        eg3 eg3Var = this.f26314f;
        eg3Var.f(str);
        eg3Var.f(z11 ? this.f26310b : this.f26309a);
    }

    final long d(boolean z11) {
        return this.f26314f.d(z11 ? this.f26312d : this.f26311c, -1L);
    }

    final String e(boolean z11) {
        return this.f26314f.c(z11 ? this.f26310b : this.f26309a, null);
    }

    final cg3 f(String str, boolean z11) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f26313e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        eg3 eg3Var = this.f26314f;
        eg3Var.b(z11 ? this.f26312d : this.f26311c, Long.valueOf(jCurrentTimeMillis));
        eg3Var.b(z11 ? this.f26310b : this.f26309a, str);
        return new cg3(str, jCurrentTimeMillis);
    }

    final boolean g(boolean z11) {
        return this.f26314f.g(this.f26309a);
    }
}
