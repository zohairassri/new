package on;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f120610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120611b;

    public o(Context context, String str) {
        com.google.android.gms.common.internal.n.l(context);
        this.f120610a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f120611b = a(context);
        } else {
            this.f120611b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(com.google.android.gms.common.h.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f120610a.getIdentifier(str, "string", this.f120611b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f120610a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
