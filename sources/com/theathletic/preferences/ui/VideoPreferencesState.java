package com.theathletic.preferences.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.theathletic.preferences.ui.k2, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/theathletic/preferences/ui/k2;", "", "", "isAutoPlayEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, "()Z", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoPreferencesState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAutoPlayEnabled;

    public VideoPreferencesState() {
        this(false, 1, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsAutoPlayEnabled() {
        return this.isAutoPlayEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VideoPreferencesState) && this.isAutoPlayEnabled == ((VideoPreferencesState) other).isAutoPlayEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAutoPlayEnabled);
    }

    public String toString() {
        return "VideoPreferencesState(isAutoPlayEnabled=" + this.isAutoPlayEnabled + ")";
    }

    public VideoPreferencesState(boolean z11) {
        this.isAutoPlayEnabled = z11;
    }

    public /* synthetic */ VideoPreferencesState(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}
