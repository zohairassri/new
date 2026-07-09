package y30;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Ly30/k;", "", "<init>", "()V", "a", "Ly30/k$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ly30/k$a;", "Ly30/k;", "", "isOnStage", "<init>", "(Z)V", "a", QueryKeys.MEMFLY_API_VERSION, "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isOnStage;

        public a(boolean z11) {
            super(null);
            this.isOnStage = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsOnStage() {
            return this.isOnStage;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}
