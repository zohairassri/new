package un;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class e extends Property {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property f131530b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f131531a;

    private e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f131531a = new WeakHashMap();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
