package q40;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p40.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "deviceconfig_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = context.getString(b.l.com_nytimes_android_build_type);
        Intrinsics.checkNotNull(string);
        return string;
    }
}
