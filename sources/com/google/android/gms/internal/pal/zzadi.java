package com.google.android.gms.internal.pal;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class zzadi extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c3 f42304a;

    public zzadi(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f42304a = null;
    }

    static zzadh a() {
        return new zzadh("Protocol message tag had invalid wire type.");
    }

    static zzadi b() {
        return new zzadi("Protocol message end-group tag did not match expected tag.");
    }

    static zzadi c() {
        return new zzadi("Protocol message contained an invalid tag (zero).");
    }

    static zzadi d() {
        return new zzadi("Protocol message had invalid UTF-8.");
    }

    static zzadi e() {
        return new zzadi("CodedInputStream encountered a malformed varint.");
    }

    static zzadi f() {
        return new zzadi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzadi g() {
        return new zzadi("Failed to parse the message.");
    }

    static zzadi i() {
        return new zzadi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzadi h(c3 c3Var) {
        this.f42304a = c3Var;
        return this;
    }

    public zzadi(String str) {
        super(str);
        this.f42304a = null;
    }
}
