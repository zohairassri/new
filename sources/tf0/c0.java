package tf0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f129923b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f129924a;

    public c0(Throwable th2, boolean z11) {
        this.f129924a = th2;
        this._handled$volatile = z11 ? 1 : 0;
    }

    public final boolean a() {
        return f129923b.get(this) == 1;
    }

    public final boolean c() {
        return f129923b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return r0.a(this) + '[' + this.f129924a + ']';
    }

    public /* synthetic */ c0(Throwable th2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i11 & 2) != 0 ? false : z11);
    }
}
