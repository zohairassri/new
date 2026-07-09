package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class m15 {
    m15() {
    }

    protected static final int c(String str, byte[] bArr, int i11, int i12) {
        byte[] bytes = str.getBytes(jz4.f29316a);
        int length = bytes.length;
        if (length - i11 > i12) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i11, length);
        return i11 + length;
    }

    final boolean a(byte[] bArr, int i11, int i12) {
        return b(0, bArr, i11, i12) == 0;
    }

    protected abstract int b(int i11, byte[] bArr, int i12, int i13);
}
