package io.agora.utils2.internal;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceUtils {
    private static final List<String> CPU_TEMP_FILE_PATHS = Arrays.asList("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp");
    private static double INVALIED_TMPERATURE = -100000.0d;
    private static final String TAG = "DeviceUtils";
    private static double TMPERATURE_HIGH_THR = 250.0d;
    private static double TMPERATURE_LOW_THR = -30.0d;

    static int getCpuTemperature() {
        return getCpuTemperature(CPU_TEMP_FILE_PATHS);
    }

    public static String getDeviceId() {
        String strReplace = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(strReplace)) {
            strReplace = strReplace.replace('/', '_');
        }
        String strReplace2 = Build.MODEL;
        if (!TextUtils.isEmpty(strReplace2)) {
            strReplace2 = strReplace2.replace('/', '_');
        }
        String strReplace3 = Build.PRODUCT;
        if (!TextUtils.isEmpty(strReplace3)) {
            strReplace3 = strReplace3.replace('/', '_');
        }
        String strReplace4 = Build.HARDWARE;
        if (!TextUtils.isEmpty(strReplace4)) {
            strReplace4 = strReplace4.replace('/', '_');
        }
        String lowerCase = (strReplace + "/" + strReplace2 + "/" + strReplace3 + "/" + Build.VERSION.SDK_INT + "/" + strReplace4).toLowerCase();
        Matcher matcher = Pattern.compile(".*[A-Z][A-M][0-9]$").matcher(Build.ID);
        if (Build.BRAND.toLowerCase().equals("samsung") && Build.DEVICE.toLowerCase().startsWith("cs02")) {
            matcher.find();
        }
        return lowerCase;
    }

    public static String getDeviceInfo() {
        String strReplace = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(strReplace)) {
            strReplace = strReplace.replace('/', '_');
        }
        String strReplace2 = Build.MODEL;
        if (!TextUtils.isEmpty(strReplace2)) {
            strReplace2 = strReplace2.replace('/', '_');
        }
        return (strReplace + "/" + strReplace2).toLowerCase();
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER.toLowerCase();
    }

    public static String getSystemInfo() {
        return "Android/" + Build.VERSION.RELEASE;
    }

    static double getValidateTemperature(double d11) throws IllegalArgumentException {
        if (Math.abs(d11) > 1000.0d) {
            double d12 = d11 / 1000.0d;
            if (isTemperatureValid(d12)) {
                return d12;
            }
        } else if (isTemperatureValid(d11)) {
            return d11;
        }
        throw new IllegalArgumentException("not a validate temperature value");
    }

    static boolean isTemperatureValid(double d11) {
        return d11 >= TMPERATURE_LOW_THR && d11 <= TMPERATURE_HIGH_THR;
    }

    static double parseDouble(String str, double d11) {
        try {
            return Double.parseDouble(str);
        } catch (Exception e11) {
            Logging.d(TAG, "failed to conver string to double " + e11.toString());
            return d11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0056 A[EXC_TOP_SPLITTER, PHI: r2
      0x0056: PHI (r2v5 java.io.BufferedReader) = (r2v4 java.io.BufferedReader), (r2v6 java.io.BufferedReader) binds: [B:26:0x0054, B:32:0x0064] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static double readDoubleValueFromFileFirstLine(java.lang.String r4, double r5) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "DeviceUtils"
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            boolean r4 = r1.exists()
            if (r4 != 0) goto Le
            goto L67
        Le:
            r4 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34 java.io.FileNotFoundException -> L38
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34 java.io.FileNotFoundException -> L38
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34 java.io.FileNotFoundException -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L34 java.io.FileNotFoundException -> L38
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.FileNotFoundException -> L2e
            double r4 = parseDouble(r4, r5)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.FileNotFoundException -> L2e
            r2.close()     // Catch: java.io.IOException -> L25
            return r4
        L25:
            r6 = move-exception
            r6.printStackTrace()
            return r4
        L2a:
            r4 = move-exception
            goto L68
        L2c:
            r4 = move-exception
            goto L3c
        L2e:
            r4 = move-exception
            goto L5f
        L30:
            r5 = move-exception
            r2 = r4
            r4 = r5
            goto L68
        L34:
            r1 = move-exception
            r2 = r4
            r4 = r1
            goto L3c
        L38:
            r1 = move-exception
            r2 = r4
            r4 = r1
            goto L5f
        L3c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "failed to read from file "
            r1.append(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2a
            r1.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2a
            io.agora.utils2.internal.Logging.d(r0, r4)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L67
        L56:
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L67
        L5a:
            r4 = move-exception
            r4.printStackTrace()
            goto L67
        L5f:
            java.lang.String r1 = "failed to read from file"
            io.agora.utils2.internal.Logging.d(r0, r1, r4)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L67
            goto L56
        L67:
            return r5
        L68:
            if (r2 == 0) goto L72
            r2.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r5 = move-exception
            r5.printStackTrace()
        L72:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.internal.DeviceUtils.readDoubleValueFromFileFirstLine(java.lang.String, double):double");
    }

    static int getCpuTemperature(@NonNull List<String> list) {
        double validateTemperature = 0.0d;
        for (String str : list) {
            try {
                validateTemperature = getValidateTemperature(readDoubleValueFromFileFirstLine(str, INVALIED_TMPERATURE));
                Logging.d(TAG, "getCpuTemperature from file: " + str);
                break;
            } catch (IllegalArgumentException unused) {
                Logging.d(TAG, "can't getCpuTemperature from file: " + str);
            }
        }
        return (int) (validateTemperature * 1000.0d);
    }
}
