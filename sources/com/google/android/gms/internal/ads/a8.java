package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class a8 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23125a;

    public a8(List list) {
        this.f23125a = list;
        boolean z11 = false;
        if (!list.isEmpty()) {
            long j11 = ((z7) list.get(0)).f39037b;
            int i11 = 1;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((z7) list.get(i11)).f39036a < j11) {
                    z11 = true;
                    break;
                } else {
                    j11 = ((z7) list.get(i11)).f39037b;
                    i11++;
                }
            }
        }
        jx3.a(!z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a8.class != obj.getClass()) {
            return false;
        }
        return this.f23125a.equals(((a8) obj).f23125a);
    }

    public final int hashCode() {
        return this.f23125a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f23125a.toString());
    }
}
