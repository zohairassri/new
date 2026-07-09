package ye;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f140359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f140360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f140361c;

    public d(e id2, List data, byte[] bArr) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f140359a = id2;
        this.f140360b = data;
        this.f140361c = bArr;
    }

    public final List a() {
        return this.f140360b;
    }

    public final e b() {
        return this.f140359a;
    }

    public final byte[] c() {
        return this.f140361c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.datadog.android.core.internal.persistence.BatchData");
        d dVar = (d) obj;
        if (!Intrinsics.areEqual(this.f140359a, dVar.f140359a) || !Intrinsics.areEqual(this.f140360b, dVar.f140360b)) {
            return false;
        }
        byte[] bArr = this.f140361c;
        if (bArr != null) {
            byte[] bArr2 = dVar.f140361c;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (dVar.f140361c != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = ((this.f140359a.hashCode() * 31) + this.f140360b.hashCode()) * 31;
        byte[] bArr = this.f140361c;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        return "BatchData(id=" + this.f140359a + ", data=" + this.f140360b + ", metadata=" + Arrays.toString(this.f140361c) + ")";
    }
}
