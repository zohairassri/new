package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class qj5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj5 f33672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaFormat f33673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gk5 f33674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Surface f33675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCrypto f33676e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pj5 f33677f;

    private qj5(vj5 vj5Var, MediaFormat mediaFormat, gk5 gk5Var, Surface surface, MediaCrypto mediaCrypto, pj5 pj5Var) {
        this.f33672a = vj5Var;
        this.f33673b = mediaFormat;
        this.f33674c = gk5Var;
        this.f33675d = surface;
        this.f33677f = pj5Var;
    }

    public static qj5 a(vj5 vj5Var, MediaFormat mediaFormat, gk5 gk5Var, MediaCrypto mediaCrypto, pj5 pj5Var) {
        return new qj5(vj5Var, mediaFormat, gk5Var, null, null, pj5Var);
    }

    public static qj5 b(vj5 vj5Var, MediaFormat mediaFormat, gk5 gk5Var, Surface surface, MediaCrypto mediaCrypto) {
        return new qj5(vj5Var, mediaFormat, gk5Var, surface, null, null);
    }
}
