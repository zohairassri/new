package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class l72 extends o72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable f30051c;

    l72(String str, String str2, Drawable drawable) {
        this.f30049a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f30050b = str2;
        this.f30051c = drawable;
    }

    @Override // com.google.android.gms.internal.ads.o72
    final String a() {
        return this.f30049a;
    }

    @Override // com.google.android.gms.internal.ads.o72
    final String b() {
        return this.f30050b;
    }

    @Override // com.google.android.gms.internal.ads.o72
    final Drawable c() {
        return this.f30051c;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o72) {
            o72 o72Var = (o72) obj;
            String str = this.f30049a;
            if (str != null ? str.equals(o72Var.a()) : o72Var.a() == null) {
                if (this.f30050b.equals(o72Var.b()) && ((drawable = this.f30051c) != null ? drawable.equals(o72Var.c()) : o72Var.c() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f30049a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f30050b.hashCode();
        Drawable drawable = this.f30051c;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f30051c);
        String str = this.f30049a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.f30050b;
        StringBuilder sb2 = new StringBuilder(length + 42 + str2.length() + 7 + length2 + 1);
        sb2.append("OfflineAdAssets{advertiserName=");
        sb2.append(str);
        sb2.append(", imageUrl=");
        sb2.append(str2);
        sb2.append(", icon=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
