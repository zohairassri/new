package ub;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class e extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final zb.d f131216i;

    public e(List list) {
        super(list);
        int iMax = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            zb.d dVar = (zb.d) ((fc.a) list.get(i11)).f94130b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f131216i = new zb.d(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ub.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public zb.d i(fc.a aVar, float f11) {
        this.f131216i.g((zb.d) aVar.f94130b, (zb.d) aVar.f94131c, f11);
        return this.f131216i;
    }
}
