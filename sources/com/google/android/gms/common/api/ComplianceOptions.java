package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ComplianceOptions f22571e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22575d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22576a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22577b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f22578c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22579d = true;

        public ComplianceOptions a() {
            return new ComplianceOptions(this.f22576a, this.f22577b, this.f22578c, this.f22579d);
        }

        public a b(int i11) {
            this.f22576a = i11;
            return this;
        }

        public a c(int i11) {
            this.f22577b = i11;
            return this;
        }

        public a d(boolean z11) {
            this.f22579d = z11;
            return this;
        }

        public a e(int i11) {
            this.f22578c = i11;
            return this;
        }
    }

    static {
        a aVarJ = j();
        aVarJ.b(-1);
        aVarJ.c(-1);
        aVarJ.e(0);
        aVarJ.d(true);
        f22571e = aVarJ.a();
        CREATOR = new j();
    }

    ComplianceOptions(int i11, int i12, int i13, boolean z11) {
        this.f22572a = i11;
        this.f22573b = i12;
        this.f22574c = i13;
        this.f22575d = z11;
    }

    public static a j() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f22572a == complianceOptions.f22572a && this.f22573b == complianceOptions.f22573b && this.f22574c == complianceOptions.f22574c && this.f22575d == complianceOptions.f22575d;
    }

    public final int hashCode() {
        return m.b(Integer.valueOf(this.f22572a), Integer.valueOf(this.f22573b), Integer.valueOf(this.f22574c), Boolean.valueOf(this.f22575d));
    }

    public final String toString() {
        int i11 = this.f22572a;
        int length = String.valueOf(i11).length();
        int i12 = this.f22573b;
        int length2 = String.valueOf(i12).length();
        int i13 = this.f22574c;
        int length3 = String.valueOf(i13).length();
        boolean z11 = this.f22575d;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z11).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i11);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i12);
        sb2.append(", processingReason=");
        sb2.append(i13);
        sb2.append(", isUserData=");
        sb2.append(z11);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22572a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.l(parcel, 2, this.f22573b);
        um.a.l(parcel, 3, this.f22574c);
        um.a.c(parcel, 4, this.f22575d);
        um.a.b(parcel, iA);
    }
}
