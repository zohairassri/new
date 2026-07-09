package com.theathletic.auth.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/theathletic/auth/ui/a;", "", QueryKeys.PAGE_LOAD_TIME, "a", "Lcom/theathletic/auth/ui/a$a;", "Lcom/theathletic/auth/ui/a$b;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: com.theathletic.auth.ui.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/theathletic/auth/ui/a$a;", "Lcom/theathletic/auth/ui/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0429a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0429a f50937a = new C0429a();

        private C0429a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C0429a);
        }

        public int hashCode() {
            return 1680267781;
        }

        public String toString() {
            return "LaunchDebugTools";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.auth.ui.a$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/theathletic/auth/ui/a$b;", "Lcom/theathletic/auth/ui/a;", "", "shouldShowOnBoarding", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, "()Z", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LaunchNextScreen implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowOnBoarding;

        public LaunchNextScreen(boolean z11) {
            this.shouldShowOnBoarding = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShouldShowOnBoarding() {
            return this.shouldShowOnBoarding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchNextScreen) && this.shouldShowOnBoarding == ((LaunchNextScreen) other).shouldShowOnBoarding;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldShowOnBoarding);
        }

        public String toString() {
            return "LaunchNextScreen(shouldShowOnBoarding=" + this.shouldShowOnBoarding + ")";
        }
    }
}
