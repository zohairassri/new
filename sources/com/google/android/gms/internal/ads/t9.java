package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class t9 implements f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t9 f35340b = new t9(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t9 f35341c = new t9(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35342a;

    private t9(boolean z11) {
        this.f35342a = z11;
    }

    public final String toString() {
        boolean z11 = !this.f35342a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z11).length() + 33);
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(z11);
        sb2.append("}");
        return sb2.toString();
    }
}
