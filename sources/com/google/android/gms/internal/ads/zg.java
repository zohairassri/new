package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39198b;

    public zg(String str, String str2) {
        this.f39197a = str;
        this.f39198b = str2;
    }

    public final String a() {
        return this.f39197a;
    }

    public final String b() {
        return this.f39198b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zg.class == obj.getClass()) {
            zg zgVar = (zg) obj;
            if (TextUtils.equals(this.f39197a, zgVar.f39197a) && TextUtils.equals(this.f39198b, zgVar.f39198b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f39197a.hashCode() * 31) + this.f39198b.hashCode();
    }

    public final String toString() {
        String str = this.f39197a;
        int length = String.valueOf(str).length();
        String str2 = this.f39198b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        sb2.append("Header[name=");
        sb2.append(str);
        sb2.append(",value=");
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }
}
