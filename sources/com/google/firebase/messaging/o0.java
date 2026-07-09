package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f46656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46658c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f46660e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayDeque f46659d = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46661f = false;

    private o0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f46656a = sharedPreferences;
        this.f46657b = str;
        this.f46658c = str2;
        this.f46660e = executor;
    }

    private boolean b(boolean z11) {
        if (z11 && !this.f46661f) {
            i();
        }
        return z11;
    }

    static o0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        o0 o0Var = new o0(sharedPreferences, str, str2, executor);
        o0Var.d();
        return o0Var;
    }

    private void d() {
        synchronized (this.f46659d) {
            try {
                this.f46659d.clear();
                String string = this.f46656a.getString(this.f46657b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f46658c)) {
                    String[] strArrSplit = string.split(this.f46658c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f46659d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f46659d) {
            this.f46656a.edit().putString(this.f46657b, g()).commit();
        }
    }

    private void i() {
        this.f46660e.execute(new Runnable() { // from class: com.google.firebase.messaging.n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f46654a.h();
            }
        });
    }

    public String e() {
        String str;
        synchronized (this.f46659d) {
            str = (String) this.f46659d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.f46659d) {
            zB = b(this.f46659d.remove(obj));
        }
        return zB;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f46659d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f46658c);
        }
        return sb2.toString();
    }
}
