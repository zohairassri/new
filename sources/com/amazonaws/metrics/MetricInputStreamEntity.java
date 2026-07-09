package com.amazonaws.metrics;

import com.amazonaws.internal.MetricAware;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.InputStreamEntity;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class MetricInputStreamEntity extends InputStreamEntity {
    private static final int BUFFER_SIZE = 2048;
    private final ByteThroughputHelper helper;

    public MetricInputStreamEntity(ThroughputMetricType throughputMetricType, InputStream inputStream, long j11) {
        super(inputStream, j11);
        this.helper = new ByteThroughputHelper(throughputMetricType);
    }

    private void writeToWithMetrics(OutputStream outputStream) throws IOException {
        int i11;
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream content = getContent();
        long contentLength = getContentLength();
        try {
            byte[] bArr = new byte[2048];
            if (contentLength < 0) {
                while (true) {
                    int i12 = content.read(bArr);
                    if (i12 == -1) {
                        break;
                    }
                    long jStartTiming = this.helper.startTiming();
                    outputStream.write(bArr, 0, i12);
                    this.helper.increment(i12, jStartTiming);
                }
            } else {
                while (contentLength > 0 && (i11 = content.read(bArr, 0, (int) Math.min(2048L, contentLength))) != -1) {
                    long jStartTiming2 = this.helper.startTiming();
                    outputStream.write(bArr, 0, i11);
                    this.helper.increment(i11, jStartTiming2);
                    contentLength -= (long) i11;
                }
            }
        } finally {
            this.helper.reportMetrics();
            content.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.http.entity.InputStreamEntity, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        if ((outputStream instanceof MetricAware) && ((MetricAware) outputStream).isMetricActivated()) {
            super.writeTo(outputStream);
        } else {
            writeToWithMetrics(outputStream);
        }
    }
}
