package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f42295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f42296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f42297c;

    protected zj(Class cls, pk... pkVarArr) {
        this.f42295a = cls;
        HashMap map = new HashMap();
        for (int i11 = 0; i11 <= 0; i11++) {
            pk pkVar = pkVarArr[i11];
            if (map.containsKey(pkVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(pkVar.b().getCanonicalName())));
            }
            map.put(pkVar.b(), pkVar);
        }
        this.f42297c = pkVarArr[0].b();
        this.f42296b = Collections.unmodifiableMap(map);
    }

    public xj a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract sq b();

    public abstract c3 c(a1 a1Var);

    public abstract String d();

    public abstract void e(c3 c3Var);

    public int f() {
        return 1;
    }

    public final Class g() {
        return this.f42297c;
    }

    public final Class h() {
        return this.f42295a;
    }

    public final Object i(c3 c3Var, Class cls) {
        pk pkVar = (pk) this.f42296b.get(cls);
        if (pkVar != null) {
            return pkVar.a(c3Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set j() {
        return this.f42296b.keySet();
    }
}
