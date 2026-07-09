package androidx.databinding;

import androidx.databinding.j;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class b extends androidx.databinding.a {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends j.a {
        a() {
        }

        @Override // androidx.databinding.j.a
        public void d(j jVar, int i11) {
            b.this.notifyChange();
        }
    }

    public b() {
    }

    public b(j... jVarArr) {
        if (jVarArr == null || jVarArr.length == 0) {
            return;
        }
        a aVar = new a();
        for (j jVar : jVarArr) {
            jVar.addOnPropertyChangedCallback(aVar);
        }
    }
}
