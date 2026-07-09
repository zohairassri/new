package ne0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public enum b implements Callable, yd0.o {
    INSTANCE;

    public static Callable b() {
        return INSTANCE;
    }

    public static yd0.o c() {
        return INSTANCE;
    }

    @Override // yd0.o
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List call() {
        return new ArrayList();
    }
}
