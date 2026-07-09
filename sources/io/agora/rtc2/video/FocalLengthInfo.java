package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class FocalLengthInfo {
    public int cameraDirection;
    public int cameraId;
    public int focalLengthType;
    public int index;

    public FocalLengthInfo() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FocalLengthInfo focalLengthInfo = (FocalLengthInfo) obj;
            if (this.cameraDirection == focalLengthInfo.cameraDirection && this.focalLengthType == focalLengthInfo.focalLengthType) {
                return true;
            }
        }
        return false;
    }

    @CalledByNative
    public int getCameraDirection() {
        return this.cameraDirection;
    }

    @CalledByNative
    public int getCameraId() {
        return this.cameraId;
    }

    @CalledByNative
    public int getFocalLengthType() {
        return this.focalLengthType;
    }

    @CalledByNative
    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.cameraDirection), Integer.valueOf(this.focalLengthType));
    }

    public String toString() {
        return "{cameraDirection=" + this.cameraDirection + ", Type=" + this.focalLengthType + '}';
    }

    public FocalLengthInfo(int i11, int i12, int i13, int i14) {
        this.cameraDirection = i11;
        this.index = i12;
        this.cameraId = i13;
        this.focalLengthType = i14;
    }
}
