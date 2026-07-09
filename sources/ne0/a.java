package ne0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f117792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f117793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f117794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f117795d;

    /* JADX INFO: renamed from: ne0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC1492a extends yd0.q {
        @Override // yd0.q
        boolean test(Object obj);
    }

    public a(int i11) {
        this.f117792a = i11;
        Object[] objArr = new Object[i11 + 1];
        this.f117793b = objArr;
        this.f117794c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(sd0.t r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r3.f117793b
            int r3 = r3.f117792a
        L4:
            r1 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r1 >= r3) goto L19
            r2 = r0[r1]
            if (r2 != 0) goto Le
            goto L19
        Le:
            boolean r2 = ne0.m.b(r2, r4)
            if (r2 == 0) goto L16
            r3 = 1
            return r3
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ne0.a.a(sd0.t):boolean");
    }

    public void b(Object obj) {
        int i11 = this.f117792a;
        int i12 = this.f117795d;
        if (i12 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.f117794c[i11] = objArr;
            this.f117794c = objArr;
            i12 = 0;
        }
        this.f117794c[i12] = obj;
        this.f117795d = i12 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(ne0.a.InterfaceC1492a r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r3.f117793b
            int r3 = r3.f117792a
        L4:
            if (r0 == 0) goto L1d
            r1 = 0
        L7:
            if (r1 >= r3) goto L18
            r2 = r0[r1]
            if (r2 != 0) goto Le
            goto L18
        Le:
            boolean r2 = r4.test(r2)
            if (r2 == 0) goto L15
            goto L1d
        L15:
            int r1 = r1 + 1
            goto L7
        L18:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ne0.a.c(ne0.a$a):void");
    }

    public void d(Object obj) {
        this.f117793b[0] = obj;
    }
}
