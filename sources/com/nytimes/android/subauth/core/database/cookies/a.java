package com.nytimes.android.subauth.core.database.cookies;

import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f48522id;
    private final Date timestamp;

    @NotNull
    private final String value;

    public a(@NotNull String id2, @NotNull String value, Date date) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f48522id = id2;
        this.value = value;
        this.timestamp = date;
    }

    public final String a() {
        return this.f48522id;
    }

    public final Date b() {
        return this.timestamp;
    }

    public final String c() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f48522id, aVar.f48522id) && Intrinsics.areEqual(this.value, aVar.value) && Intrinsics.areEqual(this.timestamp, aVar.timestamp);
    }

    public int hashCode() {
        int iHashCode = ((this.f48522id.hashCode() * 31) + this.value.hashCode()) * 31;
        Date date = this.timestamp;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "Cookie(id=" + this.f48522id + ", value=" + this.value + ", timestamp=" + this.timestamp + ")";
    }

    public /* synthetic */ a(String str, String str2, Date date, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? new Date() : date);
    }
}
