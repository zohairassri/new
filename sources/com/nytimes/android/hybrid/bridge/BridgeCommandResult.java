package com.nytimes.android.hybrid.bridge;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0017\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0014BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u000eR'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lcom/nytimes/android/hybrid/bridge/BridgeCommandResult;", "", "", "id", "", "success", "", "error", "errorDetails", "", "values", "<init>", "(IZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, QueryKeys.SUBDOMAIN, "()Z", "Ljava/lang/String;", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Ljava/util/Map;", "()Ljava/util/Map;", QueryKeys.VISIT_FREQUENCY, "hybrid_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class BridgeCommandResult {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorDetails;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map values;

    /* JADX INFO: renamed from: com.nytimes.android.hybrid.bridge.BridgeCommandResult$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BridgeCommandResult b(Companion companion, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                str = null;
            }
            if ((i12 & 4) != 0) {
                str2 = null;
            }
            return companion.a(i11, str, str2);
        }

        public static /* synthetic */ BridgeCommandResult d(Companion companion, int i11, Map map, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                map = null;
            }
            return companion.c(i11, map);
        }

        public final BridgeCommandResult a(int i11, String str, String str2) {
            return new BridgeCommandResult(i11, false, str, str2, null, 16, null);
        }

        public final BridgeCommandResult c(int i11, Map map) {
            return new BridgeCommandResult(i11, true, null, null, map, 12, null);
        }

        private Companion() {
        }
    }

    public BridgeCommandResult(int i11, boolean z11, String str, String str2, Map map) {
        this.id = i11;
        this.success = z11;
        this.error = str;
        this.errorDetails = str2;
        this.values = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorDetails() {
        return this.errorDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Map getValues() {
        return this.values;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BridgeCommandResult)) {
            return false;
        }
        BridgeCommandResult bridgeCommandResult = (BridgeCommandResult) other;
        return this.id == bridgeCommandResult.id && this.success == bridgeCommandResult.success && Intrinsics.areEqual(this.error, bridgeCommandResult.error) && Intrinsics.areEqual(this.errorDetails, bridgeCommandResult.errorDetails) && Intrinsics.areEqual(this.values, bridgeCommandResult.values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        boolean z11 = this.success;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i11 = (iHashCode + r12) * 31;
        String str = this.error;
        int iHashCode2 = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDetails;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.values;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "BridgeCommandResult(id=" + this.id + ", success=" + this.success + ", error=" + this.error + ", errorDetails=" + this.errorDetails + ", values=" + this.values + ")";
    }

    public /* synthetic */ BridgeCommandResult(int i11, boolean z11, String str, String str2, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : map);
    }
}
