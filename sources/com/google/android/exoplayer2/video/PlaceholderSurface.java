package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.GlUtil;
import ml.q;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f21740e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f21742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21743c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.exoplayer2.util.a f21744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f21745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f21746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f21747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PlaceholderSurface f21748e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i11) throws GlUtil.GlException {
            ml.a.e(this.f21744a);
            this.f21744a.h(i11);
            this.f21748e = new PlaceholderSurface(this, this.f21744a.g(), i11 != 0);
        }

        private void d() {
            ml.a.e(this.f21744a);
            this.f21744a.i();
        }

        public PlaceholderSurface a(int i11) {
            boolean z11;
            start();
            this.f21745b = new Handler(getLooper(), this);
            this.f21744a = new com.google.android.exoplayer2.util.a(this.f21745b);
            synchronized (this) {
                z11 = false;
                this.f21745b.obtainMessage(1, i11, 0).sendToTarget();
                while (this.f21748e == null && this.f21747d == null && this.f21746c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f21747d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f21746c;
            if (error == null) {
                return (PlaceholderSurface) ml.a.e(this.f21748e);
            }
            throw error;
        }

        public void c() {
            ml.a.e(this.f21745b);
            this.f21745b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            try {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e11) {
                    q.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f21747d = new IllegalStateException(e11);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e12) {
                    q.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f21746c = e12;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e13) {
                    q.d("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                    this.f21747d = e13;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    private static int a(Context context) {
        if (GlUtil.h(context)) {
            return GlUtil.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f21740e) {
                f21739d = a(context);
                f21740e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f21739d != 0;
    }

    public static PlaceholderSurface c(Context context, boolean z11) {
        ml.a.f(!z11 || b(context));
        return new b().a(z11 ? f21739d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f21742b) {
            try {
                if (!this.f21743c) {
                    this.f21742b.c();
                    this.f21743c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z11) {
        super(surfaceTexture);
        this.f21742b = bVar;
        this.f21741a = z11;
    }
}
