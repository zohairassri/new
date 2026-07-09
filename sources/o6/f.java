package o6;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f120072c = new f(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f120073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f120074b;

    public f(Map map) {
        this.f120074b = Collections.unmodifiableMap(map);
    }

    private static void e(HashMap map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), i(entry.getValue()));
        }
    }

    private static Map f(Map map, e eVar) {
        HashMap map2 = new HashMap(map);
        k(map2, eVar.c());
        e(map2, eVar.b());
        return map2;
    }

    private static byte[] i(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean j(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void k(HashMap map, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            map.remove(list.get(i11));
        }
    }

    @Override // o6.d
    public final long a(String str, long j11) {
        byte[] bArr = (byte[]) this.f120074b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j11;
    }

    @Override // o6.d
    public final String c(String str, String str2) {
        byte[] bArr = (byte[]) this.f120074b.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return j(this.f120074b, ((f) obj).f120074b);
    }

    public f g(e eVar) {
        Map mapF = f(this.f120074b, eVar);
        return j(this.f120074b, mapF) ? this : new f(mapF);
    }

    public Set h() {
        return this.f120074b.entrySet();
    }

    public int hashCode() {
        if (this.f120073a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f120074b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f120073a = iHashCode;
        }
        return this.f120073a;
    }
}
