package androidx.constraintlayout.core.parser;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6333c;

    public String a() {
        return this.f6331a + " (" + this.f6333c + " at line " + this.f6332b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
