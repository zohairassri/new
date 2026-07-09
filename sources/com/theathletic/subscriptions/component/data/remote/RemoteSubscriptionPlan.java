package com.theathletic.subscriptions.component.data.remote;

import com.theathletic.subscriptions.component.data.SubscriptionsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/theathletic/subscriptions/component/data/remote/RemoteSubscriptionPlan;", "", "description", "", SubscriptionsRepository.NOTES, "sku", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getNotes", "getSku", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemoteSubscriptionPlan {
    private final String description;
    private final String notes;

    @NotNull
    private final String sku;

    public RemoteSubscriptionPlan(String str, String str2, @NotNull String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.description = str;
        this.notes = str2;
        this.sku = sku;
    }

    public static /* synthetic */ RemoteSubscriptionPlan copy$default(RemoteSubscriptionPlan remoteSubscriptionPlan, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = remoteSubscriptionPlan.description;
        }
        if ((i11 & 2) != 0) {
            str2 = remoteSubscriptionPlan.notes;
        }
        if ((i11 & 4) != 0) {
            str3 = remoteSubscriptionPlan.sku;
        }
        return remoteSubscriptionPlan.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final RemoteSubscriptionPlan copy(String description, String notes, @NotNull String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new RemoteSubscriptionPlan(description, notes, sku);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteSubscriptionPlan)) {
            return false;
        }
        RemoteSubscriptionPlan remoteSubscriptionPlan = (RemoteSubscriptionPlan) other;
        return Intrinsics.areEqual(this.description, remoteSubscriptionPlan.description) && Intrinsics.areEqual(this.notes, remoteSubscriptionPlan.notes) && Intrinsics.areEqual(this.sku, remoteSubscriptionPlan.sku);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getNotes() {
        return this.notes;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notes;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.sku.hashCode();
    }

    @NotNull
    public String toString() {
        return "RemoteSubscriptionPlan(description=" + this.description + ", notes=" + this.notes + ", sku=" + this.sku + ")";
    }

    public /* synthetic */ RemoteSubscriptionPlan(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, str3);
    }
}
