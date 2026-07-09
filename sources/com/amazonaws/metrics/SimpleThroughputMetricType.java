package com.amazonaws.metrics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class SimpleThroughputMetricType extends SimpleServiceMetricType implements ThroughputMetricType {
    private final ServiceMetricType byteCountMetricType;

    public SimpleThroughputMetricType(String str, String str2, String str3) {
        super(str, str2);
        this.byteCountMetricType = new SimpleServiceMetricType(str3, str2);
    }

    @Override // com.amazonaws.metrics.ThroughputMetricType
    public ServiceMetricType getByteCountMetricType() {
        return this.byteCountMetricType;
    }
}
