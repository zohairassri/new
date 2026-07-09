package hv;

import android.content.SharedPreferences;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements hv.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f102619b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f102620a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f102620a = prefs;
    }

    private final String c(String str, String str2, String str3) {
        return "ProgramHeadersHolder_" + str + QueryKeys.END_MARKER + str3 + QueryKeys.END_MARKER + str2;
    }

    @Override // hv.a
    public void a(String query, String variables, String str) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(variables, "variables");
        SharedPreferences.Editor editorEdit = this.f102620a.edit();
        editorEdit.putString(c("LAST_MODIFIED", query, variables), str);
        editorEdit.apply();
    }

    @Override // hv.a
    public String b(String query, String variables) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(variables, "variables");
        return this.f102620a.getString(c("LAST_MODIFIED", query, variables), null);
    }
}
