package lq;

import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f114780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f114781d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f114778a = str;
        this.f114779b = str2;
        this.f114780c = stackTraceElementArr;
        this.f114781d = eVar;
    }

    public static e a(Throwable th2, d dVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), dVar.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }
}
