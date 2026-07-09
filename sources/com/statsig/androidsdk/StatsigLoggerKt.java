package com.statsig.androidsdk;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"CONFIG_EXPOSURE", "", "DIAGNOSTICS_EVENT", "EXPOSURE_DEDUPE_INTERVAL", "", "FLUSH_TIMER_MS", "GATE_EXPOSURE", "LAYER_EXPOSURE", "MAX_EVENTS", "", "NON_EXPOSED_CHECKS_EVENT", "SHUTDOWN_WAIT_S", "private-android-sdk_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class StatsigLoggerKt {

    @NotNull
    public static final String CONFIG_EXPOSURE = "statsig::config_exposure";

    @NotNull
    public static final String DIAGNOSTICS_EVENT = "statsig::diagnostics";
    private static final long EXPOSURE_DEDUPE_INTERVAL = 600000;
    public static final long FLUSH_TIMER_MS = 60000;

    @NotNull
    public static final String GATE_EXPOSURE = "statsig::gate_exposure";

    @NotNull
    public static final String LAYER_EXPOSURE = "statsig::layer_exposure";
    public static final int MAX_EVENTS = 50;

    @NotNull
    public static final String NON_EXPOSED_CHECKS_EVENT = "statsig::non_exposed_checks";
    public static final long SHUTDOWN_WAIT_S = 3;
}
