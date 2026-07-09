package wb;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import ec.d;
import java.util.HashMap;
import java.util.Map;
import xb.c;
import xb.i;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AssetManager f135001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.airbnb.lottie.b f135002e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f134998a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f134999b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f135000c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f135003f = ".ttf";

    public a(Drawable.Callback callback, com.airbnb.lottie.b bVar) {
        this.f135002e = bVar;
        if (callback instanceof View) {
            this.f135001d = ((View) callback).getContext().getAssets();
        } else {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f135001d = null;
        }
    }

    private Typeface a(c cVar) {
        Typeface typefaceCreateFromAsset;
        String strA = cVar.a();
        Typeface typeface = (Typeface) this.f135000c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        String strC = cVar.c();
        String strB = cVar.b();
        com.airbnb.lottie.b bVar = this.f135002e;
        if (bVar != null) {
            typefaceCreateFromAsset = bVar.b(strA, strC, strB);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f135002e.a(strA);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        com.airbnb.lottie.b bVar2 = this.f135002e;
        if (bVar2 != null && typefaceCreateFromAsset == null) {
            String strD = bVar2.d(strA, strC, strB);
            if (strD == null) {
                strD = this.f135002e.c(strA);
            }
            if (strD != null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f135001d, strD);
            }
        }
        if (cVar.d() != null) {
            return cVar.d();
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = Typeface.createFromAsset(this.f135001d, "fonts/" + strA + this.f135003f);
        }
        this.f135000c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface e(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i11 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i11 ? typeface : Typeface.create(typeface, i11);
    }

    public Typeface b(c cVar) {
        this.f134998a.b(cVar.a(), cVar.c());
        Typeface typeface = (Typeface) this.f134999b.get(this.f134998a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.c());
        this.f134999b.put(this.f134998a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f135003f = str;
    }

    public void d(com.airbnb.lottie.b bVar) {
        this.f135002e = bVar;
    }
}
