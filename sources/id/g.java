package id;

import id.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class g extends zd.h implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.a f103623e;

    public g(long j11) {
        super(j11);
    }

    @Override // id.h
    public void a(int i11) {
        if (i11 >= 40) {
            b();
        } else if (i11 >= 20 || i11 == 15) {
            m(h() / 2);
        }
    }

    @Override // id.h
    public /* bridge */ /* synthetic */ gd.c c(ed.e eVar) {
        return (gd.c) super.l(eVar);
    }

    @Override // id.h
    public /* bridge */ /* synthetic */ gd.c d(ed.e eVar, gd.c cVar) {
        return (gd.c) super.k(eVar, cVar);
    }

    @Override // id.h
    public void e(h.a aVar) {
        this.f103623e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zd.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(gd.c cVar) {
        return cVar == null ? super.i(null) : cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zd.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(ed.e eVar, gd.c cVar) {
        h.a aVar = this.f103623e;
        if (aVar == null || cVar == null) {
            return;
        }
        aVar.c(cVar);
    }
}
