package qp;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f122933a = Charset.forName("UTF-8");

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f122934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f122935b;

        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int[] f122936f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int[] f122937g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f122938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f122939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f122940e;

        public b(int i11, byte[] bArr) {
            this.f122934a = bArr;
            this.f122940e = (i11 & 8) == 0 ? f122936f : f122937g;
            this.f122938c = 0;
            this.f122939d = 0;
        }

        public boolean a(byte[] bArr, int i11, int i12, boolean z11) {
            int i13 = this.f122938c;
            if (i13 == 6) {
                return false;
            }
            int i14 = i12 + i11;
            int i15 = this.f122939d;
            byte[] bArr2 = this.f122934a;
            int[] iArr = this.f122940e;
            int i16 = 0;
            int i17 = i15;
            int i18 = i13;
            int i19 = i11;
            while (i19 < i14) {
                if (i18 == 0) {
                    while (true) {
                        int i21 = i19 + 4;
                        if (i21 > i14 || (i17 = (iArr[bArr[i19] & 255] << 18) | (iArr[bArr[i19 + 1] & 255] << 12) | (iArr[bArr[i19 + 2] & 255] << 6) | iArr[bArr[i19 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i16 + 2] = (byte) i17;
                        bArr2[i16 + 1] = (byte) (i17 >> 8);
                        bArr2[i16] = (byte) (i17 >> 16);
                        i16 += 3;
                        i19 = i21;
                    }
                    if (i19 >= i14) {
                        break;
                    }
                }
                int i22 = i19 + 1;
                int i23 = iArr[bArr[i19] & 255];
                if (i18 != 0) {
                    if (i18 == 1) {
                        if (i23 < 0) {
                            if (i23 != -1) {
                                this.f122938c = 6;
                                return false;
                            }
                        }
                        i23 |= i17 << 6;
                    } else if (i18 == 2) {
                        if (i23 < 0) {
                            if (i23 == -2) {
                                bArr2[i16] = (byte) (i17 >> 4);
                                i16++;
                                i18 = 4;
                            } else if (i23 != -1) {
                                this.f122938c = 6;
                                return false;
                            }
                        }
                        i23 |= i17 << 6;
                    } else if (i18 != 3) {
                        if (i18 != 4) {
                            if (i18 == 5 && i23 != -1) {
                                this.f122938c = 6;
                                return false;
                            }
                        } else if (i23 == -2) {
                            i18++;
                        } else if (i23 != -1) {
                            this.f122938c = 6;
                            return false;
                        }
                    } else if (i23 >= 0) {
                        int i24 = i23 | (i17 << 6);
                        bArr2[i16 + 2] = (byte) i24;
                        bArr2[i16 + 1] = (byte) (i24 >> 8);
                        bArr2[i16] = (byte) (i24 >> 16);
                        i16 += 3;
                        i17 = i24;
                        i18 = 0;
                    } else if (i23 == -2) {
                        bArr2[i16 + 1] = (byte) (i17 >> 2);
                        bArr2[i16] = (byte) (i17 >> 10);
                        i16 += 2;
                        i18 = 5;
                    } else if (i23 != -1) {
                        this.f122938c = 6;
                        return false;
                    }
                    i18++;
                    i17 = i23;
                } else if (i23 >= 0) {
                    i18++;
                    i17 = i23;
                } else if (i23 != -1) {
                    this.f122938c = 6;
                    return false;
                }
                i19 = i22;
            }
            if (!z11) {
                this.f122938c = i18;
                this.f122939d = i17;
                this.f122935b = i16;
                return true;
            }
            if (i18 == 1) {
                this.f122938c = 6;
                return false;
            }
            if (i18 == 2) {
                bArr2[i16] = (byte) (i17 >> 4);
                i16++;
            } else if (i18 == 3) {
                int i25 = i16 + 1;
                bArr2[i16] = (byte) (i17 >> 10);
                i16 += 2;
                bArr2[i25] = (byte) (i17 >> 2);
            } else if (i18 == 4) {
                this.f122938c = 6;
                return false;
            }
            this.f122938c = i18;
            this.f122935b = i16;
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final byte[] f122941j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final byte[] f122942k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f122943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f122944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f122945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f122946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f122947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f122948h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final byte[] f122949i;

        public c(int i11, byte[] bArr) {
            this.f122934a = bArr;
            this.f122946f = (i11 & 1) == 0;
            boolean z11 = (i11 & 2) == 0;
            this.f122947g = z11;
            this.f122948h = (i11 & 4) != 0;
            this.f122949i = (i11 & 8) == 0 ? f122941j : f122942k;
            this.f122943c = new byte[2];
            this.f122944d = 0;
            this.f122945e = z11 ? 19 : -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instruction units count: 490
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: qp.e.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(String str, int i11) {
        return b(str.getBytes(f122933a), i11);
    }

    public static byte[] b(byte[] bArr, int i11) {
        return c(bArr, 0, bArr.length, i11);
    }

    public static byte[] c(byte[] bArr, int i11, int i12, int i13) {
        b bVar = new b(i13, new byte[(i12 * 3) / 4]);
        if (!bVar.a(bArr, i11, i12, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i14 = bVar.f122935b;
        byte[] bArr2 = bVar.f122934a;
        if (i14 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i14];
        System.arraycopy(bArr2, 0, bArr3, 0, i14);
        return bArr3;
    }

    public static String d(byte[] bArr) {
        return g(bArr, 2);
    }

    public static byte[] e(byte[] bArr, int i11) {
        return f(bArr, 0, bArr.length, i11);
    }

    public static byte[] f(byte[] bArr, int i11, int i12, int i13) {
        c cVar = new c(i13, null);
        int i14 = (i12 / 3) * 4;
        if (!cVar.f122946f) {
            int i15 = i12 % 3;
            if (i15 == 1) {
                i14 += 2;
            } else if (i15 == 2) {
                i14 += 3;
            }
        } else if (i12 % 3 > 0) {
            i14 += 4;
        }
        if (cVar.f122947g && i12 > 0) {
            i14 += (((i12 - 1) / 57) + 1) * (cVar.f122948h ? 2 : 1);
        }
        cVar.f122934a = new byte[i14];
        cVar.a(bArr, i11, i12, true);
        return cVar.f122934a;
    }

    public static String g(byte[] bArr, int i11) {
        try {
            return new String(e(bArr, i11), "US-ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }
}
