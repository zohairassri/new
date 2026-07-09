package com.statsig.androidsdk;

import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0006\u0010\u0006\u001a\u00020\u0004\u001a \u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"COOLDOWN_TIME_MS", "", "DEFAULT_TTL_MS", "extractPathFromUrl", "", "urlString", "getFallbackInfoStorageKey", "isDomainFailure", "", "errorMsg", "timedOut", "hasNetwork", "private-android-sdk_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class NetworkFallbackResolverKt {
    public static final long COOLDOWN_TIME_MS = 14400000;
    public static final long DEFAULT_TTL_MS = 604800000;

    public static final String extractPathFromUrl(@NotNull String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        try {
            return new URL(urlString).getPath();
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public static final String getFallbackInfoStorageKey() {
        return "statsig.network_fallback";
    }

    public static final boolean isDomainFailure(String str, boolean z11, boolean z12) {
        if (z12) {
            return z11 || str != null;
        }
        return false;
    }
}
