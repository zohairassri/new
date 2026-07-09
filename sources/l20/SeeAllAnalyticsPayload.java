package l20;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l20.z, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, d2 = {"Ll20/z;", "", "", "container", "", "moduleIndex", "parentObjectType", "parentObjectId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SeeAllAnalyticsPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String container;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int moduleIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentObjectType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentObjectId;

    public SeeAllAnalyticsPayload(String container, int i11, String parentObjectType, String parentObjectId) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(parentObjectType, "parentObjectType");
        Intrinsics.checkNotNullParameter(parentObjectId, "parentObjectId");
        this.container = container;
        this.moduleIndex = i11;
        this.parentObjectType = parentObjectType;
        this.parentObjectId = parentObjectId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getModuleIndex() {
        return this.moduleIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getParentObjectId() {
        return this.parentObjectId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getParentObjectType() {
        return this.parentObjectType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeeAllAnalyticsPayload)) {
            return false;
        }
        SeeAllAnalyticsPayload seeAllAnalyticsPayload = (SeeAllAnalyticsPayload) other;
        return Intrinsics.areEqual(this.container, seeAllAnalyticsPayload.container) && this.moduleIndex == seeAllAnalyticsPayload.moduleIndex && Intrinsics.areEqual(this.parentObjectType, seeAllAnalyticsPayload.parentObjectType) && Intrinsics.areEqual(this.parentObjectId, seeAllAnalyticsPayload.parentObjectId);
    }

    public int hashCode() {
        return (((((this.container.hashCode() * 31) + Integer.hashCode(this.moduleIndex)) * 31) + this.parentObjectType.hashCode()) * 31) + this.parentObjectId.hashCode();
    }

    public String toString() {
        return "SeeAllAnalyticsPayload(container=" + this.container + ", moduleIndex=" + this.moduleIndex + ", parentObjectType=" + this.parentObjectType + ", parentObjectId=" + this.parentObjectId + ")";
    }

    public /* synthetic */ SeeAllAnalyticsPayload(String str, int i11, String str2, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? "" : str3);
    }
}
