package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f41927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eu f41928b;

    /* synthetic */ wk(Class cls, eu euVar, vk vkVar) {
        this.f41927a = cls;
        this.f41928b = euVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wk)) {
            return false;
        }
        wk wkVar = (wk) obj;
        return wkVar.f41927a.equals(this.f41927a) && wkVar.f41928b.equals(this.f41928b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41927a, this.f41928b});
    }

    public final String toString() {
        return this.f41927a.getSimpleName() + ", object identifier: " + String.valueOf(this.f41928b);
    }
}
