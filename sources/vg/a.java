package vg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements tg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float f133084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f133085b;

    public a(Float f11, Boolean bool) {
        this.f133084a = f11;
        this.f133085b = bool;
    }

    public final Float a() {
        return this.f133084a;
    }

    public final Boolean b() {
        return this.f133085b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual((Object) this.f133084a, (Object) aVar.f133084a) && Intrinsics.areEqual(this.f133085b, aVar.f133085b);
    }

    public int hashCode() {
        Float f11 = this.f133084a;
        int iHashCode = (f11 == null ? 0 : f11.hashCode()) * 31;
        Boolean bool = this.f133085b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BatteryInfo(batteryLevel=" + this.f133084a + ", lowPowerMode=" + this.f133085b + ")";
    }

    public /* synthetic */ a(Float f11, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : f11, (i11 & 2) != 0 ? null : bool);
    }
}
