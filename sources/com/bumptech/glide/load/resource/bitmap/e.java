package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class e implements gd.c, gd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f19197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hd.d f19198b;

    public e(Bitmap bitmap, hd.d dVar) {
        this.f19197a = (Bitmap) zd.k.e(bitmap, "Bitmap must not be null");
        this.f19198b = (hd.d) zd.k.e(dVar, "BitmapPool must not be null");
    }

    public static e e(Bitmap bitmap, hd.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // gd.c
    public int a() {
        return zd.l.i(this.f19197a);
    }

    @Override // gd.c
    public void b() {
        this.f19198b.c(this.f19197a);
    }

    @Override // gd.c
    public Class c() {
        return Bitmap.class;
    }

    @Override // gd.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f19197a;
    }

    @Override // gd.b
    public void initialize() {
        this.f19197a.prepareToDraw();
    }
}
