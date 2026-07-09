package ls;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ks.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f114839b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f114840a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f114840a = sharedPreferences;
    }

    @Override // ks.h
    public void a(long j11) {
        this.f114840a.edit().putLong("com.lyft.kronos.cached_elapsed_time", j11).apply();
    }

    @Override // ks.h
    public void b(long j11) {
        this.f114840a.edit().putLong("com.lyft.kronos.cached_offset", j11).apply();
    }

    @Override // ks.h
    public long c() {
        return this.f114840a.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
    }

    @Override // ks.h
    public void clear() {
        this.f114840a.edit().clear().apply();
    }

    @Override // ks.h
    public long d() {
        return this.f114840a.getLong("com.lyft.kronos.cached_offset", 0L);
    }

    @Override // ks.h
    public void e(long j11) {
        this.f114840a.edit().putLong("com.lyft.kronos.cached_current_time", j11).apply();
    }

    @Override // ks.h
    public long getCurrentTime() {
        return this.f114840a.getLong("com.lyft.kronos.cached_current_time", 0L);
    }
}
