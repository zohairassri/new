package io.agora.rtc2.internal;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes7.dex */
public class AgoraExtension {
    private long nativeProvider;
    private String vendor;

    public AgoraExtension(String str, long j11) {
        this.vendor = str;
        this.nativeProvider = j11;
    }

    @CalledByNative
    public long getNativeProvider() {
        return this.nativeProvider;
    }

    @CalledByNative
    public String getVendor() {
        return this.vendor;
    }
}
