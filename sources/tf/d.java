package tf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum d implements a {
    MANUAL,
    COMPOSE,
    ACTIVITY,
    FRAGMENT;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f129908a = b.VIEW_SCOPE_INSTRUMENTATION_TYPE;

    d() {
    }

    @Override // tf.a
    public b getKey() {
        return this.f129908a;
    }
}
