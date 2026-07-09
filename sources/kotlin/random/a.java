package kotlin.random;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends c {
    @Override // kotlin.random.c
    public int b(int i11) {
        return d.e(h().nextInt(), i11);
    }

    @Override // kotlin.random.c
    public float c() {
        return h().nextFloat();
    }

    @Override // kotlin.random.c
    public int d() {
        return h().nextInt();
    }

    @Override // kotlin.random.c
    public int e(int i11) {
        return h().nextInt(i11);
    }

    @Override // kotlin.random.c
    public long g() {
        return h().nextLong();
    }

    public abstract Random h();
}
