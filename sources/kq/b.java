package kq;

import dq.w;
import kq.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class b implements h {
    b() {
    }

    static d b(w wVar) {
        return new d(wVar.a() + ((long) 3600000), new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // kq.h
    public d a(w wVar, JSONObject jSONObject) {
        return b(wVar);
    }
}
