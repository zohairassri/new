package androidx.media;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8732c;

    g(String str, int i11, int i12) {
        this.f8730a = str;
        this.f8731b = i11;
        this.f8732c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return (this.f8731b < 0 || gVar.f8731b < 0) ? TextUtils.equals(this.f8730a, gVar.f8730a) && this.f8732c == gVar.f8732c : TextUtils.equals(this.f8730a, gVar.f8730a) && this.f8731b == gVar.f8731b && this.f8732c == gVar.f8732c;
    }

    public int hashCode() {
        return w4.c.b(this.f8730a, Integer.valueOf(this.f8732c));
    }
}
