package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.u0;
import java.util.Arrays;
import ml.l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f20912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final u0 f20906g = new u0.b().g0("application/id3").G();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u0 f20907h = new u0.b().g0("application/x-scte35").G();
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i11) {
            return new EventMessage[i11];
        }
    }

    public EventMessage(String str, String str2, long j11, long j12, byte[] bArr) {
        this.f20908a = str;
        this.f20909b = str2;
        this.f20910c = j11;
        this.f20911d = j12;
        this.f20912e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public byte[] E() {
        if (e() != null) {
            return this.f20912e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public u0 e() {
        String str = this.f20908a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f20907h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f20906g;
            default:
                return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.f20910c == eventMessage.f20910c && this.f20911d == eventMessage.f20911d && l0.c(this.f20908a, eventMessage.f20908a) && l0.c(this.f20909b, eventMessage.f20909b) && Arrays.equals(this.f20912e, eventMessage.f20912e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f20913f == 0) {
            String str = this.f20908a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f20909b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j11 = this.f20910c;
            int i11 = (((iHashCode + iHashCode2) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f20911d;
            this.f20913f = ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + Arrays.hashCode(this.f20912e);
        }
        return this.f20913f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f20908a + ", id=" + this.f20911d + ", durationMs=" + this.f20910c + ", value=" + this.f20909b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f20908a);
        parcel.writeString(this.f20909b);
        parcel.writeLong(this.f20910c);
        parcel.writeLong(this.f20911d);
        parcel.writeByteArray(this.f20912e);
    }

    EventMessage(Parcel parcel) {
        this.f20908a = (String) l0.j(parcel.readString());
        this.f20909b = (String) l0.j(parcel.readString());
        this.f20910c = parcel.readLong();
        this.f20911d = parcel.readLong();
        this.f20912e = (byte[]) l0.j(parcel.createByteArray());
    }
}
