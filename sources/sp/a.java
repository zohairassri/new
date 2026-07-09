package sp;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import up.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f127272g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final DateFormat f127273h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f127274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f127275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f127276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f127277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f127278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f127279f;

    public a(String str, String str2, String str3, Date date, long j11, long j12) {
        this.f127274a = str;
        this.f127275b = str2;
        this.f127276c = str3;
        this.f127277d = date;
        this.f127278e = j11;
        this.f127279f = j12;
    }

    static a a(a.c cVar) {
        String str = cVar.f131556d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f131554b, String.valueOf(cVar.f131555c), str, new Date(cVar.f131565m), cVar.f131557e, cVar.f131562j);
    }

    static a b(Map map) throws AbtException {
        g(map);
        try {
            return new a((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f127273h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e11) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e11);
        } catch (ParseException e12) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e12);
        }
    }

    private static void g(Map map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f127272g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f127274a;
    }

    long d() {
        return this.f127277d.getTime();
    }

    String e() {
        return this.f127275b;
    }

    a.c f(String str) {
        a.c cVar = new a.c();
        cVar.f131553a = str;
        cVar.f131565m = d();
        cVar.f131554b = this.f127274a;
        cVar.f131555c = this.f127275b;
        cVar.f131556d = TextUtils.isEmpty(this.f127276c) ? null : this.f127276c;
        cVar.f131557e = this.f127278e;
        cVar.f131562j = this.f127279f;
        return cVar;
    }
}
