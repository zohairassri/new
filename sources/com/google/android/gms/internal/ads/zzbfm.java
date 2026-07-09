package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbfm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfm> CREATOR = new nu();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ParcelFileDescriptor f39547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f39548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f39549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f39550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f39551e;

    public zzbfm() {
        this(null, false, false, 0L, false);
    }

    public final synchronized boolean C() {
        return this.f39548b;
    }

    public final synchronized boolean M() {
        return this.f39549c;
    }

    public final synchronized boolean i1() {
        return this.f39551e;
    }

    public final synchronized InputStream j() {
        if (this.f39547a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f39547a);
        this.f39547a = null;
        return autoCloseInputStream;
    }

    final synchronized ParcelFileDescriptor l() {
        return this.f39547a;
    }

    public final synchronized long p0() {
        return this.f39550d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.s(parcel, 2, l(), i11, false);
        um.a.c(parcel, 3, C());
        um.a.c(parcel, 4, M());
        um.a.p(parcel, 5, p0());
        um.a.c(parcel, 6, i1());
        um.a.b(parcel, iA);
    }

    public final synchronized boolean zza() {
        return this.f39547a != null;
    }

    public zzbfm(ParcelFileDescriptor parcelFileDescriptor, boolean z11, boolean z12, long j11, boolean z13) {
        this.f39547a = parcelFileDescriptor;
        this.f39548b = z11;
        this.f39549c = z12;
        this.f39550d = j11;
        this.f39551e = z13;
    }
}
