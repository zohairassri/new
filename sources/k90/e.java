package k90;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f110084a;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f110084a = context;
    }

    @Override // k90.a
    public int a(String str, String str2, String str3) {
        return this.f110084a.getResources().getIdentifier(str, str2, str3);
    }

    @Override // k90.a
    public String getString(int i11) {
        String string = this.f110084a.getResources().getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(id)");
        return string;
    }
}
