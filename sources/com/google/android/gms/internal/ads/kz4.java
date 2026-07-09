package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class kz4 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f29928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f29929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29930c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f29933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f29934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f29936i;

    kz4(Iterable iterable) {
        this.f29928a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f29930c++;
        }
        this.f29931d = -1;
        if (a()) {
            return;
        }
        this.f29929b = jz4.f29318c;
        this.f29932e = 0;
        this.f29936i = 0L;
    }

    private final boolean a() {
        ByteBuffer byteBuffer;
        do {
            this.f29931d++;
            if (!this.f29928a.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.f29928a.next();
            this.f29929b = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f29932e = this.f29929b.position();
        if (this.f29929b.hasArray()) {
            this.f29933f = true;
            this.f29934g = this.f29929b.array();
            this.f29935h = this.f29929b.arrayOffset();
        } else {
            this.f29933f = false;
            this.f29936i = k15.y(this.f29929b);
            this.f29934g = null;
        }
        return true;
    }

    private final void c(int i11) {
        int i12 = this.f29932e + i11;
        this.f29932e = i12;
        if (i12 == this.f29929b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f29931d == this.f29930c) {
            return -1;
        }
        if (this.f29933f) {
            int i11 = this.f29934g[this.f29932e + this.f29935h] & 255;
            c(1);
            return i11;
        }
        int iX = k15.x(((long) this.f29932e) + this.f29936i) & 255;
        c(1);
        return iX;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        if (this.f29931d == this.f29930c) {
            return -1;
        }
        int iLimit = this.f29929b.limit();
        int i13 = this.f29932e;
        int i14 = iLimit - i13;
        if (i12 > i14) {
            i12 = i14;
        }
        if (this.f29933f) {
            System.arraycopy(this.f29934g, i13 + this.f29935h, bArr, i11, i12);
            c(i12);
            return i12;
        }
        int iPosition = this.f29929b.position();
        this.f29929b.position(this.f29932e);
        this.f29929b.get(bArr, i11, i12);
        this.f29929b.position(iPosition);
        c(i12);
        return i12;
    }
}
