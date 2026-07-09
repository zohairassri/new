package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f8857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f8858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f8859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f8860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f8861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f8862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8863h;

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.f8844a;
        this.f8861f = byteBuffer;
        this.f8862g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f8846e;
        this.f8859d = aVar;
        this.f8860e = aVar;
        this.f8857b = aVar;
        this.f8858c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        return this.f8860e != AudioProcessor.a.f8846e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean b() {
        return this.f8863h && this.f8862g == AudioProcessor.f8844a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f8862g;
        this.f8862g = AudioProcessor.f8844a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void e() {
        this.f8863h = true;
        j();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a f(AudioProcessor.a aVar) {
        this.f8859d = aVar;
        this.f8860e = h(aVar);
        return a() ? this.f8860e : AudioProcessor.a.f8846e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f8862g = AudioProcessor.f8844a;
        this.f8863h = false;
        this.f8857b = this.f8859d;
        this.f8858c = this.f8860e;
        i();
    }

    protected final boolean g() {
        return this.f8862g.hasRemaining();
    }

    protected abstract AudioProcessor.a h(AudioProcessor.a aVar);

    protected final ByteBuffer l(int i11) {
        if (this.f8861f.capacity() < i11) {
            this.f8861f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f8861f.clear();
        }
        ByteBuffer byteBuffer = this.f8861f;
        this.f8862g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        ByteBuffer byteBuffer = AudioProcessor.f8844a;
        this.f8862g = byteBuffer;
        this.f8863h = false;
        this.f8861f = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f8846e;
        this.f8859d = aVar;
        this.f8860e = aVar;
        this.f8857b = aVar;
        this.f8858c = aVar;
        k();
    }

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }
}
