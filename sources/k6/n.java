package k6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f107633a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f107634b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f107635c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f107636d = Collections.EMPTY_LIST;

    public void a(Object obj) {
        synchronized (this.f107633a) {
            try {
                ArrayList arrayList = new ArrayList(this.f107636d);
                arrayList.add(obj);
                this.f107636d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f107634b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f107635c);
                    hashSet.add(obj);
                    this.f107635c = Collections.unmodifiableSet(hashSet);
                }
                this.f107634b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(Object obj) {
        int iIntValue;
        synchronized (this.f107633a) {
            try {
                iIntValue = this.f107634b.containsKey(obj) ? ((Integer) this.f107634b.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public Set b1() {
        Set set;
        synchronized (this.f107633a) {
            set = this.f107635c;
        }
        return set;
    }

    public void d(Object obj) {
        synchronized (this.f107633a) {
            try {
                Integer num = (Integer) this.f107634b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f107636d);
                arrayList.remove(obj);
                this.f107636d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f107634b.remove(obj);
                    HashSet hashSet = new HashSet(this.f107635c);
                    hashSet.remove(obj);
                    this.f107635c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f107634b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f107633a) {
            it = this.f107636d.iterator();
        }
        return it;
    }
}
