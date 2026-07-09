package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class HttpException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18907a;

    public HttpException(int i11) {
        this("Http request failed", i11);
    }

    public HttpException(String str, int i11) {
        this(str, i11, null);
    }

    public HttpException(String str, int i11, Throwable th2) {
        super(str + ", status code: " + i11, th2);
        this.f18907a = i11;
    }
}
