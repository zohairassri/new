package okio;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface f extends m0, WritableByteChannel {
    long A0(n0 n0Var);

    f I1(long j11);

    f P(int i11);

    f R0(long j11);

    f b2(h hVar);

    @Override // okio.m0, java.io.Flushable
    void flush();

    f g0();

    f r0(String str);

    f s();

    e w();

    f write(byte[] bArr);

    f write(byte[] bArr, int i11, int i12);

    f writeByte(int i11);

    f writeInt(int i11);

    f writeShort(int i11);

    f z0(String str, int i11, int i12);
}
