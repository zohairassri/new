package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class f extends DecoderInputBuffer {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f9999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10001n;

    public f() {
        super(2);
        this.f10001n = 32;
    }

    private boolean z(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!D()) {
            return true;
        }
        if (this.f10000m >= this.f10001n) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f9100d;
        return byteBuffer2 == null || (byteBuffer = this.f9100d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long A() {
        return this.f9102f;
    }

    public long B() {
        return this.f9999l;
    }

    public int C() {
        return this.f10000m;
    }

    public boolean D() {
        return this.f10000m > 0;
    }

    public void E(int i11) {
        k6.a.a(i11 > 0);
        this.f10001n = i11;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, p6.a
    public void g() {
        super.g();
        this.f10000m = 0;
    }

    public boolean y(DecoderInputBuffer decoderInputBuffer) {
        k6.a.a(!decoderInputBuffer.v());
        k6.a.a(!decoderInputBuffer.j());
        k6.a.a(!decoderInputBuffer.k());
        if (!z(decoderInputBuffer)) {
            return false;
        }
        int i11 = this.f10000m;
        this.f10000m = i11 + 1;
        if (i11 == 0) {
            this.f9102f = decoderInputBuffer.f9102f;
            if (decoderInputBuffer.n()) {
                q(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f9100d;
        if (byteBuffer != null) {
            t(byteBuffer.remaining());
            this.f9100d.put(byteBuffer);
        }
        this.f9999l = decoderInputBuffer.f9102f;
        return true;
    }
}
