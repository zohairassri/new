package ge;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f98513c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f98514d = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f98515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f98516b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(byte[] data, byte[] metadata) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f98515a = data;
        this.f98516b = metadata;
    }

    public final byte[] a() {
        return this.f98515a;
    }

    public final byte[] b() {
        return this.f98516b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.datadog.android.api.storage.RawBatchEvent");
        f fVar = (f) obj;
        return Arrays.equals(this.f98515a, fVar.f98515a) && Arrays.equals(this.f98516b, fVar.f98516b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f98515a) * 31) + Arrays.hashCode(this.f98516b);
    }

    public String toString() {
        return "RawBatchEvent(data=" + Arrays.toString(this.f98515a) + ", metadata=" + Arrays.toString(this.f98516b) + ")";
    }

    public /* synthetic */ f(byte[] bArr, byte[] bArr2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i11 & 2) != 0 ? f98514d : bArr2);
    }
}
