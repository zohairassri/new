package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFi1jSDK;", "", "Lcom/appsflyer/internal/AFi1gSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFi1gSDK;", "", "getRevenue", "()Z", "Lcom/appsflyer/internal/AFi1dSDK;", "p0", "", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFi1dSDK;)V", "AFAdRevenueData", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AFi1jSDK {

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.getCurrencyIso4217Code;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1jSDK$AFa1ySDK, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class Companion {
        static final /* synthetic */ Companion getCurrencyIso4217Code = new Companion();
        private static long AFAdRevenueData = 10000;

        private Companion() {
        }

        public static long getMonetizationNetwork() {
            return AFAdRevenueData;
        }
    }

    boolean AFAdRevenueData();

    void getCurrencyIso4217Code(@NotNull AFi1dSDK p02);

    AFi1gSDK getMediationNetwork();

    boolean getRevenue();
}
