package mr;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gr.a f116913b = gr.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f116914a;

    public f() {
        this(new Bundle());
    }

    private g d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f116914a.get(str));
        } catch (ClassCastException e11) {
            f116913b.b("Metadata key %s contains type other than int: %s", str, e11.getMessage());
            return g.a();
        }
    }

    public boolean a(String str) {
        return str != null && this.f116914a.containsKey(str);
    }

    public g b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f116914a.get(str));
        } catch (ClassCastException e11) {
            f116913b.b("Metadata key %s contains type other than boolean: %s", str, e11.getMessage());
            return g.a();
        }
    }

    public g c(String str) {
        if (!a(str)) {
            return g.a();
        }
        Object obj = this.f116914a.get(str);
        if (obj == null) {
            return g.a();
        }
        if (obj instanceof Float) {
            return g.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return g.e((Double) obj);
        }
        f116913b.b("Metadata key %s contains type other than double: %s", str);
        return g.a();
    }

    public g e(String str) {
        return d(str).d() ? g.e(Long.valueOf(((Integer) r0.c()).intValue())) : g.a();
    }

    public f(Bundle bundle) {
        this.f116914a = (Bundle) bundle.clone();
    }
}
