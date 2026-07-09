package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20869a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20870b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20871c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f20872d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20873e;

    public i() {
        this.f20873e = r0.length - 1;
    }

    private void c() {
        int[] iArr = this.f20872d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i11 = this.f20869a;
        int i12 = length2 - i11;
        System.arraycopy(iArr, i11, iArr2, 0, i12);
        System.arraycopy(this.f20872d, 0, iArr2, i12, i11);
        this.f20869a = 0;
        this.f20870b = this.f20871c - 1;
        this.f20872d = iArr2;
        this.f20873e = iArr2.length - 1;
    }

    public void a(int i11) {
        if (this.f20871c == this.f20872d.length) {
            c();
        }
        int i12 = (this.f20870b + 1) & this.f20873e;
        this.f20870b = i12;
        this.f20872d[i12] = i11;
        this.f20871c++;
    }

    public void b() {
        this.f20869a = 0;
        this.f20870b = -1;
        this.f20871c = 0;
    }

    public boolean d() {
        return this.f20871c == 0;
    }

    public int e() {
        int i11 = this.f20871c;
        if (i11 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f20872d;
        int i12 = this.f20869a;
        int i13 = iArr[i12];
        this.f20869a = (i12 + 1) & this.f20873e;
        this.f20871c = i11 - 1;
        return i13;
    }
}
