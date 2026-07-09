package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class i44 extends k44 {
    public static int a(long j11) {
        int i11 = (int) j11;
        jx3.e(((long) i11) == j11, "Out of range: %s", j11);
        return i11;
    }

    public static int b(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j11 < -2147483648L ? IntCompanionObject.MIN_VALUE : (int) j11;
    }

    public static int c(int i11, int i12, int i13) {
        jx3.g(true, "min (%s) must be less than or equal to max (%s)", i12, 1073741823);
        return Math.min(Math.max(i11, i12), 1073741823);
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        jx3.g(length >= 4, "array too small: %s < %s", length, 4);
        return e(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int e(byte b11, byte b12, byte b13, byte b14) {
        return (b11 << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    public static int[] f(Collection collection) {
        if (collection instanceof h44) {
            h44 h44Var = (h44) collection;
            return Arrays.copyOfRange(h44Var.f27513a, h44Var.f27514b, h44Var.f27515c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = array[i11];
            obj.getClass();
            iArr[i11] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List g(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new h44(iArr, 0, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer h(java.lang.String r11, int r12) {
        /*
            r11.getClass()
            boolean r12 = r11.isEmpty()
            r0 = 0
            if (r12 == 0) goto Ld
        La:
            r11 = r0
            goto L6f
        Ld:
            r12 = 0
            char r1 = r11.charAt(r12)
            r2 = 45
            if (r1 != r2) goto L17
            r12 = 1
        L17:
            int r3 = r11.length()
            if (r12 != r3) goto L1e
            goto La
        L1e:
            int r3 = r12 + 1
            char r12 = r11.charAt(r12)
            int r12 = com.google.android.gms.internal.ads.l44.a(r12)
            if (r12 < 0) goto La
            r4 = 10
            if (r12 < r4) goto L2f
            goto La
        L2f:
            int r12 = -r12
            long r5 = (long) r12
        L31:
            int r12 = r11.length()
            r7 = -9223372036854775808
            if (r3 >= r12) goto L5e
            int r12 = r3 + 1
            char r3 = r11.charAt(r3)
            int r3 = com.google.android.gms.internal.ads.l44.a(r3)
            if (r3 < 0) goto La
            if (r3 >= r4) goto La
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 >= 0) goto L51
            goto La
        L51:
            r9 = 10
            long r5 = r5 * r9
            long r9 = (long) r3
            long r7 = r7 + r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L5b
            goto La
        L5b:
            long r5 = r5 - r9
            r3 = r12
            goto L31
        L5e:
            if (r1 != r2) goto L65
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            goto L6f
        L65:
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L6a
            goto La
        L6a:
            long r11 = -r5
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
        L6f:
            if (r11 == 0) goto L88
            long r1 = r11.longValue()
            int r12 = r11.intValue()
            long r3 = (long) r12
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L7f
            goto L88
        L7f:
            int r11 = r11.intValue()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i44.h(java.lang.String, int):java.lang.Integer");
    }

    static /* synthetic */ int i(int[] iArr, int i11, int i12, int i13) {
        while (i12 < i13) {
            if (iArr[i12] == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }
}
