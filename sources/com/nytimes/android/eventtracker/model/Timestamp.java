package com.nytimes.android.eventtracker.model;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/nytimes/android/eventtracker/model/Timestamp;", "", "", "Lcom/nytimes/android/eventtracker/model/Time;", "timestamp", "", "usingDeviceTime", "<init>", "(JZ)V", "copy", "(JZ)Lcom/nytimes/android/eventtracker/model/Timestamp;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, "()Z", "et2_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Timestamp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean usingDeviceTime;

    public Timestamp(long j11, @g(name = "using_device_time") boolean z11) {
        this.timestamp = j11;
        this.usingDeviceTime = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getUsingDeviceTime() {
        return this.usingDeviceTime;
    }

    @NotNull
    public final Timestamp copy(long timestamp, @g(name = "using_device_time") boolean usingDeviceTime) {
        return new Timestamp(timestamp, usingDeviceTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Timestamp)) {
            return false;
        }
        Timestamp timestamp = (Timestamp) other;
        return this.timestamp == timestamp.timestamp && this.usingDeviceTime == timestamp.usingDeviceTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.timestamp) * 31) + Boolean.hashCode(this.usingDeviceTime);
    }

    public String toString() {
        return "Timestamp(timestamp=" + this.timestamp + ", usingDeviceTime=" + this.usingDeviceTime + ")";
    }
}
