package com.google.android.gms.internal.pal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class yu extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f42250h = new ru();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f42251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    xu f42252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f42253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f42254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final xu f42255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private tu f42256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private vu f42257g;

    public yu() {
        Comparator comparator = f42250h;
        this.f42253c = 0;
        this.f42254d = 0;
        this.f42255e = new xu();
        this.f42251a = comparator;
    }

    private final void h(xu xuVar, boolean z11) {
        while (xuVar != null) {
            xu xuVar2 = xuVar.f42219b;
            xu xuVar3 = xuVar.f42220c;
            int i11 = xuVar2 != null ? xuVar2.f42225h : 0;
            int i12 = xuVar3 != null ? xuVar3.f42225h : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                xu xuVar4 = xuVar3.f42219b;
                xu xuVar5 = xuVar3.f42220c;
                int i14 = (xuVar4 != null ? xuVar4.f42225h : 0) - (xuVar5 != null ? xuVar5.f42225h : 0);
                if (i14 == -1 || (i14 == 0 && !z11)) {
                    j(xuVar);
                } else {
                    k(xuVar3);
                    j(xuVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                xu xuVar6 = xuVar2.f42219b;
                xu xuVar7 = xuVar2.f42220c;
                int i15 = (xuVar6 != null ? xuVar6.f42225h : 0) - (xuVar7 != null ? xuVar7.f42225h : 0);
                if (i15 == 1 || (i15 == 0 && !z11)) {
                    k(xuVar);
                } else {
                    j(xuVar2);
                    k(xuVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                xuVar.f42225h = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                xuVar.f42225h = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            xuVar = xuVar.f42218a;
        }
    }

    private final void i(xu xuVar, xu xuVar2) {
        xu xuVar3 = xuVar.f42218a;
        xuVar.f42218a = null;
        if (xuVar2 != null) {
            xuVar2.f42218a = xuVar3;
        }
        if (xuVar3 == null) {
            this.f42252b = xuVar2;
        } else if (xuVar3.f42219b == xuVar) {
            xuVar3.f42219b = xuVar2;
        } else {
            xuVar3.f42220c = xuVar2;
        }
    }

    private final void j(xu xuVar) {
        xu xuVar2 = xuVar.f42219b;
        xu xuVar3 = xuVar.f42220c;
        xu xuVar4 = xuVar3.f42219b;
        xu xuVar5 = xuVar3.f42220c;
        xuVar.f42220c = xuVar4;
        if (xuVar4 != null) {
            xuVar4.f42218a = xuVar;
        }
        i(xuVar, xuVar3);
        xuVar3.f42219b = xuVar;
        xuVar.f42218a = xuVar3;
        int iMax = Math.max(xuVar2 != null ? xuVar2.f42225h : 0, xuVar4 != null ? xuVar4.f42225h : 0) + 1;
        xuVar.f42225h = iMax;
        xuVar3.f42225h = Math.max(iMax, xuVar5 != null ? xuVar5.f42225h : 0) + 1;
    }

    private final void k(xu xuVar) {
        xu xuVar2 = xuVar.f42219b;
        xu xuVar3 = xuVar.f42220c;
        xu xuVar4 = xuVar2.f42219b;
        xu xuVar5 = xuVar2.f42220c;
        xuVar.f42219b = xuVar5;
        if (xuVar5 != null) {
            xuVar5.f42218a = xuVar;
        }
        i(xuVar, xuVar2);
        xuVar2.f42220c = xuVar;
        xuVar.f42218a = xuVar2;
        int iMax = Math.max(xuVar3 != null ? xuVar3.f42225h : 0, xuVar5 != null ? xuVar5.f42225h : 0) + 1;
        xuVar.f42225h = iMax;
        xuVar2.f42225h = Math.max(iMax, xuVar4 != null ? xuVar4.f42225h : 0) + 1;
    }

    final xu a(Object obj, boolean z11) {
        int iCompareTo;
        xu xuVar;
        Comparator comparator = this.f42251a;
        xu xuVar2 = this.f42252b;
        if (xuVar2 != null) {
            Comparable comparable = comparator == f42250h ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(xuVar2.f42223f) : comparator.compare(obj, xuVar2.f42223f);
                if (iCompareTo == 0) {
                    return xuVar2;
                }
                xu xuVar3 = iCompareTo < 0 ? xuVar2.f42219b : xuVar2.f42220c;
                if (xuVar3 == null) {
                    break;
                }
                xuVar2 = xuVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z11) {
            return null;
        }
        xu xuVar4 = this.f42255e;
        if (xuVar2 != null) {
            xuVar = new xu(xuVar2, obj, xuVar4, xuVar4.f42222e);
            if (iCompareTo < 0) {
                xuVar2.f42219b = xuVar;
            } else {
                xuVar2.f42220c = xuVar;
            }
            h(xuVar2, true);
        } else {
            if (comparator == f42250h && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            xuVar = new xu(null, obj, xuVar4, xuVar4.f42222e);
            this.f42252b = xuVar;
        }
        this.f42253c++;
        this.f42254d++;
        return xuVar;
    }

    final xu c(Map.Entry entry) {
        xu xuVarD = d(entry.getKey());
        if (xuVarD == null) {
            return null;
        }
        Object obj = xuVarD.f42224g;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return xuVarD;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f42252b = null;
        this.f42253c = 0;
        this.f42254d++;
        xu xuVar = this.f42255e;
        xuVar.f42222e = xuVar;
        xuVar.f42221d = xuVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    final xu d(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        tu tuVar = this.f42256f;
        if (tuVar != null) {
            return tuVar;
        }
        tu tuVar2 = new tu(this);
        this.f42256f = tuVar2;
        return tuVar2;
    }

    final xu f(Object obj) {
        xu xuVarD = d(obj);
        if (xuVarD != null) {
            g(xuVarD, true);
        }
        return xuVarD;
    }

    final void g(xu xuVar, boolean z11) {
        xu xuVar2;
        xu xuVar3;
        int i11;
        if (z11) {
            xu xuVar4 = xuVar.f42222e;
            xuVar4.f42221d = xuVar.f42221d;
            xuVar.f42221d.f42222e = xuVar4;
        }
        xu xuVar5 = xuVar.f42219b;
        xu xuVar6 = xuVar.f42220c;
        xu xuVar7 = xuVar.f42218a;
        int i12 = 0;
        if (xuVar5 == null || xuVar6 == null) {
            if (xuVar5 != null) {
                i(xuVar, xuVar5);
                xuVar.f42219b = null;
            } else if (xuVar6 != null) {
                i(xuVar, xuVar6);
                xuVar.f42220c = null;
            } else {
                i(xuVar, null);
            }
            h(xuVar7, false);
            this.f42253c--;
            this.f42254d++;
            return;
        }
        if (xuVar5.f42225h > xuVar6.f42225h) {
            do {
                xuVar3 = xuVar5;
                xuVar5 = xuVar5.f42220c;
            } while (xuVar5 != null);
        } else {
            do {
                xuVar2 = xuVar6;
                xuVar6 = xuVar6.f42219b;
            } while (xuVar6 != null);
            xuVar3 = xuVar2;
        }
        g(xuVar3, false);
        xu xuVar8 = xuVar.f42219b;
        if (xuVar8 != null) {
            i11 = xuVar8.f42225h;
            xuVar3.f42219b = xuVar8;
            xuVar8.f42218a = xuVar3;
            xuVar.f42219b = null;
        } else {
            i11 = 0;
        }
        xu xuVar9 = xuVar.f42220c;
        if (xuVar9 != null) {
            i12 = xuVar9.f42225h;
            xuVar3.f42220c = xuVar9;
            xuVar9.f42218a = xuVar3;
            xuVar.f42220c = null;
        }
        xuVar3.f42225h = Math.max(i11, i12) + 1;
        i(xuVar, xuVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        xu xuVarD = d(obj);
        if (xuVarD != null) {
            return xuVarD.f42224g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        vu vuVar = this.f42257g;
        if (vuVar != null) {
            return vuVar;
        }
        vu vuVar2 = new vu(this);
        this.f42257g = vuVar2;
        return vuVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        xu xuVarA = a(obj, true);
        Object obj3 = xuVarA.f42224g;
        xuVarA.f42224g = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        xu xuVarF = f(obj);
        if (xuVarF != null) {
            return xuVarF.f42224g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f42253c;
    }
}
