package pp;

import com.google.crypto.tink.shaded.protobuf.y;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public enum i0 implements y.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final y.b f121690h = new y.b() { // from class: pp.i0.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121692a;

    i0(int i11) {
        this.f121692a = i11;
    }

    public static i0 a(int i11) {
        if (i11 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i11 == 1) {
            return TINK;
        }
        if (i11 == 2) {
            return LEGACY;
        }
        if (i11 == 3) {
            return RAW;
        }
        if (i11 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f121692a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
