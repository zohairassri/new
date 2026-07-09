package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class f implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f47336b = new i(s.f47529d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC0353f f47337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator f47338d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47339a = 0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47340a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f47341b;

        a() {
            this.f47341b = f.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f47340a < this.f47341b;
        }

        @Override // com.google.protobuf.f.g
        public byte nextByte() {
            int i11 = this.f47340a;
            if (i11 >= this.f47341b) {
                throw new NoSuchElementException();
            }
            this.f47340a = i11 + 1;
            return f.this.l(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            g gVarP = fVar.p();
            g gVarP2 = fVar2.p();
            while (gVarP.hasNext() && gVarP2.hasNext()) {
                int iCompareTo = Integer.valueOf(f.x(gVarP.nextByte())).compareTo(Integer.valueOf(f.x(gVarP2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(fVar.size()).compareTo(Integer.valueOf(fVar2.size()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class c implements g {
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
    private static final class d implements InterfaceC0353f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class e extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f47343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f47344g;

        e(byte[] bArr, int i11, int i12) {
            super(bArr);
            f.e(i11, i11 + i12, bArr.length);
            this.f47343f = i11;
            this.f47344g = i12;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.f.i
        protected int F() {
            return this.f47343f;
        }

        @Override // com.google.protobuf.f.i, com.google.protobuf.f
        public byte b(int i11) {
            f.d(i11, size());
            return this.f47345e[this.f47343f + i11];
        }

        @Override // com.google.protobuf.f.i, com.google.protobuf.f
        protected void j(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f47345e, F() + i11, bArr, i12, i13);
        }

        @Override // com.google.protobuf.f.i, com.google.protobuf.f
        byte l(int i11) {
            return this.f47345e[this.f47343f + i11];
        }

        @Override // com.google.protobuf.f.i, com.google.protobuf.f
        public int size() {
            return this.f47344g;
        }

        Object writeReplace() {
            return f.C(w());
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface InterfaceC0353f {
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface g extends Iterator {
        byte nextByte();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class h extends f {
        h() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class i extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f47345e;

        i(byte[] bArr) {
            bArr.getClass();
            this.f47345e = bArr;
        }

        @Override // com.google.protobuf.f
        final void D(com.google.protobuf.e eVar) {
            eVar.a(this.f47345e, F(), size());
        }

        final boolean E(f fVar, int i11, int i12) {
            if (i12 > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i12 + size());
            }
            int i13 = i11 + i12;
            if (i13 > fVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i11 + ", " + i12 + ", " + fVar.size());
            }
            if (!(fVar instanceof i)) {
                return fVar.v(i11, i13).equals(v(0, i12));
            }
            i iVar = (i) fVar;
            byte[] bArr = this.f47345e;
            byte[] bArr2 = iVar.f47345e;
            int iF = F() + i12;
            int iF2 = F();
            int iF3 = iVar.F() + i11;
            while (iF2 < iF) {
                if (bArr[iF2] != bArr2[iF3]) {
                    return false;
                }
                iF2++;
                iF3++;
            }
            return true;
        }

        protected int F() {
            return 0;
        }

        @Override // com.google.protobuf.f
        public byte b(int i11) {
            return this.f47345e[i11];
        }

        @Override // com.google.protobuf.f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f) || size() != ((f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iU = u();
            int iU2 = iVar.u();
            if (iU == 0 || iU2 == 0 || iU == iU2) {
                return E(iVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.f
        protected void j(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f47345e, i11, bArr, i12, i13);
        }

        @Override // com.google.protobuf.f
        byte l(int i11) {
            return this.f47345e[i11];
        }

        @Override // com.google.protobuf.f
        public final boolean m() {
            int iF = F();
            return h1.m(this.f47345e, iF, size() + iF);
        }

        @Override // com.google.protobuf.f
        protected final int s(int i11, int i12, int i13) {
            return s.h(i11, this.f47345e, F() + i12, i13);
        }

        @Override // com.google.protobuf.f
        public int size() {
            return this.f47345e.length;
        }

        @Override // com.google.protobuf.f
        public final f v(int i11, int i12) {
            int iE = f.e(i11, i12, size());
            return iE == 0 ? f.f47336b : new e(this.f47345e, F() + i11, iE);
        }

        @Override // com.google.protobuf.f
        protected final String z(Charset charset) {
            return new String(this.f47345e, F(), size(), charset);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class j implements InterfaceC0353f {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f47337c = com.google.protobuf.d.c() ? new j(aVar) : new d(aVar);
        f47338d = new b();
    }

    f() {
    }

    private String B() {
        if (size() <= 50) {
            return b1.a(this);
        }
        return b1.a(v(0, 47)) + "...";
    }

    static f C(byte[] bArr) {
        return new i(bArr);
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

    public static f i(String str) {
        return new i(str.getBytes(s.f47527b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(byte b11) {
        return b11 & 255;
    }

    public final String A() {
        return y(s.f47527b);
    }

    abstract void D(com.google.protobuf.e eVar);

    public abstract byte b(int i11);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iS = this.f47339a;
        if (iS == 0) {
            int size = size();
            iS = s(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.f47339a = iS;
        }
        return iS;
    }

    protected abstract void j(byte[] bArr, int i11, int i12, int i13);

    abstract byte l(int i11);

    public abstract boolean m();

    public g p() {
        return new a();
    }

    protected abstract int s(int i11, int i12, int i13);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), B());
    }

    protected final int u() {
        return this.f47339a;
    }

    public abstract f v(int i11, int i12);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return s.f47529d;
        }
        byte[] bArr = new byte[size];
        j(bArr, 0, 0, size);
        return bArr;
    }

    public final String y(Charset charset) {
        return size() == 0 ? "" : z(charset);
    }

    protected abstract String z(Charset charset);
}
