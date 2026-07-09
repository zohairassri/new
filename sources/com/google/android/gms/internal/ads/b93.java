package com.google.android.gms.internal.ads;

import com.comscore.android.id.IdHelperAndroid;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum b93 {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(IdHelperAndroid.NO_ID_AVAILABLE);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23755a;

    b93(String str) {
        this.f23755a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f23755a;
    }
}
