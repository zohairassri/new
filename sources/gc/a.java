package gc;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class a {
    private static List a(Throwable th2) {
        LinkedList linkedList = new LinkedList();
        for (Throwable cause = th2.getCause(); cause != null && !linkedList.contains(cause); cause = cause.getCause()) {
            linkedList.add(cause);
        }
        return linkedList;
    }

    private static Throwable b(List list) {
        if (list.size() == 0) {
            return new RuntimeException("Empty list of causes");
        }
        String str = "caused by " + ((Throwable) list.get(list.size() - 1)).getLocalizedMessage();
        int size = list.size() - 1;
        Throwable th2 = null;
        while (size >= 0) {
            th2 = size == list.size() + (-1) ? new Throwable(str, th2) : new Throwable(((Throwable) list.get(size)).getMessage(), th2);
            if (((Throwable) list.get(size)).getStackTrace() != null) {
                th2.setStackTrace(((Throwable) list.get(size)).getStackTrace());
            }
            size--;
        }
        return th2;
    }

    static Throwable c(Throwable th2, Throwable th3) {
        List listA = a(th2);
        listA.add(th3);
        return b(listA);
    }
}
