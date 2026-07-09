package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class xa3 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ya3 f37857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ra3 f37858b;

    public xa3(ra3 ra3Var) {
        this.f37858b = ra3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        ya3 ya3Var = this.f37857a;
        if (ya3Var != null) {
            ya3Var.b(this);
        }
    }

    public final void b(ya3 ya3Var) {
        this.f37857a = ya3Var;
    }
}
