package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.internal.zzps;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzrp;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@zzps(zza = zzau.class, zzb = {"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
public abstract class TestingConfiguration {

    @NonNull
    public static final String PARAMETER_KEY = "tcnfp";

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface Builder {
        @NonNull
        TestingConfiguration build();

        @NonNull
        Builder disableExperiments(boolean z11);

        @NonNull
        Builder disableOnScreenDetection(boolean z11);

        @NonNull
        Builder disableSkipFadeTransition(boolean z11);

        @NonNull
        Builder enableMonitorAppLifecycle(boolean z11);

        Builder extraParams(zzrp<String, Object> zzrpVar);

        @NonNull
        Builder forceAndroidTvMode(boolean z11);

        Builder forceExperimentIds(zzrm<Integer> zzrmVar);

        @NonNull
        Builder forceTvMode(boolean z11);

        @NonNull
        Builder ignoreStrictModeFalsePositives(boolean z11);

        @NonNull
        Builder useTestStreamManager(boolean z11);

        @NonNull
        Builder useVideoElementMock(boolean z11);

        @NonNull
        Builder videoElementMockDuration(float f11);
    }

    TestingConfiguration() {
    }

    @NonNull
    public static Builder builder() {
        zzas zzasVar = new zzas();
        zzasVar.disableExperiments(true);
        zzasVar.disableOnScreenDetection(false);
        zzasVar.disableSkipFadeTransition(true);
        zzasVar.useVideoElementMock(false);
        zzasVar.videoElementMockDuration(30.0f);
        zzasVar.useTestStreamManager(false);
        zzasVar.ignoreStrictModeFalsePositives(false);
        zzasVar.forceTvMode(false);
        zzasVar.forceAndroidTvMode(false);
        zzasVar.forceExperimentIds(null);
        zzasVar.enableMonitorAppLifecycle(true);
        return zzasVar;
    }

    @NonNull
    public Builder copy() {
        zzas zzasVar = new zzas();
        zzasVar.disableExperiments(disableExperiments());
        zzasVar.disableOnScreenDetection(disableOnScreenDetection());
        zzasVar.disableSkipFadeTransition(disableSkipFadeTransition());
        zzasVar.useVideoElementMock(useVideoElementMock());
        zzasVar.videoElementMockDuration(videoElementMockDuration());
        zzasVar.useTestStreamManager(useTestStreamManager());
        zzasVar.forceExperimentIds(forceExperimentIds());
        zzasVar.enableMonitorAppLifecycle(enableMonitorAppLifecycle());
        zzasVar.forceTvMode(forceTvMode());
        zzasVar.forceAndroidTvMode(forceAndroidTvMode());
        zzasVar.ignoreStrictModeFalsePositives(ignoreStrictModeFalsePositives());
        zzasVar.extraParams(extraParams());
        return zzasVar;
    }

    public abstract boolean disableExperiments();

    public abstract boolean disableOnScreenDetection();

    public abstract boolean disableSkipFadeTransition();

    public abstract boolean enableMonitorAppLifecycle();

    public abstract zzrp<String, Object> extraParams();

    public abstract boolean forceAndroidTvMode();

    public abstract zzrm<Integer> forceExperimentIds();

    public abstract boolean forceTvMode();

    public abstract boolean ignoreStrictModeFalsePositives();

    public abstract boolean useTestStreamManager();

    public abstract boolean useVideoElementMock();

    public abstract float videoElementMockDuration();
}
