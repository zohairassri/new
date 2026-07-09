package kd0;

import sc0.u;
import sc0.w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f110610a = new a(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f110611b = new a(false);

    b() {
    }

    public static w a() {
        return u.builder();
    }

    public static b b() {
        return f110610a;
    }

    public abstract boolean c();
}
