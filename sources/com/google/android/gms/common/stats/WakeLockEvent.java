package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f22890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f22891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f22892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f22893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22894i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f22895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f22896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f22897n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f22898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f22899s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f22900v;

    WakeLockEvent(int i11, long j11, int i12, String str, int i13, List list, String str2, long j12, int i14, String str3, String str4, float f11, long j13, String str5, boolean z11) {
        this.f22886a = i11;
        this.f22887b = j11;
        this.f22888c = i12;
        this.f22889d = str;
        this.f22890e = str3;
        this.f22891f = str5;
        this.f22892g = i13;
        this.f22893h = list;
        this.f22894i = str2;
        this.f22895l = j12;
        this.f22896m = i14;
        this.f22897n = str4;
        this.f22898r = f11;
        this.f22899s = j13;
        this.f22900v = z11;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String C() {
        List list = this.f22893h;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i11 = this.f22896m;
        String str = this.f22890e;
        String str2 = this.f22897n;
        float f11 = this.f22898r;
        String str3 = this.f22891f;
        int i12 = this.f22892g;
        String str4 = this.f22889d;
        boolean z11 = this.f22900v;
        int length = String.valueOf(str4).length() + 2 + String.valueOf(i12).length() + 1 + String.valueOf(strJoin).length() + 1 + String.valueOf(i11).length();
        if (str == null) {
            str = "";
        }
        int length2 = length + 1 + str.length() + 1;
        if (str2 == null) {
            str2 = "";
        }
        int length3 = length2 + str2.length() + 1 + String.valueOf(f11).length() + 1;
        String str5 = str3 != null ? str3 : "";
        StringBuilder sb2 = new StringBuilder(length3 + str5.length() + 1 + String.valueOf(z11).length());
        sb2.append("\t");
        sb2.append(str4);
        sb2.append("\t");
        sb2.append(i12);
        sb2.append("\t");
        sb2.append(strJoin);
        sb2.append("\t");
        sb2.append(i11);
        sb2.append("\t");
        sb2.append(str);
        sb2.append("\t");
        sb2.append(str2);
        sb2.append("\t");
        sb2.append(f11);
        sb2.append("\t");
        sb2.append(str5);
        sb2.append("\t");
        sb2.append(z11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long j() {
        return this.f22887b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int l() {
        return this.f22888c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f22886a);
        um.a.p(parcel, 2, this.f22887b);
        um.a.u(parcel, 4, this.f22889d, false);
        um.a.l(parcel, 5, this.f22892g);
        um.a.w(parcel, 6, this.f22893h, false);
        um.a.p(parcel, 8, this.f22895l);
        um.a.u(parcel, 10, this.f22890e, false);
        um.a.l(parcel, 11, this.f22888c);
        um.a.u(parcel, 12, this.f22894i, false);
        um.a.u(parcel, 13, this.f22897n, false);
        um.a.l(parcel, 14, this.f22896m);
        um.a.i(parcel, 15, this.f22898r);
        um.a.p(parcel, 16, this.f22899s);
        um.a.u(parcel, 17, this.f22891f, false);
        um.a.c(parcel, 18, this.f22900v);
        um.a.b(parcel, iA);
    }
}
