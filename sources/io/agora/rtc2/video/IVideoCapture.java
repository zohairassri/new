package io.agora.rtc2.video;

import androidx.annotation.NonNull;
import io.agora.base.VideoFrame;
import io.agora.base.VideoFrameMetaInfo;
import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface IVideoCapture {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface Events {
        void onAvailable(int i11);

        void onError(int i11, String str);

        void onFrameCaptured(VideoFrame videoFrame);

        void onFrameDropped(int i11);

        void onI420FrameAvailable(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, long j11, VideoFrameMetaInfo videoFrameMetaInfo);

        void onStarted();
    }

    @CalledByNative
    boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat);

    @CalledByNative
    void deallocate();

    @CalledByNative
    void dispose();

    @CalledByNative
    VideoCaptureFormat getCaptureFormat();

    void setEventsCallback(Events events);

    @CalledByNative
    boolean startCaptureMaybeAsync();

    @CalledByNative
    void stopCaptureAndBlockUntilStopped();
}
