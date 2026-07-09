package we0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f135207b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f135208a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ z(byte b11) {
        this.f135208a = b11;
    }

    public static final /* synthetic */ z a(byte b11) {
        return new z(b11);
    }

    public static boolean c(byte b11, Object obj) {
        return (obj instanceof z) && b11 == ((z) obj).g();
    }

    public static int e(byte b11) {
        return Byte.hashCode(b11);
    }

    public static String f(byte b11) {
        return String.valueOf(b11 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(g() & 255, ((z) obj).g() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f135208a, obj);
    }

    public final /* synthetic */ byte g() {
        return this.f135208a;
    }

    public int hashCode() {
        return e(this.f135208a);
    }

    public String toString() {
        return f(this.f135208a);
    }

    public static byte b(byte b11) {
        return b11;
    }
}
