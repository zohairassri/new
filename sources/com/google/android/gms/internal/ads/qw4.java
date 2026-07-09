package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class qw4 implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f33829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33830b;

    /* synthetic */ qw4(byte[] bArr) {
    }

    final void a(char[] cArr) {
        this.f33829a = cArr;
        this.f33830b = null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f33829a[i11];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f33829a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i11, int i12) {
        return new String(this.f33829a, i11, i12 - i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f33830b == null) {
            this.f33830b = new String(this.f33829a);
        }
        return this.f33830b;
    }
}
