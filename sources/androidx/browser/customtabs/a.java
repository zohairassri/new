package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class a {
    static <T> T a(@NonNull Bundle bundle, String str, @NonNull Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
