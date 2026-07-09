package yd;

import ed.e;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f140340b = new a();

    private a() {
    }

    public static a c() {
        return f140340b;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // ed.e
    public void a(MessageDigest messageDigest) {
    }
}
