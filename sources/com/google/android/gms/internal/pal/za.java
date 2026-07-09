package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f42274b;

    protected za(String str, Object obj, int i11) {
        this.f42273a = str;
        this.f42274b = obj;
    }

    public static za a(String str, boolean z11) {
        return new za(str, Boolean.valueOf(z11), 1);
    }

    public final Object b() {
        cb cbVarA = eb.a();
        if (cbVarA != null) {
            return cbVarA.zza(this.f42273a, ((Boolean) this.f42274b).booleanValue());
        }
        eb.b();
        return this.f42274b;
    }
}
