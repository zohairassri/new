package i6;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f103227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f103228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h6.d f103229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f103230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f103231f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f103232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f103233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f103234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h6.d f103235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f103236e;

        public a a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f103233b;
            if (onAudioFocusChangeListener != null) {
                return new a(this.f103232a, onAudioFocusChangeListener, (Handler) k6.a.e(this.f103234c), this.f103235d, this.f103236e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(h6.d dVar) {
            k6.a.e(dVar);
            this.f103235d = dVar;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            k6.a.e(onAudioFocusChangeListener);
            k6.a.e(handler);
            this.f103233b = onAudioFocusChangeListener;
            this.f103234c = handler;
            return this;
        }

        public b d(boolean z11) {
            this.f103236e = z11;
            return this;
        }

        public b(int i11) {
            this.f103235d = h6.d.f100076h;
            this.f103232a = i11;
        }

        private b(a aVar) {
            this.f103232a = aVar.e();
            this.f103233b = aVar.f();
            this.f103234c = aVar.d();
            this.f103235d = aVar.b();
            this.f103236e = aVar.g();
        }
    }

    a(int i11, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, h6.d dVar, boolean z11) {
        this.f103226a = i11;
        this.f103228c = handler;
        this.f103229d = dVar;
        this.f103230e = z11;
        this.f103227b = onAudioFocusChangeListener;
        this.f103231f = new AudioFocusRequest.Builder(i11).setAudioAttributes(dVar.a().f100090a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public b a() {
        return new b();
    }

    public h6.d b() {
        return this.f103229d;
    }

    AudioFocusRequest c() {
        return (AudioFocusRequest) k6.a.e(this.f103231f);
    }

    public Handler d() {
        return this.f103228c;
    }

    public int e() {
        return this.f103226a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f103226a == aVar.f103226a && this.f103230e == aVar.f103230e && Objects.equals(this.f103227b, aVar.f103227b) && Objects.equals(this.f103228c, aVar.f103228c) && Objects.equals(this.f103229d, aVar.f103229d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f103227b;
    }

    public boolean g() {
        return this.f103230e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f103226a), this.f103227b, this.f103228c, this.f103229d, Boolean.valueOf(this.f103230e));
    }
}
