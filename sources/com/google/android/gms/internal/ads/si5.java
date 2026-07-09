package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class si5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pl5 f34883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f34884c;

    private si5(CopyOnWriteArrayList copyOnWriteArrayList, int i11, pl5 pl5Var) {
        this.f34884c = copyOnWriteArrayList;
        this.f34882a = 0;
        this.f34883b = pl5Var;
    }

    public final si5 a(int i11, pl5 pl5Var) {
        return new si5(this.f34884c, 0, pl5Var);
    }

    public final void b(Handler handler, ti5 ti5Var) {
        this.f34884c.add(new ri5(handler, ti5Var));
    }

    public final void c(ti5 ti5Var) {
        CopyOnWriteArrayList<ri5> copyOnWriteArrayList = this.f34884c;
        for (ri5 ri5Var : copyOnWriteArrayList) {
            if (ri5Var.f34227a == ti5Var) {
                copyOnWriteArrayList.remove(ri5Var);
            }
        }
    }

    public si5() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
