package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f19234e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f19235f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final File f19236g = new File("/proc/self/fd");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile r f19237h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19240c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f19241d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19238a = 20000;

    r() {
    }

    private boolean a() {
        return f19234e && !this.f19241d.get();
    }

    public static r b() {
        if (f19237h == null) {
            synchronized (r.class) {
                try {
                    if (f19237h == null) {
                        f19237h = new r();
                    }
                } finally {
                }
            }
        }
        return f19237h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f19238a;
    }

    private synchronized boolean d() {
        try {
            boolean z11 = true;
            int i11 = this.f19239b + 1;
            this.f19239b = i11;
            if (i11 >= 50) {
                this.f19239b = 0;
                int length = f19236g.list().length;
                long jC = c();
                if (length >= jC) {
                    z11 = false;
                }
                this.f19240c = z11;
                if (!z11 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19240c;
    }

    private static boolean e() {
        return false;
    }

    public boolean f(int i11, int i12, boolean z11, boolean z12) {
        if (!z11) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f19235f) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (a()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z12) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i11 < 0 || i12 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (d()) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    boolean g(int i11, int i12, BitmapFactory.Options options, boolean z11, boolean z12) {
        boolean zF = f(i11, i12, z11, z12);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        zd.l.b();
        this.f19241d.set(true);
    }
}
