package cd;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f17524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f17525c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f17523a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17526d = 0;

    private boolean b() {
        return this.f17525c.f17511b != 0;
    }

    private int d() {
        try {
            return this.f17524b.get() & 255;
        } catch (Exception unused) {
            this.f17525c.f17511b = 1;
            return 0;
        }
    }

    private void e() {
        this.f17525c.f17513d.f17499a = n();
        this.f17525c.f17513d.f17500b = n();
        this.f17525c.f17513d.f17501c = n();
        this.f17525c.f17513d.f17502d = n();
        int iD = d();
        boolean z11 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f17525c.f17513d;
        bVar.f17503e = (iD & 64) != 0;
        if (z11) {
            bVar.f17509k = g(iPow);
        } else {
            bVar.f17509k = null;
        }
        this.f17525c.f17513d.f17508j = this.f17524b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f17525c;
        cVar.f17512c++;
        cVar.f17514e.add(cVar.f17513d);
    }

    private void f() {
        int iD = d();
        this.f17526d = iD;
        if (iD <= 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            try {
                int i12 = this.f17526d;
                if (i11 >= i12) {
                    return;
                }
                int i13 = i12 - i11;
                this.f17524b.get(this.f17523a, i11, i13);
                i11 += i13;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f17525c.f17511b = 1;
                return;
            }
        }
    }

    private int[] g(int i11) {
        byte[] bArr = new byte[i11 * 3];
        int[] iArr = null;
        try {
            this.f17524b.get(bArr);
            iArr = new int[256];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = bArr[i13] & 255;
                int i15 = i13 + 2;
                int i16 = bArr[i13 + 1] & 255;
                i13 += 3;
                int i17 = i12 + 1;
                iArr[i12] = (i16 << 8) | (i14 << 16) | (-16777216) | (bArr[i15] & 255);
                i12 = i17;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f17525c.f17511b = 1;
            return iArr;
        }
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i11) {
        boolean z11 = false;
        while (!z11 && !b() && this.f17525c.f17512c <= i11) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f17525c.f17513d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < 11; i12++) {
                        sb2.append((char) this.f17523a[i12]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f17525c;
                if (cVar.f17513d == null) {
                    cVar.f17513d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f17525c.f17511b = 1;
            } else {
                z11 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f17525c.f17513d;
        int i11 = (iD & 28) >> 2;
        bVar.f17505g = i11;
        if (i11 == 0) {
            bVar.f17505g = 1;
        }
        bVar.f17504f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f17525c.f17513d;
        bVar2.f17507i = iN * 10;
        bVar2.f17506h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 6; i11++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f17525c.f17511b = 1;
            return;
        }
        l();
        if (!this.f17525c.f17517h || b()) {
            return;
        }
        c cVar = this.f17525c;
        cVar.f17510a = g(cVar.f17518i);
        c cVar2 = this.f17525c;
        cVar2.f17521l = cVar2.f17510a[cVar2.f17519j];
    }

    private void l() {
        this.f17525c.f17515f = n();
        this.f17525c.f17516g = n();
        int iD = d();
        c cVar = this.f17525c;
        cVar.f17517h = (iD & 128) != 0;
        cVar.f17518i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f17525c.f17519j = d();
        this.f17525c.f17520k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f17523a;
            if (bArr[0] == 1) {
                this.f17525c.f17522m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f17526d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f17524b.getShort();
    }

    private void o() {
        this.f17524b = null;
        Arrays.fill(this.f17523a, (byte) 0);
        this.f17525c = new c();
        this.f17526d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f17524b.position(Math.min(this.f17524b.position() + iD, this.f17524b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f17524b = null;
        this.f17525c = null;
    }

    public c c() {
        if (this.f17524b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f17525c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f17525c;
            if (cVar.f17512c < 0) {
                cVar.f17511b = 1;
            }
        }
        return this.f17525c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f17524b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f17524b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
