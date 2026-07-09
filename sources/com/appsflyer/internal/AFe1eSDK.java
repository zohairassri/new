package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AFe1eSDK<Result> implements Comparable<AFe1eSDK<?>>, Callable<AFe1cSDK> {
    private static final AtomicInteger component1 = new AtomicInteger();
    public volatile int AFAdRevenueData;
    private final int areAllFieldsValid;
    private final String component2;
    private Throwable component3;
    private long component4;

    @NonNull
    public final Set<AFf1zSDK> getCurrencyIso4217Code;
    public AFe1cSDK getMediationNetwork;

    @NonNull
    public final AFf1zSDK getMonetizationNetwork;

    @NonNull
    public final Set<AFf1zSDK> getRevenue;
    private boolean toString;

    public AFe1eSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getRevenue = hashSet;
        this.getCurrencyIso4217Code = new HashSet();
        int iIncrementAndGet = component1.incrementAndGet();
        this.areAllFieldsValid = iIncrementAndGet;
        this.toString = false;
        this.AFAdRevenueData = 0;
        this.getMonetizationNetwork = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.component2 = str;
        } else {
            this.component2 = String.valueOf(iIncrementAndGet);
        }
    }

    @NonNull
    protected abstract AFe1cSDK AFAdRevenueData() throws Exception;

    public final Throwable component1() {
        return this.component3;
    }

    protected final boolean component2() {
        return this.toString;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: component3, reason: merged with bridge method [inline-methods] */
    public final AFe1cSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.getMediationNetwork = null;
        this.component3 = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.AFAdRevenueData++;
        try {
            AFe1cSDK aFe1cSDKAFAdRevenueData = AFAdRevenueData();
            this.getMediationNetwork = aFe1cSDKAFAdRevenueData;
            return aFe1cSDKAFAdRevenueData;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1eSDK aFe1eSDK = (AFe1eSDK) obj;
        if (this.getMonetizationNetwork != aFe1eSDK.getMonetizationNetwork) {
            return false;
        }
        return this.component2.equals(aFe1eSDK.component2);
    }

    protected void getCurrencyIso4217Code(Throwable th2) {
    }

    protected abstract boolean getMediationNetwork();

    protected abstract long getMonetizationNetwork();

    public final int hashCode() {
        return (this.getMonetizationNetwork.hashCode() * 31) + this.component2.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getMonetizationNetwork);
        sb2.append("-");
        sb2.append(this.component2);
        String string = sb2.toString();
        if (String.valueOf(this.areAllFieldsValid).equals(this.component2)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append("-");
        sb3.append(this.areAllFieldsValid);
        return sb3.toString();
    }

    public void getCurrencyIso4217Code() {
        this.toString = true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1eSDK<?> aFe1eSDK) {
        int i11 = this.getMonetizationNetwork.AFLogger - aFe1eSDK.getMonetizationNetwork.AFLogger;
        if (i11 != 0) {
            return i11;
        }
        if (this.component2.equals(aFe1eSDK.component2)) {
            return 0;
        }
        return this.areAllFieldsValid - aFe1eSDK.areAllFieldsValid;
    }

    protected void getRevenue() {
    }
}
