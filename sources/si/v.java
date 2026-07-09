package si;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class v extends BigInteger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f126994a;

    public v(String str, int i11) {
        super(str, i11);
    }

    @Override // java.math.BigInteger
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.math.BigInteger
    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.math.BigInteger
    public String toString() {
        if (this.f126994a == null) {
            this.f126994a = super.toString();
        }
        return this.f126994a;
    }

    public v(int i11, Random random) {
        super(i11, random);
    }
}
