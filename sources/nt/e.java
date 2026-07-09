package nt;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements lt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f119673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f119674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f119675d;

    public e(String prefValue, String title, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(prefValue, "prefValue");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f119672a = prefValue;
        this.f119673b = title;
        this.f119674c = str;
        this.f119675d = z11;
    }

    @Override // lt.a
    public boolean a() {
        return this.f119675d;
    }

    @Override // lt.a
    public String b() {
        return this.f119674c;
    }

    @Override // lt.a
    public String c() {
        return this.f119672a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f119672a, eVar.f119672a) && Intrinsics.areEqual(this.f119673b, eVar.f119673b) && Intrinsics.areEqual(this.f119674c, eVar.f119674c) && this.f119675d == eVar.f119675d;
    }

    @Override // lt.a
    public String getTitle() {
        return this.f119673b;
    }

    public int hashCode() {
        int iHashCode = ((this.f119672a.hashCode() * 31) + this.f119673b.hashCode()) * 31;
        String str = this.f119674c;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f119675d);
    }

    public String toString() {
        return "DevSettingSimpleChoiceOption(prefValue=" + this.f119672a + ", title=" + this.f119673b + ", summary=" + this.f119674c + ", requestRestart=" + this.f119675d + ")";
    }

    public /* synthetic */ e(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? false : z11);
    }
}
