package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f22546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f22548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConnectionResult f22543f = new ConnectionResult(0);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new k();

    ConnectionResult(int i11, int i12, PendingIntent pendingIntent, String str, Integer num) {
        this.f22544a = i11;
        this.f22545b = i12;
        this.f22546c = pendingIntent;
        this.f22547d = str;
        this.f22548e = num;
    }

    static String h2(int i11) {
        if (i11 == 99) {
            return "UNFINISHED";
        }
        if (i11 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i11) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i11) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i11);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public String C() {
        return this.f22547d;
    }

    public PendingIntent M() {
        return this.f22546c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f22545b == connectionResult.f22545b && com.google.android.gms.common.internal.m.a(this.f22546c, connectionResult.f22546c) && com.google.android.gms.common.internal.m.a(this.f22547d, connectionResult.f22547d) && com.google.android.gms.common.internal.m.a(this.f22548e, connectionResult.f22548e);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.m.b(Integer.valueOf(this.f22545b), this.f22546c, this.f22547d, this.f22548e);
    }

    public boolean i1() {
        return this.f22545b == 0;
    }

    public Integer j() {
        return this.f22548e;
    }

    public int l() {
        return this.f22545b;
    }

    public boolean p0() {
        return (this.f22545b == 0 || this.f22546c == null) ? false : true;
    }

    public String toString() {
        m.a aVarC = com.google.android.gms.common.internal.m.c(this);
        aVarC.a("statusCode", h2(this.f22545b));
        aVarC.a("resolution", this.f22546c);
        aVarC.a("message", this.f22547d);
        aVarC.a("clientMethodKey", this.f22548e);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22544a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.l(parcel, 2, l());
        um.a.s(parcel, 3, M(), i11, false);
        um.a.u(parcel, 4, C(), false);
        um.a.o(parcel, 5, j(), false);
        um.a.b(parcel, iA);
    }

    public ConnectionResult(int i11) {
        this(i11, null, null);
    }

    public ConnectionResult(int i11, PendingIntent pendingIntent) {
        this(i11, pendingIntent, null);
    }

    public ConnectionResult(int i11, PendingIntent pendingIntent, String str) {
        this(1, i11, pendingIntent, str, null);
    }
}
