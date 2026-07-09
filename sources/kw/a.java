package kw;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final String CONFIRMED = "CONFIRMED";

    @NotNull
    public static final a INSTANCE = new a();

    private a() {
    }

    public final boolean a(String str) {
        return Intrinsics.areEqual(str, CONFIRMED);
    }
}
