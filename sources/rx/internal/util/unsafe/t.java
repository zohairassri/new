package rx.internal.util.unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class t extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Integer f125292g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f125293f;

    public t(int i11) {
        super(i11);
        this.f125293f = Math.min(i11 / 4, f125292g.intValue());
    }
}
