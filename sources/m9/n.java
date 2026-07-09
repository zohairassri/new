package m9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f115931a = new String[0];

    public static final void a(StringBuilder builder, int i11) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i12 = 0; i12 < i11; i12++) {
            builder.append("?");
            if (i12 < i11 - 1) {
                builder.append(",");
            }
        }
    }
}
