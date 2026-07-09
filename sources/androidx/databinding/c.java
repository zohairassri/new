package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class c implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f7468a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7469b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f7470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f7472e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a {
        public abstract void a(Object obj, Object obj2, int i11, Object obj3);
    }

    public c(a aVar) {
        this.f7472e = aVar;
    }

    private boolean d(int i11) {
        int i12;
        if (i11 < 64) {
            return (this.f7469b & (1 << i11)) != 0;
        }
        long[] jArr = this.f7470c;
        if (jArr != null && (i12 = (i11 / 64) - 1) < jArr.length) {
            return ((1 << (i11 % 64)) & jArr[i12]) != 0;
        }
        return false;
    }

    private void f(Object obj, int i11, Object obj2, int i12, int i13, long j11) {
        long j12 = 1;
        while (i12 < i13) {
            if ((j11 & j12) == 0) {
                this.f7472e.a(this.f7468a.get(i12), obj, i11, obj2);
            }
            j12 <<= 1;
            i12++;
        }
    }

    private void g(Object obj, int i11, Object obj2) {
        f(obj, i11, obj2, 0, Math.min(64, this.f7468a.size()), this.f7469b);
    }

    private void h(Object obj, int i11, Object obj2) {
        int size = this.f7468a.size();
        int length = this.f7470c == null ? -1 : r0.length - 1;
        i(obj, i11, obj2, length);
        f(obj, i11, obj2, (length + 2) * 64, size, 0L);
    }

    private void i(Object obj, int i11, Object obj2, int i12) {
        if (i12 < 0) {
            g(obj, i11, obj2);
            return;
        }
        long j11 = this.f7470c[i12];
        int i13 = (i12 + 1) * 64;
        int iMin = Math.min(this.f7468a.size(), i13 + 64);
        i(obj, i11, obj2, i12 - 1);
        f(obj, i11, obj2, i13, iMin, j11);
    }

    private void m(int i11, long j11) {
        long j12 = Long.MIN_VALUE;
        for (int i12 = i11 + 63; i12 >= i11; i12--) {
            if ((j11 & j12) != 0) {
                this.f7468a.remove(i12);
            }
            j12 >>>= 1;
        }
    }

    private void n(int i11) {
        if (i11 < 64) {
            this.f7469b = (1 << i11) | this.f7469b;
            return;
        }
        int i12 = (i11 / 64) - 1;
        long[] jArr = this.f7470c;
        if (jArr == null) {
            this.f7470c = new long[this.f7468a.size() / 64];
        } else if (jArr.length <= i12) {
            long[] jArr2 = new long[this.f7468a.size() / 64];
            long[] jArr3 = this.f7470c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f7470c = jArr2;
        }
        long[] jArr4 = this.f7470c;
        jArr4[i12] = (1 << (i11 % 64)) | jArr4[i12];
    }

    public synchronized void b(Object obj) {
        try {
            if (obj == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f7468a.lastIndexOf(obj);
            if (iLastIndexOf < 0 || d(iLastIndexOf)) {
                this.f7468a.add(obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized c clone() {
        c cVar;
        CloneNotSupportedException e11;
        try {
            cVar = (c) super.clone();
        } catch (CloneNotSupportedException e12) {
            cVar = null;
            e11 = e12;
        }
        try {
            cVar.f7469b = 0L;
            cVar.f7470c = null;
            cVar.f7471d = 0;
            cVar.f7468a = new ArrayList();
            int size = this.f7468a.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!d(i11)) {
                    cVar.f7468a.add(this.f7468a.get(i11));
                }
            }
        } catch (CloneNotSupportedException e13) {
            e11 = e13;
            e11.printStackTrace();
        }
        return cVar;
    }

    public synchronized void e(Object obj, int i11, Object obj2) {
        try {
            this.f7471d++;
            h(obj, i11, obj2);
            int i12 = this.f7471d - 1;
            this.f7471d = i12;
            if (i12 == 0) {
                long[] jArr = this.f7470c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j11 = this.f7470c[length];
                        if (j11 != 0) {
                            m((length + 1) * 64, j11);
                            this.f7470c[length] = 0;
                        }
                    }
                }
                long j12 = this.f7469b;
                if (j12 != 0) {
                    m(0, j12);
                    this.f7469b = 0L;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void k(Object obj) {
        try {
            if (this.f7471d == 0) {
                this.f7468a.remove(obj);
            } else {
                int iLastIndexOf = this.f7468a.lastIndexOf(obj);
                if (iLastIndexOf >= 0) {
                    n(iLastIndexOf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
