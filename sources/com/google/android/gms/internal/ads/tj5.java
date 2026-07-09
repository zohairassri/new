package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface tj5 {
    ByteBuffer L(int i11);

    void a(int i11, long j11);

    void b(int i11);

    void c(Surface surface);

    int d(MediaCodec.BufferInfo bufferInfo);

    void d0(Bundle bundle);

    void e(int i11, boolean z11);

    void f(int i11, int i12, int i13, long j11, int i14);

    void g(int i11, int i12, z05 z05Var, long j11, int i13);

    default void h(Runnable runnable) {
        runnable.run();
    }

    default boolean i(sj5 sj5Var) {
        return false;
    }

    void j(List list);

    int zze();

    MediaFormat zzg();

    ByteBuffer zzh(int i11);

    void zzk();

    void zzl();

    void zzo();
}
