package x8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f137239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.navigation.b f137240b;

    public d(String name, androidx.navigation.b argument) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f137239a = name;
        this.f137240b = argument;
    }

    public final String a() {
        return this.f137239a;
    }

    public final androidx.navigation.b b() {
        return this.f137240b;
    }

    public final androidx.navigation.b c() {
        return this.f137240b;
    }

    public final String d() {
        return this.f137239a;
    }
}
