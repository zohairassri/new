package nc0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f117699b = new a(new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f117700a;

    private a(Object[] objArr) {
        this.f117700a = objArr;
    }

    static b a() {
        return f117699b;
    }

    @Override // nc0.b
    public Object b(c cVar) {
        int i11 = 0;
        while (true) {
            Object[] objArr = this.f117700a;
            if (i11 >= objArr.length) {
                return null;
            }
            if (objArr[i11] == cVar) {
                return objArr[i11 + 1];
            }
            i11 += 2;
        }
    }

    @Override // nc0.b
    public b d(c cVar, Object obj) {
        int i11 = 0;
        while (true) {
            Object[] objArr = this.f117700a;
            if (i11 >= objArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 2);
                objArrCopyOf[objArrCopyOf.length - 2] = cVar;
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                return new a(objArrCopyOf);
            }
            if (objArr[i11] == cVar) {
                int i12 = i11 + 1;
                if (objArr[i12] == obj) {
                    return this;
                }
                Object[] objArr2 = (Object[]) objArr.clone();
                objArr2[i12] = obj;
                return new a(objArr2);
            }
            i11 += 2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        int i11 = 0;
        while (true) {
            Object[] objArr = this.f117700a;
            if (i11 >= objArr.length) {
                break;
            }
            sb2.append(objArr[i11]);
            sb2.append('=');
            sb2.append(this.f117700a[i11 + 1]);
            sb2.append(", ");
            i11 += 2;
        }
        if (sb2.length() > 1) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
