package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class y0 extends c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y0 f7812d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f7813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7814c;

    static {
        y0 y0Var = new y0(new Object[0], 0);
        f7812d = y0Var;
        y0Var.g();
    }

    private y0(Object[] objArr, int i11) {
        this.f7813b = objArr;
        this.f7814c = i11;
    }

    private static Object[] b(int i11) {
        return new Object[i11];
    }

    public static y0 d() {
        return f7812d;
    }

    private void e(int i11) {
        if (i11 < 0 || i11 >= this.f7814c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f7814c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i11 = this.f7814c;
        Object[] objArr = this.f7813b;
        if (i11 == objArr.length) {
            this.f7813b = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7813b;
        int i12 = this.f7814c;
        this.f7814c = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i11) {
        e(i11);
        return this.f7813b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.x.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public y0 c(int i11) {
        if (i11 >= this.f7814c) {
            return new y0(Arrays.copyOf(this.f7813b, i11), this.f7814c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i11) {
        a();
        e(i11);
        Object[] objArr = this.f7813b;
        Object obj = objArr[i11];
        if (i11 < this.f7814c - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f7814c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i11, Object obj) {
        a();
        e(i11);
        Object[] objArr = this.f7813b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7814c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, Object obj) {
        int i12;
        a();
        if (i11 >= 0 && i11 <= (i12 = this.f7814c)) {
            Object[] objArr = this.f7813b;
            if (i12 < objArr.length) {
                System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
            } else {
                Object[] objArrB = b(((i12 * 3) / 2) + 1);
                System.arraycopy(this.f7813b, 0, objArrB, 0, i11);
                System.arraycopy(this.f7813b, i11, objArrB, i11 + 1, this.f7814c - i11);
                this.f7813b = objArrB;
            }
            this.f7813b[i11] = obj;
            this.f7814c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i11));
    }
}
