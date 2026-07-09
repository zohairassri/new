package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f44784a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f44785b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f44786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44788e;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class C0330a implements j.a {
        C0330a() {
        }

        @Override // com.google.android.material.internal.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, boolean z11) {
            if (!z11) {
                a aVar = a.this;
                if (!aVar.r(jVar, aVar.f44788e)) {
                    return;
                }
            } else if (!a.this.g(jVar)) {
                return;
            }
            a.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void a(Set set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(j jVar) {
        int id2 = jVar.getId();
        if (this.f44785b.contains(Integer.valueOf(id2))) {
            return false;
        }
        j jVar2 = (j) this.f44784a.get(Integer.valueOf(k()));
        if (jVar2 != null) {
            r(jVar2, false);
        }
        boolean zAdd = this.f44785b.add(Integer.valueOf(id2));
        if (!jVar.isChecked()) {
            jVar.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        b bVar = this.f44786c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(j jVar, boolean z11) {
        int id2 = jVar.getId();
        if (!this.f44785b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z11 && this.f44785b.size() == 1 && this.f44785b.contains(Integer.valueOf(id2))) {
            jVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f44785b.remove(Integer.valueOf(id2));
        if (jVar.isChecked()) {
            jVar.setChecked(false);
        }
        return zRemove;
    }

    public void e(j jVar) {
        this.f44784a.put(Integer.valueOf(jVar.getId()), jVar);
        if (jVar.isChecked()) {
            g(jVar);
        }
        jVar.setInternalOnCheckedChangeListener(new C0330a());
    }

    public void f(int i11) {
        j jVar = (j) this.f44784a.get(Integer.valueOf(i11));
        if (jVar != null && g(jVar)) {
            m();
        }
    }

    public void h() {
        boolean zIsEmpty = this.f44785b.isEmpty();
        Iterator it = this.f44784a.values().iterator();
        while (it.hasNext()) {
            r((j) it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        m();
    }

    public Set i() {
        return new HashSet(this.f44785b);
    }

    public List j(ViewGroup viewGroup) {
        Set setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof j) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f44787d || this.f44785b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f44785b.iterator().next()).intValue();
    }

    public boolean l() {
        return this.f44787d;
    }

    public void n(j jVar) {
        jVar.setInternalOnCheckedChangeListener(null);
        this.f44784a.remove(Integer.valueOf(jVar.getId()));
        this.f44785b.remove(Integer.valueOf(jVar.getId()));
    }

    public void o(b bVar) {
        this.f44786c = bVar;
    }

    public void p(boolean z11) {
        this.f44788e = z11;
    }

    public void q(boolean z11) {
        if (this.f44787d != z11) {
            this.f44787d = z11;
            h();
        }
    }
}
