package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23722a;

    public b75() {
        this.f23722a = new HashMap();
    }

    public final b75 a(String str, int i11) {
        this.f23722a.put(str, Integer.valueOf(i11));
        return this;
    }

    public final b75 b(String str, long j11) {
        this.f23722a.put(str, Long.valueOf(j11));
        return this;
    }

    public final b75 c(String str, float f11) {
        this.f23722a.put(str, Float.valueOf(f11));
        return this;
    }

    public final b75 d(String str, String str2) {
        this.f23722a.put(str, str2);
        return this;
    }

    public final b75 e(String str, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.f23722a.put(str, null);
            return this;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        this.f23722a.put(str, byteBufferAllocate);
        return this;
    }

    public final b75 f(String str) {
        this.f23722a.remove(str);
        return this;
    }

    public final z75 g() {
        return new z75(this.f23722a, null);
    }
}
