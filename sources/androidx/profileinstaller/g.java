package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f11751a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f11752b = {112, 114, 109, 0};

    private static void A(byte[] bArr, int i11, int i12, c cVar) {
        int iM = m(i11, i12, cVar.f11739g);
        int i13 = iM / 8;
        bArr[i13] = (byte) ((1 << (iM % 8)) | bArr[i13]);
    }

    private static void B(InputStream inputStream) {
        d.h(inputStream);
        int iJ = d.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            d.j(inputStream);
            for (int iJ2 = d.j(inputStream); iJ2 > 0; iJ2--) {
                d.h(inputStream);
            }
            iJ--;
        }
    }

    static boolean C(OutputStream outputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, i.f11764a)) {
            P(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f11765b)) {
            O(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f11767d)) {
            M(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f11766c)) {
            N(outputStream, cVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, i.f11768e)) {
            return false;
        }
        L(outputStream, cVarArr);
        return true;
    }

    private static void D(OutputStream outputStream, c cVar) throws IOException {
        int[] iArr = cVar.f11740h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            d.p(outputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
    }

    private static j E(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i11 = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.f11735c);
                d.q(byteArrayOutputStream, cVar.f11736d);
                d.q(byteArrayOutputStream, cVar.f11739g);
                String strJ = j(cVar.f11733a, cVar.f11734b, i.f11764a);
                int iK = d.k(strJ);
                d.p(byteArrayOutputStream, iK);
                i11 = i11 + 14 + iK;
                d.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i11 == byteArray.length) {
                j jVar = new j(e.DEX_FILES, i11, byteArray, false);
                byteArrayOutputStream.close();
                return jVar;
            }
            throw d.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static void F(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f11751a);
        outputStream.write(bArr);
    }

    private static void G(OutputStream outputStream, c cVar) throws IOException {
        K(outputStream, cVar);
        D(outputStream, cVar);
        I(outputStream, cVar);
    }

    private static void H(OutputStream outputStream, c cVar, String str) throws IOException {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.f11737e);
        d.q(outputStream, cVar.f11738f);
        d.q(outputStream, cVar.f11735c);
        d.q(outputStream, cVar.f11739g);
        d.n(outputStream, str);
    }

    private static void I(OutputStream outputStream, c cVar) throws IOException {
        byte[] bArr = new byte[k(cVar.f11739g)];
        for (Map.Entry entry : cVar.f11741i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                A(bArr, 2, iIntValue, cVar);
            }
            if ((iIntValue2 & 4) != 0) {
                A(bArr, 4, iIntValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void J(OutputStream outputStream, int i11, c cVar) throws IOException {
        byte[] bArr = new byte[l(i11, cVar.f11739g)];
        for (Map.Entry entry : cVar.f11741i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i11) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (cVar.f11739g * i12) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void K(OutputStream outputStream, c cVar) throws IOException {
        int i11 = 0;
        for (Map.Entry entry : cVar.f11741i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                d.p(outputStream, iIntValue - i11);
                d.p(outputStream, 0);
                i11 = iIntValue;
            }
        }
    }

    private static void L(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String strJ = j(cVar.f11733a, cVar.f11734b, i.f11768e);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f11741i.size());
            d.p(outputStream, cVar.f11740h.length);
            d.q(outputStream, cVar.f11735c);
            d.n(outputStream, strJ);
            Iterator it = cVar.f11741i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i11 : cVar.f11740h) {
                d.p(outputStream, i11);
            }
        }
    }

    private static void M(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            int size = cVar.f11741i.size() * 4;
            String strJ = j(cVar.f11733a, cVar.f11734b, i.f11767d);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f11740h.length);
            d.q(outputStream, size);
            d.q(outputStream, cVar.f11735c);
            d.n(outputStream, strJ);
            Iterator it = cVar.f11741i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, ((Integer) it.next()).intValue());
                d.p(outputStream, 0);
            }
            for (int i11 : cVar.f11740h) {
                d.p(outputStream, i11);
            }
        }
    }

    private static void N(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, i.f11766c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void O(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, i.f11765b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void P(OutputStream outputStream, c[] cVarArr) throws IOException {
        Q(outputStream, cVarArr);
    }

    private static void Q(OutputStream outputStream, c[] cVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = ((long) i.f11764a.length) + ((long) f11751a.length) + 4 + ((long) (arrayList.size() * 16));
        d.q(outputStream, arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            j jVar = (j) arrayList.get(i11);
            d.q(outputStream, jVar.f11771a.b());
            d.q(outputStream, length2);
            if (jVar.f11774d) {
                byte[] bArr = jVar.f11773c;
                long length3 = bArr.length;
                byte[] bArrB = d.b(bArr);
                arrayList2.add(bArrB);
                d.q(outputStream, bArrB.length);
                d.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(jVar.f11773c);
                d.q(outputStream, jVar.f11773c.length);
                d.q(outputStream, 0L);
                length = jVar.f11773c.length;
            }
            length2 += (long) length;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            outputStream.write((byte[]) arrayList2.get(i12));
        }
    }

    private static int a(c cVar) {
        Iterator it = cVar.f11741i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    private static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i11 = 0;
        int iK = 0;
        for (c cVar : cVarArr) {
            iK += d.k(j(cVar.f11733a, cVar.f11734b, bArr)) + 16 + (cVar.f11737e * 2) + cVar.f11738f + k(cVar.f11739g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, i.f11766c)) {
            int length = cVarArr.length;
            while (i11 < length) {
                c cVar2 = cVarArr[i11];
                H(byteArrayOutputStream, cVar2, j(cVar2.f11733a, cVar2.f11734b, bArr));
                G(byteArrayOutputStream, cVar2);
                i11++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                H(byteArrayOutputStream, cVar3, j(cVar3.f11733a, cVar3.f11734b, bArr));
            }
            int length2 = cVarArr.length;
            while (i11 < length2) {
                G(byteArrayOutputStream, cVarArr[i11]);
                i11++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static j c(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            try {
                c cVar = cVarArr[i12];
                d.p(byteArrayOutputStream, i12);
                d.p(byteArrayOutputStream, cVar.f11737e);
                i11 = i11 + 4 + (cVar.f11737e * 2);
                D(byteArrayOutputStream, cVar);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            j jVar = new j(e.CLASSES, i11, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
    }

    private static j d(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            try {
                c cVar = cVarArr[i12];
                int iA = a(cVar);
                byte[] bArrE = e(iA, cVar);
                byte[] bArrF = f(cVar);
                d.p(byteArrayOutputStream, i12);
                int length = bArrE.length + 2 + bArrF.length;
                d.q(byteArrayOutputStream, length);
                d.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i11 = i11 + 6 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            j jVar = new j(e.METHODS, i11, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(int i11, c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i11, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static byte[] f(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static c i(c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            if (cVarArr[i11].f11734b.equals(strH)) {
                return cVarArr[i11];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String strA = i.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + i.a(bArr) + str2;
    }

    private static int k(int i11) {
        return z(i11 * 2) / 8;
    }

    private static int l(int i11, int i12) {
        return z(Integer.bitCount(i11 & (-2)) * i12) / 8;
    }

    private static int m(int i11, int i12, int i13) {
        if (i11 == 1) {
            throw d.c("HOT methods are not stored in the bitmap");
        }
        if (i11 == 2) {
            return i12;
        }
        if (i11 == 4) {
            return i12 + i13;
        }
        throw d.c("Unexpected flag: " + i11);
    }

    private static int[] n(InputStream inputStream, int i11) {
        int[] iArr = new int[i11];
        int iH = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iH += d.h(inputStream);
            iArr[i12] = iH;
        }
        return iArr;
    }

    private static int o(BitSet bitSet, int i11, int i12) {
        int i13 = bitSet.get(m(2, i11, i12)) ? 2 : 0;
        return bitSet.get(m(4, i11, i12)) ? i13 | 4 : i13;
    }

    static byte[] p(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, i.f11765b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void q(InputStream inputStream, c cVar) {
        int iAvailable = inputStream.available() - cVar.f11738f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += d.h(inputStream);
            cVar.f11741i.put(Integer.valueOf(iH), 1);
            for (int iH2 = d.h(inputStream); iH2 > 0; iH2--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw d.c("Read too much data during profile line parse");
        }
    }

    static c[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        if (Arrays.equals(bArr, i.f11769f)) {
            if (Arrays.equals(i.f11764a, bArr2)) {
                throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, cVarArr);
        }
        if (Arrays.equals(bArr, i.f11770g)) {
            return u(inputStream, bArr2, cVarArr);
        }
        throw d.c("Unsupported meta version");
    }

    static c[] s(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (!Arrays.equals(bArr, i.f11769f)) {
            throw d.c("Unsupported meta version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrT = t(byteArrayInputStream, iJ, cVarArr);
            byteArrayInputStream.close();
            return cVarArrT;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static c[] t(InputStream inputStream, int i11, c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i11 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i11];
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = d.h(inputStream);
            iArr[i12] = d.h(inputStream);
            strArr[i12] = d.f(inputStream, iH);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            if (!cVar.f11734b.equals(strArr[i13])) {
                throw d.c("Order of dexfiles in metadata did not match baseline");
            }
            int i14 = iArr[i13];
            cVar.f11737e = i14;
            cVar.f11740h = n(inputStream, i14);
        }
        return cVarArr;
    }

    static c[] u(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        int iH = d.h(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrV = v(byteArrayInputStream, bArr, iH, cVarArr);
            byteArrayInputStream.close();
            return cVarArrV;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static c[] v(InputStream inputStream, byte[] bArr, int i11, c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i11 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            d.h(inputStream);
            String strF = d.f(inputStream, d.h(inputStream));
            long jI = d.i(inputStream);
            int iH = d.h(inputStream);
            c cVarI = i(cVarArr, strF);
            if (cVarI == null) {
                throw d.c("Missing profile key: " + strF);
            }
            cVarI.f11736d = jI;
            int[] iArrN = n(inputStream, iH);
            if (Arrays.equals(bArr, i.f11768e)) {
                cVarI.f11737e = iH;
                cVarI.f11740h = iArrN;
            }
        }
        return cVarArr;
    }

    private static void w(InputStream inputStream, c cVar) {
        BitSet bitSetValueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.f11739g * 2)));
        int i11 = 0;
        while (true) {
            int i12 = cVar.f11739g;
            if (i11 >= i12) {
                return;
            }
            int iO = o(bitSetValueOf, i11, i12);
            if (iO != 0) {
                Integer num = (Integer) cVar.f11741i.get(Integer.valueOf(i11));
                if (num == null) {
                    num = 0;
                }
                cVar.f11741i.put(Integer.valueOf(i11), Integer.valueOf(iO | num.intValue()));
            }
            i11++;
        }
    }

    static c[] x(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, i.f11765b)) {
            throw d.c("Unsupported version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrY = y(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return cVarArrY;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static c[] y(InputStream inputStream, String str, int i11) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = d.h(inputStream);
            int iH2 = d.h(inputStream);
            cVarArr[i12] = new c(str, d.f(inputStream, iH), d.i(inputStream), 0L, iH2, (int) d.i(inputStream), (int) d.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            q(inputStream, cVar);
            cVar.f11740h = n(inputStream, cVar.f11737e);
            w(inputStream, cVar);
        }
        return cVarArr;
    }

    private static int z(int i11) {
        return (i11 + 7) & (-8);
    }
}
