package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wm.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f22837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f22838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f22840f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f22841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f22842b;

        a(long j11, long j12) {
            n.o(j12);
            this.f22841a = j11;
            this.f22842b = j12;
        }
    }

    public ModuleInstallStatusUpdate(int i11, int i12, Long l11, Long l12, int i13) {
        this.f22835a = i11;
        this.f22836b = i12;
        this.f22837c = l11;
        this.f22838d = l12;
        this.f22839e = i13;
        this.f22840f = (l11 == null || l12 == null || l12.longValue() == 0) ? null : new a(l11.longValue(), l12.longValue());
    }

    public int C() {
        return this.f22835a;
    }

    public int j() {
        return this.f22839e;
    }

    public int l() {
        return this.f22836b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, C());
        um.a.l(parcel, 2, l());
        um.a.q(parcel, 3, this.f22837c, false);
        um.a.q(parcel, 4, this.f22838d, false);
        um.a.l(parcel, 5, j());
        um.a.b(parcel, iA);
    }
}
