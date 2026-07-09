package yt;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements yt.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f140973b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f140974a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f140974a = context.getSharedPreferences("com.nytimes.android.eventtracker.CLOCK_CACHE", 0);
    }

    public long a(String str, long j11) {
        return this.f140974a.getLong(str, j11);
    }

    public void b(String str, long j11) {
        this.f140974a.edit().putLong(str, j11).commit();
    }

    public void clear() {
        this.f140974a.edit().clear().commit();
    }
}
