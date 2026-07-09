package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class hk5 implements fk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f27784b;

    public hk5(boolean z11, boolean z12, boolean z13) {
        int i11 = 1;
        if (!z11 && !z12 && !z13) {
            i11 = 0;
        }
        this.f27783a = i11;
    }

    private final void c() {
        if (this.f27784b == null) {
            this.f27784b = new MediaCodecList(this.f27783a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.fk5
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.fk5
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.fk5
    public final int zza() {
        c();
        return this.f27784b.length;
    }

    @Override // com.google.android.gms.internal.ads.fk5
    public final MediaCodecInfo zzb(int i11) {
        c();
        return this.f27784b[i11];
    }

    @Override // com.google.android.gms.internal.ads.fk5
    public final boolean zzc() {
        return true;
    }
}
