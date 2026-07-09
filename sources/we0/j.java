package we0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements m, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f135180a;

    public j(Object obj) {
        this.f135180a = obj;
    }

    @Override // we0.m
    public Object getValue() {
        return this.f135180a;
    }

    @Override // we0.m
    public boolean p() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
