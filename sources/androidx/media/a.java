package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final AudioAttributesCompat f8714g = new AudioAttributesCompat.a().c(1).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f8716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f8717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioAttributesCompat f8718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f8720f;

    /* JADX INFO: renamed from: androidx.media.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C0147a {
        static AudioFocusRequest a(int i11, AudioAttributes audioAttributes, boolean z11, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i11).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f8722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f8723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AudioAttributesCompat f8724d = a.f8714g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f8725e;

        public b(int i11) {
            d(i11);
        }

        private static boolean b(int i11) {
            return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4;
        }

        public a a() {
            if (this.f8722b != null) {
                return new a(this.f8721a, this.f8722b, this.f8723c, this.f8724d, this.f8725e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.f8724d = audioAttributesCompat;
            return this;
        }

        public b d(int i11) {
            if (b(i11)) {
                this.f8721a = i11;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i11);
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.f8722b = onAudioFocusChangeListener;
            this.f8723c = handler;
            return this;
        }
    }

    a(int i11, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z11) {
        this.f8715a = i11;
        this.f8717c = handler;
        this.f8718d = audioAttributesCompat;
        this.f8719e = z11;
        this.f8716b = onAudioFocusChangeListener;
        this.f8720f = C0147a.a(i11, a(), z11, onAudioFocusChangeListener, handler);
    }

    AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.f8718d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.c();
        }
        return null;
    }

    AudioFocusRequest b() {
        return (AudioFocusRequest) this.f8720f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8715a == aVar.f8715a && this.f8719e == aVar.f8719e && w4.c.a(this.f8716b, aVar.f8716b) && w4.c.a(this.f8717c, aVar.f8717c) && w4.c.a(this.f8718d, aVar.f8718d);
    }

    public int hashCode() {
        return w4.c.b(Integer.valueOf(this.f8715a), this.f8716b, this.f8717c, this.f8718d, Boolean.valueOf(this.f8719e));
    }
}
