package vi;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class e extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BigInteger f133175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BigInteger f133176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f133177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f133178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f133179g;

    public e(BigInteger bigInteger, BigInteger bigInteger2, int i11, String str, Map map, Map map2) {
        super(str, map2);
        this.f133179g = new AtomicBoolean(false);
        this.f133175c = bigInteger;
        this.f133176d = bigInteger2;
        this.f133177e = i11;
        this.f133178f = map;
    }

    public Map e() {
        return this.f133178f;
    }

    public int f() {
        return this.f133177e;
    }

    public BigInteger g() {
        return this.f133176d;
    }

    public BigInteger h() {
        return this.f133175c;
    }

    public void i() {
        this.f133179g.set(true);
    }
}
