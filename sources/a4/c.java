package a4;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f169c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f170d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f172b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float f11, float[] fArr, float[] fArr2) {
            float f12;
            float f13;
            float f14;
            float fA;
            float fAbs = Math.abs(f11);
            float fSignum = Math.signum(f11);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fA = fArr2[iBinarySearch];
            } else {
                int i11 = -(iBinarySearch + 1);
                int i12 = i11 - 1;
                float f15 = 0.0f;
                if (i12 >= fArr.length - 1) {
                    float f16 = fArr[fArr.length - 1];
                    float f17 = fArr2[fArr.length - 1];
                    if (f16 == 0.0f) {
                        return 0.0f;
                    }
                    return f11 * (f17 / f16);
                }
                if (i12 == -1) {
                    f12 = fArr[0];
                    f14 = fArr2[0];
                    f13 = 0.0f;
                } else {
                    f15 = fArr[i12];
                    f12 = fArr[i11];
                    f13 = fArr2[i12];
                    f14 = fArr2[i11];
                }
                fA = d.f173a.a(f13, f14, f15, f12, fAbs);
            }
            return fSignum * fA;
        }

        private a() {
        }
    }

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f171a = fArr;
        this.f172b = fArr2;
    }

    @Override // a4.a
    public float a(float f11) {
        return f169c.b(f11, this.f172b, this.f171a);
    }

    @Override // a4.a
    public float b(float f11) {
        return f169c.b(f11, this.f171a, this.f172b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f171a, cVar.f171a) && Arrays.equals(this.f172b, cVar.f172b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f171a) * 31) + Arrays.hashCode(this.f172b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f171a);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f172b);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
