package k80;

import androidx.databinding.j;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lk80/b;", "Landroidx/databinding/j$a;", "Lvd0/b;", "<init>", "()V", "", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "dispose", "", "isDisposed", "()Z", "a", QueryKeys.MEMFLY_API_VERSION, "disposed", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b extends j.a implements vd0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    @Override // vd0.b
    public void dispose() {
        this.disposed = true;
        e();
    }

    public abstract void e();

    @Override // vd0.b
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }
}
