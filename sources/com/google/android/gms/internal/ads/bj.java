package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bj implements zi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23947a = (((((~1539942439) & 2070175971) | 1100945533) + ((1539942439 & (-1166483302)) | (-2145608135))) - 96382817) ^ (1143565421 % 981914693);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f23948b = new byte[(((((~991039875) & 475472926) | 1225689584) + ((991039875 & 357672014) | 1805818736)) - (-1256743880)) ^ (1671581032 % 1337434154)];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj f23949c;

    public bj(dj djVar) {
        this.f23949c = djVar;
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final byte a(lj ljVar, int i11) {
        int i12 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i13 = 1761855727 % 1384724137;
        int i14 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i15 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i16 = 1694830070 % 1383960411;
        int i17 = i11 >>> i14;
        if (i17 != this.f23947a) {
            this.f23949c.a(i17, this.f23948b);
            this.f23947a = i17;
        }
        int i18 = i15 ^ i16;
        return (byte) (((this.f23948b[i11 % (i12 ^ i13)] ^ ljVar.b(i11)) << i18) >> i18);
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final lj b(lj ljVar, int i11, int i12) {
        if (i11 < 0 || i11 > i12 || i12 > ljVar.f30255a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i12 - i11];
        int i13 = 0;
        while (i11 < i12) {
            bArr[i13] = a(ljVar, i11);
            i11++;
            i13++;
        }
        return lj.e(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final /* bridge */ /* synthetic */ zi zzc() {
        return new bj(this.f23949c);
    }
}
