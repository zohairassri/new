package hn;

import com.amazonaws.services.s3.internal.Constants;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class t {
    public static String a(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i11 = 0;
        int i12 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(b(objArr[i11]));
            i12 = iIndexOf + 2;
            i11++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i11 < length) {
            String str2 = " [";
            while (i11 < objArr.length) {
                sb2.append(str2);
                sb2.append(b(objArr[i11]));
                i11++;
                str2 = ", ";
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
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb2.append(name);
            sb2.append("@");
            sb2.append(hexString);
            String string = sb2.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable) e11);
            String name2 = e11.getClass().getName();
            StringBuilder sb3 = new StringBuilder(string.length() + 8 + name2.length() + 1);
            sb3.append("<");
            sb3.append(string);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
