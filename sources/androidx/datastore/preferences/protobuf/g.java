package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f7571b = new i(x.f7792c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f7572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator f7573d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7574a = 0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7575a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7576b;

        a() {
            this.f7576b = g.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7575a < this.f7576b;
        }

        @Override // androidx.datastore.preferences.protobuf.g.InterfaceC0129g
        public byte nextByte() {
            int i11 = this.f7575a;
            if (i11 >= this.f7576b) {
                throw new NoSuchElementException();
            }
            this.f7575a = i11 + 1;
            return g.this.p(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            InterfaceC0129g interfaceC0129gU = gVar.u();
            InterfaceC0129g interfaceC0129gU2 = gVar2.u();
            while (interfaceC0129gU.hasNext() && interfaceC0129gU2.hasNext()) {
                int iCompare = Integer.compare(g.z(interfaceC0129gU.nextByte()), g.z(interfaceC0129gU2.nextByte()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(gVar.size(), gVar2.size());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class c implements InterfaceC0129g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i11, int i12) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class e extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f7578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f7579g;

        e(byte[] bArr, int i11, int i12) {
            super(bArr);
            g.e(i11, i11 + i12, bArr.length);
            this.f7578f = i11;
            this.f7579g = i12;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.g.i
        protected int H() {
            return this.f7578f;
        }

        @Override // androidx.datastore.preferences.protobuf.g.i, androidx.datastore.preferences.protobuf.g
        public byte b(int i11) {
            g.d(i11, size());
            return this.f7580e[this.f7578f + i11];
        }

        @Override // androidx.datastore.preferences.protobuf.g.i, androidx.datastore.preferences.protobuf.g
        protected void m(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f7580e, H() + i11, bArr, i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.g.i, androidx.datastore.preferences.protobuf.g
        byte p(int i11) {
            return this.f7580e[this.f7578f + i11];
        }

        @Override // androidx.datastore.preferences.protobuf.g.i, androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f7579g;
        }

        Object writeReplace() {
            return g.D(y());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface f {
        byte[] a(byte[] bArr, int i11, int i12);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC0129g extends Iterator {
        byte nextByte();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class h extends g {
        h() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.u();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class i extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f7580e;

        i(byte[] bArr) {
            bArr.getClass();
            this.f7580e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final String B(Charset charset) {
            return new String(this.f7580e, H(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        final void F(androidx.datastore.preferences.protobuf.f fVar) {
            fVar.a(this.f7580e, H(), size());
        }

        final boolean G(g gVar, int i11, int i12) {
            if (i12 > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i12 + size());
            }
            int i13 = i11 + i12;
            if (i13 > gVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i11 + ", " + i12 + ", " + gVar.size());
            }
            if (!(gVar instanceof i)) {
                return gVar.x(i11, i13).equals(x(0, i12));
            }
            i iVar = (i) gVar;
            byte[] bArr = this.f7580e;
            byte[] bArr2 = iVar.f7580e;
            int iH = H() + i12;
            int iH2 = H();
            int iH3 = iVar.H() + i11;
            while (iH2 < iH) {
                if (bArr[iH2] != bArr2[iH3]) {
                    return false;
                }
                iH2++;
                iH3++;
            }
            return true;
        }

        protected int H() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte b(int i11) {
            return this.f7580e[i11];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iW = w();
            int iW2 = iVar.w();
            if (iW == 0 || iW2 == 0 || iW == iW2) {
                return G(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected void m(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f7580e, i11, bArr, i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        byte p(int i11) {
            return this.f7580e[i11];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean s() {
            int iH = H();
            return m1.n(this.f7580e, iH, size() + iH);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f7580e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final int v(int i11, int i12, int i13) {
            return x.i(i11, this.f7580e, H() + i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final g x(int i11, int i12) {
            int iE = g.e(i11, i12, size());
            return iE == 0 ? g.f7571b : new e(this.f7580e, H() + i11, iE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class j implements f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i11, int i12) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f7572c = androidx.datastore.preferences.protobuf.d.c() ? new j(aVar) : new d(aVar);
        f7573d = new b();
    }

    g() {
    }

    static g D(byte[] bArr) {
        return new i(bArr);
    }

    static g E(byte[] bArr, int i11, int i12) {
        return new e(bArr, i11, i12);
    }

    static void d(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
        }
    }

    static int e(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i11 + " < 0");
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i11 + ", " + i12);
        }
        throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
    }

    public static g i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static g j(byte[] bArr, int i11, int i12) {
        e(i11, i11 + i12, bArr.length);
        return new i(f7572c.a(bArr, i11, i12));
    }

    public static g l(String str) {
        return new i(str.getBytes(x.f7790a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int z(byte b11) {
        return b11 & 255;
    }

    public final String A(Charset charset) {
        return size() == 0 ? "" : B(charset);
    }

    protected abstract String B(Charset charset);

    public final String C() {
        return A(x.f7790a);
    }

    abstract void F(androidx.datastore.preferences.protobuf.f fVar);

    public abstract byte b(int i11);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iV = this.f7574a;
        if (iV == 0) {
            int size = size();
            iV = v(size, 0, size);
            if (iV == 0) {
                iV = 1;
            }
            this.f7574a = iV;
        }
        return iV;
    }

    protected abstract void m(byte[] bArr, int i11, int i12, int i13);

    abstract byte p(int i11);

    public abstract boolean s();

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public InterfaceC0129g u() {
        return new a();
    }

    protected abstract int v(int i11, int i12, int i13);

    protected final int w() {
        return this.f7574a;
    }

    public abstract g x(int i11, int i12);

    public final byte[] y() {
        int size = size();
        if (size == 0) {
            return x.f7792c;
        }
        byte[] bArr = new byte[size];
        m(bArr, 0, 0, size);
        return bArr;
    }
}
