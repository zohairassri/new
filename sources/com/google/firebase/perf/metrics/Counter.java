package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f46819b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Counter[] newArray(int i11) {
            return new Counter[i11];
        }
    }

    /* synthetic */ Counter(Parcel parcel, a aVar) {
        this(parcel);
    }

    long a() {
        return this.f46819b.get();
    }

    String b() {
        return this.f46818a;
    }

    public void c(long j11) {
        this.f46819b.addAndGet(j11);
    }

    void d(long j11) {
        this.f46819b.set(j11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f46818a);
        parcel.writeLong(this.f46819b.get());
    }

    public Counter(String str) {
        this.f46818a = str;
        this.f46819b = new AtomicLong(0L);
    }

    private Counter(Parcel parcel) {
        this.f46818a = parcel.readString();
        this.f46819b = new AtomicLong(parcel.readLong());
    }
}
