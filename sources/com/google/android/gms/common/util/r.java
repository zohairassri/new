package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Process;
import com.google.android.gms.internal.common.zzy;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f22917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f22918b;

    public static String a() {
        if (f22917a == null) {
            f22917a = Application.getProcessName();
        }
        return f22917a;
    }

    public static boolean b() {
        Boolean boolValueOf = f22918b;
        if (boolValueOf == null) {
            if (p.f()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = hn.r.a(Process.class, "isIsolated", new hn.q[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new zzy(hn.t.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f22918b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
