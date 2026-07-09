package hd0;

import java.util.Random;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
enum g implements d {
    INSTANCE;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Supplier f100738b = sc0.r.a();

    @Override // hd0.d
    public String b() {
        long jNextLong;
        Random random = (Random) f100738b.get();
        do {
            jNextLong = random.nextLong();
        } while (jNextLong == 0);
        return mc0.m.a(jNextLong);
    }

    @Override // hd0.d
    public String c() {
        long jNextLong;
        Random random = (Random) f100738b.get();
        long jNextLong2 = random.nextLong();
        do {
            jNextLong = random.nextLong();
        } while (jNextLong == 0);
        return mc0.p.a(jNextLong2, jNextLong);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "RandomIdGenerator{}";
    }
}
