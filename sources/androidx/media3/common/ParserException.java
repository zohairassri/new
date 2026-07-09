package androidx.media3.common;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8750b;

    protected ParserException(String str, Throwable th2, boolean z11, int i11) {
        super(str, th2);
        this.f8749a = z11;
        this.f8750b = i11;
    }

    public static ParserException a(String str, Throwable th2) {
        return new ParserException(str, th2, true, 1);
    }

    public static ParserException b(String str, Throwable th2) {
        return new ParserException(str, th2, true, 0);
    }

    public static ParserException c(String str, Throwable th2) {
        return new ParserException(str, th2, true, 4);
    }

    public static ParserException d(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f8749a);
        sb2.append(", dataType=");
        sb2.append(this.f8750b);
        sb2.append("}");
        return sb2.toString();
    }
}
