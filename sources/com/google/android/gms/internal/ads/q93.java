package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class q93 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f33490b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33491a = new ArrayList();

    public final List a() {
        return this.f33491a;
    }

    public final void b(View view, v83 v83Var, String str) {
        p93 p93Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f33490b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        List list = this.f33491a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                p93Var = null;
                break;
            } else {
                p93Var = (p93) it.next();
                if (p93Var.a().get() == view) {
                    break;
                }
            }
        }
        if (p93Var == null) {
            list.add(new p93(view, v83Var, "Ad overlay"));
        }
    }

    public final void c() {
        this.f33491a.clear();
    }
}
