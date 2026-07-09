package hm;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.oz;
import com.google.android.gms.internal.ads.zv1;
import com.google.android.gms.internal.ads.zzbzu;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f102358b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzbzu f102360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f102361e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f102363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f102364h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f102359c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f102362f = new Bundle();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public m0(JsonReader jsonReader, zzbzu zzbzuVar) throws IOException {
        Bundle bundle;
        this.f102363g = -1L;
        this.f102364h = -1L;
        this.f102360d = zzbzuVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.f102363g = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.f102364h = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.f102357a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f102362f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) yl.e.c().d(oz.K2)).booleanValue() || zzbzuVar == null || (bundle = zzbzuVar.f39658r) == null) {
            return;
        }
        bundle.putLong(zv1.GET_SIGNALS_SDKCORE_START.a(), this.f102363g);
        zzbzuVar.f39658r.putLong(zv1.GET_SIGNALS_SDKCORE_END.a(), this.f102364h);
    }
}
