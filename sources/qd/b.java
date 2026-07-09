package qd;

import android.graphics.Bitmap;
import cd.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements a.InterfaceC0273a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hd.d f122643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hd.b f122644b;

    public b(hd.d dVar, hd.b bVar) {
        this.f122643a = dVar;
        this.f122644b = bVar;
    }

    @Override // cd.a.InterfaceC0273a
    public void a(Bitmap bitmap) {
        this.f122643a.c(bitmap);
    }

    @Override // cd.a.InterfaceC0273a
    public byte[] b(int i11) {
        hd.b bVar = this.f122644b;
        return bVar == null ? new byte[i11] : (byte[]) bVar.c(i11, byte[].class);
    }

    @Override // cd.a.InterfaceC0273a
    public Bitmap c(int i11, int i12, Bitmap.Config config) {
        return this.f122643a.e(i11, i12, config);
    }

    @Override // cd.a.InterfaceC0273a
    public int[] d(int i11) {
        hd.b bVar = this.f122644b;
        return bVar == null ? new int[i11] : (int[]) bVar.c(i11, int[].class);
    }

    @Override // cd.a.InterfaceC0273a
    public void e(byte[] bArr) {
        hd.b bVar = this.f122644b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // cd.a.InterfaceC0273a
    public void f(int[] iArr) {
        hd.b bVar = this.f122644b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
