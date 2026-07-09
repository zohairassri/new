package qo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f122887c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile g f122888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f122889b = f122887c;

    private e(g gVar) {
        this.f122888a = gVar;
    }

    public static g a(g gVar) {
        gVar.getClass();
        return gVar instanceof e ? gVar : new e(gVar);
    }

    @Override // qo.g
    public final Object zza() {
        Object objZza;
        Object obj = this.f122889b;
        Object obj2 = f122887c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f122889b;
                if (objZza == obj2) {
                    objZza = this.f122888a.zza();
                    Object obj3 = this.f122889b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f122889b = objZza;
                    this.f122888a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objZza;
    }
}
