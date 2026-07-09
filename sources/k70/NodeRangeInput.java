package k70;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k70.r40, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lk70/r40;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "field", "Llc/t0;", QueryKeys.PAGE_LOAD_TIME, "Llc/t0;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Llc/t0;", "gte", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "lte", QueryKeys.SUBDOMAIN, "gt", "lt", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NodeRangeInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String field;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 gte;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 lte;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 gt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final lc.t0 lt;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getField() {
        return this.field;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final lc.t0 getGt() {
        return this.gt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final lc.t0 getGte() {
        return this.gte;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final lc.t0 getLt() {
        return this.lt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final lc.t0 getLte() {
        return this.lte;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NodeRangeInput)) {
            return false;
        }
        NodeRangeInput nodeRangeInput = (NodeRangeInput) other;
        return Intrinsics.areEqual(this.field, nodeRangeInput.field) && Intrinsics.areEqual(this.gte, nodeRangeInput.gte) && Intrinsics.areEqual(this.lte, nodeRangeInput.lte) && Intrinsics.areEqual(this.gt, nodeRangeInput.gt) && Intrinsics.areEqual(this.lt, nodeRangeInput.lt);
    }

    public int hashCode() {
        return (((((((this.field.hashCode() * 31) + this.gte.hashCode()) * 31) + this.lte.hashCode()) * 31) + this.gt.hashCode()) * 31) + this.lt.hashCode();
    }

    public String toString() {
        return "NodeRangeInput(field=" + this.field + ", gte=" + this.gte + ", lte=" + this.lte + ", gt=" + this.gt + ", lt=" + this.lt + ")";
    }
}
