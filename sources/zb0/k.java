package zb0;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f142223a = new k();

    private k() {
    }

    public static final String a(String str) {
        if (str == null) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        for (char c11 : charArray) {
            if (c11 != '-') {
                if (c11 == ' ') {
                    sb2.append('0');
                } else if (c11 == 'a') {
                    sb2.append('A');
                } else if (c11 == 'b') {
                    sb2.append('B');
                } else if (c11 == 'c') {
                    sb2.append('C');
                } else if (c11 == 'd') {
                    sb2.append('D');
                } else if (c11 == 'e') {
                    sb2.append('E');
                } else if (c11 == 'f') {
                    sb2.append('F');
                } else {
                    sb2.append(c11);
                }
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String b(String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return a(str);
    }
}
