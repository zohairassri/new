package k80;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.drawable.b0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lk80/a;", "T", "Lcom/theathletic/extension/b0;", "Lvd0/b;", "<init>", "()V", "", QueryKeys.DECAY, "dispose", "", "isDisposed", "()Z", "a", QueryKeys.MEMFLY_API_VERSION, "disposed", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a<T> extends b0<T> implements vd0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    @Override // vd0.b
    public void dispose() {
        this.disposed = true;
        j();
    }

    @Override // vd0.b
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    public abstract void j();
}
