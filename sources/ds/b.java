package ds;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90429c;

    public b(int i11, int i12, String str) {
        this.f90427a = i11;
        this.f90428b = i12;
        this.f90429c = str;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("campaignId", this.f90427a);
            jSONObject.put("templateId", this.f90428b);
            jSONObject.put("messageId", this.f90429c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
