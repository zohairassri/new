package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import io.agora.rtc2.Constants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Paint f19173a = new Paint(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Paint f19174b = new Paint(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f19175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f19176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Lock f19177e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19178a;

        a(int i11) {
            this.f19178a = i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a0.b
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i11 = this.f19178a;
            canvas.drawRoundRect(rectF, i11, i11, paint);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface b {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class c implements Lock {
        c() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j11, TimeUnit timeUnit) {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f19176d = hashSet;
        f19177e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new c();
        Paint paint = new Paint(7);
        f19175c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f19177e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f19173a);
            e(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f19177e.unlock();
            throw th2;
        }
    }

    public static Bitmap b(hd.d dVar, Bitmap bitmap, int i11, int i12) {
        float width;
        float height;
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i12 > bitmap.getHeight() * i11) {
            width = i12 / bitmap.getHeight();
            width2 = (i11 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i11 / bitmap.getWidth();
            height = (i12 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapD = dVar.d(i11, i12, k(bitmap));
        q(bitmap, bitmapD);
        a(bitmap, bitmapD, matrix);
        return bitmapD;
    }

    public static Bitmap c(hd.d dVar, Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() > i11 || bitmap.getHeight() > i12) {
            Log.isLoggable("TransformationUtils", 2);
            return f(dVar, bitmap, i11, i12);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    public static Bitmap d(hd.d dVar, Bitmap bitmap, int i11, int i12) {
        int iMin = Math.min(i11, i12);
        float f11 = iMin;
        float f12 = f11 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f11 / width, f11 / height);
        float f13 = width * fMax;
        float f14 = fMax * height;
        float f15 = (f11 - f13) / 2.0f;
        float f16 = (f11 - f14) / 2.0f;
        RectF rectF = new RectF(f15, f16, f13 + f15, f14 + f16);
        Bitmap bitmapG = g(dVar, bitmap);
        Bitmap bitmapD = dVar.d(iMin, iMin, h(bitmap));
        bitmapD.setHasAlpha(true);
        Lock lock = f19177e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapD);
            canvas.drawCircle(f12, f12, f12, f19174b);
            canvas.drawBitmap(bitmapG, (Rect) null, rectF, f19175c);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                dVar.c(bitmapG);
            }
            return bitmapD;
        } catch (Throwable th2) {
            f19177e.unlock();
            throw th2;
        }
    }

    private static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(hd.d dVar, Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float fMin = Math.min(i11 / bitmap.getWidth(), i12 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap bitmapD = dVar.d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), k(bitmap));
        q(bitmap, bitmapD);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapD.getWidth();
            bitmapD.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        a(bitmap, bitmapD, matrix);
        return bitmapD;
    }

    private static Bitmap g(hd.d dVar, Bitmap bitmap) {
        Bitmap.Config configH = h(bitmap);
        if (configH.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapD = dVar.d(bitmap.getWidth(), bitmap.getHeight(), configH);
        new Canvas(bitmapD).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapD;
    }

    private static Bitmap.Config h(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        return config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return f19177e;
    }

    public static int j(int i11) {
        switch (i11) {
            case 3:
            case 4:
                return Constants.VIDEO_ORIENTATION_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return Constants.VIDEO_ORIENTATION_270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    static void l(int i11, Matrix matrix) {
        switch (i11) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static boolean m(int i11) {
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(hd.d dVar, Bitmap bitmap, int i11) {
        if (!m(i11)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i11, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapD = dVar.d(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapD.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmapD, matrix);
        return bitmapD;
    }

    public static Bitmap o(hd.d dVar, Bitmap bitmap, int i11) {
        zd.k.a(i11 > 0, "roundingRadius must be greater than 0.");
        return p(dVar, bitmap, new a(i11));
    }

    private static Bitmap p(hd.d dVar, Bitmap bitmap, b bVar) {
        Bitmap.Config configH = h(bitmap);
        Bitmap bitmapG = g(dVar, bitmap);
        Bitmap bitmapD = dVar.d(bitmapG.getWidth(), bitmapG.getHeight(), configH);
        bitmapD.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapG, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapD.getWidth(), bitmapD.getHeight());
        Lock lock = f19177e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapD);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            bVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                dVar.c(bitmapG);
            }
            return bitmapD;
        } catch (Throwable th2) {
            f19177e.unlock();
            throw th2;
        }
    }

    public static void q(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
