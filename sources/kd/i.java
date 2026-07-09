package kd;

import java.util.Collections;
import java.util.Map;
import kd.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f110542a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f110543b = new k.a().a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements i {
        a() {
        }

        @Override // kd.i
        public Map getHeaders() {
            return Collections.EMPTY_MAP;
        }
    }

    Map getHeaders();
}
