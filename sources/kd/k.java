package kd;

import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f110544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f110545d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f110546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map f110547e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f110548a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f110549b = f110547e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f110550c = true;

        static {
            String strB = b();
            f110546d = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put(HttpHeader.USER_AGENT, Collections.singletonList(new b(strB)));
            }
            f110547e = Collections.unmodifiableMap(map);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = property.charAt(i11);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public k a() {
            this.f110548a = true;
            return new k(this.f110549b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f110551a;

        b(String str) {
            this.f110551a = str;
        }

        @Override // kd.j
        public String a() {
            return this.f110551a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f110551a.equals(((b) obj).f110551a);
            }
            return false;
        }

        public int hashCode() {
            return this.f110551a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f110551a + "'}";
        }
    }

    k(Map map) {
        this.f110544c = Collections.unmodifiableMap(map);
    }

    private String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strA = ((j) list.get(i11)).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i11 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f110544c.entrySet()) {
            String strA = a((List) entry.getValue());
            if (!TextUtils.isEmpty(strA)) {
                map.put(entry.getKey(), strA);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f110544c.equals(((k) obj).f110544c);
        }
        return false;
    }

    @Override // kd.i
    public Map getHeaders() {
        if (this.f110545d == null) {
            synchronized (this) {
                try {
                    if (this.f110545d == null) {
                        this.f110545d = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f110545d;
    }

    public int hashCode() {
        return this.f110544c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f110544c + '}';
    }
}
