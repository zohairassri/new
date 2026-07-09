package lq;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f114773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d[] f114774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f114775c;

    public a(int i11, d... dVarArr) {
        this.f114773a = i11;
        this.f114774b = dVarArr;
        this.f114775c = new b(i11);
    }

    @Override // lq.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f114773a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f114774b) {
            if (stackTraceElementArrA.length <= this.f114773a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f114773a ? this.f114775c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
