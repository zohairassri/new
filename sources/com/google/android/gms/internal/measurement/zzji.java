package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class zzji extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r9 f40986a;

    public zzji(String str) {
        super(str);
        this.f40986a = null;
    }

    static zzjh a() {
        return new zzjh("Protocol message tag had invalid wire type.");
    }

    static zzji b() {
        return new zzji("Protocol message contained an invalid tag (zero).");
    }

    static zzji c() {
        return new zzji("Protocol message had invalid UTF-8.");
    }

    static zzji d() {
        return new zzji("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzji e() {
        return new zzji("Failed to parse the message.");
    }

    static zzji f() {
        return new zzji("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
