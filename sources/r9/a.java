package r9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1652a f124251c = new C1652a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f124252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f124253b;

    /* JADX INFO: renamed from: r9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1652a {
        public /* synthetic */ C1652a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(e eVar, int i11, Object obj) {
            if (obj == null) {
                eVar.D(i11);
                return;
            }
            if (obj instanceof byte[]) {
                eVar.y1(i11, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                eVar.u(i11, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                eVar.u(i11, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                eVar.z(i11, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                eVar.z(i11, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                eVar.z(i11, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                eVar.z(i11, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                eVar.Z0(i11, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                eVar.z(i11, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i11 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(e statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i11 = 0;
            while (i11 < length) {
                Object obj = objArr[i11];
                i11++;
                a(statement, i11, obj);
            }
        }

        private C1652a() {
        }
    }

    public a(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f124252a = query;
        this.f124253b = objArr;
    }

    @Override // r9.f
    public String a() {
        return this.f124252a;
    }

    @Override // r9.f
    public void c(e statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f124251c.b(statement, this.f124253b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
