package androidx.room;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class l0 implements m0 {

    @NotNull
    private final String identityHash;

    @NotNull
    private final String legacyIdentityHash;
    private final int version;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f12477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12478b;

        public a(boolean z11, String str) {
            this.f12477a = z11;
            this.f12478b = str;
        }
    }

    public l0(int i11, String identityHash, String legacyIdentityHash) {
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyIdentityHash, "legacyIdentityHash");
        this.version = i11;
        this.identityHash = identityHash;
        this.legacyIdentityHash = legacyIdentityHash;
    }

    public abstract void a(q9.b bVar);

    public abstract void b(q9.b bVar);

    public final String c() {
        return this.identityHash;
    }

    public final String d() {
        return this.legacyIdentityHash;
    }

    public final int e() {
        return this.version;
    }

    public abstract void f(q9.b bVar);

    public abstract void g(q9.b bVar);

    public abstract void h(q9.b bVar);

    public abstract void i(q9.b bVar);

    public abstract a j(q9.b bVar);
}
