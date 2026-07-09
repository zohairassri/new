package rq;

import rq.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f125069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f125070b = d.a.DEFAULT;

    /* JADX INFO: renamed from: rq.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class C1672a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f125071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f125072b;

        C1672a(int i11, d.a aVar) {
            this.f125071a = i11;
            this.f125072b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f125071a == dVar.tag() && this.f125072b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f125071a) + (this.f125072b.hashCode() ^ 2041407134);
        }

        @Override // rq.d
        public d.a intEncoding() {
            return this.f125072b;
        }

        @Override // rq.d
        public int tag() {
            return this.f125071a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f125071a + "intEncoding=" + this.f125072b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C1672a(this.f125069a, this.f125070b);
    }

    public a c(int i11) {
        this.f125069a = i11;
        return this;
    }
}
