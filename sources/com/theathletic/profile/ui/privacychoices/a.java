package com.theathletic.profile.ui.privacychoices;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.utility.x;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/theathletic/profile/ui/privacychoices/a;", "Lcom/theathletic/utility/x;", "<init>", "()V", "a", "Lcom/theathletic/profile/ui/privacychoices/a$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a extends x {

    /* JADX INFO: renamed from: com.theathletic.profile.ui.privacychoices.a$a, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/theathletic/profile/ui/privacychoices/a$a;", "Lcom/theathletic/profile/ui/privacychoices/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, "isOptedIn", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetIsOptedIn extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOptedIn;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetIsOptedIn) && this.isOptedIn == ((SetIsOptedIn) other).isOptedIn;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOptedIn);
        }

        public String toString() {
            return "SetIsOptedIn(isOptedIn=" + this.isOptedIn + ")";
        }
    }

    private a() {
    }
}
