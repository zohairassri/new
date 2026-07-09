package zo;

import com.amazonaws.services.s3.internal.Constants;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class t {
    public static String a(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i11 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i12 = 0; i12 < objArr.length; i12++) {
                objArr[i12] = b(objArr[i12]);
            }
        }
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i13 = 0;
        while (i11 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i13)) != -1) {
            sb2.append((CharSequence) strValueOf, i13, iIndexOf);
            sb2.append(objArr[i11]);
            i13 = iIndexOf + 2;
            i11++;
        }
        sb2.append((CharSequence) strValueOf, i13, strValueOf.length());
        if (i11 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i11]);
            for (int i14 = i11 + 1; i14 < objArr.length; i14++) {
                sb2.append(", ");
                sb2.append(objArr[i14]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    private static String b(Object obj) {
        if (obj == null) {
            return Constants.NULL_VERSION_ID;
        }
        try {
            return obj.toString();
        } catch (Exception e11) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e11);
            return "<" + str + " threw " + e11.getClass().getName() + ">";
        }
    }

    public static String c(String str) {
        return n.b(str);
    }
}
