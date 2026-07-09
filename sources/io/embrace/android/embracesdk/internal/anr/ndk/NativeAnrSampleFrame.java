package io.embrace.android.embracesdk.internal.anr.ndk;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/embrace/android/embracesdk/internal/anr/ndk/NativeAnrSampleFrame;", "", "", "programCounter", "soLoadAddr", "soName", "", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NativeAnrSampleFrame {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String programCounter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String soLoadAddr;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String soName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer result;

    public NativeAnrSampleFrame(@g(name = "program_counter") String str, @g(name = "so_load_addr") String str2, @g(name = "so_name") String str3, @g(name = "result") Integer num) {
        this.programCounter = str;
        this.soLoadAddr = str2;
        this.soName = str3;
        this.result = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getProgramCounter() {
        return this.programCounter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSoLoadAddr() {
        return this.soLoadAddr;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSoName() {
        return this.soName;
    }

    public /* synthetic */ NativeAnrSampleFrame(String str, String str2, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : num);
    }
}
