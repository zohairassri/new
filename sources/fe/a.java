package fe;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f94187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f94188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f94189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f94190f;

    public a(String id2, String description, String url, Map headers, byte[] body, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f94185a = id2;
        this.f94186b = description;
        this.f94187c = url;
        this.f94188d = headers;
        this.f94189e = body;
        this.f94190f = str;
    }

    public final byte[] a() {
        return this.f94189e;
    }

    public final String b() {
        return this.f94190f;
    }

    public final String c() {
        return this.f94186b;
    }

    public final Map d() {
        return this.f94188d;
    }

    public final String e() {
        return this.f94185a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f94185a, aVar.f94185a) && Intrinsics.areEqual(this.f94186b, aVar.f94186b) && Intrinsics.areEqual(this.f94187c, aVar.f94187c) && Intrinsics.areEqual(this.f94188d, aVar.f94188d) && Intrinsics.areEqual(this.f94189e, aVar.f94189e) && Intrinsics.areEqual(this.f94190f, aVar.f94190f);
    }

    public final String f() {
        return this.f94187c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f94185a.hashCode() * 31) + this.f94186b.hashCode()) * 31) + this.f94187c.hashCode()) * 31) + this.f94188d.hashCode()) * 31) + Arrays.hashCode(this.f94189e)) * 31;
        String str = this.f94190f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Request(id=" + this.f94185a + ", description=" + this.f94186b + ", url=" + this.f94187c + ", headers=" + this.f94188d + ", body=" + Arrays.toString(this.f94189e) + ", contentType=" + this.f94190f + ")";
    }
}
