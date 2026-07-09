package ne0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class r extends AtomicInteger implements List, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f117817a = new ArrayList();

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        boolean zAdd = this.f117817a.add(obj);
        lazySet(this.f117817a.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll = this.f117817a.addAll(collection);
        lazySet(this.f117817a.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f117817a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f117817a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f117817a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof r ? this.f117817a.equals(((r) obj).f117817a) : this.f117817a.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i11) {
        return this.f117817a.get(i11);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f117817a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f117817a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f117817a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f117817a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.f117817a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove = this.f117817a.remove(obj);
        lazySet(this.f117817a.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll = this.f117817a.removeAll(collection);
        lazySet(this.f117817a.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll = this.f117817a.retainAll(collection);
        lazySet(this.f117817a.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public Object set(int i11, Object obj) {
        return this.f117817a.set(i11, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List subList(int i11, int i12) {
        return this.f117817a.subList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f117817a.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f117817a.toString();
    }

    @Override // java.util.List
    public ListIterator listIterator(int i11) {
        return this.f117817a.listIterator(i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f117817a.toArray(objArr);
    }

    @Override // java.util.List
    public void add(int i11, Object obj) {
        this.f117817a.add(i11, obj);
        lazySet(this.f117817a.size());
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection collection) {
        boolean zAddAll = this.f117817a.addAll(i11, collection);
        lazySet(this.f117817a.size());
        return zAddAll;
    }

    @Override // java.util.List
    public Object remove(int i11) {
        Object objRemove = this.f117817a.remove(i11);
        lazySet(this.f117817a.size());
        return objRemove;
    }
}
