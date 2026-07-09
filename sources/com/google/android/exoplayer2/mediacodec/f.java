package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class f extends DecoderInputBuffer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20861i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20863m;

    public f() {
        super(2);
        this.f20863m = 32;
    }

    private boolean A(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!E()) {
            return true;
        }
        if (this.f20862l >= this.f20863m || decoderInputBuffer.l() != l()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f20360c;
        return byteBuffer2 == null || (byteBuffer = this.f20360c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long B() {
        return this.f20362e;
    }

    public long C() {
        return this.f20861i;
    }

    public int D() {
        return this.f20862l;
    }

    public boolean E() {
        return this.f20862l > 0;
    }

    public void F(int i11) {
        ml.a.a(i11 > 0);
        this.f20863m = i11;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, ak.a
    public void g() {
        super.g();
        this.f20862l = 0;
    }

    public boolean z(DecoderInputBuffer decoderInputBuffer) {
        ml.a.a(!decoderInputBuffer.w());
        ml.a.a(!decoderInputBuffer.k());
        ml.a.a(!decoderInputBuffer.n());
        if (!A(decoderInputBuffer)) {
            return false;
        }
        int i11 = this.f20862l;
        this.f20862l = i11 + 1;
        if (i11 == 0) {
            this.f20362e = decoderInputBuffer.f20362e;
            if (decoderInputBuffer.p()) {
                r(1);
            }
        }
        if (decoderInputBuffer.l()) {
            r(IntCompanionObject.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f20360c;
        if (byteBuffer != null) {
            u(byteBuffer.remaining());
            this.f20360c.put(byteBuffer);
        }
        this.f20861i = decoderInputBuffer.f20362e;
        return true;
    }
}
