package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        static final class C0075a implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0075a f3813a = new C0075a();

            C0075a() {
            }

            public final Void a(int i11) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        Function1 getKey();

        default Function1 getType() {
            return C0075a.f3813a;
        }
    }

    public final Object h(int i11) {
        f.a aVar = i().get(i11);
        return ((a) aVar.c()).getType().invoke(Integer.valueOf(i11 - aVar.b()));
    }

    public abstract f i();

    public final int j() {
        return i().a();
    }

    public final Object k(int i11) {
        Object objInvoke;
        f.a aVar = i().get(i11);
        int iB = i11 - aVar.b();
        Function1 key = ((a) aVar.c()).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(iB))) == null) ? x1.a(i11) : objInvoke;
    }
}
