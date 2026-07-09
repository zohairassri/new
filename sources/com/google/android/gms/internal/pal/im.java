package com.google.android.gms.internal.pal;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class im {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bm f41472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f41473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f41474c;

    /* synthetic */ im(bm bmVar, List list, Integer num, hm hmVar) {
        this.f41472a = bmVar;
        this.f41473b = list;
        this.f41474c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof im)) {
            return false;
        }
        im imVar = (im) obj;
        if (this.f41472a.equals(imVar.f41472a) && this.f41473b.equals(imVar.f41473b)) {
            Integer num = this.f41474c;
            Integer num2 = imVar.f41474c;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41472a, this.f41473b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f41472a, this.f41473b, this.f41474c);
    }
}
