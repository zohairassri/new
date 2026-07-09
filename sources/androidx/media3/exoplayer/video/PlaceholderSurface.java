package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;
import k6.s;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f10647e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f10649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10650c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.common.util.a f10651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f10652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f10653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f10654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PlaceholderSurface f10655e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i11) throws GlUtil.GlException {
            k6.a.e(this.f10651a);
            this.f10651a.h(i11);
            this.f10655e = new PlaceholderSurface(this, this.f10651a.g(), i11 != 0);
        }

        private void d() {
            k6.a.e(this.f10651a);
            this.f10651a.i();
        }

        public PlaceholderSurface a(int i11) {
            boolean z11;
            start();
            this.f10652b = new Handler(getLooper(), this);
            this.f10651a = new androidx.media3.common.util.a(this.f10652b);
            synchronized (this) {
                z11 = false;
                this.f10652b.obtainMessage(1, i11, 0).sendToTarget();
                while (this.f10655e == null && this.f10654d == null && this.f10653c == null) {
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
            RuntimeException runtimeException = this.f10654d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f10653c;
            if (error == null) {
                return (PlaceholderSurface) k6.a.e(this.f10655e);
            }
            throw error;
        }

        public void c() {
            k6.a.e(this.f10652b);
            this.f10652b.sendEmptyMessage(2);
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
                    s.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f10654d = new IllegalStateException(e11);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e12) {
                    s.e("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f10653c = e12;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e13) {
                    s.e("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                    this.f10654d = e13;
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
        try {
            if (GlUtil.m(context)) {
                return GlUtil.n() ? 1 : 2;
            }
            return 0;
        } catch (GlUtil.GlException e11) {
            s.d("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e11.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f10647e) {
                f10646d = a(context);
                f10647e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f10646d != 0;
    }

    public static PlaceholderSurface c(Context context, boolean z11) {
        k6.a.g(!z11 || b(context));
        return new b().a(z11 ? f10646d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f10649b) {
            try {
                if (!this.f10650c) {
                    this.f10649b.c();
                    this.f10650c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z11) {
        super(surfaceTexture);
        this.f10649b = bVar;
        this.f10648a = z11;
    }
}
