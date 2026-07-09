package com.amazonaws.internal;

import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SdkDigestInputStream extends DigestInputStream implements MetricAware {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int SKIP_BUF_SIZE = 2048;

    public SdkDigestInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, messageDigest);
    }

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    public final boolean isMetricActivated() {
        if (((DigestInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((DigestInputStream) this).in).isMetricActivated();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        if (j11 <= 0) {
            return j11;
        }
        int iMin = (int) Math.min(2048L, j11);
        byte[] bArr = new byte[iMin];
        long j12 = j11;
        while (j12 > 0) {
            int i11 = read(bArr, 0, (int) Math.min(j12, iMin));
            if (i11 == -1) {
                if (j12 == j11) {
                    return -1L;
                }
                return j11 - j12;
            }
            j12 -= (long) i11;
        }
        return j11;
    }
}
