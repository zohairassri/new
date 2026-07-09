package g5;

import android.widget.CompoundButton;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CompoundButton.OnCheckedChangeListener f98153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.h f98154b;

        a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.h hVar) {
            this.f98153a = onCheckedChangeListener;
            this.f98154b = hVar;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f98153a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z11);
            }
            this.f98154b.a();
        }
    }

    public static void a(CompoundButton compoundButton, boolean z11) {
        if (compoundButton.isChecked() != z11) {
            compoundButton.setChecked(z11);
        }
    }

    public static void b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.h hVar) {
        if (hVar == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new a(onCheckedChangeListener, hVar));
        }
    }
}
