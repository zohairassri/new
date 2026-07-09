package com.google.android.exoplayer2.decoder;

import ak.a;
import ak.c;
import java.nio.ByteBuffer;
import xj.q;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class DecoderInputBuffer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f20360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f20363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20365h;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class InsufficientCapacityException extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20367b;

        public InsufficientCapacityException(int i11, int i12) {
            super("Buffer too small (" + i11 + " < " + i12 + ")");
            this.f20366a = i11;
            this.f20367b = i12;
        }
    }

    static {
        q.a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i11) {
        this(i11, 0);
    }

    private ByteBuffer t(int i11) {
        int i12 = this.f20364g;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.f20360c;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i11);
    }

    public static DecoderInputBuffer x() {
        return new DecoderInputBuffer(0);
    }

    @Override // ak.a
    public void g() {
        super.g();
        ByteBuffer byteBuffer = this.f20360c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f20363f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f20361d = false;
    }

    public void u(int i11) {
        int i12 = i11 + this.f20365h;
        ByteBuffer byteBuffer = this.f20360c;
        if (byteBuffer == null) {
            this.f20360c = t(i12);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i12 + iPosition;
        if (iCapacity >= i13) {
            this.f20360c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferT = t(i13);
        byteBufferT.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferT.put(byteBuffer);
        }
        this.f20360c = byteBufferT;
    }

    public final void v() {
        ByteBuffer byteBuffer = this.f20360c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f20363f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean w() {
        return j(1073741824);
    }

    public void y(int i11) {
        ByteBuffer byteBuffer = this.f20363f;
        if (byteBuffer == null || byteBuffer.capacity() < i11) {
            this.f20363f = ByteBuffer.allocate(i11);
        } else {
            this.f20363f.clear();
        }
    }

    public DecoderInputBuffer(int i11, int i12) {
        this.f20359b = new c();
        this.f20364g = i11;
        this.f20365h = i12;
    }
}
