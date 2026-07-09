package j70;

import com.chartbeat.androidsdk.QueryKeys;
import j70.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j70.a, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lj70/a;", "", "", "view", "Lj70/i$u;", "section", "Lj70/i$z;", "type", "<init>", "(ZLj70/i$u;Lj70/i$z;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Z", QueryKeys.PAGE_LOAD_TIME, "Lj70/i$u;", "()Lj70/i$u;", "Lj70/i$z;", "()Lj70/i$z;", "analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Asset {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.u section;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.z type;

    public Asset() {
        this(false, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i.u getSection() {
        return this.section;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i.z getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getView() {
        return this.view;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) other;
        return this.view == asset.view && this.section == asset.section && this.type == asset.type;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.view) * 31) + this.section.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Asset(view=" + this.view + ", section=" + this.section + ", type=" + this.type + ")";
    }

    public Asset(boolean z11, i.u section, i.z type) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(type, "type");
        this.view = z11;
        this.section = section;
        this.type = type;
    }

    public /* synthetic */ Asset(boolean z11, i.u uVar, i.z zVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? i.u.UNDEFINED : uVar, (i11 & 4) != 0 ? i.z.UNDEFINED : zVar);
    }
}
