package cm;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f18000a;

    private u(w wVar) {
        this.f18000a = wVar;
    }

    public static u b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new u(jSONObjectOptJSONObject == null ? new n(1, 0, 1.0d, false) : new n(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final w a() {
        return this.f18000a;
    }
}
