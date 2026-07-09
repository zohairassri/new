package com.google.android.gms.internal.ads;

import com.comscore.android.ConnectivityType;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a4 {
    public static void a(boolean z11, String str) throws zzat {
        if (!z11) {
            throw zzat.b(str, null);
        }
    }

    public static int b(x3 x3Var, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int iB = x3Var.B(bArr, i11 + i13, i12 - i13);
            if (iB == -1) {
                break;
            }
            i13 += iB;
        }
        return i13;
    }

    public static boolean c(x3 x3Var, byte[] bArr, int i11, int i12) {
        try {
            x3Var.y(bArr, i11, i12);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean d(x3 x3Var, int i11) {
        try {
            x3Var.f(i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(x3 x3Var, byte[] bArr, int i11, int i12, boolean z11) throws EOFException {
        try {
            return x3Var.x(bArr, 0, i12, z11);
        } catch (EOFException e11) {
            if (z11) {
                return false;
            }
            throw e11;
        }
    }

    public static int f(int i11) {
        if (i11 == 20) {
            return 63750;
        }
        if (i11 == 30) {
            return 2250000;
        }
        switch (i11) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return ConnectivityType.UNKNOWN;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i11) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}
