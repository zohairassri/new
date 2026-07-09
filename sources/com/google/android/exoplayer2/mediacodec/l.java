package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f20891a = new l() { // from class: ok.c
        @Override // com.google.android.exoplayer2.mediacodec.l
        public final List a(String str, boolean z11, boolean z12) {
            return MediaCodecUtil.s(str, z11, z12);
        }
    };

    List a(String str, boolean z11, boolean z12);
}
