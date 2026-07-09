package ho;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import io.agora.base.internal.video.FactorBitrateAdjuster;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class g {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i11;
        if (Build.VERSION.SDK_INT < 31 || (i11 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i11 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, r4.a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, FactorBitrateAdjuster.FACTOR_BASE), typeface.isItalic());
    }
}
