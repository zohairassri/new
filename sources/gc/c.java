package gc;

import com.akaita.java.rxjava2debug.extensions.RxJavaAssemblyException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f98471a = Pattern.compile("^at (.*)\\.(.*)\\((.*):([0-9]+)\\)$");

    static StackTraceElement[] a(RxJavaAssemblyException rxJavaAssemblyException, String[] strArr) {
        StackTraceElement stackTraceElementB;
        String[] strArrSplit = rxJavaAssemblyException.e().split("\\n\\r|\\r\\n|\\n|\\r");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (String str : strArrSplit) {
            z11 = z11 || strArr == null || strArr.length == 0 || c(str, strArr);
            if (z11 && (stackTraceElementB = b(str)) != null) {
                arrayList.add(stackTraceElementB);
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    private static StackTraceElement b(String str) {
        Matcher matcher = f98471a.matcher(str);
        if (matcher.matches()) {
            return new StackTraceElement(matcher.group(1), matcher.group(2), matcher.group(3), Integer.valueOf(matcher.group(4)).intValue());
        }
        return null;
    }

    static boolean c(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.startsWith("at " + str2) || str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
