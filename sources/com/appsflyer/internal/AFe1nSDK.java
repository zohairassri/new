package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AFe1nSDK {
    public final long getRevenue;

    public AFe1nSDK(long j11) {
        this.getRevenue = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getRevenue == ((AFe1nSDK) obj).getRevenue;
    }

    public int hashCode() {
        long j11 = this.getRevenue;
        return (int) (j11 ^ (j11 >>> 32));
    }
}
