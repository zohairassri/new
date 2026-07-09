package of0;

import java.util.NoSuchElementException;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f120336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f120337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f120338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f120339d;

    public a(char c11, char c12, int i11) {
        this.f120336a = i11;
        this.f120337b = c12;
        boolean z11 = false;
        if (i11 <= 0 ? Intrinsics.compare((int) c11, (int) c12) >= 0 : Intrinsics.compare((int) c11, (int) c12) <= 0) {
            z11 = true;
        }
        this.f120338c = z11;
        this.f120339d = z11 ? c11 : c12;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120338c;
    }

    @Override // kotlin.collections.x
    public char nextChar() {
        int i11 = this.f120339d;
        if (i11 != this.f120337b) {
            this.f120339d = this.f120336a + i11;
        } else {
            if (!this.f120338c) {
                throw new NoSuchElementException();
            }
            this.f120338c = false;
        }
        return (char) i11;
    }
}
