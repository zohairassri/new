package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class fk0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik0 f26419b;

    public fk0(ik0 ik0Var, String str) {
        Objects.requireNonNull(ik0Var);
        this.f26419b = ik0Var;
        this.f26418a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ik0 ik0Var = this.f26419b;
        synchronized (ik0Var) {
            try {
                Iterator it = ik0Var.d().iterator();
                while (it.hasNext()) {
                    ((gk0) it.next()).a(sharedPreferences, this.f26418a, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
