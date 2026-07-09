package de;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f89648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f89649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f89650c;

    public e(List locales, String currentLocale, String timeZone) {
        Intrinsics.checkNotNullParameter(locales, "locales");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        this.f89648a = locales;
        this.f89649b = currentLocale;
        this.f89650c = timeZone;
    }

    public final String a() {
        return this.f89649b;
    }

    public final List b() {
        return this.f89648a;
    }

    public final String c() {
        return this.f89650c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f89648a, eVar.f89648a) && Intrinsics.areEqual(this.f89649b, eVar.f89649b) && Intrinsics.areEqual(this.f89650c, eVar.f89650c);
    }

    public int hashCode() {
        return (((this.f89648a.hashCode() * 31) + this.f89649b.hashCode()) * 31) + this.f89650c.hashCode();
    }

    public String toString() {
        return "LocaleInfo(locales=" + this.f89648a + ", currentLocale=" + this.f89649b + ", timeZone=" + this.f89650c + ")";
    }
}
