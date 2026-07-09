package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile int f47354d = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f47355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f47356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47357c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f47358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f47359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f47360g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f47361h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f47362i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f47363j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f47364k;

        private void f() {
            int i11 = this.f47360g + this.f47361h;
            this.f47360g = i11;
            int i12 = i11 - this.f47363j;
            int i13 = this.f47364k;
            if (i12 <= i13) {
                this.f47361h = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f47361h = i14;
            this.f47360g = i11 - i14;
        }

        public int d() {
            return this.f47362i - this.f47363j;
        }

        public int e(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = i11 + d();
            if (iD < 0) {
                throw InvalidProtocolBufferException.c();
            }
            int i12 = this.f47364k;
            if (iD > i12) {
                throw InvalidProtocolBufferException.d();
            }
            this.f47364k = iD;
            f();
            return i12;
        }

        private b(byte[] bArr, int i11, int i12, boolean z11) {
            super();
            this.f47364k = Integer.MAX_VALUE;
            this.f47358e = bArr;
            this.f47360g = i12 + i11;
            this.f47362i = i11;
            this.f47363j = i11;
            this.f47359f = z11;
        }
    }

    public static g a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static g b(byte[] bArr, int i11, int i12) {
        return c(bArr, i11, i12, false);
    }

    static g c(byte[] bArr, int i11, int i12, boolean z11) {
        b bVar = new b(bArr, i11, i12, z11);
        try {
            bVar.e(i12);
            return bVar;
        } catch (InvalidProtocolBufferException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    private g() {
        this.f47355a = f47354d;
        this.f47356b = Integer.MAX_VALUE;
        this.f47357c = false;
    }
}
