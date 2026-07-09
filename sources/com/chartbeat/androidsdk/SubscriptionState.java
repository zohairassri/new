package com.chartbeat.androidsdk;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum SubscriptionState {
    LOGGED_IN { // from class: com.chartbeat.androidsdk.SubscriptionState.1
        @Override // java.lang.Enum
        public String toString() {
            return "lgdin";
        }
    },
    PAID { // from class: com.chartbeat.androidsdk.SubscriptionState.2
        @Override // java.lang.Enum
        public String toString() {
            return "paid";
        }
    },
    ANONYMOUS { // from class: com.chartbeat.androidsdk.SubscriptionState.3
        @Override // java.lang.Enum
        public String toString() {
            return "anon";
        }
    }
}
