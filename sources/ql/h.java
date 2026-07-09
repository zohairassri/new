package ql;

import com.amazonaws.services.s3.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class h extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f122832e;

    public h(int i11, String str, String str2, a aVar, p pVar) {
        super(i11, str, str2, aVar);
        this.f122832e = pVar;
    }

    @Override // ql.a
    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectE = super.e();
        p pVarF = f();
        if (pVarF == null) {
            jSONObjectE.put("Response Info", Constants.NULL_VERSION_ID);
            return jSONObjectE;
        }
        jSONObjectE.put("Response Info", pVarF.d());
        return jSONObjectE;
    }

    public p f() {
        return this.f122832e;
    }

    @Override // ql.a
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
