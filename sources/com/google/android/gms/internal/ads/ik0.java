package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f28428a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f28429b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f28430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vj0 f28431d;

    ik0(Context context, vj0 vj0Var) {
        this.f28430c = context;
        this.f28431d = vj0Var;
    }

    final synchronized void a(gk0 gk0Var) {
        this.f28429b.add(gk0Var);
    }

    final synchronized void b(String str) {
        try {
            Map map = this.f28428a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f28430c) : this.f28430c.getSharedPreferences(str, 0);
            fk0 fk0Var = new fk0(this, str);
            map.put(str, fk0Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(fk0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final /* synthetic */ void c(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f28431d.b();
        }
    }

    final /* synthetic */ List d() {
        return this.f28429b;
    }
}
