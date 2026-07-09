package tw;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f130458a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final URL f130459b = new URL("https://avatar.nytimes.com");

    private c() {
    }

    public final String a(String icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return f130459b.toExternalForm() + icon;
    }
}
