package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class cx3 extends zw3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f24771a;

    cx3(Pattern pattern) {
        pattern.getClass();
        this.f24771a = pattern;
    }

    @Override // com.google.android.gms.internal.ads.zw3
    public final yw3 a(CharSequence charSequence) {
        return new bx3(this.f24771a.matcher(charSequence));
    }

    public final String toString() {
        return this.f24771a.toString();
    }
}
