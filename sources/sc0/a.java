package sc0;

import java.util.Random;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
enum a implements Supplier {
    INSTANCE;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f126392b = new Random();

    @Override // java.util.function.Supplier
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Random get() {
        return f126392b;
    }
}
