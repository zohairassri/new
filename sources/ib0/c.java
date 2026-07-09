package ib0;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer f103561a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f103562b = Pattern.compile("[A-Za-z0-9-._~:/\\[\\]@!$&'()*+,;=]+");

    public static String a(v vVar) {
        return b(vVar, vVar.c("x-emb-path"));
    }

    public static String b(v vVar, String str) {
        if (str != null) {
            try {
                if (c(str).booleanValue()) {
                    return vVar.a(str);
                }
            } catch (Exception unused) {
                return vVar.b();
            }
        }
        return vVar.b();
    }

    private static Boolean c(String str) {
        return str == null ? Boolean.FALSE : str.isEmpty() ? Boolean.FALSE : str.length() > f103561a.intValue() ? Boolean.FALSE : !StandardCharsets.US_ASCII.newEncoder().canEncode(str) ? Boolean.FALSE : !str.startsWith("/") ? Boolean.FALSE : !f103562b.matcher(str).matches() ? Boolean.FALSE : Boolean.TRUE;
    }
}
