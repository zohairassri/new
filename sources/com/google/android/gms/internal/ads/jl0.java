package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class jl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f29116a = BigInteger.ONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29117b = "0";

    public final synchronized String a() {
        String string;
        string = this.f29116a.toString();
        this.f29116a = this.f29116a.add(BigInteger.ONE);
        this.f29117b = string;
        return string;
    }

    public final synchronized String b() {
        return this.f29117b;
    }
}
