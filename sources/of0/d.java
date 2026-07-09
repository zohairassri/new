package of0;

import java.util.NoSuchElementException;
import kotlin.collections.v0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f120340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f120341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f120342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f120343d;

    public d(int i11, int i12, int i13) {
        this.f120340a = i13;
        this.f120341b = i12;
        boolean z11 = false;
        if (i13 <= 0 ? i11 >= i12 : i11 <= i12) {
            z11 = true;
        }
        this.f120342c = z11;
        this.f120343d = z11 ? i11 : i12;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120342c;
    }

    @Override // kotlin.collections.v0
    public int nextInt() {
        int i11 = this.f120343d;
        if (i11 != this.f120341b) {
            this.f120343d = this.f120340a + i11;
            return i11;
        }
        if (!this.f120342c) {
            throw new NoSuchElementException();
        }
        this.f120342c = false;
        return i11;
    }
}
