package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pi extends q65 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Date f32957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Date f32958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f32959n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f32960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double f32961s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f32962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a75 f32963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f32964x;

    public pi() {
        super("mvhd");
        this.f32961s = 1.0d;
        this.f32962v = 1.0f;
        this.f32963w = a75.f23112j;
    }

    @Override // com.google.android.gms.internal.ads.o65
    public final void c(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f32957l = v65.a(li.d(byteBuffer));
            this.f32958m = v65.a(li.d(byteBuffer));
            this.f32959n = li.a(byteBuffer);
            this.f32960r = li.d(byteBuffer);
        } else {
            this.f32957l = v65.a(li.a(byteBuffer));
            this.f32958m = v65.a(li.a(byteBuffer));
            this.f32959n = li.a(byteBuffer);
            this.f32960r = li.a(byteBuffer);
        }
        this.f32961s = li.e(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f32962v = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        li.b(byteBuffer);
        li.a(byteBuffer);
        li.a(byteBuffer);
        this.f32963w = new a75(li.e(byteBuffer), li.e(byteBuffer), li.e(byteBuffer), li.e(byteBuffer), li.f(byteBuffer), li.f(byteBuffer), li.f(byteBuffer), li.e(byteBuffer), li.e(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f32964x = li.a(byteBuffer);
    }

    public final long g() {
        return this.f32959n;
    }

    public final long h() {
        return this.f32960r;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f32957l + ";modificationTime=" + this.f32958m + ";timescale=" + this.f32959n + ";duration=" + this.f32960r + ";rate=" + this.f32961s + ";volume=" + this.f32962v + ";matrix=" + this.f32963w + ";nextTrackId=" + this.f32964x + "]";
    }
}
