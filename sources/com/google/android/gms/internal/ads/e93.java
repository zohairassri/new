package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e93 implements gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25661a;

    public e93(int i11) {
        this.f25661a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e93) && this.f25661a == ((e93) obj).f25661a;
    }

    public final int hashCode() {
        return this.f25661a;
    }

    public final String toString() {
        int i11 = this.f25661a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 19);
        sb2.append("Mp4AlternateGroup: ");
        sb2.append(i11);
        return sb2.toString();
    }
}
