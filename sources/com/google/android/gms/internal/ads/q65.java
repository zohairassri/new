package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class q65 extends o65 implements mi {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33463i;

    protected q65(String str) {
        super("mvhd");
    }

    public final int e() {
        if (!this.f31786b) {
            d();
        }
        return this.f33463i;
    }

    protected final long f(ByteBuffer byteBuffer) {
        this.f33463i = li.c(byteBuffer.get());
        li.b(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
