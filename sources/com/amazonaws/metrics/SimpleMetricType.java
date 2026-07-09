package com.amazonaws.metrics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class SimpleMetricType implements MetricType {
    public final boolean equals(Object obj) {
        if (obj instanceof MetricType) {
            return name().equals(((MetricType) obj).name());
        }
        return false;
    }

    public final int hashCode() {
        return name().hashCode();
    }

    @Override // com.amazonaws.metrics.MetricType
    public abstract String name();

    public final String toString() {
        return name();
    }
}
