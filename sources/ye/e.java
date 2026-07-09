package ye;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f140362b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f140363a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(File file) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "absolutePath");
            return absolutePath;
        }

        public final e c(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new e(b(file));
        }

        private a() {
        }
    }

    public e(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f140363a = id2;
    }

    public final String a() {
        return this.f140363a;
    }

    public final boolean b(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return Intrinsics.areEqual(f140362b.b(file), this.f140363a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f140363a, ((e) obj).f140363a);
    }

    public int hashCode() {
        return this.f140363a.hashCode();
    }

    public String toString() {
        return "BatchId(id=" + this.f140363a + ")";
    }
}
