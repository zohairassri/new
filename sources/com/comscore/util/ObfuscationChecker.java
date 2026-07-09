package com.comscore.util;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ObfuscationChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f19458a = "com.comscore.util";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19459b = "ObfuscationChecker";

    public boolean isCodeObfuscated() {
        return (f19458a.equals(getClass().getPackage().getName()) && f19459b.equals(getClass().getSimpleName())) ? false : true;
    }
}
