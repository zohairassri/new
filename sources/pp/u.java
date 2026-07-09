package pp;

import com.google.crypto.tink.shaded.protobuf.y;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public enum u implements y.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final y.b f121714i = new y.b() { // from class: pp.u.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121716a;

    u(int i11) {
        this.f121716a = i11;
    }

    public static u a(int i11) {
        if (i11 == 0) {
            return UNKNOWN_HASH;
        }
        if (i11 == 1) {
            return SHA1;
        }
        if (i11 == 2) {
            return SHA384;
        }
        if (i11 == 3) {
            return SHA256;
        }
        if (i11 == 4) {
            return SHA512;
        }
        if (i11 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f121716a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
