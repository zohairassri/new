package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f43621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f43622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f43623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f43624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Boolean f43625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f43626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    zzdd f43627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f43628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Long f43629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f43630j;

    public x6(Context context, zzdd zzddVar, Long l11) {
        this.f43628h = true;
        com.google.android.gms.common.internal.n.l(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.n.l(applicationContext);
        this.f43621a = applicationContext;
        this.f43629i = l11;
        if (zzddVar != null) {
            this.f43627g = zzddVar;
            this.f43622b = zzddVar.f40976f;
            this.f43623c = zzddVar.f40975e;
            this.f43624d = zzddVar.f40974d;
            this.f43628h = zzddVar.f40973c;
            this.f43626f = zzddVar.f40972b;
            this.f43630j = zzddVar.f40978h;
            Bundle bundle = zzddVar.f40977g;
            if (bundle != null) {
                this.f43625e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
