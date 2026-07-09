package q10;

import android.app.Activity;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/app/Activity;", "", "enterAnim", "exitAnim", "", "a", "(Landroid/app/Activity;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final void a(Activity activity, int i11, int i12) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            activity.overrideActivityTransition(1, i11, i12);
        } else {
            activity.overridePendingTransition(i11, i12);
        }
    }
}
