package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class q extends p {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends d implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long[] f111712b;

        a(long[] jArr) {
            this.f111712b = jArr;
        }

        @Override // kotlin.collections.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return i(((Number) obj).longValue());
            }
            return false;
        }

        @Override // kotlin.collections.b
        public int d() {
            return this.f111712b.length;
        }

        public boolean i(long j11) {
            return t.e0(this.f111712b, j11);
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return l(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
            return this.f111712b.length == 0;
        }

        @Override // kotlin.collections.d, java.util.List
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long get(int i11) {
            return Long.valueOf(this.f111712b[i11]);
        }

        public int l(long j11) {
            return t.y0(this.f111712b, j11);
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return m(((Number) obj).longValue());
            }
            return -1;
        }

        public int m(long j11) {
            return t.I0(this.f111712b, j11);
        }
    }

    public static final void A(boolean[] zArr, boolean z11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i11, i12, z11);
    }

    public static /* synthetic */ void B(int[] iArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = iArr.length;
        }
        x(iArr, i11, i12, i13);
    }

    public static /* synthetic */ void C(long[] jArr, long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = jArr.length;
        }
        y(jArr, j11, i11, i12);
    }

    public static /* synthetic */ void D(Object[] objArr, Object obj, int i11, int i12, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = objArr.length;
        }
        z(objArr, obj, i11, i12);
    }

    public static /* synthetic */ void E(boolean[] zArr, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = zArr.length;
        }
        A(zArr, z11, i11, i12);
    }

    public static double[] F(double[] dArr, double[] elements) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, dArrCopyOf, length, length2);
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    public static float[] G(float[] fArr, float[] elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static int[] H(int[] iArr, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i11;
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] I(int[] iArr, int[] elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static long[] J(long[] jArr, long[] elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static Object[] K(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        Intrinsics.checkNotNull(objArrCopyOf);
        return objArrCopyOf;
    }

    public static Object[] L(Object[] objArr, Object[] elements) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        Intrinsics.checkNotNull(objArrCopyOf);
        return objArrCopyOf;
    }

    public static boolean[] M(boolean[] zArr, boolean[] elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static void N(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void O(int[] iArr, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.sort(iArr, i11, i12);
    }

    public static final void P(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static void Q(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void R(Object[] objArr, Comparator comparator, int i11, int i12) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objArr, i11, i12, comparator);
    }

    public static Boolean[] S(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolArr[i11] = Boolean.valueOf(zArr[i11]);
        }
        return boolArr;
    }

    public static Double[] T(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            dArr2[i11] = Double.valueOf(dArr[i11]);
        }
        return dArr2;
    }

    public static Float[] U(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            fArr2[i11] = Float.valueOf(fArr[i11]);
        }
        return fArr2;
    }

    public static Integer[] V(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        return numArr;
    }

    public static Long[] W(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            lArr[i11] = Long.valueOf(jArr[i11]);
        }
        return lArr;
    }

    public static List e(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new a(jArr);
    }

    public static List f(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List listA = u.a(objArr);
        Intrinsics.checkNotNullExpressionValue(listA, "asList(...)");
        return listA;
    }

    public static final int g(float[] fArr, float f11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return Arrays.binarySearch(fArr, i11, i12, f11);
    }

    public static /* synthetic */ int h(float[] fArr, float f11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = fArr.length;
        }
        return g(fArr, f11, i11, i12);
    }

    public static byte[] i(byte[] bArr, byte[] destination, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static char[] j(char[] cArr, char[] destination, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static float[] k(float[] fArr, float[] destination, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static int[] l(int[] iArr, int[] destination, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static long[] m(long[] jArr, long[] destination, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static Object[] n(Object[] objArr, Object[] destination, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static /* synthetic */ byte[] o(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = bArr.length;
        }
        return i(bArr, bArr2, i11, i12, i13);
    }

    public static /* synthetic */ float[] p(float[] fArr, float[] fArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = fArr.length;
        }
        return k(fArr, fArr2, i11, i12, i13);
    }

    public static /* synthetic */ int[] q(int[] iArr, int[] iArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = iArr.length;
        }
        return l(iArr, iArr2, i11, i12, i13);
    }

    public static /* synthetic */ long[] r(long[] jArr, long[] jArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = jArr.length;
        }
        return m(jArr, jArr2, i11, i12, i13);
    }

    public static /* synthetic */ Object[] s(Object[] objArr, Object[] objArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = objArr.length;
        }
        return n(objArr, objArr2, i11, i12, i13);
    }

    public static byte[] t(byte[] bArr, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        o.c(i12, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i11, i12);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static float[] u(float[] fArr, int i11, int i12) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        o.c(i12, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i11, i12);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static Object[] v(Object[] objArr, int i11, int i12) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        o.c(i12, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i11, i12);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void w(byte[] bArr, byte b11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i11, i12, b11);
    }

    public static final void x(int[] iArr, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i12, i13, i11);
    }

    public static void y(long[] jArr, long j11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i11, i12, j11);
    }

    public static void z(Object[] objArr, Object obj, int i11, int i12) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i11, i12, obj);
    }
}
