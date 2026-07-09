package f2;

import android.graphics.ColorFilter;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends androidx.compose.ui.graphics.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f93398c;

    public /* synthetic */ j0(float[] fArr, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr, colorFilter);
    }

    private final float[] b() {
        float[] fArr = this.f93398c;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrB = c.b(a());
        this.f93398c = fArrB;
        return fArrB;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Arrays.equals(b(), ((j0) obj).b());
    }

    public int hashCode() {
        float[] fArr = this.f93398c;
        if (fArr != null) {
            return i0.c(fArr);
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f93398c;
        sb2.append((Object) (fArr == null ? Constants.NULL_VERSION_ID : i0.e(fArr)));
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ j0(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private j0(float[] fArr, ColorFilter colorFilter) {
        super(colorFilter);
        this.f93398c = fArr;
    }

    private j0(float[] fArr) {
        this(fArr, c.a(fArr), null);
    }
}
