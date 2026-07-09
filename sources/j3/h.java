package j3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f104925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f104926b;

    public h(CharSequence charSequence, g gVar) {
        this.f104925a = charSequence;
        this.f104926b = gVar;
    }

    @Override // j3.d
    public int a(int i11) {
        do {
            i11 = this.f104926b.p(i11);
            if (i11 == -1 || i11 == this.f104925a.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f104925a.charAt(i11)));
        return i11;
    }

    @Override // j3.d
    public int b(int i11) {
        do {
            i11 = this.f104926b.q(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f104925a.charAt(i11)));
        return i11;
    }

    @Override // j3.d
    public int c(int i11) {
        do {
            i11 = this.f104926b.p(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f104925a.charAt(i11 - 1)));
        return i11;
    }

    @Override // j3.d
    public int d(int i11) {
        do {
            i11 = this.f104926b.q(i11);
            if (i11 == -1 || i11 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f104925a.charAt(i11 - 1)));
        return i11;
    }
}
