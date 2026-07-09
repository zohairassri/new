package lc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f114102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f114103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f114104c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f114105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f114106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f114107c;

        public a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f114105a = name;
        }

        public final o a() {
            return new o(this.f114105a, this.f114106b, this.f114107c, null);
        }
    }

    public /* synthetic */ o(String str, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, z12);
    }

    private o(String str, boolean z11, boolean z12) {
        this.f114102a = str;
        this.f114103b = z11;
        this.f114104c = z12;
    }
}
