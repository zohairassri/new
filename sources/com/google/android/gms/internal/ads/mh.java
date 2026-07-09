package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class mh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f30751c = nh.f31377b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f30752a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30753b = false;

    mh() {
    }

    public final synchronized void a(String str, long j11) {
        if (this.f30753b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f30752a.add(new lh(str, j11, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.f30753b = true;
        List<lh> list = this.f30752a;
        long j11 = list.size() == 0 ? 0L : ((lh) list.get(list.size() - 1)).f30212c - ((lh) list.get(0)).f30212c;
        if (j11 > 0) {
            long j12 = ((lh) list.get(0)).f30212c;
            nh.b("(%-4d ms) %s", Long.valueOf(j11), str);
            for (lh lhVar : list) {
                long j13 = lhVar.f30212c;
                nh.b("(+%-4d) [%2d] %s", Long.valueOf(j13 - j12), Long.valueOf(lhVar.f30211b), lhVar.f30210a);
                j12 = j13;
            }
        }
    }

    protected final void finalize() {
        if (this.f30753b) {
            return;
        }
        b("Request on the loose");
        nh.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
