package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xs0 extends MutableContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f38166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38168c;

    public xs0(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void a(Intent intent, int i11) {
        if (this.f38166a == null) {
            intent.setFlags(268435456);
            this.f38167b.startActivity(intent);
            return;
        }
        String strValueOf = String.valueOf(intent.getData());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 63);
        sb2.append("Starting activity for result with intent: ");
        sb2.append(strValueOf);
        sb2.append(" and requestCode: 236");
        bm.k1.k(sb2.toString());
        this.f38166a.startActivityForResult(intent, 236);
    }

    public final Activity b() {
        return this.f38166a;
    }

    public final Context c() {
        return this.f38168c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f38168c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f38167b = applicationContext;
        this.f38166a = context instanceof Activity ? (Activity) context : null;
        this.f38168c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f38166a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f38167b.startActivity(intent);
        }
    }
}
