package bq;

import android.os.Bundle;
import aq.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class d implements b, cq.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cq.a f14982a;

    private static String b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // bq.b
    public void C0(String str, Bundle bundle) {
        cq.a aVar = this.f14982a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // cq.b
    public void a(cq.a aVar) {
        this.f14982a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
