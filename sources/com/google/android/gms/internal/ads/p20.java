package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class p20 extends c30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f32643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f32644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f32645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f32648f;

    public p20(Drawable drawable, Uri uri, double d11, int i11, int i12, Map map) {
        this.f32643a = drawable;
        this.f32644b = uri;
        this.f32645c = d11;
        this.f32646d = i11;
        this.f32647e = i12;
        this.f32648f = map;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final com.google.android.gms.dynamic.a zzb() {
        return com.google.android.gms.dynamic.b.k1(this.f32643a);
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final Uri zzc() {
        return this.f32644b;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final double zzd() {
        return this.f32645c;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final int zze() {
        return this.f32646d;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final int zzf() {
        return this.f32647e;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final Map zzg() {
        return this.f32648f;
    }
}
