package com.theathletic.ui.list;

import com.theathletic.ui.d1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/theathletic/ui/list/t;", "Lkotlin/collections/p0;", "", "sourceIterator", "()Ljava/util/Iterator;", "element", "keyOf", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n+ 2 EnsureDistinct.kt\ncom/theathletic/ui/list/EnsureDistinctKt\n*L\n1#1,3794:1\n7#2:3795\n*E\n"})
public final class t implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterable f83496a;

    @Override // kotlin.collections.p0
    public Object keyOf(Object element) {
        return ((d1) element).getStableId();
    }

    @Override // kotlin.collections.p0
    public Iterator sourceIterator() {
        return this.f83496a.iterator();
    }
}
