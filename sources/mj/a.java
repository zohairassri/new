package mj;

import java.util.Arrays;
import mj.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f116353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f116354b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable f116355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f116356b;

        b() {
        }

        @Override // mj.f.a
        public f a() {
            String str = "";
            if (this.f116355a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f116355a, this.f116356b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // mj.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f116355a = iterable;
            return this;
        }

        @Override // mj.f.a
        public f.a c(byte[] bArr) {
            this.f116356b = bArr;
            return this;
        }
    }

    @Override // mj.f
    public Iterable b() {
        return this.f116353a;
    }

    @Override // mj.f
    public byte[] c() {
        return this.f116354b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f116353a.equals(fVar.b())) {
                if (Arrays.equals(this.f116354b, fVar instanceof a ? ((a) fVar).f116354b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f116354b) ^ ((this.f116353a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f116353a + ", extras=" + Arrays.toString(this.f116354b) + "}";
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f116353a = iterable;
        this.f116354b = bArr;
    }
}
