package com.comscore.util.setup;

import com.comscore.util.ObfuscationChecker;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Setup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f19494a = "comScore";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static JniComScoreHelper f19495b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static PlatformSetup f19496c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f19497d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f19498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f19499f = new Object();

    private static void a() {
        String analyticsVersionNative = getAnalyticsVersionNative();
        String javaCodeVersion = f19496c.getJavaCodeVersion();
        if (analyticsVersionNative == null) {
            Logger.e("Unable to retrieve the native version.");
            return;
        }
        if (analyticsVersionNative.equals(javaCodeVersion)) {
            return;
        }
        throw new IllegalStateException("The version of the comScore java code (" + javaCodeVersion + ") and the native library (" + analyticsVersionNative + ") are different. Check which version of the comScore SDK is being used.");
    }

    private static boolean b() {
        if (!f19496c.shouldLoadCppLibrary()) {
            Logger.e("Unsupported platform", new RuntimeException("This platform is not supported. The comScore native library will not be loaded."));
            return false;
        }
        PlatformSetup platformSetup = f19496c;
        String str = f19494a;
        String strBuildNativeLibraryName = platformSetup.buildNativeLibraryName(f19494a);
        if (strBuildNativeLibraryName != null) {
            str = strBuildNativeLibraryName;
        }
        String strBuildNativeLibraryPath = f19496c.buildNativeLibraryPath(str);
        if (strBuildNativeLibraryPath != null) {
            try {
                if (strBuildNativeLibraryPath.length() == 0) {
                    System.loadLibrary(str);
                } else {
                    System.load(strBuildNativeLibraryPath);
                }
            } catch (UnsatisfiedLinkError e11) {
                if (strBuildNativeLibraryPath != null && strBuildNativeLibraryPath.length() != 0) {
                    str = strBuildNativeLibraryPath;
                }
                Logger.e("Error loading the native library: " + str, e11);
                return false;
            }
        } else {
            System.loadLibrary(str);
        }
        configureNative(f19495b);
        return true;
    }

    private static native void configureNative(JniComScoreHelper jniComScoreHelper);

    private static native String getAnalyticsVersionNative();

    public static JniComScoreHelper getJniComScoreHelper() {
        return f19495b;
    }

    public static PlatformSetup getPlatformSetup() {
        return f19496c;
    }

    public static boolean isNativeLibrarySuccessfullyLoaded() {
        return f19498e;
    }

    public static boolean isSetUpFinished() {
        return f19497d;
    }

    public static void setUp() {
        if (f19497d) {
            return;
        }
        synchronized (f19499f) {
            try {
                if (!f19497d) {
                    if (new ObfuscationChecker().isCodeObfuscated()) {
                        throw new IllegalStateException("comScore SDK has been obfuscated. Did you add in your proguard-project.txt the following lines?\n-keep class com.comscore.** { *; }\n-dontwarn com.comscore.**");
                    }
                    CustomPlatformSetup customPlatformSetup = new CustomPlatformSetup();
                    f19496c = customPlatformSetup;
                    f19495b = customPlatformSetup.createApplicationInfoHelper();
                    Logger.log = f19496c.createLogger();
                    boolean zB = b();
                    f19498e = zB;
                    f19497d = true;
                    if (zB) {
                        a();
                        Logger.syncrhonizeLogLevelWithNative();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
