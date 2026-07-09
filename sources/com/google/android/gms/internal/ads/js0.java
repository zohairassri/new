package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class js0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final js0 f29198e = new js0(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29202d;

    public js0(int i11, int i12, int i13) {
        this.f29199a = i11;
        this.f29200b = i12;
        this.f29201c = i13;
        this.f29202d = yy2.a(i13) ? yy2.d(i13) * i12 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js0)) {
            return false;
        }
        js0 js0Var = (js0) obj;
        return this.f29199a == js0Var.f29199a && this.f29200b == js0Var.f29200b && this.f29201c == js0Var.f29201c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f29199a), Integer.valueOf(this.f29200b), Integer.valueOf(this.f29201c));
    }

    public final String toString() {
        int i11 = this.f29199a;
        int length = String.valueOf(i11).length();
        int i12 = this.f29200b;
        int length2 = String.valueOf(i12).length();
        int i13 = this.f29201c;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i13).length() + 1);
        sb2.append("AudioFormat[sampleRate=");
        sb2.append(i11);
        sb2.append(", channelCount=");
        sb2.append(i12);
        sb2.append(", encoding=");
        sb2.append(i13);
        sb2.append("]");
        return sb2.toString();
    }
}
