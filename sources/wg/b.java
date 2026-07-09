package wg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements tg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Number f135549a;

    public b(Number number) {
        this.f135549a = number;
    }

    public final b a(Number number) {
        return new b(number);
    }

    public final Number b() {
        return this.f135549a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f135549a, ((b) obj).f135549a);
    }

    public int hashCode() {
        Number number = this.f135549a;
        if (number == null) {
            return 0;
        }
        return number.hashCode();
    }

    public String toString() {
        return "DisplayInfo(screenBrightness=" + this.f135549a + ")";
    }

    public /* synthetic */ b(Number number, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : number);
    }
}
