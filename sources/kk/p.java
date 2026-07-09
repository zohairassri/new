package kk;

import ck.b0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.a f111263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f111264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f111265e;

    public p(boolean z11, String str, int i11, byte[] bArr, int i12, int i13, byte[] bArr2) {
        ml.a.a((bArr2 == null) ^ (i11 == 0));
        this.f111261a = z11;
        this.f111262b = str;
        this.f111264d = i11;
        this.f111265e = bArr2;
        this.f111263c = new b0.a(a(str), bArr, i12, i13);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b11 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b11 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b11 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b11 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b11 = 3;
                }
                break;
        }
        switch (b11) {
            case 0:
            case 1:
                return 2;
            default:
                ml.q.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
