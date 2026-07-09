package io.agora.rtc2.video;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class VideoCaptureFormatParser {
    VideoCaptureFormatParser() {
    }

    public static VideoCaptureFormat[] fromString(String str) {
        VideoCaptureFormat videoCaptureFormatFromString;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("/")) {
            if (str2 != null && !str2.isEmpty() && (videoCaptureFormatFromString = VideoCaptureFormat.fromString(str2)) != null) {
                arrayList.add(videoCaptureFormatFromString);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (VideoCaptureFormat[]) arrayList.toArray(new VideoCaptureFormat[arrayList.size()]);
    }

    public static String toString(VideoCaptureFormat[] videoCaptureFormatArr) {
        String str = "";
        if (videoCaptureFormatArr == null) {
            return "";
        }
        for (int i11 = 0; i11 < videoCaptureFormatArr.length; i11++) {
            str = str + videoCaptureFormatArr[i11].toString();
            if (i11 != videoCaptureFormatArr.length - 1) {
                str = str + "/";
            }
        }
        return str;
    }
}
