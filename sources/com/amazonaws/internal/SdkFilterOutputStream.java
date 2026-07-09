package com.amazonaws.internal;

import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class SdkFilterOutputStream extends FilterOutputStream implements MetricAware {
    public SdkFilterOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.amazonaws.internal.MetricAware
    public boolean isMetricActivated() {
        Closeable closeable = ((FilterOutputStream) this).out;
        if (closeable instanceof MetricAware) {
            return ((MetricAware) closeable).isMetricActivated();
        }
        return false;
    }
}
