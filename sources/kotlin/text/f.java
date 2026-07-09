package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class f implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f111896f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f111897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111901e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f111897a = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f111898b = 0;
        int i11 = this.f111900d;
        int i12 = this.f111899c;
        this.f111899c = this.f111901e + i11;
        return this.f111897a.subSequence(i12, i11).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i11;
        int i12;
        int i13 = this.f111898b;
        if (i13 != 0) {
            return i13 == 1;
        }
        if (this.f111901e < 0) {
            this.f111898b = 2;
            return false;
        }
        int length = this.f111897a.length();
        int length2 = this.f111897a.length();
        for (int i14 = this.f111899c; i14 < length2; i14++) {
            char cCharAt = this.f111897a.charAt(i14);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i11 = (cCharAt == '\r' && (i12 = i14 + 1) < this.f111897a.length() && this.f111897a.charAt(i12) == '\n') ? 2 : 1;
                length = i14;
                this.f111898b = 1;
                this.f111901e = i11;
                this.f111900d = length;
                return true;
            }
        }
        i11 = -1;
        this.f111898b = 1;
        this.f111901e = i11;
        this.f111900d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
