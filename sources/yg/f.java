package yg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum f {
    NONE("NONE"),
    FOREGROUND("FOREGROUND"),
    BACKGROUND("BACKGROUND"),
    APPLICATION_LAUNCH("APPLICATION_LAUNCH");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f140496b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f140502a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String str) {
            for (f fVar : f.values()) {
                if (Intrinsics.areEqual(fVar.b(), str)) {
                    return fVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    f(String str) {
        this.f140502a = str;
    }

    public final String b() {
        return this.f140502a;
    }
}
