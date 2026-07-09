package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface lv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f30452a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void b(ByteBuffer byteBuffer);

    void c(kt0 kt0Var);

    js0 d(js0 js0Var);

    boolean zzc();

    void zze();

    ByteBuffer zzf();

    boolean zzg();

    void zzj();

    default long a(long j11) {
        return j11;
    }
}
