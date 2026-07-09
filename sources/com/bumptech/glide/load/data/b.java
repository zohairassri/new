package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f18923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f18924c;

    public b(AssetManager assetManager, String str) {
        this.f18923b = assetManager;
        this.f18922a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f18924c;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public ed.a d() {
        return ed.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object objF = f(this.f18923b, this.f18922a);
            this.f18924c = objF;
            aVar.f(objF);
        } catch (IOException e11) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e11);
        }
    }

    protected abstract Object f(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
