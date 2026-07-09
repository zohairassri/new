package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f45963a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f45964b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f45965c = new b(1);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends o {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.o
        public o d(int i11, int i12) {
            return k(Integer.compare(i11, i12));
        }

        @Override // com.google.common.collect.o
        public o e(long j11, long j12) {
            return k(Long.compare(j11, j12));
        }

        @Override // com.google.common.collect.o
        public o f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.o
        public o g(boolean z11, boolean z12) {
            return k(Boolean.compare(z11, z12));
        }

        @Override // com.google.common.collect.o
        public o h(boolean z11, boolean z12) {
            return k(Boolean.compare(z12, z11));
        }

        @Override // com.google.common.collect.o
        public int i() {
            return 0;
        }

        o k(int i11) {
            return i11 < 0 ? o.f45964b : i11 > 0 ? o.f45965c : o.f45963a;
        }
    }

    /* synthetic */ o(a aVar) {
        this();
    }

    public static o j() {
        return f45963a;
    }

    public abstract o d(int i11, int i12);

    public abstract o e(long j11, long j12);

    public abstract o f(Object obj, Object obj2, Comparator comparator);

    public abstract o g(boolean z11, boolean z12);

    public abstract o h(boolean z11, boolean z12);

    public abstract int i();

    private o() {
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b extends o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f45966d;

        b(int i11) {
            super(null);
            this.f45966d = i11;
        }

        @Override // com.google.common.collect.o
        public int i() {
            return this.f45966d;
        }

        @Override // com.google.common.collect.o
        public o d(int i11, int i12) {
            return this;
        }

        @Override // com.google.common.collect.o
        public o e(long j11, long j12) {
            return this;
        }

        @Override // com.google.common.collect.o
        public o g(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.o
        public o h(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.o
        public o f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }
    }
}
