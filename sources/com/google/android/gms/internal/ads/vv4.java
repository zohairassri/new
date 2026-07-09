package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vv4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vv4 f37043d = new vv4("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37046c;

    static {
        new vv4("\n", "  ", true);
    }

    private vv4(String str, String str2, boolean z11) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f37044a = str;
        this.f37045b = str2;
        this.f37046c = z11;
    }

    public final String a() {
        return this.f37044a;
    }

    public final String b() {
        return this.f37045b;
    }

    public final boolean c() {
        return this.f37046c;
    }
}
