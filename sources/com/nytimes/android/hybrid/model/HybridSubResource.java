package com.nytimes.android.hybrid.model;

import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/nytimes/android/hybrid/model/HybridSubResource;", "", "target", "", "isRequired", "", "(Ljava/lang/String;Z)V", "()Z", "getTarget", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "hybrid_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HybridSubResource {
    private final boolean isRequired;
    private final String target;

    /* JADX WARN: Multi-variable type inference failed */
    public HybridSubResource() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HybridSubResource copy$default(HybridSubResource hybridSubResource, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hybridSubResource.target;
        }
        if ((i11 & 2) != 0) {
            z11 = hybridSubResource.isRequired;
        }
        return hybridSubResource.copy(str, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    @NotNull
    public final HybridSubResource copy(String target, boolean isRequired) {
        return new HybridSubResource(target, isRequired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybridSubResource)) {
            return false;
        }
        HybridSubResource hybridSubResource = (HybridSubResource) other;
        return Intrinsics.areEqual(this.target, hybridSubResource.target) && this.isRequired == hybridSubResource.isRequired;
    }

    public final String getTarget() {
        return this.target;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        String str = this.target;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z11 = this.isRequired;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    @NotNull
    public String toString() {
        return "HybridSubResource(target=" + this.target + ", isRequired=" + this.isRequired + ")";
    }

    public HybridSubResource(String str, boolean z11) {
        this.target = str;
        this.isRequired = z11;
    }

    public /* synthetic */ HybridSubResource(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? true : z11);
    }
}
