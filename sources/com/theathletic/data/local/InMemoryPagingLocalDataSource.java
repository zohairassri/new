package com.theathletic.data.local;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import wf0.c0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R.\u0010\t\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/theathletic/data/local/InMemoryPagingLocalDataSource;", "Key", "ListItem", "", "<init>", "()V", "", "Lwf0/c0;", "Lcom/theathletic/data/local/PaginatedList;", "paginatedLists", "Ljava/util/Map;", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInMemoryPagingLocalDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMemoryPagingLocalDataSource.kt\ncom/theathletic/data/local/InMemoryPagingLocalDataSource\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n382#2,7:55\n360#3,3:62\n1761#3,3:65\n363#3,4:68\n360#3,7:72\n*S KotlinDebug\n*F\n+ 1 InMemoryPagingLocalDataSource.kt\ncom/theathletic/data/local/InMemoryPagingLocalDataSource\n*L\n12#1:55,7\n34#1:62,3\n34#1:65,3\n34#1:68,4\n38#1:72,7\n*E\n"})
public abstract class InMemoryPagingLocalDataSource<Key, ListItem> {

    @NotNull
    private final Map<Key, c0> paginatedLists = new LinkedHashMap();
}
