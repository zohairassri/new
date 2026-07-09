package et;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f92879e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f92881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f92882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92883d;

    public a(String textToMatch, String url, String tag, String title) {
        Intrinsics.checkNotNullParameter(textToMatch, "textToMatch");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f92880a = textToMatch;
        this.f92881b = url;
        this.f92882c = tag;
        this.f92883d = title;
    }

    public static /* synthetic */ a b(a aVar, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f92880a;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.f92881b;
        }
        if ((i11 & 4) != 0) {
            str3 = aVar.f92882c;
        }
        if ((i11 & 8) != 0) {
            str4 = aVar.f92883d;
        }
        return aVar.a(str, str2, str3, str4);
    }

    public final a a(String textToMatch, String url, String tag, String title) {
        Intrinsics.checkNotNullParameter(textToMatch, "textToMatch");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(title, "title");
        return new a(textToMatch, url, tag, title);
    }

    public final String c() {
        return this.f92882c;
    }

    public final String d() {
        return this.f92880a;
    }

    public final String e() {
        return this.f92883d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f92880a, aVar.f92880a) && Intrinsics.areEqual(this.f92881b, aVar.f92881b) && Intrinsics.areEqual(this.f92882c, aVar.f92882c) && Intrinsics.areEqual(this.f92883d, aVar.f92883d);
    }

    public final String f() {
        return this.f92881b;
    }

    public int hashCode() {
        return (((((this.f92880a.hashCode() * 31) + this.f92881b.hashCode()) * 31) + this.f92882c.hashCode()) * 31) + this.f92883d.hashCode();
    }

    public String toString() {
        return "LinkToken(textToMatch=" + this.f92880a + ", url=" + this.f92881b + ", tag=" + this.f92882c + ", title=" + this.f92883d + ")";
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4);
    }
}
