package xb;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f137325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f137326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f137327c;

    public h(String str, float f11, float f12) {
        this.f137325a = str;
        this.f137327c = f12;
        this.f137326b = f11;
    }

    public boolean a(String str) {
        if (this.f137325a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f137325a.endsWith("\r")) {
            String str2 = this.f137325a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
