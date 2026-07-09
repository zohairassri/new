package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class qg {
    static Pair a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairE = e(randomAccessFile, 0);
        return pairE != null ? pairE : e(randomAccessFile, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    public static long b(ByteBuffer byteBuffer) {
        f(byteBuffer);
        return g(byteBuffer, byteBuffer.position() + 16);
    }

    public static void c(ByteBuffer byteBuffer, long j11) {
        f(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j11 >= 0 && j11 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j11);
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 27);
        sb2.append("uint32 value of out range: ");
        sb2.append(j11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static long d(ByteBuffer byteBuffer) {
        f(byteBuffer);
        return g(byteBuffer, byteBuffer.position() + 12);
    }

    private static Pair e(RandomAccessFile randomAccessFile, int i11) throws IOException {
        int i12;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i11, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        f(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i12 = -1;
        } else {
            int i13 = iCapacity - 22;
            int iMin = Math.min(i13, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            for (int i14 = 0; i14 < iMin; i14++) {
                i12 = i13 - i14;
                if (byteBufferAllocate.getInt(i12) == 101010256 && ((char) byteBufferAllocate.getShort(i12 + 20)) == i14) {
                    break;
                }
            }
            i12 = -1;
        }
        if (i12 == -1) {
            return null;
        }
        byteBufferAllocate.position(i12);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i12)));
    }

    private static void f(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static long g(ByteBuffer byteBuffer, int i11) {
        return ((long) byteBuffer.getInt(i11)) & 4294967295L;
    }
}
