package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f12933b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f12932a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f12934c = new ArrayList();

    public d0(View view) {
        this.f12933b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f12933b == d0Var.f12933b && this.f12932a.equals(d0Var.f12932a);
    }

    public int hashCode() {
        return (this.f12933b.hashCode() * 31) + this.f12932a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f12933b + "\n") + "    values:";
        for (String str2 : this.f12932a.keySet()) {
            str = str + "    " + str2 + ": " + this.f12932a.get(str2) + "\n";
        }
        return str;
    }
}
