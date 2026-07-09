package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nr.k;
import nr.l;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Timer f46850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46851c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PerfSession[] newArray(int i11) {
            return new PerfSession[i11];
        }
    }

    /* synthetic */ PerfSession(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static k[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k kVarA = ((PerfSession) list.get(0)).a();
        boolean z11 = false;
        for (int i11 = 1; i11 < list.size(); i11++) {
            k kVarA2 = ((PerfSession) list.get(i11)).a();
            if (z11 || !((PerfSession) list.get(i11)).h()) {
                kVarArr[i11] = kVarA2;
            } else {
                kVarArr[0] = kVarA2;
                kVarArr[i11] = kVarA;
                z11 = true;
            }
        }
        if (!z11) {
            kVarArr[0] = kVarA;
        }
        return kVarArr;
    }

    public static PerfSession c(String str) {
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new mr.a());
        perfSession.j(k());
        return perfSession;
    }

    public static boolean k() {
        com.google.firebase.perf.config.a aVarG = com.google.firebase.perf.config.a.g();
        return aVarG.K() && Math.random() < aVarG.D();
    }

    public k a() {
        k.c cVarZ = k.a0().z(this.f46849a);
        if (this.f46851c) {
            cVarZ.y(l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (k) cVarZ.q();
    }

    public Timer d() {
        return this.f46850b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean f() {
        return this.f46851c;
    }

    public boolean g() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f46850b.c()) > com.google.firebase.perf.config.a.g().A();
    }

    public boolean h() {
        return this.f46851c;
    }

    public String i() {
        return this.f46849a;
    }

    public void j(boolean z11) {
        this.f46851c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f46849a);
        parcel.writeByte(this.f46851c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f46850b, 0);
    }

    public PerfSession(String str, mr.a aVar) {
        this.f46851c = false;
        this.f46849a = str;
        this.f46850b = aVar.a();
    }

    private PerfSession(Parcel parcel) {
        this.f46851c = false;
        this.f46849a = parcel.readString();
        this.f46851c = parcel.readByte() != 0;
        this.f46850b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
