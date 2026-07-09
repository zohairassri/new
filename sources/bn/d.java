package bn;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f14948b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f14949a = null;

    public static c a(Context context) {
        return f14948b.b(context);
    }

    public final synchronized c b(Context context) {
        try {
            if (this.f14949a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f14949a = new c(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f14949a;
    }
}
