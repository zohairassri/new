package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f22781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22782b;

    public p(Context context) {
        n.l(context);
        Resources resources = context.getResources();
        this.f22781a = resources;
        this.f22782b = resources.getResourcePackageName(com.google.android.gms.common.h.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        String str2 = this.f22782b;
        Resources resources = this.f22781a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
