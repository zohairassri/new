package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class f extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f20219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f20220j;

    f() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) ml.a.e(this.f20220j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f20212b.f20076d) * this.f20213c.f20076d);
        while (iPosition < iLimit) {
            for (int i11 : iArr) {
                byteBufferL.putShort(byteBuffer.getShort((i11 * 2) + iPosition));
            }
            iPosition += this.f20212b.f20076d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // com.google.android.exoplayer2.audio.e
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f20219i;
        if (iArr == null) {
            return AudioProcessor.a.f20072e;
        }
        if (aVar.f20075c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z11 = aVar.f20074b != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= aVar.f20074b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z11 |= i12 != i11;
            i11++;
        }
        return z11 ? new AudioProcessor.a(aVar.f20073a, iArr.length, 2) : AudioProcessor.a.f20072e;
    }

    @Override // com.google.android.exoplayer2.audio.e
    protected void i() {
        this.f20220j = this.f20219i;
    }

    @Override // com.google.android.exoplayer2.audio.e
    protected void k() {
        this.f20220j = null;
        this.f20219i = null;
    }

    public void m(int[] iArr) {
        this.f20219i = iArr;
    }
}
