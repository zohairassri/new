package g5;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void onItemSelected(AdapterView adapterView, View view, int i11, long j11);
    }

    /* JADX INFO: renamed from: g5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class C1127b implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f98151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.databinding.h f98152b;

        public C1127b(a aVar, c cVar, androidx.databinding.h hVar) {
            this.f98151a = aVar;
            this.f98152b = hVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i11, long j11) {
            a aVar = this.f98151a;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i11, j11);
            }
            androidx.databinding.h hVar = this.f98152b;
            if (hVar != null) {
                hVar.a();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
            androidx.databinding.h hVar = this.f98152b;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
    }

    public static void a(AdapterView adapterView, a aVar, c cVar, androidx.databinding.h hVar) {
        if (aVar == null && cVar == null && hVar == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new C1127b(aVar, cVar, hVar));
        }
    }

    public static void b(AdapterView adapterView, int i11) {
        if (adapterView.getSelectedItemPosition() != i11) {
            adapterView.setSelection(i11);
        }
    }
}
