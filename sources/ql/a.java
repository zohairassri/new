package ql;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f122800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f122801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f122802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f122803d;

    public a(int i11, String str, String str2, a aVar) {
        this.f122800a = i11;
        this.f122801b = str;
        this.f122802c = str2;
        this.f122803d = aVar;
    }

    public int a() {
        return this.f122800a;
    }

    public String b() {
        return this.f122802c;
    }

    public String c() {
        return this.f122801b;
    }

    public final zze d() {
        zze zzeVar;
        a aVar = this.f122803d;
        if (aVar == null) {
            zzeVar = null;
        } else {
            zzeVar = new zze(aVar.f122800a, aVar.f122801b, aVar.f122802c, null, null);
        }
        return new zze(this.f122800a, this.f122801b, this.f122802c, zzeVar, null);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f122800a);
        jSONObject.put("Message", this.f122801b);
        jSONObject.put("Domain", this.f122802c);
        a aVar = this.f122803d;
        if (aVar == null) {
            jSONObject.put("Cause", Constants.NULL_VERSION_ID);
            return jSONObject;
        }
        jSONObject.put("Cause", aVar.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public a(int i11, String str, String str2) {
        this(i11, str, str2, null);
    }
}
