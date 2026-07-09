package i2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f103051a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f103052b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f103053c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f103054d = d(2);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return b.f103052b;
        }

        public final int b() {
            return b.f103054d;
        }

        public final int c() {
            return b.f103053c;
        }

        private a() {
        }
    }

    public static final boolean e(int i11, int i12) {
        return i11 == i12;
    }

    public static int d(int i11) {
        return i11;
    }
}
