package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f46886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46887b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timer[] newArray(int i11) {
            return new Timer[i11];
        }
    }

    /* synthetic */ Timer(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static Timer g(long j11) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j11);
        return new Timer(i() + (micros - a()), micros);
    }

    private static long i() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f46886a + c();
    }

    public long c() {
        return d(new Timer());
    }

    public long d(Timer timer) {
        return timer.f46887b - this.f46887b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long f() {
        return this.f46886a;
    }

    public void h() {
        this.f46886a = i();
        this.f46887b = a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f46886a);
        parcel.writeLong(this.f46887b);
    }

    public Timer() {
        this(i(), a());
    }

    Timer(long j11, long j12) {
        this.f46886a = j11;
        this.f46887b = j12;
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
