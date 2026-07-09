package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Month f44391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Month f44392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DateValidator f44393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Month f44394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f44395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f44396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f44397g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface DateValidator extends Parcelable {
        boolean F0(long j11);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i11) {
            return new CalendarConstraints[i11];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f44398f = t.a(Month.b(1900, 0).f44419f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f44399g = t.a(Month.b(2100, 11).f44419f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f44400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f44401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f44402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f44403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private DateValidator f44404e;

        b(CalendarConstraints calendarConstraints) {
            this.f44400a = f44398f;
            this.f44401b = f44399g;
            this.f44404e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f44400a = calendarConstraints.f44391a.f44419f;
            this.f44401b = calendarConstraints.f44392b.f44419f;
            this.f44402c = Long.valueOf(calendarConstraints.f44394d.f44419f);
            this.f44403d = calendarConstraints.f44395e;
            this.f44404e = calendarConstraints.f44393c;
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f44404e);
            Month monthC = Month.c(this.f44400a);
            Month monthC2 = Month.c(this.f44401b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l11 = this.f44402c;
            return new CalendarConstraints(monthC, monthC2, dateValidator, l11 == null ? null : Month.c(l11.longValue()), this.f44403d, null);
        }

        public b b(long j11) {
            this.f44402c = Long.valueOf(j11);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i11, a aVar) {
        this(month, month2, dateValidator, month3, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f44391a.equals(calendarConstraints.f44391a) && this.f44392b.equals(calendarConstraints.f44392b) && w4.c.a(this.f44394d, calendarConstraints.f44394d) && this.f44395e == calendarConstraints.f44395e && this.f44393c.equals(calendarConstraints.f44393c);
    }

    Month g(Month month) {
        return month.compareTo(this.f44391a) < 0 ? this.f44391a : month.compareTo(this.f44392b) > 0 ? this.f44392b : month;
    }

    public DateValidator h() {
        return this.f44393c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44391a, this.f44392b, this.f44394d, Integer.valueOf(this.f44395e), this.f44393c});
    }

    Month i() {
        return this.f44392b;
    }

    int j() {
        return this.f44395e;
    }

    int k() {
        return this.f44397g;
    }

    Month l() {
        return this.f44394d;
    }

    Month m() {
        return this.f44391a;
    }

    int n() {
        return this.f44396f;
    }

    boolean o(long j11) {
        if (this.f44391a.h(1) > j11) {
            return false;
        }
        Month month = this.f44392b;
        return j11 <= month.h(month.f44418e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f44391a, 0);
        parcel.writeParcelable(this.f44392b, 0);
        parcel.writeParcelable(this.f44394d, 0);
        parcel.writeParcelable(this.f44393c, 0);
        parcel.writeInt(this.f44395e);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i11) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f44391a = month;
        this.f44392b = month2;
        this.f44394d = month3;
        this.f44395e = i11;
        this.f44393c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i11 < 0 || i11 > t.m().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f44397g = month.o(month2) + 1;
        this.f44396f = (month2.f44416c - month.f44416c) + 1;
    }
}
