package li0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import rx.i;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedList f114391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f114392b;

    public h() {
    }

    private static void c(Collection collection) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((i) it.next()).unsubscribe();
            } catch (Throwable th2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        hi0.a.c(arrayList);
    }

    public void a(i iVar) {
        if (iVar.isUnsubscribed()) {
            return;
        }
        if (!this.f114392b) {
            synchronized (this) {
                try {
                    if (!this.f114392b) {
                        LinkedList linkedList = this.f114391a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f114391a = linkedList;
                        }
                        linkedList.add(iVar);
                        return;
                    }
                } finally {
                }
            }
        }
        iVar.unsubscribe();
    }

    public void b(i iVar) {
        if (this.f114392b) {
            return;
        }
        synchronized (this) {
            LinkedList linkedList = this.f114391a;
            if (!this.f114392b && linkedList != null) {
                boolean zRemove = linkedList.remove(iVar);
                if (zRemove) {
                    iVar.unsubscribe();
                }
            }
        }
    }

    @Override // rx.i
    public boolean isUnsubscribed() {
        return this.f114392b;
    }

    @Override // rx.i
    public void unsubscribe() {
        if (this.f114392b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f114392b) {
                    return;
                }
                this.f114392b = true;
                LinkedList linkedList = this.f114391a;
                this.f114391a = null;
                c(linkedList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h(i... iVarArr) {
        this.f114391a = new LinkedList(Arrays.asList(iVarArr));
    }

    public h(i iVar) {
        LinkedList linkedList = new LinkedList();
        this.f114391a = linkedList;
        linkedList.add(iVar);
    }
}
