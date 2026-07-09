package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f6502f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f6503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f6505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f6506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    HashMap f6507e;

    public d() {
        int i11 = f6502f;
        this.f6503a = i11;
        this.f6504b = i11;
        this.f6505c = null;
    }

    public abstract void a(HashMap map);

    public abstract d b();

    public d c(d dVar) {
        this.f6503a = dVar.f6503a;
        this.f6504b = dVar.f6504b;
        this.f6505c = dVar.f6505c;
        this.f6506d = dVar.f6506d;
        this.f6507e = dVar.f6507e;
        return this;
    }

    abstract void d(HashSet hashSet);

    abstract void e(Context context, AttributeSet attributeSet);

    boolean f(String str) {
        String str2 = this.f6505c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void g(int i11) {
        this.f6503a = i11;
    }

    public d i(int i11) {
        this.f6504b = i11;
        return this;
    }

    boolean j(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    float k(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int l(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public void h(HashMap map) {
    }
}
