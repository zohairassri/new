package q1;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f122326a = t.f122317e.a().p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f122327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f122328c;

    public final Object a() {
        s1.a.a(f());
        return this.f122326a[this.f122328c];
    }

    public final t c() {
        s1.a.a(g());
        Object obj = this.f122326a[this.f122328c];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    protected final Object[] d() {
        return this.f122326a;
    }

    protected final int e() {
        return this.f122328c;
    }

    public final boolean f() {
        return this.f122328c < this.f122327b;
    }

    public final boolean g() {
        s1.a.a(this.f122328c >= this.f122327b);
        return this.f122328c < this.f122326a.length;
    }

    public final void h() {
        s1.a.a(f());
        this.f122328c += 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return f();
    }

    public final void i() {
        s1.a.a(g());
        this.f122328c++;
    }

    public final void j(Object[] objArr, int i11) {
        k(objArr, i11, 0);
    }

    public final void k(Object[] objArr, int i11, int i12) {
        this.f122326a = objArr;
        this.f122327b = i11;
        this.f122328c = i12;
    }

    protected final void l(int i11) {
        this.f122328c = i11;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
