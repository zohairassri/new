package of0;

import java.util.NoSuchElementException;
import kotlin.collections.w0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f120344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f120345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f120346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f120347d;

    public e(long j11, long j12, long j13) {
        this.f120344a = j13;
        this.f120345b = j12;
        boolean z11 = false;
        if (j13 <= 0 ? j11 >= j12 : j11 <= j12) {
            z11 = true;
        }
        this.f120346c = z11;
        this.f120347d = z11 ? j11 : j12;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120346c;
    }

    @Override // kotlin.collections.w0
    public long nextLong() {
        long j11 = this.f120347d;
        if (j11 != this.f120345b) {
            this.f120347d = this.f120344a + j11;
            return j11;
        }
        if (!this.f120346c) {
            throw new NoSuchElementException();
        }
        this.f120346c = false;
        return j11;
    }
}
