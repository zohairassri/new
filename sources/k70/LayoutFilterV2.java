package k70;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k70.gx, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lk70/gx;", "", "", "layout_type", "", "consumable_types", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "Ljava/util/List;", "()Ljava/util/List;", "graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LayoutFilterV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String layout_type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List consumable_types;

    public LayoutFilterV2(String layout_type, List consumable_types) {
        Intrinsics.checkNotNullParameter(layout_type, "layout_type");
        Intrinsics.checkNotNullParameter(consumable_types, "consumable_types");
        this.layout_type = layout_type;
        this.consumable_types = consumable_types;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getConsumable_types() {
        return this.consumable_types;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLayout_type() {
        return this.layout_type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LayoutFilterV2)) {
            return false;
        }
        LayoutFilterV2 layoutFilterV2 = (LayoutFilterV2) other;
        return Intrinsics.areEqual(this.layout_type, layoutFilterV2.layout_type) && Intrinsics.areEqual(this.consumable_types, layoutFilterV2.consumable_types);
    }

    public int hashCode() {
        return (this.layout_type.hashCode() * 31) + this.consumable_types.hashCode();
    }

    public String toString() {
        return "LayoutFilterV2(layout_type=" + this.layout_type + ", consumable_types=" + this.consumable_types + ")";
    }
}
