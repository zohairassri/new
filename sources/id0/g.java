package id0;

import io.opentelemetry.api.trace.StatusCode;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface g {
    static g a(StatusCode statusCode, String str) {
        if (str == null) {
            str = "";
        }
        return e.a(statusCode, str);
    }

    static g b() {
        return e.f103650b;
    }

    static g c() {
        return e.f103649a;
    }

    static g m() {
        return e.f103651c;
    }

    String getDescription();

    StatusCode getStatusCode();
}
