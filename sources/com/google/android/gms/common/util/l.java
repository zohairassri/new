package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class l {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, false, 1024);
    }

    public static long c(InputStream inputStream, OutputStream outputStream, boolean z11, int i11) {
        byte[] bArr = new byte[i11];
        long j11 = 0;
        while (true) {
            try {
                int i12 = inputStream.read(bArr, 0, i11);
                if (i12 == -1) {
                    break;
                }
                j11 += (long) i12;
                outputStream.write(bArr, 0, i12);
            } catch (Throwable th2) {
                if (z11) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th2;
            }
        }
        if (z11) {
            a(inputStream);
            a(outputStream);
        }
        return j11;
    }

    public static byte[] d(InputStream inputStream, boolean z11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z11, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
