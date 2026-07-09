package io.embrace.android.embracesdk.internal.capture.metadata;

import android.content.pm.ApplicationInfo;
import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.i;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class AppEnvironment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f104154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Environment f104155b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/embrace/android/embracesdk/internal/capture/metadata/AppEnvironment$Environment;", "", "", VideoRepository.XML_ATTR_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "()Ljava/lang/String;", "DEV", "PROD", "UNKNOWN", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Environment {
        DEV("dev"),
        PROD("prod"),
        UNKNOWN("UNKNOWN");


        @NotNull
        private final String value;

        Environment(String str) {
            this.value = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    public AppEnvironment(ApplicationInfo appInfo) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        boolean z11 = (appInfo.flags & 2) != 0;
        this.f104154a = z11;
        this.f104155b = z11 ? Environment.DEV : Environment.PROD;
    }

    public final Environment a() {
        return this.f104155b;
    }

    public final boolean b() {
        return this.f104154a;
    }
}
