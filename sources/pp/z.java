package pp;

import com.google.crypto.tink.shaded.protobuf.y;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public enum z implements y.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final y.b f121735g = new y.b() { // from class: pp.z.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121737a;

    z(int i11) {
        this.f121737a = i11;
    }

    public static z a(int i11) {
        if (i11 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i11 == 1) {
            return ENABLED;
        }
        if (i11 == 2) {
            return DISABLED;
        }
        if (i11 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f121737a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
