package androidx.media3.decoder;

import h6.s;
import java.nio.ByteBuffer;
import p6.a;
import p6.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.media3.common.a f9098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f9099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f9100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f9103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f9104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f9105i;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class InsufficientCapacityException extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9107b;

        public InsufficientCapacityException(int i11, int i12) {
            super("Buffer too small (" + i11 + " < " + i12 + ")");
            this.f9106a = i11;
            this.f9107b = i12;
        }
    }

    static {
        s.a("media3.decoder");
    }

    public DecoderInputBuffer(int i11) {
        this(i11, 0);
    }

    private ByteBuffer r(int i11) {
        int i12 = this.f9104h;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.f9100d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i11);
    }

    public static DecoderInputBuffer w() {
        return new DecoderInputBuffer(0);
    }

    @Override // p6.a
    public void g() {
        super.g();
        ByteBuffer byteBuffer = this.f9100d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f9103g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f9101e = false;
    }

    public void t(int i11) {
        int i12 = i11 + this.f9105i;
        ByteBuffer byteBuffer = this.f9100d;
        if (byteBuffer == null) {
            this.f9100d = r(i12);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i12 + iPosition;
        if (iCapacity >= i13) {
            this.f9100d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferR = r(i13);
        byteBufferR.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferR.put(byteBuffer);
        }
        this.f9100d = byteBufferR;
    }

    public final void u() {
        ByteBuffer byteBuffer = this.f9100d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f9103g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean v() {
        return h(1073741824);
    }

    public void x(int i11) {
        ByteBuffer byteBuffer = this.f9103g;
        if (byteBuffer == null || byteBuffer.capacity() < i11) {
            this.f9103g = ByteBuffer.allocate(i11);
        } else {
            this.f9103g.clear();
        }
    }

    public DecoderInputBuffer(int i11, int i12) {
        this.f9099c = new c();
        this.f9104h = i11;
        this.f9105i = i12;
    }
}
