package u40;

import android.content.Context;
import android.content.SharedPreferences;
import hy.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu40/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lhy/f;", "a", "(Landroid/content/Context;)Lhy/f;", "subauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f131030a = new a();

    /* JADX INFO: renamed from: u40.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"u40/a$a", "Lhy/f;", "", "a", "()Ljava/lang/String;", "email", "getToken", "token", "subauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1787a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f131031a;

        C1787a(SharedPreferences sharedPreferences) {
            this.f131031a = sharedPreferences;
        }

        @Override // hy.f
        public String a() {
            return this.f131031a.getString("pref_email", null);
        }

        @Override // hy.f
        public String getToken() {
            return this.f131031a.getString("pref_access_token", null);
        }

        @Override // hy.f
        public boolean isValid() {
            return super.isValid();
        }
    }

    private a() {
    }

    public final f a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C1787a(context.getSharedPreferences("TheAthleticsPrefs", 0));
    }
}
