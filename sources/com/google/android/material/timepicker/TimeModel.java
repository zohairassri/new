package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f45670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f45671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f45672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f45673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f45674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f45675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f45676g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i11) {
            return new TimeModel[i11];
        }
    }

    public TimeModel(int i11, int i12, int i13, int i14) {
        this.f45673d = i11;
        this.f45674e = i12;
        this.f45675f = i13;
        this.f45672c = i14;
        this.f45676g = c(i11);
        this.f45670a = new b(59);
        this.f45671b = new b(i14 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i11) {
        return i11 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f45673d == timeModel.f45673d && this.f45674e == timeModel.f45674e && this.f45672c == timeModel.f45672c && this.f45675f == timeModel.f45675f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45672c), Integer.valueOf(this.f45673d), Integer.valueOf(this.f45674e), Integer.valueOf(this.f45675f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f45673d);
        parcel.writeInt(this.f45674e);
        parcel.writeInt(this.f45675f);
        parcel.writeInt(this.f45672c);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
