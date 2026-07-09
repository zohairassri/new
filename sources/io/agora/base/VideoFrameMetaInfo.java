package io.agora.base;

import android.util.SparseArray;
import com.amazonaws.services.s3.internal.Constants;
import io.agora.base.internal.CalledByNative;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class VideoFrameMetaInfo {
    private Map<String, SparseArray<IMetaInfo>> mMetaMap;

    private Map<String, SparseArray<IMetaInfo>> getMetaMap() {
        if (this.mMetaMap == null) {
            this.mMetaMap = new HashMap();
        }
        return this.mMetaMap;
    }

    @CalledByNative
    public SparseArray<IMetaInfo> getCustomMetaInfo(String str) {
        if (!getMetaMap().containsKey(str)) {
            this.mMetaMap.put(str, new SparseArray<>());
        }
        return this.mMetaMap.get(str);
    }

    @CalledByNative
    public IMetaInfo getCustomMetaInfoAt(String str, int i11) {
        if (!getMetaMap().containsKey(str) || getMetaMap().get(str).size() < i11 + 1) {
            return null;
        }
        return getMetaMap().get(str).get(i11);
    }

    @CalledByNative
    public int getCustomMetaInfoSize(String str) {
        return getCustomMetaInfo(str).size();
    }

    public int setCustomMetaInfo(IMetaInfo[] iMetaInfoArr) {
        if (iMetaInfoArr == null || iMetaInfoArr.length == 0) {
            return -1;
        }
        SparseArray<IMetaInfo> customMetaInfo = getCustomMetaInfo(iMetaInfoArr[0].getTag());
        for (IMetaInfo iMetaInfo : iMetaInfoArr) {
            customMetaInfo.put(iMetaInfo.getId(), iMetaInfo);
        }
        return 0;
    }

    public String toString() {
        if (getMetaMap().isEmpty()) {
            return Constants.NULL_VERSION_ID;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VideoFrameMetaInfo{\n");
        for (String str : getMetaMap().keySet()) {
            sb2.append(str);
            sb2.append(": [\n");
            for (int i11 = 0; i11 < getCustomMetaInfoSize(str); i11++) {
                sb2.append(str);
                sb2.append(getCustomMetaInfoAt(str, i11));
                sb2.append(", \n");
            }
            sb2.append(str);
            sb2.append(": ]\n");
        }
        return sb2.toString();
    }
}
