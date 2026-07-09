package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class mh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qv4 f30758a = qv4.a(new byte[0]);

    public static final qv4 a(int i11) {
        return qv4.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i11).array());
    }

    public static final qv4 b(int i11) {
        return qv4.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i11).array());
    }
}
