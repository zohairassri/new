package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f22705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f22708i;

    public MethodInvocation(int i11, int i12, int i13, long j11, long j12, String str, String str2, int i14, int i15) {
        this.f22700a = i11;
        this.f22701b = i12;
        this.f22702c = i13;
        this.f22703d = j11;
        this.f22704e = j12;
        this.f22705f = str;
        this.f22706g = str2;
        this.f22707h = i14;
        this.f22708i = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22700a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.l(parcel, 2, this.f22701b);
        um.a.l(parcel, 3, this.f22702c);
        um.a.p(parcel, 4, this.f22703d);
        um.a.p(parcel, 5, this.f22704e);
        um.a.u(parcel, 6, this.f22705f, false);
        um.a.u(parcel, 7, this.f22706g, false);
        um.a.l(parcel, 8, this.f22707h);
        um.a.l(parcel, 9, this.f22708i);
        um.a.b(parcel, iA);
    }
}
