package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class tf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long[] f35456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long[] f35457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long[] f35458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final mf4[][] f35459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final mf4[] f35460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigInteger f35461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigInteger f35462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BigInteger f35463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final BigInteger f35464i;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f35461f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f35462g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f35463h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f35464i = bigIntegerModPow;
        sf4 sf4Var = new sf4(null);
        sf4Var.d(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract));
        BigInteger bigIntegerC = sf4Var.c();
        BigInteger bigIntegerMultiply = bigIntegerC.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerC.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        sf4Var.b(bigIntegerModPow2);
        f35456a = yf4.g(b(bigIntegerMod));
        f35457b = yf4.g(b(bigIntegerMod2));
        f35458c = yf4.g(b(bigIntegerModPow));
        f35459d = (mf4[][]) Array.newInstance((Class<?>) mf4.class, 32, 8);
        sf4 sf4VarA = sf4Var;
        for (int i11 = 0; i11 < 32; i11++) {
            sf4 sf4VarA2 = sf4VarA;
            for (int i12 = 0; i12 < 8; i12++) {
                f35459d[i11][i12] = c(sf4VarA2);
                sf4VarA2 = a(sf4VarA2, sf4VarA);
            }
            for (int i13 = 0; i13 < 8; i13++) {
                sf4VarA = a(sf4VarA, sf4VarA);
            }
        }
        sf4 sf4VarA3 = a(sf4Var, sf4Var);
        f35460e = new mf4[8];
        for (int i14 = 0; i14 < 8; i14++) {
            f35460e[i14] = c(sf4Var);
            sf4Var = a(sf4Var, sf4VarA3);
        }
    }

    private static sf4 a(sf4 sf4Var, sf4 sf4Var2) {
        sf4 sf4Var3 = new sf4(null);
        BigInteger bigIntegerMultiply = f35462g.multiply(sf4Var.a().multiply(sf4Var2.a()).multiply(sf4Var.c()).multiply(sf4Var2.c()));
        BigInteger bigInteger = f35461f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = sf4Var.a().multiply(sf4Var2.c()).add(sf4Var2.a().multiply(sf4Var.c()));
        BigInteger bigInteger2 = BigInteger.ONE;
        sf4Var3.b(bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        sf4Var3.d(sf4Var.c().multiply(sf4Var2.c()).add(sf4Var.a().multiply(sf4Var2.a())).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        return sf4Var3;
    }

    private static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i11 = 0; i11 < 16; i11++) {
            byte b11 = bArr[i11];
            int i12 = 31 - i11;
            bArr[i11] = bArr[i12];
            bArr[i12] = b11;
        }
        return bArr;
    }

    private static mf4 c(sf4 sf4Var) {
        BigInteger bigIntegerAdd = sf4Var.c().add(sf4Var.a());
        BigInteger bigInteger = f35461f;
        return new mf4(yf4.g(b(bigIntegerAdd.mod(bigInteger))), yf4.g(b(sf4Var.c().subtract(sf4Var.a()).mod(bigInteger))), yf4.g(b(f35463h.multiply(sf4Var.a()).multiply(sf4Var.c()).mod(bigInteger))));
    }
}
