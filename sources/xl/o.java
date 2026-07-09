package xl;

import android.os.AsyncTask;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class o extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f137838a;

    /* synthetic */ o(q qVar, byte[] bArr) {
        Objects.requireNonNull(qVar);
        this.f137838a = qVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f137838a.p7();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        q qVar = this.f137838a;
        String str = (String) obj;
        if (qVar.s7() == null || str == null) {
            return;
        }
        qVar.s7().loadUrl(str);
    }
}
