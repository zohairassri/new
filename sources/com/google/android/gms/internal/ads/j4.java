package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f28863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i4 f28864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final he f28865l;

    j4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, i4 i4Var, he heVar) {
        this.f28854a = i11;
        this.f28855b = i12;
        this.f28856c = i13;
        this.f28857d = i14;
        this.f28858e = i15;
        this.f28859f = f(i15);
        this.f28860g = i16;
        this.f28861h = i17;
        this.f28862i = g(i17);
        this.f28863j = j11;
        this.f28864k = i4Var;
        this.f28865l = heVar;
    }

    private static int f(int i11) {
        switch (i11) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int g(int i11) {
        if (i11 == 8) {
            return 1;
        }
        if (i11 == 12) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 20) {
            return 5;
        }
        if (i11 != 24) {
            return i11 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j11 = this.f28863j;
        if (j11 == 0) {
            return -9223372036854775807L;
        }
        return (j11 * 1000000) / ((long) this.f28858e);
    }

    public final long b(long j11) {
        String str = yy2.f38899a;
        return Math.max(0L, Math.min((j11 * ((long) this.f28858e)) / 1000000, this.f28863j - 1));
    }

    public final gk5 c(byte[] bArr, he heVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        he heVarD = d(heVar);
        ki5 ki5Var = new ki5();
        ki5Var.l0("audio/flac");
        int i11 = this.f28857d;
        if (i11 <= 0) {
            i11 = -1;
        }
        ki5Var.m0(i11);
        ki5Var.e(this.f28860g);
        ki5Var.f(this.f28858e);
        ki5Var.g(yy2.V(this.f28861h, ByteOrder.LITTLE_ENDIAN));
        ki5Var.o0(Collections.singletonList(bArr));
        ki5Var.j0(heVarD);
        return ki5Var.m();
    }

    public final he d(he heVar) {
        he heVar2 = this.f28865l;
        return heVar2 == null ? heVar : heVar2.f(heVar);
    }

    public final j4 e(i4 i4Var) {
        return new j4(this.f28854a, this.f28855b, this.f28856c, this.f28857d, this.f28858e, this.f28860g, this.f28861h, this.f28863j, i4Var, this.f28865l);
    }

    public j4(byte[] bArr, int i11) {
        gf2 gf2Var = new gf2(bArr, bArr.length);
        gf2Var.f(i11 * 8);
        this.f28854a = gf2Var.j(16);
        this.f28855b = gf2Var.j(16);
        this.f28856c = gf2Var.j(24);
        this.f28857d = gf2Var.j(24);
        int iJ = gf2Var.j(20);
        this.f28858e = iJ;
        this.f28859f = f(iJ);
        this.f28860g = gf2Var.j(3) + 1;
        int iJ2 = gf2Var.j(5) + 1;
        this.f28861h = iJ2;
        this.f28862i = g(iJ2);
        this.f28863j = gf2Var.k(36);
        this.f28864k = null;
        this.f28865l = null;
    }
}
