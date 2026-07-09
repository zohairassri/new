package io.agora.rtc2;

import io.agora.rtc2.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class ExtensionInfo {
    public String channelId;
    public int localUid;
    public Constants.MediaSourceType mediaSourceType;
    public int remoteUid;

    public ExtensionInfo() {
        this.mediaSourceType = Constants.MediaSourceType.UNKNOWN_MEDIA_SOURCE;
        this.remoteUid = 0;
        this.channelId = null;
        this.localUid = 0;
    }

    public ExtensionInfo(Constants.MediaSourceType mediaSourceType, int i11, String str, int i12) {
        this.mediaSourceType = mediaSourceType;
        this.remoteUid = i11;
        this.channelId = str;
        this.localUid = i12;
    }
}
