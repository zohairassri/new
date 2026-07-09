package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewConfiguration f5771a;

    public m0(ViewConfiguration viewConfiguration) {
        this.f5771a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.b3
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.b3
    public long b() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.b3
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.b3
    public float d() {
        return Build.VERSION.SDK_INT >= 34 ? n0.f5817a.b(this.f5771a) : super.d();
    }

    @Override // androidx.compose.ui.platform.b3
    public float f() {
        return this.f5771a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.b3
    public float g() {
        return this.f5771a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.b3
    public float h() {
        return Build.VERSION.SDK_INT >= 34 ? n0.f5817a.a(this.f5771a) : super.h();
    }
}
