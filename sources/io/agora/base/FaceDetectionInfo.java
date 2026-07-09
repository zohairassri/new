package io.agora.base;

import android.graphics.Rect;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class FaceDetectionInfo implements IMetaInfo {
    private double mDepth;
    private Rect mFaceRect;
    private int mId;

    public FaceDetectionInfo(int i11, Rect rect, double d11) {
        this.mId = i11;
        this.mFaceRect = rect;
        this.mDepth = d11;
    }

    @CalledByNative
    public double getDepth() {
        return this.mDepth;
    }

    @CalledByNative
    public Rect getFaceRect() {
        return this.mFaceRect;
    }

    @Override // io.agora.base.IMetaInfo
    @CalledByNative
    public int getId() {
        return this.mId;
    }

    @Override // io.agora.base.IMetaInfo
    @CalledByNative
    public String getTag() {
        return FaceDetectionInfo.class.getSimpleName();
    }

    public String toString() {
        return "FaceDetectionInfo{mId=" + this.mId + ", mFaceRect=" + this.mFaceRect + ", mDepth=" + this.mDepth + '}';
    }
}
