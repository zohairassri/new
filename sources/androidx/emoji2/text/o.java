package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f7970d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f7972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f7973c = 0;

    o(m mVar, int i11) {
        this.f7972b = mVar;
        this.f7971a = i11;
    }

    private r5.a g() {
        ThreadLocal threadLocal = f7970d;
        r5.a aVar = (r5.a) threadLocal.get();
        if (aVar == null) {
            aVar = new r5.a();
            threadLocal.set(aVar);
        }
        this.f7972b.d().j(aVar, this.f7971a);
        return aVar;
    }

    public void a(Canvas canvas, float f11, float f12, Paint paint) {
        Typeface typefaceG = this.f7972b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f7972b.c(), this.f7971a * 2, 2, f11, f12, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i11) {
        return g().h(i11);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f7973c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f7973c & 4) > 0;
    }

    public void l(boolean z11) {
        int iD = d();
        if (z11) {
            this.f7973c = iD | 4;
        } else {
            this.f7973c = iD;
        }
    }

    public void m(boolean z11) {
        int i11 = this.f7973c & 4;
        this.f7973c = z11 ? i11 | 2 : i11 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i11 = 0; i11 < iC; i11++) {
            sb2.append(Integer.toHexString(b(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
