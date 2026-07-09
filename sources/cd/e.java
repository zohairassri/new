package cd;

import android.graphics.Bitmap;
import android.util.Log;
import cd.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class e implements a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f17527u = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f17528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f17529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0273a f17530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f17531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f17532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short[] f17533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f17534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f17535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f17536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f17537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f17539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f17540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f17546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bitmap.Config f17547t;

    public e(a.InterfaceC0273a interfaceC0273a, c cVar, ByteBuffer byteBuffer, int i11) {
        this(interfaceC0273a);
        q(cVar, byteBuffer, i11);
    }

    private int i(int i11, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = i11; i19 < this.f17543p + i11; i19++) {
            byte[] bArr = this.f17536i;
            if (i19 >= bArr.length || i19 >= i12) {
                break;
            }
            int i21 = this.f17528a[bArr[i19] & 255];
            if (i21 != 0) {
                i14 += (i21 >> 24) & 255;
                i15 += (i21 >> 16) & 255;
                i16 += (i21 >> 8) & 255;
                i17 += i21 & 255;
                i18++;
            }
        }
        int i22 = i11 + i13;
        for (int i23 = i22; i23 < this.f17543p + i22; i23++) {
            byte[] bArr2 = this.f17536i;
            if (i23 >= bArr2.length || i23 >= i12) {
                break;
            }
            int i24 = this.f17528a[bArr2[i23] & 255];
            if (i24 != 0) {
                i14 += (i24 >> 24) & 255;
                i15 += (i24 >> 16) & 255;
                i16 += (i24 >> 8) & 255;
                i17 += i24 & 255;
                i18++;
            }
        }
        if (i18 == 0) {
            return 0;
        }
        return ((i14 / i18) << 24) | ((i15 / i18) << 16) | ((i16 / i18) << 8) | (i17 / i18);
    }

    private void j(b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f17537j;
        int i15 = bVar.f17502d;
        int i16 = this.f17543p;
        int i17 = i15 / i16;
        int i18 = bVar.f17500b / i16;
        int i19 = bVar.f17501c / i16;
        int i21 = bVar.f17499a / i16;
        boolean z11 = this.f17538k == 0;
        int i22 = this.f17545r;
        int i23 = this.f17544q;
        byte[] bArr = this.f17536i;
        int[] iArr2 = this.f17528a;
        Boolean bool = this.f17546s;
        int i24 = 8;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1;
        while (i26 < i17) {
            int[] iArr3 = iArr;
            if (bVar.f17503e) {
                if (i25 >= i17) {
                    int i28 = i27 + 1;
                    i11 = i17;
                    if (i28 == 2) {
                        i27 = i28;
                        i25 = 4;
                    } else if (i28 == 3) {
                        i27 = i28;
                        i24 = 4;
                        i25 = 2;
                    } else if (i28 != 4) {
                        i27 = i28;
                    } else {
                        i27 = i28;
                        i25 = 1;
                        i24 = 2;
                    }
                } else {
                    i11 = i17;
                }
                i12 = i25 + i24;
            } else {
                i11 = i17;
                i12 = i25;
                i25 = i26;
            }
            int i29 = i25 + i18;
            boolean z12 = i16 == 1;
            if (i29 < i23) {
                int i31 = i29 * i22;
                int i32 = i31 + i21;
                int i33 = i32 + i19;
                int i34 = i31 + i22;
                if (i34 < i33) {
                    i33 = i34;
                }
                i13 = i12;
                int i35 = i26 * i16 * bVar.f17501c;
                if (z12) {
                    int i36 = i32;
                    while (i36 < i33) {
                        int i37 = i36;
                        int i38 = iArr2[bArr[i35] & 255];
                        if (i38 != 0) {
                            iArr3[i37] = i38;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i35 += i16;
                        i36 = i37 + 1;
                    }
                } else {
                    int i39 = ((i33 - i32) * i16) + i35;
                    i14 = i16;
                    int i41 = i32;
                    while (i41 < i33) {
                        int i42 = i33;
                        int i43 = i(i35, i39, bVar.f17501c);
                        if (i43 != 0) {
                            iArr3[i41] = i43;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i35 += i14;
                        i41++;
                        i33 = i42;
                    }
                    i26++;
                    i16 = i14;
                    iArr = iArr3;
                    i17 = i11;
                    i25 = i13;
                }
            } else {
                i13 = i12;
            }
            i14 = i16;
            i26++;
            i16 = i14;
            iArr = iArr3;
            i17 = i11;
            i25 = i13;
        }
        if (this.f17546s == null) {
            this.f17546s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f17537j;
        int i11 = bVar2.f17502d;
        int i12 = bVar2.f17500b;
        int i13 = bVar2.f17501c;
        int i14 = bVar2.f17499a;
        boolean z11 = this.f17538k == 0;
        int i15 = this.f17545r;
        byte[] bArr = this.f17536i;
        int[] iArr2 = this.f17528a;
        int i16 = 0;
        byte b11 = -1;
        while (i16 < i11) {
            int i17 = (i16 + i12) * i15;
            int i18 = i17 + i14;
            int i19 = i18 + i13;
            int i21 = i17 + i15;
            if (i21 < i19) {
                i19 = i21;
            }
            int i22 = bVar2.f17501c * i16;
            int i23 = i18;
            while (i23 < i19) {
                byte b12 = bArr[i22];
                int[] iArr3 = iArr;
                int i24 = b12 & 255;
                if (i24 != b11) {
                    int i25 = iArr2[i24];
                    if (i25 != 0) {
                        iArr3[i23] = i25;
                    } else {
                        b11 = b12;
                    }
                }
                i22++;
                i23++;
                iArr = iArr3;
            }
            i16++;
            bVar2 = bVar;
        }
        Boolean bool = this.f17546s;
        this.f17546s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f17546s == null && z11 && b11 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void l(b bVar) {
        int i11;
        int i12;
        byte[] bArr;
        short s11;
        e eVar = this;
        if (bVar != null) {
            eVar.f17531d.position(bVar.f17508j);
        }
        if (bVar == null) {
            c cVar = eVar.f17539l;
            i11 = cVar.f17515f;
            i12 = cVar.f17516g;
        } else {
            i11 = bVar.f17501c;
            i12 = bVar.f17502d;
        }
        int i13 = i11 * i12;
        byte[] bArr2 = eVar.f17536i;
        if (bArr2 == null || bArr2.length < i13) {
            eVar.f17536i = eVar.f17530c.b(i13);
        }
        byte[] bArr3 = eVar.f17536i;
        if (eVar.f17533f == null) {
            eVar.f17533f = new short[4096];
        }
        short[] sArr = eVar.f17533f;
        if (eVar.f17534g == null) {
            eVar.f17534g = new byte[4096];
        }
        byte[] bArr4 = eVar.f17534g;
        if (eVar.f17535h == null) {
            eVar.f17535h = new byte[4097];
        }
        byte[] bArr5 = eVar.f17535h;
        int iP = eVar.p();
        int i14 = 1 << iP;
        int i15 = i14 + 1;
        int i16 = i14 + 2;
        int i17 = iP + 1;
        int i18 = (1 << i17) - 1;
        byte b11 = 0;
        for (int i19 = 0; i19 < i14; i19++) {
            sArr[i19] = 0;
            bArr4[i19] = (byte) i19;
        }
        byte[] bArr6 = eVar.f17532e;
        int i21 = i17;
        int i22 = i16;
        int i23 = i18;
        int i24 = 0;
        int iO = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        int i32 = -1;
        while (true) {
            if (i24 >= i13) {
                break;
            }
            if (iO == 0) {
                iO = eVar.o();
                if (iO <= 0) {
                    eVar.f17542o = 3;
                    break;
                }
                i25 = b11;
            }
            i27 += (bArr6[i25] & 255) << i26;
            i25++;
            iO--;
            int i33 = i26 + 8;
            int i34 = i22;
            int i35 = i32;
            int i36 = i21;
            short[] sArr2 = sArr;
            int i37 = i31;
            while (true) {
                bArr = bArr4;
                if (i33 < i36) {
                    i22 = i34;
                    i31 = i37;
                    break;
                }
                int i38 = i27 & i23;
                i27 >>= i36;
                i33 -= i36;
                if (i38 == i14) {
                    i36 = i17;
                    i34 = i16;
                    i23 = i18;
                    bArr4 = bArr;
                    i35 = -1;
                } else {
                    if (i38 == i15) {
                        i31 = i37;
                        i22 = i34;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i35 == -1) {
                        bArr3[i28] = bArr[i38];
                        i28++;
                        i24++;
                        i35 = i38;
                        i37 = i35;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i38 >= i34) {
                            bArr7[i29] = (byte) i37;
                            i29++;
                            s11 = i35;
                        } else {
                            s11 = i38;
                        }
                        while (s11 >= i14) {
                            bArr7[i29] = bArr[s11];
                            i29++;
                            s11 = sArr2[s11];
                        }
                        int i39 = bArr[s11] & 255;
                        byte b12 = (byte) i39;
                        bArr3[i28] = b12;
                        while (true) {
                            i28++;
                            i24++;
                            if (i29 <= 0) {
                                break;
                            }
                            i29--;
                            bArr3[i28] = bArr7[i29];
                        }
                        if (i34 < 4096) {
                            sArr2[i34] = (short) i35;
                            bArr[i34] = b12;
                            i34++;
                            if ((i34 & i23) == 0 && i34 < 4096) {
                                i36++;
                                i23 += i34;
                            }
                        }
                        i35 = i38;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i37 = i39;
                    }
                }
            }
            i26 = i33;
            sArr = sArr2;
            bArr4 = bArr;
            b11 = 0;
            i32 = i35;
            i21 = i36;
            eVar = this;
        }
        Arrays.fill(bArr3, i28, i13, b11);
    }

    private Bitmap n() {
        Boolean bool = this.f17546s;
        Bitmap bitmapC = this.f17530c.c(this.f17545r, this.f17544q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f17547t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    private int o() {
        int iP = p();
        if (iP <= 0) {
            return iP;
        }
        ByteBuffer byteBuffer = this.f17531d;
        byteBuffer.get(this.f17532e, 0, Math.min(iP, byteBuffer.remaining()));
        return iP;
    }

    private int p() {
        return this.f17531d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i11;
        int i12;
        Bitmap bitmap;
        int[] iArr = this.f17537j;
        int i13 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f17540m;
            if (bitmap2 != null) {
                this.f17530c.a(bitmap2);
            }
            this.f17540m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f17505g == 3 && this.f17540m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i12 = bVar2.f17505g) > 0) {
            if (i12 == 2) {
                if (!bVar.f17504f) {
                    c cVar = this.f17539l;
                    int i14 = cVar.f17521l;
                    if (bVar.f17509k == null || cVar.f17519j != bVar.f17506h) {
                        i13 = i14;
                    }
                }
                int i15 = bVar2.f17502d;
                int i16 = this.f17543p;
                int i17 = i15 / i16;
                int i18 = bVar2.f17500b / i16;
                int i19 = bVar2.f17501c / i16;
                int i21 = bVar2.f17499a / i16;
                int i22 = this.f17545r;
                int i23 = (i18 * i22) + i21;
                int i24 = (i17 * i22) + i23;
                while (i23 < i24) {
                    int i25 = i23 + i19;
                    for (int i26 = i23; i26 < i25; i26++) {
                        iArr[i26] = i13;
                    }
                    i23 += this.f17545r;
                }
            } else if (i12 == 3 && (bitmap = this.f17540m) != null) {
                int i27 = this.f17545r;
                bitmap.getPixels(iArr, 0, i27, 0, 0, i27, this.f17544q);
            }
        }
        l(bVar);
        if (bVar.f17503e || this.f17543p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f17541n && ((i11 = bVar.f17505g) == 0 || i11 == 1)) {
            if (this.f17540m == null) {
                this.f17540m = n();
            }
            Bitmap bitmap3 = this.f17540m;
            int i28 = this.f17545r;
            bitmap3.setPixels(iArr, 0, i28, 0, 0, i28, this.f17544q);
        }
        Bitmap bitmapN = n();
        int i29 = this.f17545r;
        bitmapN.setPixels(iArr, 0, i29, 0, 0, i29, this.f17544q);
        return bitmapN;
    }

    @Override // cd.a
    public synchronized Bitmap a() {
        try {
            if (this.f17539l.f17512c <= 0 || this.f17538k < 0) {
                if (Log.isLoggable(f17527u, 3)) {
                    int i11 = this.f17539l.f17512c;
                }
                this.f17542o = 1;
            }
            int i12 = this.f17542o;
            if (i12 != 1 && i12 != 2) {
                this.f17542o = 0;
                if (this.f17532e == null) {
                    this.f17532e = this.f17530c.b(255);
                }
                b bVar = (b) this.f17539l.f17514e.get(this.f17538k);
                int i13 = this.f17538k - 1;
                b bVar2 = i13 >= 0 ? (b) this.f17539l.f17514e.get(i13) : null;
                int[] iArr = bVar.f17509k;
                if (iArr == null) {
                    iArr = this.f17539l.f17510a;
                }
                this.f17528a = iArr;
                if (iArr == null) {
                    Log.isLoggable(f17527u, 3);
                    this.f17542o = 1;
                    return null;
                }
                if (bVar.f17504f) {
                    System.arraycopy(iArr, 0, this.f17529b, 0, iArr.length);
                    int[] iArr2 = this.f17529b;
                    this.f17528a = iArr2;
                    iArr2[bVar.f17506h] = 0;
                    if (bVar.f17505g == 2 && this.f17538k == 0) {
                        this.f17546s = Boolean.TRUE;
                    }
                }
                return r(bVar, bVar2);
            }
            Log.isLoggable(f17527u, 3);
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // cd.a
    public void b() {
        this.f17538k = (this.f17538k + 1) % this.f17539l.f17512c;
    }

    @Override // cd.a
    public int c() {
        return this.f17539l.f17512c;
    }

    @Override // cd.a
    public void clear() {
        this.f17539l = null;
        byte[] bArr = this.f17536i;
        if (bArr != null) {
            this.f17530c.e(bArr);
        }
        int[] iArr = this.f17537j;
        if (iArr != null) {
            this.f17530c.f(iArr);
        }
        Bitmap bitmap = this.f17540m;
        if (bitmap != null) {
            this.f17530c.a(bitmap);
        }
        this.f17540m = null;
        this.f17531d = null;
        this.f17546s = null;
        byte[] bArr2 = this.f17532e;
        if (bArr2 != null) {
            this.f17530c.e(bArr2);
        }
    }

    @Override // cd.a
    public void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f17547t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // cd.a
    public int e() {
        int i11;
        if (this.f17539l.f17512c <= 0 || (i11 = this.f17538k) < 0) {
            return 0;
        }
        return m(i11);
    }

    @Override // cd.a
    public void f() {
        this.f17538k = -1;
    }

    @Override // cd.a
    public int g() {
        return this.f17538k;
    }

    @Override // cd.a
    public ByteBuffer getData() {
        return this.f17531d;
    }

    @Override // cd.a
    public int h() {
        return this.f17531d.limit() + this.f17536i.length + (this.f17537j.length * 4);
    }

    public int m(int i11) {
        if (i11 < 0) {
            return -1;
        }
        c cVar = this.f17539l;
        if (i11 < cVar.f17512c) {
            return ((b) cVar.f17514e.get(i11)).f17507i;
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i11) {
        try {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i11);
            }
            int iHighestOneBit = Integer.highestOneBit(i11);
            this.f17542o = 0;
            this.f17539l = cVar;
            this.f17538k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f17531d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f17531d.order(ByteOrder.LITTLE_ENDIAN);
            this.f17541n = false;
            Iterator it = cVar.f17514e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).f17505g == 3) {
                    this.f17541n = true;
                    break;
                }
            }
            this.f17543p = iHighestOneBit;
            int i12 = cVar.f17515f;
            this.f17545r = i12 / iHighestOneBit;
            int i13 = cVar.f17516g;
            this.f17544q = i13 / iHighestOneBit;
            this.f17536i = this.f17530c.b(i12 * i13);
            this.f17537j = this.f17530c.d(this.f17545r * this.f17544q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public e(a.InterfaceC0273a interfaceC0273a) {
        this.f17529b = new int[256];
        this.f17547t = Bitmap.Config.ARGB_8888;
        this.f17530c = interfaceC0273a;
        this.f17539l = new c();
    }
}
