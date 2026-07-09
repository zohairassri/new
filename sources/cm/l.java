package cm;

import android.util.JsonWriter;
import com.theathletic.video.component.data.VideoRepository;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f17978c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f17979d = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f17982g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f17983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f17977b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.common.util.f f17980e = com.google.android.gms.common.util.i.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f17981f = new HashSet(Arrays.asList(new String[0]));

    public l(String str) {
        this.f17983a = !j() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static void g() {
        synchronized (f17977b) {
            f17978c = false;
            f17979d = false;
            o.f("Ad debug logging enablement is out of date.");
        }
    }

    public static void h(boolean z11) {
        synchronized (f17977b) {
            f17978c = true;
            f17979d = z11;
        }
    }

    public static boolean i() {
        boolean z11;
        synchronized (f17977b) {
            z11 = f17978c;
        }
        return z11;
    }

    public static boolean j() {
        boolean z11;
        synchronized (f17977b) {
            try {
                z11 = false;
                if (f17978c && f17979d) {
                    z11 = true;
                }
            } finally {
            }
        }
        return z11;
    }

    static /* synthetic */ void k(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        p(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(com.google.android.gms.common.util.c.a(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void l(int i11, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i11);
        jsonWriter.endObject();
        p(jsonWriter, map);
        jsonWriter.endObject();
    }

    private final void m(final String str, final String str2, final Map map, final byte[] bArr) {
        q("onNetworkRequest", new k() { // from class: cm.j
            @Override // cm.k
            public final /* synthetic */ void a(JsonWriter jsonWriter) throws IOException {
                l.k(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void n(final Map map, final int i11) {
        q("onNetworkResponse", new k() { // from class: cm.g
            @Override // cm.k
            public final /* synthetic */ void a(JsonWriter jsonWriter) throws IOException {
                l.l(i11, map, jsonWriter);
            }
        });
    }

    private final void o(final String str) {
        q("onNetworkRequestError", new k() { // from class: cm.i
            @Override // cm.k
            public final /* synthetic */ void a(JsonWriter jsonWriter) throws IOException {
                int i11 = l.f17982g;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private static void p(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f17981f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        o.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name(VideoRepository.XML_ATTR_VALUE).value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name(VideoRepository.XML_ATTR_VALUE).value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void q(String str, k kVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f17980e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f17983a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            kVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e11) {
            o.d("unable to log", e11);
        }
        r(stringWriter.toString());
    }

    private static synchronized void r(String str) {
        try {
            o.e("GMA Debug BEGIN");
            int i11 = 0;
            while (i11 < str.length()) {
                int i12 = i11 + 4000;
                o.e("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i11, Math.min(i12, str.length())))));
                i11 = i12;
            }
            o.e("GMA Debug FINISH");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (j()) {
            m(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void b(String str, String str2, Map map, byte[] bArr) {
        if (j()) {
            m(str, "GET", map, bArr);
        }
    }

    public final void c(HttpURLConnection httpURLConnection, int i11) {
        if (j()) {
            String responseMessage = null;
            n(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i11);
            if (i11 < 200 || i11 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e11) {
                    o.f("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e11.getMessage())));
                }
                o(responseMessage);
            }
        }
    }

    public final void d(Map map, int i11) {
        if (j()) {
            n(map, i11);
            if (i11 < 200 || i11 >= 300) {
                o(null);
            }
        }
    }

    public final void e(String str) {
        if (j() && str != null) {
            f(str.getBytes());
        }
    }

    public final void f(final byte[] bArr) {
        q("onNetworkResponseBody", new k() { // from class: cm.h
            @Override // cm.k
            public final /* synthetic */ void a(JsonWriter jsonWriter) throws IOException {
                int i11 = l.f17982g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strA = com.google.android.gms.common.util.c.a(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strA);
                } else {
                    String strO = f.o(strA);
                    if (strO != null) {
                        jsonWriter.name("bodydigest").value(strO);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
