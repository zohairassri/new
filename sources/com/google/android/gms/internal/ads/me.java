package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f30707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30708e;

    public me(int i11, int i12) {
        this.f30704a = i11;
        byte[] bArr = new byte[131];
        this.f30707d = bArr;
        bArr[2] = 1;
    }

    public final void a() {
        this.f30705b = false;
        this.f30706c = false;
    }

    public final boolean b() {
        return this.f30706c;
    }

    public final void c(int i11) {
        jx3.i(!this.f30705b);
        boolean z11 = i11 == this.f30704a;
        this.f30705b = z11;
        if (z11) {
            this.f30708e = 3;
            this.f30706c = false;
        }
    }

    public final void d(byte[] bArr, int i11, int i12) {
        if (this.f30705b) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f30707d;
            int length = bArr2.length;
            int i14 = this.f30708e + i13;
            if (length < i14) {
                this.f30707d = Arrays.copyOf(bArr2, i14 + i14);
            }
            System.arraycopy(bArr, i11, this.f30707d, this.f30708e, i13);
            this.f30708e += i13;
        }
    }

    public final boolean e(int i11) {
        if (!this.f30705b) {
            return false;
        }
        this.f30708e -= i11;
        this.f30705b = false;
        this.f30706c = true;
        return true;
    }
}
