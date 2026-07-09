package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class sh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Comparator f34819d = new rh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34820a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f34821b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34822c = 0;

    public sh(int i11) {
    }

    private final synchronized void c() {
        while (this.f34822c > 4096) {
            byte[] bArr = (byte[]) this.f34820a.remove(0);
            this.f34821b.remove(bArr);
            this.f34822c -= bArr.length;
        }
    }

    public final synchronized byte[] a(int i11) {
        int i12 = 0;
        while (true) {
            List list = this.f34821b;
            if (i12 >= list.size()) {
                return new byte[i11];
            }
            byte[] bArr = (byte[]) list.get(i12);
            int length = bArr.length;
            if (length >= i11) {
                this.f34822c -= length;
                list.remove(i12);
                this.f34820a.remove(bArr);
                return bArr;
            }
            i12++;
        }
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f34820a.add(bArr);
                List list = this.f34821b;
                int iBinarySearch = Collections.binarySearch(list, bArr, f34819d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                list.add(iBinarySearch, bArr);
                this.f34822c += length;
                c();
            }
        }
    }
}
