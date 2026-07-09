package io.agora.base.internal.video;

import android.graphics.SurfaceTexture;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface ISurfaceTextureHelper {
    void dispose();

    Handler getHandler();

    SurfaceTexture getSurfaceTexture();

    boolean isOesTextureInUse();

    void setFrameRotation(int i11);

    void setTextureSize(int i11, int i12);

    void startListening(VideoSink videoSink);

    void stopListening();
}
