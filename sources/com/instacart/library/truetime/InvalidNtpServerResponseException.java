package com.instacart.library.truetime;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class InvalidNtpServerResponseException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f47594c;

    InvalidNtpServerResponseException(String str) {
        super(str);
        this.f47592a = "na";
        this.f47593b = 0.0f;
        this.f47594c = 0.0f;
    }

    InvalidNtpServerResponseException(String str, String str2, float f11, float f12) {
        super(String.format(Locale.getDefault(), str, str2, Float.valueOf(f11), Float.valueOf(f12)));
        this.f47592a = str2;
        this.f47594c = f11;
        this.f47593b = f12;
    }
}
