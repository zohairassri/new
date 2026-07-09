package ah0;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import qh0.b;
import qh0.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends c {

    /* JADX INFO: renamed from: ah0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public /* synthetic */ class C0035a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b level) {
        super(level);
        Intrinsics.checkNotNullParameter(level, "level");
    }

    @Override // qh0.c
    public void a(b level, String msg) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i11 = C0035a.$EnumSwitchMapping$0[level.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                Log.i("[Koin]", msg);
                return;
            }
            if (i11 == 3) {
                Log.w("[Koin]", msg);
            } else if (i11 != 4) {
                Log.e("[Koin]", msg);
            } else {
                Log.e("[Koin]", msg);
            }
        }
    }
}
