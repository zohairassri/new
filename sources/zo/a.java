package zo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a f142452a = new a();

    private a() {
    }

    static l e() {
        return f142452a;
    }

    private Object readResolve() {
        return f142452a;
    }

    @Override // zo.l
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // zo.l
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
