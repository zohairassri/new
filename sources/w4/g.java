package w4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f134048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f134049b;

    public g(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f134048a = new Object[i11];
    }

    private final boolean c(Object obj) {
        int i11 = this.f134049b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f134048a[i12] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // w4.f
    public boolean a(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f134049b;
        Object[] objArr = this.f134048a;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.f134049b = i11 + 1;
        return true;
    }

    @Override // w4.f
    public Object b() {
        int i11 = this.f134049b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object obj = this.f134048a[i12];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f134048a[i12] = null;
        this.f134049b--;
        return obj;
    }
}
