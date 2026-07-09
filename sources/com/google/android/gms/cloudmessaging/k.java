package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final sn.i f22534b = new sn.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f22535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Bundle f22536d;

    k(int i11, int i12, Bundle bundle) {
        this.f22533a = i11;
        this.f22535c = i12;
        this.f22536d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
        }
        this.f22534b.b(zzqVar);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(obj);
            new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
        }
        this.f22534b.c(obj);
    }

    public final String toString() {
        int i11 = this.f22535c;
        int i12 = this.f22533a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i11);
        sb2.append(" id=");
        sb2.append(i12);
        sb2.append(" oneWay=");
        sb2.append(b());
        sb2.append("}");
        return sb2.toString();
    }
}
