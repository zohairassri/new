package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class SrcInfo {
    private int bitrateInKbps;
    private String name;

    public SrcInfo() {
    }

    @CalledByNative
    public int getBitrateInKbps() {
        return this.bitrateInKbps;
    }

    @CalledByNative
    public String getName() {
        return this.name;
    }

    public void setBitrateInKbps(int i11) {
        this.bitrateInKbps = i11;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "SrcInfo{bitrateInKbps=" + this.bitrateInKbps + ", name=" + this.name + '}';
    }

    @CalledByNative
    public SrcInfo(int i11, String str) {
        this.bitrateInKbps = i11;
        this.name = str;
    }
}
