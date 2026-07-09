package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AFj1nSDK implements SensorEventListener {

    @NonNull
    private final String AFAdRevenueData;

    @NonNull
    private final Executor component2;
    private long component3;

    @NonNull
    private final String getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private double getRevenue;
    private final float[][] component4 = new float[2][];
    private final long[] areAllFieldsValid = new long[2];

    AFj1nSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.getMonetizationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFAdRevenueData = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getCurrencyIso4217Code = str;
        this.getMediationNetwork = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.component2 = executorService;
    }

    private boolean AFAdRevenueData(int i11, @NonNull String str, @NonNull String str2) {
        return this.getMonetizationNetwork == i11 && this.AFAdRevenueData.equals(str) && this.getCurrencyIso4217Code.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H_, reason: merged with bridge method [inline-methods] */
    public void I_(SensorEvent sensorEvent) {
        long j11 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component4;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.component4[1] = fArrCopyOf;
            this.areAllFieldsValid[1] = jCurrentTimeMillis;
            this.getRevenue = getMonetizationNetwork(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j11 - this.component3) {
            this.component3 = j11;
            if (Arrays.equals(fArr4, fArr)) {
                this.areAllFieldsValid[1] = jCurrentTimeMillis;
                return;
            }
            double monetizationNetwork = getMonetizationNetwork(fArr3, fArr);
            if (monetizationNetwork > this.getRevenue) {
                this.component4[1] = Arrays.copyOf(fArr, fArr.length);
                this.areAllFieldsValid[1] = jCurrentTimeMillis;
                this.getRevenue = monetizationNetwork;
            }
        }
    }

    @NonNull
    private static List<Float> getCurrencyIso4217Code(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f11 : fArr) {
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    private static double getMonetizationNetwork(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i11 = 0; i11 < iMin; i11++) {
            dPow += StrictMath.pow(fArr[i11] - fArr2[i11], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1nSDK)) {
            return false;
        }
        AFj1nSDK aFj1nSDK = (AFj1nSDK) obj;
        return AFAdRevenueData(aFj1nSDK.getMonetizationNetwork, aFj1nSDK.AFAdRevenueData, aFj1nSDK.getCurrencyIso4217Code);
    }

    final void getMediationNetwork(@NonNull Map<AFj1nSDK, Map<String, Object>> map, boolean z11) {
        if (!getMonetizationNetwork()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getCurrencyIso4217Code());
            return;
        }
        map.put(this, getCurrencyIso4217Code());
        if (z11) {
            int length = this.component4.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.component4[i11] = null;
            }
            int length2 = this.areAllFieldsValid.length;
            for (int i12 = 0; i12 < length2; i12++) {
                this.areAllFieldsValid[i12] = 0;
            }
            this.getRevenue = 0.0d;
            this.component3 = 0L;
        }
    }

    public final int hashCode() {
        return this.getMediationNetwork;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component2.execute(new Runnable() { // from class: com.appsflyer.internal.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18793a.I_(sensorEvent);
                }
            });
        } else {
            I_(sensorEvent);
        }
    }

    @NonNull
    private Map<String, Object> getCurrencyIso4217Code() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMonetizationNetwork));
        concurrentHashMap.put("sN", this.AFAdRevenueData);
        concurrentHashMap.put("sV", this.getCurrencyIso4217Code);
        float[] fArr = this.component4[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getCurrencyIso4217Code(fArr));
        }
        float[] fArr2 = this.component4[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getCurrencyIso4217Code(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getMonetizationNetwork() {
        return this.component4[0] != null;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }
}
