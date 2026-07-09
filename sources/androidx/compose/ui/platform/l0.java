package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5755a;

    public l0(Context context) {
        this.f5755a = context;
    }

    @Override // androidx.compose.ui.platform.w2
    public void a(String str) {
        try {
            this.f5755a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e11) {
            throw new IllegalArgumentException("Can't open " + str + '.', e11);
        }
    }
}
