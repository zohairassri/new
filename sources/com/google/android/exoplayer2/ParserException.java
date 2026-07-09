package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20044b;

    protected ParserException(String str, Throwable th2, boolean z11, int i11) {
        super(str, th2);
        this.f20043a = z11;
        this.f20044b = i11;
    }

    public static ParserException a(String str, Throwable th2) {
        return new ParserException(str, th2, true, 1);
    }

    public static ParserException b(String str, Throwable th2) {
        return new ParserException(str, th2, true, 0);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, false, 1);
    }
}
