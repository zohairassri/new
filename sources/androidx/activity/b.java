package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1321e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f1323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f1324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1325d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(float f11, float f12, float f13, int i11) {
        this.f1322a = f11;
        this.f1323b = f12;
        this.f1324c = f13;
        this.f1325d = i11;
    }

    public final float a() {
        return this.f1324c;
    }

    public final int b() {
        return this.f1325d;
    }

    public final float c() {
        return this.f1323b;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f1322a + ", touchY=" + this.f1323b + ", progress=" + this.f1324c + ", swipeEdge=" + this.f1325d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        androidx.activity.a aVar = androidx.activity.a.f1317a;
        this(aVar.c(backEvent), aVar.d(backEvent), aVar.a(backEvent), aVar.b(backEvent));
    }
}
