package com.theathletic.slidestories.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/theathletic/slidestories/ui/e1;", "", "a", QueryKeys.PAGE_LOAD_TIME, "Lcom/theathletic/slidestories/ui/e1$a;", "Lcom/theathletic/slidestories/ui/e1$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e1 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/slidestories/ui/e1$a;", "Lcom/theathletic/slidestories/ui/e1;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81632a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.theathletic.slidestories.ui.e1$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/theathletic/slidestories/ui/e1$b;", "Lcom/theathletic/slidestories/ui/e1;", "", "isFullScreen", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FullScreenMode implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFullScreen;

        public FullScreenMode(boolean z11) {
            this.isFullScreen = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsFullScreen() {
            return this.isFullScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FullScreenMode) && this.isFullScreen == ((FullScreenMode) other).isFullScreen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFullScreen);
        }

        public String toString() {
            return "FullScreenMode(isFullScreen=" + this.isFullScreen + ")";
        }
    }
}
