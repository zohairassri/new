package oo;

import android.os.Bundle;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a {
        public abstract d a();

        public abstract a b(Integer num);

        public abstract a c(Integer num);

        public abstract a d(String str);

        public abstract a e(Date date);

        public abstract a f(Integer num);
    }

    public static a c() {
        return new l();
    }

    public static d g(Bundle bundle) {
        if (!bundle.containsKey("user.status")) {
            return c().a();
        }
        a aVarC = c();
        aVarC.f(h(bundle, "user.status"));
        aVarC.b(h(bundle, "age.range.lower"));
        aVarC.c(h(bundle, "age.range.upper"));
        aVarC.e(bundle.containsKey("most.recent.approval.date") ? new Date(bundle.getLong("most.recent.approval.date")) : null);
        aVarC.d(bundle.containsKey("install.id") ? bundle.getString("install.id") : null);
        return aVarC.a();
    }

    private static Integer h(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    public abstract Integer a();

    public abstract Integer b();

    public abstract String d();

    public abstract Date e();

    public abstract Integer f();
}
