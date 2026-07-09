package androidx.databinding;

import androidx.databinding.m;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class k extends ArrayList implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient i f7479a = new i();

    private void b(int i11, int i12) {
        i iVar = this.f7479a;
        if (iVar != null) {
            iVar.r(this, i11, i12);
        }
    }

    private void d(int i11, int i12) {
        i iVar = this.f7479a;
        if (iVar != null) {
            iVar.s(this, i11, i12);
        }
    }

    @Override // androidx.databinding.m
    public void J(m.a aVar) {
        i iVar = this.f7479a;
        if (iVar != null) {
            iVar.k(aVar);
        }
    }

    @Override // androidx.databinding.m
    public void Q1(m.a aVar) {
        if (this.f7479a == null) {
            this.f7479a = new i();
        }
        this.f7479a.b(aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        super.add(obj);
        b(size() - 1, 1);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        int size = size();
        boolean zAddAll = super.addAll(collection);
        if (zAddAll) {
            b(size, size() - size);
        }
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            d(0, size);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object remove(int i11) {
        Object objRemove = super.remove(i11);
        d(i11, 1);
        return objRemove;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        super.removeRange(i11, i12);
        d(i11, i12 - i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i11, Object obj) {
        Object obj2 = super.set(i11, obj);
        i iVar = this.f7479a;
        if (iVar != null) {
            iVar.q(this, i11, 1);
        }
        return obj2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i11, Object obj) {
        super.add(i11, obj);
        b(i11, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection collection) {
        boolean zAddAll = super.addAll(i11, collection);
        if (zAddAll) {
            b(i11, collection.size());
        }
        return zAddAll;
    }
}
