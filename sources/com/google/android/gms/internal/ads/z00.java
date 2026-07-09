package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class z00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f38945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38946c;

    protected z00(String str, Object obj, int i11) {
        this.f38944a = str;
        this.f38945b = obj;
        this.f38946c = i11;
    }

    public static z00 a(String str, boolean z11) {
        return new z00(str, Boolean.valueOf(z11), 1);
    }

    public static z00 b(String str, long j11) {
        return new z00(str, Long.valueOf(j11), 2);
    }

    public static z00 c(String str, double d11) {
        return new z00(str, Double.valueOf(d11), 3);
    }

    public static z00 d(String str, String str2) {
        return new z00("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object e() {
        g20 g20VarA = i20.a();
        if (g20VarA == null) {
            i20.b();
            return this.f38945b;
        }
        int i11 = this.f38946c - 1;
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? g20VarA.a(this.f38944a, (String) this.f38945b) : g20VarA.b(this.f38944a, ((Double) this.f38945b).doubleValue()) : g20VarA.zzb(this.f38944a, ((Long) this.f38945b).longValue()) : g20VarA.zza(this.f38944a, ((Boolean) this.f38945b).booleanValue());
    }
}
