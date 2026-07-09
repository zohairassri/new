package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f20212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f20213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f20214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f20215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f20216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f20217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20218h;

    public e() {
        ByteBuffer byteBuffer = AudioProcessor.f20071a;
        this.f20216f = byteBuffer;
        this.f20217g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f20072e;
        this.f20214d = aVar;
        this.f20215e = aVar;
        this.f20212b = aVar;
        this.f20213c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        return this.f20215e != AudioProcessor.a.f20072e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        return this.f20218h && this.f20217g == AudioProcessor.f20071a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f20217g;
        this.f20217g = AudioProcessor.f20071a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void e() {
        this.f20218h = true;
        j();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a f(AudioProcessor.a aVar) {
        this.f20214d = aVar;
        this.f20215e = h(aVar);
        return a() ? this.f20215e : AudioProcessor.a.f20072e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f20217g = AudioProcessor.f20071a;
        this.f20218h = false;
        this.f20212b = this.f20214d;
        this.f20213c = this.f20215e;
        i();
    }

    protected final boolean g() {
        return this.f20217g.hasRemaining();
    }

    protected abstract AudioProcessor.a h(AudioProcessor.a aVar);

    protected final ByteBuffer l(int i11) {
        if (this.f20216f.capacity() < i11) {
            this.f20216f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f20216f.clear();
        }
        ByteBuffer byteBuffer = this.f20216f;
        this.f20217g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f20216f = AudioProcessor.f20071a;
        AudioProcessor.a aVar = AudioProcessor.a.f20072e;
        this.f20214d = aVar;
        this.f20215e = aVar;
        this.f20212b = aVar;
        this.f20213c = aVar;
        k();
    }

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }
}
