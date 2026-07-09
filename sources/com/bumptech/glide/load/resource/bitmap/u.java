package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class u implements gd.c, gd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f19252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gd.c f19253b;

    private u(Resources resources, gd.c cVar) {
        this.f19252a = (Resources) zd.k.d(resources);
        this.f19253b = (gd.c) zd.k.d(cVar);
    }

    public static gd.c e(Resources resources, gd.c cVar) {
        if (cVar == null) {
            return null;
        }
        return new u(resources, cVar);
    }

    @Override // gd.c
    public int a() {
        return this.f19253b.a();
    }

    @Override // gd.c
    public void b() {
        this.f19253b.b();
    }

    @Override // gd.c
    public Class c() {
        return BitmapDrawable.class;
    }

    @Override // gd.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f19252a, (Bitmap) this.f19253b.get());
    }

    @Override // gd.b
    public void initialize() {
        gd.c cVar = this.f19253b;
        if (cVar instanceof gd.b) {
            ((gd.b) cVar).initialize();
        }
    }
}
