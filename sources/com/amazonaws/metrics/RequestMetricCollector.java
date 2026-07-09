package com.amazonaws.metrics;

import com.amazonaws.Request;
import com.amazonaws.Response;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class RequestMetricCollector {
    public static final RequestMetricCollector NONE = new RequestMetricCollector() { // from class: com.amazonaws.metrics.RequestMetricCollector.1
        @Override // com.amazonaws.metrics.RequestMetricCollector
        public boolean isEnabled() {
            return false;
        }

        @Override // com.amazonaws.metrics.RequestMetricCollector
        public void collectMetrics(Request<?> request, Response<?> response) {
        }
    };

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface Factory {
        RequestMetricCollector getRequestMetricCollector();
    }

    public abstract void collectMetrics(Request<?> request, Response<?> response);

    public boolean isEnabled() {
        return true;
    }
}
