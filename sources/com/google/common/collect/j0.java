package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public interface j0 {
    Map c();

    void clear();

    Collection d();

    boolean e(Object obj, Object obj2);

    Collection get(Object obj);

    boolean put(Object obj, Object obj2);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection values();
}
