package com.google.gson;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f47093d = new d("", "", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f47094e = new d("\n", "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f47097c;

    private d(String str, String str2, boolean z11) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f47095a = str;
        this.f47096b = str2;
        this.f47097c = z11;
    }

    public String a() {
        return this.f47096b;
    }

    public String b() {
        return this.f47095a;
    }

    public boolean c() {
        return this.f47097c;
    }
}
