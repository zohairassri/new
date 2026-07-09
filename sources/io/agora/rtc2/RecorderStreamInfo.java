package io.agora.rtc2;

/* JADX INFO: loaded from: classes7.dex */
public class RecorderStreamInfo {
    public String channelId;
    public int recorderStreamType;
    public int uid;

    public RecorderStreamInfo() {
        this.uid = 0;
        this.channelId = null;
        this.recorderStreamType = 0;
    }

    public String toString() {
        return "channelId=" + this.channelId;
    }

    public RecorderStreamInfo(String str, int i11, int i12) {
        this.uid = i11;
        this.channelId = str;
        this.recorderStreamType = i12;
    }
}
