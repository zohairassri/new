package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f18946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f18947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f18948c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f18947b = contentResolver;
        this.f18946a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f18948c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public ed.a d() {
        return ed.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object objF = f(this.f18946a, this.f18947b);
            this.f18948c = objF;
            aVar.f(objF);
        } catch (FileNotFoundException e11) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.c(e11);
        }
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
