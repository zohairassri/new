package n9;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import n9.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p9.b f117599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.C1484b f117600b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void a(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        Bundle a();
    }

    public f(p9.b impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f117599a = impl;
    }

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f117599a.c(key);
    }

    public final b b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f117599a.d(key);
    }

    public final void c(String key, b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f117599a.j(key, provider);
    }

    public final void d(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f117599a.e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        b.C1484b c1484b = this.f117600b;
        if (c1484b == null) {
            c1484b = new b.C1484b(this);
        }
        this.f117600b = c1484b;
        try {
            clazz.getDeclaredConstructor(null);
            b.C1484b c1484b2 = this.f117600b;
            if (c1484b2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                c1484b2.b(name);
            }
        } catch (NoSuchMethodException e11) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
        }
    }

    public final void e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f117599a.k(key);
    }
}
