package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pj5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f32989a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LoudnessCodecController f32990b;

    public pj5(oj5 oj5Var) {
    }

    public final void a(int i11) {
        LoudnessCodecController loudnessCodecController = this.f32990b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f32990b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i11, d74.a(), new mj5(this));
        this.f32990b = loudnessCodecControllerCreate;
        Iterator it = this.f32989a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f32990b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            jx3.i(this.f32989a.add(mediaCodec));
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f32989a.remove(mediaCodec) || (loudnessCodecController = this.f32990b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d() {
        this.f32989a.clear();
        LoudnessCodecController loudnessCodecController = this.f32990b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
