package lg;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import uh.d;
import vf.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: lg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public /* synthetic */ class C1398a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.DATADOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.B3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.B3MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.TRACECONTEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final b a(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i11 = C1398a.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i11 == 1) {
            return b.DATADOG;
        }
        if (i11 == 2) {
            return b.B3;
        }
        if (i11 == 3) {
            return b.B3MULTI;
        }
        if (i11 == 4) {
            return b.TRACECONTEXT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
