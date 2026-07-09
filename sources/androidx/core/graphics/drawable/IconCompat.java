package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import w4.i;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f7353k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f7355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f7356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f7357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f7360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f7361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f7362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7363j;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static IconCompat a(Object obj) {
            i.g(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.i(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.g(e(obj));
            }
            if (iD == 6) {
                return IconCompat.d(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f7355b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            return c.a(obj);
        }

        static String c(Object obj) {
            return c.b(obj);
        }

        static int d(Object obj) {
            return c.c(obj);
        }

        static Uri e(Object obj) {
            return c.d(obj);
        }

        static Icon f(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f7354a) {
                case -1:
                    return (Icon) iconCompat.f7355b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f7355b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.l(), iconCompat.f7358e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f7355b, iconCompat.f7358e, iconCompat.f7359f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f7355b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.a((Bitmap) iconCompat.f7355b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.n());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.n());
                        }
                        InputStream inputStreamO = iconCompat.o(context);
                        if (inputStreamO == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.n());
                        }
                        iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamO));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f7360g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f7361h;
            if (mode != IconCompat.f7353k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f7354a = -1;
        this.f7356c = null;
        this.f7357d = null;
        this.f7358e = 0;
        this.f7359f = 0;
        this.f7360g = null;
        this.f7361h = f7353k;
        this.f7362i = null;
    }

    public static IconCompat b(Icon icon) {
        return a.a(icon);
    }

    static Bitmap c(Bitmap bitmap, boolean z11) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f11 = iMin;
        float f12 = 0.5f * f11;
        float f13 = 0.9166667f * f12;
        if (z11) {
            float f14 = 0.010416667f * f11;
            paint.setColor(0);
            paint.setShadowLayer(f14, 0.0f, f11 * 0.020833334f, 1023410176);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.setShadowLayer(f14, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f12, f12, f13, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat d(Uri uri) {
        w4.c.c(uri);
        return e(uri.toString());
    }

    public static IconCompat e(String str) {
        w4.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f7355b = str;
        return iconCompat;
    }

    public static IconCompat f(Bitmap bitmap) {
        w4.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f7355b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Uri uri) {
        w4.c.c(uri);
        return h(uri.toString());
    }

    public static IconCompat h(String str) {
        w4.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f7355b = str;
        return iconCompat;
    }

    public static IconCompat i(Resources resources, String str, int i11) {
        w4.c.c(str);
        if (i11 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f7358e = i11;
        if (resources != null) {
            try {
                iconCompat.f7355b = resources.getResourceName(i11);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f7355b = str;
        }
        iconCompat.f7363j = str;
        return iconCompat;
    }

    private static String t(int i11) {
        switch (i11) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap j() {
        int i11 = this.f7354a;
        if (i11 == -1) {
            Object obj = this.f7355b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i11 == 1) {
            return (Bitmap) this.f7355b;
        }
        if (i11 == 5) {
            return c((Bitmap) this.f7355b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int k() {
        int i11 = this.f7354a;
        if (i11 == -1) {
            return a.b(this.f7355b);
        }
        if (i11 == 2) {
            return this.f7358e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String l() {
        int i11 = this.f7354a;
        if (i11 == -1) {
            return a.c(this.f7355b);
        }
        if (i11 == 2) {
            String str = this.f7363j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f7355b).split(":", -1)[0] : this.f7363j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int m() {
        int i11 = this.f7354a;
        return i11 == -1 ? a.d(this.f7355b) : i11;
    }

    public Uri n() {
        int i11 = this.f7354a;
        if (i11 == -1) {
            return a.e(this.f7355b);
        }
        if (i11 == 4 || i11 == 6) {
            return Uri.parse((String) this.f7355b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream o(Context context) {
        Uri uriN = n();
        String scheme = uriN.getScheme();
        if ("content".equals(scheme) || TransferTable.COLUMN_FILE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriN);
            } catch (Exception e11) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriN, e11);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f7355b));
        } catch (FileNotFoundException e12) {
            Log.w("IconCompat", "Unable to load image from path: " + uriN, e12);
            return null;
        }
    }

    public void p() {
        this.f7361h = PorterDuff.Mode.valueOf(this.f7362i);
        switch (this.f7354a) {
            case -1:
                Parcelable parcelable = this.f7357d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f7355b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f7357d;
                if (parcelable2 != null) {
                    this.f7355b = parcelable2;
                    return;
                }
                byte[] bArr = this.f7356c;
                this.f7355b = bArr;
                this.f7354a = 3;
                this.f7358e = 0;
                this.f7359f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f7356c, Charset.forName("UTF-16"));
                this.f7355b = str;
                if (this.f7354a == 2 && this.f7363j == null) {
                    this.f7363j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f7355b = this.f7356c;
                return;
        }
    }

    public void q(boolean z11) {
        this.f7362i = this.f7361h.name();
        switch (this.f7354a) {
            case -1:
                if (z11) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f7357d = (Parcelable) this.f7355b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z11) {
                    this.f7357d = (Parcelable) this.f7355b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f7355b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f7356c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f7356c = ((String) this.f7355b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f7356c = (byte[]) this.f7355b;
                return;
            case 4:
            case 6:
                this.f7356c = this.f7355b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Icon r() {
        return s(null);
    }

    public Icon s(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        if (this.f7354a == -1) {
            return String.valueOf(this.f7355b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(t(this.f7354a));
        switch (this.f7354a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f7355b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f7355b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f7363j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(k())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f7358e);
                if (this.f7359f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f7359f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f7355b);
                break;
        }
        if (this.f7360g != null) {
            sb2.append(" tint=");
            sb2.append(this.f7360g);
        }
        if (this.f7361h != f7353k) {
            sb2.append(" mode=");
            sb2.append(this.f7361h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i11) {
        this.f7356c = null;
        this.f7357d = null;
        this.f7358e = 0;
        this.f7359f = 0;
        this.f7360g = null;
        this.f7361h = f7353k;
        this.f7362i = null;
        this.f7354a = i11;
    }
}
