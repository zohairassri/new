package io.agora.mediaplayer;

import android.view.Surface;
import io.agora.base.VideoFrame;

/* JADX INFO: loaded from: classes7.dex */
public interface IPlayerTextureHelper {
    void dispose();

    VideoFrame getAvailableTextureInfo(int i11);

    long getEglContextHandler();

    VideoFrame getFakeTextureInfo();

    Surface getRenderGlSurface();

    void releaseRenderedTextureInfo(VideoFrame videoFrame);

    void resetTextureBufferQueue();

    void setTextureSize(int i11, int i12);
}
