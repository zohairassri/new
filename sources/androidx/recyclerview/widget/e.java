package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final n f12097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12098b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f12099c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f12100d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f12101e = null;

    public e(n nVar) {
        this.f12097a = nVar;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(int i11, int i12) {
        int i13;
        if (this.f12098b == 1 && i11 >= (i13 = this.f12099c)) {
            int i14 = this.f12100d;
            if (i11 <= i13 + i14) {
                this.f12100d = i14 + i12;
                this.f12099c = Math.min(i11, i13);
                return;
            }
        }
        e();
        this.f12099c = i11;
        this.f12100d = i12;
        this.f12098b = 1;
    }

    @Override // androidx.recyclerview.widget.n
    public void b(int i11, int i12) {
        int i13;
        if (this.f12098b == 2 && (i13 = this.f12099c) >= i11 && i13 <= i11 + i12) {
            this.f12100d += i12;
            this.f12099c = i11;
        } else {
            e();
            this.f12099c = i11;
            this.f12100d = i12;
            this.f12098b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.n
    public void c(int i11, int i12, Object obj) {
        int i13;
        if (this.f12098b == 3) {
            int i14 = this.f12099c;
            int i15 = this.f12100d;
            if (i11 <= i14 + i15 && (i13 = i11 + i12) >= i14 && this.f12101e == obj) {
                this.f12099c = Math.min(i11, i14);
                this.f12100d = Math.max(i15 + i14, i13) - this.f12099c;
                return;
            }
        }
        e();
        this.f12099c = i11;
        this.f12100d = i12;
        this.f12101e = obj;
        this.f12098b = 3;
    }

    @Override // androidx.recyclerview.widget.n
    public void d(int i11, int i12) {
        e();
        this.f12097a.d(i11, i12);
    }

    public void e() {
        int i11 = this.f12098b;
        if (i11 == 0) {
            return;
        }
        if (i11 == 1) {
            this.f12097a.a(this.f12099c, this.f12100d);
        } else if (i11 == 2) {
            this.f12097a.b(this.f12099c, this.f12100d);
        } else if (i11 == 3) {
            this.f12097a.c(this.f12099c, this.f12100d, this.f12101e);
        }
        this.f12101e = null;
        this.f12098b = 0;
    }
}
