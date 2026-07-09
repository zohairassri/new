package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class al0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f23353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl0 f23354b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f23357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f23358f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f23356d = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23359g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23360h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23361i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23362j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23363k = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedList f23355c = new LinkedList();

    al0(com.google.android.gms.common.util.f fVar, kl0 kl0Var, String str, String str2) {
        this.f23353a = fVar;
        this.f23354b = kl0Var;
        this.f23357e = str;
        this.f23358f = str2;
    }

    public final void a(zzm zzmVar) {
        synchronized (this.f23356d) {
            long jB = this.f23353a.b();
            this.f23362j = jB;
            this.f23354b.e(zzmVar, jB);
        }
    }

    public final void b() {
        synchronized (this.f23356d) {
            this.f23354b.f();
        }
    }

    public final void c() {
        synchronized (this.f23356d) {
            this.f23354b.g();
        }
    }

    public final void d(long j11) {
        synchronized (this.f23356d) {
            try {
                this.f23363k = j11;
                if (j11 != -1) {
                    this.f23354b.a(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f23356d) {
            try {
                if (this.f23363k != -1 && this.f23359g == -1) {
                    this.f23359g = this.f23353a.b();
                    this.f23354b.a(this);
                }
                this.f23354b.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.f23356d) {
            try {
                if (this.f23363k != -1) {
                    zk0 zk0Var = new zk0(this);
                    zk0Var.c();
                    this.f23355c.add(zk0Var);
                    this.f23361i++;
                    kl0 kl0Var = this.f23354b;
                    kl0Var.c();
                    kl0Var.a(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        synchronized (this.f23356d) {
            try {
                if (this.f23363k != -1) {
                    LinkedList linkedList = this.f23355c;
                    if (!linkedList.isEmpty()) {
                        zk0 zk0Var = (zk0) linkedList.getLast();
                        if (zk0Var.a() == -1) {
                            zk0Var.b();
                            this.f23354b.a(this);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(boolean z11) {
        synchronized (this.f23356d) {
            try {
                if (this.f23363k != -1) {
                    this.f23360h = this.f23353a.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bundle i() {
        Bundle bundle;
        synchronized (this.f23356d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f23357e);
                bundle.putString("slotid", this.f23358f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f23362j);
                bundle.putLong("tresponse", this.f23363k);
                bundle.putLong("timp", this.f23359g);
                bundle.putLong("tload", this.f23360h);
                bundle.putLong("pcc", this.f23361i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f23355c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zk0) it.next()).d());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    public final String j() {
        return this.f23357e;
    }

    final /* synthetic */ com.google.android.gms.common.util.f k() {
        return this.f23353a;
    }
}
