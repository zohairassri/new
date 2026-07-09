package n30;

import com.theathletic.utility.f1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
public final class e implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f117302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f117303b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void d(int i11, String str);
    }

    public e(a aVar, int i11) {
        this.f117302a = aVar;
        this.f117303b = i11;
    }

    @Override // com.theathletic.utility.f1
    public void a(String str) {
        this.f117302a.d(this.f117303b, str);
    }
}
