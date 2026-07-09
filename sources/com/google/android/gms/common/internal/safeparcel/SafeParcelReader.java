package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class SafeParcelReader {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb2.append(str);
            sb2.append(" Parcel: pos=");
            sb2.append(iDataPosition);
            sb2.append(" size=");
            sb2.append(iDataSize);
            super(sb2.toString());
        }
    }

    public static float A(Parcel parcel, int i11) {
        M(parcel, i11, 4);
        return parcel.readFloat();
    }

    public static Float B(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        if (iJ == 0) {
            return null;
        }
        N(parcel, i11, iJ, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int C(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder D(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iJ);
        return strongBinder;
    }

    public static int E(Parcel parcel, int i11) {
        M(parcel, i11, 4);
        return parcel.readInt();
    }

    public static Integer F(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        if (iJ == 0) {
            return null;
        }
        N(parcel, i11, iJ, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long G(Parcel parcel, int i11) {
        M(parcel, i11, 8);
        return parcel.readLong();
    }

    public static Long H(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        if (iJ == 0) {
            return null;
        }
        N(parcel, i11, iJ, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short I(Parcel parcel, int i11) {
        M(parcel, i11, 4);
        return (short) parcel.readInt();
    }

    public static int J(Parcel parcel, int i11) {
        return (i11 & (-65536)) != -65536 ? (char) (i11 >> 16) : parcel.readInt();
    }

    public static void K(Parcel parcel, int i11) {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i11));
    }

    public static int L(Parcel parcel) {
        int iC = C(parcel);
        int iJ = J(parcel, iC);
        int iV = v(iC);
        int iDataPosition = parcel.dataPosition();
        if (iV != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iC))), parcel);
        }
        int i11 = iJ + iDataPosition;
        if (i11 >= iDataPosition && i11 <= parcel.dataSize()) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i11).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i11);
        throw new ParseException(sb2.toString(), parcel);
    }

    private static void M(Parcel parcel, int i11, int i12) {
        int iJ = J(parcel, i11);
        if (iJ == i12) {
            return;
        }
        String hexString = Integer.toHexString(iJ);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(iJ).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(iJ);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new ParseException(sb2.toString(), parcel);
    }

    private static void N(Parcel parcel, int i11, int i12, int i13) {
        if (i12 == i13) {
            return;
        }
        String hexString = Integer.toHexString(i12);
        int length = String.valueOf(i13).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i12).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i13);
        sb2.append(" got ");
        sb2.append(i12);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new ParseException(sb2.toString(), parcel);
    }

    public static BigDecimal a(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i12 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iJ);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i12);
    }

    public static BigDecimal[] b(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        int i12 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i13] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return new BigInteger(bArrCreateByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        int i12 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bigIntegerArr[i13] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return zArrCreateBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iJ);
        return bundle;
    }

    public static byte[] g(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return bArrCreateByteArray;
    }

    public static double[] h(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return dArrCreateDoubleArray;
    }

    public static float[] i(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return fArrCreateFloatArray;
    }

    public static int[] j(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return iArrCreateIntArray;
    }

    public static ArrayList k(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = parcel.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayList;
    }

    public static long[] l(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return jArrCreateLongArray;
    }

    public static Parcel m(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, iJ);
        parcel.setDataPosition(iDataPosition + iJ);
        return parcelObtain;
    }

    public static Parcel[] n(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        int i12 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = parcel.readInt();
            if (i14 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i14);
                parcelArr[i13] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i14);
            } else {
                parcelArr[i13] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return parcelArr;
    }

    public static Parcelable o(Parcel parcel, int i11, Parcelable.Creator creator) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iJ);
        return parcelable;
    }

    public static String p(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iJ);
        return string;
    }

    public static String[] q(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return strArrCreateStringArray;
    }

    public static ArrayList r(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateStringArrayList;
    }

    public static Object[] s(Parcel parcel, int i11, Parcelable.Creator creator) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return objArrCreateTypedArray;
    }

    public static ArrayList t(Parcel parcel, int i11, Parcelable.Creator creator) {
        int iJ = J(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateTypedArrayList;
    }

    public static void u(Parcel parcel, int i11) {
        if (parcel.dataPosition() == i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i11);
        throw new ParseException(sb2.toString(), parcel);
    }

    public static int v(int i11) {
        return (char) i11;
    }

    public static boolean w(Parcel parcel, int i11) {
        M(parcel, i11, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean x(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        if (iJ == 0) {
            return null;
        }
        N(parcel, i11, iJ, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double y(Parcel parcel, int i11) {
        M(parcel, i11, 8);
        return parcel.readDouble();
    }

    public static Double z(Parcel parcel, int i11) {
        int iJ = J(parcel, i11);
        if (iJ == 0) {
            return null;
        }
        N(parcel, i11, iJ, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
