package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ek5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25794c;

    public ek5(String str, boolean z11, boolean z12) {
        this.f25792a = str;
        this.f25793b = z11;
        this.f25794c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == ek5.class) {
            ek5 ek5Var = (ek5) obj;
            if (TextUtils.equals(this.f25792a, ek5Var.f25792a) && this.f25793b == ek5Var.f25793b && this.f25794c == ek5Var.f25794c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f25792a.hashCode() + 31) * 31) + (true != this.f25793b ? 1237 : 1231)) * 31) + (true != this.f25794c ? 1237 : 1231);
    }
}
