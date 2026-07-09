package n30;

import android.widget.CompoundButton;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC1462a f117294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f117295b;

    /* JADX INFO: renamed from: n30.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC1462a {
        void c(int i11, CompoundButton compoundButton, boolean z11);
    }

    public a(InterfaceC1462a interfaceC1462a, int i11) {
        this.f117294a = interfaceC1462a;
        this.f117295b = i11;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
        this.f117294a.c(this.f117295b, compoundButton, z11);
    }
}
