package ht;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f102570a = new a();

    private a() {
    }

    public final void a(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        androidx.browser.customtabs.e eVarA = new e.d().j(true).a();
        Intrinsics.checkNotNullExpressionValue(eVarA, "build(...)");
        eVarA.a(context, Uri.parse(url));
    }
}
