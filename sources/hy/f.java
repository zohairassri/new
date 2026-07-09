package hy;

import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public interface f {
    String a();

    String getToken();

    default boolean isValid() {
        String token;
        String strA = a();
        return (strA != null && (StringsKt.u0(strA) ^ true)) || ((token = getToken()) != null && (StringsKt.u0(token) ^ true));
    }
}
