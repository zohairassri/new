package ml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f116780a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f116781b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f116782c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f116783d = Collections.EMPTY_LIST;

    public void a(Object obj) {
        synchronized (this.f116780a) {
            try {
                ArrayList arrayList = new ArrayList(this.f116783d);
                arrayList.add(obj);
                this.f116783d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f116781b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f116782c);
                    hashSet.add(obj);
                    this.f116782c = Collections.unmodifiableSet(hashSet);
                }
                this.f116781b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(Object obj) {
        int iIntValue;
        synchronized (this.f116780a) {
            try {
                iIntValue = this.f116781b.containsKey(obj) ? ((Integer) this.f116781b.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public Set b1() {
        Set set;
        synchronized (this.f116780a) {
            set = this.f116782c;
        }
        return set;
    }

    public void d(Object obj) {
        synchronized (this.f116780a) {
            try {
                Integer num = (Integer) this.f116781b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f116783d);
                arrayList.remove(obj);
                this.f116783d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f116781b.remove(obj);
                    HashSet hashSet = new HashSet(this.f116782c);
                    hashSet.remove(obj);
                    this.f116782c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f116781b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f116780a) {
            it = this.f116783d.iterator();
        }
        return it;
    }
}
