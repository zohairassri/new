package com.theathletic.analytics.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006%"}, d2 = {"Lcom/theathletic/analytics/data/local/FlexibleAnalyticsEvent;", "", "uid", "", "timestampMs", "kafkaTopicName", "", "schemaJsonBlob", "extrasJsonBlob", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUid", "()J", "setUid", "(J)V", "getTimestampMs", "setTimestampMs", "getKafkaTopicName", "()Ljava/lang/String;", "setKafkaTopicName", "(Ljava/lang/String;)V", "getSchemaJsonBlob", "setSchemaJsonBlob", "getExtrasJsonBlob", "setExtrasJsonBlob", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlexibleAnalyticsEvent {
    public static final int $stable = 8;

    @NotNull
    private String extrasJsonBlob;

    @NotNull
    private String kafkaTopicName;

    @NotNull
    private String schemaJsonBlob;
    private long timestampMs;
    private long uid;

    public FlexibleAnalyticsEvent(long j11, long j12, @NotNull String kafkaTopicName, @NotNull String schemaJsonBlob, @NotNull String extrasJsonBlob) {
        Intrinsics.checkNotNullParameter(kafkaTopicName, "kafkaTopicName");
        Intrinsics.checkNotNullParameter(schemaJsonBlob, "schemaJsonBlob");
        Intrinsics.checkNotNullParameter(extrasJsonBlob, "extrasJsonBlob");
        this.uid = j11;
        this.timestampMs = j12;
        this.kafkaTopicName = kafkaTopicName;
        this.schemaJsonBlob = schemaJsonBlob;
        this.extrasJsonBlob = extrasJsonBlob;
    }

    public static /* synthetic */ FlexibleAnalyticsEvent copy$default(FlexibleAnalyticsEvent flexibleAnalyticsEvent, long j11, long j12, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = flexibleAnalyticsEvent.uid;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = flexibleAnalyticsEvent.timestampMs;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = flexibleAnalyticsEvent.kafkaTopicName;
        }
        String str4 = str;
        if ((i11 & 8) != 0) {
            str2 = flexibleAnalyticsEvent.schemaJsonBlob;
        }
        String str5 = str2;
        if ((i11 & 16) != 0) {
            str3 = flexibleAnalyticsEvent.extrasJsonBlob;
        }
        return flexibleAnalyticsEvent.copy(j13, j14, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKafkaTopicName() {
        return this.kafkaTopicName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSchemaJsonBlob() {
        return this.schemaJsonBlob;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtrasJsonBlob() {
        return this.extrasJsonBlob;
    }

    @NotNull
    public final FlexibleAnalyticsEvent copy(long uid, long timestampMs, @NotNull String kafkaTopicName, @NotNull String schemaJsonBlob, @NotNull String extrasJsonBlob) {
        Intrinsics.checkNotNullParameter(kafkaTopicName, "kafkaTopicName");
        Intrinsics.checkNotNullParameter(schemaJsonBlob, "schemaJsonBlob");
        Intrinsics.checkNotNullParameter(extrasJsonBlob, "extrasJsonBlob");
        return new FlexibleAnalyticsEvent(uid, timestampMs, kafkaTopicName, schemaJsonBlob, extrasJsonBlob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlexibleAnalyticsEvent)) {
            return false;
        }
        FlexibleAnalyticsEvent flexibleAnalyticsEvent = (FlexibleAnalyticsEvent) other;
        return this.uid == flexibleAnalyticsEvent.uid && this.timestampMs == flexibleAnalyticsEvent.timestampMs && Intrinsics.areEqual(this.kafkaTopicName, flexibleAnalyticsEvent.kafkaTopicName) && Intrinsics.areEqual(this.schemaJsonBlob, flexibleAnalyticsEvent.schemaJsonBlob) && Intrinsics.areEqual(this.extrasJsonBlob, flexibleAnalyticsEvent.extrasJsonBlob);
    }

    @NotNull
    public final String getExtrasJsonBlob() {
        return this.extrasJsonBlob;
    }

    @NotNull
    public final String getKafkaTopicName() {
        return this.kafkaTopicName;
    }

    @NotNull
    public final String getSchemaJsonBlob() {
        return this.schemaJsonBlob;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.uid) * 31) + Long.hashCode(this.timestampMs)) * 31) + this.kafkaTopicName.hashCode()) * 31) + this.schemaJsonBlob.hashCode()) * 31) + this.extrasJsonBlob.hashCode();
    }

    public final void setExtrasJsonBlob(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extrasJsonBlob = str;
    }

    public final void setKafkaTopicName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.kafkaTopicName = str;
    }

    public final void setSchemaJsonBlob(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.schemaJsonBlob = str;
    }

    public final void setTimestampMs(long j11) {
        this.timestampMs = j11;
    }

    public final void setUid(long j11) {
        this.uid = j11;
    }

    @NotNull
    public String toString() {
        return "FlexibleAnalyticsEvent(uid=" + this.uid + ", timestampMs=" + this.timestampMs + ", kafkaTopicName=" + this.kafkaTopicName + ", schemaJsonBlob=" + this.schemaJsonBlob + ", extrasJsonBlob=" + this.extrasJsonBlob + ")";
    }

    public /* synthetic */ FlexibleAnalyticsEvent(long j11, long j12, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12, str, str2, str3);
    }
}
