package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f44414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f44415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f44416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f44417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f44418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f44419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f44420g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i11) {
            return new Month[i11];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarE = t.e(calendar);
        this.f44414a = calendarE;
        this.f44415b = calendarE.get(2);
        this.f44416c = calendarE.get(1);
        this.f44417d = calendarE.getMaximum(7);
        this.f44418e = calendarE.getActualMaximum(5);
        this.f44419f = calendarE.getTimeInMillis();
    }

    static Month b(int i11, int i12) {
        Calendar calendarM = t.m();
        calendarM.set(1, i11);
        calendarM.set(2, i12);
        return new Month(calendarM);
    }

    static Month c(long j11) {
        Calendar calendarM = t.m();
        calendarM.setTimeInMillis(j11);
        return new Month(calendarM);
    }

    static Month f() {
        return new Month(t.k());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f44414a.compareTo(month.f44414a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f44415b == month.f44415b && this.f44416c == month.f44416c;
    }

    int g(int i11) {
        int i12 = this.f44414a.get(7);
        if (i11 <= 0) {
            i11 = this.f44414a.getFirstDayOfWeek();
        }
        int i13 = i12 - i11;
        return i13 < 0 ? i13 + this.f44417d : i13;
    }

    long h(int i11) {
        Calendar calendarE = t.e(this.f44414a);
        calendarE.set(5, i11);
        return calendarE.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f44415b), Integer.valueOf(this.f44416c)});
    }

    int j(long j11) {
        Calendar calendarE = t.e(this.f44414a);
        calendarE.setTimeInMillis(j11);
        return calendarE.get(5);
    }

    String k() {
        if (this.f44420g == null) {
            this.f44420g = h.l(this.f44414a.getTimeInMillis());
        }
        return this.f44420g;
    }

    long l() {
        return this.f44414a.getTimeInMillis();
    }

    Month n(int i11) {
        Calendar calendarE = t.e(this.f44414a);
        calendarE.add(2, i11);
        return new Month(calendarE);
    }

    int o(Month month) {
        if (this.f44414a instanceof GregorianCalendar) {
            return ((month.f44416c - this.f44416c) * 12) + (month.f44415b - this.f44415b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f44416c);
        parcel.writeInt(this.f44415b);
    }
}
