package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f24571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f24572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f24573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24574e;

    private ch(int i11, byte[] bArr, Map map, List list, boolean z11, long j11) {
        this.f24570a = i11;
        this.f24571b = bArr;
        this.f24572c = map;
        this.f24573d = list == null ? null : Collections.unmodifiableList(list);
        this.f24574e = z11;
    }

    private static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zg((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public ch(int i11, byte[] bArr, Map map, boolean z11, long j11) {
        this(i11, bArr, map, a(map), z11, j11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ch(int i11, byte[] bArr, boolean z11, long j11, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zg zgVar = (zg) it.next();
                treeMap.put(zgVar.a(), zgVar.b());
            }
        }
        this(i11, bArr, treeMap, list, z11, j11);
    }

    public ch(byte[] bArr, Map map) {
        this(200, bArr, map, a(map), false, 0L);
    }
}
