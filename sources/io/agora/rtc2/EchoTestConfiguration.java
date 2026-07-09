package io.agora.rtc2;

import android.view.SurfaceView;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class EchoTestConfiguration {
    public String channelId;
    public boolean enableAudio;
    public boolean enableVideo;
    public int intervalInSeconds;
    public String token;
    public SurfaceView view;

    @CalledByNative
    public EchoTestConfiguration() {
        this.intervalInSeconds = 2;
        this.view = null;
        this.enableAudio = true;
        this.enableVideo = true;
        this.token = null;
        this.channelId = null;
    }

    @CalledByNative
    public EchoTestConfiguration(SurfaceView surfaceView, boolean z11, boolean z12, String str, String str2) {
        this(surfaceView, z11, z12, str, str2, 10);
    }

    @CalledByNative
    public EchoTestConfiguration(SurfaceView surfaceView, boolean z11, boolean z12, String str, String str2, int i11) {
        this.view = surfaceView;
        this.enableAudio = z11;
        this.enableVideo = z12;
        this.token = str;
        this.channelId = str2;
        this.intervalInSeconds = i11;
    }
}
