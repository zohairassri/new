package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f5580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f5581b = new int[2];

    protected final int[] c(int i11, int i12) {
        if (i11 < 0 || i12 < 0 || i11 == i12) {
            return null;
        }
        int[] iArr = this.f5581b;
        iArr[0] = i11;
        iArr[1] = i12;
        return iArr;
    }

    protected final String d() {
        String str = this.f5580a;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("text");
        return null;
    }

    public void e(String str) {
        f(str);
    }

    protected final void f(String str) {
        this.f5580a = str;
    }
}
