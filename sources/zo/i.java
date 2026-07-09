package zo;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f142470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f142471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f142472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f142473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f142474e;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f142475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f142476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f142477c;

            a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f142472c.f142477c = aVar;
            this.f142472c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f142476b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof l ? !((l) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                boolean r0 = r6.f142473d
                boolean r1 = r6.f142474e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r6.f142470a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                zo.i$b$a r6 = r6.f142471b
                zo.i$b$a r6 = r6.f142477c
                java.lang.String r3 = ""
            L1b:
                if (r6 == 0) goto L61
                java.lang.Object r4 = r6.f142476b
                if (r4 != 0) goto L24
                if (r0 != 0) goto L5e
                goto L2c
            L24:
                if (r1 == 0) goto L2c
                boolean r5 = d(r4)
                if (r5 != 0) goto L5e
            L2c:
                r2.append(r3)
                java.lang.String r3 = r6.f142475a
                if (r3 == 0) goto L3b
                r2.append(r3)
                r3 = 61
                r2.append(r3)
            L3b:
                if (r4 == 0) goto L59
                java.lang.Class r3 = r4.getClass()
                boolean r3 = r3.isArray()
                if (r3 == 0) goto L59
                java.lang.Object[] r3 = new java.lang.Object[]{r4}
                java.lang.String r3 = java.util.Arrays.deepToString(r3)
                int r4 = r3.length()
                r5 = 1
                int r4 = r4 - r5
                r2.append(r3, r5, r4)
                goto L5c
            L59:
                r2.append(r4)
            L5c:
                java.lang.String r3 = ", "
            L5e:
                zo.i$b$a r6 = r6.f142477c
                goto L1b
            L61:
                r6 = 125(0x7d, float:1.75E-43)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zo.i.b.toString():java.lang.String");
        }

        private b(String str) {
            a aVar = new a();
            this.f142471b = aVar;
            this.f142472c = aVar;
            this.f142473d = false;
            this.f142474e = false;
            this.f142470a = (String) o.k(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
