package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class vd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f36751e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f36755d = new byte[128];

    public vd(int i11) {
    }

    public final void a() {
        this.f36752a = false;
        this.f36753b = 0;
        this.f36754c = 0;
    }

    public final boolean b(int i11, int i12) {
        if (this.f36752a) {
            int i13 = this.f36753b - i12;
            this.f36753b = i13;
            if (this.f36754c != 0 || i11 != 181) {
                this.f36752a = false;
                return true;
            }
            this.f36754c = i13;
        } else if (i11 == 179) {
            this.f36752a = true;
        }
        c(f36751e, 0, 3);
        return false;
    }

    public final void c(byte[] bArr, int i11, int i12) {
        if (this.f36752a) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f36755d;
            int length = bArr2.length;
            int i14 = this.f36753b + i13;
            if (length < i14) {
                this.f36755d = Arrays.copyOf(bArr2, i14 + i14);
            }
            System.arraycopy(bArr, i11, this.f36755d, this.f36753b, i13);
            this.f36753b += i13;
        }
    }
}
