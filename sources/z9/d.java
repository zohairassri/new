package z9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e[] f141970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f141971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f141972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f141973d;

    public d(String str, e[] eVarArr) {
        this.f141971b = str;
        this.f141972c = null;
        this.f141970a = eVarArr;
        this.f141973d = 0;
    }

    private void a(int i11) {
        if (i11 == this.f141973d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f141973d) + " expected, but got " + c(i11));
    }

    private String c(int i11) {
        return i11 != 0 ? i11 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public String b() {
        a(0);
        return this.f141971b;
    }

    public d(byte[] bArr, e[] eVarArr) {
        Objects.requireNonNull(bArr);
        this.f141972c = bArr;
        this.f141971b = null;
        this.f141970a = eVarArr;
        this.f141973d = 1;
    }
}
