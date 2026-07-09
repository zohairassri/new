package io.agora.rtc2.internal.gdp;

/* JADX INFO: loaded from: classes7.dex */
public class OffscreenSurface extends EglSurfaceBase {
    public OffscreenSurface(EglCore eglCore, int i11, int i12) {
        super(eglCore);
        createOffscreenSurface(i11, i12);
    }

    public void release() {
        releaseEglSurface();
    }
}
