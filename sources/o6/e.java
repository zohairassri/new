package o6;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f120070a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f120071b = new ArrayList();

    private e a(String str, Object obj) {
        this.f120070a.put((String) k6.a.e(str), k6.a.e(obj));
        this.f120071b.remove(str);
        return this;
    }

    public static e g(e eVar, long j11) {
        return eVar.e("exo_len", j11);
    }

    public static e h(e eVar, Uri uri) {
        return uri == null ? eVar.d("exo_redir") : eVar.f("exo_redir", uri.toString());
    }

    public Map b() {
        HashMap map = new HashMap(this.f120070a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List c() {
        return Collections.unmodifiableList(new ArrayList(this.f120071b));
    }

    public e d(String str) {
        this.f120071b.add(str);
        this.f120070a.remove(str);
        return this;
    }

    public e e(String str, long j11) {
        return a(str, Long.valueOf(j11));
    }

    public e f(String str, String str2) {
        return a(str, str2);
    }
}
