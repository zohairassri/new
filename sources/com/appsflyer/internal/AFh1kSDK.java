package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AFh1kSDK extends AFa1oSDK {
    private final boolean copy;
    private final boolean equals;

    AFh1kSDK() {
        this(null, null, null);
    }

    protected AFh1kSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.copy = bool != null ? bool.booleanValue() : true;
        this.equals = true;
    }
}
