package io.embrace.android.embracesdk.internal.payload;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/NativeThreadAnrSample;", "", "result", "", "sampleTimestamp", "", "sampleDurationMs", "stackframes", "", "Lio/embrace/android/embracesdk/internal/payload/NativeThreadAnrStackframe;", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "getResult", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSampleDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSampleTimestamp", "getStackframes", "()Ljava/util/List;", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NativeThreadAnrSample {
    private final Integer result;
    private final Long sampleDurationMs;
    private final Long sampleTimestamp;
    private final List<NativeThreadAnrStackframe> stackframes;

    public NativeThreadAnrSample(Integer num, Long l11, Long l12, List<NativeThreadAnrStackframe> list) {
        this.result = num;
        this.sampleTimestamp = l11;
        this.sampleDurationMs = l12;
        this.stackframes = list;
    }

    public final Integer getResult() {
        return this.result;
    }

    public final Long getSampleDurationMs() {
        return this.sampleDurationMs;
    }

    public final Long getSampleTimestamp() {
        return this.sampleTimestamp;
    }

    public final List<NativeThreadAnrStackframe> getStackframes() {
        return this.stackframes;
    }
}
